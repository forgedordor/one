package defpackage;

import android.accounts.Account;
import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.sun.jna.Function;
import j$.util.Optional;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjq implements eyik {
    public final ahkn a;
    public final ahjr b;
    private final int c;

    public ahjq(ahkn ahknVar, ahjr ahjrVar, int i) {
        this.a = ahknVar;
        this.b = ahjrVar;
        this.c = i;
    }

    private final Object a() {
        int i = this.c;
        switch (i) {
            case 0:
                ahjr ahjrVar = this.b;
                eyik eyikVar = ahjrVar.j;
                tvr tvrVarN = ahjrVar.n();
                txe txeVar = (txe) ahjrVar.k.b();
                ahkn ahknVar = this.a;
                aurx aurxVar = (aurx) ahknVar.a.wc.b();
                ahng ahngVar = ahknVar.b;
                return new tvi(eyikVar, tvrVarN, txeVar, aurxVar, ahngVar.gk, (eosc) ahknVar.p.b(), ahngVar.gl);
            case 1:
                ahjr ahjrVar2 = this.b;
                ahkn ahknVar2 = this.a;
                ahng ahngVar2 = ahknVar2.b;
                eyik eyikVar2 = ahjrVar2.i;
                ehtz ehtzVar = (ehtz) ahngVar2.gj.b();
                ehuj ehujVar = (ehuj) ahknVar2.eo.b();
                ahnh ahnhVar = ahknVar2.a;
                return tvj.a(eyikVar2, ehtzVar, ehujVar, (esmm) ahnhVar.tZ.b(), ejwi.h(), ahnhVar.mJ());
            case 2:
                ahjr ahjrVar3 = this.b;
                ahkn ahknVar3 = this.a;
                return ehup.a(ahjrVar3.hu(), (cvw) ahknVar3.el.b(), ahknVar3.fj());
            case 3:
                efwo efwoVar = (efwo) this.b.b.b();
                ahnh ahnhVar2 = this.a.a;
                return new ehuy(efwoVar, (egcd) ahnhVar2.l.b(), (egej) ahnhVar2.pI.b(), ejwi.j(egfi.a()));
            case 4:
                efwo efwoVar2 = this.b.qg;
                ehom.a(efwoVar2);
                return efwoVar2;
            case 5:
                final ehiy ehiyVarGm = this.b.gm();
                return new estu() { // from class: estv
                    @Override // defpackage.estu
                    public final ListenableFuture a() {
                        ehkz ehkzVar = (ehkz) ehiyVarGm;
                        ehey eheyVar = ehkzVar.b;
                        final ListenableFuture listenableFutureA = ehkzVar.a.a();
                        final ListenableFuture listenableFutureA2 = eheyVar.a();
                        return eika.d(listenableFutureA, listenableFutureA2).a(new Callable() { // from class: ehky
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Object objQ = eork.q(listenableFutureA);
                                objQ.getClass();
                                Object objQ2 = eork.q(listenableFutureA2);
                                objQ2.getClass();
                                return fcwa.j((Map) objQ, (Map) objQ2);
                            }
                        }, eoqg.a);
                    }
                };
            case 6:
                ahkn ahknVar4 = this.a;
                ehez ehezVar = (ehez) ahknVar4.br.b();
                eosc eoscVar = (eosc) ahknVar4.aJ.b();
                ahjr ahjrVar4 = this.b;
                efwo efwoVar3 = (efwo) ahjrVar4.b.b();
                ehkg ehkgVar = (ehkg) ahjrVar4.e.b();
                ahnh ahnhVar3 = ahknVar4.a;
                return ehkx.a(ehezVar, eoscVar, efwoVar3, ehkgVar, ahjrVar4.gg(), (eheg) ahnhVar3.tL.b(), ekgp.k(), (egbf) ahnhVar3.pG.b(), ahnhVar3.mH());
            case 7:
                return new ahiv(this);
            case 8:
                ahjr ahjrVar5 = this.b;
                ehkg ehkgVar2 = (ehkg) ahjrVar5.e.b();
                ahkn ahknVar5 = this.a;
                ehez ehezVar2 = (ehez) ahknVar5.br.b();
                efwo efwoVar4 = (efwo) ahjrVar5.b.b();
                ahnh ahnhVar4 = ahknVar5.a;
                return ehka.a(ehkgVar2, ehezVar2, efwoVar4, ekgp.k(), ahjrVar5.gf(), (eheg) ahnhVar4.tL.b(), (Executor) ahnhVar4.j.b(), (egbf) ahnhVar4.pG.b(), ahnhVar4.mH());
            case 9:
                ahkn ahknVar6 = this.a;
                return new txe((aurx) ahknVar6.a.wc.b(), (eosc) ahknVar6.p.b());
            case 10:
                return new ehuv();
            case 11:
                ceqp ceqpVar = (ceqp) this.b.o.b();
                ahkn ahknVar7 = this.a;
                egyt egytVar = (egyt) ahknVar7.dj.b();
                ahnh ahnhVar5 = ahknVar7.a;
                return new tpi(ceqpVar, egytVar, (aurx) ahnhVar5.wc.b(), (cogw) ahknVar7.cD.b(), (eosc) ahknVar7.p.b(), (eosc) ahknVar7.y.b(), (crmx) ahnhVar5.pB.b(), (alrj) ahnhVar5.qi.b(), ahnhVar5.sh);
            case 12:
                ahkn ahknVar8 = this.a;
                ahjr ahjrVar6 = this.b;
                ahnh ahnhVar6 = ahknVar8.a;
                eyik eyikVar3 = ahknVar8.b.gk;
                eyik eyikVar4 = ahjrVar6.n;
                cenj cenjVar = (cenj) ahnhVar6.tf.b();
                return new ceqp(eyikVar3, eyikVar4, cenjVar);
            case 13:
                ahjr ahjrVar7 = this.b;
                ahkn ahknVar9 = this.a;
                ahng ahngVar3 = ahknVar9.b;
                eyik eyikVar5 = ahjrVar7.i;
                ehtz ehtzVar2 = (ehtz) ahngVar3.gm.b();
                ehuj ehujVar2 = (ehuj) ahknVar9.eo.b();
                ahnh ahnhVar7 = ahknVar9.a;
                return cerg.a(eyikVar5, ehtzVar2, ehujVar2, (esmm) ahnhVar7.tZ.b(), ejwi.h(), ahnhVar7.mJ());
            case 14:
                ahjr ahjrVar8 = this.b;
                return cefi.a(ahjrVar8.dq(), (cert) ahjrVar8.mD.b(), (ceta) this.a.b.gz.b());
            case 15:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar8 = ahknVar10.a;
                cepf cepfVar = (cepf) ahnhVar8.FZ.b();
                ahjr ahjrVar9 = this.b;
                return new cezv(ahknVar10.dh, cepfVar, (cepf) ahjrVar9.v.b(), Optional.of((ceqe) ahjrVar9.w.b()), (cepr) ahnhVar8.aap.b(), (cepv) ahnhVar8.aaq.b(), (cepv) ahnhVar8.aar.b(), ahnhVar8.aas, ahnhVar8.aaz);
            case 16:
                return abcr.a((cepf) this.a.a.FZ.b(), Optional.of((cepf) this.b.u.b()));
            case 17:
                ahjr ahjrVar10 = this.b;
                ahng ahngVar4 = this.a.b;
                ceqm ceqmVarDs = ahjrVar10.ds();
                eyik eyikVar6 = ahngVar4.gk;
                eyik eyikVar7 = ahjrVar10.s;
                eyik eyikVar8 = ahjrVar10.t;
                cerq.a();
                cers.a();
                return ceqy.a(ceqmVarDs, eyikVar6, eyikVar7, eyikVar8);
            case 18:
                ahjr ahjrVar11 = this.b;
                ahkn ahknVar11 = this.a;
                eyik eyikVar9 = ahjrVar11.i;
                ehtz ehtzVar3 = (ehtz) ahknVar11.ik.b();
                ehuj ehujVar3 = (ehuj) ahknVar11.eo.b();
                ahnh ahnhVar9 = ahknVar11.a;
                return ceri.a(eyikVar9, ehtzVar3, ehujVar3, (esmm) ahnhVar9.tZ.b(), ejwi.h(), ahnhVar9.mJ());
            case 19:
                ahjr ahjrVar12 = this.b;
                ahkn ahknVar12 = this.a;
                eyik eyikVar10 = ahjrVar12.i;
                ehtz ehtzVar4 = (ehtz) ahknVar12.ik.b();
                ehuj ehujVar4 = (ehuj) ahknVar12.eo.b();
                ahnh ahnhVar10 = ahknVar12.a;
                return cerh.a(eyikVar10, ehtzVar4, ehujVar4, (esmm) ahnhVar10.tZ.b(), ejwi.h(), ahnhVar10.mJ());
            case 20:
                ahjr ahjrVar13 = this.b;
                ahkn ahknVar13 = this.a;
                ahng ahngVar5 = ahknVar13.b;
                eyik eyikVar11 = ahjrVar13.i;
                ehtz ehtzVar5 = (ehtz) ahngVar5.go.b();
                ehuj ehujVar5 = (ehuj) ahknVar13.eo.b();
                ahnh ahnhVar11 = ahknVar13.a;
                return cerd.a(eyikVar11, ehtzVar5, ehujVar5, (esmm) ahnhVar11.tZ.b(), ejwi.h(), ahnhVar11.mJ());
            case 21:
                ahjr ahjrVar14 = this.b;
                ahkn ahknVar14 = this.a;
                ahng ahngVar6 = ahknVar14.b;
                eyik eyikVar12 = ahjrVar14.i;
                ehtz ehtzVar6 = (ehtz) ahngVar6.go.b();
                ehuj ehujVar6 = (ehuj) ahknVar14.eo.b();
                ahnh ahnhVar12 = ahknVar14.a;
                return cerc.a(eyikVar12, ehtzVar6, ehujVar6, (esmm) ahnhVar12.tZ.b(), ejwi.h(), ahnhVar12.mJ());
            case 22:
                return new ahjg(this);
            case 23:
                ahjr ahjrVar15 = this.b;
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar13 = ahknVar15.a;
                return new cffe(ahjrVar15.ca, ahknVar15.dh, ahknVar15.p, ahjrVar15.mz, ahnhVar13.FO, ahnhVar13.pQ, ahnhVar13.rK, ahnhVar13.rJ);
            case 24:
                ahkn ahknVar16 = this.a;
                ahjr ahjrVar16 = this.b;
                eyik eyikVar13 = ahknVar16.t;
                ahnh ahnhVar14 = ahknVar16.a;
                return new cfgs(eyikVar13, ahknVar16.cD, ahnhVar14.th, ahnhVar14.tj, ahnhVar14.ty, ahnhVar14.tz, ahjrVar16.my, ahknVar16.nJ, ahknVar16.aJ, ahknVar16.p, ahnhVar14.tk);
            case 25:
                ekhv ekhvVarI = ekhx.i(4);
                ahnh ahnhVar15 = this.a.a;
                ekhvVarI.j(ahnhVar15.ru());
                ekhvVarI.j(ahnhVar15.rv());
                ekhvVarI.c(this.b.gT());
                ekhvVarI.c(ahnhVar15.ja());
                return ekhvVarI.g();
            case 26:
                return new ahjj(this);
            case 27:
                return new ahjk(this);
            case 28:
                return new ahjl(this);
            case 29:
                return Optional.of((cbaz) this.b.mr.b());
            case 30:
                return new cbba(this.b.mx, this.a.pJ);
            case 31:
                ahkn ahknVar17 = this.a;
                ekgi ekgiVarH = ekgp.h(209);
                ahnh ahnhVar16 = ahknVar17.a;
                ekgiVarH.i("backup_self_participant", ahnhVar16.afL);
                ekgiVarH.i("block_on_telephony_sync", ahnhVar16.afM);
                ekgiVarH.i("cms_backfill_missing_field_work_handler", ahnhVar16.afN);
                ekgiVarH.i("cms_backup_validation_work_handler", ahnhVar16.afO);
                ekgiVarH.i("disable_multi_device_on_server_when_enable_bnr", ahnhVar16.afP);
                ahjr ahjrVar17 = this.b;
                ekgiVarH.i("cms_local_media_restore", ahjrVar17.ij);
                ekgiVarH.i("cms_local_media_restore_requiring_charging", ahjrVar17.ik);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi", ahjrVar17.il);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_charging", ahjrVar17.im);
                ekgiVarH.i("cms_local_media_restore_requiring_battery_not_low", ahjrVar17.in);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_battery_not_low", ahjrVar17.f19io);
                ekgiVarH.i("cms_media_download_queuer_work_handler", ahjrVar17.ip);
                ekgiVarH.i("cms_media_upload_queuer_work_handler", ahjrVar17.iq);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low", ahnhVar16.aga);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", ahnhVar16.agb);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi", ahnhVar16.agc);
                ekgiVarH.i("cms_initial_sync_media_upload", ahnhVar16.agd);
                ekgiVarH.i("cms_initial_sync_media_upload_foreground", ahnhVar16.age);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", ahnhVar16.agf);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", ahnhVar16.agg);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_foreground", ahnhVar16.agh);
                ekgiVarH.i("cms_incremental_sync_media_upload", ahnhVar16.agi);
                ekgiVarH.i("cms_incremental_sync_media_upload_requiring_wifi", ahnhVar16.agj);
                ekgiVarH.i("cms_set_feature_enabled_on_server", ahnhVar16.agk);
                ekgiVarH.i("cms_set_initial_sync_status_on_server", ahnhVar16.agl);
                ekgiVarH.i("cms_restore_page", ahjrVar17.ir);
                ekgiVarH.i("cms_restore_page_background", ahjrVar17.is);
                ekgiVarH.i("cms_restore_page_foreground", ahjrVar17.it);
                ekgiVarH.i("conversation_deduping_work", ahjrVar17.iu);
                ekgiVarH.i("IdentityVerificationPendingMessageHandler", ahjrVar17.iv);
                ekgiVarH.i("finish_cms_restore_after_message_insertion", ahnhVar16.agr);
                ekgiVarH.i("insert_new_message_from_cms", ahjrVar17.iw);
                ekgiVarH.i("refresh_cms_server_storage_info", ahnhVar16.agx);
                ekgiVarH.i("remove_to_be_delivered_label", ahjrVar17.ix);
                ekgiVarH.i("StarAnalyticsWorkerHandler", ahnhVar16.agz);
                ekgiVarH.i("turn_on_bnr", ahnhVar16.agA);
                ekgiVarH.i("upload_previous_cms_session_ids", ahnhVar16.agB);
                ekgiVarH.i("__UNHANDLED_HANDLER", ahknVar17.pe);
                ekgiVarH.i("cms_restore_validation_work_handler", ahjrVar17.iz);
                ekgiVarH.i("batch_contacts_import", ahjrVar17.iB);
                ekgiVarH.i("batch_deleted_contacts_sync", ahjrVar17.iE);
                ekgiVarH.i("clear_session_ids", ahjrVar17.iF);
                ekgiVarH.i("contact_recipient_change_sync", ahjrVar17.iH);
                ekgiVarH.i("contact_recipient_deleted_sync", ahjrVar17.iI);
                ekgiVarH.i("conversation_latcher", ahjrVar17.iJ);
                ekgiVarH.i("delete_part_cms_attachment", ahnhVar16.agR);
                ekgiVarH.i("encrypted_message_delete", ahnhVar16.agS);
                ekgiVarH.i("end_heavy_work", ahnhVar16.agT);
                ekgiVarH.i("expire_wap_push_si_message", ahjrVar17.iM);
                ekgiVarH.i("fi_multi_sync_grpc", ahnhVar16.aha);
                ekgiVarH.i("force_contacts_sync", ahjrVar17.iT);
                ekgiVarH.i("gaia_auth_check_result", ahnhVar16.aho);
                ekgiVarH.i("add_members_to_rcs_conversation", ahjrVar17.iU);
                ekgiVarH.i("ari_work_handler", ahnhVar16.ahs);
                ekgiVarH.i("attachment_to_telephony_sync", ahjrVar17.iV);
                ekgiVarH.i("backup_upgraded_mms_group", ahjrVar17.iX);
                ekgiVarH.i("bard_deletion_sender", ahjrVar17.iY);
                ekgiVarH.i("block_on_initial_backup_preconditions", ahnhVar16.ahx);
                ekgiVarH.i("cancel_notification", ahjrVar17.ja);
                ekgiVarH.i("cancel_rcs_file_transfer", ahnhVar16.ahC);
                ekgiVarH.i("cleanup_part_uri_handler", ahnhVar16.ahD);
                ekgiVarH.i("cms_back_fill_bnr_state_for_fi_md", ahnhVar16.ahE);
                ekgiVarH.i("cms_backup", ahnhVar16.ahF);
                ekgiVarH.i("cms_batch_backup", ahjrVar17.jd);
                ekgiVarH.i("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", ahnhVar16.ahH);
                ekgiVarH.i("cms_check_missing_restore_work_on_app_upgrade", ahnhVar16.ahI);
                ekgiVarH.i("cms_key_sync", ahjrVar17.je);
                ekgiVarH.i("cms_multi_device_opt_out", ahjrVar17.jg);
                ekgiVarH.i("cms_restore_backup_key", ahjrVar17.jh);
                ekgiVarH.i("cms_restore_conversations", ahjrVar17.ji);
                ekgiVarH.i("cms_restore_encryption_key", ahjrVar17.jj);
                ekgiVarH.i("cms_restore_messages", ahjrVar17.jk);
                ekgiVarH.i("cms_restore_participants", ahjrVar17.jl);
                ekgiVarH.i("cms_sync_stale_status_on_app_upgrade", ahnhVar16.ahR);
                ekgiVarH.i("connect_to_tachyon_anonymously", ahjrVar17.jn);
                ekgiVarH.i("contact_keys_loader_handler", ahnhVar16.ahT);
                ekgiVarH.i("conversation_metadata_full_sync", ahnhVar16.ahU);
                ekgiVarH.i("CONVERSATION_NOTIFICATION", ahjrVar17.jr);
                ekgiVarH.i("conversation_thread_id_updater_worker", ahjrVar17.js);
                ekgiVarH.i("create_notification", ahjrVar17.jt);
                ekgiVarH.i("create_or_update_lighter_conversation", ahnhVar16.aie);
                ekgiVarH.i("custom_themes_sender", ahjrVar17.ju);
                ekgiVarH.i("data_upgrade", ahnhVar16.ail);
                ekgiVarH.i("delete_conversation_handler", ahjrVar17.jx);
                ekgiVarH.i("delete_parts_work_item", ahnhVar16.aiq);
                ekgiVarH.i("delete_message_from_telephony", ahnhVar16.air);
                ekgiVarH.i("delete_message", ahjrVar17.jz);
                ekgiVarH.i("delete_thread_from_telephony", ahnhVar16.aiu);
                ekgiVarH.i("spam_recheck_handler", ahknVar17.pl);
                ekgiVarH.i("ditto_conversation_retry_handler", ahjrVar17.jK);
                ekgiVarH.i("ditto_message_retry_handler", ahjrVar17.jP);
                ekgiVarH.i("ditto_retry_handler", ahjrVar17.jU);
                ekgiVarH.i("downgrade_on_unencrypted_message", ahjrVar17.jW);
                ekgiVarH.i("download_mms", ahnhVar16.aiQ);
                ekgiVarH.i("file_audio_levels", ahjrVar17.kd);
                ekgiVarH.i("file_download_completed", ahjrVar17.kh);
                ekgiVarH.i("file_download_failed", ahjrVar17.ki);
                ekgiVarH.i("file_download", ahjrVar17.kl);
                ekgiVarH.i("file_transfer_processor", ahjrVar17.km);
                ekgiVarH.i("messaging_file_upload", ahjrVar17.ko);
                ekgiVarH.i("forward_sync_batch", ahjrVar17.kt);
                ekgiVarH.i("ftd_data_clean_up_work", ahnhVar16.ajn);
                ekgiVarH.i("FtdHandlerWorkItem", ahjrVar17.kv);
                ekgiVarH.i("rcs_engine_get_single_message", ahjrVar17.kw);
                ekgiVarH.i("google_photos_api_callback", ahjrVar17.kx);
                ekgiVarH.i("group_icon_cleanup_handler", ahjrVar17.ky);
                ekgiVarH.i("group_session_start_failed", ahjrVar17.kz);
                ekgiVarH.i("group_session_started", ahjrVar17.kA);
                ekgiVarH.i("icing_index_rebuild_handler", ahjrVar17.kB);
                ekgiVarH.i("icing_index_rebuild_single_work_handler", ahjrVar17.kD);
                ekgiVarH.i("icing_index_update_handler", ahjrVar17.kE);
                ekgiVarH.i("chatapi_incoming_group_notification_list_message", ahjrVar17.kF);
                ekgiVarH.i("incoming_rbm_message_handler", ahjrVar17.kG);
                ekgiVarH.i("incoming_rcs_group_invitation", ahjrVar17.kH);
                ekgiVarH.i("IncrementalReverseSyncWorkItemHandler", ahjrVar17.kI);
                ekgiVarH.i("key_delivery_service_registration_work_handler", ahjrVar17.kJ);
                ekgiVarH.i("mls_key_refresh_work_handler", ahjrVar17.kK);
                ekgiVarH.i("leave_rcs_group_conversation", ahjrVar17.kL);
                ekgiVarH.i("lighter_incremental_sync", ahjrVar17.kM);
                ekgiVarH.i("log_message_sent_or_received", ahnhVar16.WE);
                ekgiVarH.i("magic_compose_send_clicked_log_handler", ahnhVar16.ajU);
                ekgiVarH.i("mark_all_rcs_groups_as_left", ahjrVar17.kN);
                ekgiVarH.i("mark_as_notified", ahnhVar16.ajX);
                ekgiVarH.i("mark_failures_as_notified", ahjrVar17.kO);
                ekgiVarH.i("MessagesRestoreWorkItemHandler", ahnhVar16.akc);
                ekgiVarH.i("on_add_user_to_group_chat_complete", ahnhVar16.akd);
                ekgiVarH.i("on_create_group_chat_complete", ahjrVar17.kP);
                ekgiVarH.i("on_remove_user_from_group_chat_complete", ahnhVar16.akf);
                ekgiVarH.i("on_trigger_chat_group_full_state_update_complete", ahknVar17.pw);
                ekgiVarH.i("participant_contact_sync", ahjrVar17.kQ);
                ekgiVarH.i("persist_ios_reaction", ahjrVar17.kR);
                ekgiVarH.i("persist_thumbnail", ahjrVar17.kS);
                ekgiVarH.i("pipeline_work_handler", ahjrVar17.kT);
                ekgiVarH.i("post_incoming_message_to_chat_api", ahjrVar17.kU);
                ekgiVarH.i("ditto_process_user_alert", ahjrVar17.kV);
                ekgiVarH.i("forward_sync_engine", ahjrVar17.kY);
                ekgiVarH.i("rcs_group_identifiers_telephony_migration", ahjrVar17.kZ);
                ekgiVarH.i("rcs_to_telephony_sync", ahjrVar17.la);
                ekgiVarH.i("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", ahjrVar17.lb);
                ekgiVarH.i("refresh_incoming_message_notifications", ahnhVar16.akt);
                ekgiVarH.i("refresh_message_failure_notification", ahnhVar16.aku);
                ekgiVarH.i("remote_user_identity_key_change_handler", ahjrVar17.lc);
                ekgiVarH.i("remove_members_from_rcs_conversation", ahjrVar17.ld);
                ekgiVarH.i("resizing", ahnhVar16.aky);
                ekgiVarH.i("retry_manager", ahnhVar16.FR);
                ekgiVarH.i("run_analyze", ahnhVar16.akz);
                ekgiVarH.i("chatapi_send_chat_message_response", ahjrVar17.eY);
                ekgiVarH.i("smart_retries_pipeline_work_handler", ahjrVar17.le);
                ekgiVarH.i("smarts_send_message_listener_handler", ahjrVar17.lf);
                ekgiVarH.i("soda_file_transcription", ahjrVar17.lg);
                ekgiVarH.i("spam_reclassification_handler", ahjrVar17.lh);
                ekgiVarH.i("spot_sync", ahjrVar17.li);
                ekgiVarH.i("sync_rcs_groups", ahjrVar17.lj);
                ekgiVarH.i("tachygram_add_user_to_group", ahjrVar17.ll);
                ekgiVarH.i("tachygram_create_group", ahjrVar17.lm);
                ekgiVarH.i("tachygram_get_group_info", ahjrVar17.ln);
                ekgiVarH.i("tachygram_inbox_message_retry", ahjrVar17.lq);
                ekgiVarH.i("tachygram_remove_user_from_group", ahjrVar17.lr);
                ekgiVarH.i("tachygram_revoke_message", ahjrVar17.ls);
                ekgiVarH.i("tachygram_send_message", ahjrVar17.bA);
                ekgiVarH.i("tachygram_update_group", ahjrVar17.lt);
                ekgiVarH.i("thumbnail_download_completed", ahjrVar17.lu);
                ekgiVarH.i("tombstone_manager_on_rcs_group_e2ee_status_change", ahjrVar17.lv);
                ekgiVarH.i("undelivered_message_fallback", ahjrVar17.lw);
                ekgiVarH.i("unregister_google_rcs_call", ahnhVar16.akW);
                ekgiVarH.i("UPDATE_ARCHIVE_STATUS", ahnhVar16.akX);
                ekgiVarH.i("update_conversation_encryption_status", ahjrVar17.lx);
                ekgiVarH.i("update_timestamp_in_telephony", ahjrVar17.ly);
                ekgiVarH.i("update_unread_counter", ahknVar17.pA);
                ekgiVarH.i("upload_attachments_to_blobstore", ahjrVar17.lz);
                ekgiVarH.i("vendor_ims_call", ahnhVar16.alc);
                ekgiVarH.i("EmotifyReactionDatabaseUpdateHandler", ahnhVar16.ald);
                ekgiVarH.i("key_package_upload_work_handler", ahjrVar17.lA);
                ekgiVarH.i("TelephonyDatabaseUpdateWorkItemHandler", ahjrVar17.lB);
                ekgiVarH.i("chatapi_incoming_group_chat_notification_message", ahjrVar17.lH);
                ekgiVarH.i("incremental_contacts_import", ahjrVar17.lI);
                ekgiVarH.i("load_paged_conversation_timeout_fallback", ahjrVar17.lN);
                ekgiVarH.i("low_storage", ahnhVar16.aly);
                ekgiVarH.i("mark_messages_as_read_handler", ahjrVar17.lO);
                ekgiVarH.i("mark_rcs_messages_in_telephony", ahjrVar17.lP);
                ekgiVarH.i("otp_deletion_handler", ahjrVar17.lQ);
                ekgiVarH.i("p13n_work", ahjrVar17.lR);
                ekgiVarH.i("parent_allowlist_update", ahjrVar17.lT);
                ekgiVarH.i("penpal_bot_recipient_restore", ahjrVar17.lU);
                ekgiVarH.i("penpal_conversation_auto_generate", ahjrVar17.lW);
                ekgiVarH.i("process_rcs_group_notify", ahjrVar17.lX);
                ekgiVarH.i("rbm_business_info_retrieval", ahjrVar17.lY);
                ekgiVarH.i("rbm_chatbot_directory_welcome_message", ahjrVar17.lZ);
                ekgiVarH.i("recover_disabled_rcs_group", ahjrVar17.ma);
                ekgiVarH.i("reflection_attachment_completed_handler_module", ahjrVar17.mc);
                ekgiVarH.i("reflection_attachment_persistent_handler_module", ahjrVar17.me);
                ekgiVarH.i("request_link_preview", ahjrVar17.mh);
                ekgiVarH.i("request_smart_suggestions", ahjrVar17.mi);
                ekgiVarH.i("retrieve_questionnaire", ahjrVar17.mj);
                ekgiVarH.i("ReverseTelephonySync", ahjrVar17.mk);
                ekgiVarH.i("chatapi_revoke_chat_message_response", ahjrVar17.ml);
                ekgiVarH.i("rich_card_media_uri_cleanup", ahjrVar17.mm);
                ekgiVarH.i("satellite_network_state_updater", ahjrVar17.mn);
                ekgiVarH.i("schedule_contacts_import", ahjrVar17.mo);
                ekgiVarH.i("schedule_delete_and_import_contacts", ahjrVar17.mq);
                ekgiVarH.i("sim_state_update", ahnhVar16.amw);
                ekgiVarH.i("start_heavy_work", ahjrVar17.ms);
                ekgiVarH.i("sync_conversation_data_to_wearable", ahnhVar16.amz);
                ekgiVarH.i("sync_data_to_wearable_app", ahjrVar17.mt);
                ekgiVarH.i("sync_group_then_encryption_status", ahjrVar17.mu);
                ekgiVarH.i("UPDATE_MARK_UNREAD", ahnhVar16.amD);
                ekgiVarH.i("update_rcs_group_name", ahjrVar17.mv);
                ekgiVarH.i("CopyFileTelephonyPartHandler", ahnhVar16.amF);
                ekgiVarH.i("cms_drop_unscheduled_item_to_dlq", ahjrVar17.mw);
                return ekgiVarH.h();
            case 32:
                return bzpu.a(this.a.a.gp(), this.b.ca());
            case 33:
                ahkn ahknVar18 = this.a;
                ahjr ahjrVar18 = this.b;
                ahnh ahnhVar17 = ahknVar18.a;
                eyik eyikVar14 = ahnhVar17.qG;
                Optional optionalOf = Optional.of(ahjrVar18.S);
                eyik eyikVar15 = ahnhVar17.c;
                eyik eyikVar16 = ahnhVar17.pQ;
                eyik eyikVar17 = ahnhVar17.aaM;
                eyik eyikVar18 = ahjrVar18.U;
                eyik eyikVar19 = ahnhVar17.qo;
                eyik eyikVar20 = ahnhVar17.so;
                dqsn dqsnVar = (dqsn) ahnhVar17.qq.b();
                eyik eyikVar21 = ahknVar18.cD;
                eyik eyikVar22 = ahjrVar18.W;
                eyik eyikVar23 = ahknVar18.eL;
                cogw cogwVar = (cogw) eyikVar21.b();
                eyik eyikVar24 = ahnhVar17.QL;
                eyik eyikVar25 = ahnhVar17.vh;
                eyik eyikVar26 = ahnhVar17.qi;
                eyik eyikVar27 = ahnhVar17.pB;
                eyik eyikVar28 = ahjrVar18.f2if;
                eyik eyikVar29 = ahnhVar17.pT;
                eyik eyikVar30 = ahjrVar18.ig;
                eyik eyikVar31 = ahjrVar18.ii;
                eyik eyikVar32 = ahnhVar17.pV;
                eyik eyikVar33 = ahnhVar17.qa;
                eyik eyikVar34 = ahnhVar17.Gu;
                eyik eyikVar35 = ahnhVar17.pl;
                eyik eyikVar36 = ahjrVar18.hz;
                eyik eyikVar37 = ahnhVar17.Bg;
                aqhc aqhcVar = (aqhc) eyikVar24.b();
                return new bapj(eyikVar14, optionalOf, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, dqsnVar, eyikVar22, eyikVar23, cogwVar, eyikVar25, eyikVar26, eyikVar27, ahjrVar18.bh, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, ahnhVar17.SQ, eyikVar34, eyikVar35, eyikVar36, ahnhVar17.Tn, eyikVar37, aqhcVar);
            case 34:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar18 = ahknVar19.a;
                eyik eyikVar38 = ahnhVar18.qJ;
                eyik eyikVar39 = ahnhVar18.uP;
                eyik eyikVar40 = ahnhVar18.xh;
                Context context = (Context) ahknVar19.t.b();
                eyik eyikVar41 = ahknVar19.cD;
                eyik eyikVar42 = ahnhVar18.uo;
                cogw cogwVar2 = (cogw) eyikVar41.b();
                eyik eyikVar43 = ahknVar19.aJ;
                eyik eyikVar44 = ahnhVar18.qj;
                eyik eyikVar45 = ahnhVar18.aaJ;
                eosc eoscVar2 = (eosc) eyikVar43.b();
                eosc eoscVar3 = (eosc) ahknVar19.y.b();
                eosd eosdVar = (eosd) ahknVar19.p.b();
                ahjr ahjrVar19 = this.b;
                return new damh(eyikVar38, eyikVar39, eyikVar40, context, eyikVar42, cogwVar2, eyikVar44, eyikVar45, eoscVar2, eoscVar3, eosdVar, Optional.empty(), ahjrVar19.dw, (crsx) ahjrVar19.ie.b(), ahnhVar18.aaL, ahnhVar18.pl);
            case 35:
                return new ajso(this.b.au);
            case 36:
                ahjr ahjrVar20 = this.b;
                ahnh ahnhVar19 = this.a.a;
                return new ajtf(ahjrVar20.hh(), ahnhVar19.qa, ahnhVar19.pl);
            case 37:
                ahjr ahjrVar21 = this.b;
                ahnh ahnhVar20 = this.a.a;
                return new amyo(ahjrVar21.hP, ahnhVar20.zb, ahnhVar20.zc, ahnhVar20.zf);
            case 38:
                ahkn ahknVar20 = this.a;
                ahjr ahjrVar22 = this.b;
                ahnh ahnhVar21 = ahknVar20.a;
                return new amoa(ahnhVar21.m, ahjrVar22.fK, ahknVar20.cD, ahnhVar21.yL, ahnhVar21.yO, ahnhVar21.yP, ahjrVar22.hO, ahnhVar21.yV, ahnhVar21.yW, ahnhVar21.yX, ahnhVar21.yY, ahnhVar21.yZ);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahkn ahknVar21 = this.a;
                ahjr ahjrVar23 = this.b;
                eyik eyikVar46 = ahknVar21.p;
                ahnh ahnhVar22 = ahknVar21.a;
                return new amzx(eyikVar46, ahknVar21.aJ, ahknVar21.y, ahknVar21.is, ahnhVar22.yx, ahnhVar22.yB, ahjrVar23.fV, ahnhVar22.yF, ahjrVar23.J, ahknVar21.ez, ahjrVar23.ar, ahnhVar22.qa, ahknVar21.cD, ahnhVar22.tC, ahnhVar22.yG, ahnhVar22.tB, ahnhVar22.yH, ahnhVar22.yI, ahnhVar22.yJ);
            case 40:
                ahjr ahjrVar24 = this.b;
                cjol cjolVar = (cjol) ahjrVar24.H.b();
                return new cjox(cjolVar);
            case 41:
                return new ahjm(this);
            case 42:
                ahkn ahknVar22 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar22.cA.b();
                ahnh ahnhVar23 = ahknVar22.a;
                return new cnlh(fcyhVar, (fdjx) ahnhVar23.oS.b(), (fdjx) ahnhVar23.m.b(), ahnhVar23.xQ, ahnhVar23.xT, ahnhVar23.xU, ahnhVar23.se, ahnhVar23.xV, this.b.gs());
            case 43:
                return new ahjn(this);
            case 44:
                ahjr ahjrVar25 = this.b;
                ahkn ahknVar23 = this.a;
                eyik eyikVar47 = ahjrVar25.i;
                ehtz ehtzVar7 = (ehtz) ahknVar23.in.b();
                ehuj ehujVar7 = (ehuj) ahknVar23.eo.b();
                ahnh ahnhVar24 = ahknVar23.a;
                return cerm.a(eyikVar47, ehtzVar7, ehujVar7, (esmm) ahnhVar24.tZ.b(), ejwi.h(), ahnhVar24.mJ());
            case 45:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar25 = ahknVar24.a;
                return new awiz((awgx) ahnhVar25.sD.b(), (awgx) ahnhVar25.sE.b(), ahnhVar25.sH, ahnhVar25.pB, (fcyh) ahknVar24.cz.b(), (fdjx) ahnhVar25.m.b(), (awzf) ahnhVar25.sI.b(), (awyu) ahnhVar25.qB.b(), this.b.G);
            case 46:
                ahjr ahjrVar26 = this.b;
                awjh awjhVar = (awjh) ahjrVar26.E.b();
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar26 = ahknVar25.a;
                return new awmk(awjhVar, (awzf) ahnhVar26.sI.b(), (awgx) ahknVar25.dW.b(), (awgx) ahknVar25.dX.b(), ahjrVar26.F, ahnhVar26.pT, (fdjx) ahnhVar26.m.b(), (fcyh) ahknVar25.cA.b(), ahnhVar26.dZ(), (eizx) ahknVar25.dY.b(), (eizx) ahknVar25.dZ.b(), ahnhVar26.dY(), ahnhVar26.bZ(), (awlc) ahnhVar26.sN.b(), ahnhVar26.ca(), (awxo) ahnhVar26.sP.b());
            case 47:
                ahnh ahnhVar27 = this.a.a;
                aocw aocwVar = (aocw) ahnhVar27.Zq.b();
                this.b.hP();
                aofb.a(aocwVar);
                return aocwVar;
            case 48:
                return new ahjo(this);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new aofz(this.b.K);
            case 50:
                ahjr ahjrVar27 = this.b;
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar28 = ahknVar26.a;
                return new aogk(ahjrVar27.J, ahknVar26.dK, ahknVar26.y, ahnhVar28.sk, eyil.a(ahnhVar28.sl));
            case 51:
                ahkn ahknVar27 = this.a;
                ahjr ahjrVar28 = this.b;
                eyik eyikVar48 = ahknVar27.bM;
                ahnh ahnhVar29 = ahknVar27.a;
                return new chtk(ahnhVar29.rW, ahjrVar28.I, ahjrVar28.F, ahnhVar29.Zt, ahnhVar29.pT, ahnhVar29.se, ahnhVar29.pB, (fcyh) eyikVar48.b(), (fcyh) ahknVar27.cA.b(), (fdjx) ahnhVar29.m.b());
            case 52:
                ahkn ahknVar28 = this.a;
                ahjr ahjrVar29 = this.b;
                ahnh ahnhVar30 = ahknVar28.a;
                return new aoie(ahnhVar30.xI, ahnhVar30.se, ahnhVar30.Zc, ahnhVar30.qB, ahjrVar29.M);
            case 53:
                ahkn ahknVar29 = this.a;
                ahjr ahjrVar30 = this.b;
                ahnh ahnhVar31 = ahknVar29.a;
                return new aoin(ahnhVar31.pT, ahnhVar31.rW, ahnhVar31.qi, ahjrVar30.J, ahnhVar31.sp);
            case 54:
                ahkn ahknVar30 = this.a;
                ahjr ahjrVar31 = this.b;
                ahnh ahnhVar32 = ahknVar30.a;
                return new aohw(ahnhVar32.wH, ahnhVar32.VZ, ahjrVar31.hM, (Context) ahknVar30.t.b());
            case 55:
                ahjr ahjrVar32 = this.b;
                ahkn ahknVar31 = this.a;
                eyik eyikVar49 = ahjrVar32.F;
                ahnh ahnhVar33 = ahknVar31.a;
                return new ayee(eyikVar49, ahjrVar32.aB, ahjrVar32.aC, ahnhVar33.pf, ahnhVar33.pB, ahnhVar33.uy, ahnhVar33.us, ahjrVar32.aM, ahjrVar32.hL, ahjrVar32.U, ahnhVar33.qq, ahnhVar33.qi, ahknVar31.t);
            case 56:
                ahkn ahknVar32 = this.a;
                Context context2 = (Context) ahknVar32.t.b();
                ahnh ahnhVar34 = ahknVar32.a;
                eyik eyikVar50 = ahnhVar34.qG;
                dqsn dqsnVar2 = (dqsn) ahnhVar34.qq.b();
                ahjr ahjrVar33 = this.b;
                eyik eyikVar51 = ahknVar32.cD;
                return new baqi(context2, eyikVar50, dqsnVar2, ahjrVar33.cB, ahjrVar33.ar, ahjrVar33.F, ahnhVar34.WQ, (cogw) eyikVar51.b(), (bxlc) ahjrVar33.U.b(), ahnhVar34.bh(), ahnhVar34.bj(), ahknVar32.it, (aqhc) ahnhVar34.QL.b());
            case 57:
                ahjr ahjrVar34 = this.b;
                ahnh ahnhVar35 = this.a.a;
                return new cpgh(ahjrVar34.F, ahjrVar34.R, ahnhVar35.uN, (bxlc) ahjrVar34.U.b(), (aypj) ahjrVar34.gb.b(), (dqsn) ahnhVar35.qq.b(), ahjrVar34.dN, (aijz) ahnhVar35.WP.b(), ahjrVar34.fK());
            case 58:
                ahjr ahjrVar35 = this.b;
                return new bare(ahjrVar35.F, (dqsn) this.a.a.qq.b(), ahjrVar35.Q);
            case 59:
                return new cawk(this.a.a.rF);
            case 60:
                ahkn ahknVar33 = this.a;
                Context context3 = (Context) ahknVar33.t.b();
                dqsn dqsnVar3 = (dqsn) ahknVar33.a.qq.b();
                egzh egzhVar = (egzh) ahknVar33.aQ.b();
                ahjr ahjrVar36 = this.b;
                return new bxlc(context3, dqsnVar3, egzhVar, Optional.of(ahjrVar36.S), ahjrVar36.T, ahknVar33.dh, (eosc) ahknVar33.aJ.b(), (eosc) ahknVar33.p.b());
            case 61:
                return new caxb(this.a.a.rF);
            case 62:
                ahkn ahknVar34 = this.a;
                ahjr ahjrVar37 = this.b;
                eyik eyikVar52 = ahknVar34.t;
                ahnh ahnhVar36 = ahknVar34.a;
                return new axsc(eyikVar52, ahknVar34.cD, ahnhVar36.pB, ahnhVar36.c, ahnhVar36.yw, ahnhVar36.uv, ahnhVar36.qq, ahnhVar36.pE, ahnhVar36.Nz, ahjrVar37.bJ, ahnhVar36.NH, ahnhVar36.wv, ahjrVar37.F, ahnhVar36.JE, ahjrVar37.dN, ahnhVar36.qr, ahnhVar36.uM, ahnhVar36.qG, ahnhVar36.WN, ahnhVar36.WO);
            case Function.ALT_CONVENTION /* 63 */:
                ahkn ahknVar35 = this.a;
                ahjr ahjrVar38 = this.b;
                ahnh ahnhVar37 = ahknVar35.a;
                return new bxiu(ahnhVar37.c, ahnhVar37.uv, Optional.of(ahjrVar38.hK), ahjrVar38.bo);
            case 64:
                ahkn ahknVar36 = this.a;
                Context context4 = (Context) ahknVar36.t.b();
                ahnh ahnhVar38 = ahknVar36.a;
                dqsn dqsnVar4 = (dqsn) ahnhVar38.qq.b();
                ahjr ahjrVar39 = this.b;
                eyik eyikVar53 = ahjrVar39.W;
                eyik eyikVar54 = ahjrVar39.F;
                eyik eyikVar55 = ahjrVar39.hH;
                cmqj cmqjVar = (cmqj) ahnhVar38.uv.b();
                bveg bvegVar = (bveg) ahnhVar38.yx.b();
                bahv bahvVar = (bahv) ahnhVar38.un.b();
                bywf bywfVarBA = ahjrVar39.bA();
                cmgk cmgkVar = (cmgk) ahnhVar38.qK.b();
                cogw cogwVar3 = (cogw) ahknVar36.cD.b();
                eosc eoscVar4 = (eosc) ahknVar36.aJ.b();
                return new cnoc(context4, dqsnVar4, eyikVar53, eyikVar54, eyikVar55, ahjrVar39.aA, cmqjVar, bvegVar, bahvVar, bywfVarBA, cmgkVar, cogwVar3, eoscVar4, ahnhVar38.rc, ahnhVar38.qr, ahnhVar38.CO, ahnhVar38.pf, ahnhVar38.uD, ahnhVar38.qG, (Optional) ahknVar36.kd.b(), ahjrVar39.hJ, ahnhVar38.CR, ahnhVar38.Cq, ahnhVar38.CU, ahnhVar38.uv, ahjrVar39.aD, ahjrVar39.bo, ahknVar36.ke, ahnhVar38.CV, ahnhVar38.CW, ahnhVar38.Dj, (apsl) ahnhVar38.Dk.b(), ahnhVar38.Dn);
            case 65:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar39 = ahknVar37.a;
                Optional optionalOf2 = Optional.of(ahnhVar39.wt);
                ahjr ahjrVar40 = this.b;
                return new bbca(optionalOf2, Optional.of(ahjrVar40.fB), ahnhVar39.bv(), ahnhVar39.pE, ahnhVar39.qG, ahjrVar40.hD, ahnhVar39.qq, ahknVar37.nw, ahnhVar39.qs, ahnhVar39.Ab, ahjrVar40.U, ahnhVar39.pV, ahjrVar40.hG, (axjq) ahnhVar39.qz.b(), ahnhVar39.Ak, ahjrVar40.ao);
            case 66:
                ahkn ahknVar38 = this.a;
                dcsx dcsxVar = (dcsx) ahknVar38.gI.b();
                ahnh ahnhVar40 = ahknVar38.a;
                fdjx fdjxVar = (fdjx) ahnhVar40.oS.b();
                ahjr ahjrVar41 = this.b;
                return new csxg(dcsxVar, fdjxVar, ahjrVar41.hC, ahnhVar40.qi, ahknVar38.gH, (cogw) ahknVar38.cD.b(), ahnhVar40.bv(), ahnhVar40.bw(), ahjrVar41.dC, ahjrVar41.ar);
            case 67:
                ahkn ahknVar39 = this.a;
                return new csxj((bbdl) ahknVar39.a.qG.b(), (cogw) ahknVar39.cD.b(), this.b.cU);
            case 68:
                ahkn ahknVar40 = this.a;
                ahjr ahjrVar42 = this.b;
                ahnh ahnhVar41 = ahknVar40.a;
                return new byeb(ahnhVar41.wv, ahjrVar42.F, ahjrVar42.ar, ahjrVar42.aB, (cmuq) ahnhVar41.wJ.b(), (cogw) ahknVar40.cD.b(), (ains) ahnhVar41.c.b(), ahnhVar41.qG, (bxlc) ahjrVar42.U.b(), (axjf) ahnhVar41.so.b(), (bbfn) ahnhVar41.CF.b(), (dqsn) ahnhVar41.qq.b(), (bveg) ahnhVar41.yx.b(), Optional.empty(), ahjrVar42.X, ahknVar40.ie, ahjrVar42.aC, ahjrVar42.I, ahnhVar41.qi, ahnhVar41.pl, (eosc) ahknVar40.y.b());
            case 69:
                ahkn ahknVar41 = this.a;
                ahjr ahjrVar43 = this.b;
                ahnh ahnhVar42 = ahknVar41.a;
                return new baxe(ahnhVar42.qo, ahnhVar42.yx, ahjrVar43.V, ahknVar41.ie, ahjrVar43.W, ahjrVar43.F, ahnhVar42.qq, ahjrVar43.U, ahnhVar42.Xg, ahnhVar42.qi, ahnhVar42.un, ahjrVar43.X, ahknVar41.kx, ahnhVar42.Xh, ahnhVar42.tA);
            case 70:
                ahkn ahknVar42 = this.a;
                ahjr ahjrVar44 = this.b;
                ahnh ahnhVar43 = ahknVar42.a;
                return new bbae(ahknVar42.t, ahnhVar43.un, ahnhVar43.uG, ahjrVar44.U, ahnhVar43.qq);
            case 71:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar44 = ahknVar43.a;
                dqsn dqsnVar5 = (dqsn) ahnhVar44.qq.b();
                ahjr ahjrVar45 = this.b;
                return new bauh(dqsnVar5, ahjrVar45.U, ahknVar43.ez, ahnhVar44.uM, ahnhVar44.uG, ahjrVar45.W, ahjrVar45.eN, ahnhVar44.qi, (cogw) ahknVar43.cD.b(), ahnhVar44.Io);
            case 72:
                ahkn ahknVar44 = this.a;
                return new bays((fcyh) ahknVar44.cz.b(), (fcyh) ahknVar44.bM.b(), (fdjx) ahknVar44.a.m.b(), eyie.a(this.b.eM));
            case 73:
                ahjr ahjrVar46 = this.b;
                ahnh ahnhVar45 = this.a.a;
                return ekhx.v(ahjrVar46.e(), ahnhVar45.l(), ahjrVar46.cM(), ahnhVar45.au(), new abul(), ahjrVar46.eM(), ahjrVar46.eO(), ahjrVar46.dT(), ahjrVar46.m78do(), ahnhVar45.jk(), ahjrVar46.I(), ahjrVar46.w(), ahjrVar46.C(), ahjrVar46.eT(), ahnhVar45.jV(), ahjrVar46.fL(), ahnhVar45.lG(), ahjrVar46.h());
            case 74:
                ahkn ahknVar45 = this.a;
                ahjr ahjrVar47 = this.b;
                return new ckdc(ahknVar45.a.yx, ahjrVar47.X, ahknVar45.ez, ahjrVar47.Y);
            case 75:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar46 = ahknVar46.a;
                return new cdys(this.b.dm(), (eosd) ahknVar46.p.b(), (appk) ahnhVar46.HQ.b());
            case 76:
                return new ckfa((bxlc) this.b.U.b());
            case 77:
                return new bbhh(this.b.aG(), this.a.a.qq);
            case 78:
                ahjr ahjrVar48 = this.b;
                ahkn ahknVar47 = this.a;
                ajxb ajxbVarK = ahjrVar48.K();
                ahknVar47.jb();
                eyik eyikVar56 = ahknVar47.cD;
                eyik eyikVar57 = ahjrVar48.gW;
                eyik eyikVar58 = ahjrVar48.U;
                eyik eyikVar59 = ahjrVar48.F;
                eyik eyikVar60 = ahjrVar48.gY;
                eyik eyikVar61 = ahjrVar48.hj;
                eyik eyikVar62 = ahjrVar48.fG;
                eyik eyikVar63 = ahjrVar48.hk;
                eyik eyikVar64 = ahjrVar48.gR;
                ahnh ahnhVar47 = ahknVar47.a;
                eyik eyikVar65 = ahnhVar47.sh;
                cogw cogwVar4 = (cogw) eyikVar56.b();
                eosc eoscVar5 = (eosc) ahknVar47.p.b();
                eosc eoscVar6 = (eosc) ahknVar47.y.b();
                eosc eoscVar7 = (eosc) ahknVar47.aJ.b();
                byeq byeqVar = (byeq) ahnhVar47.sG.b();
                eyik eyikVar66 = ahjrVar48.hl;
                eyik eyikVar67 = ahjrVar48.dV;
                akfs akfsVar = (akfs) ahjrVar48.fE.b();
                eyik eyikVar68 = ahnhVar47.QL;
                eyik eyikVar69 = ahjrVar48.hn;
                eyik eyikVar70 = ahjrVar48.ho;
                eyik eyikVar71 = ahnhVar47.Pb;
                eyik eyikVar72 = ahjrVar48.hq;
                eyik eyikVar73 = ahjrVar48.hr;
                eyik eyikVar74 = ahjrVar48.hs;
                eyik eyikVar75 = ahjrVar48.hv;
                eyik eyikVar76 = ahjrVar48.hw;
                eyik eyikVar77 = ahjrVar48.hy;
                aqhc aqhcVar2 = (aqhc) eyikVar68.b();
                eyik eyikVar78 = ahjrVar48.hz;
                eyik eyikVar79 = ahnhVar47.OY;
                eyik eyikVar80 = ahnhVar47.Ti;
                eyik eyikVar81 = ahnhVar47.Tj;
                eyik eyikVar82 = ahnhVar47.Tk;
                eyik eyikVar83 = ahnhVar47.Sn;
                eyik eyikVar84 = ahnhVar47.Pa;
                eyik eyikVar85 = ahjrVar48.hA;
                eyik eyikVar86 = ahnhVar47.Tm;
                eyik eyikVar87 = ahjrVar48.as;
                eyik eyikVar88 = ahnhVar47.Bg;
                eyik eyikVar89 = ahnhVar47.Tn;
                eyik eyikVar90 = ahjrVar48.hB;
                eyik eyikVar91 = ahjrVar48.bh;
                return new ajzc(ajxbVarK, eyikVar57, eyikVar58, eyikVar59, eyikVar60, eyikVar61, ahjrVar48.cB, eyikVar62, ahnhVar47.SF, ahjrVar48.cU, eyikVar63, ahnhVar47.SN, eyikVar64, eyikVar65, cogwVar4, eoscVar5, eoscVar6, eoscVar7, byeqVar, eyikVar66, eyikVar91, eyikVar67, akfsVar, eyikVar69, eyikVar70, eyikVar71, eyikVar72, eyikVar73, eyikVar74, eyikVar75, eyikVar76, eyikVar77, aqhcVar2, eyikVar78, eyikVar79, eyikVar80, eyikVar81, eyikVar82, eyikVar83, eyikVar84, eyikVar85, eyikVar86, eyikVar87, eyikVar88, eyikVar89, eyikVar90);
            case 79:
                ahkn ahknVar48 = this.a;
                Context context5 = (Context) ahknVar48.t.b();
                eosc eoscVar8 = (eosc) ahknVar48.p.b();
                eosc eoscVar9 = (eosc) ahknVar48.aJ.b();
                ahjr ahjrVar49 = this.b;
                aokp aokpVarAc = ahjrVar49.ac();
                cqtp cqtpVar = (cqtp) ahknVar48.dK.b();
                ahnh ahnhVar48 = ahknVar48.a;
                return new antf(context5, eoscVar8, eoscVar9, aokpVarAc, cqtpVar, (alrj) ahnhVar48.qi.b(), ahjrVar49.Z(), (anuh) ahnhVar48.zO.b(), ahjrVar49.aj, ahnhVar48.zW, ahnhVar48.zX, ahnhVar48.zY, ahnhVar48.zZ, ahnhVar48.Aa, ahknVar48.cW, ahjrVar49.W, ahnhVar48.qq, ahjrVar49.ao, Optional.of(ahjrVar49.ab()), Optional.of(ahjrVar49.fB), ahknVar48.jn);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                ahkn ahknVar49 = this.a;
                return eigr.a(ahknVar49.X.b(), ahknVar49.aH, this.b.hz());
            case 81:
                ahkn ahknVar50 = this.a;
                ahjr ahjrVar50 = this.b;
                ahnh ahnhVar49 = ahknVar50.a;
                return new choz(ahknVar50.p, ahjrVar50.ag, ahnhVar49.m, ahnhVar49.zB, ahnhVar49.zH);
            case 82:
                return Optional.of(eyie.a(this.b.af));
            case 83:
                ahjr ahjrVar51 = this.b;
                egmr egmrVar = (egmr) ahjrVar51.ad.b();
                ahkn ahknVar51 = this.a;
                return new choe(egmrVar, (fdjx) ahknVar51.a.m.b(), (cogw) ahknVar51.cD.b(), (eilt) ahjrVar51.ae.b());
            case 84:
                ahkn ahknVar52 = this.a;
                diep diepVar = (diep) ahknVar52.l.b();
                evrr evrrVar = (evrr) ahknVar52.b.gp.b();
                eosc eoscVar10 = (eosc) ahknVar52.p.b();
                ahjr ahjrVar52 = this.b;
                ahjrVar52.hT();
                return chns.a(diepVar, evrrVar, eoscVar10, chof.a(), ahjrVar52.ge());
            case 85:
                return new eilt((eigp) this.b.ac.b());
            case 86:
                ahkn ahknVar53 = this.a;
                return new anvt((fdjx) ahknVar53.a.m.b(), (fcyh) ahknVar53.cA.b(), this.b.ai);
            case 87:
                ahkn ahknVar54 = this.a;
                ahjr ahjrVar53 = this.b;
                ahnh ahnhVar50 = ahknVar54.a;
                return new bbcw(ahnhVar50.qi, ahjrVar53.F, ahnhVar50.zO, ahjrVar53.W, (dqsn) ahnhVar50.qq.b(), ahnhVar50.qx, eyie.a(ahknVar54.jk), eyie.a(ahknVar54.jl), ahnhVar50.zQ, ahnhVar50.qw, ahnhVar50.zR, ahnhVar50.pQ, ahnhVar50.pM);
            case 88:
                ahkn ahknVar55 = this.a;
                ahnh ahnhVar51 = ahknVar55.a;
                alrj alrjVar = (alrj) ahnhVar51.qi.b();
                eyik eyikVar92 = ahnhVar51.Ab;
                eyik eyikVar93 = ahnhVar51.zM;
                eyik eyikVar94 = ahnhVar51.pb;
                fdjx fdjxVar2 = (fdjx) ahnhVar51.oQ.b();
                ahjr ahjrVar54 = this.b;
                return new aoan(alrjVar, eyikVar92, eyikVar93, eyikVar94, fdjxVar2, ahnhVar51.pf, ahnhVar51.Af, ahnhVar51.Ag, ahnhVar51.sG, ahknVar55.cE, ahjrVar54.al, ahjrVar54.an, ahnhVar51.rc, ahnhVar51.Ar, ahnhVar51.Ap, ahnhVar51.As);
            case 89:
                ahkn ahknVar56 = this.a;
                eyik eyikVar95 = ahknVar56.aJ;
                ahnh ahnhVar52 = ahknVar56.a;
                eyik eyikVar96 = ahnhVar52.Ah;
                eosc eoscVar11 = (eosc) eyikVar95.b();
                eosc eoscVar12 = (eosc) ahknVar56.y.b();
                eosc eoscVar13 = (eosc) ahknVar56.p.b();
                eygg eyggVarA = eyie.a(ahnhVar52.zQ);
                eyik eyikVar97 = ahknVar56.cE;
                eyik eyikVar98 = ahnhVar52.qq;
                dzuc dzucVar = (dzuc) eyikVar97.b();
                ahjr ahjrVar55 = this.b;
                return new aweh(eyikVar96, eoscVar11, eoscVar12, eoscVar13, eyggVarA, eyikVar98, dzucVar, ahjrVar55.F, ahnhVar52.pQ, ahnhVar52.Ai, ahnhVar52.pV, ahjrVar55.ak, ahnhVar52.pM, ahknVar56.jm, ahnhVar52.pA, ahnhVar52.Ak, ahnhVar52.Al);
            case 90:
                return new avor(this.b.F, this.a.a.pV);
            case 91:
                ahkn ahknVar57 = this.a;
                Context context6 = (Context) ahknVar57.t.b();
                fcyh fcyhVar2 = (fcyh) ahknVar57.cz.b();
                ahnh ahnhVar53 = ahknVar57.a;
                return new avgc(context6, fcyhVar2, ahnhVar53.oS, ahknVar57.cA, (Executor) ahknVar57.p.b(), (egxv) this.b.am.b(), ahnhVar53.An, ahnhVar53.Ao, ahknVar57.cD, ahnhVar53.Ap);
            case 92:
                ahkn ahknVar58 = this.a;
                egrq egrqVarEj = ahknVar58.ej();
                Context context7 = (Context) ahknVar58.t.b();
                eosc eoscVar14 = (eosc) ahknVar58.aJ.b();
                return new egxv(egrqVarEj, context7, eoscVar14);
            case 93:
                return Optional.of(this.b.ev());
            case 94:
                ahkn ahknVar59 = this.a;
                auau auauVar = (auau) ahknVar59.ez.b();
                cgxw cgxwVar = (cgxw) this.b.de.b();
                ahnh ahnhVar54 = ahknVar59.a;
                return new chfz(auauVar, cgxwVar, (awlc) ahnhVar54.If.b(), (fdjx) ahnhVar54.m.b(), ahnhVar54.cA());
            case 95:
                ahjr ahjrVar56 = this.b;
                ahkn ahknVar60 = this.a;
                eyik eyikVar99 = ahknVar60.cD;
                ahnh ahnhVar55 = ahknVar60.a;
                Map mapHm = ahjrVar56.hm();
                cgyb cgybVarDU = ahjrVar56.dU();
                cgzo cgzoVarDV = ahjrVar56.dV();
                chaw chawVarCg = ahknVar60.cg();
                cgxi cgxiVarIy = ahnhVar55.iy();
                cgxu cgxuVarIz = ahnhVar55.iz();
                chbf chbfVarIC = ahnhVar55.iC();
                cogw cogwVar5 = (cogw) eyikVar99.b();
                eyik eyikVar100 = ahknVar60.cA;
                chab chabVarCf = ahknVar60.cf();
                arrm arrmVarCo = ahnhVar55.co();
                fcyh fcyhVar3 = (fcyh) eyikVar100.b();
                fdjx fdjxVar3 = (fdjx) ahnhVar55.oQ.b();
                fdjx fdjxVar4 = (fdjx) ahnhVar55.m.b();
                aryk arykVar = (aryk) ahnhVar55.LM.b();
                ahnhVar55.sf();
                return new cgzi(mapHm, cgybVarDU, cgzoVarDV, chawVarCg, cgxiVarIy, cgxuVarIz, chbfVarIC, cogwVar5, chabVarCf, arrmVarCo, fcyhVar3, fdjxVar3, fdjxVar4, arykVar);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahjr ahjrVar57 = this.b;
                ahnh ahnhVar56 = this.a.a;
                return chez.a(ahjrVar57.ei(), ahjrVar57.ek(), ahjrVar57.ej(), ahnhVar56.iQ(), ahnhVar56.iP(), ahjrVar57.eh(), (aryq) ahnhVar56.TK.b(), (aryp) ahnhVar56.TL.b());
            case 97:
                ahnh ahnhVar57 = this.a.a;
                ccpm ccpmVar = (ccpm) ahnhVar57.tI.b();
                cbun cbunVar = (cbun) ahnhVar57.yy.b();
                ahjr ahjrVar58 = this.b;
                return new ccsu(ccpmVar, cbunVar, (ccer) ahjrVar58.at.b(), (atzy) ahjrVar58.av.b());
            case 98:
                return new ccer((cbqj) this.b.as.b());
            case 99:
                ahkn ahknVar61 = this.a;
                return new cbqu(ahknVar61.a.qq, (cogw) ahknVar61.cD.b(), (bxlc) this.b.U.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                ahjr ahjrVar = this.b;
                return new auae((ajln) ahjrVar.au.b(), (aofc) ahjrVar.I.b(), (aoew) this.a.a.FM.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ahjr ahjrVar2 = this.b;
                ahkn ahknVar = this.a;
                return new asro(ahjrVar2.E, ahjrVar2.G, ahjrVar2.ax, ahknVar.a.bF());
            case 102:
                return new ahjp(this);
            case 103:
                return bwvj.a(this.b.aX());
            case 104:
                ahjr ahjrVar3 = this.b;
                ahkn ahknVar2 = this.a;
                eyik eyikVar = ahknVar2.cA;
                bwki bwkiVarBi = ahjrVar3.bi();
                eyik eyikVar2 = ahjrVar3.ar;
                eyik eyikVar3 = ahjrVar3.fd;
                fcyh fcyhVar = (fcyh) eyikVar.b();
                ahnh ahnhVar = ahknVar2.a;
                return new bwkn(bwkiVarBi, eyikVar2, eyikVar3, fcyhVar, (fdjx) ahnhVar.oS.b(), ahnhVar.pb);
            case 105:
                return new baqx(this.a.a.c, this.b.aD);
            case 106:
                ahkn ahknVar3 = this.a;
                ahjr ahjrVar4 = this.b;
                ahnh ahnhVar2 = ahknVar3.a;
                return new ayjj(ahnhVar2.Cp, ahjrVar4.aA, ahjrVar4.aC, ahnhVar2.uy, ahnhVar2.Cr, ahnhVar2.Ct, ahnhVar2.Cu, ahnhVar2.qr, ahnhVar2.Cw);
            case 107:
                ahkn ahknVar4 = this.a;
                ahjr ahjrVar5 = this.b;
                ahnh ahnhVar3 = ahknVar4.a;
                return new baqt(ahnhVar3.c, ahjrVar5.az, ahnhVar3.qi, ahjrVar5.F);
            case 108:
                ahkn ahknVar5 = this.a;
                ahjr ahjrVar6 = this.b;
                ahnh ahnhVar4 = ahknVar5.a;
                return new bxjb(ahnhVar4.uy, ahjrVar6.ar, ahnhVar4.c, (cmqj) ahnhVar4.uv.b(), ahnhVar4.qi, ahnhVar4.qx, ahnhVar4.AE);
            case 109:
                ahjr ahjrVar7 = this.b;
                ahnh ahnhVar5 = this.a.a;
                return new cdww(ahjrVar7.U, (dqsn) ahnhVar5.qq.b(), ahnhVar5.uG, ahjrVar7.ar, ahjrVar7.F, ahjrVar7.aB, ahnhVar5.pQ, ahnhVar5.AN, (arkz) ahnhVar5.AO.b(), ahnhVar5.AP);
            case 110:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar6 = ahknVar6.a;
                dqsn dqsnVar = (dqsn) ahnhVar6.qq.b();
                cogw cogwVar = (cogw) ahknVar6.cD.b();
                ahjr ahjrVar8 = this.b;
                return new celq(dqsnVar, cogwVar, eyie.a(ahjrVar8.aF), (aqvc) ahnhVar6.to.b(), eyie.a(ahjrVar8.aJ));
            case 111:
                return ekhx.r(this.b.aT(), new bwjx());
            case 112:
                return new ekph(this.b.aU());
            case 113:
                ahkn ahknVar7 = this.a;
                eosc eoscVar = (eosc) ahknVar7.y.b();
                ahjr ahjrVar9 = this.b;
                bwjw bwjwVar = (bwjw) ahjrVar9.aH.b();
                bvur bvurVar = (bvur) ahknVar7.dL.b();
                ahnh ahnhVar7 = ahknVar7.a;
                return new bwrn(eoscVar, bwjwVar, bvurVar, ahnhVar7.wv, ahjrVar9.ar, (dqsn) ahnhVar7.qq.b(), ahjrVar9.U, ahjrVar9.F, ahnhVar7.qG, ahjrVar9.bn(), (celq) ahjrVar9.aG.b(), ahnhVar7.pQ, (auau) ahknVar7.ez.b(), ahnhVar7.rW, ahnhVar7.EN);
            case 114:
                ahkn ahknVar8 = this.a;
                cogw cogwVar2 = (cogw) ahknVar8.cD.b();
                ahnh ahnhVar8 = ahknVar8.a;
                dqsn dqsnVar2 = (dqsn) ahnhVar8.qq.b();
                eyik eyikVar4 = ahnhVar8.EI;
                eosc eoscVar2 = (eosc) ahknVar8.y.b();
                ahjr ahjrVar10 = this.b;
                return new bwjw(cogwVar2, dqsnVar2, eyikVar4, eoscVar2, ahnhVar8.qr, ahnhVar8.EJ, (celq) ahjrVar10.aG.b(), (ains) ahnhVar8.c.b(), eyie.a(ahjrVar10.aF), ahnhVar8.EL, (aqvc) ahnhVar8.to.b());
            case 115:
                ahkn ahknVar9 = this.a;
                ahjr ahjrVar11 = this.b;
                ahnh ahnhVar9 = ahknVar9.a;
                eyik eyikVar5 = ahnhVar9.pB;
                eyik eyikVar6 = ahjrVar11.eY;
                atuz atuzVarAn = ahjrVar11.an();
                atva atvaVarAo = ahjrVar11.ao();
                atvb atvbVarAp = ahjrVar11.ap();
                atog atogVarAk = ahjrVar11.ak();
                atny atnyVarAh = ahjrVar11.ah();
                atoe atoeVarAj = ahjrVar11.aj();
                atoc atocVarAi = ahjrVar11.ai();
                aika aikaVar = (aika) ahnhVar9.uM.b();
                eyik eyikVar7 = ahnhVar9.Jw;
                eosc eoscVar3 = (eosc) ahknVar9.y.b();
                eosc eoscVar4 = (eosc) ahknVar9.p.b();
                cjbf cjbfVarJs = ahnhVar9.js();
                atau atauVar = (atau) ahknVar9.ii.b();
                return new atvv(eyikVar5, eyikVar6, atuzVarAn, atvaVarAo, atvbVarAp, atogVarAk, atnyVarAh, atoeVarAj, atocVarAi, aikaVar, eyikVar7, eoscVar3, eoscVar4, cjbfVarJs, atauVar, (caxe) ahnhVar9.FF.b(), ahnhVar9.c, ahjrVar11.eZ, ahnhVar9.Pb, ahjrVar11.fb, ahnhVar9.Pm, ahnhVar9.Pq, (arph) ahnhVar9.ES.b(), ahnhVar9.bo());
            case 116:
                ahjr ahjrVar12 = this.b;
                aypy aypyVar = (aypy) ahjrVar12.bI.b();
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar10 = ahknVar10.a;
                cden cdenVar = (cden) ahnhVar10.qN.b();
                eyik eyikVar8 = ahjrVar12.ar;
                eyik eyikVar9 = ahnhVar10.yw;
                clec clecVarEZ = ahjrVar12.eZ();
                asry asryVar = (asry) ahknVar10.mK.b();
                atah atahVar = (atah) ahknVar10.mL.b();
                eyik eyikVar10 = ahnhVar10.OL;
                eyik eyikVar11 = ahjrVar12.eX;
                Map mapIO = ahkn.iO();
                eosc eoscVar5 = (eosc) ahknVar10.p.b();
                eosc eoscVar6 = (eosc) ahknVar10.aJ.b();
                eyik eyikVar12 = ahknVar10.cD;
                eyik eyikVar13 = ahnhVar10.OQ;
                eyik eyikVar14 = ahnhVar10.FI;
                cogw cogwVar3 = (cogw) eyikVar12.b();
                asbt asbtVar = (asbt) ahnhVar10.OE.b();
                return new atyp(aypyVar, cdenVar, eyikVar8, eyikVar9, clecVarEZ, asryVar, atahVar, eyikVar10, eyikVar11, mapIO, eoscVar5, eoscVar6, eyikVar13, eyikVar14, cogwVar3, asbtVar);
            case 117:
                return new axyn(this.b.eV, this.a.a.OK);
            case 118:
                ahkn ahknVar11 = this.a;
                Context context = (Context) ahknVar11.t.b();
                ahnh ahnhVar11 = ahknVar11.a;
                cmos cmosVar = (cmos) ahnhVar11.Ck.b();
                cogw cogwVar4 = (cogw) ahknVar11.cD.b();
                cmqj cmqjVar = (cmqj) ahnhVar11.uv.b();
                cmum cmumVar = (cmum) ahnhVar11.wF.b();
                ahjr ahjrVar13 = this.b;
                return axyo.a(context, cmosVar, cogwVar4, cmqjVar, cmumVar, ahjrVar13.bK.b(), ahjrVar13.ar, (bbdl) ahnhVar11.qG.b(), (dqsn) ahnhVar11.qq.b(), ahnhVar11.qa, ahnhVar11.FC, (aprr) ahnhVar11.Cj.b(), ahnhVar11.pb, (eosc) ahknVar11.aJ.b());
            case 119:
                ahjr ahjrVar14 = this.b;
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar12 = ahknVar12.a;
                eyik eyikVar15 = ahjrVar14.F;
                eyik eyikVar16 = ahjrVar14.ar;
                ajhd ajhdVar = (ajhd) ahnhVar12.yw.b();
                crmx crmxVar = (crmx) ahnhVar12.pB.b();
                cmvy cmvyVar = (cmvy) ahnhVar12.pE.b();
                Optional optional = (Optional) ahjrVar14.aK.b();
                ains ainsVar = (ains) ahnhVar12.c.b();
                chwq chwqVar = (chwq) ahnhVar12.uu.b();
                cteb ctebVar = (cteb) ahjrVar14.aL.b();
                cogw cogwVar5 = (cogw) ahknVar12.cD.b();
                cmum cmumVar2 = (cmum) ahnhVar12.wF.b();
                cgbn cgbnVar = (cgbn) ahnhVar12.Cs.b();
                cmop cmopVar = (cmop) ahnhVar12.CA.b();
                aiwu aiwuVar = (aiwu) ahknVar12.kc.b();
                cggg cgggVar = (cggg) ahjrVar14.aM.b();
                aypx aypxVar = (aypx) ahjrVar14.aN.b();
                bbfn bbfnVar = (bbfn) ahnhVar12.CF.b();
                ayrm ayrmVar = (ayrm) ahjrVar14.dD.b();
                Optional optional2 = (Optional) ahnhVar12.OF.b();
                Optional optionalOf = Optional.of(ahjrVar14.eQ());
                cqjy cqjyVar = (cqjy) ahnhVar12.Ci.b();
                eyik eyikVar17 = ahnhVar12.OG;
                bxlc bxlcVar = (bxlc) ahjrVar14.U.b();
                Optional optionalEmpty = Optional.empty();
                aylw aylwVarEu = ahnhVar12.eu();
                aylz aylzVar = (aylz) ahnhVar12.Fk.b();
                eyik eyikVar18 = ahjrVar14.eA;
                eyik eyikVar19 = ahnhVar12.vl;
                eyik eyikVar20 = ahnhVar12.qG;
                eyik eyikVar21 = ahnhVar12.NK;
                eosc eoscVar7 = (eosc) ahknVar12.y.b();
                ajjt ajjtVar = (ajjt) ahknVar12.my.b();
                cmxr cmxrVar = (cmxr) ahnhVar12.Fp.b();
                eyik eyikVar22 = ahknVar12.aJ;
                return new ayih(eyikVar15, ahjrVar14.aA, eyikVar16, ajhdVar, crmxVar, cmvyVar, optional, ainsVar, chwqVar, ctebVar, cogwVar5, cmumVar2, cgbnVar, cmopVar, aiwuVar, cgggVar, aypxVar, bbfnVar, ayrmVar, optional2, optionalOf, cqjyVar, eyikVar17, bxlcVar, optionalEmpty, aylwVarEu, aylzVar, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eoscVar7, ajjtVar, cmxrVar, ahnhVar12.Fq, ahnhVar12.HO, ahnhVar12.FD, (eosc) eyikVar22.b(), (awlc) ahnhVar12.FE.b(), ahnhVar12.HK, (ckfo) ahjrVar14.ey.b(), ahnhVar12.wu, ahnhVar12.uv, ahjrVar14.aF(), (aqbh) ahnhVar12.qa.b(), ahnhVar12.OH, (apsl) ahnhVar12.Dk.b(), ahnhVar12.Dn, ahnhVar12.pl, ahnhVar12.zi, (arwc) ahnhVar12.DA.b());
            case 120:
                return Optional.of(this.b.u());
            case 121:
                ahjr ahjrVar15 = this.b;
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar13 = ahknVar13.a;
                return new cteb(ahjrVar15.F, (ajhd) ahnhVar13.yw.b(), (bxlc) ahjrVar15.U.b(), (dqsn) ahnhVar13.qq.b(), (cogw) ahknVar13.cD.b(), (eosc) ahknVar13.y.b());
            case 122:
                return new cggg(this.a.a.rF);
            case 123:
                return new aypx((cogw) this.a.cD.b(), this.b.aC());
            case 124:
                ahkn ahknVar14 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar14.cz.b();
                ahnh ahnhVar14 = ahknVar14.a;
                return new chvm(fcyhVar2, (fdjx) ahnhVar14.m.b(), this.b.bC, ahnhVar14.pQ);
            case 125:
                return new auat(this.b.ht(), this.a.a.rk);
            case 126:
                ahkn ahknVar15 = this.a;
                ahjr ahjrVar16 = this.b;
                eyik eyikVar23 = ahjrVar16.aP;
                cizt ciztVarCm = ahknVar15.cm();
                Object objGP = ahjrVar16.gP();
                cjna cjnaVar = (cjna) eyikVar23.b();
                eyik eyikVar24 = ahjrVar16.aQ;
                Object objGR = ahjrVar16.gR();
                cjnd cjndVar = (cjnd) eyikVar24.b();
                eyik eyikVar25 = ahjrVar16.aR;
                Object objGt = ahjrVar16.gt();
                cjmh cjmhVar = (cjmh) eyikVar25.b();
                eyik eyikVar26 = ahjrVar16.aS;
                cixx cixxVarEE = ahjrVar16.eE();
                cjml cjmlVar = (cjml) eyikVar26.b();
                eyik eyikVar27 = ahjrVar16.aT;
                cjam cjamVarEF = ahjrVar16.eF();
                cjmx cjmxVar = (cjmx) eyikVar27.b();
                eyik eyikVar28 = ahjrVar16.aU;
                cixu cixuVar = (cixu) objGt;
                cjay cjayVar = (cjay) objGR;
                return new cjai(ciztVarCm, (cjaq) objGP, cjnaVar, cjayVar, cjndVar, cixuVar, cjmhVar, cixxVarEE, cjmlVar, cjamVarEF, cjmxVar, ahjrVar16.eH(), (cjnj) eyikVar28.b(), ahjrVar16.eG(), (cjng) ahjrVar16.aV.b(), ahknVar15.a.js(), (eosc) ahknVar15.p.b());
            case 127:
                ahjr ahjrVar17 = this.b;
                ahkn ahknVar16 = this.a;
                return new cjna((cjmt) ahjrVar17.gG(), (eosc) ahknVar16.p.b());
            case 128:
                ahjr ahjrVar18 = this.b;
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar15 = ahknVar17.a;
                return new cjnd((cjmt) ahjrVar18.gH(), ahnhVar15.js(), (eosc) ahknVar17.p.b());
            case 129:
                return new cjmh((eosc) this.a.p.b(), (cjmt) this.b.gD());
            case 130:
                return new cjml((eosc) this.a.p.b(), (cjmt) this.b.gE());
            case 131:
                return new cjmx((eosc) this.a.p.b(), (cjmt) this.b.gF());
            case 132:
                return new cjnj((eosc) this.a.p.b(), (cjmt) this.b.gJ());
            case 133:
                return new cjng((eosc) this.a.p.b(), (cjmt) this.b.gI());
            case 134:
                ahjr ahjrVar19 = this.b;
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar16 = ahknVar18.a;
                eyik eyikVar29 = ahnhVar16.uM;
                eyik eyikVar30 = ahnhVar16.xL;
                eyik eyikVar31 = ahnhVar16.FF;
                eosd eosdVar = (eosd) ahknVar18.p.b();
                eosc eoscVar8 = (eosc) ahknVar18.y.b();
                eyik eyikVar32 = ahnhVar16.Cs;
                return new cnfd(ahjrVar19.aX, ahjrVar19.aY, ahjrVar19.aZ, ahjrVar19.ba, ahjrVar19.bb, ahjrVar19.bc, ahjrVar19.bd, eyikVar29, eyikVar30, ahjrVar19.bA, eyikVar31, eosdVar, eoscVar8, eyikVar32);
            case 135:
                return new cngk(this.a.a.rF);
            case 136:
                return new cngf(this.a.a.rF);
            case 137:
                return new cnbo(this.a.a.rF);
            case 138:
                return new cnbd(this.a.a.rF);
            case 139:
                return new cnfy(this.a.a.rF);
            case 140:
                return new cnhs(this.a.a.rF);
            case 141:
                return new cncl(this.a.a.rF);
            case 142:
                ahjr ahjrVar20 = this.b;
                ahnh ahnhVar17 = this.a.a;
                return new cngw((cnfv) ahjrVar20.gY(), ahnhVar17.Cs);
            case 143:
                ahkn ahknVar19 = this.a;
                ahjr ahjrVar21 = this.b;
                return new cnhz(ahknVar19.a.pT, ahjrVar21.bs, (eosc) ahknVar19.p.b());
            case 144:
                ahjr ahjrVar22 = this.b;
                ahkn ahknVar20 = this.a;
                return new cnck(ahjrVar22.br, (ains) ahknVar20.a.c.b(), (eosc) ahknVar20.y.b(), (eosc) ahknVar20.p.b());
            case 145:
                ahjr ahjrVar23 = this.b;
                return chxm.a(ahjrVar23.bq, ahjrVar23.bp);
            case 146:
                cibz cibzVar = (cibz) this.b.bp.b();
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar18 = ahknVar21.a;
                return new cicc(cibzVar, ahnhVar18.pT, ahnhVar18.qi, ahnhVar18.zO, (eosc) ahknVar21.y.b());
            case 147:
                ahkn ahknVar22 = this.a;
                eosc eoscVar9 = (eosc) ahknVar22.y.b();
                ahjr ahjrVar24 = this.b;
                ahnh ahnhVar19 = ahknVar22.a;
                Object objGO = ahjrVar24.gO();
                return new cibz(eoscVar9, (cicl) objGO, (ciux) ahnhVar19.Cu.b(), (ains) ahnhVar19.c.b(), ahnhVar19.us, ahjrVar24.bh, ahjrVar24.bk, ahjrVar24.bm, ahjrVar24.bo, ahnhVar19.jc(), eyie.a(ahnhVar19.qi), (aqnw) ahnhVar19.Gu.b());
            case 148:
                return new baqy(this.b.F);
            case 149:
                ahkn ahknVar23 = this.a;
                Context context2 = (Context) ahknVar23.t.b();
                ahnh ahnhVar20 = ahknVar23.a;
                dqsn dqsnVar3 = (dqsn) ahnhVar20.qq.b();
                eyik eyikVar33 = ahnhVar20.uu;
                cqmr cqmrVar = (cqmr) ahknVar23.eK.b();
                ahjr ahjrVar25 = this.b;
                eyik eyikVar34 = ahnhVar20.uD;
                eyik eyikVar35 = ahjrVar25.V;
                eyik eyikVar36 = ahjrVar25.ar;
                eyik eyikVar37 = ahnhVar20.uv;
                eyik eyikVar38 = ahnhVar20.us;
                eyik eyikVar39 = ahknVar23.nC;
                eyik eyikVar40 = ahnhVar20.yx;
                Optional optional3 = (Optional) ahknVar23.kd.b();
                Optional optional4 = (Optional) ahknVar23.ku.b();
                eosc eoscVar10 = (eosc) ahknVar23.aJ.b();
                eyik eyikVar41 = ahjrVar25.X;
                chxp chxpVar = (chxp) ahknVar23.nD.b();
                eyik eyikVar42 = ahnhVar20.pR;
                eyik eyikVar43 = ahnhVar20.qi;
                eyik eyikVar44 = ahnhVar20.uy;
                eyik eyikVar45 = ahnhVar20.Jh;
                eyik eyikVar46 = ahnhVar20.WR;
                eyik eyikVar47 = ahnhVar20.WS;
                eyik eyikVar48 = ahnhVar20.yp;
                eosc eoscVar11 = (eosc) ahknVar23.p.b();
                apsl apslVar = (apsl) ahnhVar20.Dk.b();
                eyik eyikVar49 = ahnhVar20.Dn;
                eyik eyikVar50 = ahnhVar20.WT;
                eyik eyikVar51 = ahnhVar20.WU;
                eyik eyikVar52 = ahknVar23.cO;
                return new chwk(context2, dqsnVar3, eyikVar33, ahknVar23.cQ, cqmrVar, eyikVar34, eyikVar35, eyikVar36, ahjrVar25.aB, ahjrVar25.aA, eyikVar37, eyikVar38, eyikVar39, eyikVar40, optional3, optional4, eoscVar10, eyikVar41, chxpVar, eyikVar52, eyikVar42, eyikVar43, eyikVar44, eyikVar45, eyikVar46, eyikVar47, eyikVar48, eoscVar11, apslVar, eyikVar49, eyikVar50, eyikVar51);
            case 150:
                ahjr ahjrVar26 = this.b;
                return avov.a(ahjrVar26.al, ahjrVar26.bg);
            case 151:
                ahkn ahknVar24 = this.a;
                return new avpr(ahknVar24.a.qq, this.b.al, (eosc) ahknVar24.y.b(), (eosc) ahknVar24.p.b(), (dzuc) ahknVar24.cE.b());
            case 152:
                return new awgi(this.b.bj);
            case 153:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar21 = ahknVar25.a;
                return new awfv((awci) ahnhVar21.pV.b(), (awfi) this.b.bi.b(), (eosc) ahknVar25.y.b(), ahnhVar21.qr);
            case 154:
                ahkn ahknVar26 = this.a;
                ahjr ahjrVar27 = this.b;
                ahnh ahnhVar22 = ahknVar26.a;
                return new awfi(ahnhVar22.pV, ahjrVar27.F, ahnhVar22.uQ, ahnhVar22.uv, ahnhVar22.CR, ahnhVar22.uM, ahknVar26.y, ahnhVar22.AE);
            case 155:
                ahjr ahjrVar28 = this.b;
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar23 = ahknVar27.a;
                return new cnqt(ahjrVar28.bf, ahjrVar28.W, ahnhVar23.uv, (dqsn) ahnhVar23.qq.b(), (Context) ahknVar27.t.b(), ahnhVar23.qi, (anuh) ahnhVar23.zO.b(), ahnhVar23.Gr, ahjrVar28.bl, ahnhVar23.ur);
            case 156:
                ahjr ahjrVar29 = this.b;
                ahnh ahnhVar24 = this.a.a;
                return new cmsk(ahjrVar29.F, ahnhVar24.uv, ahnhVar24.qi);
            case 157:
                ahkn ahknVar28 = this.a;
                ahjr ahjrVar30 = this.b;
                ahnh ahnhVar25 = ahknVar28.a;
                eyik eyikVar53 = ahnhVar25.uv;
                eyik eyikVar54 = ahknVar28.nF;
                eyik eyikVar55 = ahnhVar25.pQ;
                Optional optionalEmpty2 = Optional.empty();
                apsl apslVar2 = (apsl) ahnhVar25.Dk.b();
                eyik eyikVar56 = ahnhVar25.Dn;
                Context context3 = (Context) ahknVar28.t.b();
                return new avmy(ahknVar28.cQ, eyikVar53, eyikVar54, ahjrVar30.bj, ahjrVar30.bn, eyikVar55, optionalEmpty2, apslVar2, eyikVar56, context3);
            case 158:
                return new avnb(this.a.a.rF);
            case 159:
                return Optional.of((cnii) this.b.bx.b());
            case 160:
                return new ahil(this);
            case 161:
                return Optional.of((cnik) this.b.bv.b());
            case 162:
                ahkn ahknVar29 = this.a;
                ahjr ahjrVar31 = this.b;
                ahnh ahnhVar26 = ahknVar29.a;
                return new cnio(ahknVar29.jp, ahnhVar26.pI, ahjrVar31.bu, (ains) ahnhVar26.pQ.b());
            case 163:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar27 = ahknVar30.a;
                fdjx fdjxVar = (fdjx) ahnhVar27.oS.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar27.m.b();
                lkb lkbVar = (lkb) ahnhVar27.AA.b();
                ahjr ahjrVar32 = this.b;
                return new cgum(fdjxVar, fdjxVar2, lkbVar, ahnhVar27.pG, ahknVar30.aQ, ahjrVar32.au, ahjrVar32.ap, ahnhVar27.qi);
            case 164:
                return new awnj((awnf) this.b.G.b(), (fdjx) this.a.a.m.b());
            case 165:
                ahkn ahknVar31 = this.a;
                Context context4 = (Context) ahknVar31.t.b();
                cogw cogwVar6 = (cogw) ahknVar31.cD.b();
                ahjr ahjrVar33 = this.b;
                ahnh ahnhVar28 = ahknVar31.a;
                eyik eyikVar57 = ahjrVar33.W;
                eyik eyikVar58 = ahjrVar33.F;
                eyik eyikVar59 = ahnhVar28.qG;
                ajhd ajhdVar2 = (ajhd) ahnhVar28.yw.b();
                eygg eyggVarA = eyie.a(ahnhVar28.uv);
                Optional optionalOf2 = Optional.of((cmut) ahnhVar28.CL.b());
                ayql ayqlVar = (ayql) ahjrVar33.eU.b();
                dqsn dqsnVar4 = (dqsn) ahnhVar28.qq.b();
                cqjy cqjyVar2 = (cqjy) ahnhVar28.Ci.b();
                alrj alrjVar = (alrj) ahnhVar28.qi.b();
                bydb bydbVar = (bydb) ahjrVar33.dc.b();
                Optional optional5 = (Optional) ahknVar31.ku.b();
                ckfo ckfoVar = (ckfo) ahjrVar33.ey.b();
                eyik eyikVar60 = ahjrVar33.aM;
                eyik eyikVar61 = ahnhVar28.OE;
                return new ayrm(context4, cogwVar6, eyikVar57, eyikVar58, ahjrVar33.aB, eyikVar59, ahjrVar33.bH, ajhdVar2, eyggVarA, optionalOf2, ayqlVar, dqsnVar4, cqjyVar2, alrjVar, bydbVar, optional5, ckfoVar, eyikVar60, eyikVar61);
            case 166:
                ahjr ahjrVar34 = this.b;
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar29 = ahknVar32.a;
                return new ajsj(ahjrVar34.ar, ahjrVar34.F, ahnhVar29.zi, ahnhVar29.qi, ahnhVar29.yw, ahnhVar29.qG, ahjrVar34.bG, (eosc) ahknVar32.p.b(), (eosc) ahknVar32.aJ.b(), ahnhVar29.qq, ahnhVar29.bs(), ahnhVar29.pl, (aqbh) ahnhVar29.qa.b());
            case 167:
                ahjr ahjrVar35 = this.b;
                baxf baxfVar = (baxf) ahjrVar35.bF.b();
                aofc aofcVar = (aofc) ahjrVar35.I.b();
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar30 = ahknVar33.a;
                return new anqc(baxfVar, aofcVar, (cqbm) ahnhVar30.sX.b(), (eosc) ahknVar33.y.b(), (eosc) ahknVar33.p.b(), (eosc) ahknVar33.aJ.b(), (crqv) ahknVar33.aT.b(), ahjrVar35.ay(), ahnhVar30.yw, ahjrVar35.F, ahjrVar35.ar, ahnhVar30.tB, ahnhVar30.cv(), ahnhVar30.cu(), ahnhVar30.rU());
            case 168:
                return new baxf(this.b.bE, this.a.a.uu);
            case 169:
                ahjr ahjrVar36 = this.b;
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar31 = ahknVar34.a;
                eyik eyikVar62 = ahjrVar36.F;
                eyik eyikVar63 = ahnhVar31.uQ;
                eyik eyikVar64 = ahnhVar31.rY;
                eyik eyikVar65 = ahnhVar31.CG;
                return new bagw(eyikVar62, eyikVar63, eyikVar64, eyikVar65, ahnhVar31.wJ, ahnhVar31.sh, ahnhVar31.pb, (awhr) ahnhVar31.zm.b(), (eosc) ahknVar34.aJ.b());
            case 170:
                ahkn ahknVar35 = this.a;
                ahjr ahjrVar37 = this.b;
                eyik eyikVar66 = ahknVar35.t;
                ahnh ahnhVar32 = ahknVar35.a;
                eyik eyikVar67 = ahjrVar37.bI;
                eyik eyikVar68 = ahnhVar32.sh;
                eyik eyikVar69 = ahjrVar37.bJ;
                eyik eyikVar70 = ahnhVar32.qG;
                eyik eyikVar71 = ahjrVar37.bK;
                eyik eyikVar72 = ahnhVar32.uv;
                eyik eyikVar73 = ahnhVar32.DB;
                eyik eyikVar74 = ahknVar35.cD;
                eyik eyikVar75 = ahnhVar32.yw;
                eyik eyikVar76 = ahnhVar32.us;
                eyik eyikVar77 = ahnhVar32.pf;
                eyik eyikVar78 = ahjrVar37.bf;
                eyik eyikVar79 = ahnhVar32.uy;
                eyik eyikVar80 = ahnhVar32.DE;
                eyik eyikVar81 = ahnhVar32.Ci;
                eyik eyikVar82 = ahnhVar32.Cp;
                eyik eyikVar83 = ahknVar35.aJ;
                eyik eyikVar84 = ahknVar35.dL;
                eyik eyikVar85 = ahknVar35.kl;
                eyik eyikVar86 = ahnhVar32.DJ;
                eyik eyikVar87 = ahjrVar37.bV;
                eyik eyikVar88 = ahjrVar37.eI;
                eyik eyikVar89 = ahnhVar32.Nz;
                eyik eyikVar90 = ahnhVar32.NA;
                eyik eyikVar91 = ahnhVar32.Fd;
                eyik eyikVar92 = ahjrVar37.br;
                eyik eyikVar93 = ahjrVar37.bF;
                eyik eyikVar94 = ahnhVar32.vR;
                eyik eyikVar95 = ahnhVar32.NB;
                eyik eyikVar96 = ahnhVar32.Fk;
                eyik eyikVar97 = ahjrVar37.bo;
                eyik eyikVar98 = ahnhVar32.qi;
                eyik eyikVar99 = ahnhVar32.xO;
                eyik eyikVar100 = ahjrVar37.eJ;
                return new aygy(eyikVar66, eyikVar67, eyikVar68, eyikVar69, eyikVar70, eyikVar71, eyikVar72, eyikVar73, eyikVar74, eyikVar75, eyikVar76, eyikVar77, eyikVar78, eyikVar79, eyikVar80, eyikVar81, eyikVar82, eyikVar83, eyikVar84, eyikVar85, eyikVar86, eyikVar87, eyikVar88, eyikVar89, eyikVar90, eyikVar91, eyikVar92, eyikVar93, eyikVar94, eyikVar95, eyikVar96, eyikVar97, eyikVar98, eyikVar99, eyikVar100, eyikVar100, ahknVar35.my, ahnhVar32.ND, ahnhVar32.qa, ahjrVar37.eK, ahjrVar37.ey, ahjrVar37.eQ, ahnhVar32.FC, ahjrVar37.dJ, ahnhVar32.Eo, ahjrVar37.ar, ahnhVar32.pb, ahnhVar32.DI, ahjrVar37.eS, ahnhVar32.OA, ahknVar35.lk, ahjrVar37.as, ahjrVar37.eT, ahnhVar32.OC, ahknVar35.kv, ahnhVar32.Or);
            case 171:
                ahjr ahjrVar38 = this.b;
                return new cohh(ahjrVar38.bO, ahjrVar38.bP, ahjrVar38.bT, ahjrVar38.bU, this.a.a.rk);
            case 172:
                ahkn ahknVar36 = this.a;
                eosc eoscVar12 = (eosc) ahknVar36.p.b();
                ahjr ahjrVar39 = this.b;
                return new conu(eoscVar12, ahjrVar39.bN, (aten) ahknVar36.a.Ed.b());
            case 173:
                ahkn ahknVar37 = this.a;
                eosc eoscVar13 = (eosc) ahknVar37.y.b();
                eosc eoscVar14 = (eosc) ahknVar37.p.b();
                ahjr ahjrVar40 = this.b;
                return new conq(eoscVar13, eoscVar14, ahjrVar40.bL, ahjrVar40.bM);
            case 174:
                return new atei(this.a.a.rF);
            case 175:
                ahkn ahknVar38 = this.a;
                return new cokd((eosc) ahknVar38.y.b(), (dqsn) ahknVar38.a.qq.b(), this.b.ar, (cogw) ahknVar38.cD.b());
            case 176:
                ahkn ahknVar39 = this.a;
                ahjr ahjrVar41 = this.b;
                return new cooh(ahknVar39.a.Ef, ahjrVar41.bM, (Context) ahknVar39.t.b(), (eosc) ahknVar39.aJ.b(), (eosc) ahknVar39.y.b(), (eosc) ahknVar39.p.b());
            case 177:
                ahkn ahknVar40 = this.a;
                eosc eoscVar15 = (eosc) ahknVar40.p.b();
                eosc eoscVar16 = (eosc) ahknVar40.y.b();
                ahjr ahjrVar42 = this.b;
                return new coxw(eoscVar15, eoscVar16, ahjrVar42.bR, ahknVar40.a.EA, ahjrVar42.bM, ahjrVar42.bS);
            case 178:
                ahjr ahjrVar43 = this.b;
                ahkn ahknVar41 = this.a;
                return new covx(ahjrVar43.bQ, (eosc) ahknVar41.y.b(), (eosc) ahknVar41.p.b(), ahjrVar43.bM);
            case 179:
                return new cowj(this.a.a.rF);
            case 180:
                ahkn ahknVar42 = this.a;
                eosc eoscVar17 = (eosc) ahknVar42.y.b();
                eosc eoscVar18 = (eosc) ahknVar42.aJ.b();
                ahjr ahjrVar44 = this.b;
                return new coii(eoscVar17, eoscVar18, ahjrVar44.ar, (cokd) ahjrVar44.bM.b(), (cogw) ahknVar42.cD.b());
            case 181:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar33 = ahknVar43.a;
                eyik eyikVar101 = ahnhVar33.Ef;
                dqsn dqsnVar5 = (dqsn) ahnhVar33.qq.b();
                Context context5 = (Context) ahknVar43.t.b();
                ahjr ahjrVar45 = this.b;
                return new cowi(eyikVar101, dqsnVar5, context5, ahjrVar45.bM, (eosc) ahknVar43.y.b(), (eosc) ahknVar43.aJ.b());
            case 182:
                ahjr ahjrVar46 = this.b;
                bwfe bwfeVarAZ = ahjrVar46.aZ();
                ahjrVar46.hN();
                return new ccvv(bwfeVarAZ, (apwn) this.a.a.Bg.b());
            case 183:
                asre asreVar = (asre) this.b.bC.b();
                ahkn ahknVar44 = this.a;
                auau auauVar = (auau) ahknVar44.ez.b();
                atah atahVar2 = (atah) ahknVar44.mL.b();
                asry asryVar2 = (asry) ahknVar44.mK.b();
                eyik eyikVar102 = ahknVar44.aJ;
                ahnh ahnhVar34 = ahknVar44.a;
                return new cmnp(asreVar, auauVar, atahVar2, asryVar2, ahnhVar34.Jw, ahnhVar34.Fd, (eosc) eyikVar102.b(), (eosc) ahknVar44.p.b(), ahnhVar34.OQ, (atau) ahknVar44.ii.b(), (cqdr) ahknVar44.lk.b(), (atak) ahknVar44.kA.b(), (cmxn) ahnhVar34.xO.b());
            case 184:
                ahkn ahknVar45 = this.a;
                eosc eoscVar19 = (eosc) ahknVar45.p.b();
                eosc eoscVar20 = (eosc) ahknVar45.aJ.b();
                ahjr ahjrVar47 = this.b;
                eyik eyikVar103 = ahjrVar47.bX;
                ahnh ahnhVar35 = ahknVar45.a;
                return new bwmz(eoscVar19, eoscVar20, ahnhVar35.Fd, ahjrVar47.ar, ahjrVar47.F, ahnhVar35.EU, ahnhVar35.tl, ahnhVar35.EJ, ahnhVar35.pQ, (atvy) eyikVar103.b());
            case 185:
                ahnh ahnhVar36 = this.a.a;
                awxo awxoVar = (awxo) ahnhVar36.sP.b();
                ahjr ahjrVar48 = this.b;
                return new atvy(awxoVar, (awjh) ahjrVar48.E.b(), (awnf) ahjrVar48.G.b(), (fdjx) ahnhVar36.m.b(), (arph) ahnhVar36.ES.b());
            case 186:
                ahkn ahknVar46 = this.a;
                fcyh fcyhVar3 = (fcyh) ahknVar46.cA.b();
                ahnh ahnhVar37 = ahknVar46.a;
                return new ccay(fcyhVar3, ahnhVar37.yy, (ccpm) ahnhVar37.tI.b(), (awlc) ahnhVar37.FK.b(), this.b.dd());
            case 187:
                ahjr ahjrVar49 = this.b;
                atxs atxsVar = (atxs) ahjrVar49.cm.b();
                ahkn ahknVar47 = this.a;
                auaq auaqVar = (auaq) ahknVar47.js.b();
                cogw cogwVar7 = (cogw) ahknVar47.cD.b();
                ahnh ahnhVar38 = ahknVar47.a;
                return new atwz(atxsVar, auaqVar, cogwVar7, ahnhVar38.sh, ahnhVar38.Gf, ahjrVar49.cn, ahjrVar49.bz, (eosc) ahknVar47.y.b(), ahjrVar49.bX, ahnhVar38.bK());
            case 188:
                ahjr ahjrVar50 = this.b;
                bvkr bvkrVar = (bvkr) ahjrVar50.bZ.b();
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar39 = ahknVar48.a;
                return new atxs(bvkrVar, ahnhVar39.FP, (cema) ahnhVar39.EG.b(), ahjrVar50.ci, (cfeh) ahjrVar50.cl.b(), (eosc) ahknVar48.p.b(), ahknVar48.dh);
            case 189:
                ahkn ahknVar49 = this.a;
                cogw cogwVar8 = (cogw) ahknVar49.cD.b();
                eyik eyikVar104 = this.b.U;
                eyik eyikVar105 = ahknVar49.hS;
                eosc eoscVar21 = (eosc) ahknVar49.y.b();
                crqv crqvVar = (crqv) ahknVar49.aT.b();
                ahnh ahnhVar40 = ahknVar49.a;
                return new bvkr(cogwVar8, eyikVar104, eyikVar105, eoscVar21, crqvVar, (egej) ahnhVar40.pI.b(), ahknVar49.dh, ahnhVar40.vZ);
            case 190:
                ahkn ahknVar50 = this.a;
                eosc eoscVar22 = (eosc) ahknVar50.y.b();
                ahnh ahnhVar41 = ahknVar50.a;
                Optional optional6 = (Optional) ahnhVar41.FQ.b();
                ahjr ahjrVar51 = this.b;
                return new cemk(eoscVar22, optional6, (cezv) ahjrVar51.x.b(), (cfwu) ahnhVar41.FR.b(), (ceku) ahjrVar51.cg.b(), ahjrVar51.gq(), (cejj) ahnhVar41.tJ.b(), (ains) ahnhVar41.c.b(), (Optional) ahknVar50.hZ.b(), eyie.a(ahnhVar41.xd), (cenj) ahnhVar41.tf.b(), (aipo) ahnhVar41.us.b(), (cepq) ahnhVar41.FT.b());
            case 191:
                ahjr ahjrVar52 = this.b;
                return abcs.a((cedm) ahjrVar52.cd.b(), Optional.of((ceff) ahjrVar52.cf.b()));
            case 192:
                ahkn ahknVar51 = this.a;
                eosc eoscVar23 = (eosc) ahknVar51.y.b();
                eosc eoscVar24 = (eosc) ahknVar51.p.b();
                eosc eoscVar25 = (eosc) ahknVar51.aJ.b();
                ahjr ahjrVar53 = this.b;
                cezv cezvVar = (cezv) ahjrVar53.x.b();
                ahnh ahnhVar42 = ahknVar51.a;
                cenj cenjVar = (cenj) ahnhVar42.tf.b();
                eyik eyikVar106 = ahknVar51.cD;
                return new cedm(eoscVar23, eoscVar24, eoscVar25, cezvVar, cenjVar, ahnhVar42.tg, (cogw) eyikVar106.b(), ahjrVar53.du(), (Optional) ahnhVar42.Xq.b(), eyie.a(ahnhVar42.Xr), ahjrVar53.cc, (ceop) ahnhVar42.tq.b(), ahnhVar42.xR);
            case 193:
                ahkn ahknVar52 = this.a;
                ahjr ahjrVar54 = this.b;
                return new cffq(ahknVar52.y, ahjrVar54.ca, ahknVar52.a.tq);
            case 194:
                ahkn ahknVar53 = this.a;
                eosc eoscVar26 = (eosc) ahknVar53.y.b();
                cfgs cfgsVar = (cfgs) this.b.ca.b();
                ahnh ahnhVar43 = ahknVar53.a;
                return new cfew(eoscVar26, cfgsVar, (ceop) ahnhVar43.tq.b(), (crny) ahnhVar43.pf.b(), (crmx) ahnhVar43.pB.b(), (cqpz) ahknVar53.aN.b());
            case 195:
                ahjr ahjrVar55 = this.b;
                return cefh.a(ahjrVar55.dq(), (cert) ahjrVar55.ce.b(), (ceta) this.a.a.FW.b());
            case 196:
                ahkn ahknVar54 = this.a;
                ahjr ahjrVar56 = this.b;
                eyik eyikVar107 = ahknVar54.b.gk;
                ceqo ceqoVarDt = ahjrVar56.dt();
                eyik eyikVar108 = ahjrVar56.B;
                cerq.a();
                cers.a();
                return ceqz.a(eyikVar107, ceqoVarDt, eyikVar108);
            case 197:
                ahjr ahjrVar57 = this.b;
                ahkn ahknVar55 = this.a;
                eyik eyikVar109 = ahjrVar57.ck;
                return new cfeh(eyikVar109, ahknVar55.dh, eyikVar109, eyikVar109);
            case 198:
                ahkn ahknVar56 = this.a;
                ahjr ahjrVar58 = this.b;
                ahnh ahnhVar44 = ahknVar56.a;
                return new cfei(ahnhVar44.xk, ahknVar56.cD, ahknVar56.aT, ahjrVar58.bZ, ahnhVar44.EG, ahknVar56.p, ahnhVar44.FP, eyil.a(ahnhVar44.xd), ahnhVar44.c, ahnhVar44.FV, ahjrVar58.cj, ahnhVar44.FY, ahnhVar44.FZ, ahjrVar58.v, ahknVar56.dh, ahknVar56.kB);
            case 199:
                bvkr bvkrVar2 = (bvkr) this.b.bZ.b();
                ahkn ahknVar57 = this.a;
                eyik eyikVar110 = ahknVar57.cD;
                ahnh ahnhVar45 = ahknVar57.a;
                return new bvfj(bvkrVar2, ahnhVar45.tg, ahnhVar45.FW, (cogw) eyikVar110.b(), (eosc) ahknVar57.y.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d() {
        int i = this.c;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return new auab((atzy) this.b.av.b(), (fdjx) this.a.a.m.b());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                ahkn ahknVar = this.a;
                ahjr ahjrVar = this.b;
                ahnh ahnhVar = ahknVar.a;
                return new axnv(ahnhVar.c, ahjrVar.F, ahjrVar.ar, ahknVar.cD, ahnhVar.yw, ahnhVar.uu, ahnhVar.qq, ahjrVar.I, ahknVar.p);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                ahkn ahknVar2 = this.a;
                eosc eoscVar = (eosc) ahknVar2.aJ.b();
                eosc eoscVar2 = (eosc) ahknVar2.p.b();
                ahjr ahjrVar2 = this.b;
                eyik eyikVar = ahjrVar2.cq;
                ahnh ahnhVar2 = ahknVar2.a;
                eyik eyikVar2 = ahnhVar2.yw;
                eyik eyikVar3 = ahnhVar2.qM;
                eyik eyikVar4 = ahjrVar2.W;
                eyik eyikVar5 = ahjrVar2.F;
                eyik eyikVar6 = ahjrVar2.ar;
                eyik eyikVar7 = ahknVar2.kC;
                cmpq cmpqVar = (cmpq) eyikVar.b();
                asrh asrhVar = (asrh) ahnhVar2.Fd.b();
                cicm cicmVar = (cicm) ahjrVar2.br.b();
                eyik eyikVar8 = ahnhVar2.Cp;
                dqsn dqsnVar = (dqsn) ahnhVar2.qq.b();
                bveg bvegVar = (bveg) ahnhVar2.yx.b();
                crtq crtqVar = (crtq) ahjrVar2.cT.b();
                bydb bydbVar = (bydb) ahjrVar2.dc.b();
                bbfn bbfnVar = (bbfn) ahnhVar2.CF.b();
                cogw cogwVar = (cogw) ahknVar2.cD.b();
                chvp chvpVar = (chvp) ahjrVar2.bf.b();
                ayqn ayqnVar = (ayqn) ahjrVar2.dd.b();
                aypv aypvVar = (aypv) ahknVar2.ld.b();
                cohh cohhVar = (cohh) ahjrVar2.bV.b();
                cteb ctebVar = (cteb) ahjrVar2.aL.b();
                aslv aslvVar = (aslv) ahnhVar2.IF.b();
                eyik eyikVar9 = ahjrVar2.bM;
                cbtt cbttVarGW = ahnhVar2.gW();
                eygg eyggVarA = eyie.a(ahjrVar2.dq);
                eyik eyikVar10 = ahnhVar2.qi;
                eyik eyikVar11 = ahnhVar2.Jd;
                cavl cavlVar = (cavl) ahjrVar2.dr.b();
                eyik eyikVar12 = ahjrVar2.ds;
                eyik eyikVar13 = ahnhVar2.Jh;
                eyik eyikVar14 = ahjrVar2.dN;
                coor coorVar = (coor) ahnhVar2.Ju.b();
                eyik eyikVar15 = ahjrVar2.X;
                Object objB = ahknVar2.lz.b();
                eyik eyikVar16 = ahnhVar2.EN;
                eyik eyikVar17 = ahjrVar2.dX;
                eyik eyikVar18 = ahnhVar2.Jw;
                eyik eyikVar19 = ahjrVar2.dZ;
                aqoa aqoaVarBI = ahnhVar2.bI();
                eyik eyikVar20 = ahnhVar2.Jz;
                eyik eyikVar21 = ahjrVar2.ea;
                eyik eyikVar22 = ahjrVar2.G;
                apto aptoVarBo = ahnhVar2.bo();
                eyik eyikVar23 = ahnhVar2.JC;
                eyik eyikVar24 = ahjrVar2.dh;
                eyik eyikVar25 = ahjrVar2.co;
                eyik eyikVar26 = ahjrVar2.bo;
                eyik eyikVar27 = ahjrVar2.cn;
                eyik eyikVar28 = ahjrVar2.dl;
                return cosw.a(eoscVar, eoscVar2, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, ahjrVar2.aB, eyikVar7, cmpqVar, asrhVar, cicmVar, eyikVar8, dqsnVar, bvegVar, ahjrVar2.cS, crtqVar, bydbVar, bbfnVar, cogwVar, chvpVar, ayqnVar, aypvVar, cohhVar, ctebVar, aslvVar, cbttVarGW, ahjrVar2.dk, eyikVar28, eyggVarA, eyikVar10, eyikVar11, cavlVar, eyikVar12, eyikVar13, eyikVar14, coorVar, eyikVar15, objB, eyikVar16, eyikVar17, eyikVar18, eyikVar19, aqoaVarBI, eyikVar20, eyikVar27, eyikVar21, eyikVar22, eyikVar26, aptoVarBo, eyikVar25, eyikVar24, eyikVar23, (arph) ahnhVar2.ES.b(), ahnhVar2.bK(), ahjrVar2.bX);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                ahjr ahjrVar3 = this.b;
                bwfg bwfgVarBa = ahjrVar3.ba();
                ahjrVar3.hO();
                return new ccvw(bwfgVarBa, (apwn) this.a.a.Bg.b());
            case 204:
                ahjr ahjrVar4 = this.b;
                return new cscx(ahjrVar4.cI, ahjrVar4.cN, ahjrVar4.cR, ahjrVar4.cM, ahjrVar4.cH, ahjrVar4.cz, ahjrVar4.cQ, ahjrVar4.cL, (fdjx) this.a.a.oS.b());
            case 205:
                return ekhx.o(this.b.hw());
            case 206:
                ahjr ahjrVar5 = this.b;
                ahkn ahknVar3 = this.a;
                return new csek(ahjrVar5.cy, ahknVar3.cD, ahknVar3.cz);
            case 207:
                ahjr ahjrVar6 = this.b;
                ahnh ahnhVar3 = this.a.a;
                return new crxy(ahjrVar6.cx, ahnhVar3.GL, (fdjx) ahnhVar3.m.b(), (fdjx) ahnhVar3.oS.b());
            case 208:
                ahkn ahknVar4 = this.a;
                ahjr ahjrVar7 = this.b;
                eyik eyikVar29 = ahknVar4.cA;
                ahnh ahnhVar4 = ahknVar4.a;
                return new cryk(ahnhVar4.Gz, ahnhVar4.GA, ahnhVar4.BD, ahnhVar4.GB, ahnhVar4.BC, ahnhVar4.GD, ahjrVar7.cw, ahjrVar7.ct, ahjrVar7.W, ahjrVar7.F, ahjrVar7.ar, ahknVar4.cD, ahnhVar4.sX, (fcyh) eyikVar29.b());
            case 209:
                return new cspm(this.b.cv);
            case 210:
                return new ahim(this);
            case 211:
                ahjr ahjrVar8 = this.b;
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar5 = ahknVar5.a;
                return new csqg(ahjrVar8.W, ahjrVar8.F, ahjrVar8.ar, ahjrVar8.ct, ahknVar5.cD, (dqsn) ahnhVar5.qq.b(), (fdjx) ahnhVar5.oS.b());
            case 212:
                ahjr ahjrVar9 = this.b;
                return new csqi(ahjrVar9.cs, ahjrVar9.W, (fcyh) this.a.cA.b());
            case 213:
                ahjr ahjrVar10 = this.b;
                return new cspt(ahjrVar10.cr, ahjrVar10.W, this.a.a.qi);
            case 214:
                return new ahin(this);
            case 215:
                ahkn ahknVar6 = this.a;
                ahjr ahjrVar11 = this.b;
                ahnh ahnhVar6 = ahknVar6.a;
                return new csfg(ahknVar6.kF, ahjrVar11.cE, ahknVar6.kI, ahnhVar6.pQ, (fdjx) ahnhVar6.m.b());
            case 216:
                ahkn ahknVar7 = this.a;
                ahjr ahjrVar12 = this.b;
                eyik eyikVar30 = ahknVar7.cz;
                ahnh ahnhVar7 = ahknVar7.a;
                return new csrb(ahnhVar7.GQ, ahnhVar7.pE, ahnhVar7.uM, ahknVar7.cD, ahnhVar7.tf, ahjrVar12.W, ahknVar7.kJ, ahnhVar7.GR, ahnhVar7.Gz, ahnhVar7.pf, ahjrVar12.cD, (fcyh) eyikVar30.b());
            case 217:
                return new cspg(this.b.cC);
            case 218:
                return new ahio(this);
            case 219:
                ahkn ahknVar8 = this.a;
                ahjr ahjrVar13 = this.b;
                return new cspk(ahknVar8.kK, ahjrVar13.cw, ahjrVar13.ar);
            case 220:
                ahjr ahjrVar14 = this.b;
                ahnh ahnhVar8 = this.a.a;
                return new csed(ahjrVar14.cu, ahnhVar8.qN, ahjrVar14.cy, ahjrVar14.cG, (fdjx) ahnhVar8.oS.b());
            case 221:
                ahjr ahjrVar15 = this.b;
                ahnh ahnhVar9 = this.a.a;
                return new cryo(ahjrVar15.cx, ahnhVar9.GL, (fdjx) ahnhVar9.oQ.b());
            case 222:
                ahjr ahjrVar16 = this.b;
                return new csda(ahjrVar16.cJ, ahjrVar16.cM, ahjrVar16.cH, ahjrVar16.cz, (fdjx) this.a.a.oS.b());
            case 223:
                return ekhx.o(this.b.hx());
            case 224:
                ahkn ahknVar9 = this.a;
                ahjr ahjrVar17 = this.b;
                ahnh ahnhVar10 = ahknVar9.a;
                return new cseu(ahnhVar10.Hx, ahjrVar17.ct, ahjrVar17.F, ahjrVar17.cu, ahjrVar17.cB, ahnhVar10.ws, ahjrVar17.cz, ahjrVar17.cy, ahjrVar17.cK, ahjrVar17.cL, ahknVar9.cA);
            case 225:
                ahjr ahjrVar18 = this.b;
                ahnh ahnhVar11 = this.a.a;
                return new csrt(ahjrVar18.W, ahjrVar18.F, ahjrVar18.ar, ahjrVar18.cA, ahjrVar18.cu, ahjrVar18.cE, ahjrVar18.cH, (fdjx) ahnhVar11.oQ.b(), (fdjx) ahnhVar11.oS.b());
            case 226:
                ahkn ahknVar10 = this.a;
                return new csjd(ahknVar10.a.GD, this.b.cB, (fcyh) ahknVar10.cA.b());
            case 227:
                ahjr ahjrVar19 = this.b;
                ahkn ahknVar11 = this.a;
                return new csks(ahjrVar19.cI, ahjrVar19.F, ahjrVar19.ar, ahjrVar19.cu, ahjrVar19.cO, ahjrVar19.cM, ahjrVar19.cH, ahjrVar19.cN, ahjrVar19.cQ, ahknVar11.cD, ahknVar11.cA);
            case 228:
                return new cskv(this.a.a.rF);
            case 229:
                ahjr ahjrVar20 = this.b;
                ahkn ahknVar12 = this.a;
                return new cscs(ahjrVar20.cP, ahjrVar20.ct, ahjrVar20.cA, ahjrVar20.cD, ahjrVar20.F, ahjrVar20.ar, ahknVar12.a.qG, ahknVar12.cz);
            case 230:
                ahkn ahknVar13 = this.a;
                ahjr ahjrVar21 = this.b;
                eyik eyikVar31 = ahknVar13.cz;
                ahnh ahnhVar12 = ahknVar13.a;
                return new crtw(ahnhVar12.GA, ahnhVar12.BD, ahjrVar21.ar, ahjrVar21.ct, ahjrVar21.F, (fcyh) eyikVar31.b(), (fdjx) ahnhVar12.oQ.b());
            case 231:
                ahjr ahjrVar22 = this.b;
                ahkn ahknVar14 = this.a;
                return new crtq(ahjrVar22.W, ahjrVar22.F, ahjrVar22.ar, ahknVar14.a.HH, (eosc) ahknVar14.y.b());
            case 232:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar13 = ahknVar15.a;
                ains ainsVar = (ains) ahnhVar13.c.b();
                ahjr ahjrVar23 = this.b;
                return new bwtd(ainsVar, ahnhVar13.wv, ahjrVar23.ar, ahjrVar23.F, ahjrVar23.aC, ahnhVar13.qG, (dqsn) ahnhVar13.qq.b(), (cmvy) ahnhVar13.pE.b(), ahjrVar23.cU, (eosc) ahknVar15.y.b(), ahjrVar23.db, ahjrVar23.bH, ahnhVar13.Ip, ahnhVar13.IC, ahnhVar13.ID, ahnhVar13.qi, ahnhVar13.pl);
            case 233:
                ahkn ahknVar16 = this.a;
                ahjr ahjrVar24 = this.b;
                ahnh ahnhVar14 = ahknVar16.a;
                return new bwsk(ahnhVar14.qq, ahnhVar14.sG, ahjrVar24.cX, ahjrVar24.cY, ahjrVar24.cZ, ahjrVar24.da, ahnhVar14.uQ, ahnhVar14.Ip);
            case 234:
                ahjr ahjrVar25 = this.b;
                return new bwsr(ahjrVar25.ar, this.a.a.Ip, ahjrVar25.cW, ahjrVar25.cV);
            case 235:
                ahkn ahknVar17 = this.a;
                ahjr ahjrVar26 = this.b;
                ahnh ahnhVar15 = ahknVar17.a;
                return new bwtl(ahnhVar15.qG, ahjrVar26.F, ahjrVar26.ar, ahjrVar26.aC, ahjrVar26.cU, ahjrVar26.aI, ahnhVar15.Ip, ahjrVar26.bH, ahjrVar26.cV);
            case 236:
                return new bwth(this.b.ar);
            case 237:
                ahjr ahjrVar27 = this.b;
                return new bwtf(ahjrVar27.ar, ahjrVar27.aI, ahjrVar27.F, ahjrVar27.cU, ahjrVar27.cW, ahjrVar27.cV, this.a.a.It);
            case 238:
                ahjr ahjrVar28 = this.b;
                return new bwsf(ahjrVar28.X, ahjrVar28.cY);
            case 239:
                ahjr ahjrVar29 = this.b;
                return new bwsg(ahjrVar29.ar, ahjrVar29.cW, ahjrVar29.cY);
            case 240:
                ahjr ahjrVar30 = this.b;
                return new ayhr(ahjrVar30.dd, this.a.a.yr, ahjrVar30.di);
            case 241:
                ahkn ahknVar18 = this.a;
                crqv crqvVar = (crqv) ahknVar18.aT.b();
                Context context = (Context) ahknVar18.t.b();
                ahjr ahjrVar31 = this.b;
                ahnh ahnhVar16 = ahknVar18.a;
                return new cjnr(crqvVar, context, ahjrVar31.ar, ahnhVar16.yw, (asrf) ahnhVar16.rl.b(), (dqsn) ahnhVar16.qq.b(), (cjpo) ahnhVar16.yr.b(), ahnhVar16.yx, ahjrVar31.dh, ahnhVar16.Fc, ahnhVar16.pT, ahjrVar31.W, ahnhVar16.TI, ahnhVar16.TL, (eosc) ahknVar18.p.b());
            case 242:
                return new chgr((chgn) this.b.dg.b(), (fdjx) this.a.a.oQ.b());
            case 243:
                ahjr ahjrVar32 = this.b;
                cgxw cgxwVar = (cgxw) ahjrVar32.de.b();
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar17 = ahknVar19.a;
                return new chhh(cgxwVar, (asrh) ahnhVar17.Fd.b(), (auau) ahknVar19.ez.b(), ahjrVar32.W, ahknVar19.ii, ahknVar19.lk, ahnhVar17.pT, ahjrVar32.df, ahnhVar17.TK, ahnhVar17.TI, ahnhVar17.cw(), (fcyh) ahknVar19.cA.b());
            case 244:
                ahjr ahjrVar33 = this.b;
                return new asrt((awjh) ahjrVar33.E.b(), (awnf) ahjrVar33.G.b());
            case 245:
                ahkn ahknVar20 = this.a;
                Context context2 = (Context) ahknVar20.t.b();
                ahjr ahjrVar34 = this.b;
                eyik eyikVar32 = ahknVar20.de;
                eyik eyikVar33 = ahjrVar34.W;
                eyik eyikVar34 = ahjrVar34.F;
                cpiz cpizVar = (cpiz) eyikVar32.b();
                eyik eyikVar35 = ahjrVar34.cB;
                ahnh ahnhVar18 = ahknVar20.a;
                return new cpjp(context2, ahjrVar34.aE, ahjrVar34.bh, eyikVar33, eyikVar34, cpizVar, ahnhVar18.IG, (cpgf) eyikVar35.b(), (bxlc) ahjrVar34.U.b(), ahnhVar18.qN, (dqsn) ahnhVar18.qq.b(), ahjrVar34.cG, ahknVar20.ll, (fdjx) ahnhVar18.oS.b(), ahjrVar34.dj);
            case 246:
                return new coqq(this.a.a.rF);
            case 247:
                ahjr ahjrVar35 = this.b;
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar19 = ahknVar21.a;
                return ekhx.v(ahjrVar35.eN(), ahjrVar35.bl(), ahjrVar35.eP(), (bayb) ahnhVar19.Fl.b(), ahjrVar35.eR(), ahjrVar35.bm(), ahnhVar19.pt(), ahjrVar35.m78do(), ahjrVar35.eS(), ahjrVar35.eA(), ahnhVar19.hg(), (bayb) ahknVar21.kx.b(), ahjrVar35.D(), ahjrVar35.eV(), ahjrVar35.fa(), ahnhVar19.lN(), ahnhVar19.hz(), ahnhVar19.lG(), ahjrVar35.h());
            case 248:
                ahjr ahjrVar36 = this.b;
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar20 = ahknVar22.a;
                return new cknx(ahjrVar36.dm, ahknVar22.iv, ahnhVar20.IP, ahnhVar20.oQ, ahnhVar20.tC, ahnhVar20.IQ);
            case 249:
                ahkn ahknVar23 = this.a;
                dqsn dqsnVar2 = (dqsn) ahknVar23.a.qq.b();
                ahjr ahjrVar37 = this.b;
                return new ckwj(dqsnVar2, (bxlc) ahjrVar37.U.b(), ahjrVar37.hD(), (cogw) ahknVar23.cD.b());
            case 250:
                return new ckyn(this.a.a.rF);
            case 251:
                return new cqyx(this.b.U, (dqsn) this.a.a.qq.b());
            case 252:
                return new cavl(this.a.a.rF);
            case 253:
                ahkn ahknVar24 = this.a;
                eosc eoscVar3 = (eosc) ahknVar24.aJ.b();
                ahjr ahjrVar38 = this.b;
                ahnh ahnhVar21 = ahknVar24.a;
                return new assl(eoscVar3, ahjrVar38.F, (awhr) ahnhVar21.Jf.b(), ahnhVar21.dW());
            case 254:
                ahjr ahjrVar39 = this.b;
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar22 = ahknVar25.a;
                return new cgpk(ahjrVar39.dt, ahjrVar39.dv, ahknVar25.lx, ahjrVar39.dU, ahjrVar39.dV, (arpr) ahnhVar22.Be.b(), ahjrVar39.dW, ahknVar25.p, (asjn) ahnhVar22.vU.b(), ahnhVar22.cF(), ahnhVar22.cG());
            case 255:
                ahjr ahjrVar40 = this.b;
                return new cgkj(ahjrVar40.dH(), ahjrVar40.dG());
            case 256:
                ahkn ahknVar26 = this.a;
                Context context3 = (Context) ahknVar26.t.b();
                eosc eoscVar4 = (eosc) ahknVar26.p.b();
                eyik eyikVar36 = ahknVar26.aJ;
                eosc eoscVar5 = (eosc) eyikVar36.b();
                eosd eosdVar = (eosd) eyikVar36.b();
                ahjr ahjrVar41 = this.b;
                ahnh ahnhVar23 = ahknVar26.a;
                return new cgob(context3, eoscVar4, eoscVar5, eosdVar, ahnhVar23.io(), ahjrVar41.dL(), ahnhVar23.ip(), (cgoq) ahjrVar41.dB.b(), ahknVar26.cd(), (avmp) ahjrVar41.dx.b(), (Optional) ahnhVar23.qI.b(), ahnhVar23.aaJ, (cogw) ahknVar26.cD.b(), (cgoh) ahnhVar23.ael.b(), (cgql) ahknVar26.lx.b(), ahjrVar41.dN(), ahjrVar41.dM(), (Optional) ahnhVar23.oU.b(), ahnhVar23.Jd, Optional.empty(), (cgkj) ahjrVar41.dt.b(), Optional.of(ahknVar26.oE), ahnhVar23.pQ, ahjrVar41.dT, ahjrVar41.F);
            case 257:
                ahjr ahjrVar42 = this.b;
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar24 = ahknVar27.a;
                return cgmk.a(ahjrVar42.au, (fdjx) ahnhVar24.oS.b(), (cgpw) ahnhVar24.aek.b(), (arpr) ahnhVar24.Be.b(), ahnhVar24.pL.b(), (Context) ahknVar27.t.b(), ahnhVar24.Qp);
            case 258:
                ahkn ahknVar28 = this.a;
                Context context4 = (Context) ahknVar28.t.b();
                cgkb cgkbVar = (cgkb) this.b.dA.b();
                ahnh ahnhVar25 = ahknVar28.a;
                return new cgor(context4, cgkbVar, (Optional) ahnhVar25.qI.b(), ahnhVar25.pe);
            case 259:
                ahkn ahknVar29 = this.a;
                Context context5 = (Context) ahknVar29.t.b();
                ahjr ahjrVar43 = this.b;
                ahnh ahnhVar26 = ahknVar29.a;
                return new cgkb(context5, ahnhVar26.pd, ahnhVar26.pe, ahjrVar43.dz);
            case 260:
                ahjr ahjrVar44 = this.b;
                cglf cglfVar = cglf.NT_INCOMING_MESSAGE;
                cgiw cgiwVar = (cgiw) ahjrVar44.dv.b();
                ahkn ahknVar30 = this.a;
                return ekgp.p(cglfVar, cgiwVar, cglf.NT_SAFETYCORE_MISSING, ahknVar30.a.lF(), cglf.NT_SECONDARY_USER, ahjrVar44.dO(), cglf.NT_SHARE_PDU, (cgiw) ahknVar30.oH.b(), cglf.NT_INCOMING_UNAPPROVED_MESSAGE, ahjrVar44.dP());
            case 261:
                return new ueh(this.b.dw, this.a.cD);
            case 262:
                ahkn ahknVar31 = this.a;
                ahjr ahjrVar45 = this.b;
                ahnh ahnhVar27 = ahknVar31.a;
                return new cdoj(ahknVar31.cA, ahknVar31.bM, ahnhVar27.m, ahknVar31.ji, ahknVar31.cE, (anty) ahjrVar45.ap.b(), (anvh) ahnhVar27.zK.b(), ahnhVar27.bu());
            case 263:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar28 = ahknVar32.a;
                return new criz((fdjx) ahnhVar28.oQ.b(), (fcyh) ahknVar32.cz.b(), (fdjx) ahnhVar28.m.b(), (fcyh) ahknVar32.bM.b(), (cogw) ahknVar32.cD.b(), this.b.U, (dqsn) ahnhVar28.qq.b(), ahknVar32.jY);
            case 264:
                ahkn ahknVar33 = this.a;
                ahjr ahjrVar46 = this.b;
                eyik eyikVar37 = ahknVar33.t;
                eyik eyikVar38 = ahjrVar46.ar;
                eyik eyikVar39 = ahknVar33.cD;
                eyik eyikVar40 = ahjrVar46.dx;
                eyik eyikVar41 = ahjrVar46.dK;
                ahnh ahnhVar29 = ahknVar33.a;
                return new aydv(eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, ahnhVar29.Ct, ahjrVar46.dM, ahjrVar46.dN, ahjrVar46.aM, ahnhVar29.Qp, ahjrVar46.F);
            case 265:
                ahjr ahjrVar47 = this.b;
                ahkn ahknVar34 = this.a;
                eyik eyikVar42 = ahjrVar47.ar;
                ahnh ahnhVar30 = ahknVar34.a;
                return new ayft(eyikVar42, ahknVar34.cD, ahnhVar30.c, ahknVar34.y, ahknVar34.p, ahjrVar47.bV, ahnhVar30.Ju, ahnhVar30.Dw, ahjrVar47.dJ);
            case 266:
                return new atgy(this.b.af(), (fdjx) this.a.a.m.b());
            case 267:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar31 = ahknVar35.a;
                dqsn dqsnVar3 = (dqsn) ahnhVar31.qq.b();
                eosc eoscVar6 = (eosc) ahknVar35.aJ.b();
                ahjr ahjrVar48 = this.b;
                return new coum(dqsnVar3, eoscVar6, ahjrVar48.ar, (ayrm) ahjrVar48.dD.b(), ahjrVar48.aA(), (coyz) ahnhVar31.NB.b(), (axzc) ahjrVar48.dE.b(), (cogw) ahknVar35.cD.b());
            case 268:
                ahkn ahknVar36 = this.a;
                Context context6 = (Context) ahknVar36.t.b();
                ahjr ahjrVar49 = this.b;
                ahnh ahnhVar32 = ahknVar36.a;
                return new axzc(context6, ahjrVar49.ar, ahjrVar49.V, (cmqj) ahnhVar32.uv.b(), (dqsn) ahnhVar32.qq.b());
            case 269:
                ahjr ahjrVar50 = this.b;
                return new ccvu(ahjrVar50.bj(), (atnb) ahjrVar50.dH.b(), (apwn) this.a.a.Bg.b());
            case 270:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar33 = ahknVar37.a;
                cctj cctjVar = (cctj) ahnhVar33.Nv.b();
                ahjr ahjrVar51 = this.b;
                return new ccto(cctjVar, (ccer) ahjrVar51.at.b(), (ccpm) ahnhVar33.tI.b(), (ccap) ahjrVar51.dG.b(), (efob) ahknVar37.kz.b(), (arac) ahnhVar33.Nw.b());
            case 271:
                return new axxy((cqpz) this.a.aN.b(), (ayqx) this.b.dL.b());
            case 272:
                return new ayqx(this.b.ar, (ayqd) this.a.a.Ct.b());
            case 273:
                return Optional.of((clfb) this.b.dQ.b());
            case 274:
                ahkn ahknVar38 = this.a;
                Context context7 = (Context) ahknVar38.t.b();
                ahjr ahjrVar52 = this.b;
                eyik eyikVar43 = ahjrVar52.ar;
                eyik eyikVar44 = ahjrVar52.dP;
                eosc eoscVar7 = (eosc) ahknVar38.y.b();
                eosc eoscVar8 = (eosc) ahknVar38.p.b();
                ahnh ahnhVar34 = ahknVar38.a;
                return new czvx(context7, eyikVar43, eyikVar44, eoscVar7, eoscVar8, ahknVar38.cD, eyie.a(ahnhVar34.Cs), ahnhVar34.yw, ahnhVar34.qr, ahnhVar34.uM, ahjrVar52.dx, ahknVar38.om, ahjrVar52.U, ahknVar38.on, ahknVar38.oo, Optional.of(ahknVar38.op));
            case 275:
                return new cgfk(this.a.a.rF);
            case 276:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar35 = ahknVar39.a;
                fdjx fdjxVar = (fdjx) ahnhVar35.oS.b();
                fcyh fcyhVar = (fcyh) ahknVar39.cA.b();
                ahjr ahjrVar53 = this.b;
                return new csjz(fdjxVar, fcyhVar, ahnhVar35.pQ, ahjrVar53.ar, ahjrVar53.ct, eyie.a(ahjrVar53.dS), ahnhVar35.GA, ahnhVar35.BD);
            case 277:
                return new cpfc(this.b.W, (ajhd) this.a.a.yw.b());
            case 278:
                ahjr ahjrVar54 = this.b;
                return new cgrx((cgkj) ahjrVar54.dt.b(), ahjrVar54.dP());
            case 279:
                ahkn ahknVar40 = this.a;
                ahjr ahjrVar55 = this.b;
                ahnh ahnhVar36 = ahknVar40.a;
                return new akbq(ahknVar40.ly, ahnhVar36.oS, ahknVar40.cA, ahknVar40.jh, ahknVar40.ji, ahnhVar36.zK, ahnhVar36.vX, ahjrVar55.ap, ahnhVar36.qG, (ctce) ahnhVar36.yp.b(), ahnhVar36.Jo, (aptm) ahnhVar36.vV.b(), (asjn) ahnhVar36.vU.b(), ahnhVar36.cF(), ahnhVar36.cG(), (aofc) ahjrVar55.I.b(), ahnhVar36.Jp, ahknVar40.cE);
            case 280:
                return new cgqt(this.a.a.rF);
            case 281:
                ahkn ahknVar41 = this.a;
                ahjr ahjrVar56 = this.b;
                ahnh ahnhVar37 = ahknVar41.a;
                return new cmpv(ahnhVar37.Fd, ahjrVar56.cq, ahnhVar37.yw, ahnhVar37.rl, ahjrVar56.F, ahjrVar56.W, ahknVar41.cl(), (fdjx) ahnhVar37.oQ.b(), ahnhVar37.pT);
            case 282:
                ahjr ahjrVar57 = this.b;
                ahkn ahknVar42 = this.a;
                return new ciwn(ahjrVar57.J, ahjrVar57.dY, (fcyh) ahknVar42.cA.b(), (fdjx) ahknVar42.a.m.b());
            case 283:
                ahjr ahjrVar58 = this.b;
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar38 = ahknVar43.a;
                return new baqs(ahjrVar58.F, (alrj) ahnhVar38.qi.b(), (dghj) ahnhVar38.rW.b(), (bbdl) ahnhVar38.qG.b(), (fcyh) ahknVar43.cz.b(), (fdjx) ahnhVar38.oQ.b());
            case 284:
                ahkn ahknVar44 = this.a;
                Context context8 = (Context) ahknVar44.t.b();
                ahjr ahjrVar59 = this.b;
                ahnh ahnhVar39 = ahknVar44.a;
                return new asof(context8, ahnhVar39.sG, ahnhVar39.yw, ahknVar44.cQ, ahjrVar59.W, ahjrVar59.F, ahknVar44.aQ, ahnhVar39.uv, ahjrVar59.dN);
            case 285:
                ahkn ahknVar45 = this.a;
                return new aspa((eosc) ahknVar45.p.b(), (eosc) ahknVar45.y.b(), this.b.ec, ahknVar45.ez);
            case 286:
                ahjr ahjrVar60 = this.b;
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar40 = ahknVar46.a;
                return new aybx(ahjrVar60.W, ahjrVar60.F, ahnhVar40.JE, ahjrVar60.ar, ahnhVar40.Jd, ahknVar46.cD, ahjrVar60.U, ahjrVar60.bf, ahjrVar60.bh);
            case 287:
                ahkn ahknVar47 = this.a;
                ahjr ahjrVar61 = this.b;
                eyik eyikVar45 = ahjrVar61.aL;
                ahnh ahnhVar41 = ahknVar47.a;
                eyik eyikVar46 = ahnhVar41.JH;
                eyik eyikVar47 = ahjrVar61.W;
                eyik eyikVar48 = ahjrVar61.ar;
                eyik eyikVar49 = ahnhVar41.Jd;
                cteb ctebVar2 = (cteb) eyikVar45.b();
                crtq crtqVar2 = (crtq) ahjrVar61.cT.b();
                eyik eyikVar50 = ahnhVar41.yw;
                eyik eyikVar51 = ahjrVar61.eg;
                bbhh bbhhVar = (bbhh) ahjrVar61.ab.b();
                Optional optional = (Optional) ahjrVar61.aK.b();
                axrs axrsVarAz = ahjrVar61.az();
                eyik eyikVar52 = ahnhVar41.BI;
                cbtt cbttVarGW2 = ahnhVar41.gW();
                bbgy bbgyVar = (bbgy) ahnhVar41.JM.b();
                cggg cgggVar = (cggg) ahjrVar61.aM.b();
                bxlc bxlcVar = (bxlc) ahjrVar61.U.b();
                bbfn bbfnVar2 = (bbfn) ahnhVar41.CF.b();
                cjnr cjnrVar = (cjnr) ahjrVar61.di.b();
                ayfx ayfxVar = (ayfx) ahnhVar41.Mr.b();
                ayeo ayeoVar = (ayeo) ahjrVar61.es.b();
                bveg bvegVar2 = (bveg) ahnhVar41.yx.b();
                dqsn dqsnVar4 = (dqsn) ahnhVar41.qq.b();
                eyik eyikVar53 = ahjrVar61.dc;
                Object objGC = ahjrVar61.gC();
                bydb bydbVar2 = (bydb) eyikVar53.b();
                eyik eyikVar54 = ahjrVar61.cq;
                eyik eyikVar55 = ahnhVar41.Cp;
                cmpq cmpqVar2 = (cmpq) eyikVar54.b();
                asrh asrhVar2 = (asrh) ahnhVar41.Fd.b();
                asra asraVar = (asra) ahnhVar41.Fc.b();
                eyik eyikVar56 = ahnhVar41.Hf;
                eygg eyggVarA2 = eyie.a(ahjrVar61.dq);
                eyik eyikVar57 = ahnhVar41.qi;
                eyik eyikVar58 = ahknVar47.lw;
                eyik eyikVar59 = ahjrVar61.ds;
                ains ainsVar2 = (ains) ahnhVar41.pb.b();
                eyik eyikVar60 = ahnhVar41.pQ;
                eyik eyikVar61 = ahnhVar41.zO;
                eyik eyikVar62 = ahjrVar61.ai;
                eyik eyikVar63 = ahjrVar61.dN;
                eyik eyikVar64 = ahjrVar61.X;
                eyik eyikVar65 = ahnhVar41.MY;
                eyik eyikVar66 = ahnhVar41.rl;
                eyik eyikVar67 = ahnhVar41.qG;
                eyik eyikVar68 = ahknVar47.jj;
                eyik eyikVar69 = ahnhVar41.pD;
                eyik eyikVar70 = ahknVar47.ld;
                eyik eyikVar71 = ahjrVar61.dX;
                eyik eyikVar72 = ahjrVar61.F;
                Optional optionalOf = Optional.of(ahknVar47.bT());
                eyik eyikVar73 = ahjrVar61.et;
                efnn efnnVarMD = ahnhVar41.mD();
                eyik eyikVar74 = ahjrVar61.dY;
                eyik eyikVar75 = ahjrVar61.J;
                eyik eyikVar76 = ahnhVar41.EN;
                eyik eyikVar77 = ahjrVar61.av;
                eyik eyikVar78 = ahjrVar61.G;
                eyik eyikVar79 = ahnhVar41.sP;
                apto aptoVarBo2 = ahnhVar41.bo();
                eyik eyikVar80 = ahjrVar61.co;
                return new civx(eyikVar46, eyikVar47, eyikVar48, ahjrVar61.aB, eyikVar49, ctebVar2, ahjrVar61.cS, crtqVar2, eyikVar50, eyikVar51, bbhhVar, optional, axrsVarAz, eyikVar52, cbttVarGW2, bbgyVar, cgggVar, bxlcVar, bbfnVar2, cjnrVar, ayfxVar, ayeoVar, bvegVar2, dqsnVar4, (civf) objGC, bydbVar2, eyikVar55, cmpqVar2, asrhVar2, asraVar, eyikVar56, ahjrVar61.dk, eyggVarA2, eyikVar57, eyikVar58, eyikVar59, ainsVar2, eyikVar60, eyikVar61, eyikVar62, eyikVar63, eyikVar64, eyikVar65, eyikVar66, eyikVar67, eyikVar68, eyikVar69, eyikVar70, eyikVar71, eyikVar72, optionalOf, eyikVar73, efnnVarMD, eyikVar74, eyikVar75, eyikVar76, eyikVar77, eyikVar78, eyikVar79, aptoVarBo2, eyikVar80, (fdjx) ahnhVar41.oS.b(), (fdjx) ahnhVar41.m.b(), ahjrVar61.br, (aqoc) ahnhVar41.MW.b(), ahnhVar41.Na, ahjrVar61.dg, ahnhVar41.Nc, ahknVar47.lk, ahknVar47.ii, (arph) ahnhVar41.ES.b(), ahnhVar41.Nd);
            case 288:
                ahjr ahjrVar62 = this.b;
                ahkn ahknVar48 = this.a;
                eyik eyikVar81 = ahknVar48.cz;
                eyik eyikVar82 = ahjrVar62.ar;
                eyik eyikVar83 = ahjrVar62.dC;
                fcyh fcyhVar2 = (fcyh) eyikVar81.b();
                fcyh fcyhVar3 = (fcyh) ahknVar48.bM.b();
                ahnh ahnhVar42 = ahknVar48.a;
                return new crcm(eyikVar82, eyikVar83, fcyhVar2, fcyhVar3, (fdjx) ahnhVar42.oQ.b(), (fdjx) ahnhVar42.m.b(), ahjrVar62.ef, ahnhVar42.BI, ahnhVar42.Cc);
            case 289:
                ahkn ahknVar49 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar49.cz.b();
                ahjr ahjrVar63 = this.b;
                return new crgm(fcyhVar4, ahknVar49.cD, ahjrVar63.ar, ahjrVar63.W, ahknVar49.aN, ahjrVar63.dC, ahjrVar63.ee);
            case 290:
                ahkn ahknVar50 = this.a;
                fcyh fcyhVar5 = (fcyh) ahknVar50.cz.b();
                ahnh ahnhVar43 = ahknVar50.a;
                return new aglr(fcyhVar5, (fdjx) ahnhVar43.m.b(), (byeq) ahnhVar43.sG.b(), (cogw) ahknVar50.cD.b(), ahnhVar43.Wp, this.b.ar);
            case 291:
                return new cawa(this.a.a.rF);
            case 292:
                return new ayeo(this.b.er, this.a.a.BI);
            case 293:
                ahjr ahjrVar64 = this.b;
                eyik eyikVar84 = ahjrVar64.ar;
                crbb crbbVar = (crbb) ahjrVar64.ef.b();
                ahkn ahknVar51 = this.a;
                ahnh ahnhVar44 = ahknVar51.a;
                return new ayez(eyikVar84, crbbVar, (cray) ahnhVar44.Mv.b(), ahnhVar44.Cc, ahjrVar64.aE(), (eosc) ahknVar51.p.b(), (eosc) ahknVar51.y.b(), (axpa) ahnhVar44.MT.b());
            case 294:
                ahjr ahjrVar65 = this.b;
                return new ayca(ahjrVar65.ar, ahjrVar65.ej, ahjrVar65.el, ahjrVar65.fI(), (eosc) this.a.y.b());
            case 295:
                return Optional.of((cdvn) this.b.ei.b());
            case 296:
                ahkn ahknVar52 = this.a;
                ahnh ahnhVar45 = ahknVar52.a;
                return new afko((fdjx) ahnhVar45.m.b(), (fcyh) ahknVar52.cz.b(), (dqsy) ahnhVar45.tt.b(), this.b.ar);
            case 297:
                return Optional.of((afkc) this.b.ek.b());
            case 298:
                ahkn ahknVar53 = this.a;
                ahnh ahnhVar46 = ahknVar53.a;
                return new afki((fdjx) ahnhVar46.m.b(), (fdjx) ahnhVar46.oQ.b(), (fcyh) ahknVar53.cz.b(), this.b.ar, (cogw) ahknVar53.cD.b());
            case 299:
                ahjr ahjrVar66 = this.b;
                return new csjq(ahjrVar66.cM, ahjrVar66.cQ, ahjrVar66.cz, (fdjx) this.a.a.oQ.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        Object ajvoVar;
        int i = this.c;
        switch (i) {
            case 300:
                ahjr ahjrVar = this.b;
                return new crie(ahjrVar.en, ahjrVar.ar, ahjrVar.eo, (bxlc) ahjrVar.U.b(), ahjrVar.dC);
            case 301:
                ahjr ahjrVar2 = this.b;
                ahnh ahnhVar = this.a.a;
                return new cskc(ahjrVar2.cM, ahjrVar2.cQ, ahjrVar2.cz, ahjrVar2.el, ahjrVar2.ar, (fdjx) ahnhVar.oQ.b());
            case 302:
                ahjr ahjrVar3 = this.b;
                ahkn ahknVar = this.a;
                ahnh ahnhVar2 = ahknVar.a;
                return new cpdr(ahjrVar3.ar, ahjrVar3.X, ahjrVar3.Y, (bveg) ahnhVar2.yx.b(), (appk) ahnhVar2.HQ.b(), (fdjx) ahnhVar2.oQ.b(), (fcyh) ahknVar.cz.b(), ahknVar.cD);
            case 303:
                return new cqzn(this.b.dp);
            case 304:
                ahjr ahjrVar4 = this.b;
                cteb ctebVar = (cteb) ahjrVar4.aL.b();
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar3 = ahknVar2.a;
                ajhd ajhdVar = (ajhd) ahnhVar3.yw.b();
                cogw cogwVar = (cogw) ahknVar2.cD.b();
                eyik eyikVar = ahnhVar3.wv;
                eyik eyikVar2 = ahjrVar4.ar;
                eyik eyikVar3 = ahjrVar4.W;
                eyik eyikVar4 = ahjrVar4.ev;
                ains ainsVar = (ains) ahnhVar3.c.b();
                dqsn dqsnVar = (dqsn) ahnhVar3.qq.b();
                cqjy cqjyVar = (cqjy) ahnhVar3.Ci.b();
                Optional optional = (Optional) ahknVar2.ku.b();
                auau auauVar = (auau) ahknVar2.ez.b();
                eyik eyikVar5 = ahknVar2.aJ;
                eyik eyikVar6 = ahnhVar3.Fk;
                eyik eyikVar7 = ahjrVar4.F;
                eyik eyikVar8 = ahknVar2.dL;
                eyik eyikVar9 = ahjrVar4.eA;
                eyik eyikVar10 = ahjrVar4.U;
                eyik eyikVar11 = ahnhVar3.pT;
                eyik eyikVar12 = ahnhVar3.xO;
                eyik eyikVar13 = ahnhVar3.pb;
                eyik eyikVar14 = ahnhVar3.FC;
                eosc eoscVar = (eosc) eyikVar5.b();
                eosc eoscVar2 = (eosc) ahknVar2.p.b();
                eyik eyikVar15 = ahnhVar3.FD;
                awlc awlcVar = (awlc) ahnhVar3.FE.b();
                eyik eyikVar16 = ahnhVar3.FI;
                eyik eyikVar17 = ahjrVar4.eB;
                apto aptoVarBo = ahnhVar3.bo();
                awlc awlcVar2 = (awlc) ahnhVar3.Nq.b();
                asbq asbqVarCB = ahnhVar3.cB();
                eyik eyikVar18 = ahjrVar4.bH;
                return new ciwi(ctebVar, ajhdVar, cogwVar, eyikVar, ahjrVar4.aA, eyikVar2, eyikVar3, eyikVar4, ainsVar, dqsnVar, cqjyVar, optional, auauVar, eyikVar6, eyikVar7, eyikVar8, ahjrVar4.aI, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyikVar13, eyikVar14, eoscVar, eoscVar2, eyikVar15, awlcVar, eyikVar18, eyikVar16, eyikVar17, aptoVarBo, awlcVar2, asbqVarCB);
            case 305:
                ahjr ahjrVar5 = this.b;
                ahkn ahknVar3 = this.a;
                return new bxjg(ahjrVar5.U, ahknVar3.a.qq, ahknVar3.dL);
            case 306:
                ahjr ahjrVar6 = this.b;
                return new bayi(ahjrVar6.ex, ahjrVar6.ez);
            case 307:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar4 = ahknVar4.a;
                return ekhx.t(ahknVar4.cT(), (bayh) ahnhVar4.Fl.b(), ahnhVar4.ps(), (bayh) this.b.ew.b());
            case 308:
                ahkn ahknVar5 = this.a;
                cogw cogwVar2 = (cogw) ahknVar5.cD.b();
                ahnh ahnhVar5 = ahknVar5.a;
                cdik cdikVarHv = ahnhVar5.hv();
                cgbn cgbnVar = (cgbn) ahnhVar5.Cs.b();
                ahjr ahjrVar7 = this.b;
                eyik eyikVar19 = ahknVar5.aJ;
                return new ckfw(cogwVar2, cdikVarHv, cgbnVar, ahjrVar7.F, ahjrVar7.ar, ahnhVar5.uu, ahnhVar5.Fs, ahknVar5.kw, ahjrVar7.bG, ahnhVar5.Ft, (eosc) eyikVar19.b(), ahnhVar5.Fu, ahnhVar5.DX, ahnhVar5.Fv, ahnhVar5.Fw, (aquo) ahnhVar5.pl.b(), ahnhVar5.cv(), ahnhVar5.cu());
            case 309:
                return ekhx.r(this.a.a.pr(), (bayg) this.b.ey.b());
            case 310:
                ahkn ahknVar6 = this.a;
                eyik eyikVar20 = ahknVar6.cD;
                ahnh ahnhVar6 = ahknVar6.a;
                eyik eyikVar21 = ahnhVar6.Fo;
                cogw cogwVar3 = (cogw) eyikVar20.b();
                ahjr ahjrVar8 = this.b;
                return new ckfo(eyikVar21, cogwVar3, ahjrVar8.F, ahjrVar8.bG, ahjrVar8.ew, ahjrVar8.ar, ahnhVar6.Fy, (aquo) ahnhVar6.pl.b());
            case 311:
                return new ahip(this);
            case 312:
                ahkn ahknVar7 = this.a;
                cogw cogwVar4 = (cogw) ahknVar7.cD.b();
                ahnh ahnhVar7 = ahknVar7.a;
                cbun cbunVar = (cbun) ahnhVar7.yy.b();
                ccpm ccpmVar = (ccpm) ahnhVar7.tI.b();
                awlc awlcVar3 = (awlc) ahnhVar7.FK.b();
                ahjr ahjrVar9 = this.b;
                return new cbzd(cogwVar4, cbunVar, ccpmVar, awlcVar3, ahjrVar9.dd(), ahnhVar7.cg(), (cbqj) ahjrVar9.as.b(), ahnhVar7.No, (ains) ahnhVar7.pQ.b(), (fdjx) ahnhVar7.oQ.b());
            case 313:
                return new ahiq(this);
            case 314:
                return new ahir(this);
            case 315:
                return new ahis(this);
            case 316:
                return new ahit(this);
            case 317:
                ahkn ahknVar8 = this.a;
                Context context = (Context) ahknVar8.t.b();
                eosc eoscVar3 = (eosc) ahknVar8.aJ.b();
                eosc eoscVar4 = (eosc) ahknVar8.y.b();
                eosc eoscVar5 = (eosc) ahknVar8.p.b();
                ahnh ahnhVar8 = ahknVar8.a;
                return new ctdx(context, eoscVar3, eoscVar4, eoscVar5, (cmuq) ahnhVar8.wJ.b(), (cmqj) ahnhVar8.uv.b(), (ceae) ahnhVar8.uD.b(), (cmos) ahnhVar8.Ck.b(), (dzqp) ahknVar8.gw.b(), ahnhVar8.lL(), ahnhVar8.lK(), this.b.ar);
            case 318:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar9 = ahknVar9.a;
                return new cllp((fdjx) ahnhVar9.m.b(), (fcyh) ahknVar9.cz.b(), ahnhVar9.st, this.b.ar);
            case 319:
                ahkn ahknVar10 = this.a;
                Context context2 = (Context) ahknVar10.t.b();
                ahjr ahjrVar10 = this.b;
                ahnh ahnhVar10 = ahknVar10.a;
                eyik eyikVar22 = ahnhVar10.wv;
                eyik eyikVar23 = ahjrVar10.dp;
                eyik eyikVar24 = ahjrVar10.F;
                eyik eyikVar25 = ahnhVar10.uQ;
                eyik eyikVar26 = ahjrVar10.V;
                eyik eyikVar27 = ahjrVar10.ar;
                eyik eyikVar28 = ahjrVar10.eL;
                bbdl bbdlVar = (bbdl) ahnhVar10.qG.b();
                bagw bagwVar = (bagw) ahjrVar10.bE.b();
                cmuq cmuqVar = (cmuq) ahnhVar10.wJ.b();
                eyik eyikVar29 = ahnhVar10.uy;
                bbhh bbhhVar = (bbhh) ahjrVar10.ab.b();
                eyik eyikVar30 = ahjrVar10.eg;
                eyik eyikVar31 = ahnhVar10.BI;
                crej crejVar = (crej) ahnhVar10.BH.b();
                crma crmaVar = (crma) ahknVar10.da.b();
                cqmr cqmrVar = (cqmr) ahknVar10.eK.b();
                cmqj cmqjVar = (cmqj) ahnhVar10.uv.b();
                Optional optional2 = (Optional) ahknVar10.dn.b();
                cogw cogwVar5 = (cogw) ahknVar10.cD.b();
                aipo aipoVar = (aipo) ahnhVar10.us.b();
                ains ainsVar2 = (ains) ahnhVar10.c.b();
                eyik eyikVar32 = ahnhVar10.yw;
                eyik eyikVar33 = ahnhVar10.NG;
                axpg axpgVarAK = ahknVar10.aK();
                bbgy bbgyVar = (bbgy) ahnhVar10.JM.b();
                bbfk bbfkVar = (bbfk) ahnhVar10.Dx.b();
                bxlc bxlcVar = (bxlc) ahjrVar10.U.b();
                ayeo ayeoVar = (ayeo) ahjrVar10.es.b();
                bveg bvegVar = (bveg) ahnhVar10.yx.b();
                dqsn dqsnVar2 = (dqsn) ahnhVar10.qq.b();
                eyik eyikVar34 = ahjrVar10.dc;
                eyik eyikVar35 = ahnhVar10.Cp;
                bydb bydbVar = (bydb) eyikVar34.b();
                eyik eyikVar36 = ahjrVar10.X;
                alrj alrjVar = (alrj) ahnhVar10.qi.b();
                eyik eyikVar37 = ahjrVar10.eM;
                eyik eyikVar38 = ahjrVar10.eN;
                cgdh cgdhVar = (cgdh) ahnhVar10.NH.b();
                eyik eyikVar39 = ahnhVar10.qN;
                eyik eyikVar40 = ahnhVar10.zO;
                eyik eyikVar41 = ahjrVar10.ap;
                eyik eyikVar42 = ahnhVar10.DE;
                eyik eyikVar43 = ahnhVar10.NI;
                eyik eyikVar44 = ahjrVar10.dN;
                eyik eyikVar45 = ahjrVar10.dD;
                eyik eyikVar46 = ahnhVar10.NK;
                eyik eyikVar47 = ahjrVar10.bo;
                eyik eyikVar48 = ahjrVar10.bm;
                eyik eyikVar49 = ahjrVar10.bh;
                eyik eyikVar50 = ahjrVar10.bJ;
                eyik eyikVar51 = ahjrVar10.be;
                return new axrj(context2, eyikVar22, eyikVar23, eyikVar24, ahjrVar10.aA, eyikVar25, eyikVar26, eyikVar27, ahjrVar10.aB, eyikVar51, eyikVar28, eyikVar50, bbdlVar, bagwVar, cmuqVar, eyikVar29, bbhhVar, eyikVar30, eyikVar31, crejVar, crmaVar, cqmrVar, cmqjVar, optional2, cogwVar5, aipoVar, ainsVar2, eyikVar32, eyikVar33, axpgVarAK, bbgyVar, bbfkVar, bxlcVar, ayeoVar, bvegVar, dqsnVar2, eyikVar35, bydbVar, eyikVar36, alrjVar, eyikVar37, eyikVar38, cgdhVar, eyikVar39, eyikVar49, eyikVar48, eyikVar47, eyikVar40, eyikVar41, eyikVar42, eyikVar43, eyikVar44, eyikVar45, eyikVar46, ahjrVar10.J, ahnhVar10.yr, ahnhVar10.qa, ahnhVar10.ND, ahnhVar10.NL, ahnhVar10.pf, ahnhVar10.FE, ahknVar10.ez, ahnhVar10.bi(), (eosc) ahknVar10.p.b(), (fdjx) ahnhVar10.oS.b(), ahjrVar10.aP(), (aoou) ahnhVar10.tk.b(), ahnhVar10.wc, ahnhVar10.MP, (AtomicReference) ahnhVar10.NX.b(), ahnhVar10.NY, ahnhVar10.Dw, ahnhVar10.NZ, ahnhVar10.Oa, ahnhVar10.Ob, (aqee) ahnhVar10.NW.b(), (apwn) ahnhVar10.Bg.b(), (arnv) ahnhVar10.yG.b(), ahjrVar10.dJ, ahnhVar10.Ow, (aqzn) ahnhVar10.Or.b(), ahnhVar10.Ox);
            case 320:
                ahjr ahjrVar11 = this.b;
                return new auue(ahjrVar11.U, (dqsn) this.a.a.qq.b(), ahjrVar11.W, ahjrVar11.F);
            case 321:
                ahkn ahknVar11 = this.a;
                Context context3 = (Context) ahknVar11.t.b();
                ahjr ahjrVar12 = this.b;
                ahnh ahnhVar11 = ahknVar11.a;
                return new bxog(context3, ahnhVar11.NS, ahjrVar12.eO, ahnhVar11.qq, ahknVar11.ic, ahnhVar11.zt, ahnhVar11.NU);
            case 322:
                ahjr ahjrVar13 = this.b;
                return new bayy((bxlc) ahjrVar13.U.b(), ahjrVar13.bH);
            case 323:
                return new chet((cheq) this.b.eR.b(), (fdjx) this.a.a.m.b());
            case 324:
                return new asrr((asrp) this.b.df.b(), (fdjx) this.a.a.m.b());
            case 325:
                return new aujw(this.b.au(), new aujg());
            case 326:
                ahjr ahjrVar14 = this.b;
                asrc asrcVar = (asrc) ahjrVar14.aO.b();
                ahnh ahnhVar12 = this.a.a;
                return new aujo(asrcVar, (fdjx) ahnhVar12.m.b(), (awnf) ahjrVar14.G.b(), (ardl) ahnhVar12.sB.b());
            case 327:
                ahkn ahknVar12 = this.a;
                eosc eoscVar6 = (eosc) ahknVar12.p.b();
                cbtv cbtvVarCY = this.b.cY();
                atak atakVar = (atak) ahknVar12.kA.b();
                ahnh ahnhVar13 = ahknVar12.a;
                return new atya(eoscVar6, cbtvVarCY, atakVar, (atwc) ahknVar12.fi(), ahnhVar13.OQ, ahnhVar13.Jw, ahnhVar13.sh, ahnhVar13.rW, ahnhVar13.se);
            case 328:
                ahjr ahjrVar15 = this.b;
                return atxe.a(ahjrVar15.eZ.b(), ahjrVar15.aq(), (asnl) ahjrVar15.fa.b(), (fdjx) this.a.a.oS.b());
            case 329:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar14 = ahknVar13.a;
                asnz asnzVarCJ = ahnhVar14.cJ();
                eosc eoscVar7 = (eosc) ahknVar13.p.b();
                eosc eoscVar8 = (eosc) ahknVar13.y.b();
                eyik eyikVar52 = ahnhVar14.pB;
                eygg eyggVarA = eyie.a(ahnhVar14.Pf);
                eygg eyggVarA2 = eyie.a(ahnhVar14.Pg);
                Context context4 = (Context) ahknVar13.t.b();
                aslv aslvVar = (aslv) ahnhVar14.IF.b();
                cogw cogwVar6 = (cogw) ahknVar13.cD.b();
                aspz aspzVar = (aspz) ahnhVar14.vR.b();
                aipo aipoVar2 = (aipo) ahnhVar14.us.b();
                asof asofVar = (asof) this.b.ea.b();
                eosd eosdVar = (eosd) ahknVar13.p.b();
                eyik eyikVar53 = ahnhVar14.Ph;
                return new asnl(asnzVarCJ, eoscVar7, eoscVar8, eyikVar52, eyggVarA, eyggVarA2, context4, aslvVar, cogwVar6, aspzVar, aipoVar2, asofVar, eosdVar, eyikVar53);
            case 330:
                ahkn ahknVar14 = this.a;
                ahjr ahjrVar16 = this.b;
                ahnh ahnhVar15 = ahknVar14.a;
                return new aykj(ahknVar14.p, ahjrVar16.fd, ahnhVar15.qG, ahnhVar15.pT, ahnhVar15.rW, ahjrVar16.aI);
            case 331:
                return new ahiu(this);
            case 332:
                return new ahiw(this);
            case 333:
                return new bwnw(this.a.a.rF);
            case 334:
                chgf chgfVar = new chgf();
                ahkn ahknVar15 = this.a;
                ahjr ahjrVar17 = this.b;
                ahnh ahnhVar16 = ahknVar15.a;
                chgb chgbVarIO = ahnhVar16.iO();
                chep chepVarEd = ahjrVar17.ed();
                chfk chfkVarIN = ahnhVar16.iN();
                chfn chfnVarEf = ahjrVar17.ef();
                chfh chfhVar = new chfh();
                chel chelVarIK = ahnhVar16.iK();
                chfc chfcVarEe = ahjrVar17.ee();
                chge chgeVarEg = ahjrVar17.eg();
                asbs asbsVar = (asbs) ahnhVar16.OA.b();
                ahjrVar17.hM();
                return chey.a(chgfVar, chgbVarIO, chepVarEd, chfkVarIN, chfnVarEf, chfhVar, chelVarIK, chfcVarEe, chgeVarEg, asbsVar, (apwn) ahnhVar16.Bg.b());
            case 335:
                ahjr ahjrVar18 = this.b;
                return chca.a(ahjrVar18.dY(), ahjrVar18.dX(), ahjrVar18.dZ());
            case 336:
                return Optional.of(this.b.dc());
            case 337:
                return new ahix();
            case 338:
                return chdc.a(this.b.ea());
            case 339:
                ahkn ahknVar16 = this.a;
                ahjr ahjrVar19 = this.b;
                return chdx.a(ahknVar16.a.iJ(), ahjrVar19.ec(), ahjrVar19.eb(), new chdy());
            case 340:
                ahjr ahjrVar20 = this.b;
                asrc asrcVar2 = (asrc) ahjrVar20.aO.b();
                ahkn ahknVar17 = this.a;
                eyik eyikVar54 = ahjrVar20.bs;
                ahnh ahnhVar17 = ahknVar17.a;
                return new cnhg(asrcVar2, ahnhVar17.qM, ahjrVar20.bt, (cnck) eyikVar54.b(), (cnas) ahjrVar20.fo.b(), (cnlh) ahjrVar20.D.b(), (awxo) ahnhVar17.sP.b(), (awjh) ahjrVar20.E.b(), (awnf) ahjrVar20.G.b(), (awjd) ahjrVar20.ax.b(), (arph) ahnhVar17.ES.b(), (fdjx) ahnhVar17.m.b(), (fcyh) ahknVar17.cA.b(), (ains) ahnhVar17.pQ.b(), ahnhVar17.bF());
            case 341:
                return new ahiy(this);
            case 342:
                ahkn ahknVar18 = this.a;
                ahjr ahjrVar21 = this.b;
                ahnh ahnhVar18 = ahknVar18.a;
                return chjh.a(ahnhVar18.iT(), ahjrVar21.ep(), ahjrVar21.en(), ahjrVar21.eo(), ahjrVar21.el(), ahjrVar21.em(), (aptb) ahnhVar18.Dl.b(), (aprt) ahnhVar18.Uj.b(), ahnhVar18.iR());
            case 343:
                ahkn ahknVar19 = this.a;
                Context context5 = (Context) ahknVar19.t.b();
                ahjr ahjrVar22 = this.b;
                ahnh ahnhVar19 = ahknVar19.a;
                eyik eyikVar55 = ahjrVar22.W;
                eyik eyikVar56 = ahjrVar22.F;
                eyik eyikVar57 = ahjrVar22.ar;
                eyik eyikVar58 = ahnhVar19.Jd;
                eyik eyikVar59 = ahnhVar19.qG;
                eyik eyikVar60 = ahnhVar19.uy;
                eyik eyikVar61 = ahnhVar19.Hf;
                eyik eyikVar62 = ahnhVar19.BI;
                eyik eyikVar63 = ahnhVar19.yw;
                eyik eyikVar64 = ahjrVar22.eg;
                eyik eyikVar65 = ahjrVar22.ab;
                eyik eyikVar66 = ahnhVar19.vh;
                eyik eyikVar67 = ahnhVar19.pE;
                eyik eyikVar68 = ahnhVar19.zj;
                eyik eyikVar69 = ahnhVar19.TW;
                eyik eyikVar70 = ahnhVar19.qq;
                eyik eyikVar71 = ahnhVar19.wF;
                eyik eyikVar72 = ahjrVar22.fr;
                eyik eyikVar73 = ahjrVar22.U;
                eyik eyikVar74 = ahnhVar19.CF;
                eyik eyikVar75 = ahjrVar22.es;
                eyik eyikVar76 = ahjrVar22.fs;
                eyik eyikVar77 = ahnhVar19.yx;
                eyik eyikVar78 = ahnhVar19.Cp;
                Optional optional3 = (Optional) ahknVar19.kd.b();
                eyik eyikVar79 = ahknVar19.aJ;
                eyik eyikVar80 = ahknVar19.ku;
                eosc eoscVar9 = (eosc) eyikVar79.b();
                eygg eyggVarA3 = eyie.a(ahjrVar22.fu);
                eyik eyikVar81 = ahknVar19.cE;
                eyik eyikVar82 = ahnhVar19.qi;
                eyik eyikVar83 = ahjrVar22.fv;
                dzuc dzucVar = (dzuc) eyikVar81.b();
                eyik eyikVar84 = ahjrVar22.dN;
                eyik eyikVar85 = ahjrVar22.ai;
                Optional optionalOf = Optional.of((cvrh) ahjrVar22.fw.b());
                eyik eyikVar86 = ahjrVar22.X;
                eyik eyikVar87 = ahnhVar19.MY;
                eyik eyikVar88 = ahknVar19.nr;
                eyik eyikVar89 = ahknVar19.ly;
                eyik eyikVar90 = ahknVar19.ns;
                eyik eyikVar91 = ahjrVar22.dV;
                awlc awlcVar4 = (awlc) ahnhVar19.Ug.b();
                eyik eyikVar92 = ahjrVar22.ap;
                eyik eyikVar93 = ahnhVar19.Jz;
                apsl apslVar = (apsl) ahnhVar19.Dk.b();
                eyik eyikVar94 = ahnhVar19.Dn;
                aptb aptbVar = (aptb) ahnhVar19.Dl.b();
                arrc arrcVar = (arrc) ahnhVar19.RQ.b();
                aqoe aqoeVar = (aqoe) ahnhVar19.Uh.b();
                eyik eyikVar95 = ahnhVar19.Ar;
                eyik eyikVar96 = ahjrVar22.aM;
                eyik eyikVar97 = ahjrVar22.bo;
                eyik eyikVar98 = ahjrVar22.bm;
                eyik eyikVar99 = ahjrVar22.bh;
                eyik eyikVar100 = ahjrVar22.dk;
                eyik eyikVar101 = ahjrVar22.dc;
                eyik eyikVar102 = ahjrVar22.aK;
                return new aydh(context5, eyikVar55, eyikVar56, eyikVar57, ahjrVar22.aB, eyikVar58, eyikVar59, eyikVar60, ahjrVar22.cS, ahjrVar22.cT, eyikVar61, eyikVar62, eyikVar63, eyikVar64, eyikVar65, eyikVar102, eyikVar66, eyikVar67, eyikVar68, eyikVar69, eyikVar70, eyikVar71, eyikVar72, eyikVar73, eyikVar74, eyikVar75, eyikVar76, eyikVar77, eyikVar101, eyikVar78, optional3, eyikVar80, eyikVar100, eoscVar9, eyikVar99, eyggVarA3, eyikVar82, eyikVar83, dzucVar, eyikVar84, eyikVar97, eyikVar98, eyikVar85, optionalOf, eyikVar86, eyikVar87, eyikVar88, eyikVar89, eyikVar90, eyikVar91, eyikVar96, awlcVar4, eyikVar92, eyikVar93, apslVar, eyikVar94, aptbVar, arrcVar, aqoeVar, eyikVar95);
            case 344:
                ahkn ahknVar20 = this.a;
                ahjr ahjrVar23 = this.b;
                ahnh ahnhVar20 = ahknVar20.a;
                return new aydz(ahknVar20.t, ahnhVar20.Jd, ahnhVar20.TX, ahjrVar23.fr, ahjrVar23.F, ahjrVar23.fs);
            case 345:
                ahjr ahjrVar24 = this.b;
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar21 = ahknVar21.a;
                eyik eyikVar103 = ahjrVar24.F;
                bxko bxkoVar = (bxko) ahnhVar21.aaQ.b();
                eyik eyikVar104 = ahnhVar21.zj;
                Context context6 = (Context) ahknVar21.t.b();
                eyik eyikVar105 = ahjrVar24.U;
                eyik eyikVar106 = ahnhVar21.qG;
                dqsn dqsnVar3 = (dqsn) ahnhVar21.qq.b();
                eyik eyikVar107 = ahknVar21.aJ;
                eyik eyikVar108 = ahnhVar21.qs;
                eyik eyikVar109 = ahnhVar21.Ar;
                eyik eyikVar110 = ahnhVar21.qr;
                eyik eyikVar111 = ahnhVar21.qi;
                eyik eyikVar112 = ahnhVar21.Ab;
                eyik eyikVar113 = ahnhVar21.qx;
                eyik eyikVar114 = ahnhVar21.zM;
                eyik eyikVar115 = ahnhVar21.c;
                eyik eyikVar116 = ahnhVar21.qv;
                eyik eyikVar117 = ahnhVar21.aaR;
                eyik eyikVar118 = ahnhVar21.zN;
                eyik eyikVar119 = ahnhVar21.pf;
                eyik eyikVar120 = ahjrVar24.dY;
                eyik eyikVar121 = ahjrVar24.I;
                eosc eoscVar10 = (eosc) eyikVar107.b();
                return new bxkp(eyikVar103, bxkoVar, eyikVar104, context6, eyikVar105, ahknVar21.da, eyikVar106, dqsnVar3, eyikVar108, eyikVar109, eyikVar110, ahknVar21.ob, eyikVar111, eyikVar112, eyikVar113, eyikVar114, eyikVar115, eyikVar116, eyikVar117, eyikVar118, eyikVar119, eyikVar120, eyikVar121, eoscVar10, ahknVar21.ij);
            case 346:
                return new bayc(eyie.a(this.b.ft));
            case 347:
                ahnh ahnhVar22 = this.a.a;
                cmsz cmszVarKy = ahnhVar22.ky();
                baye bayeVar = (baye) ahnhVar22.Fl.b();
                ahjr ahjrVar25 = this.b;
                return ekhx.v(cmszVarKy, bayeVar, ahjrVar25.eS(), ahnhVar22.hz(), ahnhVar22.lG(), ahjrVar25.eW(), new baye[0]);
            case 348:
                ahkn ahknVar22 = this.a;
                cogw cogwVar7 = (cogw) ahknVar22.cD.b();
                ahjr ahjrVar26 = this.b;
                return new cjoj(cogwVar7, ahjrVar26.ar, ahjrVar26.F, ahknVar22.a.uu);
            case 349:
                ahkn ahknVar23 = this.a;
                return new cvrh((eosc) ahknVar23.p.b(), (eosc) ahknVar23.y.b(), (crbi) this.b.eg.b());
            case 350:
                ecjh ecjhVar = (ecjh) this.b.fz.b();
                ahkn ahknVar24 = this.a;
                return new chmt(ecjhVar, (eosd) ahknVar24.y.b(), (fcyh) ahknVar24.cA.b());
            case 351:
                return chnd.a(chmu.a(), this.b.gh(), (ecev) this.a.aL.b());
            case 352:
                ahkn ahknVar25 = this.a;
                ahjr ahjrVar27 = this.b;
                eyik eyikVar122 = ahknVar25.dK;
                eyik eyikVar123 = ahknVar25.t;
                eyik eyikVar124 = ahknVar25.p;
                ahnh ahnhVar23 = ahknVar25.a;
                ajvoVar = new ajvo(eyikVar122, eyikVar123, eyikVar124, ahknVar25.aJ, ahknVar25.iA, ahjrVar27.I, ahjrVar27.fE, ahnhVar23.qi, ahnhVar23.Bc, ahnhVar23.qa, ahnhVar23.yG, ahjrVar27.ap, ahnhVar23.Bd, ahknVar25.cD, ahnhVar23.Bf, ahnhVar23.Be, ahnhVar23.Bg, ahnhVar23.vV, ahjrVar27.fF, ahnhVar23.sM, ahnhVar23.Bi);
                break;
            case 353:
                ahjr ahjrVar28 = this.b;
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar24 = ahknVar26.a;
                return new akfs(ahjrVar28.fD, ahnhVar24.AJ, ahnhVar24.oS, ahnhVar24.oQ, ahknVar26.jq, ahknVar26.jr);
            case 354:
                ahkn ahknVar27 = this.a;
                ahjr ahjrVar29 = this.b;
                ahnh ahnhVar25 = ahknVar27.a;
                return new akgj(ahnhVar25.m, ahnhVar25.oQ, ahknVar27.dK, ahknVar27.iA, ahjrVar29.fC, ahnhVar25.pT, ahnhVar25.sP);
            case 355:
                return Optional.of(this.b.dQ());
            case 356:
                return new ahiz(this);
            case 357:
                ahjr ahjrVar30 = this.b;
                amdy amdyVar = (amdy) ahjrVar30.gD.b();
                amfc.a(amdyVar);
                return amdyVar;
            case 358:
                ahkn ahknVar28 = this.a;
                fdjx fdjxVar = (fdjx) ahknVar28.a.m.b();
                ahjr ahjrVar31 = this.b;
                return new amgx(fdjxVar, ahknVar28.hV, (amdy) ahjrVar31.gD.b(), ahjrVar31.gl);
            case 359:
                ahkn ahknVar29 = this.a;
                ahjr ahjrVar32 = this.b;
                eyik eyikVar125 = ahknVar29.dK;
                eyik eyikVar126 = ahknVar29.p;
                eyik eyikVar127 = ahknVar29.y;
                eyik eyikVar128 = ahknVar29.aJ;
                eyik eyikVar129 = ahjrVar32.fX;
                eyik eyikVar130 = ahjrVar32.gk;
                ahnh ahnhVar26 = ahknVar29.a;
                eyik eyikVar131 = ahnhVar26.QC;
                eyik eyikVar132 = ahnhVar26.QD;
                eyik eyikVar133 = ahjrVar32.gl;
                eyik eyikVar134 = ahjrVar32.gm;
                eyik eyikVar135 = ahjrVar32.gq;
                eyik eyikVar136 = ahjrVar32.gc;
                eyik eyikVar137 = ahknVar29.ir;
                eyik eyikVar138 = ahjrVar32.gr;
                eyik eyikVar139 = ahjrVar32.dt;
                eyik eyikVar140 = ahknVar29.lx;
                eyik eyikVar141 = ahjrVar32.gb;
                eyik eyikVar142 = ahnhVar26.Rj;
                eyik eyikVar143 = ahjrVar32.gt;
                eyik eyikVar144 = ahjrVar32.gu;
                eyik eyikVar145 = ahnhVar26.xO;
                eyik eyikVar146 = ahnhVar26.Rq;
                eyik eyikVar147 = ahnhVar26.Rr;
                eyik eyikVar148 = ahnhVar26.Rs;
                eyik eyikVar149 = ahnhVar26.Ru;
                eyik eyikVar150 = ahjrVar32.gv;
                eyik eyikVar151 = ahnhVar26.Rx;
                eyik eyikVar152 = ahjrVar32.gf;
                eyik eyikVar153 = ahnhVar26.RA;
                eyik eyikVar154 = ahknVar29.cD;
                eyik eyikVar155 = ahjrVar32.gx;
                eyik eyikVar156 = ahknVar29.nk;
                eyik eyikVar157 = ahknVar29.nl;
                eyik eyikVar158 = ahnhVar26.RE;
                eyik eyikVar159 = ahjrVar32.ej;
                eyik eyikVar160 = ahjrVar32.gy;
                eyik eyikVar161 = ahknVar29.mZ;
                eyik eyikVar162 = ahnhVar26.RH;
                eyik eyikVar163 = ahnhVar26.RI;
                eyik eyikVar164 = ahnhVar26.RJ;
                eyik eyikVar165 = ahnhVar26.RK;
                eyik eyikVar166 = ahjrVar32.gB;
                eyik eyikVar167 = ahjrVar32.gC;
                return new amdy(eyikVar125, eyikVar126, eyikVar127, eyikVar128, eyikVar129, eyikVar130, eyikVar131, eyikVar132, eyikVar133, eyikVar134, eyikVar135, eyikVar161, ahknVar29.na, ahnhVar26.Rg, ahknVar29.nc, eyikVar136, eyikVar137, eyikVar138, eyikVar139, eyikVar140, eyikVar141, eyikVar142, eyikVar143, eyikVar144, eyikVar145, ahnhVar26.Ro, ahknVar29.nh, eyikVar146, eyikVar147, eyikVar148, eyikVar149, eyikVar150, eyikVar151, eyikVar152, eyikVar153, eyikVar154, eyikVar155, ahjrVar32.bG, ahknVar29.nj, ahnhVar26.RD, ahknVar29.mY, eyikVar156, eyikVar157, eyikVar158, eyikVar159, eyikVar160, eyikVar162, eyikVar163, eyikVar164, eyikVar165, eyikVar166, eyikVar167, ahnhVar26.RP, ahnhVar26.RQ, ahnhVar26.RR, ahnhVar26.RS, ahnhVar26.RT, ahnhVar26.AO, ahnhVar26.RU);
            case 360:
                ahkn ahknVar30 = this.a;
                ahjr ahjrVar33 = this.b;
                eyik eyikVar168 = ahknVar30.cD;
                ahnh ahnhVar27 = ahknVar30.a;
                return new amli(ahknVar30.p, ahknVar30.ir, ahnhVar27.Bl, ahjrVar33.fJ, ahjrVar33.fK, ahjrVar33.fT, ahjrVar33.fW, eyil.a(eyikVar168), ahnhVar27.Qh);
            case 361:
                ahkn ahknVar31 = this.a;
                ahjr ahjrVar34 = this.b;
                ahnh ahnhVar28 = ahknVar31.a;
                return new ammm(ahknVar31.dK, ahknVar31.p, ahknVar31.y, ahnhVar28.AW, ahknVar31.aN, ahnhVar28.qa, ahnhVar28.AV, ahjrVar34.ap, eyil.a(ahjrVar34.fH), ahnhVar28.Bg, ahjrVar34.fI);
            case 362:
                ahkn ahknVar32 = this.a;
                return new ajwa((eosc) ahknVar32.aJ.b(), this.b.aq, ahknVar32.a.yw, ahknVar32.cD);
            case 363:
                return new akaj(this.b.aq, (fdjx) this.a.a.m.b());
            case 364:
                ahjr ahjrVar35 = this.b;
                ahkn ahknVar33 = this.a;
                return new aleu(ahjrVar35.fN, ahjrVar35.fP, ahknVar33.cA, ahjrVar35.fM, ahjrVar35.fO, ahjrVar35.fQ, ahjrVar35.fR, ahjrVar35.dC, ahjrVar35.fS, ahknVar33.a.m);
            case 365:
                ahkn ahknVar34 = this.a;
                ahjr ahjrVar36 = this.b;
                ahnh ahnhVar29 = ahknVar34.a;
                return new aled(ahnhVar29.m, ahnhVar29.oS, ahknVar34.dK, ahjrVar36.fM, ahnhVar29.BS, ahnhVar29.BT);
            case 366:
                ahkn ahknVar35 = this.a;
                ahjr ahjrVar37 = this.b;
                ahnh ahnhVar30 = ahknVar35.a;
                return new alcn(ahnhVar30.m, ahknVar35.dK, ahknVar35.iA, ahnhVar30.BN, ahnhVar30.BO, ahjrVar37.fL, ahjrVar37.dC);
            case 367:
                ahkn ahknVar36 = this.a;
                return new crjd((fcyh) ahknVar36.cz.b(), (fcyh) ahknVar36.cA.b(), this.b.fJ(), (cogw) ahknVar36.cD.b());
            case 368:
                ahkn ahknVar37 = this.a;
                ahjr ahjrVar38 = this.b;
                ahnh ahnhVar31 = ahknVar37.a;
                return new aler(ahnhVar31.m, ahnhVar31.oS, ahknVar37.dK, ahjrVar38.fO, ahnhVar31.BW, ahnhVar31.BX);
            case 369:
                ahkn ahknVar38 = this.a;
                ahjr ahjrVar39 = this.b;
                ahnh ahnhVar32 = ahknVar38.a;
                return new aldh(ahknVar38.t, ahnhVar32.m, ahknVar38.dK, ahknVar38.iA, ahnhVar32.BN, ahnhVar32.BO, ahjrVar39.fL, ahjrVar39.dC);
            case 370:
                ahkn ahknVar39 = this.a;
                return new albm(ahknVar39.a.m, ahknVar39.dK, ahknVar39.iA, this.b.fL);
            case 371:
                ahkn ahknVar40 = this.a;
                return new albv(ahknVar40.a.m, ahknVar40.dK, ahknVar40.iA, this.b.fL);
            case 372:
                return Optional.of((crbi) this.b.eg.b());
            case 373:
                ahjr ahjrVar40 = this.b;
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar33 = ahknVar41.a;
                return new amsd(ahjrVar40.fU, ahnhVar33.Fd, ahnhVar33.m, ahknVar41.cz, ahknVar41.cD, ahjrVar40.fV, ahnhVar33.yH, ahnhVar33.Qf);
            case 374:
                ahkn ahknVar42 = this.a;
                ahjr ahjrVar41 = this.b;
                eyik eyikVar169 = ahjrVar41.bW;
                eyik eyikVar170 = ahknVar42.gF;
                cmnp cmnpVar = (cmnp) eyikVar169.b();
                ahnh ahnhVar34 = ahknVar42.a;
                return new cmsx(eyikVar170, cmnpVar, ahknVar42.ct(), ahjrVar41.J, ahnhVar34.sh, ahnhVar34.rW);
            case 375:
                ahjr ahjrVar42 = this.b;
                ahkn ahknVar43 = this.a;
                return new ankd(ahjrVar42.gc, ahknVar43.a.yw, ahjrVar42.gf, ahjrVar42.gj, ahknVar43.p);
            case 376:
                ahkn ahknVar44 = this.a;
                ahjr ahjrVar43 = this.b;
                eyik eyikVar171 = ahjrVar43.fZ;
                eyik eyikVar172 = ahjrVar43.ga;
                eyik eyikVar173 = ahjrVar43.Y;
                return new ajpv(eyikVar171, eyikVar172, eyikVar173, ahknVar44.a.pf);
            case 377:
                ahkn ahknVar45 = this.a;
                ahjr ahjrVar44 = this.b;
                ahnh ahnhVar35 = ahknVar45.a;
                return new axqc(ahnhVar35.wv, ahjrVar44.F, ahnhVar35.qq, ahnhVar35.qi, ahnhVar35.NH, ahnhVar35.NK, ahnhVar35.yr, ahjrVar44.fY, ahjrVar44.eQ, ahjrVar44.eU, ahnhVar35.Bg, ahnhVar35.yG, ahnhVar35.Or, ahnhVar35.NI);
            case 378:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar36 = ahknVar46.a;
                eyik eyikVar174 = ahknVar46.ez;
                eyik eyikVar175 = ahnhVar36.rk;
                eosc eoscVar11 = (eosc) ahknVar46.p.b();
                eosc eoscVar12 = (eosc) ahknVar46.aJ.b();
                ahjr ahjrVar45 = this.b;
                return new axqb(eyikVar174, eyikVar175, eoscVar11, eoscVar12, ahnhVar36.NY, ahnhVar36.Qj, ahnhVar36.FC, ahjrVar45.ey, ahjrVar45.dJ);
            case 379:
                ahkn ahknVar47 = this.a;
                ahjr ahjrVar46 = this.b;
                ahnh ahnhVar37 = ahknVar47.a;
                ajvoVar = new ayfd(ahnhVar37.qi, ahjrVar46.ar, ahjrVar46.J, ahnhVar37.qG, ahknVar47.cD, ahnhVar37.Qs, ahnhVar37.yw, ahnhVar37.uM, ahnhVar37.Dx, ahjrVar46.dc, ahnhVar37.wv, ahnhVar37.HO, ahnhVar37.wc, ahnhVar37.MP, ahknVar47.p, ahnhVar37.qa, ahjrVar46.dD, ahnhVar37.Qp, ahnhVar37.NX, ahnhVar37.NW);
                break;
            case 380:
                return new ajql();
            case 381:
                return Optional.of((cmcx) this.b.ge.b());
            case 382:
                ahkn ahknVar48 = this.a;
                cogw cogwVar8 = (cogw) ahknVar48.cD.b();
                eosc eoscVar13 = (eosc) ahknVar48.y.b();
                eosc eoscVar14 = (eosc) ahknVar48.p.b();
                ahjr ahjrVar47 = this.b;
                eyik eyikVar176 = ahknVar48.aQ;
                ahnh ahnhVar38 = ahknVar48.a;
                eyik eyikVar177 = ahjrVar47.gc;
                eyik eyikVar178 = ahnhVar38.yx;
                eyik eyikVar179 = ahnhVar38.un;
                egzh egzhVar = (egzh) eyikVar176.b();
                aiht aihtVar = (aiht) ahknVar48.mQ.b();
                eyik eyikVar180 = ahjrVar47.gd;
                eyik eyikVar181 = ahnhVar38.qG;
                ahknVar48.bC();
                return new aihh(cogwVar8, eoscVar13, eoscVar14, eyikVar177, eyikVar178, eyikVar179, egzhVar, aihtVar, eyikVar180, ahnhVar38.Qw, eyikVar181, ahjrVar47.V, ahjrVar47.ar, ahjrVar47.F);
            case 383:
                ahkn ahknVar49 = this.a;
                eosc eoscVar15 = (eosc) ahknVar49.y.b();
                ahjr ahjrVar48 = this.b;
                cogw cogwVar9 = (cogw) ahknVar49.cD.b();
                ahnh ahnhVar39 = ahknVar49.a;
                return new aigk(eoscVar15, ahjrVar48.aC, cogwVar9, ahjrVar48.U, (dqsn) ahnhVar39.qq.b(), ahjrVar48.X);
            case 384:
                ahjr ahjrVar49 = this.b;
                return ekhx.r(ahjrVar49.ew(), ahjrVar49.T());
            case 385:
                return Optional.of((chsd) this.b.gg.b());
            case 386:
                return new chsd();
            case 387:
                return new aldo(this.a.a.rF);
            case 388:
                return Optional.of(this.b.W());
            case 389:
                ahkn ahknVar50 = this.a;
                ahjr ahjrVar50 = this.b;
                ahnh ahnhVar40 = ahknVar50.a;
                return new anfr(ahnhVar40.Hl, ahjrVar50.ab, (fdjx) ahnhVar40.oS.b());
            case 390:
                ahkn ahknVar51 = this.a;
                ahjr ahjrVar51 = this.b;
                eyik eyikVar182 = ahknVar51.t;
                eyik eyikVar183 = ahjrVar51.go;
                ahnh ahnhVar41 = ahknVar51.a;
                return new amer(eyikVar182, eyikVar183, ahnhVar41.QO, ahnhVar41.QR, ahjrVar51.gp, ahknVar51.mX, ahnhVar41.tB, ahnhVar41.QT, ahnhVar41.QU, ahnhVar41.QV, ahnhVar41.QW);
            case 391:
                return new ahja(this);
            case 392:
                ahkn ahknVar52 = this.a;
                Context context7 = (Context) ahknVar52.t.b();
                ahnh ahnhVar42 = ahknVar52.a;
                return new alxr(context7, (fdjx) ahnhVar42.oQ.b(), (cqjy) ahnhVar42.Ci.b(), (bael) ahknVar52.mU.b(), (cmqj) ahnhVar42.uv.b(), (bfsa) ahknVar52.mT.b(), (baxl) ahnhVar42.MY.b(), (crny) ahnhVar42.pf.b(), ahnhVar42.tB, this.b.fM(), (aptx) ahnhVar42.Dw.b(), (aqmq) ahnhVar42.QG.b(), ahnhVar42.AE);
            case 393:
                return anmm.a(this.a.fX(), this.b.hj());
            case 394:
                return new alzw(this.b.ap, this.a.a.IU);
            case 395:
                ahjr ahjrVar52 = this.b;
                return new amya(ahjrVar52.gs, ahjrVar52.dO, ahjrVar52.ga, ahjrVar52.bV);
            case 396:
                ahkn ahknVar53 = this.a;
                ahjr ahjrVar53 = this.b;
                return new axsx(ahknVar53.t, ahknVar53.y, ahjrVar53.ar, ahjrVar53.bV, ahknVar53.a.Dw, ahjrVar53.dJ);
            case 397:
                return Optional.of(this.b.U());
            case 398:
                ahkn ahknVar54 = this.a;
                ahjr ahjrVar54 = this.b;
                ahnh ahnhVar43 = ahknVar54.a;
                return new anno(ahnhVar43.m, ahnhVar43.oS, ahjrVar54.dc, ahjrVar54.cU);
            case 399:
                return Optional.of(this.b.cb());
            default:
                throw new AssertionError(i);
        }
        return ajvoVar;
    }

    private final Object f() {
        int i = this.c;
        switch (i) {
            case 400:
                ahjr ahjrVar = this.b;
                ahkn ahknVar = this.a;
                bzph bzphVarBU = ahjrVar.bU();
                bzpj bzpjVarBW = ahjrVar.bW();
                bzpm bzpmVarBZ = ahjrVar.bZ();
                bzpl bzplVarBY = ahjrVar.bY();
                bzpi bzpiVarBV = ahjrVar.bV();
                bzpk bzpkVarBX = ahjrVar.bX();
                ahnh ahnhVar = ahknVar.a;
                return new bzpg(bzphVarBU, bzpjVarBW, bzpmVarBZ, bzplVarBY, bzpiVarBV, bzpkVarBX, (aurx) ahnhVar.wc.b(), (byeq) ahnhVar.sG.b(), (fdjx) ahnhVar.oS.b(), (fcyh) ahknVar.cA.b(), (cazj) ahnhVar.rF.b(), ahnhVar.bx());
            case 401:
                return Optional.of(this.b.Y());
            case 402:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                fdjx fdjxVar = (fdjx) ahnhVar2.oS.b();
                ahjr ahjrVar2 = this.b;
                return new anao(fdjxVar, ahnhVar2.yx, ahjrVar2.ar, ahjrVar2.X, ahjrVar2.aB, (dqsn) ahnhVar2.qq.b(), ahjrVar2.gz, ahjrVar2.gA, ahknVar2.cD);
            case 403:
                return Optional.of((ckvy) this.b.dm.b());
            case 404:
                return new amxi(this.a.a.rF);
            case 405:
                ahkn ahknVar3 = this.a;
                return new aneu(ahknVar3.iA, ahknVar3.a.oS, this.b.ar);
            case 406:
                ahjr ahjrVar3 = this.b;
                ahkn ahknVar4 = this.a;
                return new amhm(ahjrVar3.gE, ahjrVar3.gD, ahknVar4.nc, ahknVar4.a.Rj, ahjrVar3.gk);
            case 407:
                ahkn ahknVar5 = this.a;
                ahjr ahjrVar4 = this.b;
                ahnh ahnhVar3 = ahknVar5.a;
                return ekhx.v(ahnhVar3.aw(), ahnhVar3.ly(), ahnhVar3.lw(), ahjrVar4.N(), ahnhVar3.jY(), ahjrVar4.L(), ahnhVar3.D(), ahjrVar4.eD(), ahjrVar4.M(), ahjrVar4.da(), ahjrVar4.z(), ahjrVar4.F(), ahnhVar3.az());
            case 408:
                return Optional.of(this.b.A());
            case 409:
                ahkn ahknVar6 = this.a;
                return new agud((Context) ahknVar6.t.b(), (cogw) ahknVar6.cD.b(), this.b.dC);
            case 410:
                ahkn ahknVar7 = this.a;
                fdjx fdjxVar2 = (fdjx) ahknVar7.a.m.b();
                ahjr ahjrVar5 = this.b;
                egrv egrvVar = (egrv) ahjrVar5.gJ.b();
                ahng ahngVar = ahknVar7.b;
                return new chqj(fdjxVar2, egrvVar, ahngVar.gs, ahngVar.gt, ahngVar.gu, ahjrVar5.eu(), ahknVar7.p);
            case 411:
                ahkn ahknVar8 = this.a;
                Context context = (Context) ahknVar8.t.b();
                egtw egtwVar = (egtw) ahknVar8.dG.b();
                Executor executor = (Executor) ahknVar8.y.b();
                return new egsy(context, egtwVar, executor, (efwo) this.b.b.b());
            case 412:
                ahjr ahjrVar6 = this.b;
                ahkn ahknVar9 = this.a;
                chnp chnpVarEr = ahjrVar6.er();
                eyik eyikVar = ahjrVar6.gN;
                eyik eyikVar2 = ahjrVar6.gO;
                ahnh ahnhVar4 = ahknVar9.a;
                eyik eyikVar3 = ahnhVar4.zA;
                ahng ahngVar2 = ahknVar9.b;
                return new chlu(chnpVarEr, eyikVar, eyikVar2, eyikVar3, ahngVar2.gx, ahngVar2.gy, ahnhVar4.rU, ahnhVar4.qi, (chsm) ahnhVar4.Av.b(), ahnhVar4.zG, (fdjx) ahnhVar4.oQ.b(), (fcyh) ahknVar9.cA.b(), (cdni) ahnhVar4.vX.b());
            case 413:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar5 = ahknVar10.a;
                final dvfe dvfeVar = (dvfe) ahnhVar5.anX.b();
                final efwo efwoVar = (efwo) this.b.b.b();
                final egej egejVar = (egej) ahnhVar5.pI.b();
                final eosd eosdVar = (eosd) ahknVar10.p.b();
                return new dvgx(ejxx.a(new ejxr() { // from class: dvgr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        eiju eijuVarG = eiju.g(egejVar.a(efwoVar));
                        final dvfe dvfeVar2 = dvfeVar;
                        dvfeVar2.getClass();
                        return eijuVarG.h(new ejvr() { // from class: dvgc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return dvfeVar2.a((Account) obj);
                            }
                        }, eosdVar);
                    }
                }), eosdVar);
            case 414:
                ahjr ahjrVar7 = this.b;
                return chnq.a((eucy) ahjrVar7.gL.b(), (ehuv) ahjrVar7.l.b());
            case 415:
                ahjr ahjrVar8 = this.b;
                ahkn ahknVar11 = this.a;
                return chnr.a(ahjrVar8.gp(), ahknVar11.b.gk, (cepb) ahknVar11.a.qQ.b());
            case 416:
                return Optional.of((chmd) this.b.fA.b());
            case 417:
                ahnh ahnhVar6 = this.a.a;
                return new chom(ahnhVar6.qo, ahnhVar6.zA, ahnhVar6.zL);
            case 418:
                ahjr ahjrVar9 = this.b;
                ahkn ahknVar12 = this.a;
                return new amke(ahjrVar9.gU, ahjrVar9.eg, ahknVar12.a.m, ahknVar12.cz);
            case 419:
                ahkn ahknVar13 = this.a;
                ahjr ahjrVar10 = this.b;
                ahnh ahnhVar7 = ahknVar13.a;
                return new amkx(ahnhVar7.m, ahnhVar7.oS, ahknVar13.dK, ahknVar13.iA, ahjrVar10.gT, ahknVar13.nm, ahknVar13.ka);
            case 420:
                return Optional.of((crkx) this.b.gS.b());
            case 421:
                ahkn ahknVar14 = this.a;
                eosc eoscVar = (eosc) ahknVar14.p.b();
                ahnh ahnhVar8 = ahknVar14.a;
                return new crlj(eoscVar, (fdjx) ahnhVar8.m.b(), (fdjx) ahnhVar8.oS.b(), ahknVar14.jV, ahnhVar8.kl(), ahknVar14.dj, ahknVar14.aQ, this.b.ej);
            case 422:
                ahkn ahknVar15 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar15.cA.b();
                ahnh ahnhVar9 = ahknVar15.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar9.m.b();
                cogw cogwVar = (cogw) ahknVar15.cD.b();
                ahjr ahjrVar11 = this.b;
                return new akaf(fcyhVar, fdjxVar3, cogwVar, (ajvr) ahjrVar11.aq.b(), ahjrVar11.ap, ahknVar15.cI, (asre) ahjrVar11.bC.b(), (avpc) ahjrVar11.bh.b(), ahjrVar11.br, (dzuc) ahknVar15.cE.b(), ahjrVar11.G, ahnhVar9.qa, ahnhVar9.Gu, ahnhVar9.dA(), (ardj) ahnhVar9.Sn.b(), (cifw) ahnhVar9.Pb.b());
            case 423:
                ahkn ahknVar16 = this.a;
                eosc eoscVar2 = (eosc) ahknVar16.y.b();
                ahjr ahjrVar12 = this.b;
                return new avno(eoscVar2, ahjrVar12.U, ahknVar16.a.qq, ahjrVar12.aC, ahjrVar12.gX);
            case 424:
                return new catv(this.a.a.rF);
            case 425:
                ahjr ahjrVar13 = this.b;
                ahkn ahknVar17 = this.a;
                eyik eyikVar4 = ahjrVar13.W;
                eyik eyikVar5 = ahjrVar13.F;
                eyik eyikVar6 = ahjrVar13.hh;
                ahnh ahnhVar10 = ahknVar17.a;
                return new cpke(eyikVar4, eyikVar5, ahjrVar13.dk, eyikVar6, ahjrVar13.cB, ahnhVar10.qi, ahjrVar13.ap, ahnhVar10.Sw, (dqsn) ahnhVar10.qq.b(), ahjrVar13.hi, ahjrVar13.hd, ahjrVar13.cx, (fcyh) ahknVar17.cz.b(), (fdjx) ahnhVar10.oQ.b(), (fcyh) ahknVar17.cA.b());
            case 426:
                ahjr ahjrVar14 = this.b;
                eyik eyikVar7 = ahjrVar14.ha;
                eyik eyikVar8 = ahjrVar14.hb;
                cpgf cpgfVar = (cpgf) ahjrVar14.cB.b();
                ahnh ahnhVar11 = this.a.a;
                return new cruf(ahjrVar14.cK, eyikVar7, eyikVar8, cpgfVar, ahjrVar14.W, ahjrVar14.F, ahjrVar14.cu, ahnhVar11.Sw, ahjrVar14.hg, (dqsn) ahnhVar11.qq.b(), ahjrVar14.cG, ahjrVar14.dj, ahnhVar11.SB);
            case 427:
                ahkn ahknVar18 = this.a;
                Context context2 = (Context) ahknVar18.t.b();
                ahjr ahjrVar15 = this.b;
                eyik eyikVar9 = ahjrVar15.fZ;
                eyik eyikVar10 = ahjrVar15.ar;
                eyik eyikVar11 = ahjrVar15.W;
                ahnh ahnhVar12 = ahknVar18.a;
                return new csby(context2, eyikVar9, eyikVar10, ahjrVar15.ct, eyikVar11, ahjrVar15.bh, ahnhVar12.Sp, ahnhVar12.yx, ahnhVar12.qG, ahnhVar12.qi, ahjrVar15.gZ, ahnhVar12.wF, (fdjx) ahnhVar12.oS.b());
            case 428:
                ahkn ahknVar19 = this.a;
                Context context3 = (Context) ahknVar19.t.b();
                ahjr ahjrVar16 = this.b;
                eyik eyikVar12 = ahknVar19.ez;
                eyik eyikVar13 = ahjrVar16.bW;
                eyik eyikVar14 = ahknVar19.ii;
                eyik eyikVar15 = ahknVar19.lk;
                ahnh ahnhVar13 = ahknVar19.a;
                return new csbk(context3, eyikVar12, eyikVar13, eyikVar14, eyikVar15, ahnhVar13.Fd, ahjrVar16.J, ahnhVar13.sh);
            case 429:
                ahjr ahjrVar17 = this.b;
                ahkn ahknVar20 = this.a;
                eyik eyikVar16 = ahjrVar17.ar;
                ahnh ahnhVar14 = ahknVar20.a;
                return new cskk(eyikVar16, ahjrVar17.bW, ahnhVar14.OL, ahnhVar14.pT, ahjrVar17.J, (eosc) ahknVar20.y.b(), (eosc) ahknVar20.p.b());
            case 430:
                return Optional.of(new csiy(this.b.hf));
            case 431:
                ahkn ahknVar21 = this.a;
                ahjr ahjrVar18 = this.b;
                ahnh ahnhVar15 = ahknVar21.a;
                return new csiq(ahnhVar15.Hr, ahjrVar18.hc, (cpkp) ahjrVar18.hd.b(), ahjrVar18.ar, ahjrVar18.F, ahjrVar18.cA, ahjrVar18.cD, ahjrVar18.he, ahnhVar15.pQ, (fdjx) ahnhVar15.oQ.b());
            case 432:
                return new csih(this.b.cP);
            case 433:
                ahjr ahjrVar19 = this.b;
                ahkn ahknVar22 = this.a;
                eyik eyikVar17 = ahjrVar19.W;
                eyik eyikVar18 = ahjrVar19.F;
                eyik eyikVar19 = ahjrVar19.ar;
                eyik eyikVar20 = ahjrVar19.I;
                ahnh ahnhVar16 = ahknVar22.a;
                return new cpkp(eyikVar17, eyikVar18, eyikVar19, eyikVar20, ahnhVar16.qi, (fdjx) ahnhVar16.oQ.b());
            case 434:
                return new cshg(this.b.ar);
            case 435:
                return new cpkk(this.b.F);
            case 436:
                ahkn ahknVar23 = this.a;
                eosc eoscVar3 = (eosc) ahknVar23.aJ.b();
                eosc eoscVar4 = (eosc) ahknVar23.p.b();
                ahjr ahjrVar20 = this.b;
                return new akil(eoscVar3, eoscVar4, ahjrVar20.F, ahjrVar20.U, ahjrVar20.gb, ahknVar23.a.SG);
            case 437:
                return Optional.of(this.b.O());
            case 438:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar17 = ahknVar24.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar17.oS.b();
                fdjx fdjxVar5 = (fdjx) ahnhVar17.oQ.b();
                ahjr ahjrVar21 = this.b;
                return new akjm(fdjxVar4, fdjxVar5, ahnhVar17.SP, (asre) ahjrVar21.bC.b(), (cioj) ahjrVar21.hm.b(), ahjrVar21.R(), (ciok) ahnhVar17.SW.b(), ahjrVar21.H(), (cogw) ahknVar24.cD.b(), ahnhVar17.SS, ahnhVar17.pQ);
            case 439:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar18 = ahknVar25.a;
                return new cioj((dqsn) ahnhVar18.qq.b(), (fcyh) ahknVar25.cA.b(), (fdjx) ahnhVar18.oS.b(), this.b.F, (cogw) ahknVar25.cD.b(), (area) ahnhVar18.SQ.b());
            case 440:
                ahkn ahknVar26 = this.a;
                Context context4 = (Context) ahknVar26.t.b();
                ahnh ahnhVar19 = ahknVar26.a;
                fdjx fdjxVar6 = (fdjx) ahnhVar19.oS.b();
                fdjx fdjxVar7 = (fdjx) ahnhVar19.m.b();
                ahjr ahjrVar22 = this.b;
                return new akol(context4, fdjxVar6, fdjxVar7, ahknVar26.cE, ahjrVar22.bh, ahnhVar19.pM, ahnhVar19.zQ, ahnhVar19.Ah, ahjrVar22.dV);
            case 441:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar20 = ahknVar27.a;
                return new ajwg((fdjx) ahnhVar20.m.b(), (fcyh) ahknVar27.cz.b(), ahknVar27.cD, ahnhVar20.CF, (cijw) this.b.hp.b());
            case 442:
                return new cijw(this.a.a.rF);
            case 443:
                ahnh ahnhVar21 = this.a.a;
                return new akho((fdjx) ahnhVar21.m.b(), (atol) ahnhVar21.Pm.b(), (cifw) ahnhVar21.Pb.b(), (asra) ahnhVar21.Fc.b(), ahnhVar21.dA(), (ardl) ahnhVar21.sB.b(), (awnf) this.b.G.b());
            case 444:
                ahjr ahjrVar23 = this.b;
                ahkn ahknVar28 = this.a;
                eyik eyikVar21 = ahjrVar23.E;
                ahnh ahnhVar22 = ahknVar28.a;
                return new akbc(eyikVar21, ahjrVar23.bh, ahnhVar22.pQ, ahnhVar22.zO, ahnhVar22.qi, ahjrVar23.ax, (fcyh) ahknVar28.cA.b(), (fdjx) ahnhVar22.m.b(), (aqnw) ahnhVar22.Gu.b(), ahnhVar22.bH(), ahnhVar22.bJ(), ahnhVar22.bF());
            case 445:
                return Optional.of((crvm) this.b.hu.b());
            case 446:
                ahkn ahknVar29 = this.a;
                Context context5 = (Context) ahknVar29.t.b();
                ahnh ahnhVar23 = ahknVar29.a;
                return new crvu(context5, (fdjx) ahnhVar23.m.b(), this.b.ht, ahnhVar23.Ii, ahknVar29.lk, ahnhVar23.Id);
            case 447:
                ahkn ahknVar30 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar30.bM.b();
                eyik eyikVar22 = this.b.eR;
                cqdr cqdrVar = (cqdr) ahknVar30.lk.b();
                ahnh ahnhVar24 = ahknVar30.a;
                return new crwx(fcyhVar2, eyikVar22, cqdrVar, ahnhVar24.pT, ahnhVar24.sP, ahnhVar24.mD());
            case 448:
                return Optional.of((bycw) this.b.cU.b());
            case 449:
                ahjr ahjrVar24 = this.b;
                return ekhx.r(ahjrVar24.aQ(), ahjrVar24.cZ());
            case 450:
                return new bvvu(this.a.a.rF);
            case 451:
                return Optional.of((byeb) this.b.cU.b());
            case 452:
                cbqj cbqjVar = (cbqj) this.b.as.b();
                ahnh ahnhVar25 = this.a.a;
                return new akiu(cbqjVar, (ains) ahnhVar25.pQ.b(), (fdjx) ahnhVar25.oS.b());
            case 453:
                Optional.of((cbyz) this.b.eD.b());
                ahnh ahnhVar26 = this.a.a;
                Optional.of((ccpm) ahnhVar26.tI.b());
                return new akiv((fdjx) ahnhVar26.oS.b());
            case 454:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar27 = ahknVar31.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar27.m.b();
                fcyh fcyhVar3 = (fcyh) ahknVar31.cA.b();
                awzf awzfVar = (awzf) ahnhVar27.sI.b();
                ahjr ahjrVar25 = this.b;
                chbx chbxVarDW = ahjrVar25.dW();
                ahjrVar25.hQ();
                awnf awnfVar = (awnf) ahjrVar25.G.b();
                ahjrVar25.hL();
                return new akhf(fdjxVar8, fcyhVar3, awzfVar, chbxVarDW, awnfVar, (ajvr) ahjrVar25.aq.b(), (cogw) ahknVar31.cD.b());
            case 455:
                ahkn ahknVar32 = this.a;
                return new axjv((Context) ahknVar32.t.b(), (bxgr) ahknVar32.ib.b(), ahknVar32.a.qk, this.b.F, ahknVar32.y);
            case 456:
                return new bbau(this.b.hF, this.a.a.qq);
            case 457:
                ahjr ahjrVar26 = this.b;
                return ekhx.r(ahjrVar26.aa(), ahjrVar26.fq());
            case 458:
                return new anzq(this.a.a.rF);
            case 459:
                dqsn dqsnVar = (dqsn) this.a.a.qq.b();
                ahjr ahjrVar27 = this.b;
                return new bapp(dqsnVar, ahjrVar27.aB, ahjrVar27.aC);
            case 460:
                ahkn ahknVar33 = this.a;
                Context context6 = (Context) ahknVar33.t.b();
                crqv crqvVar = (crqv) ahknVar33.aT.b();
                crma crmaVar = (crma) ahknVar33.da.b();
                ahjr ahjrVar28 = this.b;
                ayjj ayjjVar = (ayjj) ahjrVar28.aD.b();
                cauu cauuVar = (cauu) ahjrVar28.hI.b();
                ahnh ahnhVar28 = ahknVar33.a;
                return new clas(context6, crqvVar, crmaVar, ayjjVar, cauuVar, ahnhVar28.Cr, ahnhVar28.CS);
            case 461:
                return new cauu(this.a.a.rF);
            case 462:
                return new cggc(this.a.a.rF);
            case 463:
                ahkn ahknVar34 = this.a;
                ahjr ahjrVar29 = this.b;
                eyik eyikVar23 = ahknVar34.p;
                ahnh ahnhVar29 = ahknVar34.a;
                return new amqi(eyikVar23, ahnhVar29.m, ahknVar34.dK, ahknVar34.ix, ahnhVar29.yQ, ahnhVar29.yR, ahnhVar29.yS, ahnhVar29.yT, ahjrVar29.ac);
            case 464:
                ahkn ahknVar35 = this.a;
                return new amra(ahknVar35.a.oS, this.b.aq, ahknVar35.cD, ahknVar35.dK);
            case 465:
                return new amrl(this.b.hU);
            case 466:
                ahjr ahjrVar30 = this.b;
                return new alfl(ahjrVar30.hS, ahjrVar30.hT);
            case 467:
                return new alfh(this.b.fM, this.a.a.Tr);
            case 468:
                return new alfj(this.b.fO, this.a.a.Tr);
            case 469:
                ahjr ahjrVar31 = this.b;
                ahkn ahknVar36 = this.a;
                return new cllw(ahjrVar31.fc(), (fcyh) ahknVar36.cz.b(), (fdjx) ahknVar36.a.oQ.b());
            case 470:
                ahkn ahknVar37 = this.a;
                ahjr ahjrVar32 = this.b;
                ahnh ahnhVar30 = ahknVar37.a;
                return new aknk(ahnhVar30.m, ahnhVar30.oS, ahknVar37.dK, ahknVar37.iA, ahjrVar32.hX, ahnhVar30.Na);
            case 471:
                ahkn ahknVar38 = this.a;
                egyt egytVar = (egyt) ahknVar38.dj.b();
                ahnh ahnhVar31 = ahknVar38.a;
                return new asqr(egytVar, ahknVar38.cD, (dqsn) ahnhVar31.qq.b(), ahknVar38.mU, ahknVar38.np, ahnhVar31.vR, this.b.ap, (aqmq) ahnhVar31.QG.b(), (fdjx) ahnhVar31.oQ.b());
            case 472:
                return new akmx(this.a.a.oQ, this.b.hZ);
            case 473:
                return new akcv(this.a.a.TA, this.b.au);
            case 474:
                return new angb(this.b.ib);
            case 475:
                return new albb(this.b.fP);
            case 476:
                return new akkw(this.a.a.oQ, this.b.hZ);
            case 477:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar32 = ahknVar39.a;
                return new crtd((fdjx) ahnhVar32.m.b(), (Context) ahknVar39.t.b(), ahnhVar32.pE, this.b.dx);
            case 478:
                return new awco(this.b.br);
            case 479:
                return new bbfq((chtk) this.b.J.b(), (alrj) this.a.a.qi.b());
            case 480:
                ahkn ahknVar40 = this.a;
                ahjr ahjrVar33 = this.b;
                ahnh ahnhVar33 = ahknVar40.a;
                return new bakq(ahnhVar33.qq, ahjrVar33.ih, (fdjx) ahnhVar33.m.b());
            case 481:
                ahjr ahjrVar34 = this.b;
                return ekhx.r(ahjrVar34.aR(), ahjrVar34.dk());
            case 482:
                return bzpw.a(this.a.a.gp(), this.b.ca());
            case 483:
                return bzpz.a(this.a.a.gp(), this.b.ca());
            case 484:
                return bzpy.a(this.a.a.gp(), this.b.ca());
            case 485:
                return bzpv.a(this.a.a.gp(), this.b.ca());
            case 486:
                return bzpx.a(this.a.a.gp(), this.b.ca());
            case 487:
                return bzup.a(this.a.a.gp(), this.b.ch());
            case 488:
                return bzvh.a(this.a.a.gp(), this.b.ci());
            case 489:
                return camu.a(this.a.a.gp(), this.b.cE());
            case 490:
                return camv.a(this.a.a.gp(), this.b.cE());
            case 491:
                ahkn ahknVar41 = this.a;
                ahjr ahjrVar35 = this.b;
                ahnh ahnhVar34 = ahknVar41.a;
                return camw.a(ahnhVar34.gp(), ahjrVar35.cE(), ahnhVar34.fN());
            case 492:
                return this.b.ax();
            case 493:
                return this.b.be();
            case 494:
                ahkn ahknVar42 = this.a;
                ahjr ahjrVar36 = this.b;
                ahnh ahnhVar35 = ahknVar42.a;
                return caql.a(ahnhVar35.gp(), ahjrVar36.cO(), ahnhVar35.gF());
            case 495:
                ahnh ahnhVar36 = this.a.a;
                return caqr.a(ahnhVar36.gp(), new caqp(), ahnhVar36.gG());
            case 496:
                return cask.a(this.a.a.gp(), this.b.cR());
            case 497:
                return new bybn(this.a.a.rF);
            case 498:
                ahnh ahnhVar37 = this.a.a;
                fdjx fdjxVar9 = (fdjx) ahnhVar37.m.b();
                byeq byeqVar = (byeq) ahnhVar37.sG.b();
                ahjr ahjrVar37 = this.b;
                return new avgl(fdjxVar9, byeqVar, (avdr) ahjrVar37.an.b(), (avdm) ahnhVar37.agD.b(), ahjrVar37.aw(), ahnhVar37.Ao, (avkx) ahjrVar37.iA.b(), ahnhVar37.vh, ahnhVar37.pb, ahnhVar37.agH);
            case 499:
                return new avkx(this.a.a.rF);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v44, types: [cafd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aszp, java.lang.Object] */
    private final Object g() {
        Object avitVar;
        int i = this.c;
        switch (i) {
            case 500:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                fdjx fdjxVar = (fdjx) ahnhVar.m.b();
                ahjr ahjrVar = this.b;
                return new avgr(fdjxVar, ahjrVar.an, ahjrVar.iC, ahjrVar.iD, ahnhVar.pb, ahknVar.cE, ahnhVar.agH);
            case 501:
                return new avhw(this.a.a.rF);
            case 502:
                return new avlc(this.a.a.rF);
            case 503:
                bxlc bxlcVar = (bxlc) this.b.U.b();
                ahkn ahknVar2 = this.a;
                return new cath(bxlcVar, (dqsn) ahknVar2.a.qq.b(), (eosc) ahknVar2.y.b());
            case 504:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                return new avku((fdjx) ahnhVar2.m.b(), this.b.iG, ahnhVar2.Aw, ahnhVar2.adi, ahnhVar2.adk, ahknVar3.cE, ahknVar3.cD, ahknVar3.aw, ahnhVar2.agH, ahnhVar2.pb);
            case 505:
                return new avlg((anty) this.b.ap.b(), this.a.cE);
            case 506:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar3 = ahknVar4.a;
                return new avkz((fdjx) ahnhVar3.m.b(), this.b.iG, ahnhVar3.Aw, ahnhVar3.adi, ahnhVar3.adk, ahknVar4.aw, ahknVar4.cD, ahnhVar3.pb);
            case 507:
                ahnh ahnhVar4 = this.a.a;
                fdjx fdjxVar2 = (fdjx) ahnhVar4.oS.b();
                ahjr ahjrVar2 = this.b;
                return new cjoe(fdjxVar2, (cteb) ahjrVar2.aL.b(), (awjh) ahjrVar2.E.b(), (awjd) ahjrVar2.ax.b(), ahnhVar4.qm(), ahnhVar4.bF());
            case 508:
                ahkn ahknVar5 = this.a;
                cogw cogwVar = (cogw) ahknVar5.cD.b();
                eosc eoscVar = (eosc) ahknVar5.y.b();
                eosc eoscVar2 = (eosc) ahknVar5.p.b();
                ahjr ahjrVar3 = this.b;
                return new caus(cogwVar, eoscVar, eoscVar2, ahjrVar3.cV(), (axno) ahjrVar3.iL.b());
            case 509:
                ahjr ahjrVar4 = this.b;
                ahkn ahknVar6 = this.a;
                return new axno(ahjrVar4.ar, ahjrVar4.F, (cogw) ahknVar6.cD.b(), ahknVar6.a.uy, (ayou) ahjrVar4.iK.b(), (avpc) ahjrVar4.bh.b());
            case 510:
                return new ayou(this.b.aC, (cmqj) this.a.a.uv.b());
            case 511:
                return new avkm((fdjx) this.a.a.m.b(), (avjf) this.b.iS.b());
            case 512:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar5 = ahknVar7.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar5.m.b();
                ahjr ahjrVar5 = this.b;
                return new avjj(fdjxVar3, ahnhVar5.ahd, ahnhVar5.ahl, ahjrVar5.iN, ahjrVar5.iQ, ahjrVar5.iR, (egsh) ahknVar7.dG.b(), ahnhVar5.abl, ahknVar7.pg, ahnhVar5.ahb);
            case 513:
                ahkn ahknVar8 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar8.bM.b();
                fcyh fcyhVar2 = (fcyh) ahknVar8.cz.b();
                cogw cogwVar2 = (cogw) ahknVar8.cD.b();
                ahnh ahnhVar6 = ahknVar8.a;
                byeq byeqVar = (byeq) ahnhVar6.sG.b();
                cmfo cmfoVar = (cmfo) ahnhVar6.ahb.b();
                ahjr ahjrVar6 = this.b;
                avitVar = new avit(fcyhVar, fcyhVar2, cogwVar2, byeqVar, cmfoVar, (avdr) ahjrVar6.an.b(), (avdm) ahnhVar6.agD.b(), ahnhVar6.vh, ahnhVar6.pQ, ahnhVar6.pb, ahnhVar6.Ao, ahnhVar6.adm, (avkx) ahjrVar6.iA.b(), (avlc) ahjrVar6.iD.b(), ahknVar8.aw, ahjrVar6.aS(), (aqvc) ahnhVar6.to.b());
                break;
            case 514:
                ahkn ahknVar9 = this.a;
                fcyh fcyhVar3 = (fcyh) ahknVar9.bM.b();
                fcyh fcyhVar4 = (fcyh) ahknVar9.cz.b();
                cogw cogwVar3 = (cogw) ahknVar9.cD.b();
                ahnh ahnhVar7 = ahknVar9.a;
                byeq byeqVar2 = (byeq) ahnhVar7.sG.b();
                cmfo cmfoVar2 = (cmfo) ahnhVar7.ahb.b();
                ahjr ahjrVar7 = this.b;
                avitVar = new avjz(fcyhVar3, fcyhVar4, cogwVar3, byeqVar2, cmfoVar2, (avdr) ahjrVar7.an.b(), (avdm) ahnhVar7.agD.b(), ahnhVar7.vh, ahnhVar7.pQ, ahnhVar7.pb, ahjrVar7.iP, ahnhVar7.abh, ahnhVar7.abj, ahnhVar7.Ao, (avlc) ahjrVar7.iD.b(), ahknVar9.aw, ahnhVar7.ahg, ahnhVar7.ahj);
                break;
            case 515:
                ahkn ahknVar10 = this.a;
                fcyh fcyhVar5 = (fcyh) ahknVar10.bM.b();
                ahnh ahnhVar8 = ahknVar10.a;
                byeq byeqVar3 = (byeq) ahnhVar8.sG.b();
                ahjr ahjrVar8 = this.b;
                return new avhb(fcyhVar5, byeqVar3, (avhw) ahjrVar8.iC.b(), (cmfo) ahnhVar8.ahb.b(), (cogw) ahknVar10.cD.b(), ahjrVar8.iO, ahnhVar8.Ao, ahnhVar8.abD, ahnhVar8.abF, ahnhVar8.pb);
            case 516:
                return new avif(this.a.a.rF);
            case 517:
                return new avkn();
            case 518:
                ahkn ahknVar11 = this.a;
                eosc eoscVar3 = (eosc) ahknVar11.y.b();
                eosc eoscVar4 = (eosc) ahknVar11.p.b();
                ahjr ahjrVar9 = this.b;
                eyik eyikVar = ahjrVar9.bC;
                ahnh ahnhVar9 = ahknVar11.a;
                eyik eyikVar2 = ahjrVar9.F;
                eyik eyikVar3 = ahnhVar9.Pb;
                asre asreVar = (asre) eyikVar.b();
                asqx asqxVar = (asqx) ahnhVar9.pT.b();
                eyik eyikVar4 = ahnhVar9.ahp;
                return new ciss(eoscVar3, eoscVar4, eyikVar2, eyikVar3, asreVar, asqxVar, eyikVar4, ahnhVar9.ND, ahjrVar9.J, ahnhVar9.XU, ahnhVar9.OZ);
            case 519:
                ahnh ahnhVar10 = this.a.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar10.oS.b();
                ahjr ahjrVar10 = this.b;
                return new coot(fdjxVar4, ahjrVar10.bf, ahjrVar10.ar, (cgbn) ahnhVar10.Cs.b());
            case 520:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar11 = ahknVar12.a;
                fdjx fdjxVar5 = (fdjx) ahnhVar11.oQ.b();
                ahjr ahjrVar11 = this.b;
                return new cird(fdjxVar5, ahjrVar11.F, ahnhVar11.uv, ahjrVar11.ar, (ciri) ahjrVar11.iW.b(), ahnhVar11.qq, ahknVar12.ph, ahnhVar11.SW, ahnhVar11.acd, ahnhVar11.abW);
            case 521:
                return new ciri(this.a.a.rF);
            case 522:
                ahnh ahnhVar12 = this.a.a;
                return new cgux((fdjx) ahnhVar12.oQ.b(), this.b.at(), ahnhVar12.bG());
            case 523:
                ahkn ahknVar13 = this.a;
                Context context = (Context) ahknVar13.t.b();
                eosc eoscVar5 = (eosc) ahknVar13.p.b();
                ahjr ahjrVar12 = this.b;
                return new cghk(context, eoscVar5, ahknVar13.a.ahy, (Map) ahjrVar12.iZ.b(), ahknVar13.cc(), (cgkb) ahjrVar12.dA.b(), ahjrVar12.dI());
            case 524:
                return ekgp.m(cglf.NT_INCOMING_MESSAGE, this.b.dK(), cglf.NT_DIRECTOR, this.a.a.ik());
            case 525:
                return new bzjr((bzkg) this.b.gv());
            case 526:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar13 = ahknVar14.a;
                ahnhVar13.fG();
                ahnhVar13.fK();
                ahnhVar13.fF();
                ahnhVar13.fJ();
                ahjr ahjrVar13 = this.b;
                ahjrVar13.bC();
                return new byik(ahjrVar13.bQ(), (eosc) ahknVar14.p.b(), (eosc) ahknVar14.y.b());
            case 527:
                return Optional.of(this.b.hs());
            case 528:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar14 = ahknVar15.a;
                return new bzns((bznk) ahnhVar14.pD(), (aurx) ahnhVar14.wc.b(), (bzmy) ahnhVar14.afk.b(), (aukz) ahnhVar14.Iz.b(), (eosc) ahknVar15.p.b());
            case 529:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar15 = ahknVar16.a;
                ?? Qn = ahnhVar15.qn();
                aurx aurxVar = (aurx) ahnhVar15.wc.b();
                return new caem(Qn, aurxVar, (aukz) ahnhVar15.Iz.b(), (cogw) ahknVar16.cD.b(), (ains) ahnhVar15.pb.b());
            case 530:
                return new caea(this.a.a.rF);
            case 531:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar16 = ahknVar17.a;
                return new cajm((aukz) ahnhVar16.Iz.b(), (axlf) ahnhVar16.Lw.b(), (eosc) ahknVar17.y.b(), (Context) ahknVar17.t.b(), ahnhVar16.fO());
            case 532:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar17 = ahknVar18.a;
                return new caju((axlf) ahnhVar17.Lw.b(), (aukz) ahnhVar17.Iz.b(), (eosc) ahknVar18.y.b(), (Context) ahknVar18.t.b(), ahnhVar17.fN(), ahnhVar17.fO());
            case 533:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar18 = ahknVar19.a;
                return new cakc((axlf) ahnhVar18.Lw.b(), (eosc) ahknVar19.y.b(), (aukz) ahnhVar18.Iz.b(), (Context) ahknVar19.t.b(), ahnhVar18.fO());
            case 534:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar19 = ahknVar20.a;
                return new caki((axlf) ahnhVar19.Lw.b(), (Context) ahknVar20.t.b(), (eosc) ahknVar20.y.b(), (aukz) ahnhVar19.Iz.b(), ahnhVar19.fN(), ahnhVar19.fO());
            case 535:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar20 = ahknVar21.a;
                return new canp((axlf) ahnhVar20.Lw.b(), (eosc) ahknVar21.y.b(), (aukz) ahnhVar20.Iz.b(), (Context) ahknVar21.t.b(), ahnhVar20.fN(), ahnhVar20.fO());
            case 536:
                eygg eyggVarA = eyie.a(this.b.jm);
                ahkn ahknVar22 = this.a;
                return new bvss(eyggVarA, eyie.a(ahknVar22.a.xc), (eosc) ahknVar22.p.b(), (eosc) ahknVar22.y.b());
            case 537:
                return new bvsm(this.a.a.rF);
            case 538:
                ahnh ahnhVar21 = this.a.a;
                fdjx fdjxVar6 = (fdjx) ahnhVar21.oS.b();
                ahjr ahjrVar14 = this.b;
                return new cgqs(fdjxVar6, ahjrVar14.au, ahjrVar14.jo, ahjrVar14.jq, ahjrVar14.dV, (cgpw) ahnhVar21.aek.b());
            case 539:
                ahjr ahjrVar15 = this.b;
                ahnh ahnhVar22 = this.a.a;
                return new cgqx(ahjrVar15.au, ahjrVar15.dt, ahjrVar15.dU, ahjrVar15.dv, (asjn) ahnhVar22.vU.b(), ahnhVar22.cF(), ahnhVar22.cG());
            case 540:
                ahjr ahjrVar16 = this.b;
                ahnh ahnhVar23 = this.a.a;
                return new cgqy(ahjrVar16.jp, ahjrVar16.dV, (asjn) ahnhVar23.vU.b(), ahnhVar23.cF(), ahnhVar23.cG());
            case 541:
                ahjr ahjrVar17 = this.b;
                return new cgqz(ahjrVar17.dt, ahjrVar17.dv);
            case 542:
                return new avna(this.b.bo);
            case 543:
                ahjr ahjrVar18 = this.b;
                Map map = (Map) ahjrVar18.dz.b();
                ahkn ahknVar23 = this.a;
                Context context2 = (Context) ahknVar23.t.b();
                eosc eoscVar6 = (eosc) ahknVar23.p.b();
                eosc eoscVar7 = (eosc) ahknVar23.aJ.b();
                cgjf cgjfVarDJ = ahjrVar18.dJ();
                cglm cglmVarCc = ahknVar23.cc();
                cgkb cgkbVar = (cgkb) ahjrVar18.dA.b();
                Map map2 = (Map) ahjrVar18.iZ.b();
                Optional optional = (Optional) ahknVar23.oy.b();
                Optional optional2 = (Optional) ahknVar23.ox.b();
                eyik eyikVar5 = ahknVar23.cE;
                ahnh ahnhVar24 = ahknVar23.a;
                return new cgij(map, context2, eoscVar6, eoscVar7, cgjfVarDJ, cglmVarCc, cgkbVar, map2, optional, optional2, ahjrVar18.dI(), ahnhVar24.aia, ahnhVar24.aib, ahnhVar24.ahz, ahnhVar24.cn(), (dzuc) eyikVar5.b(), (cogw) ahknVar23.cD.b(), (crnp) ahknVar23.cI.b());
            case 544:
                ahnh ahnhVar25 = this.a.a;
                return new akdr((fdjx) ahnhVar25.oQ.b(), this.b.at(), ahnhVar25.bG());
            case 545:
                ahkn ahknVar24 = this.a;
                Context context3 = (Context) ahknVar24.t.b();
                eosc eoscVar8 = (eosc) ahknVar24.p.b();
                eosc eoscVar9 = (eosc) ahknVar24.y.b();
                ahnh ahnhVar26 = ahknVar24.a;
                dqsn dqsnVar = (dqsn) ahnhVar26.qq.b();
                ahjr ahjrVar19 = this.b;
                cauk caukVarCU = ahjrVar19.cU();
                cata cataVarCS = ahjrVar19.cS();
                cauf caufVarCT = ahjrVar19.cT();
                cdyk cdykVarDn = ahjrVar19.dn();
                auuh auuhVar = (auuh) ahnhVar26.Nz.b();
                eyik eyikVar6 = ahjrVar19.eL;
                eyik eyikVar7 = ahjrVar19.F;
                eyik eyikVar8 = ahjrVar19.ar;
                eyik eyikVar9 = ahnhVar26.Ii;
                aijz aijzVar = (aijz) ahnhVar26.WP.b();
                Optional optional3 = (Optional) ahnhVar26.qI.b();
                eyik eyikVar10 = ahnhVar26.aim;
                ajfo ajfoVar = (ajfo) ahnhVar26.vh.b();
                bxlc bxlcVar2 = (bxlc) ahjrVar19.U.b();
                bbfn bbfnVar = (bbfn) ahnhVar26.CF.b();
                coia coiaVarFn = ahjrVar19.fn();
                eyik eyikVar11 = ahjrVar19.dB;
                eyik eyikVar12 = ahjrVar19.dN;
                eyik eyikVar13 = ahnhVar26.MP;
                eyik eyikVar14 = ahnhVar26.wc;
                eygg eyggVarA2 = eyie.a(ahjrVar19.jw);
                eyik eyikVar15 = ahnhVar26.aio;
                return new catu(context3, eoscVar8, eoscVar9, dqsnVar, caukVarCU, cataVarCS, caufVarCT, cdykVarDn, auuhVar, ahjrVar19.aC, eyikVar6, eyikVar7, eyikVar8, eyikVar9, ahjrVar19.bJ, aijzVar, optional3, eyikVar10, ajfoVar, bxlcVar2, bbfnVar, coiaVarFn, eyikVar11, eyikVar12, ahjrVar19.cG, eyikVar13, eyikVar14, eyggVarA2, eyikVar15);
            case 546:
                ahkn ahknVar25 = this.a;
                Context context4 = (Context) ahknVar25.t.b();
                ahjr ahjrVar20 = this.b;
                ahnh ahnhVar27 = ahknVar25.a;
                return new cgur(context4, ahjrVar20.dR(), ahjrVar20.aq, ahnhVar27.pT, ahjrVar20.F, ahjrVar20.jv, (ains) ahnhVar27.pQ.b(), (fdjx) ahnhVar27.oQ.b(), ahnhVar27.bG());
            case 547:
                return Optional.of((cgte) this.b.bu.b());
            case 548:
                ahkn ahknVar26 = this.a;
                Context context5 = (Context) ahknVar26.t.b();
                eosc eoscVar10 = (eosc) ahknVar26.p.b();
                eosc eoscVar11 = (eosc) ahknVar26.y.b();
                ahjr ahjrVar21 = this.b;
                ahnh ahnhVar28 = ahknVar26.a;
                eyik eyikVar16 = ahnhVar28.vh;
                return new cdyb(context5, eoscVar10, eoscVar11, eyikVar16, (bydb) ahjrVar21.dc.b(), (ains) ahnhVar28.c.b(), (auuh) ahnhVar28.Nz.b(), ahjrVar21.aC, ahjrVar21.ar, ahjrVar21.dN, ahjrVar21.fn(), ahjrVar21.bk(), ahnhVar28.IC, ahnhVar28.HQ, ahnhVar28.tB, ahnhVar28.aio);
            case 549:
                return new bwlv(this.a.a.rF);
            case 550:
                ahjr ahjrVar22 = this.b;
                cfeh cfehVar = (cfeh) ahjrVar22.cl.b();
                eygg eyggVarA3 = eyie.a(ahjrVar22.jD);
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar29 = ahknVar27.a;
                return new cfxk(cfehVar, eyggVarA3, ahknVar27.hZ, eyie.a(ahnhVar29.xd), ahnhVar29.wv, ahnhVar29.xk, eyie.a(ahjrVar22.bZ), (cexq) ahjrVar22.jE.b(), ahnhVar29.c, (eosc) ahknVar27.p.b(), (eosc) ahknVar27.y.b(), ahjrVar22.jJ, ahknVar27.dh);
            case 551:
                ahjr ahjrVar23 = this.b;
                eyik eyikVar17 = ahjrVar23.cd;
                cfyi cfyiVarDD = ahjrVar23.dD();
                cedm cedmVar = (cedm) eyikVar17.b();
                ahnh ahnhVar30 = this.a.a;
                return cfyt.a(cfyiVarDD, cedmVar, eyie.a(ahnhVar30.vY), ahnhVar30.FP, (cezv) ahjrVar23.x.b());
            case 552:
                return new cfyr(this.a.a.rF);
            case 553:
                return new cfxz(this.a.a.rF);
            case 554:
                return new cfxl(this.a.a.rF);
            case 555:
                ahkn ahknVar28 = this.a;
                eosc eoscVar12 = (eosc) ahknVar28.p.b();
                eosc eoscVar13 = (eosc) ahknVar28.y.b();
                ahjr ahjrVar24 = this.b;
                return new ceyg(eoscVar12, eoscVar13, ahknVar28.a.qk, (aofc) ahjrVar24.I.b(), (anty) ahjrVar24.ap.b(), (ajvr) ahjrVar24.aq.b());
            case 556:
                ahkn ahknVar29 = this.a;
                eosc eoscVar14 = (eosc) ahknVar29.p.b();
                eosc eoscVar15 = (eosc) ahknVar29.y.b();
                ahjr ahjrVar25 = this.b;
                ahnh ahnhVar31 = ahknVar29.a;
                return new cezf(eoscVar14, eoscVar15, ahjrVar25.jI, ahnhVar31.qi, ahnhVar31.sk, ahknVar29.dL, ahjrVar25.I);
            case 557:
                ahkn ahknVar30 = this.a;
                fdjx fdjxVar7 = (fdjx) ahknVar30.a.m.b();
                ahjr ahjrVar26 = this.b;
                return new bwqd(fdjxVar7, ahjrVar26.jG, ahjrVar26.jH, (egyt) ahknVar30.dj.b(), ahjrVar26.jF);
            case 558:
                ahkn ahknVar31 = this.a;
                ahjr ahjrVar27 = this.b;
                ahnh ahnhVar32 = ahknVar31.a;
                return new bwqn(ahnhVar32.m, ahknVar31.cA, ahjrVar27.F, ahjrVar27.aG, ahnhVar32.pT, ahnhVar32.sk, ahknVar31.cD, ahjrVar27.jF);
            case 559:
                ahkn ahknVar32 = this.a;
                fcyh fcyhVar6 = (fcyh) ahknVar32.cz.b();
                ahjr ahjrVar28 = this.b;
                return new bwqa(fcyhVar6, ahjrVar28.aH, ahjrVar28.aG, ahknVar32.a.pT);
            case 560:
                ahkn ahknVar33 = this.a;
                ahjr ahjrVar29 = this.b;
                ahnh ahnhVar33 = ahknVar33.a;
                return new bwpt(ahnhVar33.oQ, ahknVar33.cz, ahknVar33.bM, ahjrVar29.ap, ahjrVar29.au, ahjrVar29.jF, ahnhVar33.sk, ahknVar33.cD, ahnhVar33.UT);
            case 561:
                ahjr ahjrVar30 = this.b;
                cfeh cfehVar2 = (cfeh) ahjrVar30.cl.b();
                eygg eyggVarA4 = eyie.a(ahjrVar30.jD);
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar34 = ahknVar34.a;
                eyik eyikVar18 = ahknVar34.hZ;
                eygg eyggVarA5 = eyie.a(ahnhVar34.xd);
                eyik eyikVar19 = ahjrVar30.bZ;
                eyik eyikVar20 = ahnhVar34.Vr;
                eyik eyikVar21 = ahjrVar30.jN;
                eyik eyikVar22 = ahjrVar30.jO;
                eyik eyikVar23 = ahnhVar34.xk;
                eygg eyggVarA6 = eyie.a(eyikVar19);
                eyik eyikVar24 = ahnhVar34.c;
                eosc eoscVar16 = (eosc) ahknVar34.p.b();
                eosc eoscVar17 = (eosc) ahknVar34.y.b();
                eyik eyikVar25 = ahknVar34.cD;
                eyik eyikVar26 = ahknVar34.np;
                eyik eyikVar27 = ahnhVar34.Vs;
                cogw cogwVar4 = (cogw) eyikVar25.b();
                eyik eyikVar28 = ahnhVar34.QG;
                eyik eyikVar29 = ahjrVar30.jE;
                aqmq aqmqVar = (aqmq) eyikVar28.b();
                return new cfxy(cfehVar2, eyggVarA4, eyikVar18, eyggVarA5, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyggVarA6, eyikVar24, eoscVar16, eoscVar17, ahknVar34.mU, eyikVar26, eyikVar27, cogwVar4, eyikVar29, ahknVar34.dh, aqmqVar, (aqad) ahnhVar34.UI.b());
            case 562:
                ahjr ahjrVar31 = this.b;
                ahkn ahknVar35 = this.a;
                return new ayld(ahjrVar31.jL, ahjrVar31.cg, ahjrVar31.V, ahknVar35.y, ahjrVar31.jM, ahknVar35.a.pI);
            case 563:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar35 = ahknVar36.a;
                return new bvsl(ahknVar36.hZ, ahnhVar35.xk, (eosc) ahknVar36.y.b(), ahnhVar35.qq, this.b.V);
            case 564:
                return Optional.of((efwo) this.b.b.b());
            case 565:
                return new bvtz(this.a.a.rF);
            case 566:
                ahjr ahjrVar32 = this.b;
                cfeh cfehVar3 = (cfeh) ahjrVar32.cl.b();
                eygg eyggVarA7 = eyie.a(ahjrVar32.jD);
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar36 = ahknVar37.a;
                return new cfyq(cfehVar3, eyggVarA7, ahknVar37.hZ, eyie.a(ahnhVar36.xd), ahnhVar36.xk, ahjrVar32.jT, eyie.a(ahjrVar32.bZ), ahnhVar36.c, (eosc) ahknVar37.p.b(), (eosc) ahknVar37.y.b(), ahknVar37.dh);
            case 567:
                ahkn ahknVar38 = this.a;
                Context context6 = (Context) ahknVar38.t.b();
                ahnh ahnhVar37 = ahknVar38.a;
                cqbm cqbmVar = (cqbm) ahnhVar37.sX.b();
                ahjr ahjrVar33 = this.b;
                return new bver(context6, cqbmVar, (aypz) ahjrVar33.jR.b(), ahjrVar33.jS, (ains) ahnhVar37.c.b(), (eigp) ahjrVar33.ac.b());
            case 568:
                ahkn ahknVar39 = this.a;
                ahjr ahjrVar34 = this.b;
                ahnh ahnhVar38 = ahknVar39.a;
                return new axyz(ahnhVar38.EG, ahjrVar34.jQ, ahjrVar34.bZ, ahnhVar38.c, ahknVar39.p, ahknVar39.y, ahnhVar38.YJ, ahjrVar34.cl, ahknVar39.dh);
            case 569:
                return Optional.of((cfya) this.b.jD.b());
            case 570:
                ahjr ahjrVar35 = this.b;
                ahnh ahnhVar39 = this.a.a;
                return new bvud(ahjrVar35.aL(), ahnhVar39.wX, (ains) ahnhVar39.c.b());
            case 571:
                ahjr ahjrVar36 = this.b;
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar40 = ahknVar40.a;
                return new bwmi(ahjrVar36.eB, ahjrVar36.ar, ahnhVar40.vh, ahjrVar36.aA, ahjrVar36.jV, ahnhVar40.EJ, ahnhVar40.uQ, (eosc) ahknVar40.y.b(), ahnhVar40.pQ, ahknVar40.ez);
            case 572:
                return new bwms(this.a.a.rF);
            case 573:
                return new ssm((fdjx) this.a.a.oQ.b(), this.b.f());
            case 574:
                return new ahjb(this);
            case 575:
                return dlxm.a((fcyh) this.b.jZ.b());
            case 576:
                return dlxl.a((eosd) this.a.po.b(), (dngc) this.b.jY.b());
            case 577:
                return dpbo.a(Optional.of(uke.a()), this.b.jX, this.a.ln);
            case 578:
                return new dpbn((eigp) this.b.ac.b(), this.a.el());
            case 579:
                return new ahjc(this);
            case 580:
                ahkn ahknVar41 = this.a;
                Context context7 = (Context) ahknVar41.t.b();
                eosc eoscVar18 = (eosc) ahknVar41.p.b();
                eosc eoscVar19 = (eosc) ahknVar41.y.b();
                eosc eoscVar20 = (eosc) ahknVar41.aJ.b();
                ahjr ahjrVar37 = this.b;
                eyik eyikVar30 = ahjrVar37.dd;
                ahnh ahnhVar41 = ahknVar41.a;
                eyik eyikVar31 = ahnhVar41.Jd;
                eyik eyikVar32 = ahjrVar37.ar;
                eyik eyikVar33 = ahnhVar41.xi;
                eyik eyikVar34 = ahnhVar41.qq;
                eyik eyikVar35 = ahjrVar37.U;
                cosz coszVarFp = ahjrVar37.fp();
                bwdg bwdgVarEQ = ahnhVar41.eQ();
                ayqn ayqnVar = (ayqn) eyikVar30.b();
                eyik eyikVar36 = ahjrVar37.aM;
                eyik eyikVar37 = ahjrVar37.dN;
                eyik eyikVar38 = ahjrVar37.V;
                eyik eyikVar39 = ahjrVar37.kg;
                eyik eyikVar40 = ahnhVar41.xO;
                eyik eyikVar41 = ahnhVar41.rl;
                coor coorVar = (coor) ahnhVar41.Ju.b();
                ateg ategVarDc = ahnhVar41.dc();
                aypv aypvVar = (aypv) ahknVar41.ld.b();
                eyik eyikVar42 = ahnhVar41.WR;
                eyik eyikVar43 = ahnhVar41.WS;
                eyik eyikVar44 = ahnhVar41.yp;
                eyik eyikVar45 = ahnhVar41.aiW;
                return new coqb(context7, eoscVar18, eoscVar19, eoscVar20, eyikVar31, eyikVar32, ahjrVar37.aB, ahjrVar37.bf, eyikVar33, ahjrVar37.dl, eyikVar34, eyikVar35, coszVarFp, bwdgVarEQ, ayqnVar, eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, coorVar, ategVarDc, aypvVar, eyikVar42, eyikVar43, eyikVar44, eyikVar45);
            case 581:
                ahjr ahjrVar38 = this.b;
                ahnh ahnhVar42 = this.a.a;
                return ekhx.v(ahjrVar38.e(), ahnhVar42.l(), ahjrVar38.s(), ahnhVar42.qt(), ahjrVar38.g(), ahjrVar38.eU(), ahjrVar38.fP(), ahjrVar38.i());
            case 582:
                ahkn ahknVar42 = this.a;
                Context context8 = (Context) ahknVar42.t.b();
                ahnh ahnhVar43 = ahknVar42.a;
                return new cslz(context8, (fdjx) ahnhVar43.oS.b(), (fcyh) ahknVar42.cA.b(), ahknVar42.pn, (aqzb) ahnhVar43.WR.b(), ahnhVar43.pQ, this.b.ke);
            case 583:
                return new csnf((cgkj) this.b.dt.b(), this.a.a.lF());
            case 584:
                ahkn ahknVar43 = this.a;
                eosc eoscVar21 = (eosc) ahknVar43.p.b();
                eosc eoscVar22 = (eosc) ahknVar43.y.b();
                ahjr ahjrVar39 = this.b;
                eyik eyikVar46 = ahjrVar39.aM;
                eyik eyikVar47 = ahjrVar39.ar;
                cosz coszVarFp2 = ahjrVar39.fp();
                Optional optional4 = (Optional) ahknVar43.ku.b();
                ahnh ahnhVar44 = ahknVar43.a;
                return new coqn(eoscVar21, eoscVar22, eyikVar47, coszVarFp2, optional4, ahnhVar44.Ju, ahjrVar39.ag(), ahnhVar44.aiZ);
            case 585:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar45 = ahknVar44.a;
                cgbn cgbnVar = (cgbn) ahnhVar45.Cs.b();
                eosc eoscVar23 = (eosc) ahknVar44.y.b();
                aten atenVar = (aten) ahnhVar45.Ed.b();
                coir coirVar = (coir) ahnhVar45.Og.b();
                ahjr ahjrVar40 = this.b;
                return new atem(cgbnVar, eoscVar23, atenVar, coirVar, ahjrVar40.fo(), (coii) ahjrVar40.bS.b());
            case 586:
                return new coqe(this.a.a.rF);
            case 587:
                return new cotw(this.a.a.rF);
            case 588:
                ahnh ahnhVar46 = this.a.a;
                return new atgh((fdjx) ahnhVar46.oQ.b(), this.b.ae(), (cgbn) ahnhVar46.Cs.b(), ahnhVar46.Oh);
            case 589:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar47 = ahknVar45.a;
                couz couzVar = (couz) ahnhVar47.EA.b();
                eosc eoscVar24 = (eosc) ahknVar45.y.b();
                eosc eoscVar25 = (eosc) ahknVar45.p.b();
                cgbn cgbnVar2 = (cgbn) ahnhVar47.Cs.b();
                coir coirVar2 = (coir) ahnhVar47.Og.b();
                ahjr ahjrVar41 = this.b;
                coii coiiVar = (coii) ahjrVar41.bS.b();
                coun counVar = (coun) ahjrVar41.dF.b();
                eyik eyikVar48 = ahknVar45.mH;
                coyz coyzVar = (coyz) ahnhVar47.NB.b();
                eyik eyikVar49 = ahjrVar41.ar;
                eyik eyikVar50 = ahjrVar41.kn;
                eyik eyikVar51 = ahnhVar47.xT;
                return new covn(couzVar, eoscVar24, eoscVar25, cgbnVar2, coirVar2, coiiVar, counVar, eyikVar48, coyzVar, eyikVar49, eyikVar50, ahjrVar41.bM, eyikVar51);
            case 590:
                ahkn ahknVar46 = this.a;
                ahjr ahjrVar42 = this.b;
                ahnh ahnhVar48 = ahknVar46.a;
                return new aujt(ahnhVar48.OM, ahjrVar42.eW, ahnhVar48.OO, new aujg());
            case 591:
                ahkn ahknVar47 = this.a;
                return new cnrc((Context) ahknVar47.t.b(), ahknVar47.a.Cs, this.b.ks);
            case 592:
                ahkn ahknVar48 = this.a;
                eosc eoscVar26 = (eosc) ahknVar48.y.b();
                crqv crqvVar = (crqv) ahknVar48.aT.b();
                cogw cogwVar5 = (cogw) ahknVar48.cD.b();
                ahjr ahjrVar43 = this.b;
                eyik eyikVar52 = ahjrVar43.bl;
                ahnh ahnhVar49 = ahknVar48.a;
                return new cnqz(eoscVar26, crqvVar, cogwVar5, ahnhVar49.vh, ahnhVar49.uv, ahjrVar43.kp, ahnhVar49.VS, ahnhVar49.pB, ahnhVar49.Cp, ahjrVar43.kr, ahnhVar49.ajk, ahnhVar49.Db, ahnhVar49.Dc, (cmsk) eyikVar52.b(), (bxlc) ahjrVar43.U.b(), ahnhVar49.c, ahnhVar49.qi, ahnhVar49.VQ, ahknVar48.da, ahnhVar49.VT);
            case 593:
                ahkn ahknVar49 = this.a;
                ahjr ahjrVar44 = this.b;
                ahnh ahnhVar50 = ahknVar49.a;
                return new cntz(ahnhVar50.TW, ahnhVar50.CA, ahjrVar44.W, ahjrVar44.F, ahjrVar44.aB, ahjrVar44.hH, ahjrVar44.be, ahjrVar44.aC, ahnhVar50.uv, ahjrVar44.bl, ahjrVar44.U, ahnhVar50.Mr, ahnhVar50.yx, ahnhVar50.qq, ahknVar49.t, ahnhVar50.Cp, ahknVar49.da, ahnhVar50.pf, ahjrVar44.X, ahnhVar50.c, ahjrVar44.bh, ahjrVar44.bm, ahnhVar50.qi, ahjrVar44.br, ahknVar49.oO, ahnhVar50.Xg, ahjrVar44.ar, ahnhVar50.WY, ahnhVar50.ajh, ahknVar49.cE, ahnhVar50.ur, ahnhVar50.Dz, ahknVar49.cQ, ahnhVar50.pQ, ahnhVar50.Io, ahnhVar50.aji);
            case 594:
                return Optional.of(this.b.gB());
            case 595:
                return new cnra(this.a.a.rF);
            case 596:
                ahkn ahknVar50 = this.a;
                Context context9 = (Context) ahknVar50.t.b();
                ahjr ahjrVar45 = this.b;
                ahnh ahnhVar51 = ahknVar50.a;
                return new bwgq(context9, ahjrVar45.bc(), ahjrVar45.ku, (cgbn) ahnhVar51.Cs.b(), ahnhVar51.pT);
            case 597:
                ahkn ahknVar51 = this.a;
                ahnh ahnhVar52 = ahknVar51.a;
                bwla bwlaVar = (bwla) ahnhVar52.EW.b();
                eyik eyikVar53 = ahnhVar52.tw;
                bwkr bwkrVar = (bwkr) ahnhVar52.tl.b();
                cogw cogwVar6 = (cogw) ahknVar51.cD.b();
                ahjr ahjrVar46 = this.b;
                eyik eyikVar54 = ahjrVar46.aH;
                eyik eyikVar55 = ahnhVar52.wv;
                eyik eyikVar56 = ahjrVar46.W;
                eyik eyikVar57 = ahjrVar46.ar;
                bwjw bwjwVar = (bwjw) eyikVar54.b();
                eosc eoscVar27 = (eosc) ahknVar51.y.b();
                aypv aypvVar2 = (aypv) ahknVar51.ld.b();
                dqsn dqsnVar2 = (dqsn) ahnhVar52.qq.b();
                eygg eyggVarA8 = eyie.a(ahnhVar52.ts);
                eyik eyikVar58 = ahjrVar46.bY;
                eyik eyikVar59 = ahnhVar52.c;
                return new bwgp(bwlaVar, eyikVar53, bwkrVar, cogwVar6, eyikVar55, eyikVar56, eyikVar57, bwjwVar, eoscVar27, aypvVar2, dqsnVar2, eyggVarA8, eyikVar59, (auau) ahknVar51.ez.b());
            case 598:
                ahjr ahjrVar47 = this.b;
                ahkn ahknVar52 = this.a;
                cjcb cjcbVarEI = ahjrVar47.eI();
                crru crruVar = (crru) ahknVar52.ds.b();
                ahnh ahnhVar53 = ahknVar52.a;
                return new cjfv(cjcbVarEI, crruVar, ahnhVar53.rQ(), (cjae) ahnhVar53.Ps.b(), ahjrVar47.eL(), (eosc) ahknVar52.y.b(), (eosc) ahknVar52.aJ.b(), (eosc) ahknVar52.p.b(), ahnhVar53.js(), ahjrVar47.eK(), (aika) ahnhVar53.uM.b(), (cogw) ahknVar52.cD.b(), ahjrVar47.F);
            case 599:
                ahjr ahjrVar48 = this.b;
                ahnh ahnhVar54 = this.a.a;
                return new cgvj(ahjrVar48.dS(), (fdjx) ahnhVar54.m.b(), ahnhVar54.iv());
            default:
                throw new AssertionError(i);
        }
        return avitVar;
    }

    private final Object h() {
        int i = this.c;
        switch (i) {
            case 600:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                return new cihr((fdjx) ahnhVar.m.b(), (fcyh) ahknVar.cA.b(), ahnhVar.lw, ahnhVar.rL, (lkb) ahnhVar.rN.b(), this.b.F, ahnhVar.pQ);
            case 601:
                return new ciib((bxlc) this.b.U.b());
            case 602:
                ahkn ahknVar2 = this.a;
                return new ciin((eosd) ahknVar2.y.b(), (eosc) ahknVar2.p.b(), (cicm) this.b.br.b(), (dqsn) ahknVar2.a.qq.b());
            case 603:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                eyik eyikVar = ahnhVar2.oP;
                bxxd bxxdVar = (bxxd) ahnhVar2.MF.b();
                return new bybk(eyikVar, bxxdVar, ahknVar3.bK(), (eosc) ahknVar3.p.b(), (eosc) ahknVar3.y.b(), (bybo) ahnhVar2.ajw.b(), (byau) ahnhVar2.ajv.b());
            case 604:
                ahkn ahknVar4 = this.a;
                eosc eoscVar = (eosc) ahknVar4.y.b();
                eosc eoscVar2 = (eosc) ahknVar4.p.b();
                ahnh ahnhVar3 = ahknVar4.a;
                return new bycf(eoscVar, eoscVar2, ahnhVar3.ajy, ahnhVar3.MN, eyie.a(ahnhVar3.MI), eyie.a(this.b.kC), ahnhVar3.oP, ahnhVar3.oT, (bxxd) ahnhVar3.MF.b(), ahknVar4.bK(), (bybo) ahnhVar3.ajw.b());
            case 605:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar4 = ahknVar5.a;
                return new bxrn(ahnhVar4.MK, ahnhVar4.ML, (eosc) ahknVar5.p.b(), (bxxd) ahnhVar4.MF.b(), this.b.F);
            case 606:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar5 = ahknVar6.a;
                return new bycn(eyie.a(ahnhVar5.MI), this.b.kC, ahnhVar5.oP, (eosc) ahknVar6.p.b());
            case 607:
                ahjr ahjrVar = this.b;
                ahnh ahnhVar6 = this.a.a;
                return new atww(ahjrVar.an(), (aika) ahnhVar6.uM.b(), (fdjx) ahnhVar6.m.b(), (awnf) ahjrVar.G.b(), (ains) ahnhVar6.pQ.b(), ahnhVar6.ajB);
            case 608:
                ahjr ahjrVar2 = this.b;
                Object objB = ahjrVar2.eZ.b();
                asnl asnlVar = (asnl) ahjrVar2.fa.b();
                ahkn ahknVar7 = this.a;
                eosc eoscVar3 = (eosc) ahknVar7.p.b();
                return atxj.a(objB, asnlVar, eoscVar3);
            case 609:
                ahkn ahknVar8 = this.a;
                Context context = (Context) ahknVar8.t.b();
                eosd eosdVar = (eosd) ahknVar8.y.b();
                eosc eoscVar4 = (eosc) ahknVar8.p.b();
                ahjr ahjrVar3 = this.b;
                cicm cicmVar = (cicm) ahjrVar3.br.b();
                ahnh ahnhVar7 = ahknVar8.a;
                dqsn dqsnVar = (dqsn) ahnhVar7.qq.b();
                eyik eyikVar2 = ahjrVar3.W;
                eyik eyikVar3 = ahjrVar3.ar;
                bxkp bxkpVar = (bxkp) ahjrVar3.fs.b();
                cogw cogwVar = (cogw) ahknVar8.cD.b();
                eyik eyikVar4 = ahknVar8.ie;
                chwq chwqVar = (chwq) ahnhVar7.uu.b();
                return new cijb(context, eosdVar, eoscVar4, cicmVar, dqsnVar, eyikVar2, eyikVar3, ahjrVar3.aB, bxkpVar, ahjrVar3.cU, ahjrVar3.dk, cogwVar, eyikVar4, chwqVar);
            case 610:
                ahkn ahknVar9 = this.a;
                return new cnlz((fdjx) ahknVar9.a.oQ.b(), this.b.fl(), (cogw) ahknVar9.cD.b());
            case 611:
                ahjr ahjrVar4 = this.b;
                ahnh ahnhVar8 = this.a.a;
                return new ccts(ahjrVar4.dg(), (ccpm) ahnhVar8.tI.b(), (fdjx) ahnhVar8.oS.b());
            case 612:
                ahnh ahnhVar9 = this.a.a;
                return new ccuv((ccpm) ahnhVar9.tI.b(), (fdjx) ahnhVar9.oS.b(), this.b.dh());
            case 613:
                ahkn ahknVar10 = this.a;
                eosc eoscVar5 = (eosc) ahknVar10.y.b();
                eosc eoscVar6 = (eosc) ahknVar10.aJ.b();
                eosc eoscVar7 = (eosc) ahknVar10.p.b();
                ahjr ahjrVar5 = this.b;
                eyik eyikVar5 = ahjrVar5.F;
                avnh avnhVar = (avnh) ahjrVar5.gY.b();
                ahnh ahnhVar10 = ahknVar10.a;
                return new cijr(eoscVar5, eoscVar6, eoscVar7, eyikVar5, avnhVar, (bbfn) ahnhVar10.CF.b(), (asre) ahjrVar5.bC.b(), (asqx) ahnhVar10.pT.b(), ahnhVar10.Pb, (asrc) ahjrVar5.aO.b(), (ardl) ahnhVar10.sB.b(), (awng) ahjrVar5.bz.b(), ahnhVar10.Tm, ahnhVar10.ajI, ahnhVar10.OZ);
            case 614:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar11 = ahknVar11.a;
                return new cdrl(ahnhVar11.ajK, ahnhVar11.wf, ahnhVar11.ajM, (eosc) ahknVar11.y.b(), this.b.Q(), (dzuc) ahknVar11.cE.b());
            case 615:
                ahkn ahknVar12 = this.a;
                eosc eoscVar8 = (eosc) ahknVar12.y.b();
                ahjr ahjrVar6 = this.b;
                eyik eyikVar6 = ahknVar12.cD;
                eyik eyikVar7 = ahjrVar6.F;
                cogw cogwVar2 = (cogw) eyikVar6.b();
                ahnh ahnhVar12 = ahknVar12.a;
                return new cikc(eoscVar8, eyikVar7, cogwVar2, (bbdl) ahnhVar12.qG.b(), (byeb) ahjrVar6.cU.b(), (dqsn) ahnhVar12.qq.b(), (bxlc) ahjrVar6.U.b(), (ains) ahnhVar12.pQ.b());
            case 616:
                ahjr ahjrVar7 = this.b;
                ahkn ahknVar13 = this.a;
                return new cgfm(ahjrVar7.ar, ahjrVar7.aM, (eosc) ahknVar13.y.b());
            case 617:
                ahjr ahjrVar8 = this.b;
                cicm cicmVar2 = (cicm) ahjrVar8.br.b();
                bxlc bxlcVar = (bxlc) ahjrVar8.U.b();
                ahnh ahnhVar13 = this.a.a;
                return new atob(cicmVar2, bxlcVar, ahnhVar13.cM(), ahnhVar13.ahq, (dqsn) ahnhVar13.qq.b(), ahnhVar13.Pb, (ardl) ahnhVar13.sB.b(), (awng) ahjrVar8.bz.b());
            case 618:
                ahkn ahknVar14 = this.a;
                ahjr ahjrVar9 = this.b;
                ahnh ahnhVar14 = ahknVar14.a;
                return new anzn(ahnhVar14.m, ahknVar14.cA, ahjrVar9.ao, ahnhVar14.Wm);
            case 619:
                return new ckyp(this.b.eX(), (fdjx) this.a.a.oQ.b());
            case 620:
                ahkn ahknVar15 = this.a;
                eosc eoscVar9 = (eosc) ahknVar15.p.b();
                eosc eoscVar10 = (eosc) ahknVar15.y.b();
                ahjr ahjrVar10 = this.b;
                return new cotd(eoscVar9, eoscVar10, ahjrVar10.fp(), (cotw) ahjrVar10.kk.b());
            case 621:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar15 = ahknVar16.a;
                return new cgya((fdjx) ahnhVar15.m.b(), (cgxw) this.b.de.b(), ahknVar16.cg(), ahnhVar15.iy(), ahnhVar15.iz());
            case 622:
                asrc asrcVar = (asrc) this.b.aO.b();
                ahnh ahnhVar16 = this.a.a;
                return new cjfx(asrcVar, ahnhVar16.akk, ahnhVar16.akl, (fdjx) ahnhVar16.oS.b(), ahnhVar16.js());
            case 623:
                ahkn ahknVar17 = this.a;
                Context context2 = (Context) ahknVar17.t.b();
                ahjr ahjrVar11 = this.b;
                eyik eyikVar8 = ahjrVar11.bZ;
                ahnh ahnhVar17 = ahknVar17.a;
                return new bvto(context2, ahnhVar17.wX, ahjrVar11.aO(), (bvkr) eyikVar8.b(), (ains) ahnhVar17.c.b(), (eosc) ahknVar17.y.b(), (eosc) ahknVar17.p.b(), ahknVar17.dh);
            case 624:
                ahkn ahknVar18 = this.a;
                ahjr ahjrVar12 = this.b;
                eyik eyikVar9 = ahknVar18.cD;
                ahnh ahnhVar18 = ahknVar18.a;
                return new cnxs(ahnhVar18.VW, ahjrVar12.kW, ahnhVar18.Cs, (cogw) eyikVar9.b(), (cnxm) ahjrVar12.kX.b(), (fdjx) ahnhVar18.oQ.b(), (Context) ahknVar18.t.b());
            case 625:
                ahkn ahknVar19 = this.a;
                ahjr ahjrVar13 = this.b;
                eyik eyikVar10 = ahknVar19.cD;
                ahnh ahnhVar19 = ahknVar19.a;
                return new cnxl(ahnhVar19.VS, ahnhVar19.Cp, ahjrVar13.bl, ahknVar19.cI, ahjrVar13.ks, ahjrVar13.kp, ahjrVar13.U, ahnhVar19.Cv, ahnhVar19.ajk, (cogw) eyikVar10.b(), (dzuc) ahknVar19.cE.b(), (cmqj) ahnhVar19.uv.b(), ahnhVar19.VQ, ahknVar19.da, ahnhVar19.VT);
            case 626:
                return new cnxm(this.a.a.rF);
            case 627:
                ahkn ahknVar20 = this.a;
                return new cihb((eosc) ahknVar20.p.b(), (eosc) ahknVar20.y.b(), this.b.ex());
            case 628:
                fdjx fdjxVar = (fdjx) this.a.a.oS.b();
                ahjr ahjrVar14 = this.b;
                return new cavw(fdjxVar, ahjrVar14.dI(), ahjrVar14.cW());
            case 629:
                ahkn ahknVar21 = this.a;
                return new citz((eosc) ahknVar21.p.b(), (eosc) ahknVar21.y.b(), (bxlc) this.b.U.b(), (ains) ahknVar21.a.c.b());
            case 630:
                ahnh ahnhVar20 = this.a.a;
                return new bvwd((fdjx) ahnhVar20.oQ.b(), ahnhVar20.pQ, this.b.F);
            case 631:
                ahkn ahknVar22 = this.a;
                eosc eoscVar11 = (eosc) ahknVar22.y.b();
                eosc eoscVar12 = (eosc) ahknVar22.p.b();
                ahjr ahjrVar15 = this.b;
                eyik eyikVar11 = ahjrVar15.bC;
                ahnh ahnhVar21 = ahknVar22.a;
                return new cite(eoscVar11, eoscVar12, ahjrVar15.F, ahnhVar21.Pb, (asre) eyikVar11.b(), ahnhVar21.Fc, ahnhVar21.qi, ahjrVar15.W, ahnhVar21.OZ, ahnhVar21.akw);
            case 632:
                ahnh ahnhVar22 = this.a.a;
                return new cgzn((fdjx) ahnhVar22.m.b(), (cgxw) this.b.de.b(), ahnhVar22.iy());
            case 633:
                fdjx fdjxVar2 = (fdjx) this.a.a.oS.b();
                ahjr ahjrVar16 = this.b;
                return new aldn(fdjxVar2, ahjrVar16.eg, ahjrVar16.ei);
            case 634:
                return new sxl((fdjx) this.a.a.oQ.b(), this.b.k());
            case 635:
                ahjr ahjrVar17 = this.b;
                return new csku(ahjrVar17.cR, (fdjx) this.a.a.oQ.b());
            case 636:
                ahkn ahknVar23 = this.a;
                cogw cogwVar3 = (cogw) ahknVar23.cD.b();
                cnxb cnxbVar = (cnxb) this.b.kW.b();
                ahnh ahnhVar23 = ahknVar23.a;
                return new cnsd(cogwVar3, cnxbVar, (aipo) ahnhVar23.EV.b(), (fdjx) ahnhVar23.oS.b());
            case 637:
                ahjr ahjrVar18 = this.b;
                cnas cnasVar = (cnas) ahjrVar18.fo.b();
                ahnh ahnhVar24 = this.a.a;
                return new cnie(cnasVar, ahjrVar18.D, (fdjx) ahnhVar24.oQ.b(), ahnhVar24.akG, (awxo) ahnhVar24.sP.b(), (awnf) ahjrVar18.G.b());
            case 638:
                ahjr ahjrVar19 = this.b;
                ahnh ahnhVar25 = this.a.a;
                return new cnbj((cnfv) ahjrVar19.gU(), ahnhVar25.Cs);
            case 639:
                return cnap.a(this.b.bt.b(), (eosc) this.a.p.b());
            case 640:
                ahjr ahjrVar20 = this.b;
                ahnh ahnhVar26 = this.a.a;
                return new cnbt((cnfv) ahjrVar20.gV(), ahnhVar26.Cs);
            case 641:
                ahjr ahjrVar21 = this.b;
                ahnh ahnhVar27 = this.a.a;
                return new cncs((cnfv) ahjrVar21.gZ(), ahnhVar27.Cs);
            case 642:
                ahjr ahjrVar22 = this.b;
                ahnh ahnhVar28 = this.a.a;
                return new cnek(ahjrVar22.hk(), ahnhVar28.akM, ahnhVar28.akN, (fdjx) ahnhVar28.m.b());
            case 643:
                return new ahjd(this);
            case 644:
                return new ahje(this);
            case 645:
                ahjr ahjrVar23 = this.b;
                ahnh ahnhVar29 = this.a.a;
                return new cnge((cnfv) ahjrVar23.gW(), ahnhVar29.Cs);
            case 646:
                ahjr ahjrVar24 = this.b;
                ahnh ahnhVar30 = this.a.a;
                return new cngj((cnfv) ahjrVar24.gX(), ahnhVar30.Cs);
            case 647:
                ahjr ahjrVar25 = this.b;
                ahnh ahnhVar31 = this.a.a;
                return new cnhr((cnfv) ahjrVar25.ha(), ahnhVar31.Cs);
            case 648:
                ahkn ahknVar24 = this.a;
                eosc eoscVar13 = (eosc) ahknVar24.p.b();
                eosc eoscVar14 = (eosc) ahknVar24.y.b();
                ahjr ahjrVar26 = this.b;
                ahnh ahnhVar32 = ahknVar24.a;
                cosz coszVarFp = ahjrVar26.fp();
                ayqd ayqdVar = (ayqd) ahnhVar32.Ct.b();
                eyik eyikVar12 = ahjrVar26.bf;
                return new cott(eoscVar13, eoscVar14, coszVarFp, ayqdVar, ahjrVar26.ar, ahjrVar26.V, ahjrVar26.aB, ahnhVar32.xO, (chvp) eyikVar12.b(), (dqsn) ahnhVar32.qq.b(), ahnhVar32.eQ(), (coor) ahnhVar32.Ju.b(), ahnhVar32.pK, ahnhVar32.WR, ahnhVar32.WS, ahnhVar32.yp);
            case 649:
                ahnh ahnhVar33 = this.a.a;
                return new bwvl((fdjx) ahnhVar33.oS.b(), this.b.dc, ahnhVar33.Jd);
            case 650:
                ahjr ahjrVar27 = this.b;
                ahkn ahknVar25 = this.a;
                return new bwmp(ahjrVar27.aI, ahknVar25.a.EJ, ahknVar25.y, ahjrVar27.bH);
            case 651:
                return new bvvr(this.b.fd);
            case 652:
                ahkn ahknVar26 = this.a;
                return new cawt((eosc) ahknVar26.p.b(), (egxv) this.b.am.b(), ahknVar26.a.c);
            case 653:
                ahjr ahjrVar28 = this.b;
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar34 = ahknVar27.a;
                return new bvtw(ahjrVar28.jL, ahnhVar34.Vr, (eosc) ahknVar27.p.b(), (eosc) ahknVar27.y.b(), (bael) ahknVar27.mU.b(), (bfsa) ahknVar27.mT.b(), (ceku) ahjrVar28.cg.b(), eyie.a(ahnhVar34.vY), (aqmq) ahnhVar34.QG.b());
            case 654:
                ahnh ahnhVar35 = this.a.a;
                return new ccuf((fdjx) ahnhVar35.m.b(), this.b.dg(), (ccpm) ahnhVar35.tI.b());
            case 655:
                ahnh ahnhVar36 = this.a.a;
                return new cofa((fdjx) ahnhVar36.oQ.b(), this.b.fm(), ahnhVar36.alf, ahnhVar36.alg);
            case 656:
                ahkn ahknVar28 = this.a;
                eosc eoscVar15 = (eosc) ahknVar28.p.b();
                eosc eoscVar16 = (eosc) ahknVar28.y.b();
                ahjr ahjrVar29 = this.b;
                ahnh ahnhVar37 = ahknVar28.a;
                eyik eyikVar13 = ahnhVar37.rk;
                attm attmVarAm = ahjrVar29.am();
                cbtr cbtrVarCX = ahjrVar29.cX();
                eyik eyikVar14 = ahjrVar29.lC;
                eyik eyikVar15 = ahjrVar29.lD;
                eyik eyikVar16 = ahjrVar29.lF;
                bbdl bbdlVar = (bbdl) ahnhVar37.qG.b();
                bxkp bxkpVar2 = (bxkp) ahjrVar29.fs.b();
                cogw cogwVar4 = (cogw) ahknVar28.cD.b();
                eyik eyikVar17 = ahnhVar37.TO;
                return new atwr(eoscVar15, eoscVar16, eyikVar13, attmVarAm, cbtrVarCX, eyikVar14, eyikVar15, eyikVar16, bbdlVar, bxkpVar2, ahjrVar29.cU, cogwVar4, ahjrVar29.W, ahjrVar29.hx, ahnhVar37.sh, ahjrVar29.lG, ahnhVar37.alo, (arob) eyikVar17.b());
            case 657:
                atoy atoyVar = new atoy();
                ahjr ahjrVar30 = this.b;
                ahkn ahknVar29 = this.a;
                return new atsj(atoyVar, ahjrVar30.hC(), (eosc) ahknVar29.p.b(), (eosc) ahknVar29.y.b());
            case 658:
                atpw atpwVar = new atpw();
                ahjr ahjrVar31 = this.b;
                ahkn ahknVar30 = this.a;
                return new atsj(atpwVar, ahjrVar31.hB(), (eosc) ahknVar30.p.b(), (eosc) ahknVar30.y.b());
            case 659:
                ahjr ahjrVar32 = this.b;
                ahkn ahknVar31 = this.a;
                Object objGu = ahjrVar32.gu();
                Object objGz = ahjrVar32.gz();
                Object objGN = ahjrVar32.gN();
                Object objGS = ahjrVar32.gS();
                atsm atsmVarAl = ahjrVar32.al();
                Object objGQ = ahjrVar32.gQ();
                eosc eoscVar17 = (eosc) ahknVar31.p.b();
                Object objGA = ahjrVar32.gA();
                return new atrs((atqv) objGu, (atqx) objGz, (attv) objGN, (atuh) objGS, atsmVarAl, (atue) objGQ, eoscVar17, (atrh) objGA, (atuj) ahknVar31.fA(), ahknVar31.a.SQ);
            case 660:
                ahjr ahjrVar33 = this.b;
                return ekhx.r(ahjrVar33.bh(), ahjrVar33.dl());
            case 661:
                ahkn ahknVar32 = this.a;
                ahjr ahjrVar34 = this.b;
                ahnh ahnhVar38 = ahknVar32.a;
                return new cifv(ahnhVar38.uz, ahnhVar38.sh, ahnhVar38.pT, (aofc) ahjrVar34.I.b(), ahjrVar34.F, (fdjx) ahnhVar38.oQ.b());
            case 662:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar39 = ahknVar33.a;
                return new avhj((fdjx) ahnhVar39.m.b(), (cmfo) ahnhVar39.ahb.b(), (avjf) this.b.iS.b(), (cogw) ahknVar33.cD.b(), ahknVar33.cE, ahnhVar39.pb, ahnhVar39.agH, ahnhVar39.Ao);
            case 663:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar40 = ahknVar34.a;
                return new darb((fdjx) ahnhVar40.m.b(), ahknVar34.pB, this.b.lM, ahnhVar40.aec, ahnhVar40.aeK, ahnhVar40.alt);
            case 664:
                ahjr ahjrVar35 = this.b;
                ahkn ahknVar35 = this.a;
                eyik eyikVar18 = ahknVar35.bM;
                ahnh ahnhVar41 = ahknVar35.a;
                return new daqz(ahjrVar35.lK, ahnhVar41.alt, (fcyh) eyikVar18.b(), (fdjx) ahnhVar41.m.b(), ahjrVar35.lL, ahnhVar41.aec);
            case 665:
                ahkn ahknVar36 = this.a;
                eyik eyikVar19 = ahknVar36.cz;
                ahnh ahnhVar42 = ahknVar36.a;
                eyik eyikVar20 = ahnhVar42.qi;
                fcyh fcyhVar = (fcyh) eyikVar19.b();
                fcyh fcyhVar2 = (fcyh) ahknVar36.bM.b();
                ahjr ahjrVar36 = this.b;
                return new daql(eyikVar20, ahknVar36.cD, fcyhVar, fcyhVar2, ahnhVar42.aec, ahjrVar36.lJ, ahknVar36.t, ahnhVar42.zN, (baqm) ahjrVar36.dY.b(), ahnhVar42.qa);
            case 666:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar43 = ahknVar37.a;
                baeb baebVar = (baeb) ahnhVar43.Vr.b();
                ahjr ahjrVar37 = this.b;
                eyik eyikVar21 = ahnhVar43.QG;
                return new cszw(baebVar, ahnhVar43.uP, ahnhVar43.lI(), ahnhVar43.lJ(), ahknVar37.ib, ahknVar37.mU, ahknVar37.np, ahnhVar43.qi, ahjrVar37.dY, (aqmq) eyikVar21.b());
            case 667:
                return new darc(this.a.a.rF);
            case 668:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar44 = ahknVar38.a;
                crmx crmxVar = (crmx) ahnhVar44.pB.b();
                Context context3 = (Context) ahknVar38.t.b();
                ahjr ahjrVar38 = this.b;
                return new ajqk(crmxVar, context3, (bxlc) ahjrVar38.U.b(), (eosc) ahknVar38.y.b(), (eosc) ahknVar38.p.b(), (eosc) ahknVar38.aJ.b(), (cmqj) ahnhVar44.uv.b(), ahjrVar38.eL, ahjrVar38.ar, (bxjh) ahjrVar38.bJ.b(), (auuh) ahnhVar44.Nz.b(), (ayqn) ahjrVar38.dd.b(), (cggc) ahjrVar38.hL.b(), (cggg) ahjrVar38.aM.b());
            case 669:
                ahkn ahknVar39 = this.a;
                fcyh fcyhVar3 = (fcyh) ahknVar39.cz.b();
                ahnh ahnhVar45 = ahknVar39.a;
                return new cjqg(fcyhVar3, (fdjx) ahnhVar45.m.b(), (egxv) this.b.am.b(), (ains) ahnhVar45.c.b());
            case 670:
                ahkn ahknVar40 = this.a;
                eosc eoscVar18 = (eosc) ahknVar40.y.b();
                ahjr ahjrVar39 = this.b;
                cdys cdysVar = (cdys) ahjrVar39.Y.b();
                ahnh ahnhVar46 = ahknVar40.a;
                return new agnh(eoscVar18, cdysVar, ahnhVar46.S(), ahnhVar46.c, ahnhVar46.alB, (agoo) ahnhVar46.aeO.b(), ahjrVar39.ar, (appk) ahnhVar46.HQ.b(), ahnhVar46.alC, ahnhVar46.aeQ);
            case 671:
                return new agqf((eosd) this.a.p.b(), this.b.v());
            case 672:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar47 = ahknVar41.a;
                eyik eyikVar22 = ahnhVar47.m;
                eyik eyikVar23 = ahnhVar47.qi;
                eyik eyikVar24 = ahnhVar47.zK;
                cdmo cdmoVar = (cdmo) ahknVar41.hR.b();
                ahjr ahjrVar40 = this.b;
                eyik eyikVar25 = ahknVar41.aQ;
                eyik eyikVar26 = ahnhVar47.qq;
                eyik eyikVar27 = ahknVar41.ly;
                eyik eyikVar28 = ahjrVar40.U;
                eyik eyikVar29 = ahnhVar47.IZ;
                eyik eyikVar30 = ahnhVar47.vW;
                egzh egzhVar = (egzh) eyikVar25.b();
                eyik eyikVar31 = ahknVar41.cE;
                return new cdoa(eyikVar22, ahknVar41.bM, ahknVar41.cA, eyikVar23, eyikVar24, cdmoVar, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, egzhVar, ahjrVar40.dN, (dzuc) eyikVar31.b(), eyie.a(ahjrVar40.lS), (aptm) ahnhVar47.vV.b(), ahnhVar47.Jo, (aptl) ahnhVar47.Jp.b(), (akbs) ahjrVar40.dV.b());
            case 673:
                return new ekph(this.b.dj());
            case 674:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar48 = ahknVar42.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar48.m.b();
                ahjr ahjrVar41 = this.b;
                return new agzc(fdjxVar3, (anty) ahjrVar41.ap.b(), (ajln) ahjrVar41.au.b(), (alrj) ahnhVar48.qi.b(), ahknVar42.cK);
            case 675:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar49 = ahknVar43.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar49.oQ.b();
                ahjr ahjrVar42 = this.b;
                return new agur(fdjxVar4, ahjrVar42.bu, ahjrVar42.gH, Optional.of((addt) ahjrVar42.lV.b()), ahnhVar49.qi, ahjrVar42.ap, ahjrVar42.au, ahjrVar42.I, ahjrVar42.gI, ahknVar43.cI);
            case 676:
                efwo efwoVar = (efwo) this.b.b.b();
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar50 = ahknVar44.a;
                return new addx(efwoVar, (egbf) ahnhVar50.pG.b(), (egej) ahnhVar50.pI.b(), (fdjx) ahnhVar50.oQ.b(), (fcyh) ahknVar44.cz.b());
            case 677:
                ahkn ahknVar45 = this.a;
                eosc eoscVar19 = (eosc) ahknVar45.p.b();
                eosc eoscVar20 = (eosc) ahknVar45.y.b();
                ahjr ahjrVar43 = this.b;
                cicm cicmVar3 = (cicm) ahjrVar43.br.b();
                ahnh ahnhVar51 = ahknVar45.a;
                return new ciry(eoscVar19, eoscVar20, cicmVar3, (dqsn) ahnhVar51.qq.b(), ahjrVar43.W, ahjrVar43.F, (cogw) ahknVar45.cD.b(), (bxkp) ahjrVar43.fs.b(), (byeb) ahjrVar43.cU.b(), (bbdl) ahnhVar51.qG.b(), ahjrVar43.ey(), (bxlc) ahjrVar43.U.b(), (ains) ahnhVar51.c.b(), ahknVar45.ie);
            case 678:
                return new cavg((asnl) this.b.fa.b());
            case 679:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar52 = ahknVar46.a;
                bveg bvegVar = (bveg) ahnhVar52.yx.b();
                ayfx ayfxVar = (ayfx) ahnhVar52.Mr.b();
                ahjr ahjrVar44 = this.b;
                eyik eyikVar32 = ahjrVar44.W;
                eyik eyikVar33 = ahjrVar44.X;
                eyik eyikVar34 = ahnhVar52.JE;
                dqsn dqsnVar2 = (dqsn) ahnhVar52.qq.b();
                eyik eyikVar35 = ahjrVar44.U;
                eyik eyikVar36 = ahnhVar52.uu;
                eyik eyikVar37 = ahknVar46.ez;
                return new cavo(bvegVar, ayfxVar, eyikVar32, eyikVar33, eyikVar34, dqsnVar2, ahknVar46.aQ, eyikVar35, eyikVar36, eyikVar37, (cogw) ahknVar46.cD.b());
            case 680:
                ahkn ahknVar47 = this.a;
                eosc eoscVar21 = (eosc) ahknVar47.y.b();
                eosc eoscVar22 = (eosc) ahknVar47.p.b();
                asre asreVar = (asre) this.b.bC.b();
                ahnh ahnhVar53 = ahknVar47.a;
                return new ciui(eoscVar21, eoscVar22, asreVar, ahnhVar53.pT, (ciux) ahnhVar53.Cu.b(), (ains) ahnhVar53.c.b());
            case 681:
                return new amxa((fdjx) this.a.a.oS.b(), this.b.mb);
            case 682:
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar54 = ahknVar48.a;
                fdjx fdjxVar5 = (fdjx) ahnhVar54.oS.b();
                ahjr ahjrVar45 = this.b;
                return new amwx(fdjxVar5, ahjrVar45.bf, ahjrVar45.V, (dqsn) ahnhVar54.qq.b(), ahnhVar54.xi, (Context) ahknVar48.t.b());
            case 683:
                fdjx fdjxVar6 = (fdjx) this.a.a.oS.b();
                ahjr ahjrVar46 = this.b;
                return new amxh(fdjxVar6, ahjrVar46.gt, ahjrVar46.md, ahjrVar46.mb);
            case 684:
                return new amxb();
            case 685:
                ahkn ahknVar49 = this.a;
                eosc eoscVar23 = (eosc) ahknVar49.y.b();
                ahjr ahjrVar47 = this.b;
                ahnh ahnhVar55 = ahknVar49.a;
                return new bbhd(eoscVar23, ahjrVar47.mf, ahjrVar47.ar, (bbgw) ahnhVar55.Hl.b(), (byeb) ahjrVar47.cU.b(), (bbdl) ahnhVar55.qG.b(), (cogw) ahknVar49.cD.b(), (bxlc) ahjrVar47.U.b(), (bbfn) ahnhVar55.CF.b(), (afhk) ahnhVar55.GB.b(), (dzuc) ahknVar49.cE.b(), ahnhVar55.cb(), ahjrVar47.mg, (Context) ahknVar49.t.b());
            case 686:
                return new bbfz((dqsn) this.a.a.qq.b(), this.b.U);
            case 687:
                ahkn ahknVar50 = this.a;
                eyik eyikVar38 = ahknVar50.cD;
                cdsk cdskVarIN = ahkn.iN();
                cogw cogwVar5 = (cogw) eyikVar38.b();
                ahjr ahjrVar48 = this.b;
                ahnh ahnhVar56 = ahknVar50.a;
                return new cdsn(cdskVarIN, cogwVar5, ahjrVar48.mf, ahnhVar56.Hl, ahjrVar48.ar, (fdjx) ahnhVar56.oS.b(), ahknVar50.bS(), ahknVar50.cE);
            case 688:
                ahjr ahjrVar49 = this.b;
                ayez ayezVar = (ayez) ahjrVar49.er.b();
                ayca aycaVar = (ayca) ahjrVar49.eq.b();
                ahkn ahknVar51 = this.a;
                return new crkp(ayezVar, aycaVar, ahknVar51.a.BI, (eosd) ahknVar51.y.b(), ahjrVar49.ar, ahjrVar49.dC, (cogw) ahknVar51.cD.b());
            case 689:
                ahnh ahnhVar57 = this.a.a;
                fdjx fdjxVar7 = (fdjx) ahnhVar57.oQ.b();
                clhc clhcVar = (clhc) ahnhVar57.st.b();
                ahjr ahjrVar50 = this.b;
                return new clmh(fdjxVar7, clhcVar, (bauh) ahjrVar50.X.b(), ahnhVar57.kb(), ahnhVar57.ka(), (bbdl) ahnhVar57.qG.b(), ahjrVar50.fe(), Optional.empty(), ahnhVar57.yw, ahnhVar57.alU, ahnhVar57.alV, ahjrVar50.fb(), (alrj) ahnhVar57.qi.b(), (clox) ahnhVar57.AT.b(), ahnhVar57.qq, ahjrVar50.fd(), ahjrVar50.aB, (apsl) ahnhVar57.Dk.b(), ahnhVar57.Dn);
            case 690:
                ahkn ahknVar52 = this.a;
                cogw cogwVar6 = (cogw) ahknVar52.cD.b();
                ahjr ahjrVar51 = this.b;
                ahnh ahnhVar58 = ahknVar52.a;
                return new cnop(cogwVar6, ahjrVar51.fl(), (cgbn) ahnhVar58.Cs.b(), (eosd) ahknVar52.p.b(), ahnhVar58.qN);
            case 691:
                return new atye(this.b.aD(), (cden) this.a.a.qN.b());
            case 692:
                return new bxqq((eosc) this.a.y.b(), (bxlc) this.b.U.b());
            case 693:
                ahnh ahnhVar59 = this.a.a;
                return new cqhr((fdjx) ahnhVar59.m.b(), this.b.fH(), (cqbm) ahnhVar59.sX.b(), ahnhVar59.amb);
            case 694:
                ahnh ahnhVar60 = this.a.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar60.m.b();
                byeq byeqVar = (byeq) ahnhVar60.sG.b();
                cmfo cmfoVar = (cmfo) ahnhVar60.ahb.b();
                ahjr ahjrVar52 = this.b;
                return new avhv(fdjxVar8, byeqVar, cmfoVar, (avdr) ahjrVar52.an.b(), ahjrVar52.av(), (avjf) ahjrVar52.iS.b(), ahnhVar60.vh, ahnhVar60.pb, ahnhVar60.Ao, ahnhVar60.agH);
            case 695:
                ahkn ahknVar53 = this.a;
                ahnh ahnhVar61 = ahknVar53.a;
                fdjx fdjxVar9 = (fdjx) ahnhVar61.m.b();
                fcyh fcyhVar4 = (fcyh) ahknVar53.cA.b();
                byeq byeqVar2 = (byeq) ahnhVar61.sG.b();
                cmfo cmfoVar2 = (cmfo) ahnhVar61.ahb.b();
                ahjr ahjrVar53 = this.b;
                return new avie(fdjxVar9, fcyhVar4, byeqVar2, cmfoVar2, ahjrVar53.mp, ahnhVar61.pb, ahknVar53.cE, ahjrVar53.iC, ahnhVar61.agH);
            case 696:
                return new avgu(this.a.a.rF);
            case 697:
                ahnh ahnhVar62 = this.a.a;
                return new cbpo((fdjx) ahnhVar62.oQ.b(), ekhx.q(), (cbor) ahnhVar62.aeC.b(), (cbph) ahnhVar62.aeD.b(), (cbaz) this.b.mr.b(), (byeq) ahnhVar62.sG.b(), (cazj) ahnhVar62.rF.b());
            case 698:
                ahkn ahknVar54 = this.a;
                Context context4 = (Context) ahknVar54.t.b();
                dens densVar = (dens) ahknVar54.pG.b();
                ahjr ahjrVar54 = this.b;
                ahnh ahnhVar63 = ahknVar54.a;
                return new dasy(context4, densVar, ahjrVar54.lJ, ahnhVar63.uP, ahknVar54.da, ahnhVar63.wF, ahnhVar63.pB, ahnhVar63.aeK, (eosc) ahknVar54.y.b(), (eosc) ahknVar54.p.b(), ahjrVar54.lM, ahnhVar63.amA, ahnhVar63.pb, ahknVar54.cE, ahnhVar63.qa);
            case 699:
                ahjr ahjrVar55 = this.b;
                ahkn ahknVar55 = this.a;
                ahnh ahnhVar64 = ahknVar55.a;
                return new bwoa(ahjrVar55.fo, ahjrVar55.fd, ahjrVar55.W, ahjrVar55.F, ahjrVar55.D, ahnhVar64.qi, ahknVar55.cD, (fdjx) ahnhVar64.oS.b(), (fdjx) ahnhVar64.oQ.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [bvsn, java.lang.Object] */
    private final Object i() {
        int i = this.c;
        switch (i) {
            case 700:
                return new cilh(this.b.ez());
            case 701:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                return new bzlp((fdjx) ahnhVar.oQ.b(), (fcyh) ahknVar.cz.b(), (aurx) ahnhVar.wc.b(), (axlf) ahnhVar.Lw.b(), this.b.bP(), Optional.empty(), (aukz) ahnhVar.Iz.b(), (ains) ahnhVar.c.b());
            case 702:
                ahnh ahnhVar2 = this.a.a;
                return new cfdl((fdjx) ahnhVar2.m.b(), Optional.of((bvll) ahnhVar2.rK.b()), ahnhVar2.lt());
            case 703:
                return new cfdt(this.a.p);
            case 704:
                ahkn ahknVar2 = this.a;
                ahjr ahjrVar = this.b;
                return new cfdq(ahknVar2.cD, ahknVar2.p, ahjrVar.ca, ahjrVar.mz, ahknVar2.a.FO);
            case 705:
                ahkn ahknVar3 = this.a;
                ahjr ahjrVar2 = this.b;
                eyik eyikVar = ahknVar3.b.gk;
                ceqo ceqoVarDt = ahjrVar2.dt();
                eyik eyikVar2 = ahjrVar2.B;
                String strA = cerr.a();
                cers.a();
                return ceqx.a(eyikVar, ceqoVarDt, eyikVar2, strA);
            case 706:
                ahjr ahjrVar3 = this.b;
                ahnh ahnhVar3 = this.a.a;
                return new ucm(ahjrVar3.hA(), ahnhVar3.wc, ahnhVar3.pb);
            case 707:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar4 = ahknVar4.a;
                fdjx fdjxVar = (fdjx) ahnhVar4.m.b();
                fcyh fcyhVar = (fcyh) ahknVar4.cz.b();
                ahjr ahjrVar4 = this.b;
                return new auti(fdjxVar, fcyhVar, (efwo) ahjrVar4.b.b(), (egej) ahnhVar4.pI.b(), (cpgn) ahnhVar4.afG.b(), (cpmc) ahjrVar4.m.b(), (cpmd) ahjrVar4.mG.b(), (aurx) ahnhVar4.wc.b(), (cpoc) ahknVar4.b.gB.b(), ahnhVar4.pb, ahknVar4.eD, (autx) ahnhVar4.MP.b());
            case 708:
                ahjr ahjrVar5 = this.b;
                ahjrVar5.hJ();
                cpmc cpmcVar = (cpmc) ahjrVar5.m.b();
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar5 = ahknVar5.a;
                return new twz(cpmcVar, (aurx) ahnhVar5.wc.b(), ahjrVar5.mE, ahjrVar5.mF, (autx) ahnhVar5.MP.b(), (aoot) ahnhVar5.HL.b(), (eosc) ahknVar5.y.b(), (eosc) ahknVar5.p.b());
            case 709:
                return new txj();
            case 710:
                return new txm();
            case 711:
                ahjr ahjrVar6 = this.b;
                Optional optional = (Optional) ahjrVar6.jM.b();
                bver bverVar = (bver) ahjrVar6.jT.b();
                eygg eyggVarA = eyie.a(ahjrVar6.mL);
                ahkn ahknVar6 = this.a;
                eygg eyggVarA2 = eyie.a(ahknVar6.hW);
                ahnh ahnhVar6 = ahknVar6.a;
                return new bvil(optional, bverVar, eyggVarA, eyggVarA2, (Optional) ahnhVar6.oU.b(), (eosc) ahknVar6.p.b(), (crqv) ahknVar6.aT.b(), (bvkr) ahjrVar6.bZ.b(), ahnhVar6.xk, ahjrVar6.gy(), (ayps) ahjrVar6.mJ.b(), (Optional) ahknVar6.hZ.b(), (cqbm) ahnhVar6.rY.b(), ahjrVar6.mM, ahnhVar6.yd, ahjrVar6.aB(), eyie.a(ahnhVar6.Vy), eyie.a(ahjrVar6.mO), (ayov) ahjrVar6.mK.b(), (aypz) ahjrVar6.jR.b(), ahnhVar6.UA, ahnhVar6.Cp, ahjrVar6.cj, ahjrVar6.mP, (Optional) ahnhVar6.FQ.b(), ahnhVar6.UX, ahnhVar6.UY, ahnhVar6.Vi, (Map) ahjrVar6.mQ.b());
            case 712:
                Context context = (Context) this.a.t.b();
                ahjr ahjrVar7 = this.b;
                return new bvgt(context, (bvgs) ahjrVar7.gK(), (aofc) ahjrVar7.I.b(), (anty) ahjrVar7.ap.b(), (egxv) ahjrVar7.am.b());
            case 713:
                ahjr ahjrVar8 = this.b;
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar7 = ahknVar7.a;
                return new axuk(ahjrVar8.bZ, ahnhVar7.c, ahknVar7.p, ahknVar7.y, ahknVar7.aJ, ahknVar7.ia, ahnhVar7.uQ, ahnhVar7.xk, ahjrVar8.jQ, ahjrVar8.cl, ahjrVar8.jE, ahnhVar7.wv, ahjrVar8.jJ, ahknVar7.dh, ahnhVar7.UG, ahknVar7.cE, ahnhVar7.UX, ahnhVar7.UY, ahnhVar7.Vi, ahnhVar7.Vj);
            case 714:
                ahjr ahjrVar9 = this.b;
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar8 = ahknVar8.a;
                return new axml(ahjrVar9.mK, ahjrVar9.bZ, eyil.a(ahnhVar8.xd), ahnhVar8.FP, ahnhVar8.EG, ahjrVar9.ci, ahknVar8.y, ahknVar8.p, ahknVar8.cD, ahnhVar8.c, ahjrVar9.cl, ahknVar8.dh);
            case 715:
                ahkn ahknVar9 = this.a;
                eosc eoscVar = (eosc) ahknVar9.y.b();
                cehg cehgVar = (cehg) ahknVar9.a.xk.b();
                Optional optional2 = (Optional) ahknVar9.hZ.b();
                ahjr ahjrVar10 = this.b;
                return new bvin(eoscVar, cehgVar, optional2, ahjrVar10.jQ, (crma) ahknVar9.da.b(), (cfeh) ahjrVar10.cl.b(), ahknVar9.dh);
            case 716:
                ahjr ahjrVar11 = this.b;
                return new bwvq(eyil.a(ahjrVar11.mN), ahjrVar11.ac);
            case 717:
                ahkn ahknVar10 = this.a;
                ahjr ahjrVar12 = this.b;
                ahnh ahnhVar9 = ahknVar10.a;
                return new axwu(ahnhVar9.FP, ahnhVar9.EG, ahjrVar12.ci, ahjrVar12.cl, ahjrVar12.bZ);
            case 718:
                ahjr ahjrVar13 = this.b;
                ahnh ahnhVar10 = this.a.a;
                eyik eyikVar3 = ahjrVar13.jQ;
                fdjx fdjxVar2 = (fdjx) ahnhVar10.oS.b();
                return new cfdh(ahjrVar13.cl, eyikVar3, ahjrVar13.bZ, fdjxVar2);
            case 719:
                return ekgp.m("CMS", (cfic) this.a.a.Lx.b(), "GDitto", this.b.dz());
            case 720:
                return new cfga(this.b.bZ, this.a.y);
            case 721:
                ahjr ahjrVar14 = this.b;
                efwo efwoVar = (efwo) ahjrVar14.b.b();
                ahkn ahknVar11 = this.a;
                return abdc.a(efwoVar, (Context) ahknVar11.t.b(), (ceql) ahjrVar14.u.b(), (ceff) ahjrVar14.cf.b(), Optional.of(ahjrVar14.dC()), Optional.of(ahjrVar14.dy()), Optional.of(ahknVar11.a.hV()), (Optional) ahknVar11.hZ.b(), ahjrVar14.od, (eosc) ahknVar11.p.b());
            case 722:
                ahjr ahjrVar15 = this.b;
                ekgi ekgiVarH = ekgp.h(11);
                ekgiVarH.i(ezji.TACHYGRAM_CONTROL_MESSAGE, ahjrVar15.mW);
                ekgiVarH.i(ezji.TACHYGRAM_MESSAGE, ahjrVar15.mZ);
                ekgiVarH.i(ezji.GROUP, ahjrVar15.na);
                ekgiVarH.i(ezji.DITTO, ahjrVar15.nt);
                ekgiVarH.i(ezji.WIREBALL, ahjrVar15.nt);
                ekgiVarH.i(ezji.BUGLE_AGENT, ahjrVar15.nt);
                ekgiVarH.i(ezji.REFLECTED_TACHYGRAM_MESSAGE, ahjrVar15.nw);
                ekgiVarH.i(ezji.SERVER_MLS_CONTROL_MESSAGE, ahjrVar15.nx);
                ekgiVarH.i(ezji.USERDATA, ahjrVar15.ny);
                ekgiVarH.i(ezji.CMS_RPC_MESSAGE, ahjrVar15.nG);
                ekgiVarH.i(ezji.CMS_NOTIFICATION, ahjrVar15.ob);
                return ekgiVarH.h();
            case 723:
                return this.b.fk();
            case 724:
                ahkn ahknVar12 = this.a;
                ahjr ahjrVar16 = this.b;
                ahnh ahnhVar11 = ahknVar12.a;
                eyik eyikVar4 = ahknVar12.y;
                eyik eyikVar5 = ahknVar12.p;
                return new cejk(eyikVar4, eyikVar5, eyikVar5, ahjrVar16.x, ahnhVar11.tf, ahknVar12.cD, ahnhVar11.Xq, ahjrVar16.mT, ahjrVar16.mU, ahnhVar11.tq, ahnhVar11.tp, ahnhVar11.pf, ahnhVar11.pB, ahnhVar11.sh, ahnhVar11.aaE, ahknVar12.aJ, ahknVar12.es, ahknVar12.oa, ahnhVar11.xR);
            case 725:
                ahjr ahjrVar17 = this.b;
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar12 = ahknVar13.a;
                return new cffn(ahjrVar17.ca, ahnhVar12.tq, ahknVar13.aJ, ahnhVar12.FT, ahnhVar12.tp, ahnhVar12.qi, ahnhVar12.c, ahnhVar12.tk, ahnhVar12.xI, ahnhVar12.se, ahnhVar12.aaA, ahnhVar12.qM, ahnhVar12.aaB);
            case 726:
                ahjr ahjrVar18 = this.b;
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar13 = ahknVar14.a;
                return new cfet(ahjrVar18.cb, ahnhVar13.tp, ahnhVar13.FT, ahnhVar13.qi, ahnhVar13.pT, ahnhVar13.tk, ahknVar14.es, ahnhVar13.qM, ahknVar14.p, ahnhVar13.aaB);
            case 727:
                ahjr ahjrVar19 = this.b;
                return cnkg.a(ahjrVar19.mX, ahjrVar19.mY, this.a.a.LM);
            case 728:
                ahjr ahjrVar20 = this.b;
                ahkn ahknVar15 = this.a;
                return new cnes(ahjrVar20.hk(), (cmxn) ahknVar15.a.xO.b(), ahjrVar20.fi(), (eosc) ahknVar15.p.b());
            case 729:
                ahjr ahjrVar21 = this.b;
                return new chef(ahjrVar21.de, (fdjx) this.a.a.m.b());
            case 730:
                cnes cnesVar = (cnes) this.b.mX.b();
                cnkd.a(cnesVar);
                return cnesVar;
            case 731:
                ahjr ahjrVar22 = this.b;
                bvkr bvkrVar = (bvkr) ahjrVar22.bZ.b();
                ahkn ahknVar16 = this.a;
                eosc eoscVar2 = (eosc) ahknVar16.y.b();
                ahnh ahnhVar14 = ahknVar16.a;
                return new cfox(bvkrVar, eoscVar2, ahjrVar22.dw(), ahnhVar14.FP, eyie.a(ahnhVar14.vY));
            case 732:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar15 = ahknVar17.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar15.oS.b();
                crnp crnpVar = (crnp) ahknVar17.cI.b();
                ahjr ahjrVar23 = this.b;
                return new cfki(fdjxVar3, crnpVar, (ajln) ahjrVar23.au.b(), (anty) ahjrVar23.ap.b(), (alrj) ahnhVar15.qi.b(), (cfkt) ahnhVar15.XF.b());
            case 733:
                ahjr ahjrVar24 = this.b;
                return new ayko(ahjrVar24.F, ahjrVar24.cU, ahjrVar24.U);
            case 734:
                return new bwwc(this.b.U);
            case 735:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar16 = ahknVar18.a;
                eyik eyikVar6 = ahnhVar16.uP;
                cehg cehgVar2 = (cehg) ahnhVar16.xk.b();
                ahjr ahjrVar25 = this.b;
                return new cfmb(eyikVar6, cehgVar2, (cexq) ahjrVar25.jE.b(), ahnhVar16.wv, (eosc) ahknVar18.y.b(), (eosc) ahknVar18.p.b(), ahnhVar16.UX, ahnhVar16.UY, ahnhVar16.Vi, ahjrVar25.jJ, ahnhVar16.XJ);
            case 736:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar17 = ahknVar19.a;
                cehg cehgVar3 = (cehg) ahnhVar17.xk.b();
                ahjr ahjrVar26 = this.b;
                return new cfmr(cehgVar3, (ayqp) ahjrVar26.jN.b(), ahjrVar26.jO, (baeb) ahnhVar17.Vr.b(), (ains) ahnhVar17.c.b(), (bael) ahknVar19.mU.b(), ahjrVar26.V, ahnhVar17.pI, (Optional) ahjrVar26.jM.b(), ahjrVar26.nf, (eosc) ahknVar19.p.b(), (eosc) ahknVar19.y.b(), ahjrVar26.jE, ahknVar19.cE, ahnhVar17.XN, (aqad) ahnhVar17.UI.b());
            case 737:
                ahjr ahjrVar27 = this.b;
                ahnh ahnhVar18 = this.a.a;
                return new ceeh(ahjrVar27.bh, ahjrVar27.f2if, (fdjx) ahnhVar18.oQ.b());
            case 738:
                ahkn ahknVar20 = this.a;
                Context context2 = (Context) ahknVar20.t.b();
                ahjr ahjrVar28 = this.b;
                aypg aypgVar = (aypg) ahjrVar28.fZ.b();
                ahnh ahnhVar19 = ahknVar20.a;
                return new cfnq(context2, aypgVar, ahnhVar19.wv, ahjrVar28.aA, (eosc) ahknVar20.y.b(), (eosc) ahknVar20.p.b(), (cehg) ahnhVar19.xk.b(), (ains) ahnhVar19.c.b(), (cogw) ahknVar20.cD.b(), (bagw) ahjrVar28.bE.b(), (bahv) ahnhVar19.un.b(), (bveg) ahnhVar19.yx.b(), (crmx) ahnhVar19.pB.b(), (aipo) ahnhVar19.us.b(), (alrj) ahnhVar19.qi.b(), (ceku) ahjrVar28.cg.b(), (bbdl) ahnhVar19.qG.b(), (Optional) ahjrVar28.jM.b(), ahnhVar19.XP, ahnhVar19.NI);
            case 739:
                ahjr ahjrVar29 = this.b;
                return new cfld(ahjrVar29.ni);
            case 740:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar20 = ahknVar21.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar20.m.b();
                fcyh fcyhVar2 = (fcyh) ahknVar21.cz.b();
                ahjr ahjrVar30 = this.b;
                return new cfkp(fdjxVar4, fcyhVar2, ahjrVar30.hp, ahnhVar20.XP, ahjrVar30.J);
            case 741:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar21 = ahknVar22.a;
                alrj alrjVar = (alrj) ahnhVar21.qi.b();
                ahjr ahjrVar31 = this.b;
                return new cfje(alrjVar, ahjrVar31.eB(), (eosc) ahknVar22.p.b(), ahjrVar31.J, ahnhVar21.XP, ahnhVar21.Pb, ahnhVar21.XU);
            case 742:
                ahkn ahknVar23 = this.a;
                eosc eoscVar3 = (eosc) ahknVar23.y.b();
                eosc eoscVar4 = (eosc) ahknVar23.p.b();
                ahjr ahjrVar32 = this.b;
                ahnh ahnhVar22 = ahknVar23.a;
                return new cfob(eoscVar3, eoscVar4, ahjrVar32.F, (alrj) ahnhVar22.qi.b(), (cmpy) ahjrVar32.fU.b(), (asrh) ahnhVar22.Fd.b(), ahnhVar22.pT, (cogw) ahknVar23.cD.b(), ahnhVar22.XP);
            case 743:
                ahkn ahknVar24 = this.a;
                eosc eoscVar5 = (eosc) ahknVar24.y.b();
                eosc eoscVar6 = (eosc) ahknVar24.p.b();
                ahjr ahjrVar33 = this.b;
                cexq cexqVar = (cexq) ahjrVar33.jE.b();
                ahnh ahnhVar23 = ahknVar24.a;
                return new cflc(eoscVar5, eoscVar6, cexqVar, ahnhVar23.xk, ahjrVar33.jJ, ahnhVar23.wv, ahjrVar33.nf);
            case 744:
                ahkn ahknVar25 = this.a;
                Context context3 = (Context) ahknVar25.t.b();
                ahnh ahnhVar24 = ahknVar25.a;
                fdjx fdjxVar5 = (fdjx) ahnhVar24.oQ.b();
                fdjx fdjxVar6 = (fdjx) ahnhVar24.m.b();
                ahjr ahjrVar34 = this.b;
                return new cfjs(context3, fdjxVar5, fdjxVar6, (bvkr) ahjrVar34.bZ.b(), (cfis) ahknVar25.nK.b(), Optional.of((bvqv) ahnhVar24.Yb.b()), ahknVar25.dh, (cecr) ahknVar25.nL.b(), ahnhVar24.FP, (Optional) ahjrVar34.jM.b(), (cecp) ahknVar25.nM.b(), ahnhVar24.Ye, ahnhVar24.Yf, ahnhVar24.UE, ahknVar25.nt, ahnhVar24.uM, ahnhVar24.rK, ahnhVar24.pQ, ahnhVar24.rJ, ahnhVar24.xk);
            case 745:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar25 = ahknVar26.a;
                return new cfoj((fdjx) ahnhVar25.m.b(), (fdjx) ahnhVar25.oQ.b(), ahknVar26.dh, this.b.bZ);
            case 746:
                ahnh ahnhVar26 = this.a.a;
                fdjx fdjxVar7 = (fdjx) ahnhVar26.oQ.b();
                ahjr ahjrVar35 = this.b;
                return new cfjr(fdjxVar7, (cexq) ahjrVar35.jE.b(), (ajoy) ahnhVar26.Yn.b(), (ajln) ahjrVar35.au.b(), (anty) ahjrVar35.ap.b(), ahnhVar26.uP, ahnhVar26.xk, (alrj) ahnhVar26.qi.b(), (cfol) ahnhVar26.XI.b(), (aqoz) ahnhVar26.UJ.b());
            case 747:
                ahnh ahnhVar27 = this.a.a;
                return new cflh((fdjx) ahnhVar27.m.b(), (fdjx) ahnhVar27.oQ.b(), (Optional) this.b.jM.b(), ahnhVar27.Yf);
            case 748:
                ahnh ahnhVar28 = this.a.a;
                return new cfof((fdjx) ahnhVar28.m.b(), (fdjx) ahnhVar28.oQ.b(), (Optional) this.b.jM.b(), ahnhVar28.Yf);
            case 749:
                eosc eoscVar7 = (eosc) this.a.y.b();
                ahjr ahjrVar36 = this.b;
                return new bwqr(eoscVar7, (bvus) ahjrVar36.aI.b(), (aypm) ahjrVar36.ga.b(), ahjrVar36.bM);
            case 750:
                return new cfpu(this.b.nv);
            case 751:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar29 = ahknVar27.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar29.oQ.b();
                ahjr ahjrVar37 = this.b;
                return new cfqm(fdjxVar8, ahnhVar29.UE, ahknVar27.nt, ahjrVar37.hg(), ahjrVar37.hp(), ahjrVar37.ho(), ahjrVar37.nu);
            case 752:
                ahjr ahjrVar38 = this.b;
                ahnh ahnhVar30 = this.a.a;
                return new cfra(ahjrVar38.I, ahjrVar38.ap, ahjrVar38.au, ahnhVar30.qi, ahnhVar30.YB, ahnhVar30.sP, ahnhVar30.FM, ahjrVar38.E, ahnhVar30.LT, (fdjx) ahnhVar30.oS.b());
            case 753:
                ahjr ahjrVar39 = this.b;
                ahjrVar39.cY();
                ahnh ahnhVar31 = this.a.a;
                return new ccpu((fdjx) ahnhVar31.m.b(), (awjh) ahjrVar39.E.b(), (awxo) ahnhVar31.sP.b(), (awnf) ahjrVar39.G.b(), (apwn) ahnhVar31.Bg.b());
            case 754:
                return new cfoz(this.b.hq());
            case 755:
                ahnh ahnhVar32 = this.a.a;
                fdjx fdjxVar9 = (fdjx) ahnhVar32.oQ.b();
                ahjr ahjrVar40 = this.b;
                return new tmu(fdjxVar9, (efwo) ahjrVar40.b.b(), ahnhVar32.pG, (aurx) ahnhVar32.wc.b(), (autx) ahnhVar32.MP.b(), ahjrVar40.dv(), ahjrVar40.ci, ahjrVar40.hl(), (aprp) ahnhVar32.FO.b());
            case 756:
                return Optional.of((ceql) this.b.nB.b());
            case 757:
                ahjr ahjrVar41 = this.b;
                ahng ahngVar = this.a.b;
                ceqm ceqmVarDs = ahjrVar41.ds();
                eyik eyikVar7 = ahngVar.gk;
                String strA2 = cerr.a();
                cers.a();
                return ceqw.a(ceqmVarDs, eyikVar7, ahjrVar41.nz, ahjrVar41.nA, strA2);
            case 758:
                ahjr ahjrVar42 = this.b;
                ahkn ahknVar28 = this.a;
                ahng ahngVar2 = ahknVar28.b;
                eyik eyikVar8 = ahjrVar42.i;
                ehtz ehtzVar = (ehtz) ahngVar2.gC.b();
                ehuj ehujVar = (ehuj) ahknVar28.eo.b();
                ahnh ahnhVar33 = ahknVar28.a;
                return cerl.a(eyikVar8, ehtzVar, ehujVar, (esmm) ahnhVar33.tZ.b(), ejwi.h(), ahnhVar33.mJ());
            case 759:
                ahjr ahjrVar43 = this.b;
                ahkn ahknVar29 = this.a;
                ahng ahngVar3 = ahknVar29.b;
                eyik eyikVar9 = ahjrVar43.i;
                ehtz ehtzVar2 = (ehtz) ahngVar3.gC.b();
                ehuj ehujVar2 = (ehuj) ahknVar29.eo.b();
                ahnh ahnhVar34 = ahknVar29.a;
                return cerk.a(eyikVar9, ehtzVar2, ehujVar2, (esmm) ahnhVar34.tZ.b(), ejwi.h(), ahnhVar34.mJ());
            case 760:
                ahjr ahjrVar44 = this.b;
                return ceei.a((ahjf) ahjrVar44.nE.b(), (cert) ahjrVar44.mD.b(), (ceta) this.a.b.gz.b());
            case 761:
                return new ahjf(this);
            case 762:
                return new ahjh(this);
            case 763:
                ahjr ahjrVar45 = this.b;
                Map mapHi = ahjrVar45.hi();
                cpup cpupVar = (cpup) ahjrVar45.oa.b();
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar35 = ahknVar30.a;
                return new tzj(mapHi, cpupVar, (aurx) ahnhVar35.wc.b(), (autx) ahnhVar35.MP.b(), (eosc) ahknVar30.y.b(), (eosc) ahknVar30.p.b());
            case 764:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar36 = ahknVar31.a;
                cptv cptvVar = (cptv) ahnhVar36.agt.b();
                ahjr ahjrVar46 = this.b;
                return new ubh(cptvVar, (cpmc) ahjrVar46.m.b(), (cdys) ahjrVar46.Y.b(), ahjrVar46.o(), ahknVar31.eD, (dqsn) ahnhVar36.qq.b(), ahjrVar46.dk, (eosc) ahknVar31.y.b(), (eosc) ahknVar31.p.b(), ahknVar31.b.gJ, (appk) ahnhVar36.HQ.b(), ahjrVar46.cN(), ahjrVar46.bw(), (aoot) ahnhVar36.HL.b());
            case 765:
                return new cppc((cpqp) this.a.a.ags.b());
            case 766:
                ahkn ahknVar32 = this.a;
                ahng ahngVar4 = ahknVar32.b;
                Queue queue = (Queue) ahngVar4.gE.b();
                Queue queue2 = (Queue) ahngVar4.gF.b();
                Queue queue3 = (Queue) ahngVar4.gG.b();
                ahnh ahnhVar37 = ahknVar32.a;
                ains ainsVar = (ains) ahnhVar37.pb.b();
                fdjx fdjxVar10 = (fdjx) ahnhVar37.oS.b();
                ahjr ahjrVar47 = this.b;
                return new bzap(queue, queue2, queue3, ainsVar, fdjxVar10, (efwo) ahjrVar47.b.b(), (bykf) ahnhVar37.MR.b(), ahjrVar47.bL(), (cpmc) ahjrVar47.m.b(), (cpqk) ahknVar32.eD.b());
            case 767:
                return new cpos((cpqp) this.a.a.ags.b());
            case 768:
                ahjr ahjrVar48 = this.b;
                avnh avnhVar = (avnh) ahjrVar48.gY.b();
                ahkn ahknVar33 = this.a;
                return new tzo(avnhVar, ahjrVar48.o(), ahjrVar48.p(), (eosc) ahknVar33.y.b(), (eosc) ahknVar33.p.b());
            case 769:
                return new ubi(this.b.q());
            case 770:
                ahjr ahjrVar49 = this.b;
                return new tys(ahjrVar49.nN, (cpmc) ahjrVar49.m.b(), (txe) ahjrVar49.k.b(), (eosc) this.a.p.b());
            case 771:
                ahjr ahjrVar50 = this.b;
                ahkn ahknVar34 = this.a;
                return new tzc(ahjrVar50.m, ahjrVar50.k, (fdjx) ahknVar34.a.oS.b(), (fcyh) ahknVar34.cA.b());
            case 772:
                ahjr ahjrVar51 = this.b;
                ahnh ahnhVar38 = this.a.a;
                return new tyu(ahjrVar51.nN, ahjrVar51.mH, ahjrVar51.nY, (dqsn) ahnhVar38.qq.b(), (fdjx) ahnhVar38.oS.b());
            case 773:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar39 = ahknVar35.a;
                dqsy dqsyVar = (dqsy) ahnhVar39.tt.b();
                ahjr ahjrVar52 = this.b;
                return new cprr(dqsyVar, ahjrVar52.bD(), (byjc) ahnhVar39.MQ.b(), ahjrVar52.cy(), ahjrVar52.cA(), ahjrVar52.cF(), ahjrVar52.cz(), ahjrVar52.cB(), ahnhVar39.gt(), ahjrVar52.bR(), ahjrVar52.bN(), ahjrVar52.cn(), ahjrVar52.cw(), ahjrVar52.bO(), ahjrVar52.bo(), (calx) ahnhVar39.aft.b(), ahjrVar52.cC(), (calv) ahnhVar39.afu.b(), (cpmh) ahknVar35.oZ.b(), (cpuv) ahknVar35.pa.b(), (apom) ahnhVar39.aev.b(), (axky) ahnhVar39.HN.b(), (aurx) ahnhVar39.wc.b(), (caea) ahjrVar52.jf.b(), ahknVar35.bN(), (dqsn) ahnhVar39.qq.b(), (bzox) ahjrVar52.gw.b(), ahnhVar39.dI(), ahnhVar39.aZ(), (fdjx) ahnhVar39.m.b(), (aukh) ahknVar35.eF.b(), (bzvq) ahjrVar52.nQ.b(), (bzvr) ahjrVar52.nR.b(), (bzvt) ahjrVar52.nS.b(), (bzvz) ahjrVar52.nT.b(), (bzvv) ahjrVar52.nU.b(), (bzvx) ahjrVar52.nV.b(), (ains) ahnhVar39.pb.b(), ahnhVar39.bA(), (caiy) ahnhVar39.afB.b(), (cacm) ahjrVar52.nW.b(), (cacg) ahjrVar52.nX.b(), ahjrVar52.cQ());
            case 774:
                ahkn ahknVar36 = this.a;
                ahjr ahjrVar53 = this.b;
                ahnh ahnhVar40 = ahknVar36.a;
                return ekhx.v(ahnhVar40.fK(), ahnhVar40.fJ(), ahnhVar40.fF(), ahjrVar53.bC(), ahnhVar40.fG(), new bykj(), new bzaf[0]);
            case 775:
                return new bzvq(this.a.a.rF);
            case 776:
                return new bzvr(this.a.a.rF);
            case 777:
                return new bzvt(this.a.a.rF);
            case 778:
                return new bzvz(this.a.a.rF);
            case 779:
                return new bzvv(this.a.a.rF);
            case 780:
                return new bzvx(this.a.a.rF);
            case 781:
                return new cacm(this.a.a.rF);
            case 782:
                return new cacg(this.a.a.rF);
            case 783:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar41 = ahknVar37.a;
                return new cpup((cgbn) ahnhVar41.Cs.b(), (cpmi) ahnhVar41.afH.b(), (aurx) ahnhVar41.wc.b(), (efwo) this.b.b.b(), (eosc) ahknVar37.p.b());
            case 784:
                return new ahji(this);
            case 785:
                ahjr ahjrVar54 = this.b;
                efwo efwoVar2 = (efwo) ahjrVar54.b.b();
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar42 = ahknVar38.a;
                eyik eyikVar10 = ahnhVar42.pG;
                eyik eyikVar11 = ahnhVar42.HN;
                eyik eyikVar12 = ahnhVar42.wc;
                eyik eyikVar13 = ahnhVar42.rK;
                cfdf cfdfVarDx = ahjrVar54.dx();
                ahjrVar54.hS();
                eyik eyikVar14 = ahnhVar42.FW;
                eyik eyikVar15 = ahjrVar54.x;
                eyik eyikVar16 = ahnhVar42.tf;
                eyik eyikVar17 = ahnhVar42.xd;
                fdjx fdjxVar11 = (fdjx) ahnhVar42.oQ.b();
                egej egejVar = (egej) ahnhVar42.pI.b();
                Context context4 = (Context) ahknVar38.t.b();
                eyik eyikVar18 = ahjrVar54.oe;
                eyik eyikVar19 = ahnhVar42.pQ;
                eyik eyikVar20 = ahnhVar42.DX;
                eyik eyikVar21 = ahnhVar42.vT;
                eyik eyikVar22 = ahnhVar42.rJ;
                return new bvmw(efwoVar2, eyikVar10, eyikVar11, eyikVar12, eyikVar13, ahjrVar54.bZ, cfdfVarDx, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, ahjrVar54.cf, fdjxVar11, egejVar, context4, eyikVar19, eyikVar20, eyikVar21, eyikVar22);
            case 786:
                ahjr ahjrVar55 = this.b;
                return ekgp.p(3, ahjrVar55.bv(), 1, ahjrVar55.bu(), 2, ahjrVar55.bt(), 5, ahjrVar55.gx(), 7, ahjrVar55.gw());
            case 787:
                ahkn ahknVar39 = this.a;
                return new bzgu(ahknVar39.a.qq, ahknVar39.cz, ahknVar39.b.gK);
            case 788:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar43 = ahknVar40.a;
                return new bzhf(ahnhVar43.pb, ahknVar40.eD, ahnhVar43.qN, ahnhVar43.afi, ahnhVar43.m, ahnhVar43.oQ, ahnhVar43.Iz);
            case 789:
                ahkn ahknVar41 = this.a;
                ahjr ahjrVar56 = this.b;
                ahnh ahnhVar44 = ahknVar41.a;
                return new bzsm(ahnhVar44.gk(), (efwo) ahjrVar56.b.b(), ahnhVar44.wc, (eosc) ahknVar41.y.b(), (eosc) ahknVar41.aJ.b(), (cogw) ahknVar41.cD.b(), ahjrVar56.nT, ahjrVar56.nU, ahjrVar56.nV, ahjrVar56.nS, ahjrVar56.oi, ahjrVar56.oj, ahjrVar56.ok, ahjrVar56.ol, ahjrVar56.nQ, ahjrVar56.nR, (aukz) ahnhVar44.Iz.b(), (byeq) ahnhVar44.sG.b(), ahnhVar44.afY, ahnhVar44.rF);
            case 790:
                return new bzvy(this.a.a.rF);
            case 791:
                return new bzvu(this.a.a.rF);
            case 792:
                return new bzvw(this.a.a.rF);
            case 793:
                return new bzvs(this.a.a.rF);
            case 794:
                return new bzqj((cpmc) this.b.m.b(), (eosc) this.a.y.b());
            case 795:
                ahjr ahjrVar57 = this.b;
                efwo efwoVar3 = (efwo) ahjrVar57.b.b();
                bzre bzreVar = (bzre) ahjrVar57.op.b();
                cpmc cpmcVar2 = (cpmc) ahjrVar57.m.b();
                eyik eyikVar23 = ahjrVar57.W;
                eyik eyikVar24 = ahjrVar57.V;
                byik byikVar = (byik) ahjrVar57.jc.b();
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar45 = ahknVar42.a;
                return new bztj(efwoVar3, bzreVar, cpmcVar2, eyikVar23, eyikVar24, byikVar, (aukz) ahnhVar45.Iz.b(), (bykf) ahnhVar45.MR.b(), (ains) ahnhVar45.pb.b(), (eosc) ahknVar42.y.b(), (eosc) ahknVar42.p.b(), (eosc) ahknVar42.aJ.b());
            case 796:
                ahjr ahjrVar58 = this.b;
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar46 = ahknVar43.a;
                return new bzro(ahjrVar58.cf(), (dqsn) ahnhVar46.qq.b(), ahjrVar58.F, ahjrVar58.V, ahjrVar58.U, (efwo) ahjrVar58.b.b(), ahnhVar46.gk(), ahjrVar58.cj(), ahnhVar46.pb, ahknVar43.b.S(), (eosc) ahknVar43.y.b(), (eosc) ahknVar43.p.b());
            case 797:
                cprj cprjVar = (cprj) this.b.nY.b();
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar47 = ahknVar44.a;
                return new caqv(cprjVar, (dqsn) ahnhVar47.qq.b(), (fcyh) ahknVar44.cz.b(), (fdjx) ahnhVar47.oQ.b());
            case 798:
                ahkn ahknVar45 = this.a;
                ahjr ahjrVar59 = this.b;
                ahnh ahnhVar48 = ahknVar45.a;
                cpsn cpsnVarLe = ahnhVar48.le();
                bzzd bzzdVarCl = ahjrVar59.cl();
                eosc eoscVar8 = (eosc) ahknVar45.y.b();
                eosc eoscVar9 = (eosc) ahknVar45.p.b();
                bywf bywfVarBA = ahjrVar59.bA();
                aurx aurxVar = (aurx) ahnhVar48.wc.b();
                eyik eyikVar25 = ahjrVar59.p;
                bxlc bxlcVar = (bxlc) ahjrVar59.U.b();
                dqsn dqsnVar = (dqsn) ahnhVar48.qq.b();
                cdys cdysVar = (cdys) ahjrVar59.Y.b();
                efwo efwoVar4 = (efwo) ahjrVar59.b.b();
                eyik eyikVar26 = ahknVar45.cD;
                eyik eyikVar27 = ahnhVar48.pb;
                cogw cogwVar = (cogw) eyikVar26.b();
                cajh cajhVarCx = ahjrVar59.cx();
                apom apomVar = (apom) ahnhVar48.aev.b();
                appk appkVar = (appk) ahnhVar48.HQ.b();
                bzqt bzqtVarCb = ahjrVar59.cb();
                apoi apoiVar = (apoi) ahnhVar48.afn.b();
                ahng ahngVar5 = ahknVar45.b;
                return new byvu(cpsnVarLe, bzzdVarCl, eoscVar8, eoscVar9, bywfVarBA, aurxVar, eyikVar25, bxlcVar, dqsnVar, cdysVar, efwoVar4, eyikVar27, cogwVar, cajhVarCx, apomVar, appkVar, bzqtVarCb, apoiVar, ahnhVar48.aW(), ahngVar5.T(), (appc) ahngVar5.gD.b(), (bzap) ahjrVar59.nI.b(), ahnhVar48.aX(), (aukz) ahnhVar48.Iz.b(), ahngVar5.ac());
            case 799:
                ahjr ahjrVar60 = this.b;
                byvu byvuVar = (byvu) ahjrVar60.os.b();
                byos byosVarBr = ahjrVar60.br();
                cpmc cpmcVar3 = (cpmc) ahjrVar60.m.b();
                ahkn ahknVar46 = this.a;
                return new bysy(byvuVar, byosVarBr, cpmcVar3, (eosc) ahknVar46.y.b(), (eosc) ahknVar46.p.b(), (aurx) ahknVar46.a.wc.b(), (appc) ahknVar46.b.gD.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.c;
        switch (i) {
            case 800:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahjr ahjrVar = this.b;
                return tmb.a(context, (ceql) ahjrVar.nB.b(), (ceff) ahjrVar.ch.b(), Optional.of(ahjrVar.dC()), Optional.of(ahjrVar.dy()), Optional.of(ahknVar.a.hV()), (eosc) ahknVar.p.b());
            case 801:
                ahjr ahjrVar2 = this.b;
                return ceej.a((ahjf) ahjrVar2.nE.b(), (cert) ahjrVar2.ce.b(), (ceta) this.a.a.FW.b());
            case 802:
                return new ekph(this.b.G());
            case 803:
                return Optional.of(this.b.aK());
            case 804:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                fcyh fcyhVar = (fcyh) ahknVar2.cA.b();
                ahjr ahjrVar3 = this.b;
                return new davx(context2, fcyhVar, ahknVar2.b.cY, (efwo) ahjrVar3.b.b(), (egej) ahknVar2.a.pI.b(), ahknVar2.cD, ahjrVar3.ox, ahknVar2.aN);
            case 805:
                ahng ahngVar = this.a.b;
                return new dawd(ahngVar.gS, ahngVar.gT);
            case 806:
                ahnh ahnhVar = this.a.a;
                return new davn(ahnhVar.m, ahnhVar.pb, ahnhVar.rc);
            case 807:
                Context context3 = (Context) this.a.t.b();
                this.b.ga();
                return new dbap(context3);
            case 808:
                return bvmj.a(this.b.oB);
            case 809:
                ahjr ahjrVar4 = this.b;
                efwo efwoVar = (efwo) ahjrVar4.b.b();
                ahnh ahnhVar2 = this.a.a;
                return new bvmh(efwoVar, (fdjx) ahnhVar2.oQ.b(), ahnhVar2.pG, ahjrVar4.of, ahnhVar2.pQ);
            case 810:
                return aguz.a(this.b.oE);
            case 811:
                ahkn ahknVar3 = this.a;
                fdjx fdjxVar = (fdjx) ahknVar3.a.oQ.b();
                ahjr ahjrVar5 = this.b;
                return new aguy(fdjxVar, (efwo) ahjrVar5.b.b(), (cgte) ahjrVar5.bu.b(), ahjrVar5.x(), (cogw) ahknVar3.cD.b(), ahjrVar5.B());
            case 812:
                return Optional.of((ejcz) this.a.b.gY.b());
            case 813:
                return cnir.a(this.b.oG);
            case 814:
                return new cniq((fdjx) this.a.a.oQ.b(), (cnik) this.b.bv.b());
            case 815:
                return chra.a(this.b.oI, this.a.b.gs);
            case 816:
                ahjr ahjrVar6 = this.b;
                efwo efwoVar2 = (efwo) ahjrVar6.b.b();
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar3 = ahknVar4.a;
                egbf egbfVar = (egbf) ahnhVar3.pG.b();
                fcyh fcyhVar2 = (fcyh) ahknVar4.cA.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar3.m.b();
                ahng ahngVar2 = ahknVar4.b;
                return new chqz(efwoVar2, egbfVar, fcyhVar2, fdjxVar2, ahjrVar6.eu(), ahngVar2.gP, ahngVar2.gQ, ahnhVar3.aah, ahnhVar3.tG);
            case 817:
                return ajbp.a(this.b.oM);
            case 818:
                ahnh ahnhVar4 = this.a.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar4.oQ.b();
                ahjr ahjrVar7 = this.b;
                return new ajbo(fdjxVar3, (efwo) ahjrVar7.b.b(), ahnhVar4.WJ, ahjrVar7.oL);
            case 819:
                ahjr ahjrVar8 = this.b;
                return ekhx.r(ahjrVar8.y(), ahjrVar8.J());
            case 820:
                return Optional.of(this.b.x());
            case 821:
                return chog.a(this.b.ad);
            case 822:
                return egmx.a(this.b.oP);
            case 823:
                return new egmw(ahjr.hI(), this.b.gf(), (eosc) this.a.y.b());
            case 824:
                return ekhx.o(this.b.hv());
            case 825:
                ahkn ahknVar5 = this.a;
                Context context4 = (Context) ahknVar5.t.b();
                cqtj cqtjVar = (cqtj) ahknVar5.b.gZ.b();
                cdga cdgaVar = (cdga) this.b.oT.b();
                ahnh ahnhVar5 = ahknVar5.a;
                return new acic(context4, cqtjVar, cdgaVar, (cpch) ahnhVar5.qj.b(), (egej) ahnhVar5.pI.b());
            case 826:
                ahjr ahjrVar9 = this.b;
                ahkn ahknVar6 = this.a;
                return new cdga(ahjrVar9.hn(), (eosc) ahknVar6.p.b(), ahknVar6.a.bQ());
            case 827:
                ahkn ahknVar7 = this.a;
                ahjr ahjrVar10 = this.b;
                ahnh ahnhVar6 = ahknVar7.a;
                return new cifg(ahnhVar6.rd, ahnhVar6.sh, ahnhVar6.rk, ahjrVar10.J, ahknVar7.da, ahnhVar6.pf);
            case 828:
                return daol.a(Optional.of(eyie.a(this.b.oV)));
            case 829:
                egxv egxvVar = (egxv) this.b.am.b();
                ahkn ahknVar8 = this.a;
                return new daow(egxvVar, (eosc) ahknVar8.y.b(), (bxfu) ahknVar8.eB.b(), ahknVar8.cH());
            case 830:
                return adih.a(adif.a(), this.b.gh(), (ecev) this.a.aL.b());
            case 831:
                return adig.a(adie.a(), this.b.gh(), (ecev) this.a.aL.b());
            case 832:
                return new einm((eigp) this.b.ac.b());
            case 833:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar7 = ahknVar9.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar7.oS.b();
                eyik eyikVar = ahnhVar7.rd;
                dhkw dhkwVar = (dhkw) ahknVar9.dJ.b();
                apwv apwvVar = (apwv) ahnhVar7.ri.b();
                ahgh ahghVar = (ahgh) this.b.pb.b();
                eyik eyikVar2 = ahnhVar7.PR;
                return new ckhm(fdjxVar4, eyikVar, ahnhVar7.PN, dhkwVar, apwvVar, ahghVar, ahnhVar7.yl, ahnhVar7.cq(), (arhh) eyikVar2.b());
            case 834:
                ahjr ahjrVar11 = this.b;
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar8 = ahknVar10.a;
                return new ahgh(ahjrVar11.pa, ahknVar10.cj(), (cqbm) ahnhVar8.rY.b(), (dhkw) ahknVar10.dJ.b(), ahknVar10.y);
            case 835:
                return new ahfv(this.a.a.rF);
            case 836:
                return new dair();
            case 837:
                return new cklo(this.b.ac);
            case 838:
                return ckyx.a(this.b.eY());
            case 839:
                return ckyw.a(this.b.eY());
            case 840:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar9 = ahknVar11.a;
                return new ckxs();
            case 841:
                ahnh ahnhVar10 = this.a.a;
                cpbn cpbnVar = (cpbn) ahnhVar10.qo.b();
                eyik eyikVar3 = this.b.F;
                return new axkf(cpbnVar, eyikVar3);
            case 842:
                ahkn ahknVar12 = this.a;
                ahjr ahjrVar12 = this.b;
                eyik eyikVar4 = ahknVar12.cD;
                ahng ahngVar3 = ahknVar12.b;
                ahnh ahnhVar11 = ahknVar12.a;
                eyik eyikVar5 = ahnhVar11.Cs;
                eyik eyikVar6 = ahngVar3.dK;
                eyik eyikVar7 = ahngVar3.l;
                eyik eyikVar8 = ahnhVar11.VZ;
                eyik eyikVar9 = ahnhVar11.Ch;
                cogw cogwVar = (cogw) eyikVar4.b();
                eyik eyikVar10 = ahnhVar11.Cp;
                eyik eyikVar11 = ahjrVar12.x;
                eygg eyggVarA = eyie.a(ahnhVar11.uv);
                eyik eyikVar12 = ahnhVar11.yw;
                eyik eyikVar13 = ahnhVar11.Bx;
                eyik eyikVar14 = ahngVar3.u;
                eyik eyikVar15 = ahnhVar11.Uk;
                eyik eyikVar16 = ahjrVar12.dx;
                eyik eyikVar17 = ahnhVar11.uu;
                Context context5 = (Context) ahknVar12.t.b();
                eyik eyikVar18 = ahknVar12.pP;
                eyik eyikVar19 = ahnhVar11.EG;
                eyik eyikVar20 = ahnhVar11.FQ;
                eyik eyikVar21 = ahnhVar11.wJ;
                eyik eyikVar22 = ahnhVar11.uy;
                eyik eyikVar23 = ahnhVar11.pf;
                eyik eyikVar24 = ahjrVar12.F;
                eyik eyikVar25 = ahjrVar12.ar;
                eyik eyikVar26 = ahnhVar11.Ns;
                eosc eoscVar = (eosc) eyikVar18.b();
                eygg eyggVarA2 = eyie.a(ahnhVar11.tJ);
                eyik eyikVar27 = ahknVar12.kD;
                eyik eyikVar28 = ahknVar12.kc;
                eyik eyikVar29 = ahknVar12.nu;
                eyik eyikVar30 = ahnhVar11.By;
                eyik eyikVar31 = ahnhVar11.tp;
                eyik eyikVar32 = ahnhVar11.tg;
                eyik eyikVar33 = ahnhVar11.LU;
                eyik eyikVar34 = ahngVar3.eT;
                eyik eyikVar35 = ahnhVar11.Ci;
                eyik eyikVar36 = ahnhVar11.wK;
                eyik eyikVar37 = ahnhVar11.BK;
                eyik eyikVar38 = ahnhVar11.tf;
                eyik eyikVar39 = ahknVar12.ld;
                eyik eyikVar40 = ahjrVar12.jR;
                eyik eyikVar41 = ahnhVar11.sk;
                eosd eosdVar = (eosd) ahknVar12.p.b();
                eosd eosdVar2 = (eosd) ahknVar12.y.b();
                eyik eyikVar42 = ahngVar3.fd;
                eyik eyikVar43 = ahknVar12.ee;
                eyik eyikVar44 = ahngVar3.hY;
                ckhg ckhgVar = (ckhg) ahnhVar11.PN.b();
                eyik eyikVar45 = ahnhVar11.yr;
                eyik eyikVar46 = ahngVar3.hZ;
                eyik eyikVar47 = ahngVar3.id;
                Object objCJ = ahngVar3.cJ();
                eyik eyikVar48 = ahjrVar12.ac;
                eyik eyikVar49 = ahngVar3.f6if;
                eyik eyikVar50 = ahnhVar11.sd;
                eyik eyikVar51 = ahngVar3.ig;
                eyik eyikVar52 = ahnhVar11.rk;
                eyik eyikVar53 = ahnhVar11.Cr;
                eyik eyikVar54 = ahnhVar11.qK;
                eyik eyikVar55 = ahngVar3.ik;
                eyik eyikVar56 = ahnhVar11.aaY;
                eyik eyikVar57 = ahngVar3.il;
                eyik eyikVar58 = ahngVar3.im;
                eyik eyikVar59 = ahnhVar11.adt;
                eyik eyikVar60 = ahngVar3.in;
                eyik eyikVar61 = ahnhVar11.qi;
                eyik eyikVar62 = ahjrVar12.am;
                eyik eyikVar63 = ahngVar3.f21io;
                eyik eyikVar64 = ahngVar3.x;
                eosc eoscVar2 = (eosc) ahknVar12.aJ.b();
                eyik eyikVar65 = ahjrVar12.pt;
                eyik eyikVar66 = ahjrVar12.ps;
                eyik eyikVar67 = ahjrVar12.cl;
                eyik eyikVar68 = ahjrVar12.pr;
                eyik eyikVar69 = ahknVar12.de;
                eyik eyikVar70 = ahjrVar12.pq;
                eyik eyikVar71 = ahjrVar12.pp;
                eyik eyikVar72 = ahjrVar12.pn;
                eyik eyikVar73 = ahjrVar12.cc;
                eyik eyikVar74 = ahknVar12.aT;
                eyik eyikVar75 = ahjrVar12.cd;
                eyik eyikVar76 = ahjrVar12.pl;
                eyik eyikVar77 = ahjrVar12.pk;
                eyik eyikVar78 = ahngVar3.ip;
                eyik eyikVar79 = ahjrVar12.px;
                eyik eyikVar80 = ahnhVar11.rd;
                eyik eyikVar81 = ahngVar3.iq;
                eyik eyikVar82 = ahjrVar12.pc;
                eyik eyikVar83 = ahknVar12.aQ;
                eyik eyikVar84 = ahngVar3.ir;
                eyik eyikVar85 = ahknVar12.cK;
                eyik eyikVar86 = ahjrVar12.jv;
                eyik eyikVar87 = ahngVar3.is;
                eyik eyikVar88 = ahngVar3.da;
                return new cxsa(eyikVar5, eyikVar77, eyikVar6, eyikVar7, eyikVar76, eyikVar8, eyikVar9, cogwVar, eyikVar10, eyikVar11, eyikVar75, eyggVarA, eyikVar74, eyikVar12, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, context5, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar73, eoscVar, eyggVarA2, eyikVar27, eyikVar28, eyikVar29, eyikVar72, eyikVar71, eyikVar30, eyikVar70, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar69, eyikVar36, eyikVar68, eyikVar37, eyikVar38, eyikVar67, eyikVar39, eyikVar40, eyikVar41, eosdVar, eyikVar66, eosdVar2, eyikVar42, eyikVar43, eyikVar44, ckhgVar, eyikVar45, eyikVar46, eyikVar65, eyikVar47, (cxah) objCJ, eyikVar48, eyikVar49, eyikVar50, eyikVar51, eyikVar52, eyikVar53, eyikVar54, eyikVar55, eyikVar56, eyikVar57, eyikVar58, eyikVar59, eyikVar60, eyikVar61, eyikVar62, eyikVar63, eyikVar64, eoscVar2, eyikVar78, eyikVar79, eyikVar80, eyikVar81, eyikVar82, eyikVar83, eyikVar84, eyikVar85, eyikVar86, eyikVar87, eyikVar88, ahjrVar12.py, ahnhVar11.sh, ahnhVar11.yf, ahngVar3.fa, ahjrVar12.pA, ahnhVar11.ajZ, ahngVar3.it, ahngVar3.iu, ahknVar12.oK, ahnhVar11.KC, ahjrVar12.pB, ahnhVar11.Qp, ahngVar3.gz, ahnhVar11.KR, ahnhVar11.KQ, ahnhVar11.aoA, ahnhVar11.aaW, ahngVar3.iv, ahngVar3.iw, ahjrVar12.ap, ahjrVar12.pC, ahngVar3.ix, eyim.a(), ahjrVar12.pD, Optional.of((bvll) ahnhVar11.rK.b()), ahnhVar11.Yf, ahnhVar11.PM, ahjrVar12.pG, ahjrVar12.pH, ahnhVar11.sB, ahjrVar12.I, ahngVar3.iy, ahnhVar11.xR);
            case 843:
                ahkn ahknVar13 = this.a;
                Context context6 = (Context) ahknVar13.t.b();
                ahnh ahnhVar12 = ahknVar13.a;
                return new cmxe(context6, (cgei) ahnhVar12.qF.b(), (cgbn) ahnhVar12.Cs.b(), (clgq) this.b.pj.b());
            case 844:
                ahkn ahknVar14 = this.a;
                return new ahsy((Context) ahknVar14.t.b(), this.b.pi, ahknVar14.oj);
            case 845:
                ahkn ahknVar15 = this.a;
                return new acnr((Context) ahknVar15.t.b(), (cpch) ahknVar15.a.qj.b(), eyie.a(this.b.oT), ahknVar15.db);
            case 846:
                ahjr ahjrVar13 = this.b;
                ahnh ahnhVar13 = this.a.a;
                return new axsf(ahjrVar13.F, ahjrVar13.ar, ahnhVar13.uu, ahnhVar13.c, ahnhVar13.qq, ahjrVar13.bF);
            case 847:
                return Optional.of(this.b.fW());
            case 848:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar14 = ahknVar16.a;
                eyik eyikVar89 = ahnhVar14.zF;
                fdjx fdjxVar5 = (fdjx) ahnhVar14.oS.b();
                ahjr ahjrVar14 = this.b;
                eyik eyikVar90 = ahknVar16.cA;
                ahng ahngVar4 = ahknVar16.b;
                return new chkj(eyikVar89, fdjxVar5, ahjrVar14.es(), ahnhVar14.tG, ahjrVar14.I, ahngVar4.H, (fcyh) eyikVar90.b(), ahngVar4.I);
            case 849:
                ahkn ahknVar17 = this.a;
                ahjr ahjrVar15 = this.b;
                eyik eyikVar91 = ahknVar17.t;
                ahnh ahnhVar15 = ahknVar17.a;
                return new cgcy(eyikVar91, ahnhVar15.qE, ahnhVar15.Ch, ahnhVar15.Jd, ahnhVar15.wv, ahnhVar15.c, ahknVar17.cD, ahjrVar15.dx, ahjrVar15.po, ahknVar17.cC, ahknVar17.mU, ahnhVar15.Qp, ahjrVar15.F, ahnhVar15.QG);
            case 850:
                ahkn ahknVar18 = this.a;
                Context context7 = (Context) ahknVar18.t.b();
                ahjr ahjrVar16 = this.b;
                return new cgcz(context7, (avmp) ahjrVar16.dx.b(), (clgq) ahjrVar16.pj.b(), (cpbz) ahknVar18.jW.b());
            case 851:
                ahkn ahknVar19 = this.a;
                Context context8 = (Context) ahknVar19.t.b();
                ahjr ahjrVar17 = this.b;
                return new cxsj(context8, ahjrVar17.W, ahjrVar17.ar, (cmvy) ahknVar19.a.pE.b(), (eosc) ahknVar19.y.b());
            case 852:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar16 = ahknVar20.a;
                return new cwzk((dakl) ahnhVar16.BK.b(), (bxjn) ahnhVar16.wK.b(), (eigp) this.b.ac.b(), (alrj) ahnhVar16.qi.b(), (eosc) ahknVar20.aJ.b());
            case 853:
                ahjr ahjrVar18 = this.b;
                ahkn ahknVar21 = this.a;
                return new cxul(ahjrVar18.dr, ahjrVar18.fa, (eosc) ahknVar21.p.b(), ahknVar21.a.aaW);
            case 854:
                return Optional.of(this.b.fT());
            case 855:
                return Optional.of(this.b.fX());
            case 856:
                ahkn ahknVar22 = this.a;
                cogw cogwVar2 = (cogw) ahknVar22.cD.b();
                cbcz cbczVar = (cbcz) this.b.pv.b();
                ahnh ahnhVar17 = ahknVar22.a;
                return new cbkq(cogwVar2, cbczVar, (cbhp) ahnhVar17.amS.b(), (egsh) ahknVar22.dG.b(), (cbbl) ahnhVar17.amT.b(), ahnhVar17.pQ, (fdjx) ahnhVar17.oQ.b(), (fdjx) ahnhVar17.oS.b());
            case 857:
                ahnh ahnhVar18 = this.a.a;
                cbdd cbddVar = (cbdd) ahnhVar18.amM.b();
                ahjr ahjrVar19 = this.b;
                return new cbci(cbddVar, ahjrVar19.pu, (cbbl) ahnhVar18.amT.b(), (fdjx) ahnhVar18.oQ.b());
            case 858:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar19 = ahknVar23.a;
                return new cbhl((byeq) ahnhVar19.sG.b(), (cogw) ahknVar23.cD.b(), (cbaz) this.b.mr.b(), ahnhVar19.amP, ahnhVar19.amR, (egsh) ahknVar23.dG.b(), (dqsn) ahnhVar19.qq.b(), (cbhp) ahnhVar19.amS.b(), (caxe) ahnhVar19.FF.b(), ahnhVar19.pQ, (fdjx) ahnhVar19.oQ.b(), (fdjx) ahnhVar19.oS.b());
            case 859:
                ahjr ahjrVar20 = this.b;
                return new cgrg((cgkj) ahjrVar20.dt.b(), ahjrVar20.dO());
            case 860:
                ahkn ahknVar24 = this.a;
                cyfw cyfwVar = (cyfw) ahknVar24.b.hY.b();
                dens densVar = (dens) ahknVar24.pG.b();
                ahnh ahnhVar20 = ahknVar24.a;
                cmfo cmfoVarKm = ahnhVar20.km();
                ctap ctapVar = (ctap) ahnhVar20.aeK.b();
                ctbx ctbxVar = (ctbx) ahknVar24.oE.b();
                ahjr ahjrVar21 = this.b;
                return new cykk(cyfwVar, densVar, cmfoVarKm, ctapVar, ctbxVar, ahjrVar21.pz, (eigp) ahjrVar21.ac.b(), (dain) ahnhVar20.aaW.b(), (fdjx) ahnhVar20.oS.b());
            case 861:
                return new data(this.a.a.rF);
            case 862:
                ahkn ahknVar25 = this.a;
                return new cinr((fdjx) ahknVar25.a.oQ.b(), (ajln) this.b.au.b(), (cion) ahknVar25.ph.b());
            case 863:
                ahkn ahknVar26 = this.a;
                Context context9 = (Context) ahknVar26.t.b();
                eosc eoscVar3 = (eosc) ahknVar26.p.b();
                ahnh ahnhVar21 = ahknVar26.a;
                return new clic(context9, eoscVar3, (fdjx) ahnhVar21.m.b(), (eigp) this.b.ac.b(), (clhc) ahnhVar21.st.b(), ahnhVar21.cz());
            case 864:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar22 = ahknVar27.a;
                fdjx fdjxVar6 = (fdjx) ahnhVar22.oQ.b();
                fcyh fcyhVar3 = (fcyh) ahknVar27.cA.b();
                cqba cqbaVar = (cqba) ahknVar27.aM.b();
                Context context10 = (Context) ahknVar27.t.b();
                ains ainsVar = (ains) ahnhVar22.pQ.b();
                crnp crnpVar = (crnp) ahknVar27.cI.b();
                ahjr ahjrVar22 = this.b;
                return new ciqt(fdjxVar6, fcyhVar3, cqbaVar, context10, ainsVar, crnpVar, ahjrVar22.ar, ahjrVar22.F, ahjrVar22.hH, ahjrVar22.W, (cmqj) ahnhVar22.uv.b(), (alrj) ahnhVar22.qi.b(), (avpc) ahjrVar22.bh.b(), (bbdl) ahnhVar22.qG.b(), (aofc) ahjrVar22.I.b(), (dqsn) ahnhVar22.qq.b(), ahnhVar22.anw, ahnhVar22.anx, (ecjh) ahknVar27.pL.b(), (cogw) ahknVar27.cD.b(), ahnhVar22.any, ahnhVar22.AE);
            case 865:
                fdjx fdjxVar7 = (fdjx) this.a.a.m.b();
                ahjr ahjrVar23 = this.b;
                return new avlp(fdjxVar7, ahjrVar23.pE, ahjrVar23.pF);
            case 866:
                ahkn ahknVar28 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar28.cA.b();
                ahjr ahjrVar24 = this.b;
                ahnh ahnhVar23 = ahknVar28.a;
                return new avmg(fcyhVar4, ahknVar28.cD, ahnhVar23.ahb, ahnhVar23.qi, ahjrVar24.an, ahnhVar23.adm, ahjrVar24.iA, ahjrVar24.iD, ahknVar28.cE, ahnhVar23.pQ);
            case 867:
                return new avlr(this.a.pg, this.b.an);
            case 868:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar24 = ahknVar29.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar24.m.b();
                fcyh fcyhVar5 = (fcyh) ahknVar29.cA.b();
                ahjr ahjrVar25 = this.b;
                return new awpo(fdjxVar8, fcyhVar5, ahjrVar25.fj(), (awnf) ahjrVar25.G.b(), (awjh) ahjrVar25.E.b(), (ardl) ahnhVar24.sB.b(), (lkb) ahnhVar24.sQ.b(), (cogw) ahknVar29.cD.b(), ahnhVar24.sR, ahnhVar24.sS, (ains) ahnhVar24.pQ.b(), (awzf) ahnhVar24.sI.b(), (awyu) ahnhVar24.qB.b(), (eizx) ahknVar29.ea.b());
            case 869:
                ahkn ahknVar30 = this.a;
                return new uqm(ahknVar30.a.pQ, this.b.dw, ahknVar30.dL, ahknVar30.b.iD);
            case 870:
                ahjr ahjrVar26 = this.b;
                ahkn ahknVar31 = this.a;
                ahng ahngVar5 = ahknVar31.b;
                eyik eyikVar92 = ahjrVar26.i;
                ehtz ehtzVar = (ehtz) ahngVar5.iN.b();
                ehuj ehujVar = (ehuj) ahknVar31.eo.b();
                ahnh ahnhVar25 = ahknVar31.a;
                return agrj.a(eyikVar92, ehtzVar, ehujVar, (esmm) ahnhVar25.tZ.b(), ejwi.h(), ahnhVar25.mJ());
            case 871:
                return new dnfb(this.a.lp, this.b.jY);
            case 872:
                ahkn ahknVar32 = this.a;
                ahjr ahjrVar27 = this.b;
                eyik eyikVar93 = ahknVar32.t;
                ahnh ahnhVar26 = ahknVar32.a;
                ahng ahngVar6 = ahknVar32.b;
                return new czqs(eyikVar93, ahknVar32.aT, ahngVar6.jn, ahknVar32.gF, ahnhVar26.c, ahngVar6.gZ, ahngVar6.hN, ahnhVar26.PN, ahngVar6.cZ, ahknVar32.cD, ahnhVar26.sd, ahjrVar27.ac, ahknVar32.aJ, ahnhVar26.rd, ahnhVar26.rq, ahjrVar27.pc, ahnhVar26.ri, ahngVar6.hO, ahngVar6.hP);
            case 873:
                avmp avmpVar = (avmp) this.b.dx.b();
                ahnh ahnhVar27 = this.a.a;
                return new cyta(avmpVar, ahnhVar27.pQ, ahnhVar27.Yc);
            case 874:
                return Optional.of(this.b.t());
            case 875:
                return ctgd.a(ctgr.a(), this.b.gh(), (ecev) this.a.aL.b());
            case 876:
                return new zum((ajln) this.b.au.b());
            case 877:
                return dluv.a(this.b.hr());
            case 878:
                ahkn ahknVar33 = this.a;
                ahng ahngVar7 = ahknVar33.b;
                return new dolm((domi) ahngVar7.kf.b(), (eony) ahknVar33.lp.b(), this.b.pR, ahngVar7.kd);
            case 879:
                return new dncg((dndk) this.a.b.kb.b(), this.b.gb());
            case 880:
                ahkn ahknVar34 = this.a;
                return new dbai((Context) ahknVar34.t.b(), (efwo) this.b.b.b(), (egif) ahknVar34.b.gb.b());
            case 881:
                ahkn ahknVar35 = this.a;
                return new cvhk((cqei) ahknVar35.b.kI.b(), (cssw) ahknVar35.kL.b(), (eigp) this.b.ac.b());
            case 882:
                return new eijm((eigp) this.b.ac.b());
            case 883:
                ahkn ahknVar36 = this.a;
                Context context11 = (Context) ahknVar36.t.b();
                ahnh ahnhVar28 = ahknVar36.a;
                fdjx fdjxVar9 = (fdjx) ahnhVar28.m.b();
                ahjr ahjrVar28 = this.b;
                eyik eyikVar94 = ahnhVar28.aah;
                eyik eyikVar95 = ahjrVar28.I;
                eyik eyikVar96 = ahjrVar28.ap;
                Optional optionalOf = Optional.of(ahjrVar28.gP);
                eyik eyikVar97 = ahjrVar28.pX;
                return new daud(context11, fdjxVar9, eyikVar94, eyikVar95, eyikVar96, optionalOf, ahjrVar28.oz, ahknVar36.b.I, ahjrVar28.jv, (Optional) eyikVar97.b(), ahnhVar28.tG);
            case 884:
                return Optional.of(this.b.E());
            case 885:
                ahjr ahjrVar29 = this.b;
                ahkn ahknVar37 = this.a;
                return new utp(ahjrVar29.eC(), (eosc) ahknVar37.p.b(), ahknVar37.a.Pb, ahjrVar29.J, ahknVar37.b.kZ);
            case 886:
                return new crkw(eyie.a(this.b.gT), (eosc) this.a.p.b());
            case 887:
                ahnh ahnhVar29 = this.a.a;
                fdjx fdjxVar10 = (fdjx) ahnhVar29.oQ.b();
                fdjx fdjxVar11 = (fdjx) ahnhVar29.m.b();
                ahjr ahjrVar30 = this.b;
                return new akml(fdjxVar10, fdjxVar11, ahjrVar30.S(), ahjrVar30.aq, ahjrVar30.hX, ahjrVar30.cU);
            case 888:
                ahkn ahknVar38 = this.a;
                fdjx fdjxVar12 = (fdjx) ahknVar38.a.m.b();
                ahjr ahjrVar31 = this.b;
                return new akee(fdjxVar12, ahjrVar31.P(), (ajvr) ahjrVar31.aq.b(), (akfe) ahknVar38.iw.b(), ahjrVar31.di());
            case 889:
                ahjr ahjrVar32 = this.b;
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar30 = ahknVar39.a;
                return choi.a(ahjrVar32.go(), ahknVar39.b.gk, (cepb) ahnhVar30.qQ.b(), (ehuv) ahjrVar32.l.b());
            case 890:
                ahjr ahjrVar33 = this.b;
                ahkn ahknVar40 = this.a;
                ahng ahngVar8 = ahknVar40.b;
                return new chtz(ahjrVar33.hb(), ahknVar40.a.rk, ahngVar8.mI, ahngVar8.mJ, ahngVar8.mK);
            case 891:
                ahjr ahjrVar34 = this.b;
                ahnh ahnhVar31 = this.a.a;
                return new cmfa(ahjrVar34.fa, ahnhVar31.pT, (cozg) ahnhVar31.rk.b(), (aspz) ahnhVar31.vR.b(), (fdjx) ahnhVar31.oQ.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        switch (this.c / 100) {
            case 0:
                return a();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            case 7:
                return i();
            default:
                return j();
        }
    }
}
