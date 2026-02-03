package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsi implements cqrf {
    private final cqrq a;
    private final cqrd b;

    public cqsi(cqrq cqrqVar, cqrd cqrdVar) {
        cqrqVar.getClass();
        cqrdVar.getClass();
        this.a = cqrqVar;
        this.b = cqrdVar;
    }

    @Override // defpackage.cqrf
    public final double a() {
        Object objE = cqry.y.e();
        objE.getClass();
        return ((Number) objE).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        eiju eijuVarA = this.b.a(new ejvr() { // from class: cqqy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqo cqqoVar = ((cqqr) obj).f;
                if (cqqoVar == null) {
                    cqqoVar = cqqo.a;
                }
                evvp evvpVar = cqqoVar.c;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return evwz.d(evvpVar);
            }
        });
        Object objE = cqry.z.e();
        objE.getClass();
        final Duration durationOfDays = Duration.ofDays(((Number) objE).longValue());
        final cqrq cqrqVar = this.a;
        return eijuVarA.h(new ejvr() { // from class: cqrp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(cqrqVar.c.f().minus(durationOfDays).isBefore((Instant) obj));
            }
        }, cqrqVar.g);
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.HAPPINESS_TRACKING_MODE_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        Object objE = cqry.x.e();
        objE.getClass();
        return (String) objE;
    }
}
