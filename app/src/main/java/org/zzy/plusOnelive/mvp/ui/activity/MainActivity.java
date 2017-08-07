package org.zzy.plusOnelive.mvp.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.zzy.quick.mvp.ui.BaseActivity;

import org.zzy.plusOnelive.R;
import org.zzy.plusOnelive.mvp.ui.fragment.CategoryFragment;
import org.zzy.plusOnelive.mvp.ui.fragment.FindFragment;
import org.zzy.plusOnelive.mvp.ui.fragment.RecommendFragmentd;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.fl_content)
    FrameLayout flContent;
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    private Fragment recommendFragement;
    private Fragment categoryFragment;
    private Fragment findFragment;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setBeforeLayout() {

    }

    @Override
    public void initData() {
        recommendFragement= RecommendFragmentd.newInstance();
        categoryFragment= CategoryFragment.newInstance();
        findFragment= FindFragment.newInstance();
    }

    @Override
    public void setListener() {
        //在这里必须先设定监听再调用默认选中item
        bottomNavigation.setOnNavigationItemSelectedListener(this);
        bottomNavigation.setSelectedItemId(R.id.item_recommend);
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public Object newPresenter() {
        return null;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()){
            case R.id.item_recommend:
                fragmentTransaction.replace(R.id.fl_content,recommendFragement);
                break;
            case R.id.item_category:
                fragmentTransaction.replace(R.id.fl_content,categoryFragment);
                break;
            case R.id.item_find:
                fragmentTransaction.replace(R.id.fl_content,findFragment);
                break;
        }
        fragmentTransaction.commitAllowingStateLoss();
        return true;
    }


}
