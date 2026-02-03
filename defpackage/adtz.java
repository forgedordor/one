package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adtz extends dqpd {
    public String J;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public boolean T;
    private String W;
    private int X;
    private long Y;
    public String a;
    public String b;
    public String c;
    public Uri d;
    public String e;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public String l;
    public String m;
    public String w;
    private ConversationIdType U = barn.a;
    public boolean f = false;
    public bvdk k = bvdk.UNARCHIVED;
    private long V = 0;
    public int n = 0;
    public boolean o = true;
    public boolean p = false;
    public int q = 0;
    public long r = -1;
    public int s = 0;
    public int t = 0;
    public boolean u = false;
    public boolean v = false;
    public boolean x = true;
    public boolean y = false;
    public cins z = cins.a;
    public MessageIdType A = bary.a;
    public long B = 0;
    public long C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public int G = 0;
    public int H = 0;
    public int I = -1;
    public int K = -2;
    public long S = 0;

    protected adtz() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "HomeScreenQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_content_type: %s,\n  reminders.reminders_trigger_time: %s,\n  conversation_pin.conversation_pin_pin_status: %s\n]\n", String.valueOf(this.U), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.V), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.W), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.X), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.Y), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        aeur.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        aeuk aeukVar = (aeuk) dqqjVar;
        aC();
        this.cN = aeukVar.cV();
        if (aeukVar.dj(0)) {
            this.U = new ConversationIdType(aeukVar.getLong(aeukVar.cO(0, aeur.a)));
            fN(0);
        }
        if (aeukVar.dj(1)) {
            this.a = aeukVar.getString(aeukVar.cO(1, aeur.a));
            fN(1);
        }
        if (aeukVar.dj(2)) {
            this.b = cssq.a(aeukVar.getString(aeukVar.cO(2, aeur.a)));
            fN(2);
        }
        if (aeukVar.dj(3)) {
            this.c = cssq.a(aeukVar.getString(aeukVar.cO(3, aeur.a)));
            fN(3);
        }
        if (aeukVar.dj(4)) {
            String string = aeukVar.getString(aeukVar.cO(4, aeur.a));
            this.d = string == null ? null : Uri.parse(string);
            fN(4);
        }
        if (aeukVar.dj(5)) {
            this.e = aeukVar.getString(aeukVar.cO(5, aeur.a));
            fN(5);
        }
        if (aeukVar.dj(6)) {
            this.f = aeukVar.getInt(aeukVar.cO(6, aeur.a)) == 1;
            fN(6);
        }
        if (aeukVar.dj(7)) {
            this.g = cssq.a(aeukVar.getString(aeukVar.cO(7, aeur.a)));
            fN(7);
        }
        if (aeukVar.dj(8)) {
            this.h = cssq.a(aeukVar.getString(aeukVar.cO(8, aeur.a)));
            fN(8);
        }
        if (aeukVar.dj(9)) {
            String string2 = aeukVar.getString(aeukVar.cO(9, aeur.a));
            this.i = string2 == null ? null : Uri.parse(string2);
            fN(9);
        }
        if (aeukVar.dj(10)) {
            this.j = aeukVar.getString(aeukVar.cO(10, aeur.a));
            fN(10);
        }
        if (aeukVar.dj(11)) {
            this.k = bvdk.a(aeukVar.getInt(aeukVar.cO(11, aeur.a)));
            fN(11);
        }
        if (aeukVar.dj(12)) {
            this.V = aeukVar.getLong(aeukVar.cO(12, aeur.a));
            fN(12);
        }
        if (aeukVar.dj(13)) {
            this.l = aeukVar.getString(aeukVar.cO(13, aeur.a));
            fN(13);
        }
        if (aeukVar.dj(14)) {
            this.m = aeukVar.getString(aeukVar.cO(14, aeur.a));
            fN(14);
        }
        if (aeukVar.dj(15)) {
            this.W = aeukVar.getString(aeukVar.cO(15, aeur.a));
            fN(15);
        }
        if (aeukVar.dj(16)) {
            this.n = aeukVar.getInt(aeukVar.cO(16, aeur.a));
            fN(16);
        }
        if (aeukVar.dj(17)) {
            this.o = aeukVar.getInt(aeukVar.cO(17, aeur.a)) == 1;
            fN(17);
        }
        if (aeukVar.dj(18)) {
            this.p = aeukVar.getInt(aeukVar.cO(18, aeur.a)) == 1;
            fN(18);
        }
        if (aeukVar.dj(19)) {
            this.q = aeukVar.getInt(aeukVar.cO(19, aeur.a));
            fN(19);
        }
        if (aeukVar.dj(20)) {
            this.r = aeukVar.getLong(aeukVar.cO(20, aeur.a));
            fN(20);
        }
        if (aeukVar.dj(21)) {
            this.s = aeukVar.getInt(aeukVar.cO(21, aeur.a));
            fN(21);
        }
        if (aeukVar.dj(22)) {
            this.t = aeukVar.getInt(aeukVar.cO(22, aeur.a));
            fN(22);
        }
        if (aeukVar.dj(23)) {
            this.u = aeukVar.getInt(aeukVar.cO(23, aeur.a)) == 1;
            fN(23);
        }
        if (aeukVar.dj(24)) {
            this.v = aeukVar.getInt(aeukVar.cO(24, aeur.a)) == 1;
            fN(24);
        }
        if (aeukVar.dj(25)) {
            this.w = cssq.a(aeukVar.getString(aeukVar.cO(25, aeur.a)));
            fN(25);
        }
        if (aeukVar.dj(26)) {
            this.x = aeukVar.getInt(aeukVar.cO(26, aeur.a)) == 1;
            fN(26);
        }
        if (aeukVar.dj(27)) {
            this.y = aeukVar.getInt(aeukVar.cO(27, aeur.a)) == 1;
            fN(27);
        }
        if (aeukVar.dj(28)) {
            cins[] cinsVarArrValues = cins.values();
            int i = aeukVar.getInt(aeukVar.cO(28, aeur.a));
            if (i >= cinsVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.z = cinsVarArrValues[i];
            fN(28);
        }
        if (aeukVar.dj(29)) {
            this.X = aeukVar.getInt(aeukVar.cO(29, aeur.a));
            fN(29);
        }
        if (aeukVar.dj(30)) {
            this.A = new MessageIdType(aeukVar.getLong(aeukVar.cO(30, aeur.a)));
            fN(30);
        }
        if (aeukVar.dj(31)) {
            this.B = aeukVar.getLong(aeukVar.cO(31, aeur.a));
            fN(31);
        }
        if (aeukVar.dj(32)) {
            this.C = aeukVar.getLong(aeukVar.cO(32, aeur.a));
            fN(32);
        }
        if (aeukVar.dj(33)) {
            this.D = aeukVar.getInt(aeukVar.cO(33, aeur.a));
            fN(33);
        }
        if (aeukVar.dj(34)) {
            this.E = aeukVar.getInt(aeukVar.cO(34, aeur.a));
            fN(34);
        }
        if (aeukVar.dj(35)) {
            this.F = aeukVar.getInt(aeukVar.cO(35, aeur.a)) == 1;
            fN(35);
        }
        if (aeukVar.dj(36)) {
            this.G = aeukVar.getInt(aeukVar.cO(36, aeur.a));
            fN(36);
        }
        if (aeukVar.dj(37)) {
            this.H = aeukVar.getInt(aeukVar.cO(37, aeur.a));
            fN(37);
        }
        if (aeukVar.dj(38)) {
            this.I = aeukVar.getInt(aeukVar.cO(38, aeur.a));
            fN(38);
        }
        if (aeukVar.dj(39)) {
            this.J = aeukVar.getString(aeukVar.cO(39, aeur.a));
            fN(39);
        }
        if (aeukVar.dj(40)) {
            this.K = aeukVar.getInt(aeukVar.cO(40, aeur.a));
            fN(40);
        }
        if (aeukVar.dj(41)) {
            this.L = cssb.a(aeukVar.getString(aeukVar.cO(41, aeur.a)));
            fN(41);
        }
        if (aeukVar.dj(42)) {
            this.M = cssq.a(aeukVar.getString(aeukVar.cO(42, aeur.a)));
            fN(42);
        }
        if (aeukVar.dj(43)) {
            this.N = cssq.a(aeukVar.getString(aeukVar.cO(43, aeur.a)));
            fN(43);
        }
        if (aeukVar.dj(44)) {
            this.Y = aeukVar.getLong(aeukVar.cO(44, aeur.a));
            fN(44);
        }
        if (aeukVar.dj(45)) {
            this.O = cssq.a(aeukVar.getString(aeukVar.cO(45, aeur.a)));
            fN(45);
        }
        if (aeukVar.dj(46)) {
            this.P = cssq.a(aeukVar.getString(aeukVar.cO(46, aeur.a)));
            fN(46);
        }
        if (aeukVar.dj(47)) {
            this.Q = aeukVar.getString(aeukVar.cO(47, aeur.a));
            fN(47);
        }
        if (aeukVar.dj(48)) {
            this.R = aeukVar.getString(aeukVar.cO(48, aeur.a));
            fN(48);
        }
        if (aeukVar.dj(49)) {
            this.S = aeukVar.getLong(aeukVar.cO(49, aeur.a));
            fN(49);
        }
        if (aeukVar.dj(50)) {
            this.T = aeukVar.getInt(aeukVar.cO(50, aeur.a)) == 1;
            fN(50);
        }
    }

    public final long d() {
        aA(12, "sort_timestamp");
        return this.V;
    }

    public final ConversationIdType e() {
        aA(0, "_id");
        return this.U;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adtz)) {
            return false;
        }
        adtz adtzVar = (adtz) obj;
        return super.aE(adtzVar.cN) && Objects.equals(this.U, adtzVar.U) && Objects.equals(this.a, adtzVar.a) && Objects.equals(this.b, adtzVar.b) && Objects.equals(this.c, adtzVar.c) && Objects.equals(this.d, adtzVar.d) && Objects.equals(this.e, adtzVar.e) && this.f == adtzVar.f && Objects.equals(this.g, adtzVar.g) && Objects.equals(this.h, adtzVar.h) && Objects.equals(this.i, adtzVar.i) && Objects.equals(this.j, adtzVar.j) && this.k == adtzVar.k && this.V == adtzVar.V && Objects.equals(this.l, adtzVar.l) && Objects.equals(this.m, adtzVar.m) && Objects.equals(this.W, adtzVar.W) && this.n == adtzVar.n && this.o == adtzVar.o && this.p == adtzVar.p && this.q == adtzVar.q && this.r == adtzVar.r && this.s == adtzVar.s && this.t == adtzVar.t && this.u == adtzVar.u && this.v == adtzVar.v && Objects.equals(this.w, adtzVar.w) && this.x == adtzVar.x && this.y == adtzVar.y && this.z == adtzVar.z && this.X == adtzVar.X && Objects.equals(this.A, adtzVar.A) && this.B == adtzVar.B && this.C == adtzVar.C && this.D == adtzVar.D && this.E == adtzVar.E && this.F == adtzVar.F && this.G == adtzVar.G && this.H == adtzVar.H && this.I == adtzVar.I && Objects.equals(this.J, adtzVar.J) && this.K == adtzVar.K && Objects.equals(this.L, adtzVar.L) && Objects.equals(this.M, adtzVar.M) && Objects.equals(this.N, adtzVar.N) && this.Y == adtzVar.Y && Objects.equals(this.O, adtzVar.O) && Objects.equals(this.P, adtzVar.P) && Objects.equals(this.Q, adtzVar.Q) && Objects.equals(this.R, adtzVar.R) && this.S == adtzVar.S && this.T == adtzVar.T;
    }

    public final String f() {
        aA(15, "participant_normalized_destination");
        return this.W;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.U;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Uri uri = this.d;
        String str4 = this.e;
        Boolean boolValueOf = Boolean.valueOf(this.f);
        String str5 = this.g;
        String str6 = this.h;
        Uri uri2 = this.i;
        String str7 = this.j;
        bvdk bvdkVar = this.k;
        Long lValueOf = Long.valueOf(this.V);
        String str8 = this.l;
        String str9 = this.m;
        dqqe dqqeVar3 = dqqeVar2;
        String str10 = this.W;
        Integer numValueOf = Integer.valueOf(this.n);
        Boolean boolValueOf2 = Boolean.valueOf(this.o);
        Boolean boolValueOf3 = Boolean.valueOf(this.p);
        Integer numValueOf2 = Integer.valueOf(this.q);
        Long lValueOf2 = Long.valueOf(this.r);
        Integer numValueOf3 = Integer.valueOf(this.s);
        Integer numValueOf4 = Integer.valueOf(this.t);
        Boolean boolValueOf4 = Boolean.valueOf(this.u);
        Boolean boolValueOf5 = Boolean.valueOf(this.v);
        String str11 = this.w;
        Boolean boolValueOf6 = Boolean.valueOf(this.x);
        Boolean boolValueOf7 = Boolean.valueOf(this.y);
        cins cinsVar = this.z;
        return Objects.hash(dqqeVar3, conversationIdType, str, str2, str3, uri, str4, boolValueOf, str5, str6, uri2, str7, bvdkVar, lValueOf, str8, str9, str10, numValueOf, boolValueOf2, boolValueOf3, numValueOf2, lValueOf2, numValueOf3, numValueOf4, boolValueOf4, boolValueOf5, str11, boolValueOf6, boolValueOf7, Integer.valueOf(cinsVar == null ? 0 : cinsVar.ordinal()), Integer.valueOf(this.X), this.A, Long.valueOf(this.B), Long.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Integer.valueOf(this.I), this.J, Integer.valueOf(this.K), this.L, this.M, this.N, Long.valueOf(this.Y), this.O, this.P, this.Q, this.R, Long.valueOf(this.S), Boolean.valueOf(this.T), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "HomeScreenQuery -- REDACTED") : a();
    }
}
