package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsqy {
    public static dqsq a() {
        return new dqry(bsrg.c, "pipeline_work", new dqrx() { // from class: bsqw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bsrg.a;
                numValueOf.getClass();
                if (i == 60510) {
                    bsrg.d(dqsyVar, 60510);
                } else {
                    if (i != 60840) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE pipeline_work ADD COLUMN execute_after_timestamp INTEGER;");
                }
            }
        });
    }
}
