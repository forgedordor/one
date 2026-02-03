package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Vibrator;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.common.util.concurrent.ListenableFuture;
import com.sun.jna.Function;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.security.Security;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import javax.microedition.khronos.egl.EGLContext;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnf implements eyik {
    public final ahkn a;
    private final int b;

    public ahnf(ahkn ahknVar, int i) {
        this.a = ahknVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                return new ekph(this.a.b.ba());
            case 1:
                return new uoc();
            case 2:
                return new clcz(this.a.b.g);
            case 3:
                return new ekph((clcj) this.a.b.f.b());
            case 4:
                return clck.a(this.a.b.e.b());
            case 5:
                ahkn ahknVar = this.a;
                return new clcf(eyie.a(ahknVar.b.d), (eosc) ahknVar.p.b());
            case 6:
                ahng ahngVar = this.a.b;
                return new clds(ahngVar.ci(), ahngVar.cj(), ahngVar.ck());
            case 7:
                return new cldf(this.a.p);
            case 8:
                ahkn ahknVar2 = this.a;
                return new aazn(ahknVar2.t, ahknVar2.a.tt, ahknVar2.b.j);
            case 9:
                ekgi ekgiVarH = ekgp.h(145);
                ekgiVarH.i("$primary+a2p_conversation_subscriptions", bmhx.a());
                ekgiVarH.i("$primary+active_sims", awtq.a());
                ekgiVarH.i("$primary+add_contact_banner", bmje.a());
                ekgiVarH.i("backup+conversation_participants_backup", ayux.a());
                ekgiVarH.i("backup+conversation_pins_backup", aywd.a());
                ekgiVarH.i("backup+conversations_backup", ayzj.a());
                ekgiVarH.i("$primary+backup_id_map", bmko.a());
                ekgiVarH.i("backup+link_preview_backup", azbg.a());
                ekgiVarH.i("backup+message_captions_backup", azci.a());
                ekgiVarH.i("backup+message_reactions_backup", azdz.a());
                ekgiVarH.i("backup+message_replies_backup", azfk.a());
                ekgiVarH.i("backup+message_star_backup", azgn.a());
                ekgiVarH.i("backup+messages_backup", azle.a());
                ekgiVarH.i("backup+backup_metadata", azqq.a());
                ekgiVarH.i("backup+my_identities_backup", azrw.a());
                ekgiVarH.i("backup+participants_backup", azuw.a());
                ekgiVarH.i("backup+parts_backup", aznu.a());
                ekgiVarH.i("backup+read_reports_backup", azpj.a());
                ekgiVarH.i("$primary+business_conversations_metadata", bmmg.a());
                ekgiVarH.i("$primary+cms_backup_dependency_cache_table", bmno.a());
                ekgiVarH.i("$primary+cms_blobs_pending_delete", bmoq.a());
                ekgiVarH.i("$primary+cms_dead_letter_queue", bmrb.a());
                ekgiVarH.i("$primary+cms_deleted_messages_buffer", bmsq.a());
                ekgiVarH.i("$primary+cms_incremental_events", bmub.a());
                ekgiVarH.i("$primary+cms_media_notifications", bmvi.a());
                ekgiVarH.i("$primary+cms_notifications", bmxb.a());
                ekgiVarH.i("$primary+cms_restore_dependency_cache_table", bmys.a());
                ekgiVarH.i("$primary+cms_status", bnal.a());
                ekgiVarH.i("$primary+cms", bncc.a());
                ekgiVarH.i("$primary+contacts", bnff.a());
                ekgiVarH.i("$primary+conversation_classifications_table", bnha.a());
                ekgiVarH.i("$primary+conversation_encryption", cbtc.a());
                ekgiVarH.i("$primary+conversation_labels", bnxj.a());
                ekgiVarH.i("$primary+conversation_matcher_cache", avre.a());
                ekgiVarH.i("$primary+conversation_notification_settings_table", bnyu.a());
                ekgiVarH.i("$primary+conversation_participants_audit_log", boam.a());
                ekgiVarH.i("$primary+conversation_participants", boch.a());
                ekgiVarH.i("$primary+conversation_pin", bodo.a());
                ekgiVarH.i("$primary+conversation_suggestions", bofs.a());
                ekgiVarH.i("$primary+conversation_to_participants_audit_log", bohc.a());
                ekgiVarH.i("$primary+conversation_to_participants", boiw.a());
                ekgiVarH.i("$primary+conversations", botn.a());
                ekgiVarH.i("$primary+custodian_rcs_group_ids", boul.a());
                ekgiVarH.i("$primary+data_upgrade_workers", bovo.a());
                ekgiVarH.i("$primary+data_usage", bowm.a());
                ekgiVarH.i("$primary+desktop", bpac.a());
                ekgiVarH.i("$primary+destinations", awkw.a());
                ekgiVarH.i("$primary+disambiguations", bpbd.a());
                ekgiVarH.i("$primary+drafts", bpcz.a());
                ekgiVarH.i("$primary+emergency_questionnaire_option", bpee.a());
                ekgiVarH.i("$primary+emergency_sessions", bpfp.a());
                ekgiVarH.i("$primary+etouffee_rcs_metadata", bpip.a());
                ekgiVarH.i("$primary+events", bpka.a());
                ekgiVarH.i("$primary+extension_messages", bpla.a());
                ekgiVarH.i("$primary+external_capabilities", cdbp.a());
                ekgiVarH.i("$primary+file_processing", atmz.a());
                ekgiVarH.i("$primary+file_transfer", comd.a());
                ekgiVarH.i("$primary+flagged_messages", bpmr.a());
                ekgiVarH.i("$primary+gemini_conversation_id_mappings", bpob.a());
                ekgiVarH.i("$primary+gemini", bppa.a());
                ekgiVarH.i("$primary+generic_worker_queue", bprg.a());
                ekgiVarH.i("$primary+group_members", awor.a());
                ekgiVarH.i("$primary+groups", awsl.a());
                ekgiVarH.i("$primary+lighter_conversations_table", bptp.a());
                ekgiVarH.i("$primary+link_preview_participants_table", bpuu.a());
                ekgiVarH.i("$primary+link_preview", bpxk.a());
                ekgiVarH.i("$primary+linked_account", bpyi.a());
                ekgiVarH.i("$primary+messages_annotations", bpzy.a());
                ekgiVarH.i("$primary+message_captions", bqbc.a());
                ekgiVarH.i("$primary+message_classifications_table", bqco.a());
                ekgiVarH.i("$primary+message_destinations", bqdx.a());
                ekgiVarH.i("$primary+message_edits", bqfp.a());
                ekgiVarH.i("$primary+message_labels", bqhi.a());
                ekgiVarH.i("$primary+message_photos_sharing", bqil.a());
                ekgiVarH.i("$primary+message_reactions", bqkm.a());
                ekgiVarH.i("$primary+message_replies", bqmd.a());
                ekgiVarH.i("$primary+message_self_mention", cinc.a());
                ekgiVarH.i("$primary+message_send_receive_attempt", bqop.a());
                ekgiVarH.i("$primary+message_spam", bqrh.a());
                ekgiVarH.i("$primary+message_star", bqsn.a());
                ekgiVarH.i("$primary+message_status", bquc.a());
                ekgiVarH.i("$primary+messages", bred.a());
                ekgiVarH.i("$primary+mls_epoch_records", cceo.a());
                ekgiVarH.i("$primary+mls_group_states", ccfv.a());
                ekgiVarH.i("$primary+mls_key_packages", cchb.a());
                ekgiVarH.i("$primary+mls_messages", ccks.a());
                ekgiVarH.i("$primary+mls_processed_results", ccmg.a());
                ekgiVarH.i("$primary+mls_zinnia_states", ccnj.a());
                ekgiVarH.i("$primary+modified_by", brfl.a());
                ekgiVarH.i("$primary+my_identities", awxi.a());
                ekgiVarH.i("$primary+smarts_personalization_decayed_feature_values", brgu.a());
                ekgiVarH.i("$primary+smarts_personalization_features", brhw.a());
                ekgiVarH.i("$primary+smarts_personalization_normalized_feature_values", brja.a());
                ekgiVarH.i("$primary+p2p_conversation_suggestion_event", brli.a());
                ekgiVarH.i("$primary+p2p_suggestions", brnl.a());
                ekgiVarH.i("$primary+parent_disallowed_conversations", brot.a());
                ekgiVarH.i("$primary+participants_audit_log", brve.a());
                ekgiVarH.i("$primary+participants", bsby.a());
                ekgiVarH.i("$primary+parts", bsjm.a());
                ekgiVarH.i("$primary+pending_incoming_message_rcs_table", bsmw.a());
                ekgiVarH.i("$primary+phone_number_min_match_guesser", bsnx.a());
                ekgiVarH.i("$primary+pii_hash", bspf.a());
                ekgiVarH.i("$primary+pipeline_work", bsrh.a());
                ekgiVarH.i("$primary+profiles_table", bsus.a());
                ekgiVarH.i("$primary+rbm_business_info_properties", bswg.a());
                ekgiVarH.i("$primary+rbm_business_info", bsyo.a());
                ekgiVarH.i("$primary+rbm_business_verifier_info", bszy.a());
                ekgiVarH.i("$primary+rcs_remote_capabilities_cache", asuy.a());
                ekgiVarH.i("$primary+read_reports", btbu.a());
                ekgiVarH.i("$primary+received_message_phone_numbers", btcq.a());
                ekgiVarH.i("$primary+recent_expressive_stickers", btef.a());
                ekgiVarH.i("$primary+recent_gifs", btfz.a());
                ekgiVarH.i("$primary+recent_stickers", btgw.a());
                ekgiVarH.i("$primary+reminders", btio.a());
                ekgiVarH.i("$primary+remote_instances", btki.a());
                ekgiVarH.i("$primary+remote_registrations_table", btmg.a());
                ekgiVarH.i("$primary+remote_user_id_info_table", btnk.a());
                ekgiVarH.i("$primary+remote_user_id_to_registration_id", btoo.a());
                ekgiVarH.i("$primary+restore_workflow_executions", btqz.a());
                ekgiVarH.i("$primary+restore_workflow_files", btsq.a());
                ekgiVarH.i("$primary+restore_workflow_scratch_duplicates", bttt.a());
                ekgiVarH.i("$primary+restore_workflow_scratch_suffix", btuv.a());
                ekgiVarH.i("$primary+restore_workflow_scratch_timestamps", btwa.a());
                ekgiVarH.i("$primary+satellite_emergency_details", btwy.a());
                ekgiVarH.i("$primary+scheduled_send", cmcu.a());
                ekgiVarH.i("$primary+self_participants", btyy.a());
                ekgiVarH.i("$primary+self_profiles", buau.a());
                ekgiVarH.i("$primary+settings", bucg.a());
                ekgiVarH.i("$primary+spam_logging_ids_table", csaw.a());
                ekgiVarH.i("$primary+sqlite_master", budj.a());
                ekgiVarH.i("$primary+sqlite_stat1", buej.a());
                ekgiVarH.i("$primary+sticker_sets_localization", bufh.a());
                ekgiVarH.i("$primary+sticker_sets", bugz.a());
                ekgiVarH.i("$primary+stickers_localization", buie.a());
                ekgiVarH.i("$primary+stickers", bujo.a());
                ekgiVarH.i("$primary+subscriptions", axes.a());
                ekgiVarH.i("$primary+supersort_labels", bukv.a());
                ekgiVarH.i("$primary+trigger_flags", bulq.a());
                ekgiVarH.i("$primary+user_references", buyy.a());
                ekgiVarH.i("$primary+verified_sms_blacklisted_senders", buzq.a());
                ekgiVarH.i("$primary+verified_sms_brands", bvba.a());
                ekgiVarH.i("$primary+verified_sms_senders", bvbv.a());
                ekgiVarH.i("$primary+vmt", bvdd.a());
                ekgiVarH.i("$primary+work_queue", cbfk.a());
                ekgiVarH.i("$primary+work_queue_work_manager_ids", cbkr.a());
                return ekgiVarH.h();
            case 10:
                return new aazr(this.a.t);
            case 11:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                cgbg cgbgVar = (cgbg) ahknVar3.a.qD.b();
                ahng ahngVar2 = ahknVar3.b;
                return new abrv(context, cgbgVar, ahngVar2.y(), ahngVar2.z(), ahngVar2.A());
            case 12:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar = ahknVar4.a;
                return new agkx((fdjx) ahnhVar.m.b(), ahnhVar.Wx, ahknVar4.b.K(), (egsh) ahknVar4.dG.b());
            case 13:
                return new eoqr();
            case 14:
                return new ckla(this.a.a.rF);
            case 15:
                ahnh ahnhVar2 = this.a.a;
                return ekhx.r((devu) ahnhVar2.rk.b(), (devu) ahnhVar2.Qa.b());
            case 16:
                final eyik eyikVar = this.a.a.oO;
                return new aqax() { // from class: apkn
                    @Override // defpackage.aqax
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.trigger_rcs_provisioning_after_fi_sim_activation");
                    }
                };
            case 17:
                final eyik eyikVar2 = this.a.a.oO;
                return new apvb() { // from class: apcg
                    @Override // defpackage.apvb
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.ignore_reconfiguration_for_tachygram");
                    }
                };
            case 18:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar3 = ahknVar5.a;
                return new ahfq(ahnhVar3.sh, ahnhVar3.sd, ahnhVar3.rY, ahnhVar3.Qa, (eosd) ahknVar5.y.b(), (eosd) ahknVar5.aJ.b(), ahnhVar3.ZU, ahnhVar3.PR);
            case 19:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar4 = ahknVar6.a;
                eyik eyikVar3 = ahnhVar4.CT;
                eyik eyikVar4 = ahnhVar4.c;
                eyik eyikVar5 = ahnhVar4.yw;
                ahng ahngVar3 = ahknVar6.b;
                return new ckzd(eyikVar3, ahknVar6.cI, ahknVar6.cD, ahknVar6.aT, ahknVar6.aN, eyikVar4, eyikVar5, ahngVar3.u, Optional.of(ahnhVar4.qH), ahngVar3.ak, ahknVar6.nu, ahnhVar4.adD, ahngVar3.al, ahngVar3.am, ahnhVar4.VZ, ahngVar3.an, ahnhVar4.Js, ahngVar3.ao);
            case 20:
                ahkn ahknVar7 = this.a;
                Context context2 = (Context) ahknVar7.t.b();
                ahnh ahnhVar5 = ahknVar7.a;
                bvkr bvkrVar = (bvkr) ahnhVar5.wa.b();
                crny crnyVar = (crny) ahnhVar5.pf.b();
                cqzr cqzrVar = (cqzr) ahnhVar5.pd.b();
                ajhd ajhdVar = (ajhd) ahnhVar5.yw.b();
                ains ainsVar = (ains) ahnhVar5.c.b();
                eygg eyggVarA = eyie.a(ahnhVar5.ZN);
                eyik eyikVar6 = ahnhVar5.qr;
                crqx crqxVar = (crqx) ahknVar7.gF.b();
                cqbm cqbmVar = (cqbm) ahnhVar5.rY.b();
                crmx crmxVar = (crmx) ahnhVar5.pB.b();
                cpch cpchVar = (cpch) ahnhVar5.qj.b();
                crqv crqvVar = (crqv) ahknVar7.aT.b();
                crma crmaVar = (crma) ahknVar7.da.b();
                cogw cogwVar = (cogw) ahknVar7.cD.b();
                Optional optional = (Optional) ahknVar7.dn.b();
                aivj aivjVar = (aivj) ahknVar7.nx.b();
                cpdm cpdmVar = (cpdm) ahnhVar5.Wt.b();
                chwq chwqVar = (chwq) ahnhVar5.uu.b();
                aiwu aiwuVar = (aiwu) ahknVar7.kc.b();
                aiwq aiwqVar = (aiwq) ahknVar7.nu.b();
                aiul aiulVar = (aiul) ahnhVar5.Wv.b();
                eosc eoscVar = (eosc) ahknVar7.y.b();
                eosc eoscVar2 = (eosc) ahknVar7.p.b();
                eosc eoscVar3 = (eosc) ahknVar7.aJ.b();
                dhes dhesVar = (dhes) ahknVar7.aP.b();
                ahng ahngVar4 = ahknVar7.b;
                return new ajat(context2, bvkrVar, crnyVar, cqzrVar, ajhdVar, ainsVar, eyggVarA, eyikVar6, crqxVar, cqbmVar, crmxVar, cpchVar, crqvVar, crmaVar, cogwVar, optional, aivjVar, cpdmVar, chwqVar, aiwuVar, aiwqVar, aiulVar, eoscVar, eoscVar2, eoscVar3, dhesVar, ahngVar4.bb(), ahngVar4.D, Optional.of(ahknVar7.cp()), Optional.of(ahknVar7.fv()), ahngVar4.F, ahngVar4.G, ahngVar4.K, ahnhVar5.QE, ahngVar4.M, Optional.of(ahngVar4.W), ahngVar4.X, ahngVar4.Y, ahngVar4.Z, ahnhVar5.NH, Optional.of(ahknVar7.oE), Optional.of(ahnhVar5.aeK), Optional.empty(), ahnhVar5.tG, ahngVar4.aa, ahnhVar5.wc, ahngVar4.ad, ahnhVar5.MP, ahnhVar5.WC, ahngVar4.ag, ahnhVar5.ri, ahngVar4.ah, ahknVar7.lW, ahnhVar5.sh, ahnhVar5.BD, ahngVar4.ai, ahnhVar5.yi, ahnhVar5.rd, ahnhVar5.qi);
            case 21:
                ahkn ahknVar8 = this.a;
                eyik eyikVar7 = ahknVar8.t;
                ahng ahngVar5 = ahknVar8.b;
                eyik eyikVar8 = ahngVar5.u;
                ahnh ahnhVar6 = ahknVar8.a;
                return new ayds(eyikVar7, eyikVar8, ahnhVar6.c, ahngVar5.B, ahnhVar6.CS, ahnhVar6.Cr, ahknVar8.y, ahknVar8.aJ, ahngVar5.C);
            case 22:
                ahkn ahknVar9 = this.a;
                ahng ahngVar6 = ahknVar9.b;
                ajat ajatVar = (ajat) ahngVar6.u.b();
                ahnh ahnhVar7 = ahknVar9.a;
                aijz aijzVar = (aijz) ahnhVar7.WP.b();
                cqbm cqbmVar2 = (cqbm) ahnhVar7.rY.b();
                return new ajbk(ajatVar, aijzVar, cqbmVar2, (eosc) ahknVar9.aJ.b(), ahngVar6.v, ahngVar6.A, (eosc) ahknVar9.p.b(), ahnhVar7.yp, ahnhVar7.rd, ahnhVar7.ru);
            case 23:
                ahkn ahknVar10 = this.a;
                return new cqrq(ahknVar10.ee, (Context) ahknVar10.t.b(), (cogw) ahknVar10.cD.b(), (dcdt) ahknVar10.dk.b(), (crqv) ahknVar10.aT.b(), (eosc) ahknVar10.p.b(), (eosc) ahknVar10.aJ.b());
            case 24:
                ahkn ahknVar11 = this.a;
                ahng ahngVar7 = ahknVar11.b;
                return new cqrx((cqrq) ahngVar7.v.b(), (eosc) ahknVar11.p.b(), ahngVar7.cZ(), new cqsh(), ahngVar7.z);
            case 25:
                return new cqrd((ecjh) this.a.b.w.b());
            case 26:
                ahkn ahknVar12 = this.a;
                return cqre.a(cqqs.a(), ahknVar12.ev(), (ecev) ahknVar12.aL.b());
            case 27:
                final eyik eyikVar9 = this.a.a.oO;
                return new aseb() { // from class: asdz
                    @Override // defpackage.aseb
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.enable_rcs_disabled_v2_survey");
                    }
                };
            case 28:
                return new cqsd(this.a.b.aA());
            case 29:
                return Long.valueOf(fajq.a(this.a.a.nL()));
            case 30:
                ahkn ahknVar13 = this.a;
                eyik eyikVar10 = ahknVar13.cD;
                ahnh ahnhVar8 = ahknVar13.a;
                return new dabl(ahnhVar8.yw, ahnhVar8.qr, ahnhVar8.zF, (cogw) eyikVar10.b(), (eosc) ahknVar13.y.b());
            case 31:
                return Optional.of((cmea) this.a.og.b());
            case 32:
                ahkn ahknVar14 = this.a;
                return new cthr(ahknVar14.a.zs, new ankt(), (Executor) ahknVar14.p.b());
            case 33:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar9 = ahknVar15.a;
                return new agzo(ahnhVar9.qr, ahnhVar9.c, (eosc) ahknVar15.y.b());
            case 34:
                return Optional.of((chjr) this.a.b.J.b());
            case 35:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar10 = ahknVar16.a;
                eyik eyikVar11 = ahnhVar10.zF;
                fdjx fdjxVar = (fdjx) ahnhVar10.oS.b();
                eyik eyikVar12 = ahknVar16.cA;
                ahng ahngVar8 = ahknVar16.b;
                return new chkj(eyikVar11, fdjxVar, ahngVar8.bs(), ahnhVar10.tG, ahnhVar10.yD, ahngVar8.H, (fcyh) eyikVar12.b(), ahngVar8.I);
            case 36:
                return new aqaf() { // from class: apjh
                };
            case 37:
                return new chna(this.a.a.qK);
            case 38:
                ahkn ahknVar17 = this.a;
                return new aizf((eosc) ahknVar17.p.b(), (aiul) ahknVar17.a.Wv.b(), ahknVar17.b.L);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return aixb.a((Context) this.a.t.b());
            case 40:
                ahkn ahknVar18 = this.a;
                PackageManager packageManagerU = ahknVar18.U();
                ahng ahngVar9 = ahknVar18.b;
                eexy eexyVar = (eexy) ahngVar9.N.b();
                eosc eoscVar4 = (eosc) ahknVar18.p.b();
                eyik eyikVar13 = ahknVar18.cD;
                eyik eyikVar14 = ahngVar9.O;
                adjb adjbVarI = ahngVar9.I();
                ahnh ahnhVar11 = ahknVar18.a;
                return new adjr(packageManagerU, eexyVar, eoscVar4, eyikVar13, eyikVar14, adjbVarI, ahnhVar11.KR, ahnhVar11.KQ);
            case 41:
                return adim.a((Context) this.a.t.b());
            case 42:
                return adjs.a(this.a.a.qK);
            case 43:
                return Long.valueOf(farm.a(this.a.b.cD()));
            case 44:
                return Long.valueOf(farn.a(this.a.b.cD()));
            case 45:
                return Long.valueOf(farq.a(this.a.b.cD()));
            case 46:
                return Long.valueOf(farp.a(this.a.b.cD()));
            case 47:
                return Long.valueOf(faro.a(this.a.b.cD()));
            case 48:
                return Long.valueOf(fars.a(this.a.b.cD()));
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return Long.valueOf(farr.a(this.a.b.cD()));
            case 50:
                return Long.valueOf(fark.a(this.a.b.cD()));
            case 51:
                return Long.valueOf(farl.a(this.a.b.cD()));
            case 52:
                return new adja(this.a.a.qr);
            case 53:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar12 = ahknVar19.a;
                return new awge(ahnhVar12.qr, ahnhVar12.zR, ahnhVar12.qN, (eosc) ahknVar19.p.b());
            case 54:
                ahkn ahknVar20 = this.a;
                return new cgba(ahknVar20.a.qr, (Context) ahknVar20.t.b());
            case 55:
                ahkn ahknVar21 = this.a;
                return new ufx(ahknVar21.a.zs, new ufp(), (Executor) ahknVar21.p.b(), ahknVar21.b.Y());
            case 56:
                ahng ahngVar10 = this.a.b;
                return ekhx.r(ahngVar10.aU(), ahngVar10.v());
            case 57:
                return new aapz(this.a.b.dc());
            case 58:
                return new aamg(this.a.a.pA);
            case 59:
                ahkn ahknVar22 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar22.cA.b();
                ahnh ahnhVar13 = ahknVar22.a;
                return new cdla(fcyhVar, (fdjx) ahnhVar13.oS.b(), ahnhVar13.rc, ahnhVar13.tG, ahknVar22.b.af);
            case 60:
                ahkn ahknVar23 = this.a;
                return new cdlu((fcyh) ahknVar23.cA.b(), (fdjx) ahknVar23.a.oS.b(), (ecjh) ahknVar23.b.ae.b());
            case 61:
                ahkn ahknVar24 = this.a;
                return cdlv.a(cdll.a(), ahknVar24.ev(), (ecev) ahknVar24.aL.b());
            case 62:
                ahnh ahnhVar14 = this.a.a;
                return new cdnf((cdni) ahnhVar14.vX.b(), (ains) ahnhVar14.pQ.b());
            case Function.ALT_CONVENTION /* 63 */:
                final eyik eyikVar15 = this.a.a.oO;
                return new apsr() { // from class: aoym
                    @Override // defpackage.apsr
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_phone_number_comparison_result_logging_flag");
                    }
                };
            case 64:
                ahkn ahknVar25 = this.a;
                return new ckyz((Context) ahknVar25.t.b(), ahknVar25.dn, ahknVar25.aN, ahknVar25.nq, ahknVar25.b.aj);
            case 65:
                ahkn ahknVar26 = this.a;
                return new cqww((Context) ahknVar26.t.b(), (Optional) ahknVar26.dn.b(), (cqxl) ahknVar26.a.Dv.b());
            case 66:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar15 = ahknVar27.a;
                Object objPz = ahnhVar15.pz();
                ahng ahngVar11 = ahknVar27.b;
                return ekhx.v(objPz, ahngVar11.bd(), (cldy) ahnhVar15.ahj.b(), ahngVar11.cK(), (cldy) ahnhVar15.Qa.b(), ahngVar11.M(), ahngVar11.bz(), ahngVar11.N());
            case 67:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar16 = ahknVar28.a;
                Object objPz2 = ahnhVar16.pz();
                cldt cldtVar = (cldt) ahnhVar16.ahj.b();
                eyik eyikVar16 = ahnhVar16.Qa;
                clow clowVarKd = ahnhVar16.kd();
                ahng ahngVar12 = ahknVar28.b;
                return ekhx.v(objPz2, cldtVar, clowVarKd, ahngVar12.cK(), (cldt) eyikVar16.b(), ahngVar12.M(), ahngVar12.bz(), ahngVar12.N(), ahnhVar16.kf());
            case 68:
                return Optional.of(this.a.b.cN());
            case 69:
                return new clbr((egsh) this.a.dG.b());
            case 70:
                return Optional.of(this.a.b.bj());
            case 71:
                return new ebbz(this.a.b.cS());
            case 72:
                final ejwi ejwiVarJ = ejwi.j(dqlh.a());
                return new ebcg() { // from class: dqlf
                    @Override // defpackage.ebcg
                    public final void a() {
                        dqlg.d = (dqlg) ((ejwt) ejwiVarJ).a;
                    }
                };
            case 73:
                ahkn ahknVar29 = this.a;
                return ehru.a((Context) ahknVar29.t.b(), ahknVar29.b.a());
            case 74:
                final ekhx ekhxVarQ = ekhx.q();
                return new ebcg() { // from class: eiee
                    @Override // defpackage.ebcg
                    public final void a() {
                        eifo.a = 1;
                        eick.a = 3;
                        eifb.a = 1;
                        Set set = ekhxVarQ;
                        if (!set.isEmpty()) {
                            eidc.t(ekhx.o(set));
                        }
                        eicm.a = 3;
                    }
                };
            case 75:
                this.a.a.mz();
                return new ebcg() { // from class: dzlt
                    @Override // defpackage.ebcg
                    public final void a() {
                        Boolean bool = false;
                        bool.getClass();
                    }
                };
            case 76:
                ahkn ahknVar30 = this.a;
                final Context context3 = (Context) ahknVar30.t.b();
                ahng ahngVar13 = ahknVar30.b;
                final Set setCW = ahngVar13.cW();
                final ejwi ejwiVarJ2 = ejwi.j(ahngVar13.cv());
                final ebbw ebbwVarDY = ahknVar30.dY();
                final ejwi ejwiVarH = ejwi.h();
                final eyik eyikVar17 = ahngVar13.aw;
                return new ebcg() { // from class: ebcb
                    /* JADX WARN: Type inference failed for: r2v2, types: [ejvr, java.lang.Object] */
                    @Override // defpackage.ebcg
                    public final void a() {
                        Set set = setCW;
                        ebbw ebbwVar = ebbwVarDY;
                        if (set.isEmpty() && !ebbwVar.a()) {
                            Boolean bool = false;
                            bool.getClass();
                            return;
                        }
                        fcsu fcsuVar = eyikVar17;
                        ejwi ejwiVar = ejwiVarJ2;
                        Application application = (Application) context3;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((ejwt) ejwiVar).a.apply(new ebcc(application, ejwiVar, set, ebbwVar, fcsuVar)));
                    }
                };
            case 77:
                ahng ahngVar14 = this.a.b;
                return ekhx.s(ahngVar14.b(), new ehrq(), ahngVar14.c());
            case 78:
                return new ehjt();
            case 79:
                return egno.a((fcyh) this.a.a.Rm.b());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                final Context context4 = (Context) this.a.t.b();
                return new ebcg() { // from class: ehva
                    @Override // defpackage.ebcg
                    public final void a() {
                        ecdx ecdxVar = new ecdx(new ecea());
                        ecdy ecdyVar = new ecdy(context4);
                        synchronized (ecdx.b) {
                            if (ecdy.a != null) {
                                return;
                            }
                            ecdy.a = ecdyVar;
                            if (ecdx.c == null) {
                                ecdx.c = new ecec();
                            }
                            if (Security.insertProviderAt(ecdx.c, 1) != 1) {
                                throw new RuntimeException("Failed to install SslGuard with top priority.");
                            }
                            eceb ecebVar = ecdxVar.d;
                            eceb ecebVar2 = ecee.a;
                            if (ecebVar == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            ecee.a = ecebVar;
                            eceb ecebVar3 = ecdxVar.d;
                            eceb ecebVar4 = eced.a;
                            if (ecebVar3 == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            eced.a = ecebVar3;
                            ecdx.b();
                            ecdx.a();
                            Log.i(ecdx.a, "SslGuard completed installation.");
                        }
                    }
                };
            case 81:
                ahkn ahknVar31 = this.a;
                final ekhx ekhxVarQ2 = ekhx.q();
                final ejwi ejwiVarJ3 = ejwi.j(Boolean.valueOf(ahknVar31.b.de()));
                return new ebcg() { // from class: eiiz
                    @Override // defpackage.ebcg
                    public final void a() {
                        Set set = ekhxVarQ2;
                        if (!set.isEmpty()) {
                            eidc.t(ekhx.o(set));
                        }
                        if (((Boolean) ((ejwt) ejwiVarJ3).a).booleanValue()) {
                            eidc.a = false;
                        } else {
                            eidc.a = true;
                        }
                    }
                };
            case 82:
                return new ebty((Context) this.a.t.b());
            case 83:
                ahkn ahknVar32 = this.a;
                ahknVar32.dY();
                Optional optionalEmpty = Optional.empty();
                Optional.empty();
                ahng ahngVar15 = ahknVar32.b;
                return new ehlp(optionalEmpty, ahngVar15.aS, ahngVar15.aU, ahngVar15.aV);
            case 84:
                ahkn ahknVar33 = this.a;
                Context context5 = (Context) ahknVar33.t.b();
                ebbw ebbwVarDY2 = ahknVar33.dY();
                ahng ahngVar16 = ahknVar33.b;
                return new ehlo(context5, ebbwVarDY2, ahngVar16.cU(), ahngVar16.cR(), (eosc) ahknVar33.y.b(), eyie.a(ahknVar33.a.k), ahknVar33.aI, ahknVar33.aV);
            case 85:
                final egca egcaVarME = this.a.a.mE();
                return new ehlj() { // from class: egcg
                    @Override // defpackage.ehlj
                    public final ListenableFuture a() {
                        egoc.d("com/google/apps/tiktok/account/data/AccountProviderModule", "getApplicationStartupListeners", 30, egcaVarME.b(), "Failed account invalidation.", new Object[0]);
                        return eorv.a;
                    }
                };
            case 86:
                final Context context6 = (Context) this.a.t.b();
                return new ehlj() { // from class: ehuz
                    @Override // defpackage.ehlj
                    public final ListenableFuture a() throws PackageManager.NameNotFoundException, IOException, ErrnoException {
                        Context context7 = context6;
                        try {
                            PackageInfo packageInfo = context7.getPackageManager().getPackageInfo(context7.getPackageName(), 0);
                            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                                try {
                                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                        return eorv.a;
                    }
                };
            case 87:
                return new dstp((dssy) this.a.b.aJ.b());
            case 88:
                ahkn ahknVar34 = this.a;
                eosc eoscVar5 = (eosc) ahknVar34.hF.b();
                eyik eyikVar18 = ahknVar34.hU;
                eygg eyggVarA2 = eyie.a(ahknVar34.hg);
                String str = (String) ahknVar34.gK.b();
                ahknVar34.dP();
                return new dste(eoscVar5, eyikVar18, eyggVarA2, str, eyie.a(ahknVar34.b.aI));
            case 89:
                ahkn ahknVar35 = this.a;
                return dsdv.a((dsdm) ahknVar35.b.aH.b(), (fdjx) ahknVar35.a.m.b());
            case 90:
                ahkn ahknVar36 = this.a;
                return new dsdu((dxmn) ahknVar36.hK.b(), eyie.a(ahknVar36.hd), (fcyh) ahknVar36.cz.b(), (Context) ahknVar36.t.b(), ahknVar36.b.cT(), (diep) ahknVar36.l.b());
            case 91:
                return Long.valueOf(dsob.b());
            case 92:
                ahkn ahknVar37 = this.a;
                eyik eyikVar19 = ahknVar37.hU;
                Context context7 = (Context) ahknVar37.t.b();
                eyik eyikVar20 = ahknVar37.bM;
                dsoa dsoaVarMq = ahknVar37.a.mq();
                eyik eyikVar21 = ahknVar37.hz;
                fcyh fcyhVar2 = (fcyh) eyikVar20.b();
                fcyh fcyhVar3 = (fcyh) ahknVar37.cA.b();
                ahng ahngVar17 = ahknVar37.b;
                return new dsni(eyikVar19, context7, dsoaVarMq, ahngVar17.aF, ahngVar17.aE, eyikVar21, fcyhVar2, fcyhVar3);
            case 93:
                return Long.valueOf(dsob.a(((Boolean) this.a.hz.b()).booleanValue()));
            case 94:
                ahkn ahknVar38 = this.a;
                return ehjd.a((eheg) ahknVar38.a.tL.b(), ahknVar38.dY(), ejwi.h());
            case 95:
                ahkn ahknVar39 = this.a;
                return ehje.a((eaaa) ahknVar39.bg.b(), ahknVar39.b.cq(), ahknVar39.dY(), ejwi.h());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahkn ahknVar40 = this.a;
                return ehfk.a(ekgp.k(), ekgp.k(), ahknVar40.fP(), (Map) ahknVar40.bn.b(), (Map) ahknVar40.bq.b());
            case 97:
                ahkn ahknVar41 = this.a;
                return ehfl.a(ekgp.k(), ahknVar41.fP(), (Map) ahknVar41.bn.b(), (Map) ahknVar41.bq.b());
            case 98:
                ahkn ahknVar42 = this.a;
                return new ehyx(ahknVar42.b.aQ, ((Boolean) ahknVar42.bC.b()).booleanValue());
            case 99:
                ahkn ahknVar43 = this.a;
                return ehyq.a(((Boolean) ahknVar43.bC.b()).booleanValue(), ahknVar43.a.aot, ahknVar43.b.aP);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new ehws();
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ebbw ebbwVarDY = ahknVar.dY();
                ExecutorService executorService = (ExecutorService) ahknVar.p.b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ahknVar.y.b();
                ahng ahngVar = ahknVar.b;
                return new ehms(context, ebbwVarDY, executorService, scheduledExecutorService, ahknVar.P(), ahngVar.cU(), ahngVar.cR(), eyie.a(ahngVar.aT));
            case 102:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                ecmf ecmfVar = (ecmf) ahknVar2.gN.b();
                context2.getClass();
                ecmfVar.getClass();
                ecnr ecnrVar = ehms.a;
                String strA = ebbu.a(context2);
                strA.getClass();
                return ecmfVar.a("StartupAfterPackageReplacedImplDatabase_".concat(new fdgl("[^A-Za-z0-9\\-_:]").b(strA, "_")), ehms.a);
            case 103:
                return new egrs((Executor) this.a.aJ.b());
            case 104:
                ahkn ahknVar3 = this.a;
                return new ehcz((Context) ahknVar3.t.b(), (eosc) ahknVar3.y.b(), (egoc) ahknVar3.a.k.b(), ahknVar3.b.aZ);
            case 105:
                ahng ahngVar2 = this.a.b;
                return new ehda(ahngVar2.cu(), ahngVar2.aY, eyim.a);
            case 106:
                return new ekph(this.a.b.cs());
            case 107:
                ahng ahngVar3 = this.a.b;
                return ekhx.t((ekue) ahngVar3.bb.b(), (ekue) ahngVar3.bh.b(), (ekue) ahngVar3.bi.b(), (ekue) ahngVar3.bk.b());
            case 108:
                final ehqf ehqfVar = (ehqf) this.a.a.abg.b();
                return new ekue() { // from class: ehqg
                    @Override // defpackage.ekue
                    public final ekta a(String str) {
                        return new ehqh(str, ehqfVar);
                    }
                };
            case 109:
                ahkn ahknVar4 = this.a;
                Context context3 = (Context) ahknVar4.t.b();
                final eygg eyggVarA = eyie.a(ahknVar4.dA);
                ahng ahngVar4 = ahknVar4.b;
                eyik eyikVar = ahngVar4.bg;
                Object objB = ahngVar4.be.b();
                dcai dcaiVar = (dcai) eyikVar.b();
                String strFF = ahknVar4.fF();
                eyggVarA.getClass();
                final esvt esvtVar = new esvt(context3, (ehqd) objB, dcaiVar, new fcsu() { // from class: ehpz
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (esvf) eyggVarA.b();
                    }
                }, strFF);
                return new ekue() { // from class: ehqa
                    @Override // defpackage.ekue
                    public final ekta a(String str) {
                        return esvtVar;
                    }
                };
            case 110:
                ahkn ahknVar5 = this.a;
                ahng ahngVar5 = ahknVar5.b;
                return new ehqd((esvw) ahngVar5.bc.b(), eyie.a(ahknVar5.a.pI), (ehqc) ahngVar5.bd.b());
            case 111:
                ahkn ahknVar6 = this.a;
                Context context4 = (Context) ahknVar6.t.b();
                final eygg eyggVarA2 = eyie.a(ahknVar6.dA);
                ejwi ejwiVarJ = ejwi.j(true);
                eyggVarA2.getClass();
                return new esvw(context4, new fcsu() { // from class: ehpz
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (esvf) eyggVarA2.b();
                    }
                }, ((Boolean) ejwiVarJ.e(false)).booleanValue());
            case 112:
                return new ehqc();
            case 113:
                return new dcai(this.a.b.bf);
            case 114:
                ekur ekurVar = ekut.c;
                String str = ekurVar.a;
                int i2 = ekurVar.f;
                return new ekur(2, ekurVar.b, true, ekurVar.d, ekurVar.e);
            case 115:
                return new dzid((dzie) this.a.b.bj.b());
            case 116:
                return new dzie((dzik) this.a.W.b());
            case 117:
                ahkn ahknVar7 = this.a;
                return ekhx.r((ebcd) ahknVar7.a.abg.b(), ahknVar7.fm());
            case 118:
                ahkn ahknVar8 = this.a;
                return new cmwx((Context) ahknVar8.t.b(), (ScheduledExecutorService) ahknVar8.y.b(), (ScheduledExecutorService) ahknVar8.aJ.b(), ahknVar8.da, (eigp) ahknVar8.aI.b(), ahknVar8.cI, ahknVar8.b.bW);
            case 119:
                ahkn ahknVar9 = this.a;
                cmwh cmwhVar = cmwh.APP_CREATED;
                ahng ahngVar6 = ahknVar9.b;
                return ekgp.n(cmwhVar, ahngVar6.bs, cmwh.PERMISSIONS_ACQUIRED, ahngVar6.bD, cmwh.APP_INTERACTIVE, ahngVar6.bV);
            case 120:
                return new ekph(this.a.b.bH());
            case 121:
                ahkn ahknVar10 = this.a;
                Context context5 = (Context) ahknVar10.t.b();
                eyik eyikVar2 = ahknVar10.aJ;
                ahnh ahnhVar = ahknVar10.a;
                eyik eyikVar3 = ahnhVar.c;
                eyik eyikVar4 = ahnhVar.EV;
                eyik eyikVar5 = ahnhVar.us;
                eyik eyikVar6 = ahnhVar.yw;
                eyik eyikVar7 = ahnhVar.FP;
                eyik eyikVar8 = ahnhVar.rm;
                eyik eyikVar9 = ahnhVar.Cp;
                eosc eoscVar = (eosc) eyikVar2.b();
                eyik eyikVar10 = ahnhVar.Ci;
                eyik eyikVar11 = ahnhVar.rC;
                eyik eyikVar12 = ahnhVar.pA;
                eyik eyikVar13 = ahnhVar.Cw;
                ahng ahngVar7 = ahknVar10.b;
                eyik eyikVar14 = ahngVar7.bp;
                return new aijc(context5, ahknVar10.aN, eyikVar3, eyikVar4, ahngVar7.bo, eyikVar5, eyikVar6, eyikVar7, eyikVar8, ahknVar10.cI, eyikVar9, eoscVar, eyikVar10, eyikVar11, eyikVar12, eyikVar13, eyikVar14);
            case 122:
                ahkn ahknVar11 = this.a;
                eyik eyikVar15 = ahknVar11.a.pb;
                aiof aiofVarAc = ahknVar11.ac();
                eyikVar15.getClass();
                return aiofVarAc.a(eyikVar15);
            case 123:
                return Boolean.valueOf(((ehdm) this.a.a.nM().a.b()).a("com.google.android.apps.messaging.auto", "45370282").e());
            case 124:
                ahkn ahknVar12 = this.a;
                return new cuet((Context) ahknVar12.t.b(), ahknVar12.bA, ahknVar12.a.c, (eosc) ahknVar12.y.b());
            case 125:
                ahng ahngVar8 = this.a.b;
                return ekhx.r(ahngVar8.bI(), ahngVar8.bg());
            case 126:
                ahkn ahknVar13 = this.a;
                Context context6 = (Context) ahknVar13.t.b();
                ahnh ahnhVar2 = ahknVar13.a;
                eygg eyggVarA3 = eyie.a(ahnhVar2.pf);
                eygg eyggVarA4 = eyie.a(ahnhVar2.wH);
                eosc eoscVar2 = (eosc) ahknVar13.y.b();
                eyik eyikVar16 = ahnhVar2.ZE;
                eyik eyikVar17 = ahnhVar2.Jd;
                ahng ahngVar9 = ahknVar13.b;
                return new aijf(context6, ahknVar13.aT, eyggVarA3, eyggVarA4, eoscVar2, eyikVar16, eyikVar17, ahknVar13.cI, ahngVar9.bA, ahngVar9.bB);
            case 127:
                ahkn ahknVar14 = this.a;
                Context context7 = (Context) ahknVar14.t.b();
                Executor executor = (Executor) ahknVar14.y.b();
                eosc eoscVar3 = (eosc) ahknVar14.aJ.b();
                ahnh ahnhVar3 = ahknVar14.a;
                fdjx fdjxVar = (fdjx) ahnhVar3.oQ.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar3.oS.b();
                eyik eyikVar18 = ahnhVar3.amv;
                egpm egpmVar = (egpm) ahknVar14.dR.b();
                ahng ahngVar10 = ahknVar14.b;
                return new cmkg(context7, executor, eoscVar3, fdjxVar, fdjxVar2, eyikVar18, egpmVar, ahknVar14.aI, ahknVar14.nv, ahngVar10.bw, ahngVar10.bx, ahngVar10.by, ahngVar10.bz);
            case 128:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar4 = ahknVar15.a;
                ahng ahngVar11 = ahknVar15.b;
                return new cmki(ahngVar11.bt, ahnhVar4.amg, ahnhVar4.oS, ahknVar15.dG, ahngVar11.bv, ahnhVar4.amj);
            case 129:
                return Long.valueOf(((ehdm) this.a.a.oC().a.b()).a("com.google.android.apps.messaging.auto", "45408542").b());
            case 130:
                return (evrj) ((ehdm) this.a.a.oC().a.b()).a("com.google.android.apps.messaging.auto", "45651114").c();
            case 131:
                return new cmkp(this.a.a.rF);
            case 132:
                ahkn ahknVar16 = this.a;
                return new cmlo((Context) ahknVar16.t.b(), (fdjx) ahknVar16.a.oS.b());
            case 133:
                final eyik eyikVar19 = this.a.a.oO;
                return new aqsm() { // from class: aqqg
                    @Override // defpackage.aqsm
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_context_registered_receiver");
                    }
                };
            case 134:
                final eyik eyikVar20 = this.a.a.oO;
                return new aqsp() { // from class: aqqm
                    @Override // defpackage.aqsp
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.enable_manifest_registered_receiver");
                    }
                };
            case 135:
                ahnh ahnhVar5 = this.a.a;
                return new ckzf(ahnhVar5.wF, ahnhVar5.wE);
            case 136:
                ahng ahngVar12 = this.a.b;
                return ekhx.v((cmwg) ahngVar12.bE.b(), ahngVar12.bD(), ahngVar12.bE(), (cmwg) ahngVar12.bI.b(), ahngVar12.g(), ahngVar12.w(), ahngVar12.bK(), ahngVar12.bh(), ahngVar12.B(), ahngVar12.bc(), ahngVar12.bk(), ahngVar12.bU(), ahngVar12.be(), ahngVar12.aW(), ahngVar12.O(), ahngVar12.bJ(), ahngVar12.bv(), ahngVar12.bl());
            case 137:
                ahkn ahknVar17 = this.a;
                eyik eyikVar21 = ahknVar17.aJ;
                ahnh ahnhVar6 = ahknVar17.a;
                return new avnj(ahnhVar6.AQ, ahnhVar6.AS, (eosc) eyikVar21.b());
            case 138:
                ahkn ahknVar18 = this.a;
                egqi egqiVar = (egqi) ahknVar18.ll.b();
                ahnh ahnhVar7 = ahknVar18.a;
                return new csya(egqiVar, (fdjx) ahnhVar7.oQ.b(), ahnhVar7.Wk, ahknVar18.b.bB(), (crma) ahknVar18.da.b(), (cogw) ahknVar18.cD.b());
            case 139:
                ahkn ahknVar19 = this.a;
                eyik eyikVar22 = ahknVar19.aJ;
                ahnh ahnhVar8 = ahknVar19.a;
                eyik eyikVar23 = ahnhVar8.MD;
                eosc eoscVar4 = (eosc) eyikVar22.b();
                ahng ahngVar13 = ahknVar19.b;
                return new casr(eyikVar23, ahngVar13.bG, ahnhVar8.MT, ahngVar13.bH, ahnhVar8.c, eoscVar4);
            case 140:
                ahkn ahknVar20 = this.a;
                return new casm((Context) ahknVar20.t.b(), (eigp) ahknVar20.aI.b());
            case 141:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar9 = ahknVar21.a;
                Set setDd = ahknVar21.b.dd();
                return new bxig(setDd, ahnhVar9.aeL);
            case 142:
                return new aalr(this.a.b.db());
            case 143:
                aalw aalwVar = new aalw();
                ahng ahngVar14 = this.a.b;
                return new aalx(aalwVar, ahngVar14.s(), ahngVar14.bM);
            case 144:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar10 = ahknVar22.a;
                dqsn dqsnVar = (dqsn) ahnhVar10.qq.b();
                eyik eyikVar24 = ahnhVar10.sL;
                apty aptyVar = (apty) ahnhVar10.zU.b();
                ahng ahngVar15 = ahknVar22.b;
                return new aanu(dqsnVar, ahngVar15.bJ, ahngVar15.bL, eyikVar24, aptyVar);
            case 145:
                ahkn ahknVar23 = this.a;
                return new aamb(ahknVar23.y, ahknVar23.p, ahknVar23.b.ab);
            case 146:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar11 = ahknVar24.a;
                eyik eyikVar25 = ahnhVar11.Go;
                ahng ahngVar16 = ahknVar24.b;
                return new aanj(eyikVar25, ahngVar16.ac, ahnhVar11.pV, ahnhVar11.uJ, ahnhVar11.qi, ahngVar16.ab, ahnhVar11.qG, ahnhVar11.pf, ahnhVar11.Am, ahnhVar11.oS, ahngVar16.bK, ahnhVar11.pb, ahngVar16.bo, ahnhVar11.Ax, ahnhVar11.Bm);
            case 147:
                return new eizx();
            case 148:
                aalw aalwVar2 = new aalw();
                ahng ahngVar17 = this.a.b;
                return new aaoi(aalwVar2, ahngVar17.u(), ahngVar17.t());
            case 149:
                return new cmfk((ecjh) this.a.b.bQ.b());
            case 150:
                ahkn ahknVar25 = this.a;
                return ahknVar25.ev().a(ahknVar25.b.cr(), (ecev) ahknVar25.aL.b());
            case 151:
                return new bwno(this.a.a.rF);
            case 152:
                final eyik eyikVar26 = this.a.a.oO;
                return new arha() { // from class: argk
                    @Override // defpackage.arha
                    public final boolean a() {
                        return ((eoth) eyikVar26.b()).a("bugle.cslib_cleanup_e2ee_jibe_service_listener");
                    }
                };
            case 153:
                return new cawf(this.a.a.rF);
            case 154:
                cqcf cqcfVar = new cqcf();
                ahng ahngVar18 = this.a.b;
                return ekhx.t(cqcfVar, (cqax) ahngVar18.ca.b(), new cgiu(), ahngVar18.bL());
            case 155:
                return new cqaw(this.a.b.cY());
            case 156:
                ahkn ahknVar26 = this.a;
                ahng ahngVar19 = ahknVar26.b;
                return ekhx.t((cqae) ahngVar19.e.b(), (cqae) ahknVar26.aM.b(), ahngVar19.bT(), ahngVar19.cM());
            case 157:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar12 = ahknVar27.a;
                return new ceno((fdjx) ahnhVar12.m.b(), (fcyh) ahknVar27.bM.b(), (fcyh) ahknVar27.cA.b(), ahnhVar12.sh, ahnhVar12.rk, ahnhVar12.tJ, ahnhVar12.xc);
            case 158:
                final eyik eyikVar27 = this.a.a.oO;
                return new asgj() { // from class: asfh
                    @Override // defpackage.asgj
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.disable_theme_overlay_application_state_manager");
                    }
                };
            case 159:
                ahkn ahknVar28 = this.a;
                return axgk.a(ahknVar28.b.cd.b(), (Executor) ahknVar28.y.b(), ahknVar28.a.bD());
            case 160:
                return new axiv((axjd) this.a.fo());
            case 161:
                Set<qbx> setCX = this.a.b.cX();
                pzv pzvVar = new pzv();
                for (qbx qbxVar : setCX) {
                    qbxVar.getClass();
                    pzvVar.a.add(qbxVar);
                }
                return pzvVar;
            case 162:
                return new dvbc(new ahou(this.a));
            case 163:
                return new dign(this.a.b.cc());
            case 164:
                ahkn ahknVar29 = this.a;
                return agkz.a(ahknVar29.b.n, ahknVar29.ek());
            case 165:
                ahkn ahknVar30 = this.a;
                egsq egsqVarEk = ahknVar30.ek();
                final eyik eyikVar28 = ahknVar30.b.ci;
                return new egtl(new fcsu() { // from class: clbw
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar28.b();
                    }
                }, egsqVarEk);
            case 166:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar13 = ahknVar31.a;
                fdjx fdjxVar3 = (fdjx) ahnhVar13.oS.b();
                Context context8 = (Context) ahknVar31.t.b();
                eyik eyikVar29 = ahnhVar13.CT;
                ahng ahngVar20 = ahknVar31.b;
                return new clbv(fdjxVar3, context8, eyikVar29, ahknVar31.cI, ahknVar31.cD, ahknVar31.aT, ahnhVar13.yw, ahngVar20.u, ahngVar20.ak, ahknVar31.nu, ahnhVar13.adD, ahngVar20.am, ahngVar20.an, ahnhVar13.Js);
            case 167:
                ahkn ahknVar32 = this.a;
                return avje.a(ahknVar32.b.ck, ahknVar32.ek());
            case 168:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar14 = ahknVar33.a;
                return new avjc((fdjx) ahnhVar14.m.b(), (avjl) ahknVar33.pf.b(), ahnhVar14.ahc, (egsh) ahknVar33.dG.b(), ahknVar33.pg, ahnhVar14.ahb);
            case 169:
                ahkn ahknVar34 = this.a;
                return avca.a(ahknVar34.b.cm, ahknVar34.ek());
            case 170:
                ahnh ahnhVar15 = this.a.a;
                return new avby((fdjx) ahnhVar15.m.b(), ahnhVar15.ahj);
            case 171:
                ahkn ahknVar35 = this.a;
                return avkk.a(ahknVar35.b.co, ahknVar35.ek());
            case 172:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar16 = ahknVar36.a;
                return new avki((fdjx) ahnhVar16.m.b(), (avjl) ahknVar36.pf.b(), ahnhVar16.ahk, (egsh) ahknVar36.dG.b(), ahknVar36.pg, ahnhVar16.ahb);
            case 173:
                ahkn ahknVar37 = this.a;
                return awfz.a(ahknVar37.b.cq, ahknVar37.ek());
            case 174:
                ahkn ahknVar38 = this.a;
                return new awfx((egsh) ahknVar38.dG.b(), (eosc) ahknVar38.p.b());
            case 175:
                ahkn ahknVar39 = this.a;
                return ckgp.a(ahknVar39.b.cG, ahknVar39.ek());
            case 176:
                ahkn ahknVar40 = this.a;
                Context context9 = (Context) ahknVar40.t.b();
                eyik eyikVar30 = ahknVar40.aJ;
                ahnh ahnhVar17 = ahknVar40.a;
                eyik eyikVar31 = ahnhVar17.sd;
                eyik eyikVar32 = ahnhVar17.rs;
                eyik eyikVar33 = ahnhVar17.rY;
                eosc eoscVar5 = (eosc) eyikVar30.b();
                eyik eyikVar34 = ahnhVar17.PO;
                eyik eyikVar35 = ahnhVar17.PS;
                aqaw aqawVarBt = ahnhVar17.bt();
                eyik eyikVar36 = ahnhVar17.rq;
                eyik eyikVar37 = ahnhVar17.ZG;
                eyik eyikVar38 = ahnhVar17.yi;
                eyik eyikVar39 = ahnhVar17.Xu;
                eyik eyikVar40 = ahnhVar17.PX;
                ahng ahngVar21 = ahknVar40.b;
                return new ckgn(context9, eyikVar31, eyikVar32, ahngVar21.ct, ahngVar21.cF, eyikVar33, ahngVar21.cu, eoscVar5, eyikVar34, eyikVar35, aqawVarBt, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40);
            case 177:
                ahkn ahknVar41 = this.a;
                dgtk dgtkVar = (dgtk) ahknVar41.b.cs.b();
                ahnh ahnhVar18 = ahknVar41.a;
                return new dgnj(dgtkVar, (dheq) ahnhVar18.ZE.b(), (dgrs) ahnhVar18.sd.b(), (cebq) ahnhVar18.rq.b());
            case 178:
                return new dgtk();
            case 179:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar19 = ahknVar42.a;
                deyo deyoVar = (deyo) ahnhVar19.PO.b();
                ahng ahngVar22 = ahknVar42.b;
                return new dgkn(deyoVar, (dgnl) ahngVar22.cu.b(), (dgix) ahngVar22.cv.b(), (dheq) ahnhVar19.ZE.b(), (dgkj) ahngVar22.cD.b(), (crny) ahnhVar19.pf.b(), (ExecutorService) ahknVar42.aJ.b(), ahknVar42.dI, ahngVar22.cE);
            case 180:
                return new dgnl(this.a.b.bZ());
            case 181:
                ahkn ahknVar43 = this.a;
                return new dgix((Context) ahknVar43.t.b(), ahknVar43.b.bY(), (crny) ahknVar43.a.pf.b());
            case 182:
                ahkn ahknVar44 = this.a;
                Context context10 = (Context) ahknVar44.t.b();
                ahng ahngVar23 = ahknVar44.b;
                dexx dexxVar = (dexx) ahngVar23.cw.b();
                dhgz dhgzVar = (dhgz) ahknVar44.dx.b();
                dgsy dgsyVar = (dgsy) ahngVar23.cy.b();
                ahnh ahnhVar20 = ahknVar44.a;
                return new dgkj(context10, dexxVar, dhgzVar, dgsyVar, (crmx) ahnhVar20.pB.b(), (dgrs) ahnhVar20.sd.b(), (dhen) ahngVar23.cz.b(), (dheq) ahnhVar20.ZE.b(), ahknVar44.dI, ahnhVar20.rd, ahngVar23.cA, ahnhVar20.rq, ahngVar23.cB, ahngVar23.cC);
            case 183:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar21 = ahknVar45.a;
                return new dexx((dfxx) ahnhVar21.rt.b(), (dhes) ahknVar45.aP.b(), ckhe.a(), (eosc) ahknVar45.aJ.b(), (dexw) ahnhVar21.ru.b());
            case 184:
                ahkn ahknVar46 = this.a;
                return new dgsy((Context) ahknVar46.t.b(), (ecjl) ahknVar46.jI.b(), (deyu) ahknVar46.b.cx.b(), (eosc) ahknVar46.aJ.b(), ahknVar46.dI, ahknVar46.a.ru);
            case 185:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar22 = ahknVar47.a;
                return new deyu((dfxx) ahnhVar22.rt.b(), (dhes) ahknVar47.aP.b(), ckhe.a(), (eosc) ahknVar47.aJ.b(), (dexw) ahnhVar22.ru.b());
            case 186:
                return new dhen((dhhc) this.a.a.sa.b());
            case 187:
                return new dfjv(this.a.a.oO);
            case 188:
                return new dfkk(this.a.a.oO);
            case 189:
                return new dfku(this.a.a.oO);
            case 190:
                final eyik eyikVar41 = this.a.a.oO;
                return new dfmm() { // from class: dfkw
                    @Override // defpackage.dfmm
                    public final boolean a() {
                        return ((eoth) eyikVar41.b()).a("cslib.remove_sim_info_provider_from_provisioning_engine_network_utils");
                    }
                };
            case 191:
                ahkn ahknVar48 = this.a;
                return ckgv.a(ahknVar48.b.cI, ahknVar48.ek());
            case 192:
                ahkn ahknVar49 = this.a;
                Context context11 = (Context) ahknVar49.t.b();
                eyik eyikVar42 = ahknVar49.aJ;
                ahnh ahnhVar23 = ahknVar49.a;
                eyik eyikVar43 = ahnhVar23.sd;
                eyik eyikVar44 = ahnhVar23.rY;
                eosc eoscVar6 = (eosc) eyikVar42.b();
                eyik eyikVar45 = ahnhVar23.rd;
                eyik eyikVar46 = ahnhVar23.rq;
                ahng ahngVar24 = ahknVar49.b;
                return new ckgt(context11, eyikVar43, ahngVar24.ct, ahngVar24.cF, eyikVar44, eoscVar6, eyikVar45, eyikVar46);
            case 193:
                ahkn ahknVar50 = this.a;
                egsq egsqVarEk2 = ahknVar50.ek();
                final eyik eyikVar47 = ahknVar50.b.cL;
                return new egtl(new fcsu() { // from class: clis
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar47.b();
                    }
                }, egsqVarEk2);
            case 194:
                ahkn ahknVar51 = this.a;
                ahnh ahnhVar24 = ahknVar51.a;
                awlc awlcVar = (awlc) ahnhVar24.YR.b();
                ahng ahngVar25 = ahknVar51.b;
                return new clir(awlcVar, ahngVar25.by(), (awzf) ahnhVar24.sI.b(), (awyu) ahnhVar24.qB.b(), (cqbm) ahnhVar24.sX.b(), (egsh) ahknVar51.dG.b(), ahngVar25.cI(), (fdjx) ahnhVar24.oS.b(), (fcyh) ahknVar51.cA.b(), ahngVar25.aJ());
            case 195:
                return Long.valueOf(((ehdm) this.a.b.cH().a.b()).a("com.google.android.apps.messaging.auto", "45629970").b());
            case 196:
                ahkn ahknVar52 = this.a;
                egsq egsqVarEk3 = ahknVar52.ek();
                final eyik eyikVar48 = ahknVar52.b.cP;
                return new egtl(new fcsu() { // from class: cljq
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar48.b();
                    }
                }, egsqVarEk3);
            case 197:
                ahkn ahknVar53 = this.a;
                fdjx fdjxVar4 = (fdjx) ahknVar53.a.m.b();
                ahng ahngVar26 = ahknVar53.b;
                return new cljp(fdjxVar4, ahngVar26.cN, ahngVar26.cO, ahknVar53.aM);
            case 198:
                ahnh ahnhVar25 = this.a.a;
                return new cljs(ahnhVar25.xc, ahnhVar25.sh, ahnhVar25.xI, (cqej) ahnhVar25.qW.b());
            case 199:
                ahkn ahknVar54 = this.a;
                ahnh ahnhVar26 = ahknVar54.a;
                return new cljk(ahnhVar26.rd, (crny) ahnhVar26.pf.b(), ahknVar54.b.cw());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                ahkn ahknVar = this.a;
                egsq egsqVarEk = ahknVar.ek();
                final eyik eyikVar = ahknVar.b.cR;
                return new egtl(new fcsu() { // from class: chli
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar.b();
                    }
                }, egsqVarEk);
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                ahnh ahnhVar = this.a.a;
                return new chlh((fdjx) ahnhVar.oQ.b(), ahnhVar.rU, ahnhVar.rT, ahnhVar.KX, ahnhVar.sL);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                ahkn ahknVar2 = this.a;
                final Context context = (Context) ahknVar2.t.b();
                return new egtj(context, (efyt) ahknVar2.a.aox.b(), ekoj.a, (Executor) ahknVar2.y.b(), (Executor) ahknVar2.p.b(), new ejvr() { // from class: dawm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((dawl) ehlh.a(context, dawl.class, (efwo) obj)).fY();
                    }
                }, "com.google.android.apps.messaging.welcome.v1.consent.ProfilesConsentWorker");
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                ahkn ahknVar3 = this.a;
                final Context context2 = (Context) ahknVar3.t.b();
                return new egtj(context2, (efyt) ahknVar3.a.aox.b(), ekoj.a, (Executor) ahknVar3.y.b(), (Executor) ahknVar3.p.b(), new ejvr() { // from class: chqn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((chqm) ehlh.a(context2, chqm.class, (efwo) obj)).et();
                    }
                }, "com.google.android.apps.messaging.shared.profile.workers.ProfilesRefreshWorker");
            case 204:
                ahkn ahknVar4 = this.a;
                egsq egsqVarEk2 = ahknVar4.ek();
                final eyik eyikVar2 = ahknVar4.b.cW;
                return new egtl(new fcsu() { // from class: cixr
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar2.b();
                    }
                }, egsqVarEk2);
            case 205:
                return new cixq(this.a.b.cV);
            case 206:
                ahkn ahknVar5 = this.a;
                cogw cogwVar = (cogw) ahknVar5.cD.b();
                eosc eoscVar = (eosc) ahknVar5.y.b();
                eosc eoscVar2 = (eosc) ahknVar5.p.b();
                ahnh ahnhVar2 = ahknVar5.a;
                eyik eyikVar3 = ahnhVar2.QG;
                ahng ahngVar = ahknVar5.b;
                return new cixk(cogwVar, eoscVar, eoscVar2, ahnhVar2.Cy, ahknVar5.kw, ahnhVar2.CB, ahnhVar2.qi, ahknVar5.mT, ahngVar.aV(), ahnhVar2.CK, ahnhVar2.sh, (aqmq) eyikVar3.b());
            case 207:
                ahkn ahknVar6 = this.a;
                egsq egsqVarEk3 = ahknVar6.ek();
                final eyik eyikVar4 = ahknVar6.b.dc;
                return new egtl(new fcsu() { // from class: ckic
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar4.b();
                    }
                }, egsqVarEk3);
            case 208:
                ahkn ahknVar7 = this.a;
                eosd eosdVar = (eosd) ahknVar7.p.b();
                eosc eoscVar3 = (eosc) ahknVar7.y.b();
                eyik eyikVar5 = ahknVar7.aJ;
                ahnh ahnhVar3 = ahknVar7.a;
                eyik eyikVar6 = ahnhVar3.pR;
                eosc eoscVar4 = (eosc) eyikVar5.b();
                eyik eyikVar7 = ahnhVar3.PT;
                ahng ahngVar2 = ahknVar7.b;
                return new ckib(ahngVar2.db, ahngVar2.cZ, eosdVar, eoscVar3, eyikVar7, eyikVar6, eoscVar4);
            case 209:
                ahkn ahknVar8 = this.a;
                Context context3 = (Context) ahknVar8.t.b();
                ahnh ahnhVar4 = ahknVar8.a;
                dgrs dgrsVar = (dgrs) ahnhVar4.sd.b();
                deyo deyoVar = (deyo) ahnhVar4.PO.b();
                dheq dheqVar = (dheq) ahnhVar4.ZE.b();
                ahng ahngVar3 = ahknVar8.b;
                return new dgjl(context3, ahngVar3.cY, dgrsVar, deyoVar, dheqVar, (dgjp) ahngVar3.cZ.b(), (dgjq) ahngVar3.da.b(), (eosc) ahknVar8.y.b(), (cebq) ahnhVar4.rq.b(), (cebf) ahnhVar4.yg.b(), (eosc) ahknVar8.aJ.b(), ahnhVar4.PU, ahknVar8.dI);
            case 210:
                return new dblg((Context) this.a.t.b());
            case 211:
                ahkn ahknVar9 = this.a;
                return new dgjp((dgrs) ahknVar9.a.sd.b());
            case 212:
                ahkn ahknVar10 = this.a;
                return new dgjq((dgrs) ahknVar10.a.sd.b(), (diep) ahknVar10.l.b());
            case 213:
                ahkn ahknVar11 = this.a;
                egsq egsqVarEk4 = ahknVar11.ek();
                final eyik eyikVar8 = ahknVar11.b.de;
                return new egtl(new fcsu() { // from class: cmkx
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar8.b();
                    }
                }, egsqVarEk4);
            case 214:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar5 = ahknVar12.a;
                return new cmkw((fdjx) ahnhVar5.oQ.b(), (fcyh) ahknVar12.cA.b(), (cmjl) ahnhVar5.amv.b());
            case 215:
                ahkn ahknVar13 = this.a;
                egsq egsqVarEk5 = ahknVar13.ek();
                final eyik eyikVar9 = ahknVar13.b.dg;
                return new egtl(new fcsu() { // from class: egdp
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar9.b();
                    }
                }, egsqVarEk5);
            case 216:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar6 = ahknVar14.a;
                return new egdo((egcq) ahnhVar6.aod.b(), ahnhVar6.mE(), (Executor) ahknVar14.p.b());
            case 217:
                ahkn ahknVar15 = this.a;
                egsq egsqVarEk6 = ahknVar15.ek();
                final eyik eyikVar10 = ahknVar15.b.di;
                return new egtl(new fcsu() { // from class: ehzf
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar10.b();
                    }
                }, egsqVarEk6);
            case 218:
                ahkn ahknVar16 = this.a;
                return new ehze((ehwx) ahknVar16.b.aQ.b(), (egsh) ahknVar16.dG.b(), ahknVar16.a.mN(), (eosc) ahknVar16.p.b(), ((Boolean) ahknVar16.bC.b()).booleanValue());
            case 219:
                ahkn ahknVar17 = this.a;
                egsq egsqVarEk7 = ahknVar17.ek();
                final eyik eyikVar11 = ahknVar17.b.dk;
                return new egtl(new fcsu() { // from class: ehzp
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar11.b();
                    }
                }, egsqVarEk7);
            case 220:
                ahkn ahknVar18 = this.a;
                return new ehzo((ehwx) ahknVar18.b.aQ.b(), (egsh) ahknVar18.dG.b(), ahknVar18.a.mN(), (eosc) ahknVar18.p.b(), ahknVar18.dY(), ((Boolean) ahknVar18.bC.b()).booleanValue());
            case 221:
                ahkn ahknVar19 = this.a;
                egsq egsqVarEk8 = ahknVar19.ek();
                final eyik eyikVar12 = ahknVar19.b.dm;
                return new egtl(new fcsu() { // from class: coen
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar12.b();
                    }
                }, egsqVarEk8);
            case 222:
                return new coem(this.a.a.kT());
            case 223:
                ahkn ahknVar20 = this.a;
                final eyik eyikVar13 = ahknVar20.b.dq;
                egsq egsqVarEk9 = ahknVar20.ek();
                eyikVar13.getClass();
                return new egtl(new fcsu() { // from class: dawv
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar13.b();
                    }
                }, egsqVarEk9);
            case 224:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar7 = ahknVar21.a;
                fdjx fdjxVar = (fdjx) ahnhVar7.m.b();
                ahng ahngVar4 = ahknVar21.b;
                return new dawu(fdjxVar, ahnhVar7.aah, ahngVar4.f5do, ahnhVar7.rW, ahngVar4.dp, ahnhVar7.aai, ahknVar21.ef, ahknVar21.dG, ahknVar21.cD);
            case 225:
                return Long.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45646172").b());
            case 226:
                return Long.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45645955").b());
            case 227:
                ahkn ahknVar22 = this.a;
                final eyik eyikVar14 = ahknVar22.a.aoz;
                egsq egsqVarEk10 = ahknVar22.ek();
                eyikVar14.getClass();
                return new egtl(new fcsu() { // from class: eguj
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (egsc) eyikVar14.b();
                    }
                }, egsqVarEk10);
            case 228:
                ahkn ahknVar23 = this.a;
                return avmm.a(ahknVar23.b.du, ahknVar23.ek());
            case 229:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar8 = ahknVar24.a;
                return new avmk((fdjx) ahnhVar8.m.b(), ahnhVar8.ahi, ahknVar24.dG, ahnhVar8.ahb, ahnhVar8.adr, ahknVar24.cD, ahknVar24.b.dt);
            case 230:
                ahkn ahknVar25 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar25.cA.b();
                ahnh ahnhVar9 = ahknVar25.a;
                return new avmg(fcyhVar, ahknVar25.cD, ahnhVar9.ahb, ahnhVar9.qi, ahnhVar9.Aq, ahnhVar9.adm, ahnhVar9.agE, ahnhVar9.agK, ahknVar25.cE, ahnhVar9.pQ);
            case 231:
                ahkn ahknVar26 = this.a;
                return cbfr.a(ahknVar26.b.dx, ahknVar26.ek());
            case 232:
                ahkn ahknVar27 = this.a;
                cogw cogwVar2 = (cogw) ahknVar27.cD.b();
                ahnh ahnhVar10 = ahknVar27.a;
                return new cbfp(cogwVar2, (cbmx) ahnhVar10.amO.b(), (cbmh) ahnhVar10.amP.b(), ahknVar27.b.dw, (egsh) ahknVar27.dG.b(), (fdjx) ahnhVar10.oQ.b());
            case 233:
                ahkn ahknVar28 = this.a;
                cogw cogwVar3 = (cogw) ahknVar28.cD.b();
                ahnh ahnhVar11 = ahknVar28.a;
                return new cbkq(cogwVar3, (cbcz) ahnhVar11.amU.b(), (cbhp) ahnhVar11.amS.b(), (egsh) ahknVar28.dG.b(), (cbbl) ahnhVar11.amT.b(), ahnhVar11.pQ, (fdjx) ahnhVar11.oQ.b(), (fdjx) ahnhVar11.oS.b());
            case 234:
                return new ahna(this);
            case 235:
                ahkn ahknVar29 = this.a;
                dhxa dhxaVar = (dhxa) ahknVar29.kT.b();
                dhob dhobVar = (dhob) ahknVar29.kY.b();
                ahng ahngVar5 = ahknVar29.b;
                dhqd dhqdVarCb = ahngVar5.cb();
                dhpy dhpyVarCa = ahngVar5.ca();
                ahngVar5.dl();
                ahngVar5.a.dw();
                return new dhqq(dhxaVar, dhobVar, dhqdVarCb, dhpyVarCa, ahknVar29.gz());
            case 236:
                String strCQ = this.a.b.cQ();
                fbrg fbrgVar = new fbrg();
                fbqx fbqxVar = fbrg.c;
                int i2 = fbrb.d;
                fbrgVar.h(new fbqw("X-GOOG-API-KEY", fbqxVar), strCQ);
                return fbrgVar;
            case 237:
                return new ahnb(this);
            case 238:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enforce_thread_checks_on_cursors"));
            case 239:
                ahkn ahknVar30 = this.a;
                Map mapCV = ahknVar30.b.cV();
                ahknVar30.aa();
                return new aijl(mapCV);
            case 240:
                return new cdfb(this.a.a.rg());
            case 241:
                ahnh ahnhVar12 = this.a.a;
                return new axnl(ahnhVar12.sX, ahnhVar12.c);
            case 242:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar13 = ahknVar31.a;
                return new axnp(ahknVar31.cD, ahknVar31.b.dI, ahnhVar13.agV);
            case 243:
                ahkn ahknVar32 = this.a;
                ahng ahngVar6 = ahknVar32.b;
                ahnh ahnhVar14 = ahknVar32.a;
                return new axpc(ahnhVar14.tt, ahnhVar14.xh, ahngVar6.dJ);
            case 244:
                ahkn ahknVar33 = this.a;
                Context context4 = (Context) ahknVar33.t.b();
                ahnh ahnhVar15 = ahknVar33.a;
                return new axgd(context4, (cssf) ahnhVar15.uo.b(), ahnhVar15.Qp, ahnhVar15.Jl);
            case 245:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar16 = ahknVar34.a;
                eyik eyikVar15 = ahknVar34.t;
                eyik eyikVar16 = ahnhVar16.pf;
                eyik eyikVar17 = ahnhVar16.Jm;
                eyik eyikVar18 = ahnhVar16.Cd;
                eyik eyikVar19 = ahnhVar16.c;
                eyik eyikVar20 = ahnhVar16.uJ;
                eyik eyikVar21 = ahnhVar16.BQ;
                eyik eyikVar22 = ahnhVar16.Zn;
                eyik eyikVar23 = ahnhVar16.qi;
                eyik eyikVar24 = ahnhVar16.Fk;
                eyik eyikVar25 = ahknVar34.lk;
                eyik eyikVar26 = ahnhVar16.qG;
                eyik eyikVar27 = ahnhVar16.sL;
                ahng ahngVar7 = ahknVar34.b;
                return new axso(eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, ahknVar34.cD, ahngVar7.dL, ahngVar7.dM, ahnhVar16.Jq, ahnhVar16.Jd);
            case 246:
                final eyik eyikVar28 = this.a.a.oO;
                return new arak() { // from class: aqys
                    @Override // defpackage.arak
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.use_file_processing_pipeline_for_no_confirmation_messages");
                    }
                };
            case 247:
                return new cgqn(this.a.a.pQ);
            case 248:
                final eyik eyikVar29 = this.a.a.oO;
                return new aqry() { // from class: aqpf
                    @Override // defpackage.aqry
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.dsdr_check_rcs_availability_before_retrying_rcs_pending_messages");
                    }
                };
            case 249:
                ahkn ahknVar35 = this.a;
                eyik eyikVar30 = ahknVar35.cD;
                ahnh ahnhVar17 = ahknVar35.a;
                return new axsj(ahknVar35.b.dP, ahnhVar17.Ct, ahnhVar17.aiP, ahnhVar17.qG, ahnhVar17.yw, (cogw) eyikVar30.b(), ahnhVar17.aiC, ahnhVar17.pK);
            case 250:
                return new caup(this.a.a.rF);
            case 251:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar18 = ahknVar36.a;
                return new axtk((crny) ahnhVar18.pf.b(), (cqbm) ahnhVar18.sX.b(), (aypv) ahknVar36.ld.b());
            case 252:
                ahng ahngVar8 = this.a.b;
                return ekgp.m(enmr.TRANSPORT_RCS, ahngVar8.bu(), enmr.TRANSPORT_SINGLE_REGISTRATION, ahngVar8.bu());
            case 253:
                return Long.valueOf(((ehdm) this.a.b.cF().a.b()).a("com.google.android.apps.messaging.auto", "45531534").b());
            case 254:
                return new axth((aprr) this.a.a.Cj.b());
            case 255:
                return new aqtd() { // from class: aqrn
                };
            case 256:
                final eyik eyikVar31 = this.a.a.oO;
                return new aqyx() { // from class: aqwb
                    @Override // defpackage.aqyx
                    public final boolean a() {
                        return ((eoth) eyikVar31.b()).a("bugle.call_file_processing_resume_directly_from_pending_messages_processor");
                    }
                };
            case 257:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar19 = ahknVar37.a;
                return new axun(ahnhVar19.uJ, ahknVar37.cD, ahnhVar19.uv, ahnhVar19.yw, ahnhVar19.qq);
            case 258:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar20 = ahknVar38.a;
                return new axyr(ahknVar38.t, ahnhVar20.uJ, ahnhVar20.Cp, ahnhVar20.pf, ahnhVar20.us, ahnhVar20.Ct, ahnhVar20.Zn, ahnhVar20.uI, ahnhVar20.VN, ahnhVar20.uv, ahknVar38.cD);
            case 259:
                return new axze();
            case 260:
                eyik eyikVar32 = this.a.b.eb;
                return new axzo(eyikVar32, eyikVar32);
            case 261:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar21 = ahknVar39.a;
                return new aybf(ahknVar39.t, ahnhVar21.zP, ahnhVar21.sL, ahnhVar21.uJ, ahnhVar21.ww, ahnhVar21.Gn, ahnhVar21.Jd, ahnhVar21.qG, ahknVar39.cD, ahnhVar21.uv, ahnhVar21.pf, ahnhVar21.wJ, ahnhVar21.pE, ahnhVar21.yw, ahnhVar21.Cd, ahnhVar21.Cc, ahnhVar21.Ck, ahnhVar21.wF, ahnhVar21.HG, ahnhVar21.HI, ahnhVar21.CA, ahnhVar21.aiA, ahnhVar21.TY, ahnhVar21.Ct, ahnhVar21.CB, ahnhVar21.Zn, ahnhVar21.uI, ahnhVar21.CF, ahnhVar21.uD, ahnhVar21.TZ, ahnhVar21.sG, ahnhVar21.IE, ahnhVar21.Cp, ahknVar39.ku, ahnhVar21.IH, ahknVar39.mx, ahnhVar21.qi, ahknVar39.b.ea, ahnhVar21.AM, ahnhVar21.Gq, ahnhVar21.Ud, ahnhVar21.Gt, ahnhVar21.Ji, ahnhVar21.Js, ahnhVar21.m, ahknVar39.bM, ahnhVar21.oQ, ahknVar39.cz, ahknVar39.cA, ahnhVar21.c, ahnhVar21.yp, ahnhVar21.HP, ahnhVar21.aiB, ahnhVar21.Ci, ahknVar39.nr, ahknVar39.ly, ahknVar39.oH, ahnhVar21.Jq, ahknVar39.hR, ahnhVar21.Uh, ahnhVar21.Ar);
            case 262:
                return new apxf() { // from class: apfq
                };
            case 263:
                ahkn ahknVar40 = this.a;
                return new aycg(ahknVar40.a.Ui, ahknVar40.y, ahknVar40.cE, ahknVar40.b.ed);
            case 264:
                return new ajga((dzuc) this.a.cE.b());
            case 265:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar22 = ahknVar41.a;
                return new aydn(ahknVar41.t, ahnhVar22.Jd, ahknVar41.cD, ahnhVar22.uy, ahnhVar22.pE, ahnhVar22.yw, ahnhVar22.uv, ahnhVar22.zP, ahnhVar22.uJ, ahnhVar22.ww, ahnhVar22.Gn, ahnhVar22.qG, ahnhVar22.aiA, ahnhVar22.agU, ahnhVar22.CF, ahnhVar22.Ct, ahnhVar22.yx, ahnhVar22.un, ahnhVar22.qq, ahnhVar22.Cp, ahnhVar22.CP, ahnhVar22.IH, ahnhVar22.Js, ahnhVar22.HP, ahnhVar22.AM, ahnhVar22.Gt, ahnhVar22.qi);
            case 266:
                ahkn ahknVar42 = this.a;
                ahng ahngVar9 = ahknVar42.b;
                ahnh ahnhVar23 = ahknVar42.a;
                return new ayem(ahknVar42.t, ahnhVar23.zP, ahnhVar23.uJ, ahnhVar23.ww, ahnhVar23.Gn, ahnhVar23.AM, ahnhVar23.Jd, ahnhVar23.HG, ahnhVar23.HI, ahnhVar23.us, ahnhVar23.uy, ahnhVar23.qG, ahnhVar23.yw, ahnhVar23.Ct, ahnhVar23.CF, ahngVar9.ee, ahnhVar23.yx, ahnhVar23.qq, ahnhVar23.Cp, ahnhVar23.IH, ahnhVar23.HP, ahnhVar23.Hf, ahnhVar23.Gt, ahnhVar23.qi, ahnhVar23.Js, ahnhVar23.CB);
            case 267:
                return new aylr();
            case 268:
                return new aynb(this.a.b.ei);
            case 269:
                ahkn ahknVar43 = this.a;
                return new ayna((cogw) ahknVar43.cD.b(), (aymn) ahknVar43.a.wT.b());
            case 270:
                return new aqbz() { // from class: apmd
                };
            case 271:
                ahkn ahknVar44 = this.a;
                Context context5 = (Context) ahknVar44.t.b();
                ahng ahngVar10 = ahknVar44.b;
                eyik eyikVar33 = ahngVar10.el;
                ahnh ahnhVar24 = ahknVar44.a;
                return new bxmb(context5, eyikVar33, ahknVar44.aT, ahnhVar24.yf, ahknVar44.da, ahnhVar24.pB, ahngVar10.em, ahnhVar24.rd);
            case 272:
                return new crss((Context) this.a.t.b());
            case 273:
                return new cebb(this.a.b.bA());
            case 274:
                return Optional.of((chtr) this.a.a.Qa.b());
            case 275:
                ahng ahngVar11 = this.a.b;
                return ekgp.p(cgit.NAT_QUICK_REPLY, ahngVar11.bq(), cgit.NAT_WEARABLE_QUICK_REPLY, ahngVar11.br(), cgit.NAT_MARK_AS_READ, ahngVar11.bp(), cgit.NAT_COPY_OTP, ahngVar11.bn(), cgit.NAT_DIRECTOR, ahngVar11.bo());
            case 276:
                ahkn ahknVar45 = this.a;
                return new cqcu(ahknVar45.a.qK, (eosc) ahknVar45.y.b(), (eosc) ahknVar45.p.b());
            case 277:
                final eyik eyikVar34 = this.a.a.oO;
                return new apwu() { // from class: apew
                    @Override // defpackage.apwu
                    public final boolean a() {
                        return ((eoth) eyikVar34.b()).a("bugle.enable_multi_sim_logging_rcs_availability_log_worker");
                    }
                };
            case 278:
                ahkn ahknVar46 = this.a;
                ekgi ekgiVarH = ekgp.h(9);
                ahnh ahnhVar25 = ahknVar46.a;
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_add_user_to_group_response", ahnhVar25.ape);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_create_group_response", ahnhVar25.apf);
                ekgiVarH.i("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action", ahknVar46.b.es);
                ekgiVarH.i("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action", ahnhVar25.Uu);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response", ahnhVar25.apg);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_revoke_message_response", ahnhVar25.aph);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_send_message_response", ahnhVar25.api);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response", ahnhVar25.apj);
                ekgiVarH.i("com.google.android.apps.messaging.messaging_service_update_group_response", ahnhVar25.apk);
                return ekgiVarH.c();
            case 279:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar26 = ahknVar47.a;
                return new ciyq((asrc) ahnhVar26.EQ.b(), ahknVar47.b.bt(), (crru) ahknVar47.ds.b(), ahnhVar26.rQ(), (ciyd) ahknVar47.ff(), (cjae) ahnhVar26.Ps.b(), (eosc) ahknVar47.p.b(), (eosc) ahknVar47.y.b(), (eosc) ahknVar47.aJ.b());
            case 280:
                ahnh ahnhVar27 = this.a.a;
                return new dgjz((dgrs) ahnhVar27.sd.b(), (cebq) ahnhVar27.rq.b());
            case 281:
                ahkn ahknVar48 = this.a;
                return new dgkh((dgrs) ahknVar48.a.sd.b(), (diep) ahknVar48.l.b());
            case 282:
                ahkn ahknVar49 = this.a;
                Context context6 = (Context) ahknVar49.t.b();
                ahnh ahnhVar28 = ahknVar49.a;
                return new dgju(context6, (dfxx) ahnhVar28.rt.b(), (dhes) ahknVar49.aP.b(), (eosc) ahknVar49.aJ.b(), (dexw) ahnhVar28.ru.b());
            case 283:
                ahkn ahknVar50 = this.a;
                ahng ahngVar12 = ahknVar50.b;
                ahnh ahnhVar29 = ahknVar50.a;
                return new ckkr(ahnhVar29.oS, ahngVar12.ex, ahnhVar29.agY);
            case 284:
                return new ckkp(this.a.a.rF);
            case 285:
                final eyik eyikVar35 = this.a.a.oO;
                return new dfmo() { // from class: dfla
                    @Override // defpackage.dfmo
                    public final boolean a() {
                        return ((eoth) eyikVar35.b()).a("cslib.remove_unnecessary_grpc_to_tycho");
                    }
                };
            case 286:
                ahkn ahknVar51 = this.a;
                return new ckil((ahnc) ahknVar51.b.eB.b(), (fcyh) ahknVar51.cA.b(), (fdjx) ahknVar51.a.oS.b());
            case 287:
                return new ahnc(this);
            case 288:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45670222").b());
            case 289:
                final eyik eyikVar36 = this.a.a.oO;
                return new dflt() { // from class: dfjp
                    @Override // defpackage.dflt
                    public final boolean a() {
                        return ((eoth) eyikVar36.b()).a("cslib.enable_request_attestation_state");
                    }
                };
            case 290:
                return new dgqs();
            case 291:
                final eyik eyikVar37 = this.a.a.oO;
                return new dfll() { // from class: dfje
                    @Override // defpackage.dfll
                    public final boolean a() {
                        return ((eoth) eyikVar37.b()).a("cslib.enable_defer_message_async");
                    }
                };
            case 292:
                final eyik eyikVar38 = this.a.a.oO;
                return new dfmk() { // from class: dfks
                    @Override // defpackage.dfmk
                    public final boolean a() {
                        return ((eoth) eyikVar38.b()).a("cslib.remove_contexts_from_private_suspends_in_smv2");
                    }
                };
            case 293:
                return Optional.of(this.a.b.da());
            case 294:
                ahkn ahknVar52 = this.a;
                ahnh ahnhVar30 = ahknVar52.a;
                Object objPz = ahnhVar30.pz();
                cldw cldwVar = (cldw) ahnhVar30.ahj.b();
                cldw cldwVar2 = (cldw) ahknVar52.mP.b();
                ahng ahngVar13 = ahknVar52.b;
                return ekhx.v(objPz, cldwVar, cldwVar2, (cldw) ahngVar13.eI.b(), (cldw) ahnhVar30.Qa.b(), (cldw) ahngVar13.eJ.b(), new cldw[0]);
            case 295:
                ahkn ahknVar53 = this.a;
                Context context7 = (Context) ahknVar53.t.b();
                eosc eoscVar5 = (eosc) ahknVar53.p.b();
                ahnh ahnhVar31 = ahknVar53.a;
                return new cgab(context7, eoscVar5, ahnhVar31.qK, ahnhVar31.tJ, ahnhVar31.c);
            case 296:
                ahkn ahknVar54 = this.a;
                return new darm(ahknVar54.a.aeH, ahknVar54.aJ);
            case 297:
                ahkn ahknVar55 = this.a;
                Context context8 = (Context) ahknVar55.t.b();
                eosc eoscVar6 = (eosc) ahknVar55.y.b();
                ahnh ahnhVar32 = ahknVar55.a;
                return new clep(context8, eoscVar6, (coun) ahnhVar32.Ok.b(), ahnhVar32.c, (cogw) ahknVar55.cD.b(), ahknVar55.b.bF(), (coqe) ahnhVar32.ajb.b());
            case 298:
                return new cati(this.a.a.rF);
            case 299:
                return new cije(this.a.a.rF);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() throws NumberFormatException {
        egty egtyVar;
        int i = this.b;
        switch (i) {
            case 300:
                final eyik eyikVar = this.a.a.oO;
                return new apsz() { // from class: aoza
                    @Override // defpackage.apsz
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_receive_intent_sub_id");
                    }
                };
            case 301:
                ahkn ahknVar = this.a;
                return new cqti(ahknVar.a.pE, (Context) ahknVar.t.b(), ahknVar.b.eP, ahknVar.ic);
            case 302:
                return new cqwg((Context) this.a.t.b());
            case 303:
                return new cgfr(this.a.a.rF);
            case 304:
                return new crsh(this.a.aT);
            case 305:
                return new aikm((Context) this.a.t.b());
            case 306:
                ahkn ahknVar2 = this.a;
                return new cnqe(ahknVar2.a.qr, eyie.a(ahknVar2.dn), ahknVar2.cI, ahknVar2.eO);
            case 307:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar = ahknVar3.a;
                return new cmix(ahnhVar.rp, ahknVar3.aP, ahnhVar.rC, ahnhVar.rY, ahnhVar.xd, ahnhVar.VZ, ahnhVar.amo);
            case 308:
                ahkn ahknVar4 = this.a;
                cogw cogwVar = (cogw) ahknVar4.cD.b();
                ahnh ahnhVar2 = ahknVar4.a;
                Optional optionalOf = Optional.of(ahnhVar2.Uk);
                eyik eyikVar2 = ahnhVar2.pE;
                eyik eyikVar3 = ahnhVar2.uv;
                eyik eyikVar4 = ahnhVar2.Ui;
                eosc eoscVar = (eosc) ahknVar4.aJ.b();
                ahng ahngVar = ahknVar4.b;
                return new cley(cogwVar, optionalOf, eyikVar2, eyikVar3, eyikVar4, eoscVar, ahngVar.eg, ahnhVar2.Ci, (dzuc) ahknVar4.cE.b(), (ajga) ahngVar.ed.b(), ahnhVar2.yw, ahnhVar2.yx, ahnhVar2.qG, ahngVar.eW, ahnhVar2.Dl, ahngVar.eX, ahnhVar2.Uj, ahngVar.eY);
            case 309:
                final eyik eyikVar5 = this.a.a.oO;
                return new apta() { // from class: aoze
                    @Override // defpackage.apta
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_receive_sms_pipeline");
                    }
                };
            case 310:
                ahnh ahnhVar3 = this.a.a;
                return new chjc((cgxw) ahnhVar3.Ie.b(), (fdjx) ahnhVar3.m.b(), ahnhVar3.Ci);
            case 311:
                return Boolean.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45687146").e());
            case 312:
                ahnh ahnhVar4 = this.a.a;
                return new cdeb((ains) ahnhVar4.pb.b(), (Optional) ahnhVar4.FQ.b(), ahnhVar4.hs(), ahnhVar4.hr());
            case 313:
                ahkn ahknVar5 = this.a;
                egyt egytVar = (egyt) ahknVar5.dj.b();
                fcyh fcyhVar = (fcyh) ahknVar5.cz.b();
                ahnh ahnhVar5 = ahknVar5.a;
                return new cufd(egytVar, fcyhVar, (fdjx) ahnhVar5.m.b(), ahnhVar5.BQ, (egzh) ahknVar5.aQ.b(), (cogw) ahknVar5.cD.b(), ahnhVar5.BP);
            case 314:
                ahnh ahnhVar6 = this.a.a;
                return new cuyz(ahnhVar6.pf, ahnhVar6.qG, ahnhVar6.Cs);
            case 315:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar7 = ahknVar6.a;
                return new cxsp((bveg) ahnhVar7.yx.b(), (bahv) ahnhVar7.un.b(), (ceag) ahnhVar7.DB.b(), eyie.a(ahnhVar7.uv), (cogw) ahknVar6.cD.b(), (cmot) ahnhVar7.uy.b(), (Context) ahknVar6.t.b(), ahknVar6.bD, ahnhVar7.Cp, (dakl) ahnhVar7.BK.b(), Optional.empty(), (apsl) ahnhVar7.Dk.b(), ahnhVar7.Dn);
            case 316:
                return new cywj(this.a.a.un);
            case 317:
                return new daci((Context) this.a.t.b());
            case 318:
                ahkn ahknVar7 = this.a;
                cqmr cqmrVar = (cqmr) ahknVar7.eK.b();
                Context context = (Context) ahknVar7.t.b();
                eyik eyikVar6 = ahknVar7.b.eP;
                cqmz cqmzVar = (cqmz) ahknVar7.ic.b();
                ahnh ahnhVar8 = ahknVar7.a;
                ains ainsVar = (ains) ahnhVar8.c.b();
                baii baiiVar = (baii) ahnhVar8.JK.b();
                return new batn(cqmrVar, context, eyikVar6, cqmzVar, ainsVar, baiiVar);
            case 319:
                return new ctak(this.a.a.c);
            case 320:
                return new ctam(this.a.a.qr, Optional.empty());
            case 321:
                ahnh ahnhVar9 = this.a.a;
                fcyh fcyhVar2 = (fcyh) ahnhVar9.Rm.b();
                egwe egweVarMF = ahnhVar9.mF();
                fcyhVar2.getClass();
                fdmt fdmtVar = new fdmt(null);
                egweVarMF.a(fdmtVar);
                return fdjy.b(fcyhVar2.plus(fdmtVar));
            case 322:
                ahkn ahknVar8 = this.a;
                Context context2 = (Context) ahknVar8.t.b();
                ahng ahngVar2 = ahknVar8.b;
                ahkn ahknVar9 = ahngVar2.a;
                final Context context3 = (Context) ahknVar9.t.b();
                ahnh ahnhVar10 = ahknVar9.a;
                Optional optionalA = ((aghv) ahnhVar10.xl.b()).a();
                optionalA.getClass();
                ceao ceaoVarHG = ahnhVar10.hG();
                final fbrg fbrgVar = new fbrg();
                if (!fbfw.b(context3)) {
                    String strC = fbfw.a.get().c(context3);
                    fbqx fbqxVar = fbrg.c;
                    int i2 = fbrb.d;
                    fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), strC);
                }
                String packageName = context3.getPackageName();
                fbqx fbqxVar2 = fbrg.c;
                int i3 = fbrb.d;
                fbrgVar.h(new fbqw("X-Android-Package", fbqxVar2), packageName);
                Optional optionalA2 = digc.a(context3);
                optionalA2.ifPresent(new Consumer() { // from class: diga
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        fbqx fbqxVar3 = fbrg.c;
                        int i4 = fbrb.d;
                        fbqw fbqwVar = new fbqw("X-Android-Cert", fbqxVar3);
                        fbrgVar.h(fbqwVar, (String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                int i4 = true != optionalA2.isPresent() ? 2 : 3;
                ((ekrd) ((ekrd) digc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "logMetadataManagedChannel", 61, "RpcModule.java")).r("Number of headers in RPC request: %d", i4);
                ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
                ewzx ewzxVar = (ewzx) ewzy.a.createBuilder();
                ewzxVar.copyOnWrite();
                ewzy ewzyVar = (ewzy) ewzxVar.instance;
                ewzyVar.b = 1 | ewzyVar.b;
                ewzyVar.c = i4;
                ewzvVar.copyOnWrite();
                ewzw ewzwVar = (ewzw) ewzvVar.instance;
                ewzy ewzyVar2 = (ewzy) ewzxVar.build();
                ewzyVar2.getClass();
                ewzwVar.c = ewzyVar2;
                ewzwVar.b = 5;
                ceaoVarHG.a((ewzw) ewzvVar.build());
                Optional map = optionalA.map(new java.util.function.Function() { // from class: digb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ java.util.function.Function mo536andThen(java.util.function.Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        fbxn fbxnVarM = fbxn.m(fbfw.a.get().a(context3), 443, (CronetEngine) obj);
                        fbxnVarM.i(new fcrz(fbrgVar));
                        fbxnVarM.n(8448);
                        return fbxnVarM.a();
                    }

                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                map.getClass();
                long jB = devd.b(((Context) ahknVar9.t.b()).getContentResolver(), "android_id", 0L);
                diev.a();
                Optional optionalOf2 = Optional.of(eyie.a(ahknVar8.bf));
                eosc eoscVar2 = (eosc) ahknVar8.aJ.b();
                eosc eoscVar3 = (eosc) ahknVar8.p.b();
                ceao ceaoVarHG2 = ahknVar8.a.hG();
                eygg eyggVarA = eyie.a(ahngVar2.fl);
                ekgb ekgbVarS = ekgb.s("ANDROID_MESSAGING", "CARRIER_SERVICES");
                ekgbVarS.getClass();
                return new difz(context2, map, jB, optionalOf2, eoscVar2, eoscVar3, ceaoVarHG2, eyggVarA, ekgbVarS);
            case 323:
                ahkn ahknVar10 = this.a;
                return new difo((dbmr) ahknVar10.b.fk.b(), (Context) ahknVar10.t.b());
            case 324:
                return new dbms((Context) this.a.t.b());
            case 325:
                return new axgj((ains) this.a.a.c.b());
            case 326:
                Map map2 = (Map) this.a.b.j.b();
                ekfw ekfwVar = new ekfw();
                ekfwVar.h("messages");
                ekgb ekgbVarG = ekfwVar.g();
                ekgbVarG.getClass();
                ekfw ekfwVar2 = new ekfw();
                ekfwVar2.h("messages");
                ekgb ekgbVarG2 = ekfwVar2.g();
                ekgbVarG2.getClass();
                ekgp.m("$primary+smarts_personalization_decayed_feature_values", ekgbVarG, "$primary+smarts_personalization_normalized_feature_values", ekgbVarG2);
                Context context4 = dqru.b;
                return new dquq(map2);
            case 327:
                ahkn ahknVar11 = this.a;
                Context context5 = (Context) ahknVar11.t.b();
                dxrk dxrkVar = (dxrk) ahknVar11.hq.b();
                ahng ahngVar3 = ahknVar11.b;
                ahkn ahknVar12 = ahngVar3.a;
                dxrk dxrkVar2 = (dxrk) ahknVar12.hq.b();
                fcyh fcyhVar3 = (fcyh) ahknVar12.cz.b();
                Context context6 = (Context) ahknVar12.t.b();
                ekon ekonVar = ekon.a;
                return new dxhr(context5, dxrkVar, new dxge(dxrkVar2, fcyhVar3, context6, ekonVar), (dxtz) ahngVar3.fp.b(), (dxkt) ahknVar11.hM.b(), (dxtx) ahknVar11.hg.b(), (dxkw) ahknVar11.a.vL.b(), ekonVar);
            case 328:
                return new dxub((Context) this.a.t.b());
            case 329:
                return new dxhz(this.a.b.cn());
            case 330:
                return new dxkl();
            case 331:
                ahkn ahknVar13 = this.a;
                ahng ahngVar4 = ahknVar13.b;
                eyik eyikVar7 = ahngVar4.fu;
                eyik eyikVar8 = ahknVar13.hM;
                ahnh ahnhVar11 = ahknVar13.a;
                return new dxit(eyikVar7, eyikVar8, ahnhVar11.vL, ahknVar13.l, ahknVar13.hH, ahngVar4.fv, (Context) ahknVar13.t.b(), ahknVar13.hg, ahngVar4.fw, ahngVar4.fx, ahngVar4.fy, (fdjx) ahnhVar11.oS.b());
            case 332:
                ahkn ahknVar14 = this.a;
                return new dxix((dxrk) ahknVar14.hq.b(), (dxlw) ahknVar14.a.vq.b());
            case 333:
                return new dxkz();
            case 334:
                ahng ahngVar5 = this.a.b;
                ahkn ahknVar15 = ahngVar5.a;
                return ejwi.j(new dsgr((dxmn) ahknVar15.hK.b(), ahngVar5.cl(), (dxkt) ahknVar15.hM.b(), (dxkw) ahknVar15.a.vL.b(), ahknVar15.hU));
            case 335:
                return new dxja(this.a.b.cn());
            case 336:
                return new dxjd(this.a.b.cn());
            case 337:
                return new dxjg(this.a.b.cn());
            case 338:
                return new ahie(this.a);
            case 339:
                ahkn ahknVar16 = this.a;
                eosc eoscVar4 = (eosc) ahknVar16.aJ.b();
                egoc egocVar = (egoc) ahknVar16.a.k.b();
                egpm egpmVar = (egpm) ahknVar16.dR.b();
                return new dxxa(eoscVar4, egocVar, egpmVar);
            case 340:
                return new ahni(this.a);
            case 341:
                return new ahig(this.a);
            case 342:
                return new ahhp(this.a);
            case 343:
                return new ahnj(this.a);
            case 344:
                return new ahif(this.a);
            case 345:
                return new dxkk();
            case 346:
                return new dxkn();
            case 347:
                ((dxkn) this.a.b.fM.b()).getClass();
                fdjy.b(fcyi.a);
                return new dxxi();
            case 348:
                return new dxkm();
            case 349:
                return new dxkj();
            case 350:
                return new dxks();
            case 351:
                return new dxkq();
            case 352:
                return new dxkr();
            case 353:
                return new dxko();
            case 354:
                return new dxkp();
            case 355:
                return new eoss((eosc) this.a.aJ.b());
            case 356:
                ahkn ahknVar17 = this.a;
                Context context7 = (Context) ahknVar17.t.b();
                ahkn ahknVar18 = ahknVar17.b.a;
                ahnh ahnhVar12 = ahknVar18.a;
                egbf egbfVar = (egbf) ahnhVar12.pG.b();
                ejwi ejwiVarJ = ejwi.j(new egfq((egbf) ahnhVar12.pG.b(), (egcq) ahnhVar12.aod.b(), (egsh) ahknVar18.dG.b(), (egzh) ahknVar18.aQ.b(), (fdjx) ahnhVar12.m.b(), new egfo(true, 1)));
                egbfVar.getClass();
                return new egeb(context7, new ekph(((ejwt) ejwiVarJ).a), (eosc) ahknVar17.p.b(), (egoc) ahknVar17.a.k.b());
            case 357:
                return new pzd((pzb) this.a.b.fW.b());
            case 358:
                ahkn ahknVar19 = this.a;
                Context context8 = (Context) ahknVar19.t.b();
                ahng ahngVar6 = ahknVar19.b;
                ahkn ahknVar20 = ahngVar6.a;
                Context context9 = (Context) ahknVar20.t.b();
                eosc eoscVar5 = (eosc) ahknVar20.y.b();
                egoc egocVar2 = (egoc) ahknVar20.a.k.b();
                PackageManager packageManagerU = ahknVar20.U();
                int iOrdinal = ahng.dk().ordinal();
                if (iOrdinal == 0) {
                    egtyVar = egty.NONE;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                        throw new RuntimeException(null, null);
                    }
                    egtyVar = egty.NONE;
                } else {
                    egtyVar = egty.WARN_AT_STARTUP;
                }
                egty egtyVar2 = egtyVar;
                egtyVar2.getClass();
                final egtb egtbVar = new egtb(context9, eoscVar5, egocVar2, packageManagerU, egtyVar2);
                eosd eosdVar = (eosd) ahknVar19.y.b();
                fcyh fcyhVar4 = (fcyh) ahknVar19.cz.b();
                egpm egpmVar2 = (egpm) ahknVar19.dR.b();
                qbx qbxVar = (qbx) ahngVar6.dD.b();
                pzb pzbVar = new pzb();
                pzbVar.a(eosdVar);
                pzbVar.e = new egtc(egpmVar2);
                pzbVar.b(eosdVar);
                fcyhVar4.getClass();
                pzbVar.b = fcyhVar4;
                pzbVar.c(qbxVar);
                final String packageName2 = context8.getPackageName();
                ((ekrd) ((ekrd) egtb.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 68, "DefaultProcessValidator.java")).q("Validating WorkManager process");
                egtbVar.d.f(eika.g(new Runnable() { // from class: egta
                    @Override // java.lang.Runnable
                    public final void run() throws PackageManager.NameNotFoundException {
                        egtb egtbVar2 = egtbVar;
                        String str = packageName2;
                        try {
                            ServiceInfo serviceInfo = egtbVar2.e.getServiceInfo(new ComponentName(egtbVar2.b, "androidx.work.impl.background.systemjob.SystemJobService"), 0);
                            boolean zEquals = Objects.equals(serviceInfo.processName, str);
                            ((ekrd) ((ekrd) egtb.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 97, "DefaultProcessValidator.java")).J("Processes: %s, %s, %s, %s", egtbVar2.f, Boolean.valueOf(zEquals), serviceInfo.processName, str);
                            if (zEquals) {
                                return;
                            }
                            int iOrdinal2 = egtbVar2.f.ordinal();
                            if (iOrdinal2 == 1) {
                                ((ekrd) ((ekrd) egtb.a.i()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 123, "DefaultProcessValidator.java")).D("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName);
                            } else {
                                if (iOrdinal2 != 2) {
                                    return;
                                }
                                ((ekrd) ((ekrd) egtb.a.j()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 119, "DefaultProcessValidator.java")).q("Invalid process");
                                throw new IllegalStateException(String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName));
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            ((ekrd) ((ekrd) ((ekrd) egtb.a.j()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).q("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                        } catch (RuntimeException e2) {
                            ((ekrd) ((ekrd) ((ekrd) egtb.a.j()).g(e2)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'p', "DefaultProcessValidator.java")).q("Failed to look up WorkManager manifest process");
                        }
                    }
                }, egtbVar.c), 1L, TimeUnit.MINUTES);
                return pzbVar;
            case 359:
                return new ehnc(this.a.b.fX);
            case 360:
                return new ahik(this.a);
            case 361:
                ahkn ahknVar21 = this.a;
                return new cpcr(ahknVar21.a.Bz, ahknVar21.p);
            case 362:
                return new egga((Context) this.a.t.b());
            case 363:
                ahkn ahknVar22 = this.a;
                return new egif((Context) ahknVar22.t.b(), (egcd) ahknVar22.a.l.b(), (eosc) ahknVar22.y.b());
            case 364:
                return new eotq((eoth) this.a.a.oO.b());
            case 365:
                ahkn ahknVar23 = this.a;
                return new dxhw((Context) ahknVar23.t.b(), ahknVar23.b.cT(), ahknVar23.dP(), eyie.a(ahknVar23.hg), (fcyh) ahknVar23.bM.b());
            case 366:
                ahkn ahknVar24 = this.a;
                return new dspz((Context) ahknVar24.t.b(), (dxxd) ahknVar24.a.vA.b());
            case 367:
                return new ahnd(this);
            case 368:
                ahkn ahknVar25 = this.a;
                Context context10 = (Context) ahknVar25.t.b();
                eygg eyggVarA2 = eyie.a(ahknVar25.bt);
                dzyn dzynVar = (dzyn) ahknVar25.bj.b();
                ahnh ahnhVar13 = ahknVar25.a;
                return new ehkk(context10, eyggVarA2, dzynVar, (egbf) ahnhVar13.pG.b(), ahnhVar13.mH(), ahkn.iM());
            case 369:
                this.a.a.sk();
                ehtv ehtvVar = new ehtv();
                ehtvVar.a = cenu.a();
                ehtvVar.b = 443;
                ehtvVar.b(eqqu.ae);
                return ehtvVar.c();
            case 370:
                return Boolean.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45619430").e());
            case 371:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45620656").b());
            case 372:
                String strA = cerb.a();
                ehtv ehtvVar2 = new ehtv();
                ehtvVar2.a = strA;
                ehtvVar2.b = 443;
                ehtvVar2.b(ezzj.h);
                return ehtvVar2.c();
            case 373:
                final eyik eyikVar9 = this.a.a.oO;
                return new apun() { // from class: apbj
                    @Override // defpackage.apun
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.use_shared_tik_tok_grpc_messaging_stubs");
                    }
                };
            case 374:
                cczi ccziVar = cerb.a;
                ehtv ehtvVar3 = new ehtv();
                ehtvVar3.a = "instantmessaging-pa.googleapis.com";
                ehtvVar3.b = 443;
                ehtvVar3.b(ezzw.n);
                return ehtvVar3.c();
            case 375:
                eieu eieuVarK = eiiy.k("provideExtensionRegistry");
                try {
                    evrr evrrVarA = evrr.a();
                    eieuVarK.close();
                    evrrVarA.getClass();
                    return evrrVarA;
                } finally {
                }
            case 376:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45649708").b());
            case 377:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45660113").b());
            case 378:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45414161").b());
            case 379:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45414334").b());
            case 380:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "206375").b());
            case 381:
                return new aqae() { // from class: apjf
                };
            case 382:
                ehtv ehtvVar4 = new ehtv();
                ehtvVar4.b(eufq.ac);
                ehtvVar4.a = "people-pa.googleapis.com";
                ehtvVar4.b = 443;
                return ehtvVar4.c();
            case 383:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45412292").b());
            case 384:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45649411").b());
            case 385:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar14 = ahknVar26.a;
                return new cest((cmgk) ahnhVar14.qK.b(), ahknVar26.bX(), (ains) ahnhVar14.c.b());
            case 386:
                ahkn ahknVar27 = this.a;
                cphs cphsVar = (cphs) ahknVar27.b.gA.b();
                eyik eyikVar10 = ahknVar27.eD;
                return new cpod(cphsVar, eyikVar10);
            case 387:
                return new cphs(this.a.a.c);
            case 388:
                String strA2 = cerb.a();
                ehtv ehtvVar5 = new ehtv();
                ehtvVar5.a = strA2;
                ehtvVar5.b = 443;
                ehtvVar5.b(ezzw.n);
                return ehtvVar5.c();
            case 389:
                final eyik eyikVar11 = this.a.a.oO;
                return new appc() { // from class: aosq
                    @Override // defpackage.appc
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.initial_sync_progress_counters_v2");
                    }
                };
            case 390:
                return new ConcurrentLinkedQueue();
            case 391:
                return new ConcurrentLinkedQueue();
            case 392:
                return new ConcurrentLinkedQueue();
            case 393:
                final eyik eyikVar12 = this.a.a.oO;
                return new aqfr() { // from class: aqfe
                    @Override // defpackage.aqfr
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_mms_group_upgrade_for_cms");
                    }
                };
            case 394:
                return new appo() { // from class: aotn
                };
            case 395:
                final eyik eyikVar13 = this.a.a.oO;
                return new apon() { // from class: aorq
                    @Override // defpackage.apon
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_batch_create_request_validation");
                    }
                };
            case 396:
                return new apor() { // from class: aorx
                };
            case 397:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar15 = ahknVar28.a;
                eyde eydeVar = (eyde) ahnhVar15.xm.b();
                Context context11 = (Context) ahknVar28.t.b();
                ahnhVar15.sk();
                return new cenz(eydeVar, context11, (cqmz) ahknVar28.ic.b());
            case 398:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.skip_restore_message_during_restore_conversation"));
            case 399:
                final eyik eyikVar14 = this.a.a.oO;
                return new apoh() { // from class: aorf
                    @Override // defpackage.apoh
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.batch_restore_messages_in_conversation_restore");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 400:
                return Boolean.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45446485").e());
            case 401:
                final eyik eyikVar = this.a.a.oO;
                return new artb() { // from class: arsy
                    @Override // defpackage.artb
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.move_profile_refresh_to_synclet");
                    }
                };
            case 402:
                return new AtomicBoolean(false);
            case 403:
                return ((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45648171").d();
            case 404:
                return ((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45648172").d();
            case 405:
                return Boolean.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45647256").e());
            case 406:
                return Boolean.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45647257").e());
            case 407:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                fdjx fdjxVar = (fdjx) ahknVar.a.oS.b();
                ahng ahngVar = ahknVar.b;
                return new ejcz(context, ahknVar.aJ, fdjxVar, ahknVar.p, ahngVar.gW, ahknVar.lp, ahngVar.gX);
            case 408:
                return new ejcc();
            case 409:
                this.a.a.acV.getClass();
                return new agrn();
            case 410:
                return new cqtj((Context) this.a.t.b());
            case 411:
                return new cqab();
            case 412:
                return new apov() { // from class: aose
                };
            case 413:
                final eyik eyikVar2 = this.a.a.oO;
                return new dfmb() { // from class: dfkb
                    @Override // defpackage.dfmb
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("cslib.log_fi_multi_device_sync_sign_out");
                    }
                };
            case 414:
                ahkn ahknVar2 = this.a;
                return new aiqb(ahknVar2.a.zs, new aiqn(), (Executor) ahknVar2.p.b());
            case 415:
                ahnh ahnhVar = this.a.a;
                return new uht((bahv) ahnhVar.un.b(), (baii) ahnhVar.JK.b());
            case 416:
                return new awlc(eyim.a, (fdjx) this.a.a.m.b());
            case 417:
                ahkn ahknVar3 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar3.bM.b();
                fcyh fcyhVar2 = (fcyh) ahknVar3.cz.b();
                ahng ahngVar2 = ahknVar3.b;
                ahqe ahqeVar = (ahqe) ahngVar2.hg.b();
                aisc aiscVar = (aisc) ahngVar2.hh.b();
                cohb.a();
                return new ahqb(fcyhVar, fcyhVar2, ahqeVar, aiscVar);
            case 418:
                return new ahqe();
            case 419:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar2 = ahknVar4.a;
                return new aisc((fdjx) ahnhVar2.m.b(), (cden) ahnhVar2.qN.b(), ahnhVar2.zs, new aiqn(), (Executor) ahknVar4.p.b());
            case 420:
                return new apxd() { // from class: apfn
                };
            case 421:
                return new apqs() { // from class: aovk
                };
            case 422:
                final eyik eyikVar3 = this.a.a.oO;
                return new asgk() { // from class: asfj
                    @Override // defpackage.asgk
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_conversation_cool_ranch_phase3");
                    }
                };
            case 423:
                return dpxl.a(dpxe.b, dnqa.a);
            case 424:
                return dpxl.a(dpxe.b, dnrp.a);
            case 425:
                ahkn ahknVar5 = this.a;
                dnea dneaVar = (dnea) ahknVar5.b.hn.b();
                dnfs dnfsVarMi = ahknVar5.a.mi();
                dneaVar.getClass();
                return dnfsVarMi.a(dneaVar);
            case 426:
                dnkk dnkkVar = (dnkk) this.a.b.hm.b();
                dnkkVar.getClass();
                return new dnea("emoji", new fdap() { // from class: dnnq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dnmj dnmjVar = (dnmj) obj;
                        dnmjVar.getClass();
                        return dnmjVar.a().a().toString();
                    }
                }, new dnnr(dnkkVar, null));
            case 427:
                return new dnkw((fdjx) this.a.a.m.b());
            case 428:
                ahkn ahknVar6 = this.a;
                ahng ahngVar3 = ahknVar6.b;
                return new dnlv(ahngVar3.hp, (ecjh) ahngVar3.hq.b(), (fdjx) ahknVar6.a.oQ.b(), (dnkk) ahngVar3.hm.b(), (dnkh) ahngVar3.hm.b());
            case 429:
                return Optional.of((dnov) this.a.jw.b());
            case 430:
                ahkn ahknVar7 = this.a;
                Context context2 = (Context) ahknVar7.t.b();
                ecjl ecjlVar = (ecjl) ahknVar7.jI.b();
                context2.getClass();
                ecjlVar.getClass();
                dnnj dnnjVar = dnnj.a;
                dnnjVar.getClass();
                return dndl.a(context2, ecjlVar, dnnjVar, "emoji", "preferences");
            case 431:
                ahkn ahknVar8 = this.a;
                return new ujl((Context) ahknVar8.t.b(), (aipw) ahknVar8.b.hs.b(), ahknVar8.a.qN);
            case 432:
                ahkn ahknVar9 = this.a;
                return new aipw(ahknVar9.a.zs, new aiqn(), (Executor) ahknVar9.p.b());
            case 433:
                return new ukc((vux) this.a.b.hu.b());
            case 434:
                return new vux((aisc) this.a.b.hh.b());
            case 435:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.commit_fragment_transactions_immediately"));
            case 436:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.fix_reattach_on_configuration_change"));
            case 437:
                return new dofb();
            case 438:
                return new uir();
            case 439:
                LocationManager locationManager = (LocationManager) ((Context) this.a.t.b()).getSystemService("location");
                locationManager.getClass();
                return locationManager;
            case 440:
                ahkn ahknVar10 = this.a;
                return new cwjx();
            case 441:
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "EmojiVariantPreferences";
                ehvrVarK.d(cwjt.a);
                ehvs ehvsVarA = ehvrVarK.a();
                ahkn ahknVar11 = this.a;
                return ahknVar11.ev().a(ehvsVarA, (ecev) ahknVar11.aL.b());
            case 442:
                ahkn ahknVar12 = this.a;
                return new cwjw((Executor) ahknVar12.y.b(), (crqv) ahknVar12.aT.b());
            case 443:
                ahkn ahknVar13 = this.a;
                return new bwvr(ahknVar13.a.uO, ahknVar13.eO);
            case 444:
                return new cwlu();
            case 445:
                ahkn ahknVar14 = this.a;
                return new axkc();
            case 446:
                Context context3 = (Context) this.a.t.b();
                cqca.l("Bugle", "FirebaseUserActions initialized");
                return esah.a(context3);
            case 447:
                return new baxg((eosc) this.a.aJ.b());
            case 448:
                ahkn ahknVar15 = this.a;
                new ekph(new ahsf((ahrc) ahknVar15.b.a.a.UB.b()));
                return new batz((dzuc) ahknVar15.cE.b());
            case 449:
                return new ulv();
            case 450:
                ahkn ahknVar16 = this.a;
                bxfu bxfuVar = (bxfu) ahknVar16.eB.b();
                ahnh ahnhVar3 = ahknVar16.a;
                ahng ahngVar4 = ahknVar16.b;
                eyik eyikVar4 = ahngVar4.hI;
                eyik eyikVar5 = ahngVar4.hJ;
                eyik eyikVar6 = ahnhVar3.c;
                dakl daklVar = (dakl) ahnhVar3.BK.b();
                alrj alrjVar = (alrj) ahnhVar3.qi.b();
                return new udb(bxfuVar, eyikVar4, eyikVar5, eyikVar6, daklVar, alrjVar, ahnhVar3.zN, ahngVar4.hK);
            case 451:
                ahkn ahknVar17 = this.a;
                return new udd(ahknVar17.a.zs, (Executor) ahknVar17.p.b());
            case 452:
                ahkn ahknVar18 = this.a;
                return new udm(ahknVar18.a.zs, (Executor) ahknVar18.p.b());
            case 453:
                final eyik eyikVar7 = this.a.a.oO;
                return new aqix() { // from class: aqiq
                    @Override // defpackage.aqix
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.remove_contact_intent_destination_restriction");
                    }
                };
            case 454:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar4 = ahknVar19.a;
                return new crsg(ahknVar19.aT, (cqbm) ahnhVar4.rY.b(), ahnhVar4.Uw, ahknVar19.b.hM);
            case 455:
                final eyik eyikVar8 = this.a.a.oO;
                return new aruf() { // from class: arte
                    @Override // defpackage.aruf
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.delete_is_eligible_for_provisioning");
                    }
                };
            case 456:
                final eyik eyikVar9 = this.a.a.oO;
                return new arue() { // from class: artc
                    @Override // defpackage.arue
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.delete_enable_mo_sms_number_discovery");
                    }
                };
            case 457:
                final eyik eyikVar10 = this.a.a.oO;
                return new arug() { // from class: artg
                    @Override // defpackage.arug
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.delete_provisioning_helper_put_provisioning_consent");
                    }
                };
            case 458:
                return new cqna();
            case 459:
                ahkn ahknVar20 = this.a;
                ahng ahngVar5 = ahknVar20.b;
                return new cklk(ahknVar20.p, ahngVar5.hh, ahngVar5.hQ);
            case 460:
                return new ckln((Executor) this.a.y.b());
            case 461:
                return new ckmy(new cqnr(this.a.b.a.dB));
            case 462:
                return new apuq() { // from class: apbo
                };
            case 463:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar5 = ahknVar21.a;
                return new afgr(ahnhVar5.ajL, ahknVar21.gF, (fdjx) ahnhVar5.m.b(), (cogw) ahknVar21.cD.b());
            case 464:
                final eyik eyikVar11 = this.a.a.oO;
                return new aqha() { // from class: aqgj
                    @Override // defpackage.aqha
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.improve_share_intent_logging");
                    }
                };
            case 465:
                return new aqbl() { // from class: apli
                };
            case 466:
                ahkn ahknVar22 = this.a;
                return new daoe((crqv) ahknVar22.aT.b(), (dakl) ahknVar22.a.BK.b());
            case 467:
                return new cyfw(this.a.a.BK);
            case 468:
                return Boolean.valueOf(((ehdm) this.a.a.os().a.b()).a("com.google.android.apps.messaging.auto", "45417049").e());
            case 469:
                ahkn ahknVar23 = this.a;
                return new cied(ahknVar23.ds, ((cmfe) ahknVar23.b.a.a.xF.b()).i(), ahknVar23.a.c, ahknVar23.cS(), (eosc) ahknVar23.p.b());
            case 470:
                ahkn ahknVar24 = this.a.b.a;
                return Optional.of(new agnu((eosc) ahknVar24.p.b(), (ecjh) ahknVar24.oI.b()));
            case 471:
                ahng ahngVar6 = this.a.b;
                eygg eyggVarA = eyie.a(ahngVar6.ij);
                Optional optionalEmpty = (ahngVar6.p().a() && ((Optional) eyggVarA.b()).isPresent()) ? (Optional) eyggVarA.b() : Optional.empty();
                optionalEmpty.getClass();
                return optionalEmpty;
            case 472:
                return Optional.of(new zbh(this.a.b.ii));
            case 473:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar6 = ahknVar25.a;
                return new zbe((fdjx) ahnhVar6.m.b(), (fcyh) ahknVar25.cz.b(), ahnhVar6.qK, ahknVar25.b.ih);
            case 474:
                return new zat(this.a.a.uA);
            case 475:
                ahkn ahknVar26 = this.a;
                return new cwzu((Context) ahknVar26.t.b(), ahknVar26.a.xl, (eosc) ahknVar26.y.b());
            case 476:
                return new cwzr((byeq) this.a.a.sG.b());
            case 477:
                return Optional.of(new cyiv());
            case 478:
                return new apws() { // from class: apes
                };
            case 479:
                return new apny() { // from class: aoqq
                };
            case 480:
                return Optional.of(new cxup());
            case 481:
                ahnh ahnhVar7 = this.a.a;
                return new abtz((fdjx) ahnhVar7.m.b(), (eotm) ahnhVar7.oN.b(), (apwv) ahnhVar7.ri.b());
            case 482:
                ahnh ahnhVar8 = this.a.a;
                return new coeu((cazj) ahnhVar8.rF.b(), (fdjx) ahnhVar8.oQ.b());
            case 483:
                ahnh ahnhVar9 = this.a.a;
                return new avcq((fdjx) ahnhVar9.m.b(), ahnhVar9.ahj, ahnhVar9.agF);
            case 484:
                ahkn ahknVar27 = this.a;
                return new cygh((Context) ahknVar27.t.b(), (eosc) ahknVar27.pP.b(), ahknVar27.b.k);
            case 485:
                final eyik eyikVar12 = this.a.a.oO;
                return new aqmj() { // from class: aqlu
                    @Override // defpackage.aqmj
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_database_debug_tool");
                    }
                };
            case 486:
                final eyik eyikVar13 = this.a.a.oO;
                return new aprw() { // from class: aoxh
                    @Override // defpackage.aprw
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_debug_menu_show_self_identity_flags");
                    }
                };
            case 487:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar10 = ahknVar28.a;
                return new bbfe((egxv) ahnhVar10.ut.b(), (cogw) ahknVar28.cD.b(), (crma) ahknVar28.da.b(), (crej) ahnhVar10.BH.b(), (bbfg) ahknVar28.b.iz.b(), (eigp) ahknVar28.aI.b());
            case 488:
                ahkn ahknVar29 = this.a;
                Context context4 = (Context) ahknVar29.t.b();
                eyik eyikVar14 = ahknVar29.a.uJ;
                eosc eoscVar = (eosc) ahknVar29.y.b();
                ahkn ahknVar30 = ahknVar29.b.a;
                eosc eoscVar2 = (eosc) ahknVar30.y.b();
                cogw cogwVar = (cogw) ahknVar30.cD.b();
                ahnh ahnhVar11 = ahknVar30.a;
                return new bbfg(context4, eyikVar14, eoscVar, new bbfj(eoscVar2, cogwVar, ahnhVar11.BQ, (bxlc) ahnhVar11.uI.b(), ahnhVar11.Cb, ahnhVar11.Mv, ahnhVar11.Cc));
            case 489:
                ahkn ahknVar31 = this.a;
                return new cqpc((Context) ahknVar31.t.b(), (cqom) ahknVar31.b.iA.b(), (eosc) ahknVar31.eI.b(), (eosc) ahknVar31.p.b(), (cqbm) ahknVar31.a.sX.b());
            case 490:
                ahkn ahknVar32 = this.a;
                feyy feyyVar = (feyy) ahknVar32.iy.b();
                eygg eyggVarA2 = eyie.a(ahknVar32.dH);
                fhdx fhdxVar = new fhdx();
                fhdxVar.d("https://api.tenor.com/");
                fhdxVar.b(new fhel());
                fhdxVar.c(fhen.c((esyd) eyggVarA2.b()));
                feyyVar.getClass();
                fhdxVar.a = feyyVar;
                cqom cqomVar = (cqom) fhdxVar.a().a(cqom.class);
                cqomVar.getClass();
                return cqomVar;
            case 491:
                ahkn ahknVar33 = this.a;
                ahng ahngVar7 = ahknVar33.b;
                return new daav(eyie.a(ahngVar7.ff), ahngVar7.E, ahknVar33.a.vh);
            case 492:
                final eyik eyikVar15 = this.a.a.oO;
                return new aprb() { // from class: aovz
                    @Override // defpackage.aprb
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.add_missing_intent_category_for_launcher_activity");
                    }
                };
            case 493:
                return new bxxc((bxzz) this.a.a.Ry.b());
            case 494:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar12 = ahknVar34.a;
                return new ctie(ahnhVar12.Yn, eyie.a(ahnhVar12.qi), ahknVar34.b.iE);
            case 495:
                return new ctib();
            case 496:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_smart_reply_sent_sound"));
            case 497:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45411436").b());
            case 498:
                final eyik eyikVar16 = this.a.a.oO;
                return new aqab() { // from class: apiz
                    @Override // defpackage.aqab
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.remove_suggested_texts_from_magic_compose");
                    }
                };
            case 499:
                final eyik eyikVar17 = this.a.a.oO;
                return new ascu() { // from class: asch
                    @Override // defpackage.ascu
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.cancel_future_before_unbinding_from_aicore");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        Boolean bool = false;
        switch (i) {
            case 500:
                final eyik eyikVar = this.a.a.oO;
                return new ascv() { // from class: ascj
                    @Override // defpackage.ascv
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.catch_exception_when_unbinding_from_aicore");
                    }
                };
            case 501:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahng ahngVar = ahknVar.b;
                ahnh ahnhVar = ahknVar.a;
                return new ztx(context, ahnhVar.wt, ahknVar.cU, ahknVar.jW, ahnhVar.Xm, (Optional) ahngVar.iK.b());
            case 502:
                return Optional.of(new vcf());
            case 503:
                cczi ccziVar = agri.a;
                return new agrh();
            case 504:
                cczi ccziVar2 = agri.a;
                String str = "aratea-pa.googleapis.com";
                if (cqbe.e() || cqbe.f()) {
                    String str2 = (String) agri.a.e();
                    if (fdbq.f(str2, "autopush")) {
                        str = "autopush-aratea-pa.sandbox.googleapis.com";
                    } else if (fdbq.f(str2, "staging")) {
                        str = "staging-aratea-pa.sandbox.googleapis.com";
                    }
                }
                ehtv ehtvVar = new ehtv();
                ehtvVar.a = str;
                ehtvVar.b = 443;
                ehtvVar.b(extk.e);
                return ehtvVar.c();
            case 505:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new vce(ahnhVar2.Bz, ahnhVar2.acz, ahnhVar2.acN, ahknVar2.p, ahknVar2.y, ahknVar2.bM);
            case 506:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45409908").b());
            case 507:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45409907").b());
            case 508:
                ahkn ahknVar3 = this.a;
                dnea dneaVar = (dnea) ahknVar3.b.iR.b();
                dnfs dnfsVarMi = ahknVar3.a.mi();
                dneaVar.getClass();
                return dnfsVarMi.a(dneaVar);
            case 509:
                return new dnea("magic_compose_style", new fdap() { // from class: dodg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        epiv epivVar = (epiv) obj;
                        epivVar.getClass();
                        return epivVar.name();
                    }
                }, dodh.a);
            case 510:
                ahkn ahknVar4 = this.a;
                return new cyxw(ahknVar4.b.aZ(), (crqv) ahknVar4.aT.b(), (cqbm) ahknVar4.a.sX.b(), (eosc) ahknVar4.eI.b(), (eosd) ahknVar4.y.b(), (eosc) ahknVar4.p.b());
            case 511:
                return MediaViewerActivity.class;
            case 512:
                ahkn ahknVar5 = this.a.b.a;
                ahnh ahnhVar3 = ahknVar5.a;
                return Optional.of(new aivb((fdjx) ahnhVar3.oS.b(), (Context) ahknVar5.t.b(), (cgbn) ahnhVar3.Cs.b()));
            case 513:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45530923").b());
            case 514:
                ahkn ahknVar6 = this.a;
                ahng ahngVar2 = ahknVar6.b;
                return new aisy(eyie.a(ahngVar2.iZ), eyie.a(ahngVar2.ja), eyie.a(ahngVar2.jb), eyie.a(ahngVar2.jc), eyie.a(ahknVar6.je));
            case 515:
                return new dswb((dsxb) this.a.b.iY.b());
            case 516:
                ahng ahngVar3 = this.a.b;
                ekon ekonVar = ekon.a;
                dsxh dsxhVar = (dsxh) ahngVar3.iX.b();
                eksp ekspVar = dszz.a;
                dszx dszxVar = new dszx();
                ekhv ekhvVar = new ekhv();
                ekhvVar.j(ekonVar);
                ekhvVar.c(dsxhVar.e);
                return new dsxb(ekhvVar.g(), dszxVar);
            case 517:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar4 = ahknVar7.a;
                dsuh dsuhVar = (dsuh) ahnhVar4.zC.b();
                final eigp eigpVar = (eigp) ahknVar7.b.a.aI.b();
                ejwi ejwiVarJ = ejwi.j(new dswj() { // from class: egml
                    @Override // defpackage.dswj
                    public final Runnable a(final Runnable runnable) {
                        if (eidc.v()) {
                            return eiid.k(runnable);
                        }
                        final eigp eigpVar2 = eigpVar;
                        return new Runnable() { // from class: egmk
                            @Override // java.lang.Runnable
                            public final void run() {
                                eigp eigpVar3 = eigpVar2;
                                Runnable runnable2 = runnable;
                                eieh eiehVarC = eigpVar3.c("AutoGIL", "com/google/apps/tiktok/analytics/ve/VisualElementModule$VisualElementSingletonModule", "provideTracedRunner", 50);
                                try {
                                    runnable2.run();
                                    eiehVarC.close();
                                } catch (Throwable th) {
                                    try {
                                        eiehVarC.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        };
                    }
                });
                ahnhVar4.mr();
                dsxh dsxhVar2 = new dsxh(dsuhVar, (dswj) ejwiVarJ.e(new dswj() { // from class: dsxp
                    @Override // defpackage.dswj
                    public final Runnable a(Runnable runnable) {
                        return runnable;
                    }
                }), (dstz) ahknVar7.jd.b());
                if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                    Integer num = 500;
                    num.getClass();
                    dsxhVar2.f = 500;
                }
                return dsxhVar2;
            case 518:
                return ((dswb) this.a.b.iZ.b()).b;
            case 519:
                ahkn ahknVar8 = this.a;
                ahng ahngVar4 = ahknVar8.b;
                dsxb dsxbVar = (dsxb) ahngVar4.iY.b();
                eosc eoscVar = (eosc) ahknVar8.y.b();
                dsxh dsxhVar3 = (dsxh) ahngVar4.iX.b();
                dsxbVar.getClass();
                eoscVar.getClass();
                dsxhVar3.getClass();
                new eoss(eoscVar);
                return new dswt(dsxbVar);
            case 520:
                ahkn ahknVar9 = this.a;
                dsuh dsuhVar2 = (dsuh) ahknVar9.a.zC.b();
                dstz dstzVar = (dstz) ahknVar9.jd.b();
                bool.getClass();
                return new dsxm(dsuhVar2, dstzVar);
            case 521:
                return new apwc() { // from class: apds
                };
            case 522:
                return new zud();
            case 523:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar5 = ahknVar10.a;
                fdjx fdjxVar = (fdjx) ahnhVar5.oS.b();
                ahng ahngVar5 = ahknVar10.b;
                return new ajef(fdjxVar, ahngVar5.ji, ahngVar5.jj, ahnhVar5.Wv);
            case 524:
                ahkn ahknVar11 = this.a;
                ahng ahngVar6 = ahknVar11.b;
                ahnh ahnhVar6 = ahknVar11.a;
                return new aixu(ahnhVar6.rc, ahnhVar6.rq, ahnhVar6.sh, ahngVar6.jh, ahnhVar6.rd);
            case 525:
                return new aixx((lkb) this.a.b.jg.b());
            case 526:
                ehvn ehvnVarF = ehvo.f();
                ehvj ehvjVar = (ehvj) ehvnVarF;
                ehvjVar.a = "RcsCujData";
                aixz aixzVar = (aixz) aiya.a.createBuilder();
                aixzVar.getClass();
                ehvjVar.b = aiyb.a(aixzVar);
                ehvnVarF.b(new lne(new fdap() { // from class: aixy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((ljr) obj).getClass();
                        aixz aixzVar2 = (aixz) aiya.a.createBuilder();
                        aixzVar2.getClass();
                        return aiyb.a(aixzVar2);
                    }
                }));
                return this.a.a.mK().a(ehvnVarF.a());
            case 527:
                ahnh ahnhVar7 = this.a.a;
                return new ajei(ahnhVar7.Wv, ahnhVar7.rc, (fdjx) ahnhVar7.oS.b());
            case 528:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqgw() { // from class: aqfz
                    @Override // defpackage.aqgw
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_direct_send_viewer_v2");
                    }
                };
            case 529:
                final eyik eyikVar3 = this.a.a.oO;
                return new arma() { // from class: arlq
                    @Override // defpackage.arma
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.use_projector_in_waffle");
                    }
                };
            case 530:
                ahkn ahknVar12 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar12.cA.b();
                ahnh ahnhVar8 = ahknVar12.a;
                return new cjya(fcyhVar, (fdjx) ahnhVar8.oS.b(), ahnhVar8.rc, ahnhVar8.ru, (Context) ahknVar12.t.b(), ahknVar12.gF, ahnhVar8.Wt, eyie.a(ahknVar12.nx), ahknVar12.eO);
            case 531:
                return new aqkm() { // from class: aqjv
                };
            case 532:
                final eyik eyikVar4 = this.a.a.oO;
                return new askd() { // from class: asjx
                    @Override // defpackage.askd
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.enable_welcome_profile_primitive");
                    }
                };
            case 533:
                ahkn ahknVar13 = this.a;
                return new czsd((eosc) ahknVar13.p.b(), ahknVar13.a.ZG);
            case 534:
                final eyik eyikVar5 = this.a.a.oO;
                return new ardc() { // from class: arap
                    @Override // defpackage.ardc
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.crop_rcs_group_icon_in_multishare");
                    }
                };
            case 535:
                final eyik eyikVar6 = this.a.a.oO;
                return new arec() { // from class: arcl
                    @Override // defpackage.arec
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.remove_avatar_monogram_creator_one_to_one_param");
                    }
                };
            case 536:
                return Long.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45664219").b());
            case 537:
                return Long.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45664220").b());
            case 538:
                return new apux() { // from class: apca
                };
            case 539:
                final eyik eyikVar7 = this.a.a.oO;
                return new apwp() { // from class: apeo
                    @Override // defpackage.apwp
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.enable_mms_group_upgrade_ui_home_screen");
                    }
                };
            case 540:
                return Boolean.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45662759").e());
            case 541:
                final eyik eyikVar8 = this.a.a.oO;
                return new asgt() { // from class: asfx
                    @Override // defpackage.asgt
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.enable_home_cool_ranch_phase3");
                    }
                };
            case 542:
                final eyik eyikVar9 = this.a.a.oO;
                return new apql() { // from class: aouy
                    @Override // defpackage.apql
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.enable_in_bubble_read_receipts");
                    }
                };
            case 543:
                return Long.valueOf(((ehdm) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto", "45665592").b());
            case 544:
                final eyik eyikVar10 = this.a.a.oO;
                return new ashz() { // from class: ashi
                    @Override // defpackage.ashz
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.enable_status_ux_updates");
                    }
                };
            case 545:
                final eyik eyikVar11 = this.a.a.oO;
                return new apup() { // from class: apbm
                    @Override // defpackage.apup
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_adapter_get_item_null_counter");
                    }
                };
            case 546:
                final eyik eyikVar12 = this.a.a.oO;
                return new arfk() { // from class: arep
                    @Override // defpackage.arfk
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.check_selection_state_while_handling_avatar_click");
                    }
                };
            case 547:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar9 = ahknVar14.a;
                cjxi cjxiVar = (cjxi) ahnhVar9.yf.b();
                eyik eyikVar13 = ahknVar14.b.a.aQ;
                return new cjtk(cjxiVar, new egzg((egzh) eyikVar13.b()), new egzg((egzh) eyikVar13.b()), (egyt) ahknVar14.dj.b(), (cogw) ahknVar14.cD.b(), (cqbm) ahnhVar9.rY.b(), (eosc) ahknVar14.y.b(), (eosc) ahknVar14.aJ.b(), (eosc) ahknVar14.p.b(), (crqv) ahknVar14.aT.b(), (egzh) ahknVar14.aQ.b(), (cmlb) ahnhVar9.rd.b(), ahnhVar9.ri, ahnhVar9.rq, ahnhVar9.Uw);
            case 548:
                ahkn ahknVar15 = this.a;
                Context context2 = (Context) ahknVar15.t.b();
                Executor executor = (Executor) ahknVar15.y.b();
                ahng ahngVar7 = ahknVar15.b;
                return new czty(context2, executor, ahknVar15.dI, ahngVar7.jE, ahngVar7.jn);
            case 549:
                final eyik eyikVar14 = this.a.a.oO;
                return new arqk() { // from class: arqf
                    @Override // defpackage.arqk
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.strings_update_for_otp_deletion_banner_bind_data");
                    }
                };
            case 550:
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "SwipeActionSettingsDataStore";
                ehvrVarK.d(cvbc.a);
                ehvs ehvsVarA = ehvrVarK.a();
                ahkn ahknVar16 = this.a;
                return ahknVar16.ev().a(ehvsVarA, (ecev) ahknVar16.aL.b());
            case 551:
                final eyik eyikVar15 = this.a.a.oO;
                return new apur() { // from class: apbq
                    @Override // defpackage.apur
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_conversation_list_debug_menu");
                    }
                };
            case 552:
                final eyik eyikVar16 = this.a.a.oO;
                return new apuw() { // from class: apby
                    @Override // defpackage.apuw
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.tint_menu_item_intead_of_icon");
                    }
                };
            case 553:
                return new teo();
            case 554:
                ahkn ahknVar17 = this.a;
                cgbn cgbnVar = (cgbn) ahknVar17.a.Cs.b();
                ahng ahngVar8 = ahknVar17.b;
                ahkn ahknVar18 = ahngVar8.a;
                return new aasi(cgbnVar, new aash((Context) ahknVar18.t.b(), (cgei) ahknVar18.a.qF.b()), (aasf) ahngVar8.jL.b());
            case 555:
                ahkn ahknVar19 = this.a;
                return new aasf(ahknVar19.a.qr, ahknVar19.aN, (eosc) ahknVar19.y.b());
            case 556:
                return new aavf();
            case 557:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar10 = ahknVar20.a;
                return new aasx(ahnhVar10.EG, (Optional) ahnhVar10.FQ.b(), (eosc) ahknVar20.p.b(), (eosc) ahknVar20.y.b(), (Context) ahknVar20.t.b(), (crmx) ahnhVar10.pB.b());
            case 558:
                eyik eyikVar17 = this.a.a.qK;
                eyikVar17.getClass();
                cmgk cmgkVar = (cmgk) eyikVar17.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.ARCHIVAL_SETTINGS);
                cmggVarC.f(cnqg.a);
                return cmgkVar.a(cmggVarC.a());
            case 559:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45684591").b());
            case 560:
                return new agxy((aimb) this.a.a.rc.b());
            case 561:
                ahkn ahknVar21 = this.a;
                cqtp cqtpVar = (cqtp) ahknVar21.dK.b();
                ahnh ahnhVar11 = ahknVar21.a;
                return new adae(cqtpVar, (fdjx) ahnhVar11.m.b(), (fdjx) ahnhVar11.oS.b(), (auaq) ahknVar21.js.b(), (alrj) ahnhVar11.qi.b(), (cogw) ahknVar21.cD.b());
            case 562:
                ahnh ahnhVar12 = this.a.a;
                return new aczv((fdjx) ahnhVar12.m.b(), (aofc) ahnhVar12.yD.b());
            case 563:
                ahkn ahknVar22 = this.a;
                return new aczp((fdjx) ahknVar22.a.oS.b(), (cqtp) ahknVar22.dK.b(), ahknVar22.b.F());
            case 564:
                return new AtomicBoolean(false);
            case 565:
                ehvr ehvrVarK2 = ehvs.k();
                ((ehvl) ehvrVarK2).a = "AutoSignInData";
                ehvrVarK2.d(abza.a);
                ehvs ehvsVarA2 = ehvrVarK2.a();
                ahkn ahknVar23 = this.a;
                return ahknVar23.ev().a(ehvsVarA2, (ecev) ahknVar23.aL.b());
            case 566:
                ahng ahngVar9 = this.a.b;
                return new dtai(ahngVar9.iZ, ahngVar9.ja, ahngVar9.jc);
            case 567:
                ahkn ahknVar24 = this.a;
                final Context context3 = (Context) ahknVar24.t.b();
                ejwi ejwiVarJ2 = ejwi.j((eosc) ahknVar24.y.b());
                final EducationDatabase educationDatabase = (EducationDatabase) ahknVar24.b.jX.b();
                final ExecutorService executorService = (ExecutorService) ejwiVarJ2.e(Executors.newCachedThreadPool(dyql.a()));
                return new ejxr() { // from class: dykz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        dyky dykyVar = new dyky(context3, executorService);
                        dykyVar.d = educationDatabase;
                        return dykyVar;
                    }
                };
            case 568:
                ahkn ahknVar25 = this.a;
                EducationDatabase educationDatabaseX = EducationDatabase.x((Context) ahknVar25.t.b(), (ExecutorService) ejwi.j((eosc) ahknVar25.y.b()).e(Executors.newCachedThreadPool(dyql.a())));
                educationDatabaseX.getClass();
                return educationDatabaseX;
            case 569:
                ekgp ekgpVar = ekoj.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(((ekoj) ekgpVar).d));
                for (Map.Entry entry : ekgpVar.entrySet()) {
                    dlux dluxVar = (dlux) entry.getKey();
                    doig doigVarA = dohx.a(dluxVar.a());
                    if (doigVarA == null) {
                        throw new IllegalArgumentException("Invalid MediaType registered: '" + dluxVar.a() + "'");
                    }
                    linkedHashMap.put(doigVarA, entry.getValue());
                }
                return linkedHashMap;
            case 570:
                ahkn ahknVar26 = this.a;
                Context context4 = (Context) ahknVar26.t.b();
                ahng ahngVar10 = ahknVar26.b;
                dndk dndkVar = (dndk) ahngVar10.kb.b();
                ahnh ahnhVar13 = ahngVar10.a.a;
                return new domr(context4, dndkVar, new domb((fdjx) ahnhVar13.oQ.b()), new domd((fdjx) ahnhVar13.oQ.b()), new domu((fdjx) ahnhVar13.oQ.b()), (fdjx) ahknVar26.a.oQ.b(), ahngVar10.kd);
            case 571:
                ahkn ahknVar27 = this.a;
                return new dndk((Context) ahknVar27.t.b(), (fdjx) ahknVar27.a.oQ.b(), ahknVar27.b.ka);
            case 572:
                return Optional.of(bool);
            case 573:
                return Optional.of((dluu) this.a.b.kc.b());
            case 574:
                return new dluu(true, true, true, false);
            case 575:
                final eyik eyikVar18 = this.a.a.oO;
                return new aqdt() { // from class: aqdo
                    @Override // defpackage.aqdt
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.enable_mini_camera_lifecycle_observer_fix");
                    }
                };
            case 576:
                return Optional.of((acei) this.a.b.kh.b());
            case 577:
                ahnh ahnhVar14 = this.a.a;
                return new acei(ahnhVar14.pb, ahnhVar14.pQ);
            case 578:
                return Boolean.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45653938").e());
            case 579:
                final eyik eyikVar19 = this.a.a.oO;
                return new arvo() { // from class: arvf
                    @Override // defpackage.arvo
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.fix_rbm_in_mini_conversation_details_page");
                    }
                };
            case 580:
                return ((ehdm) this.a.a.oq().a.b()).a("com.google.android.apps.messaging.auto", "45648946").d();
            case 581:
                final eyik eyikVar20 = this.a.a.oO;
                return new arfr() { // from class: arfd
                    @Override // defpackage.arfr
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.fix_talk_back_focus_in_action_mode");
                    }
                };
            case 582:
                final eyik eyikVar21 = this.a.a.oO;
                return new arfm() { // from class: aret
                    @Override // defpackage.arfm
                    public final boolean a() {
                        return ((eoth) eyikVar21.b()).a("bugle.deprecate_set_system_ui_visibility");
                    }
                };
            case 583:
                final eyik eyikVar22 = this.a.a.oO;
                return new arkg() { // from class: arjz
                    @Override // defpackage.arkg
                    public final boolean a() {
                        return ((eoth) eyikVar22.b()).a("bugle.enable_display_cutout_fix");
                    }
                };
            case 584:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_lighter_settings_page_as_view"));
            case 585:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_smart_context"));
            case 586:
                final eyik eyikVar23 = this.a.a.oO;
                return new asgs() { // from class: asfv
                    @Override // defpackage.asgs
                    public final boolean a() {
                        return ((eoth) eyikVar23.b()).a("bugle.enable_edge_to_edge_in_message_details");
                    }
                };
            case 587:
                return new uzl(this.a.b.iH);
            case 588:
                return new ehrd((Context) this.a.t.b());
            case 589:
                ahkn ahknVar28 = this.a;
                Context context5 = (Context) ahknVar28.t.b();
                return new abvk(context5, Optional.of(new abvm()), (aidr) ahknVar28.cV.b());
            case 590:
                final eyik eyikVar24 = this.a.a.oO;
                return new aqeb() { // from class: aqdz
                    @Override // defpackage.aqeb
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.use_sim_subscription_info_retriever_in_fi_account_flags");
                    }
                };
            case 591:
                return Boolean.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45460584").e());
            case 592:
                final eyik eyikVar25 = this.a.a.oO;
                return new asgq() { // from class: asfr
                    @Override // defpackage.asgq
                    public final boolean a() {
                        return ((eoth) eyikVar25.b()).a("bugle.enable_device_pairing_cool_ranch_phase3");
                    }
                };
            case 593:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar15 = ahknVar29.a;
                return new bxwm(ahnhVar15.fw(), (bxxd) ahnhVar15.MF.b(), (eosc) ahknVar29.y.b(), (eosc) ahknVar29.aJ.b());
            case 594:
                final eyik eyikVar26 = this.a.a.oO;
                return new asgw() { // from class: asgd
                    @Override // defpackage.asgw
                    public final boolean a() {
                        return ((eoth) eyikVar26.b()).a("bugle.enable_search_cool_ranch_phase3");
                    }
                };
            case 595:
                final eyik eyikVar27 = this.a.a.oO;
                return new asky() { // from class: askr
                    @Override // defpackage.asky
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.enable_searching_ui_state");
                    }
                };
            case 596:
                final eyik eyikVar28 = this.a.a.oO;
                return new askx() { // from class: askp
                    @Override // defpackage.askx
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.enable_search_large_screen_background_color_fix");
                    }
                };
            case 597:
                eyik eyikVar29 = this.a.b.kC;
                eyikVar29.getClass();
                return Boolean.valueOf(!Process.isIsolated() && ((Boolean) eyikVar29.b()).booleanValue());
            case 598:
                return Boolean.valueOf(((ehdm) this.a.a.ph().a.b()).a("tiktok.directboot", "45688088").e());
            case 599:
                return new syd((Context) this.a.t.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.b;
        switch (i) {
            case 600:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                return new axjx(context);
            case 601:
                return new umv();
            case 602:
                ahkn ahknVar2 = this.a;
                return new agxx(ahknVar2.a.zs, new agxm(), (Executor) ahknVar2.p.b());
            case 603:
                return new cqei();
            case 604:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.fix_gif_flickering_in_message_list"));
            case 605:
                return new apys() { // from class: aphe
                };
            case 606:
                final eyik eyikVar = this.a.a.oO;
                return new arwy() { // from class: arwr
                    @Override // defpackage.arwy
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_disabled_via_flags_in_settings");
                    }
                };
            case 607:
                ahkn ahknVar3 = this.a;
                return new bbgz();
            case 608:
                return new cqvh();
            case 609:
                Vibrator vibrator = (Vibrator) ((Context) this.a.t.b()).getSystemService("vibrator");
                vibrator.getClass();
                return vibrator;
            case 610:
                ahkn ahknVar4 = this.a;
                return new aihi((cogw) ahknVar4.cD.b(), (Context) ahknVar4.t.b(), (aaxw) ahknVar4.b.kO.b());
            case 611:
                return new aaxw((Context) this.a.t.b());
            case 612:
                return new aien();
            case 613:
                return new cqwi((ehrb) this.a.hD.b());
            case 614:
                final eyik eyikVar2 = this.a.a.oO;
                return new apui() { // from class: apba
                    @Override // defpackage.apui
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.remove_send_ripple_on_go");
                    }
                };
            case 615:
                final eyik eyikVar3 = this.a.a.oO;
                return new askw() { // from class: askn
                    @Override // defpackage.askw
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_media_item_decoration_fix");
                    }
                };
            case 616:
                return ((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45660384").d();
            case 617:
                final eyik eyikVar4 = this.a.a.oO;
                return new aske() { // from class: asjz
                    @Override // defpackage.aske
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.fix_welcome_flow_scroll_crash");
                    }
                };
            case 618:
                final eyik eyikVar5 = this.a.a.oO;
                return new asgm() { // from class: asfl
                    @Override // defpackage.asgm
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_conversation_details_cool_ranch_phase3");
                    }
                };
            case 619:
                return new vuc();
            case 620:
                return new aqkz() { // from class: aqks
                };
            case 621:
                final eyik eyikVar6 = this.a.a.oO;
                return new ardu() { // from class: arbv
                    @Override // defpackage.ardu
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.log_client_failure_for_remove_operation");
                    }
                };
            case 622:
                return ((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45650861").d();
            case 623:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45477694").b());
            case 624:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45618039").b());
            case 625:
                return new zwf((aisp) this.a.a.zF.b());
            case 626:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45477695").b());
            case 627:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_cdp_education"));
            case 628:
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "CdpEducationTooltipData";
                ehvrVarK.d(aagw.a);
                ehvs ehvsVarA = ehvrVarK.a();
                ahkn ahknVar5 = this.a;
                return ahknVar5.ev().a(ehvsVarA, (ecev) ahknVar5.aL.b());
            case 629:
                return new wow();
            case 630:
                ahnh ahnhVar = this.a.a;
                asyh asyhVarCX = ahnhVar.cX();
                aszw aszwVarCZ = ahnhVar.cZ();
                return ahnhVar.bk().a() ? ahnhVar.cT().a(aszwVarCZ, null) : asyhVarCX.c(aszwVarCZ);
            case 631:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar2 = ahknVar6.a;
                fdjx fdjxVar = (fdjx) ahnhVar2.m.b();
                ahng ahngVar = ahknVar6.b;
                ahngVar.i();
                ahkn ahknVar7 = ahngVar.a;
                return new vvf(fdjxVar, new vub((cqmb) ahknVar7.cU.b()), new vtg(), (Optional) ahknVar6.lj.b(), Optional.of(new ckdt((fcyh) ahknVar7.cz.b(), (cogw) ahknVar7.cD.b())), ahnhVar2.zs, new aiqn(), (Executor) ahknVar6.p.b());
            case 632:
                return new abvh();
            case 633:
                ahkn ahknVar8 = this.a;
                ahng ahngVar2 = ahknVar8.b;
                eyik eyikVar7 = ahknVar8.a.uA;
                eyik eyikVar8 = ahngVar2.ll;
                eyik eyikVar9 = ahngVar2.lk;
                eyikVar7.getClass();
                eyikVar8.getClass();
                eyikVar9.getClass();
                return new abvg(eyikVar7, eyikVar8, eyikVar9);
            case 634:
                cogw cogwVar = (cogw) this.a.cD.b();
                cogwVar.getClass();
                return new abvd(cogwVar);
            case 635:
                Executor executor = (Executor) this.a.a.j.b();
                executor.getClass();
                return fdli.b(executor);
            case 636:
                return new aqgv() { // from class: aqgb
                };
            case 637:
                final eyik eyikVar10 = this.a.a.oO;
                return new apqo() { // from class: aovc
                    @Override // defpackage.apqo
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.prevent_input_close_on_scroll");
                    }
                };
            case 638:
                return new aqgy() { // from class: aqgf
                };
            case 639:
                return Long.valueOf(((ehdm) this.a.b.cB().a.b()).a("com.google.android.apps.messaging.auto", "45667967").b());
            case 640:
                return Long.valueOf(((ehdm) this.a.b.cB().a.b()).a("com.google.android.apps.messaging.auto", "45667968").b());
            case 641:
                return Long.valueOf(((ehdm) this.a.b.cB().a.b()).a("com.google.android.apps.messaging.auto", "45667969").b());
            case 642:
                return Long.valueOf(((ehdm) this.a.b.cB().a.b()).a("com.google.android.apps.messaging.auto", "45667970").b());
            case 643:
                final eyik eyikVar11 = this.a.a.oO;
                return new aqgr() { // from class: aqfs
                    @Override // defpackage.aqgr
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_clear_attachments_on_close_in_direct_send_viewer_v2");
                    }
                };
            case 644:
                ahkn ahknVar9 = this.a;
                return new dqjo((Context) ahknVar9.t.b(), (fdjx) ahknVar9.a.oQ.b(), new dqiy(eoob.a(30L), fcwa.g(new fcti("arcade_messages_bunny", Integer.valueOf(R.string.bunny_display_name)), new fcti("arcade_messages_film_noir", Integer.valueOf(R.string.film_noir_display_name)), new fcti("arcade_messages_cute_glasses", Integer.valueOf(R.string.cute_glasses_display_name)), new fcti("arcade_messages_feathery_dinosaur", Integer.valueOf(R.string.feathery_dinosaur_display_name)), new fcti("arcade_messages_glowing_hat", Integer.valueOf(R.string.glowing_hat_display_name)), new fcti("arcade_messages_strawberry", Integer.valueOf(R.string.strawberry_display_name)), new fcti("arcade_olympic_runner", Integer.valueOf(R.string.olympic_runner_display_name)), new fcti("valentines_day_panda", Integer.valueOf(R.string.valentines_day_panda_display_name)), new fcti("arcade_retouch_meet", Integer.valueOf(R.string.portrait_touchup_display_name))), fcwa.c(new fcti("arcade_retouch_meet", Integer.valueOf(R.drawable.gs_face_retouch_vd_theme_24))), fcwa.c(new fcti("arcade_retouch_meet", new dpxc()))));
            case 645:
                final eyik eyikVar12 = this.a.a.oO;
                return new apnt() { // from class: aoqi
                    @Override // defpackage.apnt
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_cfx");
                    }
                };
            case 646:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqdv() { // from class: aqdr
                    @Override // defpackage.aqdv
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_simultaneous_use_cases");
                    }
                };
            case 647:
                final eyik eyikVar14 = this.a.a.oO;
                return new aqgu() { // from class: aqfx
                    @Override // defpackage.aqgu
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.enable_direct_send_from_camera_gallery_input");
                    }
                };
            case 648:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45662831").b());
            case 649:
                return Long.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45598668").b());
            case 650:
                return Long.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45598669").b());
            case 651:
                return Long.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45598667").b());
            case 652:
                return Long.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45598670").b());
            case 653:
                return Boolean.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45613505").e());
            case 654:
                return new aqvq() { // from class: aqvn
                };
            case 655:
                final eyik eyikVar15 = this.a.a.oO;
                return new apuf() { // from class: apaw
                    @Override // defpackage.apuf
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_using_parent_theme_on_hugo_compose_screens");
                    }
                };
            case 656:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_voice_screen_invocations"));
            case 657:
                final eyik eyikVar16 = this.a.a.oO;
                return new apwo() { // from class: apem
                    @Override // defpackage.apwo
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.enable_mms_group_upgrade_ui_conversation_screen");
                    }
                };
            case 658:
                final eyik eyikVar17 = this.a.a.oO;
                return new aqhd() { // from class: aqgp
                    @Override // defpackage.aqhd
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.use_android_fragment_in_hugo");
                    }
                };
            case 659:
                return Long.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45662674").b());
            case 660:
                final eyik eyikVar18 = this.a.a.oO;
                return new aqsc() { // from class: aqpn
                    @Override // defpackage.aqsc
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.dsdr_fix_top_app_bar_middle_ui_adapter_impl");
                    }
                };
            case 661:
                ehvr ehvrVarK2 = ehvs.k();
                ((ehvl) ehvrVarK2).a = "EarlyFeedbackData";
                ehvrVarK2.d(aaio.a);
                ehvs ehvsVarA2 = ehvrVarK2.a();
                ahkn ahknVar10 = this.a;
                return ahknVar10.ev().a(ehvsVarA2, (ecev) ahknVar10.aL.b());
            case 662:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45427029").b());
            case 663:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45427030").b());
            case 664:
                return Boolean.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45476294").e());
            case 665:
                return Boolean.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45667618").e());
            case 666:
                final eyik eyikVar19 = this.a.a.oO;
                return new aqaj() { // from class: apjn
                    @Override // defpackage.aqaj
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_profile_name_in_reactions");
                    }
                };
            case 667:
                final eyik eyikVar20 = this.a.a.oO;
                return new aqur() { // from class: aqui
                    @Override // defpackage.aqur
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.enable_recipient_display_name");
                    }
                };
            case 668:
                final eyik eyikVar21 = this.a.a.oO;
                return new aprc() { // from class: aowb
                    @Override // defpackage.aprc
                    public final boolean a() {
                        return ((eoth) eyikVar21.b()).a("bugle.enable_e2ee_transient_bottom_notice");
                    }
                };
            case 669:
                return Long.valueOf(((ehdm) this.a.b.cz().a.b()).a("com.google.android.apps.messaging.auto", "45664398").b());
            case 670:
                return new bxff(this.a.b.lY);
            case 671:
                ahkn ahknVar11 = this.a;
                ahng ahngVar3 = ahknVar11.b;
                ahnh ahnhVar3 = ahknVar11.a;
                return new bxfg(ahknVar11.kb, ahnhVar3.qo, ahngVar3.lW, ahngVar3.lX, ahnhVar3.qi);
            case 672:
                ahkn ahknVar12 = this.a;
                return new bxfo(ahknVar12.t, ahknVar12.cD);
            case 673:
                return new bxfn(this.a.t);
            case 674:
                ahnh ahnhVar4 = this.a.a;
                return new cwmr((fdjx) ahnhVar4.oQ.b(), ahnhVar4.Bz);
            case 675:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45639922").b());
            case 676:
                final eyik eyikVar22 = this.a.a.oO;
                return new apwh() { // from class: apea
                    @Override // defpackage.apwh
                    public final boolean a() {
                        return ((eoth) eyikVar22.b()).a("bugle.enable_media_viewer_reactions");
                    }
                };
            case 677:
                final eyik eyikVar23 = this.a.a.oO;
                return new apwi() { // from class: apec
                    @Override // defpackage.apwi
                    public final boolean a() {
                        return ((eoth) eyikVar23.b()).a("bugle.enable_media_viewer_replies");
                    }
                };
            case 678:
                final eyik eyikVar24 = this.a.a.oO;
                return new aqpc() { // from class: aqpd
                    @Override // defpackage.aqpc
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.add_conversation_id_to_bugle_compose_disabled_event");
                    }
                };
            case 679:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45648581").b());
            case 680:
                return Long.valueOf(((ehdm) this.a.b.cE().a.b()).a("com.google.android.apps.messaging.auto", "45665041").b());
            case 681:
                return Long.valueOf(((ehdm) this.a.b.cE().a.b()).a("com.google.android.apps.messaging.auto", "45665042").b());
            case 682:
                return Long.valueOf(((ehdm) this.a.b.cE().a.b()).a("com.google.android.apps.messaging.auto", "45665043").b());
            case 683:
                return Long.valueOf(((ehdm) this.a.b.cE().a.b()).a("com.google.android.apps.messaging.auto", "45665044").b());
            case 684:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45613917").b());
            case 685:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45640007").b());
            case 686:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45629264").b());
            case 687:
                return Long.valueOf(((ehdm) this.a.b.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45630590").b());
            case 688:
                return Long.valueOf(((ehdm) this.a.b.cx().a.b()).a("com.google.android.apps.messaging.auto", "45478358").b());
            case 689:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar5 = ahknVar13.a;
                return new zpe(ahnhVar5.Bz, (fdjx) ahnhVar5.oQ.b(), ahknVar13.b.aK());
            case 690:
                final eyik eyikVar25 = this.a.a.oO;
                return new aqtg() { // from class: aqrt
                    @Override // defpackage.aqtg
                    public final boolean a() {
                        return ((eoth) eyikVar25.b()).a("bugle.show_sim_name_for_one_self_identity_group");
                    }
                };
            case 691:
                final eyik eyikVar26 = this.a.a.oO;
                return new aqib() { // from class: aqhz
                    @Override // defpackage.aqib
                    public final boolean a() {
                        return ((eoth) eyikVar26.b()).a("bugle.enable_ignore_stale_draft_extras");
                    }
                };
            case 692:
                return (ewto) ((ehdm) this.a.a.oH().a.b()).a("com.google.android.apps.messaging.auto", "45693299").c();
            case 693:
                final eyik eyikVar27 = this.a.a.oO;
                return new asam() { // from class: arzn
                    @Override // defpackage.asam
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.fix_satellite_toolstone_localization");
                    }
                };
            case 694:
                final eyik eyikVar28 = this.a.a.oO;
                return new arql() { // from class: arqm
                    @Override // defpackage.arql
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.announce_scam_alert_card_in_talkback");
                    }
                };
            case 695:
                final eyik eyikVar29 = this.a.a.oO;
                return new aqki() { // from class: aqjn
                    @Override // defpackage.aqki
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.enable_provide_assist_content");
                    }
                };
            case 696:
                return new agtg();
            case 697:
                return new asaj() { // from class: arzh
                };
            case 698:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45426357").b());
            case 699:
                final eyik eyikVar30 = this.a.a.oO;
                return new aqiu() { // from class: aqim
                    @Override // defpackage.aqiu
                    public final boolean a() {
                        return ((eoth) eyikVar30.b()).a("bugle.enable_display_formatted_contact_destination");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 700:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45409228").b());
            case 701:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45409229").b());
            case 702:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45409230").b());
            case 703:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45428666").b());
            case 704:
                return Long.valueOf(((ehdm) this.a.b.cC().a.b()).a("com.google.android.apps.messaging.auto", "45428705").b());
            case 705:
                eyik eyikVar = this.a.b.mF;
                eyikVar.getClass();
                ehtv ehtvVar = new ehtv();
                ehtvVar.b(eucc.M);
                ehtvVar.a = (String) eyikVar.b();
                ehtvVar.b = 443;
                return ehtvVar.c();
            case 706:
                return ((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45416769").d();
            case 707:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqbo() { // from class: apln
                    @Override // defpackage.aqbo
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.start_chat_enable_rcs_check_timeout");
                    }
                };
            case 708:
                final eyik eyikVar3 = this.a.a.oO;
                return new aqan() { // from class: apjw
                    @Override // defpackage.aqan
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_bot_id_resolver_via_bot_info");
                    }
                };
            case 709:
                final eyik eyikVar4 = this.a.a.oO;
                return new aqao() { // from class: apjs
                    @Override // defpackage.aqao
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.enable_bot_id_resolver_via_bot_info_germany");
                    }
                };
            case 710:
                final eyik eyikVar5 = this.a.a.oO;
                return new aqap() { // from class: apju
                    @Override // defpackage.aqap
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_bot_id_resolver_via_bot_info_global");
                    }
                };
            case 711:
                final eyik eyikVar6 = this.a.a.oO;
                return new aqam() { // from class: apjq
                    @Override // defpackage.aqam
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.enable_bot_id_resolver_in_chat_starter");
                    }
                };
            case 712:
                return Long.valueOf(((ehdm) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto", "45418255").b());
            case 713:
                return Long.valueOf(((ehdm) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto", "45618101").b());
            case 714:
                return (evrj) ((ehdm) this.a.a.op().a.b()).a("com.google.android.apps.messaging.auto", "45690605").c();
            case 715:
                return (evrj) ((ehdm) this.a.a.op().a.b()).a("com.google.android.apps.messaging.auto", "45691161").c();
            case 716:
                final eyik eyikVar7 = this.a.a.oO;
                return new asdu() { // from class: asdi
                    @Override // defpackage.asdu
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.enable_edge_to_edge_in_start_chat");
                    }
                };
            case 717:
                final eyik eyikVar8 = this.a.a.oO;
                return new asdx() { // from class: asdo
                    @Override // defpackage.asdx
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.fix_start_chat_backspace_handling");
                    }
                };
            case 718:
                final eyik eyikVar9 = this.a.a.oO;
                return new asdv() { // from class: asdk
                    @Override // defpackage.asdv
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.enable_start_chat_back_behavior_fix");
                    }
                };
            case 719:
                final eyik eyikVar10 = this.a.a.oO;
                return new asds() { // from class: asde
                    @Override // defpackage.asds
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.enable_add_group_name_back_behavior_fix");
                    }
                };
            case 720:
                final eyik eyikVar11 = this.a.a.oO;
                return new asgx() { // from class: asgf
                    @Override // defpackage.asgx
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_settings_cool_ranch_phase3");
                    }
                };
            case 721:
                return new abbm();
            case 722:
                final eyik eyikVar12 = this.a.a.oO;
                return new arfl() { // from class: arer
                    @Override // defpackage.arfl
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.deprecate_action_mode_v1");
                    }
                };
            case 723:
                ehkk ehkkVar = (ehkk) this.a.b.gi.b();
                ehkkVar.getClass();
                return new ehdy(ehkkVar);
            case 724:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                egcd egcdVar = (egcd) ahnhVar.l.b();
                ekgi ekgiVarH = ekgp.h(10);
                ahng ahngVar = ahknVar.b;
                ekgiVarH.i(egjp.class, ahngVar.mY);
                ekgiVarH.i(egkc.class, ahngVar.a.a.aow);
                ekgiVarH.i(sqw.class, ahngVar.mZ);
                ekgiVarH.i(abyy.class, ahngVar.nc);
                ekgiVarH.i(cdqr.class, ahngVar.nd);
                ekgiVarH.i(tmp.class, ahngVar.ne);
                ekgiVarH.i(abhz.class, ahngVar.ng);
                ekgiVarH.i(egkm.class, ahngVar.nh);
                ekgiVarH.i(eghx.class, ahngVar.ni);
                ekgiVarH.i(sqx.class, ahngVar.nj);
                return new egaa(egcdVar, ekgiVarH.c(), ekgp.m(eglv.class, ahngVar.nk, acbm.class, ahngVar.nl), ekgp.l(tmk.class, ahngVar.nm), new ekph("pseudonymous"), (efyt) ahnhVar.aox.b());
            case 725:
                ahkn ahknVar2 = this.a.b.a;
                egyt egytVar = (egyt) ahknVar2.dj.b();
                ahnh ahnhVar2 = ahknVar2.a;
                return new egjp(new egjr(egytVar, (egcd) ahnhVar2.l.b(), (egbf) ahnhVar2.pG.b()), ejwi.j(Boolean.valueOf(((ehdm) ahnhVar2.g.b()).a("tiktok.device", "45670050").e())));
            case 726:
                ahkn ahknVar3 = this.a;
                return new sqw((egkc) ahknVar3.a.aow.b(), new egjv((egkc) ahknVar3.b.a.a.aow.b()));
            case 727:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar3 = ahknVar4.a;
                egbf egbfVar = (egbf) ahnhVar3.pG.b();
                egcd egcdVar2 = (egcd) ahnhVar3.l.b();
                ahng ahngVar2 = ahknVar4.b;
                return new abyy(egbfVar, egcdVar2, new abzk((fdjx) ahngVar2.a.a.oS.b(), (ecjh) ahngVar2.jV.b(), ahngVar2.na), ahngVar2.nb, (fdjx) ahnhVar3.oS.b(), ahknVar4.cD, (egyt) ahknVar4.dj.b(), ahngVar2.af, ahnhVar3.tG, (fdjx) ahnhVar3.m.b());
            case 728:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar4 = ahknVar5.a;
                return new dath((fdjx) ahnhVar4.oS.b(), (dhkw) ahknVar5.dJ.b(), ahknVar5.b.bC(), (egbf) ahnhVar4.pG.b(), (egyt) ahknVar5.dj.b());
            case 729:
                return new abzl(this.a.a.pQ);
            case 730:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar5 = ahknVar6.a;
                return new cdqr((egkc) ahnhVar5.aow.b(), (egbf) ahnhVar5.pG.b(), (eosc) ahknVar6.y.b());
            case 731:
                return new tmp((axky) this.a.a.HN.b());
            case 732:
                ahkn ahknVar7 = this.a;
                return new abhz((abhr) ahknVar7.b.nf.b(), (eosc) ahknVar7.p.b());
            case 733:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar6 = ahknVar8.a;
                return new abhr((egbf) ahnhVar6.pG.b(), (eosc) ahknVar8.y.b(), (egej) ahnhVar6.pI.b(), (dyyv) ahnhVar6.anY.b(), (eosc) ahknVar8.p.b(), (abfv) ahknVar8.lT.b());
            case 734:
                return new egkm();
            case 735:
                ahkn ahknVar9 = this.a;
                return new eghx(ahknVar9.b.cp(), (egcd) ahknVar9.a.l.b());
            case 736:
                ahkn ahknVar10 = this.a;
                return new sqx(Optional.empty(), (egcd) ahknVar10.a.l.b(), ahknVar10.b.cp());
            case 737:
                return new eglv((Context) this.a.t.b());
            case 738:
                ahkn ahknVar11 = this.a;
                Context context = (Context) ahknVar11.t.b();
                ahnh ahnhVar7 = ahknVar11.a;
                return new acbm(context, (cdku) ahnhVar7.tG.b(), ahnhVar7.wc, (eosc) ahknVar11.p.b());
            case 739:
                ahkn ahknVar12 = this.a;
                return new tmi((fdjx) ahknVar12.a.m.b(), (Context) ahknVar12.t.b());
            case 740:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_no_account_available_error_exception_fix"));
            case 741:
                ahkn ahknVar13 = this.a;
                Context context2 = (Context) ahknVar13.t.b();
                ahnh ahnhVar8 = ahknVar13.a;
                return new abie(context2, (fdjx) ahnhVar8.oS.b(), ahnhVar8.pQ, (egej) ahnhVar8.pI.b(), ahnhVar8.qN);
            case 742:
                return new abib();
            case 743:
                ahnh ahnhVar9 = this.a.a;
                return new davn(ahnhVar9.m, ahnhVar9.pb, ahnhVar9.rc);
            case 744:
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "EsiFlowEvent";
                ehvrVarK.d(enpo.a);
                ehvs ehvsVarA = ehvrVarK.a();
                ahkn ahknVar14 = this.a;
                return ahknVar14.ev().a(ehvsVarA, (ecev) ahknVar14.aL.b());
            case 745:
                return new eijt();
            case 746:
                return new AtomicLong();
            case 747:
                return new abxp();
            case 748:
                final eyik eyikVar13 = this.a.a.oO;
                return new aram() { // from class: aran
                    @Override // defpackage.aram
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.add_debug_logs_for_backstack_switcher");
                    }
                };
            case 749:
                final eyik eyikVar14 = this.a.a.oO;
                return new arfq() { // from class: arfb
                    @Override // defpackage.arfq
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.enable_home_invalidation_debouncing");
                    }
                };
            case 750:
                return Long.valueOf(((ehdm) this.a.b.cA().a.b()).a("com.google.android.apps.messaging.auto", "45681409").b());
            case 751:
                return Long.valueOf(((ehdm) this.a.b.cA().a.b()).a("com.google.android.apps.messaging.auto", "45681408").b());
            case 752:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_lighter_startup_differentiate_signin_shown"));
            case 753:
                return new vdv();
            case 754:
                return new arki() { // from class: arkd
                };
            case 755:
                return new arkh() { // from class: arkb
                };
            case 756:
                return new arkf() { // from class: arjx
                };
            case 757:
                return new apwj() { // from class: apee
                };
            case 758:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar10 = ahknVar15.a;
                return new cwzk((dakl) ahnhVar10.BK.b(), (bxjn) ahnhVar10.wK.b(), (eigp) ahknVar15.aI.b(), (alrj) ahnhVar10.qi.b(), (eosc) ahknVar15.aJ.b());
            case 759:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar11 = ahknVar16.a;
                return new cxul(ahnhVar11.Je, ahnhVar11.Pk, (eosc) ahknVar16.p.b(), ahnhVar11.aaW);
            case 760:
                ahng ahngVar3 = this.a.b;
                ahkn ahknVar17 = ahngVar3.a;
                ahnh ahnhVar12 = ahknVar17.a;
                aurx aurxVar = (aurx) ahnhVar12.wc.b();
                eosc eoscVar = (eosc) ahknVar17.y.b();
                eosc eoscVar2 = (eosc) ahknVar17.p.b();
                eyik eyikVar15 = ahnhVar12.rF;
                axky axkyVar = (axky) ahnhVar12.HN.b();
                eyik eyikVar16 = ahknVar17.aI;
                return Optional.of(new cxvq(new cxwj(aurxVar, eoscVar, eoscVar2, eyikVar15, axkyVar, (eigp) eyikVar16.b(), (autx) ahnhVar12.MP.b()), (cyfw) ahngVar3.hY.b(), ahnhVar12.qK, (autx) ahnhVar12.MP.b(), (fdjx) ahnhVar12.oQ.b(), (fcyh) ahknVar17.bM.b(), ahngVar3.ia, ahngVar3.ib, ahnhVar12.HN, (cedc) ahnhVar12.Yf.b(), ahnhVar12.rW, ahnhVar12.tJ, ahnhVar12.aW(), eyikVar16, ahngVar3.ic, ahnhVar12.MO));
            case 761:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar13 = ahknVar18.a;
                return new avlp((fdjx) ahnhVar13.m.b(), ahknVar18.b.dt, ahnhVar13.ahi);
            case 762:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.location_skip_throwing_exception_on_api_error"));
            case 763:
                final eyik eyikVar17 = this.a.a.oO;
                return new asgr() { // from class: asft
                    @Override // defpackage.asgr
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.enable_edge_to_edge_in_location_picker");
                    }
                };
            case 764:
                return new czzz((ajhd) this.a.a.yw.b());
            case 765:
                return new ejxm(ejsz.a);
            case 766:
                ahkn ahknVar19 = this.a;
                return new aayn((Context) ahknVar19.t.b(), (ains) ahknVar19.a.c.b());
            case 767:
                ahkn ahknVar20 = this.a;
                Context context3 = (Context) ahknVar20.t.b();
                ahnh ahnhVar14 = ahknVar20.a;
                return new cwom(context3, (fdjx) ahnhVar14.oQ.b(), ahnhVar14.Pe, ahnhVar14.vR, ahnhVar14.Pc, ahnhVar14.Pd);
            case 768:
                ahkn ahknVar21 = this.a;
                Context context4 = (Context) ahknVar21.t.b();
                ahnh ahnhVar15 = ahknVar21.a;
                fdjx fdjxVar = (fdjx) ahnhVar15.oQ.b();
                eyik eyikVar18 = ahnhVar15.vR;
                ahng ahngVar4 = ahknVar21.b;
                return new cwpt(context4, fdjxVar, eyikVar18, ahngVar4.eQ, ahngVar4.nR);
            case 769:
                final eyik eyikVar19 = this.a.a.oO;
                return new apsv() { // from class: aoyt
                    @Override // defpackage.apsv
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_rbm_sms_deep_linking");
                    }
                };
            case 770:
                return new einm((eigp) this.a.aI.b());
            case 771:
                return new dair();
            case 772:
                return new cklo(this.a.aI);
            case 773:
                return ckyx.a(this.a.b.bw());
            case 774:
                return ckyw.a(this.a.b.bw());
            case 775:
                return new ahne();
            case 776:
                final eyik eyikVar20 = this.a.a.oO;
                return new aqkn() { // from class: aqjx
                    @Override // defpackage.aqkn
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.reaction_picker_system_bars_bottom_padding_edge_to_edge");
                    }
                };
            case 777:
                ahkn ahknVar22 = this.a;
                dlva dlvaVar = new dlva("audio");
                eyik eyikVar21 = ahknVar22.b.oa;
                return dluv.a(ekgp.n(dlvaVar, (dluz) eyikVar21.b(), new dlva("image"), (dluz) eyikVar21.b(), new dlva("video"), (dluz) eyikVar21.b()));
            case 778:
                ahkn ahknVar23 = this.a;
                ahng ahngVar5 = ahknVar23.b;
                return new dolm((domi) ahngVar5.kf.b(), (eony) ahknVar23.lp.b(), ahngVar5.nZ, ahngVar5.kd);
            case 779:
                ahng ahngVar6 = this.a.b;
                dndk dndkVar = (dndk) ahngVar6.kb.b();
                ahkn ahknVar24 = ahngVar6.a;
                return new dncg(dndkVar, new dnco((fdjx) ahknVar24.a.oQ.b(), (dngc) ahknVar24.lo.b()));
            case 780:
                ahnh ahnhVar16 = this.a.a;
                return new aard(ahnhVar16.zP, (cmvy) ahnhVar16.pE.b());
            case 781:
                ahkn ahknVar25 = this.a;
                Context context5 = (Context) ahknVar25.t.b();
                ahng ahngVar7 = ahknVar25.b;
                eyik eyikVar22 = ahngVar7.od;
                abag abagVar = (abag) eyikVar22.b();
                aayw aaywVar = (aayw) ahngVar7.oe.b();
                abag abagVar2 = (abag) eyikVar22.b();
                ahkn ahknVar26 = ahngVar7.a;
                Context context6 = (Context) ahknVar26.t.b();
                ahnh ahnhVar17 = ahknVar26.a;
                return new aaza(context5, new aazb(abagVar, aaywVar, new abay(abagVar2, context6, (crny) ahnhVar17.pf.b(), (cqbm) ahnhVar17.sX.b(), (crmx) ahnhVar17.pB.b(), (bbdl) ahnhVar17.qG.b()), new abap((abag) eyikVar22.b(), (Context) ahknVar26.t.b(), (crny) ahnhVar17.pf.b()), new abau((abag) eyikVar22.b(), ahnhVar17.sL, (cmot) ahnhVar17.uy.b(), ahnhVar17.DC, (cmrp) ahnhVar17.uv.b())), ahngVar7.of, (abag) eyikVar22.b());
            case 782:
                ahkn ahknVar27 = this.a;
                return new aayv((Context) ahknVar27.t.b(), (cqpz) ahknVar27.aN.b(), (cogw) ahknVar27.cD.b());
            case 783:
                ahkn ahknVar28 = this.a;
                return new aayw((cqpz) ahknVar28.aN.b(), ahknVar28.a.adt);
            case 784:
                return new aaze((Executor) this.a.y.b());
            case 785:
                return new abtv();
            case 786:
                ahkn ahknVar29 = this.a;
                return new abki((abpt) ahknVar29.b.oi.b(), ahknVar29.lT, (eigp) ahknVar29.aI.b(), ahknVar29.a.c, (eosc) ahknVar29.p.b(), (eosd) ahknVar29.p.b());
            case 787:
                ahkn ahknVar30 = this.a;
                Optional optional = (Optional) ahknVar30.lU.b();
                abru abruVar = (abru) ahknVar30.b.m.b();
                eosc eoscVar3 = (eosc) ahknVar30.p.b();
                cqtp cqtpVar = (cqtp) ahknVar30.dK.b();
                ahnh ahnhVar18 = ahknVar30.a;
                return new abpt(optional, abruVar, eoscVar3, cqtpVar, ahnhVar18.LA, ahnhVar18.pQ);
            case 788:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar19 = ahknVar31.a;
                return new abhg(ahknVar31.gI, ahnhVar19.LA, ahnhVar19.c, (eosc) ahknVar31.p.b(), ahnhVar19.pA);
            case 789:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar20 = ahknVar32.a;
                return new abhb(ahknVar32.gI, ahnhVar20.LA, ahnhVar20.c, (eosc) ahknVar32.p.b());
            case 790:
                ahkn ahknVar33 = this.a;
                return new abpr((Context) ahknVar33.t.b(), (cdbq) ahknVar33.a.th.b(), (abhr) ahknVar33.b.nf.b(), (eosc) ahknVar33.p.b());
            case 791:
                return new abpu((Context) this.a.t.b());
            case 792:
                ahkn ahknVar34 = this.a;
                return new abnt((Context) ahknVar34.t.b(), (eosc) ahknVar34.y.b(), (eosc) ahknVar34.p.b());
            case 793:
                return new abrg((abru) this.a.b.m.b());
            case 794:
                ahkn ahknVar35 = this.a;
                return new abry((Context) ahknVar35.t.b(), (abru) ahknVar35.b.m.b());
            case 795:
                return new abrz((abru) this.a.b.m.b());
            case 796:
                ahkn ahknVar36 = this.a;
                Context context7 = (Context) ahknVar36.t.b();
                ahng ahngVar8 = ahknVar36.b;
                eyik eyikVar23 = ahngVar8.hz;
                ahkn ahknVar37 = ahngVar8.a;
                return new acit(context7, new acir(eyikVar23, ahknVar37.da, ahknVar37.p), (eosc) ahknVar36.p.b());
            case 797:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar21 = ahknVar38.a;
                return new bwog(ahnhVar21.bO(), ahnhVar21.eL(), (eosc) ahknVar38.y.b(), (eosc) ahknVar38.p.b(), (bvur) ahknVar38.dL.b(), ahnhVar21.tw, (bwkr) ahnhVar21.tl.b(), ahnhVar21.zP, (bvus) ahnhVar21.EO.b(), ahnhVar21.pT);
            case 798:
                return new apwm() { // from class: apei
                };
            case 799:
                final eyik eyikVar24 = this.a.a.oO;
                return new arwo() { // from class: arwl
                    @Override // defpackage.arwo
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.update_toggle_strings");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        fbur fburVarB;
        fbur fburVarB2;
        int i = this.b;
        switch (i / 100) {
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
                switch (i) {
                    case 800:
                        final eyik eyikVar = this.a.a.oO;
                        return new asix() { // from class: asiv
                            @Override // defpackage.asix
                            public final boolean a() {
                                return ((eoth) eyikVar.b()).a("bugle.disable_chatbot_directory_handler");
                            }
                        };
                    case 801:
                        final eyik eyikVar2 = this.a.a.oO;
                        return new arvn() { // from class: arvd
                            @Override // defpackage.arvn
                            public final boolean a() {
                                return ((eoth) eyikVar2.b()).a("bugle.enable_rbm_sms_short_code_deep_links");
                            }
                        };
                    case 802:
                        ahkn ahknVar = this.a;
                        eyik eyikVar3 = ahknVar.a.qK;
                        return new cteg(eyikVar3);
                    case 803:
                        ahkn ahknVar2 = this.a;
                        return new cvtj();
                    case 804:
                        ahkn ahknVar3 = this.a;
                        return new czxw((Context) ahknVar3.t.b(), (cogw) ahknVar3.cD.b(), (aaxw) ahknVar3.b.kO.b());
                    case 805:
                        ahkn ahknVar4 = this.a;
                        return new cvrj();
                    case 806:
                        ahkn ahknVar5 = this.a;
                        egyt egytVar = (egyt) ahknVar5.dj.b();
                        return new bvel(egytVar);
                    case 807:
                        final eyik eyikVar4 = this.a.a.oO;
                        return new aqat() { // from class: apkf
                            @Override // defpackage.aqat
                            public final boolean a() {
                                return ((eoth) eyikVar4.b()).a("bugle.remove_bot_availability_check_via_bot_info");
                            }
                        };
                    case 808:
                        final eyik eyikVar5 = this.a.a.oO;
                        return new apzz() { // from class: apiv
                            @Override // defpackage.apzz
                            public final boolean a() {
                                return ((eoth) eyikVar5.b()).a("bugle.pass_rbm_deep_link_context");
                            }
                        };
                    case 809:
                        final eyik eyikVar6 = this.a.a.oO;
                        return new aqaa() { // from class: apix
                            @Override // defpackage.aqaa
                            public final boolean a() {
                                return ((eoth) eyikVar6.b()).a("bugle.pass_rbm_welcome_id");
                            }
                        };
                    case 810:
                        return ((ehdm) this.a.a.oH().a.b()).a("com.google.android.apps.messaging.auto", "45476179").d();
                    case 811:
                        return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.fix_google_tos_button_clickability"));
                    case 812:
                        final eyik eyikVar7 = this.a.a.oO;
                        return new aqsf() { // from class: aqpt
                            @Override // defpackage.aqsf
                            public final boolean a() {
                                return ((eoth) eyikVar7.b()).a("bugle.dsdr_remove_rcs_msisdn_accessor_from_debug_tachyon_registration");
                            }
                        };
                    case 813:
                        ahkn ahknVar6 = this.a;
                        ahnh ahnhVar = ahknVar6.a;
                        return new cqln(ahnhVar.afj, ahnhVar.EG, (Optional) ahnhVar.FQ.b(), (cfis) ahknVar6.nK.b(), (eosc) ahknVar6.y.b(), (bvkr) ahnhVar.wa.b(), ahnhVar.FP, (cfgj) ahnhVar.FV.b(), (cepf) ahnhVar.FZ.b(), (cfgc) ahnhVar.FY.b(), ahnhVar.afs, ahknVar6.dh);
                    case 814:
                        return CameraActivity.class;
                    case 815:
                        ahkn ahknVar7 = this.a;
                        ahng ahngVar = ahknVar7.b;
                        Optional optionalOf = Optional.of((Executor) ahngVar.oL.b());
                        Optional optionalOf2 = Optional.of((EGLContext) ahngVar.oM.b());
                        ahkn ahknVar8 = ahngVar.a;
                        return new czib(optionalOf, optionalOf2, new czjc((Context) ahknVar8.t.b(), (eosc) ahknVar8.y.b()), (eosc) ahknVar7.pP.b(), (eosc) ahknVar7.y.b(), (Context) ahknVar7.t.b(), (cqvd) ahknVar7.ol.b(), ahknVar7.a.vh, Optional.of(new Object() { // from class: czid
                        }), Optional.of(new Object() { // from class: czic
                        }));
                    case 816:
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        handlerThread.start();
                        final Handler handler = new Handler(handlerThread.getLooper());
                        return new Executor() { // from class: czif
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        };
                    case 817:
                        EGLContext eGLContext = new euxq(null).c;
                        eGLContext.getClass();
                        return eGLContext;
                    case 818:
                        ahkn ahknVar9 = this.a;
                        return new czpb((Context) ahknVar9.t.b(), (ebtb) ahknVar9.b.oQ.b(), (eosc) ahknVar9.y.b(), (eosd) ahknVar9.p.b(), (ehrb) ahknVar9.hD.b());
                    case 819:
                        ahng ahngVar2 = this.a.b;
                        return new ebtc((ExpressiveTextContext) ahngVar2.oO.b(), (ebtg) ahngVar2.oP.b());
                    case 820:
                        return new ExpressiveTextContext();
                    case 821:
                        return new ebtg();
                    case 822:
                        ahkn ahknVar10 = this.a;
                        return new daku();
                    case 823:
                        return new dakv();
                    case 824:
                        ahkn ahknVar11 = this.a;
                        ahnh ahnhVar2 = ahknVar11.b.a.a;
                        return new dnon(new dngx((dtsl) ahnhVar2.Br.b()), (Optional) ahknVar11.jJ.b(), Optional.of(new uiz(ahnhVar2.c, ahnhVar2.us)));
                    case 825:
                        ahkn ahknVar12 = this.a;
                        Context context = (Context) ahknVar12.t.b();
                        fdjx fdjxVar = (fdjx) ahknVar12.a.m.b();
                        ahng ahngVar3 = ahknVar12.b;
                        dnkk dnkkVar = (dnkk) ahngVar3.hm.b();
                        dnky dnkyVar = (dnky) ahngVar3.hr.b();
                        Optional optionalOf3 = Optional.of(new dnkj(null));
                        dnnc dnncVarCe = ahngVar3.ce();
                        context.getClass();
                        fdjxVar.getClass();
                        dnkkVar.getClass();
                        dnkyVar.getClass();
                        optionalOf3.isPresent();
                        optionalOf3.get();
                        return new dnmw(context, fdjxVar, dnkkVar, dnkyVar, dnncVarCe);
                    case 826:
                        return new dnnd();
                    case 827:
                        ahkn ahknVar13 = this.a;
                        return new dnmp((Context) ahknVar13.t.b(), ahknVar13.b.ce());
                    case 828:
                        return new dnrc();
                    case 829:
                        return new dnxj(null);
                    case 830:
                        ahng ahngVar4 = this.a.b;
                        fcsu fcsuVar = new aqvh(ahngVar4.a.a.oO).a;
                        argg arggVarAC = ahngVar4.aC();
                        return ((eoth) fcsuVar.b()).a("bugle.show_trending_gifs_instead_of_categories") ? new dnzu(arggVarAC.a(), 510) : new dnzu(arggVarAC.a(), 511);
                    case 831:
                        Object objE = cqol.a.e();
                        objE.getClass();
                        String str = new dpbk((String) objE).a;
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        String lowerCase = "MEDIUM".toLowerCase(locale);
                        lowerCase.getClass();
                        return new dpbj(str, lowerCase);
                    case 832:
                        return this.a.a.mi().a(new dnea("gif", dnze.a, new dnzf(dobe.a)));
                    case 833:
                        return new eijm((eigp) this.a.aI.b());
                    case 834:
                        argg arggVarAC2 = this.a.b.aC();
                        Object objE2 = ((cczi) ujw.k.get()).e();
                        objE2.getClass();
                        return new doze(((Boolean) objE2).booleanValue(), arggVarAC2.a(), 1021);
                    case 835:
                        return this.a.a.mi().a(new dnea("sticker", dozb.a, new dozc(dobg.a)));
                    case 836:
                        ahkn ahknVar14 = this.a;
                        Context context2 = (Context) ahknVar14.t.b();
                        eosc eoscVar = (eosc) ahknVar14.aJ.b();
                        ahnh ahnhVar3 = ahknVar14.a;
                        ekgb ekgbVar = (ekgb) ahnhVar3.Bw.b();
                        dtsl dtslVar = (dtsl) ahnhVar3.Br.b();
                        int i2 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        context2.getClass();
                        Context applicationContext = context2.getApplicationContext();
                        eoscVar.getClass();
                        ekfwVar.j(ekgbVar);
                        dtslVar.getClass();
                        applicationContext.getClass();
                        return new dtwx(applicationContext, eoscVar, dtslVar, ekfwVar.g());
                    case 837:
                        ahnh ahnhVar4 = this.a.a;
                        return new eglh((dyyv) ahnhVar4.anY.b(), ahnhVar4.mE());
                    case 838:
                        return new egkz(this.a.a.mE());
                    case 839:
                        ahkn ahknVar15 = this.a;
                        return new cvhk((cqei) ahknVar15.b.kI.b(), (cssw) ahknVar15.kL.b(), (eigp) ahknVar15.aI.b());
                    case 840:
                        ahkn ahknVar16 = this.a;
                        ahkn ahknVar17 = ahknVar16.b.a;
                        return new aazt(new abad(ahknVar17.t), new aazv(ahknVar17.t), new abab(ahknVar17.t), new aazz(ahknVar17.t), new aazx(ahknVar17.t));
                    case 841:
                        return new cwmv(this.a.a.pb);
                    case 842:
                        return new ejfw((Context) this.a.t.b());
                    case 843:
                        ahng ahngVar5 = this.a.b;
                        ahnh ahnhVar5 = ahngVar5.a.a;
                        return new ejgg(new abuk((ejly) ahnhVar5.Bz.b(), (fdjx) ahnhVar5.oQ.b(), ((ehdm) ahngVar5.cy().a.b()).a("com.google.android.apps.messaging.auto", "45428669").d()), (Optional) ahngVar5.pn.b());
                    case 844:
                        return Optional.of((abvd) this.a.b.ll.b());
                    case 845:
                        return new esox(this.a.b.pp);
                    case 846:
                        Context context3 = (Context) this.a.t.b();
                        dboh dbohVar = new dboh(new Bundle());
                        dcfd dcfdVar = dbog.a;
                        return new dbra(context3, dbohVar);
                    case 847:
                        final eyik eyikVar8 = this.a.a.oO;
                        return new apnw() { // from class: aoqn
                            @Override // defpackage.apnw
                            public final boolean a() {
                                return ((eoth) eyikVar8.b()).a("bugle.enable_auto_app_open_logging");
                            }
                        };
                    case 848:
                        final eigp eigpVar = (eigp) this.a.aI.b();
                        ejud ejudVar = ejud.a;
                        int i3 = ekgb.d;
                        ekfw ekfwVar2 = new ekfw();
                        ekfwVar2.h((fbso) ejudVar.d(new ejxr() { // from class: esuv
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return new eiky(eigpVar);
                            }
                        }));
                        ekgb ekgbVarG = ekfwVar2.g();
                        ekgbVarG.getClass();
                        return ekgbVarG;
                    case 849:
                        ahkn ahknVar18 = this.a;
                        Context context4 = (Context) ahknVar18.t.b();
                        aqld aqldVarAs = ahknVar18.b.as();
                        ekhx ekhxVar = tbu.a;
                        context4.getClass();
                        fbur fburVarC = espo.c(context4, tbu.b);
                        fbur fburVarC2 = fbuq.c(context4.getPackageManager(), "com.sec.android.easyMover", tbu.d);
                        if (aqldVarAs.a()) {
                            PackageManager packageManager = context4.getPackageManager();
                            eldz eldzVar = eldz.h;
                            fburVarB = fbuq.a(fbuq.b(packageManager, "com.google.android.messagestestapp", eldzVar.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")), fbuq.b(context4.getPackageManager(), "com.google.communication.testing.bugle.messagetransferhelper", eldzVar.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")));
                        } else {
                            fburVarB = fbuq.b(context4.getPackageManager(), "com.google.android.messagestestapp", eldz.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"));
                        }
                        return fbuq.a(fburVarC, fburVarC2, fburVarB);
                    case 850:
                        return new absg(Optional.empty());
                    case 851:
                        ahkn ahknVar19 = this.a;
                        Context context5 = (Context) ahknVar19.t.b();
                        eyik eyikVar9 = ahknVar19.a.xF;
                        eosc eoscVar2 = (eosc) ahknVar19.aJ.b();
                        cczr cczrVar = (cczr) ahknVar19.cF.b();
                        eyik eyikVar10 = ahknVar19.aO;
                        eyik eyikVar11 = ahknVar19.nW;
                        ahng ahngVar6 = ahknVar19.b;
                        return new RcsStateProvider(context5, eyikVar9, eoscVar2, ahngVar6.cv, cczrVar, eyikVar10, eyikVar11, ahknVar19.dI, ahngVar6.pv);
                    case 852:
                        return new arhc() { // from class: argo
                        };
                    case 853:
                        return new arhg() { // from class: argw
                        };
                    case 854:
                        ahkn ahknVar20 = this.a;
                        Context context6 = (Context) ahknVar20.t.b();
                        aqld aqldVarAs2 = ahknVar20.b.as();
                        ekhx ekhxVar2 = tbu.a;
                        context6.getClass();
                        fbur fburVarC3 = espo.c(context6, tbu.a);
                        fbur fburVarC4 = fbuq.c(context6.getPackageManager(), "com.sec.android.easyMover", tbu.d);
                        if (aqldVarAs2.a()) {
                            PackageManager packageManager2 = context6.getPackageManager();
                            eldz eldzVar2 = eldz.h;
                            fburVarB2 = fbuq.a(fbuq.b(packageManager2, "com.google.android.messagestestapp", eldzVar2.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")), fbuq.b(context6.getPackageManager(), "com.google.communication.testing.bugle.messagetransferhelper", eldzVar2.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")));
                        } else {
                            fburVarB2 = fbuq.b(context6.getPackageManager(), "com.google.android.messagestestapp", eldz.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"));
                        }
                        return fbuq.a(fburVarC3, fbuq.c(context6.getPackageManager(), "com.google.android.apps.retaildemo.datapop", tbu.c), fburVarC4, fburVarB2);
                    case 855:
                        ahkn ahknVar21 = this.a;
                        ahnh ahnhVar6 = ahknVar21.a;
                        return new axln((axky) ahnhVar6.HN.b(), (cden) ahnhVar6.qN.b(), (apqc) ahnhVar6.afi.b(), (Context) ahknVar21.t.b(), (eosc) ahknVar21.y.b(), (eosc) ahknVar21.p.b());
                    case 856:
                        ahkn ahknVar22 = this.a;
                        ahnh ahnhVar7 = ahknVar22.a;
                        return new cddd(ahnhVar7.qY(), (cdbq) ahnhVar7.th.b(), (cogw) ahknVar22.cD.b(), ahknVar22.lW);
                    case 857:
                        ahkn ahknVar23 = this.a;
                        return new uce((Context) ahknVar23.t.b(), ahknVar23.a.HN, (eosc) ahknVar23.p.b());
                    case 858:
                        ahkn ahknVar24 = this.a;
                        return new acgz((Context) ahknVar24.t.b(), ahknVar24.b.pC);
                    case 859:
                        ahkn ahknVar25 = this.a;
                        return new dxjn((diep) ahknVar25.l.b(), (dxif) ahknVar25.b.fz.b(), new dxvf());
                    case 860:
                        ahkn ahknVar26 = this.a;
                        ahnh ahnhVar8 = ahknVar26.a;
                        return new cjpa((ains) ahnhVar8.c.b(), (Optional) ahnhVar8.FQ.b(), ahnhVar8.hs(), ahnhVar8.hr(), ahnhVar8.tr, ahnhVar8.LH, ahknVar26.lW);
                    case 861:
                        return new bxmf((chwq) this.a.a.uu.b());
                    case 862:
                        ahkn ahknVar27 = this.a;
                        Context context7 = (Context) ahknVar27.t.b();
                        egpm egpmVar = (egpm) ahknVar27.dR.b();
                        context7.getClass();
                        egpmVar.getClass();
                        deop deopVarA = cszu.a(egpmVar);
                        dcfe dcfeVar = deoq.a;
                        return new depy(context7, deopVarA.a());
                    case 863:
                        return new ayjl(this.a.b.aY());
                    case 864:
                        return new aqcu() { // from class: apnf
                        };
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
