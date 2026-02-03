package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqc {
    kqj a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public kqb e;

    public kqc() {
    }

    public static final boolean l(kqj kqjVar) {
        return kqjVar.l <= 1;
    }

    public final kqj a(boolean[] zArr, kqj kqjVar) {
        int i;
        int i2 = this.e.a;
        kqj kqjVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                kqj kqjVarD = this.e.d(i3);
                if ((zArr == null || !zArr[kqjVarD.c]) && kqjVarD != kqjVar && (((i = kqjVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    kqjVar2 = kqjVarD;
                }
            }
        }
        return kqjVar2;
    }

    final void b(kqj kqjVar) {
        kqj kqjVar2 = this.a;
        if (kqjVar2 != null) {
            this.e.g(kqjVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(kqjVar, true);
        this.a = kqjVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        kqb kqbVar = this.e;
        int i = kqbVar.f;
        for (int i2 = 0; i != -1 && i2 < kqbVar.a; i2++) {
            float[] fArr = kqbVar.e;
            fArr[i] = fArr[i] / f;
            i = kqbVar.d[i];
        }
    }

    public final void c(kqe kqeVar, kqj kqjVar, boolean z) {
        if (kqjVar == null || !kqjVar.g) {
            return;
        }
        this.b += kqjVar.f * this.e.a(kqjVar);
        this.e.c(kqjVar, z);
        if (z) {
            kqjVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            kqeVar.c = true;
        }
    }

    public void d(kqe kqeVar, kqc kqcVar, boolean z) {
        kqb kqbVar = this.e;
        float fA = kqbVar.a(kqcVar.a);
        kqbVar.c(kqcVar.a, z);
        kqb kqbVar2 = kqcVar.e;
        int i = kqbVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            kqj kqjVarD = kqbVar2.d(i2);
            kqbVar.e(kqjVarD, kqbVar2.a(kqjVarD) * fA, z);
        }
        this.b += kqcVar.b * fA;
        if (z) {
            kqcVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        kqeVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(kqe kqeVar, int i) {
        this.e.g(kqeVar.p(i), 1.0f);
        this.e.g(kqeVar.p(i), -1.0f);
    }

    public final void g(kqj kqjVar, kqj kqjVar2, kqj kqjVar3, kqj kqjVar4, float f) {
        this.e.g(kqjVar, -1.0f);
        this.e.g(kqjVar2, 1.0f);
        this.e.g(kqjVar3, f);
        this.e.g(kqjVar4, -f);
    }

    public final void h(kqj kqjVar, kqj kqjVar2, kqj kqjVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(kqjVar, 1.0f);
                this.e.g(kqjVar2, -1.0f);
                this.e.g(kqjVar3, -1.0f);
                return;
            }
        }
        this.e.g(kqjVar, -1.0f);
        this.e.g(kqjVar2, 1.0f);
        this.e.g(kqjVar3, 1.0f);
    }

    public final void i(kqj kqjVar, kqj kqjVar2, kqj kqjVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(kqjVar, 1.0f);
                this.e.g(kqjVar2, -1.0f);
                this.e.g(kqjVar3, 1.0f);
                return;
            }
        }
        this.e.g(kqjVar, -1.0f);
        this.e.g(kqjVar2, 1.0f);
        this.e.g(kqjVar3, -1.0f);
    }

    public final void j(kqj kqjVar, kqj kqjVar2, kqj kqjVar3, kqj kqjVar4, float f) {
        this.e.g(kqjVar3, 0.5f);
        this.e.g(kqjVar4, 0.5f);
        this.e.g(kqjVar, -0.5f);
        this.e.g(kqjVar2, -0.5f);
        this.b = -f;
    }

    public kqj k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            kqj kqjVar = this.a;
            Objects.toString(kqjVar);
            strConcat = "".concat(String.valueOf(kqjVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            kqj kqjVarD = this.e.d(i2);
            if (kqjVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string = kqjVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public kqc(kqd kqdVar) {
        this.e = new kqb(this, kqdVar);
    }
}
