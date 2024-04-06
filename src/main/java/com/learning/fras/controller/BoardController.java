package com.learning.fras.controller;

import com.learning.fras.dto.BoardDTO;
import com.learning.fras.dto.BoardPostRequestDto;
import com.learning.fras.dto.CompanyDto;
import com.learning.fras.entity.Board;
import com.learning.fras.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/board")
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping(value = "/list")
    public List<BoardDTO> list() {

//        return boardService.selectSQL();

        return boardService.getBoardAllList();
    }

    @PostMapping(value = "/list/add")
    public Long save(@RequestBody BoardPostRequestDto requestDto) {
        System.out.println("add data :: " + requestDto);
        return boardService.save(requestDto);
    }

    @GetMapping(value = "/list/{id}")
    public Optional<Board> findOne(@PathVariable Long id) {

        return boardService.findById(id);
    }

    @GetMapping(value = "/company")
    public List<CompanyDto> companyData() {
        return boardService.getCompanyData();
    }

}
