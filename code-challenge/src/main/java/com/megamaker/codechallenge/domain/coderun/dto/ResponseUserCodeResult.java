package com.megamaker.codechallenge.domain.coderun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUserCodeResult {
    private Long runtime;
    private String pramData;
    private String testcaseAnswer;
    private Object userAnswer;
    private Boolean isCorrect;

    public String getRuntime() {
        return runtime + "ms";
    }
}
