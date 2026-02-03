package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.sun.jna.Function;
import j$.util.Optional;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfdm implements eyik {
    public final dfdn a;
    private final int b;

    public dfdm(dfdn dfdnVar, int i) {
        this.a = dfdnVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                return new dfnu();
            case 1:
                dfdn dfdnVar = this.a;
                Context context = (Context) ((eyig) dfdnVar.b).a;
                crnf crnfVar = (crnf) dfdnVar.n.b();
                eygg eyggVarA = eyie.a(dfdnVar.v);
                dfoc.m();
                return new crmx(context, dfdnVar.d, dfdnVar.aB, dfdnVar.g, crnfVar, eyggVarA);
            case 2:
                return new dhjj((dhgz) this.a.c.b());
            case 3:
                return new dhgz((Context) ((eyig) this.a.b).a);
            case 4:
                dfdn dfdnVar2 = this.a;
                Object obj = ((eyig) dfdnVar2.b).a;
                eyik eyikVar = dfdnVar2.aA;
                eyikVar.getClass();
                return crod.a((Context) obj, dfdnVar2.d, dfdnVar2.e, dfdnVar2.az, dfdnVar2.n, dfdnVar2.h, dfdnVar2.an, eyikVar);
            case 5:
                return new dhjk();
            case 6:
                return new crmb((Context) ((eyig) this.a.b).a);
            case 7:
                dfdn dfdnVar3 = this.a;
                return croi.a(new cror(dfdnVar3.g, dfdnVar3.an, dfdnVar3.n, dfdnVar3.v, dfdnVar3.ao), dfdnVar3.au.b(), dfdnVar3.aw.b(), dfdnVar3.ax.b(), new crpl(dfdnVar3.ay, dfdnVar3.b));
            case 8:
                dfdn dfdnVar4 = this.a;
                return allw.a(dfdnVar4.aj, dfdnVar4.ak, dfdnVar4.al, dfdnVar4.am, (alpc) dfdnVar4.k.b());
            case 9:
                dfdn dfdnVar5 = this.a;
                eyik eyikVar2 = dfdnVar5.ai;
                eyik eyikVar3 = dfdnVar5.o;
                return new alhy(eyie.a(dfdnVar5.j), eyie.a(dfdnVar5.m), eyie.a(dfdnVar5.h), eyie.a(eyikVar3), eyie.a(eyikVar2));
            case 10:
                dfdn dfdnVar6 = this.a;
                return new alwh(eyie.a(dfdnVar6.h), eyie.a(dfdnVar6.i));
            case 11:
                dfdn dfdnVar7 = this.a;
                return new asqx((crmx) dfdnVar7.h.b(), (ccvz) dfdnVar7.l.b());
            case 12:
                dfdn dfdnVar8 = this.a;
                return new ccwf(dfdnVar8.k, dfdnVar8.h, dfdnVar8.g);
            case 13:
                return ally.a(ekon.a);
            case 14:
                return new crnb((crnf) this.a.n.b());
            case 15:
                return new crnf(this.a.g);
            case 16:
                dfdn dfdnVar9 = this.a;
                return new alql(eyil.a(dfdnVar9.ah), dfdnVar9.h, dfdnVar9.l);
            case 17:
                dfdn dfdnVar10 = this.a;
                Object obj2 = ((eyig) dfdnVar10.b).a;
                eyik eyikVar4 = dfdnVar10.h;
                eyik eyikVar5 = dfdnVar10.o;
                return new alri((Context) obj2, eyie.a(dfdnVar10.ag), eyie.a(dfdnVar10.g), eyie.a(dfdnVar10.v), eyie.a(eyikVar5), eyie.a(eyikVar4));
            case 18:
                dfdn dfdnVar11 = this.a;
                return new awci(dfdnVar11.o, dfdnVar11.q, dfdnVar11.r, dfdnVar11.t, dfdnVar11.v, dfdnVar11.ae, dfdnVar11.af);
            case 19:
                return new ciuw((csrx) this.a.p.b());
            case 20:
                return new csrx();
            case 21:
                return new chwm(this.a.p);
            case 22:
                return new awcl((awck) this.a.s.b());
            case 23:
                return new awck();
            case 24:
                return crni.a(this.a.u);
            case 25:
                dfdn dfdnVar12 = this.a;
                return new epht((Context) ((eyig) dfdnVar12.b).a, (ephl) dfdnVar12.k.b());
            case 26:
                return new dfit(this.a.ad);
            case 27:
                dfdn dfdnVar13 = this.a;
                return new eoth(dfdnVar13.u(), (eotm) dfdnVar13.ac.b());
            case 28:
                return Boolean.valueOf(eotu.a());
            case 29:
                return Boolean.valueOf(eotu.b());
            case 30:
                return Boolean.valueOf(eotu.c());
            case 31:
                return Boolean.valueOf(eotu.d());
            case 32:
                return Boolean.valueOf(eotu.e());
            case 33:
                return Boolean.valueOf(eotu.f());
            case 34:
                return Boolean.valueOf(eotu.g());
            case 35:
                return Boolean.valueOf(eotu.h());
            case 36:
                return Boolean.valueOf(eotu.i());
            case 37:
                return Boolean.valueOf(eotu.j());
            case 38:
                return Boolean.valueOf(eotu.k());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return Boolean.valueOf(eotu.l());
            case 40:
                return Boolean.valueOf(eotu.m());
            case 41:
                return Boolean.valueOf(eotu.n());
            case 42:
                return Boolean.valueOf(eotu.o());
            case 43:
                return Boolean.valueOf(eotu.p());
            case 44:
                return Boolean.valueOf(eotu.q());
            case 45:
                return Boolean.valueOf(eotu.r());
            case 46:
                return Boolean.valueOf(eotu.s());
            case 47:
                return Boolean.valueOf(eotu.t());
            case 48:
                return Boolean.valueOf(eotu.u());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return Boolean.valueOf(eotu.v());
            case 50:
                return Boolean.valueOf(eotu.w());
            case 51:
                return Boolean.valueOf(eotu.x());
            case 52:
                return Boolean.valueOf(eotu.y());
            case 53:
                return Boolean.valueOf(eotu.z());
            case 54:
                return Boolean.valueOf(eotu.A());
            case 55:
                return Boolean.valueOf(eotu.B());
            case 56:
                return Boolean.valueOf(eotu.C());
            case 57:
                return Boolean.valueOf(eotu.D());
            case 58:
                return Boolean.valueOf(eotu.E());
            case 59:
                dfdn dfdnVar14 = this.a;
                return new eotm(Optional.empty(), Optional.empty(), dfdnVar14.u());
            case 60:
                return new eotr();
            case 61:
                ekgi ekgiVarH = ekgp.h(36);
                ekgiVarH.i(dflc.class, "");
                ekgiVarH.i(dflz.class, "");
                ekgiVarH.i(dfle.class, "cslib.cslib_deprecate_always_on_system_binding");
                ekgiVarH.i(dflf.class, "cslib.cslib_deprecate_jibe_service_sim_event_processing");
                ekgiVarH.i(dflh.class, "cslib.delete_rcs_flag_logging");
                ekgiVarH.i(dfmc.class, "cslib.enable_all_subscriptions_as_verified");
                ekgiVarH.i(dfli.class, "cslib.enable_base64_no_wrap_for_protos");
                ekgiVarH.i(dfmi.class, "cslib.enable_compose_actions");
                ekgiVarH.i(dflk.class, "cslib.enable_consent_free_provisioning");
                ekgiVarH.i(dfll.class, "cslib.enable_defer_message_async");
                ekgiVarH.i(dflm.class, "cslib.enable_fi_multi_sync_help_article_in_rcs_settings");
                ekgiVarH.i(dflo.class, "cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                ekgiVarH.i(dfmd.class, "");
                ekgiVarH.i(dfme.class, "cslib.enable_is_sim_loaded_comparison_event");
                ekgiVarH.i(dflp.class, "cslib.enable_mls_for_imdn");
                ekgiVarH.i(dflr.class, "cslib.enable_mls_for_provisioning");
                ekgiVarH.i(dfmj.class, "cslib.enable_open_url_webview_actions");
                ekgiVarH.i(dfmf.class, "cslib.enable_provisioning_apis_comparison_logging");
                ekgiVarH.i(dfls.class, "");
                ekgiVarH.i(dfmg.class, "cslib.enable_read_invalid_config_reason_when_processing_config");
                ekgiVarH.i(dflt.class, "cslib.enable_request_attestation_state");
                ekgiVarH.i(dflu.class, "cslib.enable_sim_subscription_info_retriever_in_clearcut_uptime_tracker");
                ekgiVarH.i(dflv.class, "cslib.enable_stringify_content_type_without_parameters");
                ekgiVarH.i(dflw.class, "cslib.enable_synchronized_update_value_flag");
                ekgiVarH.i(dfly.class, "cslib.enable_welcome_message_suppression");
                ekgiVarH.i(dfma.class, "cslib.get_mcc_directly");
                ekgiVarH.i(dfmb.class, "cslib.log_fi_multi_device_sync_sign_out");
                ekgiVarH.i(dfmh.class, "cslib.remove_config_state_check_in_availability_check");
                ekgiVarH.i(dfmk.class, "cslib.remove_contexts_from_private_suspends_in_smv2");
                ekgiVarH.i(dfml.class, "cslib.remove_sim_info_provider_from_provisioning_engine_config_utils");
                ekgiVarH.i(dfmm.class, "cslib.remove_sim_info_provider_from_provisioning_engine_network_utils");
                ekgiVarH.i(dfmn.class, "cslib.remove_sim_preferences_in_single_registration_state_machine_factory");
                ekgiVarH.i(dfmo.class, "cslib.remove_unnecessary_grpc_to_tycho");
                ekgiVarH.i(dfmr.class, "");
                ekgiVarH.i(dfms.class, "cslib.test_ramp_down");
                ekgiVarH.i(dfld.class, "cslib.use_character_anonymizer");
                return ekgiVarH.c();
            case 62:
                return new avoj(this.a.t);
            case Function.ALT_CONVENTION /* 63 */:
                dfdn dfdnVar15 = this.a;
                eyik eyikVar6 = dfdnVar15.k;
                eyik eyikVar7 = dfdnVar15.ai;
                eyik eyikVar8 = dfdnVar15.o;
                eyik eyikVar9 = dfdnVar15.m;
                return new alnz(eyie.a(dfdnVar15.j), eyie.a(dfdnVar15.h), eyie.a(dfdnVar15.v), eyie.a(eyikVar9), eyie.a(eyikVar8), eyie.a(eyikVar7), eyie.a(eyikVar6));
            case 64:
                dfdn dfdnVar16 = this.a;
                eyik eyikVar10 = dfdnVar16.k;
                eyik eyikVar11 = dfdnVar16.l;
                eyik eyikVar12 = dfdnVar16.ai;
                eyik eyikVar13 = dfdnVar16.o;
                return new allt(eyie.a(dfdnVar16.j), eyie.a(dfdnVar16.m), eyie.a(dfdnVar16.h), eyie.a(eyikVar13), eyie.a(eyikVar12), eyie.a(eyikVar11), eyie.a(eyikVar10));
            case 65:
                dfdn dfdnVar17 = this.a;
                Object obj3 = ((eyig) dfdnVar17.b).a;
                eyik eyikVar14 = dfdnVar17.k;
                eyik eyikVar15 = dfdnVar17.ai;
                eyik eyikVar16 = dfdnVar17.h;
                eyik eyikVar17 = dfdnVar17.o;
                eyik eyikVar18 = dfdnVar17.v;
                eyik eyikVar19 = dfdnVar17.g;
                eyik eyikVar20 = dfdnVar17.ag;
                eyik eyikVar21 = dfdnVar17.ak;
                eygg eyggVarA2 = eyie.a(dfdnVar17.aj);
                eygg eyggVarA3 = eyie.a(eyikVar21);
                eygg eyggVarA4 = eyie.a(eyikVar20);
                eygg eyggVarA5 = eyie.a(eyikVar19);
                eygg eyggVarA6 = eyie.a(eyikVar18);
                eygg eyggVarA7 = eyie.a(eyikVar17);
                eygg eyggVarA8 = eyie.a(eyikVar16);
                eygg eyggVarA9 = eyie.a(eyikVar15);
                eyie.a(eyikVar14);
                return allv.a((Context) obj3, eyggVarA2, eyggVarA3, eyggVarA4, eyggVarA5, eyggVarA6, eyggVarA7, eyggVarA8, eyggVarA9);
            case 66:
                dfdn dfdnVar18 = this.a;
                return new crnt(dfdnVar18.v, dfdnVar18.g, dfdnVar18.an);
            case 67:
                dfdn dfdnVar19 = this.a;
                return new crpb(dfdnVar19.at, dfdnVar19.aq, dfdnVar19.b);
            case 68:
                dfdn dfdnVar20 = this.a;
                return new croy(dfdnVar20.ar, dfdnVar20.as, dfdnVar20.g, dfdnVar20.aq, dfdnVar20.b);
            case 69:
                dfdn dfdnVar21 = this.a;
                return new crow(dfdnVar21.b, dfdnVar21.ap, dfdnVar21.aq);
            case 70:
                return new crnu();
            case 71:
                return new crot((Context) ((eyig) this.a.b).a);
            case 72:
                dfdn dfdnVar22 = this.a;
                return new croe((Context) ((eyig) dfdnVar22.b).a, (crma) dfdnVar22.f.b());
            case 73:
                dfdn dfdnVar23 = this.a;
                return new crpf(dfdnVar23.av, dfdnVar23.aq, dfdnVar23.b);
            case 74:
                dfdn dfdnVar24 = this.a;
                return new crpd(dfdnVar24.au, dfdnVar24.aq);
            case 75:
                dfdn dfdnVar25 = this.a;
                return new crph(dfdnVar25.aw, dfdnVar25.g);
            case 76:
                dfdn dfdnVar26 = this.a;
                return new crpj(dfdnVar26.ax, dfdnVar26.g, dfdnVar26.aq);
            case 77:
                return new dfdl(this);
            case 78:
                return new crnp((Context) ((eyig) this.a.b).a);
            case 79:
                eosc eoscVarA = eosj.a(Executors.newCachedThreadPool());
                eoscVarA.getClass();
                return eoscVarA;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new ebiu((Context) ((eyig) this.a.b).a);
            case 81:
                dfdn dfdnVar27 = this.a;
                return new dfxy((Context) ((eyig) dfdnVar27.b).a, (dgtg) dfdnVar27.aO.b());
            case 82:
                dfdn dfdnVar28 = this.a;
                return new dgtg(dfdnVar28.c, dfdnVar28.aF, (cebq) dfdnVar28.aK.b(), (cmlb) dfdnVar28.aM.b(), dfdnVar28.aN);
            case 83:
                return new dhes(this.a.aE);
            case 84:
                return cdaj.a((Context) ((eyig) this.a.b).a);
            case 85:
                dfdn dfdnVar29 = this.a;
                Object obj4 = ((eyig) dfdnVar29.b).a;
                eyik eyikVar22 = dfdnVar29.aJ;
                return cqbe.j() ? new cebl(eyikVar22, new eoqh()) : new cebl(eyikVar22, ((cebm) ehli.a((Context) obj4, cebm.class)).eK());
            case 86:
                return Optional.of((diff) this.a.aI.b());
            case 87:
                dfdn dfdnVar30 = this.a;
                Object obj5 = ((eyig) dfdnVar30.b).a;
                eyik eyikVar23 = dfdnVar30.aH;
                Context context2 = (Context) obj5;
                eosc eoscVar = (eosc) eyikVar23.b();
                eosc eoscVar2 = (eosc) eyikVar23.b();
                Uri uriA = digl.a();
                diev.a();
                dige digeVar = new dige(context2, uriA);
                diev.a();
                return new difi(context2, eoscVar, eoscVar2, digeVar);
            case 88:
                dfdn dfdnVar31 = this.a;
                return dgrp.a((Context) ((eyig) dfdnVar31.b).a, (eosc) dfdnVar31.aC.b());
            case 89:
                dfdn dfdnVar32 = this.a;
                cmlb cmlbVarCr = cqbe.j() ? (cmlb) dfdnVar32.aL.b() : ((cmkz) ehli.a((Context) ((eyig) dfdnVar32.b).a, cmkz.class)).cr();
                cmlbVarCr.getClass();
                return cmlbVarCr;
            case 90:
                return new cmmk();
            case 91:
                return new dfjz(this.a.ad);
            case 92:
                dfdn dfdnVar33 = this.a;
                return new dexw((cmlb) dfdnVar33.aM.b(), (eosc) dfdnVar33.aQ.b(), dfdnVar33.aR);
            case 93:
                Object objA = dgro.c() ? dgro.a((Context) ((eyig) this.a.b).a) : eosj.a(new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new dgrn()));
                objA.getClass();
                return objA;
            case 94:
                return dejv.a((Context) ((eyig) this.a.b).a);
            case 95:
                dfdn dfdnVar34 = this.a;
                eonz.a();
                return new dfbo(dfdnVar34.aI, dfdnVar34.aZ, dfdnVar34.t());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                dfdn dfdnVar35 = this.a;
                Object obj6 = ((eyig) dfdnVar35.b).a;
                dher dherVar = (dher) dfdnVar35.aY.b();
                dhet dhetVar = (dhet) dfdnVar35.aV.b();
                dhes dhesVar = (dhes) dfdnVar35.aF.b();
                dzzh.f((Context) obj6);
                dfoc.m();
                return new dheq(dherVar, dhetVar, dhesVar);
            case 97:
                dfdn dfdnVar36 = this.a;
                return dhez.a((Context) ((eyig) dfdnVar36.b).a, (dhep) dfdnVar36.aX.b(), (eosc) dfdnVar36.aC.b(), dfdnVar36.aU, dfdnVar36.aV, dfdnVar36.aF, dfdnVar36.aW, dfdnVar36.v);
            case 98:
                dfdn dfdnVar37 = this.a;
                return new dhhc((Context) ((eyig) dfdnVar37.b).a, (dexy) dfdnVar37.aT.b());
            case 99:
                dfdn dfdnVar38 = this.a;
                return new dexy((Context) ((eyig) dfdnVar38.b).a, (eosc) dfdnVar38.aC.b(), (dhes) dfdnVar38.aF.b(), (dexw) dfdnVar38.aS.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        Object objNewFixedThreadPool;
        eosd eosdVarB;
        int i = this.b;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new dhet();
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                dfdn dfdnVar = this.a;
                return new deyy((Context) ((eyig) dfdnVar.b).a, (dhes) dfdnVar.aF.b(), (dexw) dfdnVar.aS.b());
            case 102:
                return new dhfb((dhem) this.a.aW.b());
            case 103:
                return new dfjm(this.a.ad);
            case 104:
                return new dfkk(this.a.ad);
            case 105:
                final eyik eyikVar = this.a.ad;
                return new dflu() { // from class: dfjr
                    @Override // defpackage.dflu
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("cslib.enable_sim_subscription_info_retriever_in_clearcut_uptime_tracker");
                    }
                };
            case 106:
                return new dfjv(this.a.ad);
            case 107:
                return new dfkm(this.a.ad);
            case 108:
                return new dfku(this.a.ad);
            case 109:
                return new eotq((eoth) this.a.ad.b());
            case 110:
                return new dhen((dhhc) this.a.aU.b());
            case 111:
                dfdn dfdnVar2 = this.a;
                return new dgsy((Context) ((eyig) dfdnVar2.b).a, (ecjl) dfdnVar2.bm.b(), (deyu) dfdnVar2.bo.b(), dfdnVar2.t(), dfdnVar2.bq, dfdnVar2.aS);
            case 112:
                dfdn dfdnVar3 = this.a;
                return ecls.a((Executor) dfdnVar3.bj.b(), (ecev) dfdnVar3.bk.b(), new ekph((eclo) dfdnVar3.bl.b()));
            case 113:
                Context context = (Context) ((eyig) this.a.b).a;
                if (dgro.c()) {
                    objNewFixedThreadPool = dgro.a(context);
                } else {
                    eosw eoswVar = new eosw();
                    eoswVar.d("ProtoDataStore-%d");
                    objNewFixedThreadPool = Executors.newFixedThreadPool(4, eosw.b(eoswVar));
                }
                objNewFixedThreadPool.getClass();
                return objNewFixedThreadPool;
            case 114:
                return new ecev(Collections.singletonList(new ecey(new ecex((Context) ((eyig) this.a.b).a))));
            case 115:
                return eckx.a;
            case 116:
                dfdn dfdnVar4 = this.a;
                return new deyu((dfxx) dfdnVar4.aP.b(), (dhes) dfdnVar4.aF.b(), (emko) dfdnVar4.bn.b(), dfdnVar4.t(), (dexw) dfdnVar4.aS.b());
            case 117:
                emko emkoVar = emko.CARRIER_SERVICES_EVENT_SOURCE_RCS;
                emkoVar.getClass();
                return emkoVar;
            case 118:
                dfdn dfdnVar5 = this.a;
                return new dgtb((Context) ((eyig) dfdnVar5.b).a, (esyd) dfdnVar5.bp.b());
            case 119:
                return cqqg.a(ekon.a);
            case 120:
                dfdn dfdnVar6 = this.a;
                return new dgrs((Context) ((eyig) dfdnVar6.b).a, (dhhc) dfdnVar6.aU.b(), (dhes) dfdnVar6.aF.b(), dfdnVar6.t(), (deyz) dfdnVar6.bs.b(), (cebq) dfdnVar6.aK.b(), dfdnVar6.bq, dfdnVar6.bf);
            case 121:
                dfdn dfdnVar7 = this.a;
                return new deyz((dfxx) dfdnVar7.aP.b(), (dhes) dfdnVar7.aF.b(), (emko) dfdnVar7.bn.b(), dfdnVar7.t(), (dexw) dfdnVar7.aS.b());
            case 122:
                dfdn dfdnVar8 = this.a;
                return new dgto((dhes) dfdnVar8.aF.b(), (deyv) dfdnVar8.bu.b(), (dgsy) dfdnVar8.br.b(), dfdnVar8.bq, dfdnVar8.bv);
            case 123:
                dfdn dfdnVar9 = this.a;
                return new deyv((Context) ((eyig) dfdnVar9.b).a, (dfxx) dfdnVar9.aP.b(), (dhes) dfdnVar9.aF.b(), (eosc) dfdnVar9.aC.b(), (dexw) dfdnVar9.aS.b());
            case 124:
                return new dgrt();
            case 125:
                dfdn dfdnVar10 = this.a;
                return new deyj((dfxx) dfdnVar10.aP.b(), (dhes) dfdnVar10.aF.b(), (emko) dfdnVar10.bn.b(), dfdnVar10.t(), (dexw) dfdnVar10.aS.b());
            case 126:
                dfdn dfdnVar11 = this.a;
                return new deym((Context) ((eyig) dfdnVar11.b).a, (dfxx) dfdnVar11.aP.b(), (dhes) dfdnVar11.aF.b(), (emko) dfdnVar11.bn.b(), (eosc) dfdnVar11.aC.b(), (dexw) dfdnVar11.aS.b());
            case 127:
                dfdn dfdnVar12 = this.a;
                return new dexx((dfxx) dfdnVar12.aP.b(), (dhes) dfdnVar12.aF.b(), (emko) dfdnVar12.bn.b(), dfdnVar12.t(), (dexw) dfdnVar12.aS.b());
            case 128:
                dfdn dfdnVar13 = this.a;
                return new deyx((dfxx) dfdnVar13.aP.b(), (dhes) dfdnVar13.aF.b(), (emko) dfdnVar13.bn.b(), (eosc) dfdnVar13.aC.b(), (dexw) dfdnVar13.aS.b(), new dfiy(dfdnVar13.ad));
            case 129:
                return new dgtk();
            case 130:
                dcdt dcdtVar = dcdt.a;
                dcdtVar.getClass();
                return dcdtVar;
            case 131:
                dfdn dfdnVar14 = this.a;
                return new dgkj((Context) ((eyig) dfdnVar14.b).a, (dexx) dfdnVar14.bz.b(), (dhgz) dfdnVar14.c.b(), (dgsy) dfdnVar14.br.b(), (crmx) dfdnVar14.h.b(), (dgrs) dfdnVar14.bt.b(), (dhen) dfdnVar14.bi.b(), (dheq) dfdnVar14.aZ.b(), dfdnVar14.bq, dfdnVar14.aM, dfdnVar14.be, dfdnVar14.aK, dfdnVar14.bc, dfdnVar14.bg);
            case 132:
                dfdn dfdnVar15 = this.a;
                return new dgix((Context) ((eyig) dfdnVar15.b).a, dfdnVar15.n(), (crny) dfdnVar15.g.b());
            case 133:
                dfdn dfdnVar16 = this.a;
                return new dfdv((Context) ((eyig) dfdnVar16.b).a, dfdnVar16.j(), eosj.a(Executors.newSingleThreadExecutor()));
            case 134:
                Context context2 = (Context) ((eyig) this.a.b).a;
                if (dgro.c()) {
                    eosdVarB = dgro.b(context2);
                } else {
                    eosw eoswVar2 = new eosw();
                    eoswVar2.c(true);
                    eoswVar2.d("BlockingListeningScheduledExecutorService-%d");
                    eoswVar2.a = new ThreadFactory() { // from class: dgrl
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(final Runnable runnable) {
                            return new Thread(new Runnable() { // from class: dgrk
                                @Override // java.lang.Runnable
                                public final void run() throws SecurityException, IllegalArgumentException {
                                    Process.setThreadPriority(10);
                                    runnable.run();
                                }
                            });
                        }
                    };
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, eosw.b(eoswVar2));
                    scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                    eosdVarB = eosj.b(scheduledThreadPoolExecutor);
                }
                eosdVarB.getClass();
                return eosdVarB;
            case 135:
                dfdn dfdnVar17 = this.a;
                return new dfnp((Context) ((eyig) dfdnVar17.b).a, (deyx) dfdnVar17.bA.b());
            case 136:
                Object objB = dgro.c() ? dgro.b((Context) ((eyig) this.a.b).a) : Executors.newSingleThreadExecutor();
                objB.getClass();
                return objB;
            case 137:
                dfdn dfdnVar18 = this.a;
                return new dfdd((Context) ((eyig) dfdnVar18.b).a, (diep) dfdnVar18.bH.b());
            case 138:
                return new dieu();
            case 139:
                return new dfdj((Context) ((eyig) this.a.b).a);
            case 140:
                BusinessInfoDatabase businessInfoDatabase = BusinessInfoDatabase.getInstance((Context) ((eyig) this.a.b).a);
                businessInfoDatabase.getClass();
                return businessInfoDatabase;
            case 141:
                return new dgxf((dfdd) this.a.bI.b());
            case 142:
                dfdn dfdnVar19 = this.a;
                return new dewk((Context) ((eyig) dfdnVar19.b).a, (BusinessInfoDatabase) dfdnVar19.bK.b(), (crmx) dfdnVar19.h.b(), (dgfu) dfdnVar19.bM.b());
            case 143:
                dfdn dfdnVar20 = this.a;
                return new dgfu((Context) ((eyig) dfdnVar20.b).a, (crma) dfdnVar20.f.b());
            case 144:
                dfdn dfdnVar21 = this.a;
                ekgp ekgpVarO = ekgp.o(ebfm.SIP, dfdnVar21.bO, ebfm.MSRP_SERVER, dfdnVar21.bP, ebfm.MSRP_CLIENT, dfdnVar21.bQ, ebfm.HTTP, dfdnVar21.bR);
                int[] iArr = dfzn.a;
                return new ebfn(ekgpVarO);
            case 145:
                dfdn dfdnVar22 = this.a;
                deym deymVar = (deym) dfdnVar22.by.b();
                int[] iArr2 = dfzn.a;
                ebgf ebgfVar = new ebgf() { // from class: ebgb
                    @Override // defpackage.ebgf
                    public final SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        return sSLContext;
                    }
                };
                deymVar.getClass();
                return new ebfl(ebgfVar, new ebfx(Optional.of(new ebfz(Optional.of(new dfzj(new ebdu(4, new dfzk(deymVar)))))), deymVar));
            case 146:
                dfdn dfdnVar23 = this.a;
                deym deymVar2 = (deym) dfdnVar23.by.b();
                int[] iArr3 = dfzn.a;
                ebgf ebgfVar2 = new ebgf() { // from class: ebgc
                    @Override // defpackage.ebgf
                    public final SSLContext a() {
                        return SSLContext.getDefault();
                    }
                };
                deymVar2.getClass();
                return new ebfl(ebgfVar2, new ebfx(Optional.of(new ebfz(Optional.of(new dfzj(new ebdu(3, new dfzk(deymVar2)))))), deymVar2));
            case 147:
                dfdn dfdnVar24 = this.a;
                deym deymVar3 = (deym) dfdnVar24.by.b();
                ebiv ebivVar = (ebiv) dfdnVar24.aD.b();
                int[] iArr4 = dfzn.a;
                ebge ebgeVar = new ebge(ebivVar.b(), ebivVar.a());
                deymVar3.getClass();
                return new ebfl(ebgeVar, new ebfx(Optional.of(new ebfz(Optional.of(new dfzj(new ebdu(3, new dfzk(deymVar3)))))), deymVar3));
            case 148:
                dfdn dfdnVar25 = this.a;
                deym deymVar4 = (deym) dfdnVar25.by.b();
                int[] iArr5 = dfzn.a;
                ebgf ebgfVar3 = new ebgf() { // from class: ebgd
                    @Override // defpackage.ebgf
                    public final SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        return sSLContext;
                    }
                };
                deymVar4.getClass();
                return new ebfl(ebgfVar3, new ebfx(Optional.of(new ebfz(Optional.of(new dfzj(new ebdu(2, new dfzk(deymVar4)))))), deymVar4));
            case 149:
                dfdn dfdnVar26 = this.a;
                Object obj = ((eyig) dfdnVar26.b).a;
                ebiv ebivVar2 = (ebiv) dfdnVar26.aD.b();
                ebfn ebfnVar = (ebfn) dfdnVar26.bS.b();
                ebey ebeyVar = (ebey) dfdnVar26.bT.b();
                int[] iArr6 = dfzn.a;
                return new ebja((Context) obj, ebivVar2, ebfnVar, ebeyVar);
            case 150:
                dfdn dfdnVar27 = this.a;
                Context context3 = (Context) ((eyig) dfdnVar27.b).a;
                eosc eoscVar = (eosc) dfdnVar27.aC.b();
                ebff ebffVar = new ebff(context3, dfdnVar27.j());
                dfxx dfxxVar = (dfxx) dfdnVar27.aP.b();
                int[] iArr7 = dfzn.a;
                return new ebey(eoscVar, dhkq.f(context3), dhkv.g(context3), ebffVar, dfxxVar);
            case 151:
                ekgp ekgpVar = ((ebfn) this.a.bS.b()).a;
                int[] iArr8 = dfzn.a;
                fcsu fcsuVar = (fcsu) ekgpVar.get(ebfm.HTTP);
                fcsuVar.getClass();
                return new ebir((ebfl) fcsuVar.b());
            case 152:
                return new ebiq();
            case 153:
                return new dhbz((dhgz) this.a.c.b());
            case 154:
                dfdn dfdnVar28 = this.a;
                return new dhgr((dhbz) dfdnVar28.bX.b(), (crmx) dfdnVar28.h.b(), (dgfu) dfdnVar28.bM.b());
            case 155:
                return new dgnq();
            case 156:
                dfdn dfdnVar29 = this.a;
                return new devx((Context) ((eyig) dfdnVar29.b).a, (eosd) dfdnVar29.bE.b(), (diep) dfdnVar29.bH.b(), (deyj) dfdnVar29.bx.b());
            case 157:
                dfdn dfdnVar30 = this.a;
                return new dhlq(ekhx.v(new dhlh(), new dhls(), new dhll(), new dhlu(dfdnVar30.cb), new dhmr(dfdnVar30.ce), new dhne(dfdnVar30.cf), new dhld[0]));
            case 158:
                return new dhlv(this.a.ca);
            case 159:
                dfdn dfdnVar31 = this.a;
                return new dhmn(dfdnVar31.cc, dfdnVar31.cd);
            case 160:
                return new dhmp(this.a.ca);
            case 161:
                return new dhmt(this.a.ca);
            case 162:
                return new dhnd(this.a.ca);
            case 163:
                dfzf dfzfVar = new dfzf();
                int[] iArr9 = dfzn.a;
                return new cqbn(dfzfVar);
            case 164:
                dfdn dfdnVar32 = this.a;
                return new dgjz((dgrs) dfdnVar32.bt.b(), (cebq) dfdnVar32.aK.b());
            case 165:
                dfdn dfdnVar33 = this.a;
                return new dgkh((dgrs) dfdnVar33.bt.b(), (diep) dfdnVar33.bH.b());
            case 166:
                dfdn dfdnVar34 = this.a;
                return new dfyd((Context) ((eyig) dfdnVar34.b).a, (dhet) dfdnVar34.aV.b(), (dhes) dfdnVar34.aF.b(), dfdnVar34.j(), (dgrs) dfdnVar34.bt.b(), (cmlb) dfdnVar34.aM.b(), dfdnVar34.bd);
            case 167:
                return (cjim) cjim.h(new cjik(), (fbnd) this.a.ch.b());
            case 168:
                dfdn dfdnVar35 = this.a;
                Context context4 = (Context) ((eyig) dfdnVar35.b).a;
                eosd eosdVar = (eosd) dfdnVar35.bE.b();
                fbuc fbucVarT = fbuc.t(fbty.c("com.google.android.apps.messaging", "com.google.android.apps.messaging.shared.rcs.messaging.MessagingEngineNotificationServer"), context4);
                fbucVarT.w(eosdVar);
                fbucVarT.g(eosdVar);
                fbucVarT.k(eosdVar);
                fbucVarT.x(espo.b(context4));
                fbucVarT.h(60L, TimeUnit.SECONDS);
                return fbucVarT.a();
            case 169:
                return new dcpn((Context) ((eyig) this.a.b).a);
            case 170:
                dfdn dfdnVar36 = this.a;
                return new dgju((Context) ((eyig) dfdnVar36.b).a, (dfxx) dfdnVar36.aP.b(), (dhes) dfdnVar36.aF.b(), dfdnVar36.t(), (dexw) dfdnVar36.aS.b());
            case 171:
                return new ckcn();
            case 172:
                return new ciab();
            default:
                throw new AssertionError(i);
        }
    }
}
