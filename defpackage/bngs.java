package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngs {
    public static dqsq a() {
        return new dqry(bngz.d, "conversation_classifications_table", new dqrx() { // from class: bngq
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bngz.a;
                numValueOf.getClass();
                switch (i) {
                    case 58670:
                        bngz.d(dqsyVar, 58670);
                        break;
                    case 58690:
                        dqsyVar.v("ALTER TABLE conversation_classifications_table ADD COLUMN classification_state INTEGER DEFAULT(0) NOT NULL;");
                        break;
                    case 58790:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
                        dqsyVar.v("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
                        break;
                    case 58840:
                        dqsyVar.v("ALTER TABLE conversation_classifications_table ADD COLUMN impression_count INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_classifications_table ADD COLUMN generated_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 59350:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
                        dqsyVar.v("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
                        break;
                }
            }
        });
    }
}
