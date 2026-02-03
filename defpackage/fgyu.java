package defpackage;

import androidx.car.app.model.Alert;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyu implements Comparable, Serializable {
    public static final fgyu a;
    public static final fgyu b;
    private static final byte[] c = {0};
    private static final byte[] d = {1, 42};
    private static final DecimalFormat e;
    private static final byte[] f;
    private static final fgyu g;
    private static final long serialVersionUID = -7257019940971525644L;
    private byte[] h;
    private long i;
    private int j;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        e = decimalFormat;
        f = new byte[256];
        decimalFormat.setMinimumIntegerDigits(3);
        int i = 0;
        while (true) {
            byte[] bArr = f;
            int length = bArr.length;
            if (i >= 256) {
                fgyu fgyuVar = new fgyu();
                a = fgyuVar;
                fgyuVar.t(c);
                fgyu fgyuVar2 = new fgyu();
                b = fgyuVar2;
                fgyuVar2.h = new byte[0];
                fgyu fgyuVar3 = new fgyu();
                g = fgyuVar3;
                fgyuVar3.t(d);
                return;
            }
            if (i < 65 || i > 90) {
                bArr[i] = (byte) i;
            } else {
                bArr[i] = (byte) (i + 32);
            }
            i++;
        }
    }

    private fgyu() {
    }

    public static fgyu c(fgyu fgyuVar, fgyu fgyuVar2) throws fgyv {
        if (fgyuVar.j()) {
            return fgyuVar;
        }
        fgyu fgyuVar3 = new fgyu();
        p(fgyuVar, fgyuVar3);
        fgyuVar3.n(fgyuVar2.h, fgyuVar2.l(0), fgyuVar2.a());
        return fgyuVar3;
    }

    public static fgyu e(String str, fgyu fgyuVar) {
        return (!str.equals("@") || fgyuVar == null) ? str.equals(".") ? a : new fgyu(str, fgyuVar) : fgyuVar;
    }

    private final int l(int i) {
        if (i == 0) {
            if (a() == 0) {
                return 0;
            }
            i = 0;
        }
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 7) {
            return ((int) (this.i >>> ((7 - i) * 8))) & 255;
        }
        int iL = l(6);
        for (int i2 = 6; i2 < i; i2++) {
            iL += this.h[iL] + 1;
        }
        return iL;
    }

    private static fhae m(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("'");
        stringBuffer.append(str);
        stringBuffer.append("': ");
        stringBuffer.append(str2);
        return new fhae(stringBuffer.toString());
    }

    private final void n(byte[] bArr, int i, int i2) throws fgyv {
        byte[] bArr2 = this.h;
        int length = bArr2 == null ? 0 : bArr2.length - l(0);
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3];
            if (i6 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i7 = i6 + 1;
            i3 += i7;
            i4 += i7;
        }
        int i8 = length + i4;
        if (i8 > 255) {
            throw new fgyv();
        }
        int iA = a();
        int i9 = iA + i2;
        if (i9 > 128) {
            throw new IllegalStateException("too many labels");
        }
        byte[] bArr3 = new byte[i8];
        if (length != 0) {
            System.arraycopy(this.h, l(0), bArr3, 0, length);
        }
        System.arraycopy(bArr, i, bArr3, length, i4);
        this.h = bArr3;
        for (int i10 = 0; i10 < i2; i10++) {
            r(iA + i10, length);
            length += bArr3[length] + 1;
        }
        q(i9);
    }

    private final void o(String str, byte[] bArr, int i, int i2) throws fhae {
        try {
            n(bArr, i, i2);
        } catch (fgyv unused) {
            throw m(str, "Name too long");
        }
    }

    private static final void p(fgyu fgyuVar, fgyu fgyuVar2) {
        if (fgyuVar.l(0) == 0) {
            fgyuVar2.h = fgyuVar.h;
            fgyuVar2.i = fgyuVar.i;
            return;
        }
        int iL = fgyuVar.l(0);
        int length = fgyuVar.h.length - iL;
        int iA = fgyuVar.a();
        byte[] bArr = new byte[length];
        fgyuVar2.h = bArr;
        System.arraycopy(fgyuVar.h, iL, bArr, 0, length);
        for (int i = 0; i < iA && i < 7; i++) {
            fgyuVar2.r(i, fgyuVar.l(i) - iL);
        }
        fgyuVar2.q(iA);
    }

    private final void q(int i) {
        this.i = (this.i & (-256)) | i;
    }

    private final void r(int i, int i2) {
        if (i >= 7) {
            return;
        }
        int i3 = (7 - i) * 8;
        this.i = (i2 << i3) | (this.i & (~(255 << i3)));
    }

    private final boolean s(byte[] bArr, int i) {
        int iA = a();
        int iL = l(0);
        for (int i2 = 0; i2 < iA; i2++) {
            byte b2 = this.h[iL];
            if (b2 != bArr[i]) {
                return false;
            }
            iL++;
            i++;
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i3 = 0;
            while (i3 < b2) {
                byte[] bArr2 = f;
                int i4 = iL + 1;
                int i5 = i + 1;
                if (bArr2[this.h[iL] & 255] != bArr2[bArr[i] & 255]) {
                    return false;
                }
                i3++;
                i = i5;
                iL = i4;
            }
        }
        return true;
    }

    private final void t(byte[] bArr) {
        try {
            n(bArr, 0, 1);
        } catch (fgyv unused) {
        }
    }

    public final int a() {
        return (int) (this.i & 255);
    }

    public final String b(boolean z) {
        int iA = a();
        if (iA == 0) {
            return "@";
        }
        int i = 0;
        if (iA == 1 && this.h[l(0)] == 0) {
            return ".";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int iL = l(0);
        while (true) {
            if (i >= iA) {
                break;
            }
            byte b2 = this.h[iL];
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            if (b2 != 0) {
                if (i > 0) {
                    stringBuffer.append('.');
                }
                byte[] bArr = this.h;
                StringBuffer stringBuffer2 = new StringBuffer();
                int i2 = iL + 1;
                byte b3 = bArr[iL];
                for (int i3 = i2; i3 < i2 + b3; i3++) {
                    int i4 = bArr[i3] & 255;
                    if (i4 <= 32 || i4 >= 127) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(e.format(i4));
                    } else if (i4 == 34 || i4 == 40 || i4 == 41 || i4 == 46 || i4 == 59 || i4 == 92 || i4 == 64 || i4 == 36) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) i4);
                    } else {
                        stringBuffer2.append((char) i4);
                    }
                }
                stringBuffer.append(stringBuffer2.toString());
                iL += b2 + 1;
                i++;
            } else if (!z) {
                stringBuffer.append('.');
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fgyu fgyuVar = (fgyu) obj;
        if (this == fgyuVar) {
            return 0;
        }
        int iA = a();
        int iA2 = fgyuVar.a();
        int i = iA > iA2 ? iA2 : iA;
        for (int i2 = 1; i2 <= i; i2++) {
            int iL = l(iA - i2);
            int iL2 = fgyuVar.l(iA2 - i2);
            byte b2 = this.h[iL];
            byte b3 = fgyuVar.h[iL2];
            for (int i3 = 0; i3 < b2 && i3 < b3; i3++) {
                byte[] bArr = f;
                int i4 = bArr[this.h[(i3 + iL) + 1] & 255] - bArr[fgyuVar.h[(i3 + iL2) + 1] & 255];
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return iA - iA2;
    }

    public final fgyu d(fgxb fgxbVar) throws fgyv {
        fgyu fgyuVar = fgxbVar.f;
        fgyu fgyuVar2 = fgxbVar.a;
        if (!k(fgyuVar)) {
            return null;
        }
        int iA = a() - fgyuVar.a();
        int iF = f() - fgyuVar.f();
        int iL = l(0);
        int iA2 = fgyuVar2.a();
        short sF = fgyuVar2.f();
        int i = iF + sF;
        if (i > 255) {
            throw new fgyv();
        }
        fgyu fgyuVar3 = new fgyu();
        int i2 = iA + iA2;
        fgyuVar3.q(i2);
        byte[] bArr = new byte[i];
        fgyuVar3.h = bArr;
        System.arraycopy(this.h, iL, bArr, 0, iF);
        System.arraycopy(fgyuVar2.h, 0, fgyuVar3.h, iF, sF);
        int i3 = 0;
        for (int i4 = 0; i4 < 7 && i4 < i2; i4++) {
            fgyuVar3.r(i4, i3);
            i3 += fgyuVar3.h[i3] + 1;
        }
        return fgyuVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof fgyu)) {
            fgyu fgyuVar = (fgyu) obj;
            if (fgyuVar.j == 0) {
                fgyuVar.hashCode();
            }
            if (this.j == 0) {
                hashCode();
            }
            if (fgyuVar.j == this.j && fgyuVar.a() == a()) {
                return s(fgyuVar.h, fgyuVar.l(0));
            }
            return false;
        }
        return false;
    }

    public final short f() {
        if (a() == 0) {
            return (short) 0;
        }
        return (short) (this.h.length - l(0));
    }

    public final void g(fgxe fgxeVar, fgww fgwwVar) {
        int i;
        if (!j()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int iA = a();
        int i2 = 0;
        while (true) {
            int i3 = -1;
            if (i2 >= iA - 1) {
                fgxeVar.g(0);
                return;
            }
            fgyu fgyuVar = i2 == 0 ? this : new fgyu(this, i2);
            if (fgwwVar != null) {
                for (fgwv fgwvVar = fgwwVar.a[(fgyuVar.hashCode() & Alert.DURATION_SHOW_INDEFINITELY) % 17]; fgwvVar != null; fgwvVar = fgwvVar.c) {
                    if (fgwvVar.a.equals(fgyuVar)) {
                        i3 = fgwvVar.b;
                    }
                }
                if (fgwwVar.b) {
                    PrintStream printStream = System.err;
                    StringBuffer stringBuffer = new StringBuffer("Looking for ");
                    stringBuffer.append(fgyuVar);
                    stringBuffer.append(", found ");
                    stringBuffer.append(i3);
                    printStream.println(stringBuffer.toString());
                }
            }
            if (i3 >= 0) {
                fgxeVar.d(49152 | i3);
                return;
            }
            if (fgwwVar != null && (i = fgxeVar.a) <= 16383) {
                int iHashCode = (Integer.MAX_VALUE & fgyuVar.hashCode()) % 17;
                fgwv fgwvVar2 = new fgwv();
                fgwvVar2.a = fgyuVar;
                fgwvVar2.b = i;
                fgwv[] fgwvVarArr = fgwwVar.a;
                fgwvVar2.c = fgwvVarArr[iHashCode];
                fgwvVarArr[iHashCode] = fgwvVar2;
                if (fgwwVar.b) {
                    PrintStream printStream2 = System.err;
                    StringBuffer stringBuffer2 = new StringBuffer("Adding ");
                    stringBuffer2.append(fgyuVar);
                    stringBuffer2.append(" at ");
                    stringBuffer2.append(i);
                    printStream2.println(stringBuffer2.toString());
                }
            }
            int iL = l(i2);
            byte[] bArr = this.h;
            fgxeVar.b(bArr, iL, bArr[iL] + 1);
            i2++;
        }
    }

    public final void h(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        if (z) {
            i(fgxeVar);
        } else {
            g(fgxeVar, fgwwVar);
        }
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int iL = l(0);
        while (true) {
            byte[] bArr = this.h;
            if (iL >= bArr.length) {
                this.j = i2;
                return i2;
            }
            i2 += (i2 << 3) + f[bArr[iL] & 255];
            iL++;
        }
    }

    public final void i(fgxe fgxeVar) {
        byte[] bArr;
        int iA = a();
        if (iA == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[this.h.length - l(0)];
            int iL = l(0);
            int i = 0;
            for (int i2 = 0; i2 < iA; i2++) {
                byte b2 = this.h[iL];
                if (b2 > 63) {
                    throw new IllegalStateException("invalid label");
                }
                bArr2[i] = b2;
                iL++;
                i++;
                int i3 = 0;
                while (i3 < b2) {
                    bArr2[i] = f[this.h[iL] & 255];
                    i3++;
                    i++;
                    iL++;
                }
            }
            bArr = bArr2;
        }
        fgxeVar.a(bArr);
    }

    public final boolean j() {
        int iA = a();
        return iA != 0 && this.h[l(iA + (-1))] == 0;
    }

    public final boolean k(fgyu fgyuVar) {
        int iA = a();
        int iA2 = fgyuVar.a();
        if (iA2 > iA) {
            return false;
        }
        return iA2 == iA ? equals(fgyuVar) : fgyuVar.s(this.h, l(iA - iA2));
    }

    public final String toString() {
        return b(false);
    }

    public fgyu(String str, fgyu fgyuVar) throws fhae {
        int i;
        boolean z;
        if (str.equals("")) {
            throw m(str, "empty name");
        }
        if (str.equals("@")) {
            if (fgyuVar == null) {
                p(b, this);
                return;
            } else {
                p(fgyuVar, this);
                return;
            }
        }
        if (str.equals(".")) {
            p(a, this);
            return;
        }
        byte[] bArr = new byte[64];
        int i2 = -1;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            byte bCharAt = (byte) str.charAt(i6);
            if (z2) {
                if (bCharAt >= 48 && bCharAt <= 57 && i3 < 3) {
                    i3++;
                    i5 = (i5 * 10) + (bCharAt - 48);
                    if (i5 > 255) {
                        throw m(str, "bad escape");
                    }
                    if (i3 >= 3) {
                        bCharAt = (byte) i5;
                    }
                    z2 = true;
                } else if (i3 > 0 && i3 < 3) {
                    throw m(str, "bad escape");
                }
                if (i4 > 63) {
                    throw m(str, "label too long");
                }
                bArr[i4] = bCharAt;
                i2 = i4;
                z2 = false;
                i4++;
            } else if (bCharAt == 92) {
                i3 = 0;
                i5 = 0;
                z2 = true;
            } else if (bCharAt != 46) {
                i2 = i2 == -1 ? i6 : i2;
                if (i4 > 63) {
                    throw m(str, "label too long");
                }
                bArr[i4] = bCharAt;
                i4++;
                z2 = false;
            } else {
                if (i2 == -1) {
                    throw m(str, "invalid empty label");
                }
                bArr[0] = (byte) (i4 - 1);
                o(str, bArr, 0, 1);
                i2 = -1;
                z2 = false;
                i4 = 1;
            }
        }
        if (i3 > 0 && i3 < 3) {
            throw m(str, "bad escape");
        }
        if (z2) {
            throw m(str, "bad escape");
        }
        if (i2 == -1) {
            z = true;
            i = 0;
            o(str, c, 0, 1);
        } else {
            i = 0;
            bArr[0] = (byte) (i4 - 1);
            o(str, bArr, 0, 1);
            z = false;
        }
        if (fgyuVar == null || z) {
            return;
        }
        o(str, fgyuVar.h, fgyuVar.l(i), fgyuVar.a());
    }

    public fgyu(fgxc fgxcVar) throws fhao {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int iC = fgxcVar.c();
            int i = iC & 192;
            if (i != 0) {
                if (i == 192) {
                    int iC2 = fgxcVar.c() + ((iC & (-193)) << 8);
                    if (fgyz.a("verbosecompression")) {
                        PrintStream printStream = System.err;
                        StringBuffer stringBuffer = new StringBuffer("currently ");
                        stringBuffer.append(fgxcVar.a());
                        stringBuffer.append(", pointer to ");
                        stringBuffer.append(iC2);
                        printStream.println(stringBuffer.toString());
                    }
                    if (iC2 < fgxcVar.a() - 2) {
                        if (!z2) {
                            fgxcVar.b = fgxcVar.a.position();
                            fgxcVar.c = fgxcVar.a.limit();
                        }
                        if (iC2 < fgxcVar.a.capacity()) {
                            fgxcVar.a.position(iC2);
                            ByteBuffer byteBuffer = fgxcVar.a;
                            byteBuffer.limit(byteBuffer.capacity());
                            if (fgyz.a("verbosecompression")) {
                                PrintStream printStream2 = System.err;
                                StringBuffer stringBuffer2 = new StringBuffer("current name '");
                                stringBuffer2.append(this);
                                stringBuffer2.append("', seeking to ");
                                stringBuffer2.append(iC2);
                                printStream2.println(stringBuffer2.toString());
                            }
                            z2 = true;
                        } else {
                            throw new IllegalArgumentException("cannot jump past end of input");
                        }
                    } else {
                        throw new fhao("bad compression");
                    }
                } else {
                    throw new fhao("bad label type");
                }
            } else {
                if (a() >= 128) {
                    throw new fhao("too many labels");
                }
                if (iC == 0) {
                    n(c, 0, 1);
                    z = true;
                } else {
                    bArr[0] = (byte) iC;
                    fgxcVar.f(bArr, 1, iC);
                    n(bArr, 0, 1);
                }
            }
        }
        if (z2) {
            int i2 = fgxcVar.b;
            if (i2 >= 0) {
                fgxcVar.a.position(i2);
                fgxcVar.a.limit(fgxcVar.c);
                fgxcVar.b = -1;
                fgxcVar.c = -1;
                return;
            }
            throw new IllegalStateException("no previous state");
        }
    }

    public fgyu(fgyu fgyuVar, int i) {
        int iA = fgyuVar.a();
        if (i <= iA) {
            this.h = fgyuVar.h;
            int i2 = iA - i;
            q(i2);
            for (int i3 = 0; i3 < 7 && i3 < i2; i3++) {
                r(i3, fgyuVar.l(i3 + i));
            }
            return;
        }
        throw new IllegalArgumentException("attempted to remove too many labels");
    }
}
