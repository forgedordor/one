package defpackage;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwsu {
    public static final Intent a(String str, Long l, Long l2) {
        Uri.Builder builderBuildUpon = fdbq.f(str, "android.intent.action.VIEW") ? CalendarContract.CONTENT_URI.buildUpon() : CalendarContract.Events.CONTENT_URI.buildUpon();
        Intent intent = new Intent(str);
        if (l != null) {
            if (fdbq.f(str, "android.intent.action.VIEW")) {
                builderBuildUpon.appendPath("time");
                ContentUris.appendId(builderBuildUpon, l.longValue()).getClass();
            } else {
                intent.putExtra("beginTime", l.longValue());
                if (l2 != null) {
                    intent.putExtra("endTime", l2.longValue());
                }
            }
        }
        intent.setData(builderBuildUpon.build());
        return intent;
    }
}
