package cn.rock.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {
    public MyJob() {
    }

    public MyJob(int i) {
        System.out.println(i);
    }

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("my job run ...");
    }
}
