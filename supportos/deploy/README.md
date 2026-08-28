# SupportOS deployment

This directory is the deployment foundation for the SupportOS commercial layer.

## Architecture

```text
Internet
   |
HTTPS reverse proxy
   |
SupportOS branded web layer
   |
Chatwoot Rails + Sidekiq
   |              |
PostgreSQL     Redis
```

The compose structure follows the current upstream Chatwoot production Docker layout: Rails and Sidekiq use the Chatwoot image, PostgreSQL uses pgvector/pg16, Redis is password protected, and persistent volumes are used for application storage and databases.

## Local test

1. Install Docker Desktop.
2. Copy `.env.example` to `.env`.
3. Replace every placeholder with strong random secrets.
4. Run `docker compose up -d` from this directory.
5. Put HTTPS in front of port 3000 for a real deployment.

## Production checklist

- Pin exact tested image versions/digests instead of `latest`.
- Configure SMTP and the production domain.
- Put the application behind HTTPS.
- Restrict PostgreSQL and Redis to the private Docker network.
- Back up PostgreSQL and `/app/storage`.
- Test restoration, not just backups.
- Monitor CPU, RAM, disk, database health and application errors.
- Keep secrets outside Git.
- Review the exact upstream license, Enterprise directory licensing, trademark rules and dependency licenses before paid deployment.
- Do not represent SupportOS as an official Chatwoot product or imply endorsement.

## Resource planning

The upstream production compose is a starting point, not a capacity guarantee. Size the VPS from actual workload, attachment volume, background jobs and number of tenants. For the first pilot, use one isolated deployment and keep the architecture simple. Move to automated provisioning only after the product has paying customers.
