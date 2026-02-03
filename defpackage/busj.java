package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class busj {
    public final busk a;

    public busj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_suggestions._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bult
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar.c = new dqps() { // from class: burq
        };
        this.a = new busk(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: busc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "conversation_suggestions.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bulz
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buml
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "conversation_suggestions.conversation_suggestion_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bumx
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bunj
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "conversation_suggestions.properties";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bunv
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: buoi
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "conversation_suggestions.post_back_data";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: buou
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bump
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "conversation_suggestions.post_back_encoding";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bupb
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bupn
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "conversation_suggestions.rcs_message_id";
        dqprVarM7.i(11001);
        dqogVar7.d = new Supplier() { // from class: bupz
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: buql
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqprVarM8.d(true);
        dqogVar8.a = "conversation_suggestions.target_rcs_message_id";
        dqprVarM8.i(12000);
        dqogVar8.d = new Supplier() { // from class: buqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: burj
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "conversation_suggestions.read";
        dqprVarM9.i(12000);
        dqogVar9.d = new Supplier() { // from class: burn
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: buro
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "conversation_suggestions.received_timestamp";
        dqprVarM10.i(12000);
        dqogVar10.d = new Supplier() { // from class: burp
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: burr
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqprVarM11.d(true);
        dqprVarM11.e(true);
        dqogVar11.b = new Supplier() { // from class: burs
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar11.a = "messages.conversation_id";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: burt
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: buru
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 2;
        dqprVarM12.l(true);
        dqprVarM12.g(true);
        dqprVarM12.d(true);
        dqogVar12.a = "messages._id";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: burv
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: burw
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqprVarM13.d(true);
        dqprVarM13.e(true);
        dqogVar13.b = new Supplier() { // from class: bury
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar13.a = "messages.sender_id";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: burz
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: busa
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqogVar14.a = "messages.sender_send_destination";
        dqprVarM14.i(54040);
        dqogVar14.d = new Supplier() { // from class: busb
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: busd
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "messages.msisdn_receiving_rcs_message";
        dqprVarM15.i(59340);
        dqogVar15.d = new Supplier() { // from class: buse
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: busf
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqogVar16.a = "messages.receiving_network_country";
        dqprVarM16.i(54040);
        dqogVar16.d = new Supplier() { // from class: busg
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bush
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqprVarM17.d(true);
        dqogVar17.a = "messages.sent_timestamp";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bulu
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bulv
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqogVar18.a = "messages.queue_insert_timestamp";
        dqprVarM18.i(17030);
        dqogVar18.d = new Supplier() { // from class: bulw
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bulx
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqprVarM19.d(true);
        dqogVar19.a = "messages.received_timestamp";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: buly
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: buma
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqogVar20.a = "messages.message_protocol";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bumb
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bumc
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqprVarM21.d(true);
        dqogVar21.a = "messages.message_status";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: bumd
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bumf
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "messages.message_report_status";
        dqprVarM22.i(13020);
        dqogVar22.d = new Supplier() { // from class: bumg
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bumh
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 1;
        dqprVarM23.d(true);
        dqogVar23.a = "messages.seen";
        dqprVarM23.f(true);
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: bumi
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bumj
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqprVarM24.d(true);
        dqogVar24.a = "messages.read";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: bumk
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bumm
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqprVarM25.d(true);
        dqogVar25.a = "messages.sms_message_uri";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: bumn
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bumo
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "messages.sms_priority";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: bumq
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bumr
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 1;
        dqogVar27.a = "messages.sms_message_size";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: bums
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bumt
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "messages.mms_subject";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: bumu
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bumv
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqogVar29.a = "messages.mms_transaction_id";
        dqprVarM29.i(-1);
        dqogVar29.d = new Supplier() { // from class: bumw
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bumy
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 4;
        dqogVar30.a = "messages.mms_content_location";
        dqprVarM30.i(-1);
        dqogVar30.d = new Supplier() { // from class: bumz
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bunb
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "messages.mms_expiry";
        dqprVarM31.i(-1);
        dqogVar31.d = new Supplier() { // from class: bunc
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bund
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqprVarM32.d(true);
        dqogVar32.a = "messages.rcs_expiry";
        dqprVarM32.i(59890);
        dqogVar32.d = new Supplier() { // from class: bune
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bunf
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 4;
        dqogVar33.a = "messages.mms_retrieve_text";
        dqprVarM33.i(9030);
        dqogVar33.d = new Supplier() { // from class: bung
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bunh
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "messages.raw_status";
        dqprVarM34.i(-1);
        dqogVar34.d = new Supplier() { // from class: buni
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bunk
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqprVarM35.d(true);
        dqprVarM35.e(true);
        dqogVar35.b = new Supplier() { // from class: bunm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar35.a = "messages.self_id";
        dqprVarM35.i(-1);
        dqogVar35.d = new Supplier() { // from class: bunn
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: buno
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 4;
        dqprVarM36.d(true);
        dqogVar36.a = "messages.my_identity";
        dqprVarM36.i(59810);
        dqogVar36.d = new Supplier() { // from class: bunp
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bunq
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 4;
        dqprVarM37.d(true);
        dqprVarM37.e(true);
        dqogVar37.b = new Supplier() { // from class: bunr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar37.a = "messages.my_identity_foreign_key";
        dqprVarM37.i(60160);
        dqogVar37.d = new Supplier() { // from class: buns
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bunt
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 1;
        dqogVar38.a = "messages.retry_start_timestamp";
        dqprVarM38.i(-1);
        dqogVar38.d = new Supplier() { // from class: bunu
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bunx
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 4;
        dqprVarM39.d(true);
        dqogVar39.a = "messages.cloud_sync_id";
        dqprVarM39.i(8500);
        dqogVar39.d = new Supplier() { // from class: buny
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bunz
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 7;
        dqprVarM40.d(true);
        dqogVar40.a = "messages.rcs_message_id";
        dqprVarM40.f(true);
        dqprVarM40.i(10000);
        dqogVar40.d = new Supplier() { // from class: buoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: buob
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 4;
        dqprVarM41.d(true);
        dqogVar41.a = "messages.rcs_message_id_with_text_type";
        dqprVarM41.f(true);
        dqprVarM41.i(41040);
        dqogVar41.d = new Supplier() { // from class: buoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: buod
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "messages.etouffee_status";
        dqprVarM42.i(29060);
        dqogVar42.d = new Supplier() { // from class: buoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: buof
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "messages.verification_status";
        dqprVarM43.i(29090);
        dqogVar43.d = new Supplier() { // from class: buog
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: buoj
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "messages.rcs_ui_status";
        dqprVarM44.i(39000);
        dqogVar44.d = new Supplier() { // from class: buok
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: buol
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqprVarM45.d(true);
        dqogVar45.a = "messages.is_hidden";
        dqprVarM45.i(30010);
        dqogVar45.d = new Supplier() { // from class: buom
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: buon
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 7;
        dqogVar46.a = "messages.rcs_remote_instance";
        dqprVarM46.i(10002);
        dqogVar46.d = new Supplier() { // from class: buoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: buop
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqogVar47.a = "messages.rcs_file_transfer_session_id";
        dqprVarM47.i(10004);
        dqogVar47.d = new Supplier() { // from class: buoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: buor
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 1;
        dqogVar48.a = "messages.sms_error_code";
        dqprVarM48.i(9000);
        dqogVar48.d = new Supplier() { // from class: buot
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: buoy
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 4;
        dqogVar49.a = "messages.sms_error_desc_map_name";
        dqprVarM49.i(9000);
        dqogVar49.d = new Supplier() { // from class: bupj
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bupu
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 4;
        dqogVar50.a = "messages.correlation_id";
        dqprVarM50.i(9010);
        dqogVar50.d = new Supplier() { // from class: buqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: buqq
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 4;
        dqprVarM51.l(true);
        dqprVarM51.d(true);
        dqogVar51.a = "messages.cms_id";
        dqprVarM51.f(true);
        dqprVarM51.i(31010);
        dqogVar51.d = new Supplier() { // from class: burb
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: burm
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 2;
        dqogVar52.a = "messages.cms_last_mod_seq";
        dqprVarM52.i(37040);
        dqogVar52.d = new Supplier() { // from class: burx
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: busi
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 4;
        dqprVarM53.d(true);
        dqogVar53.a = "messages.web_id";
        dqprVarM53.i(19020);
        dqogVar53.d = new Supplier() { // from class: bume
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: buna
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqogVar54.a = "messages.usage_stats_logging_id";
        dqprVarM54.i(29100);
        dqogVar54.d = new Supplier() { // from class: bunl
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: bunw
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 1;
        dqogVar55.a = "messages.send_counter";
        dqprVarM55.i(35030);
        dqogVar55.d = new Supplier() { // from class: buoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar55.c = new dqps() { // from class: buos
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 4;
        dqprVarM56.d(true);
        dqogVar56.a = "messages.original_rcs_message_id";
        dqprVarM56.i(35030);
        dqogVar56.d = new Supplier() { // from class: buov
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar56.c = new dqps() { // from class: buow
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 5;
        dqogVar57.a = "messages.raw_rcs_message_to_send";
        dqprVarM57.i(60820);
        dqogVar57.d = new Supplier() { // from class: buox
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar57.c = new dqps() { // from class: buoz
        };
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.e = 4;
        dqogVar58.a = "messages.custom_delivery_receipt_mime_type";
        dqprVarM58.i(37020);
        dqogVar58.d = new Supplier() { // from class: bupa
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar58.c = new dqps() { // from class: bupc
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 5;
        dqogVar59.a = "messages.custom_delivery_receipt_content";
        dqprVarM59.i(37020);
        dqogVar59.d = new Supplier() { // from class: bupd
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar59.c = new dqps() { // from class: bupe
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 1;
        dqogVar60.a = "messages.report_attempt_acounter";
        dqprVarM60.i(37030);
        dqogVar60.d = new Supplier() { // from class: bupf
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar60.c = new dqps() { // from class: bupg
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 5;
        dqogVar61.a = "messages.custom_headers";
        dqprVarM61.i(45020);
        dqogVar61.d = new Supplier() { // from class: buph
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar61.c = new dqps() { // from class: bupi
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 4;
        dqprVarM62.l(true);
        dqprVarM62.d(true);
        dqogVar62.a = "messages.cms_correlation_id";
        dqprVarM62.f(true);
        dqprVarM62.i(46010);
        dqogVar62.d = new Supplier() { // from class: bupk
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar62.c = new dqps() { // from class: bupl
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 1;
        dqprVarM63.d(true);
        dqprVarM63.e(true);
        dqogVar63.b = new Supplier() { // from class: bupm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar63.a = "messages.group_private_participant";
        dqprVarM63.i(48030);
        dqogVar63.d = new Supplier() { // from class: bupo
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar63.c = new dqps() { // from class: bupp
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 1;
        dqprVarM64.d(true);
        dqprVarM64.e(true);
        dqogVar64.b = new Supplier() { // from class: bupq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar64.a = "messages.original_message_id";
        dqprVarM64.i(48030);
        dqogVar64.d = new Supplier() { // from class: bupr
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar64.c = new dqps() { // from class: bups
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 2;
        dqprVarM65.d(true);
        dqprVarM65.e(true);
        dqogVar65.b = new Supplier() { // from class: bupt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar65.a = "messages.parent_message_id";
        dqprVarM65.i(60950);
        dqogVar65.d = new Supplier() { // from class: bupv
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar65.c = new dqps() { // from class: bupw
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 1;
        dqogVar66.a = "messages.awaiting_reverse_sync";
        dqprVarM66.i(49060);
        dqogVar66.d = new Supplier() { // from class: bupx
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar66.c = new dqps() { // from class: bupy
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 4;
        dqogVar67.a = "messages.old_sms_message_uri";
        dqprVarM67.i(49060);
        dqogVar67.d = new Supplier() { // from class: buqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar67.c = new dqps() { // from class: buqb
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 4;
        dqprVarM68.l(true);
        dqprVarM68.d(true);
        dqogVar68.a = "messages.draft_id";
        dqprVarM68.f(true);
        dqprVarM68.i(56000);
        dqogVar68.d = new Supplier() { // from class: buqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar68.c = new dqps() { // from class: buqd
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "messages.result_code";
        dqprVarM69.i(58040);
        dqogVar69.d = new Supplier() { // from class: buqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar69.c = new dqps() { // from class: buqg
        };
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.e = 1;
        dqogVar70.a = "messages.cms_life_cycle";
        dqprVarM70.i(58210);
        dqogVar70.d = new Supplier() { // from class: buqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar70.c = new dqps() { // from class: buqi
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.e = 1;
        dqogVar71.a = "messages.mute_priority";
        dqprVarM71.i(60750);
        dqogVar71.d = new Supplier() { // from class: buqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar71.c = new dqps() { // from class: buqk
        };
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqog dqogVar72 = (dqog) dqprVarM72;
        dqogVar72.e = 1;
        dqogVar72.a = "messages.fallback_reason";
        dqprVarM72.i(58710);
        dqogVar72.d = new Supplier() { // from class: buqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar72.c = new dqps() { // from class: buqn
        };
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqog dqogVar73 = (dqog) dqprVarM73;
        dqogVar73.e = 1;
        dqogVar73.a = "messages.auto_retry_counter";
        dqprVarM73.i(58230);
        dqogVar73.d = new Supplier() { // from class: buqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar73.c = new dqps() { // from class: buqp
        };
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqog dqogVar74 = (dqog) dqprVarM74;
        dqogVar74.e = 2;
        dqogVar74.a = "messages.can_revoke_before_delivered_with_rcs";
        dqprVarM74.i(58280);
        dqogVar74.d = new Supplier() { // from class: buqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar74.c = new dqps() { // from class: buqs
        };
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqog dqogVar75 = (dqog) dqprVarM75;
        dqogVar75.e = 5;
        dqogVar75.a = "messages.trace_id";
        dqprVarM75.i(58680);
        dqogVar75.d = new Supplier() { // from class: buqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar75.c = new dqps() { // from class: buqu
        };
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqog dqogVar76 = (dqog) dqprVarM76;
        dqogVar76.e = 1;
        dqogVar76.a = "messages.outgoing_delivery_report_status";
        dqprVarM76.i(58720);
        dqogVar76.d = new Supplier() { // from class: buqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar76.c = new dqps() { // from class: buqw
        };
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqog dqogVar77 = (dqog) dqprVarM77;
        dqogVar77.e = 1;
        dqogVar77.a = "messages.outgoing_read_report_status";
        dqprVarM77.i(58720);
        dqogVar77.d = new Supplier() { // from class: buqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar77.c = new dqps() { // from class: buqz
        };
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqog dqogVar78 = (dqog) dqprVarM78;
        dqogVar78.e = 1;
        dqogVar78.a = "messages.xms_transport";
        dqprVarM78.i(59310);
        dqogVar78.d = new Supplier() { // from class: bura
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar78.c = new dqps() { // from class: burc
        };
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqog dqogVar79 = (dqog) dqprVarM79;
        dqogVar79.e = 1;
        dqogVar79.a = "messages.message_original_protocol";
        dqprVarM79.i(59430);
        dqogVar79.d = new Supplier() { // from class: burd
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar79.c = new dqps() { // from class: bure
        };
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqog dqogVar80 = (dqog) dqprVarM80;
        dqogVar80.e = 4;
        dqprVarM80.l(true);
        dqprVarM80.d(true);
        dqogVar80.a = "messages.satellite_datagram_id";
        dqprVarM80.f(true);
        dqprVarM80.i(59490);
        dqogVar80.d = new Supplier() { // from class: burf
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar80.c = new dqps() { // from class: burg
        };
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqog dqogVar81 = (dqog) dqprVarM81;
        dqogVar81.e = 1;
        dqogVar81.a = "messages.encryption_protocol";
        dqprVarM81.i(60190);
        dqogVar81.d = new Supplier() { // from class: burh
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar81.c = new dqps() { // from class: buri
        };
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqog dqogVar82 = (dqog) dqprVarM82;
        dqogVar82.e = 4;
        dqprVarM82.l(true);
        dqprVarM82.d(true);
        dqogVar82.a = "messages.message_persistence_id";
        dqprVarM82.f(true);
        dqprVarM82.i(60370);
        dqogVar82.d = new Supplier() { // from class: burk
            @Override // java.util.function.Supplier
            public final Object get() {
                return busq.a();
            }
        };
        dqogVar82.c = new dqps() { // from class: burl
        };
        dqprVarM82.a();
    }
}
