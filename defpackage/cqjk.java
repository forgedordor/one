package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjk {
    public final cqjj a;
    private final Context b;

    public cqjk(Context context, cqjj cqjjVar) {
        this.b = context;
        this.a = cqjjVar;
    }

    public static String g(long j) {
        if (j <= 0) {
            return "0:00";
        }
        if (j >= 359999000) {
            return "99:59:59";
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        return hours > 0 ? String.format(Locale.US, "%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format(Locale.US, "%01d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public final CharSequence a(long j) {
        return e(j, true, false, false);
    }

    public final CharSequence b(long j) {
        Context context = this.b;
        return cqjl.c(context, j, context.getResources().getConfiguration().locale, false, true != DateFormat.is24HourFormat(context) ? 64 : 128);
    }

    public final CharSequence c(long j) {
        return e(j, false, false, false);
    }

    public final CharSequence d(long j) {
        return this.a.a(j, false, false, false, true);
    }

    public final CharSequence e(long j, boolean z, boolean z2, boolean z3) {
        return this.a.a(j, z, z2, z3, false);
    }

    public final String f(long j) {
        if (j <= 0) {
            j = 0;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        Resources resources = this.b.getResources();
        StringBuilder sb = new StringBuilder();
        if (hours > 0) {
            int i = (int) hours;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_hours, i, Integer.valueOf(i)));
        }
        if (minutes > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i2 = (int) minutes;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_minutes, i2, Integer.valueOf(i2)));
        }
        if (seconds > 0 || j == 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i3 = (int) seconds;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_seconds, i3, Integer.valueOf(i3)));
        }
        return sb.toString();
    }
}
