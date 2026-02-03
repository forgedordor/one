package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwx {
    public static String b;
    private static kww f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public kwx(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final NotificationChannel a(String str) {
        return this.d.getNotificationChannel(str);
    }

    public final NotificationChannel b(String str, String str2) {
        return Build.VERSION.SDK_INT >= 30 ? this.d.getNotificationChannel(str, str2) : a(str);
    }

    public final List c() {
        return this.d.getNotificationChannels();
    }

    public final void d(String str, int i) {
        this.d.cancel(str, i);
    }

    public final void e(NotificationChannelGroup notificationChannelGroup) {
        this.d.createNotificationChannelGroup(notificationChannelGroup);
    }

    public final void f(String str) {
        this.d.deleteNotificationChannel(str);
    }

    public final void g(int i, Notification notification) {
        h(null, i, notification);
    }

    public final void h(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(str, i, notification);
            return;
        }
        Context context = this.g;
        kwt kwtVar = new kwt(context.getPackageName(), i, str, notification);
        synchronized (e) {
            if (f == null) {
                f = new kww(context.getApplicationContext());
            }
            f.a.obtainMessage(0, kwtVar).sendToTarget();
        }
        this.d.cancel(str, i);
    }

    public final boolean i() {
        return this.d.areNotificationsEnabled();
    }
}
