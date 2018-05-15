#!/bin/bash
test $(curl docker inspect -f "{{ .NetworkSettings.IPAddress }}" CONTAINER_ID:8090/sum?a=1&b=2) -eq 3
