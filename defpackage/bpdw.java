package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpdw {
    public static dqsq a() {
        return new dqry(bped.c, "emergency_questionnaire_option", new dqrx() { // from class: bpdt
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bped.a;
                numValueOf.getClass();
                if (i == 60800) {
                    bped.c(dqsyVar, 60800);
                } else {
                    if (i != 60900) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_emergency_questionnaire_option_message_id");
                    dqsyVar.v("CREATE INDEX index_emergency_questionnaire_option_message_id ON emergency_questionnaire_option(message_id);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bped.d, true, "emergency_questionnaire_option", new dqrx() { // from class: bpdu
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bped.a;
                numValueOf.getClass();
                if (i != 60970) {
                    return;
                }
                dqru.K(dqsyVar, "emergency_questionnaire_option", bped.e("TEMP___emergency_questionnaire_option"), bped.a, bped.d(60970));
            }
        });
    }
}
