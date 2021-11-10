package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 缓冲路线表
 * @TableName pd_cache_line
 */
@TableName(value ="pd_cache_line")
@Data
public class CacheLine implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 起始机构
     */
    @TableField(value = "start_agency_id")
    private String start_agency_id;

    /**
     * 终点机构
     */
    @TableField(value = "end_agency_id")
    private String end_agency_id;

    /**
     * 验证是否可用key,md5(子表的起始相加)
     */
    @TableField(value = "verify_key")
    private String verify_key;

    /**
     * 距离
     */
    @TableField(value = "distance")
    private BigDecimal distance;

    /**
     * 成本
     */
    @TableField(value = "cost")
    private BigDecimal cost;

    /**
     * 预计时间
     */
    @TableField(value = "estimated_time")
    private String estimated_time;

    /**
     * 中转次数
     */
    @TableField(value = "transfer_count")
    private Integer transfer_count;

    /**
     * 从1开始递增
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 是否是当前最新版本 0 否 1 是
     */
    @TableField(value = "is_current")
    private Boolean is_current;

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
        CacheLine other = (CacheLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStart_agency_id() == null ? other.getStart_agency_id() == null : this.getStart_agency_id().equals(other.getStart_agency_id()))
            && (this.getEnd_agency_id() == null ? other.getEnd_agency_id() == null : this.getEnd_agency_id().equals(other.getEnd_agency_id()))
            && (this.getVerify_key() == null ? other.getVerify_key() == null : this.getVerify_key().equals(other.getVerify_key()))
            && (this.getDistance() == null ? other.getDistance() == null : this.getDistance().equals(other.getDistance()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getEstimated_time() == null ? other.getEstimated_time() == null : this.getEstimated_time().equals(other.getEstimated_time()))
            && (this.getTransfer_count() == null ? other.getTransfer_count() == null : this.getTransfer_count().equals(other.getTransfer_count()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIs_current() == null ? other.getIs_current() == null : this.getIs_current().equals(other.getIs_current()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStart_agency_id() == null) ? 0 : getStart_agency_id().hashCode());
        result = prime * result + ((getEnd_agency_id() == null) ? 0 : getEnd_agency_id().hashCode());
        result = prime * result + ((getVerify_key() == null) ? 0 : getVerify_key().hashCode());
        result = prime * result + ((getDistance() == null) ? 0 : getDistance().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getEstimated_time() == null) ? 0 : getEstimated_time().hashCode());
        result = prime * result + ((getTransfer_count() == null) ? 0 : getTransfer_count().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIs_current() == null) ? 0 : getIs_current().hashCode());
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
        sb.append(", start_agency_id=").append(start_agency_id);
        sb.append(", end_agency_id=").append(end_agency_id);
        sb.append(", verify_key=").append(verify_key);
        sb.append(", distance=").append(distance);
        sb.append(", cost=").append(cost);
        sb.append(", estimated_time=").append(estimated_time);
        sb.append(", transfer_count=").append(transfer_count);
        sb.append(", version=").append(version);
        sb.append(", is_current=").append(is_current);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}