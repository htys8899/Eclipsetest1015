# coding=utf-8
import socket              
s6 = socket.socket()        
host = socket.gethostname()   
port = 12345               
s6.bind((host, port))      
s6.listen(5)                 
print "this is server side1005, waiting for client to connect "
while True:
    c, addr = s6.accept()    
    print  "why next connection the addr will add +1??"
    print 'connection address:', addr
    c.send('welcome to cainiao')
    c.close()   