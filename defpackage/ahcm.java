package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahcm implements fdat {
    final /* synthetic */ ahco a;

    public ahcm(ahco ahcoVar) {
        this.a = ahcoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ahcz ahczVar = this.a.i.e;
            if (ahczVar == null) {
                ahczVar = ahcz.a;
            }
            ahczVar.getClass();
            ahcx.c(ahczVar, hmlVar, 0);
        }
        return fctx.a;
    }
}
