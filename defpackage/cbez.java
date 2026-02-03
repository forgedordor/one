package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbez {
    public static dqsq a() {
        return new dqry(cbfi.d, "work_queue", new dqrx() { // from class: cbex
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cbfi.a;
                numValueOf.getClass();
                switch (i) {
                    case 39060:
                        cbfi.d(dqsyVar, 39060);
                        break;
                    case 41030:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN queue TEXT;");
                        dqsyVar.v("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
                        break;
                    case 42050:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN deduplication_tag TEXT;");
                        dqsyVar.v("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
                        break;
                    case 45030:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN scheduled_in_workmanager INT;");
                        break;
                    case 46060:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN workmanager_id TEXT;");
                        break;
                    case 46070:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN minimum_start_time INT;");
                        break;
                    case 48020:
                        dqsyVar.v("ALTER TABLE work_queue ADD COLUMN cancellation_tag TEXT;");
                        break;
                    case 58270:
                        dqsyVar.v("DROP INDEX IF EXISTS index_work_queue_type");
                        dqsyVar.v("CREATE INDEX index_work_queue_type ON work_queue(type);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
                        dqsyVar.v("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
                        dqsyVar.v("DROP INDEX IF EXISTS queue_time");
                        dqsyVar.v("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
                        break;
                }
            }
        });
    }
}
