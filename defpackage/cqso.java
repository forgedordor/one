package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqso implements cqrf {
    private final cqrq a;
    private final cqrd b;

    public cqso(cqrq cqrqVar, cqrd cqrdVar) {
        this.a = cqrqVar;
        this.b = cqrdVar;
    }

    @Override // defpackage.cqrf
    public final double a() {
        return ((Double) cqry.j.e()).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        return this.a.b(this.b.a(new ejvr() { // from class: cqra
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqm cqqmVar = ((cqqr) obj).d;
                if (cqqmVar == null) {
                    cqqmVar = cqqm.a;
                }
                return Long.valueOf(cqqmVar.c);
            }
        }));
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        return (String) cqry.i.e();
    }
}
