package com.ach.redtool.controller.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ach.redtool.service.dto.UtilisateurDto;
import com.ach.redtool.service.exception.ResourceNotFoundException;
import com.ach.redtool.service.user.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Controller
@RequestMapping("/user")
@Api(value="User controller")
public class UtlilisateurController {
	
	final Logger LOOGER = LoggerFactory.getLogger(UtlilisateurController.class);
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/listUsers")
	@ApiOperation("get All Users")
	public String  getAllUser(Model theModel) {
		LOOGER.debug("Recupérer la liste des utilisateur");
		List<UtilisateurDto> listUsers =  userService.findAllUser();
		if(listUsers.isEmpty()) {
			LOOGER.debug("la liste est vide");
		}
		LOOGER.debug("nombre d'utilisateurs trouvés {}",listUsers.size());
		theModel.addAttribute("listUsers", listUsers);
		return "list-users";
	}
	
	@GetMapping(value="/showFormForUpdate")
	@ApiOperation("get user by id")
	public String getUserById(@RequestParam("userId") Long userId,Model theModel) throws ResourceNotFoundException  {
		LOOGER.debug("Recupérer l'utilisateur dont l'id = {}",userId);
		UtilisateurDto UtilisateurDto = userService.getUserById(userId);
		theModel.addAttribute("user", UtilisateurDto);
		return "user-form";
	}
	
	@GetMapping(value="showUserForm")
	@ApiOperation("show user form")
	public String showUserForm(Model theModel)  {
		LOOGER.debug("afficher form utilisateur ");
		UtilisateurDto utilisateurDto = new UtilisateurDto();
		theModel.addAttribute("user", utilisateurDto);
		return "user-form";
	}
	
	
	@PostMapping("/createUser")
	@ApiOperation("create user")
	public String createUser(@ModelAttribute("utilisateur") UtilisateurDto utilisateurDto ) {
		LOOGER.debug("création d'un utilisateur ");
		 userService.createUser((utilisateurDto));
		 return "redirect:/user/listUsers";
	}

	
	@GetMapping(value="/deleteUser")
	@ApiOperation("delete user")
	public String deleteUser(@RequestParam("userId") Long userId) throws ResourceNotFoundException {
		LOOGER.debug("delete user id = {}",userId);
		userService.deleteUser(userId);
		return "redirect:/user/listUsers";
	}
	
	@GetMapping(value="/updateUser")
	@ApiOperation("update user")
	public String updateUser(@RequestParam("userId") Long userId, @ModelAttribute("utilisateur") UtilisateurDto utilisateurDto) throws ResourceNotFoundException {
		LOOGER.debug("update de l'utilisateur dont l'id = {}",userId);
		userService.updateUser(utilisateurDto);
		return "redirect:/user/listUsers";
	}
	
}
