package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbt {
    public final ffez a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 4096;
    public ffbr[] e = new ffbr[8];

    public ffbt(ffez ffezVar) {
        this.a = ffezVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        ffbr[] ffbrVarArr = this.e;
        fcur.d(ffbrVarArr, null, 0, ffbrVarArr.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(ffbr ffbrVar) {
        int i = ffbrVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        ffbr[] ffbrVarArr = this.e;
        int length = ffbrVarArr.length;
        if (i3 > length) {
            ffbr[] ffbrVarArr2 = new ffbr[length + length];
            System.arraycopy(ffbrVarArr, 0, ffbrVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = ffbrVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = ffbrVar;
        this.g++;
        this.h += i;
    }

    public final void c(fffd fffdVar) {
        long j;
        int[] iArr = ffcw.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < fffdVar.b(); i2++) {
            j2 += ffcw.b[fezr.A(fffdVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) >= fffdVar.b()) {
            d(fffdVar.b(), 127, 0);
            this.a.L(fffdVar);
            return;
        }
        ffez ffezVar = new ffez();
        int iB = fffdVar.b();
        long j3 = 0;
        int i3 = 0;
        while (i < iB) {
            int iA = fezr.A(fffdVar.a(i));
            int i4 = ffcw.a[iA];
            byte b = ffcw.b[iA];
            long j4 = j3 << b;
            long j5 = i4;
            i3 += b;
            while (true) {
                j = j4 | j5;
                if (i3 >= 8) {
                    i3 -= 8;
                    ffezVar.P((int) (j >> i3));
                }
            }
            i++;
            j3 = j;
        }
        if (i3 > 0) {
            ffezVar.P((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        fffd fffdVarU = ffezVar.u();
        d(fffdVarU.b(), 127, 128);
        this.a.L(fffdVarU);
    }

    public final void d(int i, int i2, int i3) {
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

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                ffbr ffbrVar = this.e[length];
                ffbrVar.getClass();
                int i4 = this.h;
                ffbrVar.getClass();
                int i5 = ffbrVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            ffbr[] ffbrVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(ffbrVarArr, i6, ffbrVarArr, i6 + i3, this.g);
            ffbr[] ffbrVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(ffbrVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
