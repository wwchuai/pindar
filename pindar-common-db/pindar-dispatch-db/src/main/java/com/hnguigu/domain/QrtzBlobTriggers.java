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
 * @TableName QRTZ_BLOB_TRIGGERS
 */
@TableName(value ="QRTZ_BLOB_TRIGGERS")
@Data
public class QrtzBlobTriggers implements Serializable {
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
    @TableField(value = "BLOB_DATA")
    private byte[] BLOB_DATA;

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
        QrtzBlobTriggers other = (QrtzBlobTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (Arrays.equals(this.getBLOB_DATA(), other.getBLOB_DATA()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + (Arrays.hashCode(getBLOB_DATA()));
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
        sb.append(", BLOB_DATA=").append(BLOB_DATA);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}