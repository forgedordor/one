package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgbj implements cgbg {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleNotifications");
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final kwx f;
    private final ejxr g;

    public cgbj(final Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = new kwx(context);
        this.g = new ejxr() { // from class: cgbi
            @Override // defpackage.ejxr
            public final Object get() {
                int i = cgbj.a;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                rvi.f(notificationManager);
                return notificationManager;
            }
        };
    }

    private final boolean g(String str) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.g.get()).getActiveNotifications()) {
            if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgbg
    public final StatusBarNotification a(final String str, final int i) {
        if (str == null) {
            return null;
        }
        return (StatusBarNotification) DesugarArrays.stream(((NotificationManager) this.g.get()).getActiveNotifications()).filter(new Predicate() { // from class: cgbh
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                int i2 = cgbj.a;
                if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                    return statusBarNotification.getId() == i;
                }
                return false;
            }
        }).findFirst().orElse(null);
    }

    @Override // defpackage.cgbg
    public final void b(String str, cgbe cgbeVar) {
        this.f.d(str, cgbeVar.G);
        if (g(str)) {
            int length = ((NotificationManager) this.g.get()).getActiveNotifications().length;
            eksl ekslVar = (eksl) b.h();
            ekslVar.X(cgey.d, str);
            ekslVar.X(cgbf.q, cgbeVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "cancelNotification", 223, "BugleNotificationDispatcherImpl.java")).r("Canceling notification, active count: %d", length);
        }
    }

    @Override // defpackage.cgbg
    public final boolean c(cgbf cgbfVar) {
        return g(cgbfVar.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    @Override // defpackage.cgbg
    public final boolean d(cgbf cgbfVar) {
        int importance;
        Notification notificationB = cgbfVar.b();
        ?? channelId = 0;
        if (notificationB == null) {
            eksl ekslVar = (eksl) b.h();
            ekslVar.X(cgbf.p, cgbfVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 84, "BugleNotificationDispatcherImpl.java")).q("Won't notify null Android notification");
            return false;
        }
        String strD = cgbfVar.d();
        try {
            if (strD != null) {
                this.f.h(strD, cgbfVar.a(), notificationB);
            } else {
                this.f.g(cgbfVar.a(), notificationB);
            }
            try {
                Object obj = this.g.get();
                channelId = notificationB.getChannelId();
                importance = ((NotificationManager) obj).getNotificationChannel(channelId).getImportance();
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", '~', "BugleNotificationDispatcherImpl.java")).q("Error getting notification channel importance.");
                importance = -1;
            }
            String channelId2 = notificationB.getChannelId();
            eksl ekslVar2 = (eksl) b.h();
            ekslVar2.X(cgbf.p, cgbfVar);
            ekslVar2.X(cgey.c, Integer.valueOf(importance));
            ekslVar2.X(cgey.k, channelId2);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 136, "BugleNotificationDispatcherImpl.java")).q("Notifying");
            return true;
        } catch (RuntimeException e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            if (stackTrace.length <= 0 || !TextUtils.equals(stackTrace[channelId].getClassName(), "android.os.Parcel") || !TextUtils.equals(stackTrace[channelId].getMethodName(), "readIntArray")) {
                throw e2;
            }
            eksl ekslVar3 = (eksl) ((eksl) b.j()).g(e2);
            ekslVar3.X(cgbf.p, cgbfVar);
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 104, "BugleNotificationDispatcherImpl.java")).q("Encountered an error when notifying");
            return true;
        }
    }

    @Override // defpackage.cgbg
    public final boolean e() throws Resources.NotFoundException {
        Context context = this.c;
        return ((cqzr) this.e.b()).l(((crqv) this.d.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default)));
    }

    @Override // defpackage.cgbg
    public final void f(cgbf cgbfVar) {
        if (c(cgbfVar)) {
            d(cgbfVar);
            return;
        }
        eksl ekslVar = (eksl) b.h();
        ekslVar.X(cgey.d, cgbfVar.d());
        ekslVar.X(cgbf.p, cgbfVar);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "updateIfActive", 160, "BugleNotificationDispatcherImpl.java")).q("Notifications is not active, won't update it.");
    }
}
