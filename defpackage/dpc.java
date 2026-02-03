package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpc {
    public static final dpn a(final int i, hml hmlVar, int i2, int i3) {
        boolean z = true;
        if (1 == i3) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        int i4 = (i2 & 14) ^ 6;
        hyr hyrVar = dpn.a;
        if ((i4 <= 4 || !hmlVar.B(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            objF = new fdae() { // from class: dpb
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new dpn(i);
                }
            };
            hmlVar.y(objF);
        }
        return (dpn) hxy.b(objArr, hyrVar, (fdae) objF, hmlVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ics c(ics icsVar, dpn dpnVar, boolean z, boolean z2, boolean z3) {
        return dpp.a(icsVar, dpnVar, z3 ? dwm.a : dwm.b, z2, z, null, dpnVar.d, true, null, null).a(new ScrollingLayoutElement(dpnVar, z, z3));
    }
}
