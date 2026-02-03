package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwif implements fdat {
    final /* synthetic */ gun a;

    public cwif(gun gunVar) {
        this.a = gunVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gun gunVar = this.a;
            if (gunVar != null) {
                guj.a(gunVar, null, null, hmlVar, 0, 6);
            }
        }
        return fctx.a;
    }
}
