package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azns extends dqsi {
    public static final String[] a = {"parts_backup._id", "parts_backup.message_id", "parts_backup.content_type", "parts_backup.source", "parts_backup.text", "parts_backup.width", "parts_backup.height", "parts_backup.longitude", "parts_backup.latitude", "parts_backup.cms_full_size_blob_id", "parts_backup.cms_media_encryption_key", "parts_backup.cms_compressed_media_encryption_key", "parts_backup.cms_compressed_blob_id", "parts_backup.file_name", "parts_backup.duration"};
    public static final ekgp b;
    public static final azmp c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("parts_backup.source", 10);
        ekgiVar.i("parts_backup.file_name", 100);
        ekgiVar.i("parts_backup.duration", 130);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_parts_backup_message_id");
        ekgiVar2.c();
        c = new azmp();
        d = new int[]{10, 100, 130};
        e = new int[]{90};
    }

    public static final aznp a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("parts_backup._id");
            ekfwVar.h("parts_backup.message_id");
            ekfwVar.h("parts_backup.content_type");
            if (numC.intValue() >= 10) {
                ekfwVar.h("parts_backup.source");
            }
            ekfwVar.h("parts_backup.text");
            ekfwVar.h("parts_backup.width");
            ekfwVar.h("parts_backup.height");
            ekfwVar.h("parts_backup.longitude");
            ekfwVar.h("parts_backup.latitude");
            ekfwVar.h("parts_backup.cms_full_size_blob_id");
            ekfwVar.h("parts_backup.cms_media_encryption_key");
            ekfwVar.h("parts_backup.cms_compressed_media_encryption_key");
            ekfwVar.h("parts_backup.cms_compressed_blob_id");
            if (numC.intValue() >= 100) {
                ekfwVar.h("parts_backup.file_name");
            }
            if (numC.intValue() >= 130) {
                ekfwVar.h("parts_backup.duration");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new aznp(strArr);
    }

    public static dqsy b() {
        return dqru.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(13)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("width INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("height INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("longitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_full_size_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_blob_id TEXT");
        if (i >= 100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_name TEXT");
        }
        if (i >= 130) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duration INT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static dqxa e() {
        return b().M();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_parts_backup_message_id");
        arrayList.add("CREATE INDEX index_parts_backup_message_id ON parts_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
