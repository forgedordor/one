package defpackage;

import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cglp implements eora {
    final /* synthetic */ cgit a;

    public cglp(cgit cgitVar) {
        this.a = cgitVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eksl ekslVar = (eksl) NotificationsReceiver.a.h();
        ekslVar.X(cgey.p, this.a);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onSuccess", 152, "NotificationsReceiver.java")).q("Successfully run action callback");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        eksl ekslVar = (eksl) NotificationsReceiver.a.h();
        ekslVar.X(cgey.p, this.a);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onFailure", 160, "NotificationsReceiver.java")).q("Failed to run action callback");
    }
}
