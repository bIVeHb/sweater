package ru.biv.sweater.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.biv.sweater.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
