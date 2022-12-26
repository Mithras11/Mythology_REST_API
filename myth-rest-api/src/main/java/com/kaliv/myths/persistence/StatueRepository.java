package com.kaliv.myths.persistence;

import com.kaliv.myths.entity.artefacts.Statue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatueRepository extends JpaRepository<Statue, Long> {
}
