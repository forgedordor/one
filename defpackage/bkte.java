package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkte {
    public final bktf a;

    public bkte() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bkpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "conversation_to_participants.conversation_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bkpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bkqc
        };
        this.a = new bktf(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bkqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar2.a = "conversation_to_participants.participant_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bkrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bkrn
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqogVar3.a = "conversation_to_participants.rcs_group_join_status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bkrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bksl
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "conversation_to_participants.last_modified_by_key";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bksx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bkpi
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "participants.lookup_key";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bksh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bkss
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqprVarM6.l(true);
        dqprVarM6.g(true);
        dqprVarM6.d(true);
        dqogVar6.a = "participants._id";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bktd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bkpj
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqprVarM7.d(true);
        dqogVar7.a = "participants.my_identity_token";
        dqprVarM7.i(59930);
        dqogVar7.d = new Supplier() { // from class: bkpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bkpl
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqprVarM8.d(true);
        dqprVarM8.e(true);
        dqogVar8.b = new Supplier() { // from class: bkpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar8.a = "participants.my_identity_token_foreign_key";
        dqprVarM8.i(60160);
        dqogVar8.d = new Supplier() { // from class: bkpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bkpo
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqprVarM9.d(true);
        dqogVar9.a = "participants.sub_id";
        dqprVarM9.f(true);
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bkpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bkpr
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "participants.sim_slot_id";
        dqprVarM10.i(2000);
        dqogVar10.d = new Supplier() { // from class: bkps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bkpu
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqprVarM11.d(true);
        dqogVar11.a = "participants.normalized_destination";
        dqprVarM11.f(true);
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bkpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bkpw
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "participants.send_destination";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: bkpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bkpy
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "participants.display_destination";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bkpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bkqa
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqprVarM14.l(true);
        dqprVarM14.d(true);
        dqogVar14.a = "participants.comparable_destination";
        dqprVarM14.f(true);
        dqprVarM14.i(54040);
        dqogVar14.d = new Supplier() { // from class: bkqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bkqd
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "participants.country_code";
        dqprVarM15.i(54040);
        dqogVar15.d = new Supplier() { // from class: bkqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bkqg
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 2;
        dqprVarM16.l(true);
        dqprVarM16.d(true);
        dqogVar16.a = "participants.recipient_id";
        dqprVarM16.f(true);
        dqprVarM16.i(58090);
        dqogVar16.d = new Supplier() { // from class: bkqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bkqi
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 4;
        dqogVar17.a = "participants.recipient_canonical_address";
        dqprVarM17.i(58090);
        dqogVar17.d = new Supplier() { // from class: bkqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bkqk
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "participants.full_name";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bkql
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bkqm
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 4;
        dqogVar19.a = "participants.first_name";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bkqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bkqq
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "participants.profile_photo_uri";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bkqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bkqs
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 4;
        dqogVar21.a = "participants.contact_photo_uri";
        dqprVarM21.i(59850);
        dqogVar21.d = new Supplier() { // from class: bkqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bkqu
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "participants.contact_id";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: bkqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bkqw
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 1;
        dqogVar23.a = "participants.color_palette_index";
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: bkqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bkqy
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "participants.color_type";
        dqprVarM24.i(1000);
        dqogVar24.d = new Supplier() { // from class: bkqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bkrc
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqogVar25.a = "participants.extended_color";
        dqprVarM25.i(10027);
        dqogVar25.d = new Supplier() { // from class: bkrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bkre
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "participants.blocked";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: bkrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bkrg
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "participants.subscription_name";
        dqprVarM27.i(2000);
        dqogVar27.d = new Supplier() { // from class: bkrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bkri
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 1;
        dqogVar28.a = "participants.subscription_color";
        dqprVarM28.i(2000);
        dqogVar28.d = new Supplier() { // from class: bkrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bkrk
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqogVar29.a = "participants.contact_destination";
        dqprVarM29.i(4000);
        dqogVar29.d = new Supplier() { // from class: bkrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bkro
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "participants.participant_type";
        dqprVarM30.i(12001);
        dqogVar30.d = new Supplier() { // from class: bkrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bkrq
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "participants.video_reachability";
        dqprVarM31.i(13050);
        dqogVar31.d = new Supplier() { // from class: bkrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bkrs
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 4;
        dqogVar32.a = "participants.alias";
        dqprVarM32.i(20060);
        dqogVar32.d = new Supplier() { // from class: bkrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bkru
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "participants.is_spam";
        dqprVarM33.i(24060);
        dqogVar33.d = new Supplier() { // from class: bkrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bkrx
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "participants.is_rcs_available";
        dqprVarM34.i(29030);
        dqogVar34.d = new Supplier() { // from class: bkry
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bksa
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "participants.is_spam_source";
        dqprVarM35.i(30000);
        dqogVar35.d = new Supplier() { // from class: bksb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bksc
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 4;
        dqprVarM36.l(true);
        dqprVarM36.d(true);
        dqogVar36.a = "participants.cms_id";
        dqprVarM36.f(true);
        dqprVarM36.i(31020);
        dqogVar36.d = new Supplier() { // from class: bksd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bkse
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "participants.latest_verification_status";
        dqprVarM37.i(31030);
        dqogVar37.d = new Supplier() { // from class: bksf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bksg
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqogVar38.a = "participants.profile_photo_blob_id";
        dqprVarM38.i(33000);
        dqogVar38.d = new Supplier() { // from class: bksi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bksj
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 5;
        dqogVar39.a = "participants.profile_photo_encryption_key";
        dqprVarM39.i(33060);
        dqogVar39.d = new Supplier() { // from class: bksk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bksm
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "participants.directory_id";
        dqprVarM40.i(35010);
        dqogVar40.d = new Supplier() { // from class: bksn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bkso
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 1;
        dqogVar41.a = "participants.is_check_constraint_enabled_via_phenotype";
        dqprVarM41.i(55010);
        dqogVar41.d = new Supplier() { // from class: bksp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bksq
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "participants.is_valid_phone_number_data";
        dqprVarM42.i(55010);
        dqogVar42.d = new Supplier() { // from class: bksr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bkst
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 2;
        dqprVarM43.d(true);
        dqprVarM43.e(true);
        dqogVar43.b = new Supplier() { // from class: bksu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar43.a = "participants.duplicate_of";
        dqprVarM43.i(58090);
        dqogVar43.d = new Supplier() { // from class: bksv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bksw
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "participants.cms_life_cycle";
        dqprVarM44.i(58210);
        dqogVar44.d = new Supplier() { // from class: bksy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bksz
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "participants.norm_ui_status";
        dqprVarM45.i(58620);
        dqogVar45.d = new Supplier() { // from class: bkta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bktb
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqogVar46.a = "participants.last_modified_by_key";
        dqprVarM46.i(59440);
        dqogVar46.d = new Supplier() { // from class: bktc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bkpd
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqogVar47.a = "participants.name_source";
        dqprVarM47.i(59550);
        dqogVar47.d = new Supplier() { // from class: bkpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bkpf
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 1;
        dqogVar48.a = "participants.photo_source";
        dqprVarM48.i(59550);
        dqogVar48.d = new Supplier() { // from class: bkpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: bkph
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 1;
        dqogVar49.a = "participants.profile_photo_user_preference";
        dqprVarM49.i(60060);
        dqogVar49.d = new Supplier() { // from class: bkpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bkqe
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 5;
        dqogVar50.a = "participants.contact_metadata";
        dqprVarM50.i(60070);
        dqogVar50.d = new Supplier() { // from class: bkqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: bkra
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqprVarM51.d(true);
        dqogVar51.a = "participants.is_enterprise_contact";
        dqprVarM51.i(60640);
        dqogVar51.d = new Supplier() { // from class: bkrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bktl.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: bkrw
        };
        dqprVarM51.a();
    }
}
