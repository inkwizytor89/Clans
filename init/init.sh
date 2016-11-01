#!/bin/bash
PROJECT_NAME="Clans"

echo ''
echo $PROJECT_NAME
echo ''


chmod +x postgres/postgres.sh
chmod +x ../db/reinstall_db.sh

#postgres
./postgres/postgres.sh


echo ''
echo 'Done'
echo ''
