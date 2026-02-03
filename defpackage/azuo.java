package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azuo {
    public static dqsq a() {
        return new dqry(azut.d, "participants_backup", new dqrx() { // from class: azum
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azut.a;
                numValueOf.getClass();
                if (i != 110) {
                    return;
                }
                dqsyVar.v("ALTER TABLE participants_backup ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                dqsyVar.v("CREATE INDEX index_participants_backup_my_identity_token_foreign_key ON participants_backup(my_identity_token_foreign_key);");
            }
        });
    }

    public static dqsq b() {
        return new dqry(azut.e, true, "participants_backup", new dqrx() { // from class: azul
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azut.a;
                numValueOf.getClass();
                if (i != 110) {
                    return;
                }
                dqru.K(dqsyVar, "participants_backup", azut.e("TEMP___participants_backup"), azut.a, azut.f());
            }
        });
    }

    public static dqpo[] c() {
        return azut.c.s;
    }
}
