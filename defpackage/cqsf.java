package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsf implements cqrf {
    private final cqrq a;
    private final cqrd b;

    public cqsf(cqrq cqrqVar, cqrd cqrdVar) {
        this.a = cqrqVar;
        this.b = cqrdVar;
    }

    @Override // defpackage.cqrf
    public final double a() {
        return ((Double) cqry.h.e()).doubleValue();
    }

    @Override // defpackage.cqrf
    public final eiju b() {
        return this.a.b(this.b.a(new ejvr() { // from class: cqqw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqk cqqkVar = ((cqqr) obj).c;
                if (cqqkVar == null) {
                    cqqkVar = cqqk.a;
                }
                return Long.valueOf(cqqkVar.c);
            }
        }));
    }

    @Override // defpackage.cqrg
    public final elup c() {
        return elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.cqrf
    public final String d() {
        return (String) cqry.g.e();
    }
}
