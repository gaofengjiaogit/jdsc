package org.jdsp.until;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseVo implements Serializable {
    private static final long serialVersionUID = -8651722244581232799L;
    //�������Ե�ʹ����Ϊ���ӿڵĵ�����
    private boolean	success = false;	//true��ʾ�ɹ���false��ʾ���ɹ���ע�ⲻ�ɹ���������������⣬��
    private String	errorCode;		//�쳣����
    private String	errorMessage; 	//�쳣��Ϣ
    private	Object	datas		;	//�û�����
    private Integer count;
    //�������Ե�ʹ����Ϊ����ܼ��𣬽ӿڵ��������账��
    private Map<String, String> logMessageMap = new LinkedHashMap<String, String>();  //������־��Map

    //***************************** ���ܷ��� ***************************//

    /**
     * ��������ת��Ϊjson�ַ������<br>
     * �����������У�success��errorCode��errorMessage
     * @return
     */
    public String toJsonStr(){
        return toJsonObj().toString();
    }

    /**
     * ��������ת��Ϊnet.sf.json.JSONObject�������<br>
     * �����������У�success��errorCode��errorMessage
     * @return
     */
    public JSONObject toJsonObj(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("success", 		success);
        jsonObj.put("errorCode", 	errorCode);
        jsonObj.put("errorMessage", errorMessage);
        return jsonObj;
    }

    //************************* getters��setters ****************************//

    /**
     * ������־����Ϣ��Map
     * @param logMessageMap
     */
    public Map<String, String> getLogMessageMap() {
        return logMessageMap;
    }


    /**
     * true��ʾ�ɹ���false��ʾ���ɹ���<br>
     * ע��:<br>
     * 		false���ɹ���������������⣬�����һ���Ѿ����ڵ���Ʒ��������Ʒ�Ѿ����������ٴ���ӣ���˳���ֱ�ӷ��ء�<br>
     * 		�����successΪtrue������errorCordΪ��not error��������errorMessageΪ����Ʒ�Ѿ����ڡ�
     * @return
     */
    public boolean isSuccess() {
        return success;
    }
    /**
     * true��ʾ�ɹ���false��ʾ���ɹ���<br>
     * ע��:<br>
     * 		false���ɹ���������������⣬�����һ���Ѿ����ڵ���Ʒ��������Ʒ�Ѿ����������ٴ���ӣ���˳���ֱ�ӷ��ء�<br>
     * 		�����successΪtrue������errorCordΪ��not error��������errorMessageΪ����Ʒ�Ѿ����ڡ�
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
    /**
     * �趨sucessΪfalse<br>
     * ���׳�һ������ʱ�쳣<br>
     * ���������ڴ���spring������ʽ����Ļع�
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
     * ע�⣺�¼�����Ƴ���Ϣ���Ḳ��֮ǰ���Ƴ���Ϣ
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * ע�⣺�¼�����Ƴ���Ϣ���Ḳ��֮ǰ���Ƴ���Ϣ
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;

    }

    /**
     * ע��:
     * 		��String����������Ҫ��д��toString()����
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
//	 * �쳣�ȼ�:<br>
//	 * 		0����һ��bug
//	 * 		1����У��ȣ��������ڵ�����<br>
//	 * 		2�ڽӿ��ڲ����ֵ��쳣���������ڽӿڵ�ʵ����<br>
//	 * 		3����һ���ӿ��׳����쳣������쳣���ɵ�ǰ�ӿڵ���������ģ�<br>
//	 * 		4����һ���ӿ��׳��������쳣������쳣������һ���ӿڵ���������ģ���ϵͳ������
//	 *
//	 * @return
//	 */
//	private int errorGrade;
//
//	/**
//	 * �쳣�ȼ�:<br>
//	 * 		0����һ��bug
//	 * 		1����У��ȣ��������ڵ�����<br>
//	 * 		2�ڽӿ��ڲ����ֵ��쳣���������ڽӿڵ�ʵ����<br>
//	 * 		3����һ���ӿ��׳����쳣������쳣���ɵ�ǰ�ӿڵ���������ģ�<br>
//	 * 		4����һ���ӿ��׳��������쳣������쳣������һ���ӿڵ���������ģ���ϵͳ������
//	 *
//	 * @return
//	 */
//	public int getErrorGrade() {
//		return errorGrade;
//	}
//
//	/**
//	 * �쳣�ȼ�:<br>
//	 * 		1����У��û��ͨ��������ֵ�����ݿ����û�ж�Ӧ��ֵ�����������������ڵ�����<br>
//	 * 		2�ڽӿ��ڲ����ֵ��쳣���������ڽӿڵ�ʵ����<br>
//	 * 		3����һ���ӿ��׳����쳣������쳣���ɵ�ǰ�ӿڵ���������ģ�<br>
//	 * 		4����һ���ӿ��׳��������쳣������쳣������һ���ӿڵ���������ģ���ϵͳ������
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
//	 * ���ض����쳣��Ϣ����Щ�쳣��Ϣ����ͬһ����ġ�<br>
//	 * ����������һ����Ӧ�����쳣��Ϣ������ͻ��˶���ύ���Ӷ�������ܣ�����û�����
//	 * @return
//	 */
////	public List<String> getErrorMessageList() {
////		return errorMessageList;
////	}
////
//
//	/**
//	 * ������ϢMap
//	 * @return
//	 */
////	public Map<String, String> getOtherMap() {
////		return otherMap;
////	}


}
