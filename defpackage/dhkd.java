package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkd {
    public static synchronized String a(Context context, String str, int i) {
        String strC;
        dhja.c("Generating client ID of type %s subId %d", str, Integer.valueOf(i));
        if ("1".equals(str)) {
            return c();
        }
        String imei = (String) dfoi.a().a.e.a();
        if (d(imei)) {
            dhja.k("Overriding Imei, should be only done for emulator testing!", new Object[0]);
        } else {
            imei = null;
            try {
                dhkv dhkvVarF = dhkv.g(context).f(i);
                if (dhkvVarF != null) {
                    try {
                        imei = dhkvVarF.a.getImei();
                    } catch (SecurityException e) {
                        throw new dhkf("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
                    }
                }
            } catch (dhkf e2) {
                dhja.s(e2, "Failed to get device id.", new Object[0]);
            }
        }
        if (Objects.isNull(imei) || !d(imei)) {
            dhja.q("Unable to retrieve IMEI from device. Falling back to UUID!", new Object[0]);
            strC = c();
        } else {
            strC = b(imei);
        }
        return strC;
    }

    public static String b(String str) {
        String strSubstring = str.substring(0, 8);
        String strSubstring2 = str.substring(8, 14);
        String strSubstring3 = str.substring(14, str.length());
        if (str.indexOf(45) > 1) {
            return "urn:gsma:imei:".concat(String.valueOf(str));
        }
        StringBuilder sb = new StringBuilder("urn:gsma:imei:");
        sb.append(strSubstring);
        sb.append("-");
        sb.append(strSubstring2);
        sb.append("-");
        if (strSubstring3.length() == 1) {
            sb.append("0");
        } else {
            sb.append(strSubstring3);
        }
        return sb.toString();
    }

    private static String c() {
        return "urn:uuid:".concat(String.valueOf(UUID.randomUUID().toString()));
    }

    private static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.length() >= 14 && str.length() <= 16;
    }
}
