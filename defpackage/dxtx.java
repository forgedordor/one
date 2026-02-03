package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxtx {
    private final ejxr A = ejxx.a(new ejxr() { // from class: dxsf
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp_job_count", new ecoi("app_package_name", String.class), new ecoi("android_sdk_version", Integer.class), new ecoi("job_key", String.class), new ecoi("result", String.class), new ecoi("failure_type", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    private final ejxr B;
    private final ejxr C;
    private final ejxr D;
    private final ejxr E;
    private final ejxr F;
    private final ejxr G;
    private final ejxr H;
    private final ejxr I;
    private final ejxr J;
    public final econ a;
    public final ejxr b;
    public final ejxr c;
    public final ejxr d;
    public final ejxr e;
    public final ejxr f;
    public final ejxr g;
    public final ejxr h;
    public final ejxr i;
    public final ejxr j;
    public final ejxr k;
    public final ejxr l;
    public final ejxr m;
    public final ejxr n;
    public final ejxr o;
    public final ejxr p;
    public final ejxr q;
    public final ejxr r;
    public final ejxr s;
    public final ejxr t;
    public final ejxr u;
    public final ejxr v;
    public final ejxr w;
    public final ejxr x;
    public final ejxr y;
    private final ecom z;

    public dxtx(ScheduledExecutorService scheduledExecutorService, ecod ecodVar, Application application) {
        ejxx.a(new ejxr() { // from class: dxsh
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new ecoi("app_package_name", String.class), new ecoi("path", String.class), new ecoi("status_code", Integer.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.b = ejxx.a(new ejxr() { // from class: dxst
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/http/gnp_http_client/request_count", new ecoi("app_package_name", String.class), new ecoi("client_impl", String.class), new ecoi("path", String.class), new ecoi("status_code", Integer.class), new ecoi("purpose", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.c = ejxx.a(new ejxr() { // from class: dxtf
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/push/decryption/request_count", new ecoi("app_package_name", String.class), new ecoi("failure", Boolean.class), new ecoi("has_placeholder", Boolean.class), new ecoi("fetched_threads", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.d = ejxx.a(new ejxr() { // from class: dxtk
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/push/decryption/latency", new ecoi("app_package_name", String.class), new ecoi("failure", Boolean.class), new ecoi("fetched_threads", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtl
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new ecoi("app_package_name", String.class), new ecoi("gnp_insertion_equals_chime", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtn
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new ecoi("app_package_name", String.class), new ecoi("gnp_removal_equals_chime", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxto
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new ecoi("app_package_name", String.class), new ecoi("gnp_update_equals_chime", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtp
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new ecoi("app_package_name", String.class), new ecoi("accounts_count_equal", Boolean.class), new ecoi("accounts_content_equal", Boolean.class), new ecoi("migration_performed", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtq
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/chime_android/sdk/registration/request_builder_count", new ecoi("app_package_name", String.class), new ecoi("encryption_requested", Boolean.class), new ecoi("key_generation_result", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.B = ejxx.a(new ejxr() { // from class: dxsq
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new ecoi("app_package_name", String.class), new ecoi("status", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.C = ejxx.a(new ejxr() { // from class: dxtb
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new ecoi("app_package_name", String.class), new ecoi("status", String.class), new ecoi("registration_reason", String.class), new ecoi("target_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtm
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new ecoi("app_package_name", String.class), new ecoi("requested_tray_limit", Integer.class), new ecoi("above_tray_limit_count", Integer.class), new ecoi("requested_slot_limit", Integer.class), new ecoi("above_slot_limit_count", Integer.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: dxtr
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/chime_android/push/decompression/latency", new ecoi("app_package_name", String.class), new ecoi("failure", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.f = ejxx.a(new ejxr() { // from class: dxts
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/registration/registration_request_builder_count", new ecoi("app_package_name", String.class), new ecoi("encryption_requested", Boolean.class), new ecoi("key_generation_result", Boolean.class), new ecoi("target_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxtt
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/job/chime_job_count", new ecoi("app_package_name", String.class), new ecoi("android_sdk_version", Integer.class), new ecoi("is_gnp_job", Boolean.class), new ecoi("job_key", String.class), new ecoi("executed_in_place", Boolean.class), new ecoi("result", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.g = ejxx.a(new ejxr() { // from class: dxtu
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/registration/registration_request_count", new ecoi("app_package_name", String.class), new ecoi("registration_reason", String.class), new ecoi("status", String.class), new ecoi("target_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.D = ejxx.a(new ejxr() { // from class: dxtv
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/job/input_builder_result_count", new ecoi("app_package_name", String.class), new ecoi("is_success", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.E = ejxx.a(new ejxr() { // from class: dxtw
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_logging_count", new ecoi("package_name", String.class), new ecoi("which_log", String.class), new ecoi("status", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.F = ejxx.a(new ejxr() { // from class: dxsg
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_started_count", new ecoi("package_name", String.class), new ecoi("status", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dxsi
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_job_count", new ecoi("package_name", String.class), new ecoi("job_tag", String.class), new ecoi("status", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.h = ejxx.a(new ejxr() { // from class: dxsj
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_shown_count", new ecoi("package_name", String.class), new ecoi("promotion_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.i = ejxx.a(new ejxr() { // from class: dxsk
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expired_count", new ecoi("package_name", String.class), new ecoi("account_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.j = ejxx.a(new ejxr() { // from class: dxsl
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/promotion_expiration_overdue", new ecoi("package_name", String.class), new ecoi("account_type", String.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.k = ejxx.a(new ejxr() { // from class: dxsm
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/trigger_applied_count", new ecoi("package_name", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.l = ejxx.a(new ejxr() { // from class: dxsn
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/targeting_applied_count", new ecoi("package_name", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.m = ejxx.a(new ejxr() { // from class: dxso
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_filtering_start_count", new ecoi("package_name", String.class), new ecoi("account_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.n = ejxx.a(new ejxr() { // from class: dxsp
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new ecoi("package_name", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.o = ejxx.a(new ejxr() { // from class: dxsr
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new ecoi("package_name", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.p = ejxx.a(new ejxr() { // from class: dxss
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new ecoi("package_name", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.G = ejxx.a(new ejxr() { // from class: dxsu
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_impressions_count", new ecoi("package_name", String.class), new ecoi("user_action", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.q = ejxx.a(new ejxr() { // from class: dxsv
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_promotions_fetched", new ecoi("package_name", String.class), new ecoi("account_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.H = ejxx.a(new ejxr() { // from class: dxsw
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_network_library_count", new ecoi("package_name", String.class), new ecoi("network_library", String.class), new ecoi("status", String.class), new ecoi("account_type", String.class), new ecoi("fetch_reason", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.r = ejxx.a(new ejxr() { // from class: dxsx
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/growthkit_event_logged", new ecoi("package_name", String.class), new ecoi("account_type", String.class), new ecoi("event_code", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.s = ejxx.a(new ejxr() { // from class: dxsy
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/growthkit_event_processing_latency", new ecoi("package_name", String.class), new ecoi("cache_enabled", Boolean.class), new ecoi("optimized_flow", Boolean.class), new ecoi("promo_shown", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.t = ejxx.a(new ejxr() { // from class: dxsz
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/growthkit_event_queue_time", new ecoi("package_name", String.class), new ecoi("cache_enabled", Boolean.class), new ecoi("optimized_flow", Boolean.class), new ecoi("promo_shown", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        ejxx.a(new ejxr() { // from class: dxta
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new ecoi("app_package_name", String.class), new ecoi("is_ui_thread", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.u = ejxx.a(new ejxr() { // from class: dxtc
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new ecoi("package_name", String.class), new ecoi("did_fail", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.v = ejxx.a(new ejxr() { // from class: dxtd
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new ecoi("package_name", String.class), new ecoi("did_fail", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.I = ejxx.a(new ejxr() { // from class: dxte
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new ecoi("app_package_name", String.class), new ecoi("result", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.w = ejxx.a(new ejxr() { // from class: dxtg
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/account/username_change_result", new ecoi("app_package_name", String.class), new ecoi("is_failure", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.x = ejxx.a(new ejxr() { // from class: dxth
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/account/account_removal_result", new ecoi("app_package_name", String.class), new ecoi("is_failure", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.y = ejxx.a(new ejxr() { // from class: dxti
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new ecoi("app_package_name", String.class), new ecoi("target_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.J = ejxx.a(new ejxr() { // from class: dxtj
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/gnp_android/customtabs/customtab_launch_count", new ecoi("app_package_name", String.class), new ecoi("url_type", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        econ econVarE = econ.e("gnp_android");
        this.a = econVarE;
        ecom ecomVar = econVarE.c;
        if (ecomVar == null) {
            this.z = ecoq.c(ecodVar, scheduledExecutorService, econVarE, application);
        } else {
            this.z = ecomVar;
            ((ecoq) ecomVar).f = ecodVar;
        }
    }

    public final void a(String str, String str2) {
        ((ecoe) this.J.get()).a(str, str2);
    }

    public final void b(String str, int i, String str2, String str3, String str4) {
        ((ecoe) this.A.get()).a(str, Integer.valueOf(i), str2, str3, str4);
    }

    public final void c(String str, boolean z) {
        ((ecoe) this.D.get()).a(str, Boolean.valueOf(z));
    }

    public final void d(String str, String str2) {
        ((ecoe) this.I.get()).a(str, str2);
    }

    public final void e(String str, String str2, String str3, String str4) {
        ((ecoe) this.C.get()).a(str, str2, str3, str4);
    }

    public final void f(int i, String str, String str2) {
        ((ecoe) this.B.get()).b(i, str, str2);
    }

    public final void g(String str, String str2) {
        ((ecoe) this.G.get()).a(str, str2);
    }

    public final void h(String str, String str2) {
        ((ecoe) this.F.get()).a(str, str2);
    }

    public final void i(String str, String str2) {
        ((ecoe) this.E.get()).a(str, "Clearcut", str2);
    }

    public final void j(String str, String str2, String str3, String str4) {
        ((ecoe) this.H.get()).a(str, "GnpHttpClient_ExperimentGroup", str2, str3, str4);
    }
}
