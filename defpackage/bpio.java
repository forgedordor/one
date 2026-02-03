package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpio extends dqsi {
    public static final String[] a = {"etouffee_rcs_metadata.rcs_message_id", "etouffee_rcs_metadata.preview_etouffee", "etouffee_rcs_metadata.preview_summary", "etouffee_rcs_metadata.preview_version", "etouffee_rcs_metadata.attachment_etouffee", "etouffee_rcs_metadata.attachment_summary", "etouffee_rcs_metadata.attachment_version", "etouffee_rcs_metadata.creation_timestamp", "etouffee_rcs_metadata.attachment_uri", "etouffee_rcs_metadata.custom_delivery_receipt_mime_type", "etouffee_rcs_metadata.custom_delivery_receipt_content", "etouffee_rcs_metadata.file_uploaded_xml_from_content_server", "etouffee_rcs_metadata.file_uploaded_fallback_uri", "etouffee_rcs_metadata.file_uploaded_expiry", "etouffee_rcs_metadata.plaintext_attachment_name", "etouffee_rcs_metadata.plaintext_attachment_content_type", "etouffee_rcs_metadata.plaintext_thumbnail_content_type", "etouffee_rcs_metadata.mls_file_info"};
    public static final bphl b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("etouffee_rcs_metadata.attachment_uri", 35060);
        ekgiVar.i("etouffee_rcs_metadata.custom_delivery_receipt_mime_type", 37020);
        ekgiVar.i("etouffee_rcs_metadata.custom_delivery_receipt_content", 37020);
        ekgiVar.i("etouffee_rcs_metadata.file_uploaded_xml_from_content_server", 48010);
        ekgiVar.i("etouffee_rcs_metadata.file_uploaded_fallback_uri", 48010);
        ekgiVar.i("etouffee_rcs_metadata.file_uploaded_expiry", 48010);
        ekgiVar.i("etouffee_rcs_metadata.plaintext_attachment_name", 56020);
        ekgiVar.i("etouffee_rcs_metadata.plaintext_attachment_content_type", 56020);
        ekgiVar.i("etouffee_rcs_metadata.plaintext_thumbnail_content_type", 56020);
        ekgiVar.i("etouffee_rcs_metadata.mls_file_info", 60700);
        ekgiVar.c();
        new ekgi().c();
        b = new bphl();
        c = new int[]{35050, 35060, 37020, 48010, 56020, 60700};
    }

    public static final bpil a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("etouffee_rcs_metadata.rcs_message_id");
            ekfwVar.h("etouffee_rcs_metadata.preview_etouffee");
            ekfwVar.h("etouffee_rcs_metadata.preview_summary");
            ekfwVar.h("etouffee_rcs_metadata.preview_version");
            ekfwVar.h("etouffee_rcs_metadata.attachment_etouffee");
            ekfwVar.h("etouffee_rcs_metadata.attachment_summary");
            ekfwVar.h("etouffee_rcs_metadata.attachment_version");
            ekfwVar.h("etouffee_rcs_metadata.creation_timestamp");
            if (numC.intValue() >= 35060) {
                ekfwVar.h("etouffee_rcs_metadata.attachment_uri");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("etouffee_rcs_metadata.custom_delivery_receipt_mime_type");
            }
            if (numC.intValue() >= 37020) {
                ekfwVar.h("etouffee_rcs_metadata.custom_delivery_receipt_content");
            }
            if (numC.intValue() >= 48010) {
                ekfwVar.h("etouffee_rcs_metadata.file_uploaded_xml_from_content_server");
            }
            if (numC.intValue() >= 48010) {
                ekfwVar.h("etouffee_rcs_metadata.file_uploaded_fallback_uri");
            }
            if (numC.intValue() >= 48010) {
                ekfwVar.h("etouffee_rcs_metadata.file_uploaded_expiry");
            }
            if (numC.intValue() >= 56020) {
                ekfwVar.h("etouffee_rcs_metadata.plaintext_attachment_name");
            }
            if (numC.intValue() >= 56020) {
                ekfwVar.h("etouffee_rcs_metadata.plaintext_attachment_content_type");
            }
            if (numC.intValue() >= 56020) {
                ekfwVar.h("etouffee_rcs_metadata.plaintext_thumbnail_content_type");
            }
            if (numC.intValue() >= 60700) {
                ekfwVar.h("etouffee_rcs_metadata.mls_file_info");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpil(strArr);
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
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("creation_timestamp INT DEFAULT(0)");
        if (i >= 35060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachment_uri TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_mime_type TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_content BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_xml_from_content_server BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_fallback_uri TEXT");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_expiry INT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_name TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_content_type TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_thumbnail_content_type TEXT");
        }
        if (i >= 60700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_file_info BLOB");
        }
        sb.insert(0, "CREATE TABLE etouffee_rcs_metadata (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
