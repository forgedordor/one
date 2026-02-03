package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axek {
    public static dqsq a() {
        return new dqry(axer.d, "subscriptions", new dqrx() { // from class: axei
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = axer.a;
                numValueOf.getClass();
                if (i == 59230) {
                    axer.e(dqsyVar, 59230);
                    return;
                }
                if (i == 59450) {
                    dqsyVar.v("ALTER TABLE subscriptions ADD COLUMN my_identity_token TEXT;");
                    dqsyVar.v("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
                } else {
                    if (i != 60160) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE subscriptions ADD COLUMN my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    dqsyVar.v("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(axer.e, true, "subscriptions", new dqrx() { // from class: axeh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = axer.a;
                numValueOf.getClass();
                if (i != 59250) {
                    return;
                }
                dqru.K(dqsyVar, "subscriptions", axer.d(59250, "TEMP___subscriptions"), axer.a, axer.f(59250));
            }
        });
    }
}
