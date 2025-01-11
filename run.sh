name=$1
npx tsc
filename=$(echo $name|sed s/"src\/"//g|sed s/".ts"/".js"/g)

node dist/$filename

