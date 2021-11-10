package com.hnguigu.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.spi.DateFormatProvider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;

/**
 * @Authon hua
 * @Date 2021/11/9 11:29
 * @Mail chuameng7@gmail.com
 * 自定义 job
 */
@Slf4j
public class HuaJob implements Job {

    public HuaJob() {
        System.out.println("创建 HuaJob 实例");
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        // log.trace("执行自定义 job :" + formatter.format(time));
        System.out.println("执行自定义 job  = " + formatter.format(time));

        // 通过上下文对象 JobExecutionContext 可以获取到人任务相关参数
        JobDataMap map = jobExecutionContext.getJobDetail().getJobDataMap();

        Set<Map.Entry<String,Object>> entries = map.entrySet();

        entries.forEach((entry) -> {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        });
    }
}
