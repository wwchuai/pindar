package com.hnguigu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 缓冲路线使用表
 * @TableName pd_cache_line_use
 */
@TableName(value ="pd_cache_line_use")
@Data
public class CacheLineUse implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 缓冲线路表id
     */
    @TableField(value = "cache_line_id")
    private String cache_line_id;

    /**
     * 订单分类表id
     */
    @TableField(value = "order_classify_id")
    private String order_classify_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date create_date;

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
        CacheLineUse other = (CacheLineUse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCache_line_id() == null ? other.getCache_line_id() == null : this.getCache_line_id().equals(other.getCache_line_id()))
            && (this.getOrder_classify_id() == null ? other.getOrder_classify_id() == null : this.getOrder_classify_id().equals(other.getOrder_classify_id()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCache_line_id() == null) ? 0 : getCache_line_id().hashCode());
        result = prime * result + ((getOrder_classify_id() == null) ? 0 : getOrder_classify_id().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cache_line_id=").append(cache_line_id);
        sb.append(", order_classify_id=").append(order_classify_id);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}