package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgz implements fdat {
    final /* synthetic */ fdae a;

    public cwgz(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwhc.b(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
