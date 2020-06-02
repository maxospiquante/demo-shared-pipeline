#!/usr/bin/env groovy


def call(appName) {
 
    echo "Will deploy to ${params.appName}"
    echo "Will deploy to ${appName}"
    sh "ls -la"
  }
