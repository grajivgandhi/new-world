package ai.leadrelay.lead;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/follow-ups")
public class FollowUpController {
    private final LeadFollowUpService service;

    public FollowUpController(LeadFollowUpService service) { this.service = service; }

    @GetMapping("/due")
    public List<Lead> due(@RequestHeader("X-Tenant-Id") UUID tenantId) {
        return service.due(tenantId);
    }
}
