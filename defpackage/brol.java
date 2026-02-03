package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brol {
    public static dqsq a() {
        return new dqry(bros.d, "parent_disallowed_conversations", new dqrx() { // from class: broj
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bros.a;
                numValueOf.getClass();
                if (i == 59780) {
                    bros.d(dqsyVar, 59780);
                } else {
                    if (i != 60790) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE parent_disallowed_conversations ADD COLUMN conversation_parent_supervision_state INTEGER DEFAULT(0);");
                }
            }
        });
    }
}
