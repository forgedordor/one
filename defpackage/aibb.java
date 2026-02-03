package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibb {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/restore/pwq/MessagesRestoreScheduler");
    public final ahzu a;
    private final cazj c;

    public aibb(cazj cazjVar, ahzv ahzvVar) {
        cazjVar.getClass();
        ahzvVar.getClass();
        this.c = cazjVar;
        this.a = ahzvVar.a(b, null, null);
    }

    public final void a(aiau aiauVar) {
        this.c.a(cbcu.f("MessagesRestoreWorkItemHandler", aiauVar));
    }

    public final void b(UUID uuid, int i) {
        uuid.getClass();
        this.a.i("Queueing work to restore attachment workflowVersion:[%s] sessionId:[%s]", Integer.valueOf(i), uuid);
        aiag aiagVar = (aiag) aiau.a.createBuilder();
        aiagVar.getClass();
        aiav.c(cobs.a(uuid), aiagVar);
        aiav.b(i, aiagVar);
        aias aiasVar = (aias) aiat.a.createBuilder();
        aiasVar.getClass();
        evsn evsnVarBuild = aiasVar.build();
        evsnVarBuild.getClass();
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiauVar.d = (aiat) evsnVarBuild;
        aiauVar.c = 3;
        a(aiav.a(aiagVar));
    }

    public final void c(UUID uuid, int i) {
        uuid.getClass();
        this.a.i("Queueing work to restore the database workflowVersion:[%s] sessionId:[%s]", Integer.valueOf(i), uuid);
        aiag aiagVar = (aiag) aiau.a.createBuilder();
        aiagVar.getClass();
        aiav.c(cobs.a(uuid), aiagVar);
        aiav.b(i, aiagVar);
        aiaj aiajVar = (aiaj) aiak.a.createBuilder();
        aiajVar.getClass();
        evsn evsnVarBuild = aiajVar.build();
        evsnVarBuild.getClass();
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiauVar.d = (aiak) evsnVarBuild;
        aiauVar.c = 2;
        a(aiav.a(aiagVar));
    }

    public final void d(UUID uuid, aiaf aiafVar) {
        uuid.getClass();
        aiafVar.getClass();
        this.a.h("Queueing work to finalize restore [%s]", uuid);
        aiag aiagVar = (aiag) aiau.a.createBuilder();
        aiagVar.getClass();
        aiav.c(cobs.a(uuid), aiagVar);
        aial aialVar = (aial) aiam.a.createBuilder();
        aialVar.getClass();
        aialVar.copyOnWrite();
        aiam aiamVar = (aiam) aialVar.instance;
        aiamVar.b |= 1;
        aiamVar.c = aiafVar.q;
        evsn evsnVarBuild = aialVar.build();
        evsnVarBuild.getClass();
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiauVar.d = (aiam) evsnVarBuild;
        aiauVar.c = 5;
        a(aiav.a(aiagVar));
    }

    public final void e(UUID uuid) {
        uuid.getClass();
        this.a.h("Queueing work to notify listeners [%s]", uuid);
        aiag aiagVar = (aiag) aiau.a.createBuilder();
        aiagVar.getClass();
        aiav.c(cobs.a(uuid), aiagVar);
        aiao aiaoVar = (aiao) aiap.a.createBuilder();
        aiaoVar.getClass();
        evsn evsnVarBuild = aiaoVar.build();
        evsnVarBuild.getClass();
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiauVar.d = (aiap) evsnVarBuild;
        aiauVar.c = 4;
        a(aiav.a(aiagVar));
    }
}
