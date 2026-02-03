package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftr implements fdat {
    final /* synthetic */ fdat a;

    public ftr(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1845819398);
            ftx.a(this.a, hmlVar, 0);
            hmlVar.o();
        }
        return fctx.a;
    }
}
