package com.megamaker.admin.service;

import com.megamaker.admin.dto.RequestProblem;
import com.megamaker.admin.entity.Problem;
import com.megamaker.admin.entity.Testcase;
import com.megamaker.admin.mapper.ProblemMapper;
import com.megamaker.admin.repository.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

    public void save(RequestProblem requestProblem) {
        // 해당 문제 검색
        Problem problem = ProblemMapper.INSTANCE.toProblem(requestProblem);

        // 테스트케이스와 문제 간 엔티티 관계 설정
        List<Testcase> testcaseList = requestProblem.getTestcaseList().stream()
                .map(t -> {
                    Testcase testcase = ProblemMapper.INSTANCE.toTestcase(t);
                    testcase.setProblem(problem);
                    return testcase;
                })
                .toList();
        problem.setTestcaseList(testcaseList);
        problemRepository.save(problem);
    }
}