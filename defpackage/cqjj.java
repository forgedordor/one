package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjj {
    public final Context a;
    public final cogw b;

    public cqjj(Context context, cogw cogwVar) {
        context.getClass();
        cogwVar.getClass();
        this.a = context;
        this.b = cogwVar;
    }

    public final CharSequence a(long j, boolean z, boolean z2, boolean z3, boolean z4) throws Resources.NotFoundException {
        Context context = this.a;
        int i = true != DateFormat.is24HourFormat(context) ? 64 : 128;
        long epochMilli = this.b.f().toEpochMilli();
        Locale locale = context.getResources().getConfiguration().locale;
        locale.getClass();
        if (z4) {
            return cqjl.d(context, j, i);
        }
        long jAbs = Math.abs(epochMilli - j);
        if (!z2 && jAbs < 60000) {
            CharSequence text = context.getResources().getText(R.string.am_posted_now);
            text.getClass();
            return text;
        }
        if (!z2 && jAbs < 3600000) {
            long j2 = jAbs / 60000;
            String quantityString = context.getResources().getQuantityString(true != z3 ? R.plurals.bugle_num_minutes_ago : R.plurals.bugle_content_description_num_minutes_ago, (int) j2);
            quantityString.getClass();
            String str = String.format(quantityString, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            str.getClass();
            return str;
        }
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        if (cqjl.a(j, epochMilli, zoneIdSystemDefault) == 0) {
            return cqjl.d(context, j, i);
        }
        if (jAbs < 604800000) {
            if (z) {
                String dateTime = DateUtils.formatDateTime(context, j, 32770 | i);
                dateTime.getClass();
                return dateTime;
            }
            if (fdbq.f(locale, Locale.US)) {
                return cqjl.b(j, i, true != z3 ? "EEE HH:mm" : "EEEE HH:mm", true != z3 ? "EEE h:mm aa" : "EEEE h:mm aa");
            }
            String dateTime2 = DateUtils.formatDateTime(context, j, 32771 | i);
            dateTime2.getClass();
            return dateTime2;
        }
        if (jAbs >= 31449600000L) {
            return cqjl.c(context, j, locale, z, i);
        }
        if (z) {
            String dateTime3 = DateUtils.formatDateTime(context, j, 65560 | i);
            dateTime3.getClass();
            return dateTime3;
        }
        if (fdbq.f(locale, Locale.US)) {
            return cqjl.b(j, i, "MMM d, HH:mm", "MMM d, h:mm aa");
        }
        String dateTime4 = DateUtils.formatDateTime(context, j, 65561 | i);
        dateTime4.getClass();
        return dateTime4;
    }
}
