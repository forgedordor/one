package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpj {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;
    public final dfoa f;
    public final dfoa g;
    public final dfoa h;
    public final dfoa i;
    public final dfoa j;
    public final dfoa k;
    public final dfoa l;
    public final dfoa m;
    public final dfoa n;
    public final dfoa o;
    public final dfoa p;
    public final dfoa q;
    public final dfoa r;
    public final dfoa s;
    public final dfoa t;
    public final dfoa u;
    public final dfoa v;
    public final dfoa w;
    public final dfoa x;

    public dfpj(dfpk dfpkVar) {
        this.a = dfpkVar.i("enable_capdiscovery_via_presence", true);
        this.b = dfpkVar.i("enable_request_interworking_imdn", false);
        this.c = dfpkVar.h("msrp_cert_fingerprint_algorithm", "SHA-1");
        this.d = dfpkVar.i("poll_sim_loaded_status_on_init", false);
        this.e = dfpkVar.i("enable_fi_network_selector", false);
        this.f = dfpkVar.i("deprioritize_vpns_in_network_selector", false);
        this.g = dfpkVar.i("enable_realtime_socket_monitoring", false);
        this.h = dfpkVar.i("delay_gc_transport_error_handling", false);
        this.i = dfpkVar.i("inform_bugle_of_sessionid_reset_in_runtime", true);
        this.j = dfpkVar.g("revoke_message_timeout_seconds", 32L);
        this.k = dfpkVar.g("group_management_response_timeout_seconds", 32L);
        this.l = dfpkVar.i("use_network_capabilities_for_availability_check", false);
        this.m = dfpkVar.i("enable_rcs_engine_initialization_by_bugle", false);
        this.n = dfpkVar.i("enable_fake_capabilities_discovery", false);
        this.o = dfpkVar.i("enable_bind_msrp_socket_local_address", false);
        this.p = dfpkVar.i("enable_active_msrp_port_selection", false);
        this.q = dfpkVar.i("enable_unsubscribe_to_cep", false);
        this.r = dfpkVar.i("deregister_on_sim_removal", false);
        this.s = dfpkVar.i("enable_sip_transport_event_logging", false);
        this.t = dfpkVar.i("enable_replace_conference_own_user_with_preferred_uri", false);
        this.u = dfpkVar.i("enable_msg_revoke_in_originating_invite", false);
        this.v = dfpkVar.i("enable_msg_revoke_in_originating_invite_for_e2ee", false);
        this.w = dfpkVar.i("enable_check_not_suspended_network_capability", false);
        this.x = dfpkVar.i("enable_encryption_tag_in_invite", false);
    }
}
