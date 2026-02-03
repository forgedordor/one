package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfp {
    public static dqsq a() {
        return new dqry(btfy.c, "recent_gifs", new dqrx() { // from class: btfn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btfy.a;
                numValueOf.getClass();
                if (i == 22010) {
                    btfy.b(dqsyVar, 22010);
                } else {
                    if (i != 58520) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_recent_gifs_last_used_timestamp");
                    dqsyVar.v("CREATE INDEX index_recent_gifs_last_used_timestamp ON recent_gifs(last_used_timestamp);");
                }
            }
        });
    }
}
