package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjev extends cjdb {
    @Override // defpackage.cjdb
    public final void b(cjlo cjloVar, auij auijVar) {
        cjjb cjjbVar = cjloVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        auik auikVar2 = auik.a;
        aublVarA.getClass();
        auikVar.c = aublVarA;
        auikVar.b |= 1;
    }

    @Override // defpackage.cjdb
    public final void c(cjlo cjloVar, auij auijVar) {
        if ((cjloVar.b & 1) != 0) {
            evqe evqeVar = cjloVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            auijVar.copyOnWrite();
            auik auikVar = (auik) auijVar.instance;
            auik auikVar2 = auik.a;
            evqsVar.getClass();
            auikVar.b |= 2;
            auikVar.d = evqsVar;
        }
    }
}
