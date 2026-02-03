package defpackage;

import android.os.Build;
import com.android.vcard.VCardConstants;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajke {
    private final crmx a;

    public ajke(crmx crmxVar) {
        this.a = crmxVar;
    }

    public static final String b() {
        Optional optionalOfNullable = Optional.ofNullable(Build.MANUFACTURER);
        if (optionalOfNullable.isEmpty()) {
            return "UNKNOWN";
        }
        String str = (String) optionalOfNullable.get();
        if (!ffhj.a(str)) {
            int length = str.length();
            char[] cArr = new char[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    cArr[i] = str.charAt(i2);
                    i++;
                }
            }
            if (i != length) {
                str = i == 0 ? "" : new String(cArr, 0, i);
            }
        }
        return c(str.toUpperCase(Locale.US), ekhx.o(((ewto) ajkb.h.e()).b));
    }

    private static String c(String str, ekhx ekhxVar) {
        return ekhxVar.contains(str) ? str : VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER;
    }

    public final String a() {
        Optional optionalOfNullable = Optional.ofNullable(this.a.A());
        return optionalOfNullable.isEmpty() ? "UNKNOWN" : c((String) optionalOfNullable.get(), ekhx.o(((ewto) ajkb.g.e()).b));
    }
}
