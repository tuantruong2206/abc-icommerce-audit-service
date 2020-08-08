package au.com.nab.icommerce.audit.proxy.event.sink;

import au.com.nab.icommerce.audit.domain.repository.AuditRepository;
import au.com.nab.icommerce.audit.mapper.AuditActivityMapper;
import au.com.nab.icommerce.base.dto.RequestHeaderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class AuditActivityListener {

    private final Logger log = LoggerFactory.getLogger(AuditActivityListener.class);

    private final AuditRepository auditRepository;
    private final AuditActivityMapper auditActivityMapper;

    public AuditActivityListener(AuditRepository auditRepository, AuditActivityMapper auditActivityMapper) {
        this.auditRepository = auditRepository;
        this.auditActivityMapper = auditActivityMapper;
    }

    @StreamListener(AuditActivitySink.AUDIT_INPUT)
    public void handleMessage(@Payload RequestHeaderDTO requestHeaderDTO) {
        log.info("Received audit Message: {}", requestHeaderDTO);
        this.auditRepository.save(this.auditActivityMapper.toEntity(requestHeaderDTO));
    }
}
