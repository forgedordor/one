package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.apps.messaging.R;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxcb {
    public static String a(long j, Context context) {
        String dateTime;
        String dateTime2 = DateUtils.formatDateTime(context, j, 1);
        if (dwyi.a(j)) {
            return dateTime2;
        }
        long rawOffset = TimeZone.getDefault().getRawOffset();
        int julianDay = Time.getJulianDay(j, rawOffset) + 1;
        dvhn.a();
        if (julianDay == Time.getJulianDay(System.currentTimeMillis(), rawOffset)) {
            dateTime = context.getText(R.string.tombstone_yesterday_tag).toString();
        } else {
            long rawOffset2 = TimeZone.getDefault().getRawOffset();
            int julianDay2 = Time.getJulianDay(j, rawOffset2) + 6;
            dvhn.a();
            if (julianDay2 >= Time.getJulianDay(System.currentTimeMillis(), rawOffset2)) {
                dateTime = DateUtils.formatDateTime(context, j, 2);
            } else {
                dvhn.a();
                dateTime = Math.abs(System.currentTimeMillis() - j) <= 31449600000L ? DateUtils.formatDateTime(context, j, 65562) : DateUtils.formatDateTime(context, j, 65558);
            }
        }
        return context.getResources().getString(R.string.bullet_point_separated_text, dateTime, dateTime2);
    }
}
