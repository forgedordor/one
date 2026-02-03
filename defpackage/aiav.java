package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiav {
    public static final /* synthetic */ aiau a(aiag aiagVar) {
        evsn evsnVarBuild = aiagVar.build();
        evsnVarBuild.getClass();
        return (aiau) evsnVarBuild;
    }

    public static final void b(long j, aiag aiagVar) {
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiau aiauVar2 = aiau.a;
        aiauVar.b |= 2;
        aiauVar.f = j;
    }

    public static final void c(evqs evqsVar, aiag aiagVar) {
        aiagVar.copyOnWrite();
        aiau aiauVar = (aiau) aiagVar.instance;
        aiau aiauVar2 = aiau.a;
        aiauVar.b |= 1;
        aiauVar.e = evqsVar;
    }
}
