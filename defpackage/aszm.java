package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszm implements aszp {
    private final ekgp a;
    private final fcsu b;

    public aszm(fcsu fcsuVar, Map map) {
        this.a = ekgp.j(map);
        this.b = fcsuVar;
    }

    @Override // defpackage.aszp
    public final eiju d(aubq aubqVar) {
        enmr enmrVarD = ((cozg) this.b.b()).d();
        fcsu fcsuVar = (fcsu) this.a.get(enmrVarD);
        enmrVarD.name();
        fcsuVar.getClass();
        return ((aszp) fcsuVar.b()).d(aubqVar);
    }
}
