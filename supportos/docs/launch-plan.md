# SupportOS Launch Plan

## Positioning

Initial niche: local service businesses that receive enquiries through website, email and messaging channels and need faster follow-up.

Recommended first verticals to test:

1. Clinics and appointment-based services
2. Education/coaching businesses
3. Real-estate agencies
4. Home/service businesses

Do not target all four simultaneously. Interview 5 businesses in each and select the niche with the clearest repeated pain and willingness to pay.

## Offer

**SupportOS Starter**

- branded support inbox
- website chat
- email channel
- lead tags
- assignment rules
- canned responses
- basic reports
- managed hosting
- backups and updates

Pilot price: ₹999–₹2,499/month plus optional setup. Pricing is a validation hypothesis, not a market guarantee.

## Technical architecture

Customer browser
→ SupportOS branded web layer
→ Chatwoot Community Edition instance/API
→ PostgreSQL + Redis
→ Nginx/HTTPS
→ optional object storage
→ monitoring/backups

For production, use a VPS with at least the upstream documented minimum and preferably the recommended resources. Keep tenant isolation and secrets management in the SupportOS layer.

## Build order

### Phase 1 — Validation
- 20 prospect interviews
- one niche
- one workflow
- three pilot customers

### Phase 2 — Deployment
- self-host Chatwoot
- configure domain and SSL
- configure SMTP
- create SupportOS theme/config layer
- create customer onboarding checklist

### Phase 3 — Differentiation
- industry-specific templates
- lead scoring/routing
- AI reply assistant
- business dashboard
- billing

### Phase 4 — Scale
- automated tenant provisioning
- observability
- backups and restore testing
- subscription lifecycle
- support playbooks

## Legal/commercial checklist

Before paid distribution:

- pin the exact Chatwoot version used
- preserve MIT notices required by the applicable code
- inspect all dependency licenses
- keep Enterprise-only Chatwoot components out unless separately licensed
- review Chatwoot trademark/branding rules
- use a new product name/logo/domain
- publish your own terms, privacy policy and data-processing terms as applicable
- do not imply endorsement by Chatwoot

This is a product-development checklist, not legal advice.

## Success metric

Do not measure success by GitHub stars or features shipped. The first milestone is:

**3 paying customers who continue after the pilot.**
