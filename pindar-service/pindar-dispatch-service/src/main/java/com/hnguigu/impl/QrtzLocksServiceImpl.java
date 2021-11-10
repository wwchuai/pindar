package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.QrtzLocks;
import com.hnguigu.service.QrtzLocksService;
import com.hnguigu.mapper.QrtzLocksMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【QRTZ_LOCKS】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksMapper, QrtzLocks>
    implements QrtzLocksService{

}




