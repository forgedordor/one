package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class az {
    public final ay d;
    public be a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public az(ba baVar) {
        this.d = new ay(this, baVar);
    }

    public final void a(be beVar) {
        be beVar2 = this.a;
        if (beVar2 != null) {
            this.d.f(beVar2, -1.0f);
            this.a = null;
        }
        ay ayVar = this.d;
        float f = -ayVar.c(beVar);
        this.a = beVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        int i = ayVar.f;
        for (int i2 = 0; i != -1 && i2 < ayVar.a; i2++) {
            float[] fArr = ayVar.e;
            fArr[i] = fArr[i] / f;
            i = ayVar.d[i];
        }
    }

    final void b() {
        ay ayVar = this.d;
        int i = ayVar.f;
        for (int i2 = 0; i != -1 && i2 < ayVar.a; i2++) {
            be beVar = ayVar.b.a[ayVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = beVar.g;
                if (i3 >= i4) {
                    az[] azVarArr = beVar.f;
                    int length = azVarArr.length;
                    if (i4 >= length) {
                        beVar.f = (az[]) Arrays.copyOf(azVarArr, length + length);
                    }
                    az[] azVarArr2 = beVar.f;
                    int i5 = beVar.g;
                    azVarArr2[i5] = this;
                    beVar.g = i5 + 1;
                } else if (beVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = ayVar.d[i];
        }
    }

    public final void c(be beVar, be beVar2) {
        ay ayVar = this.d;
        ayVar.f(beVar, 1.0f);
        ayVar.f(beVar2, -1.0f);
    }

    final void d(be beVar, be beVar2, int i, float f, be beVar3, be beVar4, int i2) {
        if (beVar2 == beVar3) {
            ay ayVar = this.d;
            ayVar.f(beVar, 1.0f);
            ayVar.f(beVar4, 1.0f);
            ayVar.f(beVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            ay ayVar2 = this.d;
            ayVar2.f(beVar, 1.0f);
            ayVar2.f(beVar2, -1.0f);
            ayVar2.f(beVar3, -1.0f);
            ayVar2.f(beVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            ay ayVar3 = this.d;
            ayVar3.f(beVar, -1.0f);
            ayVar3.f(beVar2, 1.0f);
            this.b = i;
            return;
        }
        if (f >= 1.0f) {
            ay ayVar4 = this.d;
            ayVar4.f(beVar3, -1.0f);
            ayVar4.f(beVar4, 1.0f);
            this.b = i2;
            return;
        }
        ay ayVar5 = this.d;
        float f2 = 1.0f - f;
        ayVar5.f(beVar, f2);
        ayVar5.f(beVar2, -f2);
        ayVar5.f(beVar3, -f);
        ayVar5.f(beVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(be beVar, be beVar2, be beVar3, be beVar4, float f) {
        ay ayVar = this.d;
        ayVar.f(beVar, -1.0f);
        ayVar.f(beVar2, 1.0f);
        ayVar.f(beVar3, f);
        ayVar.f(beVar4, -f);
    }

    public final void f(float f, float f2, float f3, be beVar, int i, be beVar2, int i2, be beVar3, int i3, be beVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            ay ayVar = this.d;
            ayVar.f(beVar, 1.0f);
            ayVar.f(beVar2, -1.0f);
            ayVar.f(beVar4, 1.0f);
            ayVar.f(beVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        ay ayVar2 = this.d;
        ayVar2.f(beVar, 1.0f);
        ayVar2.f(beVar2, -1.0f);
        ayVar2.f(beVar4, f4);
        ayVar2.f(beVar3, -f4);
    }

    public final void g(be beVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(beVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(beVar, -1.0f);
        }
    }

    public final void h(be beVar, be beVar2, int i) {
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
                ay ayVar = this.d;
                ayVar.f(beVar, 1.0f);
                ayVar.f(beVar2, -1.0f);
                return;
            }
        }
        ay ayVar2 = this.d;
        ayVar2.f(beVar, -1.0f);
        ayVar2.f(beVar2, 1.0f);
    }

    public final void i(be beVar, be beVar2, be beVar3, int i) {
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
                ay ayVar = this.d;
                ayVar.f(beVar, 1.0f);
                ayVar.f(beVar2, -1.0f);
                ayVar.f(beVar3, -1.0f);
                return;
            }
        }
        ay ayVar2 = this.d;
        ayVar2.f(beVar, -1.0f);
        ayVar2.f(beVar2, 1.0f);
        ayVar2.f(beVar3, 1.0f);
    }

    public final void j(be beVar, be beVar2, be beVar3, int i) {
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
                ay ayVar = this.d;
                ayVar.f(beVar, 1.0f);
                ayVar.f(beVar2, -1.0f);
                ayVar.f(beVar3, 1.0f);
                return;
            }
        }
        ay ayVar2 = this.d;
        ayVar2.f(beVar, -1.0f);
        ayVar2.f(beVar2, 1.0f);
        ayVar2.f(beVar3, -1.0f);
    }

    public final void k(az azVar) {
        this.d.g(this, azVar);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            be beVar = this.a;
            Objects.toString(beVar);
            strConcat = "".concat(String.valueOf(beVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        ay ayVar = this.d;
        int i = ayVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ayVar.d(i2) != null) {
                float fB = ayVar.b(i2);
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
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
