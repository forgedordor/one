package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavl implements cqzo {
    private static final cqce a = cqce.g("Bugle", "DittoPhoneRelayNotificationSuppressor");
    private static final Duration b = Duration.ofMinutes(2);
    private static final dzfh c = new dzfh("DittoNotificationSessionTimer");
    private final cogw d;
    private final crqv e;
    private final ayqo f;
    private final cgin g;
    private final fcsu h;
    private final fcsu i;
    private boolean j = false;
    private Instant k = Instant.MIN;
    private dzub l = null;

    public aavl(cogw cogwVar, crqv crqvVar, ayqo ayqoVar, cgin cginVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.d = cogwVar;
        this.e = crqvVar;
        this.f = ayqoVar;
        this.g = cginVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
    }

    private final void g(boolean z) {
        this.e.h("ditto_silenced_notifications", z);
    }

    private final synchronized void h(boolean z) {
        this.j = z;
    }

    private final synchronized boolean i() {
        if (!this.k.equals(Instant.MIN)) {
            cogw cogwVar = this.d;
            if (!cogwVar.f().isBefore(this.k)) {
                return Duration.between(this.k, cogwVar.f()).compareTo(b) <= 0;
            }
        }
        return false;
    }

    @Override // defpackage.cqzo
    public final void a() {
        h(true);
    }

    @Override // defpackage.cqzo
    public final synchronized void b(boolean z) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Desktop session is");
        boolean z2 = true;
        cqbdVarA.I(true != z ? "inactive" : "active");
        cqbdVarA.r();
        ayik ayikVar = ((ayil) this.f).b;
        ayikVar.a().u(180);
        NotificationChannel notificationChannel = null;
        if (z) {
            this.k = this.d.f();
            if (this.l != null) {
                ((dzuc) this.i.b()).g(c, null, null, dzua.CANCEL);
            }
            this.l = ((dzuc) this.i.b()).e(c);
            ayikVar.a().x(180, ((Long) ayil.a.e()).longValue());
            return;
        }
        this.k = Instant.MIN;
        fcsu fcsuVar = this.h;
        ((ains) fcsuVar.b()).c("Bugle.Ditto.Notification.Session.Inactive.Count");
        if (this.l != null) {
            ((dzuc) this.i.b()).g(c, null, null, dzua.SUCCESS);
        }
        this.l = null;
        if (this.e.q("ditto_silenced_notifications", false)) {
            ((ains) fcsuVar.b()).c("Bugle.Notification.SuppressedByDitto.ReAlert.Count");
            cgin cginVar = this.g;
            Stream stream = Collection.EL.stream(cginVar.d.c(cglf.NT_INCOMING_MESSAGE));
            final fdap fdapVar = new fdap() { // from class: cgil
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                    statusBarNotification.getClass();
                    return Long.valueOf(statusBarNotification.getPostTime());
                }
            };
            Optional optionalMax = stream.max(Comparator.CC.comparingLong(new ToLongFunction() { // from class: cgim
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Number) fdapVar.invoke(obj)).longValue();
                }
            }));
            if (optionalMax.isPresent()) {
                String channelId = ((StatusBarNotification) optionalMax.get()).getNotification().getChannelId();
                channelId.getClass();
                NotificationManager notificationManager = cginVar.e;
                NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(channelId);
                if (notificationChannel2 != null) {
                    notificationChannel = notificationManager.getNotificationChannel("messages_for_web_notification_channel");
                    if (notificationChannel == null) {
                        ekrw ekrwVarG = cgin.a.g();
                        ekrwVarG.X(eksq.a, "BugleNotifications");
                        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager", "getOrCreateDesktopReNotifyChannel", 76, "DittoNotificationChannelManager.kt")).q("Creating Messages for web notification channel");
                        notificationChannel = cginVar.c.a("messages_for_web_notification_channel", "messages_for_web_notification_channel", notificationChannel2, notificationChannel2.getGroup());
                    }
                    notificationChannel.setImportance(3);
                    if (!notificationChannel2.shouldVibrate() || !notificationChannel.shouldVibrate()) {
                        z2 = false;
                    }
                    notificationChannel.enableVibration(z2);
                    notificationChannel.setSound(notificationChannel2.getSound(), notificationChannel2.getAudioAttributes());
                    ekrw ekrwVarG2 = cgin.a.g();
                    ekrwVarG2.X(eksq.a, "BugleNotifications");
                    ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager", "getOrCreateDesktopReNotifyChannel", 89, "DittoNotificationChannelManager.kt")).q("Modifying Messages for web notification channel");
                    cginVar.c.i(notificationChannel);
                }
                Context context = cginVar.b;
                kvq kvqVar = new kvq(context, ((StatusBarNotification) optionalMax.get()).getNotification());
                if (notificationChannel != null) {
                    kvqVar.F = notificationChannel.getId();
                }
                Notification notificationA = kvqVar.a();
                notificationA.flags = ((StatusBarNotification) optionalMax.get()).getNotification().flags & (-9);
                new kwx(context).h(((StatusBarNotification) optionalMax.get()).getTag(), ((StatusBarNotification) optionalMax.get()).getId(), notificationA);
            }
            g(false);
        }
    }

    @Override // defpackage.cqzo
    public final void c() {
        h(false);
    }

    public final synchronized boolean d() {
        return i();
    }

    final synchronized boolean e() {
        return this.j;
    }

    @Override // defpackage.cqzo
    public final synchronized boolean f() {
        boolean z;
        z = e() && d();
        if (z) {
            ((ains) this.h.b()).c("Bugle.Notification.SuppressedByDitto.Count");
            g(true);
        } else {
            g(false);
        }
        return z;
    }
}
