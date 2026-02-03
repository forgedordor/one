package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcg implements fdau {
    final /* synthetic */ dlbt a;
    final /* synthetic */ hox b;

    public dlcg(dlbt dlbtVar, hox hoxVar) {
        this.a = dlbtVar;
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
            final dlbt dlbtVar = this.a;
            for (final dlbu dlbuVar : dlbtVar.b) {
                hmlVar.v(-1746271574);
                boolean zD = hmlVar.D(dlbtVar) | hmlVar.D(dlbuVar);
                final hox hoxVar = this.b;
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: dlcf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dlbtVar.c.invoke(dlbuVar.a);
                            dlch.b(hoxVar, false);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dlcm.b(dlbuVar, (fdae) objF, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
