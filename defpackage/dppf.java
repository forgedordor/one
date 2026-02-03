package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppf implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ fddq b;
    final /* synthetic */ List c;

    public dppf(hox hoxVar, fddq fddqVar, List list) {
        this.a = hoxVar;
        this.b = fddqVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final hox hoxVar = this.a;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: dppd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dppg.d(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtfz.b(zBooleanValue, (fdae) objF, null, 0L, null, null, null, 0L, 0.0f, hxe.d(224003254, new dppe(this.b, this.c), hmlVar), hmlVar, 48, 48, 2044);
        }
        return fctx.a;
    }
}
