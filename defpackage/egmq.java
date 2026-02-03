package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmq {
    static boolean a(String str, String str2, Set set) {
        if (str.endsWith("-wal") || str.endsWith("-shm")) {
            str = str.substring(0, str.length() - 4);
        } else if (str.endsWith("-journal")) {
            str = str.substring(0, str.length() - 8);
        }
        if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(str2)) {
            str.substring(20, str.length() - str2.length());
            if (!set.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
