#!/bin/bash

# Wait for Grafana to start and be available on port 3000
until curl --silent --fail http://localhost:3000; do
  echo "Waiting for Grafana to become available..."
  sleep 5
done

# Once Grafana is ready, load the dashboard
echo "Grafana is ready, loading dashboards..."
curl -X POST -H "Content-Type: application/json" -u admin:${GF_ADMIN_PASSWORD} \
  -d @/etc/grafana/provisioning/dashboards/IDP.json \
  http://localhost:3000/api/dashboards/db

echo "Dashboard loaded successfully."
