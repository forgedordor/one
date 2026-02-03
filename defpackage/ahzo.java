package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzo implements ahta {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener");
    private final fcsu b;

    public ahzo(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    @Override // defpackage.ahta
    public final eieu a() {
        return eiiy.a("ConversationRefreshListener::onRestoreCompleted");
    }

    @Override // defpackage.ahta
    public final void b(ahsz ahszVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 45, "ConversationRefreshListener.kt");
        UUID uuid = ahszVar.a;
        ekrdVar.t("Restore completed - scheduling conversation metadata refresh [%s]", uuid);
        aibb aibbVar = (aibb) this.b.b();
        aibbVar.a.h("Queueing work to refresh conversations [%s]", uuid);
        aiag aiagVar = (aiag) aiau.a.createBuilder();
        aiagVar.getClass();
        aiav.c(cobs.a(uuid), aiagVar);
        aiaq aiaqVar = (aiaq) aiar.a.createBuilder();
        aiaqVar.getClass();
        evsn evsnVarBuild = aiaqVar.build();
        evsnVarBuild.getClass();
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiauVar.d = (aiar) evsnVarBuild;
        aiauVar.c = 7;
        aibbVar.a(aiav.a(aiagVar));
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleBackup");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 47, "ConversationRefreshListener.kt")).t("Scheduled conversation metadata refresh [%s]", uuid);
    }
}
