package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvu {
    public static final Object a(fcyh fcyhVar, Object obj, Object obj2, fdat fdatVar, fcxy fcxyVar) {
        Object objA;
        Object objB = fdzp.b(fcyhVar, obj2);
        try {
            fdxg fdxgVar = new fdxg(fcxyVar, fcyhVar);
            if (fdatVar instanceof fcyt) {
                fdcm.e(fdatVar, 2);
                objA = fdatVar.a(obj, fdxgVar);
            } else {
                objA = fcym.a(fdatVar, obj, fdxgVar);
            }
            fdzp.c(fcyhVar, objB);
            if (objA == fcyl.a) {
                fcxyVar.getClass();
            }
            return objA;
        } catch (Throwable th) {
            fdzp.c(fcyhVar, objB);
            throw th;
        }
    }
}
