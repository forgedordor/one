package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlnc implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ dihq b;

    public dlnc(djrr djrrVar, dihq dihqVar) {
        this.a = djrrVar;
        this.b = dihqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(this.a, hmlVar), this.b.a, null, 0L, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
