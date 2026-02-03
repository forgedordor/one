package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngk {
    public static final String a(Instant instant) {
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        localDateTime.getClass();
        Locale locale = Locale.getDefault(Locale.Category.FORMAT);
        Date date = etdm.a;
        locale.getClass();
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEdjm", locale);
        long epochSecond = localDateTime.toEpochSecond(ZoneOffset.UTC) * 1000;
        long j = localDateTime.get(ChronoField.MILLI_OF_SECOND);
        Calendar calendar = instanceForSkeleton.getCalendar();
        if (aky$$ExternalSyntheticApiModelOutline0.m$1(calendar)) {
            aky$$ExternalSyntheticApiModelOutline0.m161m((Object) calendar).setGregorianChange(etdm.a);
        }
        calendar.setTimeInMillis(epochSecond + j);
        instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
        String str = instanceForSkeleton.format(calendar);
        str.getClass();
        return str;
    }
}
