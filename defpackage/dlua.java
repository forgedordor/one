package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlua implements dlwd, dlvz {
    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dltc a(evuh evuhVar) {
        dltw dltwVar = (dltw) evuhVar;
        dltwVar.getClass();
        dltt dlttVar = dltwVar.c;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        return dltz.a(dlttVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new dltx();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        dltw dltwVar = (dltw) evsn.parseFrom(dltw.a, evqsVar);
        dltwVar.getClass();
        return dltwVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        dltv dltvVar = (dltv) dltw.a.createBuilder();
        dltvVar.getClass();
        dltt dlttVarB = dltz.b((dlto) dltdVar);
        dltvVar.copyOnWrite();
        dltw dltwVar = (dltw) dltvVar.instance;
        dltwVar.c = dlttVarB;
        dltwVar.b |= 1;
        evsn evsnVarBuild = dltvVar.build();
        evsnVarBuild.getClass();
        return (dltw) evsnVarBuild;
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
        dltx dltxVar = (dltx) dlvwVar;
        dltt dlttVar = ((dltw) evuhVar).c;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        dltz.d(dltxVar, dlttVar);
        return fctx.a;
    }
}
