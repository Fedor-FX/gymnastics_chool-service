package com.gymschool.repository;
import com.gymschool.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByAge(int age);
}
