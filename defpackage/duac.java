package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duac {
    public static kvq a(Context context) {
        kvq kvqVarB = b(context);
        kvqVarB.i(context.getResources().getString(R.string.mdd_foreground_service_notification_title));
        kvqVarB.r(android.R.drawable.stat_notify_sync_noanim);
        return kvqVarB;
    }

    public static kvq b(Context context) {
        kvq kvqVar = new kvq(context, "download-notification-channel-id");
        kvqVar.A = "service";
        kvqVar.p(true);
        return kvqVar;
    }

    public static void c(Context context) {
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("download-notification-channel-id", context.getResources().getString(R.string.mdd_download_notification_channel_name), 3));
    }

    public static void d(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static void e(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }
}
