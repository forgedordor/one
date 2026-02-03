package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjpi extends fcyz implements fdat {
    final /* synthetic */ cjpj a;
    final /* synthetic */ dggn b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjpi(cjpj cjpjVar, int i, dggn dggnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjpjVar;
        this.c = i;
        this.b = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjpi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        enyi enyiVar = (enyi) enys.a.createBuilder();
        enyiVar.getClass();
        enyt.c(this.c, enyiVar);
        dggn dggnVar = this.b;
        dggp dggpVarA = dggo.a(dggnVar);
        cjpj cjpjVar = this.a;
        cmmh cmmhVar = (cmmh) fdct.b(((cmlb) cjpjVar.a.b()).j(dggnVar));
        enyp enypVar = (enyp) enyr.a.createBuilder();
        String str = dggpVarA.a;
        enypVar.copyOnWrite();
        enyr enyrVar = (enyr) enypVar.instance;
        enyrVar.b |= 1;
        enyrVar.c = str.length();
        if (cmmhVar != null) {
            String str2 = cmmhVar.p;
            enypVar.copyOnWrite();
            enyr enyrVar2 = (enyr) enypVar.instance;
            str2.getClass();
            enyrVar2.b = 2 | enyrVar2.b;
            enyrVar2.d = str2;
            int i = cmmhVar.d;
            enypVar.copyOnWrite();
            enyr enyrVar3 = (enyr) enypVar.instance;
            enyrVar3.b |= 4;
            enyrVar3.e = i;
            enypVar.copyOnWrite();
            enyr enyrVar4 = (enyr) enypVar.instance;
            enyrVar4.f = 1;
            enyrVar4.b |= 16;
        } else {
            fcsu fcsuVar = cjpjVar.b;
            if (fdbq.f(((dhes) fcsuVar.b()).l(), str)) {
                int iB = ((dhes) fcsuVar.b()).b();
                enypVar.copyOnWrite();
                enyr enyrVar5 = (enyr) enypVar.instance;
                enyrVar5.b |= 4;
                enyrVar5.e = iB;
                enypVar.copyOnWrite();
                enyr enyrVar6 = (enyr) enypVar.instance;
                enyrVar6.f = 2;
                enyrVar6.b |= 16;
            }
        }
        evsn evsnVarBuild = enypVar.build();
        evsnVarBuild.getClass();
        enyiVar.copyOnWrite();
        enys enysVar = (enys) enyiVar.instance;
        enysVar.d = (enyr) evsnVarBuild;
        enysVar.b |= 4;
        cjpjVar.c(enyt.a(enyiVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjpi(this.a, this.c, this.b, fcxyVar);
    }
}
