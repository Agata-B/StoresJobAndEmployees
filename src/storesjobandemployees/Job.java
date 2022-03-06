/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storesjobandemployees;

import java.io.Serializable;

/**
 *
 * @author Agata
 */
public class Job implements Serializable {

    private String nameOfJob;
    private double salary;
    

    public Job(String nameOfJob, double salary ) {
        this.nameOfJob = nameOfJob;
        this.salary = salary;
    }

    /*
     public boolean equals(Job job) {
        if (this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob)) {
            return true;
        } else {
            return false;
        }
    }
     */
    public boolean equals(Job job) {
        return this.salary == job.salary
                && this.nameOfJob.equals(job.nameOfJob);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }

}
