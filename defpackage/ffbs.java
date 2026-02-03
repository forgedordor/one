package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbs {
    public final fffb c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public ffbr[] d = new ffbr[8];

    public ffbs(ffgb ffgbVar) {
        this.c = new fffv(ffgbVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i < 0) {
            return false;
        }
        ffbr[] ffbrVarArr = ffbu.a;
        int length = ffbu.a.length;
        return i <= 60;
    }

    private final int i() {
        return fezr.A(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i();
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final fffd c(int i) {
        if (h(i)) {
            ffbr[] ffbrVarArr = ffbu.a;
            return ffbu.a[i].g;
        }
        ffbr[] ffbrVarArr2 = ffbu.a;
        int length = ffbu.a.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            ffbr[] ffbrVarArr3 = this.d;
            if (iA < ffbrVarArr3.length) {
                ffbr ffbrVar = ffbrVarArr3[iA];
                ffbrVar.getClass();
                return ffbrVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final fffd d() {
        int i;
        int i2;
        int i3 = i();
        int i4 = i3 & 128;
        long jB = b(i3, 127);
        if (i4 != 128) {
            return this.c.v(jB);
        }
        ffez ffezVar = new ffez();
        int[] iArr = ffcw.a;
        fffb fffbVar = this.c;
        ffcv ffcvVar = ffcw.c;
        int i5 = 0;
        ffcv ffcvVar2 = ffcvVar;
        long j = 0;
        int i6 = 0;
        while (j < jB) {
            int iA = fezr.A(fffbVar.d());
            int i7 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i7 | iA;
                if (i6 >= 8) {
                    int i8 = i6 - 8;
                    ffcv[] ffcvVarArr = ffcvVar2.a;
                    ffcvVarArr.getClass();
                    ffcvVar2 = ffcvVarArr[(i2 >>> i8) & 255];
                    ffcvVar2.getClass();
                    if (ffcvVar2.a == null) {
                        ffezVar.P(ffcvVar2.b);
                        i6 -= ffcvVar2.c;
                        ffcvVar2 = ffcvVar;
                    } else {
                        i6 = i8;
                    }
                }
            }
            j++;
            i5 = i2;
        }
        while (i6 > 0) {
            ffcv[] ffcvVarArr2 = ffcvVar2.a;
            ffcvVarArr2.getClass();
            ffcv ffcvVar3 = ffcvVarArr2[(i5 << (8 - i6)) & 255];
            ffcvVar3.getClass();
            if (ffcvVar3.a != null || (i = ffcvVar3.c) > i6) {
                break;
            }
            ffezVar.P(ffcvVar3.b);
            i6 -= i;
            ffcvVar2 = ffcvVar;
        }
        return ffezVar.u();
    }

    public final void e() {
        ffbr[] ffbrVarArr = this.d;
        fcur.d(ffbrVarArr, null, 0, ffbrVarArr.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                ffbr ffbrVar = this.d[length];
                ffbrVar.getClass();
                int i4 = this.f;
                int i5 = ffbrVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            ffbr[] ffbrVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(ffbrVarArr, i6, ffbrVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(ffbr ffbrVar) {
        this.b.add(ffbrVar);
        int i = ffbrVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        ffbr[] ffbrVarArr = this.d;
        int length = ffbrVarArr.length;
        if (i3 > length) {
            ffbr[] ffbrVarArr2 = new ffbr[length + length];
            System.arraycopy(ffbrVarArr, 0, ffbrVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = ffbrVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = ffbrVar;
        this.e++;
        this.f += i;
    }
}
