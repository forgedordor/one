package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkc {
    public static dqsq a() {
        return new dqry(btkh.c, "remote_instances", new dqrx() { // from class: btka
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btkh.a;
                numValueOf.getClass();
                switch (i) {
                    case 34010:
                        btkh.d(dqsyVar, 34010);
                        break;
                    case 35040:
                        dqsyVar.v("ALTER TABLE remote_instances ADD COLUMN last_modified_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 38010:
                        dqsyVar.v("ALTER TABLE remote_instances ADD COLUMN identity_key BLOB;");
                        break;
                    case 39040:
                        dqsyVar.v("ALTER TABLE remote_instances ADD COLUMN updated_at_hash INTEGER DEFAULT(0);");
                        break;
                    case 40010:
                        dqsyVar.v("ALTER TABLE remote_instances ADD COLUMN guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 40030:
                        dqsyVar.v("ALTER TABLE remote_instances ADD COLUMN is_updated_at_hash_valid INTEGER DEFAULT(0);");
                        break;
                }
            }
        });
    }
}
