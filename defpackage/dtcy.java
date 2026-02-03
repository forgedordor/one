package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcy implements fdat {
    final /* synthetic */ float a;
    final /* synthetic */ float b;

    public dtcy(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ecz.b(egq.m(ics.e, this.a, this.b), hmlVar, 0);
        }
        return fctx.a;
    }
}
