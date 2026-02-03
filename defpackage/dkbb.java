package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkbb implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ boolean b;

    public dkbb(djrr djrrVar, boolean z) {
        this.a = djrrVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkbl.c(this.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
