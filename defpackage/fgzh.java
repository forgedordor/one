package defpackage;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgzh implements Cloneable, Comparable, Serializable {
    private static final DecimalFormat a;
    public static final /* synthetic */ int j = 0;
    private static final long serialVersionUID = 2694906050116005466L;
    public fgyu f;
    protected int g;
    protected int h;
    protected long i;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    protected fgzh() {
    }

    protected static String h(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            stringBuffer.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(a.format(i));
            } else if (i == 34 || i == 92) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i);
            } else {
                stringBuffer.append((char) i);
            }
        }
        if (z) {
            stringBuffer.append('\"');
        }
        return stringBuffer.toString();
    }

    protected static String i(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer("\\# ");
        stringBuffer.append(bArr.length);
        stringBuffer.append(" ");
        stringBuffer.append(fhau.a(bArr));
        return stringBuffer.toString();
    }

    public static final fgzh k(fgyu fgyuVar, int i, int i2, long j2, boolean z) {
        fgzh fgxiVar;
        if (z) {
            fhaf fhafVar = fhag.a;
            fhag.b(i);
            fgzh fgzhVar = (fgzh) fhafVar.f.get(fhaf.b(i));
            fgxiVar = fgzhVar != null ? fgzhVar.b() : new fhal();
        } else {
            fgxiVar = new fgxi();
        }
        fgxiVar.f = fgyuVar;
        fgxiVar.g = i;
        fgxiVar.h = i2;
        fgxiVar.i = j2;
        return fgxiVar;
    }

    public static fgzh l(fgyu fgyuVar, int i, int i2) {
        return m(fgyuVar, i, i2, 0L);
    }

    public static fgzh m(fgyu fgyuVar, int i, int i2, long j2) {
        if (!fgyuVar.j()) {
            throw new fgzi(fgyuVar);
        }
        fhag.b(i);
        fgwy.b(i2);
        fhab.a(j2);
        return k(fgyuVar, i, i2, j2, false);
    }

    static void p(fgyu fgyuVar) {
        if (!fgyuVar.j()) {
            throw new fgzi(fgyuVar);
        }
    }

    public abstract String a();

    public abstract fgzh b();

    public abstract void c(fgxc fgxcVar);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        return r2 - r5.length;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            fgzh r5 = (defpackage.fgzh) r5
            r0 = 0
            if (r4 != r5) goto L6
            return r0
        L6:
            fgyu r1 = r4.f
            fgyu r2 = r5.f
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L11
            return r1
        L11:
            int r1 = r4.h
            int r2 = r5.h
            int r1 = r1 - r2
            if (r1 == 0) goto L19
            return r1
        L19:
            int r1 = r4.g
            int r2 = r5.g
            int r1 = r1 - r2
            if (r1 == 0) goto L21
            return r1
        L21:
            byte[] r1 = r4.o()
            byte[] r5 = r5.o()
        L29:
            int r2 = r1.length
            if (r0 >= r2) goto L3e
            int r3 = r5.length
            if (r0 >= r3) goto L3e
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r5[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 - r3
            if (r2 == 0) goto L3b
            return r2
        L3b:
            int r0 = r0 + 1
            goto L29
        L3e:
            int r5 = r5.length
            int r2 = r2 - r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgzh.compareTo(java.lang.Object):int");
    }

    public abstract void d(fgxe fgxeVar, fgww fgwwVar, boolean z);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fgzh)) {
            return false;
        }
        fgzh fgzhVar = (fgzh) obj;
        if (this.g == fgzhVar.g && this.h == fgzhVar.h && this.f.equals(fgzhVar.f)) {
            return Arrays.equals(o(), fgzhVar.o());
        }
        return false;
    }

    public final int g() {
        int i = this.g;
        return i == 46 ? ((fgzd) this).a : i;
    }

    public fgyu hU() {
        return null;
    }

    public final int hashCode() {
        fgxe fgxeVar = new fgxe();
        this.f.i(fgxeVar);
        fgxeVar.d(this.g);
        fgxeVar.d(this.h);
        fgxeVar.f(0L);
        int i = fgxeVar.a;
        fgxeVar.d(0);
        d(fgxeVar, null, true);
        fgxeVar.e((fgxeVar.a - i) - 2, i);
        int i2 = 0;
        for (byte b : fgxeVar.h()) {
            i2 += (i2 << 3) + (b & 255);
        }
        return i2;
    }

    final fgzh j() {
        try {
            return (fgzh) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    final void n(fgxe fgxeVar, int i, fgww fgwwVar) {
        this.f.g(fgxeVar, fgwwVar);
        fgxeVar.d(this.g);
        fgxeVar.d(this.h);
        if (i == 0) {
            return;
        }
        fgxeVar.f(this.i);
        int i2 = fgxeVar.a;
        fgxeVar.d(0);
        d(fgxeVar, fgwwVar, false);
        fgxeVar.e((fgxeVar.a - i2) - 2, i2);
    }

    public final byte[] o() {
        fgxe fgxeVar = new fgxe();
        d(fgxeVar, null, true);
        return fgxeVar.h();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        if (fgyz.a("BINDTTL")) {
            long j2 = this.i;
            fhab.a(j2);
            StringBuffer stringBuffer2 = new StringBuffer();
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            long j5 = j4 / 60;
            long j6 = j5 / 24;
            long j7 = j6 / 7;
            if (j7 > 0) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(j7);
                stringBuffer3.append("W");
                stringBuffer2.append(stringBuffer3.toString());
            }
            long j8 = j6 % 7;
            if (j8 > 0) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(j8);
                stringBuffer4.append("D");
                stringBuffer2.append(stringBuffer4.toString());
            }
            long j9 = j5 % 24;
            if (j9 > 0) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(j9);
                stringBuffer5.append("H");
                stringBuffer2.append(stringBuffer5.toString());
            }
            long j10 = j4 % 60;
            if (j10 > 0) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(j10);
                stringBuffer6.append("M");
                stringBuffer2.append(stringBuffer6.toString());
            }
            if (j3 > 0 || (j7 == 0 && j8 == 0 && j9 == 0 && j10 == 0)) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(j3);
                stringBuffer7.append("S");
                stringBuffer2.append(stringBuffer7.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        } else {
            stringBuffer.append(this.i);
        }
        stringBuffer.append("\t");
        if (this.h != 1 || !fgyz.a("noPrintIN")) {
            stringBuffer.append(fgwy.a(this.h));
            stringBuffer.append("\t");
        }
        stringBuffer.append(fhag.a(this.g));
        String strA = a();
        if (!strA.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(strA);
        }
        return stringBuffer.toString();
    }

    public fgzh(fgyu fgyuVar, int i) {
        if (!fgyuVar.j()) {
            throw new fgzi(fgyuVar);
        }
        fhag.b(6);
        fgwy.b(i);
        fhab.a(0L);
        this.f = fgyuVar;
        this.g = 6;
        this.h = i;
        this.i = 0L;
    }
}
