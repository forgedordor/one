package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmk extends bmc {
    private final brz k = new brz();
    private boolean l = true;
    private boolean m = false;
    public final List j = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bml a() {
        /*
            r11 = this;
            boolean r0 = r11.l
            if (r0 == 0) goto Le9
            java.util.Set r0 = r11.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            brz r0 = r11.k
            boolean r0 = r0.a
            if (r0 == 0) goto L19
            bry r0 = new bry
            r0.<init>()
            java.util.Collections.sort(r2, r0)
        L19:
            int r0 = r11.h
            r1 = 1
            r3 = 0
            if (r0 != r1) goto Lb4
            bjj r0 = r11.b
            int r1 = r2.size()
            r4 = 2
            if (r1 != r4) goto Lb4
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L30
            goto Lb4
        L30:
            java.util.Iterator r1 = r2.iterator()
        L34:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r1.next()
            bmi r4 = (defpackage.bmi) r4
            bjz r4 = r4.c()
            r4.getClass()
            boolean r4 = defpackage.brc.a(r4)
            if (r4 == 0) goto L34
            java.util.Set r1 = r0.a
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L56
            goto L70
        L56:
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r1.next()
            bjz r4 = (defpackage.bjz) r4
            r4.getClass()
            boolean r4 = defpackage.brc.a(r4)
            if (r4 == 0) goto L5a
            goto Lb4
        L70:
            android.util.Range r1 = r0.a()
            if (r1 == 0) goto Lb4
            java.lang.Comparable r4 = r1.getUpper()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 120(0x78, float:1.68E-43)
            if (r4 < r5) goto L92
            java.lang.Comparable r4 = r1.getLower()
            java.lang.Comparable r5 = r1.getUpper()
            boolean r4 = defpackage.fdbq.f(r4, r5)
            if (r4 != 0) goto L93
        L92:
            r1 = r3
        L93:
            if (r1 == 0) goto Lb4
            android.util.Range r4 = new android.util.Range
            r5 = 30
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Comparable r6 = r1.getUpper()
            r4.<init>(r5, r6)
            java.lang.String r5 = "Modified high-speed FPS range from "
            java.lang.String r6 = " to "
            java.lang.String r1 = defpackage.a.i(r4, r1, r5, r6)
            java.lang.String r5 = "HighSpeedFpsModifier"
            defpackage.bbs.a(r5, r1)
            r0.j(r4)
        Lb4:
            java.util.List r0 = r11.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc1
            bmj r3 = new bmj
            r3.<init>()
        Lc1:
            r7 = r3
            java.util.List r0 = r11.c
            bml r1 = new bml
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.List r0 = r11.d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.List r0 = r11.e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            bjj r0 = r11.b
            bjl r6 = r0.b()
            android.hardware.camera2.params.InputConfiguration r8 = r11.g
            int r9 = r11.h
            bmi r10 = r11.i
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        Le9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported session configuration combination"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmk.a():bml");
    }

    public final void b(bml bmlVar) {
        bjl bjlVar = bmlVar.g;
        int i = bjlVar.f;
        if (i != -1) {
            this.m = true;
            bjj bjjVar = this.b;
            bjjVar.b = bml.a(i, bjjVar.b);
        }
        Range rangeD = bjlVar.d();
        Range range = bms.h;
        if (!rangeD.equals(range)) {
            bjj bjjVar2 = this.b;
            if (bjjVar2.a().equals(range)) {
                bjjVar2.j(rangeD);
            } else if (!bjjVar2.a().equals(rangeD)) {
                this.l = false;
                bbs.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }
        int iB = bjlVar.b();
        if (iB != 0) {
            this.b.l(iB);
        }
        int iC = bjlVar.c();
        if (iC != 0) {
            this.b.m(iC);
        }
        bmx bmxVar = bjlVar.j;
        bjj bjjVar3 = this.b;
        bjjVar3.e.b.putAll(bmxVar.b);
        this.c.addAll(bmlVar.c);
        this.d.addAll(bmlVar.d);
        bjjVar3.c(bmlVar.e());
        this.e.addAll(bmlVar.e);
        bmf bmfVar = bmlVar.f;
        if (bmfVar != null) {
            this.j.add(bmfVar);
        }
        InputConfiguration inputConfiguration = bmlVar.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        Set<bmi> set = this.a;
        set.addAll(bmlVar.a);
        Set set2 = bjjVar3.a;
        set2.addAll(bjlVar.e());
        ArrayList arrayList = new ArrayList();
        for (bmi bmiVar : set) {
            arrayList.add(bmiVar.c());
            Iterator it = bmiVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add((bjz) it.next());
            }
        }
        if (!arrayList.containsAll(set2)) {
            bbs.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.l = false;
        }
        int i2 = bmlVar.h;
        int i3 = this.h;
        if (i2 != i3 && i2 != 0 && i3 != 0) {
            bbs.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.l = false;
        } else if (i2 != 0) {
            this.h = i2;
        }
        bmi bmiVar2 = bmlVar.b;
        if (bmiVar2 != null) {
            bmi bmiVar3 = this.i;
            if (bmiVar3 == bmiVar2 || bmiVar3 == null) {
                this.i = bmiVar2;
            } else {
                bbs.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.l = false;
            }
        }
        bjjVar3.f(bjlVar.e);
    }

    public final boolean c() {
        return this.m && this.l;
    }
}
