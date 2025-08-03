#!/bin/bash

WATCH_DIR="/home/user/.leetcode"  
BRANCH="main"                             

cd "$WATCH_DIR"

echo "Watching $WATCH_DIR for changes..."

while true; do
  inotifywait -r -e modify,create,delete,move "$WATCH_DIR"
  
  git add .
  git commit -m "Auto commit: $(date '+%Y-%m-%d %H:%M:%S')"
  git push origin "$BRANCH"
done
