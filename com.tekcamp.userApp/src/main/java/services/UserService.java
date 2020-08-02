package services;

import java.util.List;

import dto.UsersDto;
import model.User;

public interface UserService {

	List<UsersDto> getAllUsers(int page, int limit);

	UsersDto getUserByUserId(String userId);

	UsersDto createUser(UsersDto userDto);

	void updateUser(User user);

	void deleteUser(Long id);

	User getUserByEmail(String email);

}