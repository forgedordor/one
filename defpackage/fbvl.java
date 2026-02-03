package defpackage;

import android.os.IBinder;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvl extends fbvm implements fcmc {
    public final List a;
    private fcmd b;

    public fbvl(fchy fchyVar, fbmw fbmwVar, List list, IBinder iBinder) {
        super(fchyVar, fbmwVar, fbpn.a(fbvl.class, "from ".concat(String.valueOf(String.valueOf(fbmwVar.a(fbpb.a))))));
        this.a = list;
        y(fbwm.b(iBinder, this.i));
    }

    @Override // defpackage.fbvm
    protected final fbwb C(int i) {
        return new fbvy(this, this.k, i);
    }

    final synchronized Status b(fcma fcmaVar, String str, fbrg fbrgVar) {
        if (x()) {
            return Status.p.withDescription("transport is shutdown");
        }
        ((fbuu) this.b).a.a(fcmaVar, str, fbrgVar);
        return Status.b;
    }

    public final synchronized void e(fcmd fcmdVar) {
        this.b = fcmdVar;
        if (x()) {
            z(5);
            k();
            m();
            return;
        }
        fbwm fbwmVar = this.m;
        fbwmVar.getClass();
        s(fbwmVar);
        if (x()) {
            return;
        }
        z(3);
        fbmw fbmwVar = this.k;
        ((fbuu) fcmdVar).a.c();
        this.k = fbmwVar;
    }

    @Override // defpackage.fcmc
    public final synchronized void f() {
        u(Status.b, false);
    }

    @Override // defpackage.fbvm
    public final void k() {
        Runnable runnableB;
        fcmd fcmdVar = this.b;
        if (fcmdVar != null) {
            fbuu fbuuVar = (fbuu) fcmdVar;
            fbuuVar.a.b();
            fbuv fbuvVar = fbuuVar.b;
            synchronized (fbuvVar) {
                fbuvVar.c--;
                runnableB = fbuvVar.b();
            }
            if (runnableB != null) {
                runnableB.run();
            }
        }
    }

    @Override // defpackage.fcmc
    public final synchronized void o(Status status) {
        u(status, true);
    }

    @Override // defpackage.fbvm
    public final void j(Status status) {
    }
}
