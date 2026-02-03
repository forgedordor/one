package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgab {
    public static final fgab a = new fgab("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public fgab(String str, int i, String str2, String[] strArr) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = strArr;
    }

    public static fgab a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            host = "";
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        return new fgab(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }

    public final String toString() {
        String str = this.b;
        if (!str.equals("localhost") && !str.isEmpty()) {
            str = "<redacted>";
        }
        return String.format(Locale.US, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", str, Integer.valueOf(this.c), this.d == null ? "null" : "\"<redacted>\"");
    }
}
