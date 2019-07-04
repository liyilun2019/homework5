package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // endTODO-C1 (1) Implement your Cat Bean here according to the response json
    //@SerializedName("breeds")private String[] breeds;
    @SerializedName("id")private String id;
    @SerializedName("url")private String url;
    @SerializedName("width")private int width;
    @SerializedName("height")private int height;

    @Override
    public String toString() {
        return String.format("id:%s , url:%s , width:%d , height:%d ",id,url,width,height);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

//    public String[] getBreeds() {
//        return breeds;
//    }
//
//    public void setBreeds(String[] breeds) {
//        this.breeds = breeds;
//    }
}
