package com.demo.demo20200625.spread.repository;

import com.demo.demo20200625.spread.domain.Spread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpreadRepository extends JpaRepository<Spread, String> {

    Optional<Spread> findByRoomIdAndToken(String roomId, String token);
}
