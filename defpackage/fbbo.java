package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbbo implements fbbl {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;
    public static final dzzh d;
    public static final dzzh e;
    public static final dzzh f;
    public static final dzzh g;
    public static final dzzh h;
    public static final dzzh i;
    public static final dzzh j;
    public static final dzzh k;
    public static final dzzh l;
    public static final dzzh m;
    public static final dzzh n;
    public static final dzzh o;
    public static final dzzh p;
    public static final dzzh q;
    public static final dzzh r;
    public static final dzzh s;
    public static final dzzh t;
    public static final dzzh u;
    public static final dzzh v;
    public static final dzzh w;
    public static final dzzh x;

    static {
        dzzf dzzfVarB = new dzzf(dzyc.a("com.google.android.gms.icing.mdd")).c().b();
        dzzfVarB.o("gms_icing_mdd_add_configs_from_phenotype", true);
        dzzfVarB.o("broadcast_newly_downloaded_groups", true);
        a = dzzfVarB.p("build_id_overrides", new dzze() { // from class: fbbm
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtnc) evsn.parseFrom(dtnc.a, bArr);
            }
        }, "");
        dzzfVarB.o("gms_icing_mdd_cache_last_location", true);
        dzzfVarB.o("clear_state_on_mdd_disabled", false);
        b = dzzfVarB.o("delete_file_groups_with_files_missing", true);
        c = dzzfVarB.o("disable_phenotype_namespace_migration_and_cleanup", false);
        dzzfVarB.o("gms_mdd_download_first_on_wifi_then_on_any_network", true);
        dzzfVarB.o("gms_mdd_dump_mdd_info", false);
        dzzfVarB.o("enable_android_file_sharing", true);
        dzzfVarB.o("enable_android_file_sharing_data_clean_up", true);
        dzzfVarB.o("enable_android_sharing_daily_maintenance", false);
        dzzfVarB.o("enable_client_error_logging", false);
        d = dzzfVarB.o("enable_compressed_file", true);
        e = dzzfVarB.o("enable_days_since_last_maintenance_tracking", true);
        dzzfVarB.o("gms_mdd_enable_debug_ui", false);
        f = dzzfVarB.o("enable_delayed_download", true);
        dzzfVarB.o("enable_delta_download", true);
        dzzfVarB.o("enable_download_stage_experiment_id_propagation", true);
        g = dzzfVarB.o("enable_file_download_dedup_by_file_key", false);
        h = dzzfVarB.o("enable_gdd_batch_sync", false);
        i = dzzfVarB.o("enable_gdd_zwieback_id_propagation", false);
        j = dzzfVarB.o("enable_isolated_structure_verification", true);
        dzzfVarB.o("gms_mdd_enable_mdd_gcm_service", true);
        k = dzzfVarB.o("enable_mdd_multi_variant_handling", false);
        dzzfVarB.o("enable_mobile_data_download", true);
        dzzfVarB.o("enable_mobstore_file_service", true);
        dzzfVarB.o("enable_mobstore_file_service_rename", true);
        dzzfVarB.o("enable_mobstore_file_service_whitelist", true);
        l = dzzfVarB.o("enable_rng_based_device_stable_sampling", true);
        dzzfVarB.o("enable_set_runtime_properties", true);
        m = dzzfVarB.o("enable_sideloading", true);
        dzzfVarB.o("gms_mdd_enable_silent_feedback", true);
        n = dzzfVarB.o("enable_zip_folder", true);
        o = dzzfVarB.m("FeatureFlags__file_key_version", 2L);
        dzzfVarB.o("gcm_reschedule_only_once_per_process_start", true);
        dzzfVarB.o("gms_mdd_switch_to_cronet", false);
        dzzfVarB.m("gms_icing_mdd_location_s2_level", 10L);
        dzzfVarB.m("gms_icing_mdd_task_await_time", 5L);
        p = dzzfVarB.o("log_file_groups_with_files_missing", true);
        q = dzzfVarB.o("log_network_stats", true);
        dzzfVarB.o("gms_mdd_log_storage_stats", true);
        r = dzzfVarB.o("gms_icing_mdd_delete_groups_removed_accounts", false);
        s = dzzfVarB.o("gms_icing_mdd_delete_uninstalled_apps", true);
        t = dzzfVarB.o("gms_icing_mdd_enable_download_pending_groups", true);
        u = dzzfVarB.o("gms_icing_mdd_enable_garbage_collection", true);
        v = dzzfVarB.o("gms_icing_mdd_enable_verify_pending_groups", true);
        w = dzzfVarB.m("gms_icing_mdd_reset_trigger", 0L);
        dzzfVarB.o("migrate_file_expiration_policy", true);
        dzzfVarB.o("migrate_to_new_file_key", true);
        x = dzzfVarB.p("FeatureFlags__pds_migration_state", new dzze() { // from class: fbbn
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtqi) evsn.parseFrom(dtqi.a, bArr);
            }
        }, "");
        dzzfVarB.o("remove_groupkeys_with_downloaded_field_not_set", true);
        dzzfVarB.o("test_only_file_key_version", false);
    }

    @Override // defpackage.fbbl
    public final long a() {
        return ((Long) o.b()).longValue();
    }

    @Override // defpackage.fbbl
    public final long b() {
        return ((Long) w.b()).longValue();
    }

    @Override // defpackage.fbbl
    public final dtnc c() {
        return (dtnc) a.b();
    }

    @Override // defpackage.fbbl
    public final dtqi d() {
        return (dtqi) x.b();
    }

    @Override // defpackage.fbbl
    public final boolean e() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean f() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean g() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean h() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean i() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean j() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean k() {
        return ((Boolean) h.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean l() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean m() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean n() {
        return ((Boolean) k.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean o() {
        return ((Boolean) l.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean p() {
        return ((Boolean) m.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean q() {
        return ((Boolean) n.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean r() {
        return ((Boolean) p.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean s() {
        return ((Boolean) q.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean t() {
        return ((Boolean) r.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean u() {
        return ((Boolean) s.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean v() {
        return ((Boolean) t.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean w() {
        return ((Boolean) u.b()).booleanValue();
    }

    @Override // defpackage.fbbl
    public final boolean x() {
        return ((Boolean) v.b()).booleanValue();
    }
}
