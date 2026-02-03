package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftt implements fdat {
    final /* synthetic */ fdat a;

    public ftt(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hnj.a(fop.a.c(Float.valueOf(fon.b(hmlVar))), hxe.d(1236486620, new fts(this.a), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
