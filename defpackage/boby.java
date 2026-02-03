package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boby {
    public static dqsq a() {
        return new dqry(bocg.d, "conversation_participants", new dqrx() { // from class: bobv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bocg.a;
                numValueOf.getClass();
                switch (i) {
                    case 58090:
                        dqsyVar.v("ALTER TABLE conversation_participants ADD COLUMN is_normalized INT DEFAULT(0);");
                        break;
                    case 58460:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
                        dqsyVar.v("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
                        break;
                    case 58570:
                        dqsyVar.v("ALTER TABLE conversation_participants ADD COLUMN rcs_group_join_status INT DEFAULT(0);");
                        break;
                    case 59440:
                        dqsyVar.v("ALTER TABLE conversation_participants ADD COLUMN last_modified_by_key TEXT;");
                        break;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bocg.e, true, "conversation_participants", new dqrx() { // from class: bobw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bocg.a;
                numValueOf.getClass();
                if (i != 58600) {
                    return;
                }
                dqru.K(dqsyVar, "conversation_participants", bocg.e(58600, "TEMP___conversation_participants"), bocg.a, bocg.h());
            }
        });
    }

    public static dqpo[] c() {
        return bocg.c.g;
    }
}
