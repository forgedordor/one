package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqe {
    public static boolean a = false;
    public static long b;
    public final kqd j;
    private final kqc r;
    private kqc s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private kqj[] p = new kqj[1000];
    private int q = 0;
    kqc[] e = new kqc[32];

    public kqe() {
        t();
        kqd kqdVar = new kqd();
        this.j = kqdVar;
        this.r = new kqi(kqdVar);
        this.s = new kqc(kqdVar);
    }

    public static final int o(Object obj) {
        kqj kqjVar = ((kry) obj).h;
        if (kqjVar != null) {
            return (int) (kqjVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(kqc kqcVar) {
        int i;
        if (kqcVar.d) {
            kqcVar.a.d(this, kqcVar.b);
        } else {
            kqc[] kqcVarArr = this.e;
            int i2 = this.i;
            kqcVarArr[i2] = kqcVar;
            kqj kqjVar = kqcVar.a;
            kqjVar.d = i2;
            this.i = i2 + 1;
            kqjVar.e(this, kqcVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                kqc kqcVar2 = this.e[i3];
                if (kqcVar2 != null && kqcVar2.d) {
                    kqcVar2.a.d(this, kqcVar2.b);
                    this.j.b.b(kqcVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        kqc[] kqcVarArr2 = this.e;
                        int i6 = i4 - 1;
                        kqc kqcVar3 = kqcVarArr2[i4];
                        kqcVarArr2[i6] = kqcVar3;
                        kqj kqjVar2 = kqcVar3.a;
                        if (kqjVar2.d == i4) {
                            kqjVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            kqc kqcVar = this.e[i];
            kqcVar.a.f = kqcVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (kqc[]) Arrays.copyOf(this.e, i2);
        kqd kqdVar = this.j;
        kqdVar.a = (kqj[]) Arrays.copyOf(kqdVar.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            kqc kqcVar = this.e[i];
            if (kqcVar != null) {
                this.j.b.b(kqcVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(kqc kqcVar) {
        kqb kqbVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            kqj kqjVar = kqcVar.a;
            if (kqjVar != null) {
                this.n[kqjVar.c] = true;
            }
            kqj kqjVarK = kqcVar.k(this.n);
            if (kqjVarK != null) {
                boolean[] zArr = this.n;
                int i5 = kqjVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (kqjVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    kqc kqcVar2 = this.e[i7];
                    if (kqcVar2.a.n != 1 && !kqcVar2.d && (i = (kqbVar = kqcVar2.e).f) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i == -1 || i8 >= kqbVar.a) {
                                break;
                            }
                            if (kqbVar.c[i] == kqjVarK.c) {
                                float fA = kqcVar2.e.a(kqjVarK);
                                if (fA < 0.0f) {
                                    float f2 = (-kqcVar2.b) / fA;
                                    if (f2 < f) {
                                        i6 = i7;
                                        f = f2;
                                    }
                                }
                            } else {
                                i = kqbVar.d[i];
                                i8++;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    kqc kqcVar3 = this.e[i6];
                    kqcVar3.a.d = -1;
                    kqcVar3.b(kqjVarK);
                    kqj kqjVar2 = kqcVar3.a;
                    kqjVar2.d = i6;
                    kqjVar2.e(this, kqcVar3);
                }
                z = false;
            }
        }
    }

    private final kqj v(int i) {
        kqj kqjVar = (kqj) this.j.c.a();
        if (kqjVar == null) {
            kqjVar = new kqj(i);
            kqjVar.n = i;
        } else {
            kqjVar.c();
            kqjVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (kqj[]) Arrays.copyOf(this.p, i4);
        }
        kqj[] kqjVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        kqjVarArr[i5] = kqjVar;
        return kqjVar;
    }

    public final kqc a() {
        kqd kqdVar = this.j;
        kqc kqcVar = (kqc) kqdVar.b.a();
        if (kqcVar == null) {
            kqcVar = new kqc(kqdVar);
            b++;
        } else {
            kqcVar.a = null;
            kqcVar.e.f();
            kqcVar.b = 0.0f;
            kqcVar.d = false;
        }
        kqj.a++;
        return kqcVar;
    }

    public final kqj b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        kry kryVar = (kry) obj;
        kqj kqjVar = kryVar.h;
        if (kqjVar == null) {
            kryVar.m();
            kqjVar = kryVar.h;
        }
        int i = kqjVar.c;
        if (i != -1) {
            if (i <= this.d && this.j.a[i] != null) {
                return kqjVar;
            }
            if (i != -1) {
                kqjVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        kqjVar.c = i2;
        kqjVar.n = 1;
        this.j.a[i2] = kqjVar;
        return kqjVar;
    }

    public final kqj c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        kqj kqjVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        kqjVarV.c = i;
        this.j.a[i] = kqjVarV;
        return kqjVarV;
    }

    public final void d(kqj kqjVar, kqj kqjVar2, int i, float f, kqj kqjVar3, kqj kqjVar4, int i2, int i3) {
        kqc kqcVarA = a();
        if (kqjVar2 == kqjVar3) {
            kqcVarA.e.g(kqjVar, 1.0f);
            kqcVarA.e.g(kqjVar4, 1.0f);
            kqcVarA.e.g(kqjVar2, -2.0f);
        } else if (f == 0.5f) {
            kqcVarA.e.g(kqjVar, 1.0f);
            kqcVarA.e.g(kqjVar2, -1.0f);
            kqcVarA.e.g(kqjVar3, -1.0f);
            kqcVarA.e.g(kqjVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                kqcVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            kqcVarA.e.g(kqjVar, -1.0f);
            kqcVarA.e.g(kqjVar2, 1.0f);
            kqcVarA.b = i;
        } else if (f >= 1.0f) {
            kqcVarA.e.g(kqjVar4, -1.0f);
            kqcVarA.e.g(kqjVar3, 1.0f);
            kqcVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            kqcVarA.e.g(kqjVar, f2);
            kqcVarA.e.g(kqjVar2, -f2);
            kqcVarA.e.g(kqjVar3, -f);
            kqcVarA.e.g(kqjVar4, f);
            if (i > 0 || i2 > 0) {
                kqcVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            kqcVarA.f(this, i3);
        }
        e(kqcVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.kqc r18) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.e(kqc):void");
    }

    public final void f(kqj kqjVar, int i) {
        int i2 = kqjVar.d;
        if (i2 == -1) {
            kqjVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                kqj kqjVar2 = this.j.a[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            kqc kqcVarA = a();
            kqcVarA.a = kqjVar;
            kqjVar.f = f;
            kqcVarA.b = f;
            kqcVarA.d = true;
            e(kqcVarA);
            return;
        }
        kqc kqcVar = this.e[i2];
        if (kqcVar.d) {
            kqcVar.b = i;
            return;
        }
        if (kqcVar.e.a == 0) {
            kqcVar.d = true;
            kqcVar.b = i;
            return;
        }
        kqc kqcVarA2 = a();
        if (i < 0) {
            kqcVarA2.b = -i;
            kqcVarA2.e.g(kqjVar, 1.0f);
        } else {
            kqcVarA2.b = i;
            kqcVarA2.e.g(kqjVar, -1.0f);
        }
        e(kqcVarA2);
    }

    public final void g(kqj kqjVar, kqj kqjVar2, int i, int i2) {
        kqc kqcVarA = a();
        kqj kqjVarC = c();
        kqjVarC.e = 0;
        kqcVarA.h(kqjVar, kqjVar2, kqjVarC, i);
        if (i2 != 8) {
            i(kqcVarA, (int) (-kqcVarA.e.a(kqjVarC)), i2);
        }
        e(kqcVarA);
    }

    public final void h(kqj kqjVar, kqj kqjVar2, int i, int i2) {
        kqc kqcVarA = a();
        kqj kqjVarC = c();
        kqjVarC.e = 0;
        kqcVarA.i(kqjVar, kqjVar2, kqjVarC, i);
        if (i2 != 8) {
            i(kqcVarA, (int) (-kqcVarA.e.a(kqjVarC)), i2);
        }
        e(kqcVarA);
    }

    final void i(kqc kqcVar, int i, int i2) {
        kqcVar.e.g(p(i2), i);
    }

    public final void j() {
        kqc kqcVar = this.r;
        if (kqcVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(kqcVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(kqcVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        kqd kqdVar;
        int i = 0;
        while (true) {
            kqdVar = this.j;
            kqj[] kqjVarArr = kqdVar.a;
            if (i >= kqjVarArr.length) {
                break;
            }
            kqj kqjVar = kqjVarArr[i];
            if (kqjVar != null) {
                kqjVar.c();
            }
            i++;
        }
        kqf kqfVar = kqdVar.c;
        kqj[] kqjVarArr2 = this.p;
        int i2 = this.q;
        int length = kqjVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            kqj kqjVar2 = kqjVarArr2[i3];
            int i4 = kqfVar.b;
            if (i4 < 256) {
                kqfVar.a[i4] = kqjVar2;
                kqfVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(kqdVar.a, (Object) null);
        this.d = 0;
        kqi kqiVar = (kqi) this.r;
        kqiVar.f = 0;
        kqiVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            kqc kqcVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new kqc(kqdVar);
    }

    final void l(kqc kqcVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            kqc kqcVar2 = this.e[i];
            if (kqcVar2.a.n != 1) {
                float f = 0.0f;
                if (kqcVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            kqc kqcVar3 = this.e[i5];
                            if (kqcVar3.a.n != 1 && !kqcVar3.d && kqcVar3.b < f) {
                                int i7 = kqcVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    kqj kqjVarD = kqcVar3.e.d(i8);
                                    float fA = kqcVar3.e.a(kqjVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = kqjVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = kqjVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            kqc kqcVar4 = this.e[i3];
                            kqcVar4.a.d = -1;
                            kqcVar4.b(this.j.a[i4]);
                            kqj kqjVar = kqcVar4.a;
                            kqjVar.d = i3;
                            kqjVar.e(this, kqcVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(kqcVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.kqj r6, defpackage.kqj r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            kqc r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            kqb r8 = r1.e
            r8.g(r6, r2)
            kqb r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            kqb r8 = r1.e
            r8.g(r6, r3)
            kqb r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.m(kqj, kqj, int, int):void");
    }

    public final void n(kqj kqjVar, kqj kqjVar2, kqj kqjVar3, kqj kqjVar4, float f) {
        kqc kqcVarA = a();
        kqcVarA.g(kqjVar, kqjVar2, kqjVar3, kqjVar4, f);
        e(kqcVarA);
    }

    public final kqj p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        kqj kqjVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        kqjVarV.c = i2;
        kqjVarV.e = i;
        this.j.a[i2] = kqjVarV;
        kqi kqiVar = (kqi) this.r;
        kqh kqhVar = kqiVar.g;
        kqhVar.a = kqjVarV;
        Arrays.fill(kqhVar.a.i, 0.0f);
        kqjVarV.i[kqjVarV.e] = 1.0f;
        kqiVar.m(kqjVarV);
        return kqjVarV;
    }
}
