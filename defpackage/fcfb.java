package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfb implements fchl {
    final fcbc a;
    boolean b = false;
    final /* synthetic */ fcfd c;

    public fcfb(fcfd fcfdVar, fcbc fcbcVar) {
        this.c = fcfdVar;
        this.a = fcbcVar;
    }

    @Override // defpackage.fchl
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.fchl
    public final void b() {
        fcfd fcfdVar = this.c;
        fcfdVar.d.a(2, "READY");
        fcfdVar.g.execute(new fcey(this));
    }

    @Override // defpackage.fchl
    public final void c(Status status) {
        Object[] objArr = {this.a.c(), fcfd.k(status)};
        fcfd fcfdVar = this.c;
        fcfdVar.d.b(2, "{0} SHUTDOWN with {1}", objArr);
        this.b = true;
        fcfdVar.g.execute(new fcez(this, status));
    }

    @Override // defpackage.fchl
    public final void d() {
        ejwl.m(this.b, "transportShutdown() must be called before transportTerminated().");
        fcbc fcbcVar = this.a;
        Object[] objArr = {fcbcVar.c()};
        fcfd fcfdVar = this.c;
        fcfdVar.d.b(2, "{0} Terminated", objArr);
        fbpi.c(fcfdVar.c.f, fcbcVar);
        fcfdVar.f(fcbcVar, false);
        Iterator it = fcfdVar.f.iterator();
        if (!it.hasNext()) {
            fcfdVar.g.execute(new fcfa(this));
        } else {
            fcbcVar.q();
            throw null;
        }
    }

    @Override // defpackage.fchl
    public final void e() {
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
