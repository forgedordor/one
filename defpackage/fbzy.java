package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzy extends fcdm {
    public final fcbc a;
    public final String b;
    final /* synthetic */ fbzz d;
    private volatile Status e;
    private Status f;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final fbzx g = new fbzx(this);

    public fbzy(fbzz fbzzVar, fcbc fcbcVar, String str) {
        this.d = fbzzVar;
        this.a = fcbcVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.fcdm
    protected final fcbc a() {
        return this.a;
    }

    public final void b() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            Status status = this.f;
            this.f = null;
            if (status != null) {
                super.n(status);
            }
        }
    }

    @Override // defpackage.fcdm, defpackage.fcaq
    public final fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        fcan fcanVar;
        Executor executor;
        fbmz fbmzVar = fbncVar.e;
        if (fbmzVar == null) {
            fbmzVar = null;
        }
        if (fbmzVar == null) {
            return this.c.get() >= 0 ? new fcdh(this.e, fbnmVarArr) : this.a.d(fbrkVar, fbrgVar, fbncVar, fbnmVarArr);
        }
        fcbc fcbcVar = this.a;
        fbzx fbzxVar = this.g;
        fchv fchvVar = new fchv(fcbcVar, fbrkVar, fbrgVar, fbncVar, fbzxVar, fbnmVarArr);
        if (this.c.incrementAndGet() > 0) {
            fbzxVar.a();
            return new fcdh(this.e, fbnmVarArr);
        }
        try {
            if (!((fbtx) fbmzVar).f || (executor = fbncVar.c) == null) {
                executor = this.d.a;
            }
            fbsi fbsiVar = (fbsi) ejwg.c((fbsi) this.a.q().a(fcdq.a), fbsi.NONE);
            if (!((fbtx) fbmzVar).b || fbsiVar == fbsi.PRIVACY_AND_INTEGRITY) {
                try {
                    fbtx.a((String) ejwg.c(null, this.b), fbrkVar);
                    ((fbtx) fbmzVar).c.a(executor, new fbtu((fbtx) fbmzVar, fchvVar));
                } catch (StatusException e) {
                    fchvVar.a(e.a);
                }
            } else {
                fchvVar.a(Status.j.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(fbsiVar.toString())));
            }
        } catch (Throwable th) {
            fchvVar.a(Status.j.withDescription("Credentials should use fail() instead of throwing exceptions").d(th));
        }
        synchronized (fchvVar.g) {
            fcanVar = fchvVar.h;
            if (fcanVar == null) {
                fchvVar.j = new fccv();
                fcanVar = fchvVar.j;
                fchvVar.h = fcanVar;
            }
        }
        return fcanVar;
    }

    @Override // defpackage.fcdm, defpackage.fchm
    public final void n(Status status) {
        status.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = status;
                atomicInteger.addAndGet(Alert.DURATION_SHOW_INDEFINITELY);
                if (atomicInteger.get() != 0) {
                    this.f = status;
                } else {
                    super.n(status);
                }
            }
        }
    }
}
