package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlcm {
    public static final void a(final boolean z, final fdae fdaeVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1991115035);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfz.b(z, fdaeVar, null, 0L, null, null, glz.c(hmlVarC).f, 0L, 0.0f, fdauVar, hmlVarC, i2 & 126, (i2 >> 3) & 112, 1980);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlby
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    fdae fdaeVar2 = fdaeVar;
                    int i4 = i;
                    dlcm.a(z2, fdaeVar2, fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlbu dlbuVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(183622644);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlbuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfz.a(hxe.d(1707886116, new dlci(dlbuVar), hmlVarC), fdaeVar2, joj.a(ics.e, "SimBarDropdownMenuItem"), hxe.d(-546761343, new dlcj(dlbuVar), hmlVarC), false, null, null, hmlVarC, (i2 & 112) | 3462, 496);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlcb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlbu dlbuVar2 = dlbuVar;
                    int i4 = i;
                    dlcm.b(dlbuVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(ics icsVar, boolean z, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        final ics icsVar2;
        int i3;
        boolean z2 = z;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(711114710);
        if (i4 != 0) {
            i3 = i | 6;
            icsVar2 = icsVar;
        } else if ((i & 6) == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            z2 &= z3;
            hmlVarC.v(481444682);
            ics icsVarU = egq.u(egq.d(icsVar2, 1.0f), 48.0f, 0.0f, 2);
            if (!z2) {
                icsVarU = icsVarU.a(dkl.a(ics.e, glz.a(hmlVarC).F, ikj.a));
            }
            ics icsVar3 = icsVarU;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarJ = efy.j(icsVar3, 20.0f, 0.0f, 16.0f, 0.0f, 10);
            int i6 = ((i3 << 3) & 7168) | 384;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i7 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i7))) {
                Integer numValueOf = Integer.valueOf(i7);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i6 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final boolean z4 = z2;
            hpxVarL.d = new fdat() { // from class: dlbx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar4 = icsVar2;
                    boolean z5 = z4;
                    dlcm.c(icsVar4, z5, fdauVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hml r25, int r26) {
        /*
            r0 = 386306362(0x1706913a, float:4.3481037E-25)
            r1 = r25
            hml r0 = r1.c(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L5e
        L1b:
            r24 = r26
        L1d:
            ico r1 = defpackage.ics.e
            r5 = 0
            r6 = 11
            r2 = 0
            r3 = 0
            r4 = 1086324736(0x40c00000, float:6.0)
            ics r2 = defpackage.efy.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132087538(0x7f1512f2, float:1.9815334E38)
            java.lang.String r1 = defpackage.jqu.b(r1, r0)
            gda r3 = defpackage.glz.a(r0)
            long r3 = r3.q
            hcr r5 = defpackage.glz.d(r0)
            jyq r5 = r5.k
            r22 = 0
            r23 = 65528(0xfff8, float:9.1824E-41)
            r19 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dthx.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L5e:
            hpx r0 = r20.L()
            if (r0 == 0) goto L6b
            dlbv r1 = new dlbv
            r1.<init>()
            r0.d = r1
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlcm.d(hml, int):void");
    }

    public static final void e(final dlbt dlbtVar, ics icsVar, hml hmlVar, final int i) {
        final ics icsVar2;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(768834228);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dlbtVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            List list = dlbtVar.b;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("SimBar2UiData.items must not be empty.");
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((dlbu) obj).a)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != list.size()) {
                throw new IllegalArgumentException("SimBarChipUiData.id must be unique.");
            }
            icsVar2 = icsVar;
            c(icsVar2, dlbtVar.d.a, hxe.d(-699845077, new dlch(dlbtVar), hmlVarC), hmlVarC, ((i3 >> 3) & 14) | 384, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlca
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dlbt dlbtVar2 = dlbtVar;
                    int i4 = i;
                    dlcm.e(dlbtVar2, icsVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @fcsv
    public static final void f(final dlcn dlcnVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1683586570);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlcnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = icsVar;
            c(icsVar2, false, hxe.d(-899679329, new dlcc(dlcnVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 384, 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlcn dlcnVar2 = dlcnVar;
                    int i4 = i;
                    dlcm.f(dlcnVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final String str, final dlcr dlcrVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(70753423);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dlcrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtds.a(false, fdaeVar, hxe.d(-97099262, new dlck(str), hmlVarC), null, false, hxe.d(2090080517, new dlcl(dlcrVar), hmlVarC), null, null, null, null, hmlVarC, ((i2 >> 3) & 112) | 196998, 0, 4056);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    dlcr dlcrVar2 = dlcrVar;
                    int i4 = i;
                    dlcm.h(str2, dlcrVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
