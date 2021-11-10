package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_SCHEDULER_STATE
 */
@TableName(value ="QRTZ_SCHEDULER_STATE")
@Data
public class QrtzSchedulerState implements Serializable {
    /**
     * 
     */
    @TableId(value = "SCHED_NAME")
    private String SCHED_NAME;

    /**
     * 
     */
    @TableId(value = "INSTANCE_NAME")
    private String INSTANCE_NAME;

    /**
     * 
     */
    @TableField(value = "LAST_CHECKIN_TIME")
    private Long LAST_CHECKIN_TIME;

    /**
     * 
     */
    @TableField(value = "CHECKIN_INTERVAL")
    private Long CHECKIN_INTERVAL;

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
        QrtzSchedulerState other = (QrtzSchedulerState) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getINSTANCE_NAME() == null ? other.getINSTANCE_NAME() == null : this.getINSTANCE_NAME().equals(other.getINSTANCE_NAME()))
            && (this.getLAST_CHECKIN_TIME() == null ? other.getLAST_CHECKIN_TIME() == null : this.getLAST_CHECKIN_TIME().equals(other.getLAST_CHECKIN_TIME()))
            && (this.getCHECKIN_INTERVAL() == null ? other.getCHECKIN_INTERVAL() == null : this.getCHECKIN_INTERVAL().equals(other.getCHECKIN_INTERVAL()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getINSTANCE_NAME() == null) ? 0 : getINSTANCE_NAME().hashCode());
        result = prime * result + ((getLAST_CHECKIN_TIME() == null) ? 0 : getLAST_CHECKIN_TIME().hashCode());
        result = prime * result + ((getCHECKIN_INTERVAL() == null) ? 0 : getCHECKIN_INTERVAL().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SCHED_NAME=").append(SCHED_NAME);
        sb.append(", INSTANCE_NAME=").append(INSTANCE_NAME);
        sb.append(", LAST_CHECKIN_TIME=").append(LAST_CHECKIN_TIME);
        sb.append(", CHECKIN_INTERVAL=").append(CHECKIN_INTERVAL);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}