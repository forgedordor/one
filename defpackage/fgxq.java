package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxq implements Cloneable {
    private static final Random c = new Random();
    public int a;
    public int[] b;
    private int d;

    public fgxq() {
        k();
    }

    static int h(int i, int i2) {
        j(i2);
        return i | (1 << (15 - i2));
    }

    private static void j(int i) {
        if (l(i)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("invalid flag bit ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    private final void k() {
        this.b = new int[4];
        this.a = 0;
        this.d = -1;
    }

    private static boolean l(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        fgxl.a.a(i);
        if (i > 0) {
            return i > 4 && i < 12;
        }
        return true;
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int b() {
        int iNextInt;
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        synchronized (this) {
            iNextInt = this.d;
            if (iNextInt < 0) {
                iNextInt = c.nextInt(65535);
                this.d = iNextInt;
            }
        }
        return iNextInt;
    }

    public final int c() {
        return (this.a >> 11) & 15;
    }

    public final Object clone() {
        fgxq fgxqVar = new fgxq();
        fgxqVar.d = this.d;
        fgxqVar.a = this.a;
        int[] iArr = this.b;
        int[] iArr2 = fgxqVar.b;
        int length = iArr.length;
        System.arraycopy(iArr, 0, iArr2, 0, 4);
        return fgxqVar;
    }

    public final int d() {
        return this.a & 15;
    }

    final String e(int i) {
        StringBuffer stringBuffer = new StringBuffer(";; ->>HEADER<<- ");
        StringBuffer stringBuffer2 = new StringBuffer("opcode: ");
        stringBuffer2.append(fgyy.a.c(c()));
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer(", status: ");
        stringBuffer3.append(fgzg.b(i));
        stringBuffer.append(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer(", id: ");
        stringBuffer4.append(b());
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append("\n");
        StringBuffer stringBuffer5 = new StringBuffer(";; flags: ");
        StringBuffer stringBuffer6 = new StringBuffer();
        for (int i2 = 0; i2 < 16; i2++) {
            if (l(i2) && g(i2)) {
                stringBuffer6.append(fgxl.a.c(i2));
                stringBuffer6.append(" ");
            }
        }
        stringBuffer5.append(stringBuffer6.toString());
        stringBuffer.append(stringBuffer5.toString());
        stringBuffer.append("; ");
        for (int i3 = 0; i3 < 4; i3++) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(fgzs.a.c(i3));
            stringBuffer7.append(": ");
            stringBuffer7.append(a(i3));
            stringBuffer7.append(" ");
            stringBuffer.append(stringBuffer7.toString());
        }
        return stringBuffer.toString();
    }

    public final void f(int i) {
        j(i);
        this.a = h(this.a, i);
    }

    public final boolean g(int i) {
        j(i);
        return ((1 << (15 - i)) & this.a) != 0;
    }

    public final void i() {
        this.a &= 34815;
    }

    public final String toString() {
        return e(d());
    }

    public fgxq(int i) {
        k();
        if (i >= 0 && i <= 65535) {
            this.d = i;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("DNS message ID ");
        stringBuffer.append(i);
        stringBuffer.append(" is out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public fgxq(fgxc fgxcVar) {
        this(fgxcVar.b());
        this.a = fgxcVar.b();
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            int length = iArr.length;
            if (i >= 4) {
                return;
            }
            iArr[i] = fgxcVar.b();
            i++;
        }
    }
}
