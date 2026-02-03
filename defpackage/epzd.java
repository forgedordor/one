package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface epzd extends Library {
    epzp Zinnia_FfiClient_add_members_to_group(Pointer pointer, eqau eqauVar);

    epzr Zinnia_FfiClient_clear_pending_commit(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_create_client(eqau eqauVar, epxz epxzVar, epxo epxoVar, epyy epyyVar, epyk epykVar, epyp epypVar);

    epzp Zinnia_FfiClient_create_group_with_members(Pointer pointer, eqau eqauVar);

    epzl Zinnia_FfiClient_delete_group(Pointer pointer, eqau eqauVar);

    void Zinnia_FfiClient_destroy(Pointer pointer);

    epzp Zinnia_FfiClient_encrypt_message(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_generate_delivery_receipt_mls_message(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_generate_display_receipt_mls_message(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_generate_end_mls_commit(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_generate_key_packages(Pointer pointer, epza epzaVar);

    epzp Zinnia_FfiClient_generate_revive_mls_commit(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_get_expired_members(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_get_group_current_metadata(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_get_group_status(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_get_zinnia_state_rep(Pointer pointer, eqau eqauVar);

    epzl Zinnia_FfiClient_group_has_end_mls(Pointer pointer, eqau eqauVar);

    epzl Zinnia_FfiClient_group_is_active(Pointer pointer, eqau eqauVar);

    void Zinnia_FfiClient_initialize();

    epzr Zinnia_FfiClient_kill_self_heal(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_maybe_refresh(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_process_advance_era_request(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_process_and_validate_display_receipt(Pointer pointer, eqau eqauVar, eqau eqauVar2);

    epzp Zinnia_FfiClient_process_and_validate_negative_delivery_receipt(Pointer pointer, eqau eqauVar, eqau eqauVar2);

    epzp Zinnia_FfiClient_process_and_validate_positive_delivery_receipt(Pointer pointer, eqau eqauVar, eqau eqauVar2);

    epzp Zinnia_FfiClient_process_message(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_propose_remove_self(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_remove_other_members_from_group(Pointer pointer, eqau eqauVar);

    epzr Zinnia_FfiClient_run_maintenance(Pointer pointer);

    epzr Zinnia_FfiClient_set_mls_health_status_self_heal_requested(Pointer pointer, eqau eqauVar);

    epzp Zinnia_FfiClient_sync_mls_membership(Pointer pointer, eqau eqauVar);
}
