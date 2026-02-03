package defpackage;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferk implements Serializable {
    private static final NumberFormat b = new DecimalFormat("00");
    private static final NumberFormat c = new DecimalFormat("00");
    private static final NumberFormat d = new DecimalFormat("00");
    private static final long serialVersionUID = 5883111996721531728L;
    public long a;

    public ferk(String str) {
        if (str.length() < 5) {
            throw new IllegalArgumentException(a.a(str, "Invalid UTC offset [", "] - must be of the form: (+/-)HHMM[SS]"));
        }
        boolean z = str.charAt(0) == '-';
        if (!z && str.charAt(0) != '+') {
            throw new IllegalArgumentException("UTC offset value must be signed");
        }
        this.a = 0L;
        long j = Integer.parseInt(str.substring(1, 3)) * 3600000;
        this.a = j;
        this.a = j + (Integer.parseInt(str.substring(3, 5)) * 60000);
        if (str.length() == 7) {
            this.a += Integer.parseInt(str.substring(5, 7)) * 1000;
        }
        if (z) {
            this.a = -this.a;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof ferk ? this.a == ((ferk) obj).a : super.equals(obj);
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.b(this.a);
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        long jAbs = Math.abs(this.a);
        if (this.a < 0) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append('+');
        }
        stringBuffer.append(b.format(jAbs / 3600000));
        long j = jAbs % 3600000;
        stringBuffer.append(c.format(j / 60000));
        long j2 = j % 60000;
        if (j2 > 0) {
            stringBuffer.append(d.format(j2 / 1000));
        }
        return stringBuffer.toString();
    }
}
