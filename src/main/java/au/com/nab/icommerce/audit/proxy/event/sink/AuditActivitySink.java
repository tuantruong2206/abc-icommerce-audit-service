package au.com.nab.icommerce.audit.proxy.event.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AuditActivitySink {
    String AUDIT_INPUT = "audit-input";

    @Input(AUDIT_INPUT)
    SubscribableChannel auditActivityInput();
}
