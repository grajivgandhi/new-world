package ai.leadrelay.lead;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface LeadRepository extends JpaRepository<Lead, UUID> {
    List<Lead> findByTenantIdOrderByCreatedAtDesc(UUID tenantId);
    List<Lead> findByTenantIdAndNextActionAtLessThanEqualOrderByNextActionAtAsc(UUID tenantId, Instant now);
}
