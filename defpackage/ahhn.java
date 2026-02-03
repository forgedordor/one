package defpackage;

import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.sun.jna.Function;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahhn implements eyik {
    public final ahkn a;
    public final ahho b;
    private final int c;

    public ahhn(ahkn ahknVar, ahho ahhoVar, int i) {
        this.a = ahknVar;
        this.b = ahhoVar;
        this.c = i;
    }

    private final Object a() {
        int i = this.c;
        switch (i) {
            case 0:
                return new eyha();
            case 1:
                ahkn ahknVar = this.a;
                return new ahsy((Context) ahknVar.t.b(), this.b.bt, ahknVar.oj);
            case 2:
                ahkn ahknVar2 = this.a;
                return new acnr((Context) ahknVar2.t.b(), (cpch) ahknVar2.a.qj.b(), eyie.a(this.b.bs), ahknVar2.db);
            case 3:
                ahho ahhoVar = this.b;
                ahkn ahknVar3 = this.a;
                return new cdga(ahhoVar.M(), (eosc) ahknVar3.p.b(), ahknVar3.a.bQ());
            case 4:
                ahho ahhoVar2 = this.b;
                ahkn ahknVar4 = this.a;
                ajxb ajxbVarG = ahhoVar2.g();
                ahknVar4.jb();
                eyik eyikVar = ahknVar4.cD;
                ahnh ahnhVar = ahknVar4.a;
                eyik eyikVar2 = ahnhVar.AS;
                eyik eyikVar3 = ahnhVar.GT;
                eyik eyikVar4 = ahnhVar.HJ;
                eyik eyikVar5 = ahnhVar.sh;
                cogw cogwVar = (cogw) eyikVar.b();
                eosc eoscVar = (eosc) ahknVar4.p.b();
                eosc eoscVar2 = (eosc) ahknVar4.y.b();
                eosc eoscVar3 = (eosc) ahknVar4.aJ.b();
                byeq byeqVar = (byeq) ahnhVar.sG.b();
                eyik eyikVar6 = ahhoVar2.an;
                eyik eyikVar7 = ahnhVar.AM;
                eyik eyikVar8 = ahnhVar.Jq;
                akfs akfsVar = (akfs) eyikVar6.b();
                eyik eyikVar9 = ahnhVar.QL;
                eyik eyikVar10 = ahnhVar.Pb;
                aqhc aqhcVar = (aqhc) eyikVar9.b();
                eyik eyikVar11 = ahnhVar.Th;
                eyik eyikVar12 = ahnhVar.OY;
                eyik eyikVar13 = ahnhVar.Ti;
                eyik eyikVar14 = ahnhVar.Tj;
                eyik eyikVar15 = ahnhVar.Tk;
                eyik eyikVar16 = ahnhVar.Sn;
                eyik eyikVar17 = ahnhVar.Pa;
                eyik eyikVar18 = ahnhVar.Tl;
                eyik eyikVar19 = ahnhVar.Tm;
                eyik eyikVar20 = ahnhVar.yz;
                eyik eyikVar21 = ahnhVar.Bg;
                eyik eyikVar22 = ahnhVar.Tn;
                eyik eyikVar23 = ahhoVar2.aw;
                eyik eyikVar24 = ahhoVar2.au;
                eyik eyikVar25 = ahnhVar.Tb;
                eyik eyikVar26 = ahnhVar.Tc;
                eyik eyikVar27 = ahnhVar.Td;
                eyik eyikVar28 = ahnhVar.Te;
                eyik eyikVar29 = ahhoVar2.av;
                eyik eyikVar30 = ahhoVar2.as;
                eyik eyikVar31 = ahnhVar.SY;
                eyik eyikVar32 = ahhoVar2.ar;
                eyik eyikVar33 = ahhoVar2.ap;
                eyik eyikVar34 = ahnhVar.SN;
                eyik eyikVar35 = ahhoVar2.aq;
                return new ajzc(ajxbVarG, ahhoVar2.aa, ahhoVar2.l, ahhoVar2.k, eyikVar2, ahhoVar2.ak, eyikVar3, ahhoVar2.ao, ahnhVar.SF, eyikVar4, eyikVar33, eyikVar34, eyikVar35, eyikVar5, cogwVar, eoscVar, eoscVar2, eoscVar3, byeqVar, eyikVar32, eyikVar7, eyikVar8, akfsVar, eyikVar30, eyikVar31, eyikVar10, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, aqhcVar, eyikVar11, eyikVar12, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23);
            case 5:
                ahkn ahknVar5 = this.a;
                Context context = (Context) ahknVar5.t.b();
                eosc eoscVar4 = (eosc) ahknVar5.p.b();
                eosc eoscVar5 = (eosc) ahknVar5.aJ.b();
                aokp aokpVarAu = ahknVar5.au();
                cqtp cqtpVar = (cqtp) ahknVar5.dK.b();
                ahnh ahnhVar2 = ahknVar5.a;
                alrj alrjVar = (alrj) ahnhVar2.qi.b();
                ahho ahhoVar3 = this.b;
                return new antf(context, eoscVar4, eoscVar5, aokpVarAu, cqtpVar, alrjVar, ahhoVar3.n(), (anuh) ahnhVar2.zO.b(), ahnhVar2.zT, ahnhVar2.zW, ahnhVar2.zX, ahnhVar2.zY, ahnhVar2.zZ, ahnhVar2.Aa, ahknVar5.cW, ahnhVar2.zP, ahnhVar2.qq, ahnhVar2.At, Optional.of(ahhoVar3.o()), Optional.of(ahnhVar2.Ac), ahknVar5.jn);
            case 6:
                ahkn ahknVar6 = this.a;
                eyik eyikVar36 = this.b.c;
                eyik eyikVar37 = ahknVar6.jh;
                ahnh ahnhVar3 = ahknVar6.a;
                return new anvq(eyikVar37, ahknVar6.cA, ahnhVar3.m, ahknVar6.ji, ahknVar6.cE, (aofc) eyikVar36.b(), (cdni) ahnhVar3.vX.b(), ahnhVar3.bu());
            case 7:
                ahnh ahnhVar4 = this.a.a;
                aocw aocwVar = (aocw) ahnhVar4.Zq.b();
                this.b.P();
                aofb.a(aocwVar);
                return aocwVar;
            case 8:
                return new ahhm(this);
            case 9:
                return new aofz(this.b.aJ);
            case 10:
                ahho ahhoVar4 = this.b;
                ahkn ahknVar7 = this.a;
                eyik eyikVar38 = ahknVar7.dK;
                eyik eyikVar39 = ahknVar7.y;
                ahnh ahnhVar5 = ahknVar7.a;
                return new aogk(ahhoVar4.d, eyikVar38, eyikVar39, ahnhVar5.sk, eyil.a(ahnhVar5.sl));
            case 11:
                ahkn ahknVar8 = this.a;
                ahho ahhoVar5 = this.b;
                eyik eyikVar40 = ahknVar8.bM;
                ahnh ahnhVar6 = ahknVar8.a;
                return new chtk(ahnhVar6.rW, ahhoVar5.c, ahhoVar5.k, ahnhVar6.Zt, ahnhVar6.pT, ahnhVar6.se, ahnhVar6.pB, (fcyh) eyikVar40.b(), (fcyh) ahknVar8.cA.b(), (fdjx) ahnhVar6.m.b());
            case 12:
                ahkn ahknVar9 = this.a;
                ahho ahhoVar6 = this.b;
                eyik eyikVar41 = ahhoVar6.e;
                ahnh ahnhVar7 = ahknVar9.a;
                eyik eyikVar42 = ahnhVar7.qG;
                Optional optionalOf = Optional.of(eyikVar41);
                eyik eyikVar43 = ahnhVar7.c;
                eyik eyikVar44 = ahnhVar7.pQ;
                eyik eyikVar45 = ahnhVar7.aaM;
                eyik eyikVar46 = ahnhVar7.qo;
                eyik eyikVar47 = ahnhVar7.so;
                dqsn dqsnVar = (dqsn) ahnhVar7.qq.b();
                eyik eyikVar48 = ahknVar9.cD;
                eyik eyikVar49 = ahnhVar7.zP;
                eyik eyikVar50 = ahknVar9.eL;
                cogw cogwVar2 = (cogw) eyikVar48.b();
                eyik eyikVar51 = ahnhVar7.QL;
                eyik eyikVar52 = ahnhVar7.vh;
                eyik eyikVar53 = ahnhVar7.qi;
                eyik eyikVar54 = ahnhVar7.pB;
                eyik eyikVar55 = ahnhVar7.AM;
                eyik eyikVar56 = ahnhVar7.XL;
                eyik eyikVar57 = ahnhVar7.pT;
                eyik eyikVar58 = ahnhVar7.aaN;
                eyik eyikVar59 = ahnhVar7.pV;
                eyik eyikVar60 = ahnhVar7.qa;
                eyik eyikVar61 = ahnhVar7.Gu;
                eyik eyikVar62 = ahnhVar7.pl;
                eyik eyikVar63 = ahnhVar7.Bg;
                aqhc aqhcVar2 = (aqhc) eyikVar51.b();
                eyik eyikVar64 = ahnhVar7.Th;
                eyik eyikVar65 = ahnhVar7.Tn;
                return new bapj(eyikVar42, optionalOf, eyikVar43, eyikVar44, eyikVar45, ahhoVar6.l, eyikVar46, eyikVar47, dqsnVar, eyikVar49, eyikVar50, cogwVar2, eyikVar52, eyikVar53, eyikVar54, eyikVar55, eyikVar56, eyikVar57, eyikVar58, ahhoVar6.aI, eyikVar59, eyikVar60, ahnhVar7.SQ, eyikVar61, eyikVar62, eyikVar64, eyikVar65, eyikVar63, aqhcVar2);
            case 13:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar8 = ahknVar10.a;
                eyik eyikVar66 = ahnhVar8.qJ;
                eyik eyikVar67 = ahnhVar8.uP;
                eyik eyikVar68 = ahnhVar8.xh;
                Context context2 = (Context) ahknVar10.t.b();
                eyik eyikVar69 = ahknVar10.cD;
                eyik eyikVar70 = ahnhVar8.uo;
                cogw cogwVar3 = (cogw) eyikVar69.b();
                eyik eyikVar71 = ahknVar10.aJ;
                return new damh(eyikVar66, eyikVar67, eyikVar68, context2, eyikVar70, cogwVar3, ahnhVar8.qj, ahnhVar8.aaJ, (eosc) eyikVar71.b(), (eosc) ahknVar10.y.b(), (eosd) ahknVar10.p.b(), Optional.empty(), this.b.aF, (crsx) ahnhVar8.aaK.b(), ahnhVar8.aaL, ahnhVar8.pl);
            case 14:
                return new ajso(this.b.g);
            case 15:
                ahho ahhoVar7 = this.b;
                ahkn ahknVar11 = this.a;
                Map mapL = ahhoVar7.L();
                ahnh ahnhVar9 = ahknVar11.a;
                return new ajtf(mapL, ahnhVar9.qa, ahnhVar9.pl);
            case 16:
                ahho ahhoVar8 = this.b;
                ahnh ahnhVar10 = this.a.a;
                return new amyo(ahhoVar8.P, ahnhVar10.zb, ahnhVar10.zc, ahnhVar10.zf);
            case 17:
                ahkn ahknVar12 = this.a;
                ahho ahhoVar9 = this.b;
                ahnh ahnhVar11 = ahknVar12.a;
                return new amoa(ahnhVar11.m, ahhoVar9.O, ahknVar12.cD, ahnhVar11.yL, ahnhVar11.yO, ahnhVar11.yP, ahnhVar11.yU, ahnhVar11.yV, ahnhVar11.yW, ahnhVar11.yX, ahnhVar11.yY, ahnhVar11.yZ);
            case 18:
                ahkn ahknVar13 = this.a;
                ahho ahhoVar10 = this.b;
                eyik eyikVar72 = ahknVar13.p;
                eyik eyikVar73 = ahknVar13.aJ;
                eyik eyikVar74 = ahknVar13.y;
                eyik eyikVar75 = ahknVar13.is;
                ahnh ahnhVar12 = ahknVar13.a;
                return new amzx(eyikVar72, eyikVar73, eyikVar74, eyikVar75, ahnhVar12.yx, ahnhVar12.yB, ahnhVar12.yE, ahnhVar12.yF, ahhoVar10.d, ahknVar13.ez, ahhoVar10.r, ahnhVar12.qa, ahknVar13.cD, ahnhVar12.tC, ahnhVar12.yG, ahnhVar12.tB, ahnhVar12.yH, ahnhVar12.yI, ahnhVar12.yJ);
            case 19:
                ahkn ahknVar14 = this.a;
                ahho ahhoVar11 = this.b;
                ahnh ahnhVar13 = ahknVar14.a;
                return new baxe(ahnhVar13.qo, ahnhVar13.yx, ahhoVar11.o, ahknVar14.ie, ahnhVar13.zP, ahhoVar11.k, ahnhVar13.qq, ahhoVar11.l, ahnhVar13.Xg, ahnhVar13.qi, ahnhVar13.un, ahnhVar13.HP, ahknVar14.kx, ahnhVar13.Xh, ahnhVar13.tA);
            case 20:
                ahkn ahknVar15 = this.a;
                ahho ahhoVar12 = this.b;
                eyik eyikVar76 = ahknVar15.t;
                ahnh ahnhVar14 = ahknVar15.a;
                return new bbae(eyikVar76, ahnhVar14.un, ahnhVar14.uG, ahhoVar12.l, ahnhVar14.qq);
            case 21:
                ahkn ahknVar16 = this.a;
                Context context3 = (Context) ahknVar16.t.b();
                dqsn dqsnVar2 = (dqsn) ahknVar16.a.qq.b();
                egzh egzhVar = (egzh) ahknVar16.aQ.b();
                ahho ahhoVar13 = this.b;
                return new bxlc(context3, dqsnVar2, egzhVar, Optional.of(ahhoVar13.e), ahhoVar13.N, ahknVar16.dh, (eosc) ahknVar16.aJ.b(), (eosc) ahknVar16.p.b());
            case 22:
                return new caxb(this.a.a.rF);
            case 23:
                return Optional.of((cbaz) this.b.I.b());
            case 24:
                return new cbba(this.b.M, this.a.pJ);
            case 25:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar15 = ahknVar17.a;
                ekgi ekgiVarH = ekgp.h(209);
                ekgiVarH.i("backup_self_participant", ahnhVar15.afL);
                ekgiVarH.i("block_on_telephony_sync", ahnhVar15.afM);
                ekgiVarH.i("cms_backfill_missing_field_work_handler", ahnhVar15.afN);
                ekgiVarH.i("cms_backup_validation_work_handler", ahnhVar15.afO);
                ekgiVarH.i("disable_multi_device_on_server_when_enable_bnr", ahnhVar15.afP);
                ekgiVarH.i("cms_local_media_restore", ahnhVar15.afQ);
                ekgiVarH.i("cms_local_media_restore_requiring_charging", ahnhVar15.afR);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi", ahnhVar15.afS);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_charging", ahnhVar15.afT);
                ekgiVarH.i("cms_local_media_restore_requiring_battery_not_low", ahnhVar15.afU);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_battery_not_low", ahnhVar15.afV);
                ekgiVarH.i("cms_media_download_queuer_work_handler", ahnhVar15.afW);
                ekgiVarH.i("cms_media_upload_queuer_work_handler", ahnhVar15.afZ);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low", ahnhVar15.aga);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", ahnhVar15.agb);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi", ahnhVar15.agc);
                ekgiVarH.i("cms_initial_sync_media_upload", ahnhVar15.agd);
                ekgiVarH.i("cms_initial_sync_media_upload_foreground", ahnhVar15.age);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", ahnhVar15.agf);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", ahnhVar15.agg);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_foreground", ahnhVar15.agh);
                ekgiVarH.i("cms_incremental_sync_media_upload", ahnhVar15.agi);
                ekgiVarH.i("cms_incremental_sync_media_upload_requiring_wifi", ahnhVar15.agj);
                ekgiVarH.i("cms_set_feature_enabled_on_server", ahnhVar15.agk);
                ekgiVarH.i("cms_set_initial_sync_status_on_server", ahnhVar15.agl);
                ekgiVarH.i("cms_restore_page", ahnhVar15.agm);
                ekgiVarH.i("cms_restore_page_background", ahnhVar15.agn);
                ekgiVarH.i("cms_restore_page_foreground", ahnhVar15.ago);
                ekgiVarH.i("conversation_deduping_work", ahnhVar15.agp);
                ekgiVarH.i("IdentityVerificationPendingMessageHandler", ahnhVar15.agq);
                ekgiVarH.i("finish_cms_restore_after_message_insertion", ahnhVar15.agr);
                ekgiVarH.i("insert_new_message_from_cms", ahnhVar15.agw);
                ekgiVarH.i("refresh_cms_server_storage_info", ahnhVar15.agx);
                ekgiVarH.i("remove_to_be_delivered_label", ahnhVar15.agy);
                ekgiVarH.i("StarAnalyticsWorkerHandler", ahnhVar15.agz);
                ekgiVarH.i("turn_on_bnr", ahnhVar15.agA);
                ekgiVarH.i("upload_previous_cms_session_ids", ahnhVar15.agB);
                ekgiVarH.i("__UNHANDLED_HANDLER", ahknVar17.pe);
                ekgiVarH.i("cms_restore_validation_work_handler", ahnhVar15.agC);
                ekgiVarH.i("batch_contacts_import", ahnhVar15.agI);
                ekgiVarH.i("batch_deleted_contacts_sync", ahnhVar15.agL);
                ekgiVarH.i("clear_session_ids", ahnhVar15.agM);
                ekgiVarH.i("contact_recipient_change_sync", ahnhVar15.agO);
                ekgiVarH.i("contact_recipient_deleted_sync", ahnhVar15.agP);
                ekgiVarH.i("conversation_latcher", ahnhVar15.agQ);
                ekgiVarH.i("delete_part_cms_attachment", ahnhVar15.agR);
                ekgiVarH.i("encrypted_message_delete", ahnhVar15.agS);
                ekgiVarH.i("end_heavy_work", ahnhVar15.agT);
                ekgiVarH.i("expire_wap_push_si_message", ahnhVar15.agW);
                ekgiVarH.i("fi_multi_sync_grpc", ahnhVar15.aha);
                ekgiVarH.i("force_contacts_sync", ahnhVar15.ahn);
                ekgiVarH.i("gaia_auth_check_result", ahnhVar15.aho);
                ekgiVarH.i("add_members_to_rcs_conversation", ahnhVar15.ahr);
                ekgiVarH.i("ari_work_handler", ahnhVar15.ahs);
                ekgiVarH.i("attachment_to_telephony_sync", ahnhVar15.aht);
                ekgiVarH.i("backup_upgraded_mms_group", ahnhVar15.ahv);
                ekgiVarH.i("bard_deletion_sender", ahnhVar15.ahw);
                ekgiVarH.i("block_on_initial_backup_preconditions", ahnhVar15.ahx);
                ekgiVarH.i("cancel_notification", ahnhVar15.ahB);
                ekgiVarH.i("cancel_rcs_file_transfer", ahnhVar15.ahC);
                ekgiVarH.i("cleanup_part_uri_handler", ahnhVar15.ahD);
                ekgiVarH.i("cms_back_fill_bnr_state_for_fi_md", ahnhVar15.ahE);
                ekgiVarH.i("cms_backup", ahnhVar15.ahF);
                ekgiVarH.i("cms_batch_backup", ahnhVar15.ahG);
                ekgiVarH.i("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", ahnhVar15.ahH);
                ekgiVarH.i("cms_check_missing_restore_work_on_app_upgrade", ahnhVar15.ahI);
                ekgiVarH.i("cms_key_sync", ahnhVar15.ahJ);
                ekgiVarH.i("cms_multi_device_opt_out", ahnhVar15.ahL);
                ekgiVarH.i("cms_restore_backup_key", ahnhVar15.ahM);
                ekgiVarH.i("cms_restore_conversations", ahnhVar15.ahN);
                ekgiVarH.i("cms_restore_encryption_key", ahnhVar15.ahO);
                ekgiVarH.i("cms_restore_messages", ahnhVar15.ahP);
                ekgiVarH.i("cms_restore_participants", ahnhVar15.ahQ);
                ekgiVarH.i("cms_sync_stale_status_on_app_upgrade", ahnhVar15.ahR);
                ekgiVarH.i("connect_to_tachyon_anonymously", ahnhVar15.ahS);
                ekgiVarH.i("contact_keys_loader_handler", ahnhVar15.ahT);
                ekgiVarH.i("conversation_metadata_full_sync", ahnhVar15.ahU);
                ekgiVarH.i("CONVERSATION_NOTIFICATION", ahnhVar15.ahY);
                ekgiVarH.i("conversation_thread_id_updater_worker", ahnhVar15.ahZ);
                ekgiVarH.i("create_notification", ahnhVar15.aic);
                ekgiVarH.i("create_or_update_lighter_conversation", ahnhVar15.aie);
                ekgiVarH.i("custom_themes_sender", ahnhVar15.aif);
                ekgiVarH.i("data_upgrade", ahnhVar15.ail);
                ekgiVarH.i("delete_conversation_handler", ahnhVar15.aip);
                ekgiVarH.i("delete_parts_work_item", ahnhVar15.aiq);
                ekgiVarH.i("delete_message_from_telephony", ahnhVar15.air);
                ekgiVarH.i("delete_message", ahnhVar15.ait);
                ekgiVarH.i("delete_thread_from_telephony", ahnhVar15.aiu);
                ekgiVarH.i("spam_recheck_handler", ahknVar17.pl);
                ekgiVarH.i("ditto_conversation_retry_handler", ahnhVar15.aiv);
                ekgiVarH.i("ditto_message_retry_handler", ahnhVar15.aiw);
                ekgiVarH.i("ditto_retry_handler", ahnhVar15.aix);
                ekgiVarH.i("downgrade_on_unencrypted_message", ahnhVar15.aiz);
                ekgiVarH.i("download_mms", ahnhVar15.aiQ);
                ekgiVarH.i("file_audio_levels", ahnhVar15.aiR);
                ekgiVarH.i("file_download_completed", ahnhVar15.aiX);
                ekgiVarH.i("file_download_failed", ahnhVar15.aja);
                ekgiVarH.i("file_download", ahnhVar15.ajd);
                ekgiVarH.i("file_transfer_processor", ahnhVar15.aje);
                ekgiVarH.i("messaging_file_upload", ahnhVar15.ajg);
                ekgiVarH.i("forward_sync_batch", ahnhVar15.ajm);
                ekgiVarH.i("ftd_data_clean_up_work", ahnhVar15.ajn);
                ekgiVarH.i("FtdHandlerWorkItem", ahnhVar15.ajp);
                ekgiVarH.i("rcs_engine_get_single_message", ahnhVar15.ajq);
                ekgiVarH.i("google_photos_api_callback", ahnhVar15.ajr);
                ekgiVarH.i("group_icon_cleanup_handler", ahnhVar15.ajs);
                ekgiVarH.i("group_session_start_failed", ahnhVar15.ajt);
                ekgiVarH.i("group_session_started", ahnhVar15.aju);
                ekgiVarH.i("icing_index_rebuild_handler", ahnhVar15.ajx);
                ekgiVarH.i("icing_index_rebuild_single_work_handler", ahnhVar15.ajz);
                ekgiVarH.i("icing_index_update_handler", ahnhVar15.ajA);
                ekgiVarH.i("chatapi_incoming_group_notification_list_message", ahnhVar15.ajC);
                ekgiVarH.i("incoming_rbm_message_handler", ahnhVar15.ajD);
                ekgiVarH.i("incoming_rcs_group_invitation", ahnhVar15.ajE);
                ekgiVarH.i("IncrementalReverseSyncWorkItemHandler", ahnhVar15.ajF);
                ekgiVarH.i("key_delivery_service_registration_work_handler", ahnhVar15.ajG);
                ekgiVarH.i("mls_key_refresh_work_handler", ahnhVar15.ajH);
                ekgiVarH.i("leave_rcs_group_conversation", ahnhVar15.ajJ);
                ekgiVarH.i("lighter_incremental_sync", ahnhVar15.ajR);
                ekgiVarH.i("log_message_sent_or_received", ahnhVar15.WE);
                ekgiVarH.i("magic_compose_send_clicked_log_handler", ahnhVar15.ajU);
                ekgiVarH.i("mark_all_rcs_groups_as_left", ahnhVar15.ajV);
                ekgiVarH.i("mark_as_notified", ahnhVar15.ajX);
                ekgiVarH.i("mark_failures_as_notified", ahnhVar15.ajY);
                ekgiVarH.i("MessagesRestoreWorkItemHandler", ahnhVar15.akc);
                ekgiVarH.i("on_add_user_to_group_chat_complete", ahnhVar15.akd);
                ekgiVarH.i("on_create_group_chat_complete", ahnhVar15.ake);
                ekgiVarH.i("on_remove_user_from_group_chat_complete", ahnhVar15.akf);
                ekgiVarH.i("on_trigger_chat_group_full_state_update_complete", ahknVar17.pw);
                ekgiVarH.i("participant_contact_sync", ahnhVar15.akg);
                ekgiVarH.i("persist_ios_reaction", ahnhVar15.akh);
                ekgiVarH.i("persist_thumbnail", ahnhVar15.aki);
                ekgiVarH.i("pipeline_work_handler", ahnhVar15.akj);
                ekgiVarH.i("post_incoming_message_to_chat_api", ahnhVar15.akm);
                ekgiVarH.i("ditto_process_user_alert", ahnhVar15.akn);
                ekgiVarH.i("forward_sync_engine", ahnhVar15.akp);
                ekgiVarH.i("rcs_group_identifiers_telephony_migration", ahnhVar15.akq);
                ekgiVarH.i("rcs_to_telephony_sync", ahnhVar15.akr);
                ekgiVarH.i("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", ahnhVar15.aks);
                ekgiVarH.i("refresh_incoming_message_notifications", ahnhVar15.akt);
                ekgiVarH.i("refresh_message_failure_notification", ahnhVar15.aku);
                ekgiVarH.i("remote_user_identity_key_change_handler", ahnhVar15.akv);
                ekgiVarH.i("remove_members_from_rcs_conversation", ahnhVar15.akx);
                ekgiVarH.i("resizing", ahnhVar15.aky);
                ekgiVarH.i("retry_manager", ahnhVar15.FR);
                ekgiVarH.i("run_analyze", ahnhVar15.akz);
                ekgiVarH.i("chatapi_send_chat_message_response", ahnhVar15.OR);
                ekgiVarH.i("smart_retries_pipeline_work_handler", ahnhVar15.akA);
                ekgiVarH.i("smarts_send_message_listener_handler", ahnhVar15.akB);
                ekgiVarH.i("soda_file_transcription", ahnhVar15.akD);
                ekgiVarH.i("spam_reclassification_handler", ahnhVar15.akE);
                ekgiVarH.i("spot_sync", ahnhVar15.akF);
                ekgiVarH.i("sync_rcs_groups", ahnhVar15.akH);
                ekgiVarH.i("tachygram_add_user_to_group", ahnhVar15.akJ);
                ekgiVarH.i("tachygram_create_group", ahnhVar15.akK);
                ekgiVarH.i("tachygram_get_group_info", ahnhVar15.akL);
                ekgiVarH.i("tachygram_inbox_message_retry", ahnhVar15.akO);
                ekgiVarH.i("tachygram_remove_user_from_group", ahnhVar15.akP);
                ekgiVarH.i("tachygram_revoke_message", ahnhVar15.akQ);
                ekgiVarH.i("tachygram_send_message", ahnhVar15.Qc);
                ekgiVarH.i("tachygram_update_group", ahnhVar15.akS);
                ekgiVarH.i("thumbnail_download_completed", ahnhVar15.akT);
                ekgiVarH.i("tombstone_manager_on_rcs_group_e2ee_status_change", ahnhVar15.akU);
                ekgiVarH.i("undelivered_message_fallback", ahnhVar15.akV);
                ekgiVarH.i("unregister_google_rcs_call", ahnhVar15.akW);
                ekgiVarH.i("UPDATE_ARCHIVE_STATUS", ahnhVar15.akX);
                ekgiVarH.i("update_conversation_encryption_status", ahnhVar15.akY);
                ekgiVarH.i("update_timestamp_in_telephony", ahnhVar15.akZ);
                ekgiVarH.i("update_unread_counter", ahknVar17.pA);
                ekgiVarH.i("upload_attachments_to_blobstore", ahnhVar15.ala);
                ekgiVarH.i("vendor_ims_call", ahnhVar15.alc);
                ekgiVarH.i("EmotifyReactionDatabaseUpdateHandler", ahnhVar15.ald);
                ekgiVarH.i("key_package_upload_work_handler", ahnhVar15.ale);
                ekgiVarH.i("TelephonyDatabaseUpdateWorkItemHandler", ahnhVar15.alh);
                ekgiVarH.i("chatapi_incoming_group_chat_notification_message", ahnhVar15.alp);
                ekgiVarH.i("incremental_contacts_import", ahnhVar15.alq);
                ekgiVarH.i("load_paged_conversation_timeout_fallback", ahnhVar15.alw);
                ekgiVarH.i("low_storage", ahnhVar15.aly);
                ekgiVarH.i("mark_messages_as_read_handler", ahnhVar15.alz);
                ekgiVarH.i("mark_rcs_messages_in_telephony", ahnhVar15.alA);
                ekgiVarH.i("otp_deletion_handler", ahnhVar15.alD);
                ekgiVarH.i("p13n_work", ahnhVar15.alE);
                ekgiVarH.i("parent_allowlist_update", ahnhVar15.alG);
                ekgiVarH.i("penpal_bot_recipient_restore", ahnhVar15.alH);
                ahho ahhoVar14 = this.b;
                ekgiVarH.i("penpal_conversation_auto_generate", ahhoVar14.j);
                ekgiVarH.i("process_rcs_group_notify", ahhoVar14.m);
                ekgiVarH.i("rbm_business_info_retrieval", ahnhVar15.alK);
                ekgiVarH.i("rbm_chatbot_directory_welcome_message", ahhoVar14.n);
                ekgiVarH.i("recover_disabled_rcs_group", ahnhVar15.alM);
                ekgiVarH.i("reflection_attachment_completed_handler_module", ahhoVar14.q);
                ekgiVarH.i("reflection_attachment_persistent_handler_module", ahhoVar14.x);
                ekgiVarH.i("request_link_preview", ahhoVar14.A);
                ekgiVarH.i("request_smart_suggestions", ahhoVar14.B);
                ekgiVarH.i("retrieve_questionnaire", ahhoVar14.C);
                ekgiVarH.i("ReverseTelephonySync", ahnhVar15.alX);
                ekgiVarH.i("chatapi_revoke_chat_message_response", ahhoVar14.D);
                ekgiVarH.i("rich_card_media_uri_cleanup", ahhoVar14.E);
                ekgiVarH.i("satellite_network_state_updater", ahnhVar15.amc);
                ekgiVarH.i("schedule_contacts_import", ahhoVar14.F);
                ekgiVarH.i("schedule_delete_and_import_contacts", ahhoVar14.H);
                ekgiVarH.i("sim_state_update", ahnhVar15.amw);
                ekgiVarH.i("start_heavy_work", ahhoVar14.J);
                ekgiVarH.i("sync_conversation_data_to_wearable", ahnhVar15.amz);
                ekgiVarH.i("sync_data_to_wearable_app", ahnhVar15.amB);
                ekgiVarH.i("sync_group_then_encryption_status", ahhoVar14.K);
                ekgiVarH.i("UPDATE_MARK_UNREAD", ahnhVar15.amD);
                ekgiVarH.i("update_rcs_group_name", ahnhVar15.amE);
                ekgiVarH.i("CopyFileTelephonyPartHandler", ahnhVar15.amF);
                ekgiVarH.i("cms_drop_unscheduled_item_to_dlq", ahhoVar14.L);
                return ekgiVarH.h();
            case 26:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar16 = ahknVar18.a;
                fdjx fdjxVar = (fdjx) ahnhVar16.oQ.b();
                eyik eyikVar77 = ahnhVar16.AC;
                Optional optionalOf2 = Optional.of(new addz());
                ahho ahhoVar15 = this.b;
                return new agur(fdjxVar, eyikVar77, ahnhVar16.Sa, optionalOf2, ahnhVar16.qi, ahhoVar15.f, ahhoVar15.g, ahhoVar15.c, ahhoVar15.i, ahknVar18.cI);
            case 27:
                return Optional.of(this.b.e());
            case 28:
                ahkn ahknVar19 = this.a;
                eosc eoscVar6 = (eosc) ahknVar19.p.b();
                eosc eoscVar7 = (eosc) ahknVar19.y.b();
                ahnh ahnhVar17 = ahknVar19.a;
                cicm cicmVar = (cicm) ahnhVar17.Gx.b();
                dqsn dqsnVar3 = (dqsn) ahnhVar17.qq.b();
                ahho ahhoVar16 = this.b;
                eyik eyikVar78 = ahknVar19.cD;
                return new ciry(eoscVar6, eoscVar7, cicmVar, dqsnVar3, ahnhVar17.zP, ahhoVar16.k, (cogw) eyikVar78.b(), (bxkp) ahnhVar17.TZ.b(), (byeb) ahnhVar17.HJ.b(), (bbdl) ahnhVar17.qG.b(), ahhoVar16.A(), (bxlc) ahhoVar16.l.b(), (ains) ahnhVar17.c.b(), ahknVar19.ie);
            case 29:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar18 = ahknVar20.a;
                bveg bvegVar = (bveg) ahnhVar18.yx.b();
                ayfx ayfxVar = (ayfx) ahnhVar18.Mr.b();
                eyik eyikVar79 = ahnhVar18.zP;
                eyik eyikVar80 = ahnhVar18.HP;
                eyik eyikVar81 = ahnhVar18.JE;
                dqsn dqsnVar4 = (dqsn) ahnhVar18.qq.b();
                ahho ahhoVar17 = this.b;
                eyik eyikVar82 = ahnhVar18.uu;
                eyik eyikVar83 = ahknVar20.ez;
                return new cavo(bvegVar, ayfxVar, eyikVar79, eyikVar80, eyikVar81, dqsnVar4, ahknVar20.aQ, ahhoVar17.l, eyikVar82, eyikVar83, (cogw) ahknVar20.cD.b());
            case 30:
                return new amxa((fdjx) this.a.a.oS.b(), this.b.p);
            case 31:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar19 = ahknVar21.a;
                return new amwx((fdjx) ahnhVar19.oS.b(), ahnhVar19.DC, this.b.o, (dqsn) ahnhVar19.qq.b(), ahnhVar19.xi, (Context) ahknVar21.t.b());
            case 32:
                fdjx fdjxVar2 = (fdjx) this.a.a.oS.b();
                ahho ahhoVar18 = this.b;
                return new amxh(fdjxVar2, ahhoVar18.u, ahhoVar18.w, ahhoVar18.p);
            case 33:
                ahho ahhoVar19 = this.b;
                ahnh ahnhVar20 = this.a.a;
                return new amya(ahhoVar19.s, ahnhVar20.Qq, ahhoVar19.t, ahnhVar20.EE);
            case 34:
                ahkn ahknVar22 = this.a;
                ahho ahhoVar20 = this.b;
                eyik eyikVar84 = ahknVar22.t;
                eyik eyikVar85 = ahknVar22.y;
                ahnh ahnhVar21 = ahknVar22.a;
                return new axsx(eyikVar84, eyikVar85, ahhoVar20.r, ahnhVar21.EE, ahnhVar21.Dw, ahnhVar21.Ov);
            case 35:
                ahkn ahknVar23 = this.a;
                ahho ahhoVar21 = this.b;
                ahnh ahnhVar22 = ahknVar23.a;
                return new ayfd(ahnhVar22.qi, ahhoVar21.r, ahhoVar21.d, ahnhVar22.qG, ahknVar23.cD, ahnhVar22.Qs, ahnhVar22.yw, ahnhVar22.uM, ahnhVar22.Dx, ahnhVar22.IE, ahnhVar22.wv, ahnhVar22.HO, ahnhVar22.wc, ahnhVar22.MP, ahknVar23.p, ahnhVar22.qa, ahnhVar22.NJ, ahnhVar22.Qp, ahnhVar22.NX, ahnhVar22.NW);
            case 36:
                return new amxb();
            case 37:
                ahkn ahknVar24 = this.a;
                eosc eoscVar8 = (eosc) ahknVar24.y.b();
                ahho ahhoVar22 = this.b;
                ahnh ahnhVar23 = ahknVar24.a;
                return new bbhd(eoscVar8, ahhoVar22.y, ahhoVar22.r, (bbgw) ahnhVar23.Hl.b(), (byeb) ahnhVar23.HJ.b(), (bbdl) ahnhVar23.qG.b(), (cogw) ahknVar24.cD.b(), (bxlc) ahhoVar22.l.b(), (bbfn) ahnhVar23.CF.b(), (afhk) ahnhVar23.GB.b(), (dzuc) ahknVar24.cE.b(), ahnhVar23.cb(), ahhoVar22.z, (Context) ahknVar24.t.b());
            case 38:
                return new bbfz((dqsn) this.a.a.qq.b(), this.b.l);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahkn ahknVar25 = this.a;
                eyik eyikVar86 = ahknVar25.cD;
                cdsk cdskVarIN = ahkn.iN();
                cogw cogwVar4 = (cogw) eyikVar86.b();
                ahho ahhoVar23 = this.b;
                ahnh ahnhVar24 = ahknVar25.a;
                return new cdsn(cdskVarIN, cogwVar4, ahhoVar23.y, ahnhVar24.Hl, ahhoVar23.r, (fdjx) ahnhVar24.oS.b(), ahknVar25.bS(), ahknVar25.cE);
            case 40:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar25 = ahknVar26.a;
                return new crkp((ayez) ahnhVar25.MU.b(), (ayca) ahnhVar25.MC.b(), ahnhVar25.BI, (eosd) ahknVar26.y.b(), this.b.r, ahnhVar25.BQ, (cogw) ahknVar26.cD.b());
            case 41:
                ahnh ahnhVar26 = this.a.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar26.oQ.b();
                clhc clhcVar = (clhc) ahnhVar26.st.b();
                bauh bauhVar = (bauh) ahnhVar26.HP.b();
                cllj clljVarKb = ahnhVar26.kb();
                clkq clkqVarKa = ahnhVar26.ka();
                bbdl bbdlVar = (bbdl) ahnhVar26.qG.b();
                ahho ahhoVar24 = this.b;
                return new clmh(fdjxVar3, clhcVar, bauhVar, clljVarKb, clkqVarKa, bbdlVar, ahnhVar26.ke(), Optional.empty(), ahnhVar26.yw, ahnhVar26.alU, ahnhVar26.alV, ahhoVar24.C(), (alrj) ahnhVar26.qi.b(), (clox) ahnhVar26.AT.b(), ahnhVar26.qq, ahhoVar24.E(), ahnhVar26.ww, (apsl) ahnhVar26.Dk.b(), ahnhVar26.Dn);
            case 42:
                return new atye(this.b.q(), (cden) this.a.a.qN.b());
            case 43:
                return new bxqq((eosc) this.a.y.b(), (bxlc) this.b.l.b());
            case 44:
                ahnh ahnhVar27 = this.a.a;
                return new avhv((fdjx) ahnhVar27.m.b(), (byeq) ahnhVar27.sG.b(), (cmfo) ahnhVar27.ahb.b(), (avdr) ahnhVar27.Aq.b(), this.b.p(), (avjf) ahnhVar27.ahh.b(), ahnhVar27.vh, ahnhVar27.pb, ahnhVar27.Ao, ahnhVar27.agH);
            case 45:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar28 = ahknVar27.a;
                return new avie((fdjx) ahnhVar28.m.b(), (fcyh) ahknVar27.cA.b(), (byeq) ahnhVar28.sG.b(), (cmfo) ahnhVar28.ahb.b(), this.b.G, ahnhVar28.pb, ahknVar27.cE, ahnhVar28.agJ, ahnhVar28.agH);
            case 46:
                return new avgu(this.a.a.rF);
            case 47:
                ahnh ahnhVar29 = this.a.a;
                return new cbpo((fdjx) ahnhVar29.oQ.b(), ekhx.q(), (cbor) ahnhVar29.aeC.b(), (cbph) ahnhVar29.aeD.b(), (cbaz) this.b.I.b(), (byeq) ahnhVar29.sG.b(), (cazj) ahnhVar29.rF.b());
            case 48:
                ahkn ahknVar28 = this.a;
                ahho ahhoVar25 = this.b;
                ahnh ahnhVar30 = ahknVar28.a;
                return new bwoa(ahnhVar30.TT, ahnhVar30.Fa, ahnhVar30.zP, ahhoVar25.k, ahnhVar30.xZ, ahnhVar30.qi, ahknVar28.cD, (fdjx) ahnhVar30.oS.b(), (fdjx) ahnhVar30.oQ.b());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar31 = ahknVar29.a;
                return new bzlp((fdjx) ahnhVar31.oQ.b(), (fcyh) ahknVar29.cz.b(), (aurx) ahnhVar31.wc.b(), (axlf) ahnhVar31.Lw.b(), this.b.t(), Optional.empty(), (aukz) ahnhVar31.Iz.b(), (ains) ahnhVar31.c.b());
            case 50:
                ahkn ahknVar30 = this.a;
                return new amra(ahknVar30.a.oS, this.b.h, ahknVar30.cD, ahknVar30.dK);
            case 51:
                return new amrl(this.b.X);
            case 52:
                ahho ahhoVar26 = this.b;
                return new alfl(ahhoVar26.U, ahhoVar26.W);
            case 53:
                return new alfh(this.b.T, this.a.a.Tr);
            case 54:
                ahkn ahknVar31 = this.a;
                ahho ahhoVar27 = this.b;
                ahnh ahnhVar32 = ahknVar31.a;
                return new alcn(ahnhVar32.m, ahknVar31.dK, ahknVar31.iA, ahnhVar32.BN, ahnhVar32.BO, ahhoVar27.S, ahnhVar32.BQ);
            case 55:
                ahkn ahknVar32 = this.a;
                return new crjd((fcyh) ahknVar32.cz.b(), (fcyh) ahknVar32.cA.b(), this.b.G(), (cogw) ahknVar32.cD.b());
            case 56:
                return new alfj(this.b.V, this.a.a.Tr);
            case 57:
                ahkn ahknVar33 = this.a;
                ahho ahhoVar28 = this.b;
                eyik eyikVar87 = ahknVar33.t;
                ahnh ahnhVar33 = ahknVar33.a;
                return new aldh(eyikVar87, ahnhVar33.m, ahknVar33.dK, ahknVar33.iA, ahnhVar33.BN, ahnhVar33.BO, ahhoVar28.S, ahnhVar33.BQ);
            case 58:
                ahho ahhoVar29 = this.b;
                ahkn ahknVar34 = this.a;
                return new cllw(ahhoVar29.D(), (fcyh) ahknVar34.cz.b(), (fdjx) ahknVar34.a.oQ.b());
            case 59:
                ahkn ahknVar35 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar35.cA.b();
                ahnh ahnhVar34 = ahknVar35.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar34.m.b();
                cogw cogwVar5 = (cogw) ahknVar35.cD.b();
                ahho ahhoVar30 = this.b;
                ajvr ajvrVar = (ajvr) ahhoVar30.h.b();
                asre asreVar = (asre) ahnhVar34.CD.b();
                avpc avpcVar = (avpc) ahnhVar34.AM.b();
                eyik eyikVar88 = ahknVar35.cE;
                return new akaf(fcyhVar, fdjxVar4, cogwVar5, ajvrVar, ahhoVar30.f, ahknVar35.cI, asreVar, avpcVar, ahnhVar34.Gx, (dzuc) eyikVar88.b(), ahnhVar34.sJ, ahnhVar34.qa, ahnhVar34.Gu, ahnhVar34.dA(), (ardj) ahnhVar34.Sn.b(), (cifw) ahnhVar34.Pb.b());
            case 60:
                ahkn ahknVar36 = this.a;
                ahho ahhoVar31 = this.b;
                ahnh ahnhVar35 = ahknVar36.a;
                eyik eyikVar89 = ahnhVar35.zP;
                eyik eyikVar90 = ahnhVar35.IH;
                eyik eyikVar91 = ahnhVar35.GT;
                eyik eyikVar92 = ahnhVar35.qi;
                dqsn dqsnVar5 = (dqsn) ahnhVar35.qq.b();
                eyik eyikVar93 = ahknVar36.cz;
                eyik eyikVar94 = ahnhVar35.GK;
                fcyh fcyhVar2 = (fcyh) eyikVar93.b();
                fdjx fdjxVar5 = (fdjx) ahnhVar35.oQ.b();
                fcyh fcyhVar3 = (fcyh) ahknVar36.cA.b();
                eyik eyikVar95 = ahhoVar31.aj;
                eyik eyikVar96 = ahhoVar31.ae;
                return new cpke(eyikVar89, ahhoVar31.k, eyikVar90, ahhoVar31.ai, eyikVar91, eyikVar92, ahhoVar31.f, ahnhVar35.Sw, dqsnVar5, eyikVar95, eyikVar96, eyikVar94, fcyhVar2, fdjxVar5, fcyhVar3);
            case 61:
                ahkn ahknVar37 = this.a;
                ahho ahhoVar32 = this.b;
                ahnh ahnhVar36 = ahknVar37.a;
                eyik eyikVar97 = ahnhVar36.Hy;
                cpgf cpgfVar = (cpgf) ahnhVar36.GT.b();
                eyik eyikVar98 = ahnhVar36.zP;
                eyik eyikVar99 = ahnhVar36.GH;
                dqsn dqsnVar6 = (dqsn) ahnhVar36.qq.b();
                eyik eyikVar100 = ahnhVar36.GZ;
                eyik eyikVar101 = ahknVar37.jo;
                eyik eyikVar102 = ahnhVar36.SB;
                return new cruf(eyikVar97, ahhoVar32.ac, ahhoVar32.ad, cpgfVar, eyikVar98, ahhoVar32.k, eyikVar99, ahnhVar36.Sw, ahhoVar32.ah, dqsnVar6, eyikVar100, eyikVar101, eyikVar102);
            case 62:
                ahkn ahknVar38 = this.a;
                Context context4 = (Context) ahknVar38.t.b();
                ahho ahhoVar33 = this.b;
                ahnh ahnhVar37 = ahknVar38.a;
                eyik eyikVar103 = ahnhVar37.GG;
                eyik eyikVar104 = ahnhVar37.zP;
                eyik eyikVar105 = ahnhVar37.AM;
                eyik eyikVar106 = ahnhVar37.yx;
                eyik eyikVar107 = ahnhVar37.qG;
                eyik eyikVar108 = ahnhVar37.qi;
                eyik eyikVar109 = ahnhVar37.wF;
                fdjx fdjxVar6 = (fdjx) ahnhVar37.oS.b();
                return new csby(context4, ahnhVar37.Ql, ahhoVar33.r, eyikVar103, eyikVar104, eyikVar105, ahnhVar37.Sp, eyikVar106, eyikVar107, eyikVar108, ahhoVar33.ab, eyikVar109, fdjxVar6);
            case Function.ALT_CONVENTION /* 63 */:
                ahkn ahknVar39 = this.a;
                Context context5 = (Context) ahknVar39.t.b();
                ahho ahhoVar34 = this.b;
                eyik eyikVar110 = ahknVar39.ez;
                ahnh ahnhVar38 = ahknVar39.a;
                return new csbk(context5, eyikVar110, ahnhVar38.Gk, ahknVar39.ii, ahknVar39.lk, ahnhVar38.Fd, ahhoVar34.d, ahnhVar38.sh);
            case 64:
                ahho ahhoVar35 = this.b;
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar39 = ahknVar40.a;
                return new cskk(ahhoVar35.r, ahnhVar39.Gk, ahnhVar39.OL, ahnhVar39.pT, ahhoVar35.d, (eosc) ahknVar40.y.b(), (eosc) ahknVar40.p.b());
            case 65:
                return Optional.of(this.b.H());
            case 66:
                ahkn ahknVar41 = this.a;
                ahho ahhoVar36 = this.b;
                eyik eyikVar111 = ahhoVar36.ae;
                ahnh ahnhVar40 = ahknVar41.a;
                eyik eyikVar112 = ahnhVar40.Hr;
                cpkp cpkpVar = (cpkp) eyikVar111.b();
                eyik eyikVar113 = ahnhVar40.GS;
                eyik eyikVar114 = ahnhVar40.GV;
                eyik eyikVar115 = ahnhVar40.pQ;
                fdjx fdjxVar7 = (fdjx) ahnhVar40.oQ.b();
                return new csiq(eyikVar112, ahnhVar40.Sx, cpkpVar, ahhoVar36.r, ahhoVar36.k, eyikVar113, eyikVar114, ahhoVar36.af, eyikVar115, fdjxVar7);
            case 67:
                ahkn ahknVar42 = this.a;
                ahho ahhoVar37 = this.b;
                ahnh ahnhVar41 = ahknVar42.a;
                return new cpkp(ahnhVar41.zP, ahhoVar37.k, ahhoVar37.r, ahhoVar37.c, ahnhVar41.qi, (fdjx) ahnhVar41.oQ.b());
            case 68:
                return new cshg(this.b.r);
            case 69:
                return new cpkk(this.b.k);
            case 70:
                ahkn ahknVar43 = this.a;
                ahho ahhoVar38 = this.b;
                eyik eyikVar116 = ahknVar43.dK;
                eyik eyikVar117 = ahknVar43.t;
                eyik eyikVar118 = ahknVar43.p;
                eyik eyikVar119 = ahknVar43.aJ;
                eyik eyikVar120 = ahknVar43.iA;
                ahnh ahnhVar42 = ahknVar43.a;
                return new ajvo(eyikVar116, eyikVar117, eyikVar118, eyikVar119, eyikVar120, ahhoVar38.c, ahhoVar38.an, ahnhVar42.qi, ahnhVar42.Bc, ahnhVar42.qa, ahnhVar42.yG, ahhoVar38.f, ahnhVar42.Bd, ahknVar43.cD, ahnhVar42.Bf, ahnhVar42.Be, ahnhVar42.Bg, ahnhVar42.vV, ahnhVar42.Bh, ahnhVar42.sM, ahnhVar42.Bi);
            case 71:
                ahho ahhoVar39 = this.b;
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar43 = ahknVar44.a;
                return new akfs(ahhoVar39.am, ahnhVar43.AJ, ahnhVar43.oS, ahnhVar43.oQ, ahknVar44.jq, ahknVar44.jr);
            case 72:
                ahkn ahknVar45 = this.a;
                ahho ahhoVar40 = this.b;
                ahnh ahnhVar44 = ahknVar45.a;
                return new akgj(ahnhVar44.m, ahnhVar44.oQ, ahknVar45.dK, ahknVar45.iA, ahhoVar40.al, ahnhVar44.pT, ahnhVar44.sP);
            case 73:
                return Optional.of(this.b.y());
            case 74:
                ahkn ahknVar46 = this.a;
                eosc eoscVar9 = (eosc) ahknVar46.aJ.b();
                eosc eoscVar10 = (eosc) ahknVar46.p.b();
                ahho ahhoVar41 = this.b;
                ahnh ahnhVar45 = ahknVar46.a;
                return new akil(eoscVar9, eoscVar10, ahhoVar41.k, ahhoVar41.l, ahnhVar45.Cg, ahnhVar45.SG);
            case 75:
                ahkn ahknVar47 = this.a;
                ahho ahhoVar42 = this.b;
                ahnh ahnhVar46 = ahknVar47.a;
                return ekhx.v(ahnhVar46.aw(), ahnhVar46.ly(), ahnhVar46.lw(), ahhoVar42.i(), ahnhVar46.jY(), ahnhVar46.ay(), ahnhVar46.D(), ahhoVar42.B(), ahhoVar42.h(), ahnhVar46.ha(), ahhoVar42.d(), ahkn.iP(), ahnhVar46.az());
            case 76:
                return Optional.of(this.b.j());
            case 77:
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar47 = ahknVar48.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar47.oS.b();
                fdjx fdjxVar9 = (fdjx) ahnhVar47.oQ.b();
                asre asreVar2 = (asre) ahnhVar47.CD.b();
                cioj ciojVar = (cioj) ahnhVar47.SR.b();
                ahho ahhoVar43 = this.b;
                eyik eyikVar121 = ahnhVar47.SW;
                return new akjm(fdjxVar8, fdjxVar9, ahnhVar47.SP, asreVar2, ciojVar, ahhoVar43.k(), (ciok) eyikVar121.b(), ahnhVar47.ao(), (cogw) ahknVar48.cD.b(), ahnhVar47.SS, ahnhVar47.pQ);
            case 78:
                ahkn ahknVar49 = this.a;
                ahnh ahnhVar48 = ahknVar49.a;
                return new ajwg((fdjx) ahnhVar48.m.b(), (fcyh) ahknVar49.cz.b(), ahknVar49.cD, ahnhVar48.CF, (cijw) this.b.at.b());
            case 79:
                return new cijw(this.a.a.rF);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                ahho ahhoVar44 = this.b;
                return ekhx.r(ahhoVar44.r(), ahhoVar44.v());
            case 81:
                ahkn ahknVar50 = this.a;
                ahnh ahnhVar49 = ahknVar50.a;
                fdjx fdjxVar10 = (fdjx) ahnhVar49.m.b();
                fcyh fcyhVar4 = (fcyh) ahknVar50.cA.b();
                awzf awzfVar = (awzf) ahnhVar49.sI.b();
                chbx chbxVarID = ahnhVar49.iD();
                ahnhVar49.sg();
                awnf awnfVar = (awnf) ahnhVar49.sJ.b();
                ahnhVar49.sa();
                return new akhf(fdjxVar10, fcyhVar4, awzfVar, chbxVarID, awnfVar, (ajvr) this.b.h.b(), (cogw) ahknVar50.cD.b());
            case 82:
                ahkn ahknVar51 = this.a;
                ahho ahhoVar45 = this.b;
                ahnh ahnhVar50 = ahknVar51.a;
                return new aknk(ahnhVar50.m, ahnhVar50.oS, ahknVar51.dK, ahknVar51.iA, ahhoVar45.ax, ahnhVar50.Na);
            case 83:
                ahkn ahknVar52 = this.a;
                egyt egytVar = (egyt) ahknVar52.dj.b();
                ahnh ahnhVar51 = ahknVar52.a;
                dqsn dqsnVar7 = (dqsn) ahnhVar51.qq.b();
                ahho ahhoVar46 = this.b;
                eyik eyikVar122 = ahnhVar51.QG;
                return new asqr(egytVar, ahknVar52.cD, dqsnVar7, ahknVar52.mU, ahknVar52.np, ahnhVar51.vR, ahhoVar46.f, (aqmq) eyikVar122.b(), (fdjx) ahnhVar51.oQ.b());
            case 84:
                return new akmx(this.a.a.oQ, this.b.az);
            case 85:
                return new akcv(this.a.a.TA, this.b.g);
            case 86:
                return new angb(this.b.aC);
            case 87:
                return new albb(this.b.aB);
            case 88:
                ahkn ahknVar53 = this.a;
                ahho ahhoVar47 = this.b;
                ahnh ahnhVar52 = ahknVar53.a;
                return new aler(ahnhVar52.m, ahnhVar52.oS, ahknVar53.dK, ahhoVar47.V, ahnhVar52.BW, ahnhVar52.BX);
            case 89:
                return new akkw(this.a.a.oQ, this.b.az);
            case 90:
                ahkn ahknVar54 = this.a;
                ahho ahhoVar48 = this.b;
                ahnh ahnhVar53 = ahknVar54.a;
                return new bakq(ahnhVar53.qq, ahhoVar48.aH, (fdjx) ahnhVar53.m.b());
            case 91:
                ahho ahhoVar49 = this.b;
                return ekhx.r(ahhoVar49.s(), ahhoVar49.x());
            case 92:
                ahkn ahknVar55 = this.a;
                ahho ahhoVar50 = this.b;
                ahnh ahnhVar54 = ahknVar55.a;
                return new aoie(ahnhVar54.xI, ahnhVar54.se, ahnhVar54.Zc, ahnhVar54.qB, ahhoVar50.aL);
            case 93:
                ahkn ahknVar56 = this.a;
                ahho ahhoVar51 = this.b;
                ahnh ahnhVar55 = ahknVar56.a;
                return new aoin(ahnhVar55.pT, ahnhVar55.rW, ahnhVar55.qi, ahhoVar51.d, ahnhVar55.sp);
            case 94:
                ahkn ahknVar57 = this.a;
                ahho ahhoVar52 = this.b;
                ahnh ahnhVar56 = ahknVar57.a;
                return new aohw(ahnhVar56.wH, ahnhVar56.VZ, ahhoVar52.aO, (Context) ahknVar57.t.b());
            case 95:
                ahho ahhoVar53 = this.b;
                ahkn ahknVar58 = this.a;
                ahnh ahnhVar57 = ahknVar58.a;
                return new ayee(ahhoVar53.k, ahnhVar57.ww, ahnhVar57.AQ, ahnhVar57.pf, ahnhVar57.pB, ahnhVar57.uy, ahnhVar57.us, ahnhVar57.CB, ahnhVar57.Zn, ahhoVar53.l, ahnhVar57.qq, ahnhVar57.qi, ahknVar58.t);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahho ahhoVar54 = this.b;
                amdy amdyVar = (amdy) ahhoVar54.bn.b();
                amfc.a(amdyVar);
                return amdyVar;
            case 97:
                ahkn ahknVar59 = this.a;
                fdjx fdjxVar11 = (fdjx) ahknVar59.a.m.b();
                ahho ahhoVar55 = this.b;
                return new amgx(fdjxVar11, ahknVar59.hV, (amdy) ahhoVar55.bn.b(), ahhoVar55.bh);
            case 98:
                ahkn ahknVar60 = this.a;
                ahho ahhoVar56 = this.b;
                eyik eyikVar123 = ahknVar60.dK;
                eyik eyikVar124 = ahknVar60.p;
                eyik eyikVar125 = ahknVar60.y;
                eyik eyikVar126 = ahhoVar56.ba;
                eyik eyikVar127 = ahknVar60.ir;
                eyik eyikVar128 = ahhoVar56.bi;
                ahnh ahnhVar58 = ahknVar60.a;
                eyik eyikVar129 = ahnhVar58.Ji;
                eyik eyikVar130 = ahknVar60.lx;
                eyik eyikVar131 = ahnhVar58.Cg;
                eyik eyikVar132 = ahnhVar58.Rj;
                eyik eyikVar133 = ahhoVar56.u;
                eyik eyikVar134 = ahnhVar58.Rn;
                eyik eyikVar135 = ahnhVar58.xO;
                eyik eyikVar136 = ahnhVar58.Rq;
                eyik eyikVar137 = ahnhVar58.Rr;
                eyik eyikVar138 = ahnhVar58.Rs;
                eyik eyikVar139 = ahnhVar58.Ru;
                eyik eyikVar140 = ahnhVar58.Rv;
                eyik eyikVar141 = ahnhVar58.Rx;
                eyik eyikVar142 = ahhoVar56.bd;
                eyik eyikVar143 = ahnhVar58.RA;
                eyik eyikVar144 = ahknVar60.cD;
                eyik eyikVar145 = ahhoVar56.bj;
                eyik eyikVar146 = ahnhVar58.CJ;
                eyik eyikVar147 = ahknVar60.nk;
                eyik eyikVar148 = ahknVar60.nl;
                return new amdy(eyikVar123, eyikVar124, eyikVar125, ahknVar60.aJ, ahhoVar56.aZ, ahhoVar56.bg, ahnhVar58.QC, ahnhVar58.QD, ahhoVar56.bh, ahnhVar58.QF, ahnhVar58.QX, ahknVar60.mZ, ahknVar60.na, ahnhVar58.Rg, ahknVar60.nc, eyikVar126, eyikVar127, eyikVar128, eyikVar129, eyikVar130, eyikVar131, eyikVar132, eyikVar133, eyikVar134, eyikVar135, ahnhVar58.Ro, ahknVar60.nh, eyikVar136, eyikVar137, eyikVar138, eyikVar139, eyikVar140, eyikVar141, eyikVar142, eyikVar143, eyikVar144, eyikVar145, eyikVar146, ahknVar60.nj, ahnhVar58.RD, ahknVar60.mY, eyikVar147, eyikVar148, ahnhVar58.RE, ahnhVar58.BF, ahnhVar58.RG, ahnhVar58.RH, ahnhVar58.RI, ahnhVar58.RJ, ahnhVar58.RK, ahhoVar56.bl, ahhoVar56.bm, ahnhVar58.RP, ahnhVar58.RQ, ahnhVar58.RR, ahnhVar58.RS, ahnhVar58.RT, ahnhVar58.AO, ahnhVar58.RU);
            case 99:
                ahkn ahknVar61 = this.a;
                ahho ahhoVar57 = this.b;
                ahnh ahnhVar59 = ahknVar61.a;
                return new amli(ahknVar61.p, ahknVar61.ir, ahnhVar59.Bl, ahhoVar57.aS, ahhoVar57.O, ahhoVar57.aW, ahhoVar57.aY, eyil.a(ahknVar61.cD), ahnhVar59.Qh);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                ahkn ahknVar = this.a;
                ahho ahhoVar = this.b;
                ahnh ahnhVar = ahknVar.a;
                return new ammm(ahknVar.dK, ahknVar.p, ahknVar.y, ahnhVar.AW, ahknVar.aN, ahnhVar.qa, ahnhVar.AV, ahhoVar.f, eyil.a(ahhoVar.aQ), ahnhVar.Bg, ahhoVar.aR);
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ahkn ahknVar2 = this.a;
                return new ajwa((eosc) ahknVar2.aJ.b(), this.b.h, ahknVar2.a.yw, ahknVar2.cD);
            case 102:
                ahho ahhoVar2 = this.b;
                return new akaj(ahhoVar2.h, (fdjx) this.a.a.m.b());
            case 103:
                ahho ahhoVar3 = this.b;
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                return new aleu(ahhoVar3.aT, ahhoVar3.aB, ahknVar3.cA, ahhoVar3.T, ahhoVar3.V, ahhoVar3.aU, ahhoVar3.aV, ahnhVar2.BQ, ahnhVar2.Ce, ahnhVar2.m);
            case 104:
                ahkn ahknVar4 = this.a;
                ahho ahhoVar4 = this.b;
                ahnh ahnhVar3 = ahknVar4.a;
                return new aled(ahnhVar3.m, ahnhVar3.oS, ahknVar4.dK, ahhoVar4.T, ahnhVar3.BS, ahnhVar3.BT);
            case 105:
                ahkn ahknVar5 = this.a;
                return new albm(ahknVar5.a.m, ahknVar5.dK, ahknVar5.iA, this.b.S);
            case 106:
                ahkn ahknVar6 = this.a;
                return new albv(ahknVar6.a.m, ahknVar6.dK, ahknVar6.iA, this.b.S);
            case 107:
                ahho ahhoVar5 = this.b;
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar4 = ahknVar7.a;
                return new amsd(ahhoVar5.aX, ahnhVar4.Fd, ahnhVar4.m, ahknVar7.cz, ahknVar7.cD, ahnhVar4.yE, ahnhVar4.yH, ahnhVar4.Qf);
            case 108:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar5 = ahknVar8.a;
                return new cmsx(ahknVar8.gF, (cmnp) ahnhVar5.Gk.b(), ahknVar8.ct(), this.b.d, ahnhVar5.sh, ahnhVar5.rW);
            case 109:
                ahho ahhoVar6 = this.b;
                ahkn ahknVar9 = this.a;
                return new ankd(ahhoVar6.ba, ahknVar9.a.yw, ahhoVar6.bd, ahhoVar6.bf, ahknVar9.p);
            case 110:
                ahkn ahknVar10 = this.a;
                ahho ahhoVar7 = this.b;
                ahnh ahnhVar6 = ahknVar10.a;
                eyik eyikVar = ahnhVar6.HR;
                return new ajpv(ahnhVar6.Ql, ahhoVar7.t, eyikVar, ahnhVar6.pf);
            case 111:
                return new ajql();
            case 112:
                return Optional.of((cmcx) this.b.bc.b());
            case 113:
                ahkn ahknVar11 = this.a;
                cogw cogwVar = (cogw) ahknVar11.cD.b();
                eosc eoscVar = (eosc) ahknVar11.y.b();
                eosc eoscVar2 = (eosc) ahknVar11.p.b();
                ahho ahhoVar8 = this.b;
                eyik eyikVar2 = ahknVar11.aQ;
                ahnh ahnhVar7 = ahknVar11.a;
                eyik eyikVar3 = ahnhVar7.yx;
                eyik eyikVar4 = ahnhVar7.un;
                egzh egzhVar = (egzh) eyikVar2.b();
                aiht aihtVar = (aiht) ahknVar11.mQ.b();
                eyik eyikVar5 = ahnhVar7.qG;
                ahknVar11.bC();
                eyik eyikVar6 = ahhoVar8.o;
                eyik eyikVar7 = ahhoVar8.r;
                eyik eyikVar8 = ahhoVar8.k;
                return new aihh(cogwVar, eoscVar, eoscVar2, ahhoVar8.ba, eyikVar3, eyikVar4, egzhVar, aihtVar, ahhoVar8.bb, ahnhVar7.Qw, eyikVar5, eyikVar6, eyikVar7, eyikVar8);
            case 114:
                ahkn ahknVar12 = this.a;
                eosc eoscVar3 = (eosc) ahknVar12.y.b();
                eyik eyikVar9 = ahknVar12.cD;
                ahnh ahnhVar8 = ahknVar12.a;
                eyik eyikVar10 = ahnhVar8.AQ;
                cogw cogwVar2 = (cogw) eyikVar9.b();
                ahho ahhoVar9 = this.b;
                return new aigk(eoscVar3, eyikVar10, cogwVar2, ahhoVar9.l, (dqsn) ahnhVar8.qq.b(), ahnhVar8.HP);
            case 115:
                return ekhx.r(this.a.ch(), this.b.l());
            case 116:
                return new aldo(this.a.a.rF);
            case 117:
                return Optional.of(this.b.m());
            case 118:
                return new alzw(this.b.f, this.a.a.IU);
            case 119:
                return Optional.of(this.b.u());
            case 120:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar9 = ahknVar13.a;
                fdjx fdjxVar = (fdjx) ahnhVar9.oS.b();
                ahho ahhoVar10 = this.b;
                return new anao(fdjxVar, ahnhVar9.yx, ahhoVar10.r, ahnhVar9.HP, ahnhVar9.ww, (dqsn) ahnhVar9.qq.b(), ahnhVar9.RL, ahhoVar10.bk, ahknVar13.cD);
            case 121:
                return new amxi(this.a.a.rF);
            case 122:
                ahkn ahknVar14 = this.a;
                ahho ahhoVar11 = this.b;
                return new aneu(ahknVar14.iA, ahknVar14.a.oS, ahhoVar11.r);
            case 123:
                ahho ahhoVar12 = this.b;
                ahkn ahknVar15 = this.a;
                return new amhm(ahhoVar12.bo, ahhoVar12.bn, ahknVar15.nc, ahknVar15.a.Rj, ahhoVar12.bg);
            case 124:
                ahkn ahknVar16 = this.a;
                ahho ahhoVar13 = this.b;
                ahnh ahnhVar10 = ahknVar16.a;
                return new cifg(ahnhVar10.rd, ahnhVar10.sh, ahnhVar10.rk, ahhoVar13.d, ahknVar16.da, ahnhVar10.pf);
            case 125:
                ahkn ahknVar17 = this.a;
                Context context = (Context) ahknVar17.t.b();
                ahnh ahnhVar11 = ahknVar17.a;
                fdjx fdjxVar2 = (fdjx) ahnhVar11.m.b();
                ahho ahhoVar14 = this.b;
                eyik eyikVar11 = ahhoVar14.bv;
                ahng ahngVar = ahknVar17.b;
                eyik eyikVar12 = ahnhVar11.aah;
                Optional optionalEmpty = Optional.empty();
                eyik eyikVar13 = ahngVar.I;
                eyik eyikVar14 = ahnhVar11.Ih;
                Optional optional = (Optional) eyikVar11.b();
                return new daud(context, fdjxVar2, eyikVar12, ahhoVar14.c, ahhoVar14.f, optionalEmpty, ahngVar.nr, eyikVar13, eyikVar14, optional, ahnhVar11.tG);
            case 126:
                return Optional.of(this.b.f());
            case 127:
                return new dawe();
            case 128:
                return this.b.K();
            case 129:
                return new aczv((fdjx) this.a.a.m.b(), (aofc) this.b.c.b());
            case 130:
                ahkn ahknVar18 = this.a;
                Context context2 = (Context) ahknVar18.t.b();
                cqtj cqtjVar = (cqtj) ahknVar18.b.gZ.b();
                cdga cdgaVar = (cdga) this.b.bs.b();
                ahnh ahnhVar12 = ahknVar18.a;
                return new acic(context2, cqtjVar, cdgaVar, (cpch) ahnhVar12.qj.b(), (egej) ahnhVar12.pI.b());
            case 131:
                return new cdiw(this.b.w(), this.a.ei);
            case 132:
                ahkn ahknVar19 = this.a;
                ahho ahhoVar15 = this.b;
                eyik eyikVar15 = ahknVar19.cD;
                ahng ahngVar2 = ahknVar19.b;
                ahnh ahnhVar13 = ahknVar19.a;
                eyik eyikVar16 = ahnhVar13.Cs;
                eyik eyikVar17 = ahngVar2.dK;
                eyik eyikVar18 = ahngVar2.l;
                eyik eyikVar19 = ahnhVar13.VZ;
                eyik eyikVar20 = ahnhVar13.Ch;
                cogw cogwVar3 = (cogw) eyikVar15.b();
                eyik eyikVar21 = ahnhVar13.Cp;
                eyik eyikVar22 = ahnhVar13.tc;
                eyik eyikVar23 = ahnhVar13.xj;
                eygg eyggVarA = eyie.a(ahnhVar13.uv);
                eyik eyikVar24 = ahnhVar13.yw;
                eyik eyikVar25 = ahnhVar13.Bx;
                eyik eyikVar26 = ahngVar2.u;
                eyik eyikVar27 = ahnhVar13.Uk;
                eyik eyikVar28 = ahnhVar13.Jm;
                eyik eyikVar29 = ahnhVar13.uu;
                Context context3 = (Context) ahknVar19.t.b();
                eyik eyikVar30 = ahknVar19.pP;
                eyik eyikVar31 = ahnhVar13.EG;
                eyik eyikVar32 = ahnhVar13.FQ;
                eyik eyikVar33 = ahnhVar13.wJ;
                eyik eyikVar34 = ahnhVar13.uy;
                eyik eyikVar35 = ahnhVar13.pf;
                eyik eyikVar36 = ahnhVar13.Ns;
                eyik eyikVar37 = ahnhVar13.Xs;
                eosc eoscVar4 = (eosc) eyikVar30.b();
                eygg eyggVarA2 = eyie.a(ahnhVar13.tJ);
                eyik eyikVar38 = ahknVar19.kD;
                eyik eyikVar39 = ahknVar19.kc;
                eyik eyikVar40 = ahknVar19.nu;
                eyik eyikVar41 = ahnhVar13.By;
                eyik eyikVar42 = ahnhVar13.tp;
                eyik eyikVar43 = ahnhVar13.tg;
                eyik eyikVar44 = ahnhVar13.LU;
                eyik eyikVar45 = ahngVar2.eT;
                eyik eyikVar46 = ahnhVar13.Ci;
                eyik eyikVar47 = ahnhVar13.wK;
                eyik eyikVar48 = ahnhVar13.BK;
                eyik eyikVar49 = ahnhVar13.tf;
                eyik eyikVar50 = ahnhVar13.Gc;
                eyik eyikVar51 = ahknVar19.ld;
                eyik eyikVar52 = ahnhVar13.wW;
                eyik eyikVar53 = ahnhVar13.sk;
                eosd eosdVar = (eosd) ahknVar19.p.b();
                eosd eosdVar2 = (eosd) ahknVar19.y.b();
                eyik eyikVar54 = ahngVar2.fd;
                eyik eyikVar55 = ahknVar19.ee;
                eyik eyikVar56 = ahngVar2.hY;
                ckhg ckhgVar = (ckhg) ahnhVar13.PN.b();
                eyik eyikVar57 = ahnhVar13.yr;
                eyik eyikVar58 = ahngVar2.hZ;
                eyik eyikVar59 = ahngVar2.id;
                Object objCJ = ahngVar2.cJ();
                eyik eyikVar60 = ahngVar2.f6if;
                eyik eyikVar61 = ahnhVar13.sd;
                eyik eyikVar62 = ahngVar2.ig;
                eyik eyikVar63 = ahnhVar13.rk;
                eyik eyikVar64 = ahnhVar13.Cr;
                eyik eyikVar65 = ahnhVar13.qK;
                eyik eyikVar66 = ahngVar2.ik;
                eyik eyikVar67 = ahnhVar13.aaY;
                eyik eyikVar68 = ahngVar2.il;
                eyik eyikVar69 = ahngVar2.im;
                eyik eyikVar70 = ahnhVar13.adt;
                eyik eyikVar71 = ahngVar2.in;
                eyik eyikVar72 = ahnhVar13.qi;
                eyik eyikVar73 = ahnhVar13.ut;
                eyik eyikVar74 = ahngVar2.f21io;
                eyik eyikVar75 = ahngVar2.x;
                eosc eoscVar5 = (eosc) ahknVar19.aJ.b();
                eyik eyikVar76 = ahngVar2.nH;
                eyik eyikVar77 = ahngVar2.nI;
                eyik eyikVar78 = ahngVar2.nJ;
                eyik eyikVar79 = ahknVar19.aI;
                eyik eyikVar80 = ahknVar19.de;
                eyik eyikVar81 = ahhoVar15.bI;
                eyik eyikVar82 = ahhoVar15.bH;
                eyik eyikVar83 = ahhoVar15.bF;
                eyik eyikVar84 = ahhoVar15.r;
                eyik eyikVar85 = ahhoVar15.k;
                eyik eyikVar86 = ahknVar19.aT;
                eyik eyikVar87 = ahhoVar15.bD;
                eyik eyikVar88 = ahhoVar15.bC;
                eyik eyikVar89 = ahngVar2.ip;
                eyik eyikVar90 = ahhoVar15.bM;
                eyik eyikVar91 = ahnhVar13.rd;
                eyik eyikVar92 = ahngVar2.iq;
                eyik eyikVar93 = ahhoVar15.bP;
                eyik eyikVar94 = ahknVar19.aQ;
                eyik eyikVar95 = ahngVar2.ir;
                eyik eyikVar96 = ahknVar19.cK;
                eyik eyikVar97 = ahnhVar13.Ih;
                eyik eyikVar98 = ahngVar2.is;
                eyik eyikVar99 = ahngVar2.da;
                return new cxsa(eyikVar16, eyikVar88, eyikVar17, eyikVar18, eyikVar87, eyikVar19, eyikVar20, cogwVar3, eyikVar21, eyikVar22, eyikVar23, eyggVarA, eyikVar86, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, context3, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar85, eyikVar84, eyikVar36, eyikVar37, eoscVar4, eyggVarA2, eyikVar38, eyikVar39, eyikVar40, eyikVar83, eyikVar82, eyikVar41, eyikVar81, eyikVar42, eyikVar43, eyikVar44, eyikVar45, eyikVar46, eyikVar80, eyikVar47, eyikVar76, eyikVar48, eyikVar49, eyikVar50, eyikVar51, eyikVar52, eyikVar53, eosdVar, eyikVar77, eosdVar2, eyikVar54, eyikVar55, eyikVar56, ckhgVar, eyikVar57, eyikVar58, eyikVar78, eyikVar59, (cxah) objCJ, eyikVar79, eyikVar60, eyikVar61, eyikVar62, eyikVar63, eyikVar64, eyikVar65, eyikVar66, eyikVar67, eyikVar68, eyikVar69, eyikVar70, eyikVar71, eyikVar72, eyikVar73, eyikVar74, eyikVar75, eoscVar5, eyikVar89, eyikVar90, eyikVar91, eyikVar92, eyikVar93, eyikVar94, eyikVar95, eyikVar96, eyikVar97, eyikVar98, eyikVar99, ahnhVar13.ajW, ahnhVar13.sh, ahnhVar13.yf, ahngVar2.fa, ahhoVar15.bR, ahnhVar13.ajZ, ahngVar2.it, ahngVar2.iu, ahknVar19.oK, ahnhVar13.KC, ahhoVar15.bS, ahnhVar13.Qp, ahngVar2.gz, ahnhVar13.KR, ahnhVar13.KQ, ahnhVar13.aoA, ahnhVar13.aaW, ahngVar2.iv, ahngVar2.iw, ahhoVar15.f, ahnhVar13.su, ahngVar2.ix, eyim.a(), ahhoVar15.bT, Optional.of((bvll) ahnhVar13.rK.b()), ahnhVar13.Yf, ahnhVar13.PM, ahngVar2.nK, ahhoVar15.bU, ahnhVar13.sB, ahhoVar15.c, ahngVar2.iy, ahnhVar13.xR);
            case 133:
                ahkn ahknVar20 = this.a;
                Context context4 = (Context) ahknVar20.t.b();
                ahnh ahnhVar14 = ahknVar20.a;
                return new cmxe(context4, (cgei) ahnhVar14.qF.b(), (cgbn) ahnhVar14.Cs.b(), (clgq) this.b.bu.b());
            case 134:
                ahho ahhoVar16 = this.b;
                ahnh ahnhVar15 = this.a.a;
                return new axsf(ahhoVar16.k, ahhoVar16.r, ahnhVar15.uu, ahnhVar15.c, ahnhVar15.qq, ahnhVar15.CI);
            case 135:
                return Optional.of(this.b.I());
            case 136:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar16 = ahknVar21.a;
                eyik eyikVar100 = ahnhVar16.zF;
                fdjx fdjxVar3 = (fdjx) ahnhVar16.oS.b();
                ahho ahhoVar17 = this.b;
                eyik eyikVar101 = ahknVar21.cA;
                ahng ahngVar3 = ahknVar21.b;
                return new chkj(eyikVar100, fdjxVar3, ahhoVar17.z(), ahnhVar16.tG, ahhoVar17.c, ahngVar3.H, (fcyh) eyikVar101.b(), ahngVar3.I);
            case 137:
                ahkn ahknVar22 = this.a;
                ahho ahhoVar18 = this.b;
                eyik eyikVar102 = ahknVar22.t;
                ahnh ahnhVar17 = ahknVar22.a;
                return new cgcy(eyikVar102, ahnhVar17.qE, ahnhVar17.Ch, ahnhVar17.Jd, ahnhVar17.wv, ahnhVar17.c, ahknVar22.cD, ahnhVar17.Jm, ahhoVar18.bG, ahknVar22.cC, ahknVar22.mU, ahnhVar17.Qp, ahhoVar18.k, ahnhVar17.QG);
            case 138:
                ahkn ahknVar23 = this.a;
                return new cgcz((Context) ahknVar23.t.b(), (avmp) ahknVar23.a.Jm.b(), (clgq) this.b.bu.b(), (cpbz) ahknVar23.jW.b());
            case 139:
                ahkn ahknVar24 = this.a;
                Context context5 = (Context) ahknVar24.t.b();
                ahho ahhoVar19 = this.b;
                ahnh ahnhVar18 = ahknVar24.a;
                return new cxsj(context5, ahnhVar18.zP, ahhoVar19.r, (cmvy) ahnhVar18.pE.b(), (eosc) ahknVar24.y.b());
            case 140:
                return Optional.of(this.b.J());
            case 141:
                ahkn ahknVar25 = this.a;
                cogw cogwVar4 = (cogw) ahknVar25.cD.b();
                cbcz cbczVar = (cbcz) this.b.bK.b();
                ahnh ahnhVar19 = ahknVar25.a;
                return new cbkq(cogwVar4, cbczVar, (cbhp) ahnhVar19.amS.b(), (egsh) ahknVar25.dG.b(), (cbbl) ahnhVar19.amT.b(), ahnhVar19.pQ, (fdjx) ahnhVar19.oQ.b(), (fdjx) ahnhVar19.oS.b());
            case 142:
                ahnh ahnhVar20 = this.a.a;
                cbdd cbddVar = (cbdd) ahnhVar20.amM.b();
                ahho ahhoVar20 = this.b;
                return new cbci(cbddVar, ahhoVar20.bJ, (cbbl) ahnhVar20.amT.b(), (fdjx) ahnhVar20.oQ.b());
            case 143:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar21 = ahknVar26.a;
                return new cbhl((byeq) ahnhVar21.sG.b(), (cogw) ahknVar26.cD.b(), (cbaz) this.b.I.b(), ahnhVar21.amP, ahnhVar21.amR, (egsh) ahknVar26.dG.b(), (dqsn) ahnhVar21.qq.b(), (cbhp) ahnhVar21.amS.b(), (caxe) ahnhVar21.FF.b(), ahnhVar21.pQ, (fdjx) ahnhVar21.oQ.b(), (fdjx) ahnhVar21.oS.b());
            case 144:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar22 = ahknVar27.a;
                fdjx fdjxVar4 = (fdjx) ahnhVar22.oS.b();
                eyik eyikVar103 = ahnhVar22.rd;
                dhkw dhkwVar = (dhkw) ahknVar27.dJ.b();
                apwv apwvVar = (apwv) ahnhVar22.ri.b();
                ahgh ahghVar = (ahgh) this.b.bO.b();
                eyik eyikVar104 = ahnhVar22.PR;
                return new ckhm(fdjxVar4, eyikVar103, ahnhVar22.PN, dhkwVar, apwvVar, ahghVar, ahnhVar22.yl, ahnhVar22.cq(), (arhh) eyikVar104.b());
            case 145:
                ahho ahhoVar21 = this.b;
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar23 = ahknVar28.a;
                return new ahgh(ahhoVar21.bN, ahknVar28.cj(), (cqbm) ahnhVar23.rY.b(), (dhkw) ahknVar28.dJ.b(), ahknVar28.y);
            case 146:
                return new ahfv(this.a.a.rF);
            case 147:
                ahkn ahknVar29 = this.a;
                cyfw cyfwVar = (cyfw) ahknVar29.b.hY.b();
                dens densVar = (dens) ahknVar29.pG.b();
                ahnh ahnhVar24 = ahknVar29.a;
                cmfo cmfoVarKm = ahnhVar24.km();
                ctap ctapVar = (ctap) ahnhVar24.aeK.b();
                ctbx ctbxVar = (ctbx) ahknVar29.oE.b();
                ahho ahhoVar22 = this.b;
                return new cykk(cyfwVar, densVar, cmfoVarKm, ctapVar, ctbxVar, ahhoVar22.bQ, (eigp) ahknVar29.aI.b(), (dain) ahnhVar24.aaW.b(), (fdjx) ahnhVar24.oS.b());
            case 148:
                return new data(this.a.a.rF);
            case 149:
                ahkn ahknVar30 = this.a;
                return new cinr((fdjx) ahknVar30.a.oQ.b(), (ajln) this.b.g.b(), (cion) ahknVar30.ph.b());
            case 150:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar25 = ahknVar31.a;
                fdjx fdjxVar5 = (fdjx) ahnhVar25.oQ.b();
                fcyh fcyhVar = (fcyh) ahknVar31.cA.b();
                cqba cqbaVar = (cqba) ahknVar31.aM.b();
                Context context6 = (Context) ahknVar31.t.b();
                ains ainsVar = (ains) ahnhVar25.pQ.b();
                crnp crnpVar = (crnp) ahknVar31.cI.b();
                ahho ahhoVar23 = this.b;
                eyik eyikVar105 = ahnhVar25.CN;
                eyik eyikVar106 = ahnhVar25.zP;
                cmqj cmqjVar = (cmqj) ahnhVar25.uv.b();
                alrj alrjVar = (alrj) ahnhVar25.qi.b();
                avpc avpcVar = (avpc) ahnhVar25.AM.b();
                bbdl bbdlVar = (bbdl) ahnhVar25.qG.b();
                aofc aofcVar = (aofc) ahhoVar23.c.b();
                dqsn dqsnVar = (dqsn) ahnhVar25.qq.b();
                eyik eyikVar107 = ahknVar31.pL;
                return new ciqt(fdjxVar5, fcyhVar, cqbaVar, context6, ainsVar, crnpVar, ahhoVar23.r, ahhoVar23.k, eyikVar105, eyikVar106, cmqjVar, alrjVar, avpcVar, bbdlVar, aofcVar, dqsnVar, ahnhVar25.anw, ahnhVar25.anx, (ecjh) eyikVar107.b(), (cogw) ahknVar31.cD.b(), ahnhVar25.any, ahnhVar25.AE);
            case 151:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar26 = ahknVar32.a;
                return new awpo((fdjx) ahnhVar26.m.b(), (fcyh) ahknVar32.cA.b(), this.b.F(), (awnf) ahnhVar26.sJ.b(), (awjh) ahnhVar26.sK.b(), (ardl) ahnhVar26.sB.b(), (lkb) ahnhVar26.sQ.b(), (cogw) ahknVar32.cD.b(), ahnhVar26.sR, ahnhVar26.sS, (ains) ahnhVar26.pQ.b(), (awzf) ahnhVar26.sI.b(), (awyu) ahnhVar26.qB.b(), (eizx) ahknVar32.ea.b());
            case 152:
                ahkn ahknVar33 = this.a;
                Context context7 = (Context) ahknVar33.t.b();
                ahnh ahnhVar27 = ahknVar33.a;
                return new abuc(context7, (fdjx) ahnhVar27.oQ.b(), this.b.bW, ahnhVar27.Jm);
            case 153:
                ahkn ahknVar34 = this.a;
                ahho ahhoVar24 = this.b;
                return new abuh(ahknVar34.a.qi, ahhoVar24.f, ahhoVar24.g);
            case 154:
                ahkn ahknVar35 = this.a;
                Context context8 = (Context) ahknVar35.t.b();
                eosc eoscVar6 = (eosc) ahknVar35.y.b();
                ahnh ahnhVar28 = ahknVar35.a;
                return new uho(context8, eoscVar6, (ajsn) ahnhVar28.Qp.b(), (ajso) this.b.aF.b(), ahnhVar28.Jm);
            case 155:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar29 = ahknVar36.a;
                return new ckxs();
            case 156:
                ahho ahhoVar25 = this.b;
                return new ayko(ahhoVar25.k, this.a.a.HJ, ahhoVar25.l);
            case 157:
                ahkn ahknVar37 = this.a;
                Context context9 = (Context) ahknVar37.t.b();
                eyik eyikVar108 = ahknVar37.dj;
                bveo bveoVarBC = ahknVar37.bC();
                egyt egytVar = (egyt) eyikVar108.b();
                egzh egzhVar2 = (egzh) ahknVar37.aQ.b();
                ahnh ahnhVar30 = ahknVar37.a;
                crtq crtqVar = (crtq) ahnhVar30.HI.b();
                eosc eoscVar7 = (eosc) ahknVar37.y.b();
                eosc eoscVar8 = (eosc) ahknVar37.p.b();
                bafp bafpVar = (bafp) ahnhVar30.ye.b();
                ahho ahhoVar26 = this.b;
                eyik eyikVar109 = ahnhVar30.EO;
                crab crabVar = (crab) ahnhVar30.adA.b();
                eyik eyikVar110 = ahnhVar30.QL;
                eyik eyikVar111 = ahnhVar30.UV;
                eyik eyikVar112 = ahknVar37.dL;
                eyik eyikVar113 = ahnhVar30.Jx;
                eyik eyikVar114 = ahnhVar30.zP;
                eyik eyikVar115 = ahnhVar30.qi;
                aqhc aqhcVar = (aqhc) eyikVar110.b();
                return new usv(context9, bveoVarBC, egytVar, egzhVar2, crtqVar, eoscVar7, eoscVar8, bafpVar, ahhoVar26.ak, ahhoVar26.ae, eyikVar109, crabVar, eyikVar111, eyikVar112, eyikVar113, eyikVar114, eyikVar115, ahhoVar26.g, aqhcVar);
            case 158:
                ahho ahhoVar27 = this.b;
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar31 = ahknVar38.a;
                return new dave(ahhoVar27.cc, ahnhVar31.pI, (fdjx) ahnhVar31.m.b(), ahknVar38.b.jp);
            case 159:
                return new dauv(this.a.a.ajL);
            case 160:
                ahkn ahknVar39 = this.a;
                eosc eoscVar9 = (eosc) ahknVar39.y.b();
                ahnh ahnhVar32 = ahknVar39.a;
                return new bwqr(eoscVar9, (bvus) ahnhVar32.EO.b(), (aypm) this.b.t.b(), ahnhVar32.DL);
            case 161:
                ahkn ahknVar40 = this.a;
                ahho ahhoVar28 = this.b;
                eyik eyikVar116 = ahknVar40.t;
                ahnh ahnhVar33 = ahknVar40.a;
                ahng ahngVar4 = ahknVar40.b;
                return new czqs(eyikVar116, ahknVar40.aT, ahngVar4.jn, ahknVar40.gF, ahnhVar33.c, ahngVar4.gZ, ahngVar4.hN, ahnhVar33.PN, ahngVar4.cZ, ahknVar40.cD, ahnhVar33.sd, ahknVar40.aI, ahknVar40.aJ, ahnhVar33.rd, ahnhVar33.rq, ahhoVar28.bP, ahnhVar33.ri, ahngVar4.hO, ahngVar4.hP);
            case 162:
                ahkn ahknVar41 = this.a;
                ahho ahhoVar29 = this.b;
                ahhoVar29.R();
                return new cvsb();
            case 163:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar34 = ahknVar42.a;
                return new cvth();
            case 164:
                ahkn ahknVar43 = this.a;
                Optional optional2 = (Optional) ahknVar43.a.adD.b();
                Optional optionalOf = Optional.of((czwg) ahknVar43.om.b());
                return new cvrm(optional2, optionalOf);
            case 165:
                ahkn ahknVar44 = this.a;
                return new cvqh((eosc) ahknVar44.p.b(), (bvel) ahknVar44.b.oC.b(), (anty) this.b.f.b());
            case 166:
                ahkn ahknVar45 = this.a;
                return new cvqt((eosc) ahknVar45.p.b(), (bvel) ahknVar45.b.oC.b(), (anty) this.b.f.b());
            case 167:
                ahkn ahknVar46 = this.a;
                eosc eoscVar10 = (eosc) ahknVar46.p.b();
                ahnh ahnhVar35 = ahknVar46.a;
                return new cvrb(eoscVar10, (fdjx) ahnhVar35.oQ.b(), (egyt) ahknVar46.dj.b(), ahnhVar35.uQ, (crny) ahnhVar35.pf.b(), (bvel) ahknVar46.b.oC.b(), (anty) this.b.f.b());
            case 168:
                ahkn ahknVar47 = this.a;
                cogw cogwVar5 = (cogw) ahknVar47.cD.b();
                ahnh ahnhVar36 = ahknVar47.a;
                Optional optionalOf2 = Optional.of(ahnhVar36.Uk);
                eyik eyikVar117 = ahknVar47.aJ;
                eyik eyikVar118 = ahnhVar36.pE;
                eyik eyikVar119 = ahnhVar36.uv;
                eyik eyikVar120 = ahnhVar36.Ui;
                eosc eoscVar11 = (eosc) eyikVar117.b();
                ahho ahhoVar30 = this.b;
                eyik eyikVar121 = ahknVar47.cE;
                eyik eyikVar122 = ahnhVar36.Ci;
                dzuc dzucVar = (dzuc) eyikVar121.b();
                ahng ahngVar5 = ahknVar47.b;
                return new cley(cogwVar5, optionalOf2, eyikVar118, eyikVar119, eyikVar120, eoscVar11, ahhoVar30.cl, eyikVar122, dzucVar, (ajga) ahngVar5.ed.b(), ahnhVar36.yw, ahnhVar36.yx, ahnhVar36.qG, ahngVar5.eW, ahnhVar36.Dl, ahngVar5.eX, ahnhVar36.Uj, ahngVar5.eY);
            case 169:
                ahkn ahknVar48 = this.a;
                ahho ahhoVar31 = this.b;
                ahnh ahnhVar37 = ahknVar48.a;
                return new ayem(ahknVar48.t, ahnhVar37.zP, ahhoVar31.r, ahnhVar37.ww, ahnhVar37.Gn, ahnhVar37.AM, ahnhVar37.Jd, ahnhVar37.HG, ahnhVar37.HI, ahnhVar37.us, ahnhVar37.uy, ahnhVar37.qG, ahnhVar37.yw, ahnhVar37.Ct, ahnhVar37.CF, ahknVar48.b.ee, ahnhVar37.yx, ahnhVar37.qq, ahnhVar37.Cp, ahnhVar37.IH, ahnhVar37.HP, ahnhVar37.Hf, ahnhVar37.Gt, ahnhVar37.qi, ahnhVar37.Js, ahnhVar37.CB);
            case 170:
                eyik eyikVar123 = this.b.co;
                return new axzo(eyikVar123, eyikVar123);
            case 171:
                ahkn ahknVar49 = this.a;
                ahho ahhoVar32 = this.b;
                ahnh ahnhVar38 = ahknVar49.a;
                return new aybf(ahknVar49.t, ahnhVar38.zP, ahhoVar32.k, ahhoVar32.r, ahnhVar38.ww, ahnhVar38.Gn, ahnhVar38.Jd, ahnhVar38.qG, ahknVar49.cD, ahnhVar38.uv, ahnhVar38.pf, ahnhVar38.wJ, ahnhVar38.pE, ahnhVar38.yw, ahnhVar38.Cd, ahnhVar38.Cc, ahnhVar38.Ck, ahnhVar38.wF, ahnhVar38.HG, ahnhVar38.HI, ahnhVar38.CA, ahhoVar32.cn, ahnhVar38.TY, ahnhVar38.Ct, ahnhVar38.CB, ahnhVar38.Zn, ahhoVar32.l, ahnhVar38.CF, ahnhVar38.uD, ahnhVar38.TZ, ahnhVar38.sG, ahnhVar38.IE, ahnhVar38.Cp, ahknVar49.ku, ahnhVar38.IH, ahknVar49.mx, ahnhVar38.qi, ahknVar49.b.ea, ahnhVar38.AM, ahnhVar38.Gq, ahnhVar38.Ud, ahnhVar38.Gt, ahnhVar38.Ji, ahnhVar38.Js, ahnhVar38.m, ahknVar49.bM, ahnhVar38.oQ, ahknVar49.cz, ahknVar49.cA, ahnhVar38.c, ahnhVar38.yp, ahnhVar38.HP, ahnhVar38.aiB, ahnhVar38.Ci, ahknVar49.nr, ahknVar49.ly, ahknVar49.oH, ahnhVar38.Jq, ahknVar49.hR, ahnhVar38.Uh, ahnhVar38.Ar);
            case 172:
                ahnh ahnhVar39 = this.a.a;
                cpbn cpbnVar = (cpbn) ahnhVar39.qo.b();
                ahho ahhoVar33 = this.b;
                return new axkf(cpbnVar, ahhoVar33.k);
            case 173:
                ahkn ahknVar50 = this.a;
                return van.a((vao) ahknVar50.pu.b(), ahknVar50.pv);
            case 174:
                ahkn ahknVar51 = this.a;
                ahho ahhoVar34 = this.b;
                return new uqm(ahknVar51.a.pQ, ahhoVar34.aF, ahknVar51.dL, ahknVar51.b.iD);
            case 175:
                return new aykm(this.b.k, this.a.a.qq);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        return this.c / 100 != 0 ? c() : a();
    }
}
