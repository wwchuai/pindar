package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.OrderClassifyOrder;
import com.hnguigu.service.OrderClassifyOrderService;
import com.hnguigu.mapper.OrderClassifyOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【pd_order_classify_order(订单分类订单关联表)】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class OrderClassifyOrderServiceImpl extends ServiceImpl<OrderClassifyOrderMapper, OrderClassifyOrder>
    implements OrderClassifyOrderService{

}




