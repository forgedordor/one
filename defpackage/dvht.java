package defpackage;

import android.os.Process;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvht extends dvhm {
    public static final /* synthetic */ int b = 0;
    private static Reference c = new WeakReference(null);

    public static synchronized dvht b() {
        dvht dvhtVar = (dvht) c.get();
        if (dvhtVar != null) {
            return dvhtVar;
        }
        dvht dvhtVar2 = new dvht();
        c = new WeakReference(dvhtVar2);
        return dvhtVar2;
    }

    @Override // defpackage.dvhm
    protected final eosc a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        eosw eoswVar = new eosw();
        eoswVar.c(true);
        eoswVar.d("LIT-LimitedExecutor #%d");
        eoswVar.a = new ThreadFactory() { // from class: dvhs
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                int i = dvht.b;
                return new Thread(new Runnable() { // from class: dvhr
                    @Override // java.lang.Runnable
                    public final void run() throws SecurityException, IllegalArgumentException {
                        int i2 = dvht.b;
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                });
            }
        };
        return eosj.a(new dvhl(scheduledExecutorService, "LimitedThrExecutor", 0, 10, timeUnit, linkedBlockingDeque, eosw.b(eoswVar)));
    }
}
