package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djfv implements fdat {
    final /* synthetic */ djfy a;

    public djfv(djfy djfyVar) {
        this.a = djfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djfx.d(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
