package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emm {
    public static final elm a;

    static {
        eml emlVar = new eml();
        fcvo fcvoVar = fcvo.a;
        dwm dwmVar = dwm.a;
        a = new elm(null, 0, false, 0.0f, emlVar, 0.0f, false, fdjy.b(fcyi.a), new kip(1.0f), 0, new fdap() { // from class: emk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                elm elmVar = emm.a;
                return fcvo.a;
            }
        }, fcvoVar, 0, 0, 0, dwmVar, 0, 0);
    }

    public static final emi a(final int i, hml hmlVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        hyr hyrVar = emi.a;
        boolean zB = hmlVar.B(i) | hmlVar.B(0);
        Object objF = hmlVar.f();
        if (zB || objF == hmk.a) {
            objF = new fdae() { // from class: emj
                @Override // defpackage.fdae
                public final Object invoke() {
                    elm elmVar = emm.a;
                    return new emi(i, 0);
                }
            };
            hmlVar.y(objF);
        }
        return (emi) hxy.b(objArr, hyrVar, (fdae) objF, hmlVar, 0);
    }
}
