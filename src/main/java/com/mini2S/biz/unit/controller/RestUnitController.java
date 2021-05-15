package com.mini2S.biz.unit.controller;

import com.mini2S.biz.unit.model.entity.Unit;
import com.mini2S.configuration.reposotory.UnitRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"4. Unit"})
@RequestMapping("/v1")
@RestController
@AllArgsConstructor
public class RestUnitController {

    private final UnitRepository unitRepository;

    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "X-AUTH-TOKEN",
                    value = "로그인 성공 후 AccessToken",
                    required = true,
                    dataType = "String",
                    paramType = "header"
            )
    })
    @GetMapping("/unit/list")
    @ApiOperation(value = "지점에 해당하는 유닛 리스트 전달")
    public List<Unit> unitList(String branchSeq){
        return unitRepository.findByBranchSeq(branchSeq);
    }
}
