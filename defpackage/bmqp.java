package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmqp {
    public static dqsq a() {
        return new dqry(bmqy.d, "cms_dead_letter_queue", new dqrx() { // from class: bmqn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmqy.a;
                numValueOf.getClass();
                switch (i) {
                    case 51040:
                        bmqy.d(dqsyVar, 51040);
                        break;
                    case 57090:
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_table_type INTEGER DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_id INTEGER DEFAULT('-1');");
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN cms_backup_parameters BLOB;");
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_flags INTEGER;");
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_table_type INTEGER DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_bugle_id INTEGER DEFAULT('-1');");
                        break;
                    case 58050:
                        dqsyVar.v("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
                        dqsyVar.v("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
                        dqsyVar.v("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
                        break;
                    case 58300:
                        dqsyVar.v("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
                        dqsyVar.v("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
                        break;
                }
            }
        });
    }
}
