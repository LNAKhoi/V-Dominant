package com.vdominant.authservice.repositories;

import com.vdominant.authservice.entities.UserToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTokenRepository extends JpaRepository<UserToken, Long> {
}
