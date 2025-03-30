package com.ktdsuniversity.edu.ods.bbs.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.ods.bbs.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDAO {

	
	//나중에 디비 연결되면 쓸 예정 
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
    
    @Override
    public List<BoardVO> selectBoardList(Map<String, Object> params) {
        return getSqlSession().selectList("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.selectBoardList", params);
    }
    
    @Override
    public int countBoardList(String keyword) {
        return getSqlSession().selectOne("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.countBoardList", keyword);
    }
    
    @Override
    public BoardVO selectBoardById(Long id) {
        return getSqlSession().selectOne("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.selectBoardById", id);
    }
    
    @Override
    public int insertBoard(BoardVO board) {
        return getSqlSession().insert("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.insertBoard", board);
    }
    
    @Override
    public int updateBoard(BoardVO board) {
        return getSqlSession().update("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.updateBoard", board);
    }
    
    @Override
    public int deleteBoard(Long id) {
        return getSqlSession().delete("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.deleteBoard", id);
    }
    
    @Override
    public int incrementViewCount(Long id) {
        return getSqlSession().update("com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO.incrementViewCount", id);
    }
}