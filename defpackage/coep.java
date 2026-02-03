package defpackage;

import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coep implements coek {
    private final egsh a;

    public coep(egsh egshVar) {
        this.a = egshVar;
    }

    @Override // defpackage.coek
    public final eiju a() {
        if (!((Boolean) coem.a.e()).booleanValue()) {
            return eijx.e(Optional.empty());
        }
        egsh egshVar = this.a;
        egsj egsjVarN = egsn.n(coem.class);
        egsjVarN.g(new egsb("UniqueKeyGarbageCollectorTikTokWork", pzy.b));
        egsjVarN.e(new egrz(new egsa(1L, TimeUnit.DAYS), ejud.a));
        return eiju.g(egshVar.c(egsjVarN.h())).h(new ejvr() { // from class: coeo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.of((UUID) obj);
            }
        }, eoqg.a);
    }
}
