# LeadRelay AI — MVP Specification

## 1. Core user

Owner or sales manager of a small business that receives recurring customer enquiries.

## 2. Core job

Prevent qualified leads from being forgotten.

## 3. MVP screens

### Dashboard

- New leads
- Leads needing attention
- Follow-ups due today
- Recovered leads
- Automation health

### Leads

Fields:

- name
- phone/email
- source
- enquiry text
- intent score
- stage
- next follow-up
- assigned owner
- last activity

### Lead detail

- conversation/activity timeline
- AI summary
- recommended next action
- generated message
- approve/send control
- pause automation

### Automation

- trigger
- delay
- condition
- action
- fallback

### Settings

- business profile
- working hours
- follow-up rules
- notification preferences
- integration status

## 4. Lead state machine

```text
NEW -> QUALIFYING -> FOLLOW_UP -> ENGAGED -> WON
                         |             |
                         v             v
                       LOST         NEEDS_HUMAN
```

Any state can be paused by the business owner.

## 5. Automation rules

Every job must be idempotent.

Every outbound action must have:

- tenant_id
- lead_id
- automation_id
- action_id
- timestamp
- status
- provider response/error

A failed job is retried with bounded exponential backoff and then moved to an exception queue.

## 6. AI contract

AI must return structured data, not free-form control commands.

Example:

```json
{
  "intent": "high",
  "stage": "qualified",
  "next_action": "follow_up",
  "delay_hours": 24,
  "reason": "Customer asked for pricing and availability",
  "message": "..."
}
```

The application validates the result before executing an action.

## 7. Safety and reliability

- Do not send messages without a configured business channel.
- Respect business working hours and opt-out status.
- Keep an immutable activity log.
- Never expose one tenant's leads to another tenant.
- Provide pause-all-automation control.
- Escalate ambiguous or sensitive requests to a human.

## 8. Monetization

Initial hypothesis:

- Starter: ₹999/month
- Growth: ₹2,999/month
- Pro: ₹7,999/month

Pricing is an experiment, not a validated market price.

Recurring billing will use a payment provider subscription flow. Razorpay documents support for recurring subscriptions, webhooks, automatic invoicing, and subscription management. citeturn0search0turn0search3

## 9. Build order

1. Database schema
2. Authentication and tenant isolation
3. Lead CRUD
4. Automation rules
5. Job scheduler
6. AI classification/generation
7. Activity log
8. Dashboard
9. Messaging adapter
10. Billing
11. Monitoring
12. Production deployment
