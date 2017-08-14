package org.zzy.plusOnelive.mvp.model.bean;

import java.util.List;

/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/10
 * 分类界面---右边Fragement中要显示的数据
 */

public class CategoryBean {
    private String categoryTitle;
    private List<RecommendItemBean> categoryDatas;

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<RecommendItemBean> getCategoryDatas() {
        return categoryDatas;
    }

    public void setCategoryDatas(List<RecommendItemBean> categoryDatas) {
        this.categoryDatas = categoryDatas;
    }
}
