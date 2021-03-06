package com.techakram.Online_Shop;

import java.util.List;

public class HomePageModel
{
    public static final int BANNER_SLIDER =0 ;
    public static final int STRIP_AD_BANNER=1;
    public static final int HORIZONTAL_PRODUCT_VIEW=2;
    public static final int GRID_PRODUCT_VIEW=3;
    private int type;
    private  String backgroundColor;

    ////////////////banner slider
    private List<SliderModel> sliderModelList;
    public HomePageModel(int type, List<SliderModel> sliderModelList) {
        this.type = type;
        this.sliderModelList = sliderModelList;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public List<SliderModel> getSliderModelList() {
        return sliderModelList;
    }
    public void setSliderModelList(List<SliderModel> sliderModelList) {
        this.sliderModelList = sliderModelList;
    }
    ////////////////banner slider

    //////////////strip ad banner
    private String resource;
    public HomePageModel(int type, String resource, String backgroundColor) {
        this.type = type;
        this.resource = resource;
        this.backgroundColor = backgroundColor;
    }
    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }
    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    /////////////strip ad banner


    private String title;
    private List<Horizontal_product_scroll_Model> horizontal_product_scroll_modelList;
    private List<WishListModel> viewAllProductList;
    public HomePageModel(int type, String title, String backgroundColor,List<Horizontal_product_scroll_Model> horizontal_product_scroll_modelList,List<WishListModel> viewAllProductList) {
        this.type=type;
        this.title = title;
        this.backgroundColor=backgroundColor;
        this.horizontal_product_scroll_modelList = horizontal_product_scroll_modelList;
        this.viewAllProductList=viewAllProductList;
    }

    public List<WishListModel> getViewAllProductList() {
        return viewAllProductList;
    }

    public void setViewAllProductList(List<WishListModel> viewAllProductList) {
        this.viewAllProductList = viewAllProductList;
    }
    ////////////////grid product layout
    public HomePageModel(int type, String title, String backgroundColor, List<Horizontal_product_scroll_Model> horizontal_product_scroll_modelList) {
        this.type=type;
        this.title = title;
        this.backgroundColor=backgroundColor;
        this.horizontal_product_scroll_modelList = horizontal_product_scroll_modelList;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Horizontal_product_scroll_Model> getHorizontal_product_scroll_modelList() {
        return horizontal_product_scroll_modelList;
    }
    public void setHorizontal_product_scroll_modelList(List<Horizontal_product_scroll_Model> horizontal_product_scroll_modelList) {
        this.horizontal_product_scroll_modelList = horizontal_product_scroll_modelList;
    }
    ///////////grid product layout
}
