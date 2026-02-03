package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolt implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        dokc dokcVar = (dokc) evuhVar;
        dokcVar.getClass();
        dokx dokxVar = dokcVar.c;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        dokxVar.getClass();
        return dolw.a(dokxVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new dolo();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        dokc dokcVar = (dokc) evsn.parseFrom(dokc.a, evqsVar);
        dokcVar.getClass();
        return dokcVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        dokb dokbVar = (dokb) dokc.a.createBuilder();
        dokbVar.getClass();
        dokx dokxVarB = dolw.b((dojr) dltdVar);
        dokbVar.copyOnWrite();
        dokc dokcVar = (dokc) dokbVar.instance;
        dokcVar.c = dokxVarB;
        dokcVar.b |= 1;
        evsn evsnVarBuild = dokbVar.build();
        evsnVarBuild.getClass();
        return (dokc) evsnVarBuild;
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
        dolo doloVar = (dolo) dlvwVar;
        dokc dokcVar = (dokc) evuhVar;
        dokx dokxVar = dokcVar.c;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        donb donbVar = dokxVar.g;
        if (donbVar == null) {
            donbVar = donb.a;
        }
        donbVar.getClass();
        donc.c(doloVar, donbVar, new fdat() { // from class: dols
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                dolo doloVar2 = (dolo) obj;
                dona donaVar = (dona) obj2;
                doloVar2.getClass();
                donaVar.getClass();
                donc.d(doloVar2, donaVar);
                return doloVar2;
            }
        });
        dokx dokxVar2 = dokcVar.c;
        if (dokxVar2 == null) {
            dokxVar2 = dokx.a;
        }
        dltt dlttVar = dokxVar2.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        dltz.d(doloVar, dlttVar);
        return fctx.a;
    }
}
