package com.rebirth.service;

import com.rebirth.base.BaseResponseResult;
import com.rebirth.controller.vo.TMercBaseInfoReqVo;
import com.rebirth.mapper.TMercBaseInfoMapper;
import com.rebirth.pojo.TMercBaseInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class InsertService {

    @Resource
    TMercBaseInfoMapper tMercBaseInfoMapper;

    public BaseResponseResult insertMillion(TMercBaseInfoReqVo reqVo){
        BaseResponseResult<Object> responseResult = new BaseResponseResult<>();
        TMercBaseInfo tMercBaseInfo = new TMercBaseInfo();
        try{
            //开始时间
            long startTime = new Date().getTime();
            //外层循环
            for(int i = 1;i <= 200;i++){
                //第j次提交
                for(int j = 1; j <= 10000; j++){
                    //设置参数

                    //设置商户号
                    tMercBaseInfo.setMercId(8000110010000000L+i*j+"");
                    //设置商户中文名称
                    tMercBaseInfo.setMercChaName("凯波的第"+i*j+"家分店");
                    //设置商户中文简称
                    tMercBaseInfo.setMercChaNameShort("第"+i*j+"家分店");
                    //设置商户主题形式
                    tMercBaseInfo.setMercForm("9");
                    //商户行业类型
                    tMercBaseInfo.setMercMcc("4600");
                    //商户经营范围描述
                    tMercBaseInfo.setMercBusRange("只是为了测试");
                    //商户所属省份
                    tMercBaseInfo.setMercProv("广东");
                    //商户所属市
                    tMercBaseInfo.setMercCity("广州市");
                    //商户所属区
                    tMercBaseInfo.setMercDistrict("天河区");
                    //商户经营详细地址
                    tMercBaseInfo.setMercBusAddr("羊城国贸大厦");
                    //注册手机号码
                    tMercBaseInfo.setMercRegistPhone("13978912584");
                    //结算类型
                    tMercBaseInfo.setSettType("1");
                    //商户状态
                    tMercBaseInfo.setMercStatus("1");
                    //认证状态
                    tMercBaseInfo.setMercAuthStatus("4");
                    //上级代理商编号
                    tMercBaseInfo.setParentProxyMercId("10010");
                    //所属渠道商编号
                    tMercBaseInfo.setParentChannelMerId("4600");
                    //商户路径
                    tMercBaseInfo.setMercPath("所属凯波商户");
                    //直连进件标志
                    tMercBaseInfo.setDirectConnFlag("12");
                    //联系人
                    tMercBaseInfo.setMercLinkManName("谢凯波");
                    //联系电话
                    tMercBaseInfo.setMercLinkManPhone("18645824587");
                    //法人代表
                    tMercBaseInfo.setCorpRepr("谢凯波");
                    //法人电话
                    tMercBaseInfo.setCorpReprPhone("15784512458");
                    //法人证件类型
                    tMercBaseInfo.setCorpReprIdType("3");
                    //法人证件号码
                    tMercBaseInfo.setCorpReprIdNo("450521199410264097");
                    //是否支持信用卡
                    tMercBaseInfo.setIsSupportCreCard("1");
                    //扣费方式
                    tMercBaseInfo.setChargeBackMode("5");
                    //创建时间
                    tMercBaseInfo.setCreateTime("2019-12-09 23:58:23");
                    //商户来源
                    tMercBaseInfo.setMercSource("1");

                    //调用DAO层
                    int insert = tMercBaseInfoMapper.insert(tMercBaseInfo);

                }
            }
            Long endTime = new Date().getTime();
            // 耗时
            System.out.println("200万条数据插入花费时间 : " + (endTime - startTime) / 1000 + " s");
            System.out.println("插入完成");

            responseResult.setReturnCode(200);
            responseResult.setReturnMsg("插入成功");
        }catch(Exception e){
            responseResult.setReturnCode(302);
            responseResult.setReturnMsg("插入失败");
        }
        return responseResult;
    }
}
