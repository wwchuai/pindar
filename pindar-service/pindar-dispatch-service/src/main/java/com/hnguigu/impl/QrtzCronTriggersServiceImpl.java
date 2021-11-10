package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.QrtzCronTriggers;
import com.hnguigu.service.QrtzCronTriggersService;
import com.hnguigu.mapper.QrtzCronTriggersMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【QRTZ_CRON_TRIGGERS】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers>
    implements QrtzCronTriggersService{

}




