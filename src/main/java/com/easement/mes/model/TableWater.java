package com.easement.mes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author leon
 */
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
@Table(name = "TABLE_water")
public class TableWater {
    private long id;
    private long meterIDid;
    private long waterId;
    private String waterReading;
    private String lastReading;
    private String currentUsed;
    private String voltage;
    private String inversionReading;
    private String lastVersionReading;
    private String inversionCurrentUsed;
    private String waterStatus;
    private String rechargeReading;
    private Date createTime;
    private Date modifyTime;
    private long supplierId;
    private long buildingId;
    private long entranceId;
    private long villageId;
    private long exchangeStationId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
@Column(name = "meteridid")
    public long getMeterIDid() {
        return meterIDid;
    }

    public void setMeterIDid(long meterIDid) {
        this.meterIDid = meterIDid;
    }

    @Column(name = "waterid")
    public long getWaterId() {
        return waterId;
    }

    public void setWaterId(long waterId) {
        this.waterId = waterId;
    }

    @Column(name = "waterreading")
    public String getWaterReading() {
        return waterReading;
    }

    public void setWaterReading(String waterReading) {
        this.waterReading = waterReading;
    }
    @Column(name = "lastreading")
    public String getLastReading() {
        return lastReading;
    }

    public void setLastReading(String lastReading) {
        this.lastReading = lastReading;
    }

    @Column(name = "currentused")
    public String getCurrentUsed() {
        return currentUsed;
    }

    public void setCurrentUsed(String currentUsed) {
        this.currentUsed = currentUsed;
    }

    @Column(name = "voltage")
    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    @Column(name = "inversionreading")
    public String getInversionReading() {
        return inversionReading;
    }

    public void setInversionReading(String inversionReading) {
        this.inversionReading = inversionReading;
    }

    @Column(name = "lastinversionreading")
    public String getLastVersionReading() {
        return lastVersionReading;
    }

    public void setLastVersionReading(String lastVersionReading) {
        this.lastVersionReading = lastVersionReading;
    }

    @Column(name = "inversioncurrentused")
    public String getInversionCurrentUsed() {
        return inversionCurrentUsed;
    }

    public void setInversionCurrentUsed(String inversionCurrentUsed) {
        this.inversionCurrentUsed = inversionCurrentUsed;
    }

    @Column(name = "waterstatus")
    public String getWaterStatus() {
        return waterStatus;
    }

    public void setWaterStatus(String waterStatus) {
        this.waterStatus = waterStatus;
    }

    @Column(name = "rechargereading")
    public String getRechargeReading() {
        return rechargeReading;
    }

    public void setRechargeReading(String rechargeReading) {
        this.rechargeReading = rechargeReading;
    }

    @Column(name = "createtime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "modifytime")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Column(name = "supplierid")
    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
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

    @Column(name = "villageid")
    public long getVillageId() {
        return villageId;
    }

    public void setVillageId(long villageId) {
        this.villageId = villageId;
    }

    @Column(name = "exchangstationid")
    public long getExchangeStationId() {
        return exchangeStationId;
    }

    public void setExchangeStationId(long exchangeStationId) {
        this.exchangeStationId = exchangeStationId;
    }
}
