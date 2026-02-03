package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjj {
    public final bjjk a;
    public final bjjk b;

    public bjjj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "messages._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bjdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bjht
        };
        this.a = new bjjk(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bjif
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "messages.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bjir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bjjd
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bjdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "messages.sender_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bjeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bjet
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "messages.sender_send_destination";
        dqprVarM4.i(54040);
        dqogVar4.d = new Supplier() { // from class: bjff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bjfs
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "messages.msisdn_receiving_rcs_message";
        dqprVarM5.i(59340);
        dqogVar5.d = new Supplier() { // from class: bjek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bjgb
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "messages.receiving_network_country";
        dqprVarM6.i(54040);
        dqogVar6.d = new Supplier() { // from class: bjgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bjgz
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqprVarM7.d(true);
        dqogVar7.a = "messages.sent_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bjhl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bjhn
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "messages.queue_insert_timestamp";
        dqprVarM8.i(17030);
        dqogVar8.d = new Supplier() { // from class: bjho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bjhp
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqprVarM9.d(true);
        dqogVar9.a = "messages.received_timestamp";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bjhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bjhs
        };
        this.b = new bjjk(dqprVarM9.a());
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "messages.message_protocol";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bjhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bjhv
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqprVarM11.d(true);
        dqogVar11.a = "messages.message_status";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bjhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bjhx
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 1;
        dqogVar12.a = "messages.message_report_status";
        dqprVarM12.i(13020);
        dqogVar12.d = new Supplier() { // from class: bjhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bjhz
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqprVarM13.d(true);
        dqogVar13.a = "messages.seen";
        dqprVarM13.f(true);
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bjia
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bjic
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 1;
        dqprVarM14.d(true);
        dqogVar14.a = "messages.read";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bjid
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bjie
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqprVarM15.d(true);
        dqogVar15.a = "messages.sms_message_uri";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bjig
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bjih
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqogVar16.a = "messages.sms_priority";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bjii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bjij
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "messages.sms_message_size";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bjik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bjil
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "messages.mms_subject";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bjin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bjio
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 4;
        dqogVar19.a = "messages.mms_transaction_id";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bjip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bjiq
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "messages.mms_content_location";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bjis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bjit
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "messages.mms_expiry";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: bjiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bjiv
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqprVarM22.d(true);
        dqogVar22.a = "messages.rcs_expiry";
        dqprVarM22.i(59890);
        dqogVar22.d = new Supplier() { // from class: bjiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bjiy
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "messages.mms_retrieve_text";
        dqprVarM23.i(9030);
        dqogVar23.d = new Supplier() { // from class: bjiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bjja
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "messages.raw_status";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: bjjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bjjc
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqprVarM25.d(true);
        dqprVarM25.e(true);
        dqogVar25.b = new Supplier() { // from class: bjje
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar25.a = "messages.self_id";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: bjjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bjjg
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqprVarM26.d(true);
        dqogVar26.a = "messages.my_identity";
        dqprVarM26.i(59810);
        dqogVar26.d = new Supplier() { // from class: bjjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bjdp
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqprVarM27.d(true);
        dqprVarM27.e(true);
        dqogVar27.b = new Supplier() { // from class: bjdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar27.a = "messages.my_identity_foreign_key";
        dqprVarM27.i(60160);
        dqogVar27.d = new Supplier() { // from class: bjdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bjds
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 1;
        dqogVar28.a = "messages.retry_start_timestamp";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: bjdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bjdu
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqprVarM29.d(true);
        dqogVar29.a = "messages.cloud_sync_id";
        dqprVarM29.i(8500);
        dqogVar29.d = new Supplier() { // from class: bjdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bjdx
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 7;
        dqprVarM30.d(true);
        dqogVar30.a = "messages.rcs_message_id";
        dqprVarM30.f(true);
        dqprVarM30.i(10000);
        dqogVar30.d = new Supplier() { // from class: bjdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bjea
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 4;
        dqprVarM31.d(true);
        dqogVar31.a = "messages.rcs_message_id_with_text_type";
        dqprVarM31.f(true);
        dqprVarM31.i(41040);
        dqogVar31.d = new Supplier() { // from class: bjeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bjec
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "messages.etouffee_status";
        dqprVarM32.i(29060);
        dqogVar32.d = new Supplier() { // from class: bjed
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bjee
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "messages.verification_status";
        dqprVarM33.i(29090);
        dqogVar33.d = new Supplier() { // from class: bjef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bjeg
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "messages.rcs_ui_status";
        dqprVarM34.i(39000);
        dqogVar34.d = new Supplier() { // from class: bjei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bjej
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqprVarM35.d(true);
        dqogVar35.a = "messages.is_hidden";
        dqprVarM35.i(30010);
        dqogVar35.d = new Supplier() { // from class: bjel
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bjem
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 7;
        dqogVar36.a = "messages.rcs_remote_instance";
        dqprVarM36.i(10002);
        dqogVar36.d = new Supplier() { // from class: bjen
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bjeo
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "messages.rcs_file_transfer_session_id";
        dqprVarM37.i(10004);
        dqogVar37.d = new Supplier() { // from class: bjep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bjeq
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 1;
        dqogVar38.a = "messages.sms_error_code";
        dqprVarM38.i(9000);
        dqogVar38.d = new Supplier() { // from class: bjer
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bjes
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 4;
        dqogVar39.a = "messages.sms_error_desc_map_name";
        dqprVarM39.i(9000);
        dqogVar39.d = new Supplier() { // from class: bjeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bjew
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 4;
        dqogVar40.a = "messages.correlation_id";
        dqprVarM40.i(9010);
        dqogVar40.d = new Supplier() { // from class: bjex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bjey
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
        dqogVar41.d = new Supplier() { // from class: bjez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bjfa
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 2;
        dqogVar42.a = "messages.cms_last_mod_seq";
        dqprVarM42.i(37040);
        dqogVar42.d = new Supplier() { // from class: bjfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bjfc
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 4;
        dqprVarM43.d(true);
        dqogVar43.a = "messages.web_id";
        dqprVarM43.i(19020);
        dqogVar43.d = new Supplier() { // from class: bjfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bjfe
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "messages.usage_stats_logging_id";
        dqprVarM44.i(29100);
        dqogVar44.d = new Supplier() { // from class: bjfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bjfi
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "messages.send_counter";
        dqprVarM45.i(35030);
        dqogVar45.d = new Supplier() { // from class: bjfj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bjfk
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqprVarM46.d(true);
        dqogVar46.a = "messages.original_rcs_message_id";
        dqprVarM46.i(35030);
        dqogVar46.d = new Supplier() { // from class: bjfl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bjfm
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 5;
        dqogVar47.a = "messages.raw_rcs_message_to_send";
        dqprVarM47.i(60820);
        dqogVar47.d = new Supplier() { // from class: bjfn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bjfo
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 4;
        dqogVar48.a = "messages.custom_delivery_receipt_mime_type";
        dqprVarM48.i(37020);
        dqogVar48.d = new Supplier() { // from class: bjfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: bjfq
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 5;
        dqogVar49.a = "messages.custom_delivery_receipt_content";
        dqprVarM49.i(37020);
        dqogVar49.d = new Supplier() { // from class: bjfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bjgj
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 1;
        dqogVar50.a = "messages.report_attempt_acounter";
        dqprVarM50.i(37030);
        dqogVar50.d = new Supplier() { // from class: bjgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: bjhf
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 5;
        dqogVar51.a = "messages.custom_headers";
        dqprVarM51.i(45020);
        dqogVar51.d = new Supplier() { // from class: bjhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: bjib
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
        dqogVar52.d = new Supplier() { // from class: bjim
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: bjix
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 1;
        dqprVarM53.d(true);
        dqprVarM53.e(true);
        dqogVar53.b = new Supplier() { // from class: bjji
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar53.a = "messages.group_private_participant";
        dqprVarM53.i(48030);
        dqogVar53.d = new Supplier() { // from class: bjdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: bjev
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqprVarM54.d(true);
        dqprVarM54.e(true);
        dqogVar54.b = new Supplier() { // from class: bjfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar54.a = "messages.original_message_id";
        dqprVarM54.i(48030);
        dqogVar54.d = new Supplier() { // from class: bjfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: bjft
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 2;
        dqprVarM55.d(true);
        dqprVarM55.e(true);
        dqogVar55.b = new Supplier() { // from class: bjfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar55.a = "messages.parent_message_id";
        dqprVarM55.i(60950);
        dqogVar55.d = new Supplier() { // from class: bjfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar55.c = new dqps() { // from class: bjfw
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 1;
        dqogVar56.a = "messages.awaiting_reverse_sync";
        dqprVarM56.i(49060);
        dqogVar56.d = new Supplier() { // from class: bjfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar56.c = new dqps() { // from class: bjfz
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 4;
        dqogVar57.a = "messages.old_sms_message_uri";
        dqprVarM57.i(49060);
        dqogVar57.d = new Supplier() { // from class: bjga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar57.c = new dqps() { // from class: bjgc
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
        dqogVar58.d = new Supplier() { // from class: bjgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar58.c = new dqps() { // from class: bjge
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 1;
        dqogVar59.a = "messages.result_code";
        dqprVarM59.i(58040);
        dqogVar59.d = new Supplier() { // from class: bjgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar59.c = new dqps() { // from class: bjgg
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 1;
        dqogVar60.a = "messages.cms_life_cycle";
        dqprVarM60.i(58210);
        dqogVar60.d = new Supplier() { // from class: bjgh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar60.c = new dqps() { // from class: bjgi
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 1;
        dqogVar61.a = "messages.mute_priority";
        dqprVarM61.i(60750);
        dqogVar61.d = new Supplier() { // from class: bjgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar61.c = new dqps() { // from class: bjgl
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 1;
        dqogVar62.a = "messages.fallback_reason";
        dqprVarM62.i(58710);
        dqogVar62.d = new Supplier() { // from class: bjgm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar62.c = new dqps() { // from class: bjgo
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 1;
        dqogVar63.a = "messages.auto_retry_counter";
        dqprVarM63.i(58230);
        dqogVar63.d = new Supplier() { // from class: bjgp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar63.c = new dqps() { // from class: bjgq
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 2;
        dqogVar64.a = "messages.can_revoke_before_delivered_with_rcs";
        dqprVarM64.i(58280);
        dqogVar64.d = new Supplier() { // from class: bjgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar64.c = new dqps() { // from class: bjgs
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 5;
        dqogVar65.a = "messages.trace_id";
        dqprVarM65.i(58680);
        dqogVar65.d = new Supplier() { // from class: bjgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar65.c = new dqps() { // from class: bjgv
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 1;
        dqogVar66.a = "messages.outgoing_delivery_report_status";
        dqprVarM66.i(58720);
        dqogVar66.d = new Supplier() { // from class: bjgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar66.c = new dqps() { // from class: bjgx
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 1;
        dqogVar67.a = "messages.outgoing_read_report_status";
        dqprVarM67.i(58720);
        dqogVar67.d = new Supplier() { // from class: bjgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar67.c = new dqps() { // from class: bjha
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 1;
        dqogVar68.a = "messages.xms_transport";
        dqprVarM68.i(59310);
        dqogVar68.d = new Supplier() { // from class: bjhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar68.c = new dqps() { // from class: bjhc
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "messages.message_original_protocol";
        dqprVarM69.i(59430);
        dqogVar69.d = new Supplier() { // from class: bjhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar69.c = new dqps() { // from class: bjhe
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
        dqogVar70.d = new Supplier() { // from class: bjhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar70.c = new dqps() { // from class: bjhh
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.e = 1;
        dqogVar71.a = "messages.encryption_protocol";
        dqprVarM71.i(60190);
        dqogVar71.d = new Supplier() { // from class: bjhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar71.c = new dqps() { // from class: bjhj
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
        dqogVar72.d = new Supplier() { // from class: bjhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjju.a();
            }
        };
        dqogVar72.c = new dqps() { // from class: bjhm
        };
        dqprVarM72.a();
    }
}
