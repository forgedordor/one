package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thv implements fdat {
    final /* synthetic */ tip a;
    final /* synthetic */ ftn b;

    public thv(tip tipVar, ftn ftnVar) {
        this.a = tipVar;
        this.b = ftnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            tht.b((tio) hro.a(this.a.a, hmlVar).a(), this.b, hmlVar, 48);
        }
        return fctx.a;
    }
}
