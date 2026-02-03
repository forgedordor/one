package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzd implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        dnzb dnzbVar = (dnzb) evuhVar;
        dnzbVar.getClass();
        doaz doazVar = dnzbVar.c;
        if (doazVar == null) {
            doazVar = doaz.a;
        }
        doazVar.getClass();
        return dobc.a(doazVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new dnzc();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        dnzb dnzbVar = (dnzb) evsn.parseFrom(dnzb.a, evqsVar);
        dnzbVar.getClass();
        return dnzbVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        dnza dnzaVar = (dnza) dnzb.a.createBuilder();
        dnzaVar.getClass();
        doaz doazVarB = dobc.b((dnyz) dltdVar);
        dnzaVar.copyOnWrite();
        dnzb dnzbVar = (dnzb) dnzaVar.instance;
        dnzbVar.c = doazVarB;
        dnzbVar.b |= 1;
        evsn evsnVarBuild = dnzaVar.build();
        evsnVarBuild.getClass();
        return (dnzb) evsnVarBuild;
    }

    @Override // defpackage.dlvz
    public final /* synthetic */ Object e(evqs evqsVar, fcxy fcxyVar) {
        return f(c(evqsVar), fcxyVar);
    }

    @Override // defpackage.dlvz
    public final /* synthetic */ Object f(evuh evuhVar, fcxy fcxyVar) {
        return dlvx.b(this, evuhVar, fcxyVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ Object g(dlvw dlvwVar, evuh evuhVar) {
        dnzc dnzcVar = (dnzc) dlvwVar;
        doaz doazVar = ((dnzb) evuhVar).c;
        if (doazVar == null) {
            doazVar = doaz.a;
        }
        doazVar.getClass();
        dobc.c(dnzcVar, doazVar);
        return fctx.a;
    }
}
