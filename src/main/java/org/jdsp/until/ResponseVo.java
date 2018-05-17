package org.jdsp.until;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseVo implements Serializable {
    private static final long serialVersionUID = -8651722244581232799L;
    //下述属性的使用者为，接口的调用者
    private boolean	success = false;	//true表示成功；false表示不成功，注意不成功不代表程序有问题，如
    private String	errorCode;		//异常编码
    private String	errorMessage; 	//异常信息
    private	Object	datas		;	//用户数据
    private Integer count;
    //下述属性的使用者为，框架级别，接口调用者无需处理
    private Map<String, String> logMessageMap = new LinkedHashMap<String, String>();  //保存日志的Map

    //***************************** 功能方法 ***************************//

    /**
     * 将本对象转化为json字符串输出<br>
     * 包含的属性有：success、errorCode、errorMessage
     * @return
     */
    public String toJsonStr(){
        return toJsonObj().toString();
    }

    /**
     * 将本对象转化为net.sf.json.JSONObject对象输出<br>
     * 包含的属性有：success、errorCode、errorMessage
     * @return
     */
    public JSONObject toJsonObj(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("success", 		success);
        jsonObj.put("errorCode", 	errorCode);
        jsonObj.put("errorMessage", errorMessage);
        return jsonObj;
    }

    //************************* getters、setters ****************************//

    /**
     * 保存日志的信息的Map
     * @param logMessageMap
     */
    public Map<String, String> getLogMessageMap() {
        return logMessageMap;
    }


    /**
     * true表示成功；false表示不成功，<br>
     * 注意:<br>
     * 		false不成功不代表程序有问题，如添加一个已经存在的商品，由于商品已经存在无需再次添加，因此程序直接返回。<br>
     * 		其参数success为true，参数errorCord为“not error”，参数errorMessage为“商品已经存在”
     * @return
     */
    public boolean isSuccess() {
        return success;
    }
    /**
     * true表示成功；false表示不成功，<br>
     * 注意:<br>
     * 		false不成功不代表程序有问题，如添加一个已经存在的商品，由于商品已经存在无需再次添加，因此程序直接返回。<br>
     * 		其参数success为true，参数errorCord为“not error”，参数errorMessage为“商品已经存在”
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
    /**
     * 设定sucess为false<br>
     * 并抛出一个运行时异常<br>
     * 本方法用于触发spring的声明式事务的回顾
     */
    public void setSuccessFalse() {
        this.success = false;
        throw new RuntimeException();
    }

    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 注意：新加入的移除信息不会覆盖之前的移除信息
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 注意：新加入的移除信息不会覆盖之前的移除信息
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;

    }

    /**
     * 注意:
     * 		非String的引用类型要重写其toString()方法
     * @return
     */
    public Object getDatas() {
        return datas;
    }


    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

//	/**
//	 * 异常等级:<br>
//	 * 		0这是一个bug
//	 * 		1参数校验等，责任在于调用者<br>
//	 * 		2在接口内部出现的异常，责任在于接口的实现者<br>
//	 * 		3在下一个接口抛出的异常，这个异常是由当前接口的责任引起的，<br>
//	 * 		4在下一个接口抛出的严重异常，这个异常是由下一个接口的责任引起的，如系统崩溃等
//	 *
//	 * @return
//	 */
//	private int errorGrade;
//
//	/**
//	 * 异常等级:<br>
//	 * 		0这是一个bug
//	 * 		1参数校验等，责任在于调用者<br>
//	 * 		2在接口内部出现的异常，责任在于接口的实现者<br>
//	 * 		3在下一个接口抛出的异常，这个异常是由当前接口的责任引起的，<br>
//	 * 		4在下一个接口抛出的严重异常，这个异常是由下一个接口的责任引起的，如系统崩溃等
//	 *
//	 * @return
//	 */
//	public int getErrorGrade() {
//		return errorGrade;
//	}
//
//	/**
//	 * 异常等级:<br>
//	 * 		1参数校验没有通过，参数值在数据库表中没有对应的值，或其它，责任在于调用者<br>
//	 * 		2在接口内部出现的异常，责任在于接口的实现者<br>
//	 * 		3在下一个接口抛出的异常，这个异常是由当前接口的责任引起的，<br>
//	 * 		4在下一个接口抛出的严重异常，这个异常是由下一个接口的责任引起的，如系统崩溃等
//	 * @param errorGrade
//	 */
//	public void setErrorGrade(int errorGrade) {
//		this.errorGrade = errorGrade;
//	}
//
//
//
////	private List<String> 	errorMessageList = new ArrayList<String>();
////
////
//	/**
//	 * 返回多条异常信息，这些异常信息属于同一级别的。<br>
//	 * 本方法用于一次响应多条异常信息，避免客户端多次提交，从而提高性能，提高用户体验
//	 * @return
//	 */
////	public List<String> getErrorMessageList() {
////		return errorMessageList;
////	}
////
//
//	/**
//	 * 其他信息Map
//	 * @return
//	 */
////	public Map<String, String> getOtherMap() {
////		return otherMap;
////	}


}
