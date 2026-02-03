package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcyr {
    public static final Object a(fdat fdatVar, Object obj, fcxy fcxyVar) {
        fdatVar.getClass();
        fcyh fcyhVarU = fcxyVar.u();
        Object fcypVar = fcyhVarU == fcyi.a ? new fcyp(fcxyVar) : new fcyq(fcxyVar, fcyhVarU);
        fdcm.e(fdatVar, 2);
        return fdatVar.a(obj, fcypVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fcxy b(fdat fdatVar, Object obj, fcxy fcxyVar) {
        fdatVar.getClass();
        if (fdatVar instanceof fcyt) {
            return ((fcyt) fdatVar).c(obj, fcxyVar);
        }
        fcyh fcyhVarU = fcxyVar.u();
        return fcyhVarU == fcyi.a ? new fcyn(fcxyVar, fdatVar, obj) : new fcyo(fcxyVar, fcyhVarU, fdatVar, obj);
    }

    public static final fcxy c(fcxy fcxyVar) {
        fcxyVar.getClass();
        fcyv fcyvVar = fcxyVar instanceof fcyv ? (fcyv) fcxyVar : null;
        if (fcyvVar != null && (fcxyVar = fcyvVar.D) == null) {
            fcya fcyaVar = (fcya) fcyvVar.u().get(fcya.k);
            fcxyVar = fcyaVar != null ? fcyaVar.e(fcyvVar) : fcyvVar;
            fcyvVar.D = fcxyVar;
        }
        return fcxyVar;
    }
}
