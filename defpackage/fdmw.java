package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmw {
    public static final ThreadLocal a = new ThreadLocal();

    public static final fdkw a() {
        ThreadLocal threadLocal = a;
        fdkw fdkwVar = (fdkw) threadLocal.get();
        if (fdkwVar != null) {
            return fdkwVar;
        }
        fdik fdikVar = new fdik(Thread.currentThread());
        threadLocal.set(fdikVar);
        return fdikVar;
    }
}
