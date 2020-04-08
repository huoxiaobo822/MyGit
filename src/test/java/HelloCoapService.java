import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hanxiaowen on 2020/4/7.
 */


import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;


public class HelloCoapService {


    public static void main(String[] args) {
        CoapServer server = new CoapServer();//主机为localhost 端口为默认端口5683
        server.add(new CoapResource("hello"){//创建一个资源为hello 请求格式为 主机：端口\hello

            @Override
            public void handleGET(CoapExchange exchange) { //重写处理GET请求的方法
                exchange.respond(ResponseCode.CONTENT, "Hello CoAP!");
            }

        });
        server.add(new CoapResource("time"){ //创建一个资源为time 请求格式为 主机：端口\time

            @Override
            public void handleGET(CoapExchange exchange) {
                Date date = new Date();
                exchange.respond(ResponseCode.CONTENT,
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
            }

        });
        server.start();
    }
}


