package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlm implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;

    public dmlm(int i, float f, int i2) {
        this.a = i;
        this.b = f;
        this.c = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gkd.a(jqq.a(this.a, hmlVar, 0), jqu.b(this.c, hmlVar), ifi.a(ics.e, this.b), ije.d, hmlVar, 3072, 0);
        }
        return fctx.a;
    }
}
