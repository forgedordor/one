package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fctl {
    public static final Object a(Throwable th) {
        th.getClass();
        return new fctj(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof fctj) {
            throw ((fctj) obj).a;
        }
    }
}
