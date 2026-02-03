package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjl {
    public static final long a(long j, long j2, ZoneId zoneId) {
        zoneId.getClass();
        return Math.abs(ChronoUnit.DAYS.between(Instant.ofEpochMilli(j).atZone(zoneId).toLocalDate(), Instant.ofEpochMilli(j2).atZone(zoneId).toLocalDate()));
    }

    public static final CharSequence b(long j, int i, String str, String str2) {
        String str3 = ((i & 128) == 128 ? new SimpleDateFormat(str) : new SimpleDateFormat(str2)).format(Long.valueOf(j));
        str3.getClass();
        return str3;
    }

    public static final CharSequence c(Context context, long j, Locale locale, boolean z, int i) {
        context.getClass();
        locale.getClass();
        if (z) {
            if (fdbq.f(locale, Locale.US)) {
                return b(j, i, "M/d/yy", "M/d/yy");
            }
            String dateTime = DateUtils.formatDateTime(context, j, 131092);
            dateTime.getClass();
            return dateTime;
        }
        if (fdbq.f(locale, Locale.US)) {
            return b(j, i, "M/d/yy, HH:mm", "M/d/yy, h:mm aa");
        }
        String dateTime2 = DateUtils.formatDateTime(context, j, 131093 | i);
        dateTime2.getClass();
        return dateTime2;
    }

    public static final CharSequence d(Context context, long j, int i) {
        String dateTime = DateUtils.formatDateTime(context, j, i | 1);
        dateTime.getClass();
        return dateTime;
    }
}
