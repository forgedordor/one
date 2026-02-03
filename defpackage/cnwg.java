package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnwg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnwh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnwg(cnwh cnwhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnwhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnwg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnxa cnxaVar = (cnxa) this.b.d.b();
            crqv crqvVar = cnxaVar.e;
            crqvVar.k("last_sync_time_millis", -1L);
            crqvVar.k("last_full_sync_time_millis", -1L);
            eiju eijuVarH = cnxaVar.g.j(new ejvr() { // from class: cnwq
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    cczi ccziVar = cnxa.a;
                    cnwk cnwkVar = (cnwk) ((cnwl) obj2).toBuilder();
                    evvp evvpVarB = evwz.b(cnxa.d);
                    cnwkVar.copyOnWrite();
                    cnwl cnwlVar = (cnwl) cnwkVar.instance;
                    evvpVarB.getClass();
                    cnwlVar.e = evvpVarB;
                    cnwlVar.b |= 4;
                    evvp evvpVarB2 = evwz.b(cnxa.c);
                    cnwkVar.copyOnWrite();
                    cnwl cnwlVar2 = (cnwl) cnwkVar.instance;
                    evvpVarB2.getClass();
                    cnwlVar2.d = evvpVarB2;
                    cnwlVar2.b |= 2;
                    return (cnwl) cnwkVar.build();
                }
            }).h(new ejvr() { // from class: cnwr
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    cczi ccziVar = cnxa.a;
                    return null;
                }
            }, cnxaVar.h);
            this.a = 1;
            if (fdxs.c(eijuVarH, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnwg(this.b, fcxyVar);
    }
}
