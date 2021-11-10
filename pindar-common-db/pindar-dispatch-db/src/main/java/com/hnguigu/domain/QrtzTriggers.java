package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Arrays;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_TRIGGERS
 */
@TableName(value ="QRTZ_TRIGGERS")
@Data
public class QrtzTriggers implements Serializable {
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
    @TableField(value = "DESCRIPTION")
    private String DESCRIPTION;

    /**
     * 
     */
    @TableField(value = "NEXT_FIRE_TIME")
    private Long NEXT_FIRE_TIME;

    /**
     * 
     */
    @TableField(value = "PREV_FIRE_TIME")
    private Long PREV_FIRE_TIME;

    /**
     * 
     */
    @TableField(value = "PRIORITY")
    private Integer PRIORITY;

    /**
     * 
     */
    @TableField(value = "TRIGGER_STATE")
    private String TRIGGER_STATE;

    /**
     * 
     */
    @TableField(value = "TRIGGER_TYPE")
    private String TRIGGER_TYPE;

    /**
     * 
     */
    @TableField(value = "START_TIME")
    private Long START_TIME;

    /**
     * 
     */
    @TableField(value = "END_TIME")
    private Long END_TIME;

    /**
     * 
     */
    @TableField(value = "CALENDAR_NAME")
    private String CALENDAR_NAME;

    /**
     * 
     */
    @TableField(value = "MISFIRE_INSTR")
    private Short MISFIRE_INSTR;

    /**
     * 
     */
    @TableField(value = "JOB_DATA")
    private byte[] JOB_DATA;

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
        QrtzTriggers other = (QrtzTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (this.getJOB_NAME() == null ? other.getJOB_NAME() == null : this.getJOB_NAME().equals(other.getJOB_NAME()))
            && (this.getJOB_GROUP() == null ? other.getJOB_GROUP() == null : this.getJOB_GROUP().equals(other.getJOB_GROUP()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
            && (this.getNEXT_FIRE_TIME() == null ? other.getNEXT_FIRE_TIME() == null : this.getNEXT_FIRE_TIME().equals(other.getNEXT_FIRE_TIME()))
            && (this.getPREV_FIRE_TIME() == null ? other.getPREV_FIRE_TIME() == null : this.getPREV_FIRE_TIME().equals(other.getPREV_FIRE_TIME()))
            && (this.getPRIORITY() == null ? other.getPRIORITY() == null : this.getPRIORITY().equals(other.getPRIORITY()))
            && (this.getTRIGGER_STATE() == null ? other.getTRIGGER_STATE() == null : this.getTRIGGER_STATE().equals(other.getTRIGGER_STATE()))
            && (this.getTRIGGER_TYPE() == null ? other.getTRIGGER_TYPE() == null : this.getTRIGGER_TYPE().equals(other.getTRIGGER_TYPE()))
            && (this.getSTART_TIME() == null ? other.getSTART_TIME() == null : this.getSTART_TIME().equals(other.getSTART_TIME()))
            && (this.getEND_TIME() == null ? other.getEND_TIME() == null : this.getEND_TIME().equals(other.getEND_TIME()))
            && (this.getCALENDAR_NAME() == null ? other.getCALENDAR_NAME() == null : this.getCALENDAR_NAME().equals(other.getCALENDAR_NAME()))
            && (this.getMISFIRE_INSTR() == null ? other.getMISFIRE_INSTR() == null : this.getMISFIRE_INSTR().equals(other.getMISFIRE_INSTR()))
            && (Arrays.equals(this.getJOB_DATA(), other.getJOB_DATA()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + ((getJOB_NAME() == null) ? 0 : getJOB_NAME().hashCode());
        result = prime * result + ((getJOB_GROUP() == null) ? 0 : getJOB_GROUP().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getNEXT_FIRE_TIME() == null) ? 0 : getNEXT_FIRE_TIME().hashCode());
        result = prime * result + ((getPREV_FIRE_TIME() == null) ? 0 : getPREV_FIRE_TIME().hashCode());
        result = prime * result + ((getPRIORITY() == null) ? 0 : getPRIORITY().hashCode());
        result = prime * result + ((getTRIGGER_STATE() == null) ? 0 : getTRIGGER_STATE().hashCode());
        result = prime * result + ((getTRIGGER_TYPE() == null) ? 0 : getTRIGGER_TYPE().hashCode());
        result = prime * result + ((getSTART_TIME() == null) ? 0 : getSTART_TIME().hashCode());
        result = prime * result + ((getEND_TIME() == null) ? 0 : getEND_TIME().hashCode());
        result = prime * result + ((getCALENDAR_NAME() == null) ? 0 : getCALENDAR_NAME().hashCode());
        result = prime * result + ((getMISFIRE_INSTR() == null) ? 0 : getMISFIRE_INSTR().hashCode());
        result = prime * result + (Arrays.hashCode(getJOB_DATA()));
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
        sb.append(", JOB_NAME=").append(JOB_NAME);
        sb.append(", JOB_GROUP=").append(JOB_GROUP);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", NEXT_FIRE_TIME=").append(NEXT_FIRE_TIME);
        sb.append(", PREV_FIRE_TIME=").append(PREV_FIRE_TIME);
        sb.append(", PRIORITY=").append(PRIORITY);
        sb.append(", TRIGGER_STATE=").append(TRIGGER_STATE);
        sb.append(", TRIGGER_TYPE=").append(TRIGGER_TYPE);
        sb.append(", START_TIME=").append(START_TIME);
        sb.append(", END_TIME=").append(END_TIME);
        sb.append(", CALENDAR_NAME=").append(CALENDAR_NAME);
        sb.append(", MISFIRE_INSTR=").append(MISFIRE_INSTR);
        sb.append(", JOB_DATA=").append(JOB_DATA);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}