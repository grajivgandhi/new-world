# LeadRelay AI

**Working name:** LeadRelay AI

An automated lead follow-up and recovery system for small businesses.

## Problem

Businesses lose sales because new enquiries are answered late, followed up inconsistently, or forgotten after the first conversation.

## MVP promise

> Capture every enquiry, qualify it, schedule follow-ups, and alert a human only when a lead needs attention.

## MVP workflow

```text
Lead enters
  -> Normalize lead
  -> Score intent
  -> Generate next action
  -> Schedule follow-up
  -> Send approved message
  -> Detect reply
  -> Re-score lead
  -> Book / hand off / continue follow-up
  -> Daily owner summary
```

## First target market

Start with **local service businesses** where one additional customer is valuable and enquiries commonly arrive through WhatsApp, forms, or phone calls.

Initial examples: clinics, coaching centres, real-estate agents, automobile/service businesses, and home-service companies.

## Product principles

1. Start with one workflow, not a giant CRM.
2. Human approval is available for outbound messaging until reliability is proven.
3. Every automated action is logged.
4. Failures create alerts instead of silently continuing.
5. Customer data is isolated by tenant.
6. Subscription billing is designed for recurring revenue.

## Planned stack

- Frontend: Next.js / React
- API: Spring Boot or FastAPI
- Database: PostgreSQL
- Jobs: scheduled workers / queue
- AI: LLM API with structured JSON outputs
- Messaging: official WhatsApp Business Platform integration after onboarding
- Payments: Razorpay Subscriptions
- Deployment: containerized cloud deployment
- Monitoring: application logs, uptime checks, error alerts

## MVP success criteria

The first version is successful when one real business can:

1. create an account,
2. add/import leads,
3. define a follow-up sequence,
4. review an AI-generated message,
5. run the sequence,
6. see lead status and activity,
7. receive an exception alert.

Automated WhatsApp sending and recurring billing are integration stages after the core workflow is validated.
