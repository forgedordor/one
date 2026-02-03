package defpackage;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class raj {
    public static long a(String str) {
        try {
            return c("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                raa.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            raa.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static qyy b(qzk qzkVar) throws NumberFormatException {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jA;
        long j5;
        long j6;
        Map map = qzkVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA2 = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA3 = str3 != null ? a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jA = a(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jA = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j3 * 1000) + j4;
            if (z) {
                j6 = j7;
            } else {
                Long.signum(j2);
                j6 = (j2 * 1000) + j7;
            }
            j5 = j7;
        } else {
            j5 = (jA2 <= j || jA3 < jA2) ? j : (jA3 - jA2) + j4;
            j6 = j5;
        }
        qyy qyyVar = new qyy();
        qyyVar.a = qzkVar.b;
        qyyVar.b = str5;
        qyyVar.f = j5;
        qyyVar.e = j6;
        qyyVar.c = jA2;
        qyyVar.d = jA;
        qyyVar.g = map;
        qyyVar.h = qzkVar.d;
        return qyyVar;
    }

    public static SimpleDateFormat c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
