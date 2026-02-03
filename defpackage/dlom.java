package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlom implements fdat {
    final /* synthetic */ dloh a;
    final /* synthetic */ igr b;

    public dlom(dloh dlohVar, igr igrVar) {
        this.a = dlohVar;
        this.b = igrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dloh dlohVar = this.a;
            dlob.b(dlohVar.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
