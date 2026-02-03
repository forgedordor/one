package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsjh extends dqye {
    public bsjh() {
        super("parts");
    }

    public final void A() {
        this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
    }

    public final void B(int i) {
        this.a.put("width", Integer.valueOf(i));
    }

    public final void C(bsjl bsjlVar) {
        af(new bsji(bsjlVar));
    }

    public final void D(Function function) {
        String[] strArr = PartsTable.a;
        af(new bsji((bsjl) function.apply(new bsjl())));
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsjg b() {
        ah();
        return new bsjg(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean c(String str) {
        String[] strArr = PartsTable.a;
        bsjl bsjlVar = new bsjl();
        bsjlVar.j(str);
        return aj(new bsji(bsjlVar), "parts-buildAndUpdateForId");
    }

    public final void d(boolean z) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 53040) {
            dqru.x("awaiting_reverse_sync", iIntValue2);
        }
        if (iIntValue >= 53040) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void e() {
        this.a.putNull("blob_id");
    }

    public final void f(bvdl bvdlVar) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 44010) {
            dqru.x("cms_attachment_processing_status", iIntValue2);
        }
        if (iIntValue >= 44010) {
            if (bvdlVar == null) {
                this.a.putNull("cms_attachment_processing_status");
            } else {
                this.a.put("cms_attachment_processing_status", Integer.valueOf(bvdlVar.ordinal()));
            }
        }
    }

    public final void g(String str) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 40040) {
            dqru.x("cms_compressed_blob_id", iIntValue2);
        }
        if (iIntValue >= 40040) {
            dqru.v(this.a, "cms_compressed_blob_id", str);
        }
    }

    public final void h(String str) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 40040) {
            dqru.x("cms_full_size_blob_id", iIntValue2);
        }
        if (iIntValue >= 40040) {
            dqru.v(this.a, "cms_full_size_blob_id", str);
        }
    }

    public final void i(byte[] bArr) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 42010) {
            dqru.x("cms_media_encryption_key", iIntValue2);
        }
        if (iIntValue >= 42010) {
            this.a.put("cms_media_encryption_key", bArr);
        }
    }

    public final void j(String str) {
        dqru.v(this.a, "content_type", str);
    }

    public final void k(ConversationIdType conversationIdType) {
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            this.a.putNull("conversation_id");
        } else {
            this.a.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
        }
    }

    public final void l(long j) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 26040) {
            dqru.x("duration", iIntValue2);
        }
        if (iIntValue >= 26040) {
            this.a.put("duration", Long.valueOf(j));
        }
    }

    public final void m(Uri uri) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 13000) {
            dqru.x("fallback_uri", iIntValue2);
        }
        if (iIntValue >= 13000) {
            this.a.put("fallback_uri", uri.toString());
        }
    }

    public final void n(long j) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 52050) {
            dqru.x("file_size_bytes", iIntValue2);
        }
        if (iIntValue >= 52050) {
            this.a.put("file_size_bytes", Long.valueOf(j));
        }
    }

    public final void o() {
        this.a.putNull("file_size_bytes");
    }

    public final void p(int i) {
        this.a.put("height", Integer.valueOf(i));
    }

    public final void q(bvdq bvdqVar) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 60240) {
            dqru.x("image_display_state", iIntValue2);
        }
        if (iIntValue >= 60240) {
            if (bvdqVar == null) {
                this.a.putNull("image_display_state");
            } else {
                this.a.put("image_display_state", Integer.valueOf(bvdqVar.ordinal()));
            }
        }
    }

    public final void r(String str) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 52050) {
            dqru.x("local_cache_path", iIntValue2);
        }
        if (iIntValue >= 52050) {
            dqru.v(this.a, "local_cache_path", str);
        }
    }

    public final void s() {
        this.a.putNull("local_cache_path");
    }

    public final void t(boolean z) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 52030) {
            dqru.x("missing_entry_in_telephony", iIntValue2);
        }
        if (iIntValue >= 52030) {
            this.a.put("missing_entry_in_telephony", Boolean.valueOf(z));
        }
    }

    public final void u(Uri uri) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 10017) {
            dqru.x("preview_content_uri", iIntValue2);
        }
        if (iIntValue >= 10017) {
            if (uri == null) {
                this.a.putNull("preview_content_uri");
            } else {
                this.a.put("preview_content_uri", uri.toString());
            }
        }
    }

    public final void v() {
        this.a.putNull("output_uri");
    }

    public final void w(bvdt bvdtVar) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 4020) {
            dqru.x("processing_status", iIntValue2);
        }
        if (iIntValue >= 4020) {
            if (bvdtVar == null) {
                this.a.putNull("processing_status");
            } else {
                this.a.put("processing_status", Integer.valueOf(bvdtVar.ordinal()));
            }
        }
    }

    public final void x(bvdy bvdyVar) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 60230) {
            dqru.x("rich_card_media_download_failure_reason", iIntValue2);
        }
        if (iIntValue >= 60230) {
            if (bvdyVar == null) {
                this.a.putNull("rich_card_media_download_failure_reason");
            } else {
                this.a.put("rich_card_media_download_failure_reason", Integer.valueOf(bvdyVar.ordinal()));
            }
        }
    }

    public final void y(long j) {
        int iIntValue = PartsTable.e().intValue();
        int iIntValue2 = PartsTable.e().intValue();
        if (iIntValue2 < 4020) {
            dqru.x("target_size", iIntValue2);
        }
        if (iIntValue >= 4020) {
            this.a.put("target_size", Long.valueOf(j));
        }
    }

    public final void z(Uri uri) {
        if (uri == null) {
            this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        } else {
            this.a.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
        }
    }
}
