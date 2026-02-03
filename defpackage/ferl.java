package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferl implements Serializable {
    public static final ferl a = new ferl("SU", null);
    public static final ferl b = new ferl("MO", null);
    public static final ferl c = new ferl("TU", null);
    public static final ferl d = new ferl("WE", null);
    public static final ferl e = new ferl("TH", null);
    public static final ferl f = new ferl("FR", null);
    public static final ferl g = new ferl("SA", null);
    private static final long serialVersionUID = -4412000990022011469L;
    public final int h;
    private final String i;

    public ferl(ferl ferlVar) {
        this.i = ferlVar.i;
        this.h = 0;
    }

    public static int a(ferl ferlVar) {
        String str = a.i;
        String str2 = ferlVar.i;
        if (str.equals(str2)) {
            return 1;
        }
        if (b.i.equals(str2)) {
            return 2;
        }
        if (c.i.equals(str2)) {
            return 3;
        }
        if (d.i.equals(str2)) {
            return 4;
        }
        if (e.i.equals(str2)) {
            return 5;
        }
        if (f.i.equals(str2)) {
            return 6;
        }
        return !g.i.equals(str2) ? -1 : 7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ferl)) {
            return false;
        }
        ferl ferlVar = (ferl) obj;
        return ffhd.a(ferlVar.i, this.i) && ferlVar.h == this.h;
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.i);
        ffhgVar.a(this.h);
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.h;
        if (i != 0) {
            stringBuffer.append(i);
        }
        stringBuffer.append(this.i);
        return stringBuffer.toString();
    }

    private ferl(String str, byte[] bArr) {
        this.i = str;
        this.h = 0;
    }

    public ferl(String str) {
        if (str.length() > 2) {
            this.h = fewz.a(str.substring(0, str.length() - 2));
        } else {
            this.h = 0;
        }
        String upperCase = str.substring(str.length() - 2).toUpperCase();
        this.i = upperCase;
        if (!a.i.equals(upperCase) && !b.i.equals(upperCase) && !c.i.equals(upperCase) && !d.i.equals(upperCase) && !e.i.equals(upperCase) && !f.i.equals(upperCase) && !g.i.equals(upperCase)) {
            throw new IllegalArgumentException("Invalid day: ".concat(String.valueOf(upperCase)));
        }
    }
}
