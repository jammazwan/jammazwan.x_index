package jammazwan.x;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class XRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:../jammazwan.maker/src/main/resources?noop=true&fileName=xlinks.txt").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String text = exchange.getIn().getBody(String.class);
				exchange.getIn().setHeader("CamelFileName", "README.md");
				exchange.getIn().setHeader("xlinks", text);
			}
		}).to("velocity://velocity/README.md.vm").to("file:.");
	}
}
