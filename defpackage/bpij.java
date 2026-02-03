package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpij {
    public static dqsq a() {
        return new dqry(bpio.c, "etouffee_rcs_metadata", new dqrx() { // from class: bpih
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpio.a;
                numValueOf.getClass();
                switch (i) {
                    case 35050:
                        bpio.d(dqsyVar, 35050);
                        break;
                    case 35060:
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN attachment_uri TEXT;");
                        break;
                    case 37020:
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN custom_delivery_receipt_mime_type TEXT;");
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN custom_delivery_receipt_content BLOB;");
                        break;
                    case 48010:
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_xml_from_content_server BLOB;");
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_fallback_uri TEXT;");
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_expiry INT;");
                        break;
                    case 56020:
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_attachment_name TEXT;");
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_attachment_content_type TEXT;");
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_thumbnail_content_type TEXT;");
                        break;
                    case 60700:
                        dqsyVar.v("ALTER TABLE etouffee_rcs_metadata ADD COLUMN mls_file_info BLOB;");
                        break;
                }
            }
        });
    }
}
