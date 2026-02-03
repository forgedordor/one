package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brmy {
    public static dqsq a() {
        return new dqry(brnk.d, "p2p_suggestions", new dqrx() { // from class: brmw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brnk.a;
                numValueOf.getClass();
                if (i == 42020) {
                    brnk.d(dqsyVar, 42020);
                    return;
                }
                if (i == 53080) {
                    dqsyVar.v("ALTER TABLE p2p_suggestions ADD COLUMN consumption_state INTEGER DEFAULT(1);");
                } else {
                    if (i != 58510) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
                    dqsyVar.v("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
                }
            }
        });
    }
}
