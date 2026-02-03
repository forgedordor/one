package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccb extends fccv {
    public final fbqd a;
    public final fbog b = fbog.k();
    public final fbnm[] c;
    public volatile Status d;
    final /* synthetic */ fccd e;

    public fccb(fccd fccdVar, fbqd fbqdVar, fbnm[] fbnmVarArr) {
        this.e = fccdVar;
        this.a = fbqdVar;
        this.c = fbnmVarArr;
    }

    @Override // defpackage.fccv, defpackage.fcan
    public final void b(fceg fcegVar) {
        if (((fcit) this.a).a.i()) {
            fcegVar.a("wait_for_ready");
            Status status = this.d;
            if (status != null && !status.f()) {
                fcegVar.b("Last Pick Failure", status);
            }
        }
        super.b(fcegVar);
    }

    @Override // defpackage.fccv, defpackage.fcan
    public final void c(Status status) {
        super.c(status);
        fccd fccdVar = this.e;
        synchronized (fccdVar.a) {
            if (fccdVar.e != null) {
                boolean zRemove = fccdVar.g.remove(this);
                if (!fccdVar.b() && zRemove) {
                    fbtk fbtkVar = fccdVar.b;
                    fbtkVar.c(fccdVar.d);
                    if (fccdVar.h.b != null) {
                        fbtkVar.c(fccdVar.e);
                        fccdVar.e = null;
                    }
                }
            }
        }
        this.e.b.b();
    }

    @Override // defpackage.fccv
    protected final void p() {
        int i = 0;
        while (true) {
            fbnm[] fbnmVarArr = this.c;
            if (i >= fbnmVarArr.length) {
                return;
            }
            fbnmVarArr[i].e();
            i++;
        }
    }
}
