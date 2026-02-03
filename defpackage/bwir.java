package defpackage;

import android.text.TextUtils;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwir {
    public static eyfr a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (c(str.charAt(length)));
            str = str.substring(length + 1);
        }
        return (eyfr) evsn.parseFrom(eyfr.a, Base64.decode(str, 0), evrr.a());
    }

    public static final byte[] b(eyfr eyfrVar, String str) {
        byte[] bArrEncode = Base64.encode(eyfrVar.toByteArray(), 0);
        if (TextUtils.isEmpty(str)) {
            return bArrEncode;
        }
        if (c(str.charAt(str.length() - 1))) {
            str = String.valueOf(str).concat(" ");
        }
        return eomt.b(str.getBytes(), bArrEncode);
    }

    private static boolean c(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < 'A' || c > 'Z') {
            return (c >= '0' && c <= '9') || c == '+' || c == '/' || c == '=' || c == '\n' || c == '\r';
        }
        return true;
    }
}
