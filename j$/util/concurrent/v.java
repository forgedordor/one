package j$.util.concurrent;

/* loaded from: classes9.dex */
public final class v extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
