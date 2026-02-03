package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyd {
    public static fcyh a(fcyh fcyhVar, fcyh fcyhVar2) {
        fcyhVar2.getClass();
        return fcyhVar2 == fcyi.a ? fcyhVar : (fcyh) fcyhVar2.fold(fcyhVar, new fdat() { // from class: fcyc
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                fcyh fcyhVar3 = (fcyh) obj;
                fcyf fcyfVar = (fcyf) obj2;
                fcyhVar3.getClass();
                fcyfVar.getClass();
                fcyh fcyhVarMinusKey = fcyhVar3.minusKey(fcyfVar.getKey());
                fcyi fcyiVar = fcyi.a;
                if (fcyhVarMinusKey == fcyiVar) {
                    return fcyfVar;
                }
                fcxz fcxzVar = fcya.k;
                fcya fcyaVar = (fcya) fcyhVarMinusKey.get(fcxzVar);
                if (fcyaVar == null) {
                    return new fcxx(fcyhVarMinusKey, fcyfVar);
                }
                fcyh fcyhVarMinusKey2 = fcyhVarMinusKey.minusKey(fcxzVar);
                return fcyhVarMinusKey2 == fcyiVar ? new fcxx(fcyfVar, fcyaVar) : new fcxx(new fcxx(fcyhVarMinusKey2, fcyfVar), fcyaVar);
            }
        });
    }
}
