package com.ach.redtool.repository.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ach.redtool.repository.domain.entity.UtilisateurEntity;

@Repository
public interface UtilisateurRepository  extends JpaRepository<UtilisateurEntity, Long>,PagingAndSortingRepository<UtilisateurEntity, Long>{
	
	UtilisateurEntity findByNom(String nom);
	List<UtilisateurEntity> findAll();
	Page<UtilisateurEntity> findAll(Pageable pageable);

}
