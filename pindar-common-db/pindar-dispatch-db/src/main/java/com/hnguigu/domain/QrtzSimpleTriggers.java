package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_SIMPLE_TRIGGERS
 */
@TableName(value ="QRTZ_SIMPLE_TRIGGERS")
@Data
public class QrtzSimpleTriggers implements Serializable {
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
    @TableField(value = "REPEAT_COUNT")
    private Long REPEAT_COUNT;

    /**
     * 
     */
    @TableField(value = "REPEAT_INTERVAL")
    private Long REPEAT_INTERVAL;

    /**
     * 
     */
    @TableField(value = "TIMES_TRIGGERED")
    private Long TIMES_TRIGGERED;

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
        QrtzSimpleTriggers other = (QrtzSimpleTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (this.getREPEAT_COUNT() == null ? other.getREPEAT_COUNT() == null : this.getREPEAT_COUNT().equals(other.getREPEAT_COUNT()))
            && (this.getREPEAT_INTERVAL() == null ? other.getREPEAT_INTERVAL() == null : this.getREPEAT_INTERVAL().equals(other.getREPEAT_INTERVAL()))
            && (this.getTIMES_TRIGGERED() == null ? other.getTIMES_TRIGGERED() == null : this.getTIMES_TRIGGERED().equals(other.getTIMES_TRIGGERED()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + ((getREPEAT_COUNT() == null) ? 0 : getREPEAT_COUNT().hashCode());
        result = prime * result + ((getREPEAT_INTERVAL() == null) ? 0 : getREPEAT_INTERVAL().hashCode());
        result = prime * result + ((getTIMES_TRIGGERED() == null) ? 0 : getTIMES_TRIGGERED().hashCode());
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
        sb.append(", REPEAT_COUNT=").append(REPEAT_COUNT);
        sb.append(", REPEAT_INTERVAL=").append(REPEAT_INTERVAL);
        sb.append(", TIMES_TRIGGERED=").append(TIMES_TRIGGERED);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}