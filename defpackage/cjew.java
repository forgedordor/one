package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjew extends cjdc {
    @Override // defpackage.cjdc
    public final void b(auip auipVar, cjlz cjlzVar) {
        audu auduVar = auipVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        audu auduVar2 = auipVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, auduVar2.c);
        cjlzVar.copyOnWrite();
        cjma cjmaVar = (cjma) cjlzVar.instance;
        cjma cjmaVar2 = cjma.a;
        cjgrVarA.getClass();
        cjmaVar.d = cjgrVarA;
        cjmaVar.b |= 4;
    }

    @Override // defpackage.cjdc
    public final void c(auip auipVar, cjlz cjlzVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = auipVar.e;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjlzVar.copyOnWrite();
        cjma cjmaVar = (cjma) cjlzVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjma cjmaVar2 = cjma.a;
        evqeVar2.getClass();
        cjmaVar.c = evqeVar2;
        cjmaVar.b |= 1;
    }
}
