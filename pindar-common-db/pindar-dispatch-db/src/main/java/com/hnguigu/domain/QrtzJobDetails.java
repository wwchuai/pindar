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
 * @TableName QRTZ_JOB_DETAILS
 */
@TableName(value ="QRTZ_JOB_DETAILS")
@Data
public class QrtzJobDetails implements Serializable {
    /**
     * 
     */
    @TableId(value = "SCHED_NAME")
    private String SCHED_NAME;

    /**
     * 
     */
    @TableId(value = "JOB_NAME")
    private String JOB_NAME;

    /**
     * 
     */
    @TableId(value = "JOB_GROUP")
    private String JOB_GROUP;

    /**
     * 
     */
    @TableField(value = "DESCRIPTION")
    private String DESCRIPTION;

    /**
     * 
     */
    @TableField(value = "JOB_CLASS_NAME")
    private String JOB_CLASS_NAME;

    /**
     * 
     */
    @TableField(value = "IS_DURABLE")
    private String IS_DURABLE;

    /**
     * 
     */
    @TableField(value = "IS_NONCONCURRENT")
    private String IS_NONCONCURRENT;

    /**
     * 
     */
    @TableField(value = "IS_UPDATE_DATA")
    private String IS_UPDATE_DATA;

    /**
     * 
     */
    @TableField(value = "REQUESTS_RECOVERY")
    private String REQUESTS_RECOVERY;

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
        QrtzJobDetails other = (QrtzJobDetails) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getJOB_NAME() == null ? other.getJOB_NAME() == null : this.getJOB_NAME().equals(other.getJOB_NAME()))
            && (this.getJOB_GROUP() == null ? other.getJOB_GROUP() == null : this.getJOB_GROUP().equals(other.getJOB_GROUP()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
            && (this.getJOB_CLASS_NAME() == null ? other.getJOB_CLASS_NAME() == null : this.getJOB_CLASS_NAME().equals(other.getJOB_CLASS_NAME()))
            && (this.getIS_DURABLE() == null ? other.getIS_DURABLE() == null : this.getIS_DURABLE().equals(other.getIS_DURABLE()))
            && (this.getIS_NONCONCURRENT() == null ? other.getIS_NONCONCURRENT() == null : this.getIS_NONCONCURRENT().equals(other.getIS_NONCONCURRENT()))
            && (this.getIS_UPDATE_DATA() == null ? other.getIS_UPDATE_DATA() == null : this.getIS_UPDATE_DATA().equals(other.getIS_UPDATE_DATA()))
            && (this.getREQUESTS_RECOVERY() == null ? other.getREQUESTS_RECOVERY() == null : this.getREQUESTS_RECOVERY().equals(other.getREQUESTS_RECOVERY()))
            && (Arrays.equals(this.getJOB_DATA(), other.getJOB_DATA()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getJOB_NAME() == null) ? 0 : getJOB_NAME().hashCode());
        result = prime * result + ((getJOB_GROUP() == null) ? 0 : getJOB_GROUP().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getJOB_CLASS_NAME() == null) ? 0 : getJOB_CLASS_NAME().hashCode());
        result = prime * result + ((getIS_DURABLE() == null) ? 0 : getIS_DURABLE().hashCode());
        result = prime * result + ((getIS_NONCONCURRENT() == null) ? 0 : getIS_NONCONCURRENT().hashCode());
        result = prime * result + ((getIS_UPDATE_DATA() == null) ? 0 : getIS_UPDATE_DATA().hashCode());
        result = prime * result + ((getREQUESTS_RECOVERY() == null) ? 0 : getREQUESTS_RECOVERY().hashCode());
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
        sb.append(", JOB_NAME=").append(JOB_NAME);
        sb.append(", JOB_GROUP=").append(JOB_GROUP);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", JOB_CLASS_NAME=").append(JOB_CLASS_NAME);
        sb.append(", IS_DURABLE=").append(IS_DURABLE);
        sb.append(", IS_NONCONCURRENT=").append(IS_NONCONCURRENT);
        sb.append(", IS_UPDATE_DATA=").append(IS_UPDATE_DATA);
        sb.append(", REQUESTS_RECOVERY=").append(REQUESTS_RECOVERY);
        sb.append(", JOB_DATA=").append(JOB_DATA);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}