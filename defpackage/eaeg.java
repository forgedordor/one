package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaeg implements eaep {
    private static boolean b;
    public final ejxr a;
    private final ejxr c;
    private final int d;

    public eaeg(ejxr ejxrVar) {
        ejxr ejxrVar2 = new ejxr() { // from class: eaed
            @Override // defpackage.ejxr
            public final Object get() {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return Boolean.valueOf(z);
            }
        };
        this.c = ejxrVar;
        this.d = Math.max(5, 10);
        this.a = ejxrVar2;
    }

    @Override // defpackage.eaep
    public final void a() {
        synchronized (eaeg.class) {
            if (!b) {
                Runnable runnable = new Runnable() { // from class: eaee
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((Boolean) this.a.a.get()).booleanValue()) {
                            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                };
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                eosd eosdVar = (eosd) this.c.get();
                eadw.a(eosdVar.schedule(new eaef(runnable, eosdVar, j, timeUnit), j, timeUnit));
                b = true;
            }
        }
    }
}
