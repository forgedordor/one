package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffam extends ffby implements fexr {
    public static final /* synthetic */ int n = 0;
    public final fezl a;
    public Socket b;
    public Socket c;
    public feyk d;
    public feyz e;
    public ffcl f;
    public fffb g;
    public fffa h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean p;
    private int q;
    private int r;

    public ffam(fezl fezlVar) {
        fezlVar.getClass();
        this.a = fezlVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            fezr.s(socket);
        }
    }

    public final synchronized void c() {
        this.q++;
    }

    public final synchronized void d() {
        this.p = true;
    }

    public final synchronized void e() {
        this.i = true;
    }

    @Override // defpackage.ffby
    public final void f(ffct ffctVar) {
        ffctVar.k(8, null);
    }

    public final synchronized void g(ffaj ffajVar, IOException iOException) {
        if (iOException instanceof ffda) {
            int i = ((ffda) iOException).a;
            if (i == 8) {
                int i2 = this.r + 1;
                this.r = i2;
                if (i2 > 1) {
                    this.i = true;
                    this.j++;
                }
            } else if (i != 9 || !ffajVar.l) {
                this.i = true;
                this.j++;
            }
        } else if (!i() || (iOException instanceof ffbo)) {
            this.i = true;
            if (this.q == 0) {
                feyy feyyVar = ffajVar.a;
                fezl fezlVar = this.a;
                Proxy proxy = fezlVar.b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    fexe fexeVar = fezlVar.a;
                    fexeVar.h.connectFailed(fexeVar.i.f(), proxy.address(), iOException);
                }
                feyyVar.z.b(fezlVar);
                this.j++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.fexe r11, java.util.List r12) {
        /*
            r10 = this;
            byte[] r0 = defpackage.fezr.a
            java.util.List r0 = r10.l
            int r0 = r0.size()
            int r1 = r10.k
            r2 = 0
            if (r0 >= r1) goto Lb4
            boolean r0 = r10.i
            if (r0 == 0) goto L13
            goto Lb4
        L13:
            fezl r0 = r10.a
            fexe r1 = r0.a
            boolean r3 = r1.a(r11)
            if (r3 == 0) goto Lb4
            feyq r3 = r11.i
            feyq r1 = r1.i
            java.lang.String r4 = r3.c
            java.lang.String r5 = r1.c
            boolean r6 = defpackage.fdbq.f(r4, r5)
            r7 = 1
            if (r6 == 0) goto L2d
            return r7
        L2d:
            ffcl r6 = r10.f
            if (r6 != 0) goto L32
            return r2
        L32:
            if (r12 == 0) goto Lb4
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L3c
            goto Lb4
        L3c:
            java.util.Iterator r12 = r12.iterator()
        L40:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r12.next()
            fezl r6 = (defpackage.fezl) r6
            java.net.Proxy r8 = r6.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L40
            java.net.Proxy r8 = r0.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L40
            java.net.InetSocketAddress r8 = r0.c
            java.net.InetSocketAddress r6 = r6.c
            boolean r6 = defpackage.fdbq.f(r8, r6)
            if (r6 == 0) goto L40
            javax.net.ssl.HostnameVerifier r12 = r11.d
            ffeb r0 = defpackage.ffeb.a
            if (r12 != r0) goto Lb4
            int r12 = r3.d
            int r0 = r1.d
            if (r12 == r0) goto L77
            goto Lb4
        L77:
            boolean r12 = defpackage.fdbq.f(r4, r5)
            if (r12 == 0) goto L7e
            goto L9f
        L7e:
            boolean r12 = r10.p
            if (r12 != 0) goto Lb4
            feyk r12 = r10.d
            if (r12 == 0) goto Lb4
            java.util.List r12 = r12.a()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Lb4
            java.lang.Object r12 = r12.get(r2)
            r12.getClass()
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = defpackage.ffeb.b(r4, r12)
            if (r12 == 0) goto Lb4
        L9f:
            fexn r11 = r11.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            feyk r12 = r10.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r12.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            java.util.List r12 = r12.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r12.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            r11.b()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb4
            return r7
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffam.h(fexe, java.util.List):boolean");
    }

    public final boolean i() {
        return this.f != null;
    }

    public final void j(int i, int i2) throws IOException {
        Socket socket;
        int i3;
        fezl fezlVar = this.a;
        Proxy proxy = fezlVar.b;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = ffal.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = fezlVar.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        socket.setSoTimeout(i2);
        try {
            ffdi.b.g(socket, fezlVar.c, i);
            try {
                this.g = new fffv(fffk.c(socket));
                this.h = fffl.a(fffk.a(socket));
            } catch (NullPointerException e) {
                if (fdbq.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.ffby
    public final synchronized void k(ffcz ffczVar) {
        ffczVar.getClass();
        this.k = ffczVar.d();
    }

    public final void l() {
        this.i = true;
    }

    public final void m() throws SocketException {
        Socket socket = this.c;
        socket.getClass();
        fffb fffbVar = this.g;
        fffbVar.getClass();
        fffa fffaVar = this.h;
        fffaVar.getClass();
        socket.setSoTimeout(0);
        ffaa ffaaVar = ffaa.a;
        ffbw ffbwVar = new ffbw(ffaaVar);
        ffbwVar.b = socket;
        ffbwVar.c = fezr.e + " " + this.a.a.i.c;
        ffbwVar.d = fffbVar;
        ffbwVar.e = fffaVar;
        ffbwVar.f = this;
        ffcl ffclVar = new ffcl(ffbwVar);
        this.f = ffclVar;
        this.k = ffcl.a.d();
        ffaaVar.getClass();
        ffcu ffcuVar = ffclVar.u;
        ffcuVar.b();
        ffcz ffczVar = ffclVar.q;
        ffcuVar.h(ffczVar);
        if (ffczVar.c() != 65535) {
            ffcuVar.i(0, r2 - 65535);
        }
        ffaaVar.a().f(new fezw(ffclVar.d, ffclVar.v));
    }

    public final String toString() {
        feyk feykVar = this.d;
        String str = feykVar != null ? feykVar.b : "none";
        fezl fezlVar = this.a;
        feyz feyzVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        feyq feyqVar = fezlVar.a.i;
        sb.append(feyqVar.c);
        sb.append(":");
        sb.append(feyqVar.d);
        sb.append(", proxy=");
        sb.append(fezlVar.b);
        sb.append(" hostAddress=");
        sb.append(fezlVar.c);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(feyzVar);
        sb.append("}");
        return sb.toString();
    }
}
