package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzme implements dzlo {
    public final eosd a;
    public final eygg b;

    public dzme(dzln dzlnVar, final Context context, eosd eosdVar, eygg eyggVar, fcsu fcsuVar, final fcsu fcsuVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        dzlnVar.a(eosdVar, eyggVar, fcsuVar);
        this.a = eosdVar;
        this.b = eyggVar;
        ejxx.a(new ejxr() { // from class: dzmc
            @Override // defpackage.ejxr
            public final Object get() {
                dzme dzmeVar = this.a;
                Context context2 = context;
                synchronized (dzmeVar) {
                    String strB = dzjr.b();
                    String strX = a.x(strB, ".trace");
                    File file = new File(context2.getFilesDir(), a.v(strB, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).q("Could not create directory");
                        return ejud.a;
                    }
                    File file2 = new File(file, strX);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException e) {
                        ((ekrd) ((ekrd) ((ekrd) dzfq.a.e()).g(e)).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).q("Exception when clearing trace file.");
                    }
                    return ejwi.j(file2);
                }
            }
        });
        ejxx.a(new ejxr() { // from class: dzmd
            @Override // defpackage.ejxr
            public final Object get() {
                return (dzmf) fcsuVar2.b();
            }
        });
    }

    public final synchronized void a() {
    }

    @Override // defpackage.dzlo
    public final void n() {
        eork.l(new Runnable() { // from class: dzmb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, this.a);
    }
}
