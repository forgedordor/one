package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkea implements fdat {
    final /* synthetic */ dkdm a;

    public dkea(dkdm dkdmVar) {
        this.a = dkdmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkef.e(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
