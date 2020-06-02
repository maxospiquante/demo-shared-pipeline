#!/usr/bin/env groovy


def call(appName) {
    echo 'Check internal routing settings for  ${params.appName}'
    sh "ls -la"
  }
