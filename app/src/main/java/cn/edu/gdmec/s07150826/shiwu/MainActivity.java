package cn.edu.gdmec.s07150826.shiwu;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import cn.edu.gdmec.s07150826.shiwu.Frament.CenterFragment;
import cn.edu.gdmec.s07150826.shiwu.Frament.CollectionFragment;
import cn.edu.gdmec.s07150826.shiwu.Frament.HomeFragment;
import cn.edu.gdmec.s07150826.shiwu.Frament.MessageFragment;
import cn.edu.gdmec.s07150826.shiwu.adapter.HomePagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {


    private ViewPager mViewPager;

    private RadioButton mHomeRb,mCollectionRb,mMesssageRb,mCenterRb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();



        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new CollectionFragment());
        fragments.add(new MessageFragment());
        fragments.add(new CenterFragment());

        HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(adapter);


        initData();
    }

    private void initView(){
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        mHomeRb = (RadioButton) findViewById(R.id.home_rb);
        mCollectionRb = (RadioButton) findViewById(R.id.collection_rb);
        mMesssageRb = (RadioButton) findViewById(R.id.message_rb);
        mCenterRb = (RadioButton) findViewById(R.id.center_rb);

        mHomeRb.setOnClickListener(this);
        mCollectionRb.setOnClickListener(this);
        mMesssageRb.setOnClickListener(this);
        mCenterRb.setOnClickListener(this);

        mViewPager.setOnPageChangeListener(this);

    }

    private void initData(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new CollectionFragment());
        fragments.add(new MessageFragment());
        fragments.add(new CenterFragment());

        HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home_rb:
                mViewPager.setCurrentItem(0,false);
                break;
            case R.id.collection_rb:
                mViewPager.setCurrentItem(1,false);
                break;
            case R.id.message_rb:
                mViewPager.setCurrentItem(2,false);
                break;
            case R.id.center_rb:
                mViewPager.setCurrentItem(3,false);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                mHomeRb.setSelected(true);
                break;
            case 1:
                mCollectionRb.setSelected(true);
                break;
            case 2:
                mMesssageRb.setSelected(true);
                break;
            case 3:
                mCenterRb.setSelected(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}