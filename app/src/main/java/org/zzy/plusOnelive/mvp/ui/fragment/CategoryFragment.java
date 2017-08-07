package org.zzy.plusOnelive.mvp.ui.fragment;

import android.os.Bundle;

import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusOnelive.R;

/**
 * Created by adm on 2017/8/5.
 */

public class CategoryFragment extends BaseFragment{

    public static CategoryFragment newInstance() {
        
        Bundle args = new Bundle();
        
        CategoryFragment fragment = new CategoryFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public Object newPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_category;
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {

    }
}
