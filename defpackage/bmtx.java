package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmtx {
    public static dqsq a() {
        return new dqry(bmua.c, "cms_incremental_events", new dqrx() { // from class: bmtu
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmua.a;
                numValueOf.getClass();
                if (i != 60580) {
                    return;
                }
                bmua.d(dqsyVar);
            }
        });
    }

    public static dqsq b() {
        return new dqry(bmua.d, true, "cms_incremental_events", new dqrx() { // from class: bmtv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmua.a;
                numValueOf.getClass();
                if (i != 60600) {
                    return;
                }
                dqru.r(dqsyVar, "cms_incremental_events");
                dqru.K(dqsyVar, "cms_incremental_events", bmua.b("TEMP___cms_incremental_events"), bmua.a, bmua.c());
            }
        });
    }
}
