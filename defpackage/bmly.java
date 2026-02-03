package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmly {
    public static dqsq a() {
        return new dqry(bmmf.d, "business_conversations_metadata", new dqrx() { // from class: bmlw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmmf.a;
                numValueOf.getClass();
                if (i == 58070) {
                    bmmf.d(dqsyVar, 58070);
                    return;
                }
                if (i == 59010) {
                    dqsyVar.v("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_stop_state INTEGER;");
                } else {
                    if (i != 59050) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_state INTEGER;");
                    dqsyVar.v("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_timestamp_ms INTEGER;");
                }
            }
        });
    }
}
