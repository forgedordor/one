package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqkr implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        if (threadNewThread.getContextClassLoader() == null) {
            threadNewThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
        }
        return threadNewThread;
    }
}
