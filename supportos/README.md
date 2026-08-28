# SupportOS — White-Label Customer Support SaaS

SupportOS is a vertical SaaS layer built around self-hosted/open-source customer-support infrastructure. The first implementation targets small and mid-sized businesses that need a simple branded inbox, website chat, lead capture, automation, and reporting.

## Foundation

- Primary infrastructure candidate: Chatwoot Community Edition
- Chatwoot self-hosting requirements currently documented by the project: 2 CPU cores / 4 GB RAM minimum; production recommendation 4+ cores / 8 GB+ RAM, PostgreSQL, Redis, Linux, reverse proxy, SSL, and SMTP.
- Keep Enterprise-only Chatwoot features isolated unless an appropriate commercial license is purchased.

## Product strategy

Do not sell this as a rebranded copy of Chatwoot. SupportOS adds the commercial layer:

1. Vertical onboarding
2. Brand/theme configuration
3. Lead capture and routing
4. AI-assisted replies
5. WhatsApp/email/web integrations
6. Industry templates
7. Usage reporting
8. Billing and subscription management
9. Managed hosting and support

## MVP scope

- Marketing landing page
- Tenant concept
- Brand settings
- Chatwoot connection settings
- Simple dashboard shell
- Pricing/plan model
- Deployment documentation
- Legal/license checklist

## 30-day target

Week 1: validate one niche and interview 20 prospects.

Week 2: deploy Chatwoot and connect the SupportOS shell.

Week 3: add one vertical workflow and billing-ready tenant model.

Week 4: onboard 3 pilot customers manually.

## Important licensing rule

The Chatwoot repository is currently published with MIT licensing for the applicable core, while Enterprise functionality is separately licensed. Preserve required notices and do not package Enterprise-only functionality as if it were MIT. Review the exact version's LICENSE files before commercial distribution.
