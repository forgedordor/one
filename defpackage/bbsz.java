package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbsz {
    public final bbta a;

    public bbsz() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversations._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bbmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bbrt
        };
        this.a = new bbta(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqogVar2.a = "conversations.sms_thread_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bbsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bbsr
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "conversations.name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bbna
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bbnm
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "conversations.name_is_automatic";
        dqprVarM4.i(10012);
        dqogVar4.d = new Supplier() { // from class: bbny
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bbok
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "conversations.subtitle";
        dqprVarM5.i(59760);
        dqogVar5.d = new Supplier() { // from class: bbow
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bbpi
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "conversations.latest_message_id";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bbnr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bbpr
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "conversations.snippet_text";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bbqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bbqp
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "conversations.subject_text";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bbrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bbrn
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "conversations.preview_uri";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bbro
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bbrp
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "conversations.preview_content_type";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bbrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bbrs
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqogVar11.a = "conversations.show_draft";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bbru
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bbrv
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "conversations.draft_snippet_text";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: bbrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bbrx
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "conversations.draft_subject_text";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bbry
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bbrz
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqogVar14.a = "conversations.draft_preview_uri";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bbsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bbsb
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "conversations.draft_preview_content_type";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bbsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bbse
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqogVar16.a = "conversations.etouffee_default";
        dqprVarM16.i(29060);
        dqogVar16.d = new Supplier() { // from class: bbsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bbsh
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqprVarM17.d(true);
        dqogVar17.a = "conversations.archive_status";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bbsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bbsj
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqprVarM18.d(true);
        dqogVar18.a = "conversations.sort_timestamp";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bbsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bbsl
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "conversations.last_read_timestamp";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bbsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bbso
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "conversations.icon";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bbsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bbsq
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "conversations.participant_contact_id";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: bbss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bbst
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "conversations.normalized_participant_contact_id";
        dqprVarM22.i(58090);
        dqogVar22.d = new Supplier() { // from class: bbsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bbsv
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "conversations.participant_lookup_key";
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: bbsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bbsx
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 4;
        dqogVar24.a = "conversations.normalized_participant_lookup_key";
        dqprVarM24.i(58090);
        dqogVar24.d = new Supplier() { // from class: bbmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bbmx
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqprVarM25.d(true);
        dqogVar25.a = "conversations.participant_normalized_destination";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: bbmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bbmz
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqprVarM26.l(true);
        dqprVarM26.d(true);
        dqogVar26.a = "conversations.participant_comparable_destination";
        dqprVarM26.f(true);
        dqprVarM26.i(58090);
        dqogVar26.d = new Supplier() { // from class: bbnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bbnc
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "conversations.current_self_id";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: bbnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bbne
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "conversations.current_my_identity";
        dqprVarM28.i(59810);
        dqogVar28.d = new Supplier() { // from class: bbnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bbnh
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqprVarM29.d(true);
        dqprVarM29.e(true);
        dqogVar29.b = new Supplier() { // from class: bbni
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar29.a = "conversations.current_my_identity_foreign_key";
        dqprVarM29.i(60160);
        dqogVar29.d = new Supplier() { // from class: bbnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bbnk
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 4;
        dqprVarM30.d(true);
        dqprVarM30.e(true);
        dqogVar30.b = new Supplier() { // from class: bbnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.b.a;
            }
        };
        dqogVar30.a = "conversations.destination_token";
        dqprVarM30.i(60360);
        dqogVar30.d = new Supplier() { // from class: bbnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bbno
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "conversations.participant_count";
        dqprVarM31.i(-1);
        dqogVar31.d = new Supplier() { // from class: bbnp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bbnq
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "conversations.notification_enabled";
        dqprVarM32.i(-1);
        dqogVar32.d = new Supplier() { // from class: bbns
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bbnt
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 4;
        dqogVar33.a = "conversations.notification_sound_uri";
        dqprVarM33.i(-1);
        dqogVar33.d = new Supplier() { // from class: bbnu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bbnv
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "conversations.notification_vibration";
        dqprVarM34.i(-1);
        dqogVar34.d = new Supplier() { // from class: bbnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bbnx
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "conversations.include_email_addr";
        dqprVarM35.i(-1);
        dqogVar35.d = new Supplier() { // from class: bbnz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bboa
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 4;
        dqogVar36.a = "conversations.sms_service_center";
        dqprVarM36.i(-1);
        dqogVar36.d = new Supplier() { // from class: bbob
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bbod
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 4;
        dqogVar37.a = "conversations.participant_id_list";
        dqprVarM37.i(8500);
        dqogVar37.d = new Supplier() { // from class: bboe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bbof
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqprVarM38.l(true);
        dqprVarM38.d(true);
        dqogVar38.a = "conversations.normalized_participant_id_list";
        dqprVarM38.f(true);
        dqprVarM38.i(58090);
        dqogVar38.d = new Supplier() { // from class: bbog
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bboh
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "conversations.source_type";
        dqprVarM39.i(8500);
        dqogVar39.d = new Supplier() { // from class: bboi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bboj
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqprVarM40.d(true);
        dqogVar40.a = "conversations.rcs_session_id";
        dqprVarM40.i(10000);
        dqogVar40.d = new Supplier() { // from class: bbol
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bbom
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 1;
        dqogVar41.a = "conversations.join_state";
        dqprVarM41.i(10006);
        dqogVar41.d = new Supplier() { // from class: bboo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bbop
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "conversations.conv_type";
        dqprVarM42.i(10007);
        dqogVar42.d = new Supplier() { // from class: bboq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bbor
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "conversations.send_mode";
        dqprVarM43.i(10016);
        dqogVar43.d = new Supplier() { // from class: bbos
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bbot
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "conversations.IS_ENTERPRISE";
        dqprVarM44.i(10018);
        dqogVar44.d = new Supplier() { // from class: bbou
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bbov
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "conversations.has_ea2p_bot_recipient";
        dqprVarM45.i(12001);
        dqogVar45.d = new Supplier() { // from class: bbox
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bboz
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 1;
        dqogVar46.a = "conversations.last_interactive_event_timestamp";
        dqprVarM46.i(15000);
        dqogVar46.d = new Supplier() { // from class: bbpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bbpb
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 4;
        dqogVar47.a = "conversations.participant_display_destination";
        dqprVarM47.i(15010);
        dqogVar47.d = new Supplier() { // from class: bbpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bbpd
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 4;
        dqogVar48.a = "conversations.normalized_participant_display_destination";
        dqprVarM48.i(58090);
        dqogVar48.d = new Supplier() { // from class: bbpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: bbpf
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 1;
        dqogVar49.a = "conversations.spam_warning_dismiss_status";
        dqprVarM49.i(23000);
        dqogVar49.d = new Supplier() { // from class: bbpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bbph
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 1;
        dqogVar50.a = "conversations.open_count";
        dqprVarM50.i(26020);
        dqogVar50.d = new Supplier() { // from class: bbpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: bbpz
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqogVar51.a = "conversations.last_logged_scooby_metadata_timestamp";
        dqprVarM51.i(28010);
        dqogVar51.d = new Supplier() { // from class: bbqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: bbqv
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 1;
        dqprVarM52.d(true);
        dqogVar52.a = "conversations.delete_timestamp";
        dqprVarM52.i(29020);
        dqogVar52.d = new Supplier() { // from class: bbrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: bbrr
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 4;
        dqprVarM53.l(true);
        dqprVarM53.d(true);
        dqogVar53.a = "conversations.cms_id";
        dqprVarM53.f(true);
        dqprVarM53.i(32000);
        dqogVar53.d = new Supplier() { // from class: bbsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: bbsn
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 4;
        dqprVarM54.d(true);
        dqogVar54.a = "conversations.rcs_group_id";
        dqprVarM54.i(40050);
        dqogVar54.d = new Supplier() { // from class: bbsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: bbng
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 4;
        dqogVar55.a = "conversations.rcs_conference_uri";
        dqprVarM55.i(40050);
        dqogVar55.d = new Supplier() { // from class: bboc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar55.c = new dqps() { // from class: bbon
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 5;
        dqogVar56.a = "conversations.tachygram_group_routing_info_token";
        dqprVarM56.i(58120);
        dqogVar56.d = new Supplier() { // from class: bboy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar56.c = new dqps() { // from class: bbpj
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 1;
        dqogVar57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        dqprVarM57.i(53030);
        dqogVar57.d = new Supplier() { // from class: bbpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar57.c = new dqps() { // from class: bbpl
        };
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.e = 2;
        dqogVar58.a = "conversations.rcs_subject_change_timestamp_ms";
        dqprVarM58.i(46050);
        dqogVar58.d = new Supplier() { // from class: bbpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar58.c = new dqps() { // from class: bbpn
        };
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 1;
        dqogVar59.a = "conversations.rcs_session_allows_revocation";
        dqprVarM59.i(48040);
        dqogVar59.d = new Supplier() { // from class: bbpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar59.c = new dqps() { // from class: bbpq
        };
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 2;
        dqogVar60.a = "conversations.rcs_group_capabilities";
        dqprVarM60.i(49020);
        dqogVar60.d = new Supplier() { // from class: bbps
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar60.c = new dqps() { // from class: bbpt
        };
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 1;
        dqogVar61.a = "conversations.awaiting_reverse_sync";
        dqprVarM61.i(49060);
        dqogVar61.d = new Supplier() { // from class: bbpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar61.c = new dqps() { // from class: bbpv
        };
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 2;
        dqprVarM62.d(true);
        dqprVarM62.e(true);
        dqogVar62.b = new Supplier() { // from class: bbpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar62.a = "conversations.duplicate_of";
        dqprVarM62.i(58090);
        dqogVar62.d = new Supplier() { // from class: bbpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar62.c = new dqps() { // from class: bbpy
        };
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 2;
        dqprVarM63.d(true);
        dqprVarM63.e(true);
        dqogVar63.b = new Supplier() { // from class: bbqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar63.a = "conversations.new_duplicate_of";
        dqprVarM63.i(59130);
        dqogVar63.d = new Supplier() { // from class: bbqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar63.c = new dqps() { // from class: bbqc
        };
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 1;
        dqogVar64.a = "conversations.error_state";
        dqprVarM64.i(58140);
        dqogVar64.d = new Supplier() { // from class: bbqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar64.c = new dqps() { // from class: bbqf
        };
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 1;
        dqogVar65.a = "conversations.cms_life_cycle";
        dqprVarM65.i(58210);
        dqogVar65.d = new Supplier() { // from class: bbqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar65.c = new dqps() { // from class: bbqh
        };
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 4;
        dqogVar66.a = "conversations.rcs_group_self_msisdn";
        dqprVarM66.i(58540);
        dqogVar66.d = new Supplier() { // from class: bbqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar66.c = new dqps() { // from class: bbqj
        };
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 2;
        dqogVar67.a = "conversations.recipient_offline_timestamp_ms";
        dqprVarM67.i(58750);
        dqogVar67.d = new Supplier() { // from class: bbql
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar67.c = new dqps() { // from class: bbqm
        };
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 2;
        dqogVar68.a = "conversations.rcs_group_last_sync_timestamp";
        dqprVarM68.i(58910);
        dqogVar68.d = new Supplier() { // from class: bbqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar68.c = new dqps() { // from class: bbqo
        };
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "conversations.has_been_e2ee";
        dqprVarM69.i(59210);
        dqogVar69.d = new Supplier() { // from class: bbqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar69.c = new dqps() { // from class: bbqr
        };
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.e = 1;
        dqogVar70.a = "conversations.marked_as_unread";
        dqprVarM70.i(59220);
        dqogVar70.d = new Supplier() { // from class: bbqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar70.c = new dqps() { // from class: bbqt
        };
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqog dqogVar71 = (dqog) dqprVarM71;
        dqogVar71.e = 5;
        dqogVar71.a = "conversations.custom_theme";
        dqprVarM71.i(59820);
        dqogVar71.d = new Supplier() { // from class: bbqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar71.c = new dqps() { // from class: bbqw
        };
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqog dqogVar72 = (dqog) dqprVarM72;
        dqogVar72.e = 2;
        dqogVar72.a = "conversations.mms_group_upgrade_status";
        dqprVarM72.i(60050);
        dqogVar72.d = new Supplier() { // from class: bbqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar72.c = new dqps() { // from class: bbqy
        };
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqog dqogVar73 = (dqog) dqprVarM73;
        dqogVar73.e = 2;
        dqogVar73.a = "conversations.mms_group_upgrade_retries";
        dqprVarM73.i(60050);
        dqogVar73.d = new Supplier() { // from class: bbqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar73.c = new dqps() { // from class: bbra
        };
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqog dqogVar74 = (dqog) dqprVarM74;
        dqogVar74.e = 2;
        dqogVar74.a = "conversations.encryption_protocol";
        dqprVarM74.i(60180);
        dqogVar74.d = new Supplier() { // from class: bbrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar74.c = new dqps() { // from class: bbrd
        };
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqog dqogVar75 = (dqog) dqprVarM75;
        dqogVar75.e = 4;
        dqprVarM75.d(true);
        dqogVar75.a = "conversations.encryption_id";
        dqprVarM75.i(60210);
        dqogVar75.d = new Supplier() { // from class: bbre
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar75.c = new dqps() { // from class: bbrf
        };
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqog dqogVar76 = (dqog) dqprVarM76;
        dqogVar76.e = 4;
        dqprVarM76.l(true);
        dqprVarM76.d(true);
        dqogVar76.a = "conversations.cms_correlation_id";
        dqprVarM76.f(true);
        dqprVarM76.i(60250);
        dqogVar76.d = new Supplier() { // from class: bbrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar76.c = new dqps() { // from class: bbri
        };
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqog dqogVar77 = (dqog) dqprVarM77;
        dqogVar77.e = 4;
        dqogVar77.a = "conversations.rcs_group_icon_url";
        dqprVarM77.i(60590);
        dqogVar77.d = new Supplier() { // from class: bbrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar77.c = new dqps() { // from class: bbrk
        };
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqog dqogVar78 = (dqog) dqprVarM78;
        dqogVar78.e = 2;
        dqogVar78.a = "conversations.unread_count";
        dqprVarM78.i(60740);
        dqogVar78.d = new Supplier() { // from class: bbrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dqogVar78.c = new dqps() { // from class: bbrm
        };
        dqprVarM78.a();
    }
}
