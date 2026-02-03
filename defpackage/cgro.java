package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgro implements eyif {
    public static ehwk a(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        if (((arpu) fcsuVar2.b()).a()) {
            ehwk ehwkVar = ehwk.a;
            ehwa ehwaVar = new ehwa();
            ehwaVar.c(1L, TimeUnit.DAYS);
            return ehwj.a(ehwaVar.a(), fcsuVar);
        }
        ekrw ekrwVarH = cgrn.a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/notification2o/synclet/NotificationStateSyncletModule", "provideNotificationStateSynclet", 40, "NotificationStateSyncletModule.kt")).q("Notification state synclet is disabled, not providing");
        return ehwk.a;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
