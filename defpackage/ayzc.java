package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzc {
    public static dqsq a() {
        return new dqry(ayzh.d, "conversations_backup", new dqrx() { // from class: ayyz
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ayzh.a;
                numValueOf.getClass();
                if (i != 110) {
                    return;
                }
                dqsyVar.v("ALTER TABLE conversations_backup ADD COLUMN current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                dqsyVar.v("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
            }
        });
    }

    public static dqsq b() {
        return new dqry(ayzh.e, true, "conversations_backup", new dqrx() { // from class: ayza
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ayzh.a;
                numValueOf.getClass();
                if (i != 110) {
                    return;
                }
                dqru.K(dqsyVar, "conversations_backup", ayzh.e("TEMP___conversations_backup"), ayzh.a, ayzh.f());
            }
        });
    }

    public static dqpo[] c() {
        return ayzh.c.u;
    }
}
