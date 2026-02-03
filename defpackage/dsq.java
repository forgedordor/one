package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dzx b;
    final /* synthetic */ dss c;
    final /* synthetic */ dsj d;
    final /* synthetic */ fdlr e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsq(dzx dzxVar, dss dssVar, dsj dsjVar, fdlr fdlrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dzxVar;
        this.c = dssVar;
        this.d = dsjVar;
        this.e = fdlrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsq) c((dyh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dyh dyhVar = (dyh) this.f;
            final dzx dzxVar = this.b;
            final dss dssVar = this.c;
            final dsj dsjVar = this.d;
            dzxVar.e = dssVar.a(dsjVar);
            final fdlr fdlrVar = this.e;
            fdap fdapVar = new fdap() { // from class: dso
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    dss dssVar2 = dssVar;
                    float f = true != dssVar2.c ? -1.0f : 1.0f;
                    dyk dykVar = dssVar2.b;
                    float fC = f * dykVar.c(dykVar.e(dyhVar.b(dykVar.e(dykVar.g(f * fFloatValue)))));
                    if (Math.abs(fC) < Math.abs(fFloatValue)) {
                        fdlw.e(fdlrVar, "Scroll animation cancelled because scroll was not consumed (" + fC + " < " + fFloatValue + ')', null);
                    }
                    return fctx.a;
                }
            };
            fdae fdaeVar = new fdae() { // from class: dsp
                @Override // defpackage.fdae
                public final Object invoke() {
                    dss dssVar2;
                    ihu ihuVarF;
                    while (true) {
                        dssVar2 = dssVar;
                        hum humVar = dssVar2.e.a;
                        int i2 = humVar.b;
                        if (i2 == 0) {
                            break;
                        }
                        if (i2 == 0) {
                            hum.q();
                            throw new fcta();
                        }
                        Object objInvoke = ((dsn) humVar.a[i2 - 1]).a.invoke();
                        if (objInvoke != null && !dssVar2.j((ihu) objInvoke, dssVar2.i)) {
                            break;
                        }
                        ((dsn) humVar.c(humVar.b - 1)).b.w(fctx.a);
                    }
                    if (dssVar2.g && (ihuVarF = dssVar2.f()) != null && dssVar2.j(ihuVarF, dssVar2.i)) {
                        dssVar2.g = false;
                    }
                    dzxVar.e = dssVar2.a(dsjVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dzxVar.a(fdapVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dsq dsqVar = new dsq(this.b, this.c, this.d, this.e, fcxyVar);
        dsqVar.f = obj;
        return dsqVar;
    }
}
