# Use the latest Alpine image as the base
FROM alpine:latest

# Set a label for the container and image name
LABEL name="language-performance"

# Set the user to root
USER root

# Install dependencies
RUN apk update && apk add --no-cache \
    python3 \
    py3-pip \
    openjdk21-jdk \
    gcc \
    g++ \
    curl \
    nodejs \
    npm

# Create and activate a named virtual environment, then upgrade pip
RUN python3 -m venv /opt/myenv && \
    . /opt/myenv/bin/activate && \
    pip install --upgrade pip

# Set default shell to bash
SHELL ["/bin/ash", "-c"]
