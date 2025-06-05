#!/bin/bash

set -e
#set -x

echo "This code generates the table that you want. So give inputs accordingly :)"
echo "Enter the table you want"
read table
#echo "Done..!! Now say me upto where you want that table ? like upto 10 (2*10=10) or 20 (2*20=40) :"
#read range

for i in {1..10};
do
	mul=$(($i*$table))
	echo "$table * $i == $mul"
done

echo "Coded by sandeep"
