#!/bin/bash

. ../project.properties

for FILE in `ls --ignore-backups unpatch | sort -r`; do 
    sudo -u postgres psql -t -d $db_name -f "unpatch/$FILE"; 
done

for FILE in patch/*.sql; do 
	sudo -u postgres psql -t -d $db_name -f "$FILE";
done

for FILE in init_data/*.sql; do 
	sudo -u postgres psql -t -d $db_name -f $FILE;
done
