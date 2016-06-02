package jammazwan.x;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;


public class XRoutes extends RouteBuilder {

    @Autowired
    private XBean xBean;
    @Autowired
    private XProcessor xProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:x")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String text = exchange.getIn().getBody(String.class);
                    String newAnswer = xBean.answer(text);
                    exchange.getOut().setBody(newAnswer);
                }
            });
    }
}
