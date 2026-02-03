package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergg extends RuntimeException {
    public ergg(String str) {
        super(str);
    }

    public static Object a(ergf ergfVar) {
        try {
            return ergfVar.a();
        } catch (Exception e) {
            throw new ergg(e);
        }
    }

    public ergg(String str, Throwable th) {
        super(str, th);
    }

    public ergg(Throwable th) {
        super(th);
    }
}
