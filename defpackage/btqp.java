package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqp {
    public static dqsq a() {
        return new dqry(btqy.d, "restore_workflow_executions", new dqrx() { // from class: btqn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btqy.a;
                numValueOf.getClass();
                switch (i) {
                    case 60040:
                        btqy.d(dqsyVar, 60040);
                        break;
                    case 60110:
                        dqsyVar.v("ALTER TABLE restore_workflow_executions ADD COLUMN initial_messages_version INTEGER;");
                        break;
                    case 60220:
                        dqsyVar.v("ALTER TABLE restore_workflow_executions ADD COLUMN status_timestamp INTEGER;");
                        break;
                    case 60330:
                        dqsyVar.v("ALTER TABLE restore_workflow_executions ADD COLUMN last_attachment_request_timestamp INTEGER;");
                        break;
                    case 60730:
                        dqsyVar.v("ALTER TABLE restore_workflow_executions ADD COLUMN config BLOB;");
                        break;
                    case 60760:
                        dqsyVar.v("ALTER TABLE restore_workflow_executions ADD COLUMN cleaned_up INTEGER;");
                        break;
                }
            }
        });
    }
}
