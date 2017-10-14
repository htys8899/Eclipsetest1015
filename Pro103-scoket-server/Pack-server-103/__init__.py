# coding=utf-8
import socket              
s = socket.socket()        
host = socket.gethostname()   
port = 12345               
s.bind((host, port))      
s.listen(5)                 
print "this is server side1005, waiting for client to connect "
while True:
    c, addr = s.accept()    
    print  "why next connection the addr will add +1??"
    print 'connection address:', addr
    c.send('welcome to cainiao')
    c.close()   