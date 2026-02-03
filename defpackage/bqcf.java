package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcf {
    public static dqsq a() {
        return new dqry(bqcn.d, "message_classifications_table", new dqrx() { // from class: bqcd
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqcn.a;
                numValueOf.getClass();
                if (i == 58400) {
                    bqcn.d(dqsyVar, 58400);
                    return;
                }
                if (i == 58480) {
                    dqsyVar.v("ALTER TABLE message_classifications_table ADD COLUMN classification_details BLOB;");
                } else {
                    if (i != 59350) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
                    dqsyVar.v("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
                }
            }
        });
    }
}
