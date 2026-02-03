package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksx extends kta {
    public final ksp a;
    ksq b;

    public ksx(krz krzVar) {
        super(krzVar);
        ksp kspVar = new ksp(this);
        this.a = kspVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        kspVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksx.b():void");
    }

    @Override // defpackage.kta
    public final void c() {
        ksp kspVar = this.i;
        if (kspVar.i) {
            this.d.ak = kspVar.f;
        }
    }

    @Override // defpackage.kta
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.kta
    public final boolean e() {
        return this.k != 3 || this.d.D == 0;
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
            m(krzVar.U, krzVar.W, 1);
            return;
        }
        ksq ksqVar = this.f;
        if (ksqVar.c && !ksqVar.i && this.k == 3) {
            krz krzVar2 = this.d;
            int i3 = krzVar2.D;
            if (i3 == 2) {
                krz krzVar3 = krzVar2.ae;
                if (krzVar3 != null) {
                    if (krzVar3.p.f.i) {
                        ksqVar.c((int) ((r5.f * krzVar2.K) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                ksq ksqVar2 = krzVar2.o.f;
                if (ksqVar2.i) {
                    int i4 = krzVar2.ai;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = ksqVar2.f;
                        float f3 = krzVar2.ah;
                        f = f2 / f3;
                        ksqVar.c((int) (f + 0.5f));
                    } else {
                        f = ksqVar2.f * krzVar2.ah;
                        ksqVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        ksp kspVar = this.i;
        if (kspVar.c) {
            ksp kspVar2 = this.j;
            if (kspVar2.c) {
                if (kspVar.i && kspVar2.i && ksqVar.i) {
                    return;
                }
                if (!ksqVar.i && this.k == 3) {
                    krz krzVar4 = this.d;
                    if (krzVar4.C == 0 && !krzVar4.T()) {
                        ksp kspVar3 = (ksp) kspVar.k.get(0);
                        ksp kspVar4 = (ksp) kspVar2.k.get(0);
                        int i5 = kspVar3.f + kspVar.e;
                        int i6 = kspVar4.f + kspVar2.e;
                        kspVar.c(i5);
                        kspVar2.c(i6);
                        ksqVar.c(i6 - i5);
                        return;
                    }
                }
                if (!ksqVar.i && this.k == 3 && this.c == 1) {
                    List list = kspVar.k;
                    if (list.size() > 0) {
                        List list2 = kspVar2.k;
                        if (list2.size() > 0) {
                            ksp kspVar5 = (ksp) list.get(0);
                            ksp kspVar6 = (ksp) list2.get(0);
                            int i7 = kspVar5.f + kspVar.e;
                            int i8 = kspVar6.f + kspVar2.e;
                            int i9 = ksqVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                ksqVar.c(i10);
                            } else {
                                ksqVar.c(i9);
                            }
                        }
                    }
                }
                if (ksqVar.i) {
                    List list3 = kspVar.k;
                    if (list3.size() > 0) {
                        List list4 = kspVar2.k;
                        if (list4.size() > 0) {
                            ksp kspVar7 = (ksp) list3.get(0);
                            ksp kspVar8 = (ksp) list4.get(0);
                            int i11 = kspVar7.f;
                            int i12 = kspVar.e + i11;
                            int i13 = kspVar8.f;
                            int i14 = kspVar2.e + i13;
                            float f4 = this.d.ap;
                            if (kspVar7 == kspVar8) {
                                f4 = 0.5f;
                            }
                            if (kspVar7 != kspVar8) {
                                i13 = i14;
                            }
                            if (kspVar7 != kspVar8) {
                                i11 = i12;
                            }
                            kspVar.c((int) (i11 + 0.5f + (((i13 - i11) - ksqVar.f) * f4)));
                            kspVar2.c(kspVar.f + ksqVar.f);
                        }
                    }
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
        ksp kspVar3 = this.a;
        kspVar3.b();
        kspVar3.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.as));
    }
}
