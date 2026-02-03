package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfe implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hox c;

    public cyfe(List list, fdap fdapVar, hox hoxVar) {
        this.a = list;
        this.b = fdapVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            List<egbe> list = this.a;
            final fdap fdapVar = this.b;
            final hox hoxVar = this.c;
            for (final egbe egbeVar : list) {
                hmlVar.v(-1746271574);
                boolean zD = hmlVar.D(fdapVar) | hmlVar.F(egbeVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: cyfc
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdapVar.invoke(egbeVar);
                            cyfu.f(hoxVar, false);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                fob.b((fdae) objF, null, false, null, hxe.d(-1880401122, new cyfd(egbeVar), hmlVar), hmlVar, 196608);
            }
        }
        return fctx.a;
    }
}
