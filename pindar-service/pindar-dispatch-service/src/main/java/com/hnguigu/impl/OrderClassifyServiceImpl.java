package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.OrderClassify;
import com.hnguigu.service.OrderClassifyService;
import com.hnguigu.mapper.OrderClassifyMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【pd_order_classify(订单分类记录)】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class OrderClassifyServiceImpl extends ServiceImpl<OrderClassifyMapper, OrderClassify>
    implements OrderClassifyService{

}




