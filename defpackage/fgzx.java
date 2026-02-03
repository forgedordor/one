package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgzx extends fgws {
    public fgzx(long j) {
        super(SocketChannel.open(), j);
    }

    private final byte[] h(int i) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        byte[] bArr = new byte[i];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.b.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.b.isReadable()) {
                    long j = socketChannel.read(byteBufferWrap);
                    if (j < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) j;
                    if (i2 < i && System.currentTimeMillis() > this.a) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    a(this.b, this.a);
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
        return bArr;
    }

    final void d(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.b.channel()).socket().bind(socketAddress);
    }

    final void e(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.b.interestOps(8);
        while (!socketChannel.finishConnect()) {
            try {
                if (!this.b.isConnectable()) {
                    a(this.b, this.a);
                }
            } catch (Throwable th) {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
                throw th;
            }
        }
        if (this.b.isValid()) {
            this.b.interestOps(0);
        }
    }

    final void f(byte[] bArr) {
        boolean zIsValid;
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        c("TCP write", bArr);
        int length = bArr.length;
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (length >>> 8), (byte) (length & 255)}), ByteBuffer.wrap(bArr)};
        this.b.interestOps(4);
        int i = 0;
        while (true) {
            try {
                int length2 = bArr.length + 2;
                if (i >= length2) {
                    if (zIsValid) {
                        return;
                    } else {
                        return;
                    }
                }
                if (this.b.isWritable()) {
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < 0) {
                        throw new EOFException();
                    }
                    i += (int) jWrite;
                    if (i < length2 && System.currentTimeMillis() > this.a) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    a(this.b, this.a);
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
    }

    final byte[] g() {
        byte[] bArrH = h(2);
        byte[] bArrH2 = h(((bArrH[0] & 255) << 8) + (bArrH[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        c("TCP read", bArrH2);
        return bArrH2;
    }
}
