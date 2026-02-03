package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cghj implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ekrw ekrwVarH = cghk.a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onSuccess", 185, "CancelNotificationHandler.java")).q("Notification canceled callback successfully run");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrw ekrwVarJ = cghk.a.j();
        ekrwVarJ.X(eksq.a, "BugleNotifications");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler$1", "onFailure", (char) 190, "CancelNotificationHandler.java")).q("Notification canceled callback failed");
    }
}
