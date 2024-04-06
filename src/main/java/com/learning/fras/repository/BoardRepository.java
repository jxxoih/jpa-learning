package com.learning.fras.repository;

import com.learning.fras.dto.BoardDTO;
import com.learning.fras.dto.CompanyDto;
import com.learning.fras.entity.Board;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query(value = "select bd from Board bd")
    public List<Board> selectAllJPQL();

    @Query(value = "select id, age, name from board where id > 1", nativeQuery = true)
    public List<Board> selectAllSQL();

//    List<Board> findById(long id);


    @Query(value = "select new "
            + "com.learning.fras.dto.BoardDTO(bd.id, bd.age, bd.name) "
            + "from Board bd where bd.id > 2")
    List<BoardDTO> findBoard();

    @Query(value = "select new "
            + "com.learning.fras.dto.CompanyDto(cp.c_idx, cp.p_idx, cp.company_nm, cp.emp_status, cp.w_start_date, cp.w_end_date, cp.use_status, cp.updated_at, cp.created_at) "
            + "FROM Company cp "
            + "WHERE cp.use_status = 1 AND cp.p_idx = 1")
    List<CompanyDto> findCompanyAll();


}
