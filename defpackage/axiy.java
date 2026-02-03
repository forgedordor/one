package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axiy extends cmwg {
    static final cczv a = cdag.f(cdag.b, "janitor_job_min_interval_millis", TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS));
    public final fcsu b;
    public final axim c;
    public final diep d;

    public axiy(fcsu fcsuVar, axim aximVar, diep diepVar) {
        this.b = fcsuVar;
        this.c = aximVar;
        this.d = diepVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("JanitorJobStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        eiju eijuVarH = ((cmfo) this.c.a.get()).h();
        ejvr ejvrVar = new ejvr() { // from class: axik
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((bxks) obj).c);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarH.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: axix
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                long jLongValue = ((Long) axiy.a.e()).longValue();
                axiy axiyVar = this.a;
                final long epochMilli = axiyVar.d.f().toEpochMilli();
                if (l != null && l.longValue() != 0 && epochMilli < l.longValue() + jLongValue) {
                    return null;
                }
                ((cmfo) axiyVar.c.a.get()).j(new ejvr() { // from class: axig
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bxkr bxkrVar = (bxkr) ((bxks) obj2).toBuilder();
                        bxkrVar.copyOnWrite();
                        bxks bxksVar = (bxks) bxkrVar.instance;
                        bxksVar.b |= 1;
                        bxksVar.c = epochMilli;
                        return (bxks) bxkrVar.build();
                    }
                }).h(new ejvr() { // from class: axih
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoqg.a);
                fcsu fcsuVar = axiyVar.b;
                ((cazj) ((cawf) fcsuVar.b()).a.b()).f("run_analyze");
                ((cazj) ((cawf) fcsuVar.b()).a.b()).a(cbcu.f("run_analyze", caxy.a));
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
