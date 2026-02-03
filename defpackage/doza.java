package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doza implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        doyy doyyVar = (doyy) evuhVar;
        doyyVar.getClass();
        if (doyyVar.c == 200) {
            return doys.a;
        }
        doaz doazVar = doyyVar.e;
        if (doazVar == null) {
            doazVar = doaz.a;
        }
        doazVar.getClass();
        return dobc.a(doazVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new doyz();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        doyy doyyVar = (doyy) evsn.parseFrom(doyy.a, evqsVar);
        doyyVar.getClass();
        return doyyVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        doyt doytVar = (doyt) dltdVar;
        doyv doyvVar = (doyv) doyy.a.createBuilder();
        doyvVar.getClass();
        doaz doazVarB = dobc.b(doytVar);
        doyvVar.copyOnWrite();
        doyy doyyVar = (doyy) doyvVar.instance;
        doyyVar.e = doazVarB;
        doyyVar.b |= 1;
        boolean z = doytVar.b instanceof doys;
        if (z && z) {
            doyw doywVar = (doyw) doyx.a.createBuilder();
            doywVar.getClass();
            evsn evsnVarBuild = doywVar.build();
            evsnVarBuild.getClass();
            doyvVar.copyOnWrite();
            doyy doyyVar2 = (doyy) doyvVar.instance;
            doyyVar2.d = (doyx) evsnVarBuild;
            doyyVar2.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        evsn evsnVarBuild2 = doyvVar.build();
        evsnVarBuild2.getClass();
        return (doyy) evsnVarBuild2;
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
        doyz doyzVar = (doyz) dlvwVar;
        doaz doazVar = ((doyy) evuhVar).e;
        if (doazVar == null) {
            doazVar = doaz.a;
        }
        doazVar.getClass();
        dobc.c(doyzVar, doazVar);
        return fctx.a;
    }
}
