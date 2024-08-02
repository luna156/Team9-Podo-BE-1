package com.softeer.podoarrival.user.repository;

import com.softeer.podoarrival.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameAndPhoneNum(String name, String phoneNum);
    boolean existsByPhoneNum(String phoneNum);
}
