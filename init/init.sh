#!/bin/bash
PROJECT_NAME="Clans"

echo ''
echo $PROJECT_NAME
echo ''


#postgres
chmod +x postgres/postgres.sh
./postgres/postgres.sh


echo ''
echo 'Done'
echo ''
