package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpip {
    public static final int a(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hml r3, int r4) {
        /*
            r0 = 120234263(0x72aa117, float:1.2836719E-34)
            hml r3 = r3.c(r0)
            if (r4 != 0) goto L16
            boolean r4 = r3.I()
            r0 = 0
            if (r4 != 0) goto L12
            r4 = r0
            goto L16
        L12:
            r3.s()
            goto L36
        L16:
            hpt r0 = defpackage.dpjg.a
            java.lang.Object r0 = r3.e(r0)
            dpir r0 = (defpackage.dpir) r0
            r1 = 0
            if (r0 == 0) goto L27
            boolean r2 = c(r0)
            if (r2 != 0) goto L28
        L27:
            r0 = r1
        L28:
            if (r0 == 0) goto L35
            hpt r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f
            java.lang.Object r1 = r3.e(r1)
            android.view.View r1 = (android.view.View) r1
            defpackage.dpiq.a(r0, r1)
        L35:
            r0 = r4
        L36:
            hpx r3 = r3.L()
            if (r3 == 0) goto L43
            dpin r4 = new dpin
            r4.<init>()
            r3.d = r4
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpip.b(hml, int):void");
    }

    public static final boolean c(dpir dpirVar) {
        dpjd dpjdVarF = dpirVar.f();
        return dpjdVarF == dpjd.a || dpjdVarF == dpjd.b;
    }

    public static final boolean d(hml hmlVar) {
        hmlVar.v(1302998044);
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj = hmk.a;
        if (objF == obj) {
            hpl hplVar = new hpl(dpjd.d, hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        hox hoxVar = (hox) objF;
        hmlVar.o();
        int iA = ehv.d(hmlVar).a((kio) hmlVar.e(jmh.e));
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj) {
            hpl hplVar2 = new hpl(0, hsi.a);
            hmlVar.y(hplVar2);
            objF2 = hplVar2;
        }
        hox hoxVar2 = (hox) objF2;
        hmlVar.o();
        Integer numValueOf = Integer.valueOf(iA);
        Integer numValueOf2 = Integer.valueOf(a(hoxVar2));
        hmlVar.v(-1746271574);
        boolean zB = hmlVar.B(iA);
        Object objF3 = hmlVar.f();
        if (zB || objF3 == obj) {
            objF3 = new dpio(iA, hoxVar2, hoxVar, null);
            hmlVar.y(objF3);
        }
        hmlVar.o();
        hob.f(numValueOf, numValueOf2, (fdat) objF3, hmlVar);
        boolean z = e(hoxVar) == dpjd.a || e(hoxVar) == dpjd.b;
        hmlVar.o();
        return z;
    }

    private static final dpjd e(hox hoxVar) {
        return (dpjd) hoxVar.a();
    }
}
