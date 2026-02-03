package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksd extends krz {
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public kry d = this.U;
    public int e = 0;
    private boolean f;

    public ksd() {
        this.ac.clear();
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i = 0; i < 6; i++) {
            this.ab[i] = this.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.krz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kry V(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.e
            if (r3 != 0) goto L1b
            goto L18
        L14:
            int r3 = r2.e
            if (r3 != r0) goto L1b
        L18:
            kry r3 = r2.d
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksd.V(int):kry");
    }

    @Override // defpackage.krz
    public final void a(kqe kqeVar, boolean z) {
        ksa ksaVar = (ksa) this.ae;
        if (ksaVar == null) {
            return;
        }
        Object objV = ksaVar.V(2);
        Object objV2 = ksaVar.V(4);
        krz krzVar = this.ae;
        boolean z2 = krzVar != null && krzVar.aA[0] == 2;
        if (this.e == 0) {
            objV = ksaVar.V(3);
            objV2 = ksaVar.V(5);
            z2 = krzVar != null && krzVar.aA[1] == 2;
        }
        if (this.f) {
            kry kryVar = this.d;
            if (kryVar.c) {
                kqj kqjVarB = kqeVar.b(kryVar);
                kqeVar.f(kqjVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        kqeVar.g(kqeVar.b(objV2), kqjVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    kqj kqjVarB2 = kqeVar.b(objV2);
                    kqeVar.g(kqjVarB, kqeVar.b(objV), 0, 5);
                    kqeVar.g(kqjVarB2, kqjVarB, 0, 5);
                }
                this.f = false;
                return;
            }
        }
        if (this.b != -1) {
            kqj kqjVarB3 = kqeVar.b(this.d);
            kqeVar.m(kqjVarB3, kqeVar.b(objV), this.b, 8);
            if (z2) {
                kqeVar.g(kqeVar.b(objV2), kqjVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            kqj kqjVarB4 = kqeVar.b(this.d);
            kqj kqjVarB5 = kqeVar.b(objV2);
            kqeVar.m(kqjVarB4, kqjVarB5, -this.c, 8);
            if (z2) {
                kqeVar.g(kqjVarB4, kqeVar.b(objV), 0, 5);
                kqeVar.g(kqjVarB5, kqjVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            kqj kqjVarB6 = kqeVar.b(this.d);
            kqj kqjVarB7 = kqeVar.b(objV2);
            float f = this.a;
            kqc kqcVarA = kqeVar.a();
            kqcVarA.e.g(kqjVarB6, -1.0f);
            kqcVarA.e.g(kqjVarB7, f);
            kqeVar.e(kqcVarA);
        }
    }

    @Override // defpackage.krz
    public final void ad(boolean z) {
        if (this.ae == null) {
            return;
        }
        int iO = kqe.o(this.d);
        if (this.e == 1) {
            this.aj = iO;
            this.ak = 0;
            C(this.ae.h());
            N(0);
            return;
        }
        this.aj = 0;
        this.ak = iO;
        N(this.ae.j());
        C(0);
    }

    public final void ae(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.c = i;
        }
    }

    public final void af(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.c = -1;
        }
    }

    public final void ag(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        ArrayList arrayList = this.ac;
        arrayList.clear();
        if (this.e == 1) {
            this.d = this.T;
        } else {
            this.d = this.U;
        }
        arrayList.add(this.d);
        kry[] kryVarArr = this.ab;
        int length = kryVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            kryVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.krz
    public final boolean ay() {
        return true;
    }

    public final void b(int i) {
        this.d.f(i);
        this.f = true;
    }

    public final void c(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.c = -1;
        }
    }

    @Override // defpackage.krz
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.krz
    public final boolean f() {
        return this.f;
    }
}
