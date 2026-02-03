package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxi {
    public final econ a;
    public final ejxr b = ejxx.a(new ejxr() { // from class: dywt
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/invalid_user_profile_switch", new ecoi("app_package", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    public final ejxr c = ejxx.a(new ejxr() { // from class: dyxe
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/switch_profile", new ecoi("result", String.class), new ecoi("has_category_launcher", Boolean.class), new ecoi("has_category_info", Boolean.class), new ecoi("user_in_target_user_profiles", Boolean.class), new ecoi("api_version", Integer.class), new ecoi("app_package", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    public final ejxr d = ejxx.a(new ejxr() { // from class: dyxf
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/load_owners_count", new ecoi("implementation", String.class), new ecoi("result", String.class), new ecoi("number_of_owners", Integer.class), new ecoi("app_package", String.class), new ecoi("load_cached", Boolean.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    public final ejxr e = ejxx.a(new ejxr() { // from class: dyxg
        @Override // defpackage.ejxr
        public final Object get() {
            ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/load_owner_count", new ecoi("implementation", String.class), new ecoi("result", String.class), new ecoi("app_package", String.class));
            ecoeVarC.c();
            return ecoeVarC;
        }
    });
    public final ejxr f;
    public final ejxr g;
    public final ejxr h;
    public final ejxr i;
    public final ejxr j;
    public final ejxr k;
    private final ecom l;

    public dyxi(ScheduledExecutorService scheduledExecutorService, ecod ecodVar, Application application) {
        ejxx.a(new ejxr() { // from class: dyxh
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/legacy/load_owners", new ecoi("app_package", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.f = ejxx.a(new ejxr() { // from class: dywu
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/load_owner_avatar_count", new ecoi("implementation", String.class), new ecoi("avatar_size", String.class), new ecoi("result", String.class), new ecoi("app_package", String.class), new ecoi("load_cached", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.g = ejxx.a(new ejxr() { // from class: dywv
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/og_android/load_owners_latency", new ecoi("implementation", String.class), new ecoi("result", String.class), new ecoi("number_of_owners", Integer.class), new ecoi("app_package", String.class), new ecoi("load_cached", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.h = ejxx.a(new ejxr() { // from class: dyww
            @Override // defpackage.ejxr
            public final Object get() {
                ecog ecogVarD = this.a.a.d("/client_streamz/og_android/load_owner_avatar_latency", new ecoi("implementation", String.class), new ecoi("avatar_size", String.class), new ecoi("result", String.class), new ecoi("app_package", String.class), new ecoi("load_cached", Boolean.class));
                ecogVarD.c();
                return ecogVarD;
            }
        });
        this.i = ejxx.a(new ejxr() { // from class: dywx
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/profile_cache/get_people_me", new ecoi("result", String.class), new ecoi("app_package", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dywy
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/lazy_provider_count", new ecoi("app_package", String.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dywz
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/visual_elements_usage", new ecoi("app_package", String.class), new ecoi("ve_enabled", Boolean.class), new ecoi("ve_provided", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.j = ejxx.a(new ejxr() { // from class: dyxa
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/safety_exp_account_menu_refresh", new ecoi[0]);
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dyxb
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/safety_exp_default_entry_point", new ecoi[0]);
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        this.k = ejxx.a(new ejxr() { // from class: dyxc
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/safety_exp_color_resolve_crash", new ecoi("app_package", String.class), new ecoi("has_material", Boolean.class), new ecoi("is_material3", Boolean.class), new ecoi("is_light_theme", Boolean.class), new ecoi("failing_attribute_index", Integer.class), new ecoi("is_next_attribute_failing", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        ejxx.a(new ejxr() { // from class: dyxd
            @Override // defpackage.ejxr
            public final Object get() {
                ecoe ecoeVarC = this.a.a.c("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new ecoi("part_of_the_view_is_visible", Boolean.class), new ecoi("is_laid_out", Boolean.class), new ecoi("is_shown", Boolean.class));
                ecoeVarC.c();
                return ecoeVarC;
            }
        });
        econ econVarE = econ.e("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = econVarE;
        ecom ecomVar = econVarE.c;
        if (ecomVar == null) {
            this.l = ecoq.c(ecodVar, scheduledExecutorService, econVarE, application);
        } else {
            this.l = ecomVar;
            ((ecoq) ecomVar).f = ecodVar;
        }
    }
}
