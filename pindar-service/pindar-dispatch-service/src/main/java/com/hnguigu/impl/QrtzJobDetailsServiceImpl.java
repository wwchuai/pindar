package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.QrtzJobDetails;
import com.hnguigu.service.QrtzJobDetailsService;
import com.hnguigu.mapper.QrtzJobDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【QRTZ_JOB_DETAILS】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsMapper, QrtzJobDetails>
    implements QrtzJobDetailsService{

}




