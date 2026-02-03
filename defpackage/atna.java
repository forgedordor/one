package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atna {
    private final cogw a;
    private final fcsu b;

    public atna(cogw cogwVar, fcsu fcsuVar) {
        cogwVar.getClass();
        fcsuVar.getClass();
        this.a = cogwVar;
        this.b = fcsuVar;
    }

    public final boolean a(aucl auclVar) {
        aucj aucjVar = auclVar.c;
        if (aucjVar == null) {
            aucjVar = aucj.a;
        }
        aucj aucjVar2 = aucj.a;
        if (aucjVar.equals(aucjVar2)) {
            return false;
        }
        Instant instantF = this.a.f();
        aucj aucjVar3 = auclVar.c;
        if (aucjVar3 != null) {
            aucjVar2 = aucjVar3;
        }
        evvp evvpVar = aucjVar2.g;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        evvpVar.getClass();
        Duration durationBetween = Duration.between(instantF, evxd.d(evvpVar));
        Object objB = this.b.b();
        objB.getClass();
        return evxd.c((evrj) objB).compareTo(durationBetween) <= 0;
    }
}
