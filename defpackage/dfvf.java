package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfvf implements eora {
    private final dfve a;
    private final dfvh b;

    public dfvf(dfve dfveVar, dfvh dfvhVar) {
        this.a = dfveVar;
        this.b = dfvhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjjj cjjjVar = (cjjj) obj;
        cjje cjjeVar = (cjje) cjjf.a.createBuilder();
        dfvh dfvhVar = this.b;
        cjgr cjgrVar = dfvhVar.b.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjeVar.copyOnWrite();
        cjjf cjjfVar = (cjjf) cjjeVar.instance;
        cjgrVar.getClass();
        cjjfVar.e = cjgrVar;
        cjjfVar.b |= 1;
        cjjeVar.copyOnWrite();
        cjjf cjjfVar2 = (cjjf) cjjeVar.instance;
        cjjjVar.getClass();
        cjjfVar2.d = cjjjVar;
        cjjfVar2.c = 3;
        int i = dfvhVar.b.h;
        cjjeVar.copyOnWrite();
        cjjf cjjfVar3 = (cjjf) cjjeVar.instance;
        cjjfVar3.b |= 4;
        cjjfVar3.g = i;
        dfve dfveVar = this.a;
        evvp evvpVarB = evwz.b(dfveVar.b.f());
        cjjeVar.copyOnWrite();
        cjjf cjjfVar4 = (cjjf) cjjeVar.instance;
        evvpVarB.getClass();
        cjjfVar4.f = evvpVarB;
        cjjfVar4.b |= 2;
        cjjf cjjfVar5 = (cjjf) cjjeVar.build();
        dfvi.c(dfvhVar, cjjfVar5);
        cjkg cjkgVarB = cjkg.b(cjjjVar.c);
        if (cjkgVarB == null) {
            cjkgVarB = cjkg.RESPONSE_STATUS_UNKNOWN;
        }
        if (cjkgVarB.equals(cjkg.RESPONSE_STATUS_OK)) {
            dfvhVar.b(cjjfVar5);
            dfveVar.a();
        } else {
            if (dfveVar.c(dfvhVar)) {
                return;
            }
            dfvi.b(dfvhVar, cjjfVar5);
            dfvhVar.b(cjjfVar5);
            dfveVar.a();
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dfvh dfvhVar = this.b;
        cjgr cjgrVar = dfvhVar.b.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        dhja.i(th, "[conversationId:{%s}]: Notification failure for group: {%s}", cjjrVar.c, th.getMessage());
        dfvhVar.a(th);
        this.a.a();
    }
}
