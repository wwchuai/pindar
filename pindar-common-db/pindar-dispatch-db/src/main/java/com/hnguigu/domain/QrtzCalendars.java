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
 * @TableName QRTZ_CALENDARS
 */
@TableName(value ="QRTZ_CALENDARS")
@Data
public class QrtzCalendars implements Serializable {
    /**
     * 
     */
    @TableId(value = "SCHED_NAME")
    private String SCHED_NAME;

    /**
     * 
     */
    @TableId(value = "CALENDAR_NAME")
    private String CALENDAR_NAME;

    /**
     * 
     */
    @TableField(value = "CALENDAR")
    private byte[] CALENDAR;

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
        QrtzCalendars other = (QrtzCalendars) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getCALENDAR_NAME() == null ? other.getCALENDAR_NAME() == null : this.getCALENDAR_NAME().equals(other.getCALENDAR_NAME()))
            && (Arrays.equals(this.getCALENDAR(), other.getCALENDAR()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getCALENDAR_NAME() == null) ? 0 : getCALENDAR_NAME().hashCode());
        result = prime * result + (Arrays.hashCode(getCALENDAR()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SCHED_NAME=").append(SCHED_NAME);
        sb.append(", CALENDAR_NAME=").append(CALENDAR_NAME);
        sb.append(", CALENDAR=").append(CALENDAR);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}