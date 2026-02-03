package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqt {
    public final ffez a;
    fcqr[] b = new fcqr[8];
    int c;
    public int d;
    private int e;

    public fcqt(ffez ffezVar) {
        this.d = r0.length - 1;
        this.a = ffezVar;
    }

    public final void a(fcqr fcqrVar) {
        int i;
        int i2 = fcqrVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            fcqr[] fcqrVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(fcqrVarArr, i6, fcqrVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        fcqr[] fcqrVarArr2 = this.b;
        int length2 = fcqrVarArr2.length;
        if (i7 > length2) {
            fcqr[] fcqrVarArr3 = new fcqr[length2 + length2];
            System.arraycopy(fcqrVarArr2, 0, fcqrVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = fcqrVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = fcqrVar;
        this.c++;
        this.e += i2;
    }

    final void b(fffd fffdVar) {
        c(fffdVar.b(), 127, 0);
        this.a.L(fffdVar);
    }

    final void c(int i, int i2, int i3) {
        if (i < i2) {
            this.a.P(i | i3);
            return;
        }
        ffez ffezVar = this.a;
        ffezVar.P(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            ffezVar.P(128 | (i4 & 127));
            i4 >>>= 7;
        }
        ffezVar.P(i4);
    }
}
