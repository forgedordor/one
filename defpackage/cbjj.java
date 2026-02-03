package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjj {
    public static dqsq a() {
        return new dqry(cbjq.d, "work_queue_work_manager_ids", new dqrx() { // from class: cbjh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cbjq.a;
                numValueOf.getClass();
                if (i == 59330) {
                    cbjq.b(dqsyVar, 59330);
                } else {
                    if (i != 59400) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_work_queue_work_manager_ids_workmanager_id");
                    dqsyVar.v("CREATE INDEX index_work_queue_work_manager_ids_workmanager_id ON work_queue_work_manager_ids(workmanager_id) WHERE workmanager_id IS NULL;");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(cbjq.e, true, "work_queue_work_manager_ids", new dqrx() { // from class: cbjg
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cbjq.a;
                numValueOf.getClass();
                if (i != 59390) {
                    return;
                }
                dqru.K(dqsyVar, "work_queue_work_manager_ids", cbjq.e("TEMP___work_queue_work_manager_ids"), cbjq.a, cbjq.c(59390));
            }
        });
    }
}
