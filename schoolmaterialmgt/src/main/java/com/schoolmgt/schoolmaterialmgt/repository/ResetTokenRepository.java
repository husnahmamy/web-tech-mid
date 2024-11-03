package com.schoolmgt.schoolmaterialmgt.repository;




import com.schoolmgt.schoolmaterialmgt.model.ResetToken;
import com.schoolmgt.schoolmaterialmgt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    void deleteByToken(String token);
    Optional<ResetToken> findByUser(User user);
    Optional<ResetToken> findByToken(String token);
}