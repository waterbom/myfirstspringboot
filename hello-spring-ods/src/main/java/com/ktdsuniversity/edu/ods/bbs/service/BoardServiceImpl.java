package com.ktdsuniversity.edu.ods.bbs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktdsuniversity.edu.ods.bbs.dao.BoardDAO;
import com.ktdsuniversity.edu.ods.bbs.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;
    
    @Override 
    public List<BoardVO> getBoardList(String keyword, int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        Map<String, Object> params = new HashMap<>();
        params.put("keyword", keyword);
        params.put("offset", offset);
        params.put("limit", pageSize);
        return boardDAO.selectBoardList(params);
    }
    
    @Override
    public int getBoardCount(String keyword) {
        return boardDAO.countBoardList(keyword);
    }
    
    @Override
    public BoardVO getBoardDetail(Long id) {
        boardDAO.incrementViewCount(id);
        return boardDAO.selectBoardById(id);
    }
    
    @Override
    public boolean createBoard(BoardVO board) {
        return boardDAO.insertBoard(board) > 0;
    }
    
    @Override
    public boolean updateBoard(BoardVO board) {
        return boardDAO.updateBoard(board) > 0;
    }
    
    @Override
    public boolean deleteBoard(Long id) {
        return boardDAO.deleteBoard(id) > 0;
    }
    
}