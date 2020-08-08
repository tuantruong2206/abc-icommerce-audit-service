package au.com.nab.icommerce.audit.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "audit_activity")
public class AuditActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "userid")
    private String userid;

    @NotNull
    @NotEmpty
    @Column(name = "http_method")
    private String httpMethod;

    @NotNull
    @NotEmpty
    @Column(name = "http_url")
    private String httpUrl;

    @NotNull
    @NotEmpty
    private String httpBody;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @CreationTimestamp
    @Column(name = "updated_at", insertable = false)
    private Instant updatedAt;

    @PreUpdate
    public void onPreUpdate() {
        setUpdatedAt(Instant.now());
    }
}
