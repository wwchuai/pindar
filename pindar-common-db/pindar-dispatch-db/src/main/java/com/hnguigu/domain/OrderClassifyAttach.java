package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车次车辆司机订单分类关联表
 * @TableName pd_order_classify_attach
 */
@TableName(value ="pd_order_classify_attach")
@Data
public class OrderClassifyAttach implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 车次id
     */
    @TableField(value = "trips_id")
    private String trips_id;

    /**
     * 车辆id
     */
    @TableField(value = "truck_id")
    private String truck_id;

    /**
     * 司机id
     */
    @TableField(value = "driver_id")
    private String driver_id;

    /**
     * 订单分类表id
     */
    @TableField(value = "order_classify_id")
    private String order_classify_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date create_date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderClassifyAttach other = (OrderClassifyAttach) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrips_id() == null ? other.getTrips_id() == null : this.getTrips_id().equals(other.getTrips_id()))
            && (this.getTruck_id() == null ? other.getTruck_id() == null : this.getTruck_id().equals(other.getTruck_id()))
            && (this.getDriver_id() == null ? other.getDriver_id() == null : this.getDriver_id().equals(other.getDriver_id()))
            && (this.getOrder_classify_id() == null ? other.getOrder_classify_id() == null : this.getOrder_classify_id().equals(other.getOrder_classify_id()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrips_id() == null) ? 0 : getTrips_id().hashCode());
        result = prime * result + ((getTruck_id() == null) ? 0 : getTruck_id().hashCode());
        result = prime * result + ((getDriver_id() == null) ? 0 : getDriver_id().hashCode());
        result = prime * result + ((getOrder_classify_id() == null) ? 0 : getOrder_classify_id().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trips_id=").append(trips_id);
        sb.append(", truck_id=").append(truck_id);
        sb.append(", driver_id=").append(driver_id);
        sb.append(", order_classify_id=").append(order_classify_id);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}