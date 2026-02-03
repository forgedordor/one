package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxv implements fcbc {
    public final String a;
    public fchl b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final fcmu g;
    public fbmw h;
    public final fbxl i;
    public boolean j;
    public Status k;
    public boolean l;
    private final fbpn m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public fbxv(fbxl fbxlVar, InetSocketAddress inetSocketAddress, String str, String str2, fbmw fbmwVar, Executor executor, int i, fcmu fcmuVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = fbpn.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = fcdy.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = fbxlVar;
        this.g = fcmuVar;
        fbmw fbmwVar2 = fbmw.a;
        fbmu fbmuVar = new fbmu(fbmw.a);
        fbmuVar.b(fcdq.a, fbsi.PRIVACY_AND_INTEGRITY);
        fbmuVar.b(fcdq.b, fbmwVar);
        this.h = fbmuVar.a();
    }

    final void a(fbxs fbxsVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(fbxsVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                fbxsVar.o.j(status, z, new fbrg());
                b();
            }
        }
    }

    final void b() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.m;
    }

    @Override // defpackage.fcaq
    public final /* bridge */ /* synthetic */ fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        return new fbxu(this, "https://" + this.o + "/".concat(fbrkVar.b), fbrgVar, fbrkVar, fcmm.l(fbnmVarArr, this.h), fbncVar).a;
    }

    @Override // defpackage.fchm
    public final Runnable e(fchl fchlVar) {
        this.b = fchlVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new fbxt(this);
    }

    @Override // defpackage.fchm
    public final void n(Status status) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.j = true;
                    this.k = status;
                }
                b();
            }
        }
    }

    @Override // defpackage.fchm
    public final void o(Status status) {
        throw null;
    }

    @Override // defpackage.fcbc
    public final fbmw q() {
        return this.h;
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
