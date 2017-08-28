package cn.com.WebXml;

import java.net.URL;

import org.apache.axis.client.Service;
import org.junit.Test;

public class TestWs {

	@Test
	public void run1() throws Exception{
		MobileCodeWSLocator codeWSLocator = new MobileCodeWSLocator();
		MobileCodeWSSoap mobileCodeWSSoap = codeWSLocator.getMobileCodeWSSoap();
		String tele = mobileCodeWSSoap.getMobileCodeInfo("13", null);
		System.out.println(tele);
	}
	
}
