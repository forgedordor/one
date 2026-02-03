package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjep extends cjcv {
    @Override // defpackage.cjcv
    public final void b(augo augoVar, cjkp cjkpVar) {
        aubq aubqVar = augoVar.c;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, augoVar.e);
        cjkpVar.copyOnWrite();
        cjkq cjkqVar = (cjkq) cjkpVar.instance;
        cjkq cjkqVar2 = cjkq.a;
        cjgrVarA.getClass();
        cjkqVar.d = cjgrVarA;
        cjkqVar.b |= 4;
    }

    @Override // defpackage.cjcv
    public final void c(augo augoVar, cjkp cjkpVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = augoVar.f;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjkpVar.copyOnWrite();
        cjkq cjkqVar = (cjkq) cjkpVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjkq cjkqVar2 = cjkq.a;
        evqeVar2.getClass();
        cjkqVar.c = evqeVar2;
        cjkqVar.b |= 1;
    }

    @Override // defpackage.cjcv
    public final void d(augo augoVar, cjkp cjkpVar) {
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String str = augoVar.d;
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        str.getClass();
        cjjwVar.b |= 1;
        cjjwVar.c = str;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        cjkpVar.copyOnWrite();
        cjkq cjkqVar = (cjkq) cjkpVar.instance;
        cjkq cjkqVar2 = cjkq.a;
        cjjwVar2.getClass();
        cjkqVar.e = cjjwVar2;
        cjkqVar.b |= 16;
    }
}
