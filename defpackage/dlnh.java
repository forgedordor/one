package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlnh implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ dihq b;

    public dlnh(djrr djrrVar, dihq dihqVar) {
        this.a = djrrVar;
        this.b = dihqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            inz inzVarB = djrs.b(this.a, hmlVar);
            dihq dihqVar = this.b;
            hmlVar.v(469159312);
            long j = dihqVar.i ? ((ije) hmlVar.e(gea.a)).i : ije.h;
            String str = dihqVar.a;
            hmlVar.o();
            dtfn.a(inzVarB, str, null, j, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
