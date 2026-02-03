package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckj {
    public static dqsq a() {
        return new dqry(cckr.c, "mls_messages", new dqrx() { // from class: cckg
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cckr.a;
                numValueOf.getClass();
                if (i == 60880) {
                    cckr.e(dqsyVar, 60880);
                } else {
                    if (i != 60960) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE mls_messages ADD COLUMN file_processing_id TEXT;");
                    dqsyVar.v("CREATE INDEX index_mls_messages_file_processing_id ON mls_messages(file_processing_id);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(cckr.d, true, "mls_messages", new dqrx() { // from class: cckh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cckr.a;
                numValueOf.getClass();
                if (i != 60910) {
                    return;
                }
                dqru.K(dqsyVar, "mls_messages", cckr.d(60910, "TEMP___mls_messages"), cckr.a, cckr.f(60910));
            }
        });
    }
}
