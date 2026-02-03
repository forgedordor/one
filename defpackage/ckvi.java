package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckvi {
    public final ckvj a;

    public ckvi() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: ckox
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_reactions.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ckuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar.c = new dqps() { // from class: ckuv
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: ckoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_reactions.reacted_message_id";
        dqprVarM2.i(46020);
        dqogVar2.d = new Supplier() { // from class: ckpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: ckpw
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "message_reactions.reaction";
        dqprVarM3.i(48000);
        dqogVar3.d = new Supplier() { // from class: ckqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: ckqu
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "message_reactions.applied_reaction";
        dqprVarM4.i(59060);
        dqogVar4.d = new Supplier() { // from class: ckrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: ckrs
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.l(true);
        dqprVarM5.g(true);
        dqprVarM5.d(true);
        dqogVar5.a = "message_reactions._id";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: ckpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: cksa
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "message_reactions.reactions_data";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: cksm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: cksy
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 5;
        dqprVarM7.d(true);
        dqogVar7.a = "message_reactions.animation_effect";
        dqprVarM7.i(59520);
        dqogVar7.d = new Supplier() { // from class: cktk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: cktw
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqprVarM8.l(true);
        dqprVarM8.g(true);
        dqprVarM8.d(true);
        dqogVar8.a = "messages._id";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: ckuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: ckug
        };
        this.a = new ckvj(dqprVarM8.a());
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqprVarM9.d(true);
        dqogVar9.a = "messages.message_status";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: ckuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: ckui
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqprVarM10.d(true);
        dqprVarM10.e(true);
        dqogVar10.b = new Supplier() { // from class: ckuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar10.a = "messages.conversation_id";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: ckum
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: ckun
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqprVarM11.d(true);
        dqprVarM11.e(true);
        dqogVar11.b = new Supplier() { // from class: ckuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar11.a = "messages.sender_id";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: ckup
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: ckuq
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "messages.sender_send_destination";
        dqprVarM12.i(54040);
        dqogVar12.d = new Supplier() { // from class: ckur
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: ckus
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "messages.msisdn_receiving_rcs_message";
        dqprVarM13.i(59340);
        dqogVar13.d = new Supplier() { // from class: ckut
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: ckuu
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqogVar14.a = "messages.receiving_network_country";
        dqprVarM14.i(54040);
        dqogVar14.d = new Supplier() { // from class: ckux
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar14.c = new dqps() { // from class: ckuy
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 1;
        dqprVarM15.d(true);
        dqogVar15.a = "messages.sent_timestamp";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: ckuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar15.c = new dqps() { // from class: ckva
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqogVar16.a = "messages.queue_insert_timestamp";
        dqprVarM16.i(17030);
        dqogVar16.d = new Supplier() { // from class: ckvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar16.c = new dqps() { // from class: ckvc
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqprVarM17.d(true);
        dqogVar17.a = "messages.received_timestamp";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: ckvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar17.c = new dqps() { // from class: ckve
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqogVar18.a = "messages.message_protocol";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: ckvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar18.c = new dqps() { // from class: ckvg
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "messages.message_report_status";
        dqprVarM19.i(13020);
        dqogVar19.d = new Supplier() { // from class: ckoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar19.c = new dqps() { // from class: ckpa
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqprVarM20.d(true);
        dqogVar20.a = "messages.seen";
        dqprVarM20.f(true);
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: ckpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar20.c = new dqps() { // from class: ckpc
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqprVarM21.d(true);
        dqogVar21.a = "messages.read";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: ckpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar21.c = new dqps() { // from class: ckpe
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 4;
        dqprVarM22.d(true);
        dqogVar22.a = "messages.sms_message_uri";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: ckpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar22.c = new dqps() { // from class: ckpg
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 1;
        dqogVar23.a = "messages.sms_priority";
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: ckph
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar23.c = new dqps() { // from class: ckpj
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "messages.sms_message_size";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: ckpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar24.c = new dqps() { // from class: ckpm
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqogVar25.a = "messages.mms_subject";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: ckpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar25.c = new dqps() { // from class: ckpo
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqogVar26.a = "messages.mms_transaction_id";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: ckpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar26.c = new dqps() { // from class: ckpq
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "messages.mms_content_location";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: ckpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar27.c = new dqps() { // from class: ckps
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 1;
        dqogVar28.a = "messages.mms_expiry";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: ckpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar28.c = new dqps() { // from class: ckpv
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 1;
        dqprVarM29.d(true);
        dqogVar29.a = "messages.rcs_expiry";
        dqprVarM29.i(59890);
        dqogVar29.d = new Supplier() { // from class: ckpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar29.c = new dqps() { // from class: ckpy
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 4;
        dqogVar30.a = "messages.mms_retrieve_text";
        dqprVarM30.i(9030);
        dqogVar30.d = new Supplier() { // from class: ckpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar30.c = new dqps() { // from class: ckqa
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "messages.raw_status";
        dqprVarM31.i(-1);
        dqogVar31.d = new Supplier() { // from class: ckqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar31.c = new dqps() { // from class: ckqc
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqprVarM32.d(true);
        dqprVarM32.e(true);
        dqogVar32.b = new Supplier() { // from class: ckqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar32.a = "messages.self_id";
        dqprVarM32.i(-1);
        dqogVar32.d = new Supplier() { // from class: ckqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar32.c = new dqps() { // from class: ckqg
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 4;
        dqprVarM33.d(true);
        dqogVar33.a = "messages.my_identity";
        dqprVarM33.i(59810);
        dqogVar33.d = new Supplier() { // from class: ckqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar33.c = new dqps() { // from class: ckqj
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 4;
        dqprVarM34.d(true);
        dqprVarM34.e(true);
        dqogVar34.b = new Supplier() { // from class: ckqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar34.a = "messages.my_identity_foreign_key";
        dqprVarM34.i(60160);
        dqogVar34.d = new Supplier() { // from class: ckql
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar34.c = new dqps() { // from class: ckqm
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "messages.retry_start_timestamp";
        dqprVarM35.i(-1);
        dqogVar35.d = new Supplier() { // from class: ckqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar35.c = new dqps() { // from class: ckqo
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 4;
        dqprVarM36.d(true);
        dqogVar36.a = "messages.cloud_sync_id";
        dqprVarM36.i(8500);
        dqogVar36.d = new Supplier() { // from class: ckqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar36.c = new dqps() { // from class: ckqr
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 7;
        dqprVarM37.d(true);
        dqogVar37.a = "messages.rcs_message_id";
        dqprVarM37.f(true);
        dqprVarM37.i(10000);
        dqogVar37.d = new Supplier() { // from class: ckqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar37.c = new dqps() { // from class: ckqt
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqprVarM38.d(true);
        dqogVar38.a = "messages.rcs_message_id_with_text_type";
        dqprVarM38.f(true);
        dqprVarM38.i(41040);
        dqogVar38.d = new Supplier() { // from class: ckqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar38.c = new dqps() { // from class: ckqw
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "messages.etouffee_status";
        dqprVarM39.i(29060);
        dqogVar39.d = new Supplier() { // from class: ckqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar39.c = new dqps() { // from class: ckqy
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "messages.verification_status";
        dqprVarM40.i(29090);
        dqogVar40.d = new Supplier() { // from class: ckqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar40.c = new dqps() { // from class: ckrb
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 1;
        dqogVar41.a = "messages.rcs_ui_status";
        dqprVarM41.i(39000);
        dqogVar41.d = new Supplier() { // from class: ckrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar41.c = new dqps() { // from class: ckrd
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqprVarM42.d(true);
        dqogVar42.a = "messages.is_hidden";
        dqprVarM42.i(30010);
        dqogVar42.d = new Supplier() { // from class: ckre
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar42.c = new dqps() { // from class: ckrf
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 7;
        dqogVar43.a = "messages.rcs_remote_instance";
        dqprVarM43.i(10002);
        dqogVar43.d = new Supplier() { // from class: ckrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar43.c = new dqps() { // from class: ckri
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "messages.rcs_file_transfer_session_id";
        dqprVarM44.i(10004);
        dqogVar44.d = new Supplier() { // from class: ckrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar44.c = new dqps() { // from class: ckrk
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "messages.sms_error_code";
        dqprVarM45.i(9000);
        dqogVar45.d = new Supplier() { // from class: ckrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar45.c = new dqps() { // from class: ckrn
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqogVar46.a = "messages.sms_error_desc_map_name";
        dqprVarM46.i(9000);
        dqogVar46.d = new Supplier() { // from class: ckro
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar46.c = new dqps() { // from class: ckrp
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 4;
        dqogVar47.a = "messages.correlation_id";
        dqprVarM47.i(9010);
        dqogVar47.d = new Supplier() { // from class: ckrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar47.c = new dqps() { // from class: ckrr
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 4;
        dqprVarM48.l(true);
        dqprVarM48.d(true);
        dqogVar48.a = "messages.cms_id";
        dqprVarM48.f(true);
        dqprVarM48.i(31010);
        dqogVar48.d = new Supplier() { // from class: ckrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar48.c = new dqps() { // from class: cksi
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 2;
        dqogVar49.a = "messages.cms_last_mod_seq";
        dqprVarM49.i(37040);
        dqogVar49.d = new Supplier() { // from class: ckst
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar49.c = new dqps() { // from class: ckte
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 4;
        dqprVarM50.d(true);
        dqogVar50.a = "messages.web_id";
        dqprVarM50.i(19020);
        dqogVar50.d = new Supplier() { // from class: cktp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar50.c = new dqps() { // from class: ckua
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqogVar51.a = "messages.usage_stats_logging_id";
        dqprVarM51.i(29100);
        dqogVar51.d = new Supplier() { // from class: ckul
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar51.c = new dqps() { // from class: ckuw
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 1;
        dqogVar52.a = "messages.send_counter";
        dqprVarM52.i(35030);
        dqogVar52.d = new Supplier() { // from class: ckvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar52.c = new dqps() { // from class: ckpi
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 4;
        dqprVarM53.d(true);
        dqogVar53.a = "messages.original_rcs_message_id";
        dqprVarM53.i(35030);
        dqogVar53.d = new Supplier() { // from class: ckqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar53.c = new dqps() { // from class: ckqp
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 5;
        dqogVar54.a = "messages.raw_rcs_message_to_send";
        dqprVarM54.i(60820);
        dqogVar54.d = new Supplier() { // from class: ckra
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar54.c = new dqps() { // from class: ckrl
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 4;
        dqogVar55.a = "messages.custom_delivery_receipt_mime_type";
        dqprVarM55.i(37020);
        dqogVar55.d = new Supplier() { // from class: ckrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar55.c = new dqps() { // from class: ckru
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 5;
        dqogVar56.a = "messages.custom_delivery_receipt_content";
        dqprVarM56.i(37020);
        dqogVar56.d = new Supplier() { // from class: ckrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar56.c = new dqps() { // from class: ckrw
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 1;
        dqogVar57.a = "messages.report_attempt_acounter";
        dqprVarM57.i(37030);
        dqogVar57.d = new Supplier() { // from class: ckry
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar57.c = new dqps() { // from class: ckrz
        };
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.e = 5;
        dqogVar58.a = "messages.custom_headers";
        dqprVarM58.i(45020);
        dqogVar58.d = new Supplier() { // from class: cksb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar58.c = new dqps() { // from class: cksc
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 4;
        dqprVarM59.l(true);
        dqprVarM59.d(true);
        dqogVar59.a = "messages.cms_correlation_id";
        dqprVarM59.f(true);
        dqprVarM59.i(46010);
        dqogVar59.d = new Supplier() { // from class: cksd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar59.c = new dqps() { // from class: ckse
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 1;
        dqprVarM60.d(true);
        dqprVarM60.e(true);
        dqogVar60.b = new Supplier() { // from class: cksf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar60.a = "messages.group_private_participant";
        dqprVarM60.i(48030);
        dqogVar60.d = new Supplier() { // from class: cksg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar60.c = new dqps() { // from class: cksh
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 1;
        dqprVarM61.d(true);
        dqprVarM61.e(true);
        dqogVar61.b = new Supplier() { // from class: cksj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar61.a = "messages.original_message_id";
        dqprVarM61.i(48030);
        dqogVar61.d = new Supplier() { // from class: cksk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar61.c = new dqps() { // from class: cksl
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 2;
        dqprVarM62.d(true);
        dqprVarM62.e(true);
        dqogVar62.b = new Supplier() { // from class: cksn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar62.a = "messages.parent_message_id";
        dqprVarM62.i(60950);
        dqogVar62.d = new Supplier() { // from class: ckso
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar62.c = new dqps() { // from class: cksp
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 1;
        dqogVar63.a = "messages.awaiting_reverse_sync";
        dqprVarM63.i(49060);
        dqogVar63.d = new Supplier() { // from class: cksq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar63.c = new dqps() { // from class: cksr
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 4;
        dqogVar64.a = "messages.old_sms_message_uri";
        dqprVarM64.i(49060);
        dqogVar64.d = new Supplier() { // from class: ckss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar64.c = new dqps() { // from class: cksu
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 4;
        dqprVarM65.l(true);
        dqprVarM65.d(true);
        dqogVar65.a = "messages.draft_id";
        dqprVarM65.f(true);
        dqprVarM65.i(56000);
        dqogVar65.d = new Supplier() { // from class: cksv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar65.c = new dqps() { // from class: cksw
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 1;
        dqogVar66.a = "messages.result_code";
        dqprVarM66.i(58040);
        dqogVar66.d = new Supplier() { // from class: cksx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar66.c = new dqps() { // from class: cksz
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 1;
        dqogVar67.a = "messages.cms_life_cycle";
        dqprVarM67.i(58210);
        dqogVar67.d = new Supplier() { // from class: ckta
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar67.c = new dqps() { // from class: cktb
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 1;
        dqogVar68.a = "messages.mute_priority";
        dqprVarM68.i(60750);
        dqogVar68.d = new Supplier() { // from class: cktc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar68.c = new dqps() { // from class: cktd
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "messages.fallback_reason";
        dqprVarM69.i(58710);
        dqogVar69.d = new Supplier() { // from class: cktf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar69.c = new dqps() { // from class: cktg
        };
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.e = 1;
        dqogVar70.a = "messages.auto_retry_counter";
        dqprVarM70.i(58230);
        dqogVar70.d = new Supplier() { // from class: ckth
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar70.c = new dqps() { // from class: ckti
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.e = 2;
        dqogVar71.a = "messages.can_revoke_before_delivered_with_rcs";
        dqprVarM71.i(58280);
        dqogVar71.d = new Supplier() { // from class: cktj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar71.c = new dqps() { // from class: cktl
        };
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqog dqogVar72 = (dqog) dqprVarM72;
        dqogVar72.e = 5;
        dqogVar72.a = "messages.trace_id";
        dqprVarM72.i(58680);
        dqogVar72.d = new Supplier() { // from class: cktm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar72.c = new dqps() { // from class: cktn
        };
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqog dqogVar73 = (dqog) dqprVarM73;
        dqogVar73.e = 1;
        dqogVar73.a = "messages.outgoing_delivery_report_status";
        dqprVarM73.i(58720);
        dqogVar73.d = new Supplier() { // from class: ckto
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar73.c = new dqps() { // from class: cktq
        };
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqog dqogVar74 = (dqog) dqprVarM74;
        dqogVar74.e = 1;
        dqogVar74.a = "messages.outgoing_read_report_status";
        dqprVarM74.i(58720);
        dqogVar74.d = new Supplier() { // from class: cktr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar74.c = new dqps() { // from class: ckts
        };
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqog dqogVar75 = (dqog) dqprVarM75;
        dqogVar75.e = 1;
        dqogVar75.a = "messages.xms_transport";
        dqprVarM75.i(59310);
        dqogVar75.d = new Supplier() { // from class: cktt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar75.c = new dqps() { // from class: cktu
        };
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqog dqogVar76 = (dqog) dqprVarM76;
        dqogVar76.e = 1;
        dqogVar76.a = "messages.message_original_protocol";
        dqprVarM76.i(59430);
        dqogVar76.d = new Supplier() { // from class: cktv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar76.c = new dqps() { // from class: cktx
        };
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqog dqogVar77 = (dqog) dqprVarM77;
        dqogVar77.e = 4;
        dqprVarM77.l(true);
        dqprVarM77.d(true);
        dqogVar77.a = "messages.satellite_datagram_id";
        dqprVarM77.f(true);
        dqprVarM77.i(59490);
        dqogVar77.d = new Supplier() { // from class: ckty
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar77.c = new dqps() { // from class: cktz
        };
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqog dqogVar78 = (dqog) dqprVarM78;
        dqogVar78.e = 1;
        dqogVar78.a = "messages.encryption_protocol";
        dqprVarM78.i(60190);
        dqogVar78.d = new Supplier() { // from class: ckub
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar78.c = new dqps() { // from class: ckuc
        };
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqog dqogVar79 = (dqog) dqprVarM79;
        dqogVar79.e = 4;
        dqprVarM79.l(true);
        dqprVarM79.d(true);
        dqogVar79.a = "messages.message_persistence_id";
        dqprVarM79.f(true);
        dqprVarM79.i(60370);
        dqogVar79.d = new Supplier() { // from class: ckud
            @Override // java.util.function.Supplier
            public final Object get() {
                return ckvr.b();
            }
        };
        dqogVar79.c = new dqps() { // from class: ckue
        };
        dqprVarM79.a();
    }
}
