package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.QrtzFiredTriggers;
import com.hnguigu.service.QrtzFiredTriggersService;
import com.hnguigu.mapper.QrtzFiredTriggersMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【QRTZ_FIRED_TRIGGERS】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersMapper, QrtzFiredTriggers>
    implements QrtzFiredTriggersService{

}




