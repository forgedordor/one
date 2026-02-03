package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksr {
    public static final ksj a = new ksj();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, krz krzVar, ksk kskVar, boolean z) {
        kry kryVar;
        kry kryVar2;
        float f;
        boolean z2;
        boolean z3;
        kry kryVar3;
        kry kryVar4;
        if (krzVar.x) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(krzVar instanceof ksa) && krzVar.U() && c(krzVar)) {
            ksa.al(krzVar, kskVar, new ksj());
        }
        kry kryVarV = krzVar.V(2);
        kry kryVarV2 = krzVar.V(4);
        int iA = kryVarV.a();
        int iA2 = kryVarV2.a();
        HashSet hashSet = kryVarV.a;
        if (hashSet != null && kryVarV.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                kry kryVar5 = (kry) it.next();
                krz krzVar2 = kryVar5.d;
                boolean zC = c(krzVar2);
                if (krzVar2.U() && zC) {
                    f = 0.0f;
                    ksa.al(krzVar2, kskVar, new ksj());
                } else {
                    f = 0.0f;
                }
                kry kryVar6 = krzVar2.T;
                if ((kryVar5 == kryVar6 && (kryVar4 = krzVar2.V.e) != null && kryVar4.c) || (kryVar5 == krzVar2.V && (kryVar3 = kryVar6.e) != null && kryVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (krzVar2.X() != 3 || zC) {
                    if (!krzVar2.U()) {
                        if (kryVar5 == kryVar6 && krzVar2.V.e == null) {
                            int iB = kryVar6.b() + iA;
                            krzVar2.A(iB, krzVar2.j() + iB);
                            a(i2, krzVar2, kskVar, z);
                        } else {
                            kry kryVar7 = krzVar2.V;
                            if (kryVar5 == kryVar7 && kryVar6.e == null) {
                                int iB2 = iA - kryVar7.b();
                                krzVar2.A(iB2 - krzVar2.j(), iB2);
                                a(i2, krzVar2, kskVar, z);
                            } else if (z3 && !krzVar2.S()) {
                                e(i2, kskVar, krzVar2, z);
                            }
                        }
                    }
                } else if (krzVar2.X() == 3 && krzVar2.G >= 0 && krzVar2.F >= 0 && ((krzVar2.ar == 8 || (krzVar2.C == 0 && krzVar2.ah == f)) && !krzVar2.S() && !krzVar2.Q && z3 && !krzVar2.S())) {
                    f(i2, krzVar, kskVar, krzVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (krzVar instanceof ksd) {
            return;
        }
        HashSet hashSet2 = kryVarV2.a;
        if (hashSet2 != null && kryVarV2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                kry kryVar8 = (kry) it2.next();
                krz krzVar3 = kryVar8.d;
                boolean zC2 = c(krzVar3);
                if (krzVar3.U() && zC2) {
                    ksa.al(krzVar3, kskVar, new ksj());
                }
                kry kryVar9 = krzVar3.T;
                boolean z6 = ((kryVar8 == kryVar9 && (kryVar2 = krzVar3.V.e) != null && kryVar2.c) || (kryVar8 == krzVar3.V && (kryVar = kryVar9.e) != null && kryVar.c)) ? z5 : false;
                if (krzVar3.X() != 3 || zC2) {
                    if (!krzVar3.U()) {
                        if (kryVar8 == kryVar9 && krzVar3.V.e == null) {
                            int iB3 = kryVar9.b() + iA2;
                            krzVar3.A(iB3, krzVar3.j() + iB3);
                            a(i3, krzVar3, kskVar, z);
                        } else {
                            kry kryVar10 = krzVar3.V;
                            if (kryVar8 == kryVar10 && kryVar9.e == null) {
                                int iB4 = iA2 - kryVar10.b();
                                krzVar3.A(iB4 - krzVar3.j(), iB4);
                                a(i3, krzVar3, kskVar, z);
                            } else if (z6 && !krzVar3.S()) {
                                e(i3, kskVar, krzVar3, z);
                            }
                        }
                    }
                } else if (krzVar3.X() == 3 && krzVar3.G >= 0 && krzVar3.F >= 0 && (krzVar3.ar == 8 || (krzVar3.C == 0 && krzVar3.ah == 0.0f))) {
                    if (!krzVar3.S() && !krzVar3.Q && z6 && !krzVar3.S()) {
                        f(i3, krzVar, kskVar, krzVar3, z);
                    }
                }
            }
        }
        krzVar.x = z5;
    }

    public static void b(int i, krz krzVar, ksk kskVar) {
        kry kryVar;
        kry kryVar2;
        kry kryVar3;
        kry kryVar4;
        kry kryVar5;
        if (krzVar.y) {
            return;
        }
        c++;
        if (!(krzVar instanceof ksa) && krzVar.U() && c(krzVar)) {
            ksa.al(krzVar, kskVar, new ksj());
        }
        kry kryVarV = krzVar.V(3);
        kry kryVarV2 = krzVar.V(5);
        int iA = kryVarV.a();
        int iA2 = kryVarV2.a();
        HashSet hashSet = kryVarV.a;
        if (hashSet != null && kryVarV.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                kry kryVar6 = (kry) it.next();
                krz krzVar2 = kryVar6.d;
                boolean zC = c(krzVar2);
                if (krzVar2.U() && zC) {
                    ksa.al(krzVar2, kskVar, new ksj());
                }
                kry kryVar7 = krzVar2.U;
                boolean z = (kryVar6 == kryVar7 && (kryVar5 = krzVar2.W.e) != null && kryVar5.c) || (kryVar6 == krzVar2.W && (kryVar4 = kryVar7.e) != null && kryVar4.c);
                if (krzVar2.Y() != 3 || zC) {
                    if (!krzVar2.U()) {
                        if (kryVar6 == kryVar7 && krzVar2.W.e == null) {
                            int iB = kryVar7.b() + iA;
                            krzVar2.B(iB, krzVar2.h() + iB);
                            b(i2, krzVar2, kskVar);
                        } else {
                            kry kryVar8 = krzVar2.W;
                            if (kryVar6 == kryVar8 && kryVar7.e == null) {
                                int iB2 = iA - kryVar8.b();
                                krzVar2.B(iB2 - krzVar2.h(), iB2);
                                b(i2, krzVar2, kskVar);
                            } else if (z && !krzVar2.T()) {
                                g(i2, kskVar, krzVar2);
                            }
                        }
                    }
                } else if (krzVar2.Y() == 3 && krzVar2.J >= 0 && krzVar2.I >= 0 && (krzVar2.ar == 8 || (krzVar2.D == 0 && krzVar2.ah == 0.0f))) {
                    if (!krzVar2.T() && !krzVar2.Q && z && !krzVar2.T()) {
                        h(i2, krzVar, kskVar, krzVar2);
                    }
                }
            }
        }
        if (krzVar instanceof ksd) {
            return;
        }
        HashSet hashSet2 = kryVarV2.a;
        if (hashSet2 != null && kryVarV2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                kry kryVar9 = (kry) it2.next();
                krz krzVar3 = kryVar9.d;
                boolean zC2 = c(krzVar3);
                if (krzVar3.U() && zC2) {
                    ksa.al(krzVar3, kskVar, new ksj());
                }
                kry kryVar10 = krzVar3.U;
                boolean z2 = (kryVar9 == kryVar10 && (kryVar3 = krzVar3.W.e) != null && kryVar3.c) || (kryVar9 == krzVar3.W && (kryVar2 = kryVar10.e) != null && kryVar2.c);
                if (krzVar3.Y() != 3 || zC2) {
                    if (krzVar3.U()) {
                        continue;
                    } else if (kryVar9 == kryVar10 && krzVar3.W.e == null) {
                        int iB3 = kryVar10.b() + iA2;
                        krzVar3.B(iB3, krzVar3.h() + iB3);
                        b(i3, krzVar3, kskVar);
                    } else {
                        kry kryVar11 = krzVar3.W;
                        if (kryVar9 == kryVar11 && kryVar10.e == null) {
                            int iB4 = iA2 - kryVar11.b();
                            krzVar3.B(iB4 - krzVar3.h(), iB4);
                            b(i3, krzVar3, kskVar);
                        } else if (z2 && !krzVar3.T()) {
                            g(i3, kskVar, krzVar3);
                        }
                    }
                } else if (krzVar3.Y() == 3 && krzVar3.J >= 0 && krzVar3.I >= 0 && (krzVar3.ar == 8 || (krzVar3.D == 0 && krzVar3.ah == 0.0f))) {
                    if (!krzVar3.T() && !krzVar3.Q && z2 && !krzVar3.T()) {
                        h(i3, krzVar, kskVar, krzVar3);
                    }
                }
            }
        }
        kry kryVarV3 = krzVar.V(6);
        if (kryVarV3.a != null && kryVarV3.c) {
            int iA3 = kryVarV3.a();
            Iterator it3 = kryVarV3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                kry kryVar12 = (kry) it3.next();
                krz krzVar4 = kryVar12.d;
                boolean zC3 = c(krzVar4);
                if (krzVar4.U() && zC3) {
                    ksa.al(krzVar4, kskVar, new ksj());
                }
                if (krzVar4.Y() != 3 || zC3) {
                    if (!krzVar4.U() && kryVar12 == (kryVar = krzVar4.X)) {
                        int iB5 = kryVar12.b() + iA3;
                        if (krzVar4.P) {
                            int i5 = iB5 - krzVar4.al;
                            int i6 = krzVar4.ag + i5;
                            krzVar4.ak = i5;
                            krzVar4.U.f(i5);
                            krzVar4.W.f(i6);
                            kryVar.f(iB5);
                            krzVar4.w = true;
                        }
                        b(i4, krzVar4, kskVar);
                    }
                }
            }
        }
        krzVar.y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.krz r8) {
        /*
            int r0 = r8.X()
            int r1 = r8.Y()
            krz r2 = r8.ae
            if (r2 == 0) goto Lf
            ksa r2 = (defpackage.ksa) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L15
            r2.X()
        L15:
            if (r2 == 0) goto L1a
            r2.Y()
        L1a:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4e
            boolean r7 = r8.e()
            if (r7 != 0) goto L4e
            if (r0 == r2) goto L4e
            if (r0 != r4) goto L3c
            int r0 = r8.C
            if (r0 != 0) goto L40
            float r0 = r8.ah
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r8.Q(r5)
            if (r0 != 0) goto L4e
            goto L40
        L3c:
            if (r0 == r4) goto L40
        L3e:
            r0 = r5
            goto L4f
        L40:
            int r0 = r8.C
            if (r0 != r6) goto L3e
            int r0 = r8.j()
            boolean r0 = r8.R(r5, r0)
            if (r0 == 0) goto L3e
        L4e:
            r0 = r6
        L4f:
            if (r1 == r6) goto L7e
            boolean r7 = r8.f()
            if (r7 != 0) goto L7e
            if (r1 == r2) goto L7e
            if (r1 != r4) goto L6c
            int r1 = r8.D
            if (r1 != 0) goto L70
            float r1 = r8.ah
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L70
            boolean r1 = r8.Q(r6)
            if (r1 != 0) goto L7e
            goto L70
        L6c:
            if (r1 == r4) goto L70
        L6e:
            r1 = r5
            goto L7f
        L70:
            int r1 = r8.D
            if (r1 != r6) goto L6e
            int r1 = r8.h()
            boolean r1 = r8.R(r6, r1)
            if (r1 == 0) goto L6e
        L7e:
            r1 = r6
        L7f:
            float r8 = r8.ah
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8d
            if (r0 != 0) goto L8c
            if (r1 != 0) goto L8c
            r0 = r5
            r1 = r0
            goto L8d
        L8c:
            return r6
        L8d:
            if (r0 == 0) goto L92
            if (r1 == 0) goto L92
            return r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksr.c(krz):boolean");
    }

    public static void d(krv krvVar, ksk kskVar, int i, boolean z) {
        if (krvVar.c()) {
            if (i == 0) {
                a(1, krvVar, kskVar, z);
            } else {
                b(1, krvVar, kskVar);
            }
        }
    }

    private static void e(int i, ksk kskVar, krz krzVar, boolean z) {
        float f = krzVar.ao;
        kry kryVar = krzVar.T;
        int iA = kryVar.e.a();
        kry kryVar2 = krzVar.V;
        int iA2 = kryVar2.e.a();
        int iB = kryVar.b() + iA;
        int iB2 = iA2 - kryVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = krzVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        krzVar.A(i3, i4);
        a(i + 1, krzVar, kskVar, z);
    }

    private static void f(int i, krz krzVar, ksk kskVar, krz krzVar2, boolean z) {
        float f = krzVar2.ao;
        kry kryVar = krzVar2.T;
        int iA = kryVar.e.a() + kryVar.b();
        kry kryVar2 = krzVar2.V;
        int iA2 = kryVar2.e.a() - kryVar2.b();
        if (iA2 >= iA) {
            int iJ = krzVar2.j();
            int i2 = iA2 - iA;
            if (krzVar2.ar != 8) {
                int i3 = krzVar2.C;
                if (i3 == 2) {
                    iJ = (int) (krzVar2.ao * 0.5f * (krzVar instanceof ksa ? krzVar.j() : krzVar.ae.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(krzVar2.F, iJ);
                int i4 = krzVar2.G;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            krzVar2.A(i5, iJ + i5);
            a(i + 1, krzVar2, kskVar, z);
        }
    }

    private static void g(int i, ksk kskVar, krz krzVar) {
        float f = krzVar.ap;
        kry kryVar = krzVar.U;
        int iA = kryVar.e.a();
        kry kryVar2 = krzVar.W;
        int iA2 = kryVar2.e.a();
        int iB = kryVar.b() + iA;
        int iB2 = iA2 - kryVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = krzVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        krzVar.B(i4, i5);
        b(i + 1, krzVar, kskVar);
    }

    private static void h(int i, krz krzVar, ksk kskVar, krz krzVar2) {
        float f = krzVar2.ap;
        kry kryVar = krzVar2.U;
        int iA = kryVar.e.a() + kryVar.b();
        kry kryVar2 = krzVar2.W;
        int iA2 = kryVar2.e.a() - kryVar2.b();
        if (iA2 >= iA) {
            int iH = krzVar2.h();
            int i2 = iA2 - iA;
            if (krzVar2.ar != 8) {
                int i3 = krzVar2.D;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (krzVar instanceof ksa ? krzVar.h() : krzVar.ae.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(krzVar2.I, iH);
                int i4 = krzVar2.J;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            krzVar2.B(i5, iH + i5);
            b(i + 1, krzVar2, kskVar);
        }
    }
}
