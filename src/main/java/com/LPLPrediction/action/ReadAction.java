package com.LPLPrediction.action;

import com.LPLPrediction.service.ReadService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;
import org.apache.struts2.convention.annotation.Namespace;

import javax.annotation.Resource;

public class ReadAction {
    private String gameNum;

    private ReadService readService;

    public String getGameNum() {
        return gameNum;
    }

    public void setGameNum(String gameNum) {
        this.gameNum = gameNum;
    }

    public ReadService getReadService() {
        return readService;
    }

    public void setReadService(ReadService readService) {
        this.readService = readService;
    }

    public String execute()
    {
        if (readService.read(gameNum))
            return "success";
        else return "fail";
    }
}
