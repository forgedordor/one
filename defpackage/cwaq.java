package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwaq implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public cwaq(djrr djrrVar, String str, boolean z) {
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
                hmlVar.v(757943497);
                j = glz.a(hmlVar).d;
                hmlVar.o();
            } else {
                hmlVar.v(758022578);
                j = glz.a(hmlVar).q;
                hmlVar.o();
            }
            dtfn.a(inzVarB, str, null, j, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
