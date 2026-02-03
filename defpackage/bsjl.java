package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsjl extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bsji(this);
    }

    public final void b(Function... functionArr) {
        bsjl[] bsjlVarArr = new bsjl[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = PartsTable.a;
            bsjlVarArr[i] = (bsjl) function.apply(new bsjl());
        }
        aq(bsjlVarArr);
    }

    public final void c() {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 40040) {
            dqru.x("cms_full_size_blob_id", iIntValue);
        }
        ap(new dqpj("parts.cms_full_size_blob_id", 1, ""));
    }

    public final void d() {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 40040) {
            dqru.x("cms_full_size_blob_id", iIntValue);
        }
        ap(new dqpn("parts.cms_full_size_blob_id", 6));
    }

    public final void e() {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 40040) {
            dqru.x("cms_full_size_blob_id", iIntValue);
        }
        ap(new dqpn("parts.cms_full_size_blob_id", 5));
    }

    public final void f(String str) {
        ap(new dqpj("parts.content_type", 1, str));
    }

    public final void g(String str) {
        ap(new dqpj("parts.content_type", 11, str));
    }

    public final void h(Iterable iterable) {
        ap(new dqpm("parts.content_type", 4, as(iterable), false));
    }

    public final void i(ConversationIdType conversationIdType) {
        ap(new dqpj("parts.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void j(String str) {
        ap(new dqpj("parts._id", 1, String.valueOf(str)));
    }

    public final void k(Iterable iterable) {
        ap(new dqpm("parts._id", 3, as(iterable), false));
    }

    public final void l() {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 52050) {
            dqru.x("local_cache_path", iIntValue);
        }
        ap(new dqpn("parts.local_cache_path", 6));
    }

    public final void m(bvdr bvdrVar) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 58150) {
            dqru.x("media_send_type", iIntValue);
        }
        ap(new dqty("parts.media_send_type", 1, Integer.valueOf(bvdrVar == null ? 0 : bvdrVar.ordinal())));
    }

    public final void n(MessageIdType messageIdType) {
        ap(new dqpj("parts.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void o(dqxe dqxeVar) {
        ap(new dqpk("parts.message_id", 3, dqxeVar));
    }

    public final void p(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("parts.message_id", 3, as(ekfwVar.g()), true));
    }

    public final void q(Uri uri) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 10021) {
            dqru.x("original_uri", iIntValue);
        }
        ap(new dqpj("parts.original_uri", 1, uri));
    }

    public final void r(Uri uri) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 4020) {
            dqru.x("output_uri", iIntValue);
        }
        ap(new dqpj("parts.output_uri", 1, uri));
    }

    public final void s() {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 4020) {
            dqru.x("output_uri", iIntValue);
        }
        ap(new dqpn("parts.output_uri", 6));
    }

    public final void t(bvdt bvdtVar) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 4020) {
            dqru.x("processing_status", iIntValue);
        }
        ap(new dqty("parts.processing_status", 2, Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal())));
    }

    public final void u() {
        ap(new dqpn("parts.text", 6));
    }

    public final void v(Uri uri) {
        ap(new dqpj("parts.uri", 1, uri));
    }

    public final void w() {
        ap(new dqpj("parts.uri", 11, "android.resource%"));
    }

    public final void x() {
        ap(new dqpn("parts.uri", 6));
    }

    public final void y() {
        ap(new dqpn("parts.uri", 5));
    }

    public final void z(Uri uri) {
        ap(new dqpj("parts.uri", 2, uri));
    }
}
