package com.easement.mes.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
@Table(name = "TABLE_building")
public class TableBuilding {
    private long id;
    private String buildingName;
    private long villageId;
    private Date createTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "buildingid")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "building")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Column(name = "villageid", nullable = false)
    public long getVillageId() {
        return villageId;
    }

    public void setVillageId(long villageId) {
        this.villageId = villageId;
    }

    @Column(name = "createtime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TableBuilding{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", villageId=" + villageId +
                ", createTime=" + createTime +
                '}';
    }
}
