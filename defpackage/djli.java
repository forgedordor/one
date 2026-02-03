package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djli implements fdat {
    final /* synthetic */ djml a;

    public djli(djml djmlVar) {
        this.a = djmlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dktq dktqVar = this.a.h;
            if (dktqVar != null) {
                djmd.a(null, dktqVar.c, dktqVar.a, false, hmlVar, 0, 9);
            }
        }
        return fctx.a;
    }
}
