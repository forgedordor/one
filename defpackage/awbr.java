package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbr {
    public final awbs a;
    public final awbs b;

    public awbr() {
        dqpr dqprVarM = dqpt.m();
        dqprVarM.m(2);
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.b("conversations._id");
        dqprVarM.i(-1);
        dqprVarM.c(new Supplier() { // from class: avrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM.j(new dqps() { // from class: avru
        });
        this.a = new awbs(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqprVarM2.m(1);
        dqprVarM2.b("conversations.conv_type");
        dqprVarM2.i(10007);
        dqprVarM2.c(new Supplier() { // from class: avvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM2.j(new dqps() { // from class: avvs
        });
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqprVarM3.m(1);
        dqprVarM3.b("conversations.has_ea2p_bot_recipient");
        dqprVarM3.i(12001);
        dqprVarM3.c(new Supplier() { // from class: avwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM3.j(new dqps() { // from class: avwq
        });
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqprVarM4.m(1);
        dqprVarM4.d(true);
        dqprVarM4.b("conversations.sms_thread_id");
        dqprVarM4.i(-1);
        dqprVarM4.c(new Supplier() { // from class: avxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM4.j(new dqps() { // from class: avxo
        });
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqprVarM5.m(4);
        dqprVarM5.b("conversations.name");
        dqprVarM5.i(-1);
        dqprVarM5.c(new Supplier() { // from class: avya
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM5.j(new dqps() { // from class: avym
        });
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqprVarM6.m(2);
        dqprVarM6.b("conversations.name_is_automatic");
        dqprVarM6.i(10012);
        dqprVarM6.c(new Supplier() { // from class: avsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM6.j(new dqps() { // from class: avwv
        });
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqprVarM7.m(4);
        dqprVarM7.b("conversations.subtitle");
        dqprVarM7.i(59760);
        dqprVarM7.c(new Supplier() { // from class: avyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM7.j(new dqps() { // from class: avzh
        });
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqprVarM8.m(1);
        dqprVarM8.b("conversations.latest_message_id");
        dqprVarM8.i(-1);
        dqprVarM8.c(new Supplier() { // from class: avzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM8.j(new dqps() { // from class: awaf
        });
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqprVarM9.m(4);
        dqprVarM9.b("conversations.snippet_text");
        dqprVarM9.i(-1);
        dqprVarM9.c(new Supplier() { // from class: awar
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM9.j(new dqps() { // from class: awbd
        });
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqprVarM10.m(4);
        dqprVarM10.b("conversations.subject_text");
        dqprVarM10.i(-1);
        dqprVarM10.c(new Supplier() { // from class: awbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM10.j(new dqps() { // from class: avrt
        });
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqprVarM11.m(4);
        dqprVarM11.b("conversations.preview_uri");
        dqprVarM11.i(-1);
        dqprVarM11.c(new Supplier() { // from class: avsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM11.j(new dqps() { // from class: avss
        });
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqprVarM12.m(4);
        dqprVarM12.b("conversations.preview_content_type");
        dqprVarM12.i(-1);
        dqprVarM12.c(new Supplier() { // from class: avte
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM12.j(new dqps() { // from class: avtq
        });
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqprVarM13.m(1);
        dqprVarM13.b("conversations.show_draft");
        dqprVarM13.i(-1);
        dqprVarM13.c(new Supplier() { // from class: avuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM13.j(new dqps() { // from class: avuo
        });
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqprVarM14.m(4);
        dqprVarM14.b("conversations.draft_snippet_text");
        dqprVarM14.i(-1);
        dqprVarM14.c(new Supplier() { // from class: avva
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM14.j(new dqps() { // from class: avvb
        });
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqprVarM15.m(4);
        dqprVarM15.b("conversations.draft_subject_text");
        dqprVarM15.i(-1);
        dqprVarM15.c(new Supplier() { // from class: avvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM15.j(new dqps() { // from class: avve
        });
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqprVarM16.m(4);
        dqprVarM16.b("conversations.draft_preview_uri");
        dqprVarM16.i(-1);
        dqprVarM16.c(new Supplier() { // from class: avvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM16.j(new dqps() { // from class: avvh
        });
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqprVarM17.m(4);
        dqprVarM17.b("conversations.draft_preview_content_type");
        dqprVarM17.i(-1);
        dqprVarM17.c(new Supplier() { // from class: avvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM17.j(new dqps() { // from class: avvj
        });
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqprVarM18.m(1);
        dqprVarM18.b("conversations.etouffee_default");
        dqprVarM18.i(29060);
        dqprVarM18.c(new Supplier() { // from class: avvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM18.j(new dqps() { // from class: avvl
        });
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqprVarM19.m(1);
        dqprVarM19.d(true);
        dqprVarM19.b("conversations.archive_status");
        dqprVarM19.i(-1);
        dqprVarM19.c(new Supplier() { // from class: avvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM19.j(new dqps() { // from class: avvp
        });
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqprVarM20.m(1);
        dqprVarM20.d(true);
        dqprVarM20.b("conversations.sort_timestamp");
        dqprVarM20.i(-1);
        dqprVarM20.c(new Supplier() { // from class: avvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM20.j(new dqps() { // from class: avvr
        });
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqprVarM21.m(1);
        dqprVarM21.b("conversations.last_read_timestamp");
        dqprVarM21.i(-1);
        dqprVarM21.c(new Supplier() { // from class: avvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM21.j(new dqps() { // from class: avvu
        });
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqprVarM22.m(4);
        dqprVarM22.b("conversations.icon");
        dqprVarM22.i(-1);
        dqprVarM22.c(new Supplier() { // from class: avvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM22.j(new dqps() { // from class: avvw
        });
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqprVarM23.m(1);
        dqprVarM23.b("conversations.participant_contact_id");
        dqprVarM23.i(-1);
        dqprVarM23.c(new Supplier() { // from class: avvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM23.j(new dqps() { // from class: avvy
        });
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqprVarM24.m(1);
        dqprVarM24.b("conversations.normalized_participant_contact_id");
        dqprVarM24.i(58090);
        dqprVarM24.c(new Supplier() { // from class: avwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM24.j(new dqps() { // from class: avwb
        });
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqprVarM25.m(4);
        dqprVarM25.b("conversations.participant_lookup_key");
        dqprVarM25.i(-1);
        dqprVarM25.c(new Supplier() { // from class: avwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM25.j(new dqps() { // from class: avwd
        });
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqprVarM26.m(4);
        dqprVarM26.b("conversations.normalized_participant_lookup_key");
        dqprVarM26.i(58090);
        dqprVarM26.c(new Supplier() { // from class: avwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM26.j(new dqps() { // from class: avwg
        });
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqprVarM27.m(4);
        dqprVarM27.d(true);
        dqprVarM27.b("conversations.participant_normalized_destination");
        dqprVarM27.i(-1);
        dqprVarM27.c(new Supplier() { // from class: avwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM27.j(new dqps() { // from class: avwi
        });
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqprVarM28.m(4);
        dqprVarM28.l(true);
        dqprVarM28.d(true);
        dqprVarM28.b("conversations.participant_comparable_destination");
        dqprVarM28.f(true);
        dqprVarM28.i(58090);
        dqprVarM28.c(new Supplier() { // from class: avwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM28.j(new dqps() { // from class: avwl
        });
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqprVarM29.m(4);
        dqprVarM29.b("conversations.current_self_id");
        dqprVarM29.i(-1);
        dqprVarM29.c(new Supplier() { // from class: avwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM29.j(new dqps() { // from class: avwn
        });
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqprVarM30.m(4);
        dqprVarM30.b("conversations.current_my_identity");
        dqprVarM30.i(59810);
        dqprVarM30.c(new Supplier() { // from class: avwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM30.j(new dqps() { // from class: avwp
        });
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqprVarM31.m(4);
        dqprVarM31.d(true);
        dqprVarM31.e(true);
        dqprVarM31.h(new Supplier() { // from class: avwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM31.b("conversations.current_my_identity_foreign_key");
        dqprVarM31.i(60160);
        dqprVarM31.c(new Supplier() { // from class: avws
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM31.j(new dqps() { // from class: avwt
        });
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqprVarM32.m(4);
        dqprVarM32.d(true);
        dqprVarM32.e(true);
        dqprVarM32.h(new Supplier() { // from class: avwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.b.a;
            }
        });
        dqprVarM32.b("conversations.destination_token");
        dqprVarM32.i(60360);
        dqprVarM32.c(new Supplier() { // from class: avww
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM32.j(new dqps() { // from class: avwx
        });
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqprVarM33.m(1);
        dqprVarM33.b("conversations.participant_count");
        dqprVarM33.i(-1);
        dqprVarM33.c(new Supplier() { // from class: avwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM33.j(new dqps() { // from class: avwz
        });
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqprVarM34.m(1);
        dqprVarM34.b("conversations.notification_enabled");
        dqprVarM34.i(-1);
        dqprVarM34.c(new Supplier() { // from class: avxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM34.j(new dqps() { // from class: avxb
        });
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqprVarM35.m(4);
        dqprVarM35.b("conversations.notification_sound_uri");
        dqprVarM35.i(-1);
        dqprVarM35.c(new Supplier() { // from class: avxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM35.j(new dqps() { // from class: avxe
        });
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqprVarM36.m(1);
        dqprVarM36.b("conversations.notification_vibration");
        dqprVarM36.i(-1);
        dqprVarM36.c(new Supplier() { // from class: avxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM36.j(new dqps() { // from class: avxh
        });
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqprVarM37.m(1);
        dqprVarM37.b("conversations.include_email_addr");
        dqprVarM37.i(-1);
        dqprVarM37.c(new Supplier() { // from class: avxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM37.j(new dqps() { // from class: avxj
        });
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqprVarM38.m(4);
        dqprVarM38.b("conversations.sms_service_center");
        dqprVarM38.i(-1);
        dqprVarM38.c(new Supplier() { // from class: avxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM38.j(new dqps() { // from class: avxl
        });
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqprVarM39.m(4);
        dqprVarM39.b("conversations.participant_id_list");
        dqprVarM39.i(8500);
        dqprVarM39.c(new Supplier() { // from class: avxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM39.j(new dqps() { // from class: avxn
        });
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqprVarM40.m(4);
        dqprVarM40.l(true);
        dqprVarM40.d(true);
        dqprVarM40.b("conversations.normalized_participant_id_list");
        dqprVarM40.f(true);
        dqprVarM40.i(58090);
        dqprVarM40.c(new Supplier() { // from class: avxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM40.j(new dqps() { // from class: avxq
        });
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqprVarM41.m(1);
        dqprVarM41.b("conversations.source_type");
        dqprVarM41.i(8500);
        dqprVarM41.c(new Supplier() { // from class: avxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM41.j(new dqps() { // from class: avxt
        });
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqprVarM42.m(1);
        dqprVarM42.d(true);
        dqprVarM42.b("conversations.rcs_session_id");
        dqprVarM42.i(10000);
        dqprVarM42.c(new Supplier() { // from class: avxu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM42.j(new dqps() { // from class: avxv
        });
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqprVarM43.m(1);
        dqprVarM43.b("conversations.join_state");
        dqprVarM43.i(10006);
        dqprVarM43.c(new Supplier() { // from class: avxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM43.j(new dqps() { // from class: avxx
        });
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqprVarM44.m(1);
        dqprVarM44.b("conversations.send_mode");
        dqprVarM44.i(10016);
        dqprVarM44.c(new Supplier() { // from class: avxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM44.j(new dqps() { // from class: avxz
        });
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqprVarM45.m(1);
        dqprVarM45.b("conversations.IS_ENTERPRISE");
        dqprVarM45.i(10018);
        dqprVarM45.c(new Supplier() { // from class: avyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM45.j(new dqps() { // from class: avyd
        });
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqprVarM46.m(1);
        dqprVarM46.b("conversations.last_interactive_event_timestamp");
        dqprVarM46.i(15000);
        dqprVarM46.c(new Supplier() { // from class: avye
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM46.j(new dqps() { // from class: avyf
        });
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqprVarM47.m(4);
        dqprVarM47.b("conversations.participant_display_destination");
        dqprVarM47.i(15010);
        dqprVarM47.c(new Supplier() { // from class: avyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM47.j(new dqps() { // from class: avyh
        });
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqprVarM48.m(4);
        dqprVarM48.b("conversations.normalized_participant_display_destination");
        dqprVarM48.i(58090);
        dqprVarM48.c(new Supplier() { // from class: avyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM48.j(new dqps() { // from class: avyj
        });
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqprVarM49.m(1);
        dqprVarM49.b("conversations.spam_warning_dismiss_status");
        dqprVarM49.i(23000);
        dqprVarM49.c(new Supplier() { // from class: avyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM49.j(new dqps() { // from class: avyl
        });
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqprVarM50.m(1);
        dqprVarM50.b("conversations.open_count");
        dqprVarM50.i(26020);
        dqprVarM50.c(new Supplier() { // from class: avvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM50.j(new dqps() { // from class: avyr
        });
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqprVarM51.m(1);
        dqprVarM51.b("conversations.last_logged_scooby_metadata_timestamp");
        dqprVarM51.i(28010);
        dqprVarM51.c(new Supplier() { // from class: avzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM51.j(new dqps() { // from class: avzn
        });
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqprVarM52.m(1);
        dqprVarM52.d(true);
        dqprVarM52.b("conversations.delete_timestamp");
        dqprVarM52.i(29020);
        dqprVarM52.c(new Supplier() { // from class: avzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM52.j(new dqps() { // from class: awaj
        });
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqprVarM53.m(4);
        dqprVarM53.l(true);
        dqprVarM53.d(true);
        dqprVarM53.b("conversations.cms_id");
        dqprVarM53.f(true);
        dqprVarM53.i(32000);
        dqprVarM53.c(new Supplier() { // from class: awau
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM53.j(new dqps() { // from class: awbf
        });
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqprVarM54.m(4);
        dqprVarM54.d(true);
        dqprVarM54.b("conversations.rcs_group_id");
        dqprVarM54.i(40050);
        dqprVarM54.c(new Supplier() { // from class: awbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM54.j(new dqps() { // from class: avrs
        });
        dqprVarM54.a();
        dqpr dqprVarM55 = dqpt.m();
        dqprVarM55.m(4);
        dqprVarM55.b("conversations.rcs_conference_uri");
        dqprVarM55.i(40050);
        dqprVarM55.c(new Supplier() { // from class: avso
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM55.j(new dqps() { // from class: avsz
        });
        dqprVarM55.a();
        dqpr dqprVarM56 = dqpt.m();
        dqprVarM56.m(5);
        dqprVarM56.b("conversations.tachygram_group_routing_info_token");
        dqprVarM56.i(58120);
        dqprVarM56.c(new Supplier() { // from class: avtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM56.j(new dqps() { // from class: avtv
        });
        dqprVarM56.a();
        dqpr dqprVarM57 = dqpt.m();
        dqprVarM57.m(1);
        dqprVarM57.b("conversations.cms_most_recent_read_message_timestamp_ms");
        dqprVarM57.i(53030);
        dqprVarM57.c(new Supplier() { // from class: avug
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM57.j(new dqps() { // from class: avur
        });
        dqprVarM57.a();
        dqpr dqprVarM58 = dqpt.m();
        dqprVarM58.m(2);
        dqprVarM58.b("conversations.rcs_subject_change_timestamp_ms");
        dqprVarM58.i(46050);
        dqprVarM58.c(new Supplier() { // from class: avvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM58.j(new dqps() { // from class: avvn
        });
        dqprVarM58.a();
        dqpr dqprVarM59 = dqpt.m();
        dqprVarM59.m(1);
        dqprVarM59.b("conversations.rcs_session_allows_revocation");
        dqprVarM59.i(48040);
        dqprVarM59.c(new Supplier() { // from class: avvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM59.j(new dqps() { // from class: avwk
        });
        dqprVarM59.a();
        dqpr dqprVarM60 = dqpt.m();
        dqprVarM60.m(2);
        dqprVarM60.b("conversations.rcs_group_capabilities");
        dqprVarM60.i(49020);
        dqprVarM60.c(new Supplier() { // from class: avxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM60.j(new dqps() { // from class: avxr
        });
        dqprVarM60.a();
        dqpr dqprVarM61 = dqpt.m();
        dqprVarM61.m(1);
        dqprVarM61.b("conversations.awaiting_reverse_sync");
        dqprVarM61.i(49060);
        dqprVarM61.c(new Supplier() { // from class: avyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM61.j(new dqps() { // from class: avyn
        });
        dqprVarM61.a();
        dqpr dqprVarM62 = dqpt.m();
        dqprVarM62.m(2);
        dqprVarM62.d(true);
        dqprVarM62.e(true);
        dqprVarM62.h(new Supplier() { // from class: avyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM62.b("conversations.duplicate_of");
        dqprVarM62.i(58090);
        dqprVarM62.c(new Supplier() { // from class: avyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM62.j(new dqps() { // from class: avyq
        });
        dqprVarM62.a();
        dqpr dqprVarM63 = dqpt.m();
        dqprVarM63.m(2);
        dqprVarM63.d(true);
        dqprVarM63.e(true);
        dqprVarM63.h(new Supplier() { // from class: avys
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM63.b("conversations.new_duplicate_of");
        dqprVarM63.i(59130);
        dqprVarM63.c(new Supplier() { // from class: avyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM63.j(new dqps() { // from class: avyu
        });
        dqprVarM63.a();
        dqpr dqprVarM64 = dqpt.m();
        dqprVarM64.m(1);
        dqprVarM64.b("conversations.error_state");
        dqprVarM64.i(58140);
        dqprVarM64.c(new Supplier() { // from class: avyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM64.j(new dqps() { // from class: avyx
        });
        dqprVarM64.a();
        dqpr dqprVarM65 = dqpt.m();
        dqprVarM65.m(1);
        dqprVarM65.b("conversations.cms_life_cycle");
        dqprVarM65.i(58210);
        dqprVarM65.c(new Supplier() { // from class: avyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM65.j(new dqps() { // from class: avyz
        });
        dqprVarM65.a();
        dqpr dqprVarM66 = dqpt.m();
        dqprVarM66.m(4);
        dqprVarM66.b("conversations.rcs_group_self_msisdn");
        dqprVarM66.i(58540);
        dqprVarM66.c(new Supplier() { // from class: avza
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM66.j(new dqps() { // from class: avzb
        });
        dqprVarM66.a();
        dqpr dqprVarM67 = dqpt.m();
        dqprVarM67.m(2);
        dqprVarM67.b("conversations.recipient_offline_timestamp_ms");
        dqprVarM67.i(58750);
        dqprVarM67.c(new Supplier() { // from class: avzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM67.j(new dqps() { // from class: avze
        });
        dqprVarM67.a();
        dqpr dqprVarM68 = dqpt.m();
        dqprVarM68.m(2);
        dqprVarM68.b("conversations.rcs_group_last_sync_timestamp");
        dqprVarM68.i(58910);
        dqprVarM68.c(new Supplier() { // from class: avzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM68.j(new dqps() { // from class: avzg
        });
        dqprVarM68.a();
        dqpr dqprVarM69 = dqpt.m();
        dqprVarM69.m(1);
        dqprVarM69.b("conversations.has_been_e2ee");
        dqprVarM69.i(59210);
        dqprVarM69.c(new Supplier() { // from class: avzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM69.j(new dqps() { // from class: avzj
        });
        dqprVarM69.a();
        dqpr dqprVarM70 = dqpt.m();
        dqprVarM70.m(1);
        dqprVarM70.b("conversations.marked_as_unread");
        dqprVarM70.i(59220);
        dqprVarM70.c(new Supplier() { // from class: avzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM70.j(new dqps() { // from class: avzl
        });
        dqprVarM70.a();
        dqpr dqprVarM71 = dqpt.m();
        dqprVarM71.m(5);
        dqprVarM71.b("conversations.custom_theme");
        dqprVarM71.i(59820);
        dqprVarM71.c(new Supplier() { // from class: avzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM71.j(new dqps() { // from class: avzo
        });
        dqprVarM71.a();
        dqpr dqprVarM72 = dqpt.m();
        dqprVarM72.m(2);
        dqprVarM72.b("conversations.mms_group_upgrade_status");
        dqprVarM72.i(60050);
        dqprVarM72.c(new Supplier() { // from class: avzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM72.j(new dqps() { // from class: avzq
        });
        dqprVarM72.a();
        dqpr dqprVarM73 = dqpt.m();
        dqprVarM73.m(2);
        dqprVarM73.b("conversations.mms_group_upgrade_retries");
        dqprVarM73.i(60050);
        dqprVarM73.c(new Supplier() { // from class: avzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM73.j(new dqps() { // from class: avzs
        });
        dqprVarM73.a();
        dqpr dqprVarM74 = dqpt.m();
        dqprVarM74.m(2);
        dqprVarM74.b("conversations.encryption_protocol");
        dqprVarM74.i(60180);
        dqprVarM74.c(new Supplier() { // from class: avzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM74.j(new dqps() { // from class: avzv
        });
        dqprVarM74.a();
        dqpr dqprVarM75 = dqpt.m();
        dqprVarM75.m(4);
        dqprVarM75.d(true);
        dqprVarM75.b("conversations.encryption_id");
        dqprVarM75.i(60210);
        dqprVarM75.c(new Supplier() { // from class: avzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM75.j(new dqps() { // from class: avzx
        });
        dqprVarM75.a();
        dqpr dqprVarM76 = dqpt.m();
        dqprVarM76.m(4);
        dqprVarM76.l(true);
        dqprVarM76.d(true);
        dqprVarM76.b("conversations.cms_correlation_id");
        dqprVarM76.f(true);
        dqprVarM76.i(60250);
        dqprVarM76.c(new Supplier() { // from class: avzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM76.j(new dqps() { // from class: awaa
        });
        dqprVarM76.a();
        dqpr dqprVarM77 = dqpt.m();
        dqprVarM77.m(4);
        dqprVarM77.b("conversations.rcs_group_icon_url");
        dqprVarM77.i(60590);
        dqprVarM77.c(new Supplier() { // from class: awab
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM77.j(new dqps() { // from class: awac
        });
        dqprVarM77.a();
        dqpr dqprVarM78 = dqpt.m();
        dqprVarM78.m(2);
        dqprVarM78.b("conversations.unread_count");
        dqprVarM78.i(60740);
        dqprVarM78.c(new Supplier() { // from class: awad
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM78.j(new dqps() { // from class: awae
        });
        dqprVarM78.a();
        dqpr dqprVarM79 = dqpt.m();
        dqprVarM79.m(1);
        dqprVarM79.l(true);
        dqprVarM79.k(true);
        dqprVarM79.g(true);
        dqprVarM79.d(true);
        dqprVarM79.e(true);
        dqprVarM79.h(new Supplier() { // from class: awag
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM79.b("conversation_to_participants.participant_id");
        dqprVarM79.f(true);
        dqprVarM79.i(-1);
        dqprVarM79.c(new Supplier() { // from class: awah
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM79.j(new dqps() { // from class: awai
        });
        dqprVarM79.a();
        dqpr dqprVarM80 = dqpt.m();
        dqprVarM80.m(8);
        dqprVarM80.b("conversation_to_participants__ROWID");
        dqprVarM80.i(0);
        dqprVarM80.c(new Supplier() { // from class: awak
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM80.j(new dqps() { // from class: awal
        });
        dqprVarM80.a();
        dqpr dqprVarM81 = dqpt.m();
        dqprVarM81.m(1);
        dqprVarM81.l(true);
        dqprVarM81.k(true);
        dqprVarM81.g(true);
        dqprVarM81.d(true);
        dqprVarM81.e(true);
        dqprVarM81.h(new Supplier() { // from class: awam
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        });
        dqprVarM81.b("conversation_to_participants.conversation_id");
        dqprVarM81.f(true);
        dqprVarM81.i(-1);
        dqprVarM81.c(new Supplier() { // from class: awan
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM81.j(new dqps() { // from class: awao
        });
        dqprVarM81.a();
        dqpr dqprVarM82 = dqpt.m();
        dqprVarM82.m(1);
        dqprVarM82.k(true);
        dqprVarM82.b("conversation_to_participants.rcs_group_join_status");
        dqprVarM82.i(-1);
        dqprVarM82.c(new Supplier() { // from class: awap
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM82.j(new dqps() { // from class: awaq
        });
        dqprVarM82.a();
        dqpr dqprVarM83 = dqpt.m();
        dqprVarM83.m(4);
        dqprVarM83.b("conversation_to_participants.last_modified_by_key");
        dqprVarM83.i(-1);
        dqprVarM83.c(new Supplier() { // from class: awas
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM83.j(new dqps() { // from class: awat
        });
        dqprVarM83.a();
        dqpr dqprVarM84 = dqpt.m();
        dqprVarM84.m(2);
        dqprVarM84.l(true);
        dqprVarM84.g(true);
        dqprVarM84.d(true);
        dqprVarM84.b("participants._id");
        dqprVarM84.i(-1);
        dqprVarM84.c(new Supplier() { // from class: awav
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM84.j(new dqps() { // from class: awaw
        });
        dqprVarM84.a();
        dqpr dqprVarM85 = dqpt.m();
        dqprVarM85.m(4);
        dqprVarM85.d(true);
        dqprVarM85.b("participants.normalized_destination");
        dqprVarM85.f(true);
        dqprVarM85.i(-1);
        dqprVarM85.c(new Supplier() { // from class: awax
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM85.j(new dqps() { // from class: away
        });
        this.b = new awbs(dqprVarM85.a());
        dqpr dqprVarM86 = dqpt.m();
        dqprVarM86.m(4);
        dqprVarM86.b("participants.send_destination");
        dqprVarM86.i(-1);
        dqprVarM86.c(new Supplier() { // from class: awaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM86.j(new dqps() { // from class: awba
        });
        dqprVarM86.a();
        dqpr dqprVarM87 = dqpt.m();
        dqprVarM87.m(8);
        dqprVarM87.b("participants__ROWID");
        dqprVarM87.i(0);
        dqprVarM87.c(new Supplier() { // from class: awbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM87.j(new dqps() { // from class: awbc
        });
        dqprVarM87.a();
        dqpr dqprVarM88 = dqpt.m();
        dqprVarM88.m(4);
        dqprVarM88.d(true);
        dqprVarM88.b("participants.my_identity_token");
        dqprVarM88.i(59930);
        dqprVarM88.c(new Supplier() { // from class: awbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM88.j(new dqps() { // from class: awbg
        });
        dqprVarM88.a();
        dqpr dqprVarM89 = dqpt.m();
        dqprVarM89.m(4);
        dqprVarM89.d(true);
        dqprVarM89.e(true);
        dqprVarM89.h(new Supplier() { // from class: awbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        });
        dqprVarM89.b("participants.my_identity_token_foreign_key");
        dqprVarM89.i(60160);
        dqprVarM89.c(new Supplier() { // from class: awbi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM89.j(new dqps() { // from class: awbj
        });
        dqprVarM89.a();
        dqpr dqprVarM90 = dqpt.m();
        dqprVarM90.m(1);
        dqprVarM90.d(true);
        dqprVarM90.b("participants.sub_id");
        dqprVarM90.f(true);
        dqprVarM90.i(-1);
        dqprVarM90.c(new Supplier() { // from class: awbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM90.j(new dqps() { // from class: awbl
        });
        dqprVarM90.a();
        dqpr dqprVarM91 = dqpt.m();
        dqprVarM91.m(1);
        dqprVarM91.b("participants.sim_slot_id");
        dqprVarM91.i(2000);
        dqprVarM91.c(new Supplier() { // from class: awbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM91.j(new dqps() { // from class: awbn
        });
        dqprVarM91.a();
        dqpr dqprVarM92 = dqpt.m();
        dqprVarM92.m(4);
        dqprVarM92.b("participants.display_destination");
        dqprVarM92.i(-1);
        dqprVarM92.c(new Supplier() { // from class: awbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM92.j(new dqps() { // from class: avri
        });
        dqprVarM92.a();
        dqpr dqprVarM93 = dqpt.m();
        dqprVarM93.m(4);
        dqprVarM93.l(true);
        dqprVarM93.d(true);
        dqprVarM93.b("participants.comparable_destination");
        dqprVarM93.f(true);
        dqprVarM93.i(54040);
        dqprVarM93.c(new Supplier() { // from class: avrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM93.j(new dqps() { // from class: avrk
        });
        dqprVarM93.a();
        dqpr dqprVarM94 = dqpt.m();
        dqprVarM94.m(4);
        dqprVarM94.b("participants.country_code");
        dqprVarM94.i(54040);
        dqprVarM94.c(new Supplier() { // from class: avrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM94.j(new dqps() { // from class: avrm
        });
        dqprVarM94.a();
        dqpr dqprVarM95 = dqpt.m();
        dqprVarM95.m(2);
        dqprVarM95.l(true);
        dqprVarM95.d(true);
        dqprVarM95.b("participants.recipient_id");
        dqprVarM95.f(true);
        dqprVarM95.i(58090);
        dqprVarM95.c(new Supplier() { // from class: avrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM95.j(new dqps() { // from class: avro
        });
        dqprVarM95.a();
        dqpr dqprVarM96 = dqpt.m();
        dqprVarM96.m(4);
        dqprVarM96.b("participants.recipient_canonical_address");
        dqprVarM96.i(58090);
        dqprVarM96.c(new Supplier() { // from class: avrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM96.j(new dqps() { // from class: avrq
        });
        dqprVarM96.a();
        dqpr dqprVarM97 = dqpt.m();
        dqprVarM97.m(4);
        dqprVarM97.b("participants.full_name");
        dqprVarM97.i(-1);
        dqprVarM97.c(new Supplier() { // from class: avrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM97.j(new dqps() { // from class: avrv
        });
        dqprVarM97.a();
        dqpr dqprVarM98 = dqpt.m();
        dqprVarM98.m(4);
        dqprVarM98.b("participants.first_name");
        dqprVarM98.i(-1);
        dqprVarM98.c(new Supplier() { // from class: avrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM98.j(new dqps() { // from class: avrx
        });
        dqprVarM98.a();
        dqpr dqprVarM99 = dqpt.m();
        dqprVarM99.m(4);
        dqprVarM99.b("participants.profile_photo_uri");
        dqprVarM99.i(-1);
        dqprVarM99.c(new Supplier() { // from class: avry
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM99.j(new dqps() { // from class: avrz
        });
        dqprVarM99.a();
        dqpr dqprVarM100 = dqpt.m();
        dqprVarM100.m(4);
        dqprVarM100.b("participants.contact_photo_uri");
        dqprVarM100.i(59850);
        dqprVarM100.c(new Supplier() { // from class: avsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM100.j(new dqps() { // from class: avsb
        });
        dqprVarM100.a();
        dqpr dqprVarM101 = dqpt.m();
        dqprVarM101.m(1);
        dqprVarM101.b("participants.contact_id");
        dqprVarM101.i(-1);
        dqprVarM101.c(new Supplier() { // from class: avsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM101.j(new dqps() { // from class: avse
        });
        dqprVarM101.a();
        dqpr dqprVarM102 = dqpt.m();
        dqprVarM102.m(4);
        dqprVarM102.b("participants.lookup_key");
        dqprVarM102.i(-1);
        dqprVarM102.c(new Supplier() { // from class: avsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM102.j(new dqps() { // from class: avsh
        });
        dqprVarM102.a();
        dqpr dqprVarM103 = dqpt.m();
        dqprVarM103.m(1);
        dqprVarM103.b("participants.color_palette_index");
        dqprVarM103.i(-1);
        dqprVarM103.c(new Supplier() { // from class: avsi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM103.j(new dqps() { // from class: avsj
        });
        dqprVarM103.a();
        dqpr dqprVarM104 = dqpt.m();
        dqprVarM104.m(1);
        dqprVarM104.b("participants.color_type");
        dqprVarM104.i(1000);
        dqprVarM104.c(new Supplier() { // from class: avsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM104.j(new dqps() { // from class: avsl
        });
        dqprVarM104.a();
        dqpr dqprVarM105 = dqpt.m();
        dqprVarM105.m(1);
        dqprVarM105.b("participants.extended_color");
        dqprVarM105.i(10027);
        dqprVarM105.c(new Supplier() { // from class: avsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM105.j(new dqps() { // from class: avsn
        });
        dqprVarM105.a();
        dqpr dqprVarM106 = dqpt.m();
        dqprVarM106.m(1);
        dqprVarM106.b("participants.blocked");
        dqprVarM106.i(-1);
        dqprVarM106.c(new Supplier() { // from class: avsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM106.j(new dqps() { // from class: avsq
        });
        dqprVarM106.a();
        dqpr dqprVarM107 = dqpt.m();
        dqprVarM107.m(4);
        dqprVarM107.b("participants.subscription_name");
        dqprVarM107.i(2000);
        dqprVarM107.c(new Supplier() { // from class: avsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM107.j(new dqps() { // from class: avst
        });
        dqprVarM107.a();
        dqpr dqprVarM108 = dqpt.m();
        dqprVarM108.m(1);
        dqprVarM108.b("participants.subscription_color");
        dqprVarM108.i(2000);
        dqprVarM108.c(new Supplier() { // from class: avsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM108.j(new dqps() { // from class: avsv
        });
        dqprVarM108.a();
        dqpr dqprVarM109 = dqpt.m();
        dqprVarM109.m(4);
        dqprVarM109.b("participants.contact_destination");
        dqprVarM109.i(4000);
        dqprVarM109.c(new Supplier() { // from class: avsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM109.j(new dqps() { // from class: avsx
        });
        dqprVarM109.a();
        dqpr dqprVarM110 = dqpt.m();
        dqprVarM110.m(1);
        dqprVarM110.b("participants.participant_type");
        dqprVarM110.i(12001);
        dqprVarM110.c(new Supplier() { // from class: avsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM110.j(new dqps() { // from class: avta
        });
        dqprVarM110.a();
        dqpr dqprVarM111 = dqpt.m();
        dqprVarM111.m(1);
        dqprVarM111.b("participants.video_reachability");
        dqprVarM111.i(13050);
        dqprVarM111.c(new Supplier() { // from class: avtb
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM111.j(new dqps() { // from class: avtc
        });
        dqprVarM111.a();
        dqpr dqprVarM112 = dqpt.m();
        dqprVarM112.m(4);
        dqprVarM112.b("participants.alias");
        dqprVarM112.i(20060);
        dqprVarM112.c(new Supplier() { // from class: avtd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM112.j(new dqps() { // from class: avtf
        });
        dqprVarM112.a();
        dqpr dqprVarM113 = dqpt.m();
        dqprVarM113.m(1);
        dqprVarM113.b("participants.is_spam");
        dqprVarM113.i(24060);
        dqprVarM113.c(new Supplier() { // from class: avtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM113.j(new dqps() { // from class: avth
        });
        dqprVarM113.a();
        dqpr dqprVarM114 = dqpt.m();
        dqprVarM114.m(1);
        dqprVarM114.b("participants.is_rcs_available");
        dqprVarM114.i(29030);
        dqprVarM114.c(new Supplier() { // from class: avti
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM114.j(new dqps() { // from class: avtj
        });
        dqprVarM114.a();
        dqpr dqprVarM115 = dqpt.m();
        dqprVarM115.m(1);
        dqprVarM115.b("participants.is_spam_source");
        dqprVarM115.i(30000);
        dqprVarM115.c(new Supplier() { // from class: avtl
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM115.j(new dqps() { // from class: avtm
        });
        dqprVarM115.a();
        dqpr dqprVarM116 = dqpt.m();
        dqprVarM116.m(4);
        dqprVarM116.l(true);
        dqprVarM116.d(true);
        dqprVarM116.b("participants.cms_id");
        dqprVarM116.f(true);
        dqprVarM116.i(31020);
        dqprVarM116.c(new Supplier() { // from class: avtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM116.j(new dqps() { // from class: avto
        });
        dqprVarM116.a();
        dqpr dqprVarM117 = dqpt.m();
        dqprVarM117.m(1);
        dqprVarM117.b("participants.latest_verification_status");
        dqprVarM117.i(31030);
        dqprVarM117.c(new Supplier() { // from class: avtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM117.j(new dqps() { // from class: avtr
        });
        dqprVarM117.a();
        dqpr dqprVarM118 = dqpt.m();
        dqprVarM118.m(4);
        dqprVarM118.b("participants.profile_photo_blob_id");
        dqprVarM118.i(33000);
        dqprVarM118.c(new Supplier() { // from class: avts
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM118.j(new dqps() { // from class: avtt
        });
        dqprVarM118.a();
        dqpr dqprVarM119 = dqpt.m();
        dqprVarM119.m(5);
        dqprVarM119.b("participants.profile_photo_encryption_key");
        dqprVarM119.i(33060);
        dqprVarM119.c(new Supplier() { // from class: avtu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM119.j(new dqps() { // from class: avtw
        });
        dqprVarM119.a();
        dqpr dqprVarM120 = dqpt.m();
        dqprVarM120.m(1);
        dqprVarM120.b("participants.directory_id");
        dqprVarM120.i(35010);
        dqprVarM120.c(new Supplier() { // from class: avtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM120.j(new dqps() { // from class: avty
        });
        dqprVarM120.a();
        dqpr dqprVarM121 = dqpt.m();
        dqprVarM121.m(1);
        dqprVarM121.b("participants.is_check_constraint_enabled_via_phenotype");
        dqprVarM121.i(55010);
        dqprVarM121.c(new Supplier() { // from class: avtz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM121.j(new dqps() { // from class: avua
        });
        dqprVarM121.a();
        dqpr dqprVarM122 = dqpt.m();
        dqprVarM122.m(1);
        dqprVarM122.b("participants.is_valid_phone_number_data");
        dqprVarM122.i(55010);
        dqprVarM122.c(new Supplier() { // from class: avub
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM122.j(new dqps() { // from class: avud
        });
        dqprVarM122.a();
        dqpr dqprVarM123 = dqpt.m();
        dqprVarM123.m(2);
        dqprVarM123.d(true);
        dqprVarM123.e(true);
        dqprVarM123.h(new Supplier() { // from class: avue
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        dqprVarM123.b("participants.duplicate_of");
        dqprVarM123.i(58090);
        dqprVarM123.c(new Supplier() { // from class: avuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM123.j(new dqps() { // from class: avuh
        });
        dqprVarM123.a();
        dqpr dqprVarM124 = dqpt.m();
        dqprVarM124.m(1);
        dqprVarM124.b("participants.cms_life_cycle");
        dqprVarM124.i(58210);
        dqprVarM124.c(new Supplier() { // from class: avui
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM124.j(new dqps() { // from class: avuj
        });
        dqprVarM124.a();
        dqpr dqprVarM125 = dqpt.m();
        dqprVarM125.m(1);
        dqprVarM125.b("participants.norm_ui_status");
        dqprVarM125.i(58620);
        dqprVarM125.c(new Supplier() { // from class: avuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM125.j(new dqps() { // from class: avul
        });
        dqprVarM125.a();
        dqpr dqprVarM126 = dqpt.m();
        dqprVarM126.m(4);
        dqprVarM126.b("participants.last_modified_by_key");
        dqprVarM126.i(59440);
        dqprVarM126.c(new Supplier() { // from class: avum
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM126.j(new dqps() { // from class: avun
        });
        dqprVarM126.a();
        dqpr dqprVarM127 = dqpt.m();
        dqprVarM127.m(1);
        dqprVarM127.b("participants.name_source");
        dqprVarM127.i(59550);
        dqprVarM127.c(new Supplier() { // from class: avup
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM127.j(new dqps() { // from class: avuq
        });
        dqprVarM127.a();
        dqpr dqprVarM128 = dqpt.m();
        dqprVarM128.m(1);
        dqprVarM128.b("participants.photo_source");
        dqprVarM128.i(59550);
        dqprVarM128.c(new Supplier() { // from class: avus
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM128.j(new dqps() { // from class: avut
        });
        dqprVarM128.a();
        dqpr dqprVarM129 = dqpt.m();
        dqprVarM129.m(1);
        dqprVarM129.b("participants.profile_photo_user_preference");
        dqprVarM129.i(60060);
        dqprVarM129.c(new Supplier() { // from class: avuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM129.j(new dqps() { // from class: avuv
        });
        dqprVarM129.a();
        dqpr dqprVarM130 = dqpt.m();
        dqprVarM130.m(5);
        dqprVarM130.b("participants.contact_metadata");
        dqprVarM130.i(60070);
        dqprVarM130.c(new Supplier() { // from class: avuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM130.j(new dqps() { // from class: avux
        });
        dqprVarM130.a();
        dqpr dqprVarM131 = dqpt.m();
        dqprVarM131.m(1);
        dqprVarM131.d(true);
        dqprVarM131.b("participants.is_enterprise_contact");
        dqprVarM131.i(60640);
        dqprVarM131.c(new Supplier() { // from class: avuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awcb.b();
            }
        });
        dqprVarM131.j(new dqps() { // from class: avuz
        });
        dqprVarM131.a();
    }
}
