package com.google.android.apps.messaging.shared.notification2o;

import android.app.ActivityOptions;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.cgey;
import defpackage.cggq;
import defpackage.cggs;
import defpackage.cgip;
import defpackage.cgiq;
import defpackage.cgit;
import defpackage.cgiw;
import defpackage.cgjm;
import defpackage.cgjn;
import defpackage.cgjr;
import defpackage.cgkb;
import defpackage.cglf;
import defpackage.cglp;
import defpackage.cglq;
import defpackage.cqzq;
import defpackage.cqzr;
import defpackage.duac;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijw;
import defpackage.eijx;
import defpackage.eika;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eksq;
import defpackage.eoqg;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class NotificationsReceiver extends cgip {
    public static final eksp a = eksp.c("BugleNotifications");
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;

    private final void m(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            if (Build.VERSION.SDK_INT < 34) {
                pendingIntent.send();
            } else {
                pendingIntent.send((Context) this.f.b(), 0, null, null, null, null, ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            }
        } catch (PendingIntent.CanceledException e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "launchPendingIntent", (char) 292, "NotificationsReceiver.java")).q("Error running pending intent for notification action");
        }
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("NotificationsReceiver receive broadcast", "com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "beginRootTrace", 300);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.Notification2o.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification2o.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) throws Resources.NotFoundException, PendingIntent.CanceledException {
        eksp ekspVar;
        eksp ekspVar2 = a;
        ((eksl) ((eksl) ekspVar2.h()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "doInBackground", 52, "NotificationsReceiver.java")).q("Notifications receiver do in background");
        if (Objects.equals(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            cgkb cgkbVar = (cgkb) this.e.b();
            HashSet hashSet = (HashSet) Collection.EL.stream(cgkbVar.b.c()).map(new Function() { // from class: cgjy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return akc$$ExternalSyntheticApiModelOutline0.m(obj).getId();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: cgjz
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new HashSet();
                }
            }));
            for (cgiw cgiwVar : ((Map) cgkbVar.d.b()).values()) {
                Optional optionalF = cgiwVar.f();
                if (optionalF.isEmpty() || !hashSet.contains(((cggq) optionalF.get()).a)) {
                    ekrw ekrwVarH = cgkb.a.h();
                    ekrwVarH.X(eksq.a, "BugleNotifications");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(new ekrz("channel_builder_empty", Boolean.class, false, false), Boolean.valueOf(optionalF.isEmpty()));
                    ekrdVar.X(cgey.k, (String) optionalF.map(new Function() { // from class: cgka
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((cgjr) obj).i();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null));
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 192, "NotificationChannelManager.java")).q("Channel does not exist or builder info is empty for blueprint, not refreshing channel name");
                    ekspVar2 = ekspVar2;
                } else {
                    NotificationChannel notificationChannelE = cgkbVar.e((cgjr) optionalF.get());
                    ekrw ekrwVarH2 = cgkb.a.h();
                    ekrwVarH2.X(eksq.a, "BugleNotifications");
                    ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                    ekrdVar2.X(cgey.n, cgiwVar.d());
                    ekrdVar2.X(cgey.k, notificationChannelE.getId());
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "NotificationChannelManager.java")).q("Updating channel for locale change");
                }
            }
            ekspVar = ekspVar2;
            NotificationChannel notificationChannelG = cgkbVar.g();
            ekrg ekrgVar = cgkb.a;
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH3.X(ekrzVar, "BugleNotifications");
            ekrd ekrdVar3 = (ekrd) ekrwVarH3;
            ekrz ekrzVar2 = cgey.k;
            ekrdVar3.X(ekrzVar2, notificationChannelG.getId());
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 210, "NotificationChannelManager.java")).q("Updating misc channels for locale change");
            NotificationChannel notificationChannelF = cgkbVar.f();
            ekrw ekrwVarH4 = ekrgVar.h();
            ekrwVarH4.X(ekrzVar, "BugleNotifications");
            ekrd ekrdVar4 = (ekrd) ekrwVarH4;
            ekrdVar4.X(ekrzVar2, notificationChannelF.getId());
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 215, "NotificationChannelManager.java")).q("Updating foreground channel for locale change");
            cqzr cqzrVar = (cqzr) cgkbVar.c.b();
            Context context2 = cqzrVar.b;
            cqzrVar.i("bugle_reminder_channel", context2.getString(R.string.bugle_notification_reminders_channel_name), cqzq.REMINDERS.e);
            if (((NotificationManager) cqzrVar.a.b()).getNotificationChannel("download-notification-channel-id") != null) {
                duac.c(context2);
            }
            String string = context2.getString(R.string.bugle_notification_silent_default_channel_name);
            String str = cqzq.WEB_SETTINGS.e;
            cqzrVar.i("bugle_while_using_web_channel_v1", string, str);
            cqzrVar.i("bugle_connected_to_web_channel_v1", context2.getResources().getString(R.string.bugle_notification_ditto_channel_name), str);
            cqzrVar.i("bugle_report_issue_channel", context2.getResources().getString(R.string.bugle_notification_report_issue_channel_name), null);
            cqzrVar.i("bugle_auto_moved_spam_channel", context2.getString(R.string.automoved_spam_notification_channel_name), null);
            String string2 = context2.getResources().getString(R.string.rcs_not_delivered_notification_channel_name);
            String str2 = cqzq.DEFAULT_SETTINGS.e;
            cqzrVar.i("bugle_rcs_not_delivered_channel", string2, str2);
            cqzrVar.i("bugle_business_messages_channel", context2.getResources().getString(R.string.bugle_notification_business_messages_channel_name), str2);
            ekrw ekrwVarH5 = ekrgVar.h();
            ekrwVarH5.X(ekrzVar, "BugleNotifications");
            ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 218, "NotificationChannelManager.java")).q("Updating legacy channels for locale change");
        } else {
            ekspVar = ekspVar2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("extra_notification_type")) {
            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runCallbacks", 66, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or extras");
            return;
        }
        cglf cglfVarB = cglf.b(extras.getInt("extra_notification_type", cglf.NT_UNKNOWN.j));
        cglfVarB.getClass();
        Optional optionalOfNullable = Optional.ofNullable(extras.getString("extra_notification_tag"));
        boolean z = extras.getBoolean("extra_is_summary_notification", false);
        Bundle bundle = extras.getBundle("extra_notification_bundle");
        if (bundle == null) {
            bundle = new Bundle();
        }
        cggs cggsVar = new cggs(cglfVarB, optionalOfNullable, bundle, z);
        cgit cgitVar = cgit.NAT_UNKNOWN;
        cgit cgitVarB = cgit.b(intent.getIntExtra("extra_notification_action_type", cgitVar.p));
        cgitVarB.getClass();
        if (cgitVarB == cgitVar) {
            eksl ekslVar = (eksl) ekspVar.h();
            ekslVar.X(cgey.n, cggsVar.a);
            ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 113, "NotificationsReceiver.java")).q("Unknown notification action type, not creating callback");
        } else {
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            eiju eijuVarE = eijx.e(null);
            Map map = (Map) this.c.b();
            cgit cgitVar2 = cgit.NAT_DIRECTOR;
            if (map.containsKey(cgitVar2)) {
                cgiq cgiqVar = (cgiq) ((Map) this.c.b()).get(cgitVar2);
                cgiqVar.getClass();
                eijuVarE = cgiqVar.a(this, intent, extras2, cggsVar);
            }
            eiju eijuVarE2 = eijx.e(null);
            if (((Map) this.c.b()).containsKey(cgitVarB)) {
                cgiq cgiqVar2 = (cgiq) ((Map) this.c.b()).get(cgitVarB);
                cgiqVar2.getClass();
                eijuVarE2 = cgiqVar2.a(this, intent, extras2, cggsVar);
            } else {
                eksl ekslVar2 = (eksl) ekspVar.h();
                ekslVar2.X(cgey.p, cgitVarB);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 140, "NotificationsReceiver.java")).q("No action callback, only running on director");
            }
            eijw eijwVarM = eijx.m(eijuVarE2, eijuVarE);
            Callable callable = new Callable() { // from class: cglo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eksp ekspVar3 = NotificationsReceiver.a;
                    return null;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eika.l(eijwVarM.a(callable, eoqgVar), new cglp(cgitVarB), eoqgVar);
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || !extras3.containsKey("extra_notification_callback_type")) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 170, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or callbackType");
        } else {
            cgjm cgjmVar = cgjm.NOTIFICATION_CALLBACK_UNKNOWN;
            try {
                cgjmVar = (cgjm) Enum.valueOf(cgjm.class, extras3.getString("extra_notification_callback_type", cgjmVar.name()));
            } catch (IllegalArgumentException unused) {
            }
            cglf cglfVar = cggsVar.a;
            if (intent.getExtras() == null) {
                new Bundle();
            }
            eiju eijuVarE3 = eijx.e(null);
            eiju eijuVarE4 = eijx.e(null);
            int iOrdinal = cgjmVar.ordinal();
            if (iOrdinal == 1) {
                if (((Map) this.d.b()).containsKey(cglfVar)) {
                    eijuVarE4 = ((cgjn) ((Map) this.d.b()).get(cglfVar)).e(cggsVar);
                }
                cgjn cgjnVar = (cgjn) ((Map) this.d.b()).get(cglf.NT_DIRECTOR);
                cgjnVar.getClass();
                eijuVarE3 = cgjnVar.e(cggsVar);
            } else if (iOrdinal == 2) {
                if (((Map) this.d.b()).containsKey(cglfVar)) {
                    eijuVarE4 = ((cgjn) ((Map) this.d.b()).get(cglfVar)).f(cggsVar);
                }
                cgjn cgjnVar2 = (cgjn) ((Map) this.d.b()).get(cglf.NT_DIRECTOR);
                cgjnVar2.getClass();
                eijuVarE3 = cgjnVar2.f(cggsVar);
            } else if (iOrdinal == 3) {
                if (((Map) this.d.b()).containsKey(cglfVar)) {
                    eijuVarE4 = ((cgjn) ((Map) this.d.b()).get(cglfVar)).d(cggsVar);
                }
                cgjn cgjnVar3 = (cgjn) ((Map) this.d.b()).get(cglf.NT_DIRECTOR);
                cgjnVar3.getClass();
                eijuVarE3 = cgjnVar3.d(cggsVar);
            } else if (iOrdinal != 4) {
                eksl ekslVar3 = (eksl) a.j();
                ekslVar3.X(cgey.n, cglfVar);
                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 248, "NotificationsReceiver.java")).q("Unknown callback type");
            } else {
                if (((Map) this.d.b()).containsKey(cglfVar)) {
                    eijuVarE4 = ((cgjn) ((Map) this.d.b()).get(cglfVar)).c(cggsVar);
                }
                cgjn cgjnVar4 = (cgjn) ((Map) this.d.b()).get(cglf.NT_DIRECTOR);
                cgjnVar4.getClass();
                eijuVarE3 = cgjnVar4.c(cggsVar);
            }
            eijw eijwVarM2 = eijx.m(eijuVarE3, eijuVarE4);
            Callable callable2 = new Callable() { // from class: cgln
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eksp ekspVar3 = NotificationsReceiver.a;
                    return null;
                }
            };
            eoqg eoqgVar2 = eoqg.a;
            eika.l(eijwVarM2.a(callable2, eoqgVar2), new cglq(cgjmVar), eoqgVar2);
        }
        PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("extra_pending_intent_to_run");
        if (pendingIntent == null) {
            return;
        }
        m(pendingIntent);
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.notification2o_receiver_update_message);
    }
}
