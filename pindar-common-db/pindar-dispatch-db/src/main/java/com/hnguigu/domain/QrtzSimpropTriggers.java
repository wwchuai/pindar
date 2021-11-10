package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName QRTZ_SIMPROP_TRIGGERS
 */
@TableName(value ="QRTZ_SIMPROP_TRIGGERS")
@Data
public class QrtzSimpropTriggers implements Serializable {
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
    @TableField(value = "STR_PROP_1")
    private String STR_PROP_1;

    /**
     * 
     */
    @TableField(value = "STR_PROP_2")
    private String STR_PROP_2;

    /**
     * 
     */
    @TableField(value = "STR_PROP_3")
    private String STR_PROP_3;

    /**
     * 
     */
    @TableField(value = "INT_PROP_1")
    private Integer INT_PROP_1;

    /**
     * 
     */
    @TableField(value = "INT_PROP_2")
    private Integer INT_PROP_2;

    /**
     * 
     */
    @TableField(value = "LONG_PROP_1")
    private Long LONG_PROP_1;

    /**
     * 
     */
    @TableField(value = "LONG_PROP_2")
    private Long LONG_PROP_2;

    /**
     * 
     */
    @TableField(value = "DEC_PROP_1")
    private BigDecimal DEC_PROP_1;

    /**
     * 
     */
    @TableField(value = "DEC_PROP_2")
    private BigDecimal DEC_PROP_2;

    /**
     * 
     */
    @TableField(value = "BOOL_PROP_1")
    private String BOOL_PROP_1;

    /**
     * 
     */
    @TableField(value = "BOOL_PROP_2")
    private String BOOL_PROP_2;

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
        QrtzSimpropTriggers other = (QrtzSimpropTriggers) that;
        return (this.getSCHED_NAME() == null ? other.getSCHED_NAME() == null : this.getSCHED_NAME().equals(other.getSCHED_NAME()))
            && (this.getTRIGGER_NAME() == null ? other.getTRIGGER_NAME() == null : this.getTRIGGER_NAME().equals(other.getTRIGGER_NAME()))
            && (this.getTRIGGER_GROUP() == null ? other.getTRIGGER_GROUP() == null : this.getTRIGGER_GROUP().equals(other.getTRIGGER_GROUP()))
            && (this.getSTR_PROP_1() == null ? other.getSTR_PROP_1() == null : this.getSTR_PROP_1().equals(other.getSTR_PROP_1()))
            && (this.getSTR_PROP_2() == null ? other.getSTR_PROP_2() == null : this.getSTR_PROP_2().equals(other.getSTR_PROP_2()))
            && (this.getSTR_PROP_3() == null ? other.getSTR_PROP_3() == null : this.getSTR_PROP_3().equals(other.getSTR_PROP_3()))
            && (this.getINT_PROP_1() == null ? other.getINT_PROP_1() == null : this.getINT_PROP_1().equals(other.getINT_PROP_1()))
            && (this.getINT_PROP_2() == null ? other.getINT_PROP_2() == null : this.getINT_PROP_2().equals(other.getINT_PROP_2()))
            && (this.getLONG_PROP_1() == null ? other.getLONG_PROP_1() == null : this.getLONG_PROP_1().equals(other.getLONG_PROP_1()))
            && (this.getLONG_PROP_2() == null ? other.getLONG_PROP_2() == null : this.getLONG_PROP_2().equals(other.getLONG_PROP_2()))
            && (this.getDEC_PROP_1() == null ? other.getDEC_PROP_1() == null : this.getDEC_PROP_1().equals(other.getDEC_PROP_1()))
            && (this.getDEC_PROP_2() == null ? other.getDEC_PROP_2() == null : this.getDEC_PROP_2().equals(other.getDEC_PROP_2()))
            && (this.getBOOL_PROP_1() == null ? other.getBOOL_PROP_1() == null : this.getBOOL_PROP_1().equals(other.getBOOL_PROP_1()))
            && (this.getBOOL_PROP_2() == null ? other.getBOOL_PROP_2() == null : this.getBOOL_PROP_2().equals(other.getBOOL_PROP_2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSCHED_NAME() == null) ? 0 : getSCHED_NAME().hashCode());
        result = prime * result + ((getTRIGGER_NAME() == null) ? 0 : getTRIGGER_NAME().hashCode());
        result = prime * result + ((getTRIGGER_GROUP() == null) ? 0 : getTRIGGER_GROUP().hashCode());
        result = prime * result + ((getSTR_PROP_1() == null) ? 0 : getSTR_PROP_1().hashCode());
        result = prime * result + ((getSTR_PROP_2() == null) ? 0 : getSTR_PROP_2().hashCode());
        result = prime * result + ((getSTR_PROP_3() == null) ? 0 : getSTR_PROP_3().hashCode());
        result = prime * result + ((getINT_PROP_1() == null) ? 0 : getINT_PROP_1().hashCode());
        result = prime * result + ((getINT_PROP_2() == null) ? 0 : getINT_PROP_2().hashCode());
        result = prime * result + ((getLONG_PROP_1() == null) ? 0 : getLONG_PROP_1().hashCode());
        result = prime * result + ((getLONG_PROP_2() == null) ? 0 : getLONG_PROP_2().hashCode());
        result = prime * result + ((getDEC_PROP_1() == null) ? 0 : getDEC_PROP_1().hashCode());
        result = prime * result + ((getDEC_PROP_2() == null) ? 0 : getDEC_PROP_2().hashCode());
        result = prime * result + ((getBOOL_PROP_1() == null) ? 0 : getBOOL_PROP_1().hashCode());
        result = prime * result + ((getBOOL_PROP_2() == null) ? 0 : getBOOL_PROP_2().hashCode());
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
        sb.append(", STR_PROP_1=").append(STR_PROP_1);
        sb.append(", STR_PROP_2=").append(STR_PROP_2);
        sb.append(", STR_PROP_3=").append(STR_PROP_3);
        sb.append(", INT_PROP_1=").append(INT_PROP_1);
        sb.append(", INT_PROP_2=").append(INT_PROP_2);
        sb.append(", LONG_PROP_1=").append(LONG_PROP_1);
        sb.append(", LONG_PROP_2=").append(LONG_PROP_2);
        sb.append(", DEC_PROP_1=").append(DEC_PROP_1);
        sb.append(", DEC_PROP_2=").append(DEC_PROP_2);
        sb.append(", BOOL_PROP_1=").append(BOOL_PROP_1);
        sb.append(", BOOL_PROP_2=").append(BOOL_PROP_2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}