# SupportOS — Product Specification v0.1

## Goal

Turn inbound customer enquiries into owned, trackable and resolved conversations for small businesses.

## Ideal first customer

A business receiving repeated enquiries through a website or email where missed follow-ups have a visible commercial cost.

## MVP user roles

### Owner
- sees all conversations
- sees business metrics
- manages routing rules
- manages team members

### Agent
- handles assigned conversations
- uses saved replies
- adds notes/tags
- marks conversations resolved

## MVP workflow

```text
New enquiry
  -> identify customer
  -> assign owner
  -> classify intent
  -> respond
  -> create follow-up when needed
  -> resolve
  -> report outcome
```

## MVP features

1. Workspace and brand configuration
2. Website chat inbox
3. Email inbox
4. Conversation assignment
5. Labels/tags
6. Saved replies
7. Customer profile
8. Basic response-time and unresolved-conversation reporting
9. Admin onboarding checklist
10. Backup/restore procedure

## Differentiation layer

Do not fork core functionality unnecessarily. Build the commercial value around:

- niche-specific workflows
- onboarding
- automation recipes
- integrations
- reporting language that business owners understand
- AI assistance with human approval
- managed hosting
- support and reliability

## Non-goals for the first release

- building a new chat engine
- building a new CRM from scratch
- custom mobile apps
- dozens of integrations
- complex billing before pilot validation
- multi-region infrastructure

## Acceptance criteria for the first paid pilot

A pilot is successful when an owner can:

1. connect the support channel;
2. receive an enquiry;
3. assign it to an agent;
4. respond;
5. create a follow-up;
6. resolve the conversation; and
7. understand the weekly support workload from a report.

## North-star validation metric

**Three customers paying after the pilot period.**

Feature count is not a success metric.
