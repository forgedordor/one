package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmhp {
    public static dqsq a() {
        return new dqry(bmhw.c, "a2p_conversation_subscriptions", new dqrx() { // from class: bmhn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmhw.a;
                numValueOf.getClass();
                if (i == 60410) {
                    bmhw.d(dqsyVar, 60410);
                } else {
                    if (i != 61030) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE a2p_conversation_subscriptions ADD COLUMN conversation_toolstone_last_dismiss_timestamp INTEGER;");
                }
            }
        });
    }
}
