package org.zzy.plusOnelive.mvp.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.header.WaveSwipeHeader;
import com.scwang.smartrefresh.header.fungame.FunGameHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;
import com.zzy.quick.image.ImageFactory;
import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusOnelive.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by adm on 2017/8/5.
 * 推荐界面
 */
public class RecommendFragmentd extends BaseFragment {

    @BindView(R.id.banner)
    Banner banner;

    private static final List<Integer> images = new ArrayList<Integer>();
    @BindView(R.id.rv_hot)
    RecyclerView rvHot;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;

    public static RecommendFragmentd newInstance() {
        Bundle args = new Bundle();
        RecommendFragmentd fragment = new RecommendFragmentd();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public Object newPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_recommend;
    }

    @Override
    public void initView(View view) {
        super.initView(view);
        images.add(R.drawable.img_banner1);
        images.add(R.drawable.img_banner2);
        images.add(R.drawable.img_banner3);
        //设置banner中的图片用什么加载器加载
        banner.setImageLoader(new ImageLoader() {

            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                ImageFactory.getImageLoader().loadResource((int) path, imageView, null);
            }
        });
        banner.setImages(images);
        banner.start();
        refreshLayout.setRefreshHeader(new ClassicsHeader(context));
    }

    @Override
    public void initData() {

    }


    @Override
    public void setListener() {

    }


}
