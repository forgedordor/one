package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atmx extends dqsi {
    public static final String[] a = {"file_processing.processing_id", "file_processing.file_type", "file_processing.file_uri", "file_processing.content_type", "file_processing.encryption_metadata", "file_processing.transfer_handle", "file_processing.upload_result", "file_processing.mls_file_metadata"};
    public static final atma b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("file_processing.mls_file_metadata", 60700);
        ekgiVar.c();
        new ekgi().c();
        b = new atma();
        c = new int[]{60260, 60700};
    }

    public static final atms a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("file_processing.processing_id");
            ekfwVar.h("file_processing.file_type");
            ekfwVar.h("file_processing.file_uri");
            ekfwVar.h("file_processing.content_type");
            ekfwVar.h("file_processing.encryption_metadata");
            ekfwVar.h("file_processing.transfer_handle");
            ekfwVar.h("file_processing.upload_result");
            if (numC.intValue() >= 60700) {
                ekfwVar.h("file_processing.mls_file_metadata");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new atms(strArr);
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
        sb.append("processing_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_metadata BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_handle TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("upload_result BLOB");
        if (i >= 60700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_file_metadata BLOB");
        }
        sb.insert(0, "CREATE TABLE file_processing (");
        sb.append(", PRIMARY KEY (processing_id,file_type));");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
