package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvk extends fbvm implements fcbc, fbuw {
    public final fbur a;
    public final fbux b;
    public final long c;
    public ScheduledFuture d;
    private final fchy n;
    private final Executor o;
    private final AtomicInteger p;
    private final fbwz q;
    private fchl r;
    private int s;

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fbvk(fbuz fbuzVar, fbty fbtyVar, fcar fcarVar) {
        fchy fchyVar = fbuzVar.c;
        fbmw fbmwVar = fcarVar.b;
        Context context = fbuzVar.a;
        fbuj fbujVar = fbuzVar.g;
        fbmw fbmwVar2 = fbmw.a;
        fbmu fbmuVar = new fbmu(fbmw.a);
        fbmuVar.b(fcdq.a, fbsi.NONE);
        fbmuVar.b(fcdq.b, fbmwVar);
        fbmuVar.b(fbpb.b, fbty.b(context));
        fbmuVar.b(fbpb.a, fbtyVar);
        fbmuVar.b(h, fbujVar);
        super(fchyVar, fbmuVar.a(), fbpn.a(fbvk.class, fbuzVar.a.getClass().getSimpleName() + "->" + String.valueOf(fbtyVar)));
        this.s = 1001;
        fchy fchyVar2 = fbuzVar.d;
        this.n = fchyVar2;
        this.a = fbuzVar.e;
        this.o = fchyVar2.a();
        this.c = 60000L;
        this.p = new AtomicInteger();
        ejya ejyaVar = ejya.b;
        this.q = new fbwz();
        this.b = new fbxd(fbuzVar.b, fbuzVar.a, fbtyVar.a.cloneFilter(), fbuzVar.f.b, this);
    }

    private static fcan B(Status status, fbmw fbmwVar, fbnm[] fbnmVarArr) {
        fcmm.l(fbnmVarArr, fbmwVar).a();
        return new fcdh(status, fbnmVarArr);
    }

    @Override // defpackage.fbuw
    public final synchronized void a(IBinder iBinder) {
        s(fbwm.b(iBinder, this.o));
    }

    @Override // defpackage.fbuw
    public final synchronized void b(Status status) {
        u(status, true);
    }

    @Override // defpackage.fcaq
    public final synchronized fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) throws Throwable {
        Throwable th;
        try {
            try {
                try {
                    if (!A(3)) {
                        return B(x() ? this.l : Status.o.withDescription("newStream() before transportReady()"), this.k, fbnmVarArr);
                    }
                    int i = this.s;
                    int i2 = i + 1;
                    this.s = i2;
                    if (i2 == 16777215) {
                        this.s = 1001;
                    }
                    fcmm fcmmVarL = fcmm.l(fbnmVarArr, this.k);
                    fbvx fbvxVar = new fbvx(this, this.k, i, fcdy.j(fbncVar));
                    if (this.j.putIfAbsent(Integer.valueOf(i), fbvxVar) != null) {
                        Status statusWithDescription = Status.o.withDescription("Clashing call IDs");
                        u(statusWithDescription, true);
                        return B(statusWithDescription, this.k, fbnmVarArr);
                    }
                    if (fbvxVar.a && this.p.getAndIncrement() == 0) {
                        this.r.a(true);
                    }
                    fbwn fbwnVar = new fbwn(this, i, fbrkVar, fbrgVar, fcmmVarL);
                    if (fbrkVar.a.a()) {
                        return new fbxe(fbvxVar, fbwnVar);
                    }
                    return new fbwg(fbvxVar, fbwnVar);
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
        this.r = fchlVar;
        return new Runnable() { // from class: fbvg
            @Override // java.lang.Runnable
            public final void run() {
                final fbvk fbvkVar = this.a;
                synchronized (fbvkVar) {
                    if (fbvkVar.A(1)) {
                        fbvkVar.z(2);
                        fbvkVar.b.a();
                        fbvkVar.d = fbvkVar.i.schedule(new Runnable() { // from class: fbvh
                            @Override // java.lang.Runnable
                            public final void run() {
                                fbvkVar.l();
                            }
                        }, fbvkVar.c, TimeUnit.MILLISECONDS);
                    }
                }
            }
        };
    }

    public final synchronized void f(Throwable th) {
        u(Status.o.withDescription("Could not evaluate SecurityPolicy").d(th), true);
    }

    public final synchronized void g(IBinder iBinder, Status status) {
        if (A(2)) {
            if (!status.f()) {
                u(status, true);
                return;
            }
            if (!y(fbwm.b(iBinder, this.o))) {
                u(Status.p.withDescription("Failed to observe outgoing binder"), true);
                return;
            }
            if (!x()) {
                z(3);
                fchl fchlVar = this.r;
                fbmw fbmwVar = this.k;
                fchlVar.e();
                this.k = fbmwVar;
                this.r.b();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                }
            }
        }
    }

    @Override // defpackage.fbvm
    protected final void h(Parcel parcel) {
        parcel.readInt();
        this.q.a();
    }

    @Override // defpackage.fbvm
    protected final void i(Parcel parcel) {
        final int callingUid = Binder.getCallingUid();
        fbmu fbmuVar = new fbmu(this.k);
        fbmuVar.b(f, Integer.valueOf(callingUid));
        fbmuVar.b(fcdq.a, callingUid == Process.myUid() ? fbsi.PRIVACY_AND_INTEGRITY : fbsi.INTEGRITY);
        this.k = fbmuVar.a();
        if (A(2)) {
            int i = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            if (i != 1) {
                u(Status.p.withDescription("Wire format version mismatch"), true);
            } else if (strongBinder == null) {
                u(Status.p.withDescription("Malformed SETUP_TRANSPORT data"), true);
            } else {
                fbur fburVar = this.a;
                eork.r(fburVar instanceof fbtz ? ((fbtz) fburVar).b(callingUid) : eork.m(new Callable() { // from class: fbvi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.a.a(callingUid);
                    }
                }, this.o), new fbvj(this, strongBinder), this.o);
            }
        }
    }

    @Override // defpackage.fbvm
    public final void j(Status status) {
        this.r.c(status);
    }

    @Override // defpackage.fbvm
    public final void k() {
        if (this.p.getAndSet(0) > 0) {
            this.r.a(false);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
        ((fbxd) this.b).c(Status.c);
        this.r.d();
    }

    public final synchronized void l() {
        if (A(2)) {
            this.d = null;
            long j = this.c;
            u(Status.f.withDescription("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    @Override // defpackage.fbvm
    public final void m() {
        super.m();
        this.n.b(this.o);
    }

    @Override // defpackage.fchm
    public final synchronized void n(Status status) {
        status.getClass();
        u(status, false);
    }

    @Override // defpackage.fchm
    public final synchronized void o(Status status) {
        throw null;
    }

    @Override // defpackage.fbvm
    protected final void p(fbwb fbwbVar) {
        if (fbwbVar.e() && this.p.decrementAndGet() == 0) {
            this.r.a(false);
        }
        super.p(fbwbVar);
    }
}
