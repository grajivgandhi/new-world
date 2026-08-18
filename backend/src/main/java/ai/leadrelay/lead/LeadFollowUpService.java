package ai.leadrelay.lead;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class LeadFollowUpService {
    private final LeadRepository repository;

    public LeadFollowUpService(LeadRepository repository) { this.repository = repository; }

    @Transactional(readOnly = true)
    public List<Lead> due(UUID tenantId) {
        return repository.findByTenantIdAndNextActionAtLessThanEqualOrderByNextActionAtAsc(tenantId, Instant.now());
    }
}
