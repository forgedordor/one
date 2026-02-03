package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fceq implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcfd b;

    public fceq(fcfd fcfdVar, Status status) {
        this.a = status;
        this.b = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfd fcfdVar = this.b;
        fbnv fbnvVar = fcfdVar.r.a;
        fbnv fbnvVar2 = fbnv.SHUTDOWN;
        if (fbnvVar == fbnvVar2) {
            return;
        }
        Status status = this.a;
        fcfdVar.s = status;
        fchm fchmVar = fcfdVar.q;
        fcbc fcbcVar = fcfdVar.p;
        fcfdVar.q = null;
        fcfdVar.p = null;
        fcfdVar.b(fbnvVar2);
        fcfdVar.h.c();
        if (fcfdVar.n.isEmpty()) {
            fcfdVar.e();
        }
        fcfdVar.g.d();
        fbtj fbtjVar = fcfdVar.k;
        if (fbtjVar != null) {
            fbtjVar.a();
            fcfdVar.k = null;
            fcfdVar.u = null;
        }
        fbtj fbtjVar2 = fcfdVar.l;
        if (fbtjVar2 != null) {
            fbtjVar2.a();
            fcfdVar.m.n(status);
            fcfdVar.l = null;
            fcfdVar.m = null;
        }
        if (fchmVar != null) {
            fchmVar.n(status);
        }
        if (fcbcVar != null) {
            fcbcVar.n(status);
        }
    }
}
