package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditj implements fdat {
    final /* synthetic */ ditl a;
    final /* synthetic */ disb b;

    public ditj(ditl ditlVar, disb disbVar) {
        this.a = ditlVar;
        this.b = disbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwx.a(this.a, null, null, null, "banner_card_content_anim", null, hxe.d(1779423906, new diti(this.b), hmlVar), hmlVar, 1597440, 46);
        }
        return fctx.a;
    }
}
