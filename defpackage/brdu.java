package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdu extends dqye {
    public brdu() {
        super("messages");
    }

    public final void A(Instant instant) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 17030) {
            dqru.x("queue_insert_timestamp", iIntValue2);
        }
        if (iIntValue >= 17030) {
            if (instant == null) {
                this.a.putNull("queue_insert_timestamp");
            } else {
                this.a.put("queue_insert_timestamp", Long.valueOf(bart.a(instant)));
            }
        }
    }

    public final void B(int i) {
        this.a.put("raw_status", Integer.valueOf(i));
    }

    public final void C(int i) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 29060) {
            dqru.x("etouffee_status", iIntValue2);
        }
        if (iIntValue >= 29060) {
            this.a.put("etouffee_status", Integer.valueOf(i));
        }
    }

    public final void D(long j) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 10004) {
            dqru.x("rcs_file_transfer_session_id", iIntValue2);
        }
        if (iIntValue >= 10004) {
            this.a.put("rcs_file_transfer_session_id", Long.valueOf(j));
        }
    }

    public final void E(basd basdVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 41040) {
            dqru.x("rcs_message_id_with_text_type", iIntValue2);
        }
        if (iIntValue >= 41040) {
            if (basdVar == null) {
                this.a.putNull("rcs_message_id_with_text_type");
            } else {
                this.a.put("rcs_message_id_with_text_type", basd.d(basdVar));
            }
        }
    }

    public final void F(boolean z) {
        this.a.put("read", Boolean.valueOf(z));
    }

    public final void G(long j) {
        this.a.put("received_timestamp", Long.valueOf(j));
    }

    public final void H(int i) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58040) {
            dqru.x("result_code", iIntValue2);
        }
        if (iIntValue >= 58040) {
            this.a.put("result_code", Integer.valueOf(i));
        }
    }

    public final void I(long j) {
        this.a.put("retry_start_timestamp", Long.valueOf(j));
    }

    public final void J(baro baroVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 59490) {
            dqru.x("satellite_datagram_id", iIntValue2);
        }
        if (iIntValue >= 59490) {
            if (baroVar.equals(baro.a)) {
                this.a.putNull("satellite_datagram_id");
            } else {
                this.a.put("satellite_datagram_id", baro.d(baroVar));
            }
        }
    }

    public final void K(String str) {
        dqru.v(this.a, "self_id", str);
    }

    public final void L(long j) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 35030) {
            dqru.x("send_counter", iIntValue2);
        }
        if (iIntValue >= 35030) {
            this.a.put("send_counter", Long.valueOf(j));
        }
    }

    public final void M(String str) {
        dqru.v(this.a, "sender_id", str);
    }

    public final void N(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 54040) {
            dqru.x("sender_send_destination", iIntValue2);
        }
        if (iIntValue >= 54040) {
            dqru.v(this.a, "sender_send_destination", str);
        }
    }

    public final void O(long j) {
        this.a.put("sent_timestamp", Long.valueOf(j));
    }

    public final void P(int i) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 9000) {
            dqru.x("sms_error_code", iIntValue2);
        }
        if (iIntValue >= 9000) {
            this.a.put("sms_error_code", Integer.valueOf(i));
        }
    }

    public final void Q(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 9000) {
            dqru.x("sms_error_desc_map_name", iIntValue2);
        }
        if (iIntValue >= 9000) {
            dqru.v(this.a, "sms_error_desc_map_name", str);
        }
    }

    public final void R(long j) {
        this.a.put("sms_message_size", Long.valueOf(j));
    }

    public final void S(Uri uri) {
        if (uri == null) {
            this.a.putNull("sms_message_uri");
        } else {
            this.a.put("sms_message_uri", uri.toString());
        }
    }

    public final void T() {
        this.a.putNull("sms_message_uri");
    }

    public final void U(int i) {
        this.a.put("message_status", Integer.valueOf(i));
    }

    public final void V(bvec bvecVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 59310) {
            dqru.x("xms_transport", iIntValue2);
        }
        if (iIntValue >= 59310) {
            if (bvecVar == null) {
                this.a.putNull("xms_transport");
            } else {
                this.a.put("xms_transport", Integer.valueOf(bvecVar.ordinal()));
            }
        }
    }

    public final void W(brec brecVar) {
        af(new brdv(brecVar));
    }

    public final void X(Function function) {
        String[] strArr = MessagesTable.a;
        af(new brdv((brec) function.apply(new brec())));
    }

    public final int a() {
        return this.a.getAsInteger("message_status").intValue();
    }

    public final long c() {
        return this.a.getAsLong("received_timestamp").longValue();
    }

    @Override // defpackage.dqye
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final brdt b() {
        ah();
        return new brdt(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean e(MessageIdType messageIdType) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.p(messageIdType);
        return aj(new brdv(brecVar), "messages-buildAndUpdateForId");
    }

    public final void f(int i) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58230) {
            dqru.x("auto_retry_counter", iIntValue2);
        }
        if (iIntValue >= 58230) {
            this.a.put("auto_retry_counter", Integer.valueOf(i));
        }
    }

    public final void g(boolean z) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 49060) {
            dqru.x("awaiting_reverse_sync", iIntValue2);
        }
        if (iIntValue >= 49060) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void h(boolean z) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58280) {
            dqru.x("can_revoke_before_delivered_with_rcs", iIntValue2);
        }
        if (iIntValue >= 58280) {
            this.a.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(z));
        }
    }

    public final void i(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 8500) {
            dqru.x("cloud_sync_id", iIntValue2);
        }
        if (iIntValue >= 8500) {
            dqru.v(this.a, "cloud_sync_id", str);
        }
    }

    public final void j(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 46010) {
            dqru.x("cms_correlation_id", iIntValue2);
        }
        if (iIntValue >= 46010) {
            dqru.v(this.a, "cms_correlation_id", str);
        }
    }

    public final void k(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 31010) {
            dqru.x("cms_id", iIntValue2);
        }
        if (iIntValue >= 31010) {
            dqru.v(this.a, "cms_id", str);
        }
    }

    public final void l(long j) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 37040) {
            dqru.x("cms_last_mod_seq", iIntValue2);
        }
        if (iIntValue >= 37040) {
            this.a.put("cms_last_mod_seq", Long.valueOf(j));
        }
    }

    public final void m(cpyi cpyiVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58210) {
            dqru.x("cms_life_cycle", iIntValue2);
        }
        if (iIntValue >= 58210) {
            if (cpyiVar == null) {
                this.a.putNull("cms_life_cycle");
            } else {
                this.a.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
            }
        }
    }

    public final void n(ConversationIdType conversationIdType) {
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            this.a.putNull("conversation_id");
        } else {
            this.a.put("conversation_id", Long.valueOf(barn.a(conversationIdType)));
        }
    }

    public final void o(String str) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 9010) {
            dqru.x("correlation_id", iIntValue2);
        }
        if (iIntValue >= 9010) {
            dqru.v(this.a, "correlation_id", str);
        }
    }

    public final void p(eyga eygaVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 45020) {
            dqru.x("custom_headers", iIntValue2);
        }
        if (iIntValue >= 45020) {
            if (eygaVar == null) {
                this.a.putNull("custom_headers");
            } else {
                this.a.put("custom_headers", eygaVar.toByteArray());
            }
        }
    }

    public final void q(boolean z) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 30010) {
            dqru.x("is_hidden", iIntValue2);
        }
        if (iIntValue >= 30010) {
            this.a.put("is_hidden", Boolean.valueOf(z));
        }
    }

    public final void r(dqxe dqxeVar) {
        ag("message_persistence_id", dqxeVar);
    }

    public final void s(int i) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 13020) {
            dqru.x("message_report_status", iIntValue2);
        }
        if (iIntValue >= 13020) {
            this.a.put("message_report_status", Integer.valueOf(i));
        }
    }

    public final void t(long j) {
        this.a.put("mms_expiry", Long.valueOf(j));
    }

    public final void u(String str) {
        dqru.v(this.a, "mms_transaction_id", str);
    }

    public final void v(boolean z) {
        this.a.put("seen", Boolean.valueOf(z));
    }

    public final void w() {
        this.a.putNull("old_sms_message_uri");
    }

    public final void x(bvdx bvdxVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58720) {
            dqru.x("outgoing_delivery_report_status", iIntValue2);
        }
        if (iIntValue >= 58720) {
            if (bvdxVar == null) {
                this.a.putNull("outgoing_delivery_report_status");
            } else {
                this.a.put("outgoing_delivery_report_status", Integer.valueOf(bvdxVar.ordinal()));
            }
        }
    }

    public final void y(bvdx bvdxVar) {
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 58720) {
            dqru.x("outgoing_read_report_status", iIntValue2);
        }
        if (iIntValue >= 58720) {
            if (bvdxVar == null) {
                this.a.putNull("outgoing_read_report_status");
            } else {
                this.a.put("outgoing_read_report_status", Integer.valueOf(bvdxVar.ordinal()));
            }
        }
    }

    public final void z(int i) {
        this.a.put("message_protocol", Integer.valueOf(i));
    }
}
