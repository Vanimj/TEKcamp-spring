package dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	User findByUserId(String userId); 
	
	User findByEmail(String email);
	
}