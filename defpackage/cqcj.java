package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcj implements ThreadFactory {
    public final String a;
    public final int b;
    private final AtomicInteger c;

    public cqcj(String str) {
        this.c = new AtomicInteger(1);
        this.a = str;
        this.b = 5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a + "#" + this.c.getAndIncrement());
        thread.setPriority(this.b);
        return thread;
    }

    public cqcj(String str, int i) {
        this.c = new AtomicInteger(1);
        this.a = str;
        this.b = i;
    }
}
