package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpqw {
    public static dqsq a() {
        return new dqry(bprf.d, "generic_worker_queue", new dqrx() { // from class: bpqu
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bprf.a;
                numValueOf.getClass();
                switch (i) {
                    case 24000:
                        bprf.d(dqsyVar, 24000);
                        break;
                    case 32000:
                        dqsyVar.v("ALTER TABLE generic_worker_queue ADD COLUMN flags INTEGER DEFAULT(0);");
                        break;
                    case 34000:
                        dqsyVar.v("ALTER TABLE generic_worker_queue ADD COLUMN next_execute_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 39020:
                        dqsyVar.v("ALTER TABLE generic_worker_queue ADD COLUMN account_id INTEGER DEFAULT(-1);");
                        break;
                    case 58340:
                        dqsyVar.v("DROP INDEX IF EXISTS index_generic_worker_queue_next_execute_timestamp");
                        dqsyVar.v("CREATE INDEX index_generic_worker_queue_next_execute_timestamp ON generic_worker_queue(next_execute_timestamp);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_multi_column_index");
                        dqsyVar.v("CREATE INDEX index_multi_column_index ON generic_worker_queue(in_flight, retry_count, item_id, item_table_type, next_execute_timestamp);");
                        break;
                    case 59700:
                        dqsyVar.v("ALTER TABLE generic_worker_queue ADD COLUMN trigger_name TEXT;");
                        break;
                    case 59970:
                        dqsyVar.v("ALTER TABLE generic_worker_queue ADD COLUMN enqueued_timestamp INTEGER DEFAULT(0);");
                        break;
                }
            }
        });
    }
}
