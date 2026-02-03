package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwar implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public cwar(djrr djrrVar, String str, boolean z) {
        this.a = djrrVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            inz inzVarB = djrs.b(this.a, hmlVar);
            String str = this.b;
            if (this.c) {
                hmlVar.v(-1413788192);
                j = glz.a(hmlVar).d;
                hmlVar.o();
            } else {
                hmlVar.v(-1413713079);
                j = glz.a(hmlVar).q;
                hmlVar.o();
            }
            dtfn.a(inzVarB, str, null, j, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
