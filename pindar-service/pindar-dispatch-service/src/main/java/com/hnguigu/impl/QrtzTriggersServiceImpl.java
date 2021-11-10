package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.QrtzTriggers;
import com.hnguigu.service.QrtzTriggersService;
import com.hnguigu.mapper.QrtzTriggersMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【QRTZ_TRIGGERS】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersMapper, QrtzTriggers>
    implements QrtzTriggersService{

}




