package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjch extends cjcj {
    @Override // defpackage.cjcj
    public final void a(cjgd cjgdVar, aube aubeVar) {
        cjjb cjjbVar = cjgdVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        aubf aubfVar2 = aubf.a;
        aublVarA.getClass();
        aubfVar.c = aublVarA;
        aubfVar.b |= 1;
    }

    @Override // defpackage.cjcj
    public final void b(cjgd cjgdVar, aube aubeVar) {
        if ((cjgdVar.b & 1) != 0) {
            evqe evqeVar = cjgdVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            aubeVar.copyOnWrite();
            aubf aubfVar = (aubf) aubeVar.instance;
            aubf aubfVar2 = aubf.a;
            evqsVar.getClass();
            aubfVar.b |= 2;
            aubfVar.d = evqsVar;
        }
    }
}
