package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devg {
    private static devf a;

    public static synchronized devf a() {
        if (a == null) {
            b(new devn());
        }
        return a;
    }

    public static synchronized void b(devf devfVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = devfVar;
    }
}
