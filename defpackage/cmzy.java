package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cmzy extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqdb eqdbVar = (eqdb) obj;
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        evqs evqsVarB = eqdbVar.b();
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubtVar.b |= 2;
        aubtVar.d = evqsVarB;
        aubx aubxVar = (aubx) cnaf.a.fH().fM(eqdbVar.a());
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar2.c = aubxVar;
        aubtVar2.b |= 1;
        return (aubt) aubsVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubt aubtVar = (aubt) obj;
        eqci eqciVar = new eqci();
        if ((aubtVar.b & 1) != 0) {
            ejvj ejvjVar = cnaf.a;
            aubx aubxVar = aubtVar.c;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            eqciVar.c((eqcn) ejvjVar.fM(aubxVar));
        }
        if ((aubtVar.b & 2) != 0) {
            eqciVar.b(aubtVar.d);
        }
        return eqciVar.a();
    }
}
