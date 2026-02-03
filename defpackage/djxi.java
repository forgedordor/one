package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxi implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ hox b;

    public djxi(List list, hox hoxVar) {
        this.a = list;
        this.b = hoxVar;
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
                boolean z = dihqVar.f;
                hwv hwvVarD = hxe.d(1918005241, new djxh(dihqVar), hmlVar);
                hmlVar.v(-1633490746);
                boolean zD = hmlVar.D(dihqVar);
                final hox hoxVar = this.b;
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: djxg
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dihqVar.k.invoke();
                            djyg.t(hoxVar);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dtfz.a(hwvVarD, (fdae) objF, null, null, z, null, null, hmlVar, 6, 476);
            }
        }
        return fctx.a;
    }
}
