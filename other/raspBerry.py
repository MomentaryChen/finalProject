# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import socket   

HOST='192.168.43.207'
PORT=6666
s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)  
s.bind((HOST,PORT))   
s.listen(3)
print('等待客戶端連結...') 
global cmd
cmd = "0000"
while True:  
    conn,addr=s.accept()  
    print('Connected by',addr)
    length_of_message = int.from_bytes(conn.recv(2), byteorder='big')
    data=conn.recv(2048).decode('utf-8')
    print(data)

    if data =="exit" :
        break
    elif data=="1":
        print("手機")
        cmd = cmd.encode()
        conn.send(cmd)
        #conn.send(cmd)
        cmd="1000"
    elif data=="2":
        print("rstp")
        cmd = cmd.encode()
        conn.send(cmd)
        cmd="0000"
    #cmd = cmd.decode()
    print('傳送:',cmd)
conn.close() 