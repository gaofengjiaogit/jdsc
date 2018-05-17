package org.jdsp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.jdsp.pojo.Users;
import org.jdsp.service.UsersService;
import org.jdsp.until.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("Users")
public class UsersController {

	@Resource
	private UsersService usersService;
	
	/**
	 * 根据用户id查询用户信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getUserById.do")
	public ResponseVo getUserById(String user_id){
		ResponseVo responseVo=new ResponseVo();
		try {
			if(!StringUtils.isBlank(user_id)){
				List<Users> result=this.usersService.getUserById(user_id);
				responseVo.setDatas(result);
				responseVo.setCount(result.size());
				responseVo.setSuccess(true);
				return responseVo;
			}else{
				responseVo.setSuccess(false);
				responseVo.setErrorMessage("请传入正确的参数");
				return responseVo;
			}
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("执行过程中出错，请检查后台代码");
		}
		return responseVo;
	}
	
	/**
	 * 根据id修改微信授权
	 * @param requestData
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updataUserSetting.do")
	public ResponseVo updataUserSetting(String requestData){
		ResponseVo responseVo = new ResponseVo();
		if(StringUtils.isBlank(requestData)){
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("请求参数为空");
			return responseVo;
		}
		try {
			JSONObject response=JSONObject.fromObject(requestData);
			Users users = new Users();
			if(response.containsKey("user_id")){
				users.setUser_id(response.getString("user_id"));
			}
			if(response.containsKey("sfsq")){
				users.setSfsq(response.getString("sfsq"));
			}
			int i = this.usersService.updataUserSetting(users);
			responseVo.setDatas(i);
			responseVo.setSuccess(true);
			return responseVo;
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setSuccess(false);
			responseVo.setErrorMessage("执行过程中出错，请检查后台代码");
		}
		return responseVo;
	}
}


