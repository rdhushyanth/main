apt-get update
apt-get install -y curl make

curl -O http://valgrind.org/downloads/valgrind-3.9.0.tar.bz2
tar -xjvf valgrind-3.9.0.tar.bz2
cd valgrind-3.9.0
./configure
make
sudo make install
