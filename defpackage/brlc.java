package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brlc {
    public static dqsq a() {
        return new dqry(brlh.c, "p2p_conversation_suggestion_event", new dqrx() { // from class: brkz
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brlh.a;
                numValueOf.getClass();
                switch (i) {
                    case 37000:
                        brlh.e(dqsyVar, 37000);
                        break;
                    case 42030:
                        dqsyVar.v("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN model_output_label TEXT;");
                        break;
                    case 51030:
                        dqsyVar.v("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        break;
                    case 58940:
                        dqsyVar.v("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
                        dqsyVar.v("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
                        break;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(brlh.d, true, "p2p_conversation_suggestion_event", new dqrx() { // from class: brla
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brlh.a;
                numValueOf.getClass();
                if (i != 57010) {
                    return;
                }
                dqru.K(dqsyVar, "p2p_conversation_suggestion_event", brlh.d(57010, "TEMP___p2p_conversation_suggestion_event"), brlh.a, brlh.f(57010));
            }
        });
    }
}
