package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqgb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cqgf a;

    public cqgb(cqgf cqgfVar) {
        this.a = cqgfVar;
    }

    public final void a(Network network) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        cqghVar.A("onAvailable");
        cqghVar.F(network);
        AtomicReference atomicReference = cqghVar.r;
        if (atomicReference.get() == clie.c && cqghVar.G() && !cqghVar.t.get()) {
            ekrw ekrwVarH = cqgh.c.h();
            ekrwVarH.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$1", "onDataConnectionAvaiable", 1104, "ConnectivityUtilImpl.java")).q("Active cellular network. Ignoring due to eligible for manual satellite.");
            cqghVar.C(clif.a, "onAvailable");
            return;
        }
        clie clieVar = (clie) atomicReference.get();
        clie clieVar2 = clie.b;
        if (clieVar.equals(clieVar2)) {
            cqghVar.C(clif.b, "onAvailable");
        } else if (((clie) cqghVar.s.get()).equals(clieVar2) && ((clie) atomicReference.get()).a()) {
            cqghVar.C(clif.d, "onAvailable");
        }
        if (cqghVar.G()) {
            cqghVar.C(clif.e, "onAvailable");
        }
    }

    public final void b(String str) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        cqghVar.A(str);
        cqghVar.E(clie.e);
        if (!cqghVar.G() || cqghVar.t.get()) {
            return;
        }
        int i = cqghVar.u.get();
        if (i == -1 || i == 4 || i == 5) {
            cqghVar.C(clif.a, "onNoDataConnection");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(final Network network) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        if (((asaq) cqghVar.y.b()).a()) {
            cqghVar.D(new Runnable() { // from class: cqfy
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.a.a(network);
                }
            });
        } else {
            a(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        if (((asaq) cqghVar.y.b()).a()) {
            cqghVar.D(new Runnable() { // from class: cqga
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.a.b("onLost");
                }
            });
        } else {
            b("onLost");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() throws InterruptedException {
        cqgh cqghVar = this.a.a;
        if (((asaq) cqghVar.y.b()).a()) {
            cqghVar.D(new Runnable() { // from class: cqfz
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.a.b("onUnavailable");
                }
            });
        } else {
            b("onUnavailable");
        }
    }
}
