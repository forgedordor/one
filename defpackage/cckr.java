package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckr extends dqsi {
    public static final String[] a = {"mls_messages.rcs_message_id", "mls_messages.original_rcs_message_id", "mls_messages.raw_cpim_content", "mls_messages.encrypted_cpim_content", "mls_messages.encryption_timestamp", "mls_messages.self_identity_id", "mls_messages.mls_group_id", "mls_messages.mls_epoch_id", "mls_messages.mls_era_id", "mls_messages.epoch_authenticator", "mls_messages.file_processing_id"};
    public static final ccjr b;
    public static final int[] c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("mls_messages.file_processing_id", 60960);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("file_processing_id", "index_mls_messages_file_processing_id");
        ekgiVar2.c();
        b = new ccjr();
        c = new int[]{60880, 60960};
        d = new int[]{60910};
    }

    public static final cckl a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("mls_messages.rcs_message_id");
            ekfwVar.h("mls_messages.original_rcs_message_id");
            ekfwVar.h("mls_messages.raw_cpim_content");
            ekfwVar.h("mls_messages.encrypted_cpim_content");
            ekfwVar.h("mls_messages.encryption_timestamp");
            ekfwVar.h("mls_messages.self_identity_id");
            ekfwVar.h("mls_messages.mls_group_id");
            ekfwVar.h("mls_messages.mls_epoch_id");
            ekfwVar.h("mls_messages.mls_era_id");
            ekfwVar.h("mls_messages.epoch_authenticator");
            if (numC.intValue() >= 60960) {
                ekfwVar.h("mls_messages.file_processing_id");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new cckl(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("raw_cpim_content BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encrypted_cpim_content BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_identity_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mls_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mls_epoch_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mls_era_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("epoch_authenticator BLOB");
        if (i >= 60960) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_processing_id TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "mls_messages"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60960) {
            arrayList.add("DROP INDEX IF EXISTS index_mls_messages_file_processing_id");
            arrayList.add("CREATE INDEX index_mls_messages_file_processing_id ON mls_messages(file_processing_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
