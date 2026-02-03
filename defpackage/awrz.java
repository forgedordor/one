package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awrz {
    public static dqsq a() {
        return new dqry(awse.c, "groups", new dqrx() { // from class: awrx
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = awse.a;
                numValueOf.getClass();
                if (i == 60430) {
                    awse.e(dqsyVar, 60430);
                } else if (i == 60850) {
                    dqsyVar.v("ALTER TABLE groups ADD COLUMN rcs_name_last_change_timestamp INTEGER DEFAULT(0);");
                } else {
                    if (i != 60940) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE groups ADD COLUMN rcs_join_link_url TEXT;");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(awse.d, true, "groups", new dqrx() { // from class: awrw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = awse.a;
                numValueOf.getClass();
                if (i != 60460) {
                    return;
                }
                dqru.K(dqsyVar, "groups", awse.d(60460, "TEMP___groups"), awse.a, awse.g());
            }
        });
    }
}
