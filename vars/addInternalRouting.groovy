#!/usr/bin/env groovy


def call(appName) {
    echo 'Check internal routing settings for  ${appName}'
    sh "ls -la"
  }
