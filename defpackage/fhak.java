package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhak extends fgws {
    public static final SecureRandom c = new SecureRandom();
    public static volatile boolean d = true;
    public boolean e;

    static {
        new Thread(new fhaj()).start();
    }

    public fhak(long j) {
        super(DatagramChannel.open(), j);
        this.e = false;
    }

    private final void e(InetSocketAddress inetSocketAddress) throws SocketException, InterruptedException {
        if (d) {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException unused) {
            }
            if (d) {
                return;
            }
        }
        DatagramChannel datagramChannel = (DatagramChannel) this.b.channel();
        for (int i = 0; i < 1024; i++) {
            try {
                int iNextInt = c.nextInt(32767) + 32768;
                datagramChannel.socket().bind(inetSocketAddress != null ? new InetSocketAddress(inetSocketAddress.getAddress(), iNextInt) : new InetSocketAddress(iNextInt));
                this.e = true;
                return;
            } catch (SocketException unused2) {
            }
        }
    }

    final void d(SocketAddress socketAddress) throws SocketException, InterruptedException {
        if (socketAddress == null || ((InetSocketAddress) socketAddress).getPort() == 0) {
            e((InetSocketAddress) socketAddress);
            if (this.e) {
                return;
            }
        }
        if (socketAddress != null) {
            ((DatagramChannel) this.b.channel()).socket().bind(socketAddress);
            this.e = true;
        }
    }
}
