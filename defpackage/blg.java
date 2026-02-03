package defpackage;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blg implements blm {
    final lvy a = new lvy();
    private final Map b = new HashMap();

    public final void a(Object obj) {
        this.a.j(new blf(obj));
    }

    @Override // defpackage.blm
    public final ListenableFuture b() {
        return kol.a(new koi() { // from class: blc
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                ScheduledExecutorService scheduledExecutorServiceA = bpn.a();
                final blg blgVar = this.a;
                scheduledExecutorServiceA.execute(new Runnable() { // from class: blb
                    @Override // java.lang.Runnable
                    public final void run() {
                        blf blfVar = (blf) blgVar.a.a();
                        kog kogVar2 = kogVar;
                        if (blfVar == null) {
                            kogVar2.c(new IllegalStateException("Observable has not yet been initialized with a value."));
                        } else {
                            kogVar2.b(blfVar.a);
                        }
                    }
                });
                return blgVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
            }
        });
    }

    @Override // defpackage.blm
    public final void c(Executor executor, bll bllVar) {
        Map map = this.b;
        synchronized (map) {
            final ble bleVar = (ble) map.get(bllVar);
            if (bleVar != null) {
                bleVar.b();
            }
            final ble bleVar2 = new ble(executor, bllVar);
            map.put(bllVar, bleVar2);
            bpn.a().execute(new Runnable() { // from class: bla
                @Override // java.lang.Runnable
                public final void run() {
                    blg blgVar = this.a;
                    ble bleVar3 = bleVar;
                    if (bleVar3 != null) {
                        blgVar.a.k(bleVar3);
                    }
                    blgVar.a.g(bleVar2);
                }
            });
        }
    }

    @Override // defpackage.blm
    public final void d(bll bllVar) {
        Map map = this.b;
        synchronized (map) {
            final ble bleVar = (ble) map.remove(bllVar);
            if (bleVar != null) {
                bleVar.b();
                bpn.a().execute(new Runnable() { // from class: bkz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.k(bleVar);
                    }
                });
            }
        }
    }
}
