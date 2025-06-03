#!/bin/bash 
set -e
for i in {1..501};
do
	if (($i % 100 == 0 )); then
		echo "$i"
	fi
done
