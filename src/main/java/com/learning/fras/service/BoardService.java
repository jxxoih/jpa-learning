package com.learning.fras.service;

import com.learning.fras.dto.BoardDTO;
import com.learning.fras.dto.BoardPostRequestDto;
import com.learning.fras.dto.CompanyDto;
import com.learning.fras.entity.Board;
import com.learning.fras.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    public Optional<Board> findById(Long id) {
        return boardRepository.findById(id);
    }

    public List<Board> selectJPQL() {
        return boardRepository.selectAllJPQL();
    }

    public List<Board> selectSQL() {
        return boardRepository.selectAllSQL();
    }

    public Board join(Board board) {
        return boardRepository.save(board);
    }


    public Long save(BoardPostRequestDto requestDto) {


        Board saveBoard = requestDto.toEntity();
        Board board = boardRepository.save(saveBoard);

        return board.getId();
    }

    public List<BoardDTO> getBoardAllList() {
        return boardRepository.findBoard();
    }

    public List<CompanyDto> getCompanyData() {
        return boardRepository.findCompanyAll();
    }


}
