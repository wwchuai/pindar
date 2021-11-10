package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务
 * @TableName schedule_job
 */
@TableName(value ="schedule_job")
@Data
public class ScheduleJob implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

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
     * cron表达式
     */
    @TableField(value = "cron_expression")
    private String cron_expression;

    /**
     * 任务状态  0：暂停  1：正常
     */
    @TableField(value = "status")
    private Byte status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 业务id：机构id
     */
    @TableField(value = "business_id")
    private String business_id;

    /**
     * 创建者
     */
    @TableField(value = "creator")
    private Long creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date create_date;

    /**
     * 更新者
     */
    @TableField(value = "updater")
    private Long updater;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private Date update_date;

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
        ScheduleJob other = (ScheduleJob) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBean_name() == null ? other.getBean_name() == null : this.getBean_name().equals(other.getBean_name()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getCron_expression() == null ? other.getCron_expression() == null : this.getCron_expression().equals(other.getCron_expression()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBusiness_id() == null ? other.getBusiness_id() == null : this.getBusiness_id().equals(other.getBusiness_id()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdate_date() == null ? other.getUpdate_date() == null : this.getUpdate_date().equals(other.getUpdate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBean_name() == null) ? 0 : getBean_name().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getCron_expression() == null) ? 0 : getCron_expression().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBusiness_id() == null) ? 0 : getBusiness_id().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdate_date() == null) ? 0 : getUpdate_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bean_name=").append(bean_name);
        sb.append(", params=").append(params);
        sb.append(", cron_expression=").append(cron_expression);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", business_id=").append(business_id);
        sb.append(", creator=").append(creator);
        sb.append(", create_date=").append(create_date);
        sb.append(", updater=").append(updater);
        sb.append(", update_date=").append(update_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}