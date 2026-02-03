package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxa {
    public static dqsq a() {
        return new dqry(awxh.d, "my_identities", new dqrx() { // from class: awwy
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = awxh.a;
                numValueOf.getClass();
                switch (i) {
                    case 59450:
                        awxh.d(dqsyVar, 59450);
                        break;
                    case 59980:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN address_type INT;");
                        break;
                    case 59990:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN provisioning_id TEXT;");
                        break;
                    case 60120:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN display_name TEXT;");
                        break;
                    case 60320:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN is_verified INT DEFAULT(0) NOT NULL;");
                        break;
                    case 60530:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN canonical_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_my_identities_canonical_token ON my_identities(canonical_token);");
                        break;
                    case 60810:
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN provisioning_id_v2 TEXT;");
                        dqsyVar.v("ALTER TABLE my_identities ADD COLUMN is_verified_v2 INT DEFAULT(0) NOT NULL;");
                        break;
                }
            }
        });
    }

    public static dqpo[] b() {
        return awxh.c.h;
    }
}
