package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlne implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;

    public dlne(List list, boolean z, fdae fdaeVar) {
        this.a = list;
        this.b = z;
        this.c = fdaeVar;
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
                boolean z = this.b;
                hmlVar.v(-1633490746);
                boolean zD = hmlVar.D(dihqVar);
                final fdae fdaeVar = this.c;
                boolean zD2 = zD | hmlVar.D(fdaeVar);
                Object objF = hmlVar.f();
                if (zD2 || objF == hmk.a) {
                    objF = new fdae() { // from class: dlnd
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
                dlnj.i(dihqVar, z, (fdae) objF, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
