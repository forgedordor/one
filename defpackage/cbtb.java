package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtb extends dqsi {
    public static final String[] a = {"conversation_encryption.conversation_id", "conversation_encryption.destination_token", "conversation_encryption.self_id", "conversation_encryption.conv_type", "conversation_encryption.encryption_protocol", "conversation_encryption.encryption_id", "conversation_encryption.last_updated_timestamp", "conversation_encryption.added_to_mls_group_timestamp", "conversation_encryption.mls_last_unexpected_downgrade_timestamp", "conversation_encryption.mls_reupgrade_after_unexpected_downgrade_attempt_count"};
    public static final ekgp b;
    public static final cbse c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_encryption.destination_token", 61010);
        ekgiVar.i("conversation_encryption.conv_type", 60890);
        ekgiVar.i("conversation_encryption.added_to_mls_group_timestamp", 60920);
        ekgiVar.i("conversation_encryption.mls_last_unexpected_downgrade_timestamp", 60920);
        ekgiVar.i("conversation_encryption.mls_reupgrade_after_unexpected_downgrade_attempt_count", 60920);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("encryption_id", "index_conversation_encryption_encryption_id");
        ekgiVar2.c();
        c = new cbse();
        d = new int[]{60870, 60890, 60920, 61010};
    }

    public static final cbsw a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_encryption.conversation_id");
            if (numC.intValue() >= 61010) {
                ekfwVar.h("conversation_encryption.destination_token");
            }
            ekfwVar.h("conversation_encryption.self_id");
            if (numC.intValue() >= 60890) {
                ekfwVar.h("conversation_encryption.conv_type");
            }
            ekfwVar.h("conversation_encryption.encryption_protocol");
            ekfwVar.h("conversation_encryption.encryption_id");
            ekfwVar.h("conversation_encryption.last_updated_timestamp");
            if (numC.intValue() >= 60920) {
                ekfwVar.h("conversation_encryption.added_to_mls_group_timestamp");
            }
            if (numC.intValue() >= 60920) {
                ekfwVar.h("conversation_encryption.mls_last_unexpected_downgrade_timestamp");
            }
            if (numC.intValue() >= 60920) {
                ekfwVar.h("conversation_encryption.mls_reupgrade_after_unexpected_downgrade_attempt_count");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new cbsw(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (i >= 61010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_id TEXT");
        if (i >= 60890) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conv_type INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_protocol INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_updated_timestamp INTEGER DEFAULT(0)");
        if (i >= 60920) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("added_to_mls_group_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 60920) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_last_unexpected_downgrade_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 60920) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_reupgrade_after_unexpected_downgrade_attempt_count INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE conversation_encryption (");
        sb.append(", PRIMARY KEY (conversation_id,self_id));");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_encryption_encryption_id");
        arrayList.add("CREATE INDEX index_conversation_encryption_encryption_id ON conversation_encryption(encryption_id);");
        if (i >= 61010) {
            arrayList.add("DROP INDEX IF EXISTS index_destination_and_self_identity");
            arrayList.add("CREATE UNIQUE INDEX index_destination_and_self_identity ON conversation_encryption(destination_token, self_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
