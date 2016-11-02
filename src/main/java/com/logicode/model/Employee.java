package com.logicode.Model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

/**
 * Created by jjenkins on 10/23/2016.
 */
@XmlRootElement(name = "Employee")
public class Employee {

    String name;

    String email;

    String bio;

    File[] roots = File.listRoots();

    //return the file system root data
    public File[] getRoots() {
        return roots;
    }

    //the current cpu processors
    int processors;

    //free memory
    long freeMemory;

    //get the free memory
    public long getFreeMemory() {

        this.freeMemory =  Runtime.getRuntime().freeMemory();
        return freeMemory;
    }

    //get the current processor
    public int getProcessors() {
        this.processors = Runtime.getRuntime().availableProcessors();
        return processors;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void getCPUInfo(){


    /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
    /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

    /* Total memory currently available to the JVM */
        System.out.println("Total memory available to JVM (bytes): " +
                Runtime.getRuntime().totalMemory());

    /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

        /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + root.getTotalSpace());
            System.out.println("Free space (bytes): " + root.getFreeSpace());
            System.out.println("Usable space (bytes): " + root.getUsableSpace());
        }
    }

    public Employee() {
    }

}
