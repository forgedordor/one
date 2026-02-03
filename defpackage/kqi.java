package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqi extends kqc {
    public int f;
    final kqh g;
    private kqj[] h;
    private kqj[] i;

    public kqi(kqd kqdVar) {
        super(kqdVar);
        this.h = new kqj[128];
        this.i = new kqj[128];
        this.f = 0;
        this.g = new kqh(this);
    }

    @Override // defpackage.kqc
    public final void d(kqe kqeVar, kqc kqcVar, boolean z) {
        kqj kqjVar = kqcVar.a;
        if (kqjVar == null) {
            return;
        }
        kqb kqbVar = kqcVar.e;
        int i = kqbVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            kqj kqjVarD = kqbVar.d(i2);
            float fB = kqbVar.b(i2);
            kqh kqhVar = this.g;
            kqhVar.a = kqjVarD;
            if (kqhVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = kqhVar.a.i;
                    float f = fArr[i3] + (kqjVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        kqhVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    kqhVar.b.n(kqhVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = kqjVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        kqhVar.a.i[i4] = f3;
                    } else {
                        kqhVar.a.i[i4] = 0.0f;
                    }
                }
                m(kqjVarD);
            }
            this.b += kqcVar.b * fB;
        }
        n(kqjVar);
    }

    @Override // defpackage.kqc
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.kqc
    public final kqj k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            kqj[] kqjVarArr = this.h;
            kqj kqjVar = kqjVarArr[i2];
            if (!zArr[kqjVar.c]) {
                kqh kqhVar = this.g;
                kqhVar.a = kqjVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = kqhVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    kqj kqjVar2 = kqjVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = kqjVar2.i[i3];
                            float f3 = kqhVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(kqj kqjVar) {
        int i;
        int i2 = this.f + 1;
        kqj[] kqjVarArr = this.h;
        int length = kqjVarArr.length;
        if (i2 > length) {
            kqj[] kqjVarArr2 = (kqj[]) Arrays.copyOf(kqjVarArr, length + length);
            this.h = kqjVarArr2;
            int length2 = kqjVarArr2.length;
            this.i = (kqj[]) Arrays.copyOf(kqjVarArr2, length2 + length2);
        }
        kqj[] kqjVarArr3 = this.h;
        int i3 = this.f;
        kqjVarArr3[i3] = kqjVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && kqjVarArr3[i3].c > kqjVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new kqg());
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        kqjVar.b = true;
        kqjVar.a(this);
    }

    public final void n(kqj kqjVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == kqjVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        kqjVar.b = false;
                        return;
                    } else {
                        kqj[] kqjVarArr = this.h;
                        int i3 = i + 1;
                        kqjVarArr[i] = kqjVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.kqc
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            kqj kqjVar = this.h[i];
            kqh kqhVar = this.g;
            kqhVar.a = kqjVar;
            str = str + kqhVar + " ";
        }
        return str;
    }
}
