package au.com.nab.icommerce.audit.domain.repository;

import au.com.nab.icommerce.audit.domain.model.AuditActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<AuditActivity, Long> {
}
