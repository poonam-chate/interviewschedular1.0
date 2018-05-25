package com.interviewsystem.models.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Schedular {

    @Id
    @GeneratedValue
    private int sid;
    @Temporal(TemporalType.DATE)
    private Date scheduledDate;
    private String slot;

    @ManyToOne
    private Interviewer iid;

    @ManyToOne
    private Candidate cid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Interviewer getIid() {
        return iid;
    }

    public void setIid(Interviewer iid) {
        this.iid = iid;
    }

    public Candidate getCid() {
        return cid;
    }

    public void setCid(Candidate cid) {
        this.cid = cid;
    }
}
