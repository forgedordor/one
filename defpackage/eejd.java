package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejd {
    static final AtomicReference a = new AtomicReference();

    static long a(long j) {
        Calendar calendarE = e();
        calendarE.setTimeInMillis(j);
        return c(calendarE).getTimeInMillis();
    }

    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar calendarF = f(calendar);
        Calendar calendarE = e();
        calendarE.set(calendarF.get(1), calendarF.get(2), calendarF.get(5));
        return calendarE;
    }

    static Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(g());
        return calendar;
    }

    public static Calendar e() {
        return f(null);
    }

    static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(g());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    private static java.util.TimeZone g() {
        return DesugarTimeZone.getTimeZone("UTC");
    }
}
