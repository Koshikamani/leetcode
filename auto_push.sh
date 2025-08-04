#!/bin/bash

while true; do
  cd /home/user/.leetcode || exit
  git add .

  if ! git diff --cached --quiet; then
    git commit -m "🤖 AutoPush v1.0 — Timestamp:$(date '+%Y-%m-%d %H:%M:%S')"
    git push origin main
    echo "✅ Pushed at $(date)" >> auto_push.log
  else
    echo "⏳ Nothing to commit at $(date)" >> auto_push.log
  fi

  sleep 20
done

