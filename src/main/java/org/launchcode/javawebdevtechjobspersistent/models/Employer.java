package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location required.")
    @Size(max = 50, message = "Location is too long. Try a shorter term.")
    private String location;


    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }

}