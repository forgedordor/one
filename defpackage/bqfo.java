package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfo extends dqsi {
    public static final String[] a = {"message_edits.message_id", "message_edits.latest_message_id", "message_edits.original_rcs_message_id", "message_edits.edited_at_timestamp_ms", "message_edits.received_at_timestamp_ms"};
    public static final ekgp b = new ekgi().c();
    public static final bqeu c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_message_edits_message_id");
        ekgiVar.i("latest_message_id", "index_message_edits_latest_message_id");
        ekgiVar.i("original_rcs_message_id", "index_message_edits_original_rcs_message_id");
        ekgiVar.c();
        c = new bqeu();
        d = new int[]{59860};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static Optional b(MessageIdType messageIdType) {
        bqfj bqfjVar = new bqfj(a);
        bqfjVar.A("message_edits.queryOnMessageId");
        bqfjVar.q();
        bqfn bqfnVar = new bqfn();
        bqfnVar.ap(new dqpj("message_edits.message_id", 1, Long.valueOf(bary.a(messageIdType))));
        bqfjVar.k(new bqfm(bqfnVar));
        return Optional.ofNullable((bqec) dqru.c(bqfjVar.b()));
    }

    public static dqxa c() {
        return a().M();
    }

    public static void d(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("edited_at_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_at_timestamp_ms INTEGER");
        sb.insert(0, "CREATE TABLE message_edits (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_edits_message_id ON message_edits(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_latest_message_id");
        arrayList.add("CREATE INDEX index_message_edits_latest_message_id ON message_edits(latest_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_original_rcs_message_id");
        arrayList.add("CREATE INDEX index_message_edits_original_rcs_message_id ON message_edits(original_rcs_message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
