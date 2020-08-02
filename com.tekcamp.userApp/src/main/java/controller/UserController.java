package controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dto.UsersDto;
import model.User;
import model.request.UserRequest;
import model.response.UserResponse;
import services.UserService; 

@RestController
@RequestMapping("users")
public class UserController {

	private UserService userService; 
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		UsersDto userDto = new UsersDto(); 
		BeanUtils.copyProperties(userRequest, userDto);
		
		UsersDto createdUser = userService.createUser(userDto); 
		
		UserResponse returnUser = new UserResponse(); 
		BeanUtils.copyProperties(createdUser, returnUser);
		
		return returnUser; 
	}

	@GetMapping
	public List<UserResponse> getAllUsers(
			@RequestParam(value="page", defaultValue = "1") int page, 
			@RequestParam(value="limit", defaultValue="5") int limit) {
		
		List<UsersDto> userDtoList = userService.getAllUsers(page, limit);
		
		List<UserResponse> userResponseList  = new ArrayList<UserResponse>(); 
		
		for ( int i = 0; i<userDtoList.size(); i++ ) {
			UserResponse userResponse = new UserResponse(); 
			BeanUtils.copyProperties(userDtoList.get(i), userResponse);
			userResponseList.add(userResponse); 
		}
	
		return userResponseList; 
	}
	
	
	@GetMapping(path="/{userId}")
	public UserResponse getUserByUserId(@PathVariable String userId) {
		UsersDto singleUserDto = userService.getUserByUserId(userId); 
		UserResponse returnValue = new UserResponse(); 
		BeanUtils.copyProperties(singleUserDto, returnValue);
		return returnValue; 
	}
	
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user); 
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id); 
	}
	
	@GetMapping(path="/email/{email}")
	public User getUserByEmail(@PathVariable String email) {
		User oneUser = userService.getUserByEmail(email);
		return oneUser; 
	}
	
}
