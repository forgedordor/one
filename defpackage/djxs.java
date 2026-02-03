package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxs implements fdat {
    final /* synthetic */ djym a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;

    public djxs(djym djymVar, hox hoxVar, hox hoxVar2) {
        this.a = djymVar;
        this.b = hoxVar;
        this.c = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djym djymVar = this.a;
            hmlVar.v(-109526108);
            String str = djymVar.d;
            if (str != null) {
                djyg.l(str, (ije) djyg.b(this.b).d(), hmlVar, 0, 0);
            }
            hmlVar.o();
            List list = djymVar.e;
            if (list != null) {
                final hox hoxVar = this.c;
                boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
                hmlVar.v(5004770);
                Object objF = hmlVar.f();
                if (objF == hmk.a) {
                    objF = new fdae() { // from class: djxr
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            djyg.i(hoxVar, false);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                djyg.g(zBooleanValue, list, (fdae) objF, hmlVar, 384);
            }
        }
        return fctx.a;
    }
}
