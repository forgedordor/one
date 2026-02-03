package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdaa {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                fcsw.a(th, th2);
            }
        }
    }
}
