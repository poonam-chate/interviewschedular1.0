package com.interviewsystem.controllers;

import com.interviewsystem.models.entity.Interviewer;
import com.interviewsystem.models.enums.Priority;
import com.interviewsystem.services.InterviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interviewer")
public class InterviewerController {

    @Autowired
    private InterviewerService interviewerService;

    @RequestMapping(method = RequestMethod.POST,value= "/")
    public Interviewer createInterviewer(@RequestBody com.interviewsystem.models.requests.Interviewer interviewer){

        return interviewerService.create(interviewer);

    }

    @RequestMapping(method = RequestMethod.GET,value= "/")
    public List<Interviewer> getAllInterviewer(){

        return interviewerService.getAll();

    }

    @RequestMapping(method = RequestMethod.GET,value= "/id/{iid}")
    public Interviewer getInterviewerById(@PathVariable int iid){
        return interviewerService.getByID(iid);

    }

    @RequestMapping(method = RequestMethod.GET,value= "/name/{name}")
    public List<Interviewer> getInterviewerByName(@PathVariable String name){
        return interviewerService.getByName(name);

    }

    @RequestMapping(method = RequestMethod.GET,value= "/email/{email}")
    public List<Interviewer> getInterviewerByEmail(@PathVariable String email){
        return interviewerService.getByEmail(email);

    }

    @RequestMapping(method = RequestMethod.GET,value= "/contact/{contact}")
    public List<Interviewer> getInterviewerByEmail(@PathVariable int contact){
        return interviewerService.getByContact(contact);

    }

    @RequestMapping(method = RequestMethod.GET,value= "/priority/{proirity}")
    public List<Interviewer> getInterviewerByPriority(@PathVariable Priority priority){
        return interviewerService.getByPriority(priority);

    }

    @RequestMapping(method = RequestMethod.PUT,value= "/")
    public Interviewer updateInterviewer(@RequestBody com.interviewsystem.models.requests.Interviewer interviewer){

       return interviewerService.update(interviewer);

    }

    @RequestMapping(method = RequestMethod.DELETE,value= "/")
    public void deleteInterviewer(@RequestBody int iid){

        interviewerService.delete(iid);

    }

}
