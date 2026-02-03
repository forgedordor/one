package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bote extends dqye {
    public bote() {
        super("conversations");
    }

    public final void A(int i) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 10006) {
            dqru.x("join_state", iIntValue2);
        }
        if (iIntValue >= 10006) {
            this.a.put("join_state", Integer.valueOf(i));
        }
    }

    public final void B(cins cinsVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60050) {
            dqru.x("mms_group_upgrade_status", iIntValue2);
        }
        if (iIntValue >= 60050) {
            if (cinsVar == null) {
                this.a.putNull("mms_group_upgrade_status");
            } else {
                this.a.put("mms_group_upgrade_status", Integer.valueOf(cinsVar.ordinal()));
            }
        }
    }

    public final void C(String str) {
        dqru.v(this.a, "name", cssd.a(str));
    }

    public final void D(bvdp bvdpVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 10012) {
            dqru.x("name_is_automatic", iIntValue2);
        }
        if (iIntValue >= 10012) {
            if (bvdpVar == null) {
                this.a.putNull("name_is_automatic");
            } else {
                this.a.put("name_is_automatic", Integer.valueOf(bvdpVar.ordinal()));
            }
        }
    }

    public final void E(int i) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 26020) {
            dqru.x("open_count", iIntValue2);
        }
        if (iIntValue >= 26020) {
            this.a.put("open_count", Integer.valueOf(i));
        }
    }

    public final void F(long j) {
        this.a.put("participant_contact_id", Long.valueOf(j));
    }

    public final void G(int i) {
        this.a.put("participant_count", Integer.valueOf(i));
    }

    public final void H(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 15010) {
            dqru.x("participant_display_destination", iIntValue2);
        }
        if (iIntValue >= 15010) {
            dqru.v(this.a, "participant_display_destination", cssq.a(str));
        }
    }

    public final void I(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 8500) {
            dqru.x("participant_id_list", iIntValue2);
        }
        if (iIntValue >= 8500) {
            dqru.v(this.a, "participant_id_list", str);
        }
    }

    public final void J(String str) {
        dqru.v(this.a, "participant_lookup_key", str);
    }

    public final void K(String str) {
        dqru.v(this.a, "participant_normalized_destination", str);
    }

    public final void L(String str) {
        dqru.v(this.a, "preview_content_type", str);
    }

    public final void M(Uri uri) {
        if (uri == null) {
            this.a.putNull("preview_uri");
        } else {
            this.a.put("preview_uri", uri.toString());
        }
    }

    public final void N(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 40050) {
            dqru.x("rcs_conference_uri", iIntValue2);
        }
        if (iIntValue >= 40050) {
            dqru.v(this.a, "rcs_conference_uri", cssa.a(str));
        }
    }

    public final void O(cigb cigbVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 49020) {
            dqru.x("rcs_group_capabilities", iIntValue2);
        }
        if (iIntValue >= 49020) {
            if (cigbVar == null) {
                this.a.putNull("rcs_group_capabilities");
            } else {
                this.a.put("rcs_group_capabilities", Long.valueOf(cigbVar.a));
            }
        }
    }

    public final void P(Uri uri) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60590) {
            dqru.x("rcs_group_icon_url", iIntValue2);
        }
        if (iIntValue >= 60590) {
            if (uri == null) {
                this.a.putNull("rcs_group_icon_url");
            } else {
                this.a.put("rcs_group_icon_url", uri.toString());
            }
        }
    }

    public final void Q(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 40050) {
            dqru.x("rcs_group_id", iIntValue2);
        }
        if (iIntValue >= 40050) {
            dqru.v(this.a, "rcs_group_id", str);
        }
    }

    public final void R(Optional optional) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 58910) {
            dqru.x("rcs_group_last_sync_timestamp", iIntValue2);
        }
        if (iIntValue >= 58910) {
            this.a.put("rcs_group_last_sync_timestamp", Long.valueOf(basb.a(optional)));
        }
    }

    public final void S(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 58540) {
            dqru.x("rcs_group_self_msisdn", iIntValue2);
        }
        if (iIntValue >= 58540) {
            dqru.v(this.a, "rcs_group_self_msisdn", str);
        }
    }

    public final void T(long j) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 10000) {
            dqru.x("rcs_session_id", iIntValue2);
        }
        if (iIntValue >= 10000) {
            this.a.put("rcs_session_id", Long.valueOf(j));
        }
    }

    public final void U(Optional optional) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 58750) {
            dqru.x("recipient_offline_timestamp_ms", iIntValue2);
        }
        if (iIntValue >= 58750) {
            this.a.put("recipient_offline_timestamp_ms", Long.valueOf(basb.a(optional)));
        }
    }

    public final void V(int i) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 10016) {
            dqru.x("send_mode", iIntValue2);
        }
        if (iIntValue >= 10016) {
            this.a.put("send_mode", Integer.valueOf(i));
        }
    }

    public final void W(boolean z) {
        this.a.put("show_draft", Boolean.valueOf(z));
    }

    public final void X(cnqj cnqjVar) {
        if (cnqjVar == null) {
            this.a.putNull("sms_thread_id");
        } else {
            this.a.put("sms_thread_id", Long.valueOf(cnqk.a(cnqjVar)));
        }
    }

    public final void Y(String str) {
        dqru.v(this.a, "snippet_text", cssq.a(str));
    }

    public final void Z(long j) {
        this.a.put("sort_timestamp", Long.valueOf(j));
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final botd b() {
        ah();
        return new botd(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void aa(boolean z) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 23000) {
            dqru.x("spam_warning_dismiss_status", iIntValue2);
        }
        if (iIntValue >= 23000) {
            this.a.put("spam_warning_dismiss_status", Boolean.valueOf(z));
        }
    }

    public final void ab(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 59760) {
            dqru.x("subtitle", iIntValue2);
        }
        if (iIntValue >= 59760) {
            dqru.v(this.a, "subtitle", str);
        }
    }

    public final void ac(botl botlVar) {
        af(new botf(botlVar));
    }

    public final void ad(Function function) {
        String[] strArr = botm.a;
        af(new botf((botl) function.apply(new botl())));
    }

    public final bvdp c() {
        ContentValues contentValues = this.a;
        bvdp[] bvdpVarArrValues = bvdp.values();
        int iIntValue = contentValues.getAsInteger("name_is_automatic").intValue();
        if (iIntValue < bvdpVarArrValues.length) {
            return bvdpVarArrValues[iIntValue];
        }
        throw new IllegalArgumentException();
    }

    public final String d() {
        return this.a.getAsString("name");
    }

    public final String e() {
        return this.a.getAsString("participant_lookup_key");
    }

    public final boolean f(ConversationIdType conversationIdType) {
        String[] strArr = botm.a;
        botl botlVar = new botl();
        botlVar.r(conversationIdType);
        return aj(new botf(botlVar), "conversations-buildAndUpdateForId");
    }

    public final void g(String str) {
        String[] strArr = botm.a;
        botl botlVar = new botl();
        botlVar.k(str);
        ae(new botf(botlVar), "conversations-buildAndUpdateForCurrentSelfId");
    }

    public final void h(bvdk bvdkVar) {
        if (bvdkVar == null) {
            this.a.putNull("archive_status");
        } else {
            this.a.put("archive_status", Integer.valueOf(bvdkVar.h));
        }
    }

    public final void i(boolean z) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 49060) {
            dqru.x("awaiting_reverse_sync", iIntValue2);
        }
        if (iIntValue >= 49060) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void j(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60250) {
            dqru.x("cms_correlation_id", iIntValue2);
        }
        if (iIntValue >= 60250) {
            dqru.v(this.a, "cms_correlation_id", str);
        }
    }

    public final void k(String str) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 32000) {
            dqru.x("cms_id", iIntValue2);
        }
        if (iIntValue >= 32000) {
            dqru.v(this.a, "cms_id", str);
        }
    }

    public final void l(cpyi cpyiVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
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

    public final void m() {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 10007) {
            dqru.x("conv_type", iIntValue2);
        }
        if (iIntValue >= 10007) {
            this.a.put("conv_type", (Integer) 2);
        }
    }

    public final void n(String str) {
        dqru.v(this.a, "current_self_id", str);
    }

    public final void o(long j) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 29020) {
            dqru.x("delete_timestamp", iIntValue2);
        }
        if (iIntValue >= 29020) {
            this.a.put("delete_timestamp", Long.valueOf(j));
        }
    }

    public final void p(awjl awjlVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60360) {
            dqru.x("destination_token", iIntValue2);
        }
        if (iIntValue >= 60360) {
            if (awjlVar == null || awjlVar.equals(null)) {
                this.a.putNull("destination_token");
            } else {
                this.a.put("destination_token", awjm.b(awjlVar));
            }
        }
    }

    public final void q(int i) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 29060) {
            dqru.x("etouffee_default", iIntValue2);
        }
        if (iIntValue >= 29060) {
            this.a.put("etouffee_default", Integer.valueOf(i));
        }
    }

    public final void r(String str) {
        dqru.v(this.a, "draft_preview_content_type", str);
    }

    public final void s(Uri uri) {
        if (uri == null) {
            this.a.putNull("draft_preview_uri");
        } else {
            this.a.put("draft_preview_uri", uri.toString());
        }
    }

    public final void t() {
        this.a.putNull("draft_preview_uri");
    }

    public final void u(String str) {
        dqru.v(this.a, "draft_snippet_text", cssq.a(str));
    }

    public final void v(String str) {
        dqru.v(this.a, "draft_subject_text", cssq.a(str));
    }

    public final void w(cbqz cbqzVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60180) {
            dqru.x("encryption_protocol", iIntValue2);
        }
        if (iIntValue >= 60180) {
            if (cbqzVar == null) {
                this.a.putNull("encryption_protocol");
            } else {
                this.a.put("encryption_protocol", Long.valueOf(cbqy.a(cbqzVar)));
            }
        }
    }

    public final void x(avoe avoeVar) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 58140) {
            dqru.x("error_state", iIntValue2);
        }
        if (iIntValue >= 58140) {
            if (avoeVar == null) {
                this.a.putNull("error_state");
            } else {
                this.a.put("error_state", Integer.valueOf(avoeVar.a()));
            }
        }
    }

    public final void y(boolean z) {
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 59210) {
            dqru.x("has_been_e2ee", iIntValue2);
        }
        if (iIntValue >= 59210) {
            this.a.put("has_been_e2ee", Boolean.valueOf(z));
        }
    }

    public final void z(String str) {
        dqru.v(this.a, "icon", str);
    }
}
