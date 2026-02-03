package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfvg implements eora {
    private final dfvh a;
    private final dfve b;

    public dfvg(dfve dfveVar, dfvh dfvhVar) {
        this.b = dfveVar;
        this.a = dfvhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjjn cjjnVar = (cjjn) obj;
        cjje cjjeVar = (cjje) cjjf.a.createBuilder();
        dfvh dfvhVar = this.a;
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
        cjjnVar.getClass();
        cjjfVar2.d = cjjnVar;
        cjjfVar2.c = 2;
        int i = dfvhVar.b.h;
        cjjeVar.copyOnWrite();
        cjjf cjjfVar3 = (cjjf) cjjeVar.instance;
        cjjfVar3.b |= 4;
        cjjfVar3.g = i;
        dfve dfveVar = this.b;
        evvp evvpVarB = evwz.b(dfveVar.b.f());
        cjjeVar.copyOnWrite();
        cjjf cjjfVar4 = (cjjf) cjjeVar.instance;
        evvpVarB.getClass();
        cjjfVar4.f = evvpVarB;
        cjjfVar4.b = 2 | cjjfVar4.b;
        cjjf cjjfVar5 = (cjjf) cjjeVar.build();
        dfvi.c(dfvhVar, cjjfVar5);
        cjkg cjkgVarB = cjkg.b(cjjnVar.c);
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
        dfvh dfvhVar = this.a;
        cjgr cjgrVar = dfvhVar.b.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        cjjd cjjdVar = dfvhVar.b;
        int i = cjjdVar.c;
        if (i == 2) {
            cjib cjibVar = ((cjjl) cjjdVar.d).e;
            if (cjibVar == null) {
                cjibVar = cjib.b;
            }
            cjjw cjjwVar = cjibVar.d;
            if (cjjwVar == null) {
                cjjwVar = cjjw.a;
            }
            dhja.i(th, "[conversationId:%s, messageId: %s]: Notification failure for message: %s", str, cjjwVar.c, th.getMessage());
        } else if (i == 3) {
            dhja.i(th, "[conversationId:%s]: Notification failure for group: %s", str, th.getMessage());
        }
        dfvhVar.a(th);
        this.b.a();
    }
}
