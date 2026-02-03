package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlon implements fdat {
    final /* synthetic */ dloh a;
    final /* synthetic */ boolean b;

    public dlon(dloh dlohVar, boolean z) {
        this.a = dlohVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dloh dlohVar = this.a;
            boolean z = this.b;
            dlnq dlnqVar = dlohVar.a;
            dlnj.h(dlohVar.b, z, (dlnqVar instanceof dlnp) && ((dlnp) dlnqVar).c != null, hmlVar, 0);
        }
        return fctx.a;
    }
}
