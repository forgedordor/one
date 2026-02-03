package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkcr implements fdat {
    final /* synthetic */ dkcw a;

    public dkcr(dkcw dkcwVar) {
        this.a = dkcwVar;
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            List list = this.a.b;
            if (list.size() > 1) {
                hmlVar.v(1849434622);
                Object objF = hmlVar.f();
                Object obj3 = hmk.a;
                if (objF == obj3) {
                    hpl hplVar = new hpl(false, hsi.a);
                    hmlVar.y(hplVar);
                    objF = hplVar;
                }
                final hox hoxVar = (hox) objF;
                hmlVar.o();
                hmlVar.v(5004770);
                Object objF2 = hmlVar.f();
                if (objF2 == obj3) {
                    objF2 = new fdae() { // from class: dkcp
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dkcr.b(hoxVar, true);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                dkcv.a((fdae) objF2, hmlVar, 6);
                boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
                hmlVar.v(5004770);
                Object objF3 = hmlVar.f();
                if (objF3 == obj3) {
                    objF3 = new fdae() { // from class: dkcq
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dkcr.b(hoxVar, false);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF3);
                }
                hmlVar.o();
                dkcv.b(zBooleanValue, list, (fdae) objF3, hmlVar, 384);
            }
        }
        return fctx.a;
    }
}
