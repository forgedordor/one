package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuw implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ long b;

    public fuw(fdat fdatVar, long j) {
        this.a = fdatVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1485058879);
            hnj.a(fop.a.c(Float.valueOf(ije.a(this.b))), this.a, hmlVar, 8);
            hmlVar.o();
        }
        return fctx.a;
    }
}
