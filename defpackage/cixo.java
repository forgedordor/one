package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixo implements cixm {
    private final fcsu a;

    public cixo(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.cixm
    public final eiju a() {
        return eiju.g(((egsh) this.a.b()).a("RcsLimboMessagesResolverWorker"));
    }

    @Override // defpackage.cixm
    public final eiju b() {
        egsh egshVar = (egsh) this.a.b();
        cczi ccziVar = cixq.a;
        egsj egsjVarN = egsn.n(cixq.class);
        egsjVarN.g(new egsb("RcsLimboMessagesResolverWorker", pzy.b));
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        egsjVarN.d(pzhVar.a());
        egsjVarN.e(new egrz(new egsa(((Long) cixq.a.e()).longValue(), TimeUnit.HOURS), ejud.a));
        return eiju.g(egshVar.c(egsjVarN.h())).h(new ejvr() { // from class: cixn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
