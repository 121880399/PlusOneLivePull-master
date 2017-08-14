package org.zzy.plusOnelive.mvp.model.bean;

/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/9
 */

public class RecommendItemBean {
    private String img;
    private String roomName;
    private String userName;
    private String numberOfPeople;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
