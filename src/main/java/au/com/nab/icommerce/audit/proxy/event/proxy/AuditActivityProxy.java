package au.com.nab.icommerce.audit.proxy.event.proxy;


import au.com.nab.icommerce.audit.proxy.event.sink.AuditActivitySink;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({AuditActivitySink.class})
public class AuditActivityProxy {
}
