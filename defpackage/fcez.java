package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcez implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcfb b;

    public fcez(fcfb fcfbVar, Status status) {
        this.a = status;
        this.b = fcfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfb fcfbVar = this.b;
        fcfd fcfdVar = fcfbVar.c;
        if (fcfdVar.r.a == fbnv.SHUTDOWN) {
            return;
        }
        fchm fchmVar = fcfdVar.q;
        fcbc fcbcVar = fcfbVar.a;
        if (fchmVar == fcbcVar) {
            fcfdVar.q = null;
            fcfdVar.h.c();
            fcfdVar.b(fbnv.IDLE);
            return;
        }
        if (fcfdVar.p == fcbcVar) {
            ejwl.p(fcfdVar.r.a == fbnv.CONNECTING, "Expected state is CONNECTING, actual state is %s", fcfdVar.r.a);
            fcex fcexVar = fcfdVar.h;
            fbop fbopVar = (fbop) fcexVar.a.get(fcexVar.b);
            int i = fcexVar.c + 1;
            fcexVar.c = i;
            if (i >= fbopVar.b.size()) {
                fcexVar.b++;
                fcexVar.c = 0;
            }
            if (fcexVar.b < fcexVar.a.size()) {
                fcfdVar.h();
                return;
            }
            fcfdVar.p = null;
            fcexVar.c();
            Status status = this.a;
            fbtk fbtkVar = fcfdVar.g;
            fbtkVar.d();
            ejwl.b(!status.f(), "The error status must not be OK");
            fcfdVar.d(new fbnw(fbnv.TRANSIENT_FAILURE, status));
            if (fcfdVar.e) {
                return;
            }
            if (fcfdVar.u == null) {
                fcfdVar.u = new fcdg();
            }
            long jA = fcfdVar.u.a() - fcfdVar.j.a(TimeUnit.NANOSECONDS);
            fcfdVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", fcfd.k(status), Long.valueOf(jA));
            ejwl.m(fcfdVar.k == null, "previous reconnectTask is not done");
            fcfdVar.k = fbtkVar.a(new fcem(fcfdVar), jA, TimeUnit.NANOSECONDS, fcfdVar.b);
        }
    }
}
