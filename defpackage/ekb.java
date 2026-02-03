package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekb {
    public static final ejh a = new ejh(null, 0, false, 0.0f, new eka(), 0.0f, false, fdjy.b(fcyi.a), new kip(1.0f), kim.k(0, 0, 0, 15), fcvo.a, 0, 0, 0, false, dwm.a, 0, 0);

    public static final ejy a(final int i, hml hmlVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        hyr hyrVar = ejy.a;
        boolean zB = hmlVar.B(i) | hmlVar.B(0);
        Object objF = hmlVar.f();
        if (zB || objF == hmk.a) {
            objF = new fdae() { // from class: ejz
                @Override // defpackage.fdae
                public final Object invoke() {
                    ejh ejhVar = ekb.a;
                    return new ejy(i, 0);
                }
            };
            hmlVar.y(objF);
        }
        return (ejy) hxy.b(objArr, hyrVar, (fdae) objF, hmlVar, 0);
    }
}
