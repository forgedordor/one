package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyh implements fdat {
    final /* synthetic */ xyz a;
    final /* synthetic */ dpme b;

    public xyh(xyz xyzVar, dpme dpmeVar) {
        this.a = xyzVar;
        this.b = dpmeVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            xyz xyzVar = this.a;
            dtfk.b(xyzVar != null ? xyzVar.d : this.b.b, null, false, null, null, xvj.a, hmlVar, 1572864, 62);
        }
        return fctx.a;
    }
}
