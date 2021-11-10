package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 订单分类订单关联表
 * @TableName pd_order_classify_order
 */
@TableName(value ="pd_order_classify_order")
@Data
public class OrderClassifyOrder implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 订单分类Id
     */
    @TableField(value = "order_classify_id")
    private String order_classify_id;

    /**
     * 订单Id
     */
    @TableField(value = "order_id")
    private String order_id;

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
        OrderClassifyOrder other = (OrderClassifyOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_classify_id() == null ? other.getOrder_classify_id() == null : this.getOrder_classify_id().equals(other.getOrder_classify_id()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_classify_id() == null) ? 0 : getOrder_classify_id().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_classify_id=").append(order_classify_id);
        sb.append(", order_id=").append(order_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}