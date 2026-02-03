package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fri implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ ikp b;
    final /* synthetic */ ebk c;
    final /* synthetic */ foz d;

    public fri(boolean z, ebk ebkVar, foz fozVar, ikp ikpVar) {
        this.a = z;
        this.c = ebkVar;
        this.d = fozVar;
        this.b = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fum.a.a(this.a, this.c, this.d, this.b, 0.0f, 0.0f, hmlVar, 12582912);
        }
        return fctx.a;
    }
}
