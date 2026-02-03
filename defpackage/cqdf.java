package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class cqdf implements Runnable, cqdd {
    public static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable");
    public final String h;

    public cqdf(String str) {
        this.h = str;
    }

    public static void a(Context context, cqdf cqdfVar) {
        Executor executorA = cqda.a();
        Map map = f;
        synchronized (map) {
            map.put(cqdfVar, Long.valueOf(System.currentTimeMillis()));
        }
        try {
            executorA.execute(new cqde(cqdfVar.h, cqdfVar, context));
        } catch (RejectedExecutionException e) {
            cqda.b(cqdfVar, e);
            throw e;
        }
    }

    public final String toString() {
        return this.h;
    }
}
