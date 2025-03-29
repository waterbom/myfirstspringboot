package com.ktdsuniversity.edu.ods.bbs.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import com.ktdsuniversity.edu.ods.bbs.vo.BoardVO;

@Mapper
public interface BoardDAO {
    List<BoardVO> selectBoardList(Map<String, Object> params);
    int countBoardList(String keyword);
    BoardVO selectBoardById(Long id);
    int insertBoard(BoardVO board);
    int updateBoard(BoardVO board);
    int deleteBoard(Long id);
    
    int incrementViewCount(Long id);
}