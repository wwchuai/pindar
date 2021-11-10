package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单分类记录
 * @TableName pd_order_classify
 */
@TableName(value ="pd_order_classify")
@Data
public class OrderClassify implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 任务id
     */
    @TableField(value = "job_id")
    private String job_id;

    /**
     * 任务日志id
     */
    @TableField(value = "job_log_id")
    private String job_log_id;

    /**
     * 起始机构
     */
    @TableField(value = "start_agency_id")
    private String start_agency_id;

    /**
     * 结束机构
     */
    @TableField(value = "end_agency_id")
    private String end_agency_id;

    /**
     * 订单类别:xxx#xxx#xxx
     */
    @TableField(value = "classify")
    private String classify;

    /**
     * 订单数量
     */
    @TableField(value = "total")
    private Integer total;

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
        OrderClassify other = (OrderClassify) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJob_id() == null ? other.getJob_id() == null : this.getJob_id().equals(other.getJob_id()))
            && (this.getJob_log_id() == null ? other.getJob_log_id() == null : this.getJob_log_id().equals(other.getJob_log_id()))
            && (this.getStart_agency_id() == null ? other.getStart_agency_id() == null : this.getStart_agency_id().equals(other.getStart_agency_id()))
            && (this.getEnd_agency_id() == null ? other.getEnd_agency_id() == null : this.getEnd_agency_id().equals(other.getEnd_agency_id()))
            && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJob_id() == null) ? 0 : getJob_id().hashCode());
        result = prime * result + ((getJob_log_id() == null) ? 0 : getJob_log_id().hashCode());
        result = prime * result + ((getStart_agency_id() == null) ? 0 : getStart_agency_id().hashCode());
        result = prime * result + ((getEnd_agency_id() == null) ? 0 : getEnd_agency_id().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
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
        sb.append(", job_id=").append(job_id);
        sb.append(", job_log_id=").append(job_log_id);
        sb.append(", start_agency_id=").append(start_agency_id);
        sb.append(", end_agency_id=").append(end_agency_id);
        sb.append(", classify=").append(classify);
        sb.append(", total=").append(total);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}