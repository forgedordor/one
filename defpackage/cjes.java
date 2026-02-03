package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjes extends cjcy {
    private final cogw a;
    private final cjaj b;

    public cjes(cogw cogwVar, cjaj cjajVar) {
        this.b = cjajVar;
        this.a = cogwVar;
    }

    @Override // defpackage.cjcy
    public final void b(cjlc cjlcVar, augy augyVar) {
        cjjb cjjbVar = cjlcVar.e;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        augz augzVar2 = augz.a;
        aublVarA.getClass();
        augzVar.c = aublVarA;
        augzVar.b |= 1;
    }

    @Override // defpackage.cjcy
    public final void c(cjlc cjlcVar, augy augyVar) {
        if ((cjlcVar.b & 1) != 0) {
            evqe evqeVar = cjlcVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            augyVar.copyOnWrite();
            augz augzVar = (augz) augyVar.instance;
            augz augzVar2 = augz.a;
            evqsVar.getClass();
            augzVar.b |= 2;
            augzVar.d = evqsVar;
        }
    }

    @Override // defpackage.cjcy
    public final void d(cjlc cjlcVar, augy augyVar) {
        cjjb cjjbVar = cjlcVar.e;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        int iA = cjhf.a(cjjbVar.c);
        if (iA != 0 && iA == 2) {
            return;
        }
        cjjb cjjbVar2 = cjlcVar.e;
        if (cjjbVar2 == null) {
            cjjbVar2 = cjjb.a;
        }
        augl auglVar = (augl) augm.a.createBuilder();
        cjkk cjkkVar = cjjbVar2.e;
        if (cjkkVar == null) {
            cjkkVar = cjkk.a;
        }
        int iA2 = cjkj.a(cjkkVar.c);
        boolean z = false;
        if (iA2 != 0 && iA2 == 3) {
            z = true;
        }
        auglVar.copyOnWrite();
        augm augmVar = (augm) auglVar.instance;
        augmVar.b = 1 | augmVar.b;
        augmVar.c = z;
        cjkk cjkkVar2 = cjjbVar2.e;
        if (((cjkkVar2 == null ? cjkk.a : cjkkVar2).b & 2) != 0) {
            if (cjkkVar2 == null) {
                cjkkVar2 = cjkk.a;
            }
            evrj evrjVar = cjkkVar2.d;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            auglVar.copyOnWrite();
            augm augmVar2 = (augm) auglVar.instance;
            evrjVar.getClass();
            augmVar2.d = evrjVar;
            augmVar2.b |= 2;
        }
        augm augmVar3 = (augm) auglVar.build();
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        augz augzVar2 = augz.a;
        augmVar3.getClass();
        augzVar.g = augmVar3;
        augzVar.b |= 16;
    }

    @Override // defpackage.cjcy
    public final void e(augy augyVar) {
        evvp evvpVarB = evwz.b(this.a.f());
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        augz augzVar2 = augz.a;
        evvpVarB.getClass();
        augzVar.e = evvpVarB;
        augzVar.b |= 4;
    }

    @Override // defpackage.cjcy
    public final void f(augy augyVar) {
        elpg elpgVarA = this.b.a();
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        augz augzVar2 = augz.a;
        elpgVarA.getClass();
        augzVar.h = elpgVarA;
        augzVar.b |= 32;
    }
}
