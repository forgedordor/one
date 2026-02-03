package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.media.AudioAttributes;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgkb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager");
    public final kwx b;
    public final fcsu c;
    public final fcsu d;
    private final Context e;
    private final fcsu f;

    public cgkb(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.e = context;
        this.b = new kwx(context);
        this.c = fcsuVar;
        this.f = fcsuVar2;
        this.d = fcsuVar3;
    }

    public static String h(String str, String str2) {
        return a.q(str2, str, " : ");
    }

    private final void l() {
        cgjs cgjsVar = cgjs.DEFAULT_SETTINGS;
        String str = cgjsVar.c;
        Context context = this.e;
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(str, cgjsVar.a(context));
        kwx kwxVar = this.b;
        kwxVar.e(notificationChannelGroup);
        cgjs cgjsVar2 = cgjs.CONVERSATIONS;
        kwxVar.e(new NotificationChannelGroup(cgjsVar2.c, cgjsVar2.a(context)));
    }

    private static boolean m(NotificationChannel notificationChannel, String str) {
        return !TextUtils.equals(str, notificationChannel.getName());
    }

    public final NotificationChannel a(String str, String str2, NotificationChannel notificationChannel, String str3) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, notificationChannel.getImportance() == -1000 ? 3 : notificationChannel.getImportance());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setLightColor(notificationChannel.getLightColor());
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
        notificationChannel2.setSound(notificationChannel.getSound(), new AudioAttributes.Builder().setUsage(8).build());
        if (((arpu) this.f.b()).a()) {
            notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
            notificationChannel2.setDescription(notificationChannel.getDescription());
        }
        if (str3 != null) {
            notificationChannel2.setGroup(str3);
        }
        if (craf.d) {
            notificationChannel2.setAllowBubbles(notificationChannel.canBubble());
        }
        return notificationChannel2;
    }

    public final NotificationChannel b(ConversationIdType conversationIdType) {
        return this.b.a(conversationIdType.a());
    }

    public final NotificationChannel c(String str, String str2) {
        kwx kwxVar = this.b;
        if (kwxVar.a(str) == null) {
            return null;
        }
        NotificationChannel notificationChannelA = kwxVar.a(h(str, str2));
        if (notificationChannelA != null) {
            return notificationChannelA;
        }
        NotificationChannel notificationChannelB = kwxVar.b(str, str2);
        if (notificationChannelB == null || TextUtils.isEmpty(notificationChannelB.getConversationId())) {
            return null;
        }
        return notificationChannelB;
    }

    public final NotificationChannel d(Optional optional, Optional optional2) {
        NotificationChannel notificationChannelB;
        NotificationChannel notificationChannelA;
        l();
        if (optional.isEmpty()) {
            return g();
        }
        NotificationChannel notificationChannelE = e((cgjr) optional.get());
        if (optional2.isPresent()) {
            Object obj = optional.get();
            cghn cghnVar = (cghn) optional2.get();
            ConversationIdType conversationIdTypeD = cghnVar.d();
            String strJ = cghnVar.j();
            String strI = cghnVar.i();
            String str = ((cggq) obj).a;
            if (craf.d) {
                kwx kwxVar = this.b;
                NotificationChannel notificationChannelB2 = kwxVar.b(conversationIdTypeD.a(), strJ);
                if (notificationChannelB2 != null && !notificationChannelB2.getId().equals(conversationIdTypeD.a())) {
                    j(notificationChannelB2.getId());
                }
                if (c(str, strJ) != null) {
                    j(conversationIdTypeD.toString());
                } else {
                    NotificationChannel notificationChannelA2 = kwxVar.a(conversationIdTypeD.a());
                    if (notificationChannelA2 != null && (notificationChannelA = kwxVar.a(str)) != null) {
                        String strH = h(str, strJ);
                        NotificationChannel notificationChannelA3 = a(strH, strI, notificationChannelA2, notificationChannelA.getGroup());
                        notificationChannelA3.setConversationId(str, strJ);
                        i(notificationChannelA3);
                        ekrg ekrgVar = a;
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH.X(ekrzVar, "BugleNotifications");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrz ekrzVar2 = cgey.k;
                        ekrdVar.X(ekrzVar2, strH);
                        ekrdVar.X(cgey.t, strJ);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 567, "NotificationChannelManager.java")).q("Migrated pre-R conversation channel to R+ channel");
                        j(notificationChannelA2.getId());
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleNotifications");
                        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                        ekrdVar2.X(ekrzVar2, notificationChannelA2.getId());
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 573, "NotificationChannelManager.java")).q("Deleted pre-R channel");
                    }
                }
                notificationChannelB = c(str, strJ);
            } else {
                notificationChannelB = b(conversationIdTypeD);
            }
            if (notificationChannelB != null) {
                return notificationChannelB;
            }
        }
        return notificationChannelE;
    }

    public final NotificationChannel e(cgjr cgjrVar) {
        int i;
        NotificationChannel notificationChannelA = this.b.a(cgjrVar.i());
        if (notificationChannelA != null) {
            notificationChannelA.setName(cgjrVar.j());
            if (cgjrVar.d().isPresent()) {
                notificationChannelA.setGroup(((cgjs) cgjrVar.d().get()).c);
            }
            i(notificationChannelA);
            return notificationChannelA;
        }
        String strI = cgjrVar.i();
        String strJ = cgjrVar.j();
        int iK = cgjrVar.k() - 1;
        if (iK == 0) {
            i = 0;
        } else if (iK != 1) {
            i = 2;
            if (iK != 2) {
                i = 3;
                if (iK != 3) {
                    i = 4;
                }
            }
        } else {
            i = 1;
        }
        NotificationChannel notificationChannel = new NotificationChannel(strI, strJ, i);
        notificationChannel.setSound(cgjrVar.a(), new AudioAttributes.Builder().setUsage(8).build());
        if (cgjrVar.b().isPresent()) {
            notificationChannel.enableLights(((Boolean) cgjrVar.b().get()).booleanValue());
        }
        if (cgjrVar.g().isPresent()) {
            ((Boolean) cgjrVar.g().get()).booleanValue();
            notificationChannel.setShowBadge(true);
        }
        cgjrVar.h().isPresent();
        if (cgjrVar.e().isPresent()) {
            ((Boolean) cgjrVar.e().get()).booleanValue();
            notificationChannel.enableVibration(true);
        }
        if (cgjrVar.f().isPresent()) {
            ((Integer) cgjrVar.f().get()).intValue();
            notificationChannel.setLightColor(0);
        }
        if (cgjrVar.d().isPresent()) {
            notificationChannel.setGroup(((cgjs) cgjrVar.d().get()).c);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cgey.k, notificationChannel.getId());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateChannelForChannelInfo", 439, "NotificationChannelManager.java")).q("Creating notification channel from channel info");
        i(notificationChannel);
        return notificationChannel;
    }

    public final NotificationChannel f() {
        Context context = this.e;
        NotificationChannel notificationChannelA = this.b.a("bugle_broadcast_receiver_channel");
        String string = context.getString(R.string.notification2o_foreground_service_channel);
        if (notificationChannelA != null && !m(notificationChannelA, string)) {
            return notificationChannelA;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setShowBadge(false);
        notificationChannel.setLightColor(0);
        i(notificationChannel);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateForegroundServiceChannel", 716, "NotificationChannelManager.java")).q("Foreground service channel created");
        return notificationChannel;
    }

    public final NotificationChannel g() {
        Context context = this.e;
        NotificationChannel notificationChannelA = this.b.a("bugle_misc_channel");
        String string = context.getString(R.string.notification2o_misc_channel);
        if (notificationChannelA != null && !m(notificationChannelA, string)) {
            return notificationChannelA;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_misc_channel", string, 3);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(true);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLightColor(0);
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, new AudioAttributes.Builder().setUsage(8).build());
        i(notificationChannel);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateMiscellaneousChannel", 690, "NotificationChannelManager.java")).q("Miscellaneous channel created");
        return notificationChannel;
    }

    public final void i(NotificationChannel notificationChannel) {
        l();
        int importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            this.b.d.createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNotifications");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cgey.k, notificationChannel.getId());
            ((ekrd) ((ekrd) ekrdVar.g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "commitChannel", 289, "NotificationChannelManager.java")).q("Error creating notification channel");
        }
    }

    public final void j(String str) {
        if (TextUtils.isEmpty(str)) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNotifications");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 356, "NotificationChannelManager.java")).q("channel id is null/empty, ignoring request to delete null notification channel");
            return;
        }
        kwx kwxVar = this.b;
        if (kwxVar.a(str) == null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNotifications");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cgey.k, str);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 372, "NotificationChannelManager.java")).q("No notification channel to delete");
            return;
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleNotifications");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.X(cgey.k, str);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 366, "NotificationChannelManager.java")).t("Deleting notification channel: %s", str);
        kwxVar.f(str);
    }

    public final boolean k(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance() == 0;
    }
}
