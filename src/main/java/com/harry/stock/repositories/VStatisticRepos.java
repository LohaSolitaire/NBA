package com.harry.stock.repositories;

import com.harry.stock.models.V_statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VStatisticRepos extends JpaRepository<V_statistic, Long> {
}
