package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebfq implements ebfu {
    private final ebfv a;
    private final ebft b;
    private final String c;
    private final int d;
    private final Optional e;

    public ebfq(ebfv ebfvVar, ebft ebftVar, String str, int i, Optional optional) {
        this.a = ebfvVar;
        this.b = ebftVar;
        this.c = str;
        this.d = i;
        this.e = optional;
    }

    @Override // defpackage.ebfu
    public final Optional a() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [ebew, java.lang.Object] */
    @Override // defpackage.ebfu
    public final Socket b() throws IOException {
        Socket socketA = this.a.a();
        boolean z = socketA instanceof SSLSocket;
        Socket socketH = ebev.h(socketA);
        String str = this.c;
        InetAddress inetAddressA = this.b.a(socketH, true != z ? null : str);
        int i = this.d;
        InetSocketAddress inetSocketAddress = inetAddressA != null ? new InetSocketAddress(inetAddressA, i) : new InetSocketAddress(str, i);
        dhip dhipVar = dhja.b;
        String name = socketA.getClass().getName();
        dhiz dhizVar = dhiz.IP_ADDRESS;
        dhja.d(dhipVar, "Connecting %s to %s", name, dhizVar.c(inetSocketAddress));
        socketA.connect(inetSocketAddress, 15000);
        Optional optional = this.e;
        if (!optional.isPresent()) {
            return socketA;
        }
        dhja.d(dhipVar, "Socket [isBound = %s, isConnected = %s, isClosed = %s, localAddress = %s, remoteAddress = %s]", Boolean.valueOf(socketA.isBound()), Boolean.valueOf(socketA.isConnected()), Boolean.valueOf(socketA.isClosed()), dhizVar.c(socketA.getLocalSocketAddress()), dhizVar.c(socketA.getRemoteSocketAddress()));
        try {
            optional.get().b(ebev.h(socketA));
            return socketA;
        } catch (IOException e) {
            if (dfog.x()) {
                dhja.t(e, dhja.b, "[SR] Failed to setup dedicated bearer, falling back to default bearer.", new Object[0]);
                return socketA;
            }
            dhja.t(e, dhja.b, "[SR] Failed to setup dedicated bearer, fallback disabled.", new Object[0]);
            throw e;
        }
    }
}
