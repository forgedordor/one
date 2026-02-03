package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmkg {
    public static dqsq a() {
        return new dqry(bmkn.d, "backup_id_map", new dqrx() { // from class: bmke
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmkn.a;
                numValueOf.getClass();
                if (i == 60020) {
                    bmkn.b(dqsyVar, 60020);
                } else {
                    if (i != 60040) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_backup_id_map_bugle_id");
                    dqsyVar.v("CREATE INDEX index_backup_id_map_bugle_id ON backup_id_map(bugle_id);");
                }
            }
        });
    }
}
