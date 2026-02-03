package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smm implements ThreadFactory {
    private final String a;
    private final AtomicInteger b = new AtomicInteger(1);

    public smm(String str) {
        this.a = str.concat("-thread-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a + this.b.getAndIncrement());
    }
}
