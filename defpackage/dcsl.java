package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsl implements dcrl {
    public final dcrz a;
    private final dcrv b;
    private final Executor c;
    private final String d;
    private final dcrk e;
    private IDroidGuardHandle f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final dcrf h;

    public dcsl(dcrv dcrvVar, Executor executor, dcrz dcrzVar, String str, dcrk dcrkVar, dcrf dcrfVar, IDroidGuardHandle iDroidGuardHandle) {
        this.b = dcrvVar;
        this.c = executor;
        this.a = dcrzVar;
        this.d = str;
        this.e = dcrkVar;
        this.h = dcrfVar;
        this.f = iDroidGuardHandle;
    }

    private static boolean d(IDroidGuardHandle iDroidGuardHandle) {
        return iDroidGuardHandle == null || iDroidGuardHandle.asBinder() == null || !iDroidGuardHandle.asBinder().pingBinder();
    }

    private final synchronized byte[] e(Map map) {
        byte[] bArrSnapshot;
        if (d(this.f)) {
            throw new dcff(new Status(20, "The handle object on the module side is unreachable"));
        }
        try {
            bArrSnapshot = this.f.snapshot(map);
            if (bArrSnapshot == null) {
                throw new dcff(new Status(8, "Received null response on snapshot"));
            }
        } catch (RemoteException e) {
            throw dcrn.b(e, "Failed to get a snapshot");
        }
        return bArrSnapshot;
    }

    private final synchronized void f(dcko dckoVar, dcrf dcrfVar) {
        dcrk dcrkVar = this.e;
        if (((dcrh) dcrkVar).c && d(this.f)) {
            dcrfVar.c(2, dcre.COARSE);
            this.f = ((dcro) dcsg.b(dckoVar, this.d, dcrkVar, this.b.a(), dcrfVar)).a;
        }
    }

    @Override // defpackage.dcrl
    public final defn a(final Map map) {
        defn defnVarD;
        dcrk dcrkVar = this.e;
        AtomicBoolean atomicBoolean = this.g;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (atomicBoolean.get()) {
            defnVarD = degc.b(new dcff(new Status(10, "DroidGuard handle is closed")));
        } else {
            defnVarD = this.b.d(true != ((dcrh) dcrkVar).c ? 2 : 1, 2, new dcru() { // from class: dcsj
                @Override // defpackage.dcru
                public final Object a(dcko dckoVar) {
                    return this.a.b(dckoVar, map);
                }
            });
        }
        Executor executor = this.c;
        defn defnVarA = dcsn.a(executor, defnVarD, ((dcrh) dcrkVar).b);
        defnVarA.o(executor, new defb() { // from class: dcsk
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                this.a.a.a(35503, defnVar, jCurrentTimeMillis, System.currentTimeMillis(), SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        });
        return defnVarA;
    }

    public final synchronized dcrm b(dcko dckoVar, Map map) {
        dcrf dcrfVarClone;
        byte[] bArrE;
        dcrfVarClone = this.h.clone();
        f(dckoVar, dcrfVarClone);
        dcre dcreVar = dcre.COARSE;
        dcrfVarClone.c(14, dcreVar);
        bArrE = e(map);
        dcrfVarClone.c(15, dcreVar);
        return new dcrm(dcrb.b(dcrb.a(dckoVar.c, bArrE, dcrfVarClone.b())));
    }

    public final synchronized void c() {
        if (d(this.f)) {
            Log.w("DGInternalHandle", "The handle object on the module side is unreachable for close");
            return;
        }
        try {
            this.f.close();
        } catch (RemoteException e) {
            Log.e("DGInternalHandle", "Error while closing the handle: ".concat(String.valueOf(e.getMessage())));
        }
        this.f = null;
    }

    @Override // defpackage.dcrl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.getAndSet(true)) {
            Log.w("DGInternalHandle", "Handle is already closed");
        } else {
            this.b.d(2, 3, new dcru() { // from class: dcsh
                @Override // defpackage.dcru
                public final Object a(dcko dckoVar) {
                    this.a.c();
                    return null;
                }
            }).t(new defe() { // from class: dcsi
                @Override // defpackage.defe
                public final void d(Exception exc) {
                    Log.w("DGInternalHandle", "Client disconnected on close: ".concat(String.valueOf(exc.getMessage())));
                }
            });
        }
    }
}
