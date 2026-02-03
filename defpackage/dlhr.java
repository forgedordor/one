package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlhr implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ String b;

    public dlhr(djrr djrrVar, String str) {
        this.a = djrrVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(this.a, hmlVar), this.b, null, glz.a(hmlVar).s, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
