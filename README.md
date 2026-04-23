# Dockerized Spring Boot Project

## Run with Docker Compose

```bash
docker compose up --build
```

Open `http://localhost:8080`

## Run with Production Compose

Use `compose.prod.yaml` after pushing the app image to a registry.

```bash
docker compose -f compose.prod.yaml up -d
```

Before running it, replace `your-dockerhub-username/dockertest-app:1.0.0` with your real image name.

## Endpoints

- `GET /` static welcome page
- `GET /api/members` list members from MySQL
- `GET /api/members/1` get one member from MySQL

## Local structure

- `src/main/java` application code
- `src/main/resources/static` static page assets
- `src/test/java` basic startup test

## MySQL Workbench

When `docker compose up --build` is running, connect Workbench with:

- Hostname: `127.0.0.1`
- Port: `3306`
- Username: `member_user`
- Password: `member_password`
- Default schema: `member_db`

The `members` table is generated automatically by Spring Data JPA on application startup.
