package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfa implements fdat {
    final /* synthetic */ ikp a;
    final /* synthetic */ geq b;
    final /* synthetic */ float c;
    final /* synthetic */ fdau d;
    final /* synthetic */ fdat e;
    final /* synthetic */ fdat f;

    public gfa(ikp ikpVar, geq geqVar, float f, fdau fdauVar, fdat fdatVar, fdat fdatVar2) {
        this.a = ikpVar;
        this.b = geqVar;
        this.c = f;
        this.d = fdauVar;
        this.e = fdatVar;
        this.f = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gvk.c(egq.u(egq.j(ics.e, 360.0f), 0.0f, 568.0f, 1), this.a, this.b.a, 0L, this.c, 0.0f, null, hxe.d(1782015378, new gez(this.d, this.e, this.f), hmlVar), hmlVar, 104);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
