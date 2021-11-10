package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 缓冲路线子表
 * @TableName pd_cache_line_detail
 */
@TableName(value ="pd_cache_line_detail")
@Data
public class CacheLineDetail implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 缓冲线路表id
     */
    @TableField(value = "cache_line_id")
    private String cache_line_id;

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
     * 从1开始递增
     */
    @TableField(value = "sort")
    private Boolean sort;

    /**
     * 业务表线路ID
     */
    @TableField(value = "transport_line_id")
    private String transport_line_id;

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
        CacheLineDetail other = (CacheLineDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCache_line_id() == null ? other.getCache_line_id() == null : this.getCache_line_id().equals(other.getCache_line_id()))
            && (this.getStart_agency_id() == null ? other.getStart_agency_id() == null : this.getStart_agency_id().equals(other.getStart_agency_id()))
            && (this.getEnd_agency_id() == null ? other.getEnd_agency_id() == null : this.getEnd_agency_id().equals(other.getEnd_agency_id()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTransport_line_id() == null ? other.getTransport_line_id() == null : this.getTransport_line_id().equals(other.getTransport_line_id()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCache_line_id() == null) ? 0 : getCache_line_id().hashCode());
        result = prime * result + ((getStart_agency_id() == null) ? 0 : getStart_agency_id().hashCode());
        result = prime * result + ((getEnd_agency_id() == null) ? 0 : getEnd_agency_id().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTransport_line_id() == null) ? 0 : getTransport_line_id().hashCode());
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
        sb.append(", cache_line_id=").append(cache_line_id);
        sb.append(", start_agency_id=").append(start_agency_id);
        sb.append(", end_agency_id=").append(end_agency_id);
        sb.append(", sort=").append(sort);
        sb.append(", transport_line_id=").append(transport_line_id);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}