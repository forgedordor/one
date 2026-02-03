package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzq {
    public static dqsq a() {
        return new dqry(bpzx.d, "messages_annotations", new dqrx() { // from class: bpzn
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpzx.a;
                numValueOf.getClass();
                if (i == 20030) {
                    bpzx.e(dqsyVar, 20030);
                    return;
                }
                if (i == 20040) {
                    dqsyVar.v("ALTER TABLE messages_annotations ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                    dqsyVar.v("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
                } else if (i == 20070) {
                    dqsyVar.v("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
                    dqsyVar.v("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
                } else {
                    if (i != 58530) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
                    dqsyVar.v("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bpzx.e, true, "messages_annotations", new dqrx() { // from class: bpzo
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpzx.a;
                numValueOf.getClass();
                if (i != 57020) {
                    return;
                }
                dqru.K(dqsyVar, "messages_annotations", bpzx.d(57020, "TEMP___messages_annotations"), bpzx.a, bpzx.f(57020));
            }
        });
    }
}
