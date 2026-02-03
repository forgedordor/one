package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpnt {
    public static dqsq a() {
        return new dqry(bpoa.c, "gemini_conversation_id_mappings", new dqrx() { // from class: bpnr
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpoa.a;
                numValueOf.getClass();
                if (i == 60010) {
                    bpoa.b(dqsyVar, 60010);
                } else {
                    if (i != 60090) {
                        return;
                    }
                    if (dqru.a(bpoa.a()) < 60090) {
                        throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_gemini_conversation_id_mappings_gemini_conversation_id");
                    dqsyVar.v("CREATE UNIQUE INDEX index_gemini_conversation_id_mappings_gemini_conversation_id ON gemini_conversation_id_mappings(gemini_conversation_id);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bpoa.d, true, "gemini_conversation_id_mappings", new dqrx() { // from class: bpnq
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpoa.a;
                numValueOf.getClass();
                if (i != 60140) {
                    return;
                }
                dqru.K(dqsyVar, "gemini_conversation_id_mappings", bpoa.d("TEMP___gemini_conversation_id_mappings"), bpoa.a, bpoa.c(60140));
            }
        });
    }
}
