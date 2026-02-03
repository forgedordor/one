package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfdv b;
    final /* synthetic */ ezpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdu(cfdv cfdvVar, ezpp ezppVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfdvVar;
        this.c = ezppVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarF = this.b.a.f();
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ezpo ezpoVar = (ezpo) ezpp.a.createBuilder(this.c);
        cfdv cfdvVar = this.b;
        ezpoVar.copyOnWrite();
        ((ezpp) ezpoVar.instance).e = cfdvVar.b.a;
        evqs evqsVarX = evqs.x((byte[]) obj);
        ezpoVar.copyOnWrite();
        ((ezpp) ezpoVar.instance).f = evqsVarX;
        evsn evsnVarBuild = ezpoVar.build();
        evsnVarBuild.getClass();
        ezit ezitVar = (ezit) eziu.a.createBuilder();
        ezitVar.copyOnWrite();
        eziu eziuVar = (eziu) ezitVar.instance;
        eziuVar.c = (ezpp) evsnVarBuild;
        eziuVar.b |= 1;
        evsn evsnVarBuild2 = ezitVar.build();
        evsnVarBuild2.getClass();
        return evsnVarBuild2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfdu(this.b, this.c, fcxyVar);
    }
}
