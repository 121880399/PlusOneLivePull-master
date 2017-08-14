package org.zzy.plusOnelive.mvp.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zzy.quick.image.ImageFactory;
import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusOnelive.R;
import org.zzy.plusOnelive.mvp.model.bean.RecommendItemBean;

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

    private List<RecommendItemBean> mDatas;

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
        mDatas=new ArrayList<>();
        RecommendItemBean one=new RecommendItemBean();
        one.setRoomName("全服最强亚索");
        one.setUserName("小猪");
        one.setNumberOfPeople("100300");
        RecommendItemBean two=new RecommendItemBean();
        two.setRoomName("今天不在家");
        two.setUserName("小大饭店");
        two.setNumberOfPeople("32200");
        RecommendItemBean three=new RecommendItemBean();
        three.setRoomName("老司机开车了");
        three.setUserName("小地方");
        three.setNumberOfPeople("1300");
        RecommendItemBean four=new RecommendItemBean();
        four.setRoomName("不进来你后悔");
        four.setUserName("小猪发");
        four.setNumberOfPeople("223");
        RecommendItemBean five=new RecommendItemBean();
        five.setRoomName("带你看模特");
        five.setUserName("的额的");
        five.setNumberOfPeople("332");
        RecommendItemBean six=new RecommendItemBean();
        six.setRoomName("无敌是寂寞");
        six.setUserName("订单");
        six.setNumberOfPeople("3130");
        mDatas.add(one);
        mDatas.add(two);
        mDatas.add(three);
        mDatas.add(four);
        mDatas.add(five);
        mDatas.add(six);
        rvHot.setAdapter(new CommonAdapter<RecommendItemBean>(context,R.layout.item_recommend,mDatas) {

            @Override
            protected void convert(ViewHolder holder, RecommendItemBean recommendItemBean, int position) {
                holder.setText(R.id.tv_roomName,recommendItemBean.getRoomName());
                holder.setText(R.id.tv_userName,recommendItemBean.getUserName());
                holder.setText(R.id.tv_number,recommendItemBean.getNumberOfPeople());
            }
        });
        rvHot.setLayoutManager(new GridLayoutManager(context,2));
    }


    @Override
    public void setListener() {

    }


}
