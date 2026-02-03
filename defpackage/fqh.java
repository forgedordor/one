package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqh implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdat b;

    public fqh(long j, fdat fdatVar) {
        this.a = j;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hnj.a(fop.a.c(Float.valueOf(ije.a(this.a))), hxe.d(-1072292694, new fqg(this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
