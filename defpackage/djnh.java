package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnh implements fdat {
    final /* synthetic */ djmp a;

    public djnh(djmp djmpVar) {
        this.a = djmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dktq dktqVar = this.a.f;
            if (dktqVar != null) {
                dtdi.e(dktqVar.c, null, false, null, null, null, hxe.d(-2105001713, new djng(dktqVar), hmlVar), hmlVar, 805306368, 510);
            }
        }
        return fctx.a;
    }
}
