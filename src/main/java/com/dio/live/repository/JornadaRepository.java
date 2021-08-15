package com.dio.live.repository;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

@Repository

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    @DeleteMapping("/{idJornada}")
    default ResponseEntity deleteByID(JornadaService jornadaService, Long idJornada) throws Exception {
       try {
           jornadaService.deleteJornada(idJornada);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
        ResponseEntity<JornadaTrabalho> ok = (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
        return ok;
    }
}