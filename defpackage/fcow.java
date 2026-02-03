package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcow implements fcas {
    final Executor a;
    final ScheduledExecutorService b;
    final fcmt c;
    final SSLSocketFactory d;
    final fcqb e;
    final int f;
    final int g;
    final int h;
    private final fchy i;
    private final fchy j;
    private final boolean k;
    private final fbzn l;
    private final long m;
    private boolean n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fcow(fchy fchyVar, fchy fchyVar2, SSLSocketFactory sSLSocketFactory, fcqb fcqbVar, int i, boolean z, long j, long j2, int i2, int i3, fcmt fcmtVar) {
        this.i = fchyVar;
        this.a = fchyVar.a();
        this.j = fchyVar2;
        this.b = (ScheduledExecutorService) fchyVar2.a();
        this.d = sSLSocketFactory;
        this.e = fcqbVar;
        this.f = i;
        this.k = z;
        this.l = new fbzn(j);
        this.m = j2;
        this.g = i2;
        this.h = i3;
        fcmtVar.getClass();
        this.c = fcmtVar;
    }

    @Override // defpackage.fcas
    public final fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar) {
        if (this.n) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        fbzn fbznVar = this.l;
        fbzm fbzmVar = new fbzm(fbznVar, fbznVar.c.get());
        fcov fcovVar = new fcov(fbzmVar);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        String str = fcarVar.a;
        String str2 = fcarVar.c;
        fbmw fbmwVar = fcarVar.b;
        fbpd fbpdVar = fcarVar.d;
        ejxr ejxrVar = fcdy.q;
        Logger logger = fcqz.a;
        fcpj fcpjVar = new fcpj(this, inetSocketAddress, str, str2, fbmwVar, ejxrVar, fbpdVar, fcovVar);
        if (this.k) {
            long j = fbzmVar.a;
            long j2 = this.m;
            fcpjVar.D = true;
            fcpjVar.E = j;
            fcpjVar.F = j2;
        }
        return fcpjVar;
    }

    @Override // defpackage.fcas
    public final Collection b() {
        int i = fcox.o;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fcas
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.fcas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.b(this.a);
        this.j.b(this.b);
    }
}
