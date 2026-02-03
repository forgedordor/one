package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsja {
    public static dqsq a() {
        return new dqry(PartsTable.e, "parts", new dqrx() { // from class: bsiy
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = PartsTable.a;
                numValueOf.getClass();
                switch (i) {
                    case 3010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN timestamp INT;");
                        break;
                    case 4020:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN output_uri TEXT;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN target_size INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN processing_status INT DEFAULT(0);");
                        break;
                    case 5020:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN sticker_set_id INT DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN sticker_id INT DEFAULT(-1);");
                        break;
                    case 7000:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN media_modified_timestamp INT DEFAULT(-1);");
                        break;
                    case 10005:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN longitude REAL DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN latitude REAL DEFAULT(0);");
                        break;
                    case 10017:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN preview_content_uri TEXT;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN preview_content_type TEXT;");
                        break;
                    case 10021:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN original_uri TEXT;");
                        break;
                    case 13000:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN fallback_uri TEXT;");
                        break;
                    case 14010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN source INT DEFAULT(13);");
                        break;
                    case 17010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN bundle_index INT DEFAULT(0);");
                        break;
                    case 17020:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN blob_id TEXT;");
                        break;
                    case 18000:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN blob_upload_permanent_failure INT DEFAULT(0);");
                        break;
                    case 19030:
                        PartsTable.f(dqsyVar);
                        break;
                    case 22060:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN expressive_sticker_name TEXT;");
                        break;
                    case 26000:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN file_name TEXT;");
                        break;
                    case 26040:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN duration INT;");
                        break;
                    case 27000:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN compressed_blob_id TEXT;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN compressed_blob_upload_permanent_failure INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN compressed_blob_upload_timestamp INT DEFAULT(0);");
                        break;
                    case 29060:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN storage_uri TEXT;");
                        break;
                    case 30040:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN media_encryption_key BLOB;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN compressed_media_encryption_key BLOB;");
                        break;
                    case 40040:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN cms_full_size_blob_id TEXT;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN cms_compressed_blob_id TEXT;");
                        break;
                    case 42010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN cms_media_encryption_key BLOB;");
                        break;
                    case 42070:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN cms_compressed_media_encryption_key BLOB;");
                        break;
                    case 44010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN cms_attachment_processing_status INT DEFAULT(0);");
                        break;
                    case 49010:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN attachment_upload_response BLOB;");
                        break;
                    case 52030:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN missing_entry_in_telephony INT;");
                        break;
                    case 52050:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN file_size_bytes INT;");
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN local_cache_path TEXT;");
                        break;
                    case 53040:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        break;
                    case 58150:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN media_send_type INT DEFAULT(0);");
                        break;
                    case 58380:
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_content_type");
                        dqsyVar.v("CREATE INDEX index_parts_content_type ON parts(content_type);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_output_uri");
                        dqsyVar.v("CREATE INDEX index_parts_output_uri ON parts(output_uri) WHERE output_uri NOT NULL;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_conversation_id");
                        dqsyVar.v("CREATE INDEX index_parts_conversation_id ON parts(conversation_id);");
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_preview_content_type");
                        dqsyVar.v("CREATE INDEX index_parts_preview_content_type ON parts(preview_content_type) WHERE preview_content_type NOT NULL;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_file_size_bytes");
                        dqsyVar.v("CREATE INDEX index_parts_file_size_bytes ON parts(file_size_bytes) WHERE file_size_bytes <> 0;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_parts_local_cache_path");
                        dqsyVar.v("CREATE INDEX index_parts_local_cache_path ON parts(local_cache_path) WHERE local_cache_path NOT NULL;");
                        break;
                    case 58770:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN validation_status INT DEFAULT(0);");
                        break;
                    case 59470:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN voice_metadata BLOB;");
                        break;
                    case 59570:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN blob_gaia_email TEXT;");
                        break;
                    case 60080:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN processing_id TEXT;");
                        break;
                    case 60230:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN rich_card_media_download_failure_reason INT DEFAULT(0);");
                        break;
                    case 60240:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN image_display_state INT DEFAULT(0);");
                        break;
                    case 60680:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN preserve_size INT DEFAULT(0);");
                        break;
                    case 60990:
                        dqsyVar.v("ALTER TABLE parts ADD COLUMN raw_text TEXT;");
                        break;
                }
            }
        });
    }

    public static dqpo[] b() {
        return PartsTable.d.ab;
    }
}
