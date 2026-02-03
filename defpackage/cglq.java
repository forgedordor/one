package defpackage;

import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cglq implements eora {
    final /* synthetic */ cgjm a;

    public cglq(cgjm cgjmVar) {
        this.a = cgjmVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eksl ekslVar = (eksl) NotificationsReceiver.a.h();
        ekslVar.X(cgey.o, this.a);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onSuccess", 261, "NotificationsReceiver.java")).q("Successfully run callback");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) NotificationsReceiver.a.j()).g(th)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onFailure", (char) 266, "NotificationsReceiver.java")).q("Failed to run callback");
    }
}
