package com.hnguigu;

import com.hnguigu.jobs.HuaJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Authon hua
 * @Date 2021/11/9 11:37
 * @Mail chuameng7@gmail.com
 */
public class HuaJobMain {

    public static void main(String[] args) throws SchedulerException {
        // 创建调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        // 创建任务实例对象
        JobDetail detail = JobBuilder.newJob(HuaJob.class).withIdentity("hua").build();

        // 传递参数
        detail.getJobDataMap().put("k1","牛逼");
        detail.getJobDataMap().put("k2","傻逼");

        // 创建 cron 表达式，表示在指定 秒 执行
        // cron 表达式 秒 分 时 日 月 星期 年 参数表达式： * （通用）| ?（不指定）| - （x-y x到y,必须 y > x）| / （x/y 从 x 开始每过次 y 就执行一次） | 1,2,5 （指定参数）
        // 注：每个区域之间 空格 分离，? 只能用于 日 / 月 / 星期 中使用  注意：年 不能使用 * （所有）
        // 例如：1,3,5 * * *
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("1,5,8,10,16 * * * * ?");

        // 创建触发器 Trigger，表示 5秒 触发调用
        // Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).withRepeatCount(5)).build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("cron").withSchedule(cronScheduleBuilder).build();

        // 触发器和任务关联
        scheduler.scheduleJob(detail,trigger);

        // 启动任务调度器
        scheduler.start();
    }

}
