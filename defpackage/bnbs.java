package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnbs {
    public static dqsq a() {
        return new dqry(bncb.d, "cms", new dqrx() { // from class: bnbq
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bncb.a;
                numValueOf.getClass();
                if (i == 32030) {
                    bncb.d(dqsyVar, 32030);
                    return;
                }
                if (i == 35020) {
                    dqsyVar.v("ALTER TABLE cms ADD COLUMN cms_id TEXT;");
                    dqsyVar.v("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
                } else {
                    if (i != 42060) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE cms ADD COLUMN cms_correlation_id TEXT;");
                    dqsyVar.v("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
                }
            }
        });
    }
}
