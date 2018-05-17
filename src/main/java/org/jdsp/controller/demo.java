package org.jdsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.jdsp.pojo.Users;
import org.jdsp.until.Creat32UUID;
import org.jdsp.until.ResponseVo;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("demo")
public class demo extends Creat32UUID {

	/**
	 * responseVo用法解析
	 * @param requestData
	 * @return
	 * 请求测试：http://localhost:8080/jdsp/demo/ResponseVo.do?requestData={"a":"123","b":"456"}
	 */
	@ResponseBody
	@RequestMapping("ResponseVo.do")
	public ResponseVo getss(String requestData){
		ResponseVo responseVo=new ResponseVo();
		//判断参数是否为空
		if(StringUtils.isBlank(requestData)){
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("请求参数为空");
			return responseVo;
		}
		try {
			//参数格式转换成对象格式
			JSONObject requestDataJson=JSONObject.fromObject(requestData);
			//判断JSONObject对象中是否有某个字段
			if (requestDataJson.containsKey("a")) {
				System.err.println(requestDataJson.get("a"));
			}
			/*
			 * 数据合成
			 */
			Map<String, Object> map=new HashedMap();
			List<String> list=new ArrayList<>();
			list.add("qwqw");
			list.add("qwqwdd");
			list.add("qwqwdddd");
			list.add("qwqwfff");
			map.put("aaa", 1232);
			map.put("bbb", list);
			map.put("aaad", 12333);
			map.put("aaaff", 123444);
			/*
			 * 数据返回
			 */
			responseVo.setDatas(map);	//返回参数主体
			responseVo.setSuccess(true);	//是否请求成功
			responseVo.setCount(list.size()); //数据长度
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("请求失败");	//请求失败原因
		}
		return responseVo;
	}
	/**
	 * 32UUID用法解析
	 * 请求测试：http://localhost:8080/jdsp/demo/uuid.do
	 */
	@ResponseBody
	@RequestMapping("uuid.do")
	public String uuid(){
		String uuid=this.get32UUID();
		return uuid;
	}
	
}
