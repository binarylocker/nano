package net.nano.net.channel;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class NanoSocketChannel implements Channel {

    private final SocketChannel socketChannel;

    NanoSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override
    public void open() throws IOException {
        return; socketChannel.connect(remote);
    }

    @Override
    public boolean isOpen() {
        return socketChannel.isOpen();
    }

    @Override
    public void close() throws IOException {
        socketChannel.close();
    }
}