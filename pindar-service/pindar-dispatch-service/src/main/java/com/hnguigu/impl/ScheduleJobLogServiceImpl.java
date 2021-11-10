package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.ScheduleJobLog;
import com.hnguigu.service.ScheduleJobLogService;
import com.hnguigu.mapper.ScheduleJobLogMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【schedule_job_log(定时任务日志)】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogMapper, ScheduleJobLog>
    implements ScheduleJobLogService{

}




