package cn.trt.srm.user.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TRTSRMYHClient {

	private String url;

	/**
	 * 添加
	 * @param stopFlag  判断用户的信息状态，1-新建、2-变更、3-删除、4-启用、5-停用
	 * @param userCode  用户 login
	 * @param userName	用户姓名
	 * @param email		邮箱
	 * @param mobileTel	电话
	 * @param idCard	身份证
	 * @param address	地址
	 * @param fax		传真
	 * @param mobile	移动电话
	 * @param passWord  用户密码
	 * @param remark1	备注
	 * @return
	 */
	public String createUser(String userCode, String userName,
			String email, String mobileTel, String idCard, String address,
			String fax, String mobile,String passWord, String remark1){
			System.out.println("create >>userCode:" + userCode
					+ "——userName:" + userName + "——email:" + email + "——mobileTel:" + mobileTel
					+ "——idCard:" + idCard + "——address:" + address	+ "——fax" + fax + "——mobile"+
					mobile+"——passWord:" +passWord+"——remark1:"+ remark1);
			String returnCode = "";
			StringBuffer soap = new StringBuffer();
			soap.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:user=\"http://www.harmony.com/srm/User\">");
			soap.append("<soapenv:Header/>");
			soap.append("<soapenv:Body>");
			soap.append("<user:saveOrUpdateUser>");
			soap.append("<!--Optional:-->");
			soap.append("<data>");
			soap.append("<![CDATA[<DATA> <LIST>  <ITEM> ");
			soap.append("<userCode>").append(userCode).append("</userCode>");
			soap.append("<userName>").append(userName).append("</userName>");
			soap.append("<email>").append(email).append("</email>");
			soap.append("<mobileTel>").append(mobileTel).append("</mobileTel>");
			soap.append("<idCard>").append(idCard).append("</idCard>");
			soap.append("<address>").append(address).append("</address>");
			soap.append("<fax>").append(fax).append("</fax>");
			soap.append("<mobile>").append(mobile).append("</mobile>");
			soap.append("<remark1>").append(remark1).append("</remark1>");
			soap.append("<userPassWord>").append(passWord).append("</userPassWord>");
			soap.append("<stopFlag>1</stopFlag>");
			soap.append("</ITEM> </LIST></DATA>]]>");
			soap.append("</data>");
			soap.append("</user:saveOrUpdateUser>");
			soap.append("</soapenv:Body>");
			soap.append("</soapenv:Envelope>");
		try
		{
			returnCode = Call(url, soap.toString(), "saveOrUpdateUser", "result");
		}
		catch (Exception e)
		{
		//	throw new RuntimeException("returnCode 未获取值", e);
			e.printStackTrace();
		}
		System.out.println("returnCode:"+returnCode);
		return returnCode;
		}
	
	/**
	 * 修改
	 * @param stopFlag  判断用户的信息状态，1-新建、2-变更、3-删除、4-启用、5-停用
	 * @param userCode  用户 login
	 * @param userName	用户姓名
	 * @param email		邮箱
	 * @param mobileTel	电话
	 * @param idCard	身份证
	 * @param address	地址
	 * @param fax		传真
	 * @param mobile	移动电话
	 * @param passWord  用户密码
	 * @param remark1	备注
	 * @return
	 */
	public String modifyUser(String userCode, String userName,
			String email, String mobileTel, String idCard, String address,
			String fax, String mobile,String passWord, String remark1){
			System.out.println("create >>userCode:" + userCode
					+ "——userName:" + userName + "——email:" + email + "——mobileTel:" + mobileTel
					+ "——idCard:" + idCard + "——address:" + address	+ "——fax" + fax + "——mobile"+
					mobile+"——passWord:" +passWord+"——remark1:"+ remark1);
			String returnCode = "";
			StringBuffer soap = new StringBuffer();
			soap.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:user=\"http://www.harmony.com/srm/User\">");
			soap.append("<soapenv:Header/>");
			soap.append("<soapenv:Body>");
			soap.append("<user:saveOrUpdateUser>");
			soap.append("<!--Optional:-->");
			soap.append("<data>");
			soap.append("<![CDATA[<DATA> <LIST>  <ITEM> ");
			soap.append("<userCode>").append(userCode).append("</userCode>");
			soap.append("<userName>").append(userName).append("</userName>");
			soap.append("<email>").append(email).append("</email>");
			soap.append("<mobileTel>").append(mobileTel).append("</mobileTel>");
			soap.append("<idCard>").append(idCard).append("</idCard>");
			soap.append("<address>").append(address).append("</address>");
			soap.append("<fax>").append(fax).append("</fax>");
			soap.append("<mobile>").append(mobile).append("</mobile>");
			soap.append("<remark1>").append(remark1).append("</remark1>");
			soap.append("<userPassWord>").append(passWord).append("</userPassWord>");
			soap.append("<stopFlag>2</stopFlag>");
			soap.append("</ITEM> </LIST></DATA>]]>");
			soap.append("</data>");
			soap.append("</user:saveOrUpdateUser>");
			soap.append("</soapenv:Body>");
			soap.append("</soapenv:Envelope>");
		try
		{
			returnCode = Call(url, soap.toString(), "saveOrUpdateUser", "result");
		}
		catch (Exception e)
		{
		//	throw new RuntimeException("returnCode 未获取值", e);
			e.printStackTrace();
		}
		System.out.println("returnCode:"+returnCode);
		return returnCode;
		
		}

	/**
	 * 禁用
	 * @param stopFlag  枚举标识符
	 * @param userCode  用户登录帐号
	 * @return
	 */
	public String disableUser(String userCode){
			System.out.println("create >>userCode:" + userCode);
			String returnCode = "";
			StringBuffer soap = new StringBuffer();
			soap.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:user=\"http://www.harmony.com/srm/User\">");
			soap.append("<soapenv:Header/>");
			soap.append("<soapenv:Body>");
			soap.append("<user:saveOrUpdateUser>");
			soap.append("<!--Optional:-->");
			soap.append("<data>");
			soap.append("<![CDATA[<DATA> <LIST>  <ITEM> ");
			soap.append("<userCode>").append(userCode).append("</userCode>");
			soap.append("<stopFlag>5</stopFlag>");
			soap.append("</ITEM> </LIST></DATA>]]>");
			soap.append("</data>");
			soap.append("</user:saveOrUpdateUser>");
			soap.append("</soapenv:Body>");
			soap.append("</soapenv:Envelope>");
		try
		{
			returnCode = Call(url, soap.toString(), "saveOrUpdateUser", "result");
		}
		catch (Exception e)
		{
		//	throw new RuntimeException("returnCode 未获取值", e);
			e.printStackTrace();
		}
		System.out.println("returnCode:"+returnCode);
		return returnCode;
		}

	/**
	 * 启用
	 * @param stopFlag  枚举标识符
	 * @param userCode  用户登录帐号
	 * @return
	 */
	public String enableUser(String userCode){
		System.out.println("create >>userCode:" + userCode);
		String returnCode = "";
		StringBuffer soap = new StringBuffer();
		soap.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:user=\"http://www.harmony.com/srm/User\">");
		soap.append("<soapenv:Header/>");
		soap.append("<soapenv:Body>");
		soap.append("<user:saveOrUpdateUser>");
		soap.append("<!--Optional:-->");
		soap.append("<data>");
		soap.append("<![CDATA[<DATA> <LIST>  <ITEM> ");
		soap.append("<userCode>").append(userCode).append("</userCode>");
		soap.append("<stopFlag>4</stopFlag>");
		soap.append("</ITEM> </LIST></DATA>]]>");
		soap.append("</data>");
		soap.append("</user:saveOrUpdateUser>");
		soap.append("</soapenv:Body>");
		soap.append("</soapenv:Envelope>");
	try
	{
		returnCode = Call(url, soap.toString(), "saveOrUpdateUser", "result");
	}
	catch (Exception e)
	{
	//	throw new RuntimeException("returnCode 未获取值", e);
		e.printStackTrace();
	}
		System.out.println("returnCode:"+returnCode);
	return returnCode;
	}
	
	public TRTSRMYHClient(String url) {

		this.url = url;
	}

	public TRTSRMYHClient() {
		 this.url ="http://10.8.155.10:7001/UserServiceBean/UserService?wsdl";
//		 this.url ="http://220.160.108.22/UserServiceBean/UserService?wsdl";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static void main(String args[]) throws Exception {
		TRTSRMYHClient wc = new TRTSRMYHClient();
		wc.createUser("123", "救世主55", "赵六22", "t1231245@qq.com", "13622128868", "", "", "", "", "");
		wc.disableUser("123");
		wc.enableUser("123");
		 wc.modifyUser( "123", "赵六3", "t123124t@qq.com", "13622128869", "", "", "", "", "", "");
	}
	
		
		public static String Call(String wsUrl, String soapRequest, String action, String reponse)
			throws Exception
		{
			System.out.println((new StringBuilder("soapRequest : ")).append(soapRequest).toString());
			String str = null;
			URI uri = new URI(wsUrl);
			URL url = uri.toURL();
			HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
			httpUrlConnection.setDoInput(true);
			httpUrlConnection.addRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpUrlConnection.addRequestProperty("SOAPAction", (new StringBuilder(String.valueOf(wsUrl))).append("/").append(action).toString());
			httpUrlConnection.setDoOutput(true);
			httpUrlConnection.setRequestMethod("POST");
		//	System.out.println(">状态：>"+httpUrlConnection.getResponseCode());
			OutputStream os = httpUrlConnection.getOutputStream();
			PrintWriter out = new PrintWriter(os);
			out.println(soapRequest);
			out.flush();
			os.close();
			out.close();
			StringBuilder sb = new StringBuilder();
			System.out.println((new StringBuilder("ResponseCode : ")).append(httpUrlConnection.getResponseCode()).toString());
			if (200 == httpUrlConnection.getResponseCode())//HTTP_OK
			{	System.out.println("进入该200方法：");
				InputStream is = httpUrlConnection.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
				for (String line = br.readLine(); line != null; line = br.readLine())
				{
					sb.append(line);
				}
				is.close();
			}
			System.out.println("避开200方法");
			httpUrlConnection.disconnect();
			String soapResponse = sb.toString();
			System.out.println((new StringBuilder("soapResponse : ")).append(soapResponse).toString());
			Pattern pattern = Pattern.compile((new StringBuilder("<")).append(reponse).append(">(.*?)</").append(reponse).append(">").toString());
			for (Matcher matcher = pattern.matcher(soapResponse); matcher.find();)
			{
				System.out.println("进入matcher方法");
				str = matcher.group(0);
			}
			str = str.substring(str.indexOf(":") + 2, str.lastIndexOf("："));
			System.out.println("str:"+str);
			return str;
		}
	
}
