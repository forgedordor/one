package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djze implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ djzh b;

    public djze(djrr djrrVar, djzh djzhVar) {
        this.a = djrrVar;
        this.b = djzhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djrr djrrVar = this.a;
            djzh djzhVar = this.b;
            djzg.b(djrrVar, djzhVar.e, djzhVar.c, hmlVar, 0);
        }
        return fctx.a;
    }
}
