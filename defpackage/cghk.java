package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cghk extends cayl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler");
    public final Map b;
    private final eosc c;
    private final fcsu d;
    private final cglm e;
    private final cgkb f;
    private final cgio g;
    private final kwx h;

    public cghk(Context context, eosc eoscVar, fcsu fcsuVar, Map map, cglm cglmVar, cgkb cgkbVar, cgio cgioVar) {
        this.h = new kwx(context);
        this.c = eoscVar;
        this.d = fcsuVar;
        this.b = map;
        this.e = cglmVar;
        this.f = cgkbVar;
        this.g = cgioVar;
    }

    private final void k(final cglf cglfVar, final List list) {
        if (!list.isEmpty()) {
            eika.l(eijx.h(new eooy() { // from class: cghi
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    cglf cglfVar2;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        cglfVar2 = cglfVar;
                        if (!it.hasNext()) {
                            break;
                        }
                        StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                        arrayList.add(new cggs(cglfVar2, Optional.ofNullable(statusBarNotification.getTag()), statusBarNotification.getNotification().extras, kwq.b(statusBarNotification.getNotification())));
                    }
                    Map map = this.a.b;
                    cgjn cgjnVar = (cgjn) map.get(cglf.NT_DIRECTOR);
                    cgjnVar.getClass();
                    eiju eijuVarA = cgjnVar.a(arrayList);
                    eiju eijuVarE = eijx.e(null);
                    if (map.containsKey(cglfVar2)) {
                        cgjn cgjnVar2 = (cgjn) map.get(cglfVar2);
                        cgjnVar2.getClass();
                        eijuVarE = cgjnVar2.a(arrayList);
                    }
                    return eijx.m(eijuVarA, eijuVarE).a(new Callable() { // from class: cghh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, eoqg.a);
                }
            }, this.c), new cghj(), eoqg.a);
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cgey.n, cglfVar);
        ekrdVar.X(cgey.d, null);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "runCancelCallbacks", 147, "CancelNotificationHandler.java")).q("No notifications given, not running cancel callbacks");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // defpackage.cayl, defpackage.cazg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.caya a() {
        /*
            r3 = this;
            caxz r0 = defpackage.caya.l()
            fcsu r1 = r3.d
            java.lang.Object r1 = r1.b()
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            int r1 = r1.intValue()
            r0.d(r1)
            kwx r1 = r3.h
            boolean r1 = r1.i()
            if (r1 == 0) goto L3c
            cgkb r1 = r3.f
            android.app.NotificationChannel r2 = r1.f()
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L2b
            goto L3c
        L2b:
            caze r1 = defpackage.caze.FOREGROUND_SERVICE
            r0.b(r1)
            cgio r1 = r3.g
            android.app.Notification r1 = r1.a()
            r2 = r0
            caxk r2 = (defpackage.caxk) r2
            r2.b = r1
            goto L41
        L3c:
            caze r1 = defpackage.caze.WAKELOCK
            r0.b(r1)
        L41:
            caya r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cghk.a():caya");
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CancelNotificationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cgjp.a.getParserForType();
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, ekgb ekgbVar) {
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            cgjp cgjpVar = (cgjp) ekgbVar.get(i);
            if ((cgjpVar.b & 2) != 0) {
                cglf cglfVarB = cglf.b(cgjpVar.c);
                if (cglfVarB == null) {
                    cglfVarB = cglf.NT_UNKNOWN;
                }
                String str = cgjpVar.d;
                cglm cglmVar = this.e;
                StatusBarNotification statusBarNotificationA = cglmVar.a(cglfVarB, str);
                if (cglm.f(statusBarNotificationA)) {
                    cglmVar.d(statusBarNotificationA);
                    statusBarNotificationA.getClass();
                    k(cglfVarB, Arrays.asList(statusBarNotificationA));
                } else {
                    ekrw ekrwVarH = a.h();
                    ekrwVarH.X(eksq.a, "BugleNotifications");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cgey.n, cglfVarB);
                    ekrdVar.X(cgey.d, str);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotification", 130, "CancelNotificationHandler.java")).q("No active notification to cancel");
                }
            } else {
                cglf cglfVarB2 = cglf.b(cgjpVar.c);
                if (cglfVarB2 == null) {
                    cglfVarB2 = cglf.NT_UNKNOWN;
                }
                cglm cglmVar2 = this.e;
                List listC = cglmVar2.c(cglfVarB2);
                if (listC.isEmpty()) {
                    ekrw ekrwVarH2 = a.h();
                    ekrwVarH2.X(eksq.a, "BugleNotifications");
                    ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                    ekrdVar2.X(cgey.n, cglfVarB2);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 108, "CancelNotificationHandler.java")).q("No active status bar notification of this type exists, cancelNotificationsOfType does nothing");
                } else {
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        cglmVar2.d((StatusBarNotification) it.next());
                    }
                    k(cglfVarB2, listC);
                    ekrw ekrwVarH3 = a.h();
                    ekrwVarH3.X(eksq.a, "BugleNotifications");
                    ekrd ekrdVar3 = (ekrd) ekrwVarH3;
                    ekrdVar3.X(cgey.n, cglfVarB2);
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 119, "CancelNotificationHandler.java")).q("Cancelled the active status bar notifications that match the type");
                }
            }
        }
        return eijx.e(cbcw.i());
    }
}
