package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolr implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        doka dokaVar = (doka) evuhVar;
        dokaVar.getClass();
        if (dokaVar.c == 200) {
            return dqcb.a;
        }
        dokx dokxVar = dokaVar.g;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        dokxVar.getClass();
        return dolw.a(dokxVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new doln();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        doka dokaVar = (doka) evsn.parseFrom(doka.a, evqsVar);
        dokaVar.getClass();
        return dokaVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        dojp dojpVar = (dojp) dltdVar;
        dojx dojxVar = (dojx) doka.a.createBuilder();
        dojxVar.getClass();
        evrj evrjVarA = evxd.a(dojpVar.e);
        dojxVar.copyOnWrite();
        doka dokaVar = (doka) dojxVar.instance;
        dokaVar.e = evrjVarA;
        dokaVar.b |= 1;
        dqbw dqbwVar = dojpVar.f;
        dojxVar.copyOnWrite();
        doka dokaVar2 = (doka) dojxVar.instance;
        dokaVar2.f = dqbwVar;
        dokaVar2.b |= 2;
        dokx dokxVarB = dolw.b(dojpVar);
        dojxVar.copyOnWrite();
        doka dokaVar3 = (doka) dojxVar.instance;
        dokaVar3.g = dokxVarB;
        dokaVar3.b |= 4;
        if (dojpVar.d instanceof dqcb) {
            dojy dojyVar = (dojy) dojz.a.createBuilder();
            dojyVar.getClass();
            evsn evsnVarBuild = dojyVar.build();
            evsnVarBuild.getClass();
            dojxVar.copyOnWrite();
            doka dokaVar4 = (doka) dojxVar.instance;
            dokaVar4.d = (dojz) evsnVarBuild;
            dokaVar4.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        evsn evsnVarBuild2 = dojxVar.build();
        evsnVarBuild2.getClass();
        return (doka) evsnVarBuild2;
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
        doln dolnVar = (doln) dlvwVar;
        doka dokaVar = (doka) evuhVar;
        evrj evrjVar = dokaVar.e;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        evrjVar.getClass();
        dolnVar.i(evxd.c(evrjVar));
        dqbw dqbwVar = dokaVar.f;
        if (dqbwVar == null) {
            dqbwVar = dqbw.a;
        }
        dqbwVar.getClass();
        dolnVar.n(dqbwVar);
        dokx dokxVar = dokaVar.g;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        donb donbVar = dokxVar.g;
        if (donbVar == null) {
            donbVar = donb.a;
        }
        donbVar.getClass();
        donc.c(dolnVar, donbVar, new fdat() { // from class: dolq
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                doln dolnVar2 = (doln) obj;
                dona donaVar = (dona) obj2;
                dolnVar2.getClass();
                donaVar.getClass();
                donc.b(dolnVar2, donaVar);
                return dolnVar2;
            }
        });
        dokx dokxVar2 = dokaVar.g;
        if (dokxVar2 == null) {
            dokxVar2 = dokx.a;
        }
        dltt dlttVar = dokxVar2.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        dltz.d(dolnVar, dlttVar);
        return fctx.a;
    }
}
