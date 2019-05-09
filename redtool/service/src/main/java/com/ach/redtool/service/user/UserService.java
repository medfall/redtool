package com.ach.redtool.service.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ach.redtool.service.common.ResponseDto;
import com.ach.redtool.service.dto.UtilisateurDto;
import com.ach.redtool.service.exception.ResourceNotFoundException;


public interface UserService {

	 List<UtilisateurDto> findAllUser ();
	 UtilisateurDto getUserById(Long id);
	 UtilisateurDto createUser(UtilisateurDto dto);
	 public  ResponseDto deleteUser(Long id);
	 ResponseDto updateUser(UtilisateurDto utilisateurDto) throws ResourceNotFoundException;
	 List<UtilisateurDto> findAllUserByPage(Pageable pageable);
	 
	
}
