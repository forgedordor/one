package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciuv {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final csrx b;

    public ciuv(csrx csrxVar) {
        this.b = csrxVar;
    }

    public final String a(String str, String str2, String str3) {
        if (str3 != null) {
            try {
                str3 = URLEncoder.encode(str3, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(String.format("Unsupported encoding. Group name: %s", str3), e);
            }
        } else {
            str3 = "";
        }
        String str4 = str3 + "\u001f" + str + "\u001f" + str2 + "@rcs.google.com";
        ekrw ekrwVarN = a.n();
        ekrwVarN.X(cqnc.J, str3);
        ekrwVarN.X(cqnc.I, str);
        ekrwVarN.X(cqnc.N, str2);
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameBuilder", "buildTelephonyRecipientName", 68, "RcsGroupTelephonyRecipientNameBuilder.java")).t("Created group backup contact name %s", cqcv.b(str4));
        return this.b.d(str4);
    }
}
