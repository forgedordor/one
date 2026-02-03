package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byki implements byfc {
    private static final cqce a = cqce.g("BugleCms", "CmsBackupWorker");
    private final bykf b;
    private final cogw c;
    private final fcsu d;

    public byki(bykf bykfVar, cogw cogwVar, fcsu fcsuVar) {
        this.b = bykfVar;
        this.c = cogwVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.byfc
    public final eiju a(bppd bppdVar) {
        ejwl.a(d(bppdVar));
        if (bppdVar.r() == null) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Null work item id");
            cqbdVarC.y("workType", bppdVar.o());
            cqbdVarC.y("itemType", bppdVar.m());
            cqbdVarC.y("flags", bppdVar.k());
            cqbdVarC.r();
            return eijx.e(true);
        }
        int iO = bppdVar.o();
        byiu byiuVar = (byiu) byiv.a.createBuilder();
        bppdVar.aA(4, "account_id");
        int i = bppdVar.e;
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byivVar.b |= 1;
        byivVar.c = i;
        int iM = bppdVar.m();
        byiuVar.copyOnWrite();
        byiv byivVar2 = (byiv) byiuVar.instance;
        byivVar2.b |= 2;
        byivVar2.d = iM;
        String strR = bppdVar.r();
        strR.getClass();
        byiuVar.copyOnWrite();
        byiv byivVar3 = (byiv) byiuVar.instance;
        byivVar3.b = 4 | byivVar3.b;
        byivVar3.e = strR;
        int iK = bppdVar.k();
        byiuVar.copyOnWrite();
        byiv byivVar4 = (byiv) byiuVar.instance;
        byivVar4.b |= 8;
        byivVar4.f = iK;
        byiuVar.copyOnWrite();
        byiv byivVar5 = (byiv) byiuVar.instance;
        byivVar5.b |= 16;
        byivVar5.g = iO == 64;
        if (bppdVar.p() > 0) {
            ((ains) this.d.b()).g("Bugle.Cms.IncrementalBackup.SchedulingDelay", this.c.f().toEpochMilli() - bppdVar.p());
        }
        evvp evvpVarC = evxc.c(this.c.f().toEpochMilli());
        byiuVar.copyOnWrite();
        byiv byivVar6 = (byiv) byiuVar.instance;
        evvpVarC.getClass();
        byivVar6.i = evvpVarC;
        byivVar6.b |= 64;
        if (!ejwk.c(bppdVar.s())) {
            String strS = bppdVar.s();
            byiuVar.copyOnWrite();
            byiv byivVar7 = (byiv) byiuVar.instance;
            strS.getClass();
            byivVar7.b |= 128;
            byivVar7.j = strS;
        }
        this.b.c((byiv) byiuVar.build());
        return eijx.e(true);
    }

    @Override // defpackage.byfc
    public final boolean d(bppd bppdVar) {
        return bppdVar.o() == 32 || bppdVar.o() == 64;
    }
}
