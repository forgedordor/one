package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afux implements fdat {
    final /* synthetic */ List a;

    public afux(List list) {
        this.a = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarJ = efy.j(ics.e, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            ecj ecjVarG = ecr.g(8.0f);
            egc egcVarG = efy.g(8.0f, 0.0f, 2);
            hmlVar.v(5004770);
            final List list = this.a;
            boolean zF = hmlVar.F(list);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdap() { // from class: afuu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        eio eioVar = (eio) obj3;
                        eioVar.getClass();
                        List list2 = list;
                        eioVar.a(list2.size(), null, new afuv(list2), new hxd(802480018, true, new afuw(list2)));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            eig.b(icsVarJ, null, egcVarG, ecjVarG, null, null, false, null, (fdap) objF, hmlVar, 24966, 490);
        }
        return fctx.a;
    }
}
