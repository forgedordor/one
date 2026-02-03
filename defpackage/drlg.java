package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlg implements ThreadFactory {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/concurrent/ImeThreadFactory");
    public final int b;
    public final drln c;
    private final String d;
    private final AtomicInteger e = new AtomicInteger(0);

    public drlg(String str, int i, drln drlnVar) {
        this.d = str;
        this.b = i;
        this.c = drlnVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        drlf drlfVar = new drlf(this, runnable, this.d + "-" + this.e.incrementAndGet());
        drlfVar.setDaemon(false);
        return drlfVar;
    }
}
