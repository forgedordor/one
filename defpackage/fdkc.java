package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdkc {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(fcxy fcxyVar) {
        Object objA;
        if (fcxyVar instanceof fdye) {
            return ((fdye) fcxyVar).toString();
        }
        try {
            objA = fcxyVar + "@" + b(fcxyVar);
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        if (fctk.c(objA) != null) {
            objA = fcxyVar.getClass().getName() + "@" + b(fcxyVar);
        }
        return (String) objA;
    }
}
