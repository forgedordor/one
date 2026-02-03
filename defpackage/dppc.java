package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppc implements fdat {
    final /* synthetic */ dpov a;
    final /* synthetic */ fdat b;

    public dppc(dpov dpovVar, fdat fdatVar) {
        this.a = dpovVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpov dpovVar = this.a;
            dtfn.a(djrs.b(dpovVar.a, hmlVar), dpovVar.b, null, glz.a(hmlVar).q, hmlVar, 0, 4);
            this.b.a(hmlVar, 0);
        }
        return fctx.a;
    }
}
