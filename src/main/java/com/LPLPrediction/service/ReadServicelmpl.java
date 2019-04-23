package com.LPLPrediction.service;

import com.LPLPrediction.beans.Match;
import com.LPLPrediction.dao.ReadDao;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class ReadServicelmpl implements ReadService{

    private ReadDao readDao;

    private Map<String, Object> request, session;

    public ReadDao getReadDao() {
        return readDao;
    }

    public void setReadDao(ReadDao readDao) {
        this.readDao = readDao;
    }

    @Override
    public boolean read(String gameNum) {
        ActionContext ctx= ActionContext.getContext();
        session=(Map) ctx.getSession();
        request=(Map) ctx.get("request");
        List<Match> list = readDao.read(gameNum);
        if (list.size()==0)
            return false;
        else
        {
            session.put("message",list);
            return true;
        }
    }
}
