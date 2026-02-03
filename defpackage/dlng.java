package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlng implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ fdae b;

    public dlng(List list, fdae fdaeVar) {
        this.a = list;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            for (final dihq dihqVar : this.a) {
                hmlVar.v(-1633490746);
                boolean zD = hmlVar.D(dihqVar);
                final fdae fdaeVar = this.b;
                boolean zD2 = zD | hmlVar.D(fdaeVar);
                Object objF = hmlVar.f();
                if (zD2 || objF == hmk.a) {
                    objF = new fdae() { // from class: dlnf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dihqVar.k.invoke();
                            fdaeVar.invoke();
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dlnj.i(dihqVar, false, (fdae) objF, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
