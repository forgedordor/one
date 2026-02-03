package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditg implements fdat {
    final /* synthetic */ djrr a;

    public ditg(djrr djrrVar) {
        this.a = djrrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ditk.f(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
