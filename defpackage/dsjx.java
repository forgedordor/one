package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsjx extends dshw {
    static final ejvr a = new dsjv();
    static final ejvr b = new dsjb();
    static final ejvj c = new dsjg();

    @Override // defpackage.dshw
    public final void a(evkx evkxVar, etol etolVar) {
        evkr evkrVar = evkxVar.j;
        if (evkrVar == null) {
            evkrVar = evkr.a;
        }
        for (String str : evkrVar.b) {
            etmf etmfVar = (etmf) etmi.a.createBuilder();
            etge etgeVar = (etge) etgf.a.createBuilder();
            etgeVar.copyOnWrite();
            etgf etgfVar = (etgf) etgeVar.instance;
            str.getClass();
            etgfVar.c = 4;
            etgfVar.d = str;
            etmfVar.copyOnWrite();
            etmi etmiVar = (etmi) etmfVar.instance;
            etgf etgfVar2 = (etgf) etgeVar.build();
            etgfVar2.getClass();
            etmiVar.c = etgfVar2;
            etmiVar.b |= 1;
            etmfVar.copyOnWrite();
            etmi etmiVar2 = (etmi) etmfVar.instance;
            etmiVar2.d = 2;
            etmiVar2.b |= 2;
            etolVar.a(etmfVar);
        }
        evkr evkrVar2 = evkxVar.j;
        if (evkrVar2 == null) {
            evkrVar2 = evkr.a;
        }
        for (String str2 : evkrVar2.c) {
            etmf etmfVar2 = (etmf) etmi.a.createBuilder();
            etge etgeVar2 = (etge) etgf.a.createBuilder();
            etgeVar2.copyOnWrite();
            etgf etgfVar3 = (etgf) etgeVar2.instance;
            str2.getClass();
            etgfVar3.c = 4;
            etgfVar3.d = str2;
            etmfVar2.copyOnWrite();
            etmi etmiVar3 = (etmi) etmfVar2.instance;
            etgf etgfVar4 = (etgf) etgeVar2.build();
            etgfVar4.getClass();
            etmiVar3.c = etgfVar4;
            etmiVar3.b |= 1;
            etmfVar2.copyOnWrite();
            etmi etmiVar4 = (etmi) etmfVar2.instance;
            etmiVar4.d = 1;
            etmiVar4.b |= 2;
            etolVar.a(etmfVar2);
        }
    }

    @Override // defpackage.dshw
    public final void b(evkx evkxVar, etol etolVar) {
        etmu etmuVar = (etmu) etmv.a.createBuilder();
        ejvr ejvrVar = b;
        evkn evknVarB = evkn.b(evkxVar.c);
        if (evknVarB == null) {
            evknVarB = evkn.CONNECTIVITY_STATE_UNSPECIFIED;
        }
        Object objApply = ejvrVar.apply(evknVarB);
        etmuVar.copyOnWrite();
        etmv etmvVar = (etmv) etmuVar.instance;
        etmvVar.c = ((etgo) objApply).a();
        etmvVar.b |= 1;
        etolVar.copyOnWrite();
        etom etomVar = (etom) etolVar.instance;
        etmv etmvVar2 = (etmv) etmuVar.build();
        etom etomVar2 = etom.a;
        etmvVar2.getClass();
        etomVar.c = etmvVar2;
        etomVar.b |= 1;
    }
}
