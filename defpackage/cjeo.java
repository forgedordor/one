package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjeo extends cjcu {
    @Override // defpackage.cjcu
    public final void b(cjjy cjjyVar, augj augjVar) {
        cjjb cjjbVar = cjjyVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        augk augkVar2 = augk.a;
        aublVarA.getClass();
        augkVar.c = aublVarA;
        augkVar.b |= 1;
    }

    @Override // defpackage.cjcu
    public final void c(cjjy cjjyVar, augj augjVar) {
        if ((cjjyVar.b & 1) != 0) {
            evqe evqeVar = cjjyVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            augjVar.copyOnWrite();
            augk augkVar = (augk) augjVar.instance;
            augk augkVar2 = augk.a;
            evqsVar.getClass();
            augkVar.b |= 2;
            augkVar.d = evqsVar;
        }
    }
}
