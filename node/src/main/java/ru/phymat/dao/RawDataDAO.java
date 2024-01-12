package ru.phymat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.phymat.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
