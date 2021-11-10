package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务日志
 * @TableName schedule_job_log
 */
@TableName(value ="schedule_job_log")
@Data
public class ScheduleJobLog implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 任务id
     */
    @TableField(value = "job_id")
    private Long job_id;

    /**
     * spring bean名称
     */
    @TableField(value = "bean_name")
    private String bean_name;

    /**
     * 参数
     */
    @TableField(value = "params")
    private String params;

    /**
     * 任务状态    0：失败    1：成功
     */
    @TableField(value = "status")
    private Byte status;

    /**
     * 失败信息
     */
    @TableField(value = "error")
    private String error;

    /**
     * 耗时(单位：毫秒)
     */
    @TableField(value = "times")
    private Integer times;

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
        ScheduleJobLog other = (ScheduleJobLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJob_id() == null ? other.getJob_id() == null : this.getJob_id().equals(other.getJob_id()))
            && (this.getBean_name() == null ? other.getBean_name() == null : this.getBean_name().equals(other.getBean_name()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()))
            && (this.getTimes() == null ? other.getTimes() == null : this.getTimes().equals(other.getTimes()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJob_id() == null) ? 0 : getJob_id().hashCode());
        result = prime * result + ((getBean_name() == null) ? 0 : getBean_name().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        result = prime * result + ((getTimes() == null) ? 0 : getTimes().hashCode());
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
        sb.append(", bean_name=").append(bean_name);
        sb.append(", params=").append(params);
        sb.append(", status=").append(status);
        sb.append(", error=").append(error);
        sb.append(", times=").append(times);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}