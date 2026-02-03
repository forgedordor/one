package defpackage;

import android.os.Binder;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqka {
    public static dqnb a(dqne dqneVar, dqmu dqmuVar) {
        return ((dqmp) dqmuVar).c ? dqneVar.a(dqmuVar) : dqnb.a;
    }

    public static ThreadFactory b(String str, ThreadFactory threadFactory) {
        eosw eoswVar = new eosw();
        eoswVar.c(true);
        eoswVar.d(str.concat(" Thread #%d"));
        eoswVar.a = threadFactory;
        return eosw.b(eoswVar);
    }

    public static ExecutorService c(dqmu dqmuVar, ThreadFactory threadFactory, final dqnb dqnbVar) {
        dqmp dqmpVar = (dqmp) dqmuVar;
        if (dqmpVar.c) {
            threadFactory = new dqng(threadFactory, dqnbVar);
        }
        if (dqmpVar.d != dqmw.a) {
            threadFactory = new dqmy(threadFactory);
        }
        return new elfi(dqmpVar.b, threadFactory, new Runnable() { // from class: dqjr
            @Override // java.lang.Runnable
            public final void run() {
                dqnbVar.c();
            }
        }, new Runnable() { // from class: dqjs
            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                dqnbVar.b();
            }
        });
    }
}
