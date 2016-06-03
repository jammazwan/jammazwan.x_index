package jammazwan.x;

import org.apache.camel.impl.DefaultCamelContext;

public class GenerateXLinksMain {

	public static void main(String[] args) throws Exception {
		GenerateXLinksMain generateXLinksMain = new GenerateXLinksMain();
		generateXLinksMain.go();
	}


	private void go() throws Exception {
		DefaultCamelContext context = new DefaultCamelContext();
		context.addRoutes(new XRoutes());
		context.start();
		Thread.sleep(3000);
		context.stop();
	}

}
