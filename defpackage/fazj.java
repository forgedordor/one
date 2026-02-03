package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fazj implements fazi {
    public static final dzzh a;
    public static final dzzh b;
    public static final dzzh c;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        dzzfVarA.o("DsdrProvisioningFlags__check_phone_number_empty_in_formatted_e164_phone_number_factory", true);
        dzzfVarA.o("DsdrProvisioningFlags__delay_sim_events", true);
        dzzfVarA.o("DsdrProvisioningFlags__delay_sim_events_using_pwq", true);
        dzzfVarA.o("DsdrProvisioningFlags__distinct_sim_subscription_infos_by_sub_id", true);
        a = dzzfVarA.o("DsdrProvisioningFlags__enable_all_subscriptions_as_verified", false);
        b = dzzfVarA.o("DsdrProvisioningFlags__enable_is_sim_loaded_comparison_event", false);
        dzzfVarA.o("DsdrProvisioningFlags__enable_manifest_registered_async_telephony_sim_state_receiver", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_multi_sim_carrier_tos", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_rcs_availability_util_in_provisioning_engine", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_rcs_settings_data_in_carrier_services", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_schedule_provisioning_using_sim_id", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_sequential_coalescing_helper_to_schedule_sim_updates", true);
        dzzfVarA.o("DsdrProvisioningFlags__enable_sim_events_from_phone_sims_state_updater", true);
        c = dzzfVarA.o("DsdrProvisioningFlags__enable_synchronized_update_value", true);
        dzzfVarA.o("DsdrProvisioningFlags__use_sim_subscription_info_in_sim_preferences", true);
    }

    @Override // defpackage.fazi
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fazi
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fazi
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }
}
