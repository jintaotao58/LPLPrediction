package com.LPLPrediction.dao;

import com.LPLPrediction.beans.Match;

import java.util.List;

public interface ReadDao {
    public List<Match> read(String gameNum);
}
