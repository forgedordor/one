package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wal implements fdav {
    public static final wal a = new wal();

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ics icsVar = (ics) obj;
        gun gunVar = (gun) obj2;
        hml hmlVar = (hml) obj3;
        int iIntValue = ((Number) obj4).intValue();
        icsVar.getClass();
        gunVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (true != hmlVar.D(icsVar) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != hmlVar.D(gunVar) ? 16 : 32;
        }
        if ((i & 147) == 146 && hmlVar.I()) {
            hmlVar.s();
        } else {
            guj.a(gunVar, ehr.a(icsVar), null, hmlVar, (i >> 3) & 14, 4);
        }
        return fctx.a;
    }
}
