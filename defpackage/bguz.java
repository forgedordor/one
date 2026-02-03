package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bguz {
    public final bgva a;
    public final bgva b;
    public final bgva c;
    public final bgva d;
    public final bgva e;
    public final bgva f;
    public final bgva g;
    public final bgva h;
    public final bgva i;
    public final bgva j;
    public final bgva k;
    public final bgva l;
    public final bgva m;
    public final bgva n;

    public bguz() {
        dqpr dqprVarM = dqpt.m();
        dqprVarM.m(2);
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.b("messages._id");
        dqprVarM.i(-1);
        dqprVarM.c(new Supplier() { // from class: bfse
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM.j(new dqps() { // from class: bfsr
        });
        this.a = new bgva(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqprVarM2.m(1);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqprVarM2.h(new Supplier() { // from class: bfxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM2.b("messages.conversation_id");
        dqprVarM2.i(-1);
        dqprVarM2.c(new Supplier() { // from class: bgcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM2.j(new dqps() { // from class: bggw
        });
        this.b = new bgva(dqprVarM2.a());
        dqpr dqprVarM3 = dqpt.m();
        dqprVarM3.m(1);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqprVarM3.h(new Supplier() { // from class: bglp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM3.b("messages.sender_id");
        dqprVarM3.i(-1);
        dqprVarM3.c(new Supplier() { // from class: bgqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM3.j(new dqps() { // from class: bgsx
        });
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqprVarM4.m(1);
        dqprVarM4.d(true);
        dqprVarM4.b("messages.sent_timestamp");
        dqprVarM4.i(-1);
        dqprVarM4.c(new Supplier() { // from class: bgtj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM4.j(new dqps() { // from class: bgtv
        });
        this.c = new bgva(dqprVarM4.a());
        dqpr dqprVarM5 = dqpt.m();
        dqprVarM5.m(1);
        dqprVarM5.d(true);
        dqprVarM5.b("messages.received_timestamp");
        dqprVarM5.i(-1);
        dqprVarM5.c(new Supplier() { // from class: bfta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM5.j(new dqps() { // from class: bfxs
        });
        this.d = new bgva(dqprVarM5.a());
        dqpr dqprVarM6 = dqpt.m();
        dqprVarM6.m(1);
        dqprVarM6.b("messages.message_protocol");
        dqprVarM6.i(-1);
        dqprVarM6.c(new Supplier() { // from class: bgck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM6.j(new dqps() { // from class: bghc
        });
        this.e = new bgva(dqprVarM6.a());
        dqpr dqprVarM7 = dqpt.m();
        dqprVarM7.m(1);
        dqprVarM7.d(true);
        dqprVarM7.b("messages.message_status");
        dqprVarM7.i(-1);
        dqprVarM7.c(new Supplier() { // from class: bglu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM7.j(new dqps() { // from class: bgqm
        });
        this.f = new bgva(dqprVarM7.a());
        dqpr dqprVarM8 = dqpt.m();
        dqprVarM8.m(1);
        dqprVarM8.b("messages.message_report_status");
        dqprVarM8.i(13020);
        dqprVarM8.c(new Supplier() { // from class: bgtz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM8.j(new dqps() { // from class: bgul
        });
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqprVarM9.m(1);
        dqprVarM9.d(true);
        dqprVarM9.b("messages.seen");
        dqprVarM9.f(true);
        dqprVarM9.i(-1);
        dqprVarM9.c(new Supplier() { // from class: bgux
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM9.j(new dqps() { // from class: bfsq
        });
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqprVarM10.m(1);
        dqprVarM10.d(true);
        dqprVarM10.b("messages.read");
        dqprVarM10.i(-1);
        dqprVarM10.c(new Supplier() { // from class: bftd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM10.j(new dqps() { // from class: bftp
        });
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqprVarM11.m(4);
        dqprVarM11.d(true);
        dqprVarM11.b("messages.sms_message_uri");
        dqprVarM11.i(-1);
        dqprVarM11.c(new Supplier() { // from class: bfub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM11.j(new dqps() { // from class: bfun
        });
        this.g = new bgva(dqprVarM11.a());
        dqpr dqprVarM12 = dqpt.m();
        dqprVarM12.m(1);
        dqprVarM12.b("messages.sms_priority");
        dqprVarM12.i(-1);
        dqprVarM12.c(new Supplier() { // from class: bfuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM12.j(new dqps() { // from class: bfvl
        });
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqprVarM13.m(1);
        dqprVarM13.b("messages.sms_message_size");
        dqprVarM13.i(-1);
        dqprVarM13.c(new Supplier() { // from class: bfvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM13.j(new dqps() { // from class: bfwj
        });
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqprVarM14.m(4);
        dqprVarM14.b("messages.mms_subject");
        dqprVarM14.i(-1);
        dqprVarM14.c(new Supplier() { // from class: bfwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM14.j(new dqps() { // from class: bfxj
        });
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqprVarM15.m(1);
        dqprVarM15.b("messages.mms_expiry");
        dqprVarM15.i(-1);
        dqprVarM15.c(new Supplier() { // from class: bfxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM15.j(new dqps() { // from class: bfyi
        });
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqprVarM16.m(1);
        dqprVarM16.d(true);
        dqprVarM16.b("messages.rcs_expiry");
        dqprVarM16.i(59890);
        dqprVarM16.c(new Supplier() { // from class: bfyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM16.j(new dqps() { // from class: bfzg
        });
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqprVarM17.m(4);
        dqprVarM17.b("messages.mms_retrieve_text");
        dqprVarM17.i(9030);
        dqprVarM17.c(new Supplier() { // from class: bfzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM17.j(new dqps() { // from class: bgae
        });
        this.h = new bgva(dqprVarM17.a());
        dqpr dqprVarM18 = dqpt.m();
        dqprVarM18.m(1);
        dqprVarM18.b("messages.raw_status");
        dqprVarM18.i(-1);
        dqprVarM18.c(new Supplier() { // from class: bgaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM18.j(new dqps() { // from class: bgbe
        });
        this.i = new bgva(dqprVarM18.a());
        dqpr dqprVarM19 = dqpt.m();
        dqprVarM19.m(1);
        dqprVarM19.d(true);
        dqprVarM19.e(true);
        dqprVarM19.h(new Supplier() { // from class: bgbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM19.b("messages.self_id");
        dqprVarM19.i(-1);
        dqprVarM19.c(new Supplier() { // from class: bgcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM19.j(new dqps() { // from class: bgcp
        });
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqprVarM20.m(4);
        dqprVarM20.d(true);
        dqprVarM20.b("messages.rcs_message_id_with_text_type");
        dqprVarM20.f(true);
        dqprVarM20.i(41040);
        dqprVarM20.c(new Supplier() { // from class: bgdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM20.j(new dqps() { // from class: bgdn
        });
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqprVarM21.m(1);
        dqprVarM21.b("messages.etouffee_status");
        dqprVarM21.i(29060);
        dqprVarM21.c(new Supplier() { // from class: bgdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM21.j(new dqps() { // from class: bgel
        });
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqprVarM22.m(1);
        dqprVarM22.b("messages.verification_status");
        dqprVarM22.i(29090);
        dqprVarM22.c(new Supplier() { // from class: bgex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM22.j(new dqps() { // from class: bgfl
        });
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqprVarM23.m(1);
        dqprVarM23.d(true);
        dqprVarM23.b("messages.is_hidden");
        dqprVarM23.i(30010);
        dqprVarM23.c(new Supplier() { // from class: bgfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM23.j(new dqps() { // from class: bggj
        });
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqprVarM24.m(1);
        dqprVarM24.b("messages.rcs_file_transfer_session_id");
        dqprVarM24.i(10004);
        dqprVarM24.c(new Supplier() { // from class: bggv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM24.j(new dqps() { // from class: bghi
        });
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqprVarM25.m(1);
        dqprVarM25.b("messages.sms_error_code");
        dqprVarM25.i(9000);
        dqprVarM25.c(new Supplier() { // from class: bghu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM25.j(new dqps() { // from class: bgig
        });
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqprVarM26.m(4);
        dqprVarM26.b("messages.sms_error_desc_map_name");
        dqprVarM26.i(9000);
        dqprVarM26.c(new Supplier() { // from class: bgis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM26.j(new dqps() { // from class: bgje
        });
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqprVarM27.m(4);
        dqprVarM27.l(true);
        dqprVarM27.d(true);
        dqprVarM27.b("messages.cms_id");
        dqprVarM27.f(true);
        dqprVarM27.i(31010);
        dqprVarM27.c(new Supplier() { // from class: bgjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM27.j(new dqps() { // from class: bgke
        });
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqprVarM28.m(4);
        dqprVarM28.d(true);
        dqprVarM28.b("messages.web_id");
        dqprVarM28.i(19020);
        dqprVarM28.c(new Supplier() { // from class: bgkq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM28.j(new dqps() { // from class: bglc
        });
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqprVarM29.m(1);
        dqprVarM29.b("messages.usage_stats_logging_id");
        dqprVarM29.i(29100);
        dqprVarM29.c(new Supplier() { // from class: bglo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM29.j(new dqps() { // from class: bgmb
        });
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqprVarM30.m(4);
        dqprVarM30.d(true);
        dqprVarM30.b("messages.original_rcs_message_id");
        dqprVarM30.i(35030);
        dqprVarM30.c(new Supplier() { // from class: bgmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM30.j(new dqps() { // from class: bgmz
        });
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqprVarM31.m(1);
        dqprVarM31.b("messages.result_code");
        dqprVarM31.i(58040);
        dqprVarM31.c(new Supplier() { // from class: bgnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM31.j(new dqps() { // from class: bgnz
        });
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqprVarM32.m(1);
        dqprVarM32.b("messages.cms_life_cycle");
        dqprVarM32.i(58210);
        dqprVarM32.c(new Supplier() { // from class: bgol
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM32.j(new dqps() { // from class: bgox
        });
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqprVarM33.m(1);
        dqprVarM33.b("messages.mute_priority");
        dqprVarM33.i(60750);
        dqprVarM33.c(new Supplier() { // from class: bgpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM33.j(new dqps() { // from class: bgpv
        });
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqprVarM34.m(1);
        dqprVarM34.b("messages.fallback_reason");
        dqprVarM34.i(58710);
        dqprVarM34.c(new Supplier() { // from class: bgqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM34.j(new dqps() { // from class: bgqu
        });
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqprVarM35.m(5);
        dqprVarM35.b("messages.trace_id");
        dqprVarM35.i(58680);
        dqprVarM35.c(new Supplier() { // from class: bgrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM35.j(new dqps() { // from class: bgrs
        });
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqprVarM36.m(1);
        dqprVarM36.b("messages.xms_transport");
        dqprVarM36.i(59310);
        dqprVarM36.c(new Supplier() { // from class: bgsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM36.j(new dqps() { // from class: bgsr
        });
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqprVarM37.m(4);
        dqprVarM37.b("messages.sender_send_destination");
        dqprVarM37.i(54040);
        dqprVarM37.c(new Supplier() { // from class: bgss
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM37.j(new dqps() { // from class: bgst
        });
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqprVarM38.m(4);
        dqprVarM38.b("messages.msisdn_receiving_rcs_message");
        dqprVarM38.i(59340);
        dqprVarM38.c(new Supplier() { // from class: bgsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM38.j(new dqps() { // from class: bgsv
        });
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqprVarM39.m(4);
        dqprVarM39.b("messages.receiving_network_country");
        dqprVarM39.i(54040);
        dqprVarM39.c(new Supplier() { // from class: bgsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM39.j(new dqps() { // from class: bgsy
        });
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqprVarM40.m(1);
        dqprVarM40.b("messages.queue_insert_timestamp");
        dqprVarM40.i(17030);
        dqprVarM40.c(new Supplier() { // from class: bgsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM40.j(new dqps() { // from class: bgta
        });
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqprVarM41.m(4);
        dqprVarM41.b("messages.mms_transaction_id");
        dqprVarM41.i(-1);
        dqprVarM41.c(new Supplier() { // from class: bgtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM41.j(new dqps() { // from class: bgtd
        });
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqprVarM42.m(4);
        dqprVarM42.b("messages.mms_content_location");
        dqprVarM42.i(-1);
        dqprVarM42.c(new Supplier() { // from class: bgte
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM42.j(new dqps() { // from class: bgtf
        });
        this.j = new bgva(dqprVarM42.a());
        dqpr dqprVarM43 = dqpt.m();
        dqprVarM43.m(4);
        dqprVarM43.d(true);
        dqprVarM43.b("messages.my_identity");
        dqprVarM43.i(59810);
        dqprVarM43.c(new Supplier() { // from class: bgtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM43.j(new dqps() { // from class: bgth
        });
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqprVarM44.m(4);
        dqprVarM44.d(true);
        dqprVarM44.e(true);
        dqprVarM44.h(new Supplier() { // from class: bgti
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM44.b("messages.my_identity_foreign_key");
        dqprVarM44.i(60160);
        dqprVarM44.c(new Supplier() { // from class: bgtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM44.j(new dqps() { // from class: bgtl
        });
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqprVarM45.m(1);
        dqprVarM45.b("messages.retry_start_timestamp");
        dqprVarM45.i(-1);
        dqprVarM45.c(new Supplier() { // from class: bgtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM45.j(new dqps() { // from class: bgto
        });
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqprVarM46.m(4);
        dqprVarM46.d(true);
        dqprVarM46.b("messages.cloud_sync_id");
        dqprVarM46.i(8500);
        dqprVarM46.c(new Supplier() { // from class: bgtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM46.j(new dqps() { // from class: bgtq
        });
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqprVarM47.m(7);
        dqprVarM47.d(true);
        dqprVarM47.b("messages.rcs_message_id");
        dqprVarM47.f(true);
        dqprVarM47.i(10000);
        dqprVarM47.c(new Supplier() { // from class: bgtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM47.j(new dqps() { // from class: bgts
        });
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqprVarM48.m(1);
        dqprVarM48.b("messages.rcs_ui_status");
        dqprVarM48.i(39000);
        dqprVarM48.c(new Supplier() { // from class: bgtt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM48.j(new dqps() { // from class: bgtu
        });
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqprVarM49.m(7);
        dqprVarM49.b("messages.rcs_remote_instance");
        dqprVarM49.i(10002);
        dqprVarM49.c(new Supplier() { // from class: bfwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM49.j(new dqps() { // from class: bgas
        });
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqprVarM50.m(4);
        dqprVarM50.b("messages.correlation_id");
        dqprVarM50.i(9010);
        dqprVarM50.c(new Supplier() { // from class: bgez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM50.j(new dqps() { // from class: bgjg
        });
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqprVarM51.m(2);
        dqprVarM51.b("messages.cms_last_mod_seq");
        dqprVarM51.i(37040);
        dqprVarM51.c(new Supplier() { // from class: bgnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM51.j(new dqps() { // from class: bgru
        });
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqprVarM52.m(1);
        dqprVarM52.b("messages.send_counter");
        dqprVarM52.i(35030);
        dqprVarM52.c(new Supplier() { // from class: bguc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM52.j(new dqps() { // from class: bgun
        });
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqprVarM53.m(5);
        dqprVarM53.b("messages.raw_rcs_message_to_send");
        dqprVarM53.i(60820);
        dqprVarM53.c(new Supplier() { // from class: bguy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM53.j(new dqps() { // from class: bfsp
        });
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqprVarM54.m(4);
        dqprVarM54.b("messages.custom_delivery_receipt_mime_type");
        dqprVarM54.i(37020);
        dqprVarM54.c(new Supplier() { // from class: bftl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM54.j(new dqps() { // from class: bftw
        });
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqprVarM55.m(5);
        dqprVarM55.b("messages.custom_delivery_receipt_content");
        dqprVarM55.i(37020);
        dqprVarM55.c(new Supplier() { // from class: bfuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM55.j(new dqps() { // from class: bfus
        });
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqprVarM56.m(1);
        dqprVarM56.b("messages.report_attempt_acounter");
        dqprVarM56.i(37030);
        dqprVarM56.c(new Supplier() { // from class: bfvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM56.j(new dqps() { // from class: bfvo
        });
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqprVarM57.m(5);
        dqprVarM57.b("messages.custom_headers");
        dqprVarM57.i(45020);
        dqprVarM57.c(new Supplier() { // from class: bfvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM57.j(new dqps() { // from class: bfwk
        });
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqprVarM58.m(4);
        dqprVarM58.l(true);
        dqprVarM58.d(true);
        dqprVarM58.b("messages.cms_correlation_id");
        dqprVarM58.f(true);
        dqprVarM58.i(46010);
        dqprVarM58.c(new Supplier() { // from class: bfww
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM58.j(new dqps() { // from class: bfxh
        });
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqprVarM59.m(1);
        dqprVarM59.d(true);
        dqprVarM59.e(true);
        dqprVarM59.h(new Supplier() { // from class: bfyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM59.b("messages.group_private_participant");
        dqprVarM59.i(48030);
        dqprVarM59.c(new Supplier() { // from class: bfyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM59.j(new dqps() { // from class: bfyz
        });
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqprVarM60.m(1);
        dqprVarM60.d(true);
        dqprVarM60.e(true);
        dqprVarM60.h(new Supplier() { // from class: bfzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM60.b("messages.original_message_id");
        dqprVarM60.i(48030);
        dqprVarM60.c(new Supplier() { // from class: bfzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM60.j(new dqps() { // from class: bgag
        });
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqprVarM61.m(2);
        dqprVarM61.d(true);
        dqprVarM61.e(true);
        dqprVarM61.h(new Supplier() { // from class: bgar
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM61.b("messages.parent_message_id");
        dqprVarM61.i(60950);
        dqprVarM61.c(new Supplier() { // from class: bgbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM61.j(new dqps() { // from class: bgbo
        });
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqprVarM62.m(1);
        dqprVarM62.b("messages.awaiting_reverse_sync");
        dqprVarM62.i(49060);
        dqprVarM62.c(new Supplier() { // from class: bgbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM62.j(new dqps() { // from class: bgcv
        });
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqprVarM63.m(4);
        dqprVarM63.b("messages.old_sms_message_uri");
        dqprVarM63.i(49060);
        dqprVarM63.c(new Supplier() { // from class: bgdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM63.j(new dqps() { // from class: bgdr
        });
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqprVarM64.m(4);
        dqprVarM64.l(true);
        dqprVarM64.d(true);
        dqprVarM64.b("messages.draft_id");
        dqprVarM64.f(true);
        dqprVarM64.i(56000);
        dqprVarM64.c(new Supplier() { // from class: bgec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM64.j(new dqps() { // from class: bgen
        });
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqprVarM65.m(1);
        dqprVarM65.b("messages.auto_retry_counter");
        dqprVarM65.i(58230);
        dqprVarM65.c(new Supplier() { // from class: bgey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM65.j(new dqps() { // from class: bgfk
        });
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqprVarM66.m(2);
        dqprVarM66.b("messages.can_revoke_before_delivered_with_rcs");
        dqprVarM66.i(58280);
        dqprVarM66.c(new Supplier() { // from class: bgfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM66.j(new dqps() { // from class: bggg
        });
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqprVarM67.m(1);
        dqprVarM67.b("messages.outgoing_delivery_report_status");
        dqprVarM67.i(58720);
        dqprVarM67.c(new Supplier() { // from class: bggr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM67.j(new dqps() { // from class: bghn
        });
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqprVarM68.m(1);
        dqprVarM68.b("messages.outgoing_read_report_status");
        dqprVarM68.i(58720);
        dqprVarM68.c(new Supplier() { // from class: bghy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM68.j(new dqps() { // from class: bgij
        });
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqprVarM69.m(1);
        dqprVarM69.b("messages.message_original_protocol");
        dqprVarM69.i(59430);
        dqprVarM69.c(new Supplier() { // from class: bgiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM69.j(new dqps() { // from class: bgjf
        });
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqprVarM70.m(4);
        dqprVarM70.l(true);
        dqprVarM70.d(true);
        dqprVarM70.b("messages.satellite_datagram_id");
        dqprVarM70.f(true);
        dqprVarM70.i(59490);
        dqprVarM70.c(new Supplier() { // from class: bgjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM70.j(new dqps() { // from class: bgkc
        });
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqprVarM71.m(1);
        dqprVarM71.b("messages.encryption_protocol");
        dqprVarM71.i(60190);
        dqprVarM71.c(new Supplier() { // from class: bgkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM71.j(new dqps() { // from class: bgky
        });
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqprVarM72.m(4);
        dqprVarM72.l(true);
        dqprVarM72.d(true);
        dqprVarM72.b("messages.message_persistence_id");
        dqprVarM72.f(true);
        dqprVarM72.i(60370);
        dqprVarM72.c(new Supplier() { // from class: bglj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM72.j(new dqps() { // from class: bgmf
        });
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqprVarM73.m(8);
        dqprVarM73.b("parts_count");
        dqprVarM73.i(0);
        dqprVarM73.c(new Supplier() { // from class: bgmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM73.j(new dqps() { // from class: bgnb
        });
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqprVarM74.m(2);
        dqprVarM74.l(true);
        dqprVarM74.g(true);
        dqprVarM74.d(true);
        dqprVarM74.b("parts._id");
        dqprVarM74.i(-1);
        dqprVarM74.c(new Supplier() { // from class: bgnm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM74.j(new dqps() { // from class: bgny
        });
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqprVarM75.m(1);
        dqprVarM75.d(true);
        dqprVarM75.e(true);
        dqprVarM75.h(new Supplier() { // from class: bgoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM75.b("parts.message_id");
        dqprVarM75.i(-1);
        dqprVarM75.c(new Supplier() { // from class: bgou
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM75.j(new dqps() { // from class: bgpf
        });
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqprVarM76.m(4);
        dqprVarM76.b("parts.text");
        dqprVarM76.i(-1);
        dqprVarM76.c(new Supplier() { // from class: bgpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM76.j(new dqps() { // from class: bgqb
        });
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqprVarM77.m(4);
        dqprVarM77.b("parts.raw_text");
        dqprVarM77.i(60990);
        dqprVarM77.c(new Supplier() { // from class: bgqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM77.j(new dqps() { // from class: bgri
        });
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqprVarM78.m(4);
        dqprVarM78.b("parts.uri");
        dqprVarM78.i(-1);
        dqprVarM78.c(new Supplier() { // from class: bgrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM78.j(new dqps() { // from class: bgsf
        });
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqprVarM79.m(4);
        dqprVarM79.d(true);
        dqprVarM79.b("parts.content_type");
        dqprVarM79.i(-1);
        dqprVarM79.c(new Supplier() { // from class: bgsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM79.j(new dqps() { // from class: bgtb
        });
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqprVarM80.m(4);
        dqprVarM80.b("parts.original_uri");
        dqprVarM80.i(10021);
        dqprVarM80.c(new Supplier() { // from class: bgtm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM80.j(new dqps() { // from class: bgtw
        });
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqprVarM81.m(4);
        dqprVarM81.b("parts.storage_uri");
        dqprVarM81.i(29060);
        dqprVarM81.c(new Supplier() { // from class: bgtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM81.j(new dqps() { // from class: bgty
        });
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqprVarM82.m(1);
        dqprVarM82.b("parts.width");
        dqprVarM82.i(-1);
        dqprVarM82.c(new Supplier() { // from class: bgua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM82.j(new dqps() { // from class: bgub
        });
        dqprVarM82.a();
        dqpr dqprVarM83 = dqpt.m();
        dqprVarM83.m(1);
        dqprVarM83.b("parts.height");
        dqprVarM83.i(-1);
        dqprVarM83.c(new Supplier() { // from class: bgud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM83.j(new dqps() { // from class: bgue
        });
        dqprVarM83.a();
        dqpr dqprVarM84 = dqpt.m();
        dqprVarM84.m(1);
        dqprVarM84.b("parts.timestamp");
        dqprVarM84.i(3010);
        dqprVarM84.c(new Supplier() { // from class: bguf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM84.j(new dqps() { // from class: bgug
        });
        dqprVarM84.a();
        dqpr dqprVarM85 = dqpt.m();
        dqprVarM85.m(4);
        dqprVarM85.d(true);
        dqprVarM85.b("parts.output_uri");
        dqprVarM85.i(4020);
        dqprVarM85.c(new Supplier() { // from class: bguh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM85.j(new dqps() { // from class: bgui
        });
        dqprVarM85.a();
        dqpr dqprVarM86 = dqpt.m();
        dqprVarM86.m(1);
        dqprVarM86.b("parts.target_size");
        dqprVarM86.i(4020);
        dqprVarM86.c(new Supplier() { // from class: bguj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM86.j(new dqps() { // from class: bguk
        });
        dqprVarM86.a();
        dqpr dqprVarM87 = dqpt.m();
        dqprVarM87.m(1);
        dqprVarM87.b("parts.processing_status");
        dqprVarM87.i(4020);
        dqprVarM87.c(new Supplier() { // from class: bgum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM87.j(new dqps() { // from class: bguo
        });
        dqprVarM87.a();
        dqpr dqprVarM88 = dqpt.m();
        dqprVarM88.m(1);
        dqprVarM88.b("parts.cms_attachment_processing_status");
        dqprVarM88.i(44010);
        dqprVarM88.c(new Supplier() { // from class: bgup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM88.j(new dqps() { // from class: bguq
        });
        dqprVarM88.a();
        dqpr dqprVarM89 = dqpt.m();
        dqprVarM89.m(1);
        dqprVarM89.d(true);
        dqprVarM89.e(true);
        dqprVarM89.h(new Supplier() { // from class: bgur
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM89.b("parts.conversation_id");
        dqprVarM89.i(-1);
        dqprVarM89.c(new Supplier() { // from class: bgus
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM89.j(new dqps() { // from class: bgut
        });
        dqprVarM89.a();
        dqpr dqprVarM90 = dqpt.m();
        dqprVarM90.m(1);
        dqprVarM90.b("parts.sticker_set_id");
        dqprVarM90.i(5020);
        dqprVarM90.c(new Supplier() { // from class: bguu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM90.j(new dqps() { // from class: bguv
        });
        dqprVarM90.a();
        dqpr dqprVarM91 = dqpt.m();
        dqprVarM91.m(1);
        dqprVarM91.b("parts.sticker_id");
        dqprVarM91.i(5020);
        dqprVarM91.c(new Supplier() { // from class: bguw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM91.j(new dqps() { // from class: bfsf
        });
        dqprVarM91.a();
        dqpr dqprVarM92 = dqpt.m();
        dqprVarM92.m(1);
        dqprVarM92.b("parts.media_modified_timestamp");
        dqprVarM92.i(7000);
        dqprVarM92.c(new Supplier() { // from class: bfsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM92.j(new dqps() { // from class: bfsh
        });
        dqprVarM92.a();
        dqpr dqprVarM93 = dqpt.m();
        dqprVarM93.m(3);
        dqprVarM93.b("parts.longitude");
        dqprVarM93.i(10005);
        dqprVarM93.c(new Supplier() { // from class: bfsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM93.j(new dqps() { // from class: bfsj
        });
        dqprVarM93.a();
        dqpr dqprVarM94 = dqpt.m();
        dqprVarM94.m(3);
        dqprVarM94.b("parts.latitude");
        dqprVarM94.i(10005);
        dqprVarM94.c(new Supplier() { // from class: bfsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM94.j(new dqps() { // from class: bfsl
        });
        dqprVarM94.a();
        dqpr dqprVarM95 = dqpt.m();
        dqprVarM95.m(4);
        dqprVarM95.b("parts.preview_content_uri");
        dqprVarM95.i(10017);
        dqprVarM95.c(new Supplier() { // from class: bfsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM95.j(new dqps() { // from class: bfsn
        });
        dqprVarM95.a();
        dqpr dqprVarM96 = dqpt.m();
        dqprVarM96.m(4);
        dqprVarM96.d(true);
        dqprVarM96.b("parts.preview_content_type");
        dqprVarM96.i(10017);
        dqprVarM96.c(new Supplier() { // from class: bfso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM96.j(new dqps() { // from class: bfss
        });
        dqprVarM96.a();
        dqpr dqprVarM97 = dqpt.m();
        dqprVarM97.m(4);
        dqprVarM97.b("parts.fallback_uri");
        dqprVarM97.i(13000);
        dqprVarM97.c(new Supplier() { // from class: bfst
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM97.j(new dqps() { // from class: bfsu
        });
        dqprVarM97.a();
        dqpr dqprVarM98 = dqpt.m();
        dqprVarM98.m(1);
        dqprVarM98.b("parts.source");
        dqprVarM98.i(14010);
        dqprVarM98.c(new Supplier() { // from class: bfsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM98.j(new dqps() { // from class: bfsw
        });
        dqprVarM98.a();
        dqpr dqprVarM99 = dqpt.m();
        dqprVarM99.m(1);
        dqprVarM99.b("parts.bundle_index");
        dqprVarM99.i(17010);
        dqprVarM99.c(new Supplier() { // from class: bfsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM99.j(new dqps() { // from class: bfsy
        });
        dqprVarM99.a();
        dqpr dqprVarM100 = dqpt.m();
        dqprVarM100.m(4);
        dqprVarM100.b("parts.blob_id");
        dqprVarM100.i(17020);
        dqprVarM100.c(new Supplier() { // from class: bfsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM100.j(new dqps() { // from class: bftb
        });
        dqprVarM100.a();
        dqpr dqprVarM101 = dqpt.m();
        dqprVarM101.m(4);
        dqprVarM101.b("parts.blob_gaia_email");
        dqprVarM101.i(59570);
        dqprVarM101.c(new Supplier() { // from class: bftc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM101.j(new dqps() { // from class: bfte
        });
        dqprVarM101.a();
        dqpr dqprVarM102 = dqpt.m();
        dqprVarM102.m(4);
        dqprVarM102.b("parts.cms_full_size_blob_id");
        dqprVarM102.i(40040);
        dqprVarM102.c(new Supplier() { // from class: bftf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM102.j(new dqps() { // from class: bftg
        });
        dqprVarM102.a();
        dqpr dqprVarM103 = dqpt.m();
        dqprVarM103.m(5);
        dqprVarM103.b("parts.cms_media_encryption_key");
        dqprVarM103.i(42010);
        dqprVarM103.c(new Supplier() { // from class: bfth
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM103.j(new dqps() { // from class: bfti
        });
        dqprVarM103.a();
        dqpr dqprVarM104 = dqpt.m();
        dqprVarM104.m(5);
        dqprVarM104.b("parts.cms_compressed_media_encryption_key");
        dqprVarM104.i(42070);
        dqprVarM104.c(new Supplier() { // from class: bftj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM104.j(new dqps() { // from class: bftk
        });
        dqprVarM104.a();
        dqpr dqprVarM105 = dqpt.m();
        dqprVarM105.m(1);
        dqprVarM105.b("parts.blob_upload_permanent_failure");
        dqprVarM105.i(18000);
        dqprVarM105.c(new Supplier() { // from class: bftm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM105.j(new dqps() { // from class: bftn
        });
        dqprVarM105.a();
        dqpr dqprVarM106 = dqpt.m();
        dqprVarM106.m(1);
        dqprVarM106.b("parts.blob_upload_timestamp");
        dqprVarM106.i(19030);
        dqprVarM106.c(new Supplier() { // from class: bfto
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM106.j(new dqps() { // from class: bftq
        });
        dqprVarM106.a();
        dqpr dqprVarM107 = dqpt.m();
        dqprVarM107.m(4);
        dqprVarM107.b("parts.expressive_sticker_name");
        dqprVarM107.i(22060);
        dqprVarM107.c(new Supplier() { // from class: bftr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM107.j(new dqps() { // from class: bfts
        });
        dqprVarM107.a();
        dqpr dqprVarM108 = dqpt.m();
        dqprVarM108.m(4);
        dqprVarM108.b("parts.file_name");
        dqprVarM108.i(26000);
        dqprVarM108.c(new Supplier() { // from class: bftt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM108.j(new dqps() { // from class: bftu
        });
        dqprVarM108.a();
        dqpr dqprVarM109 = dqpt.m();
        dqprVarM109.m(1);
        dqprVarM109.b("parts.duration");
        dqprVarM109.i(26040);
        dqprVarM109.c(new Supplier() { // from class: bftv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM109.j(new dqps() { // from class: bftx
        });
        dqprVarM109.a();
        dqpr dqprVarM110 = dqpt.m();
        dqprVarM110.m(4);
        dqprVarM110.b("parts.compressed_blob_id");
        dqprVarM110.i(27000);
        dqprVarM110.c(new Supplier() { // from class: bfty
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM110.j(new dqps() { // from class: bftz
        });
        dqprVarM110.a();
        dqpr dqprVarM111 = dqpt.m();
        dqprVarM111.m(4);
        dqprVarM111.b("parts.cms_compressed_blob_id");
        dqprVarM111.i(40040);
        dqprVarM111.c(new Supplier() { // from class: bfua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM111.j(new dqps() { // from class: bfuc
        });
        dqprVarM111.a();
        dqpr dqprVarM112 = dqpt.m();
        dqprVarM112.m(1);
        dqprVarM112.b("parts.compressed_blob_upload_permanent_failure");
        dqprVarM112.i(27000);
        dqprVarM112.c(new Supplier() { // from class: bfud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM112.j(new dqps() { // from class: bfue
        });
        dqprVarM112.a();
        dqpr dqprVarM113 = dqpt.m();
        dqprVarM113.m(1);
        dqprVarM113.b("parts.compressed_blob_upload_timestamp");
        dqprVarM113.i(27000);
        dqprVarM113.c(new Supplier() { // from class: bfuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM113.j(new dqps() { // from class: bfug
        });
        dqprVarM113.a();
        dqpr dqprVarM114 = dqpt.m();
        dqprVarM114.m(5);
        dqprVarM114.b("parts.media_encryption_key");
        dqprVarM114.i(30040);
        dqprVarM114.c(new Supplier() { // from class: bfui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM114.j(new dqps() { // from class: bfuj
        });
        dqprVarM114.a();
        dqpr dqprVarM115 = dqpt.m();
        dqprVarM115.m(5);
        dqprVarM115.b("parts.compressed_media_encryption_key");
        dqprVarM115.i(30040);
        dqprVarM115.c(new Supplier() { // from class: bfuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM115.j(new dqps() { // from class: bful
        });
        dqprVarM115.a();
        dqpr dqprVarM116 = dqpt.m();
        dqprVarM116.m(1);
        dqprVarM116.b("parts.missing_entry_in_telephony");
        dqprVarM116.i(52030);
        dqprVarM116.c(new Supplier() { // from class: bfum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM116.j(new dqps() { // from class: bfuo
        });
        dqprVarM116.a();
        dqpr dqprVarM117 = dqpt.m();
        dqprVarM117.m(1);
        dqprVarM117.b("parts.awaiting_reverse_sync");
        dqprVarM117.i(53040);
        dqprVarM117.c(new Supplier() { // from class: bfup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM117.j(new dqps() { // from class: bfuq
        });
        dqprVarM117.a();
        dqpr dqprVarM118 = dqpt.m();
        dqprVarM118.m(1);
        dqprVarM118.b("parts.file_size_bytes");
        dqprVarM118.i(52050);
        dqprVarM118.c(new Supplier() { // from class: bfur
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM118.j(new dqps() { // from class: bfut
        });
        dqprVarM118.a();
        dqpr dqprVarM119 = dqpt.m();
        dqprVarM119.m(4);
        dqprVarM119.d(true);
        dqprVarM119.b("parts.local_cache_path");
        dqprVarM119.i(52050);
        dqprVarM119.c(new Supplier() { // from class: bfuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM119.j(new dqps() { // from class: bfuv
        });
        dqprVarM119.a();
        dqpr dqprVarM120 = dqpt.m();
        dqprVarM120.m(1);
        dqprVarM120.b("parts.media_send_type");
        dqprVarM120.i(58150);
        dqprVarM120.c(new Supplier() { // from class: bfuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM120.j(new dqps() { // from class: bfux
        });
        dqprVarM120.a();
        dqpr dqprVarM121 = dqpt.m();
        dqprVarM121.m(5);
        dqprVarM121.b("parts.voice_metadata");
        dqprVarM121.i(59470);
        dqprVarM121.c(new Supplier() { // from class: bfuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM121.j(new dqps() { // from class: bfva
        });
        dqprVarM121.a();
        dqpr dqprVarM122 = dqpt.m();
        dqprVarM122.m(1);
        dqprVarM122.b("parts.validation_status");
        dqprVarM122.i(58770);
        dqprVarM122.c(new Supplier() { // from class: bfvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM122.j(new dqps() { // from class: bfvc
        });
        dqprVarM122.a();
        dqpr dqprVarM123 = dqpt.m();
        dqprVarM123.m(4);
        dqprVarM123.b("parts.processing_id");
        dqprVarM123.i(60080);
        dqprVarM123.c(new Supplier() { // from class: bfve
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM123.j(new dqps() { // from class: bfvf
        });
        dqprVarM123.a();
        dqpr dqprVarM124 = dqpt.m();
        dqprVarM124.m(1);
        dqprVarM124.b("parts.rich_card_media_download_failure_reason");
        dqprVarM124.i(60230);
        dqprVarM124.c(new Supplier() { // from class: bfvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM124.j(new dqps() { // from class: bfvh
        });
        dqprVarM124.a();
        dqpr dqprVarM125 = dqpt.m();
        dqprVarM125.m(1);
        dqprVarM125.b("parts.image_display_state");
        dqprVarM125.i(60240);
        dqprVarM125.c(new Supplier() { // from class: bfvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM125.j(new dqps() { // from class: bfvj
        });
        dqprVarM125.a();
        dqpr dqprVarM126 = dqpt.m();
        dqprVarM126.m(1);
        dqprVarM126.b("parts.preserve_size");
        dqprVarM126.i(60680);
        dqprVarM126.c(new Supplier() { // from class: bfvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM126.j(new dqps() { // from class: bfvm
        });
        dqprVarM126.a();
        dqpr dqprVarM127 = dqpt.m();
        dqprVarM127.m(8);
        dqprVarM127.b("parts__ROWID");
        dqprVarM127.i(0);
        dqprVarM127.c(new Supplier() { // from class: bfvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM127.j(new dqps() { // from class: bfvp
        });
        dqprVarM127.a();
        dqpr dqprVarM128 = dqpt.m();
        dqprVarM128.m(4);
        dqprVarM128.d(true);
        dqprVarM128.b("participants.normalized_destination");
        dqprVarM128.f(true);
        dqprVarM128.i(-1);
        dqprVarM128.c(new Supplier() { // from class: bfvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM128.j(new dqps() { // from class: bfvr
        });
        dqprVarM128.a();
        dqpr dqprVarM129 = dqpt.m();
        dqprVarM129.m(4);
        dqprVarM129.b("participants.send_destination");
        dqprVarM129.i(-1);
        dqprVarM129.c(new Supplier() { // from class: bfvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM129.j(new dqps() { // from class: bfvt
        });
        dqprVarM129.a();
        dqpr dqprVarM130 = dqpt.m();
        dqprVarM130.m(4);
        dqprVarM130.b("participants.display_destination");
        dqprVarM130.i(-1);
        dqprVarM130.c(new Supplier() { // from class: bfvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM130.j(new dqps() { // from class: bfvv
        });
        dqprVarM130.a();
        dqpr dqprVarM131 = dqpt.m();
        dqprVarM131.m(4);
        dqprVarM131.b("participants.full_name");
        dqprVarM131.i(-1);
        dqprVarM131.c(new Supplier() { // from class: bfvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM131.j(new dqps() { // from class: bfvy
        });
        dqprVarM131.a();
        dqpr dqprVarM132 = dqpt.m();
        dqprVarM132.m(4);
        dqprVarM132.b("participants.first_name");
        dqprVarM132.i(-1);
        dqprVarM132.c(new Supplier() { // from class: bfwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM132.j(new dqps() { // from class: bfwb
        });
        dqprVarM132.a();
        dqpr dqprVarM133 = dqpt.m();
        dqprVarM133.m(4);
        dqprVarM133.b("participants.profile_photo_uri");
        dqprVarM133.i(-1);
        dqprVarM133.c(new Supplier() { // from class: bfwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM133.j(new dqps() { // from class: bfwd
        });
        dqprVarM133.a();
        dqpr dqprVarM134 = dqpt.m();
        dqprVarM134.m(1);
        dqprVarM134.b("participants.contact_id");
        dqprVarM134.i(-1);
        dqprVarM134.c(new Supplier() { // from class: bfwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM134.j(new dqps() { // from class: bfwf
        });
        dqprVarM134.a();
        dqpr dqprVarM135 = dqpt.m();
        dqprVarM135.m(4);
        dqprVarM135.b("participants.lookup_key");
        dqprVarM135.i(-1);
        dqprVarM135.c(new Supplier() { // from class: bfwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM135.j(new dqps() { // from class: bfwh
        });
        dqprVarM135.a();
        dqpr dqprVarM136 = dqpt.m();
        dqprVarM136.m(1);
        dqprVarM136.b("participants.color_palette_index");
        dqprVarM136.i(-1);
        dqprVarM136.c(new Supplier() { // from class: bfwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM136.j(new dqps() { // from class: bfwm
        });
        dqprVarM136.a();
        dqpr dqprVarM137 = dqpt.m();
        dqprVarM137.m(1);
        dqprVarM137.b("participants.color_type");
        dqprVarM137.i(1000);
        dqprVarM137.c(new Supplier() { // from class: bfwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM137.j(new dqps() { // from class: bfwo
        });
        dqprVarM137.a();
        dqpr dqprVarM138 = dqpt.m();
        dqprVarM138.m(1);
        dqprVarM138.b("participants.extended_color");
        dqprVarM138.i(10027);
        dqprVarM138.c(new Supplier() { // from class: bfwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM138.j(new dqps() { // from class: bfwq
        });
        dqprVarM138.a();
        dqpr dqprVarM139 = dqpt.m();
        dqprVarM139.m(1);
        dqprVarM139.b("participants.blocked");
        dqprVarM139.i(-1);
        dqprVarM139.c(new Supplier() { // from class: bfwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM139.j(new dqps() { // from class: bfws
        });
        dqprVarM139.a();
        dqpr dqprVarM140 = dqpt.m();
        dqprVarM140.m(1);
        dqprVarM140.b("participants.participant_type");
        dqprVarM140.i(12001);
        dqprVarM140.c(new Supplier() { // from class: bfwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM140.j(new dqps() { // from class: bfwu
        });
        dqprVarM140.a();
        dqpr dqprVarM141 = dqpt.m();
        dqprVarM141.m(1);
        dqprVarM141.b("participants.is_spam");
        dqprVarM141.i(24060);
        dqprVarM141.c(new Supplier() { // from class: bfwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM141.j(new dqps() { // from class: bfwy
        });
        dqprVarM141.a();
        dqpr dqprVarM142 = dqpt.m();
        dqprVarM142.m(1);
        dqprVarM142.b("participants.latest_verification_status");
        dqprVarM142.i(31030);
        dqprVarM142.c(new Supplier() { // from class: bfwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM142.j(new dqps() { // from class: bfxa
        });
        dqprVarM142.a();
        dqpr dqprVarM143 = dqpt.m();
        dqprVarM143.m(1);
        dqprVarM143.b("participants.directory_id");
        dqprVarM143.i(35010);
        dqprVarM143.c(new Supplier() { // from class: bfxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM143.j(new dqps() { // from class: bfxc
        });
        dqprVarM143.a();
        dqpr dqprVarM144 = dqpt.m();
        dqprVarM144.m(1);
        dqprVarM144.b("participants.name_source");
        dqprVarM144.i(59550);
        dqprVarM144.c(new Supplier() { // from class: bfxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM144.j(new dqps() { // from class: bfxe
        });
        dqprVarM144.a();
        dqpr dqprVarM145 = dqpt.m();
        dqprVarM145.m(1);
        dqprVarM145.b("participants.photo_source");
        dqprVarM145.i(59550);
        dqprVarM145.c(new Supplier() { // from class: bfxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM145.j(new dqps() { // from class: bfxg
        });
        dqprVarM145.a();
        dqpr dqprVarM146 = dqpt.m();
        dqprVarM146.m(2);
        dqprVarM146.l(true);
        dqprVarM146.g(true);
        dqprVarM146.d(true);
        dqprVarM146.b("participants._id");
        dqprVarM146.i(-1);
        dqprVarM146.c(new Supplier() { // from class: bfxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM146.j(new dqps() { // from class: bfxl
        });
        dqprVarM146.a();
        dqpr dqprVarM147 = dqpt.m();
        dqprVarM147.m(4);
        dqprVarM147.d(true);
        dqprVarM147.b("participants.my_identity_token");
        dqprVarM147.i(59930);
        dqprVarM147.c(new Supplier() { // from class: bfxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM147.j(new dqps() { // from class: bfxn
        });
        dqprVarM147.a();
        dqpr dqprVarM148 = dqpt.m();
        dqprVarM148.m(4);
        dqprVarM148.d(true);
        dqprVarM148.e(true);
        dqprVarM148.h(new Supplier() { // from class: bfxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM148.b("participants.my_identity_token_foreign_key");
        dqprVarM148.i(60160);
        dqprVarM148.c(new Supplier() { // from class: bfxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM148.j(new dqps() { // from class: bfxq
        });
        dqprVarM148.a();
        dqpr dqprVarM149 = dqpt.m();
        dqprVarM149.m(1);
        dqprVarM149.d(true);
        dqprVarM149.b("participants.sub_id");
        dqprVarM149.f(true);
        dqprVarM149.i(-1);
        dqprVarM149.c(new Supplier() { // from class: bfxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM149.j(new dqps() { // from class: bfxt
        });
        dqprVarM149.a();
        dqpr dqprVarM150 = dqpt.m();
        dqprVarM150.m(1);
        dqprVarM150.b("participants.sim_slot_id");
        dqprVarM150.i(2000);
        dqprVarM150.c(new Supplier() { // from class: bfxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM150.j(new dqps() { // from class: bfxv
        });
        dqprVarM150.a();
        dqpr dqprVarM151 = dqpt.m();
        dqprVarM151.m(4);
        dqprVarM151.l(true);
        dqprVarM151.d(true);
        dqprVarM151.b("participants.comparable_destination");
        dqprVarM151.f(true);
        dqprVarM151.i(54040);
        dqprVarM151.c(new Supplier() { // from class: bfxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM151.j(new dqps() { // from class: bfxy
        });
        dqprVarM151.a();
        dqpr dqprVarM152 = dqpt.m();
        dqprVarM152.m(4);
        dqprVarM152.b("participants.country_code");
        dqprVarM152.i(54040);
        dqprVarM152.c(new Supplier() { // from class: bfxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM152.j(new dqps() { // from class: bfya
        });
        dqprVarM152.a();
        dqpr dqprVarM153 = dqpt.m();
        dqprVarM153.m(2);
        dqprVarM153.l(true);
        dqprVarM153.d(true);
        dqprVarM153.b("participants.recipient_id");
        dqprVarM153.f(true);
        dqprVarM153.i(58090);
        dqprVarM153.c(new Supplier() { // from class: bfyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM153.j(new dqps() { // from class: bfyc
        });
        dqprVarM153.a();
        dqpr dqprVarM154 = dqpt.m();
        dqprVarM154.m(4);
        dqprVarM154.b("participants.recipient_canonical_address");
        dqprVarM154.i(58090);
        dqprVarM154.c(new Supplier() { // from class: bfye
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM154.j(new dqps() { // from class: bfyf
        });
        this.k = new bgva(dqprVarM154.a());
        dqpr dqprVarM155 = dqpt.m();
        dqprVarM155.m(4);
        dqprVarM155.b("participants.contact_photo_uri");
        dqprVarM155.i(59850);
        dqprVarM155.c(new Supplier() { // from class: bfyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM155.j(new dqps() { // from class: bfyh
        });
        dqprVarM155.a();
        dqpr dqprVarM156 = dqpt.m();
        dqprVarM156.m(4);
        dqprVarM156.b("participants.subscription_name");
        dqprVarM156.i(2000);
        dqprVarM156.c(new Supplier() { // from class: bfyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM156.j(new dqps() { // from class: bfyk
        });
        dqprVarM156.a();
        dqpr dqprVarM157 = dqpt.m();
        dqprVarM157.m(1);
        dqprVarM157.b("participants.subscription_color");
        dqprVarM157.i(2000);
        dqprVarM157.c(new Supplier() { // from class: bfyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM157.j(new dqps() { // from class: bfym
        });
        dqprVarM157.a();
        dqpr dqprVarM158 = dqpt.m();
        dqprVarM158.m(4);
        dqprVarM158.b("participants.contact_destination");
        dqprVarM158.i(4000);
        dqprVarM158.c(new Supplier() { // from class: bfyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM158.j(new dqps() { // from class: bfyp
        });
        dqprVarM158.a();
        dqpr dqprVarM159 = dqpt.m();
        dqprVarM159.m(1);
        dqprVarM159.b("participants.video_reachability");
        dqprVarM159.i(13050);
        dqprVarM159.c(new Supplier() { // from class: bfyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM159.j(new dqps() { // from class: bfyr
        });
        dqprVarM159.a();
        dqpr dqprVarM160 = dqpt.m();
        dqprVarM160.m(4);
        dqprVarM160.b("participants.alias");
        dqprVarM160.i(20060);
        dqprVarM160.c(new Supplier() { // from class: bfys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM160.j(new dqps() { // from class: bfyt
        });
        dqprVarM160.a();
        dqpr dqprVarM161 = dqpt.m();
        dqprVarM161.m(1);
        dqprVarM161.b("participants.is_rcs_available");
        dqprVarM161.i(29030);
        dqprVarM161.c(new Supplier() { // from class: bfyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM161.j(new dqps() { // from class: bfyw
        });
        dqprVarM161.a();
        dqpr dqprVarM162 = dqpt.m();
        dqprVarM162.m(1);
        dqprVarM162.b("participants.is_spam_source");
        dqprVarM162.i(30000);
        dqprVarM162.c(new Supplier() { // from class: bfyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM162.j(new dqps() { // from class: bfyy
        });
        dqprVarM162.a();
        dqpr dqprVarM163 = dqpt.m();
        dqprVarM163.m(4);
        dqprVarM163.l(true);
        dqprVarM163.d(true);
        dqprVarM163.b("participants.cms_id");
        dqprVarM163.f(true);
        dqprVarM163.i(31020);
        dqprVarM163.c(new Supplier() { // from class: bfza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM163.j(new dqps() { // from class: bfzb
        });
        dqprVarM163.a();
        dqpr dqprVarM164 = dqpt.m();
        dqprVarM164.m(4);
        dqprVarM164.b("participants.profile_photo_blob_id");
        dqprVarM164.i(33000);
        dqprVarM164.c(new Supplier() { // from class: bfzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM164.j(new dqps() { // from class: bfzd
        });
        dqprVarM164.a();
        dqpr dqprVarM165 = dqpt.m();
        dqprVarM165.m(5);
        dqprVarM165.b("participants.profile_photo_encryption_key");
        dqprVarM165.i(33060);
        dqprVarM165.c(new Supplier() { // from class: bfze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM165.j(new dqps() { // from class: bfzf
        });
        dqprVarM165.a();
        dqpr dqprVarM166 = dqpt.m();
        dqprVarM166.m(1);
        dqprVarM166.b("participants.is_check_constraint_enabled_via_phenotype");
        dqprVarM166.i(55010);
        dqprVarM166.c(new Supplier() { // from class: bfzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM166.j(new dqps() { // from class: bfzi
        });
        dqprVarM166.a();
        dqpr dqprVarM167 = dqpt.m();
        dqprVarM167.m(1);
        dqprVarM167.b("participants.is_valid_phone_number_data");
        dqprVarM167.i(55010);
        dqprVarM167.c(new Supplier() { // from class: bfzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM167.j(new dqps() { // from class: bfzl
        });
        dqprVarM167.a();
        dqpr dqprVarM168 = dqpt.m();
        dqprVarM168.m(2);
        dqprVarM168.d(true);
        dqprVarM168.e(true);
        dqprVarM168.h(new Supplier() { // from class: bfzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM168.b("participants.duplicate_of");
        dqprVarM168.i(58090);
        dqprVarM168.c(new Supplier() { // from class: bfzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM168.j(new dqps() { // from class: bfzo
        });
        dqprVarM168.a();
        dqpr dqprVarM169 = dqpt.m();
        dqprVarM169.m(1);
        dqprVarM169.b("participants.cms_life_cycle");
        dqprVarM169.i(58210);
        dqprVarM169.c(new Supplier() { // from class: bfzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM169.j(new dqps() { // from class: bfzq
        });
        dqprVarM169.a();
        dqpr dqprVarM170 = dqpt.m();
        dqprVarM170.m(1);
        dqprVarM170.b("participants.norm_ui_status");
        dqprVarM170.i(58620);
        dqprVarM170.c(new Supplier() { // from class: bfzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM170.j(new dqps() { // from class: bfzt
        });
        dqprVarM170.a();
        dqpr dqprVarM171 = dqpt.m();
        dqprVarM171.m(4);
        dqprVarM171.b("participants.last_modified_by_key");
        dqprVarM171.i(59440);
        dqprVarM171.c(new Supplier() { // from class: bfzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM171.j(new dqps() { // from class: bfzw
        });
        dqprVarM171.a();
        dqpr dqprVarM172 = dqpt.m();
        dqprVarM172.m(1);
        dqprVarM172.b("participants.profile_photo_user_preference");
        dqprVarM172.i(60060);
        dqprVarM172.c(new Supplier() { // from class: bfzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM172.j(new dqps() { // from class: bfzy
        });
        dqprVarM172.a();
        dqpr dqprVarM173 = dqpt.m();
        dqprVarM173.m(5);
        dqprVarM173.b("participants.contact_metadata");
        dqprVarM173.i(60070);
        dqprVarM173.c(new Supplier() { // from class: bfzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM173.j(new dqps() { // from class: bgaa
        });
        dqprVarM173.a();
        dqpr dqprVarM174 = dqpt.m();
        dqprVarM174.m(1);
        dqprVarM174.d(true);
        dqprVarM174.b("participants.is_enterprise_contact");
        dqprVarM174.i(60640);
        dqprVarM174.c(new Supplier() { // from class: bgab
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM174.j(new dqps() { // from class: bgac
        });
        dqprVarM174.a();
        dqpr dqprVarM175 = dqpt.m();
        dqprVarM175.m(2);
        dqprVarM175.d(true);
        dqprVarM175.b("reports_concat_view._id_read_reports");
        dqprVarM175.i(0);
        dqprVarM175.c(new Supplier() { // from class: bgad
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM175.j(new dqps() { // from class: bgaf
        });
        dqprVarM175.a();
        dqpr dqprVarM176 = dqpt.m();
        dqprVarM176.m(1);
        dqprVarM176.k(true);
        dqprVarM176.d(true);
        dqprVarM176.e(true);
        dqprVarM176.h(new Supplier() { // from class: bgah
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM176.b("reports_concat_view.message_id_read_reports");
        dqprVarM176.f(true);
        dqprVarM176.i(0);
        dqprVarM176.c(new Supplier() { // from class: bgai
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM176.j(new dqps() { // from class: bgaj
        });
        dqprVarM176.a();
        dqpr dqprVarM177 = dqpt.m();
        dqprVarM177.m(1);
        dqprVarM177.k(true);
        dqprVarM177.d(true);
        dqprVarM177.e(true);
        dqprVarM177.h(new Supplier() { // from class: bgak
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM177.b("reports_concat_view.participant_id_read_reports");
        dqprVarM177.f(true);
        dqprVarM177.i(0);
        dqprVarM177.c(new Supplier() { // from class: bgal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM177.j(new dqps() { // from class: bgam
        });
        dqprVarM177.a();
        dqpr dqprVarM178 = dqpt.m();
        dqprVarM178.m(1);
        dqprVarM178.b("reports_concat_view.receive_time_read_reports");
        dqprVarM178.i(0);
        dqprVarM178.c(new Supplier() { // from class: bgan
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM178.j(new dqps() { // from class: bgao
        });
        dqprVarM178.a();
        dqpr dqprVarM179 = dqpt.m();
        dqprVarM179.m(1);
        dqprVarM179.b("reports_concat_view.read_time_read_reports");
        dqprVarM179.i(0);
        dqprVarM179.c(new Supplier() { // from class: bgap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM179.j(new dqps() { // from class: bgat
        });
        dqprVarM179.a();
        dqpr dqprVarM180 = dqpt.m();
        dqprVarM180.m(2);
        dqprVarM180.b("reports_concat_view.ftd_time_read_reports");
        dqprVarM180.i(0);
        dqprVarM180.c(new Supplier() { // from class: bgau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM180.j(new dqps() { // from class: bgav
        });
        dqprVarM180.a();
        dqpr dqprVarM181 = dqpt.m();
        dqprVarM181.m(8);
        dqprVarM181.b("reports_concat_view.read_reports__ROWID_read_reports");
        dqprVarM181.i(0);
        dqprVarM181.c(new Supplier() { // from class: bgaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM181.j(new dqps() { // from class: bgax
        });
        dqprVarM181.a();
        dqpr dqprVarM182 = dqpt.m();
        dqprVarM182.m(2);
        dqprVarM182.k(true);
        dqprVarM182.d(true);
        dqprVarM182.e(true);
        dqprVarM182.h(new Supplier() { // from class: bgay
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM182.b("user_refs_concat_view.message_id_user_references");
        dqprVarM182.f(true);
        dqprVarM182.i(0);
        dqprVarM182.c(new Supplier() { // from class: bgaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM182.j(new dqps() { // from class: bgba
        });
        dqprVarM182.a();
        dqpr dqprVarM183 = dqpt.m();
        dqprVarM183.m(2);
        dqprVarM183.k(true);
        dqprVarM183.d(true);
        dqprVarM183.e(true);
        dqprVarM183.h(new Supplier() { // from class: bgbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM183.b("user_refs_concat_view.participant_id_user_references");
        dqprVarM183.f(true);
        dqprVarM183.i(0);
        dqprVarM183.c(new Supplier() { // from class: bgbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM183.j(new dqps() { // from class: bgbf
        });
        dqprVarM183.a();
        dqpr dqprVarM184 = dqpt.m();
        dqprVarM184.m(2);
        dqprVarM184.b("user_refs_concat_view.user_ref_datetime_user_references");
        dqprVarM184.i(0);
        dqprVarM184.c(new Supplier() { // from class: bgbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM184.j(new dqps() { // from class: bgbh
        });
        dqprVarM184.a();
        dqpr dqprVarM185 = dqpt.m();
        dqprVarM185.m(8);
        dqprVarM185.b("user_refs_concat_view.user_references__ROWID_user_references");
        dqprVarM185.i(0);
        dqprVarM185.c(new Supplier() { // from class: bgbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM185.j(new dqps() { // from class: bgbj
        });
        dqprVarM185.a();
        dqpr dqprVarM186 = dqpt.m();
        dqprVarM186.m(8);
        dqprVarM186.b("user_refs_concat_view.user_ref_display_name");
        dqprVarM186.i(0);
        dqprVarM186.c(new Supplier() { // from class: bgbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM186.j(new dqps() { // from class: bgbl
        });
        dqprVarM186.a();
        dqpr dqprVarM187 = dqpt.m();
        dqprVarM187.m(8);
        dqprVarM187.b("user_refs_concat_view.user_ref_profile_photo_uri");
        dqprVarM187.i(0);
        dqprVarM187.c(new Supplier() { // from class: bgbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM187.j(new dqps() { // from class: bgbn
        });
        dqprVarM187.a();
        dqpr dqprVarM188 = dqpt.m();
        dqprVarM188.m(8);
        dqprVarM188.b("user_refs_concat_view.user_ref_full_name");
        dqprVarM188.i(0);
        dqprVarM188.c(new Supplier() { // from class: bgbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM188.j(new dqps() { // from class: bgbr
        });
        dqprVarM188.a();
        dqpr dqprVarM189 = dqpt.m();
        dqprVarM189.m(8);
        dqprVarM189.b("user_refs_concat_view.user_ref_lookup_key");
        dqprVarM189.i(0);
        dqprVarM189.c(new Supplier() { // from class: bgbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM189.j(new dqps() { // from class: bgbt
        });
        dqprVarM189.a();
        dqpr dqprVarM190 = dqpt.m();
        dqprVarM190.m(4);
        dqprVarM190.d(true);
        dqprVarM190.b("user_refs_concat_view.normalized_destination_participants");
        dqprVarM190.f(true);
        dqprVarM190.i(0);
        dqprVarM190.c(new Supplier() { // from class: bgbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM190.j(new dqps() { // from class: bgbv
        });
        dqprVarM190.a();
        dqpr dqprVarM191 = dqpt.m();
        dqprVarM191.m(1);
        dqprVarM191.b("user_refs_concat_view.color_palette_index_participants");
        dqprVarM191.i(0);
        dqprVarM191.c(new Supplier() { // from class: bgbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM191.j(new dqps() { // from class: bgbx
        });
        dqprVarM191.a();
        dqpr dqprVarM192 = dqpt.m();
        dqprVarM192.m(1);
        dqprVarM192.b("user_refs_concat_view.color_type_participants");
        dqprVarM192.i(0);
        dqprVarM192.c(new Supplier() { // from class: bgby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM192.j(new dqps() { // from class: bgca
        });
        dqprVarM192.a();
        dqpr dqprVarM193 = dqpt.m();
        dqprVarM193.m(1);
        dqprVarM193.b("user_refs_concat_view.extended_color_participants");
        dqprVarM193.i(0);
        dqprVarM193.c(new Supplier() { // from class: bgcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM193.j(new dqps() { // from class: bgce
        });
        dqprVarM193.a();
        dqpr dqprVarM194 = dqpt.m();
        dqprVarM194.m(8);
        dqprVarM194.b("user_refs_concat_view.participants__ROWID_participants");
        dqprVarM194.i(0);
        dqprVarM194.c(new Supplier() { // from class: bgcf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM194.j(new dqps() { // from class: bgcg
        });
        dqprVarM194.a();
        dqpr dqprVarM195 = dqpt.m();
        dqprVarM195.m(2);
        dqprVarM195.l(true);
        dqprVarM195.d(true);
        dqprVarM195.e(true);
        dqprVarM195.h(new Supplier() { // from class: bgch
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM195.b("link_preview.message_id");
        dqprVarM195.i(-1);
        dqprVarM195.c(new Supplier() { // from class: bgci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM195.j(new dqps() { // from class: bgcj
        });
        dqprVarM195.a();
        dqpr dqprVarM196 = dqpt.m();
        dqprVarM196.m(4);
        dqprVarM196.b("link_preview.trigger_url");
        dqprVarM196.i(-1);
        dqprVarM196.c(new Supplier() { // from class: bgcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM196.j(new dqps() { // from class: bgcm
        });
        dqprVarM196.a();
        dqpr dqprVarM197 = dqpt.m();
        dqprVarM197.m(2);
        dqprVarM197.b("link_preview.expiration_time_millis");
        dqprVarM197.i(-1);
        dqprVarM197.c(new Supplier() { // from class: bgcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM197.j(new dqps() { // from class: bgco
        });
        dqprVarM197.a();
        dqpr dqprVarM198 = dqpt.m();
        dqprVarM198.m(4);
        dqprVarM198.b("link_preview.link_title");
        dqprVarM198.i(-1);
        dqprVarM198.c(new Supplier() { // from class: bgcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM198.j(new dqps() { // from class: bgcr
        });
        dqprVarM198.a();
        dqpr dqprVarM199 = dqpt.m();
        dqprVarM199.m(4);
        dqprVarM199.b("link_preview.link_description");
        dqprVarM199.i(-1);
        dqprVarM199.c(new Supplier() { // from class: bgcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM199.j(new dqps() { // from class: bgct
        });
        dqprVarM199.a();
        dqpr dqprVarM200 = dqpt.m();
        dqprVarM200.m(4);
        dqprVarM200.b("link_preview.link_image_url");
        dqprVarM200.i(-1);
        dqprVarM200.c(new Supplier() { // from class: bgcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM200.j(new dqps() { // from class: bgcw
        });
        dqprVarM200.a();
        dqpr dqprVarM201 = dqpt.m();
        dqprVarM201.m(4);
        dqprVarM201.b("link_preview.link_domain");
        dqprVarM201.i(-1);
        dqprVarM201.c(new Supplier() { // from class: bgcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM201.j(new dqps() { // from class: bgcy
        });
        dqprVarM201.a();
        dqpr dqprVarM202 = dqpt.m();
        dqprVarM202.m(4);
        dqprVarM202.b("link_preview.link_canonical_url");
        dqprVarM202.i(-1);
        dqprVarM202.c(new Supplier() { // from class: bgcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM202.j(new dqps() { // from class: bgda
        });
        dqprVarM202.a();
        dqpr dqprVarM203 = dqpt.m();
        dqprVarM203.m(2);
        dqprVarM203.b("link_preview.link_preview_prevented");
        dqprVarM203.i(21010);
        dqprVarM203.c(new Supplier() { // from class: bgdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM203.j(new dqps() { // from class: bgdd
        });
        dqprVarM203.a();
        dqpr dqprVarM204 = dqpt.m();
        dqprVarM204.m(2);
        dqprVarM204.b("link_preview.link_preview_failed");
        dqprVarM204.i(22020);
        dqprVarM204.c(new Supplier() { // from class: bgde
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM204.j(new dqps() { // from class: bgdf
        });
        dqprVarM204.a();
        dqpr dqprVarM205 = dqpt.m();
        dqprVarM205.m(2);
        dqprVarM205.l(true);
        dqprVarM205.g(true);
        dqprVarM205.d(true);
        dqprVarM205.b("link_preview._id");
        dqprVarM205.i(-1);
        dqprVarM205.c(new Supplier() { // from class: bgdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM205.j(new dqps() { // from class: bgdi
        });
        dqprVarM205.a();
        dqpr dqprVarM206 = dqpt.m();
        dqprVarM206.m(2);
        dqprVarM206.b("link_preview.deferred");
        dqprVarM206.i(61000);
        dqprVarM206.c(new Supplier() { // from class: bgdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM206.j(new dqps() { // from class: bgdk
        });
        dqprVarM206.a();
        dqpr dqprVarM207 = dqpt.m();
        dqprVarM207.m(4);
        dqprVarM207.l(true);
        dqprVarM207.g(true);
        dqprVarM207.d(true);
        dqprVarM207.b("verified_sms_senders.sender_id");
        dqprVarM207.i(-1);
        dqprVarM207.c(new Supplier() { // from class: bgdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM207.j(new dqps() { // from class: bgdm
        });
        dqprVarM207.a();
        dqpr dqprVarM208 = dqpt.m();
        dqprVarM208.m(4);
        dqprVarM208.b("verified_sms_senders.brand_id");
        dqprVarM208.i(-1);
        dqprVarM208.c(new Supplier() { // from class: bgdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM208.j(new dqps() { // from class: bgdp
        });
        dqprVarM208.a();
        dqpr dqprVarM209 = dqpt.m();
        dqprVarM209.m(4);
        dqprVarM209.b("verified_sms_brands.name");
        dqprVarM209.i(-1);
        dqprVarM209.c(new Supplier() { // from class: bgdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM209.j(new dqps() { // from class: bgds
        });
        dqprVarM209.a();
        dqpr dqprVarM210 = dqpt.m();
        dqprVarM210.m(4);
        dqprVarM210.b("verified_sms_brands.description");
        dqprVarM210.i(-1);
        dqprVarM210.c(new Supplier() { // from class: bgdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM210.j(new dqps() { // from class: bgdu
        });
        dqprVarM210.a();
        dqpr dqprVarM211 = dqpt.m();
        dqprVarM211.m(4);
        dqprVarM211.b("verified_sms_brands.logo_uri");
        dqprVarM211.i(-1);
        dqprVarM211.c(new Supplier() { // from class: bgdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM211.j(new dqps() { // from class: bgdw
        });
        dqprVarM211.a();
        dqpr dqprVarM212 = dqpt.m();
        dqprVarM212.m(2);
        dqprVarM212.l(true);
        dqprVarM212.g(true);
        dqprVarM212.d(true);
        dqprVarM212.b("verified_sms_brands._id");
        dqprVarM212.i(-1);
        dqprVarM212.c(new Supplier() { // from class: bgdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM212.j(new dqps() { // from class: bgdy
        });
        dqprVarM212.a();
        dqpr dqprVarM213 = dqpt.m();
        dqprVarM213.m(4);
        dqprVarM213.l(true);
        dqprVarM213.d(true);
        dqprVarM213.b("verified_sms_brands.brand_id");
        dqprVarM213.i(-1);
        dqprVarM213.c(new Supplier() { // from class: bgea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM213.j(new dqps() { // from class: bgeb
        });
        dqprVarM213.a();
        dqpr dqprVarM214 = dqpt.m();
        dqprVarM214.m(4);
        dqprVarM214.b("verified_sms_brands.logo_url");
        dqprVarM214.i(-1);
        dqprVarM214.c(new Supplier() { // from class: bged
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM214.j(new dqps() { // from class: bgee
        });
        dqprVarM214.a();
        dqpr dqprVarM215 = dqpt.m();
        dqprVarM215.m(4);
        dqprVarM215.b("verified_sms_brands.version_token");
        dqprVarM215.i(-1);
        dqprVarM215.c(new Supplier() { // from class: bgef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM215.j(new dqps() { // from class: bgeg
        });
        dqprVarM215.a();
        dqpr dqprVarM216 = dqpt.m();
        dqprVarM216.m(4);
        dqprVarM216.d(true);
        dqprVarM216.b("conversations.participant_normalized_destination");
        dqprVarM216.i(-1);
        dqprVarM216.c(new Supplier() { // from class: bgeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM216.j(new dqps() { // from class: bgei
        });
        dqprVarM216.a();
        dqpr dqprVarM217 = dqpt.m();
        dqprVarM217.m(1);
        dqprVarM217.b("conversations.conv_type");
        dqprVarM217.i(10007);
        dqprVarM217.c(new Supplier() { // from class: bgej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM217.j(new dqps() { // from class: bgek
        });
        dqprVarM217.a();
        dqpr dqprVarM218 = dqpt.m();
        dqprVarM218.m(1);
        dqprVarM218.b("conversations.has_ea2p_bot_recipient");
        dqprVarM218.i(12001);
        dqprVarM218.c(new Supplier() { // from class: bgem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM218.j(new dqps() { // from class: bgeo
        });
        this.l = new bgva(dqprVarM218.a());
        dqpr dqprVarM219 = dqpt.m();
        dqprVarM219.m(4);
        dqprVarM219.d(true);
        dqprVarM219.b("conversations.rcs_group_id");
        dqprVarM219.i(40050);
        dqprVarM219.c(new Supplier() { // from class: bgep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM219.j(new dqps() { // from class: bgeq
        });
        this.m = new bgva(dqprVarM219.a());
        dqpr dqprVarM220 = dqpt.m();
        dqprVarM220.m(4);
        dqprVarM220.b("conversations.rcs_conference_uri");
        dqprVarM220.i(40050);
        dqprVarM220.c(new Supplier() { // from class: bger
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM220.j(new dqps() { // from class: bges
        });
        dqprVarM220.a();
        dqpr dqprVarM221 = dqpt.m();
        dqprVarM221.m(1);
        dqprVarM221.b("conversations.rcs_session_allows_revocation");
        dqprVarM221.i(48040);
        dqprVarM221.c(new Supplier() { // from class: bget
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM221.j(new dqps() { // from class: bgeu
        });
        dqprVarM221.a();
        dqpr dqprVarM222 = dqpt.m();
        dqprVarM222.m(2);
        dqprVarM222.b("conversations.recipient_offline_timestamp_ms");
        dqprVarM222.i(58750);
        dqprVarM222.c(new Supplier() { // from class: bgev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM222.j(new dqps() { // from class: bgew
        });
        dqprVarM222.a();
        dqpr dqprVarM223 = dqpt.m();
        dqprVarM223.m(2);
        dqprVarM223.l(true);
        dqprVarM223.g(true);
        dqprVarM223.d(true);
        dqprVarM223.b("conversations._id");
        dqprVarM223.i(-1);
        dqprVarM223.c(new Supplier() { // from class: bgfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM223.j(new dqps() { // from class: bgfb
        });
        this.n = new bgva(dqprVarM223.a());
        dqpr dqprVarM224 = dqpt.m();
        dqprVarM224.m(1);
        dqprVarM224.d(true);
        dqprVarM224.b("conversations.sms_thread_id");
        dqprVarM224.i(-1);
        dqprVarM224.c(new Supplier() { // from class: bgfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM224.j(new dqps() { // from class: bgfd
        });
        dqprVarM224.a();
        dqpr dqprVarM225 = dqpt.m();
        dqprVarM225.m(4);
        dqprVarM225.b("conversations.name");
        dqprVarM225.i(-1);
        dqprVarM225.c(new Supplier() { // from class: bgfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM225.j(new dqps() { // from class: bgff
        });
        dqprVarM225.a();
        dqpr dqprVarM226 = dqpt.m();
        dqprVarM226.m(2);
        dqprVarM226.b("conversations.name_is_automatic");
        dqprVarM226.i(10012);
        dqprVarM226.c(new Supplier() { // from class: bgfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM226.j(new dqps() { // from class: bgfh
        });
        dqprVarM226.a();
        dqpr dqprVarM227 = dqpt.m();
        dqprVarM227.m(4);
        dqprVarM227.b("conversations.subtitle");
        dqprVarM227.i(59760);
        dqprVarM227.c(new Supplier() { // from class: bgfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM227.j(new dqps() { // from class: bgfj
        });
        dqprVarM227.a();
        dqpr dqprVarM228 = dqpt.m();
        dqprVarM228.m(1);
        dqprVarM228.b("conversations.latest_message_id");
        dqprVarM228.i(-1);
        dqprVarM228.c(new Supplier() { // from class: bgfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM228.j(new dqps() { // from class: bgfn
        });
        dqprVarM228.a();
        dqpr dqprVarM229 = dqpt.m();
        dqprVarM229.m(4);
        dqprVarM229.b("conversations.snippet_text");
        dqprVarM229.i(-1);
        dqprVarM229.c(new Supplier() { // from class: bgfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM229.j(new dqps() { // from class: bgfp
        });
        dqprVarM229.a();
        dqpr dqprVarM230 = dqpt.m();
        dqprVarM230.m(4);
        dqprVarM230.b("conversations.subject_text");
        dqprVarM230.i(-1);
        dqprVarM230.c(new Supplier() { // from class: bgfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM230.j(new dqps() { // from class: bgfr
        });
        dqprVarM230.a();
        dqpr dqprVarM231 = dqpt.m();
        dqprVarM231.m(4);
        dqprVarM231.b("conversations.preview_uri");
        dqprVarM231.i(-1);
        dqprVarM231.c(new Supplier() { // from class: bgfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM231.j(new dqps() { // from class: bgft
        });
        dqprVarM231.a();
        dqpr dqprVarM232 = dqpt.m();
        dqprVarM232.m(4);
        dqprVarM232.b("conversations.preview_content_type");
        dqprVarM232.i(-1);
        dqprVarM232.c(new Supplier() { // from class: bgfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM232.j(new dqps() { // from class: bgfw
        });
        dqprVarM232.a();
        dqpr dqprVarM233 = dqpt.m();
        dqprVarM233.m(1);
        dqprVarM233.b("conversations.show_draft");
        dqprVarM233.i(-1);
        dqprVarM233.c(new Supplier() { // from class: bgfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM233.j(new dqps() { // from class: bgfz
        });
        dqprVarM233.a();
        dqpr dqprVarM234 = dqpt.m();
        dqprVarM234.m(4);
        dqprVarM234.b("conversations.draft_snippet_text");
        dqprVarM234.i(-1);
        dqprVarM234.c(new Supplier() { // from class: bgga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM234.j(new dqps() { // from class: bggb
        });
        dqprVarM234.a();
        dqpr dqprVarM235 = dqpt.m();
        dqprVarM235.m(4);
        dqprVarM235.b("conversations.draft_subject_text");
        dqprVarM235.i(-1);
        dqprVarM235.c(new Supplier() { // from class: bggc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM235.j(new dqps() { // from class: bggd
        });
        dqprVarM235.a();
        dqpr dqprVarM236 = dqpt.m();
        dqprVarM236.m(4);
        dqprVarM236.b("conversations.draft_preview_uri");
        dqprVarM236.i(-1);
        dqprVarM236.c(new Supplier() { // from class: bgge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM236.j(new dqps() { // from class: bggf
        });
        dqprVarM236.a();
        dqpr dqprVarM237 = dqpt.m();
        dqprVarM237.m(4);
        dqprVarM237.b("conversations.draft_preview_content_type");
        dqprVarM237.i(-1);
        dqprVarM237.c(new Supplier() { // from class: bggh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM237.j(new dqps() { // from class: bggi
        });
        dqprVarM237.a();
        dqpr dqprVarM238 = dqpt.m();
        dqprVarM238.m(1);
        dqprVarM238.b("conversations.etouffee_default");
        dqprVarM238.i(29060);
        dqprVarM238.c(new Supplier() { // from class: bggk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM238.j(new dqps() { // from class: bggl
        });
        dqprVarM238.a();
        dqpr dqprVarM239 = dqpt.m();
        dqprVarM239.m(1);
        dqprVarM239.d(true);
        dqprVarM239.b("conversations.archive_status");
        dqprVarM239.i(-1);
        dqprVarM239.c(new Supplier() { // from class: bggm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM239.j(new dqps() { // from class: bggn
        });
        dqprVarM239.a();
        dqpr dqprVarM240 = dqpt.m();
        dqprVarM240.m(1);
        dqprVarM240.d(true);
        dqprVarM240.b("conversations.sort_timestamp");
        dqprVarM240.i(-1);
        dqprVarM240.c(new Supplier() { // from class: bggo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM240.j(new dqps() { // from class: bggp
        });
        dqprVarM240.a();
        dqpr dqprVarM241 = dqpt.m();
        dqprVarM241.m(1);
        dqprVarM241.b("conversations.last_read_timestamp");
        dqprVarM241.i(-1);
        dqprVarM241.c(new Supplier() { // from class: bggq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM241.j(new dqps() { // from class: bggs
        });
        dqprVarM241.a();
        dqpr dqprVarM242 = dqpt.m();
        dqprVarM242.m(4);
        dqprVarM242.b("conversations.icon");
        dqprVarM242.i(-1);
        dqprVarM242.c(new Supplier() { // from class: bggt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM242.j(new dqps() { // from class: bggu
        });
        dqprVarM242.a();
        dqpr dqprVarM243 = dqpt.m();
        dqprVarM243.m(1);
        dqprVarM243.b("conversations.participant_contact_id");
        dqprVarM243.i(-1);
        dqprVarM243.c(new Supplier() { // from class: bggx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM243.j(new dqps() { // from class: bggy
        });
        dqprVarM243.a();
        dqpr dqprVarM244 = dqpt.m();
        dqprVarM244.m(1);
        dqprVarM244.b("conversations.normalized_participant_contact_id");
        dqprVarM244.i(58090);
        dqprVarM244.c(new Supplier() { // from class: bggz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM244.j(new dqps() { // from class: bgha
        });
        dqprVarM244.a();
        dqpr dqprVarM245 = dqpt.m();
        dqprVarM245.m(4);
        dqprVarM245.b("conversations.participant_lookup_key");
        dqprVarM245.i(-1);
        dqprVarM245.c(new Supplier() { // from class: bghb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM245.j(new dqps() { // from class: bghd
        });
        dqprVarM245.a();
        dqpr dqprVarM246 = dqpt.m();
        dqprVarM246.m(4);
        dqprVarM246.b("conversations.normalized_participant_lookup_key");
        dqprVarM246.i(58090);
        dqprVarM246.c(new Supplier() { // from class: bghe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM246.j(new dqps() { // from class: bghf
        });
        dqprVarM246.a();
        dqpr dqprVarM247 = dqpt.m();
        dqprVarM247.m(4);
        dqprVarM247.l(true);
        dqprVarM247.d(true);
        dqprVarM247.b("conversations.participant_comparable_destination");
        dqprVarM247.f(true);
        dqprVarM247.i(58090);
        dqprVarM247.c(new Supplier() { // from class: bghg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM247.j(new dqps() { // from class: bghh
        });
        dqprVarM247.a();
        dqpr dqprVarM248 = dqpt.m();
        dqprVarM248.m(4);
        dqprVarM248.b("conversations.current_self_id");
        dqprVarM248.i(-1);
        dqprVarM248.c(new Supplier() { // from class: bghj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM248.j(new dqps() { // from class: bghk
        });
        dqprVarM248.a();
        dqpr dqprVarM249 = dqpt.m();
        dqprVarM249.m(4);
        dqprVarM249.b("conversations.current_my_identity");
        dqprVarM249.i(59810);
        dqprVarM249.c(new Supplier() { // from class: bghl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM249.j(new dqps() { // from class: bghm
        });
        dqprVarM249.a();
        dqpr dqprVarM250 = dqpt.m();
        dqprVarM250.m(4);
        dqprVarM250.d(true);
        dqprVarM250.e(true);
        dqprVarM250.h(new Supplier() { // from class: bgho
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM250.b("conversations.current_my_identity_foreign_key");
        dqprVarM250.i(60160);
        dqprVarM250.c(new Supplier() { // from class: bghp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM250.j(new dqps() { // from class: bghq
        });
        dqprVarM250.a();
        dqpr dqprVarM251 = dqpt.m();
        dqprVarM251.m(4);
        dqprVarM251.d(true);
        dqprVarM251.e(true);
        dqprVarM251.h(new Supplier() { // from class: bghr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.b.a;
            }
        });
        dqprVarM251.b("conversations.destination_token");
        dqprVarM251.i(60360);
        dqprVarM251.c(new Supplier() { // from class: bghs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM251.j(new dqps() { // from class: bght
        });
        dqprVarM251.a();
        dqpr dqprVarM252 = dqpt.m();
        dqprVarM252.m(1);
        dqprVarM252.b("conversations.participant_count");
        dqprVarM252.i(-1);
        dqprVarM252.c(new Supplier() { // from class: bghv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM252.j(new dqps() { // from class: bghw
        });
        dqprVarM252.a();
        dqpr dqprVarM253 = dqpt.m();
        dqprVarM253.m(1);
        dqprVarM253.b("conversations.notification_enabled");
        dqprVarM253.i(-1);
        dqprVarM253.c(new Supplier() { // from class: bghx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM253.j(new dqps() { // from class: bghz
        });
        dqprVarM253.a();
        dqpr dqprVarM254 = dqpt.m();
        dqprVarM254.m(4);
        dqprVarM254.b("conversations.notification_sound_uri");
        dqprVarM254.i(-1);
        dqprVarM254.c(new Supplier() { // from class: bgia
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM254.j(new dqps() { // from class: bgib
        });
        dqprVarM254.a();
        dqpr dqprVarM255 = dqpt.m();
        dqprVarM255.m(1);
        dqprVarM255.b("conversations.notification_vibration");
        dqprVarM255.i(-1);
        dqprVarM255.c(new Supplier() { // from class: bgic
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM255.j(new dqps() { // from class: bgid
        });
        dqprVarM255.a();
        dqpr dqprVarM256 = dqpt.m();
        dqprVarM256.m(1);
        dqprVarM256.b("conversations.include_email_addr");
        dqprVarM256.i(-1);
        dqprVarM256.c(new Supplier() { // from class: bgie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM256.j(new dqps() { // from class: bgif
        });
        dqprVarM256.a();
        dqpr dqprVarM257 = dqpt.m();
        dqprVarM257.m(4);
        dqprVarM257.b("conversations.sms_service_center");
        dqprVarM257.i(-1);
        dqprVarM257.c(new Supplier() { // from class: bgih
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM257.j(new dqps() { // from class: bgii
        });
        dqprVarM257.a();
        dqpr dqprVarM258 = dqpt.m();
        dqprVarM258.m(4);
        dqprVarM258.b("conversations.participant_id_list");
        dqprVarM258.i(8500);
        dqprVarM258.c(new Supplier() { // from class: bgik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM258.j(new dqps() { // from class: bgil
        });
        dqprVarM258.a();
        dqpr dqprVarM259 = dqpt.m();
        dqprVarM259.m(4);
        dqprVarM259.l(true);
        dqprVarM259.d(true);
        dqprVarM259.b("conversations.normalized_participant_id_list");
        dqprVarM259.f(true);
        dqprVarM259.i(58090);
        dqprVarM259.c(new Supplier() { // from class: bgim
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM259.j(new dqps() { // from class: bgin
        });
        dqprVarM259.a();
        dqpr dqprVarM260 = dqpt.m();
        dqprVarM260.m(1);
        dqprVarM260.b("conversations.source_type");
        dqprVarM260.i(8500);
        dqprVarM260.c(new Supplier() { // from class: bgio
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM260.j(new dqps() { // from class: bgip
        });
        dqprVarM260.a();
        dqpr dqprVarM261 = dqpt.m();
        dqprVarM261.m(1);
        dqprVarM261.d(true);
        dqprVarM261.b("conversations.rcs_session_id");
        dqprVarM261.i(10000);
        dqprVarM261.c(new Supplier() { // from class: bgiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM261.j(new dqps() { // from class: bgir
        });
        dqprVarM261.a();
        dqpr dqprVarM262 = dqpt.m();
        dqprVarM262.m(1);
        dqprVarM262.b("conversations.join_state");
        dqprVarM262.i(10006);
        dqprVarM262.c(new Supplier() { // from class: bgit
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM262.j(new dqps() { // from class: bgiv
        });
        dqprVarM262.a();
        dqpr dqprVarM263 = dqpt.m();
        dqprVarM263.m(1);
        dqprVarM263.b("conversations.send_mode");
        dqprVarM263.i(10016);
        dqprVarM263.c(new Supplier() { // from class: bgiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM263.j(new dqps() { // from class: bgix
        });
        dqprVarM263.a();
        dqpr dqprVarM264 = dqpt.m();
        dqprVarM264.m(1);
        dqprVarM264.b("conversations.IS_ENTERPRISE");
        dqprVarM264.i(10018);
        dqprVarM264.c(new Supplier() { // from class: bgiy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM264.j(new dqps() { // from class: bgiz
        });
        dqprVarM264.a();
        dqpr dqprVarM265 = dqpt.m();
        dqprVarM265.m(1);
        dqprVarM265.b("conversations.last_interactive_event_timestamp");
        dqprVarM265.i(15000);
        dqprVarM265.c(new Supplier() { // from class: bgja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM265.j(new dqps() { // from class: bgjb
        });
        dqprVarM265.a();
        dqpr dqprVarM266 = dqpt.m();
        dqprVarM266.m(4);
        dqprVarM266.b("conversations.participant_display_destination");
        dqprVarM266.i(15010);
        dqprVarM266.c(new Supplier() { // from class: bgjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM266.j(new dqps() { // from class: bgjd
        });
        dqprVarM266.a();
        dqpr dqprVarM267 = dqpt.m();
        dqprVarM267.m(4);
        dqprVarM267.b("conversations.normalized_participant_display_destination");
        dqprVarM267.i(58090);
        dqprVarM267.c(new Supplier() { // from class: bgjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM267.j(new dqps() { // from class: bgji
        });
        dqprVarM267.a();
        dqpr dqprVarM268 = dqpt.m();
        dqprVarM268.m(1);
        dqprVarM268.b("conversations.spam_warning_dismiss_status");
        dqprVarM268.i(23000);
        dqprVarM268.c(new Supplier() { // from class: bgjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM268.j(new dqps() { // from class: bgjk
        });
        dqprVarM268.a();
        dqpr dqprVarM269 = dqpt.m();
        dqprVarM269.m(1);
        dqprVarM269.b("conversations.open_count");
        dqprVarM269.i(26020);
        dqprVarM269.c(new Supplier() { // from class: bgjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM269.j(new dqps() { // from class: bgjm
        });
        dqprVarM269.a();
        dqpr dqprVarM270 = dqpt.m();
        dqprVarM270.m(1);
        dqprVarM270.b("conversations.last_logged_scooby_metadata_timestamp");
        dqprVarM270.i(28010);
        dqprVarM270.c(new Supplier() { // from class: bgjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM270.j(new dqps() { // from class: bgjo
        });
        dqprVarM270.a();
        dqpr dqprVarM271 = dqpt.m();
        dqprVarM271.m(1);
        dqprVarM271.d(true);
        dqprVarM271.b("conversations.delete_timestamp");
        dqprVarM271.i(29020);
        dqprVarM271.c(new Supplier() { // from class: bgjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM271.j(new dqps() { // from class: bgjq
        });
        dqprVarM271.a();
        dqpr dqprVarM272 = dqpt.m();
        dqprVarM272.m(4);
        dqprVarM272.l(true);
        dqprVarM272.d(true);
        dqprVarM272.b("conversations.cms_id");
        dqprVarM272.f(true);
        dqprVarM272.i(32000);
        dqprVarM272.c(new Supplier() { // from class: bgjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM272.j(new dqps() { // from class: bgju
        });
        dqprVarM272.a();
        dqpr dqprVarM273 = dqpt.m();
        dqprVarM273.m(5);
        dqprVarM273.b("conversations.tachygram_group_routing_info_token");
        dqprVarM273.i(58120);
        dqprVarM273.c(new Supplier() { // from class: bgjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM273.j(new dqps() { // from class: bgjw
        });
        dqprVarM273.a();
        dqpr dqprVarM274 = dqpt.m();
        dqprVarM274.m(1);
        dqprVarM274.b("conversations.cms_most_recent_read_message_timestamp_ms");
        dqprVarM274.i(53030);
        dqprVarM274.c(new Supplier() { // from class: bgjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM274.j(new dqps() { // from class: bgjy
        });
        dqprVarM274.a();
        dqpr dqprVarM275 = dqpt.m();
        dqprVarM275.m(2);
        dqprVarM275.b("conversations.rcs_subject_change_timestamp_ms");
        dqprVarM275.i(46050);
        dqprVarM275.c(new Supplier() { // from class: bgjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM275.j(new dqps() { // from class: bgka
        });
        dqprVarM275.a();
        dqpr dqprVarM276 = dqpt.m();
        dqprVarM276.m(2);
        dqprVarM276.b("conversations.rcs_group_capabilities");
        dqprVarM276.i(49020);
        dqprVarM276.c(new Supplier() { // from class: bgkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM276.j(new dqps() { // from class: bgkd
        });
        dqprVarM276.a();
        dqpr dqprVarM277 = dqpt.m();
        dqprVarM277.m(1);
        dqprVarM277.b("conversations.awaiting_reverse_sync");
        dqprVarM277.i(49060);
        dqprVarM277.c(new Supplier() { // from class: bgkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM277.j(new dqps() { // from class: bgkg
        });
        dqprVarM277.a();
        dqpr dqprVarM278 = dqpt.m();
        dqprVarM278.m(2);
        dqprVarM278.d(true);
        dqprVarM278.e(true);
        dqprVarM278.h(new Supplier() { // from class: bgkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM278.b("conversations.duplicate_of");
        dqprVarM278.i(58090);
        dqprVarM278.c(new Supplier() { // from class: bgki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM278.j(new dqps() { // from class: bgkj
        });
        dqprVarM278.a();
        dqpr dqprVarM279 = dqpt.m();
        dqprVarM279.m(2);
        dqprVarM279.d(true);
        dqprVarM279.e(true);
        dqprVarM279.h(new Supplier() { // from class: bgkk
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM279.b("conversations.new_duplicate_of");
        dqprVarM279.i(59130);
        dqprVarM279.c(new Supplier() { // from class: bgkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM279.j(new dqps() { // from class: bgkm
        });
        dqprVarM279.a();
        dqpr dqprVarM280 = dqpt.m();
        dqprVarM280.m(1);
        dqprVarM280.b("conversations.error_state");
        dqprVarM280.i(58140);
        dqprVarM280.c(new Supplier() { // from class: bgko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM280.j(new dqps() { // from class: bgkp
        });
        dqprVarM280.a();
        dqpr dqprVarM281 = dqpt.m();
        dqprVarM281.m(1);
        dqprVarM281.b("conversations.cms_life_cycle");
        dqprVarM281.i(58210);
        dqprVarM281.c(new Supplier() { // from class: bgkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM281.j(new dqps() { // from class: bgks
        });
        dqprVarM281.a();
        dqpr dqprVarM282 = dqpt.m();
        dqprVarM282.m(4);
        dqprVarM282.b("conversations.rcs_group_self_msisdn");
        dqprVarM282.i(58540);
        dqprVarM282.c(new Supplier() { // from class: bgkt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM282.j(new dqps() { // from class: bgku
        });
        dqprVarM282.a();
        dqpr dqprVarM283 = dqpt.m();
        dqprVarM283.m(2);
        dqprVarM283.b("conversations.rcs_group_last_sync_timestamp");
        dqprVarM283.i(58910);
        dqprVarM283.c(new Supplier() { // from class: bgkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM283.j(new dqps() { // from class: bgkw
        });
        dqprVarM283.a();
        dqpr dqprVarM284 = dqpt.m();
        dqprVarM284.m(1);
        dqprVarM284.b("conversations.has_been_e2ee");
        dqprVarM284.i(59210);
        dqprVarM284.c(new Supplier() { // from class: bgkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM284.j(new dqps() { // from class: bgkz
        });
        dqprVarM284.a();
        dqpr dqprVarM285 = dqpt.m();
        dqprVarM285.m(1);
        dqprVarM285.b("conversations.marked_as_unread");
        dqprVarM285.i(59220);
        dqprVarM285.c(new Supplier() { // from class: bgla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM285.j(new dqps() { // from class: bglb
        });
        dqprVarM285.a();
        dqpr dqprVarM286 = dqpt.m();
        dqprVarM286.m(5);
        dqprVarM286.b("conversations.custom_theme");
        dqprVarM286.i(59820);
        dqprVarM286.c(new Supplier() { // from class: bgld
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM286.j(new dqps() { // from class: bgle
        });
        dqprVarM286.a();
        dqpr dqprVarM287 = dqpt.m();
        dqprVarM287.m(2);
        dqprVarM287.b("conversations.mms_group_upgrade_status");
        dqprVarM287.i(60050);
        dqprVarM287.c(new Supplier() { // from class: bglf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM287.j(new dqps() { // from class: bglg
        });
        dqprVarM287.a();
        dqpr dqprVarM288 = dqpt.m();
        dqprVarM288.m(2);
        dqprVarM288.b("conversations.mms_group_upgrade_retries");
        dqprVarM288.i(60050);
        dqprVarM288.c(new Supplier() { // from class: bglh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM288.j(new dqps() { // from class: bgli
        });
        dqprVarM288.a();
        dqpr dqprVarM289 = dqpt.m();
        dqprVarM289.m(2);
        dqprVarM289.b("conversations.encryption_protocol");
        dqprVarM289.i(60180);
        dqprVarM289.c(new Supplier() { // from class: bglk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM289.j(new dqps() { // from class: bgll
        });
        dqprVarM289.a();
        dqpr dqprVarM290 = dqpt.m();
        dqprVarM290.m(4);
        dqprVarM290.d(true);
        dqprVarM290.b("conversations.encryption_id");
        dqprVarM290.i(60210);
        dqprVarM290.c(new Supplier() { // from class: bglm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM290.j(new dqps() { // from class: bgln
        });
        dqprVarM290.a();
        dqpr dqprVarM291 = dqpt.m();
        dqprVarM291.m(4);
        dqprVarM291.l(true);
        dqprVarM291.d(true);
        dqprVarM291.b("conversations.cms_correlation_id");
        dqprVarM291.f(true);
        dqprVarM291.i(60250);
        dqprVarM291.c(new Supplier() { // from class: bglq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM291.j(new dqps() { // from class: bglr
        });
        dqprVarM291.a();
        dqpr dqprVarM292 = dqpt.m();
        dqprVarM292.m(4);
        dqprVarM292.b("conversations.rcs_group_icon_url");
        dqprVarM292.i(60590);
        dqprVarM292.c(new Supplier() { // from class: bgls
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM292.j(new dqps() { // from class: bglt
        });
        dqprVarM292.a();
        dqpr dqprVarM293 = dqpt.m();
        dqprVarM293.m(2);
        dqprVarM293.b("conversations.unread_count");
        dqprVarM293.i(60740);
        dqprVarM293.c(new Supplier() { // from class: bglv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM293.j(new dqps() { // from class: bglw
        });
        dqprVarM293.a();
        dqpr dqprVarM294 = dqpt.m();
        dqprVarM294.m(5);
        dqprVarM294.b("message_reactions.reactions_data");
        dqprVarM294.i(-1);
        dqprVarM294.c(new Supplier() { // from class: bglx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM294.j(new dqps() { // from class: bgly
        });
        dqprVarM294.a();
        dqpr dqprVarM295 = dqpt.m();
        dqprVarM295.m(2);
        dqprVarM295.l(true);
        dqprVarM295.g(true);
        dqprVarM295.d(true);
        dqprVarM295.b("message_reactions._id");
        dqprVarM295.i(-1);
        dqprVarM295.c(new Supplier() { // from class: bglz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM295.j(new dqps() { // from class: bgma
        });
        dqprVarM295.a();
        dqpr dqprVarM296 = dqpt.m();
        dqprVarM296.m(2);
        dqprVarM296.l(true);
        dqprVarM296.d(true);
        dqprVarM296.e(true);
        dqprVarM296.h(new Supplier() { // from class: bgmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM296.b("message_reactions.message_id");
        dqprVarM296.i(-1);
        dqprVarM296.c(new Supplier() { // from class: bgmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM296.j(new dqps() { // from class: bgme
        });
        dqprVarM296.a();
        dqpr dqprVarM297 = dqpt.m();
        dqprVarM297.m(2);
        dqprVarM297.d(true);
        dqprVarM297.e(true);
        dqprVarM297.h(new Supplier() { // from class: bgmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM297.b("message_reactions.reacted_message_id");
        dqprVarM297.i(46020);
        dqprVarM297.c(new Supplier() { // from class: bgmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM297.j(new dqps() { // from class: bgmi
        });
        dqprVarM297.a();
        dqpr dqprVarM298 = dqpt.m();
        dqprVarM298.m(2);
        dqprVarM298.b("message_reactions.reaction");
        dqprVarM298.i(48000);
        dqprVarM298.c(new Supplier() { // from class: bgmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM298.j(new dqps() { // from class: bgmk
        });
        dqprVarM298.a();
        dqpr dqprVarM299 = dqpt.m();
        dqprVarM299.m(5);
        dqprVarM299.b("message_reactions.applied_reaction");
        dqprVarM299.i(59060);
        dqprVarM299.c(new Supplier() { // from class: bgml
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM299.j(new dqps() { // from class: bgmm
        });
        dqprVarM299.a();
        dqpr dqprVarM300 = dqpt.m();
        dqprVarM300.m(5);
        dqprVarM300.d(true);
        dqprVarM300.b("message_reactions.animation_effect");
        dqprVarM300.i(59520);
        dqprVarM300.c(new Supplier() { // from class: bgmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM300.j(new dqps() { // from class: bgmp
        });
        dqprVarM300.a();
        dqpr dqprVarM301 = dqpt.m();
        dqprVarM301.m(4);
        dqprVarM301.d(true);
        dqprVarM301.b("file_transfer.transfer_id");
        dqprVarM301.i(-1);
        dqprVarM301.c(new Supplier() { // from class: bgmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM301.j(new dqps() { // from class: bgms
        });
        dqprVarM301.a();
        dqpr dqprVarM302 = dqpt.m();
        dqprVarM302.m(1);
        dqprVarM302.l(true);
        dqprVarM302.g(true);
        dqprVarM302.d(true);
        dqprVarM302.e(true);
        dqprVarM302.h(new Supplier() { // from class: bgmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM302.b("file_transfer.message_id");
        dqprVarM302.i(-1);
        dqprVarM302.c(new Supplier() { // from class: bgmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM302.j(new dqps() { // from class: bgmv
        });
        dqprVarM302.a();
        dqpr dqprVarM303 = dqpt.m();
        dqprVarM303.m(1);
        dqprVarM303.b("file_transfer.transfer_type");
        dqprVarM303.i(-1);
        dqprVarM303.c(new Supplier() { // from class: bgmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM303.j(new dqps() { // from class: bgmx
        });
        dqprVarM303.a();
        dqpr dqprVarM304 = dqpt.m();
        dqprVarM304.m(5);
        dqprVarM304.b("file_transfer.attachment_upload_response");
        dqprVarM304.i(-1);
        dqprVarM304.c(new Supplier() { // from class: bgmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM304.j(new dqps() { // from class: bgna
        });
        dqprVarM304.a();
        dqpr dqprVarM305 = dqpt.m();
        dqprVarM305.m(5);
        dqprVarM305.b("file_transfer.file_information");
        dqprVarM305.i(55030);
        dqprVarM305.c(new Supplier() { // from class: bgnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM305.j(new dqps() { // from class: bgnd
        });
        dqprVarM305.a();
        dqpr dqprVarM306 = dqpt.m();
        dqprVarM306.m(5);
        dqprVarM306.b("file_transfer.thumbnail_information");
        dqprVarM306.i(59910);
        dqprVarM306.c(new Supplier() { // from class: bgne
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM306.j(new dqps() { // from class: bgnf
        });
        dqprVarM306.a();
        dqpr dqprVarM307 = dqpt.m();
        dqprVarM307.m(4);
        dqprVarM307.b("file_transfer.transfer_handle");
        dqprVarM307.i(55030);
        dqprVarM307.c(new Supplier() { // from class: bgng
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM307.j(new dqps() { // from class: bgnh
        });
        dqprVarM307.a();
        dqpr dqprVarM308 = dqpt.m();
        dqprVarM308.m(5);
        dqprVarM308.b("file_transfer.opaque_data");
        dqprVarM308.i(56040);
        dqprVarM308.c(new Supplier() { // from class: bgni
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM308.j(new dqps() { // from class: bgnj
        });
        dqprVarM308.a();
        dqpr dqprVarM309 = dqpt.m();
        dqprVarM309.m(2);
        dqprVarM309.l(true);
        dqprVarM309.d(true);
        dqprVarM309.e(true);
        dqprVarM309.h(new Supplier() { // from class: bgnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM309.b("message_star.message_id");
        dqprVarM309.f(true);
        dqprVarM309.i(-1);
        dqprVarM309.c(new Supplier() { // from class: bgno
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM309.j(new dqps() { // from class: bgnp
        });
        dqprVarM309.a();
        dqpr dqprVarM310 = dqpt.m();
        dqprVarM310.m(2);
        dqprVarM310.l(true);
        dqprVarM310.g(true);
        dqprVarM310.d(true);
        dqprVarM310.b("message_star._id");
        dqprVarM310.i(-1);
        dqprVarM310.c(new Supplier() { // from class: bgnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM310.j(new dqps() { // from class: bgnr
        });
        dqprVarM310.a();
        dqpr dqprVarM311 = dqpt.m();
        dqprVarM311.m(5);
        dqprVarM311.b("message_photos_sharing.sharing_state");
        dqprVarM311.i(-1);
        dqprVarM311.c(new Supplier() { // from class: bgns
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM311.j(new dqps() { // from class: bgnt
        });
        dqprVarM311.a();
        dqpr dqprVarM312 = dqpt.m();
        dqprVarM312.m(2);
        dqprVarM312.l(true);
        dqprVarM312.d(true);
        dqprVarM312.e(true);
        dqprVarM312.h(new Supplier() { // from class: bgnu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM312.b("message_photos_sharing.message_id");
        dqprVarM312.f(true);
        dqprVarM312.i(-1);
        dqprVarM312.c(new Supplier() { // from class: bgnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM312.j(new dqps() { // from class: bgnw
        });
        dqprVarM312.a();
        dqpr dqprVarM313 = dqpt.m();
        dqprVarM313.m(2);
        dqprVarM313.l(true);
        dqprVarM313.d(true);
        dqprVarM313.e(true);
        dqprVarM313.h(new Supplier() { // from class: bgnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        });
        dqprVarM313.b("vmt.part_id");
        dqprVarM313.f(true);
        dqprVarM313.i(-1);
        dqprVarM313.c(new Supplier() { // from class: bgoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM313.j(new dqps() { // from class: bgob
        });
        dqprVarM313.a();
        dqpr dqprVarM314 = dqpt.m();
        dqprVarM314.m(2);
        dqprVarM314.b("vmt.vmt_status");
        dqprVarM314.i(-1);
        dqprVarM314.c(new Supplier() { // from class: bgoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM314.j(new dqps() { // from class: bgod
        });
        dqprVarM314.a();
        dqpr dqprVarM315 = dqpt.m();
        dqprVarM315.m(4);
        dqprVarM315.b("vmt.text");
        dqprVarM315.i(-1);
        dqprVarM315.c(new Supplier() { // from class: bgoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM315.j(new dqps() { // from class: bgof
        });
        dqprVarM315.a();
        dqpr dqprVarM316 = dqpt.m();
        dqprVarM316.m(4);
        dqprVarM316.b("vmt.locale");
        dqprVarM316.i(-1);
        dqprVarM316.c(new Supplier() { // from class: bgog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM316.j(new dqps() { // from class: bgoh
        });
        dqprVarM316.a();
        dqpr dqprVarM317 = dqpt.m();
        dqprVarM317.m(8);
        dqprVarM317.b("vmt__ROWID");
        dqprVarM317.i(0);
        dqprVarM317.c(new Supplier() { // from class: bgoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM317.j(new dqps() { // from class: bgok
        });
        dqprVarM317.a();
        dqpr dqprVarM318 = dqpt.m();
        dqprVarM318.m(2);
        dqprVarM318.l(true);
        dqprVarM318.k(true);
        dqprVarM318.d(true);
        dqprVarM318.e(true);
        dqprVarM318.h(new Supplier() { // from class: bgom
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM318.b("message_replies_view.message_id_message_replies");
        dqprVarM318.f(true);
        dqprVarM318.i(0);
        dqprVarM318.c(new Supplier() { // from class: bgon
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM318.j(new dqps() { // from class: bgoo
        });
        dqprVarM318.a();
        dqpr dqprVarM319 = dqpt.m();
        dqprVarM319.m(2);
        dqprVarM319.d(true);
        dqprVarM319.b("message_replies_view._id_messages");
        dqprVarM319.i(0);
        dqprVarM319.c(new Supplier() { // from class: bgop
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM319.j(new dqps() { // from class: bgoq
        });
        dqprVarM319.a();
        dqpr dqprVarM320 = dqpt.m();
        dqprVarM320.m(1);
        dqprVarM320.d(true);
        dqprVarM320.b("message_replies_view.received_timestamp_messages");
        dqprVarM320.i(0);
        dqprVarM320.c(new Supplier() { // from class: bgor
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM320.j(new dqps() { // from class: bgos
        });
        dqprVarM320.a();
        dqpr dqprVarM321 = dqpt.m();
        dqprVarM321.m(2);
        dqprVarM321.d(true);
        dqprVarM321.b("message_replies_view._id_participants");
        dqprVarM321.i(0);
        dqprVarM321.c(new Supplier() { // from class: bgot
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM321.j(new dqps() { // from class: bgov
        });
        dqprVarM321.a();
        dqpr dqprVarM322 = dqpt.m();
        dqprVarM322.m(1);
        dqprVarM322.d(true);
        dqprVarM322.b("message_replies_view.sub_id_participants");
        dqprVarM322.f(true);
        dqprVarM322.i(0);
        dqprVarM322.c(new Supplier() { // from class: bgow
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM322.j(new dqps() { // from class: bgoy
        });
        dqprVarM322.a();
        dqpr dqprVarM323 = dqpt.m();
        dqprVarM323.m(4);
        dqprVarM323.d(true);
        dqprVarM323.b("message_replies_view.normalized_destination_participants");
        dqprVarM323.f(true);
        dqprVarM323.i(0);
        dqprVarM323.c(new Supplier() { // from class: bgoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM323.j(new dqps() { // from class: bgpa
        });
        dqprVarM323.a();
        dqpr dqprVarM324 = dqpt.m();
        dqprVarM324.m(4);
        dqprVarM324.b("message_replies_view.display_destination_participants");
        dqprVarM324.i(0);
        dqprVarM324.c(new Supplier() { // from class: bgpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM324.j(new dqps() { // from class: bgpc
        });
        dqprVarM324.a();
        dqpr dqprVarM325 = dqpt.m();
        dqprVarM325.m(4);
        dqprVarM325.b("message_replies_view.full_name_participants");
        dqprVarM325.i(0);
        dqprVarM325.c(new Supplier() { // from class: bgpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM325.j(new dqps() { // from class: bgpe
        });
        dqprVarM325.a();
        dqpr dqprVarM326 = dqpt.m();
        dqprVarM326.m(4);
        dqprVarM326.b("message_replies_view.first_name_participants");
        dqprVarM326.i(0);
        dqprVarM326.c(new Supplier() { // from class: bgpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM326.j(new dqps() { // from class: bgph
        });
        dqprVarM326.a();
        dqpr dqprVarM327 = dqpt.m();
        dqprVarM327.m(2);
        dqprVarM327.d(true);
        dqprVarM327.b("message_replies_view._id_parts");
        dqprVarM327.i(0);
        dqprVarM327.c(new Supplier() { // from class: bgpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM327.j(new dqps() { // from class: bgpk
        });
        dqprVarM327.a();
        dqpr dqprVarM328 = dqpt.m();
        dqprVarM328.m(4);
        dqprVarM328.b("message_replies_view.text_parts");
        dqprVarM328.i(0);
        dqprVarM328.c(new Supplier() { // from class: bgpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM328.j(new dqps() { // from class: bgpm
        });
        dqprVarM328.a();
        dqpr dqprVarM329 = dqpt.m();
        dqprVarM329.m(4);
        dqprVarM329.b("message_replies_view.uri_parts");
        dqprVarM329.i(0);
        dqprVarM329.c(new Supplier() { // from class: bgpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM329.j(new dqps() { // from class: bgpo
        });
        dqprVarM329.a();
        dqpr dqprVarM330 = dqpt.m();
        dqprVarM330.m(4);
        dqprVarM330.d(true);
        dqprVarM330.b("message_replies_view.content_type_parts");
        dqprVarM330.i(0);
        dqprVarM330.c(new Supplier() { // from class: bgpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM330.j(new dqps() { // from class: bgpr
        });
        dqprVarM330.a();
        dqpr dqprVarM331 = dqpt.m();
        dqprVarM331.m(4);
        dqprVarM331.b("message_replies_view.file_name_parts");
        dqprVarM331.i(0);
        dqprVarM331.c(new Supplier() { // from class: bgps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM331.j(new dqps() { // from class: bgpt
        });
        dqprVarM331.a();
        dqpr dqprVarM332 = dqpt.m();
        dqprVarM332.m(1);
        dqprVarM332.b("message_replies_view.duration_parts");
        dqprVarM332.i(0);
        dqprVarM332.c(new Supplier() { // from class: bgpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM332.j(new dqps() { // from class: bgpw
        });
        dqprVarM332.a();
        dqpr dqprVarM333 = dqpt.m();
        dqprVarM333.m(8);
        dqprVarM333.b("message_replies_view.parts__ROWID_parts");
        dqprVarM333.i(0);
        dqprVarM333.c(new Supplier() { // from class: bgpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM333.j(new dqps() { // from class: bgpy
        });
        dqprVarM333.a();
        dqpr dqprVarM334 = dqpt.m();
        dqprVarM334.m(4);
        dqprVarM334.k(true);
        dqprVarM334.b("message_replies_view.trigger_url_link_preview");
        dqprVarM334.i(0);
        dqprVarM334.c(new Supplier() { // from class: bgpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM334.j(new dqps() { // from class: bgqa
        });
        dqprVarM334.a();
        dqpr dqprVarM335 = dqpt.m();
        dqprVarM335.m(2);
        dqprVarM335.b("message_replies_view.expiration_time_millis_link_preview");
        dqprVarM335.i(0);
        dqprVarM335.c(new Supplier() { // from class: bgqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM335.j(new dqps() { // from class: bgqd
        });
        dqprVarM335.a();
        dqpr dqprVarM336 = dqpt.m();
        dqprVarM336.m(4);
        dqprVarM336.b("message_replies_view.link_title_link_preview");
        dqprVarM336.i(0);
        dqprVarM336.c(new Supplier() { // from class: bgqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM336.j(new dqps() { // from class: bgqf
        });
        dqprVarM336.a();
        dqpr dqprVarM337 = dqpt.m();
        dqprVarM337.m(4);
        dqprVarM337.b("message_replies_view.link_image_url_link_preview");
        dqprVarM337.i(0);
        dqprVarM337.c(new Supplier() { // from class: bgqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM337.j(new dqps() { // from class: bgqj
        });
        dqprVarM337.a();
        dqpr dqprVarM338 = dqpt.m();
        dqprVarM338.m(2);
        dqprVarM338.b("message_replies_view.link_preview_failed_link_preview");
        dqprVarM338.i(0);
        dqprVarM338.c(new Supplier() { // from class: bgqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM338.j(new dqps() { // from class: bgql
        });
        dqprVarM338.a();
        dqpr dqprVarM339 = dqpt.m();
        dqprVarM339.m(4);
        dqprVarM339.b("profiles_table.display_name");
        dqprVarM339.i(-1);
        dqprVarM339.c(new Supplier() { // from class: bgqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM339.j(new dqps() { // from class: bgqo
        });
        dqprVarM339.a();
        dqpr dqprVarM340 = dqpt.m();
        dqprVarM340.m(2);
        dqprVarM340.l(true);
        dqprVarM340.g(true);
        dqprVarM340.d(true);
        dqprVarM340.b("profiles_table._id");
        dqprVarM340.i(-1);
        dqprVarM340.c(new Supplier() { // from class: bgqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM340.j(new dqps() { // from class: bgqq
        });
        dqprVarM340.a();
        dqpr dqprVarM341 = dqpt.m();
        dqprVarM341.m(2);
        dqprVarM341.d(true);
        dqprVarM341.e(true);
        dqprVarM341.h(new Supplier() { // from class: bgqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM341.b("profiles_table.participant_id");
        dqprVarM341.i(-1);
        dqprVarM341.c(new Supplier() { // from class: bgqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM341.j(new dqps() { // from class: bgqt
        });
        dqprVarM341.a();
        dqpr dqprVarM342 = dqpt.m();
        dqprVarM342.m(4);
        dqprVarM342.b("profiles_table.person_id");
        dqprVarM342.i(60170);
        dqprVarM342.c(new Supplier() { // from class: bgqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM342.j(new dqps() { // from class: bgqw
        });
        dqprVarM342.a();
        dqpr dqprVarM343 = dqpt.m();
        dqprVarM343.m(4);
        dqprVarM343.b("profiles_table.profile_access_token");
        dqprVarM343.i(60170);
        dqprVarM343.c(new Supplier() { // from class: bgqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM343.j(new dqps() { // from class: bgqz
        });
        dqprVarM343.a();
        dqpr dqprVarM344 = dqpt.m();
        dqprVarM344.m(2);
        dqprVarM344.b("profiles_table.sending_self_profile_interaction_state");
        dqprVarM344.i(60200);
        dqprVarM344.c(new Supplier() { // from class: bgra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM344.j(new dqps() { // from class: bgrb
        });
        dqprVarM344.a();
        dqpr dqprVarM345 = dqpt.m();
        dqprVarM345.m(5);
        dqprVarM345.b("profiles_table.self_profile_sharing_metadata");
        dqprVarM345.i(60340);
        dqprVarM345.c(new Supplier() { // from class: bgrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM345.j(new dqps() { // from class: bgrd
        });
        dqprVarM345.a();
        dqpr dqprVarM346 = dqpt.m();
        dqprVarM346.m(4);
        dqprVarM346.b("profiles_table.first_name");
        dqprVarM346.i(-1);
        dqprVarM346.c(new Supplier() { // from class: bgre
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM346.j(new dqps() { // from class: bgrf
        });
        dqprVarM346.a();
        dqpr dqprVarM347 = dqpt.m();
        dqprVarM347.m(4);
        dqprVarM347.b("profiles_table.last_name");
        dqprVarM347.i(-1);
        dqprVarM347.c(new Supplier() { // from class: bgrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM347.j(new dqps() { // from class: bgrj
        });
        dqprVarM347.a();
        dqpr dqprVarM348 = dqpt.m();
        dqprVarM348.m(4);
        dqprVarM348.b("profiles_table.photo_uri");
        dqprVarM348.i(-1);
        dqprVarM348.c(new Supplier() { // from class: bgrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM348.j(new dqps() { // from class: bgrl
        });
        dqprVarM348.a();
        dqpr dqprVarM349 = dqpt.m();
        dqprVarM349.m(4);
        dqprVarM349.b("profiles_table.sender_last_updated_time");
        dqprVarM349.i(60170);
        dqprVarM349.c(new Supplier() { // from class: bgrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM349.j(new dqps() { // from class: bgrn
        });
        dqprVarM349.a();
        dqpr dqprVarM350 = dqpt.m();
        dqprVarM350.m(4);
        dqprVarM350.b("profiles_table.sender_last_updated_time_from_rcs");
        dqprVarM350.i(60200);
        dqprVarM350.c(new Supplier() { // from class: bgro
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM350.j(new dqps() { // from class: bgrp
        });
        dqprVarM350.a();
        dqpr dqprVarM351 = dqpt.m();
        dqprVarM351.m(4);
        dqprVarM351.d(true);
        dqprVarM351.b("profiles_table.contact_lookup_key");
        dqprVarM351.i(-1);
        dqprVarM351.c(new Supplier() { // from class: bgrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM351.j(new dqps() { // from class: bgrr
        });
        dqprVarM351.a();
        dqpr dqprVarM352 = dqpt.m();
        dqprVarM352.m(4);
        dqprVarM352.d(true);
        dqprVarM352.b("profiles_table.phone_number");
        dqprVarM352.i(-1);
        dqprVarM352.c(new Supplier() { // from class: bgrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM352.j(new dqps() { // from class: bgrw
        });
        dqprVarM352.a();
        dqpr dqprVarM353 = dqpt.m();
        dqprVarM353.m(1);
        dqprVarM353.b("profiles_table.is_self_profile_shareable");
        dqprVarM353.i(60400);
        dqprVarM353.c(new Supplier() { // from class: bgrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM353.j(new dqps() { // from class: bgry
        });
        dqprVarM353.a();
        dqpr dqprVarM354 = dqpt.m();
        dqprVarM354.m(2);
        dqprVarM354.b("profiles_table.has_shared_access_token_with_user");
        dqprVarM354.i(60170);
        dqprVarM354.c(new Supplier() { // from class: bgrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM354.j(new dqps() { // from class: bgsa
        });
        dqprVarM354.a();
        dqpr dqprVarM355 = dqpt.m();
        dqprVarM355.m(1);
        dqprVarM355.b("profiles_table.name_timestamp");
        dqprVarM355.i(-1);
        dqprVarM355.c(new Supplier() { // from class: bgsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM355.j(new dqps() { // from class: bgsc
        });
        dqprVarM355.a();
        dqpr dqprVarM356 = dqpt.m();
        dqprVarM356.m(1);
        dqprVarM356.b("profiles_table.photo_timestamp");
        dqprVarM356.i(-1);
        dqprVarM356.c(new Supplier() { // from class: bgsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM356.j(new dqps() { // from class: bgse
        });
        dqprVarM356.a();
        dqpr dqprVarM357 = dqpt.m();
        dqprVarM357.m(1);
        dqprVarM357.b("profiles_table.belongs_to_self_gaia");
        dqprVarM357.i(59940);
        dqprVarM357.c(new Supplier() { // from class: bgsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM357.j(new dqps() { // from class: bgsi
        });
        dqprVarM357.a();
        dqpr dqprVarM358 = dqpt.m();
        dqprVarM358.m(1);
        dqprVarM358.b("profiles_table.gaia_update_timestamp");
        dqprVarM358.i(59940);
        dqprVarM358.c(new Supplier() { // from class: bgsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM358.j(new dqps() { // from class: bgsk
        });
        dqprVarM358.a();
        dqpr dqprVarM359 = dqpt.m();
        dqprVarM359.m(4);
        dqprVarM359.b("message_captions.caption");
        dqprVarM359.i(-1);
        dqprVarM359.c(new Supplier() { // from class: bgsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM359.j(new dqps() { // from class: bgsm
        });
        dqprVarM359.a();
        dqpr dqprVarM360 = dqpt.m();
        dqprVarM360.m(2);
        dqprVarM360.l(true);
        dqprVarM360.d(true);
        dqprVarM360.e(true);
        dqprVarM360.h(new Supplier() { // from class: bgsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM360.b("message_captions.message_id");
        dqprVarM360.f(true);
        dqprVarM360.i(-1);
        dqprVarM360.c(new Supplier() { // from class: bgso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgvl.b();
            }
        });
        dqprVarM360.j(new dqps() { // from class: bgsp
        });
        dqprVarM360.a();
    }
}
