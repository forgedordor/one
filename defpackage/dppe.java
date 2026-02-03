package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppe implements fdau {
    final /* synthetic */ fddq a;
    final /* synthetic */ List b;

    public dppe(fddq fddqVar, List list) {
        this.a = fddqVar;
        this.b = list;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fddq fddqVar = this.a;
            int i = fddqVar.a;
            int i2 = fddqVar.b;
            if (i <= i2) {
                while (true) {
                    dppg.a((dpov) this.b.get(i), hmlVar, 0);
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return fctx.a;
    }
}
