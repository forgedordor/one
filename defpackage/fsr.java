package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsr implements fdat {
    final /* synthetic */ fpu a;
    final /* synthetic */ fdat b;

    public fsr(fpu fpuVar, fdat fdatVar) {
        this.a = fpuVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hnj.a(fst.a.c(this.a), this.b, hmlVar, 8);
        }
        return fctx.a;
    }
}
