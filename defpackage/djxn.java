package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxn implements fdat {
    final /* synthetic */ djym a;
    final /* synthetic */ hox b;

    public djxn(djym djymVar, hox hoxVar) {
        this.a = djymVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djym djymVar = this.a;
            djyg.m(djymVar.b, djymVar.g, (ije) djyg.b(this.b).d(), hmlVar, 0, 0);
        }
        return fctx.a;
    }
}
