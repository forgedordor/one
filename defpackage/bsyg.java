package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyg {
    public static dqsq a() {
        return new dqry(bsyn.c, "rbm_business_info", new dqrx() { // from class: bsye
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bsyn.a;
                numValueOf.getClass();
                if (i == 49030) {
                    bsyn.g(dqsyVar, 49030);
                } else {
                    if (i != 59140) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE rbm_business_info ADD COLUMN agent_use_case_category INT DEFAULT(0);");
                }
            }
        });
    }
}
