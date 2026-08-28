# SupportOS — Sequential Execution Roadmap

Status: **Build phase 1 ready; external launch is gated on real credentials, deployment and customer validation.**

## Phase 0 — Scope lock

**Objective:** Freeze the MVP so engineering does not expand scope.

**Deliverable:** One ICP hypothesis, one workflow, one pilot offer.

**Dependencies:** Product spec and launch plan.

**Effort:** 2–4 hours.

**Verification:** Founder can explain the product in one sentence and name the exact pilot outcome.

**Gate:** Do not proceed if the ICP or paid outcome is still vague.

## Phase 1 — Landing page conversion system

**Objective:** Turn the existing marketing page into a measurable lead-generation funnel.

**Deliverables:** Hero, proof/product preview, workflow, pricing, FAQ, pilot CTA, application form, thank-you state, analytics events.

**Tools:** Static hosting, domain, analytics, form endpoint/CRM, email notification.

**Effort:** 1–2 days.

**Verification:** Test submission creates one lead, one notification, one analytics conversion and one CRM record; no duplicate submissions.

## Phase 2 — Infrastructure deployment

**Objective:** Run a repeatable SupportOS/Chatwoot environment.

**Deliverables:** VPS, Docker deployment, HTTPS, SMTP, backups, health checks, pinned image version.

**Dependencies:** VPS credentials, domain/DNS access, SMTP credentials.

**Effort:** 1–2 days for a first environment.

**Verification:** Fresh install works from a clean server; HTTPS works; email sends; PostgreSQL backup restores successfully; Redis/PostgreSQL are not publicly exposed.

## Phase 3 — Branding and customer onboarding

**Objective:** Make the experience SupportOS-branded and repeatable.

**Deliverables:** Brand assets, domain, onboarding checklist, workspace configuration, support playbook.

**Dependencies:** Final logo/name decision and deployment from Phase 2.

**Effort:** 1–3 days.

**Verification:** A test business can be onboarded without ad-hoc manual instructions.

## Phase 4 — First-customer validation

**Objective:** Acquire and activate the first 3 pilots.

**Deliverables:** 20 qualified conversations, 5+ serious leads, 3 pilots.

**Tools:** LinkedIn, email, phone/WhatsApp where appropriate, CRM, demo environment.

**Effort:** 1–3 weeks.

**Verification:** Three businesses actively use the workflow and provide measurable before/after feedback.

## Phase 5 — Differentiation

**Objective:** Build only features repeatedly requested by paying/pilot customers.

**Priorities:** Follow-up automation, industry templates, routing, AI-assisted drafts, reporting, required integrations.

**Effort:** 2–6 weeks depending on validated requirements.

**Verification:** Each new feature is linked to a customer problem and usage is measurable.

## Phase 6 — Billing and retention

**Objective:** Convert pilots into recurring revenue.

**Deliverables:** Subscription plan, invoice/payment flow, cancellation process, renewal reminders, support policy.

**Dependencies:** Pricing validation and business/legal setup.

**Effort:** 2–5 days for a simple first version.

**Verification:** Test payment, renewal, failed payment and cancellation flows end-to-end.

## Phase 7 — Scale

**Objective:** Reduce manual operations and improve reliability.

**Deliverables:** Tenant provisioning, monitoring, automated backups, restore drills, deployment automation, support metrics.

**Gate:** Only start after product-market evidence exists.

**Effort:** 1–3 months of incremental engineering.

**Verification:** New customer provisioning is repeatable, monitored and recoverable without founder-only knowledge.

## Pre-launch checklist

### Product
- [ ] Core enquiry → assign → respond → follow-up → resolve flow works.
- [ ] No Enterprise-only dependency is required without a separate license.
- [ ] Real screenshots/demo match current functionality.

### Web
- [ ] Domain configured.
- [ ] HTTPS active.
- [ ] Mobile/desktop tested.
- [ ] Chrome/Edge/Firefox/Safari checked.
- [ ] Forms validated.
- [ ] 404 and error states handled.
- [ ] Lighthouse/performance checked.

### Analytics
- [ ] Page view event.
- [ ] CTA click.
- [ ] Form start.
- [ ] Form submit.
- [ ] Qualified lead.
- [ ] Demo booked.
- [ ] Pilot started.
- [ ] Paid conversion.

### Security
- [ ] No secrets in Git.
- [ ] Strong production secrets.
- [ ] PostgreSQL/Redis private.
- [ ] HTTPS enforced.
- [ ] Backups configured.
- [ ] Restore tested.
- [ ] Access permissions reviewed.

### Legal
- [ ] Privacy policy.
- [ ] Terms of service.
- [ ] Refund/cancellation terms.
- [ ] Applicable data-processing terms.
- [ ] Open-source notices.
- [ ] Trademark/branding review.

### Contingency
- [ ] Rollback version documented.
- [ ] Backup restore procedure tested.
- [ ] Incident contact identified.
- [ ] DNS rollback documented.
- [ ] Launch can be paused without losing leads.

## Launch procedure

### T-24 hours
Freeze code, take backup, test forms, verify DNS/SSL, verify analytics and CRM, and prepare outreach list.

### T-2 hours
Run final smoke test on desktop and mobile. Confirm lead notifications and demo booking. Confirm monitoring.

### T+0
Publish landing page. Send the first small batch of targeted outreach. Do not launch large paid campaigns yet.

### T+2 hours
Check availability, errors, form submissions and traffic sources.

### T+24 hours
Review conversion funnel and every qualified response. Fix blocking issues immediately; do not change multiple major variables at once.

### T+72 hours
Review message/CTA performance and sales objections. Decide whether the ICP hypothesis is strengthening or weakening.

### Day 7
Review traffic, qualified leads, demos, pilots, objections, CAC if applicable, and product requests. Choose the next three highest-impact changes.

## Launch communication

**Internal:** Post a launch status with URL, current build/version, known limitations, owner for incidents and rollback procedure.

**Prospects:** Explain the problem, pilot outcome, who the product is for, and the limited pilot offer. Avoid inflated claims.

**Partners:** Give partners a short demo, ideal-customer definition and referral process.

## Monitoring

For the first 72 hours monitor:

- uptime
- HTTP errors
- form failures
- email delivery
- CPU/RAM/disk
- database health
- lead volume
- CTA conversion
- qualified-lead rate

Escalate technical failures immediately. Treat low conversion as a product/positioning experiment, not a server incident.

## Clarifications required before production launch

1. Final product/company name and domain.
2. Real contact email and phone/WhatsApp for the CTA.
3. Hosting/VPS account and DNS access.
4. SMTP/email provider credentials.
5. Final legal entity/billing details for Terms, Privacy and invoices.
6. First target vertical after the discovery interviews.

Do not put passwords, API keys or private tokens into GitHub.
