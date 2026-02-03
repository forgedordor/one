package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqzr {
    private static final eksp c = eksp.c("BugleNotifications");
    public final eygg a;
    public final Context b;
    private final eygg d;
    private final eygg e;
    private final fcsu f;
    private final fcsu g;

    public cqzr(Context context, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, fcsu fcsuVar2, eygg eyggVar3) {
        this.b = context;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.a = eyggVar3;
    }

    static cqzp j(String str, String str2, String str3, NotificationChannel notificationChannel) {
        cqzp cqzpVar = new cqzp(str, str2, notificationChannel.getImportance() == -1000 ? 4 : notificationChannel.getImportance());
        cqzpVar.a(notificationChannel.shouldShowLights());
        int lightColor = notificationChannel.getLightColor();
        NotificationChannel notificationChannel2 = cqzpVar.a;
        notificationChannel2.setLightColor(lightColor);
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        cqzpVar.b(notificationChannel.shouldVibrate());
        cqzpVar.e(notificationChannel.getSound(), new AudioAttributes.Builder().setUsage(8).build());
        if (str3 != null) {
            cqzpVar.c(str3);
        }
        return cqzpVar;
    }

    private final NotificationChannel p(NotificationChannel notificationChannel, String str, String str2) {
        if (notificationChannel == null) {
            return null;
        }
        boolean zContentEquals = str.contentEquals(notificationChannel.getName());
        boolean z = !zContentEquals;
        boolean z2 = false;
        if (str2 != null && notificationChannel.getGroup() == null) {
            z2 = true;
        }
        if (zContentEquals && !z2) {
            return notificationChannel;
        }
        ekrw ekrwVarN = c.n();
        ekrwVarN.X(cgey.k, notificationChannel.getId());
        ekrwVarN.X(cgey.l, Boolean.valueOf(z));
        ekrwVarN.X(cgey.m, Boolean.valueOf(z2));
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "shouldRefreshChannel", 937, "NotificationChannelUtil.java")).q("NotificationChannel should be refreshed");
        NotificationChannel notificationChannel2 = j(notificationChannel.getId(), str, str2, notificationChannel).a;
        n(notificationChannel2);
        return notificationChannel2;
    }

    private final cqzp q(String str, String str2, String str3) throws Resources.NotFoundException {
        NotificationChannel notificationChannelF = f();
        if (notificationChannelF == null) {
            return null;
        }
        return j(str, str2, str3, notificationChannelF);
    }

    private static String r() {
        return cqzq.DEFAULT_SETTINGS.e;
    }

    private final String s() {
        return this.b.getString(R.string.bugle_notification_default_incoming_message_channel_name);
    }

    private final void t(cqzq cqzqVar) {
        ((NotificationManager) this.a.b()).createNotificationChannelGroup(new NotificationChannelGroup(cqzqVar.e, this.b.getString(cqzqVar.f)));
    }

    public final NotificationChannel a() throws Resources.NotFoundException {
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_connected_to_web_channel_v1");
        String string = this.b.getResources().getString(R.string.bugle_notification_ditto_channel_name);
        if (notificationChannel == null || notificationChannel.getGroup() == null || !notificationChannel.getName().toString().equals(string)) {
            cqzp cqzpVar = new cqzp("bugle_connected_to_web_channel_v1", string, 2);
            cqzpVar.a(false);
            cqzpVar.b(false);
            cqzpVar.d();
            cqzpVar.c(cqzq.WEB_SETTINGS.e);
            NotificationChannel notificationChannel2 = cqzpVar.a;
            n(notificationChannel2);
            return notificationChannel2;
        }
        int importance = notificationChannel.getImportance();
        fcsu fcsuVar = this.f;
        boolean zQ = ((crqv) fcsuVar.b()).q("ditto_persistent_notification_channel_enabled", true);
        boolean z = importance != 0;
        if (z == zQ) {
            return notificationChannel;
        }
        ((crqv) fcsuVar.b()).h("ditto_persistent_notification_channel_enabled", z);
        ((ains) this.g.b()).e("Bugle.Ditto.Notification.Status", importance != 0 ? 1 : 2);
        return notificationChannel;
    }

    public final NotificationChannel b(boolean z, String str) {
        String strS = s();
        String strR = r();
        cqzp cqzpVar = new cqzp("bugle_default_channel", strS, 4);
        if (!TextUtils.isEmpty(str)) {
            cqzpVar.e(Uri.parse(str), new AudioAttributes.Builder().setUsage(8).build());
        }
        cqzpVar.a(true);
        cqzpVar.b(z);
        if (strR != null) {
            cqzpVar.c(strR);
        }
        NotificationChannel notificationChannel = cqzpVar.a;
        n(notificationChannel);
        return notificationChannel;
    }

    public final NotificationChannel c() throws Resources.NotFoundException {
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_broadcast_receiver_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_foreground_service_channel_name);
        if (notificationChannel != null && TextUtils.equals(notificationChannel.getName(), string)) {
            return notificationChannel;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel2.enableLights(false);
        notificationChannel2.enableVibration(false);
        notificationChannel2.setShowBadge(false);
        n(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel d() throws Resources.NotFoundException {
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_report_issue_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_report_issue_channel_name);
        if (notificationChannel != null && TextUtils.equals(notificationChannel.getName(), string)) {
            return notificationChannel;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_report_issue_channel", string, 3);
        notificationChannel2.enableVibration(true);
        notificationChannel2.enableLights(false);
        notificationChannel2.setShowBadge(false);
        n(notificationChannel2);
        return notificationChannel2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.NotificationChannel e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqzr.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, boolean):android.app.NotificationChannel");
    }

    public final NotificationChannel f() throws Resources.NotFoundException {
        if (((NotificationManager) this.a.b()).getNotificationChannel("bugle_default_channel") != null) {
            return i("bugle_default_channel", s(), r());
        }
        if (!m()) {
            return null;
        }
        boolean zC = ((crac) this.d.b()).c();
        Context context = this.b;
        fcsu fcsuVar = this.f;
        return b(zC, ((crqv) fcsuVar.b()).f(context.getString(R.string.notification_sound_pref_key), null));
    }

    public final NotificationChannel g() throws Resources.NotFoundException {
        String string = this.b.getString(R.string.bugle_notification_miscellaneous_channel_name);
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_misc_channel");
        if (notificationChannel != null) {
            return p(notificationChannel, string, null);
        }
        cqzp cqzpVarQ = q("bugle_misc_channel", string, null);
        if (cqzpVarQ == null) {
            return null;
        }
        NotificationChannel notificationChannel2 = cqzpVarQ.a;
        n(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel h() throws Resources.NotFoundException {
        if (!czwc.a()) {
            return null;
        }
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_reminder_channel");
        if (notificationChannel != null && notificationChannel.getGroup() != null) {
            return notificationChannel;
        }
        String string = this.b.getResources().getString(R.string.bugle_notification_reminders_channel_name);
        if (notificationChannel != null) {
            NotificationChannel notificationChannel2 = j("bugle_reminder_channel", string, cqzq.REMINDERS.e, notificationChannel).a;
            n(notificationChannel2);
            return notificationChannel2;
        }
        cqzp cqzpVarQ = q("bugle_reminder_channel", string, cqzq.REMINDERS.e);
        if (cqzpVarQ == null) {
            return null;
        }
        NotificationChannel notificationChannel3 = cqzpVarQ.a;
        n(notificationChannel3);
        return notificationChannel3;
    }

    public final NotificationChannel i(String str, String str2, String str3) {
        return p(((NotificationManager) this.a.b()).getNotificationChannel(str), str2, str3);
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            ((eksl) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 286, "NotificationChannelUtil.java")).q("Ignoring request to delete null notification channel");
        } else if (str.equals("bugle_default_channel")) {
            ((eksl) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 290, "NotificationChannelUtil.java")).q("Ignoring request to delete default notification channel");
        } else {
            ((eksl) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 292, "NotificationChannelUtil.java")).t("Deleting notification channel: %s", str);
            ((NotificationManager) this.a.b()).deleteNotificationChannel(str);
        }
    }

    public final boolean l(boolean z) {
        eygg eyggVar = this.a;
        if (((NotificationManager) eyggVar.b()).getNotificationChannel("bugle_default_channel") != null || z) {
            return ((NotificationManager) eyggVar.b()).areNotificationsEnabled();
        }
        return false;
    }

    public final boolean m() throws Resources.NotFoundException {
        Context context = this.b;
        return ((crqv) this.f.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default));
    }

    public final void n(NotificationChannel notificationChannel) {
        t(cqzq.CONVERSATIONS);
        t(cqzq.WEB_SETTINGS);
        if (czwc.a()) {
            t(cqzq.REMINDERS);
        }
        t(cqzq.DEFAULT_SETTINGS);
        int importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            ((NotificationManager) this.a.b()).createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            eksl ekslVar = (eksl) c.j();
            ekslVar.X(cgey.k, notificationChannel.getId());
            ((eksl) ((eksl) ekslVar.g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "createNotificationChannel", 177, "NotificationChannelUtil.java")).q("Error creating legacy notification channel");
        }
    }

    public final int o(String str) {
        NotificationChannel notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel(str);
        if (notificationChannel == null) {
            return 3;
        }
        return notificationChannel.getImportance() > 0 ? 1 : 2;
    }
}
