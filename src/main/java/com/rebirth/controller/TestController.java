package com.rebirth.controller;

import com.rebirth.base.BaseResponseResult;
import com.rebirth.controller.vo.TMercBaseInfoReqVo;
import com.rebirth.service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    InsertService insertService;

    //批量制造数据
    @PostMapping("/million")
    public BaseResponseResult buildTenMIllion(WebRequest request, @RequestBody @Valid TMercBaseInfoReqVo reqVo){
        BaseResponseResult<Object> result = new BaseResponseResult<>();
        try{

            insertService.insertMillion(reqVo);
            result.setReturnCode(200);
            result.setReturnMsg("成功");
        }catch(Exception e){

            result.setReturnCode(302);
            result.setReturnMsg("插入操作失败");
        }

        return  result;
    }
}
