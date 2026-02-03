package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjeq extends cjcw {
    @Override // defpackage.cjcw
    public final void b(cjkm cjkmVar, augp augpVar) {
        cjjb cjjbVar = cjkmVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        augq augqVar2 = augq.a;
        aublVarA.getClass();
        augqVar.c = aublVarA;
        augqVar.b |= 1;
    }

    @Override // defpackage.cjcw
    public final void c(cjkm cjkmVar, augp augpVar) {
        if ((cjkmVar.b & 1) != 0) {
            evqe evqeVar = cjkmVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            augpVar.copyOnWrite();
            augq augqVar = (augq) augpVar.instance;
            augq augqVar2 = augq.a;
            evqsVar.getClass();
            augqVar.b |= 2;
            augqVar.d = evqsVar;
        }
    }
}
