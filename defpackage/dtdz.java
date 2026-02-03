package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtdz implements fdau {
    public static final dtdz a = new dtdz();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gun gunVar = (gun) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        gunVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(gunVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            guj.a(gunVar, null, null, hmlVar, iIntValue & 14, 6);
        }
        return fctx.a;
    }
}
