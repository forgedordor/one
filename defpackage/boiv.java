package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boiv extends dqsi {
    public static final String[] a = {"conversation_to_participants.conversation_id", "conversation_to_participants.participant_id", "conversation_to_participants.rcs_group_join_status", "conversation_to_participants.last_modified_by_key"};
    public static final ekgp b = new ekgi().c();
    public static final boic c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_id", "index_conversation_to_participants_conversation_id");
        ekgiVar.i("participant_id", "index_conversation_to_participants_participant_id");
        ekgiVar.c();
        c = new boic();
        d = new int[]{59630};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(int i, bohm... bohmVarArr) {
        dqru.B(a(), i, false, new BiConsumer() { // from class: bohe
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String[] strArr = boiv.a;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, bohmVarArr);
    }

    public static dqxa c() {
        return a().M();
    }

    public static void d(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_by_key TEXT");
        sb.insert(0, "CREATE TABLE conversation_to_participants (");
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE PRIMARY KEY (conversation_id,participant_id));");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_to_participants_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_to_participants_conversation_id ON conversation_to_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_to_participants_participant_id");
        arrayList.add("CREATE INDEX index_conversation_to_participants_participant_id ON conversation_to_participants(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
