package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpv extends egpr implements lun {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private egqc b;
    private final fcsu c;
    private final lxq d;
    private final lvc e;
    private final egpu f = new egpu();
    private boolean g = false;
    private boolean h = false;
    private final Set i = new HashSet();

    public egpv(fcsu fcsuVar, lxq lxqVar, lvc lvcVar) {
        this.c = fcsuVar;
        this.d = lxqVar;
        lvcVar.c(this);
        this.e = lvcVar;
    }

    private final void l() {
        this.h = true;
        egpu egpuVar = this.f;
        ecem.f(egpuVar);
        egpuVar.a.clear();
        egpuVar.b = null;
        this.g = true;
        egqc egqcVar = this.b;
        egqcVar.e = true;
        egpn egpnVar = egqcVar.b;
        egpnVar.g();
        for (egqg egqgVar : egqcVar.c) {
            if (egqgVar.b) {
                try {
                    egpnVar.b(egqgVar.a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(egqgVar))), e);
                }
            } else {
                egqc.a((egps) egpnVar.b(egqgVar.a), egqgVar);
            }
            egqgVar.c(egqcVar);
        }
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        if (this.g) {
            return;
        }
        l();
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        if (this.g) {
            egqc egqcVar = this.b;
            egqcVar.e = false;
            Iterator it = egqcVar.c.iterator();
            while (it.hasNext()) {
                ((egqg) it.next()).c(null);
            }
            this.g = false;
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        egqc egqcVar = this.b;
        ejwl.m(!egqcVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        egqcVar.b.c();
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        this.b = (egqc) new lxo(this.d).a(egqc.class);
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.c((egps) it.next());
        }
        set.clear();
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ejwl.m(!this.g, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        l();
    }

    @Override // defpackage.egpr
    protected final void i(ListenableFuture listenableFuture, Object obj, egps egpsVar) {
        ecem.c();
        ejwl.m(!((fr) this.c.b()).ag(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        eiew eiewVar = eifh.a;
        eifn eifnVarC = eidc.c();
        if (eifnVarC != null) {
            eiev eievVarJ = eifnVarC.j(eifh.a);
            if (eievVarJ.b() && ((Boolean) eievVarJ.a()).booleanValue()) {
                StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.b.b(listenableFuture, obj, egpsVar);
        if (this.g) {
            return;
        }
        Throwable th = new Throwable();
        th.fillInStackTrace();
        ((ekrd) ((ekrd) ((ekrd) a.j()).g(th)).h("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 216, "FuturesMixinImpl.java")).q("listen() called outside listening window");
        egpu egpuVar = this.f;
        egpuVar.a.add(egpsVar);
        egpuVar.b = eiid.k(new egpt());
        ecem.f(egpuVar);
        ecem.e(egpuVar);
    }

    @Override // defpackage.egpr
    public final void j(egps egpsVar) {
        ecem.c();
        ejwl.m(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        ejwl.m(!this.e.a().a(lvb.d), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        ejwl.m(!this.g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        egqc egqcVar = this.b;
        if (egqcVar != null) {
            egqcVar.c(egpsVar);
        } else {
            this.i.add(egpsVar);
        }
    }

    @Override // defpackage.egpr
    public final void k(egpq egpqVar, egpo egpoVar, egps egpsVar) {
        ecem.c();
        ejwl.m(!((fr) this.c.b()).ag(), "Listen called outside safe window. State loss is possible.");
        this.b.b(egpqVar.a, egpoVar.a, egpsVar);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }
}
