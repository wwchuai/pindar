package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_FIRED_TRIGGERS
 */
@TableName(value ="QRTZ_FIRED_TRIGGERS")
@Data
public class QrtzFiredTriggers implements Serializable {
    /**
     * 
     */
    @TableId(value = "SCHED_NAME")
    private String SCHED_NAME;

    /**
     * 
     */
    @TableId(value = "ENTRY_ID")
    private String ENTRY_ID;

    /**
     * 
     */
    @TableField(value = "TRIGGER_NAME")
    private String TRIGGER_NAME;

    /**
     * 
     */
    @TableField(value = "TRIGGER_GROUP")
    private String TRIGGER_GROUP;

    /**
     * 
     */
    @TableField(value = "INSTANCE_NAME")
    private String INSTANCE_NAME;

    /**
     * 
     */
    @TableField(value = "FIRED_TIME")
    private Long FIRED_TIME;

    /**
     * 
     */
    @TableField(value = "SCHED_TIME")
    private Long SCHED_TIME;

    /**
     * 
     */
    @TableField(value = "PRIORITY")
    private Integer PRIORITY;

    /**
     * 
     */
    @TableField(value = "STATE")
    private String STATE;

    /**
     * 
     */
    @TableField(value = "JOB_NAME")
    private String JOB_NAME;

    /**
     * 
     */
    @TableField(value = "JOB_GROUP")
    private String JOB_GROUP;

    /**
     * 
     */
    @TableField(value = "IS_NONCONCURRENT")
    private String IS_NONCONCURRENT;

    /**
     * 
     */
    @TableField(value = "REQUESTS_RECOVERY")
    private String REQUESTS_RECOVERY;

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
        QrtzFiredTriggers other = (QrtzFiredTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getENTRY_ID() == null ? other.getENTRY_ID() == null : this.getENTRY_ID().equals(other.getENTRY_ID()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (this.getINSTANCE_NAME() == null ? other.getINSTANCE_NAME() == null : this.getINSTANCE_NAME().equals(other.getINSTANCE_NAME()))
            && (this.getFIRED_TIME() == null ? other.getFIRED_TIME() == null : this.getFIRED_TIME().equals(other.getFIRED_TIME()))
            && (this.getSCHED_TIME() == null ? other.getSCHED_TIME() == null : this.getSCHED_TIME().equals(other.getSCHED_TIME()))
            && (this.getPRIORITY() == null ? other.getPRIORITY() == null : this.getPRIORITY().equals(other.getPRIORITY()))
            && (this.getSTATE() == null ? other.getSTATE() == null : this.getSTATE().equals(other.getSTATE()))
            && (this.getJOB_NAME() == null ? other.getJOB_NAME() == null : this.getJOB_NAME().equals(other.getJOB_NAME()))
            && (this.getJOB_GROUP() == null ? other.getJOB_GROUP() == null : this.getJOB_GROUP().equals(other.getJOB_GROUP()))
            && (this.getIS_NONCONCURRENT() == null ? other.getIS_NONCONCURRENT() == null : this.getIS_NONCONCURRENT().equals(other.getIS_NONCONCURRENT()))
            && (this.getREQUESTS_RECOVERY() == null ? other.getREQUESTS_RECOVERY() == null : this.getREQUESTS_RECOVERY().equals(other.getREQUESTS_RECOVERY()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getENTRY_ID() == null) ? 0 : getENTRY_ID().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + ((getINSTANCE_NAME() == null) ? 0 : getINSTANCE_NAME().hashCode());
        result = prime * result + ((getFIRED_TIME() == null) ? 0 : getFIRED_TIME().hashCode());
        result = prime * result + ((getSCHED_TIME() == null) ? 0 : getSCHED_TIME().hashCode());
        result = prime * result + ((getPRIORITY() == null) ? 0 : getPRIORITY().hashCode());
        result = prime * result + ((getSTATE() == null) ? 0 : getSTATE().hashCode());
        result = prime * result + ((getJOB_NAME() == null) ? 0 : getJOB_NAME().hashCode());
        result = prime * result + ((getJOB_GROUP() == null) ? 0 : getJOB_GROUP().hashCode());
        result = prime * result + ((getIS_NONCONCURRENT() == null) ? 0 : getIS_NONCONCURRENT().hashCode());
        result = prime * result + ((getREQUESTS_RECOVERY() == null) ? 0 : getREQUESTS_RECOVERY().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SCHED_NAME=").append(SCHED_NAME);
        sb.append(", ENTRY_ID=").append(ENTRY_ID);
        sb.append(", TRIGGER_NAME=").append(TRIGGER_NAME);
        sb.append(", TRIGGER_GROUP=").append(TRIGGER_GROUP);
        sb.append(", INSTANCE_NAME=").append(INSTANCE_NAME);
        sb.append(", FIRED_TIME=").append(FIRED_TIME);
        sb.append(", SCHED_TIME=").append(SCHED_TIME);
        sb.append(", PRIORITY=").append(PRIORITY);
        sb.append(", STATE=").append(STATE);
        sb.append(", JOB_NAME=").append(JOB_NAME);
        sb.append(", JOB_GROUP=").append(JOB_GROUP);
        sb.append(", IS_NONCONCURRENT=").append(IS_NONCONCURRENT);
        sb.append(", REQUESTS_RECOVERY=").append(REQUESTS_RECOVERY);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}