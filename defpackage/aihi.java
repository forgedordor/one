package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihi {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter");
    private final cogw b;
    private final Context c;
    private final aaxw d;

    public aihi(cogw cogwVar, Context context, aaxw aaxwVar) {
        this.b = cogwVar;
        this.c = context;
        this.d = aaxwVar;
    }

    private final String b(Instant instant) {
        Locale localeC = craf.c(this.c);
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleScheduledSend");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToTime", 94, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToTime: %s", localeC);
        return d(localeC).equals(Locale.US) ? new SimpleDateFormat(c(instant), Locale.US).format(Long.valueOf(instant.toEpochMilli())) : this.d.b(instant.toEpochMilli());
    }

    private final String c(Instant instant) {
        return DateFormat.is24HourFormat(this.c) ? "H:mm z" : instant.atZone(ZoneId.systemDefault()).getMinute() == 0 ? "h aa z" : "h:mm aa z";
    }

    private static Locale d(Locale locale) {
        return new Locale.Builder().setLanguage(locale.getLanguage()).setRegion(locale.getCountry()).build();
    }

    public final String a(Instant instant) {
        cogw cogwVar = this.b;
        int iA = (int) cqjl.a(cogwVar.f().toEpochMilli(), instant.toEpochMilli(), ZoneId.systemDefault());
        if (iA == 0) {
            return this.c.getString(R.string.scheduled_send_datetime_today_format, b(instant));
        }
        if (iA == 1) {
            return this.c.getString(R.string.scheduled_send_datetime_tomorrow_format, b(instant));
        }
        Locale localeC = craf.c(this.c);
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleScheduledSend");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToDateTime", 85, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToDateTime: %s", localeC);
        if (!d(localeC).equals(Locale.US)) {
            return this.d.c(instant.toEpochMilli());
        }
        int year = instant.atZone(ZoneId.systemDefault()).getYear();
        int year2 = cogwVar.f().atZone(ZoneId.systemDefault()).getYear();
        String strC = c(instant);
        StringBuilder sb = new StringBuilder();
        sb.append(year == year2 ? "EEE, MMM d" : "EEE, MMM d, yyyy");
        sb.append(", ");
        sb.append(strC);
        return new SimpleDateFormat(sb.toString(), Locale.US).format(Long.valueOf(instant.toEpochMilli()));
    }
}
