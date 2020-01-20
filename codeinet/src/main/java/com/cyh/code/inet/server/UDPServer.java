package com.cyh.code.inet.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        System.out.println("UDP连接服务端建立");
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            String string = new String(data, 0, dp.getLength());
            System.out.println(string);
        }
    }
}
