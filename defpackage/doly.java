package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doly implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        dold doldVar = (dold) evuhVar;
        doldVar.getClass();
        dokx dokxVar = doldVar.d;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        dokxVar.getClass();
        return dolw.a(dokxVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new dolp();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        dold doldVar = (dold) evsn.parseFrom(dold.a, evqsVar);
        doldVar.getClass();
        return doldVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        doju dojuVar = (doju) dltdVar;
        dolc dolcVar = (dolc) dold.a.createBuilder();
        dolcVar.getClass();
        evrj evrjVarA = evxd.a(dojuVar.g);
        dolcVar.copyOnWrite();
        dold doldVar = (dold) dolcVar.instance;
        doldVar.c = evrjVarA;
        doldVar.b |= 1;
        dokx dokxVarB = dolw.b(dojuVar);
        dolcVar.copyOnWrite();
        dold doldVar2 = (dold) dolcVar.instance;
        doldVar2.d = dokxVarB;
        doldVar2.b |= 2;
        evsn evsnVarBuild = dolcVar.build();
        evsnVarBuild.getClass();
        return (dold) evsnVarBuild;
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
        dolp dolpVar = (dolp) dlvwVar;
        dold doldVar = (dold) evuhVar;
        evrj evrjVar = doldVar.c;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        evrjVar.getClass();
        dolpVar.i(evxd.c(evrjVar));
        dokx dokxVar = doldVar.d;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        donb donbVar = dokxVar.g;
        if (donbVar == null) {
            donbVar = donb.a;
        }
        donbVar.getClass();
        donc.c(dolpVar, donbVar, new fdat() { // from class: dolx
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                dolp dolpVar2 = (dolp) obj;
                dona donaVar = (dona) obj2;
                dolpVar2.getClass();
                donaVar.getClass();
                donc.d(dolpVar2, donaVar);
                return dolpVar2;
            }
        });
        dokx dokxVar2 = doldVar.d;
        if (dokxVar2 == null) {
            dokxVar2 = dokx.a;
        }
        dltt dlttVar = dokxVar2.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        dltz.d(dolpVar, dlttVar);
        return fctx.a;
    }
}
