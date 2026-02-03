package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfok implements cfmz {
    public final cehg a;
    public final fcsu b;

    public cfok(cehg cehgVar, fcsu fcsuVar) {
        this.a = cehgVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju b(final cfmy cfmyVar, final evuh evuhVar) {
        return eijx.g(new Callable() { // from class: cfnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cfok cfokVar = this.c;
                boolean zA = ((cdio) cfokVar.b.b()).a();
                cfmy cfmyVar2 = cfmyVar;
                ezol ezolVar = zA ? ((cfjg) cfmyVar2).c.d : ((cfjg) cfmyVar2).b;
                eoxe eoxeVar = ((cfjg) cfmyVar2).a;
                epby epbyVarB = epby.b(eoxeVar.c);
                if (epbyVarB == null) {
                    epbyVarB = epby.UNRECOGNIZED;
                }
                cqca.o("BugleNetwork", "Unexpected ditto request type: %s %s", epbyVarB, cfokVar.a.B(eoxeVar.b, ezolVar));
                return epfe.a;
            }
        }, ((cfjg) cfmyVar).d);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ evuh c(evqs evqsVar) {
        return epfe.a;
    }
}
