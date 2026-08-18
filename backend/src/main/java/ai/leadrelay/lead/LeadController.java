package ai.leadrelay.lead;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {
    private final LeadRepository repository;

    public LeadController(LeadRepository repository) { this.repository = repository; }

    @GetMapping
    public List<Lead> list(@RequestHeader("X-Tenant-Id") UUID tenantId) {
        return repository.findByTenantIdOrderByCreatedAtDesc(tenantId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Lead create(@RequestHeader("X-Tenant-Id") UUID tenantId,
                       @Valid @RequestBody CreateLeadRequest request) {
        Lead lead = new Lead();
        lead.setTenantId(tenantId);
        lead.setName(request.name());
        lead.setPhone(request.phone());
        lead.setEmail(request.email());
        lead.setSource(request.source());
        lead.setStatus("NEW");
        return repository.save(lead);
    }

    public record CreateLeadRequest(
            @NotBlank String name,
            String phone,
            @Email String email,
            String source) {}
}
