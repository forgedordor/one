package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auat implements asre {
    private final ekgp a;
    private final fcsu b;

    public auat(Map map, fcsu fcsuVar) {
        this.a = ekgp.j(map);
        this.b = fcsuVar;
    }

    private final asre h() {
        enmr enmrVarD = ((cozg) this.b.b()).d();
        fcsu fcsuVar = (fcsu) this.a.get(enmrVarD);
        if (fcsuVar != null) {
            return (asre) fcsuVar.b();
        }
        throw new IllegalStateException("Do not have an OutgoingChatApi implementation registered for ChatTransportType: ".concat(String.valueOf(enmrVarD.name())));
    }

    @Override // defpackage.asre
    public final eiju a(aubd aubdVar) {
        return h().a(aubdVar);
    }

    @Override // defpackage.asre
    public final eiju b(auce auceVar) {
        return h().b(auceVar);
    }

    @Override // defpackage.asre
    public final eiju c(augi augiVar) {
        return h().c(augiVar);
    }

    @Override // defpackage.asre
    public final eiju d(augo augoVar) {
        return h().d(augoVar);
    }

    @Override // defpackage.asre
    public final eiju e(augw augwVar) {
        return h().e(augwVar);
    }

    @Override // defpackage.asre
    public final eiju f(auii auiiVar) {
        return h().f(auiiVar);
    }

    @Override // defpackage.asre
    public final eiju g(auip auipVar) {
        return h().g(auipVar);
    }
}
