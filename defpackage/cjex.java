package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjex extends cjdd {
    @Override // defpackage.cjdd
    public final void b(cjlw cjlwVar, auir auirVar) {
        cjjb cjjbVar = cjlwVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        auis auisVar2 = auis.a;
        aublVarA.getClass();
        auisVar.c = aublVarA;
        auisVar.b |= 1;
    }

    @Override // defpackage.cjdd
    public final void c(cjlw cjlwVar, auir auirVar) {
        if ((cjlwVar.b & 1) != 0) {
            evqe evqeVar = cjlwVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            auirVar.copyOnWrite();
            auis auisVar = (auis) auirVar.instance;
            auis auisVar2 = auis.a;
            evqsVar.getClass();
            auisVar.b |= 2;
            auisVar.d = evqsVar;
        }
    }
}
