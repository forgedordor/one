package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btdx {
    public static dqsq a() {
        return new dqry(btee.c, "recent_expressive_stickers", new dqrx() { // from class: btdv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btee.a;
                numValueOf.getClass();
                if (i == 22050) {
                    btee.b(dqsyVar, 22050);
                } else {
                    if (i != 58440) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_recent_expressive_stickers_last_used_timestamp");
                    dqsyVar.v("CREATE INDEX index_recent_expressive_stickers_last_used_timestamp ON recent_expressive_stickers(last_used_timestamp);");
                }
            }
        });
    }
}
