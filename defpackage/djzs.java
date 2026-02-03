package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djzs implements fdat {
    final /* synthetic */ djzw a;

    public djzs(djzw djzwVar) {
        this.a = djzwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djzw djzwVar = this.a;
            dtgo.a(djzwVar.d, djzwVar.e, null, false, null, null, hmlVar, 0, 60);
        }
        return fctx.a;
    }
}
