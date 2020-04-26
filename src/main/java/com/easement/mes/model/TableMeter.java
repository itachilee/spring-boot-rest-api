package com.easement.mes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
@Table(name = "TABLE_meter")
public class TableMeter {
    private long id;
    private long meterId;
    private String meterSize;
    private long factoryNameId;
    private long productTypeId;
    private long installModelId;
    private long installEnvironmentId;
    private long imeiId;
    private long collectorId;
    private long communicateModelId;
    private Date createTime;
    private double pressure;
    private double electric;
    private String valveStatus;
    private Date updateTime;
    private String status;
    private String vol;
    private long exchangeStationId;
    private long villageId;
    private long buildingId;
    private long entranceId;
    private long supplierId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "meteridid")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "meterid")
    public long getMeterId() {
        return meterId;
    }

    public void setMeterId(long meterId) {
        this.meterId = meterId;
    }

    @Column(name = "metersize")
    public String getMeterSize() {
        return meterSize;
    }

    public void setMeterSize(String meterSize) {
        this.meterSize = meterSize;
    }

    @Column(name = "factorynameid")
    public long getFactoryNameId() {
        return factoryNameId;
    }

    public void setFactoryNameId(long factoryNameId) {
        this.factoryNameId = factoryNameId;
    }

    @Column(name = "producttypeid")
    public long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(long productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Column(name = "installmodelid")
    public long getInstallModelId() {
        return installModelId;
    }

    public void setInstallModelId(long installModelId) {
        this.installModelId = installModelId;
    }

    @Column(name = "installenvironmentid")
    public long getInstallEnvironmentId() {
        return installEnvironmentId;
    }

    public void setInstallEnvironmentId(long installEnvironmentId) {
        this.installEnvironmentId = installEnvironmentId;
    }

    @Column(name = "imeiid")
    public long getImeiId() {
        return imeiId;
    }

    public void setImeiId(long imeiId) {
        this.imeiId = imeiId;
    }

    @Column(name = "collectorid")
    public long getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(long collectorId) {
        this.collectorId = collectorId;
    }

    @Column(name = "comunicatemodelid")
    public long getCommunicateModelId() {
        return communicateModelId;
    }

    public void setCommunicateModelId(long communicateModelId) {
        this.communicateModelId = communicateModelId;
    }

    @Column(name = "createtime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "pressure")
    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Column(name = "electric")
    public double getElectric() {
        return electric;
    }

    public void setElectric(double electric) {
        this.electric = electric;
    }

    @Column(name = "valvastatus")
    public String getValveStatus() {
        return valveStatus;
    }

    public void setValveStatus(String valveStatus) {
        this.valveStatus = valveStatus;
    }

    @Column(name = "updatetime")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "vol")
    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    @Column(name = "exchangstationid")
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

    @Column(name = "supplierid")
    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }
}
