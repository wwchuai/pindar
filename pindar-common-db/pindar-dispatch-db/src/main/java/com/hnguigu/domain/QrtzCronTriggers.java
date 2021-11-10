package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_CRON_TRIGGERS
 */
@TableName(value ="QRTZ_CRON_TRIGGERS")
@Data
public class QrtzCronTriggers implements Serializable {
    /**
     * 
     */
    @TableId(value = "SCHED_NAME")
    private String SCHED_NAME;

    /**
     * 
     */
    @TableId(value = "TRIGGER_NAME")
    private String TRIGGER_NAME;

    /**
     * 
     */
    @TableId(value = "TRIGGER_GROUP")
    private String TRIGGER_GROUP;

    /**
     * 
     */
    @TableField(value = "CRON_EXPRESSION")
    private String CRON_EXPRESSION;

    /**
     * 
     */
    @TableField(value = "TIME_ZONE_ID")
    private String TIME_ZONE_ID;

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
        QrtzCronTriggers other = (QrtzCronTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (this.getCRON_EXPRESSION() == null ? other.getCRON_EXPRESSION() == null : this.getCRON_EXPRESSION().equals(other.getCRON_EXPRESSION()))
            && (this.getTIME_ZONE_ID() == null ? other.getTIME_ZONE_ID() == null : this.getTIME_ZONE_ID().equals(other.getTIME_ZONE_ID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + ((getCRON_EXPRESSION() == null) ? 0 : getCRON_EXPRESSION().hashCode());
        result = prime * result + ((getTIME_ZONE_ID() == null) ? 0 : getTIME_ZONE_ID().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SCHED_NAME=").append(SCHED_NAME);
        sb.append(", TRIGGER_NAME=").append(TRIGGER_NAME);
        sb.append(", TRIGGER_GROUP=").append(TRIGGER_GROUP);
        sb.append(", CRON_EXPRESSION=").append(CRON_EXPRESSION);
        sb.append(", TIME_ZONE_ID=").append(TIME_ZONE_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}