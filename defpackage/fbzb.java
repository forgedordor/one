package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import java.lang.Thread;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzb implements fcmc, fcbc {
    public static final Logger a = Logger.getLogger(fbzb.class.getName());
    static final boolean b = fcdy.i("GRPC_EXPERIMENTAL_SUPPORT_TRACING_MESSAGE_SIZES", false);
    public final boolean d;
    public fcmd e;
    public fbmw f;
    public fchl g;
    public final long h;
    public boolean i;
    public List k;
    private final fbpn n;
    private final SocketAddress o;
    private final String p;
    private final String q;
    private int r;
    private fchy s;
    private ScheduledExecutorService t;
    private boolean u;
    private Status v;
    private fbmw w;
    public final Set j = Collections.newSetFromMap(new IdentityHashMap());
    public final Thread.UncaughtExceptionHandler l = new fbyg();
    public final fcef m = new fbyh(this);
    public final int c = Alert.DURATION_SHOW_INDEFINITELY;

    public fbzb(SocketAddress socketAddress, String str, String str2, fbmw fbmwVar, boolean z) {
        this.o = socketAddress;
        this.p = str;
        this.q = fcdy.e("inprocess", str2);
        fbmwVar.getClass();
        fbmu fbmuVar = new fbmu(fbmw.a);
        fbmuVar.b(fcdq.a, fbsi.PRIVACY_AND_INTEGRITY);
        fbmuVar.b(fcdq.b, fbmwVar);
        fbmuVar.b(fbpb.a, socketAddress);
        fbmuVar.b(fbpb.b, socketAddress);
        this.w = fbmuVar.a();
        this.n = fbpn.a(getClass(), socketAddress.toString());
        this.d = z;
        this.h = -1L;
    }

    public static int a(fbrg fbrgVar) {
        Charset charset = fbpp.a;
        long length = 0;
        for (int i = 0; i < fbrgVar.m().length; i += 2) {
            length += r5[i].length + 32 + r5[i + 1].length;
        }
        return (int) Math.min(length, 2147483647L);
    }

    public static Status b(Status status, boolean z) {
        if (status == null) {
            return null;
        }
        Status statusWithDescription = Status.fromCodeValue(status.getCode().value()).withDescription(status.getDescription());
        return z ? statusWithDescription.d(status.t) : statusWithDescription;
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.n;
    }

    @Override // defpackage.fcaq
    public final synchronized fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) throws Throwable {
        Throwable th;
        int iA;
        try {
            try {
                fcmm fcmmVarL = fcmm.l(fbnmVarArr, this.w);
                Status status = this.v;
                try {
                    if (status != null) {
                        return new fbyj(fcmmVarL, status);
                    }
                    fbrgVar.h(fcdy.j, this.q);
                    return (this.r == Integer.MAX_VALUE || (iA = a(fbrgVar)) <= this.r) ? new fbyz(this, fbrkVar, fbrgVar, fbncVar, this.p, fcmmVarL).a : new fbyj(fcmmVarL, Status.k.withDescription(String.format(Locale.US, "Request metadata larger than %d: %d", Integer.valueOf(this.r), Integer.valueOf(iA))));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.fchm
    public final synchronized Runnable e(fchl fchlVar) {
        fbyc fbycVarA;
        this.g = fchlVar;
        ConcurrentMap concurrentMap = fbyc.a;
        SocketAddress socketAddress = this.o;
        if (socketAddress instanceof fbxy) {
            fbycVarA = ((fbxy) socketAddress).a();
        } else if (socketAddress instanceof fbyf) {
            ConcurrentMap concurrentMap2 = fbyc.a;
            String str = ((fbyf) socketAddress).a;
            fbycVarA = (fbyc) concurrentMap2.get(null);
        } else {
            fbycVarA = null;
        }
        if (fbycVarA != null) {
            this.r = Alert.DURATION_SHOW_INDEFINITELY;
            fchy fchyVar = fbycVarA.c;
            this.s = fchyVar;
            this.t = (ScheduledExecutorService) fchyVar.a();
            this.k = fbycVarA.b;
            this.e = fbycVarA.a(this);
        }
        if (this.e == null) {
            Status statusWithDescription = Status.p.withDescription("Could not find server: ".concat(String.valueOf(String.valueOf(socketAddress))));
            this.v = statusWithDescription;
            return new fbyi(this, statusWithDescription);
        }
        fbmw fbmwVar = fbmw.a;
        fbmu fbmuVar = new fbmu(fbmw.a);
        fbmuVar.b(fbpb.a, socketAddress);
        fbmuVar.b(fbpb.b, socketAddress);
        fbmw fbmwVarA = fbmuVar.a();
        this.e.c();
        this.f = fbmwVarA;
        fchl fchlVar2 = this.g;
        fbmw fbmwVar2 = this.w;
        fchlVar2.e();
        this.w = fbmwVar2;
        this.g.b();
        return null;
    }

    @Override // defpackage.fcmc
    public final synchronized void f() {
        n(Status.p.withDescription("InProcessTransport shutdown by the server-side"));
    }

    public final synchronized void g(Status status) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.c(status);
    }

    public final synchronized void h() {
        if (!this.u) {
            this.u = true;
            ScheduledExecutorService scheduledExecutorService = this.t;
            if (scheduledExecutorService != null) {
                this.s.b(scheduledExecutorService);
                this.t = null;
            }
            this.g.d();
            fcmd fcmdVar = this.e;
            if (fcmdVar != null) {
                fcmdVar.b();
            }
        }
    }

    @Override // defpackage.fchm
    public final synchronized void n(Status status) {
        if (!this.i) {
            this.v = status;
            g(status);
            if (this.j.isEmpty()) {
                h();
            }
        }
    }

    @Override // defpackage.fcmc
    public final void o(Status status) {
        synchronized (this) {
            n(status);
            if (this.u) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fbyz) arrayList.get(i)).a.c(status);
            }
        }
    }

    @Override // defpackage.fcbc
    public final fbmw q() {
        return this.w;
    }

    @Override // defpackage.fcmc
    public final ScheduledExecutorService r() {
        return this.t;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("logId", this.n.a);
        ejwfVarB.b("address", this.o);
        return ejwfVarB.toString();
    }
}
