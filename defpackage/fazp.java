package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fazp implements fazo {
    public static final dzzh a;

    static {
        dzzf dzzfVarA = new dzzf(dzyc.a("com.google.android.ims.library")).a();
        dzzfVarA.o("RcsProvisioning__allow_amber_flag_read_from_ssot_if_not_on_main_thread", false);
        dzzfVarA.o("RcsProvisioning__allow_manual_phone_number_input", false);
        dzzfVarA.o("RcsProvisioning__allow_provisioning_session_id_logging", true);
        dzzfVarA.o("RcsProvisioning__allow_seamless_authorized_provisioning", false);
        dzzfVarA.o("RcsProvisioning__always_provision_through_mobile_network", false);
        dzzfVarA.o("RcsProvisioning__amber_create_flags", false);
        dzzfVarA.o("RcsProvisioning__amber_full_launch", false);
        dzzfVarA.o("RcsProvisioning__amber_log_call_stack", false);
        dzzfVarA.m("RcsProvisioning__c11n_consent_cache_expiration_millis", 259200000L);
        dzzfVarA.o("RcsProvisioning__cache_reshown_status", false);
        dzzfVarA.n("RcsProvisioning__client_channel", "PUBLIC");
        dzzfVarA.m("RcsProvisioning__config_doc_validity_debug_override_sec", 600L);
        dzzfVarA.o("RcsProvisioning__continue_availability_check_after_first_failure", true);
        dzzfVarA.o("RcsProvisioning__disable_immediate_upi_fallback", false);
        dzzfVarA.o("RcsProvisioning__disable_rcs_for_secondary_users", true);
        dzzfVarA.o("RcsProvisioning__enable_backfill_consent", false);
        dzzfVarA.o("RcsProvisioning__enable_daily_provisioning_snapshot", true);
        dzzfVarA.o("RcsProvisioning__enable_daily_provisioning_snapshot_unfinished_attempt_only", false);
        dzzfVarA.o("RcsProvisioning__enable_disabled_by_config_version_in_rcs_settings", true);
        dzzfVarA.o("RcsProvisioning__enable_google_tos_banner", true);
        dzzfVarA.o("RcsProvisioning__enable_google_tos_reprompt_on_consent_revoked_from_server", false);
        dzzfVarA.o("RcsProvisioning__enable_handling_rcs_sms_async", true);
        dzzfVarA.o("RcsProvisioning__enable_identity_mapping_in_rcs_provisioning_manager", true);
        dzzfVarA.o("RcsProvisioning__enable_legal_fyi_flow", true);
        dzzfVarA.o("RcsProvisioning__enable_mobile_configuration_library_clearcut_logging", false);
        dzzfVarA.o("RcsProvisioning__enable_phone_number_input_reprompt_v2", true);
        dzzfVarA.o("RcsProvisioning__enable_phone_number_input_reprompting", false);
        dzzfVarA.o("RcsProvisioning__enable_rcs_consent_via_asterism_api", false);
        dzzfVarA.o("RcsProvisioning__enable_rcs_default_on_oob_flow", false);
        dzzfVarA.o("RcsProvisioning__enable_realtime_provisioning_attempt", true);
        dzzfVarA.o("RcsProvisioning__enable_realtime_provisioning_stage", true);
        dzzfVarA.o("RcsProvisioning__enable_set_consent_retry", false);
        dzzfVarA.o("RcsProvisioning__enable_sms_connectivity_check", false);
        dzzfVarA.o("RcsProvisioning__enable_upi", false);
        dzzfVarA.o("RcsProvisioning__enable_upi_mvp", false);
        dzzfVarA.o("RcsProvisioning__enable_welcome_popup_without_google_tos", false);
        dzzfVarA.o("RcsProvisioning__enabled_revoke_google_tos_consent_by_asterism_api", false);
        dzzfVarA.o("RcsProvisioning__enforce_rcs_consent_via_asterism_api", false);
        dzzfVarA.n("RcsProvisioning__fake_sim_number_for_testing", "");
        a = dzzfVarA.o("RcsProvisioning__get_mcc_directly", false);
        dzzfVarA.n("RcsProvisioning__google_tos_banner_variant", "google_tos_banner_variant_a");
        dzzfVarA.o("RcsProvisioning__ignore_reconfiguration_request_in_otp_sms_handler", true);
        dzzfVarA.o("RcsProvisioning__include_first_attempt_in_daily_provisioning_snapshot", true);
        dzzfVarA.o("RcsProvisioning__inhibit_reading_msisdn_from_sim", false);
        dzzfVarA.o("RcsProvisioning__log_fi_multi_sync_ui_shown", true);
        dzzfVarA.o("RcsProvisioning__log_finishing_provisioning_when_tos_declined", true);
        dzzfVarA.m("RcsProvisioning__max_event_num_in_provisioning_stage", 16L);
        dzzfVarA.m("RcsProvisioning__max_millis_for_banner_calculation_since_interactive", 10000L);
        dzzfVarA.m("RcsProvisioning__max_prompts_for_google_tos_bottomsheet_before_banner", 5L);
        dzzfVarA.m("RcsProvisioning__max_prompts_for_phone_number_bottomsheet_before_banner", 5L);
        dzzfVarA.m("RcsProvisioning__max_stage_num_in_provisioning_attempt", 30L);
        dzzfVarA.m("RcsProvisioning__max_times_phone_number_input_can_be_prompted", 5L);
        dzzfVarA.o("RcsProvisioning__min_gmscore_version_for_upi_siloed_verification_met", false);
        dzzfVarA.o("RcsProvisioning__min_gmscore_version_for_upi_without_acs_fallback_met", false);
        dzzfVarA.m("RcsProvisioning__min_seconds_between_phone_number_input_reprompt", 604800L);
        dzzfVarA.o("RcsProvisioning__notify_backend_am_not_default", true);
        dzzfVarA.o("RcsProvisioning__notify_backend_in_reprovision_campaign", false);
        dzzfVarA.o("RcsProvisioning__notify_backend_rcs_is_disabled", false);
        dzzfVarA.m("RcsProvisioning__number_of_upi_attempts_before_fallback", 10L);
        dzzfVarA.o("RcsProvisioning__pev2_manual_msisdn_entry_state_timeout_enabled", false);
        dzzfVarA.m("RcsProvisioning__pev2_manual_msisdn_entry_state_timeout_millis", 86400000L);
        dzzfVarA.m("RcsProvisioning__pev2_max_replay_count", 10L);
        dzzfVarA.m("RcsProvisioning__pev2_state_timeout_millis", 300000L);
        dzzfVarA.n("RcsProvisioning__phone_number_ui_variant", "phone_number_ui_variant_input_bottomsheet");
        dzzfVarA.o("RcsProvisioning__prefer_manual_msisdn", true);
        dzzfVarA.o("cslib_phenotype__provisioning_manager_should_propagate_trace", true);
        dzzfVarA.o("RcsProvisioning__rcs_default_on_feature_allowed", true);
        dzzfVarA.m("RcsProvisioning__rcs_onboarding_flags_load_delay_millis", 0L);
        dzzfVarA.m("RcsProvisioning__rcs_onboarding_flags_validity_millis", 500L);
        dzzfVarA.m("RcsProvisioning__rcs_upsell_cooldown_first_millis", 604800000L);
        dzzfVarA.m("RcsProvisioning__rcs_upsell_cooldown_subsequent_millis", 604800000L);
        dzzfVarA.m("RcsProvisioning__rcs_upsell_maximum_prompt_count", 7L);
        dzzfVarA.o("RcsProvisioning__remove_rcs_flags_project_fi", true);
        dzzfVarA.n("RcsProvisioning__reprovision_campaign_id", "Default");
        dzzfVarA.o("RcsProvisioning__reshow_success_popup", false);
        dzzfVarA.o("RcsProvisioning__respect_rcs_provisioning_enabled", true);
        dzzfVarA.m("RcsProvisioning__revoke_consent_worker_initial_delay_mins", 10080L);
        dzzfVarA.o("RcsProvisioning__send_client_channel_in_header", true);
        dzzfVarA.o("RcsProvisioning__send_provisioning_storage_metrics", false);
        dzzfVarA.o("RcsProvisioning__send_rcs_state_in_request", false);
        dzzfVarA.o("RcsProvisioning__send_tachyon_identity_key_during_provisioning", false);
        dzzfVarA.o("RcsProvisioning__show_google_tos", false);
        dzzfVarA.o("RcsProvisioning__skip_get_consent_if_gmsCore_iid_token_available", false);
        dzzfVarA.o("RcsProvisioning__skip_header_enrichment", false);
        dzzfVarA.m("RcsProvisioning__terminal_model_max_length", 40L);
        dzzfVarA.o("RcsProvisioning__test_migration_using_mods", false);
        dzzfVarA.o("RcsProvisioning__update_default_on_tos_config_object_without_override", false);
        dzzfVarA.n("RcsProvisioning__upi_policy_id", "upi-mo-sms-strict");
        dzzfVarA.o("RcsProvisioning__use_amber_for_reprovision_campaign", true);
        dzzfVarA.o("RcsProvisioning__use_mobile_configuration_retriever_for_flags", false);
        dzzfVarA.o("RcsProvisioning__use_mobile_configuration_retriever_for_flags_phase2", false);
        dzzfVarA.o("RcsProvisioning__use_provisioning_http_request", false);
        dzzfVarA.o("RcsProvisioning__use_provisioning_http_request_to_build_server_query", true);
    }

    @Override // defpackage.fazo
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
