package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zze implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ zyv b;

    public zze(List list, zyv zyvVar) {
        this.a = list;
        this.b = zyvVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        eih eihVar = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(eihVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            xtt xttVar = (xtt) this.a.get(iIntValue);
            hmlVar.v(-739824571);
            if (xttVar.c.isEmpty()) {
                hmlVar.v(-739795866);
                zzf.b(xttVar, this.b.b, hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(-739706369);
                zzf.a(xttVar, this.b.b, hmlVar, 0);
                hmlVar.o();
            }
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
