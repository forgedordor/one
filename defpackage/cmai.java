package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmai {
    public final cmaj a;
    public final cmaj b;

    public cmai() {
        dqpr dqprVarM = dqpt.m();
        dqprVarM.m(2);
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.b("scheduled_send._id");
        dqprVarM.i(-1);
        dqprVarM.c(new Supplier() { // from class: clps
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM.j(new dqps() { // from class: clqf
        });
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqprVarM2.m(2);
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqprVarM2.h(new Supplier() { // from class: cltw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM2.b("scheduled_send.message_id");
        dqprVarM2.i(-1);
        dqprVarM2.c(new Supplier() { // from class: cluj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM2.j(new dqps() { // from class: cluw
        });
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqprVarM3.m(2);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqprVarM3.h(new Supplier() { // from class: clvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM3.b("scheduled_send.conversation_id");
        dqprVarM3.i(-1);
        dqprVarM3.c(new Supplier() { // from class: clvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM3.j(new dqps() { // from class: clwg
        });
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqprVarM4.m(2);
        dqprVarM4.b("scheduled_send.scheduled_time");
        dqprVarM4.i(-1);
        dqprVarM4.c(new Supplier() { // from class: clws
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM4.j(new dqps() { // from class: clxe
        });
        this.a = new cmaj(dqprVarM4.a());
        dqpr dqprVarM5 = dqpt.m();
        dqprVarM5.m(2);
        dqprVarM5.d(true);
        dqprVarM5.b("scheduled_send.status");
        dqprVarM5.i(-1);
        dqprVarM5.c(new Supplier() { // from class: clqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM5.j(new dqps() { // from class: clvg
        });
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqprVarM6.m(2);
        dqprVarM6.k(true);
        dqprVarM6.b("scheduled_send.creation_time");
        dqprVarM6.i(58020);
        dqprVarM6.c(new Supplier() { // from class: clxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM6.j(new dqps() { // from class: clxy
        });
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqprVarM7.m(2);
        dqprVarM7.l(true);
        dqprVarM7.g(true);
        dqprVarM7.d(true);
        dqprVarM7.b("messages._id");
        dqprVarM7.i(-1);
        dqprVarM7.c(new Supplier() { // from class: clyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM7.j(new dqps() { // from class: clyw
        });
        this.b = new cmaj(dqprVarM7.a());
        dqpr dqprVarM8 = dqpt.m();
        dqprVarM8.m(1);
        dqprVarM8.d(true);
        dqprVarM8.e(true);
        dqprVarM8.h(new Supplier() { // from class: clzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM8.b("messages.conversation_id");
        dqprVarM8.i(-1);
        dqprVarM8.c(new Supplier() { // from class: clzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM8.j(new dqps() { // from class: cmag
        });
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqprVarM9.m(1);
        dqprVarM9.d(true);
        dqprVarM9.e(true);
        dqprVarM9.h(new Supplier() { // from class: clqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM9.b("messages.sender_id");
        dqprVarM9.i(-1);
        dqprVarM9.c(new Supplier() { // from class: clqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM9.j(new dqps() { // from class: clrd
        });
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqprVarM10.m(4);
        dqprVarM10.b("messages.sender_send_destination");
        dqprVarM10.i(54040);
        dqprVarM10.c(new Supplier() { // from class: clrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM10.j(new dqps() { // from class: clsb
        });
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqprVarM11.m(4);
        dqprVarM11.b("messages.msisdn_receiving_rcs_message");
        dqprVarM11.i(59340);
        dqprVarM11.c(new Supplier() { // from class: clsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM11.j(new dqps() { // from class: clsz
        });
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqprVarM12.m(4);
        dqprVarM12.b("messages.receiving_network_country");
        dqprVarM12.i(54040);
        dqprVarM12.c(new Supplier() { // from class: cltl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM12.j(new dqps() { // from class: cltt
        });
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqprVarM13.m(1);
        dqprVarM13.d(true);
        dqprVarM13.b("messages.sent_timestamp");
        dqprVarM13.i(-1);
        dqprVarM13.c(new Supplier() { // from class: cltu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM13.j(new dqps() { // from class: cltv
        });
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqprVarM14.m(1);
        dqprVarM14.b("messages.queue_insert_timestamp");
        dqprVarM14.i(17030);
        dqprVarM14.c(new Supplier() { // from class: cltx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM14.j(new dqps() { // from class: clua
        });
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqprVarM15.m(1);
        dqprVarM15.d(true);
        dqprVarM15.b("messages.received_timestamp");
        dqprVarM15.i(-1);
        dqprVarM15.c(new Supplier() { // from class: club
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM15.j(new dqps() { // from class: cluc
        });
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqprVarM16.m(1);
        dqprVarM16.b("messages.message_protocol");
        dqprVarM16.i(-1);
        dqprVarM16.c(new Supplier() { // from class: clud
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM16.j(new dqps() { // from class: clue
        });
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqprVarM17.m(1);
        dqprVarM17.d(true);
        dqprVarM17.b("messages.message_status");
        dqprVarM17.i(-1);
        dqprVarM17.c(new Supplier() { // from class: cluf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM17.j(new dqps() { // from class: clug
        });
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqprVarM18.m(1);
        dqprVarM18.b("messages.message_report_status");
        dqprVarM18.i(13020);
        dqprVarM18.c(new Supplier() { // from class: cluh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM18.j(new dqps() { // from class: clui
        });
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqprVarM19.m(1);
        dqprVarM19.d(true);
        dqprVarM19.b("messages.seen");
        dqprVarM19.f(true);
        dqprVarM19.i(-1);
        dqprVarM19.c(new Supplier() { // from class: clul
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM19.j(new dqps() { // from class: clum
        });
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqprVarM20.m(1);
        dqprVarM20.d(true);
        dqprVarM20.b("messages.read");
        dqprVarM20.i(-1);
        dqprVarM20.c(new Supplier() { // from class: clun
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM20.j(new dqps() { // from class: cluo
        });
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqprVarM21.m(4);
        dqprVarM21.d(true);
        dqprVarM21.b("messages.sms_message_uri");
        dqprVarM21.i(-1);
        dqprVarM21.c(new Supplier() { // from class: clup
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM21.j(new dqps() { // from class: cluq
        });
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqprVarM22.m(1);
        dqprVarM22.b("messages.sms_priority");
        dqprVarM22.i(-1);
        dqprVarM22.c(new Supplier() { // from class: clur
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM22.j(new dqps() { // from class: clus
        });
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqprVarM23.m(1);
        dqprVarM23.b("messages.sms_message_size");
        dqprVarM23.i(-1);
        dqprVarM23.c(new Supplier() { // from class: clut
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM23.j(new dqps() { // from class: cluu
        });
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqprVarM24.m(4);
        dqprVarM24.b("messages.mms_subject");
        dqprVarM24.i(-1);
        dqprVarM24.c(new Supplier() { // from class: clux
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM24.j(new dqps() { // from class: cluy
        });
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqprVarM25.m(4);
        dqprVarM25.b("messages.mms_transaction_id");
        dqprVarM25.i(-1);
        dqprVarM25.c(new Supplier() { // from class: cluz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM25.j(new dqps() { // from class: clva
        });
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqprVarM26.m(4);
        dqprVarM26.b("messages.mms_content_location");
        dqprVarM26.i(-1);
        dqprVarM26.c(new Supplier() { // from class: clvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM26.j(new dqps() { // from class: clvc
        });
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqprVarM27.m(1);
        dqprVarM27.b("messages.mms_expiry");
        dqprVarM27.i(-1);
        dqprVarM27.c(new Supplier() { // from class: clvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM27.j(new dqps() { // from class: clve
        });
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqprVarM28.m(1);
        dqprVarM28.d(true);
        dqprVarM28.b("messages.rcs_expiry");
        dqprVarM28.i(59890);
        dqprVarM28.c(new Supplier() { // from class: clvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM28.j(new dqps() { // from class: clvh
        });
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqprVarM29.m(4);
        dqprVarM29.b("messages.mms_retrieve_text");
        dqprVarM29.i(9030);
        dqprVarM29.c(new Supplier() { // from class: clvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM29.j(new dqps() { // from class: clvk
        });
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqprVarM30.m(1);
        dqprVarM30.b("messages.raw_status");
        dqprVarM30.i(-1);
        dqprVarM30.c(new Supplier() { // from class: clvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM30.j(new dqps() { // from class: clvm
        });
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqprVarM31.m(1);
        dqprVarM31.d(true);
        dqprVarM31.e(true);
        dqprVarM31.h(new Supplier() { // from class: clvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM31.b("messages.self_id");
        dqprVarM31.i(-1);
        dqprVarM31.c(new Supplier() { // from class: clvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM31.j(new dqps() { // from class: clvp
        });
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqprVarM32.m(4);
        dqprVarM32.d(true);
        dqprVarM32.e(true);
        dqprVarM32.h(new Supplier() { // from class: clvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM32.b("messages.my_identity_foreign_key");
        dqprVarM32.i(60160);
        dqprVarM32.c(new Supplier() { // from class: clvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM32.j(new dqps() { // from class: clvt
        });
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqprVarM33.m(1);
        dqprVarM33.b("messages.retry_start_timestamp");
        dqprVarM33.i(-1);
        dqprVarM33.c(new Supplier() { // from class: clvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM33.j(new dqps() { // from class: clvw
        });
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqprVarM34.m(4);
        dqprVarM34.d(true);
        dqprVarM34.b("messages.cloud_sync_id");
        dqprVarM34.i(8500);
        dqprVarM34.c(new Supplier() { // from class: clvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM34.j(new dqps() { // from class: clvy
        });
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqprVarM35.m(4);
        dqprVarM35.d(true);
        dqprVarM35.b("messages.rcs_message_id_with_text_type");
        dqprVarM35.f(true);
        dqprVarM35.i(41040);
        dqprVarM35.c(new Supplier() { // from class: clvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM35.j(new dqps() { // from class: clwa
        });
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqprVarM36.m(1);
        dqprVarM36.b("messages.etouffee_status");
        dqprVarM36.i(29060);
        dqprVarM36.c(new Supplier() { // from class: clwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM36.j(new dqps() { // from class: clwd
        });
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqprVarM37.m(1);
        dqprVarM37.b("messages.verification_status");
        dqprVarM37.i(29090);
        dqprVarM37.c(new Supplier() { // from class: clwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM37.j(new dqps() { // from class: clwf
        });
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqprVarM38.m(1);
        dqprVarM38.b("messages.rcs_ui_status");
        dqprVarM38.i(39000);
        dqprVarM38.c(new Supplier() { // from class: clwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM38.j(new dqps() { // from class: clwi
        });
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqprVarM39.m(1);
        dqprVarM39.d(true);
        dqprVarM39.b("messages.is_hidden");
        dqprVarM39.i(30010);
        dqprVarM39.c(new Supplier() { // from class: clwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM39.j(new dqps() { // from class: clwk
        });
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqprVarM40.m(7);
        dqprVarM40.b("messages.rcs_remote_instance");
        dqprVarM40.i(10002);
        dqprVarM40.c(new Supplier() { // from class: clwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM40.j(new dqps() { // from class: clwm
        });
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqprVarM41.m(1);
        dqprVarM41.b("messages.rcs_file_transfer_session_id");
        dqprVarM41.i(10004);
        dqprVarM41.c(new Supplier() { // from class: clwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM41.j(new dqps() { // from class: clwp
        });
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqprVarM42.m(1);
        dqprVarM42.b("messages.sms_error_code");
        dqprVarM42.i(9000);
        dqprVarM42.c(new Supplier() { // from class: clwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM42.j(new dqps() { // from class: clwr
        });
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqprVarM43.m(4);
        dqprVarM43.b("messages.sms_error_desc_map_name");
        dqprVarM43.i(9000);
        dqprVarM43.c(new Supplier() { // from class: clwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM43.j(new dqps() { // from class: clwu
        });
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqprVarM44.m(4);
        dqprVarM44.b("messages.correlation_id");
        dqprVarM44.i(9010);
        dqprVarM44.c(new Supplier() { // from class: clwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM44.j(new dqps() { // from class: clww
        });
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqprVarM45.m(4);
        dqprVarM45.l(true);
        dqprVarM45.d(true);
        dqprVarM45.b("messages.cms_id");
        dqprVarM45.f(true);
        dqprVarM45.i(31010);
        dqprVarM45.c(new Supplier() { // from class: clwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM45.j(new dqps() { // from class: clwz
        });
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqprVarM46.m(2);
        dqprVarM46.b("messages.cms_last_mod_seq");
        dqprVarM46.i(37040);
        dqprVarM46.c(new Supplier() { // from class: clxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM46.j(new dqps() { // from class: clxb
        });
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqprVarM47.m(4);
        dqprVarM47.d(true);
        dqprVarM47.b("messages.web_id");
        dqprVarM47.i(19020);
        dqprVarM47.c(new Supplier() { // from class: clxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM47.j(new dqps() { // from class: clxd
        });
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqprVarM48.m(1);
        dqprVarM48.b("messages.usage_stats_logging_id");
        dqprVarM48.i(29100);
        dqprVarM48.c(new Supplier() { // from class: cltz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM48.j(new dqps() { // from class: clxi
        });
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqprVarM49.m(1);
        dqprVarM49.b("messages.send_counter");
        dqprVarM49.i(35030);
        dqprVarM49.c(new Supplier() { // from class: clxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM49.j(new dqps() { // from class: clye
        });
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqprVarM50.m(4);
        dqprVarM50.d(true);
        dqprVarM50.b("messages.original_rcs_message_id");
        dqprVarM50.i(35030);
        dqprVarM50.c(new Supplier() { // from class: clyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM50.j(new dqps() { // from class: clza
        });
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqprVarM51.m(5);
        dqprVarM51.b("messages.raw_rcs_message_to_send");
        dqprVarM51.i(60820);
        dqprVarM51.c(new Supplier() { // from class: clzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM51.j(new dqps() { // from class: clzw
        });
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqprVarM52.m(4);
        dqprVarM52.b("messages.custom_delivery_receipt_mime_type");
        dqprVarM52.i(37020);
        dqprVarM52.c(new Supplier() { // from class: cmah
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM52.j(new dqps() { // from class: clqd
        });
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqprVarM53.m(5);
        dqprVarM53.b("messages.custom_delivery_receipt_content");
        dqprVarM53.i(37020);
        dqprVarM53.c(new Supplier() { // from class: clqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM53.j(new dqps() { // from class: clrk
        });
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqprVarM54.m(1);
        dqprVarM54.b("messages.report_attempt_acounter");
        dqprVarM54.i(37030);
        dqprVarM54.c(new Supplier() { // from class: clrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM54.j(new dqps() { // from class: clsg
        });
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqprVarM55.m(5);
        dqprVarM55.b("messages.custom_headers");
        dqprVarM55.i(45020);
        dqprVarM55.c(new Supplier() { // from class: clsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM55.j(new dqps() { // from class: cltc
        });
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqprVarM56.m(4);
        dqprVarM56.l(true);
        dqprVarM56.d(true);
        dqprVarM56.b("messages.cms_correlation_id");
        dqprVarM56.f(true);
        dqprVarM56.i(46010);
        dqprVarM56.c(new Supplier() { // from class: cltn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM56.j(new dqps() { // from class: clty
        });
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqprVarM57.m(1);
        dqprVarM57.d(true);
        dqprVarM57.e(true);
        dqprVarM57.h(new Supplier() { // from class: cluk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM57.b("messages.group_private_participant");
        dqprVarM57.i(48030);
        dqprVarM57.c(new Supplier() { // from class: cluv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM57.j(new dqps() { // from class: clvr
        });
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqprVarM58.m(1);
        dqprVarM58.d(true);
        dqprVarM58.e(true);
        dqprVarM58.h(new Supplier() { // from class: clwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM58.b("messages.original_message_id");
        dqprVarM58.i(48030);
        dqprVarM58.c(new Supplier() { // from class: clwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM58.j(new dqps() { // from class: clwy
        });
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqprVarM59.m(2);
        dqprVarM59.d(true);
        dqprVarM59.e(true);
        dqprVarM59.h(new Supplier() { // from class: clxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM59.b("messages.parent_message_id");
        dqprVarM59.i(60950);
        dqprVarM59.c(new Supplier() { // from class: clxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM59.j(new dqps() { // from class: clxh
        });
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqprVarM60.m(1);
        dqprVarM60.b("messages.awaiting_reverse_sync");
        dqprVarM60.i(49060);
        dqprVarM60.c(new Supplier() { // from class: clxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM60.j(new dqps() { // from class: clxk
        });
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqprVarM61.m(4);
        dqprVarM61.b("messages.old_sms_message_uri");
        dqprVarM61.i(49060);
        dqprVarM61.c(new Supplier() { // from class: clxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM61.j(new dqps() { // from class: clxn
        });
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqprVarM62.m(4);
        dqprVarM62.l(true);
        dqprVarM62.d(true);
        dqprVarM62.b("messages.draft_id");
        dqprVarM62.f(true);
        dqprVarM62.i(56000);
        dqprVarM62.c(new Supplier() { // from class: clxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM62.j(new dqps() { // from class: clxp
        });
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqprVarM63.m(1);
        dqprVarM63.b("messages.result_code");
        dqprVarM63.i(58040);
        dqprVarM63.c(new Supplier() { // from class: clxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM63.j(new dqps() { // from class: clxr
        });
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqprVarM64.m(1);
        dqprVarM64.b("messages.cms_life_cycle");
        dqprVarM64.i(58210);
        dqprVarM64.c(new Supplier() { // from class: clxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM64.j(new dqps() { // from class: clxu
        });
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqprVarM65.m(1);
        dqprVarM65.b("messages.mute_priority");
        dqprVarM65.i(60750);
        dqprVarM65.c(new Supplier() { // from class: clxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM65.j(new dqps() { // from class: clxw
        });
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqprVarM66.m(1);
        dqprVarM66.b("messages.fallback_reason");
        dqprVarM66.i(58710);
        dqprVarM66.c(new Supplier() { // from class: clxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM66.j(new dqps() { // from class: clxz
        });
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqprVarM67.m(1);
        dqprVarM67.b("messages.auto_retry_counter");
        dqprVarM67.i(58230);
        dqprVarM67.c(new Supplier() { // from class: clya
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM67.j(new dqps() { // from class: clyb
        });
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqprVarM68.m(2);
        dqprVarM68.b("messages.can_revoke_before_delivered_with_rcs");
        dqprVarM68.i(58280);
        dqprVarM68.c(new Supplier() { // from class: clyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM68.j(new dqps() { // from class: clyd
        });
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqprVarM69.m(5);
        dqprVarM69.b("messages.trace_id");
        dqprVarM69.i(58680);
        dqprVarM69.c(new Supplier() { // from class: clyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM69.j(new dqps() { // from class: clyg
        });
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqprVarM70.m(1);
        dqprVarM70.b("messages.outgoing_delivery_report_status");
        dqprVarM70.i(58720);
        dqprVarM70.c(new Supplier() { // from class: clyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM70.j(new dqps() { // from class: clyi
        });
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqprVarM71.m(1);
        dqprVarM71.b("messages.outgoing_read_report_status");
        dqprVarM71.i(58720);
        dqprVarM71.c(new Supplier() { // from class: clyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM71.j(new dqps() { // from class: clyl
        });
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqprVarM72.m(1);
        dqprVarM72.b("messages.xms_transport");
        dqprVarM72.i(59310);
        dqprVarM72.c(new Supplier() { // from class: clym
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM72.j(new dqps() { // from class: clyn
        });
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqprVarM73.m(1);
        dqprVarM73.b("messages.message_original_protocol");
        dqprVarM73.i(59430);
        dqprVarM73.c(new Supplier() { // from class: clyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM73.j(new dqps() { // from class: clyq
        });
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqprVarM74.m(4);
        dqprVarM74.l(true);
        dqprVarM74.d(true);
        dqprVarM74.b("messages.satellite_datagram_id");
        dqprVarM74.f(true);
        dqprVarM74.i(59490);
        dqprVarM74.c(new Supplier() { // from class: clyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM74.j(new dqps() { // from class: clys
        });
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqprVarM75.m(1);
        dqprVarM75.b("messages.encryption_protocol");
        dqprVarM75.i(60190);
        dqprVarM75.c(new Supplier() { // from class: clyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM75.j(new dqps() { // from class: clyu
        });
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqprVarM76.m(4);
        dqprVarM76.l(true);
        dqprVarM76.d(true);
        dqprVarM76.b("messages.message_persistence_id");
        dqprVarM76.f(true);
        dqprVarM76.i(60370);
        dqprVarM76.c(new Supplier() { // from class: clyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM76.j(new dqps() { // from class: clyx
        });
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqprVarM77.m(2);
        dqprVarM77.l(true);
        dqprVarM77.g(true);
        dqprVarM77.d(true);
        dqprVarM77.b("parts._id");
        dqprVarM77.i(-1);
        dqprVarM77.c(new Supplier() { // from class: clyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM77.j(new dqps() { // from class: clyz
        });
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqprVarM78.m(1);
        dqprVarM78.d(true);
        dqprVarM78.e(true);
        dqprVarM78.h(new Supplier() { // from class: clzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM78.b("parts.message_id");
        dqprVarM78.i(-1);
        dqprVarM78.c(new Supplier() { // from class: clzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM78.j(new dqps() { // from class: clzd
        });
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqprVarM79.m(4);
        dqprVarM79.b("parts.text");
        dqprVarM79.i(-1);
        dqprVarM79.c(new Supplier() { // from class: clze
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM79.j(new dqps() { // from class: clzf
        });
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqprVarM80.m(4);
        dqprVarM80.b("parts.raw_text");
        dqprVarM80.i(60990);
        dqprVarM80.c(new Supplier() { // from class: clzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM80.j(new dqps() { // from class: clzh
        });
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqprVarM81.m(4);
        dqprVarM81.b("parts.uri");
        dqprVarM81.i(-1);
        dqprVarM81.c(new Supplier() { // from class: clzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM81.j(new dqps() { // from class: clzk
        });
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqprVarM82.m(4);
        dqprVarM82.d(true);
        dqprVarM82.b("parts.content_type");
        dqprVarM82.i(-1);
        dqprVarM82.c(new Supplier() { // from class: clzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM82.j(new dqps() { // from class: clzn
        });
        dqprVarM82.a();
        dqpr dqprVarM83 = dqpt.m();
        dqprVarM83.m(4);
        dqprVarM83.b("parts.original_uri");
        dqprVarM83.i(10021);
        dqprVarM83.c(new Supplier() { // from class: clzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM83.j(new dqps() { // from class: clzp
        });
        dqprVarM83.a();
        dqpr dqprVarM84 = dqpt.m();
        dqprVarM84.m(4);
        dqprVarM84.b("parts.storage_uri");
        dqprVarM84.i(29060);
        dqprVarM84.c(new Supplier() { // from class: clzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM84.j(new dqps() { // from class: clzr
        });
        dqprVarM84.a();
        dqpr dqprVarM85 = dqpt.m();
        dqprVarM85.m(1);
        dqprVarM85.b("parts.width");
        dqprVarM85.i(-1);
        dqprVarM85.c(new Supplier() { // from class: clzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM85.j(new dqps() { // from class: clzt
        });
        dqprVarM85.a();
        dqpr dqprVarM86 = dqpt.m();
        dqprVarM86.m(1);
        dqprVarM86.b("parts.height");
        dqprVarM86.i(-1);
        dqprVarM86.c(new Supplier() { // from class: clzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM86.j(new dqps() { // from class: clzx
        });
        dqprVarM86.a();
        dqpr dqprVarM87 = dqpt.m();
        dqprVarM87.m(1);
        dqprVarM87.b("parts.timestamp");
        dqprVarM87.i(3010);
        dqprVarM87.c(new Supplier() { // from class: clzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM87.j(new dqps() { // from class: clzz
        });
        dqprVarM87.a();
        dqpr dqprVarM88 = dqpt.m();
        dqprVarM88.m(4);
        dqprVarM88.d(true);
        dqprVarM88.b("parts.output_uri");
        dqprVarM88.i(4020);
        dqprVarM88.c(new Supplier() { // from class: cmaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM88.j(new dqps() { // from class: cmab
        });
        dqprVarM88.a();
        dqpr dqprVarM89 = dqpt.m();
        dqprVarM89.m(1);
        dqprVarM89.b("parts.target_size");
        dqprVarM89.i(4020);
        dqprVarM89.c(new Supplier() { // from class: cmac
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM89.j(new dqps() { // from class: cmad
        });
        dqprVarM89.a();
        dqpr dqprVarM90 = dqpt.m();
        dqprVarM90.m(1);
        dqprVarM90.b("parts.processing_status");
        dqprVarM90.i(4020);
        dqprVarM90.c(new Supplier() { // from class: cmae
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM90.j(new dqps() { // from class: cmaf
        });
        dqprVarM90.a();
        dqpr dqprVarM91 = dqpt.m();
        dqprVarM91.m(1);
        dqprVarM91.b("parts.cms_attachment_processing_status");
        dqprVarM91.i(44010);
        dqprVarM91.c(new Supplier() { // from class: clpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM91.j(new dqps() { // from class: clpu
        });
        dqprVarM91.a();
        dqpr dqprVarM92 = dqpt.m();
        dqprVarM92.m(1);
        dqprVarM92.d(true);
        dqprVarM92.e(true);
        dqprVarM92.h(new Supplier() { // from class: clpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM92.b("parts.conversation_id");
        dqprVarM92.i(-1);
        dqprVarM92.c(new Supplier() { // from class: clpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM92.j(new dqps() { // from class: clpx
        });
        dqprVarM92.a();
        dqpr dqprVarM93 = dqpt.m();
        dqprVarM93.m(1);
        dqprVarM93.b("parts.sticker_set_id");
        dqprVarM93.i(5020);
        dqprVarM93.c(new Supplier() { // from class: clpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM93.j(new dqps() { // from class: clpz
        });
        dqprVarM93.a();
        dqpr dqprVarM94 = dqpt.m();
        dqprVarM94.m(1);
        dqprVarM94.b("parts.sticker_id");
        dqprVarM94.i(5020);
        dqprVarM94.c(new Supplier() { // from class: clqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM94.j(new dqps() { // from class: clqb
        });
        dqprVarM94.a();
        dqpr dqprVarM95 = dqpt.m();
        dqprVarM95.m(1);
        dqprVarM95.b("parts.media_modified_timestamp");
        dqprVarM95.i(7000);
        dqprVarM95.c(new Supplier() { // from class: clqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM95.j(new dqps() { // from class: clqg
        });
        dqprVarM95.a();
        dqpr dqprVarM96 = dqpt.m();
        dqprVarM96.m(3);
        dqprVarM96.b("parts.longitude");
        dqprVarM96.i(10005);
        dqprVarM96.c(new Supplier() { // from class: clqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM96.j(new dqps() { // from class: clqi
        });
        dqprVarM96.a();
        dqpr dqprVarM97 = dqpt.m();
        dqprVarM97.m(3);
        dqprVarM97.b("parts.latitude");
        dqprVarM97.i(10005);
        dqprVarM97.c(new Supplier() { // from class: clqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM97.j(new dqps() { // from class: clqk
        });
        dqprVarM97.a();
        dqpr dqprVarM98 = dqpt.m();
        dqprVarM98.m(4);
        dqprVarM98.b("parts.preview_content_uri");
        dqprVarM98.i(10017);
        dqprVarM98.c(new Supplier() { // from class: clql
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM98.j(new dqps() { // from class: clqm
        });
        dqprVarM98.a();
        dqpr dqprVarM99 = dqpt.m();
        dqprVarM99.m(4);
        dqprVarM99.d(true);
        dqprVarM99.b("parts.preview_content_type");
        dqprVarM99.i(10017);
        dqprVarM99.c(new Supplier() { // from class: clqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM99.j(new dqps() { // from class: clqp
        });
        dqprVarM99.a();
        dqpr dqprVarM100 = dqpt.m();
        dqprVarM100.m(4);
        dqprVarM100.b("parts.fallback_uri");
        dqprVarM100.i(13000);
        dqprVarM100.c(new Supplier() { // from class: clqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM100.j(new dqps() { // from class: clqs
        });
        dqprVarM100.a();
        dqpr dqprVarM101 = dqpt.m();
        dqprVarM101.m(1);
        dqprVarM101.b("parts.source");
        dqprVarM101.i(14010);
        dqprVarM101.c(new Supplier() { // from class: clqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM101.j(new dqps() { // from class: clqu
        });
        dqprVarM101.a();
        dqpr dqprVarM102 = dqpt.m();
        dqprVarM102.m(1);
        dqprVarM102.b("parts.bundle_index");
        dqprVarM102.i(17010);
        dqprVarM102.c(new Supplier() { // from class: clqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM102.j(new dqps() { // from class: clqw
        });
        dqprVarM102.a();
        dqpr dqprVarM103 = dqpt.m();
        dqprVarM103.m(4);
        dqprVarM103.b("parts.blob_id");
        dqprVarM103.i(17020);
        dqprVarM103.c(new Supplier() { // from class: clqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM103.j(new dqps() { // from class: clqy
        });
        dqprVarM103.a();
        dqpr dqprVarM104 = dqpt.m();
        dqprVarM104.m(4);
        dqprVarM104.b("parts.blob_gaia_email");
        dqprVarM104.i(59570);
        dqprVarM104.c(new Supplier() { // from class: clra
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM104.j(new dqps() { // from class: clrb
        });
        dqprVarM104.a();
        dqpr dqprVarM105 = dqpt.m();
        dqprVarM105.m(4);
        dqprVarM105.b("parts.cms_full_size_blob_id");
        dqprVarM105.i(40040);
        dqprVarM105.c(new Supplier() { // from class: clrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM105.j(new dqps() { // from class: clre
        });
        dqprVarM105.a();
        dqpr dqprVarM106 = dqpt.m();
        dqprVarM106.m(5);
        dqprVarM106.b("parts.cms_media_encryption_key");
        dqprVarM106.i(42010);
        dqprVarM106.c(new Supplier() { // from class: clrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM106.j(new dqps() { // from class: clrg
        });
        dqprVarM106.a();
        dqpr dqprVarM107 = dqpt.m();
        dqprVarM107.m(5);
        dqprVarM107.b("parts.cms_compressed_media_encryption_key");
        dqprVarM107.i(42070);
        dqprVarM107.c(new Supplier() { // from class: clrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM107.j(new dqps() { // from class: clri
        });
        dqprVarM107.a();
        dqpr dqprVarM108 = dqpt.m();
        dqprVarM108.m(1);
        dqprVarM108.b("parts.blob_upload_permanent_failure");
        dqprVarM108.i(18000);
        dqprVarM108.c(new Supplier() { // from class: clrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM108.j(new dqps() { // from class: clrl
        });
        dqprVarM108.a();
        dqpr dqprVarM109 = dqpt.m();
        dqprVarM109.m(1);
        dqprVarM109.b("parts.blob_upload_timestamp");
        dqprVarM109.i(19030);
        dqprVarM109.c(new Supplier() { // from class: clrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM109.j(new dqps() { // from class: clrn
        });
        dqprVarM109.a();
        dqpr dqprVarM110 = dqpt.m();
        dqprVarM110.m(4);
        dqprVarM110.b("parts.expressive_sticker_name");
        dqprVarM110.i(22060);
        dqprVarM110.c(new Supplier() { // from class: clro
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM110.j(new dqps() { // from class: clrq
        });
        dqprVarM110.a();
        dqpr dqprVarM111 = dqpt.m();
        dqprVarM111.m(4);
        dqprVarM111.b("parts.file_name");
        dqprVarM111.i(26000);
        dqprVarM111.c(new Supplier() { // from class: clrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM111.j(new dqps() { // from class: clrs
        });
        dqprVarM111.a();
        dqpr dqprVarM112 = dqpt.m();
        dqprVarM112.m(1);
        dqprVarM112.b("parts.duration");
        dqprVarM112.i(26040);
        dqprVarM112.c(new Supplier() { // from class: clrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM112.j(new dqps() { // from class: clru
        });
        dqprVarM112.a();
        dqpr dqprVarM113 = dqpt.m();
        dqprVarM113.m(4);
        dqprVarM113.b("parts.compressed_blob_id");
        dqprVarM113.i(27000);
        dqprVarM113.c(new Supplier() { // from class: clrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM113.j(new dqps() { // from class: clrx
        });
        dqprVarM113.a();
        dqpr dqprVarM114 = dqpt.m();
        dqprVarM114.m(4);
        dqprVarM114.b("parts.cms_compressed_blob_id");
        dqprVarM114.i(40040);
        dqprVarM114.c(new Supplier() { // from class: clry
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM114.j(new dqps() { // from class: clrz
        });
        dqprVarM114.a();
        dqpr dqprVarM115 = dqpt.m();
        dqprVarM115.m(1);
        dqprVarM115.b("parts.compressed_blob_upload_permanent_failure");
        dqprVarM115.i(27000);
        dqprVarM115.c(new Supplier() { // from class: clsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM115.j(new dqps() { // from class: clsc
        });
        dqprVarM115.a();
        dqpr dqprVarM116 = dqpt.m();
        dqprVarM116.m(1);
        dqprVarM116.b("parts.compressed_blob_upload_timestamp");
        dqprVarM116.i(27000);
        dqprVarM116.c(new Supplier() { // from class: clsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM116.j(new dqps() { // from class: clse
        });
        dqprVarM116.a();
        dqpr dqprVarM117 = dqpt.m();
        dqprVarM117.m(5);
        dqprVarM117.b("parts.media_encryption_key");
        dqprVarM117.i(30040);
        dqprVarM117.c(new Supplier() { // from class: clsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM117.j(new dqps() { // from class: clsh
        });
        dqprVarM117.a();
        dqpr dqprVarM118 = dqpt.m();
        dqprVarM118.m(5);
        dqprVarM118.b("parts.compressed_media_encryption_key");
        dqprVarM118.i(30040);
        dqprVarM118.c(new Supplier() { // from class: clsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM118.j(new dqps() { // from class: clsj
        });
        dqprVarM118.a();
        dqpr dqprVarM119 = dqpt.m();
        dqprVarM119.m(1);
        dqprVarM119.b("parts.missing_entry_in_telephony");
        dqprVarM119.i(52030);
        dqprVarM119.c(new Supplier() { // from class: clsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM119.j(new dqps() { // from class: clsl
        });
        dqprVarM119.a();
        dqpr dqprVarM120 = dqpt.m();
        dqprVarM120.m(1);
        dqprVarM120.b("parts.awaiting_reverse_sync");
        dqprVarM120.i(53040);
        dqprVarM120.c(new Supplier() { // from class: clsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM120.j(new dqps() { // from class: clso
        });
        dqprVarM120.a();
        dqpr dqprVarM121 = dqpt.m();
        dqprVarM121.m(1);
        dqprVarM121.b("parts.file_size_bytes");
        dqprVarM121.i(52050);
        dqprVarM121.c(new Supplier() { // from class: clsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM121.j(new dqps() { // from class: clsq
        });
        dqprVarM121.a();
        dqpr dqprVarM122 = dqpt.m();
        dqprVarM122.m(4);
        dqprVarM122.d(true);
        dqprVarM122.b("parts.local_cache_path");
        dqprVarM122.i(52050);
        dqprVarM122.c(new Supplier() { // from class: clss
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM122.j(new dqps() { // from class: clst
        });
        dqprVarM122.a();
        dqpr dqprVarM123 = dqpt.m();
        dqprVarM123.m(1);
        dqprVarM123.b("parts.media_send_type");
        dqprVarM123.i(58150);
        dqprVarM123.c(new Supplier() { // from class: clsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM123.j(new dqps() { // from class: clsv
        });
        dqprVarM123.a();
        dqpr dqprVarM124 = dqpt.m();
        dqprVarM124.m(5);
        dqprVarM124.b("parts.voice_metadata");
        dqprVarM124.i(59470);
        dqprVarM124.c(new Supplier() { // from class: clsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM124.j(new dqps() { // from class: clsx
        });
        dqprVarM124.a();
        dqpr dqprVarM125 = dqpt.m();
        dqprVarM125.m(1);
        dqprVarM125.b("parts.validation_status");
        dqprVarM125.i(58770);
        dqprVarM125.c(new Supplier() { // from class: clsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM125.j(new dqps() { // from class: clta
        });
        dqprVarM125.a();
        dqpr dqprVarM126 = dqpt.m();
        dqprVarM126.m(4);
        dqprVarM126.b("parts.processing_id");
        dqprVarM126.i(60080);
        dqprVarM126.c(new Supplier() { // from class: cltb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM126.j(new dqps() { // from class: cltd
        });
        dqprVarM126.a();
        dqpr dqprVarM127 = dqpt.m();
        dqprVarM127.m(1);
        dqprVarM127.b("parts.rich_card_media_download_failure_reason");
        dqprVarM127.i(60230);
        dqprVarM127.c(new Supplier() { // from class: clte
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM127.j(new dqps() { // from class: cltf
        });
        dqprVarM127.a();
        dqpr dqprVarM128 = dqpt.m();
        dqprVarM128.m(1);
        dqprVarM128.b("parts.image_display_state");
        dqprVarM128.i(60240);
        dqprVarM128.c(new Supplier() { // from class: cltg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM128.j(new dqps() { // from class: clth
        });
        dqprVarM128.a();
        dqpr dqprVarM129 = dqpt.m();
        dqprVarM129.m(1);
        dqprVarM129.b("parts.preserve_size");
        dqprVarM129.i(60680);
        dqprVarM129.c(new Supplier() { // from class: clti
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM129.j(new dqps() { // from class: cltj
        });
        dqprVarM129.a();
        dqpr dqprVarM130 = dqpt.m();
        dqprVarM130.m(8);
        dqprVarM130.b("parts__ROWID");
        dqprVarM130.i(0);
        dqprVarM130.c(new Supplier() { // from class: cltk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM130.j(new dqps() { // from class: cltm
        });
        dqprVarM130.a();
        dqpr dqprVarM131 = dqpt.m();
        dqprVarM131.m(4);
        dqprVarM131.b("message_captions.caption");
        dqprVarM131.i(-1);
        dqprVarM131.c(new Supplier() { // from class: clto
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM131.j(new dqps() { // from class: cltp
        });
        dqprVarM131.a();
        dqpr dqprVarM132 = dqpt.m();
        dqprVarM132.m(2);
        dqprVarM132.l(true);
        dqprVarM132.d(true);
        dqprVarM132.e(true);
        dqprVarM132.h(new Supplier() { // from class: cltq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        dqprVarM132.b("message_captions.message_id");
        dqprVarM132.f(true);
        dqprVarM132.i(-1);
        dqprVarM132.c(new Supplier() { // from class: cltr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cmas.b();
            }
        });
        dqprVarM132.j(new dqps() { // from class: clts
        });
        dqprVarM132.a();
    }
}
