package com.home.java9;

import java.lang.ProcessHandle.Info;

public class UpdateProcessAPIs {

    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();
        Info info = ph.info();
        System.out.println("Complete Process Information: " + info);
        System.out.println(info.user().get());
        System.out.println(info.command().get());
        System.out.println(info.startInstant().get());
        System.out.println("Total CPU time Acquired: " + info.totalCpuDuration().get());
    }
}
