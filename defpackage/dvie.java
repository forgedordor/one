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
public final class dvie extends dvhm {
    public static final /* synthetic */ int b = 0;
    private static Reference c = new WeakReference(null);

    public static synchronized dvie b() {
        dvie dvieVar = (dvie) c.get();
        if (dvieVar != null) {
            return dvieVar;
        }
        dvie dvieVar2 = new dvie();
        c = new WeakReference(dvieVar2);
        return dvieVar2;
    }

    @Override // defpackage.dvhm
    protected final eosc a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        eosw eoswVar = new eosw();
        eoswVar.c(true);
        eoswVar.d("LIT-UnlimitedExecutor #%d");
        eoswVar.a = new ThreadFactory() { // from class: dvic
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                int i = dvie.b;
                return new Thread(new Runnable() { // from class: dvid
                    @Override // java.lang.Runnable
                    public final void run() throws SecurityException, IllegalArgumentException {
                        int i2 = dvie.b;
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                });
            }
        };
        dvhl dvhlVar = new dvhl(scheduledExecutorService, "UnlimitedThrExecutor", 50, 50, timeUnit, linkedBlockingDeque, eosw.b(eoswVar));
        dvhlVar.allowCoreThreadTimeOut(true);
        return eosj.a(dvhlVar);
    }
}
