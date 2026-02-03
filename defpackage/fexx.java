package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexx {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String e;
    public final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public fexx(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fexx)) {
            return false;
        }
        fexx fexxVar = (fexx) obj;
        return fdbq.f(fexxVar.e, this.e) && fdbq.f(fexxVar.f, this.f) && fexxVar.g == this.g && fdbq.f(fexxVar.h, this.h) && fdbq.f(fexxVar.i, this.i) && fexxVar.j == this.j && fexxVar.k == this.k && fexxVar.l == this.l && fexxVar.m == this.m;
    }

    public final int hashCode() {
        int iHashCode = ((this.e.hashCode() + 527) * 31) + this.f.hashCode();
        long j = this.g;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        boolean z = this.m;
        boolean z2 = this.l;
        return (((((((iHashCode2 * 31) + fexv.a(this.j)) * 31) + fexv.a(this.k)) * 31) + fexv.a(z2)) * 31) + fexv.a(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            long j = this.g;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) ffaw.a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
