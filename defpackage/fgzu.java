package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzu implements fgzk {
    private static int d;
    public InetSocketAddress a;
    public InetSocketAddress b;
    public boolean c;
    private long e;

    public fgzu() {
        this(null);
    }

    @Override // defpackage.fgzk
    public final fgyi a(fgyi fgyiVar) throws IOException {
        byte[] bArrG;
        fgyi fgyiVar2;
        fgzh fgzhVarC;
        if (fgyz.a("verbose")) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("Sending to ");
            stringBuffer.append(this.a.getAddress().getHostAddress());
            stringBuffer.append(":");
            stringBuffer.append(this.a.getPort());
            printStream.println(stringBuffer.toString());
        }
        if (fgyiVar.a.c() == 0 && (fgzhVarC = fgyiVar.c()) != null && fgzhVarC.g == 252) {
            fhat fhatVar = new fhat(fgyiVar.c().f, this.a);
            int i = (int) (this.e / 1000);
            if (i < 0) {
                throw new IllegalArgumentException("timeout cannot be negative");
            }
            fhatVar.d = i * 1000;
            fhatVar.a = this.b;
            try {
                fhatVar.e = new fhar();
                try {
                    fhatVar.c = new fgzx(System.currentTimeMillis() + fhatVar.d);
                    SocketAddress socketAddress = fhatVar.a;
                    if (socketAddress != null) {
                        fhatVar.c.d(socketAddress);
                    }
                    fhatVar.c.e(fhatVar.b);
                    fhatVar.c();
                    fhar fharVar = fhatVar.e;
                    if (!(fharVar instanceof fhar)) {
                        throw new IllegalArgumentException("ZoneTransferIn used callback interface");
                    }
                    List list = fharVar.a;
                    fgyi fgyiVar3 = new fgyi(new fgxq(fgyiVar.a.b()));
                    fgyiVar3.a.f(5);
                    fgyiVar3.a.f(0);
                    fgyiVar3.d(fgyiVar.c(), 0);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fgyiVar3.d((fgzh) it.next(), 1);
                    }
                    return fgyiVar3;
                } finally {
                    fhatVar.b();
                }
            } catch (fhaq e) {
                throw new fhao(e.getMessage());
            }
        }
        fgyi fgyiVar4 = (fgyi) fgyiVar.clone();
        byte[] bArrG2 = fgyiVar4.g();
        fgyx fgyxVarB = fgyiVar4.b();
        int i2 = fgyxVarB == null ? 512 : fgyxVarB.h;
        long jCurrentTimeMillis = System.currentTimeMillis() + this.e;
        boolean z = false;
        while (true) {
            if (this.c || bArrG2.length > i2) {
                z = true;
            }
            if (z) {
                InetSocketAddress inetSocketAddress = this.b;
                InetSocketAddress inetSocketAddress2 = this.a;
                fgzx fgzxVar = new fgzx(jCurrentTimeMillis);
                if (inetSocketAddress != null) {
                    try {
                        fgzxVar.d(inetSocketAddress);
                    } finally {
                        fgzxVar.b();
                    }
                }
                fgzxVar.e(inetSocketAddress2);
                fgzxVar.f(bArrG2);
                bArrG = fgzxVar.g();
            } else {
                InetSocketAddress inetSocketAddress3 = this.b;
                InetSocketAddress inetSocketAddress4 = this.a;
                fhak fhakVar = new fhak(jCurrentTimeMillis);
                try {
                    fhakVar.d(inetSocketAddress3);
                    if (!fhakVar.e) {
                        fhakVar.d(null);
                    }
                    ((DatagramChannel) fhakVar.b.channel()).connect(inetSocketAddress4);
                    DatagramChannel datagramChannel = (DatagramChannel) fhakVar.b.channel();
                    datagramChannel.socket().getLocalSocketAddress();
                    datagramChannel.socket().getRemoteSocketAddress();
                    fhak.c("UDP write", bArrG2);
                    datagramChannel.write(ByteBuffer.wrap(bArrG2));
                    DatagramChannel datagramChannel2 = (DatagramChannel) fhakVar.b.channel();
                    byte[] bArr = new byte[i2];
                    fhakVar.b.interestOps(1);
                    while (!fhakVar.b.isReadable()) {
                        try {
                            fhak.a(fhakVar.b, fhakVar.a);
                        } finally {
                            if (fhakVar.b.isValid()) {
                                fhakVar.b.interestOps(0);
                            }
                        }
                    }
                    long j = datagramChannel2.read(ByteBuffer.wrap(bArr));
                    if (j <= 0) {
                        throw new EOFException();
                    }
                    int i3 = (int) j;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    datagramChannel2.socket().getLocalSocketAddress();
                    datagramChannel2.socket().getRemoteSocketAddress();
                    fhak.c("UDP read", bArr2);
                    fhakVar.b();
                    bArrG = bArr2;
                } catch (Throwable th) {
                    fhakVar.b();
                    throw th;
                }
            }
            if (bArrG.length < 12) {
                throw new fhao("invalid DNS header - too short");
            }
            int i4 = bArrG[0] & 255;
            int i5 = bArrG[1] & 255;
            int iB = fgyiVar4.a.b();
            int i6 = (i4 << 8) + i5;
            if (i6 != iB) {
                StringBuffer stringBuffer2 = new StringBuffer("invalid message id: expected ");
                stringBuffer2.append(iB);
                stringBuffer2.append("; got id ");
                stringBuffer2.append(i6);
                String string = stringBuffer2.toString();
                if (z) {
                    throw new fhao(string);
                }
                if (fgyz.a("verbose")) {
                    System.err.println(string);
                }
            } else {
                try {
                    fgyiVar2 = new fgyi(bArrG);
                    if (z || !fgyiVar2.a.g(6)) {
                        break;
                    }
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    if (fgyz.a("verbose")) {
                        e.printStackTrace();
                    }
                    if (!(e instanceof fhao)) {
                        e = new fhao("Error parsing message");
                    }
                    throw ((fhao) e);
                }
            }
        }
        return fgyiVar2;
    }

    @Override // defpackage.fgzk
    public final void b(int i) {
        this.e = i * 1000;
    }

    @Override // defpackage.fgzk
    public final Object c(fgyi fgyiVar, fgxj fgxjVar) {
        Integer num;
        synchronized (this) {
            int i = d;
            d = i + 1;
            num = new Integer(i);
        }
        fgzh fgzhVarC = fgyiVar.c();
        String string = fgzhVarC != null ? fgzhVarC.f.toString() : "(none)";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass());
        stringBuffer.append(": ");
        stringBuffer.append(string);
        String string2 = stringBuffer.toString();
        fgzj fgzjVar = new fgzj(this, fgyiVar, num, fgxjVar);
        fgzjVar.setName(string2);
        fgzjVar.setDaemon(true);
        fgzjVar.start();
        return num;
    }

    public fgzu(String str) {
        this.e = 10000L;
        if (str == null) {
            String[] strArr = ResolverConfig.b().servers;
            str = strArr == null ? null : strArr[0];
            if (str == null) {
                str = "localhost";
            }
        }
        this.a = new InetSocketAddress(str.equals("0") ? InetAddress.getLocalHost() : InetAddress.getByName(str), 53);
    }
}
