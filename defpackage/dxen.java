package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxen {
    private static final String a = "dxen";

    public static InputStream a(String str) throws dxel {
        ejwl.a(b(str));
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            Log.e(a, "Comma not found in data URI: ".concat(str));
            throw new dxel(1);
        }
        String strSubstring = str.substring(iIndexOf + 1);
        String[] strArrSplit = str.substring(5, iIndexOf).split(";");
        boolean z = false;
        for (int i = 1; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            if (str2.equals("base64")) {
                z = true;
            } else if (!str2.startsWith("charset=")) {
                Log.e(a, a.n(str, str2, "Unknown data-URI option '", "' in "));
                throw new dxel(2);
            }
        }
        if (!z) {
            Log.e(a, "We only understand base64-encoded data URIs: ".concat(str));
            throw new dxel(3);
        }
        try {
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            Log.i(a, "Successfully decoded data uri: ".concat(str));
            return new ByteArrayInputStream(bArrDecode);
        } catch (IllegalArgumentException unused) {
            Log.e(a, "Invalid base64 payload in data URI: ".concat(str));
            throw new dxel(4);
        }
    }

    public static boolean b(String str) {
        return str.startsWith("data:");
    }
}
