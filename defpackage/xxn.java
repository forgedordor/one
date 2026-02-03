package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxn implements fdaw {
    final /* synthetic */ dplv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ xvx c;

    public xxn(dplv dplvVar, boolean z, xvx xvxVar) {
        this.a = dplvVar;
        this.b = z;
        this.c = xvxVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        xwn xwnVar;
        kph kphVar = (kph) obj;
        kow kowVar = (kow) obj2;
        String str = (String) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        kphVar.getClass();
        kowVar.getClass();
        str.getClass();
        if ((iIntValue & 6) == 0) {
            i = (true != ((iIntValue & 8) == 0 ? hmlVar.D(kphVar) : hmlVar.F(kphVar)) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != hmlVar.D(kowVar) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= true != hmlVar.D(str) ? 128 : 256;
        }
        if ((i & 1171) == 1170 && hmlVar.I()) {
            hmlVar.s();
        } else if (!this.a.b() && !this.b && (xwnVar = (xwn) Map.EL.getOrDefault(this.c.b, str, null)) != null) {
            ybk.a(kphVar, kowVar, xwnVar, hmlVar, (i & 14) | 8 | (i & 112));
        }
        return fctx.a;
    }
}
