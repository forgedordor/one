package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efro {
    public static final efro a = new efro(new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new ThreadFactory() { // from class: efrn
        public final /* synthetic */ String a = "SetupCompatServiceInvoker";

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            efro efroVar = efro.a;
            return new Thread(runnable, this.a);
        }
    }));
    public final Executor b;

    private efro(Executor executor) {
        this.b = executor;
    }
}
