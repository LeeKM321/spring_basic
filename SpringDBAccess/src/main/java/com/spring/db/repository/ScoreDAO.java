package com.spring.db.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.db.model.ScoreVO;

@Repository
public class ScoreDAO implements IScoreDAO {

	
	
	@Override
	public void insertScore(ScoreVO vo) {
		
	}

	@Override
	public List<ScoreVO> selectAllScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScore(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public ScoreVO selectOne(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
