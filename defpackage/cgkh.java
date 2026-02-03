package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgkh implements cgjn {
    final /* synthetic */ cglv a;

    public cgkh(cglv cglvVar) {
        this.a = cglvVar;
    }

    @Override // defpackage.cgjn
    public final eiju a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cgkd cgkdVar = (cgkd) it.next();
            eksl ekslVar = (eksl) cgki.a.h();
            ekslVar.X(cgey.n, cgkdVar.b());
            ekslVar.X(cgey.d, (String) cgkdVar.c().orElse(null));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationCanceled", 132, "NotificationDirectorCallbacksModule.java")).q("Notification canceled");
            ((ains) this.a.a.b()).e("Bugle.Notifications2o.Canceled.Count", cgkdVar.b().j);
        }
        return eijx.e(null);
    }

    @Override // defpackage.cgjn
    public final eiju b(List list) {
        if (list.isEmpty()) {
            return eijx.e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cgkd cgkdVar = (cgkd) it.next();
            eksl ekslVar = (eksl) cgki.a.h();
            ekslVar.X(cgey.n, cgkdVar.b());
            ekslVar.X(cgey.d, (String) cgkdVar.c().orElse(null));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationPosted", 151, "NotificationDirectorCallbacksModule.java")).q("Notification posted");
            ((ains) this.a.a.b()).e("Bugle.Notifications2o.Posted.Count", cgkdVar.b().j);
        }
        return eijx.e(null);
    }

    @Override // defpackage.cgjn
    public final eiju c(cgkd cgkdVar) {
        eksl ekslVar = (eksl) cgki.a.h();
        ekrz ekrzVar = cgey.n;
        cggs cggsVar = (cggs) cgkdVar;
        cglf cglfVar = cggsVar.a;
        ekslVar.X(ekrzVar, cglfVar);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleClicked", 91, "NotificationDirectorCallbacksModule.java")).q("Bubble clicked");
        ((ains) this.a.a.b()).e("Bugle.Notifications2o.BubbleClicked.Count", cglfVar.j);
        return eijx.e(null);
    }

    @Override // defpackage.cgjn
    public final eiju d(cgkd cgkdVar) {
        eksl ekslVar = (eksl) cgki.a.h();
        ekrz ekrzVar = cgey.n;
        cggs cggsVar = (cggs) cgkdVar;
        cglf cglfVar = cggsVar.a;
        ekslVar.X(ekrzVar, cglfVar);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleSwiped", 105, "NotificationDirectorCallbacksModule.java")).q("Bubble swiped");
        ((ains) this.a.a.b()).e("Bugle.Notifications2o.BubbleSwiped.Count", cglfVar.j);
        return eijx.e(null);
    }

    @Override // defpackage.cgjn
    public final eiju e(cgkd cgkdVar) {
        eksl ekslVar = (eksl) cgki.a.h();
        ekrz ekrzVar = cgey.n;
        cggs cggsVar = (cggs) cgkdVar;
        cglf cglfVar = cggsVar.a;
        ekslVar.X(ekrzVar, cglfVar);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationClicked", 77, "NotificationDirectorCallbacksModule.java")).q("Notification clicked");
        ((ains) this.a.a.b()).e("Bugle.Notifications2o.Clicked.Count", cglfVar.j);
        return eijx.e(null);
    }

    @Override // defpackage.cgjn
    public final eiju f(cgkd cgkdVar) {
        eksl ekslVar = (eksl) cgki.a.h();
        ekrz ekrzVar = cgey.n;
        cggs cggsVar = (cggs) cgkdVar;
        cglf cglfVar = cggsVar.a;
        ekslVar.X(ekrzVar, cglfVar);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationSwiped", 119, "NotificationDirectorCallbacksModule.java")).q("Notification swiped");
        ((ains) this.a.a.b()).e("Bugle.Notifications2o.Swiped.Count", cglfVar.j);
        return eijx.e(null);
    }
}
