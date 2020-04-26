package com.easement.mes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author leon
 */
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
@Table(name = "table_user")
public class TableUser {

    private long id;
    private long supplierId;
    private long exchangeStationId;
    private long villageId;
    private long buildingId;
    private long entranceId;
    private String doorPlate;
    private String userName;
    private String telephone;
    private String identityCard;
    private long directionId;
    private long chargesId;
    private String remark;
    private String operator;
    private Date createTime;
    private long userTypeId;
    private long meterIDid;
    private BigDecimal lastWater;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "supplierid", nullable = false)
    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    @Column(name = "exchangstationid", nullable = false)
    public long getExchangeStationId() {
        return exchangeStationId;
    }

    public void setExchangeStationId(long exchangeStationId) {
        this.exchangeStationId = exchangeStationId;
    }

    @Column(name = "villageid")
    public long getVillageId() {
        return villageId;
    }

    public void setVillageId(long villageId) {
        this.villageId = villageId;
    }

    @Column(name = "buildingid")
    public long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(long buildingId) {
        this.buildingId = buildingId;
    }

    @Column(name = "entranceid")
    public long getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(long entranceId) {
        this.entranceId = entranceId;
    }

    @Column(name = "doorplate")
    public String getDoorPlate() {
        return doorPlate;
    }

    public void setDoorPlate(String doorPlate) {
        this.doorPlate = doorPlate;
    }

    @Column(name = "username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name = "identitycard")
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Column(name = "directionid")
    public long getDirectionId() {
        return directionId;
    }

    public void setDirectionId(long directionId) {
        this.directionId = directionId;
    }

    @Column(name = "chargesid")
    public long getChargesId() {
        return chargesId;
    }

    public void setChargesId(long chargesId) {
        this.chargesId = chargesId;
    }

    @Column(name = "remark1")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Column(name = "createtime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "usertypeid",nullable = false)
    public long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(long userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Column(name = "meteridid",nullable = false)
    public long getMeterIDid() {
        return meterIDid;
    }

    public void setMeterIDid(long meterIDid) {
        this.meterIDid = meterIDid;
    }

    @Column(name = "lastwater")
    public BigDecimal getLastWater() {
        return lastWater;
    }

    public void setLastWater(BigDecimal lastWater) {
        this.lastWater = lastWater;
    }

    @Override
    public String toString() {
        return "TableUser{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", exchangeStationId=" + exchangeStationId +
                ", villageId=" + villageId +
                ", buildingId=" + buildingId +
                ", entranceId=" + entranceId +
                ", doorPlate='" + doorPlate + '\'' +
                ", userName='" + userName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", directionId=" + directionId +
                ", chargesId=" + chargesId +
                ", remark='" + remark + '\'' +
                ", operator='" + operator + '\'' +
                ", createTime=" + createTime +
                ", userTypeId=" + userTypeId +
                ", meterIDid=" + meterIDid +
                ", lastWater=" + lastWater +
                '}';
    }
}
