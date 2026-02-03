package defpackage;

import android.content.BroadcastReceiver;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxa implements dxji {
    public static final eksp a = eksp.c("GnpSdk");
    private final eosc b;
    private final egoc c;
    private final egpm d;

    public dxxa(eosc eoscVar, egoc egocVar, egpm egpmVar) {
        this.b = eoscVar;
        this.c = egocVar;
        this.d = egpmVar;
    }

    @Override // defpackage.dxji
    public final void a(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, dxfy dxfyVar) {
        int iHashCode = runnable.hashCode();
        ((eksl) ((eksl) a.h()).h("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl", "executeInBroadcast", 107, "GnpExecutorApiImpl.java")).r("Submitting Broadcast execution [%d] to tiktok executor.", iHashCode);
        ListenableFuture listenableFutureSubmit = this.b.submit(eiid.k(runnable));
        egoc egocVar = this.c;
        egocVar.h(listenableFutureSubmit);
        egocVar.f(listenableFutureSubmit, 60L, TimeUnit.SECONDS);
        final dxjh dxjhVar = new dxjh(pendingResult, z, iHashCode);
        if (!dxfyVar.e()) {
            egpm egpmVar = this.d;
            Runnable runnable2 = new Runnable() { // from class: dxwy
                @Override // java.lang.Runnable
                public final void run() {
                    dxjhVar.a();
                }
            };
            Long lB = dxfyVar.b();
            lB.getClass();
            egpmVar.postDelayed(runnable2, Math.max(0L, lB.longValue() - (SystemClock.uptimeMillis() - dxfyVar.a())));
        }
        listenableFutureSubmit.b(new dxwz(dxjhVar, iHashCode), eoqg.a);
    }

    @Override // defpackage.dxji
    public final void b(Runnable runnable) throws PackageManager.NameNotFoundException {
        ListenableFuture listenableFutureSubmit = this.b.submit(eiid.k(runnable));
        egoc egocVar = this.c;
        egocVar.g(listenableFutureSubmit);
        egocVar.f(listenableFutureSubmit, 60L, TimeUnit.SECONDS);
    }
}
