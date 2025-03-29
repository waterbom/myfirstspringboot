package com.ktdsuniversity.edu.ods.bbs.service;

import java.util.List;
import com.ktdsuniversity.edu.ods.bbs.vo.BoardVO;


public interface BoardService {
    List<BoardVO> getBoardList(String keyword, int page, int pageSize);
    int getBoardCount(String keyword);
    BoardVO getBoardDetail(Long id);
    boolean createBoard(BoardVO board);
    boolean updateBoard(BoardVO board);
    boolean deleteBoard(Long id);
}