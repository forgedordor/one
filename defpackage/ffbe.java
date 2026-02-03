package defpackage;

import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbe {
    public static final ffbf a(String str) throws ProtocolException, NumberFormatException {
        feyz feyzVar;
        int i;
        String strSubstring;
        if (fdgn.t(str, "HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                feyzVar = feyz.a;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                feyzVar = feyz.b;
            }
        } else {
            if (!fdgn.t(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            feyzVar = feyz.a;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i, i2);
            strSubstring2.getClass();
            int i3 = Integer.parseInt(strSubstring2);
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
                strSubstring.getClass();
            }
            return new ffbf(feyzVar, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}
