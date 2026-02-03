package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bojh extends dqpd<bopr, bosz, botb, bojh, bopq> implements dqpf<ConversationIdType> {
    public String A;
    public axcm B;
    public awjl C;
    public int D;
    public boolean E;
    public String F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public int L;
    public long M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public String T;
    public String U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public String Z;
    public ConversationIdType a;
    public String aa;
    public String ab;
    public byte[] ac;
    public long ad;
    public long ae;
    public boolean af;
    public cigb ag;
    public boolean ah;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public avoe ak;
    public cpyi al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public cidt ar;
    public cins as;
    public int at;
    public cbqz au;
    public cbqx av;
    public String aw;
    public Uri ax;
    public int ay;
    public cnqj b;
    public String c;
    public bvdp d;
    public String e;
    public MessageIdType f;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public int p;
    public bvdk q;
    public long r;
    public long s;
    public String t;
    public long u;
    public long v;
    public String w;
    public String x;
    public String y;
    public String z;

    protected bojh() {
        ConversationIdType conversationIdType = barn.a;
        this.a = conversationIdType;
        this.b = new cnqj();
        this.d = bvdp.NAME_IS_AUTOMATIC;
        this.f = bary.a;
        this.k = false;
        this.p = 0;
        this.q = bvdk.UNARCHIVED;
        this.r = 0L;
        this.s = 0L;
        this.u = -1L;
        this.v = -1L;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = true;
        this.G = true;
        this.H = false;
        this.L = 0;
        this.M = -1L;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = 0L;
        this.V = false;
        this.W = 0;
        this.X = 0L;
        this.Y = 0L;
        this.ad = 0L;
        this.ae = -1L;
        this.af = true;
        this.ag = new cigb(0L);
        this.ah = false;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = avoe.b(0);
        this.al = cpyi.UNKNOWN;
        this.an = basb.b(-1L);
        this.ao = basb.b(-1L);
        this.ap = false;
        this.aq = false;
        this.as = cins.a;
        this.at = 0;
        this.au = new cbqz(0L);
        this.av = null;
    }

    public final avoe A() {
        aA(62, "error_state");
        return this.ak;
    }

    public final awjl B() {
        aA(28, "destination_token");
        return this.C;
    }

    public final ConversationIdType C() {
        aA(0, "_id");
        return this.a;
    }

    public final ConversationIdType D() {
        final dqsy dqsyVarF = botm.f();
        return new ConversationIdType(dqru.b(botm.f(), "conversations", this, new Function() { // from class: boiz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarF.P("conversations", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bojb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.ak((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final MessageIdType E() {
        aA(5, "latest_message_id");
        return this.f;
    }

    public final bojl F() {
        bojm bojmVar = new bojm();
        BitSet bitSet = this.cL;
        bojmVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = bojmVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            bojmVar.a = C();
        }
        BitSet bitSet3 = bojmVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            bojmVar.b = N();
        }
        BitSet bitSet4 = bojmVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            bojmVar.c = Y();
        }
        BitSet bitSet5 = bojmVar.az;
        if (bitSet5 == null || bitSet5.get(3)) {
            bojmVar.d = H();
        }
        BitSet bitSet6 = bojmVar.az;
        if (bitSet6 == null || bitSet6.get(4)) {
            aA(4, "subtitle");
            bojmVar.e = this.e;
        }
        BitSet bitSet7 = bojmVar.az;
        if (bitSet7 == null || bitSet7.get(5)) {
            bojmVar.f = E();
        }
        BitSet bitSet8 = bojmVar.az;
        if (bitSet8 == null || bitSet8.get(6)) {
            bojmVar.g = ah();
        }
        BitSet bitSet9 = bojmVar.az;
        if (bitSet9 == null || bitSet9.get(7)) {
            bojmVar.h = ai();
        }
        BitSet bitSet10 = bojmVar.az;
        if (bitSet10 == null || bitSet10.get(8)) {
            aA(8, "preview_uri");
            bojmVar.i = this.i;
        }
        BitSet bitSet11 = bojmVar.az;
        if (bitSet11 == null || bitSet11.get(9)) {
            bojmVar.j = ac();
        }
        BitSet bitSet12 = bojmVar.az;
        if (bitSet12 == null || bitSet12.get(10)) {
            bojmVar.k = at();
        }
        BitSet bitSet13 = bojmVar.az;
        if (bitSet13 == null || bitSet13.get(11)) {
            bojmVar.l = V();
        }
        BitSet bitSet14 = bojmVar.az;
        if (bitSet14 == null || bitSet14.get(12)) {
            bojmVar.m = W();
        }
        BitSet bitSet15 = bojmVar.az;
        if (bitSet15 == null || bitSet15.get(13)) {
            bojmVar.n = y();
        }
        BitSet bitSet16 = bojmVar.az;
        if (bitSet16 == null || bitSet16.get(14)) {
            bojmVar.o = U();
        }
        BitSet bitSet17 = bojmVar.az;
        if (bitSet17 == null || bitSet17.get(15)) {
            bojmVar.p = m();
        }
        BitSet bitSet18 = bojmVar.az;
        if (bitSet18 == null || bitSet18.get(16)) {
            bojmVar.q = G();
        }
        BitSet bitSet19 = bojmVar.az;
        if (bitSet19 == null || bitSet19.get(17)) {
            bojmVar.r = x();
        }
        BitSet bitSet20 = bojmVar.az;
        if (bitSet20 == null || bitSet20.get(18)) {
            aA(18, "last_read_timestamp");
            bojmVar.s = this.s;
        }
        BitSet bitSet21 = bojmVar.az;
        if (bitSet21 == null || bitSet21.get(19)) {
            bojmVar.t = X();
        }
        BitSet bitSet22 = bojmVar.az;
        if (bitSet22 == null || bitSet22.get(20)) {
            aA(20, "participant_contact_id");
            bojmVar.u = this.u;
        }
        BitSet bitSet23 = bojmVar.az;
        if (bitSet23 == null || bitSet23.get(21)) {
            aA(21, "normalized_participant_contact_id");
            bojmVar.v = this.v;
        }
        BitSet bitSet24 = bojmVar.az;
        if (bitSet24 == null || bitSet24.get(22)) {
            aA(22, "participant_lookup_key");
            bojmVar.w = this.w;
        }
        BitSet bitSet25 = bojmVar.az;
        if (bitSet25 == null || bitSet25.get(23)) {
            aA(23, "normalized_participant_lookup_key");
            bojmVar.x = this.x;
        }
        BitSet bitSet26 = bojmVar.az;
        if (bitSet26 == null || bitSet26.get(24)) {
            bojmVar.y = ab();
        }
        BitSet bitSet27 = bojmVar.az;
        if (bitSet27 == null || bitSet27.get(25)) {
            aA(25, "participant_comparable_destination");
            bojmVar.z = this.z;
        }
        BitSet bitSet28 = bojmVar.az;
        if (bitSet28 == null || bitSet28.get(26)) {
            bojmVar.A = T();
        }
        BitSet bitSet29 = bojmVar.az;
        if (bitSet29 == null || bitSet29.get(27)) {
            aA(27, "current_my_identity_foreign_key");
            bojmVar.B = this.B;
        }
        BitSet bitSet30 = bojmVar.az;
        if (bitSet30 == null || bitSet30.get(28)) {
            bojmVar.C = B();
        }
        BitSet bitSet31 = bojmVar.az;
        if (bitSet31 == null || bitSet31.get(29)) {
            bojmVar.D = q();
        }
        BitSet bitSet32 = bojmVar.az;
        if (bitSet32 == null || bitSet32.get(30)) {
            bojmVar.E = aq();
        }
        BitSet bitSet33 = bojmVar.az;
        if (bitSet33 == null || bitSet33.get(31)) {
            bojmVar.F = Z();
        }
        BitSet bitSet34 = bojmVar.az;
        if (bitSet34 == null || bitSet34.get(32)) {
            bojmVar.G = ar();
        }
        BitSet bitSet35 = bojmVar.az;
        if (bitSet35 == null || bitSet35.get(33)) {
            bojmVar.H = ao();
        }
        BitSet bitSet36 = bojmVar.az;
        if (bitSet36 == null || bitSet36.get(34)) {
            bojmVar.I = ag();
        }
        BitSet bitSet37 = bojmVar.az;
        if (bitSet37 == null || bitSet37.get(35)) {
            bojmVar.J = aa();
        }
        BitSet bitSet38 = bojmVar.az;
        if (bitSet38 == null || bitSet38.get(36)) {
            aA(36, "normalized_participant_id_list");
            bojmVar.K = this.K;
        }
        BitSet bitSet39 = bojmVar.az;
        if (bitSet39 == null || bitSet39.get(37)) {
            bojmVar.L = s();
        }
        BitSet bitSet40 = bojmVar.az;
        if (bitSet40 == null || bitSet40.get(38)) {
            bojmVar.M = v();
        }
        BitSet bitSet41 = bojmVar.az;
        if (bitSet41 == null || bitSet41.get(39)) {
            bojmVar.N = n();
        }
        BitSet bitSet42 = bojmVar.az;
        if (bitSet42 == null || bitSet42.get(40)) {
            bojmVar.O = k();
        }
        BitSet bitSet43 = bojmVar.az;
        if (bitSet43 == null || bitSet43.get(41)) {
            bojmVar.P = r();
        }
        BitSet bitSet44 = bojmVar.az;
        if (bitSet44 == null || bitSet44.get(42)) {
            aA(42, "IS_ENTERPRISE");
            bojmVar.Q = this.Q;
        }
        BitSet bitSet45 = bojmVar.az;
        if (bitSet45 == null || bitSet45.get(43)) {
            bojmVar.R = an();
        }
        BitSet bitSet46 = bojmVar.az;
        if (bitSet46 == null || bitSet46.get(44)) {
            aA(44, "last_interactive_event_timestamp");
            bojmVar.S = this.S;
        }
        BitSet bitSet47 = bojmVar.az;
        if (bitSet47 == null || bitSet47.get(45)) {
            aA(45, "participant_display_destination");
            bojmVar.T = this.T;
        }
        BitSet bitSet48 = bojmVar.az;
        if (bitSet48 == null || bitSet48.get(46)) {
            aA(46, "normalized_participant_display_destination");
            bojmVar.U = this.U;
        }
        BitSet bitSet49 = bojmVar.az;
        if (bitSet49 == null || bitSet49.get(47)) {
            bojmVar.V = au();
        }
        BitSet bitSet50 = bojmVar.az;
        if (bitSet50 == null || bitSet50.get(48)) {
            bojmVar.W = p();
        }
        BitSet bitSet51 = bojmVar.az;
        if (bitSet51 == null || bitSet51.get(49)) {
            aA(49, "last_logged_scooby_metadata_timestamp");
            bojmVar.X = this.X;
        }
        BitSet bitSet52 = bojmVar.az;
        if (bitSet52 == null || bitSet52.get(50)) {
            bojmVar.Y = u();
        }
        BitSet bitSet53 = bojmVar.az;
        if (bitSet53 == null || bitSet53.get(51)) {
            bojmVar.Z = S();
        }
        BitSet bitSet54 = bojmVar.az;
        if (bitSet54 == null || bitSet54.get(52)) {
            bojmVar.aa = ae();
        }
        BitSet bitSet55 = bojmVar.az;
        if (bitSet55 == null || bitSet55.get(53)) {
            bojmVar.ab = ad();
        }
        BitSet bitSet56 = bojmVar.az;
        if (bitSet56 == null || bitSet56.get(54)) {
            bojmVar.ac = av();
        }
        BitSet bitSet57 = bojmVar.az;
        if (bitSet57 == null || bitSet57.get(55)) {
            bojmVar.ad = t();
        }
        BitSet bitSet58 = bojmVar.az;
        if (bitSet58 == null || bitSet58.get(56)) {
            bojmVar.ae = w();
        }
        BitSet bitSet59 = bojmVar.az;
        if (bitSet59 == null || bitSet59.get(57)) {
            bojmVar.af = as();
        }
        BitSet bitSet60 = bojmVar.az;
        if (bitSet60 == null || bitSet60.get(58)) {
            bojmVar.ag = L();
        }
        BitSet bitSet61 = bojmVar.az;
        if (bitSet61 == null || bitSet61.get(59)) {
            bojmVar.ah = al();
        }
        BitSet bitSet62 = bojmVar.az;
        if (bitSet62 == null || bitSet62.get(60)) {
            aA(60, "duplicate_of");
            bojmVar.ai = this.ai;
        }
        BitSet bitSet63 = bojmVar.az;
        if (bitSet63 == null || bitSet63.get(61)) {
            aA(61, "new_duplicate_of");
            bojmVar.aj = this.aj;
        }
        BitSet bitSet64 = bojmVar.az;
        if (bitSet64 == null || bitSet64.get(62)) {
            bojmVar.ak = A();
        }
        BitSet bitSet65 = bojmVar.az;
        if (bitSet65 == null || bitSet65.get(63)) {
            bojmVar.al = O();
        }
        BitSet bitSet66 = bojmVar.az;
        if (bitSet66 == null || bitSet66.get(64)) {
            bojmVar.am = af();
        }
        BitSet bitSet67 = bojmVar.az;
        if (bitSet67 == null || bitSet67.get(65)) {
            bojmVar.an = Q();
        }
        BitSet bitSet68 = bojmVar.az;
        if (bitSet68 == null || bitSet68.get(66)) {
            bojmVar.ao = P();
        }
        BitSet bitSet69 = bojmVar.az;
        if (bitSet69 == null || bitSet69.get(67)) {
            bojmVar.ap = am();
        }
        BitSet bitSet70 = bojmVar.az;
        if (bitSet70 == null || bitSet70.get(68)) {
            bojmVar.aq = ap();
        }
        BitSet bitSet71 = bojmVar.az;
        if (bitSet71 == null || bitSet71.get(69)) {
            bojmVar.ar = K();
        }
        BitSet bitSet72 = bojmVar.az;
        if (bitSet72 == null || bitSet72.get(70)) {
            bojmVar.as = M();
        }
        BitSet bitSet73 = bojmVar.az;
        if (bitSet73 == null || bitSet73.get(71)) {
            bojmVar.at = o();
        }
        BitSet bitSet74 = bojmVar.az;
        if (bitSet74 == null || bitSet74.get(72)) {
            bojmVar.au = J();
        }
        BitSet bitSet75 = bojmVar.az;
        if (bitSet75 == null || bitSet75.get(73)) {
            bojmVar.av = I();
        }
        BitSet bitSet76 = bojmVar.az;
        if (bitSet76 == null || bitSet76.get(74)) {
            bojmVar.aw = R();
        }
        BitSet bitSet77 = bojmVar.az;
        if (bitSet77 == null || bitSet77.get(75)) {
            bojmVar.ax = z();
        }
        BitSet bitSet78 = bojmVar.az;
        if (bitSet78 != null && !bitSet78.get(76)) {
            return bojmVar;
        }
        aA(76, "unread_count");
        bojmVar.ay = this.ay;
        return bojmVar;
    }

    public final bvdk G() {
        aA(16, "archive_status");
        return this.q;
    }

    public final bvdp H() {
        aA(3, "name_is_automatic");
        return this.d;
    }

    public final cbqx I() {
        aA(73, "encryption_id");
        return this.av;
    }

    public final cbqz J() {
        aA(72, "encryption_protocol");
        return this.au;
    }

    public final cidt K() {
        aA(69, "custom_theme");
        return this.ar;
    }

    public final cigb L() {
        aA(58, "rcs_group_capabilities");
        return this.ag;
    }

    public final cins M() {
        aA(70, "mms_group_upgrade_status");
        return this.as;
    }

    public final cnqj N() {
        aA(1, "sms_thread_id");
        return this.b;
    }

    public final cpyi O() {
        aA(63, "cms_life_cycle");
        return this.al;
    }

    public final Optional P() {
        aA(66, "rcs_group_last_sync_timestamp");
        return this.ao;
    }

    public final Optional Q() {
        aA(65, "recipient_offline_timestamp_ms");
        return this.an;
    }

    public final String R() {
        aA(74, "cms_correlation_id");
        return this.aw;
    }

    public final String S() {
        aA(51, "cms_id");
        return this.Z;
    }

    public final String T() {
        aA(26, "current_self_id");
        return this.A;
    }

    public final String U() {
        aA(14, "draft_preview_content_type");
        return this.o;
    }

    public final String V() {
        aA(11, "draft_snippet_text");
        return this.l;
    }

    public final String W() {
        aA(12, "draft_subject_text");
        return this.m;
    }

    public final String X() {
        aA(19, "icon");
        return this.t;
    }

    public final String Y() {
        aA(2, "name");
        return this.c;
    }

    public final String Z() {
        aA(31, "notification_sound_uri");
        return this.F;
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        String strValueOf12 = String.valueOf(this.l);
        String strValueOf13 = String.valueOf(this.m);
        String strValueOf14 = String.valueOf(this.n);
        String strValueOf15 = String.valueOf(this.o);
        String strValueOf16 = String.valueOf(this.p);
        String strValueOf17 = String.valueOf(this.q);
        String strValueOf18 = String.valueOf(this.r);
        String strValueOf19 = String.valueOf(this.s);
        String strValueOf20 = String.valueOf(this.t);
        String strValueOf21 = String.valueOf(this.u);
        String strValueOf22 = String.valueOf(this.v);
        String strValueOf23 = String.valueOf(this.w);
        String strValueOf24 = String.valueOf(this.x);
        String strValueOf25 = String.valueOf(this.y);
        String strValueOf26 = String.valueOf(this.z);
        String strValueOf27 = String.valueOf(this.A);
        String strValueOf28 = String.valueOf(this.B);
        String strValueOf29 = String.valueOf(this.C);
        String strValueOf30 = String.valueOf(this.D);
        String strValueOf31 = String.valueOf(this.E);
        String strValueOf32 = String.valueOf(this.F);
        String strValueOf33 = String.valueOf(this.G);
        String strValueOf34 = String.valueOf(this.H);
        String strValueOf35 = String.valueOf(this.I);
        String strValueOf36 = String.valueOf(this.J);
        String strValueOf37 = String.valueOf(this.K);
        String strValueOf38 = String.valueOf(this.L);
        String strValueOf39 = String.valueOf(this.M);
        String strValueOf40 = String.valueOf(this.N);
        String strValueOf41 = String.valueOf(this.O);
        String strValueOf42 = String.valueOf(this.P);
        String strValueOf43 = String.valueOf(this.Q);
        String strValueOf44 = String.valueOf(this.R);
        String strValueOf45 = String.valueOf(this.S);
        String strValueOf46 = String.valueOf(this.T);
        String strValueOf47 = String.valueOf(this.U);
        String strValueOf48 = String.valueOf(this.V);
        String strValueOf49 = String.valueOf(this.W);
        String strValueOf50 = String.valueOf(this.X);
        String strValueOf51 = String.valueOf(this.Y);
        String strValueOf52 = String.valueOf(this.Z);
        String strValueOf53 = String.valueOf(this.aa);
        String strValueOf54 = String.valueOf(this.ab);
        byte[] bArr = this.ac;
        return String.format(locale, "ConversationsTable [_id: %s,\n  sms_thread_id: %s,\n  name: %s,\n  name_is_automatic: %s,\n  subtitle: %s,\n  latest_message_id: %s,\n  snippet_text: %s,\n  subject_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  show_draft: %s,\n  draft_snippet_text: %s,\n  draft_subject_text: %s,\n  draft_preview_uri: %s,\n  draft_preview_content_type: %s,\n  etouffee_default: %s,\n  archive_status: %s,\n  sort_timestamp: %s,\n  last_read_timestamp: %s,\n  icon: %s,\n  participant_contact_id: %s,\n  normalized_participant_contact_id: %s,\n  participant_lookup_key: %s,\n  normalized_participant_lookup_key: %s,\n  participant_normalized_destination: %s,\n  participant_comparable_destination: %s,\n  current_self_id: %s,\n  current_my_identity_foreign_key: %s,\n  destination_token: %s,\n  participant_count: %s,\n  notification_enabled: %s,\n  notification_sound_uri: %s,\n  notification_vibration: %s,\n  include_email_addr: %s,\n  sms_service_center: %s,\n  participant_id_list: %s,\n  normalized_participant_id_list: %s,\n  source_type: %s,\n  rcs_session_id: %s,\n  join_state: %s,\n  conv_type: %s,\n  send_mode: %s,\n  IS_ENTERPRISE: %s,\n  has_ea2p_bot_recipient: %s,\n  last_interactive_event_timestamp: %s,\n  participant_display_destination: %s,\n  normalized_participant_display_destination: %s,\n  spam_warning_dismiss_status: %s,\n  open_count: %s,\n  last_logged_scooby_metadata_timestamp: %s,\n  delete_timestamp: %s,\n  cms_id: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  tachygram_group_routing_info_token: %s,\n  cms_most_recent_read_message_timestamp_ms: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  rcs_session_allows_revocation: %s,\n  rcs_group_capabilities: %s,\n  awaiting_reverse_sync: %s,\n  duplicate_of: %s,\n  new_duplicate_of: %s,\n  error_state: %s,\n  cms_life_cycle: %s,\n  rcs_group_self_msisdn: %s,\n  recipient_offline_timestamp_ms: %s,\n  rcs_group_last_sync_timestamp: %s,\n  has_been_e2ee: %s,\n  marked_as_unread: %s,\n  custom_theme: %s,\n  mms_group_upgrade_status: %s,\n  mms_group_upgrade_retries: %s,\n  encryption_protocol: %s,\n  encryption_id: %s,\n  cms_correlation_id: %s,\n  rcs_group_icon_url: %s,\n  unread_count: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, strValueOf39, strValueOf40, strValueOf41, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strValueOf47, strValueOf48, strValueOf49, strValueOf50, strValueOf51, strValueOf52, strValueOf53, strValueOf54, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay));
    }

    public final String aa() {
        aA(35, "participant_id_list");
        return this.J;
    }

    public final String ab() {
        aA(24, "participant_normalized_destination");
        return this.y;
    }

    public final String ac() {
        aA(9, "preview_content_type");
        return this.j;
    }

    public final String ad() {
        aA(53, "rcs_conference_uri");
        return this.ab;
    }

    public final String ae() {
        aA(52, "rcs_group_id");
        return this.aa;
    }

    public final String af() {
        aA(64, "rcs_group_self_msisdn");
        return this.am;
    }

    public final String ag() {
        aA(34, "sms_service_center");
        return this.I;
    }

    public final String ah() {
        aA(6, "snippet_text");
        return this.g;
    }

    public final String ai() {
        aA(7, "subject_text");
        return this.h;
    }

    public final /* synthetic */ void aj(Long l) {
        if (l.longValue() >= 0) {
            this.a = new ConversationIdType(l.longValue());
            super.fN(0);
        }
    }

    public final /* synthetic */ void ak(Long l) {
        if (l.longValue() >= 0) {
            this.a = new ConversationIdType(l.longValue());
            super.fN(0);
        }
    }

    public final boolean al() {
        aA(59, "awaiting_reverse_sync");
        return this.ah;
    }

    public final boolean am() {
        aA(67, "has_been_e2ee");
        return this.ap;
    }

    public final boolean an() {
        aA(43, "has_ea2p_bot_recipient");
        return this.R;
    }

    public final boolean ao() {
        aA(33, "include_email_addr");
        return this.H;
    }

    public final boolean ap() {
        aA(68, "marked_as_unread");
        return this.aq;
    }

    public final boolean aq() {
        aA(30, "notification_enabled");
        return this.E;
    }

    public final boolean ar() {
        aA(32, "notification_vibration");
        return this.G;
    }

    public final boolean as() {
        aA(57, "rcs_session_allows_revocation");
        return this.af;
    }

    public final boolean at() {
        aA(10, "show_draft");
        return this.k;
    }

    public final boolean au() {
        aA(47, "spam_warning_dismiss_status");
        return this.V;
    }

    public final byte[] av() {
        aA(54, "tachygram_group_routing_info_token");
        return this.ac;
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = botm.g().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(barn.a(this.a)));
        }
        cnqj cnqjVar = this.b;
        if (cnqjVar == null) {
            contentValues.putNull("sms_thread_id");
        } else {
            contentValues.put("sms_thread_id", Long.valueOf(cnqk.a(cnqjVar)));
        }
        dqru.v(contentValues, "name", this.c);
        if (iIntValue >= 10012) {
            bvdp bvdpVar = this.d;
            if (bvdpVar == null) {
                contentValues.putNull("name_is_automatic");
            } else {
                contentValues.put("name_is_automatic", Integer.valueOf(bvdpVar.ordinal()));
            }
        }
        if (iIntValue >= 59760) {
            dqru.v(contentValues, "subtitle", this.e);
        }
        MessageIdType messageIdType = this.f;
        if (messageIdType == null) {
            contentValues.putNull("latest_message_id");
        } else {
            contentValues.put("latest_message_id", Long.valueOf(bary.a(messageIdType)));
        }
        dqru.v(contentValues, "snippet_text", this.g);
        dqru.v(contentValues, "subject_text", this.h);
        Uri uri = this.i;
        if (uri == null) {
            contentValues.putNull("preview_uri");
        } else {
            contentValues.put("preview_uri", uri.toString());
        }
        dqru.v(contentValues, "preview_content_type", this.j);
        contentValues.put("show_draft", Boolean.valueOf(this.k));
        dqru.v(contentValues, "draft_snippet_text", this.l);
        dqru.v(contentValues, "draft_subject_text", this.m);
        Uri uri2 = this.n;
        if (uri2 == null) {
            contentValues.putNull("draft_preview_uri");
        } else {
            contentValues.put("draft_preview_uri", uri2.toString());
        }
        dqru.v(contentValues, "draft_preview_content_type", this.o);
        if (iIntValue >= 29060) {
            contentValues.put("etouffee_default", Integer.valueOf(this.p));
        }
        bvdk bvdkVar = this.q;
        if (bvdkVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(bvdkVar.h));
        }
        contentValues.put("sort_timestamp", Long.valueOf(this.r));
        contentValues.put("last_read_timestamp", Long.valueOf(this.s));
        dqru.v(contentValues, "icon", this.t);
        contentValues.put("participant_contact_id", Long.valueOf(this.u));
        if (iIntValue >= 58090) {
            contentValues.put("normalized_participant_contact_id", Long.valueOf(this.v));
        }
        dqru.v(contentValues, "participant_lookup_key", this.w);
        if (iIntValue >= 58090) {
            dqru.v(contentValues, "normalized_participant_lookup_key", this.x);
        }
        dqru.v(contentValues, "participant_normalized_destination", this.y);
        if (iIntValue >= 58090) {
            dqru.v(contentValues, "participant_comparable_destination", this.z);
        }
        dqru.v(contentValues, "current_self_id", this.A);
        if (iIntValue >= 60160) {
            axcm axcmVar = this.B;
            if (axcmVar == null || axcmVar.equals(null)) {
                contentValues.putNull("current_my_identity_foreign_key");
            } else {
                contentValues.put("current_my_identity_foreign_key", axcn.b(this.B));
            }
        }
        if (iIntValue >= 60360) {
            awjl awjlVar = this.C;
            if (awjlVar == null || awjlVar.equals(null)) {
                contentValues.putNull("destination_token");
            } else {
                contentValues.put("destination_token", awjm.b(this.C));
            }
        }
        contentValues.put("participant_count", Integer.valueOf(this.D));
        contentValues.put("notification_enabled", Boolean.valueOf(this.E));
        dqru.v(contentValues, "notification_sound_uri", this.F);
        contentValues.put("notification_vibration", Boolean.valueOf(this.G));
        contentValues.put("include_email_addr", Boolean.valueOf(this.H));
        dqru.v(contentValues, "sms_service_center", this.I);
        if (iIntValue >= 8500) {
            dqru.v(contentValues, "participant_id_list", this.J);
        }
        if (iIntValue >= 58090) {
            dqru.v(contentValues, "normalized_participant_id_list", this.K);
        }
        if (iIntValue >= 8500) {
            contentValues.put("source_type", Integer.valueOf(this.L));
        }
        if (iIntValue >= 10000) {
            contentValues.put("rcs_session_id", Long.valueOf(this.M));
        }
        if (iIntValue >= 10006) {
            contentValues.put("join_state", Integer.valueOf(this.N));
        }
        if (iIntValue >= 10007) {
            contentValues.put("conv_type", Integer.valueOf(this.O));
        }
        if (iIntValue >= 10016) {
            contentValues.put("send_mode", Integer.valueOf(this.P));
        }
        if (iIntValue >= 10018) {
            contentValues.put("IS_ENTERPRISE", Boolean.valueOf(this.Q));
        }
        if (iIntValue >= 12001) {
            contentValues.put("has_ea2p_bot_recipient", Boolean.valueOf(this.R));
        }
        if (iIntValue >= 15000) {
            contentValues.put("last_interactive_event_timestamp", Long.valueOf(this.S));
        }
        if (iIntValue >= 15010) {
            dqru.v(contentValues, "participant_display_destination", this.T);
        }
        if (iIntValue >= 58090) {
            dqru.v(contentValues, "normalized_participant_display_destination", this.U);
        }
        if (iIntValue >= 23000) {
            contentValues.put("spam_warning_dismiss_status", Boolean.valueOf(this.V));
        }
        if (iIntValue >= 26020) {
            contentValues.put("open_count", Integer.valueOf(this.W));
        }
        if (iIntValue >= 28010) {
            contentValues.put("last_logged_scooby_metadata_timestamp", Long.valueOf(this.X));
        }
        if (iIntValue >= 29020) {
            contentValues.put("delete_timestamp", Long.valueOf(this.Y));
        }
        if (iIntValue >= 32000) {
            dqru.v(contentValues, "cms_id", this.Z);
        }
        if (iIntValue >= 40050) {
            dqru.v(contentValues, "rcs_group_id", this.aa);
        }
        if (iIntValue >= 40050) {
            dqru.v(contentValues, "rcs_conference_uri", this.ab);
        }
        if (iIntValue >= 58120) {
            contentValues.put("tachygram_group_routing_info_token", this.ac);
        }
        if (iIntValue >= 53030) {
            contentValues.put("cms_most_recent_read_message_timestamp_ms", Long.valueOf(this.ad));
        }
        if (iIntValue >= 46050) {
            contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.ae));
        }
        if (iIntValue >= 48040) {
            contentValues.put("rcs_session_allows_revocation", Boolean.valueOf(this.af));
        }
        if (iIntValue >= 49020) {
            cigb cigbVar = this.ag;
            if (cigbVar == null) {
                contentValues.putNull("rcs_group_capabilities");
            } else {
                contentValues.put("rcs_group_capabilities", Long.valueOf(cigbVar.a));
            }
        }
        if (iIntValue >= 49060) {
            contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.ah));
        }
        if (iIntValue >= 58090) {
            ConversationIdType conversationIdType2 = this.ai;
            if (conversationIdType2 == null || conversationIdType2.equals(barn.a)) {
                contentValues.putNull("duplicate_of");
            } else {
                contentValues.put("duplicate_of", Long.valueOf(barn.a(this.ai)));
            }
        }
        if (iIntValue >= 59130) {
            ConversationIdType conversationIdType3 = this.aj;
            if (conversationIdType3 == null || conversationIdType3.equals(barn.a)) {
                contentValues.putNull("new_duplicate_of");
            } else {
                contentValues.put("new_duplicate_of", Long.valueOf(barn.a(this.aj)));
            }
        }
        if (iIntValue >= 58140) {
            avoe avoeVar = this.ak;
            if (avoeVar == null) {
                contentValues.putNull("error_state");
            } else {
                contentValues.put("error_state", Integer.valueOf(avoeVar.a()));
            }
        }
        if (iIntValue >= 58210) {
            cpyi cpyiVar = this.al;
            if (cpyiVar == null) {
                contentValues.putNull("cms_life_cycle");
            } else {
                contentValues.put("cms_life_cycle", Integer.valueOf(cpyiVar.ordinal()));
            }
        }
        if (iIntValue >= 58540) {
            dqru.v(contentValues, "rcs_group_self_msisdn", this.am);
        }
        if (iIntValue >= 58750) {
            Optional optional = this.an;
            if (optional == null) {
                contentValues.putNull("recipient_offline_timestamp_ms");
            } else {
                contentValues.put("recipient_offline_timestamp_ms", Long.valueOf(basb.a(optional)));
            }
        }
        if (iIntValue >= 58910) {
            Optional optional2 = this.ao;
            if (optional2 == null) {
                contentValues.putNull("rcs_group_last_sync_timestamp");
            } else {
                contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(basb.a(optional2)));
            }
        }
        if (iIntValue >= 59210) {
            contentValues.put("has_been_e2ee", Boolean.valueOf(this.ap));
        }
        if (iIntValue >= 59220) {
            contentValues.put("marked_as_unread", Boolean.valueOf(this.aq));
        }
        if (iIntValue >= 59820) {
            cidt cidtVar = this.ar;
            if (cidtVar == null) {
                contentValues.putNull("custom_theme");
            } else {
                contentValues.put("custom_theme", cidtVar.toByteArray());
            }
        }
        if (iIntValue >= 60050) {
            cins cinsVar = this.as;
            if (cinsVar == null) {
                contentValues.putNull("mms_group_upgrade_status");
            } else {
                contentValues.put("mms_group_upgrade_status", Integer.valueOf(cinsVar.ordinal()));
            }
        }
        if (iIntValue >= 60050) {
            contentValues.put("mms_group_upgrade_retries", Integer.valueOf(this.at));
        }
        if (iIntValue >= 60180) {
            cbqz cbqzVar = this.au;
            if (cbqzVar == null) {
                contentValues.putNull("encryption_protocol");
            } else {
                contentValues.put("encryption_protocol", Long.valueOf(cbqy.a(cbqzVar)));
            }
        }
        if (iIntValue >= 60210) {
            cbqx cbqxVar = this.av;
            if (cbqxVar == null) {
                contentValues.putNull("encryption_id");
            } else {
                contentValues.put("encryption_id", cbqx.a(cbqxVar));
            }
        }
        if (iIntValue >= 60250) {
            dqru.v(contentValues, "cms_correlation_id", this.aw);
        }
        if (iIntValue >= 60590) {
            Uri uri3 = this.ax;
            if (uri3 == null) {
                contentValues.putNull("rcs_group_icon_url");
            } else {
                contentValues.put("rcs_group_icon_url", uri3.toString());
            }
        }
        if (iIntValue >= 60740) {
            contentValues.put("unread_count", Integer.valueOf(this.ay));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bosr bosrVar = (bosr) ((bopr) dqqjVar);
        aC();
        this.cN = bosrVar.cV();
        if (bosrVar.dj(0)) {
            this.a = bosrVar.h();
            super.fN(0);
        }
        if (bosrVar.dj(1)) {
            this.b = bosrVar.k();
            super.fN(1);
        }
        if (bosrVar.dj(2)) {
            this.c = bosrVar.q();
            super.fN(2);
        }
        if (bosrVar.dj(3)) {
            this.d = bosrVar.V();
            super.fN(3);
        }
        if (bosrVar.dj(4)) {
            this.e = bosrVar.aw();
            super.fN(4);
        }
        if (bosrVar.dj(5)) {
            this.f = bosrVar.i();
            super.fN(5);
        }
        if (bosrVar.dj(6)) {
            this.g = bosrVar.au();
            super.fN(6);
        }
        if (bosrVar.dj(7)) {
            this.h = bosrVar.av();
            super.fN(7);
        }
        if (bosrVar.dj(8)) {
            this.i = bosrVar.O();
            super.fN(8);
        }
        if (bosrVar.dj(9)) {
            this.j = bosrVar.aq();
            super.fN(9);
        }
        if (bosrVar.dj(10)) {
            this.k = bosrVar.aD();
            super.fN(10);
        }
        if (bosrVar.dj(11)) {
            this.l = bosrVar.ah();
            super.fN(11);
        }
        if (bosrVar.dj(12)) {
            this.m = bosrVar.ai();
            super.fN(12);
        }
        if (bosrVar.dj(13)) {
            this.n = bosrVar.g();
            super.fN(13);
        }
        if (bosrVar.dj(14)) {
            this.o = bosrVar.ag();
            super.fN(14);
        }
        if (bosrVar.dj(15)) {
            this.p = bosrVar.y();
            super.fN(15);
        }
        if (bosrVar.dj(16)) {
            this.q = bosrVar.j();
            super.fN(16);
        }
        if (bosrVar.dj(17)) {
            this.r = bosrVar.N();
            super.fN(17);
        }
        if (bosrVar.dj(18)) {
            this.s = bosrVar.J();
            super.fN(18);
        }
        if (bosrVar.dj(19)) {
            this.t = bosrVar.aj();
            super.fN(19);
        }
        if (bosrVar.dj(20)) {
            this.u = bosrVar.L();
            super.fN(20);
        }
        if (bosrVar.dj(21)) {
            this.v = bosrVar.K();
            super.fN(21);
        }
        if (bosrVar.dj(22)) {
            this.w = bosrVar.s();
            super.fN(22);
        }
        if (bosrVar.dj(23)) {
            this.x = bosrVar.am();
            super.fN(23);
        }
        if (bosrVar.dj(24)) {
            this.y = bosrVar.t();
            super.fN(24);
        }
        if (bosrVar.dj(25)) {
            this.z = bosrVar.an();
            super.fN(25);
        }
        if (bosrVar.dj(26)) {
            this.A = bosrVar.af();
            super.fN(26);
        }
        if (bosrVar.dj(27)) {
            this.B = bosrVar.S();
            super.fN(27);
        }
        if (bosrVar.dj(28)) {
            this.C = bosrVar.R();
            super.fN(28);
        }
        if (bosrVar.dj(29)) {
            this.D = bosrVar.B();
            super.fN(29);
        }
        if (bosrVar.dj(30)) {
            this.E = bosrVar.w();
            super.fN(30);
        }
        if (bosrVar.dj(31)) {
            this.F = bosrVar.r();
            super.fN(31);
        }
        if (bosrVar.dj(32)) {
            this.G = bosrVar.x();
            super.fN(32);
        }
        if (bosrVar.dj(33)) {
            this.H = bosrVar.az();
            super.fN(33);
        }
        if (bosrVar.dj(34)) {
            this.I = bosrVar.at();
            super.fN(34);
        }
        if (bosrVar.dj(35)) {
            this.J = bosrVar.ap();
            super.fN(35);
        }
        if (bosrVar.dj(36)) {
            this.K = bosrVar.al();
            super.fN(36);
        }
        if (bosrVar.dj(37)) {
            this.L = bosrVar.D();
            super.fN(37);
        }
        if (bosrVar.dj(38)) {
            this.M = bosrVar.f();
            super.fN(38);
        }
        if (bosrVar.dj(39)) {
            this.N = bosrVar.e();
            super.fN(39);
        }
        if (bosrVar.dj(40)) {
            this.O = bosrVar.c();
            super.fN(40);
        }
        if (bosrVar.dj(41)) {
            this.P = bosrVar.C();
            super.fN(41);
        }
        if (bosrVar.dj(42)) {
            this.Q = bosrVar.aA();
            super.fN(42);
        }
        if (bosrVar.dj(43)) {
            this.R = bosrVar.ay();
            super.fN(43);
        }
        if (bosrVar.dj(44)) {
            this.S = bosrVar.H();
            super.fN(44);
        }
        if (bosrVar.dj(45)) {
            this.T = bosrVar.ao();
            super.fN(45);
        }
        if (bosrVar.dj(46)) {
            this.U = bosrVar.ak();
            super.fN(46);
        }
        if (bosrVar.dj(47)) {
            this.V = bosrVar.aE();
            super.fN(47);
        }
        if (bosrVar.dj(48)) {
            this.W = bosrVar.A();
            super.fN(48);
        }
        if (bosrVar.dj(49)) {
            this.X = bosrVar.I();
            super.fN(49);
        }
        if (bosrVar.dj(50)) {
            this.Y = bosrVar.G();
            super.fN(50);
        }
        if (bosrVar.dj(51)) {
            this.Z = bosrVar.ae();
            super.fN(51);
        }
        if (bosrVar.dj(52)) {
            this.aa = bosrVar.u();
            super.fN(52);
        }
        if (bosrVar.dj(53)) {
            this.ab = bosrVar.ar();
            super.fN(53);
        }
        if (bosrVar.dj(54)) {
            this.ac = bosrVar.aF();
            super.fN(54);
        }
        if (bosrVar.dj(55)) {
            this.ad = bosrVar.F();
            super.fN(55);
        }
        if (bosrVar.dj(56)) {
            this.ae = bosrVar.M();
            super.fN(56);
        }
        if (bosrVar.dj(57)) {
            this.af = bosrVar.aC();
            super.fN(57);
        }
        if (bosrVar.dj(58)) {
            this.ag = bosrVar.Z();
            super.fN(58);
        }
        if (bosrVar.dj(59)) {
            this.ah = bosrVar.v();
            super.fN(59);
        }
        if (bosrVar.dj(60)) {
            this.ai = bosrVar.T();
            super.fN(60);
        }
        if (bosrVar.dj(61)) {
            this.aj = bosrVar.U();
            super.fN(61);
        }
        if (bosrVar.dj(62)) {
            this.ak = bosrVar.Q();
            super.fN(62);
        }
        if (bosrVar.dj(63)) {
            this.al = bosrVar.l();
            super.fN(63);
        }
        if (bosrVar.dj(64)) {
            this.am = bosrVar.as();
            super.fN(64);
        }
        if (bosrVar.dj(65)) {
            this.an = bosrVar.ac();
            super.fN(65);
        }
        if (bosrVar.dj(66)) {
            this.ao = bosrVar.ab();
            super.fN(66);
        }
        if (bosrVar.dj(67)) {
            this.ap = bosrVar.ax();
            super.fN(67);
        }
        if (bosrVar.dj(68)) {
            this.aq = bosrVar.aB();
            super.fN(68);
        }
        if (bosrVar.dj(69)) {
            this.ar = bosrVar.Y();
            super.fN(69);
        }
        if (bosrVar.dj(70)) {
            this.as = bosrVar.aa();
            super.fN(70);
        }
        if (bosrVar.dj(71)) {
            this.at = bosrVar.z();
            super.fN(71);
        }
        if (bosrVar.dj(72)) {
            this.au = bosrVar.X();
            super.fN(72);
        }
        if (bosrVar.dj(73)) {
            this.av = bosrVar.W();
            super.fN(73);
        }
        if (bosrVar.dj(74)) {
            this.aw = bosrVar.ad();
            super.fN(74);
        }
        if (bosrVar.dj(75)) {
            this.ax = bosrVar.P();
            super.fN(75);
        }
        if (bosrVar.dj(76)) {
            this.ay = bosrVar.E();
            super.fN(76);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bojh)) {
            return false;
        }
        bojh bojhVar = (bojh) obj;
        return super.aE(bojhVar.cN) && Objects.equals(this.a, bojhVar.a) && Objects.equals(this.b, bojhVar.b) && Objects.equals(this.c, bojhVar.c) && this.d == bojhVar.d && Objects.equals(this.e, bojhVar.e) && Objects.equals(this.f, bojhVar.f) && Objects.equals(this.g, bojhVar.g) && Objects.equals(this.h, bojhVar.h) && Objects.equals(this.i, bojhVar.i) && Objects.equals(this.j, bojhVar.j) && this.k == bojhVar.k && Objects.equals(this.l, bojhVar.l) && Objects.equals(this.m, bojhVar.m) && Objects.equals(this.n, bojhVar.n) && Objects.equals(this.o, bojhVar.o) && this.p == bojhVar.p && this.q == bojhVar.q && this.r == bojhVar.r && this.s == bojhVar.s && Objects.equals(this.t, bojhVar.t) && this.u == bojhVar.u && this.v == bojhVar.v && Objects.equals(this.w, bojhVar.w) && Objects.equals(this.x, bojhVar.x) && Objects.equals(this.y, bojhVar.y) && Objects.equals(this.z, bojhVar.z) && Objects.equals(this.A, bojhVar.A) && Objects.equals(this.B, bojhVar.B) && Objects.equals(this.C, bojhVar.C) && this.D == bojhVar.D && this.E == bojhVar.E && Objects.equals(this.F, bojhVar.F) && this.G == bojhVar.G && this.H == bojhVar.H && Objects.equals(this.I, bojhVar.I) && Objects.equals(this.J, bojhVar.J) && Objects.equals(this.K, bojhVar.K) && this.L == bojhVar.L && this.M == bojhVar.M && this.N == bojhVar.N && this.O == bojhVar.O && this.P == bojhVar.P && this.Q == bojhVar.Q && this.R == bojhVar.R && this.S == bojhVar.S && Objects.equals(this.T, bojhVar.T) && Objects.equals(this.U, bojhVar.U) && this.V == bojhVar.V && this.W == bojhVar.W && this.X == bojhVar.X && this.Y == bojhVar.Y && Objects.equals(this.Z, bojhVar.Z) && Objects.equals(this.aa, bojhVar.aa) && Objects.equals(this.ab, bojhVar.ab) && Arrays.equals(this.ac, bojhVar.ac) && this.ad == bojhVar.ad && this.ae == bojhVar.ae && this.af == bojhVar.af && Objects.equals(this.ag, bojhVar.ag) && this.ah == bojhVar.ah && Objects.equals(this.ai, bojhVar.ai) && Objects.equals(this.aj, bojhVar.aj) && this.ak == bojhVar.ak && this.al == bojhVar.al && Objects.equals(this.am, bojhVar.am) && Objects.equals(this.an, bojhVar.an) && Objects.equals(this.ao, bojhVar.ao) && this.ap == bojhVar.ap && this.aq == bojhVar.aq && Objects.equals(this.ar, bojhVar.ar) && this.as == bojhVar.as && this.at == bojhVar.at && Objects.equals(this.au, bojhVar.au) && Objects.equals(this.av, bojhVar.av) && Objects.equals(this.aw, bojhVar.aw) && Objects.equals(this.ax, bojhVar.ax) && this.ay == bojhVar.ay;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations", dqru.m(new String[]{"sms_thread_id", "name", "name_is_automatic", "subtitle", "latest_message_id", "snippet_text", "subject_text", "preview_uri", "preview_content_type", "show_draft", "draft_snippet_text", "draft_subject_text", "draft_preview_uri", "draft_preview_content_type", "etouffee_default", "archive_status", "sort_timestamp", "last_read_timestamp", "icon", "participant_contact_id", "normalized_participant_contact_id", "participant_lookup_key", "normalized_participant_lookup_key", "participant_normalized_destination", "participant_comparable_destination", "current_self_id", "current_my_identity_foreign_key", "destination_token", "participant_count", "notification_enabled", "notification_sound_uri", "notification_vibration", "include_email_addr", "sms_service_center", "participant_id_list", "normalized_participant_id_list", "source_type", "rcs_session_id", "join_state", "conv_type", "send_mode", "IS_ENTERPRISE", "has_ea2p_bot_recipient", "last_interactive_event_timestamp", "participant_display_destination", "normalized_participant_display_destination", "spam_warning_dismiss_status", "open_count", "last_logged_scooby_metadata_timestamp", "delete_timestamp", "cms_id", "rcs_group_id", "rcs_conference_uri", "tachygram_group_routing_info_token", "cms_most_recent_read_message_timestamp_ms", "rcs_subject_change_timestamp_ms", "rcs_session_allows_revocation", "rcs_group_capabilities", "awaiting_reverse_sync", "duplicate_of", "new_duplicate_of", "error_state", "cms_life_cycle", "rcs_group_self_msisdn", "recipient_offline_timestamp_ms", "rcs_group_last_sync_timestamp", "has_been_e2ee", "marked_as_unread", "custom_theme", "mms_group_upgrade_status", "mms_group_upgrade_retries", "encryption_protocol", "encryption_id", "cms_correlation_id", "rcs_group_icon_url", "unread_count"}));
    }

    @Override // defpackage.dqpd
    public final void fN(int i) {
        super.fN(0);
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversations";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        cnqj cnqjVar = this.b;
        String str = this.c;
        bvdp bvdpVar = this.d;
        Integer numValueOf = Integer.valueOf(bvdpVar == null ? 0 : bvdpVar.ordinal());
        String str2 = this.e;
        MessageIdType messageIdType = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String str5 = this.j;
        Boolean boolValueOf = Boolean.valueOf(this.k);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri2 = this.n;
        dqqe dqqeVar3 = dqqeVar2;
        String str8 = this.o;
        Integer numValueOf2 = Integer.valueOf(this.p);
        bvdk bvdkVar = this.q;
        Long lValueOf = Long.valueOf(this.r);
        Long lValueOf2 = Long.valueOf(this.s);
        String str9 = this.t;
        Long lValueOf3 = Long.valueOf(this.u);
        Long lValueOf4 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        axcm axcmVar = this.B;
        awjl awjlVar = this.C;
        Integer numValueOf3 = Integer.valueOf(this.D);
        Boolean boolValueOf2 = Boolean.valueOf(this.E);
        String str15 = this.F;
        Boolean boolValueOf3 = Boolean.valueOf(this.G);
        Boolean boolValueOf4 = Boolean.valueOf(this.H);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer numValueOf4 = Integer.valueOf(this.L);
        Long lValueOf5 = Long.valueOf(this.M);
        Integer numValueOf5 = Integer.valueOf(this.N);
        Integer numValueOf6 = Integer.valueOf(this.O);
        Integer numValueOf7 = Integer.valueOf(this.P);
        Boolean boolValueOf5 = Boolean.valueOf(this.Q);
        Boolean boolValueOf6 = Boolean.valueOf(this.R);
        Long lValueOf6 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Boolean boolValueOf7 = Boolean.valueOf(this.V);
        Integer numValueOf8 = Integer.valueOf(this.W);
        Long lValueOf7 = Long.valueOf(this.X);
        Long lValueOf8 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        Integer numValueOf9 = Integer.valueOf(Arrays.hashCode(this.ac));
        Long lValueOf9 = Long.valueOf(this.ad);
        Long lValueOf10 = Long.valueOf(this.ae);
        Boolean boolValueOf8 = Boolean.valueOf(this.af);
        cigb cigbVar = this.ag;
        Boolean boolValueOf9 = Boolean.valueOf(this.ah);
        ConversationIdType conversationIdType2 = this.ai;
        ConversationIdType conversationIdType3 = this.aj;
        avoe avoeVar = this.ak;
        cpyi cpyiVar = this.al;
        Integer numValueOf10 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
        String str24 = this.am;
        Optional optional = this.an;
        Optional optional2 = this.ao;
        Boolean boolValueOf10 = Boolean.valueOf(this.ap);
        Boolean boolValueOf11 = Boolean.valueOf(this.aq);
        cidt cidtVar = this.ar;
        cins cinsVar = this.as;
        return Objects.hash(dqqeVar3, conversationIdType, cnqjVar, str, numValueOf, str2, messageIdType, str3, str4, uri, str5, boolValueOf, str6, str7, uri2, str8, numValueOf2, bvdkVar, lValueOf, lValueOf2, str9, lValueOf3, lValueOf4, str10, str11, str12, str13, str14, axcmVar, awjlVar, numValueOf3, boolValueOf2, str15, boolValueOf3, boolValueOf4, str16, str17, str18, numValueOf4, lValueOf5, numValueOf5, numValueOf6, numValueOf7, boolValueOf5, boolValueOf6, lValueOf6, str19, str20, boolValueOf7, numValueOf8, lValueOf7, lValueOf8, str21, str22, str23, numValueOf9, lValueOf9, lValueOf10, boolValueOf8, cigbVar, boolValueOf9, conversationIdType2, conversationIdType3, avoeVar, numValueOf10, str24, optional, optional2, boolValueOf10, boolValueOf11, cidtVar, Integer.valueOf(cinsVar == null ? 0 : cinsVar.ordinal()), Integer.valueOf(this.at), this.au, this.av, this.aw, this.ax, Integer.valueOf(this.ay), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        Long lValueOf = Long.valueOf(cnqk.a(this.b));
        String str = this.c;
        bvdp bvdpVar = this.d;
        Object objValueOf = bvdpVar == null ? 0 : String.valueOf(bvdpVar.ordinal());
        String str2 = this.e;
        Long lValueOf2 = Long.valueOf(bary.a(this.f));
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String string = uri == null ? null : uri.toString();
        String str5 = this.j;
        Integer numValueOf = Integer.valueOf(this.k ? 1 : 0);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri2 = this.n;
        String string2 = uri2 == null ? null : uri2.toString();
        String str8 = this.o;
        Integer numValueOf2 = Integer.valueOf(this.p);
        bvdk bvdkVar = this.q;
        Object objValueOf2 = bvdkVar == null ? 0 : String.valueOf(bvdkVar.h);
        Long lValueOf3 = Long.valueOf(this.r);
        Long lValueOf4 = Long.valueOf(this.s);
        String str9 = this.t;
        Long lValueOf5 = Long.valueOf(this.u);
        Long lValueOf6 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        Object obj = new bojd(this).get();
        Object obj2 = new boje(this).get();
        Integer numValueOf3 = Integer.valueOf(this.D);
        Integer numValueOf4 = Integer.valueOf(this.E ? 1 : 0);
        String str15 = this.F;
        Integer numValueOf5 = Integer.valueOf(this.G ? 1 : 0);
        Integer numValueOf6 = Integer.valueOf(this.H ? 1 : 0);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer numValueOf7 = Integer.valueOf(this.L);
        Long lValueOf7 = Long.valueOf(this.M);
        Integer numValueOf8 = Integer.valueOf(this.N);
        Integer numValueOf9 = Integer.valueOf(this.O);
        Integer numValueOf10 = Integer.valueOf(this.P);
        Integer numValueOf11 = Integer.valueOf(this.Q ? 1 : 0);
        Integer numValueOf12 = Integer.valueOf(this.R ? 1 : 0);
        Long lValueOf8 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Integer numValueOf13 = Integer.valueOf(this.V ? 1 : 0);
        Integer numValueOf14 = Integer.valueOf(this.W);
        Long lValueOf9 = Long.valueOf(this.X);
        Long lValueOf10 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        byte[] bArr = this.ac;
        Long lValueOf11 = Long.valueOf(this.ad);
        Long lValueOf12 = Long.valueOf(this.ae);
        Integer numValueOf15 = Integer.valueOf(this.af ? 1 : 0);
        Long lValueOf13 = Long.valueOf(this.ag.a);
        Integer numValueOf16 = Integer.valueOf(this.ah ? 1 : 0);
        Object obj3 = new bojf(this).get();
        Object obj4 = new bojg(this).get();
        avoe avoeVar = this.ak;
        Object objValueOf3 = avoeVar == null ? 0 : String.valueOf(avoeVar.a());
        cpyi cpyiVar = this.al;
        Object objValueOf4 = cpyiVar == null ? 0 : String.valueOf(cpyiVar.ordinal());
        String str24 = this.am;
        Long lValueOf14 = Long.valueOf(basb.a(this.an));
        Long lValueOf15 = Long.valueOf(basb.a(this.ao));
        Integer numValueOf17 = Integer.valueOf(this.ap ? 1 : 0);
        Integer numValueOf18 = Integer.valueOf(this.aq ? 1 : 0);
        cidt cidtVar = this.ar;
        byte[] byteArray = cidtVar == null ? null : cidtVar.toByteArray();
        cins cinsVar = this.as;
        Object objValueOf5 = cinsVar != null ? String.valueOf(cinsVar.ordinal()) : 0;
        Integer numValueOf19 = Integer.valueOf(this.at);
        cbqz cbqzVar = this.au;
        cbqz cbqzVar2 = cbqz.a;
        Long lValueOf16 = Long.valueOf(cbqy.a(cbqzVar));
        String strA = cbqx.a(this.av);
        String str25 = this.aw;
        Uri uri3 = this.ax;
        Object[] objArr = {lValueOf, str, objValueOf, str2, lValueOf2, str3, str4, string, str5, numValueOf, str6, str7, string2, str8, numValueOf2, objValueOf2, lValueOf3, lValueOf4, str9, lValueOf5, lValueOf6, str10, str11, str12, str13, str14, obj, obj2, numValueOf3, numValueOf4, str15, numValueOf5, numValueOf6, str16, str17, str18, numValueOf7, lValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, lValueOf8, str19, str20, numValueOf13, numValueOf14, lValueOf9, lValueOf10, str21, str22, str23, bArr, lValueOf11, lValueOf12, numValueOf15, lValueOf13, numValueOf16, obj3, obj4, objValueOf3, objValueOf4, str24, lValueOf14, lValueOf15, numValueOf17, numValueOf18, byteArray, objValueOf5, numValueOf19, lValueOf16, strA, str25, uri3 == null ? null : uri3.toString(), Integer.valueOf(this.ay)};
        sb.append('(');
        for (int i = 0; i < 76; i++) {
            Object obj5 = objArr[i];
            if (obj5 instanceof Number) {
                sb.append(String.valueOf(obj5));
            } else {
                if (obj5 instanceof String) {
                    String str26 = (String) obj5;
                    if (str26.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str26));
                    }
                }
                list.add(obj5);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final int k() {
        aA(40, "conv_type");
        return this.O;
    }

    public final int m() {
        aA(15, "etouffee_default");
        return this.p;
    }

    public final int n() {
        aA(39, "join_state");
        return this.N;
    }

    public final int o() {
        aA(71, "mms_group_upgrade_retries");
        return this.at;
    }

    public final int p() {
        aA(48, "open_count");
        return this.W;
    }

    public final int q() {
        aA(29, "participant_count");
        return this.D;
    }

    public final int r() {
        aA(41, "send_mode");
        return this.P;
    }

    public final int s() {
        aA(37, "source_type");
        return this.L;
    }

    public final long t() {
        aA(55, "cms_most_recent_read_message_timestamp_ms");
        return this.ad;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationsTable -- REDACTED") : a();
    }

    public final long u() {
        aA(50, "delete_timestamp");
        return this.Y;
    }

    public final long v() {
        aA(38, "rcs_session_id");
        return this.M;
    }

    public final long w() {
        aA(56, "rcs_subject_change_timestamp_ms");
        return this.ae;
    }

    public final long x() {
        aA(17, "sort_timestamp");
        return this.r;
    }

    public final Uri y() {
        aA(13, "draft_preview_uri");
        return this.n;
    }

    public final Uri z() {
        aA(75, "rcs_group_icon_url");
        return this.ax;
    }
}
