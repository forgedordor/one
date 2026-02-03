package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwce implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ dihq b;

    public cwce(djrr djrrVar, dihq dihqVar) {
        this.a = djrrVar;
        this.b = dihqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.b(djrs.a(this.a, hmlVar), this.b.a, null, glz.a(hmlVar).s, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
