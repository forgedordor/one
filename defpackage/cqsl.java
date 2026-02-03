package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsl implements cqrf {
    private final cqrq a;
    private final cqrd b;

    public cqsl(cqrq cqrqVar, cqrd cqrdVar) {
        this.a = cqrqVar;
        this.b = cqrdVar;
    }

    @Override // defpackage.cqrf
    public final double a() {
        return ((Double) cqry.l.e()).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        return this.a.b(this.b.a(new ejvr() { // from class: cqrb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqm cqqmVar = ((cqqr) obj).d;
                if (cqqmVar == null) {
                    cqqmVar = cqqm.a;
                }
                return Long.valueOf(cqqmVar.d);
            }
        }));
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        return (String) cqry.k.e();
    }
}
