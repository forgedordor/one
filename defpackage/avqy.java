package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqy {
    public static dqsq a() {
        return new dqry(avrd.c, "conversation_matcher_cache", new dqrx() { // from class: avqv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = avrd.a;
                numValueOf.getClass();
                if (i == 58580) {
                    avrd.b(dqsyVar, 58580);
                } else {
                    if (i != 59180) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
                    dqsyVar.v("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(avrd.d, true, "conversation_matcher_cache", new dqrx() { // from class: avqw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = avrd.a;
                numValueOf.getClass();
                if (i != 58640) {
                    return;
                }
                dqru.r(dqsyVar, "conversation_matcher_cache");
                dqru.K(dqsyVar, "conversation_matcher_cache", avrd.d("TEMP___conversation_matcher_cache"), avrd.a, avrd.c(58640));
            }
        });
    }
}
