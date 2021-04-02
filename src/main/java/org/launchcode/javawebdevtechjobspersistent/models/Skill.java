package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Skill extends AbstractEntity {

    @Size(max = 250, message = "This exceeds the maximum character limit.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    public Skill(){}

    public List<Job> getJobs(){
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}