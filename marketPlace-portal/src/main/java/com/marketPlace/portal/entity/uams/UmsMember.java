package com.marketPlace.portal.entity.uams;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class UmsMember {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long memberLevelId;
    @ApiModelProperty(value = "Member Name")
    private String name;
    @ApiModelProperty(value = "Member Password")
    private String password;
    @ApiModelProperty(value = "member userName in the system.")
    private String userName;
    @ApiModelProperty(value = "mobile phone number")
    private String phone;
    @ApiModelProperty(value = "Account activation status: false->disabled; true->enabled")
    private Boolean status;
    @ApiModelProperty(value = "creation date.")
    private Date createDate;
    @ApiModelProperty(value = "modification date.")
    private Date modifyDate;
    @ApiModelProperty(value = "Gender: 0-> Unknown;1-> male;2->female;3->trans")
    private Integer gender;
    @ApiModelProperty(value = "Points")
    private Integer integration;
    @ApiModelProperty(value = "Growth value")
    private Integer growth;
    @ApiModelProperty(value = "Number of draws remaining")
    private Integer luckyCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckyCount() {
        return luckyCount;
    }

    public void setLuckyCount(Integer luckyCount) {
        this.luckyCount = luckyCount;
    }

    @Override
    public String toString() {
        return "UmsMember{" +
                "id=" + id +
                ", memberLevelId=" + memberLevelId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", gender=" + gender +
                ", integration=" + integration +
                ", growth=" + growth +
                ", luckeyCount=" + luckyCount +
                '}';
    }
}
