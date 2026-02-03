package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpmj {
    public static dqsq a() {
        return new dqry(bpmq.c, "flagged_messages", new dqrx() { // from class: bpmh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpmq.a;
                numValueOf.getClass();
                switch (i) {
                    case 39010:
                        bpmq.d(dqsyVar, 39010);
                        break;
                    case 39030:
                        dqsyVar.v("ALTER TABLE flagged_messages ADD COLUMN flagged_message_timestamp INT;");
                        break;
                    case 46030:
                        dqsyVar.v("ALTER TABLE flagged_messages ADD COLUMN flagged_message_notified INT DEFAULT(0);");
                        break;
                    case 60710:
                        dqsyVar.v("ALTER TABLE flagged_messages ADD COLUMN flagged_message_delay INT DEFAULT(0);");
                        break;
                }
            }
        });
    }
}
