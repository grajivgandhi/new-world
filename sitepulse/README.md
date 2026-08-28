# SitePulse — Privacy Analytics for Small Businesses

SitePulse is a branded analytics service built around the MIT-licensed Umami analytics engine.

## Product

**Positioning:** simple, privacy-first website analytics for small businesses and agencies.

### MVP features

- Website traffic and pageview analytics
- Visitors, referrers, devices and countries
- Custom events and goals
- UTM campaign tracking
- Team/client dashboards
- REST API integration
- Self-hosted data plane
- Custom SitePulse landing/onboarding layer

## Open-source foundation

This project uses [Umami](https://github.com/umami-software/umami) as the analytics engine. The current Umami repository is MIT licensed. MIT permits commercial use, modification, distribution, sublicensing and sale, subject to retaining the license/copyright notice.

**Important:** SitePulse must not remove or obscure required third-party copyright/license notices. Do not imply that SitePulse is an official Umami product. Review all third-party dependencies and trademarks before commercial launch.

## Architecture

```text
Customer website
      |
      | tracking script
      v
+-------------------+
| SitePulse / Umami |
| analytics engine  |
+---------+---------+
          |
      PostgreSQL
          |
     SitePulse UI
          |
   Customer dashboard
```

## Local development

1. Install Docker Desktop.
2. Copy `.env.example` to `.env`.
3. Set a strong `APP_SECRET` and PostgreSQL password.
4. Run:

```bash
docker compose up -d
```

5. Open `http://localhost:3000`.
6. Change the default administrator password immediately.

## Production target

Start with one small VPS and PostgreSQL. Put HTTPS in front of the application and use persistent storage. Back up the database before upgrades.

For a commercial multi-customer SaaS, add a separate billing/tenant layer instead of exposing a shared administrator account to customers.

## First customer offer

**SitePulse Starter — ₹499/month**

- 3 websites
- 90-day analytics retention
- weekly email report
- basic conversion tracking

**SitePulse Pro — ₹1,499/month**

- 15 websites
- 12-month retention
- conversion/funnel reporting
- client dashboards
- priority support

**Agency — ₹4,999/month**

- 50 websites
- white-label client reports
- agency account management
- onboarding support

Pricing is a launch hypothesis, not a market-validated price.

## 30-day execution

### Week 1
- Deploy Umami locally.
- Create SitePulse brand and landing page.
- Verify analytics collection.
- Create demo website.

### Week 2
- Add onboarding workflow.
- Add customer provisioning scripts.
- Add basic reporting/export.
- Prepare sales demo.

### Week 3
- Contact 100 targeted businesses/agencies.
- Offer a free 14-day pilot.
- Collect objections and feature requests.

### Week 4
- Convert first 3–5 paying customers.
- Automate provisioning and reporting.
- Decide whether a dedicated multi-tenant frontend is justified.

## Success metric

Do not optimize for GitHub stars. Optimize for:

**5 paying customers → 20 → 100.**

The open-source engine is infrastructure. The business moat should be distribution, onboarding, integrations, reports and a specific customer niche.
