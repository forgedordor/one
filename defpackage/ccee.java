package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccee {
    public static dqsq a() {
        return new dqry(ccen.c, "mls_epoch_records", new dqrx() { // from class: cceb
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ccen.a;
                numValueOf.getClass();
                if (i != 60620) {
                    return;
                }
                ccen.c(dqsyVar, 60620);
            }
        });
    }

    public static dqsq b() {
        return new dqry(ccen.d, true, "mls_epoch_records", new dqrx() { // from class: ccec
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                String strB;
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ccen.a;
                numValueOf.getClass();
                if (i == 60660) {
                    dqru.J(dqsyVar, "mls_epoch_records");
                } else if (i == 60670 && (strB = ccen.b(60670, "TEMP___mls_epoch_records")) != null) {
                    dqru.K(dqsyVar, "mls_epoch_records", strB, ccen.a, ccen.d());
                }
            }
        });
    }
}
