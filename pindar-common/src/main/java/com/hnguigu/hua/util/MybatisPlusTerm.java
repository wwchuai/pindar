package com.hnguigu.hua.util;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author hua
 * @version 1.0.0
 * @DATE 2021/11/4 16:50
 * Mybatis-plus 自定义动态条件创建器
 */
@Builder
@NoArgsConstructor
public class MybatisPlusTerm<T> implements Serializable {

    /**
     * 通过 obj 创建出属于 obj 的专属 QueryWrapper 条件对象
     * names 则是不要的条件属性忽略
     * @param obj
     * @param names
     * @return
     * @throws IllegalAccessException
     */
    public QueryWrapper<T> getQueryWrapper(T obj,String... names) throws IllegalAccessException {

        // 创建 Wrapper 条件对象
        QueryWrapper<T> wrapper = new QueryWrapper<>();

        // 为空表示查询所有
        if(obj==null){
            // 直接调用返回即可
            return wrapper;
        }

        // 获取到 brand 对象所有的字段信息
        Field[] fields = obj.getClass().getDeclaredFields();

        // 遍历取值
        for (Field field : fields){
            // 注意：默认只能拿取 public 字段的值， private 私有字段值需要设置允许访问
            field.setAccessible(true);

            // 遍历需要忽略的属性名
            for (String name : names){
                // 去除掉 需要忽略的属性
                if(!field.getName().equals(name)&&field.get(obj)!=null){
                    // 获取到值
                    Object value = field.get(obj);

                    // 获取属性的类型，根据类型做条件对应使用
                    // 判断数据类型，并进行对应的数据条件绑定，目前只对八大类型，加一个时间类型进行数据处理，依旧对应着数据库的数据库类型
                    String type = field.getGenericType().getTypeName();
                    if(type.equals("java.lang.Integer")||type.equals("java.lang.Double")||type.equals("java.lang.Float")||type.equals("java.lang.Byte")||type.equals("java.lang.Long")||type.equals("java.lang.Boolean")||type.equals("java.util.Date")){
                        wrapper.eq(field.getName(),value);
                    }else if(type.equals("java.lang.String")||type.equals("java.lang.Character")){
                        wrapper.like(field.getName(),value);
                    }
                }
            }
        }
        return wrapper;
    }

    /**
     * 通过 obj 创建出属于 obj 的专属 QueryWrapper 条件对象
     * names 则是不要的条件属性忽略
     * @param obj
     * @param names
     * @return
     */
    public UpdateWrapper<T> getUpdateWrapper(T obj,String... names) throws IllegalAccessException {
        UpdateWrapper<T> wrapper = new UpdateWrapper<>();
        // 为空表示查询所有
        if(obj==null){
            // 直接调用返回即可
            return wrapper;
        }

        // 获取到 brand 对象所有的字段信息
        Field[] fields = obj.getClass().getDeclaredFields();

        // 遍历取值
        for (Field field : fields){
            // 注意：默认只能拿取 public 字段的值， private 私有字段值需要设置允许访问
            field.setAccessible(true);

            // 遍历需要忽略的属性名
            for (String name : names){
                // 去除掉 需要忽略的属性
                if(!field.getName().equals(name)&&field.get(obj)!=null){
                    // 获取到值
                    Object value = field.get(obj);

                    // 获取属性的类型，根据类型做条件对应使用
                    // 判断数据类型，并进行对应的数据条件绑定，目前只对八大类型，加一个时间类型进行数据处理，依旧对应着数据库的数据库类型
                    String type = field.getGenericType().getTypeName();
                    if(type.equals("java.lang.Integer")||type.equals("java.lang.Double")||type.equals("java.lang.Float")||type.equals("java.lang.Byte")||type.equals("java.lang.Long")||type.equals("java.lang.Boolean")||type.equals("java.util.Date")){
                        wrapper.eq(field.getName(),value);
                    }else if(type.equals("java.lang.String")||type.equals("java.lang.Character")){
                        wrapper.like(field.getName(),value);
                    }
                }
            }
        }
        return wrapper;
    }

}
