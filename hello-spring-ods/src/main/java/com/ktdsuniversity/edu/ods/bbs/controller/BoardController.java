package com.ktdsuniversity.edu.ods.bbs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ktdsuniversity.edu.ods.bbs.service.BoardService;
import com.ktdsuniversity.edu.ods.bbs.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;
    
    // 게시글 목록 조회 
    @GetMapping("/list-ods")
    public String list( @RequestParam(value="keyword", required=false, defaultValue="") String keyword,
            @RequestParam(value="page", required=false, defaultValue="1") int page, Model model) {
        
        int pageSize = 10; 
        List<BoardVO> boardList = boardService.getBoardList(keyword, page, pageSize);
        int totalCount = boardService.getBoardCount(keyword);
        
        model.addAttribute("boardList", boardList);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("currentPage", page);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("keyword", keyword);
        
        return "boardlist"; 
    }
    
    // 게시글 상세 조회
    @GetMapping("/detail-ods/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        BoardVO board = boardService.getBoardDetail(id);
        model.addAttribute("board", board);
        return "boarddetail"; 
    }
    
    // 게시글 작성 폼
    @GetMapping("/write-ods")
    public String writeForm() {
        return "boardwrite";
    }
    
    // 게시글 작성
    @PostMapping("/write-ods")
    public String write(BoardVO board) {
        boardService.createBoard(board);
        return "redirect:/board/list-ods";
    }
    
    // 게시글 수정 폼
    @GetMapping("/edit-ods/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        BoardVO board = boardService.getBoardDetail(id);
        model.addAttribute("board", board);
        return "boardedit"; 
    }
    
    // 게시글 수정
    @PostMapping("/edit-ods")
    public String edit(BoardVO board) {
        boardService.updateBoard(board);
        return "redirect:/board/detail-ods/" + board.getId();
    }
    
    // 게시글 삭제
    @PostMapping("/delete-ods/{id}")
    public String delete(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
        return "redirect:/board/list-ods";
    }
    

}