package chargeapi_pkg;

public class App {

	public static void main(String[] args) throws Exception {
		ChargeapiLocator locator = new ChargeapiLocator();
//		ChargeapiPort chargeapiPort = locator.getchargeapiPort();
		ChargeapiPort getchargeapiPort = locator.getchargeapiPort();
		String ss = getchargeapiPort.chargeStatus("ieifuebig", "nfkjgfn", "地方北京饭店宫保鸡丁饭g");
		System.out.println(ss);
	}
}
