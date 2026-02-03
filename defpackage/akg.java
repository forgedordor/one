package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akg {
    public static boolean a(String str, String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str2);
            if (date != null) {
                return str2.equals(simpleDateFormat.format(date));
            }
            return false;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        return a("yyyy-MM-dd", str);
    }
}
