package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqid {
    public static dqsq a() {
        return new dqry(bqik.c, "message_photos_sharing", new dqrx() { // from class: bqib
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqik.a;
                numValueOf.getClass();
                if (i == 58320) {
                    bqik.b(dqsyVar, 58320);
                } else {
                    if (i != 58610) {
                        return;
                    }
                    if (dqru.a(bqik.a()) < 58610) {
                        throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
                    dqsyVar.v("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
                }
            }
        });
    }
}
