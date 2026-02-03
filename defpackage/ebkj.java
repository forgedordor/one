package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebkj extends ebkh {
    public final String a;
    public final String b;

    public ebkj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    protected static Pair e(String str) {
        ebkk.c(str, null);
        int iIndexOf = str.indexOf(":");
        if (iIndexOf < 0) {
            return new Pair(str, null);
        }
        return new Pair(str.substring(0, iIndexOf), iIndexOf < str.length() ? str.substring(iIndexOf + 1) : null);
    }

    protected String c() {
        return this.a;
    }

    protected String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebkj)) {
            return false;
        }
        ebkj ebkjVar = (ebkj) obj;
        return TextUtils.equals(this.a, ebkjVar.c()) && TextUtils.equals(this.b, ebkjVar.d());
    }

    protected final void g(StringBuilder sb) {
        sb.append(this.a);
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            sb.append(":");
            sb.append(str);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = !TextUtils.isEmpty(str) ? str.hashCode() : 0;
        String str2 = this.b;
        return !TextUtils.isEmpty(str2) ? (iHashCode * 37) + str2.hashCode() : iHashCode;
    }
}
