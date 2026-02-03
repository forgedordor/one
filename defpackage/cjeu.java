package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjeu extends cjda {
    @Override // defpackage.cjda
    public final void b(auii auiiVar, cjlr cjlrVar) {
        audu auduVar = auiiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        audu auduVar2 = auiiVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, auduVar2.c);
        cjlrVar.copyOnWrite();
        cjls cjlsVar = (cjls) cjlrVar.instance;
        cjls cjlsVar2 = cjls.a;
        cjgrVarA.getClass();
        cjlsVar.d = cjgrVarA;
        cjlsVar.b |= 4;
    }

    @Override // defpackage.cjda
    public final void c(auii auiiVar, cjlr cjlrVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = auiiVar.d;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjlrVar.copyOnWrite();
        cjls cjlsVar = (cjls) cjlrVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjls cjlsVar2 = cjls.a;
        evqeVar2.getClass();
        cjlsVar.c = evqeVar2;
        cjlsVar.b |= 1;
    }
}
