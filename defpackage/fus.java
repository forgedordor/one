package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fus implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdat b;

    public fus(long j, fdat fdatVar) {
        this.a = j;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fuy.d(this.a, null, this.b, hmlVar, 0, 6);
        }
        return fctx.a;
    }
}
