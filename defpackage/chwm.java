package defpackage;

import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chwm implements chwl {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl");
    private static final Pattern b = Pattern.compile("^(.*)_;_(.*)_;_#(?:[0-9a-fA-F]){6}@bot.rcs.google.com$");
    private final fcsu c;

    public chwm(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.chwl
    public final cmtu a(String str) {
        if (e(str)) {
            String strC = ((csrx) this.c.b()).c(str);
            if (strC == null) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "getDecodedRbmBotThreadInfo", 184, "RcsTelephonyStringsImpl.java")).q("decodedBackupContactName is null");
                return null;
            }
            List listI = ejxk.d("_;_").i(strC.substring(0, strC.length() - 19));
            if (listI.size() == 3 && !TextUtils.isEmpty((CharSequence) listI.get(0))) {
                return new cmtu(((String) listI.get(0)).replace("__AT__", "@"), (String) listI.get(1), (String) listI.get(2));
            }
        }
        return null;
    }

    @Override // defpackage.chwl
    public final String b(cmtu cmtuVar) {
        return c(cmtuVar.a, cmtuVar.b, cmtuVar.c);
    }

    @Override // defpackage.chwl
    public final String c(String str, String str2, String str3) {
        String str4 = String.format("%s_;_%s_;_%s@bot.rcs.google.com", str != null ? URLEncoder.encode(str.replace("@", "__AT__")) : "", str2, str3.toUpperCase(Locale.US));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "buildRbmBotBackupContactName", 153, "RcsTelephonyStringsImpl.java")).t("Created contact name %s", str4);
        return ((csrx) this.c.b()).d(str4);
    }

    @Override // defpackage.chwl
    public final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String strEncode = URLEncoder.encode(str2);
            sb.replace(0, strEncode.length(), strEncode);
        }
        return sb.toString();
    }

    @Override // defpackage.chwl
    public final boolean e(String str) {
        return g(str, b);
    }

    @Override // defpackage.chwl
    public final boolean f(String str) {
        return g(str, ciuq.b) || g(str, ciuq.a);
    }

    final boolean g(String str, Pattern pattern) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strC = ((csrx) this.c.b()).c(str);
        if (strC == null) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyStringsImpl", "isBackupContact", 112, "RcsTelephonyStringsImpl.java")).q("isBackupContact() returning false because decodedAddress is null");
            return false;
        }
        Matcher matcher = pattern.matcher(strC);
        if (!matcher.matches()) {
            return false;
        }
        try {
            URLDecoder.decode(ejwk.b(matcher.group(1)));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
