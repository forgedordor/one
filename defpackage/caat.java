package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caat implements caap {
    private static final cqce a = cqce.g("BugleCms", "EmptyCmsWorkItemErrorHandler");

    @Override // defpackage.caap
    public final Object a(Object obj, Object obj2, cayy cayyVar, caas caasVar, Exception exc, fcxy fcxyVar) {
        String canonicalName = caasVar.getClass().getCanonicalName();
        if (exc != null) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Permanent error happened for ".concat(String.valueOf(canonicalName)));
            cqbdVarE.s(exc);
        } else {
            a.r(a.a(canonicalName, "Permanent error happened for ", " with no specified error."));
        }
        return fctx.a;
    }
}
