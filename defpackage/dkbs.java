package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkbs implements fdat {
    final /* synthetic */ dkbu a;

    public dkbs(dkbu dkbuVar) {
        this.a = dkbuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkbt.b(this.a.d, hmlVar, 0);
        }
        return fctx.a;
    }
}
