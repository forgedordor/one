package defpackage;

import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciuw {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final csrx b;

    public ciuw(csrx csrxVar) {
        this.b = csrxVar;
    }

    private static boolean c(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(ejwk.b(matcher.group(1)), StandardCharsets.UTF_8.name());
            return true;
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return false;
        }
    }

    public final ciur a(String str) {
        if (!b(str)) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 55, "RcsGroupTelephonyRecipientNameParser.java")).q("Attempting to parse a RcsGroupTelephonyData  out of a non RCS group Telephony recipient.");
            return null;
        }
        String strB = ejwk.b(this.b.c(str));
        int length = strB.length();
        int i = length - 15;
        int i2 = length - 16;
        int iLastIndexOf = strB.lastIndexOf(31, i2);
        int iLastIndexOf2 = strB.lastIndexOf(31, iLastIndexOf - 1);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strB.lastIndexOf(45, i2);
            iLastIndexOf2 = strB.lastIndexOf(45, iLastIndexOf - 1);
        }
        try {
            String strDecode = URLDecoder.decode(strB.substring(0, iLastIndexOf2), StandardCharsets.UTF_8.name());
            String strSubstring = strB.substring(iLastIndexOf2 + 1, iLastIndexOf);
            String strSubstring2 = strB.substring(iLastIndexOf + 1, i);
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.N, strSubstring2);
            ekrwVarN.X(cqnc.J, strDecode);
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 89, "RcsGroupTelephonyRecipientNameParser.java")).t("Parsed out RcsGroupTelephonyData from Telephony recipient: %s", str);
            if (strDecode == null) {
                throw new NullPointerException("Null groupName");
            }
            if (strSubstring == null) {
                throw new NullPointerException("Null selfRcsMsisdn");
            }
            if (strSubstring2 != null) {
                return new ciun(strDecode, strSubstring, strSubstring2);
            }
            throw new NullPointerException("Null rcsGroupId");
        } catch (UnsupportedEncodingException e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientNameParser", "parseTelephonyRecipientName", 'c', "RcsGroupTelephonyRecipientNameParser.java")).q("Failed to decode RCS group telephony recipient name.");
            return null;
        }
    }

    public final boolean b(String str) {
        String strC = this.b.c(str);
        if (strC == null) {
            return false;
        }
        return c(strC, ciuq.b) || c(strC, ciuq.a);
    }
}
