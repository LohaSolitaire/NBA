package com.harry.stock.controllers;

import com.harry.stock.models.V_statistic;
import com.harry.stock.repositories.VStatisticRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statistics")
public class VStatisticController {
    @Autowired
    private VStatisticRepos vStatisticRepos;

    @GetMapping
    public List<V_statistic> getStatistics() { return vStatisticRepos.findAll(); }
}
