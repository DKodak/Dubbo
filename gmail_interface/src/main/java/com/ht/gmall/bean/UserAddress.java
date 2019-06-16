package com.ht.gmall.bean;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-05 -21:00
 * @Email:2270301642@qq.com
 */

import java.io.Serializable;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-05 -20:56
 * @Email:2270301642@qq.com
 */
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;//用户地址
    private String userId;//用户id
    private String consignee;//收货人
    private String phoneNum;//电话号码
    private String isDefault;//是否为默认地址 y是n否



    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}

