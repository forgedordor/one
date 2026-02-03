package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccfp {
    public static dqsq a() {
        return new dqry(ccfu.c, "mls_group_states", new dqrx() { // from class: ccfm
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ccfu.a;
                numValueOf.getClass();
                if (i != 60570) {
                    return;
                }
                ccfu.c(dqsyVar, 60570);
            }
        });
    }

    public static dqsq b() {
        return new dqry(ccfu.d, true, "mls_group_states", new dqrx() { // from class: ccfn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                String strB;
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ccfu.a;
                numValueOf.getClass();
                if (i == 60660) {
                    dqru.J(dqsyVar, "mls_group_states");
                } else if (i == 60670 && (strB = ccfu.b(60670, "TEMP___mls_group_states")) != null) {
                    dqru.K(dqsyVar, "mls_group_states", strB, ccfu.a, ccfu.d());
                }
            }
        });
    }
}
