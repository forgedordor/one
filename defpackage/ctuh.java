package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctuh implements fdat {
    final /* synthetic */ ctte a;
    final /* synthetic */ hox b;

    public ctuh(ctte ctteVar, hox hoxVar) {
        this.a = ctteVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1633490746);
            final ctte ctteVar = this.a;
            boolean zD = hmlVar.D(ctteVar);
            final hox hoxVar = this.b;
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: ctug
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ctuo.k(hoxVar, new kew("", 0L, 6));
                        ctteVar.o.invoke("");
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtfk.b((fdae) objF, null, false, null, null, ctrl.a, hmlVar, 1572864, 62);
        }
        return fctx.a;
    }
}
