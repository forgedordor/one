package defpackage;

import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqjp implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ StrictMode.ThreadPolicy b;

    public /* synthetic */ dqjp(ThreadFactory threadFactory, StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadFactory;
        this.b = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        final StrictMode.ThreadPolicy threadPolicy = this.b;
        return this.a.newThread(new Runnable() { // from class: dqjv
            @Override // java.lang.Runnable
            public final void run() {
                StrictMode.setThreadPolicy(threadPolicy);
                runnable.run();
            }
        });
    }
}
