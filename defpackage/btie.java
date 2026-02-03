package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btie {
    public static dqsq a() {
        return new dqry(btin.d, "reminders", new dqrx() { // from class: btic
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btin.a;
                numValueOf.getClass();
                if (i == 33070) {
                    btin.f(dqsyVar, 33070);
                    return;
                }
                if (i == 35070) {
                    dqsyVar.v("ALTER TABLE reminders ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ;");
                } else {
                    if (i != 58470) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_reminders_conversation_id");
                    dqsyVar.v("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
                    dqsyVar.v("DROP INDEX IF EXISTS index_reminders_trigger_time");
                    dqsyVar.v("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
                }
            }
        });
    }
}
