package ai.leadrelay.lead;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "leads", indexes = {
        @Index(name = "idx_leads_tenant_status", columnList = "tenant_id,status"),
        @Index(name = "idx_leads_next_action", columnList = "next_action_at")
})
public class Lead {
    @Id
    private UUID id;
    @Column(name = "tenant_id", nullable = false)
    private UUID tenantId;
    @Column(nullable = false)
    private String name;
    private String phone;
    private String email;
    private String source;
    @Column(nullable = false)
    private String status = "NEW";
    @Column(name = "intent_score", nullable = false)
    private int intentScore = 0;
    @Column(name = "next_action_at")
    private Instant nextActionAt;
    @Column(name = "last_contacted_at")
    private Instant lastContactedAt;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @PrePersist
    void onCreate() {
        if (id == null) id = UUID.randomUUID();
        createdAt = Instant.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    void onUpdate() { updatedAt = Instant.now(); }

    public UUID getId() { return id; }
    public UUID getTenantId() { return tenantId; }
    public void setTenantId(UUID tenantId) { this.tenantId = tenantId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getIntentScore() { return intentScore; }
    public void setIntentScore(int intentScore) { this.intentScore = Math.max(0, Math.min(100, intentScore)); }
    public Instant getNextActionAt() { return nextActionAt; }
    public void setNextActionAt(Instant nextActionAt) { this.nextActionAt = nextActionAt; }
    public Instant getLastContactedAt() { return lastContactedAt; }
    public void setLastContactedAt(Instant lastContactedAt) { this.lastContactedAt = lastContactedAt; }
}
