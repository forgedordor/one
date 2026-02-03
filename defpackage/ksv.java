package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksv extends kta {
    private static final int[] a = new int[2];

    public ksv(krz krzVar) {
        super(krzVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.kta
    public final void b() {
        krz krzVar;
        krz krzVar2;
        krz krzVar3;
        krz krzVar4 = this.d;
        if (krzVar4.l) {
            this.f.c(krzVar4.j());
        }
        ksq ksqVar = this.f;
        if (!ksqVar.i) {
            int iX = this.d.X();
            this.k = iX;
            if (iX != 3) {
                if (this.k == 4 && (krzVar3 = this.d.ae) != null && (krzVar3.X() == 1 || krzVar3.X() == 4)) {
                    int iJ = (krzVar3.j() - this.d.T.b()) - this.d.V.b();
                    j(this.i, krzVar3.o.i, this.d.T.b());
                    j(this.j, krzVar3.o.j, -this.d.V.b());
                    ksqVar.c(iJ);
                    return;
                }
                if (this.k == 1) {
                    ksqVar.c(this.d.j());
                }
            }
        } else if (this.k == 4 && (krzVar = this.d.ae) != null && (krzVar.X() == 1 || krzVar.X() == 4)) {
            j(this.i, krzVar.o.i, this.d.T.b());
            j(this.j, krzVar.o.j, -this.d.V.b());
            return;
        }
        if (ksqVar.i) {
            krz krzVar5 = this.d;
            if (krzVar5.l) {
                kry[] kryVarArr = krzVar5.ab;
                kry kryVar = kryVarArr[0];
                kry kryVar2 = kryVar.e;
                if (kryVar2 != null && kryVarArr[1].e != null) {
                    if (krzVar5.S()) {
                        this.i.e = this.d.ab[0].b();
                        this.j.e = -this.d.ab[1].b();
                        return;
                    }
                    ksp kspVarK = k(this.d.ab[0]);
                    if (kspVarK != null) {
                        j(this.i, kspVarK, this.d.ab[0].b());
                    }
                    ksp kspVarK2 = k(this.d.ab[1]);
                    if (kspVarK2 != null) {
                        j(this.j, kspVarK2, -this.d.ab[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (kryVar2 != null) {
                    ksp kspVarK3 = k(kryVar);
                    if (kspVarK3 != null) {
                        ksp kspVar = this.i;
                        j(kspVar, kspVarK3, this.d.ab[0].b());
                        j(this.j, kspVar, ksqVar.f);
                        return;
                    }
                    return;
                }
                kry kryVar3 = kryVarArr[1];
                if (kryVar3.e != null) {
                    ksp kspVarK4 = k(kryVar3);
                    if (kspVarK4 != null) {
                        ksp kspVar2 = this.j;
                        j(kspVar2, kspVarK4, -this.d.ab[1].b());
                        j(this.i, kspVar2, -ksqVar.f);
                        return;
                    }
                    return;
                }
                if ((krzVar5 instanceof kse) || krzVar5.ae == null || krzVar5.V(7).e != null) {
                    return;
                }
                krz krzVar6 = this.d;
                ksp kspVar3 = krzVar6.ae.o.i;
                ksp kspVar4 = this.i;
                j(kspVar4, kspVar3, krzVar6.k());
                j(this.j, kspVar4, ksqVar.f);
                return;
            }
        }
        if (this.k == 3) {
            krz krzVar7 = this.d;
            int i = krzVar7.C;
            if (i == 2) {
                krz krzVar8 = krzVar7.ae;
                if (krzVar8 != null) {
                    ksq ksqVar2 = krzVar8.p.f;
                    ksqVar.k.add(ksqVar2);
                    ksqVar2.j.add(ksqVar);
                    ksqVar.b = true;
                    ksp kspVar5 = this.i;
                    List list = ksqVar.j;
                    list.add(kspVar5);
                    list.add(this.j);
                }
            } else if (i == 3) {
                if (krzVar7.D == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    ksx ksxVar = krzVar7.p;
                    ksxVar.i.a = this;
                    ksxVar.j.a = this;
                    ksqVar.a = this;
                    if (krzVar7.T()) {
                        List list2 = ksqVar.k;
                        list2.add(this.d.p.f);
                        this.d.p.f.j.add(ksqVar);
                        ksx ksxVar2 = this.d.p;
                        ksxVar2.f.a = this;
                        list2.add(ksxVar2.i);
                        list2.add(this.d.p.j);
                        this.d.p.i.j.add(ksqVar);
                        this.d.p.j.j.add(ksqVar);
                    } else if (this.d.S()) {
                        this.d.p.f.k.add(ksqVar);
                        ksqVar.j.add(this.d.p.f);
                    } else {
                        this.d.p.f.k.add(ksqVar);
                    }
                } else {
                    ksq ksqVar3 = krzVar7.p.f;
                    ksqVar.k.add(ksqVar3);
                    ksqVar3.j.add(ksqVar);
                    this.d.p.i.j.add(ksqVar);
                    this.d.p.j.j.add(ksqVar);
                    ksqVar.b = true;
                    ksp kspVar6 = this.i;
                    List list3 = ksqVar.j;
                    list3.add(kspVar6);
                    ksp kspVar7 = this.j;
                    list3.add(kspVar7);
                    kspVar6.k.add(ksqVar);
                    kspVar7.k.add(ksqVar);
                }
            }
        }
        krz krzVar9 = this.d;
        kry[] kryVarArr2 = krzVar9.ab;
        kry kryVar4 = kryVarArr2[0];
        kry kryVar5 = kryVar4.e;
        if (kryVar5 != null && kryVarArr2[1].e != null) {
            if (krzVar9.S()) {
                this.i.e = this.d.ab[0].b();
                this.j.e = -this.d.ab[1].b();
                return;
            }
            ksp kspVarK5 = k(this.d.ab[0]);
            ksp kspVarK6 = k(this.d.ab[1]);
            if (kspVarK5 != null) {
                kspVarK5.a(this);
            }
            if (kspVarK6 != null) {
                kspVarK6.a(this);
            }
            this.l = 4;
            return;
        }
        if (kryVar5 != null) {
            ksp kspVarK7 = k(kryVar4);
            if (kspVarK7 != null) {
                ksp kspVar8 = this.i;
                j(kspVar8, kspVarK7, this.d.ab[0].b());
                i(this.j, kspVar8, 1, ksqVar);
                return;
            }
            return;
        }
        kry kryVar6 = kryVarArr2[1];
        if (kryVar6.e != null) {
            ksp kspVarK8 = k(kryVar6);
            if (kspVarK8 != null) {
                ksp kspVar9 = this.j;
                j(kspVar9, kspVarK8, -this.d.ab[1].b());
                i(this.i, kspVar9, -1, ksqVar);
                return;
            }
            return;
        }
        if ((krzVar9 instanceof kse) || (krzVar2 = krzVar9.ae) == null) {
            return;
        }
        ksp kspVar10 = krzVar2.o.i;
        ksp kspVar11 = this.i;
        j(kspVar11, kspVar10, krzVar9.k());
        i(this.j, kspVar11, 1, ksqVar);
    }

    @Override // defpackage.kta
    public final void c() {
        ksp kspVar = this.i;
        if (kspVar.i) {
            this.d.aj = kspVar.f;
        }
    }

    @Override // defpackage.kta
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.kta
    public final boolean e() {
        return this.k != 3 || this.d.C == 0;
    }

    @Override // defpackage.kta, defpackage.ksn
    public final void f() {
        float f;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            krz krzVar = this.d;
            m(krzVar.T, krzVar.V, 0);
            return;
        }
        ksq ksqVar = this.f;
        if (!ksqVar.i && this.k == 3) {
            krz krzVar2 = this.d;
            int i3 = krzVar2.C;
            if (i3 == 2) {
                krz krzVar3 = krzVar2.ae;
                if (krzVar3 != null) {
                    if (krzVar3.o.f.i) {
                        ksqVar.c((int) ((r7.f * krzVar2.H) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = krzVar2.D;
                if (i4 == 0 || i4 == 3) {
                    ksx ksxVar = krzVar2.p;
                    ksp kspVar = ksxVar.i;
                    ksp kspVar2 = ksxVar.j;
                    boolean z = krzVar2.T.e != null;
                    boolean z2 = krzVar2.U.e != null;
                    boolean z3 = krzVar2.V.e != null;
                    boolean z4 = krzVar2.W.e != null;
                    int i5 = krzVar2.ai;
                    if (z && z2 && z3 && z4) {
                        float f2 = krzVar2.ah;
                        if (kspVar.i && kspVar2.i) {
                            ksp kspVar3 = this.i;
                            if (kspVar3.c) {
                                ksp kspVar4 = this.j;
                                if (kspVar4.c) {
                                    int i6 = ((ksp) kspVar3.k.get(0)).f + kspVar3.e;
                                    int i7 = ((ksp) kspVar4.k.get(0)).f - kspVar4.e;
                                    int i8 = kspVar.f + kspVar.e;
                                    int i9 = kspVar2.f - kspVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    ksqVar.c(iArr[0]);
                                    this.d.p.f.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ksp kspVar5 = this.i;
                        if (kspVar5.i) {
                            ksp kspVar6 = this.j;
                            if (kspVar6.i) {
                                if (!kspVar.c || !kspVar2.c) {
                                    return;
                                }
                                int i10 = kspVar5.f + kspVar5.e;
                                int i11 = kspVar6.f - kspVar6.e;
                                int i12 = ((ksp) kspVar.k.get(0)).f + kspVar.e;
                                int i13 = ((ksp) kspVar2.k.get(0)).f - kspVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                ksqVar.c(iArr2[0]);
                                this.d.p.f.c(iArr2[1]);
                            }
                        }
                        if (!kspVar5.c) {
                            return;
                        }
                        ksp kspVar7 = this.j;
                        if (!kspVar7.c || !kspVar.c || !kspVar2.c) {
                            return;
                        }
                        int i14 = ((ksp) kspVar5.k.get(0)).f + kspVar5.e;
                        int i15 = ((ksp) kspVar7.k.get(0)).f - kspVar7.e;
                        int i16 = ((ksp) kspVar.k.get(0)).f + kspVar.e;
                        int i17 = ((ksp) kspVar2.k.get(0)).f - kspVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        ksqVar.c(iArr3[0]);
                        this.d.p.f.c(iArr3[1]);
                    } else if (z && z3) {
                        ksp kspVar8 = this.i;
                        if (!kspVar8.c) {
                            return;
                        }
                        ksp kspVar9 = this.j;
                        if (!kspVar9.c) {
                            return;
                        }
                        float f3 = krzVar2.ah;
                        int i18 = (((ksp) kspVar9.k.get(0)).f - kspVar9.e) - (((ksp) kspVar8.k.get(0)).f + kspVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            ksqVar.c(iH);
                            this.d.p.f.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            ksqVar.c(iH3);
                            this.d.p.f.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!kspVar.c || !kspVar2.c) {
                            return;
                        }
                        float f4 = krzVar2.ah;
                        int i21 = (((ksp) kspVar2.k.get(0)).f - kspVar2.e) - (((ksp) kspVar.k.get(0)).f + kspVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            ksqVar.c(iH6);
                            this.d.p.f.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            ksqVar.c(iH8);
                            this.d.p.f.c(iH7);
                        }
                    }
                } else {
                    int i24 = krzVar2.ai;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = krzVar2.p.f.f;
                        float f6 = krzVar2.ah;
                        f = f5 * f6;
                        ksqVar.c((int) (f + 0.5f));
                    } else {
                        f = krzVar2.p.f.f / krzVar2.ah;
                        ksqVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        ksp kspVar10 = this.i;
        if (kspVar10.c) {
            ksp kspVar11 = this.j;
            if (kspVar11.c) {
                if (kspVar10.i && kspVar11.i && ksqVar.i) {
                    return;
                }
                if (!ksqVar.i && this.k == 3) {
                    krz krzVar4 = this.d;
                    if (krzVar4.C == 0 && !krzVar4.S()) {
                        ksp kspVar12 = (ksp) kspVar10.k.get(0);
                        ksp kspVar13 = (ksp) kspVar11.k.get(0);
                        int i25 = kspVar12.f + kspVar10.e;
                        int i26 = kspVar13.f + kspVar11.e;
                        kspVar10.c(i25);
                        kspVar11.c(i26);
                        ksqVar.c(i26 - i25);
                        return;
                    }
                }
                if (!ksqVar.i && this.k == 3 && this.c == 1) {
                    List list = kspVar10.k;
                    if (list.size() > 0) {
                        List list2 = kspVar11.k;
                        if (list2.size() > 0) {
                            ksp kspVar14 = (ksp) list.get(0);
                            int iMin = Math.min((((ksp) list2.get(0)).f + kspVar11.e) - (kspVar14.f + kspVar10.e), ksqVar.m);
                            krz krzVar5 = this.d;
                            int i27 = krzVar5.G;
                            int iMax = Math.max(krzVar5.F, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            ksqVar.c(iMax);
                        }
                    }
                }
                if (ksqVar.i) {
                    ksp kspVar15 = (ksp) kspVar10.k.get(0);
                    ksp kspVar16 = (ksp) kspVar11.k.get(0);
                    int i28 = kspVar15.f;
                    int i29 = kspVar10.e + i28;
                    int i30 = kspVar16.f;
                    int i31 = kspVar11.e + i30;
                    float f7 = this.d.ao;
                    if (kspVar15 == kspVar16) {
                        f7 = 0.5f;
                    }
                    if (kspVar15 != kspVar16) {
                        i30 = i31;
                    }
                    if (kspVar15 != kspVar16) {
                        i28 = i29;
                    }
                    kspVar10.c((int) (i28 + 0.5f + (((i30 - i28) - ksqVar.f) * f7)));
                    kspVar11.c(kspVar10.f + ksqVar.f);
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        ksp kspVar = this.i;
        kspVar.b();
        kspVar.i = false;
        ksp kspVar2 = this.j;
        kspVar2.b();
        kspVar2.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.as));
    }
}
