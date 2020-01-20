package com.cyh.code.inet.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        System.out.println("UDP连接客户端建立");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要发送的字符串");
        String data = scanner.nextLine();
        byte[] str = data.getBytes();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str, str.length, inetAddress, 8888);
        ds.send(dp);
    }
}
