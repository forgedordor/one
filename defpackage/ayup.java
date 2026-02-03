package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayup {
    public static dqsq a() {
        return new dqry(ayuu.d, "conversation_participants_backup", new dqrx() { // from class: ayum
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ayuu.a;
                numValueOf.getClass();
                if (i != 70) {
                    return;
                }
                dqsyVar.v("ALTER TABLE conversation_participants_backup ADD COLUMN is_c2p_only INT;");
                dqsyVar.v("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
            }
        });
    }

    public static dqsq b() {
        return new dqry(ayuu.e, true, "conversation_participants_backup", new dqrx() { // from class: ayun
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ayuu.a;
                numValueOf.getClass();
                if (i != 90) {
                    return;
                }
                dqru.K(dqsyVar, "conversation_participants_backup", ayuu.e("TEMP___conversation_participants_backup"), ayuu.a, ayuu.f());
            }
        });
    }

    public static dqpo[] c() {
        return ayuu.c.g;
    }
}
