package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfv {
    public static final Object a(pei peiVar, String str, fcxy fcxyVar) {
        Object objA = peiVar.a(str, new fdap() { // from class: pfu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                pjl pjlVar = (pjl) obj;
                pjlVar.getClass();
                return Boolean.valueOf(pjlVar.j());
            }
        }, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
