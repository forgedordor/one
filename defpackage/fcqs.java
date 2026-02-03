package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqs {
    public final fffb b;
    int f;
    public final List a = new ArrayList();
    fcqr[] e = new fcqr[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public fcqs(ffgb ffgbVar) {
        this.f = r0.length - 1;
        this.b = new fffv(ffgbVar);
    }

    public static final boolean g(int i) {
        if (i < 0) {
            return false;
        }
        int length = fcqu.b.length;
        return i <= 60;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            fcqr[] fcqrVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(fcqrVarArr, i5, fcqrVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iH = h();
            if ((iH & 128) == 0) {
                return i2 + (iH << i4);
            }
            i2 += (iH & 127) << i4;
            i4 += 7;
        }
    }

    public final fffd c(int i) throws IOException {
        if (g(i)) {
            return fcqu.b[i].f;
        }
        int length = fcqu.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            fcqr[] fcqrVarArr = this.e;
            if (iA < fcqrVarArr.length) {
                return fcqrVarArr[iA].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final fffd d() {
        int i;
        int i2;
        int iH = h();
        int i3 = iH & 128;
        long jB = b(iH, 127);
        if (i3 != 128) {
            return this.b.v(jB);
        }
        fffb fffbVar = this.b;
        fcrb fcrbVar = fcrb.a;
        byte[] bArrH = fffbVar.H(jB);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fcra fcraVar = fcrbVar.b;
        int i4 = 0;
        fcra fcraVar2 = fcraVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < bArrH.length) {
            int i7 = bArrH[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    fcraVar2 = fcraVar2.a[(i2 >>> i9) & 255];
                    if (fcraVar2.a == null) {
                        byteArrayOutputStream.write(fcraVar2.b);
                        i6 -= fcraVar2.c;
                        fcraVar2 = fcraVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i2;
        }
        while (i6 > 0) {
            fcra fcraVar3 = fcraVar2.a[(i5 << (8 - i6)) & 255];
            if (fcraVar3.a != null || (i = fcraVar3.c) > i6) {
                break;
            }
            byteArrayOutputStream.write(fcraVar3.b);
            i6 -= i;
            fcraVar2 = fcraVar;
        }
        return fffd.f(byteArrayOutputStream.toByteArray());
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(fcqr fcqrVar) {
        this.a.add(fcqrVar);
        int i = fcqrVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        fcqr[] fcqrVarArr = this.e;
        int length = fcqrVarArr.length;
        if (i3 > length) {
            fcqr[] fcqrVarArr2 = new fcqr[length + length];
            System.arraycopy(fcqrVarArr, 0, fcqrVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = fcqrVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = fcqrVar;
        this.g++;
        this.h += i;
    }
}
