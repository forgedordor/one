package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkor {
    public final bkos a;

    public bkor() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "participants._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bkkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bklb
        };
        this.a = new bkos(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "participants.my_identity_token";
        dqprVarM2.i(59930);
        dqogVar2.d = new Supplier() { // from class: bkln
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bklz
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bkml
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar3.a = "participants.my_identity_token_foreign_key";
        dqprVarM3.i(60160);
        dqogVar3.d = new Supplier() { // from class: bkmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bknj
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "participants.sub_id";
        dqprVarM4.f(true);
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bknv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bkoh
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "participants.sim_slot_id";
        dqprVarM5.i(2000);
        dqogVar5.d = new Supplier() { // from class: bkop
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bklk
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "participants.normalized_destination";
        dqprVarM6.f(true);
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bklv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bkmg
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "participants.send_destination";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bkmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bknc
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "participants.display_destination";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bknn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bkny
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqprVarM9.l(true);
        dqprVarM9.d(true);
        dqogVar9.a = "participants.comparable_destination";
        dqprVarM9.f(true);
        dqprVarM9.i(54040);
        dqogVar9.d = new Supplier() { // from class: bkoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bkoq
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "participants.country_code";
        dqprVarM10.i(54040);
        dqogVar10.d = new Supplier() { // from class: bkla
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bklc
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqprVarM11.l(true);
        dqprVarM11.d(true);
        dqogVar11.a = "participants.recipient_id";
        dqprVarM11.f(true);
        dqprVarM11.i(58090);
        dqogVar11.d = new Supplier() { // from class: bkld
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bkle
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "participants.recipient_canonical_address";
        dqprVarM12.i(58090);
        dqogVar12.d = new Supplier() { // from class: bklf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bklg
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "participants.full_name";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bklh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bkli
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqogVar14.a = "participants.first_name";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bklj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bkll
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "participants.profile_photo_uri";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bklm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bklo
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqogVar16.a = "participants.contact_photo_uri";
        dqprVarM16.i(59850);
        dqogVar16.d = new Supplier() { // from class: bklp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bklq
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "participants.contact_id";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bklr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bkls
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "participants.lookup_key";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bklt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bklu
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "participants.color_palette_index";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bklw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bklx
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqogVar20.a = "participants.color_type";
        dqprVarM20.i(1000);
        dqogVar20.d = new Supplier() { // from class: bkly
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bkma
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "participants.extended_color";
        dqprVarM21.i(10027);
        dqogVar21.d = new Supplier() { // from class: bkmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bkmc
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "participants.blocked";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: bkmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bkme
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "participants.subscription_name";
        dqprVarM23.i(2000);
        dqogVar23.d = new Supplier() { // from class: bkmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bkmh
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "participants.subscription_color";
        dqprVarM24.i(2000);
        dqogVar24.d = new Supplier() { // from class: bkmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bkmj
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqogVar25.a = "participants.contact_destination";
        dqprVarM25.i(4000);
        dqogVar25.d = new Supplier() { // from class: bkmk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bkmm
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "participants.participant_type";
        dqprVarM26.i(12001);
        dqogVar26.d = new Supplier() { // from class: bkmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bkmo
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 1;
        dqogVar27.a = "participants.video_reachability";
        dqprVarM27.i(13050);
        dqogVar27.d = new Supplier() { // from class: bkmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bkmq
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "participants.alias";
        dqprVarM28.i(20060);
        dqogVar28.d = new Supplier() { // from class: bkms
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bkmt
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 1;
        dqogVar29.a = "participants.is_spam";
        dqprVarM29.i(24060);
        dqogVar29.d = new Supplier() { // from class: bkmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bkmv
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "participants.is_rcs_available";
        dqprVarM30.i(29030);
        dqogVar30.d = new Supplier() { // from class: bkmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bkmy
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "participants.is_spam_source";
        dqprVarM31.i(30000);
        dqogVar31.d = new Supplier() { // from class: bkmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bkna
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 4;
        dqprVarM32.l(true);
        dqprVarM32.d(true);
        dqogVar32.a = "participants.cms_id";
        dqprVarM32.f(true);
        dqprVarM32.i(31020);
        dqogVar32.d = new Supplier() { // from class: bknb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bknd
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "participants.latest_verification_status";
        dqprVarM33.i(31030);
        dqogVar33.d = new Supplier() { // from class: bkne
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bknf
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 4;
        dqogVar34.a = "participants.profile_photo_blob_id";
        dqprVarM34.i(33000);
        dqogVar34.d = new Supplier() { // from class: bkng
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bknh
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 5;
        dqogVar35.a = "participants.profile_photo_encryption_key";
        dqprVarM35.i(33060);
        dqogVar35.d = new Supplier() { // from class: bkni
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bknk
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "participants.directory_id";
        dqprVarM36.i(35010);
        dqogVar36.d = new Supplier() { // from class: bknl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bknm
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "participants.is_check_constraint_enabled_via_phenotype";
        dqprVarM37.i(55010);
        dqogVar37.d = new Supplier() { // from class: bkno
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bknp
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 1;
        dqogVar38.a = "participants.is_valid_phone_number_data";
        dqprVarM38.i(55010);
        dqogVar38.d = new Supplier() { // from class: bknq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bknr
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 2;
        dqprVarM39.d(true);
        dqprVarM39.e(true);
        dqogVar39.b = new Supplier() { // from class: bkns
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar39.a = "participants.duplicate_of";
        dqprVarM39.i(58090);
        dqogVar39.d = new Supplier() { // from class: bknt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bknu
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "participants.cms_life_cycle";
        dqprVarM40.i(58210);
        dqogVar40.d = new Supplier() { // from class: bknw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bknx
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 1;
        dqogVar41.a = "participants.norm_ui_status";
        dqprVarM41.i(58620);
        dqogVar41.d = new Supplier() { // from class: bknz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bkoa
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 4;
        dqogVar42.a = "participants.last_modified_by_key";
        dqprVarM42.i(59440);
        dqogVar42.d = new Supplier() { // from class: bkob
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bkoc
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "participants.name_source";
        dqprVarM43.i(59550);
        dqogVar43.d = new Supplier() { // from class: bkod
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bkoe
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "participants.photo_source";
        dqprVarM44.i(59550);
        dqogVar44.d = new Supplier() { // from class: bkof
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bkog
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "participants.profile_photo_user_preference";
        dqprVarM45.i(60060);
        dqogVar45.d = new Supplier() { // from class: bkoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bkok
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 5;
        dqogVar46.a = "participants.contact_metadata";
        dqprVarM46.i(60070);
        dqogVar46.d = new Supplier() { // from class: bkol
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bkom
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqprVarM47.d(true);
        dqogVar47.a = "participants.is_enterprise_contact";
        dqprVarM47.i(60640);
        dqogVar47.d = new Supplier() { // from class: bkon
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bkoo
        };
        dqprVarM47.a();
    }
}
