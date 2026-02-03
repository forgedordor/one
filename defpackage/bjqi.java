package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjqi {
    public final bjqj a;
    public final bjqj b;

    public bjqi() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "messages._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bjjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bjpj
        };
        this.a = new bjqj(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bjpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "messages.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bjjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bjkk
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bjkw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "messages.sender_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bjli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bjlu
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "messages.sender_send_destination";
        dqprVarM4.i(54040);
        dqogVar4.d = new Supplier() { // from class: bjmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bjms
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "messages.msisdn_receiving_rcs_message";
        dqprVarM5.i(59340);
        dqogVar5.d = new Supplier() { // from class: bjkt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bjna
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "messages.receiving_network_country";
        dqprVarM6.i(54040);
        dqogVar6.d = new Supplier() { // from class: bjnm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bjny
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqprVarM7.d(true);
        dqogVar7.a = "messages.sent_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bjok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bjow
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "messages.queue_insert_timestamp";
        dqprVarM8.i(17030);
        dqogVar8.d = new Supplier() { // from class: bjpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bjpg
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqprVarM9.d(true);
        dqogVar9.a = "messages.received_timestamp";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bjph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bjpi
        };
        this.b = new bjqj(dqprVarM9.a());
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "messages.message_protocol";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bjpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bjpm
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqprVarM11.d(true);
        dqogVar11.a = "messages.message_status";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bjpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bjpo
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 1;
        dqogVar12.a = "messages.message_report_status";
        dqprVarM12.i(13020);
        dqogVar12.d = new Supplier() { // from class: bjpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bjpq
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqprVarM13.d(true);
        dqogVar13.a = "messages.seen";
        dqprVarM13.f(true);
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bjpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bjps
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 1;
        dqprVarM14.d(true);
        dqogVar14.a = "messages.read";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bjpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bjpu
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqprVarM15.d(true);
        dqogVar15.a = "messages.sms_message_uri";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bjpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bjpy
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqogVar16.a = "messages.sms_priority";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bjpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bjqa
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "messages.sms_message_size";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bjqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bjqc
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "messages.mms_subject";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bjqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bjqe
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 4;
        dqogVar19.a = "messages.mms_transaction_id";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bjqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bjqg
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "messages.mms_content_location";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bjjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bjka
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "messages.mms_expiry";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: bjkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bjkc
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqprVarM22.d(true);
        dqogVar22.a = "messages.rcs_expiry";
        dqprVarM22.i(59890);
        dqogVar22.d = new Supplier() { // from class: bjkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bjke
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "messages.mms_retrieve_text";
        dqprVarM23.i(9030);
        dqogVar23.d = new Supplier() { // from class: bjkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bjkg
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "messages.raw_status";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: bjkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bjkj
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqprVarM25.d(true);
        dqprVarM25.e(true);
        dqogVar25.b = new Supplier() { // from class: bjkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar25.a = "messages.self_id";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: bjkm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bjkn
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqprVarM26.d(true);
        dqogVar26.a = "messages.my_identity";
        dqprVarM26.i(59810);
        dqogVar26.d = new Supplier() { // from class: bjko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bjkp
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqprVarM27.d(true);
        dqprVarM27.e(true);
        dqogVar27.b = new Supplier() { // from class: bjkq
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar27.a = "messages.my_identity_foreign_key";
        dqprVarM27.i(60160);
        dqogVar27.d = new Supplier() { // from class: bjkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bjks
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 1;
        dqogVar28.a = "messages.retry_start_timestamp";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: bjku
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bjkv
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqprVarM29.d(true);
        dqogVar29.a = "messages.cloud_sync_id";
        dqprVarM29.i(8500);
        dqogVar29.d = new Supplier() { // from class: bjkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bjky
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 7;
        dqprVarM30.d(true);
        dqogVar30.a = "messages.rcs_message_id";
        dqprVarM30.f(true);
        dqprVarM30.i(10000);
        dqogVar30.d = new Supplier() { // from class: bjkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bjla
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 4;
        dqprVarM31.d(true);
        dqogVar31.a = "messages.rcs_message_id_with_text_type";
        dqprVarM31.f(true);
        dqprVarM31.i(41040);
        dqogVar31.d = new Supplier() { // from class: bjlb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bjlc
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "messages.etouffee_status";
        dqprVarM32.i(29060);
        dqogVar32.d = new Supplier() { // from class: bjld
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bjlf
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "messages.verification_status";
        dqprVarM33.i(29090);
        dqogVar33.d = new Supplier() { // from class: bjlg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bjlh
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "messages.rcs_ui_status";
        dqprVarM34.i(39000);
        dqogVar34.d = new Supplier() { // from class: bjlj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bjlk
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqprVarM35.d(true);
        dqogVar35.a = "messages.is_hidden";
        dqprVarM35.i(30010);
        dqogVar35.d = new Supplier() { // from class: bjll
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bjlm
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 7;
        dqogVar36.a = "messages.rcs_remote_instance";
        dqprVarM36.i(10002);
        dqogVar36.d = new Supplier() { // from class: bjln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bjlo
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "messages.rcs_file_transfer_session_id";
        dqprVarM37.i(10004);
        dqogVar37.d = new Supplier() { // from class: bjlq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bjlr
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 1;
        dqogVar38.a = "messages.sms_error_code";
        dqprVarM38.i(9000);
        dqogVar38.d = new Supplier() { // from class: bjls
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bjlt
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 4;
        dqogVar39.a = "messages.sms_error_desc_map_name";
        dqprVarM39.i(9000);
        dqogVar39.d = new Supplier() { // from class: bjlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bjlw
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 4;
        dqogVar40.a = "messages.correlation_id";
        dqprVarM40.i(9010);
        dqogVar40.d = new Supplier() { // from class: bjlx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bjly
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 4;
        dqprVarM41.l(true);
        dqprVarM41.d(true);
        dqogVar41.a = "messages.cms_id";
        dqprVarM41.f(true);
        dqprVarM41.i(31010);
        dqogVar41.d = new Supplier() { // from class: bjlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bjmb
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 2;
        dqogVar42.a = "messages.cms_last_mod_seq";
        dqprVarM42.i(37040);
        dqogVar42.d = new Supplier() { // from class: bjmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bjmd
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 4;
        dqprVarM43.d(true);
        dqogVar43.a = "messages.web_id";
        dqprVarM43.i(19020);
        dqogVar43.d = new Supplier() { // from class: bjme
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bjmf
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "messages.usage_stats_logging_id";
        dqprVarM44.i(29100);
        dqogVar44.d = new Supplier() { // from class: bjmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bjmi
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "messages.send_counter";
        dqprVarM45.i(35030);
        dqogVar45.d = new Supplier() { // from class: bjmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bjmk
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqprVarM46.d(true);
        dqogVar46.a = "messages.original_rcs_message_id";
        dqprVarM46.i(35030);
        dqogVar46.d = new Supplier() { // from class: bjmm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bjmn
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 5;
        dqogVar47.a = "messages.raw_rcs_message_to_send";
        dqprVarM47.i(60820);
        dqogVar47.d = new Supplier() { // from class: bjmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bjmp
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 4;
        dqogVar48.a = "messages.custom_delivery_receipt_mime_type";
        dqprVarM48.i(37020);
        dqogVar48.d = new Supplier() { // from class: bjmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: bjmr
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 5;
        dqogVar49.a = "messages.custom_delivery_receipt_content";
        dqprVarM49.i(37020);
        dqogVar49.d = new Supplier() { // from class: bjmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bjni
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 1;
        dqogVar50.a = "messages.report_attempt_acounter";
        dqprVarM50.i(37030);
        dqogVar50.d = new Supplier() { // from class: bjnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: bjoe
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 5;
        dqogVar51.a = "messages.custom_headers";
        dqprVarM51.i(45020);
        dqogVar51.d = new Supplier() { // from class: bjop
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: bjpa
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 4;
        dqprVarM52.l(true);
        dqprVarM52.d(true);
        dqogVar52.a = "messages.cms_correlation_id";
        dqprVarM52.f(true);
        dqprVarM52.i(46010);
        dqogVar52.d = new Supplier() { // from class: bjpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: bjpw
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 1;
        dqprVarM53.d(true);
        dqprVarM53.e(true);
        dqogVar53.b = new Supplier() { // from class: bjqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar53.a = "messages.group_private_participant";
        dqprVarM53.i(48030);
        dqogVar53.d = new Supplier() { // from class: bjki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: bjle
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqprVarM54.d(true);
        dqprVarM54.e(true);
        dqogVar54.b = new Supplier() { // from class: bjlp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar54.a = "messages.original_message_id";
        dqprVarM54.i(48030);
        dqogVar54.d = new Supplier() { // from class: bjma
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: bjml
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 2;
        dqprVarM55.d(true);
        dqprVarM55.e(true);
        dqogVar55.b = new Supplier() { // from class: bjmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar55.a = "messages.parent_message_id";
        dqprVarM55.i(60950);
        dqogVar55.d = new Supplier() { // from class: bjmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar55.c = new dqps() { // from class: bjmv
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 1;
        dqogVar56.a = "messages.awaiting_reverse_sync";
        dqprVarM56.i(49060);
        dqogVar56.d = new Supplier() { // from class: bjmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar56.c = new dqps() { // from class: bjmy
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 4;
        dqogVar57.a = "messages.old_sms_message_uri";
        dqprVarM57.i(49060);
        dqogVar57.d = new Supplier() { // from class: bjmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar57.c = new dqps() { // from class: bjnb
        };
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.e = 4;
        dqprVarM58.l(true);
        dqprVarM58.d(true);
        dqogVar58.a = "messages.draft_id";
        dqprVarM58.f(true);
        dqprVarM58.i(56000);
        dqogVar58.d = new Supplier() { // from class: bjnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar58.c = new dqps() { // from class: bjnd
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 1;
        dqogVar59.a = "messages.result_code";
        dqprVarM59.i(58040);
        dqogVar59.d = new Supplier() { // from class: bjne
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar59.c = new dqps() { // from class: bjnf
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 1;
        dqogVar60.a = "messages.cms_life_cycle";
        dqprVarM60.i(58210);
        dqogVar60.d = new Supplier() { // from class: bjng
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar60.c = new dqps() { // from class: bjnh
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 1;
        dqogVar61.a = "messages.mute_priority";
        dqprVarM61.i(60750);
        dqogVar61.d = new Supplier() { // from class: bjnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar61.c = new dqps() { // from class: bjnk
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 1;
        dqogVar62.a = "messages.fallback_reason";
        dqprVarM62.i(58710);
        dqogVar62.d = new Supplier() { // from class: bjnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar62.c = new dqps() { // from class: bjnn
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 1;
        dqogVar63.a = "messages.auto_retry_counter";
        dqprVarM63.i(58230);
        dqogVar63.d = new Supplier() { // from class: bjno
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar63.c = new dqps() { // from class: bjnp
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 2;
        dqogVar64.a = "messages.can_revoke_before_delivered_with_rcs";
        dqprVarM64.i(58280);
        dqogVar64.d = new Supplier() { // from class: bjnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar64.c = new dqps() { // from class: bjnr
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 5;
        dqogVar65.a = "messages.trace_id";
        dqprVarM65.i(58680);
        dqogVar65.d = new Supplier() { // from class: bjns
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar65.c = new dqps() { // from class: bjnu
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 1;
        dqogVar66.a = "messages.outgoing_delivery_report_status";
        dqprVarM66.i(58720);
        dqogVar66.d = new Supplier() { // from class: bjnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar66.c = new dqps() { // from class: bjnw
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 1;
        dqogVar67.a = "messages.outgoing_read_report_status";
        dqprVarM67.i(58720);
        dqogVar67.d = new Supplier() { // from class: bjnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar67.c = new dqps() { // from class: bjnz
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 1;
        dqogVar68.a = "messages.xms_transport";
        dqprVarM68.i(59310);
        dqogVar68.d = new Supplier() { // from class: bjoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar68.c = new dqps() { // from class: bjob
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "messages.message_original_protocol";
        dqprVarM69.i(59430);
        dqogVar69.d = new Supplier() { // from class: bjoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar69.c = new dqps() { // from class: bjod
        };
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.e = 4;
        dqprVarM70.l(true);
        dqprVarM70.d(true);
        dqogVar70.a = "messages.satellite_datagram_id";
        dqprVarM70.f(true);
        dqprVarM70.i(59490);
        dqogVar70.d = new Supplier() { // from class: bjof
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar70.c = new dqps() { // from class: bjog
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.e = 1;
        dqogVar71.a = "messages.encryption_protocol";
        dqprVarM71.i(60190);
        dqogVar71.d = new Supplier() { // from class: bjoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar71.c = new dqps() { // from class: bjoi
        };
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqog dqogVar72 = (dqog) dqprVarM72;
        dqogVar72.e = 4;
        dqprVarM72.l(true);
        dqprVarM72.d(true);
        dqogVar72.a = "messages.message_persistence_id";
        dqprVarM72.f(true);
        dqprVarM72.i(60370);
        dqogVar72.d = new Supplier() { // from class: bjoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar72.c = new dqps() { // from class: bjol
        };
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqog dqogVar73 = (dqog) dqprVarM73;
        dqogVar73.e = 2;
        dqprVarM73.l(true);
        dqprVarM73.g(true);
        dqprVarM73.d(true);
        dqogVar73.a = "b._id";
        dqprVarM73.i(-1);
        dqogVar73.d = new Supplier() { // from class: bjom
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar73.c = new dqps() { // from class: bjon
        };
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqog dqogVar74 = (dqog) dqprVarM74;
        dqogVar74.e = 2;
        dqprVarM74.l(true);
        dqprVarM74.d(true);
        dqprVarM74.e(true);
        dqogVar74.b = new Supplier() { // from class: bjoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar74.a = "b.message_id";
        dqprVarM74.i(-1);
        dqogVar74.d = new Supplier() { // from class: bjoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar74.c = new dqps() { // from class: bjor
        };
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqog dqogVar75 = (dqog) dqprVarM75;
        dqogVar75.e = 5;
        dqogVar75.a = "b.reactions_data";
        dqprVarM75.i(-1);
        dqogVar75.d = new Supplier() { // from class: bjos
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar75.c = new dqps() { // from class: bjot
        };
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqog dqogVar76 = (dqog) dqprVarM76;
        dqogVar76.e = 2;
        dqprVarM76.d(true);
        dqprVarM76.e(true);
        dqogVar76.b = new Supplier() { // from class: bjou
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar76.a = "b.reacted_message_id";
        dqprVarM76.i(46020);
        dqogVar76.d = new Supplier() { // from class: bjov
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar76.c = new dqps() { // from class: bjox
        };
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqog dqogVar77 = (dqog) dqprVarM77;
        dqogVar77.e = 2;
        dqogVar77.a = "b.reaction";
        dqprVarM77.i(48000);
        dqogVar77.d = new Supplier() { // from class: bjoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar77.c = new dqps() { // from class: bjoz
        };
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqog dqogVar78 = (dqog) dqprVarM78;
        dqogVar78.e = 5;
        dqogVar78.a = "b.applied_reaction";
        dqprVarM78.i(59060);
        dqogVar78.d = new Supplier() { // from class: bjpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar78.c = new dqps() { // from class: bjpc
        };
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqog dqogVar79 = (dqog) dqprVarM79;
        dqogVar79.e = 5;
        dqprVarM79.d(true);
        dqogVar79.a = "b.animation_effect";
        dqprVarM79.i(59520);
        dqogVar79.d = new Supplier() { // from class: bjpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjqr.a();
            }
        };
        dqogVar79.c = new dqps() { // from class: bjpe
        };
        dqprVarM79.a();
    }
}
