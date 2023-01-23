scp build\libs\DogCat-0.0.1-SNAPSHOT.jar root@13.124.16.231:~/dogcat
ssh root@13.124.16.231 "cd dogcat;kill `cat run.pid`;nohup java -jar DogCat-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 & echo $! > run.pid"
