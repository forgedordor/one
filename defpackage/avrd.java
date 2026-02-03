package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avrd extends dqsi {
    public static final String[] a = {"conversation_matcher_cache._id", "conversation_matcher_cache.matcher_version", "conversation_matcher_cache.destination_key", "conversation_matcher_cache.conversation_id"};
    public static final avql b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new avql();
        c = new int[]{58580, 59180};
        d = new int[]{58640};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        dqsyVar.v(d("conversation_matcher_cache"));
        for (String str : c(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS cache_idx");
        arrayList.add("CREATE UNIQUE INDEX cache_idx ON conversation_matcher_cache(matcher_version, destination_key, conversation_id);");
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
            arrayList.add("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("matcher_version INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }
}
