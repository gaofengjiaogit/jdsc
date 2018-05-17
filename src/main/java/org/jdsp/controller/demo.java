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
	 * responseVo�÷�����
	 * @param requestData
	 * @return
	 * ������ԣ�http://localhost:8080/jdsp/demo/ResponseVo.do?requestData={"a":"123","b":"456"}
	 */
	@ResponseBody
	@RequestMapping("ResponseVo.do")
	public ResponseVo getss(String requestData){
		ResponseVo responseVo=new ResponseVo();
		//�жϲ����Ƿ�Ϊ��
		if(StringUtils.isBlank(requestData)){
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("�������Ϊ��");
			return responseVo;
		}
		try {
			//������ʽת���ɶ����ʽ
			JSONObject requestDataJson=JSONObject.fromObject(requestData);
			//�ж�JSONObject�������Ƿ���ĳ���ֶ�
			if (requestDataJson.containsKey("a")) {
				System.err.println(requestDataJson.get("a"));
			}
			/*
			 * ���ݺϳ�
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
			 * ���ݷ���
			 */
			responseVo.setDatas(map);	//���ز�������
			responseVo.setSuccess(true);	//�Ƿ�����ɹ�
			responseVo.setCount(list.size()); //���ݳ���
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("����ʧ��");	//����ʧ��ԭ��
		}
		return responseVo;
	}
	/**
	 * 32UUID�÷�����
	 * ������ԣ�http://localhost:8080/jdsp/demo/uuid.do
	 */
	@ResponseBody
	@RequestMapping("uuid.do")
	public String uuid(){
		String uuid=this.get32UUID();
		return uuid;
	}
	
}
