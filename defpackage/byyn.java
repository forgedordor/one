package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyn {
    private static final cqce a = cqce.g("BugleCms", "CmsRestoreForegroundNotification");
    private final fcsu b;
    private final Context c;

    public byyn(Context context, fcsu fcsuVar) {
        this.c = context;
        this.b = fcsuVar;
    }

    public final Notification a() {
        Context context = this.c;
        fcsu fcsuVar = this.b;
        Notification notificationA = ((cgbn) fcsuVar.b()).a(context.getString(R.string.cms_sync_foreground_notification_text));
        if (notificationA == null) {
            a.r("Cms restore notification is null!");
        }
        return notificationA;
    }
}
