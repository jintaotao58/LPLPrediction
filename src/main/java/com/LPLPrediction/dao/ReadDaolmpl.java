package com.LPLPrediction.dao;

import com.LPLPrediction.beans.Match;
import com.mongodb.Mongo;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

public class ReadDaolmpl implements ReadDao{
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<Match> read(String gameNum) {
        Query query = new Query();
        query.addCriteria(Criteria.where("game_num").is(gameNum));
        List<Match> list= mongoTemplate.find(query,Match.class);
        return list;
    }
}
