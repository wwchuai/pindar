package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.ScheduleJob;
import com.hnguigu.service.ScheduleJobService;
import com.hnguigu.mapper.ScheduleJobMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【schedule_job(定时任务)】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobMapper, ScheduleJob>
    implements ScheduleJobService{

}




