package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cglm {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/NotificationUtility");
    private final NotificationManager b;
    private final kwx c;
    private final Context d;

    public cglm(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.b = notificationManager;
        this.c = new kwx(context);
        this.d = context;
    }

    public static final boolean e(StatusBarNotification statusBarNotification) {
        Notification notification;
        return craf.d && statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null && (notification.flags & 4096) == 4096;
    }

    public static final boolean f(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return false;
        }
        if (!craf.d) {
            return true;
        }
        Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return false;
        }
        Notification.BubbleMetadata bubbleMetadata = notification.getBubbleMetadata();
        return bubbleMetadata == null || !bubbleMetadata.isNotificationSuppressed();
    }

    public final StatusBarNotification a(cglf cglfVar, String str) {
        NotificationManager notificationManager = this.b;
        Optional optionalOf = Optional.of(str);
        for (StatusBarNotification statusBarNotification : Arrays.asList(notificationManager.getActiveNotifications())) {
            if (statusBarNotification.getId() == cglfVar.j && TextUtils.equals((CharSequence) optionalOf.orElse(null), statusBarNotification.getTag())) {
                return statusBarNotification;
            }
        }
        return null;
    }

    public final List b(final String str) {
        return TextUtils.isEmpty(str) ? new ArrayList() : (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new Predicate() { // from class: cglg
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
                return TextUtils.equals(((StatusBarNotification) obj).getNotification().getGroup(), str);
            }
        }).collect(Collectors.toCollection(new cglh()));
    }

    public final List c(final cglf cglfVar) {
        return (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new Predicate() { // from class: cgll
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
                return ((StatusBarNotification) obj).getId() == cglfVar.j;
            }
        }).collect(Collectors.toCollection(new cglh()));
    }

    public final void d(StatusBarNotification statusBarNotification) {
        cglf cglfVarB;
        StatusBarNotification statusBarNotification2;
        if (statusBarNotification == null || !f(statusBarNotification) || (cglfVarB = cglf.b(statusBarNotification.getId())) == null || cglfVarB == cglf.NT_UNKNOWN) {
            return;
        }
        List list = (List) Collection.EL.stream(b(statusBarNotification.getNotification().getGroup())).filter(new cgli()).collect(Collectors.toCollection(new cglh()));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                statusBarNotification2 = null;
                break;
            } else {
                statusBarNotification2 = (StatusBarNotification) it.next();
                if (kwq.b(statusBarNotification2.getNotification())) {
                    break;
                }
            }
        }
        String group = statusBarNotification.getNotification().getGroup();
        boolean z = craf.d;
        boolean zAnyMatch = !z ? false : Collection.EL.stream(b(group)).anyMatch(new Predicate() { // from class: cglk
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
                return cglm.e((StatusBarNotification) obj);
            }
        });
        if (statusBarNotification2 != null && list.size() == 2 && !zAnyMatch) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNotifications");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cgey.n, cglfVarB);
            ekrdVar.X(cgey.d, statusBarNotification2.getTag());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 383, "NotificationUtility.java")).q("Canceling summary notification");
            this.c.d(statusBarNotification2.getTag(), statusBarNotification2.getId());
        }
        if (!z || !e(statusBarNotification)) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleNotifications");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(cgey.n, cglfVarB);
            ekrdVar2.X(cgey.d, statusBarNotification.getTag());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 402, "NotificationUtility.java")).q("Canceling notification");
            this.c.d(statusBarNotification.getTag(), statusBarNotification.getId());
            return;
        }
        ekrw ekrwVarH3 = a.h();
        ekrwVarH3.X(eksq.a, "BugleNotifications");
        ekrd ekrdVar3 = (ekrd) ekrwVarH3;
        ekrdVar3.X(cgey.n, cglfVarB);
        ekrdVar3.X(cgey.d, statusBarNotification.getTag());
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 395, "NotificationUtility.java")).q("Bubble showing, suppressing shade notification");
        Context context = this.d;
        kvq kvqVar = new kvq(context, statusBarNotification.getNotification());
        kvn kvnVarA = kwq.a(statusBarNotification.getNotification());
        if (kvnVarA != null) {
            PendingIntent pendingIntent = kvnVarA.a;
            pendingIntent.getClass();
            IconCompat iconCompat = kvnVarA.c;
            iconCompat.getClass();
            kvm kvmVar = new kvm(pendingIntent, iconCompat);
            kvmVar.c(Alert.DURATION_SHOW_INDEFINITELY);
            kvmVar.e(true);
            kvmVar.b(kvnVarA.a());
            kvmVar.a = kvnVarA.b;
            kvqVar.M = kvmVar.a();
            int i = statusBarNotification.getNotification().flags;
            Notification notificationA = kvqVar.a();
            notificationA.flags = i;
            new kwx(context).h(statusBarNotification.getTag(), statusBarNotification.getId(), notificationA);
        }
    }
}
