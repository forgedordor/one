package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnym extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnym(dnyn dnynVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnynVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnym) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnyn dnynVar = this.b;
            final dneq dneqVar = dnynVar.am;
            if (dneqVar == null) {
                fdbq.c("usageProcessor");
                dneqVar = null;
            }
            fduf fdufVar = dnynVar.ap;
            final dnce dnceVar = dpil.aK;
            dnceVar.getClass();
            fdua fduaVar = new fdua(fdufVar, new dnyl((fdpl) dneqVar.e.d("EntityUsageProcessor#observeFrecency", new fdae() { // from class: dneg
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdue fdueVarE = fdun.e(1, 0, 0, 6);
                    dnce dnceVar2 = dnceVar;
                    dneq dneqVar2 = dneqVar;
                    fdil.d(dneqVar2.b, null, null, new dnen(dneqVar2, fdueVarE, dnceVar2, null), 3);
                    return fdueVarE;
                }
            }), dnynVar), new dnyh(null));
            dnyi dnyiVar = new dnyi(dnynVar, null);
            this.a = 1;
            if (fdpy.b(fduaVar, dnyiVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnym(this.b, fcxyVar);
    }
}
