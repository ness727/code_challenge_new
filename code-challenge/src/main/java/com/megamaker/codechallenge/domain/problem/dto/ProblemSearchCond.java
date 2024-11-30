package com.megamaker.codechallenge.domain.problem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProblemSearchCond {
    private String title;
    private Integer level;
}