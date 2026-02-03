package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsn implements cqrf {
    private final cqrq a;
    private final cqrd b;

    public cqsn(cqrq cqrqVar, cqrd cqrdVar) {
        this.a = cqrqVar;
        this.b = cqrdVar;
    }

    @Override // defpackage.cqrf
    public final double a() {
        return ((Double) cqry.u.e()).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        return this.a.b(this.b.a(new ejvr() { // from class: cqrc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqq cqqqVar = ((cqqr) obj).e;
                if (cqqqVar == null) {
                    cqqqVar = cqqq.a;
                }
                return Long.valueOf(cqqqVar.c);
            }
        }));
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        return (String) cqry.t.e();
    }
}
