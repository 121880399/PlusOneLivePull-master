package org.zzy.plusOnelive.mvp.ui.fragment;

import android.os.Bundle;

import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusOnelive.R;

/**
 * Created by adm on 2017/8/5.
 */

public class FindFragment extends BaseFragment {

    public static FindFragment newInstance() {

        Bundle args = new Bundle();

        FindFragment fragment = new FindFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Object newPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_find;
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {

    }
}
