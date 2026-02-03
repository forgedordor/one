package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxk {
    public static final String[] a = {"user_refs_concat_view.message_id_user_references", "user_refs_concat_view.participant_id_user_references", "user_refs_concat_view.user_ref_datetime_user_references", "user_refs_concat_view.user_references__ROWID_user_references", "user_refs_concat_view.user_ref_display_name", "user_refs_concat_view.user_ref_profile_photo_uri", "user_refs_concat_view.user_ref_full_name", "user_refs_concat_view.user_ref_lookup_key", "user_refs_concat_view.normalized_destination_participants", "user_refs_concat_view.color_palette_index_participants", "user_refs_concat_view.color_type_participants", "user_refs_concat_view.extended_color_participants", "user_refs_concat_view.participants__ROWID_participants"};

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("user_refs_concat_view.user_ref_display_name", 0);
        ekgiVar.i("user_refs_concat_view.user_ref_profile_photo_uri", 0);
        ekgiVar.i("user_refs_concat_view.user_ref_full_name", 0);
        ekgiVar.i("user_refs_concat_view.user_ref_lookup_key", 0);
        ekgiVar.i("user_refs_concat_view.color_type_participants", 1000);
        ekgiVar.i("user_refs_concat_view.extended_color_participants", 10027);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.c();
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: busv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "user_refs_concat_view.message_id_user_references";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buui
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar.c = new dqps() { // from class: buuv
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: buvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar2.a = "user_refs_concat_view.participant_id_user_references";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: buvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buwf
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "user_refs_concat_view.user_ref_datetime_user_references";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: buwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: buxd
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 8;
        dqogVar4.a = "user_refs_concat_view.user_references__ROWID_user_references";
        dqprVarM4.i(0);
        dqogVar4.d = new Supplier() { // from class: butc
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: buto
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.l(true);
        dqprVarM5.g(true);
        dqprVarM5.d(true);
        dqogVar5.a = "user_refs_concat_view._id_user_references";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: butp
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: butz
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 8;
        dqogVar6.a = "user_refs_concat_view.user_ref_display_name";
        dqprVarM6.i(0);
        dqogVar6.d = new Supplier() { // from class: buua
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: buub
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 8;
        dqogVar7.a = "user_refs_concat_view.user_ref_profile_photo_uri";
        dqprVarM7.i(0);
        dqogVar7.d = new Supplier() { // from class: buuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: buud
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 8;
        dqogVar8.a = "user_refs_concat_view.user_ref_full_name";
        dqprVarM8.i(0);
        dqogVar8.d = new Supplier() { // from class: buue
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: buuf
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 8;
        dqogVar9.a = "user_refs_concat_view.user_ref_lookup_key";
        dqprVarM9.i(0);
        dqogVar9.d = new Supplier() { // from class: buug
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: buuh
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqprVarM10.d(true);
        dqogVar10.a = "user_refs_concat_view.normalized_destination_participants";
        dqprVarM10.f(true);
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: buuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: buul
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqogVar11.a = "user_refs_concat_view.color_palette_index_participants";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: buum
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: buun
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 1;
        dqogVar12.a = "user_refs_concat_view.color_type_participants";
        dqprVarM12.i(1000);
        dqogVar12.d = new Supplier() { // from class: buuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: buup
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqogVar13.a = "user_refs_concat_view.extended_color_participants";
        dqprVarM13.i(10027);
        dqogVar13.d = new Supplier() { // from class: buuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: buur
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 8;
        dqogVar14.a = "user_refs_concat_view.participants__ROWID_participants";
        dqprVarM14.i(0);
        dqogVar14.d = new Supplier() { // from class: buus
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: buut
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 2;
        dqprVarM15.l(true);
        dqprVarM15.g(true);
        dqprVarM15.d(true);
        dqogVar15.a = "user_refs_concat_view._id_participants";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: buuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: buux
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqprVarM16.d(true);
        dqogVar16.a = "user_refs_concat_view.my_identity_token_participants";
        dqprVarM16.i(59930);
        dqogVar16.d = new Supplier() { // from class: buuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: buuz
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 4;
        dqprVarM17.d(true);
        dqprVarM17.e(true);
        dqogVar17.b = new Supplier() { // from class: buva
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar17.a = "user_refs_concat_view.my_identity_token_foreign_key_participants";
        dqprVarM17.i(60160);
        dqogVar17.d = new Supplier() { // from class: buvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: buvc
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqprVarM18.d(true);
        dqogVar18.a = "user_refs_concat_view.sub_id_participants";
        dqprVarM18.f(true);
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: buvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: buve
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "user_refs_concat_view.sim_slot_id_participants";
        dqprVarM19.i(2000);
        dqogVar19.d = new Supplier() { // from class: buvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: buvi
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "user_refs_concat_view.send_destination_participants";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: buvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: buvk
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 4;
        dqogVar21.a = "user_refs_concat_view.display_destination_participants";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: buvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: buvm
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 4;
        dqprVarM22.l(true);
        dqprVarM22.d(true);
        dqogVar22.a = "user_refs_concat_view.comparable_destination_participants";
        dqprVarM22.f(true);
        dqprVarM22.i(54040);
        dqogVar22.d = new Supplier() { // from class: buvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: buvo
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "user_refs_concat_view.country_code_participants";
        dqprVarM23.i(54040);
        dqogVar23.d = new Supplier() { // from class: buvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: buvr
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 2;
        dqprVarM24.l(true);
        dqprVarM24.d(true);
        dqogVar24.a = "user_refs_concat_view.recipient_id_participants";
        dqprVarM24.f(true);
        dqprVarM24.i(58090);
        dqogVar24.d = new Supplier() { // from class: buvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: buvu
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqogVar25.a = "user_refs_concat_view.recipient_canonical_address_participants";
        dqprVarM25.i(58090);
        dqogVar25.d = new Supplier() { // from class: buvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: buvw
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqogVar26.a = "user_refs_concat_view.full_name_participants";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: buvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: buvy
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "user_refs_concat_view.first_name_participants";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: buvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: buwa
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "user_refs_concat_view.profile_photo_uri_participants";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: buwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: buwd
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqogVar29.a = "user_refs_concat_view.contact_photo_uri_participants";
        dqprVarM29.i(59850);
        dqogVar29.d = new Supplier() { // from class: buwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: buwg
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "user_refs_concat_view.contact_id_participants";
        dqprVarM30.i(-1);
        dqogVar30.d = new Supplier() { // from class: buwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: buwi
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 4;
        dqogVar31.a = "user_refs_concat_view.lookup_key_participants";
        dqprVarM31.i(-1);
        dqogVar31.d = new Supplier() { // from class: buwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: buwk
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "user_refs_concat_view.blocked_participants";
        dqprVarM32.i(-1);
        dqogVar32.d = new Supplier() { // from class: buwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: buwn
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 4;
        dqogVar33.a = "user_refs_concat_view.subscription_name_participants";
        dqprVarM33.i(2000);
        dqogVar33.d = new Supplier() { // from class: buwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: buwp
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 1;
        dqogVar34.a = "user_refs_concat_view.subscription_color_participants";
        dqprVarM34.i(2000);
        dqogVar34.d = new Supplier() { // from class: buwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: buws
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 4;
        dqogVar35.a = "user_refs_concat_view.contact_destination_participants";
        dqprVarM35.i(4000);
        dqogVar35.d = new Supplier() { // from class: buwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: buwu
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "user_refs_concat_view.participant_type_participants";
        dqprVarM36.i(12001);
        dqogVar36.d = new Supplier() { // from class: buwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: buww
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "user_refs_concat_view.video_reachability_participants";
        dqprVarM37.i(13050);
        dqogVar37.d = new Supplier() { // from class: buwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: buwz
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqogVar38.a = "user_refs_concat_view.alias_participants";
        dqprVarM38.i(20060);
        dqogVar38.d = new Supplier() { // from class: buxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: buxb
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "user_refs_concat_view.is_spam_participants";
        dqprVarM39.i(24060);
        dqogVar39.d = new Supplier() { // from class: buxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: buxe
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "user_refs_concat_view.is_rcs_available_participants";
        dqprVarM40.i(29030);
        dqogVar40.d = new Supplier() { // from class: buxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: buxg
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 1;
        dqogVar41.a = "user_refs_concat_view.is_spam_source_participants";
        dqprVarM41.i(30000);
        dqogVar41.d = new Supplier() { // from class: buxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: busw
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 4;
        dqprVarM42.l(true);
        dqprVarM42.d(true);
        dqogVar42.a = "user_refs_concat_view.cms_id_participants";
        dqprVarM42.f(true);
        dqprVarM42.i(31020);
        dqogVar42.d = new Supplier() { // from class: busx
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: busy
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "user_refs_concat_view.latest_verification_status_participants";
        dqprVarM43.i(31030);
        dqogVar43.d = new Supplier() { // from class: busz
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: buta
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 4;
        dqogVar44.a = "user_refs_concat_view.profile_photo_blob_id_participants";
        dqprVarM44.i(33000);
        dqogVar44.d = new Supplier() { // from class: butb
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: butd
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 5;
        dqogVar45.a = "user_refs_concat_view.profile_photo_encryption_key_participants";
        dqprVarM45.i(33060);
        dqogVar45.d = new Supplier() { // from class: bute
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: butf
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 1;
        dqogVar46.a = "user_refs_concat_view.directory_id_participants";
        dqprVarM46.i(35010);
        dqogVar46.d = new Supplier() { // from class: buth
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: buti
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqogVar47.a = "user_refs_concat_view.is_check_constraint_enabled_via_phenotype_participants";
        dqprVarM47.i(55010);
        dqogVar47.d = new Supplier() { // from class: butj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: butk
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 1;
        dqogVar48.a = "user_refs_concat_view.is_valid_phone_number_data_participants";
        dqprVarM48.i(55010);
        dqogVar48.d = new Supplier() { // from class: butl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: butm
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 2;
        dqprVarM49.d(true);
        dqprVarM49.e(true);
        dqogVar49.b = new Supplier() { // from class: butn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar49.a = "user_refs_concat_view.duplicate_of_participants";
        dqprVarM49.i(58090);
        dqogVar49.d = new Supplier() { // from class: buty
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: buuj
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 1;
        dqogVar50.a = "user_refs_concat_view.cms_life_cycle_participants";
        dqprVarM50.i(58210);
        dqogVar50.d = new Supplier() { // from class: buuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: buvf
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqogVar51.a = "user_refs_concat_view.norm_ui_status_participants";
        dqprVarM51.i(58620);
        dqogVar51.d = new Supplier() { // from class: buvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: buwb
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 4;
        dqogVar52.a = "user_refs_concat_view.last_modified_by_key_participants";
        dqprVarM52.i(59440);
        dqogVar52.d = new Supplier() { // from class: buwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: buwx
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 1;
        dqogVar53.a = "user_refs_concat_view.name_source_participants";
        dqprVarM53.i(59550);
        dqogVar53.d = new Supplier() { // from class: buxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: butg
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqogVar54.a = "user_refs_concat_view.photo_source_participants";
        dqprVarM54.i(59550);
        dqogVar54.d = new Supplier() { // from class: butq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: butr
        };
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 1;
        dqogVar55.a = "user_refs_concat_view.profile_photo_user_preference_participants";
        dqprVarM55.i(60060);
        dqogVar55.d = new Supplier() { // from class: buts
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar55.c = new dqps() { // from class: butt
        };
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 5;
        dqogVar56.a = "user_refs_concat_view.contact_metadata_participants";
        dqprVarM56.i(60070);
        dqogVar56.d = new Supplier() { // from class: butu
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar56.c = new dqps() { // from class: butv
        };
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 1;
        dqprVarM57.d(true);
        dqogVar57.a = "user_refs_concat_view.is_enterprise_contact_participants";
        dqprVarM57.i(60640);
        dqogVar57.d = new Supplier() { // from class: butw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buxk.a();
            }
        };
        dqogVar57.c = new dqps() { // from class: butx
        };
        dqprVarM57.a();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static dqxa b() {
        return a().M();
    }
}
