package com.kaliv.myths.persistence;

import com.kaliv.myths.entity.MythCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MythCharacterRepository extends JpaRepository<MythCharacter, Long> {
}
