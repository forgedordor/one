package defpackage;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.util.Base64;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionWorkManagerScheduler;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import com.sun.jna.Function;
import defpackage.cabx;
import defpackage.cacf;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmz implements eyik {
    public final ahkn a;
    private final int b;

    public ahmz(ahkn ahknVar, int i) {
        this.a = ahknVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r4v86, types: [cafd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [aszp, java.lang.Object] */
    private final Object A() {
        int i = this.b;
        switch (i) {
            case 3100:
                return this.a.a.fa();
            case 3101:
                return caqf.a(this.a.a.gp(), new caqd());
            case 3102:
                ahnh ahnhVar = this.a.a;
                return caql.a(ahnhVar.gp(), ahnhVar.gH(), ahnhVar.gF());
            case 3103:
                return new cptv((cpqp) this.a.a.ags.b());
            case 3104:
                ahkn ahknVar = this.a;
                ahnh ahnhVar2 = ahknVar.a;
                return new cpqp(ahnhVar2.qr, ahnhVar2.aX(), (aukj) ahknVar.eE.b());
            case 3105:
                final eyik eyikVar = this.a.a.oO;
                return new aqeg() { // from class: aqej
                    @Override // defpackage.aqeg
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.add_cms_support_for_rcs_location");
                    }
                };
            case 3106:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqfo() { // from class: aqez
                    @Override // defpackage.aqfo
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.optimize_bugle_id_queries_in_cms_messages_factory");
                    }
                };
            case 3107:
                return bzvi.a(this.a.a.gp(), new bzvk());
            case 3108:
                ahnh ahnhVar3 = this.a.a;
                return caqr.a(ahnhVar3.gp(), new caqp(), ahnhVar3.gG());
            case 3109:
                return this.a.a.lO();
            case 3110:
                ahnh ahnhVar4 = this.a.a;
                return cacl.a(ahnhVar4.gp(), ahnhVar4.gv());
            case 3111:
                ahnh ahnhVar5 = this.a.a;
                return bzls.a(ahnhVar5.gp(), ahnhVar5.fX());
            case 3112:
                ahnh ahnhVar6 = this.a.a;
                return cask.a(ahnhVar6.gp(), ahnhVar6.gM());
            case 3113:
                ahnh ahnhVar7 = this.a.a;
                return new avgl((fdjx) ahnhVar7.m.b(), (byeq) ahnhVar7.sG.b(), (avdr) ahnhVar7.Aq.b(), (avdm) ahnhVar7.agD.b(), ahnhVar7.dN(), ahnhVar7.Ao, (avkx) ahnhVar7.agE.b(), ahnhVar7.vh, ahnhVar7.pb, ahnhVar7.agH);
            case 3114:
                ahkn ahknVar2 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar2.cz.b();
                ahnh ahnhVar8 = ahknVar2.a;
                return new avdm(fcyhVar, (dqsn) ahnhVar8.qq.b(), (alrj) ahnhVar8.qi.b());
            case 3115:
                return new avkx(this.a.a.rF);
            case 3116:
                ahnh ahnhVar9 = this.a.a;
                return new awlc(ahnhVar9.agG, (fdjx) ahnhVar9.m.b());
            case 3117:
                return new ekph((avhc) this.a.a.agF.b());
            case 3118:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar10 = ahknVar3.a;
                return new avhd(ahnhVar10.abH, ahknVar3.cD, (fdjx) ahnhVar10.m.b(), ahknVar3.p, ahnhVar10.abJ);
            case 3119:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar11 = ahknVar4.a;
                return new avgr((fdjx) ahnhVar11.m.b(), ahnhVar11.Aq, ahnhVar11.agJ, ahnhVar11.agK, ahnhVar11.pb, ahknVar4.cE, ahnhVar11.agH);
            case 3120:
                return new avhw(this.a.a.rF);
            case 3121:
                return new avlc(this.a.a.rF);
            case 3122:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar12 = ahknVar5.a;
                return new cath((bxlc) ahnhVar12.uI.b(), (dqsn) ahnhVar12.qq.b(), (eosc) ahknVar5.y.b());
            case 3123:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar13 = ahknVar6.a;
                return new avku((fdjx) ahnhVar13.m.b(), ahnhVar13.agN, ahnhVar13.Aw, ahnhVar13.adi, ahnhVar13.adk, ahknVar6.cE, ahknVar6.cD, ahknVar6.aw, ahnhVar13.agH, ahnhVar13.pb);
            case 3124:
                ahkn ahknVar7 = this.a;
                return new avlg((anty) ahknVar7.a.Ax.b(), ahknVar7.cE);
            case 3125:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar14 = ahknVar8.a;
                return new avkz((fdjx) ahnhVar14.m.b(), ahnhVar14.agN, ahnhVar14.Aw, ahnhVar14.adi, ahnhVar14.adk, ahknVar8.aw, ahknVar8.cD, ahnhVar14.pb);
            case 3126:
                ahnh ahnhVar15 = this.a.a;
                return new cjoe((fdjx) ahnhVar15.oS.b(), (cteb) ahnhVar15.Cz.b(), (awjh) ahnhVar15.sK.b(), (awjd) ahnhVar15.Pn.b(), ahnhVar15.qm(), ahnhVar15.bF());
            case 3127:
                ahnh ahnhVar16 = this.a.a;
                return new cdyh((fdjx) ahnhVar16.oQ.b(), (cden) ahnhVar16.qN.b());
            case 3128:
                ahnh ahnhVar17 = this.a.a;
                return new bwmg(ahnhVar17.tw, ahnhVar17.tl, eyie.a(ahnhVar17.ts), (fdjx) ahnhVar17.oQ.b());
            case 3129:
                ahnh ahnhVar18 = this.a.a;
                return new cbon((fdjx) ahnhVar18.oQ.b(), ekhx.q(), (cbor) ahnhVar18.aeC.b(), (cbph) ahnhVar18.aeD.b());
            case 3130:
                ahkn ahknVar9 = this.a;
                cogw cogwVar = (cogw) ahknVar9.cD.b();
                eosc eoscVar = (eosc) ahknVar9.y.b();
                eosc eoscVar2 = (eosc) ahknVar9.p.b();
                ahnh ahnhVar19 = ahknVar9.a;
                return new caus(cogwVar, eoscVar, eoscVar2, ahnhVar19.gQ(), (axno) ahnhVar19.agV.b());
            case 3131:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar20 = ahknVar10.a;
                return new axno(ahnhVar20.uJ, ahnhVar20.sL, (cogw) ahknVar10.cD.b(), ahnhVar20.uy, (ayou) ahnhVar20.agU.b(), (avpc) ahnhVar20.AM.b());
            case 3132:
                ahnh ahnhVar21 = this.a.a;
                return new ayou(ahnhVar21.AQ, (cmqj) ahnhVar21.uv.b());
            case 3133:
                ahnh ahnhVar22 = this.a.a;
                return new ckkm((fdjx) ahnhVar22.oS.b(), ahnhVar22.jH(), (cjxi) ahnhVar22.yf.b(), ahnhVar22.agY, ahnhVar22.agZ);
            case 3134:
                ahkn ahknVar11 = this.a;
                return ckks.a((Context) ahknVar11.t.b(), ahknVar11.a.mU(), (eosc) ahknVar11.y.b());
            case 3135:
                ahnh ahnhVar23 = this.a.a;
                return new ckkx((fdjx) ahnhVar23.oS.b(), ahnhVar23.ru, ahnhVar23.rc);
            case 3136:
                final eyik eyikVar3 = this.a.a.oO;
                return new dflo() { // from class: dfji
                    @Override // defpackage.dflo
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                    }
                };
            case 3137:
                ahnh ahnhVar24 = this.a.a;
                return new avkm((fdjx) ahnhVar24.m.b(), (avjf) ahnhVar24.ahh.b());
            case 3138:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar25 = ahknVar12.a;
                return new avjj((fdjx) ahnhVar25.m.b(), ahnhVar25.ahd, ahnhVar25.ahl, ahnhVar25.ahc, ahnhVar25.ahk, ahnhVar25.ahm, (egsh) ahknVar12.dG.b(), ahnhVar25.abl, ahknVar12.pg, ahnhVar25.ahb);
            case 3139:
                ahkn ahknVar13 = this.a;
                Executor executor = (Executor) ahknVar13.p.b();
                eigp eigpVar = (eigp) ahknVar13.aI.b();
                ahnh ahnhVar26 = ahknVar13.a;
                return new avih(executor, eigpVar, (fdjx) ahnhVar26.m.b(), ahnhVar26.ut, (avjl) ahknVar13.pf.b(), ahnhVar26.ahc);
            case 3140:
                ahkn ahknVar14 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar14.bM.b();
                fcyh fcyhVar3 = (fcyh) ahknVar14.cz.b();
                cogw cogwVar2 = (cogw) ahknVar14.cD.b();
                ahnh ahnhVar27 = ahknVar14.a;
                return new avit(fcyhVar2, fcyhVar3, cogwVar2, (byeq) ahnhVar27.sG.b(), (cmfo) ahnhVar27.ahb.b(), (avdr) ahnhVar27.Aq.b(), (avdm) ahnhVar27.agD.b(), ahnhVar27.vh, ahnhVar27.pQ, ahnhVar27.pb, ahnhVar27.Ao, ahnhVar27.adm, (avkx) ahnhVar27.agE.b(), (avlc) ahnhVar27.agK.b(), ahknVar14.aw, ahnhVar27.eL(), (aqvc) ahnhVar27.to.b());
            case 3141:
                return avdf.a(this.a.a.qK);
            case 3142:
                ahkn ahknVar15 = this.a;
                Executor executor2 = (Executor) ahknVar15.p.b();
                eigp eigpVar2 = (eigp) ahknVar15.aI.b();
                ahnh ahnhVar28 = ahknVar15.a;
                return new avjn(executor2, eigpVar2, (fdjx) ahnhVar28.m.b(), ahnhVar28.ut, (avjl) ahknVar15.pf.b(), ahnhVar28.ahk);
            case 3143:
                ahkn ahknVar16 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar16.bM.b();
                fcyh fcyhVar5 = (fcyh) ahknVar16.cz.b();
                cogw cogwVar3 = (cogw) ahknVar16.cD.b();
                ahnh ahnhVar29 = ahknVar16.a;
                return new avjz(fcyhVar4, fcyhVar5, cogwVar3, (byeq) ahnhVar29.sG.b(), (cmfo) ahnhVar29.ahb.b(), (avdr) ahnhVar29.Aq.b(), (avdm) ahnhVar29.agD.b(), ahnhVar29.vh, ahnhVar29.pQ, ahnhVar29.pb, ahnhVar29.ahf, ahnhVar29.abh, ahnhVar29.abj, ahnhVar29.Ao, (avlc) ahnhVar29.agK.b(), ahknVar16.aw, ahnhVar29.ahg, ahnhVar29.ahj);
            case 3144:
                ahkn ahknVar17 = this.a;
                fcyh fcyhVar6 = (fcyh) ahknVar17.bM.b();
                ahnh ahnhVar30 = ahknVar17.a;
                return new avhb(fcyhVar6, (byeq) ahnhVar30.sG.b(), (avhw) ahnhVar30.agJ.b(), (cmfo) ahnhVar30.ahb.b(), (cogw) ahknVar17.cD.b(), ahnhVar30.ahe, ahnhVar30.Ao, ahnhVar30.abD, ahnhVar30.abF, ahnhVar30.pb);
            case 3145:
                return new avif(this.a.a.rF);
            case 3146:
                final eyik eyikVar4 = this.a.a.oO;
                return new aqiw() { // from class: aqio
                    @Override // defpackage.aqiw
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.fix_contacts_import_from_deletion_handler");
                    }
                };
            case 3147:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar31 = ahknVar18.a;
                return new avco((fdjx) ahnhVar31.m.b(), ahnhVar31.ahb, ahnhVar31.ahf, ahnhVar31.ahh, (crnp) ahknVar18.cI.b(), ahknVar18.pg, ahknVar18.dG, ahnhVar31.abB, ahnhVar31.Ao, ahnhVar31.adp, ahnhVar31.ahi);
            case 3148:
                ahkn ahknVar19 = this.a;
                return new avlr(ahknVar19.pg, ahknVar19.a.Aq);
            case 3149:
                return new avkn();
            case 3150:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar32 = ahknVar20.a;
                return new cdjg((fdjx) ahnhVar32.m.b(), (Optional) ahnhVar32.tF.b(), (egbf) ahnhVar32.pG.b(), (egyt) ahknVar20.dj.b(), (cdku) ahnhVar32.tG.b(), ahknVar20.ei, ahnhVar32.qN, (apqc) ahnhVar32.afi.b());
            case 3151:
                ahkn ahknVar21 = this.a;
                eosc eoscVar3 = (eosc) ahknVar21.y.b();
                eosc eoscVar4 = (eosc) ahknVar21.p.b();
                ahnh ahnhVar33 = ahknVar21.a;
                eyik eyikVar5 = ahnhVar33.sL;
                eyik eyikVar6 = ahnhVar33.Pb;
                asre asreVar = (asre) ahnhVar33.CD.b();
                asqx asqxVar = (asqx) ahnhVar33.pT.b();
                eyik eyikVar7 = ahnhVar33.ahp;
                return new ciss(eoscVar3, eoscVar4, eyikVar5, eyikVar6, asreVar, asqxVar, eyikVar7, ahnhVar33.ND, ahnhVar33.sj, ahnhVar33.XU, ahnhVar33.OZ);
            case 3152:
                return new citi(this.a.a.c);
            case 3153:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar34 = ahknVar22.a;
                return new assb(ahnhVar34.qr, eyie.a(ahnhVar34.vn), ahnhVar34.pR, (cqbm) ahnhVar34.rY.b(), (asrf) ahnhVar34.rl.b(), (atau) ahknVar22.ii.b(), (atah) ahknVar22.mL.b(), (asry) ahknVar22.mK.b());
            case 3154:
                ahkn ahknVar23 = this.a;
                return new aols((fdjx) ahknVar23.a.m.b(), ahknVar23.dh());
            case 3155:
                ahnh ahnhVar35 = this.a.a;
                return new coot((fdjx) ahnhVar35.oS.b(), ahnhVar35.DC, ahnhVar35.uJ, (cgbn) ahnhVar35.Cs.b());
            case 3156:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar36 = ahknVar24.a;
                return new cird((fdjx) ahnhVar36.oQ.b(), ahnhVar36.sL, ahnhVar36.uv, ahnhVar36.uJ, (ciri) ahnhVar36.ahu.b(), ahnhVar36.qq, ahknVar24.ph, ahnhVar36.SW, ahnhVar36.acd, ahnhVar36.abW);
            case 3157:
                return new ciri(this.a.a.rF);
            case 3158:
                ahnh ahnhVar37 = this.a.a;
                return new cgux((fdjx) ahnhVar37.oQ.b(), ahnhVar37.dH(), ahnhVar37.bG());
            case 3159:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar38 = ahknVar25.a;
                aurx aurxVar = (aurx) ahnhVar38.wc.b();
                cpmi cpmiVar = (cpmi) ahnhVar38.afH.b();
                aukz aukzVar = (aukz) ahnhVar38.Iz.b();
                return new byhq(aurxVar, cpmiVar, aukzVar, (eosc) ahknVar25.p.b(), (eosc) ahknVar25.y.b(), (axlf) ahnhVar38.Lw.b(), Optional.empty());
            case 3160:
                ahkn ahknVar26 = this.a;
                Context context = (Context) ahknVar26.t.b();
                eosc eoscVar5 = (eosc) ahknVar26.p.b();
                ahnh ahnhVar39 = ahknVar26.a;
                return new cghk(context, eoscVar5, ahnhVar39.ahy, (Map) ahnhVar39.ahA.b(), ahknVar26.cc(), (cgkb) ahnhVar39.oV.b(), ahnhVar39.ih());
            case 3161:
                return Long.valueOf(fard.a(this.a.a.oA()));
            case 3162:
                ahkn ahknVar27 = this.a;
                cglf cglfVar = cglf.NT_INCOMING_MESSAGE;
                ahnh ahnhVar40 = ahknVar27.a;
                return ekgp.m(cglfVar, ahnhVar40.ij(), cglf.NT_DIRECTOR, ahnhVar40.ik());
            case 3163:
                return new cglv(this.a.a.pb);
            case 3164:
                ahkn ahknVar28 = this.a;
                return new cast((eosc) ahknVar28.aJ.b(), (chwq) ahknVar28.a.uu.b());
            case 3165:
                ahkn ahknVar29 = this.a;
                eosc eoscVar6 = (eosc) ahknVar29.aJ.b();
                Context context2 = (Context) ahknVar29.t.b();
                Optional optionalEmpty = Optional.empty();
                ahnh ahnhVar41 = ahknVar29.a;
                return new casz(eoscVar6, context2, optionalEmpty, (apsl) ahnhVar41.Dk.b(), ahnhVar41.Dn);
            case 3166:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar42 = ahknVar30.a;
                return new caay((aurx) ahnhVar42.wc.b(), (eosc) ahknVar30.p.b(), (ains) ahnhVar42.pb.b(), (byeq) ahnhVar42.sG.b());
            case 3167:
                ahkn ahknVar31 = this.a;
                Context context3 = (Context) ahknVar31.t.b();
                ahnh ahnhVar43 = ahknVar31.a;
                return new bykd(context3, (axlf) ahnhVar43.Lw.b(), (aukz) ahnhVar43.Iz.b(), (aurx) ahnhVar43.wc.b(), (eosc) ahknVar31.y.b(), (eosc) ahknVar31.p.b(), (cogw) ahknVar31.cD.b(), ahnhVar43.pb, (aipo) ahnhVar43.EV.b());
            case 3168:
                return new bzjr((bzkg) this.a.a.pC());
            case 3169:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar44 = ahknVar32.a;
                return new cagn((aurx) ahnhVar44.wc.b(), (axky) ahnhVar44.HN.b(), (Context) ahknVar32.t.b(), (eosc) ahknVar32.y.b(), (eosc) ahknVar32.p.b());
            case 3170:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar45 = ahknVar33.a;
                aurx aurxVar2 = (aurx) ahnhVar45.wc.b();
                axky axkyVar = (axky) ahnhVar45.HN.b();
                return new cahg(aurxVar2, axkyVar, (Context) ahknVar33.t.b(), (eosc) ahknVar33.y.b());
            case 3171:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar46 = ahknVar34.a;
                return new bzns((bznk) ahnhVar46.pD(), (aurx) ahnhVar46.wc.b(), (bzmy) ahnhVar46.afk.b(), (aukz) ahnhVar46.Iz.b(), (eosc) ahknVar34.p.b());
            case 3172:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar47 = ahknVar35.a;
                ?? Qn = ahnhVar47.qn();
                aurx aurxVar3 = (aurx) ahnhVar47.wc.b();
                return new caem(Qn, aurxVar3, (aukz) ahnhVar47.Iz.b(), (cogw) ahknVar35.cD.b(), (ains) ahnhVar47.pb.b());
            case 3173:
                return Boolean.valueOf(fald.a(this.a.a.nU()));
            case 3174:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar48 = ahknVar36.a;
                return new cajm((aukz) ahnhVar48.Iz.b(), (axlf) ahnhVar48.Lw.b(), (eosc) ahknVar36.y.b(), (Context) ahknVar36.t.b(), ahnhVar48.fO());
            case 3175:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar49 = ahknVar37.a;
                return new caju((axlf) ahnhVar49.Lw.b(), (aukz) ahnhVar49.Iz.b(), (eosc) ahknVar37.y.b(), (Context) ahknVar37.t.b(), ahnhVar49.fN(), ahnhVar49.fO());
            case 3176:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar50 = ahknVar38.a;
                return new cakc((axlf) ahnhVar50.Lw.b(), (eosc) ahknVar38.y.b(), (aukz) ahnhVar50.Iz.b(), (Context) ahknVar38.t.b(), ahnhVar50.fO());
            case 3177:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar51 = ahknVar39.a;
                return new caki((axlf) ahnhVar51.Lw.b(), (Context) ahknVar39.t.b(), (eosc) ahknVar39.y.b(), (aukz) ahnhVar51.Iz.b(), ahnhVar51.fN(), ahnhVar51.fO());
            case 3178:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar52 = ahknVar40.a;
                return new canp((axlf) ahnhVar52.Lw.b(), (eosc) ahknVar40.y.b(), (aukz) ahnhVar52.Iz.b(), (Context) ahknVar40.t.b(), ahnhVar52.fN(), ahnhVar52.fO());
            case 3179:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar53 = ahknVar41.a;
                return new caht((aurx) ahnhVar53.wc.b(), (axky) ahnhVar53.HN.b(), (Context) ahknVar41.t.b(), (eosc) ahknVar41.y.b());
            case 3180:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar54 = ahknVar42.a;
                return new bvss(eyie.a(ahnhVar54.xb), eyie.a(ahnhVar54.xc), (eosc) ahknVar42.p.b(), (eosc) ahknVar42.y.b());
            case 3181:
                ahnh ahnhVar55 = this.a.a;
                fdjx fdjxVar = (fdjx) ahnhVar55.oS.b();
                ahnhVar55.eN();
                return new bvwj(fdjxVar, (bwaj) ahnhVar55.tn.b(), ahnhVar55.bO(), (aqvc) ahnhVar55.to.b());
            case 3182:
                ahnh ahnhVar56 = this.a.a;
                return new baql((fdjx) ahnhVar56.oS.b(), (azxa) ahnhVar56.KZ.b());
            case 3183:
                ahnh ahnhVar57 = this.a.a;
                return new cgqs((fdjx) ahnhVar57.oS.b(), ahnhVar57.AB, ahnhVar57.ahV, ahnhVar57.ahX, ahnhVar57.Jq, (cgpw) ahnhVar57.aek.b());
            case 3184:
                ahnh ahnhVar58 = this.a.a;
                return new cgqx(ahnhVar58.AB, ahnhVar58.Ji, ahnhVar58.Jn, ahnhVar58.Jj, (asjn) ahnhVar58.vU.b(), ahnhVar58.cF(), ahnhVar58.cG());
            case 3185:
                ahnh ahnhVar59 = this.a.a;
                return new cgqy(ahnhVar59.ahW, ahnhVar59.Jq, (asjn) ahnhVar59.vU.b(), ahnhVar59.cF(), ahnhVar59.cG());
            case 3186:
                ahnh ahnhVar60 = this.a.a;
                return new cgqz(ahnhVar60.Ji, ahnhVar60.Jj);
            case 3187:
                return new avna(this.a.a.ux);
            case 3188:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar61 = ahknVar43.a;
                return new cgij((Map) ahnhVar61.aeq.b(), (Context) ahknVar43.t.b(), (eosc) ahknVar43.p.b(), (eosc) ahknVar43.aJ.b(), ahnhVar61.ii(), ahknVar43.cc(), (cgkb) ahnhVar61.oV.b(), (Map) ahnhVar61.ahA.b(), (Optional) ahknVar43.oy.b(), (Optional) ahknVar43.ox.b(), ahnhVar61.ih(), ahnhVar61.aia, ahnhVar61.aib, ahnhVar61.ahz, ahnhVar61.cn(), (dzuc) ahknVar43.cE.b(), (cogw) ahknVar43.cD.b(), (crnp) ahknVar43.cI.b());
            case 3189:
                return Long.valueOf(fare.a(this.a.a.oA()));
            case 3190:
                return Long.valueOf(farf.a(this.a.a.oA()));
            case 3191:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar62 = ahknVar44.a;
                dqsn dqsnVar = (dqsn) ahnhVar62.qq.b();
                return new akic(dqsnVar, ahnhVar62.aid);
            case 3192:
                return Boolean.valueOf(apcu.a((eoth) this.a.a.oO.b()));
            case 3193:
                ahnh ahnhVar63 = this.a.a;
                return new akdr((fdjx) ahnhVar63.oQ.b(), ahnhVar63.dH(), ahnhVar63.bG());
            case 3194:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar64 = ahknVar45.a;
                return new basv(ahnhVar64.qr, ahnhVar64.aik, (eosc) ahknVar45.p.b(), (eosc) ahknVar45.y.b(), ahnhVar64.tt, ahnhVar64.aij);
            case 3195:
                ahkn ahknVar46 = this.a;
                bvdj bvdjVar = bvdj.PARTICIPANTS_TABLE_MY_IDENTITY;
                ahnh ahnhVar65 = ahknVar46.a;
                return ekgp.n(bvdjVar, (bati) ahnhVar65.aig.b(), bvdj.MY_IDENTITY_FOREIGN_KEY, (bati) ahnhVar65.aih.b(), bvdj.MY_IDENTITY_ADDRESS_DEDUPER, (bati) ahnhVar65.aii.b());
            case 3196:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar66 = ahknVar47.a;
                return new axcv((awyr) ahnhVar66.qy.b(), (dqsn) ahnhVar66.qq.b(), (fdjx) ahnhVar66.m.b(), (fcyh) ahknVar47.cA.b(), (fdjx) ahnhVar66.oS.b());
            case 3197:
                ahnh ahnhVar67 = this.a.a;
                return new awze((batf) ahnhVar67.aij.b(), ahnhVar67.ck(), (fdjx) ahnhVar67.m.b(), (fdjx) ahnhVar67.oS.b());
            case 3198:
                ahkn ahknVar48 = this.a;
                return new batf(ahknVar48.a.qW(), (eosc) ahknVar48.p.b(), (eosc) ahknVar48.y.b(), ekgp.k());
            case 3199:
                ahnh ahnhVar68 = this.a.a;
                return new awyb((awzf) ahnhVar68.sI.b(), (awzo) ahnhVar68.aaT.b(), (awvj) ahnhVar68.qy.b(), (fdjx) ahnhVar68.m.b(), (fdjx) ahnhVar68.oS.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object B() {
        Object axwqVar;
        int i = this.b;
        switch (i) {
            case 3200:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                eosc eoscVar = (eosc) ahknVar.p.b();
                eosc eoscVar2 = (eosc) ahknVar.y.b();
                ahnh ahnhVar = ahknVar.a;
                return new catu(context, eoscVar, eoscVar2, (dqsn) ahnhVar.qq.b(), ahnhVar.gP(), ahnhVar.gN(), ahnhVar.gO(), ahnhVar.hE(), (auuh) ahnhVar.Nz.b(), ahnhVar.AQ, ahnhVar.NF, ahnhVar.sL, ahnhVar.uJ, ahnhVar.Ii, ahnhVar.Dp, (aijz) ahnhVar.WP.b(), (Optional) ahnhVar.qI.b(), ahnhVar.aim, (ajfo) ahnhVar.vh.b(), (bxlc) ahnhVar.uI.b(), (bbfn) ahnhVar.CF.b(), ahnhVar.kV(), ahnhVar.WC, ahnhVar.Js, ahnhVar.GZ, ahnhVar.MP, ahnhVar.wc, eyie.a(ahnhVar.ain), ahnhVar.aio);
            case 3201:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new avnq(ahnhVar2.rc, ahnhVar2.uM, ahknVar2.eO, (fdjx) ahnhVar2.oS.b());
            case 3202:
                ahkn ahknVar3 = this.a;
                Context context2 = (Context) ahknVar3.t.b();
                ahnh ahnhVar3 = ahknVar3.a;
                return new cgur(context2, ahnhVar3.iu(), ahnhVar3.Bm, ahnhVar3.pT, ahnhVar3.sL, ahnhVar3.Ih, (ains) ahnhVar3.pQ.b(), (fdjx) ahnhVar3.oQ.b(), ahnhVar3.bG());
            case 3203:
                ahnh ahnhVar4 = this.a.a;
                return new crwg(ahnhVar4.pQ, (fdjx) ahnhVar4.m.b(), ahnhVar4.qi, ahnhVar4.Ii);
            case 3204:
                ahkn ahknVar4 = this.a;
                ahknVar4.a.kT();
                return new coei((eosc) ahknVar4.aJ.b());
            case 3205:
                ahkn ahknVar5 = this.a;
                eosc eoscVar3 = (eosc) ahknVar5.aJ.b();
                ahnh ahnhVar5 = ahknVar5.a;
                return new cauc(eoscVar3, (cmop) ahnhVar5.CA.b(), (cmqj) ahnhVar5.uv.b());
            case 3206:
                ahkn ahknVar6 = this.a;
                Context context3 = (Context) ahknVar6.t.b();
                eosc eoscVar4 = (eosc) ahknVar6.p.b();
                eosc eoscVar5 = (eosc) ahknVar6.y.b();
                ahnh ahnhVar6 = ahknVar6.a;
                eyik eyikVar = ahnhVar6.vh;
                return new cdyb(context3, eoscVar4, eoscVar5, eyikVar, (bydb) ahnhVar6.IE.b(), (ains) ahnhVar6.c.b(), (auuh) ahnhVar6.Nz.b(), ahnhVar6.AQ, ahnhVar6.uJ, ahnhVar6.Js, ahnhVar6.kV(), ahnhVar6.fg(), ahnhVar6.IC, ahnhVar6.HQ, ahnhVar6.tB, ahnhVar6.aio);
            case 3207:
                return new bwlv(this.a.a.rF);
            case 3208:
                ahkn ahknVar7 = this.a;
                return new cauh((eosc) ahknVar7.aJ.b(), (cmqj) ahknVar7.a.uv.b());
            case 3209:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar7 = ahknVar8.a;
                return new cfxk((cfeh) ahnhVar7.Gc.b(), eyie.a(ahnhVar7.UO), ahknVar8.hZ, eyie.a(ahnhVar7.xd), ahnhVar7.wv, ahnhVar7.xk, eyie.a(ahnhVar7.wa), (cexq) ahnhVar7.UQ.b(), ahnhVar7.c, (eosc) ahknVar8.p.b(), (eosc) ahknVar8.y.b(), ahnhVar7.UW, ahknVar8.dh);
            case 3210:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar8 = ahknVar9.a;
                cfeh cfehVar = (cfeh) ahnhVar8.Gc.b();
                eygg eyggVarA = eyie.a(ahnhVar8.UO);
                eyik eyikVar2 = ahknVar9.hZ;
                eygg eyggVarA2 = eyie.a(ahnhVar8.xd);
                eyik eyikVar3 = ahnhVar8.Vr;
                eyik eyikVar4 = ahnhVar8.Vn;
                eyik eyikVar5 = ahnhVar8.Vl;
                eyik eyikVar6 = ahnhVar8.xk;
                eygg eyggVarA3 = eyie.a(ahnhVar8.wa);
                eyik eyikVar7 = ahnhVar8.c;
                eosc eoscVar6 = (eosc) ahknVar9.p.b();
                eosc eoscVar7 = (eosc) ahknVar9.y.b();
                eyik eyikVar8 = ahknVar9.cD;
                eyik eyikVar9 = ahknVar9.np;
                eyik eyikVar10 = ahnhVar8.Vs;
                cogw cogwVar = (cogw) eyikVar8.b();
                eyik eyikVar11 = ahnhVar8.QG;
                eyik eyikVar12 = ahnhVar8.UQ;
                aqmq aqmqVar = (aqmq) eyikVar11.b();
                return new cfxy(cfehVar, eyggVarA, eyikVar2, eyggVarA2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyggVarA3, eyikVar7, eoscVar6, eoscVar7, ahknVar9.mU, eyikVar9, eyikVar10, cogwVar, eyikVar12, ahknVar9.dh, aqmqVar, (aqad) ahnhVar8.UI.b());
            case 3211:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar9 = ahknVar10.a;
                return new cfyq((cfeh) ahnhVar9.Gc.b(), eyie.a(ahnhVar9.UO), ahknVar10.hZ, eyie.a(ahnhVar9.xd), ahnhVar9.xk, ahnhVar9.wZ, eyie.a(ahnhVar9.wa), ahnhVar9.c, (eosc) ahknVar10.p.b(), (eosc) ahknVar10.y.b(), ahknVar10.dh);
            case 3212:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar10 = ahknVar11.a;
                return new bwmi(ahnhVar10.EX, ahnhVar10.uJ, ahnhVar10.vh, ahnhVar10.AG, ahnhVar10.aiy, ahnhVar10.EJ, ahnhVar10.uQ, (eosc) ahknVar11.y.b(), ahnhVar10.pQ, ahknVar11.ez);
            case 3213:
                return new bwms(this.a.a.rF);
            case 3214:
                ahkn ahknVar12 = this.a;
                Context context4 = (Context) ahknVar12.t.b();
                eosc eoscVar8 = (eosc) ahknVar12.aJ.b();
                cogw cogwVar2 = (cogw) ahknVar12.cD.b();
                ahnh ahnhVar11 = ahknVar12.a;
                return new caum(context4, eoscVar8, cogwVar2, ahnhVar11.yw, (cmqj) ahnhVar11.uv.b(), (axut) ahnhVar11.aiP.b(), (auuh) ahnhVar11.Nz.b(), ahnhVar11.Cp);
            case 3215:
                ahnh ahnhVar12 = this.a.a;
                eyik eyikVar13 = ahnhVar12.aiE;
                return new axut(eyikVar13, ahnhVar12.rW, eyikVar13, eyikVar13, eyikVar13, eyikVar13, eyikVar13, eyikVar13);
            case 3216:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar13 = ahknVar13.a;
                axwqVar = new axwq(ahknVar13.t, ahknVar13.cD, ahnhVar13.Ck, ahnhVar13.pE, ahnhVar13.Jd, ahnhVar13.HW, ahnhVar13.Co, ahnhVar13.HJ, ahnhVar13.yw, ahnhVar13.uM, ahnhVar13.uJ, ahnhVar13.sL, ahnhVar13.zP, ahnhVar13.ww, ahnhVar13.Gn, ahnhVar13.AQ, ahnhVar13.us, ahnhVar13.HI, ahnhVar13.HG, ahnhVar13.uv, ahnhVar13.BI, ahnhVar13.qG, ahnhVar13.CA, ahnhVar13.aiA, ahnhVar13.aiB, ahnhVar13.Ct, ahnhVar13.uI, ahnhVar13.CF, ahnhVar13.qq, ahnhVar13.MV, ahnhVar13.aiC, ahnhVar13.un, ahnhVar13.Ci, ahnhVar13.Cp, ahnhVar13.IE, ahnhVar13.aiD, ahnhVar13.OG, ahnhVar13.qi, ahknVar13.ku, ahnhVar13.IH, ahnhVar13.aiE, ahnhVar13.m, ahnhVar13.oQ, ahknVar13.cz, ahknVar13.cA, ahnhVar13.AM, ahnhVar13.Gq, ahnhVar13.aiF, ahnhVar13.qN, eyil.a(ahnhVar13.aiI), ahnhVar13.Jg, ahknVar13.cE, ahnhVar13.Gt, ahnhVar13.Js, ahnhVar13.HP, ahnhVar13.MY, ahnhVar13.pf, ahknVar13.nr, ahnhVar13.zK, ahknVar13.ly, ahnhVar13.Cj, ahnhVar13.Jq, ahknVar13.hR, ahnhVar13.CB, ahnhVar13.Ai, ahnhVar13.aiJ, ahnhVar13.aiK, ahnhVar13.sh, ahnhVar13.rW, ahnhVar13.acn, ahnhVar13.AE, ahnhVar13.aiM, ahnhVar13.Ax, ahnhVar13.aiO, ahnhVar13.aiN, ahnhVar13.Jp, ahnhVar13.pK);
                break;
            case 3217:
                ahnh ahnhVar14 = this.a.a;
                cpbn cpbnVar = (cpbn) ahnhVar14.qo.b();
                eyik eyikVar14 = ahnhVar14.sL;
                return new axkf(cpbnVar, eyikVar14);
            case 3218:
                ahkn ahknVar14 = this.a;
                return new cmoq((Context) ahknVar14.t.b(), (cogw) ahknVar14.cD.b(), (crqv) ahknVar14.aT.b(), (cqjy) ahknVar14.a.Ci.b());
            case 3219:
                ahkn ahknVar15 = this.a;
                Context context5 = (Context) ahknVar15.t.b();
                ahnh ahnhVar15 = ahknVar15.a;
                return new axsh(context5, ahnhVar15.uJ, ahnhVar15.uv, (Optional) ahknVar15.ku.b());
            case 3220:
                return new ckxh(this.a.a.jS());
            case 3221:
                return new cipl((aimb) this.a.a.rc.b());
            case 3222:
                ahnh ahnhVar16 = this.a.a;
                return ekhx.v(ahnhVar16.j(), ahnhVar16.l(), (baxz) ahnhVar16.Fl.b(), ahnhVar16.m(), ahnhVar16.jL(), ahnhVar16.ap(), ahnhVar16.lM(), ahnhVar16.p(), ahnhVar16.hz(), ahnhVar16.jP());
            case 3223:
                ahkn ahknVar16 = this.a;
                Context context6 = (Context) ahknVar16.t.b();
                ahnh ahnhVar17 = ahknVar16.a;
                return new cslz(context6, (fdjx) ahnhVar17.oS.b(), (fcyh) ahknVar16.cA.b(), ahknVar16.pn, (aqzb) ahnhVar17.WR.b(), ahnhVar17.pQ, ahnhVar17.aiG);
            case 3224:
                ahnh ahnhVar18 = this.a.a;
                return new csnf((cgkj) ahnhVar18.Ji.b(), ahnhVar18.lF());
            case 3225:
                final eyik eyikVar15 = this.a.a.oO;
                return new areh() { // from class: arcv
                    @Override // defpackage.areh
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.update_transaction_id_for_merged_mms");
                    }
                };
            case 3226:
                final eyik eyikVar16 = this.a.a.oO;
                return new ardz() { // from class: arcf
                    @Override // defpackage.ardz
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.merge_mms_only_to_valid_rcs_groups");
                    }
                };
            case 3227:
                ahnh ahnhVar19 = this.a.a;
                return new awlc(ahnhVar19.aiL, (fdjx) ahnhVar19.m.b());
            case 3228:
                return new ekph(this.a.a.jA());
            case 3229:
                ahkn ahknVar17 = this.a;
                eyik eyikVar17 = ahknVar17.cD;
                ahnh ahnhVar20 = ahknVar17.a;
                return new ayqw(ahnhVar20.Ai, ahnhVar20.aiK, ahnhVar20.AM, ahnhVar20.aiF, ahnhVar20.sh, ahnhVar20.aiN, ahnhVar20.acn, (cogw) eyikVar17.b());
            case 3230:
                ahnh ahnhVar21 = this.a.a;
                return new ayqq((cmqj) ahnhVar21.uv.b(), ahnhVar21.qi, ahnhVar21.AE);
            case 3231:
                ahnh ahnhVar22 = this.a.a;
                return new ssm((fdjx) ahnhVar22.oQ.b(), ahnhVar22.k());
            case 3232:
                ahkn ahknVar18 = this.a;
                Context context7 = (Context) ahknVar18.t.b();
                eosc eoscVar9 = (eosc) ahknVar18.p.b();
                eosc eoscVar10 = (eosc) ahknVar18.y.b();
                eosc eoscVar11 = (eosc) ahknVar18.aJ.b();
                ahnh ahnhVar23 = ahknVar18.a;
                eyik eyikVar18 = ahnhVar23.Jd;
                eyik eyikVar19 = ahnhVar23.uJ;
                eyik eyikVar20 = ahnhVar23.ww;
                eyik eyikVar21 = ahnhVar23.DC;
                eyik eyikVar22 = ahnhVar23.xi;
                eyik eyikVar23 = ahnhVar23.II;
                eyik eyikVar24 = ahnhVar23.qq;
                eyik eyikVar25 = ahnhVar23.uI;
                cosz coszVarKZ = ahnhVar23.kZ();
                bwdg bwdgVarEQ = ahnhVar23.eQ();
                ayqn ayqnVar = (ayqn) ahnhVar23.yv.b();
                eyik eyikVar26 = ahnhVar23.Js;
                eyik eyikVar27 = ahnhVar23.uE;
                eyik eyikVar28 = ahnhVar23.aiU;
                eyik eyikVar29 = ahnhVar23.xO;
                eyik eyikVar30 = ahnhVar23.rl;
                coor coorVar = (coor) ahnhVar23.Ju.b();
                ateg ategVarDc = ahnhVar23.dc();
                aypv aypvVar = (aypv) ahknVar18.ld.b();
                eyik eyikVar31 = ahnhVar23.WR;
                eyik eyikVar32 = ahnhVar23.WS;
                eyik eyikVar33 = ahnhVar23.yp;
                eyik eyikVar34 = ahnhVar23.aiW;
                return new coqb(context7, eoscVar9, eoscVar10, eoscVar11, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, coszVarKZ, bwdgVarEQ, ayqnVar, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, coorVar, ategVarDc, aypvVar, eyikVar31, eyikVar32, eyikVar33, eyikVar34);
            case 3233:
                ahnh ahnhVar24 = this.a.a;
                return ekhx.v(ahnhVar24.j(), ahnhVar24.l(), ahnhVar24.H(), ahnhVar24.qt(), ahnhVar24.m(), ahnhVar24.jN(), ahnhVar24.lM(), ahnhVar24.p());
            case 3234:
                ahnh ahnhVar25 = this.a.a;
                return new cdve(ahnhVar25.Br, (fdjx) ahnhVar25.oQ.b(), ahnhVar25.hp(), (dnvi) ahnhVar25.IO.b());
            case 3235:
                ahkn ahknVar19 = this.a;
                return ccxw.a((Context) ahknVar19.t.b(), (fdjx) ahknVar19.a.oQ.b());
            case 3236:
                return Boolean.valueOf(faon.a(this.a.a.om()));
            case 3237:
                final eyik eyikVar35 = this.a.a.oO;
                return new aqby() { // from class: apmb
                    @Override // defpackage.aqby
                    public final boolean a() {
                        return ((eoth) eyikVar35.b()).a("bugle.use_correct_temporary_file");
                    }
                };
            case 3238:
                ahkn ahknVar20 = this.a;
                eosc eoscVar12 = (eosc) ahknVar20.p.b();
                eosc eoscVar13 = (eosc) ahknVar20.y.b();
                ahnh ahnhVar26 = ahknVar20.a;
                eyik eyikVar36 = ahnhVar26.uJ;
                return new coqn(eoscVar12, eoscVar13, eyikVar36, ahnhVar26.kZ(), (Optional) ahknVar20.ku.b(), ahnhVar26.Ju, ahnhVar26.dn(), ahnhVar26.aiZ);
            case 3239:
                return new aqsy() { // from class: aqrd
                };
            case 3240:
                return Long.valueOf(faoo.a(this.a.a.om()));
            case 3241:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar27 = ahknVar21.a;
                return new atem((cgbn) ahnhVar27.Cs.b(), (eosc) ahknVar21.y.b(), (aten) ahnhVar27.Ed.b(), (coir) ahnhVar27.Og.b(), ahnhVar27.kY(), (coii) ahnhVar27.EB.b());
            case 3242:
                return new coqe(this.a.a.rF);
            case 3243:
                return new cotw(this.a.a.rF);
            case 3244:
                ahnh ahnhVar28 = this.a.a;
                return new atgh((fdjx) ahnhVar28.oQ.b(), ahnhVar28.df(), (cgbn) ahnhVar28.Cs.b(), ahnhVar28.Oh);
            case 3245:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar29 = ahknVar22.a;
                couz couzVar = (couz) ahnhVar29.EA.b();
                eosc eoscVar14 = (eosc) ahknVar22.y.b();
                eosc eoscVar15 = (eosc) ahknVar22.p.b();
                cgbn cgbnVar = (cgbn) ahnhVar29.Cs.b();
                coir coirVar = (coir) ahnhVar29.Og.b();
                coii coiiVar = (coii) ahnhVar29.EB.b();
                coun counVar = (coun) ahnhVar29.Ok.b();
                eyik eyikVar37 = ahknVar22.mH;
                coyz coyzVar = (coyz) ahnhVar29.NB.b();
                eyik eyikVar38 = ahnhVar29.uJ;
                eyik eyikVar39 = ahnhVar29.ajf;
                eyik eyikVar40 = ahnhVar29.DL;
                eyik eyikVar41 = ahnhVar29.xT;
                return new covn(couzVar, eoscVar14, eoscVar15, cgbnVar, coirVar, coiiVar, counVar, eyikVar37, coyzVar, eyikVar38, eyikVar39, eyikVar40, eyikVar41);
            case 3246:
                ahnh ahnhVar30 = this.a.a;
                return new aujt(ahnhVar30.OM, ahnhVar30.ON, ahnhVar30.OO, new aujg());
            case 3247:
                ahkn ahknVar23 = this.a;
                Context context8 = (Context) ahknVar23.t.b();
                ahnh ahnhVar31 = ahknVar23.a;
                return new cnrc(context8, ahnhVar31.Cs, ahnhVar31.ajl);
            case 3248:
                ahkn ahknVar24 = this.a;
                eosc eoscVar16 = (eosc) ahknVar24.y.b();
                crqv crqvVar = (crqv) ahknVar24.aT.b();
                cogw cogwVar3 = (cogw) ahknVar24.cD.b();
                ahnh ahnhVar32 = ahknVar24.a;
                return new cnqz(eoscVar16, crqvVar, cogwVar3, ahnhVar32.vh, ahnhVar32.uv, ahnhVar32.ajj, ahnhVar32.VS, ahnhVar32.pB, ahnhVar32.Cp, ahnhVar32.VL, ahnhVar32.ajk, ahnhVar32.Db, ahnhVar32.Dc, (cmsk) ahnhVar32.Gs.b(), (bxlc) ahnhVar32.uI.b(), ahnhVar32.c, ahnhVar32.qi, ahnhVar32.VQ, ahknVar24.da, ahnhVar32.VT);
            case 3249:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar33 = ahknVar25.a;
                axwqVar = new cntz(ahnhVar33.TW, ahnhVar33.CA, ahnhVar33.zP, ahnhVar33.sL, ahnhVar33.ww, ahnhVar33.CN, ahnhVar33.Gn, ahnhVar33.AQ, ahnhVar33.uv, ahnhVar33.Gs, ahnhVar33.uI, ahnhVar33.Mr, ahnhVar33.yx, ahnhVar33.qq, ahknVar25.t, ahnhVar33.Cp, ahknVar25.da, ahnhVar33.pf, ahnhVar33.HP, ahnhVar33.c, ahnhVar33.AM, ahnhVar33.Gt, ahnhVar33.qi, ahnhVar33.Gx, ahknVar25.oO, ahnhVar33.Xg, ahnhVar33.uJ, ahnhVar33.WY, ahnhVar33.ajh, ahknVar25.cE, ahnhVar33.ur, ahnhVar33.Dz, ahknVar25.cQ, ahnhVar33.pQ, ahnhVar33.Io, ahnhVar33.aji);
                break;
            case 3250:
                return new apuc() { // from class: apas
                };
            case 3251:
                final eyik eyikVar42 = this.a.a.oO;
                return new asfc() { // from class: ases
                    @Override // defpackage.asfc
                    public final boolean a() {
                        return ((eoth) eyikVar42.b()).a("bugle.forward_sync_merge_part_uri");
                    }
                };
            case 3252:
                return new cnue((cnuk) this.a.a.pT());
            case 3253:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar34 = ahknVar26.a;
                return new bwnn(ahknVar26.cD, ahnhVar34.sk, ahnhVar34.EU, ahnhVar34.sh, ahnhVar34.se, ahnhVar34.pQ, (fdjx) ahnhVar34.m.b(), (fcyh) ahknVar26.cA.b(), (fcyh) ahknVar26.cz.b());
            case 3254:
                ahkn ahknVar27 = this.a;
                Context context9 = (Context) ahknVar27.t.b();
                ahnh ahnhVar35 = ahknVar27.a;
                return new bwgq(context9, ahnhVar35.eY(), ahnhVar35.ajo, (cgbn) ahnhVar35.Cs.b(), ahnhVar35.pT);
            case 3255:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar36 = ahknVar28.a;
                bwla bwlaVar = (bwla) ahnhVar36.EW.b();
                eyik eyikVar43 = ahnhVar36.tw;
                bwkr bwkrVar = (bwkr) ahnhVar36.tl.b();
                cogw cogwVar4 = (cogw) ahknVar28.cD.b();
                eyik eyikVar44 = ahnhVar36.wv;
                eyik eyikVar45 = ahnhVar36.zP;
                eyik eyikVar46 = ahnhVar36.uJ;
                bwjw bwjwVar = (bwjw) ahnhVar36.EM.b();
                eosc eoscVar17 = (eosc) ahknVar28.y.b();
                aypv aypvVar2 = (aypv) ahknVar28.ld.b();
                dqsn dqsnVar = (dqsn) ahnhVar36.qq.b();
                eygg eyggVarA4 = eyie.a(ahnhVar36.ts);
                eyik eyikVar47 = ahnhVar36.c;
                return new bwgp(bwlaVar, eyikVar43, bwkrVar, cogwVar4, eyikVar44, eyikVar45, eyikVar46, bwjwVar, eoscVar17, aypvVar2, dqsnVar, eyggVarA4, eyikVar47, (auau) ahknVar28.ez.b());
            case 3256:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar37 = ahknVar29.a;
                return new cjfv(ahnhVar37.ju(), (crru) ahknVar29.ds.b(), ahnhVar37.rQ(), (cjae) ahnhVar37.Ps.b(), ahnhVar37.jz(), (eosc) ahknVar29.y.b(), (eosc) ahknVar29.aJ.b(), (eosc) ahknVar29.p.b(), ahnhVar37.js(), ahnhVar37.jy(), (aika) ahnhVar37.uM.b(), (cogw) ahknVar29.cD.b(), ahnhVar37.sL);
            case 3257:
                ahnh ahnhVar38 = this.a.a;
                return new cgvj(ahnhVar38.iw(), (fdjx) ahnhVar38.m.b(), ahnhVar38.iv());
            case 3258:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar39 = ahknVar30.a;
                return new cihr((fdjx) ahnhVar39.m.b(), (fcyh) ahknVar30.cA.b(), ahnhVar39.lw, ahnhVar39.rL, (lkb) ahnhVar39.rN.b(), ahnhVar39.sL, ahnhVar39.pQ);
            case 3259:
                return new ciib((bxlc) this.a.a.uI.b());
            case 3260:
                ahkn ahknVar31 = this.a;
                eosd eosdVar = (eosd) ahknVar31.y.b();
                eosc eoscVar18 = (eosc) ahknVar31.p.b();
                ahnh ahnhVar40 = ahknVar31.a;
                return new ciin(eosdVar, eoscVar18, (cicm) ahnhVar40.Gx.b(), (dqsn) ahnhVar40.qq.b());
            case 3261:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar41 = ahknVar32.a;
                eyik eyikVar48 = ahnhVar41.oP;
                bxxd bxxdVar = (bxxd) ahnhVar41.MF.b();
                return new bybk(eyikVar48, bxxdVar, ahknVar32.bK(), (eosc) ahknVar32.p.b(), (eosc) ahknVar32.y.b(), (bybo) ahnhVar41.ajw.b(), (byau) ahnhVar41.ajv.b());
            case 3262:
                return new bybo((byau) this.a.a.ajv.b());
            case 3263:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar42 = ahknVar33.a;
                return new byau(ahnhVar42.yw, ahnhVar42.qr, (eosc) ahknVar33.y.b());
            case 3264:
                ahkn ahknVar34 = this.a;
                eosc eoscVar19 = (eosc) ahknVar34.y.b();
                eosc eoscVar20 = (eosc) ahknVar34.p.b();
                ahnh ahnhVar43 = ahknVar34.a;
                return new bycf(eoscVar19, eoscVar20, ahnhVar43.ajy, ahnhVar43.MN, eyie.a(ahnhVar43.MI), eyie.a(ahnhVar43.MM), ahnhVar43.oP, ahnhVar43.oT, (bxxd) ahnhVar43.MF.b(), ahknVar34.bK(), (bybo) ahnhVar43.ajw.b());
            case 3265:
                final eyik eyikVar49 = this.a.a.oO;
                return new aqdk() { // from class: aqdg
                    @Override // defpackage.aqdk
                    public final boolean a() {
                        return ((eoth) eyikVar49.b()).a("bugle.enable_on_device_indexable_rebuild_for_sparse_tables");
                    }
                };
            case 3266:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar44 = ahknVar35.a;
                return new bycn(eyie.a(ahnhVar44.MI), ahnhVar44.MM, ahnhVar44.oP, (eosc) ahknVar35.p.b());
            case 3267:
                ahnh ahnhVar45 = this.a.a;
                return new atww(ahnhVar45.dB(), (aika) ahnhVar45.uM.b(), (fdjx) ahnhVar45.m.b(), (awnf) ahnhVar45.sJ.b(), (ains) ahnhVar45.pQ.b(), ahnhVar45.ajB);
            case 3268:
                return Boolean.valueOf(faox.a(this.a.a.oo()));
            case 3269:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar46 = ahknVar36.a;
                Object objB = ahnhVar46.OW.b();
                asnl asnlVar = (asnl) ahnhVar46.Pk.b();
                eosc eoscVar21 = (eosc) ahknVar36.p.b();
                return atxj.a(objB, asnlVar, eoscVar21);
            case 3270:
                ahkn ahknVar37 = this.a;
                Context context10 = (Context) ahknVar37.t.b();
                eosd eosdVar2 = (eosd) ahknVar37.y.b();
                eosc eoscVar22 = (eosc) ahknVar37.p.b();
                ahnh ahnhVar47 = ahknVar37.a;
                return new cijb(context10, eosdVar2, eoscVar22, (cicm) ahnhVar47.Gx.b(), (dqsn) ahnhVar47.qq.b(), ahnhVar47.zP, ahnhVar47.uJ, ahnhVar47.ww, (bxkp) ahnhVar47.TZ.b(), ahnhVar47.HJ, ahnhVar47.IH, (cogw) ahknVar37.cD.b(), ahknVar37.ie, (chwq) ahnhVar47.uu.b());
            case 3271:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar48 = ahknVar38.a;
                return new cnlz((fdjx) ahnhVar48.oQ.b(), ahnhVar48.kL(), (cogw) ahknVar38.cD.b());
            case 3272:
                ahnh ahnhVar49 = this.a.a;
                return new ccts(ahnhVar49.hl(), (ccpm) ahnhVar49.tI.b(), (fdjx) ahnhVar49.oS.b());
            case 3273:
                ahnh ahnhVar50 = this.a.a;
                return new ccuv((ccpm) ahnhVar50.tI.b(), (fdjx) ahnhVar50.oS.b(), ahnhVar50.hn());
            case 3274:
                ahkn ahknVar39 = this.a;
                eosc eoscVar23 = (eosc) ahknVar39.y.b();
                eosc eoscVar24 = (eosc) ahknVar39.aJ.b();
                eosc eoscVar25 = (eosc) ahknVar39.p.b();
                ahnh ahnhVar51 = ahknVar39.a;
                return new cijr(eoscVar23, eoscVar24, eoscVar25, ahnhVar51.sL, (avnh) ahnhVar51.AS.b(), (bbfn) ahnhVar51.CF.b(), (asre) ahnhVar51.CD.b(), (asqx) ahnhVar51.pT.b(), ahnhVar51.Pb, (asrc) ahnhVar51.EQ.b(), (ardl) ahnhVar51.sB.b(), (awng) ahnhVar51.Gh.b(), ahnhVar51.Tm, ahnhVar51.ajI, ahnhVar51.OZ);
            case 3275:
                final eyik eyikVar50 = this.a.a.oO;
                return new areb() { // from class: arcj
                    @Override // defpackage.areb
                    public final boolean a() {
                        return ((eoth) eyikVar50.b()).a("bugle.propagate_trace_id_to_tachygram_for_leave_operation");
                    }
                };
            case 3276:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar52 = ahknVar40.a;
                return new cdrl(ahnhVar52.ajK, ahnhVar52.wf, ahnhVar52.ajM, (eosc) ahknVar40.y.b(), ahnhVar52.aE(), (dzuc) ahknVar40.cE.b());
            case 3277:
                ahkn ahknVar41 = this.a;
                Context context11 = (Context) ahknVar41.t.b();
                ahnh ahnhVar53 = ahknVar41.a;
                return cdpu.a(context11, (Optional) ahnhVar53.ajN.b(), (dwhx) ahnhVar53.ajO.b(), (dwhu) ahnhVar53.ajP.b(), ahnhVar53.hA(), ahnhVar53.ajQ, ahnhVar53.hB(), ahnhVar53.aid);
            case 3278:
                return Optional.of((cdpy) this.a.a.ajM.b());
            case 3279:
                ahkn ahknVar42 = this.a;
                Context context12 = (Context) ahknVar42.t.b();
                ahnh ahnhVar54 = ahknVar42.a;
                return new cdql(context12, ahnhVar54.pI, ahnhVar54.pG, ahnhVar54.ajK, ahnhVar54.ajL, (eosc) ahknVar42.p.b());
            case 3280:
                ahkn ahknVar43 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar43.cA.b();
                ahnh ahnhVar55 = ahknVar43.a;
                return new acaa(fcyhVar, (fdjx) ahnhVar55.oS.b(), ahknVar43.ej, ahnhVar55.pQ, ahnhVar55.pI, ahnhVar55.pG);
            case 3281:
                return new dwia((dzfj) this.a.a.vg.b());
            case 3282:
                return new dwhz((dzfj) this.a.a.vg.b());
            case 3283:
                return Boolean.valueOf(apcs.a((eoth) this.a.a.oO.b()));
            case 3284:
                return Boolean.valueOf(apdb.a((eoth) this.a.a.oO.b()));
            case 3285:
                ahnh ahnhVar56 = this.a.a;
                return new vah((fdjx) ahnhVar56.oS.b(), ahnhVar56.ajT);
            case 3286:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar57 = ahknVar44.a;
                return new vae((fdjx) ahnhVar57.oQ.b(), ahnhVar57.qr, ahknVar44.pu, ahknVar44.pv, ahnhVar57.ajS, ahnhVar57.uz);
            case 3287:
                return vbh.a(this.a.a.qK);
            case 3288:
                ahkn ahknVar45 = this.a;
                eosc eoscVar26 = (eosc) ahknVar45.y.b();
                eyik eyikVar51 = ahknVar45.cD;
                ahnh ahnhVar58 = ahknVar45.a;
                return new cikc(eoscVar26, ahnhVar58.sL, (cogw) eyikVar51.b(), (bbdl) ahnhVar58.qG.b(), (byeb) ahnhVar58.HJ.b(), (dqsn) ahnhVar58.qq.b(), (bxlc) ahnhVar58.uI.b(), (ains) ahnhVar58.pQ.b());
            case 3289:
                ahkn ahknVar46 = this.a;
                eosc eoscVar27 = (eosc) ahknVar46.aJ.b();
                Context context13 = (Context) ahknVar46.t.b();
                ahnh ahnhVar59 = ahknVar46.a;
                return new cgfh(eoscVar27, context13, (cgbn) ahnhVar59.Cs.b(), ahnhVar59.NF, ahnhVar59.Dp, ahnhVar59.Zn, ahnhVar59.CB, (bxlc) ahnhVar59.uI.b(), (auuh) ahnhVar59.Nz.b(), (cogw) ahknVar46.cD.b(), (cgdh) ahnhVar59.NH.b(), (dqsn) ahnhVar59.qq.b(), ahnhVar59.ajW);
            case 3290:
                ahnh ahnhVar60 = this.a.a;
                return new cgrg((cgkj) ahnhVar60.Ji.b(), ahnhVar60.ir());
            case 3291:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar61 = ahknVar47.a;
                return new cgfm(ahnhVar61.uJ, ahnhVar61.CB, (eosc) ahknVar47.y.b());
            case 3292:
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar62 = ahknVar48.a;
                return new aibh((fdjx) ahnhVar62.m.b(), (fcyh) ahknVar48.cA.b(), (ahwe) ahnhVar62.Lp.b(), (awlc) ahnhVar62.akb.b(), ahnhVar62.KZ, (ahzv) ahnhVar62.KP.b());
            case 3293:
                ahnh ahnhVar63 = this.a.a;
                return new awlc(ahnhVar63.aka, (fdjx) ahnhVar63.m.b());
            case 3294:
                ahnh ahnhVar64 = this.a.a;
                return ekhx.s(ahnhVar64.ab(), ahnhVar64.ac(), ahnhVar64.ad());
            case 3295:
                return new cnlx((cazj) this.a.a.rF.b());
            case 3296:
                ahnh ahnhVar65 = this.a.a;
                return new atnx((cifw) ahnhVar65.Pb.b(), (ardw) ahnhVar65.XU.b(), (armi) ahnhVar65.OZ.b());
            case 3297:
                ahnh ahnhVar66 = this.a.a;
                return new atob((cicm) ahnhVar66.Gx.b(), (bxlc) ahnhVar66.uI.b(), ahnhVar66.cM(), ahnhVar66.ahq, (dqsn) ahnhVar66.qq.b(), ahnhVar66.Pb, (ardl) ahnhVar66.sB.b(), (awng) ahnhVar66.Gh.b());
            case 3298:
                ahnh ahnhVar67 = this.a.a;
                return new atod((cifw) ahnhVar67.Pb.b(), (ardx) ahnhVar67.Tm.b(), (armi) ahnhVar67.OZ.b());
            case 3299:
                ahkn ahknVar49 = this.a;
                ahnh ahnhVar68 = ahknVar49.a;
                return new anzn(ahnhVar68.m, ahknVar49.cA, ahnhVar68.At, ahnhVar68.Wm);
            default:
                throw new AssertionError(i);
        }
        return axwqVar;
    }

    private final Object C() {
        int i = this.b;
        switch (i) {
            case 3300:
                ahnh ahnhVar = this.a.a;
                return new ckyp(ahnhVar.jT(), (fdjx) ahnhVar.oQ.b());
            case 3301:
                ahkn ahknVar = this.a;
                eosc eoscVar = (eosc) ahknVar.p.b();
                eosc eoscVar2 = (eosc) ahknVar.y.b();
                ahnh ahnhVar2 = ahknVar.a;
                return new cotd(eoscVar, eoscVar2, ahnhVar2.kZ(), (cotw) ahnhVar2.ajc.b());
            case 3302:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar3 = ahknVar2.a;
                return new cgya((fdjx) ahnhVar3.m.b(), (cgxw) ahnhVar3.Ie.b(), ahknVar2.cg(), ahnhVar3.iy(), ahnhVar3.iz());
            case 3303:
                ahnh ahnhVar4 = this.a.a;
                return new cjfx((asrc) ahnhVar4.EQ.b(), ahnhVar4.akk, ahnhVar4.akl, (fdjx) ahnhVar4.oS.b(), ahnhVar4.js());
            case 3304:
                return Long.valueOf(fauv.a(this.a.a.oS()));
            case 3305:
                return Long.valueOf(fauw.a(this.a.a.oS()));
            case 3306:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                ahnh ahnhVar5 = ahknVar3.a;
                return new bvto(context, ahnhVar5.wX, ahnhVar5.eI(), (bvkr) ahnhVar5.wa.b(), (ains) ahnhVar5.c.b(), (eosc) ahknVar3.y.b(), (eosc) ahknVar3.p.b(), ahknVar3.dh);
            case 3307:
                ahkn ahknVar4 = this.a;
                eyik eyikVar = ahknVar4.cD;
                ahnh ahnhVar6 = ahknVar4.a;
                return new cnxs(ahnhVar6.VW, ahnhVar6.ako, ahnhVar6.Cs, (cogw) eyikVar.b(), (cnxm) ahnhVar6.CX.b(), (fdjx) ahnhVar6.oQ.b(), (Context) ahknVar4.t.b());
            case 3308:
                ahkn ahknVar5 = this.a;
                eyik eyikVar2 = ahknVar5.cD;
                ahnh ahnhVar7 = ahknVar5.a;
                return new cnxl(ahnhVar7.VS, ahnhVar7.Cp, ahnhVar7.Gs, ahknVar5.cI, ahnhVar7.ajl, ahnhVar7.ajj, ahnhVar7.uI, ahnhVar7.Cv, ahnhVar7.ajk, (cogw) eyikVar2.b(), (dzuc) ahknVar5.cE.b(), (cmqj) ahnhVar7.uv.b(), ahnhVar7.VQ, ahknVar5.da, ahnhVar7.VT);
            case 3309:
                ahkn ahknVar6 = this.a;
                return new cihb((eosc) ahknVar6.p.b(), (eosc) ahknVar6.y.b(), ahknVar6.a.je());
            case 3310:
                ahnh ahnhVar8 = this.a.a;
                return new cavw((fdjx) ahnhVar8.oS.b(), ahnhVar8.ih(), ahnhVar8.gR());
            case 3311:
                ahkn ahknVar7 = this.a;
                eosc eoscVar3 = (eosc) ahknVar7.p.b();
                eosc eoscVar4 = (eosc) ahknVar7.y.b();
                ahnh ahnhVar9 = ahknVar7.a;
                return new citz(eoscVar3, eoscVar4, (bxlc) ahnhVar9.uI.b(), (ains) ahnhVar9.c.b());
            case 3312:
                ahkn ahknVar8 = this.a;
                return new cgfx(ahknVar8.a.Cs, (cqpz) ahknVar8.aN.b(), (eosc) ahknVar8.aJ.b(), ahknVar8.da);
            case 3313:
                ahkn ahknVar9 = this.a;
                return new cggf(ahknVar9.a.Cs, (cqpz) ahknVar9.aN.b(), (eosc) ahknVar9.aJ.b());
            case 3314:
                ahnh ahnhVar10 = this.a.a;
                return new bvwd((fdjx) ahnhVar10.oQ.b(), ahnhVar10.pQ, ahnhVar10.sL);
            case 3315:
                ahkn ahknVar10 = this.a;
                eosc eoscVar5 = (eosc) ahknVar10.y.b();
                eosc eoscVar6 = (eosc) ahknVar10.p.b();
                ahnh ahnhVar11 = ahknVar10.a;
                return new cite(eoscVar5, eoscVar6, ahnhVar11.sL, ahnhVar11.Pb, (asre) ahnhVar11.CD.b(), ahnhVar11.Fc, ahnhVar11.qi, ahnhVar11.zP, ahnhVar11.OZ, ahnhVar11.akw);
            case 3316:
                final eyik eyikVar3 = this.a.a.oO;
                return new ardt() { // from class: arbt
                    @Override // defpackage.ardt
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.log_client_callback_failure_for_remove_operation");
                    }
                };
            case 3317:
                ahkn ahknVar11 = this.a;
                return new bxnj((bxno) ahknVar11.a.NR.b(), (eosc) ahknVar11.y.b(), (eosc) ahknVar11.p.b());
            case 3318:
                ahkn ahknVar12 = this.a;
                return new cawe((eosc) ahknVar12.y.b(), ahknVar12.a.tt);
            case 3319:
                ahnh ahnhVar12 = this.a.a;
                return new cgzn((fdjx) ahnhVar12.m.b(), (cgxw) ahnhVar12.Ie.b(), ahnhVar12.iy());
            case 3320:
                ahnh ahnhVar13 = this.a.a;
                return new aldn((fdjx) ahnhVar13.oS.b(), ahnhVar13.Cd, ahnhVar13.BE);
            case 3321:
                ahnh ahnhVar14 = this.a.a;
                return new sxl((fdjx) ahnhVar14.oQ.b(), ahnhVar14.v());
            case 3322:
                ahkn ahknVar13 = this.a;
                return new swv((Context) ahknVar13.t.b(), (fcyh) ahknVar13.a.Rm.b(), (fcyh) ahknVar13.bM.b(), eyie.a(ahknVar13.nf), eyie.a(ahknVar13.ng));
            case 3323:
                ahnh ahnhVar15 = this.a.a;
                return new csku(ahnhVar15.HF, (fdjx) ahnhVar15.oQ.b());
            case 3324:
                ahkn ahknVar14 = this.a;
                cogw cogwVar = (cogw) ahknVar14.cD.b();
                ahnh ahnhVar16 = ahknVar14.a;
                return new cnsd(cogwVar, (cnxb) ahnhVar16.ako.b(), (aipo) ahnhVar16.EV.b(), (fdjx) ahnhVar16.oS.b());
            case 3325:
                ahnh ahnhVar17 = this.a.a;
                return new cnie((cnas) ahnhVar17.TT.b(), ahnhVar17.xZ, (fdjx) ahnhVar17.oQ.b(), ahnhVar17.akG, (awxo) ahnhVar17.sP.b(), (awnf) ahnhVar17.sJ.b());
            case 3326:
                return Long.valueOf(fapa.a(this.a.a.oo()));
            case 3327:
                ahnh ahnhVar18 = this.a.a;
                return new cnbj((cnfv) ahnhVar18.qE(), ahnhVar18.Cs);
            case 3328:
                ahkn ahknVar15 = this.a;
                return cnap.a(ahknVar15.a.PC.b(), (eosc) ahknVar15.p.b());
            case 3329:
                ahnh ahnhVar19 = this.a.a;
                return new cnbt((cnfv) ahnhVar19.qF(), ahnhVar19.Cs);
            case 3330:
                ahnh ahnhVar20 = this.a.a;
                return new cncs((cnfv) ahnhVar20.qI(), ahnhVar20.Cs);
            case 3331:
                ahnh ahnhVar21 = this.a.a;
                return new cnek(ahnhVar21.rd(), ahnhVar21.akM, ahnhVar21.akN, (fdjx) ahnhVar21.m.b());
            case 3332:
                return Long.valueOf(favh.a(this.a.a.oV()));
            case 3333:
                return Long.valueOf(favi.a(this.a.a.oV()));
            case 3334:
                ahnh ahnhVar22 = this.a.a;
                return new cnge((cnfv) ahnhVar22.qG(), ahnhVar22.Cs);
            case 3335:
                ahnh ahnhVar23 = this.a.a;
                return new cngj((cnfv) ahnhVar23.qH(), ahnhVar23.Cs);
            case 3336:
                ahnh ahnhVar24 = this.a.a;
                return new cnhr((cnfv) ahnhVar24.qJ(), ahnhVar24.Cs);
            case 3337:
                final eyik eyikVar4 = this.a.a.oO;
                return new ardf() { // from class: arav
                    @Override // defpackage.ardf
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.enable_eagerly_group_renaming");
                    }
                };
            case 3338:
                ahkn ahknVar16 = this.a;
                eosc eoscVar7 = (eosc) ahknVar16.p.b();
                eosc eoscVar8 = (eosc) ahknVar16.y.b();
                ahnh ahnhVar25 = ahknVar16.a;
                return new cott(eoscVar7, eoscVar8, ahnhVar25.kZ(), (ayqd) ahnhVar25.Ct.b(), ahnhVar25.uJ, ahnhVar25.uE, ahnhVar25.ww, ahnhVar25.xO, (chvp) ahnhVar25.DC.b(), (dqsn) ahnhVar25.qq.b(), ahnhVar25.eQ(), (coor) ahnhVar25.Ju.b(), ahnhVar25.pK, ahnhVar25.WR, ahnhVar25.WS, ahnhVar25.yp);
            case 3339:
                ahnh ahnhVar26 = this.a.a;
                return new bwvl((fdjx) ahnhVar26.oS.b(), ahnhVar26.IE, ahnhVar26.Jd);
            case 3340:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar27 = ahknVar17.a;
                return new bwmp(ahnhVar27.EO, ahnhVar27.EJ, ahknVar17.y, ahnhVar27.CK);
            case 3341:
                ahkn ahknVar18 = this.a;
                eosc eoscVar9 = (eosc) ahknVar18.p.b();
                ahnh ahnhVar28 = ahknVar18.a;
                return new ckld(eoscVar9, ahnhVar28.EG, (cejp) ahnhVar28.LU.b());
            case 3342:
                ahkn ahknVar19 = this.a;
                return new cawh(ahknVar19.a.Dp, (eosc) ahknVar19.aJ.b());
            case 3343:
                return new bvvr(this.a.a.Fa);
            case 3344:
                ahkn ahknVar20 = this.a;
                eosc eoscVar10 = (eosc) ahknVar20.p.b();
                ahnh ahnhVar29 = ahknVar20.a;
                return new cawt(eoscVar10, (egxv) ahnhVar29.ut.b(), ahnhVar29.c);
            case 3345:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar30 = ahknVar21.a;
                return new bvtw(ahnhVar30.Vm, ahnhVar30.Vr, (eosc) ahknVar21.p.b(), (eosc) ahknVar21.y.b(), (bael) ahknVar21.mU.b(), (bfsa) ahknVar21.mT.b(), (ceku) ahnhVar30.FS.b(), eyie.a(ahnhVar30.vY), (aqmq) ahnhVar30.QG.b());
            case 3346:
                ahkn ahknVar22 = this.a;
                eosd eosdVar = (eosd) ahknVar22.p.b();
                ahnh ahnhVar31 = ahknVar22.a;
                return new ahgd(eosdVar, ahnhVar31.rR(), (crru) ahknVar22.ds.b(), ahnhVar31.mc(), ahnhVar31.alb);
            case 3347:
                final eyik eyikVar5 = this.a.a.oO;
                return new arhf() { // from class: argu
                    @Override // defpackage.arhf
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.cslib_deprecate_single_reg_vendor_ims_jibe_connection");
                    }
                };
            case 3348:
                ahnh ahnhVar32 = this.a.a;
                return new abuv((fdjx) ahnhVar32.oQ.b(), ahnhVar32.J());
            case 3349:
                ahnh ahnhVar33 = this.a.a;
                return new ccuf((fdjx) ahnhVar33.m.b(), ahnhVar33.hl(), (ccpm) ahnhVar33.tI.b());
            case 3350:
                ahnh ahnhVar34 = this.a.a;
                return new cofa((fdjx) ahnhVar34.oQ.b(), ahnhVar34.kU(), ahnhVar34.alf, ahnhVar34.alg);
            case 3351:
                return new cogs(this.a.a.qK);
            case 3352:
                final eyik eyikVar6 = this.a.a.oO;
                return new asfe() { // from class: asew
                    @Override // defpackage.asfe
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.run_database_update_for_messages_in_thread_zero");
                    }
                };
            case 3353:
                ahkn ahknVar23 = this.a;
                eosc eoscVar11 = (eosc) ahknVar23.p.b();
                eosc eoscVar12 = (eosc) ahknVar23.y.b();
                ahnh ahnhVar35 = ahknVar23.a;
                eyik eyikVar7 = ahnhVar35.rk;
                attm attmVarDz = ahnhVar35.dz();
                cbtr cbtrVarGV = ahnhVar35.gV();
                eyik eyikVar8 = ahnhVar35.ali;
                eyik eyikVar9 = ahnhVar35.alj;
                eyik eyikVar10 = ahnhVar35.all;
                bbdl bbdlVar = (bbdl) ahnhVar35.qG.b();
                bxkp bxkpVar = (bxkp) ahnhVar35.TZ.b();
                eyik eyikVar11 = ahknVar23.cD;
                eyik eyikVar12 = ahnhVar35.HJ;
                cogw cogwVar2 = (cogw) eyikVar11.b();
                eyik eyikVar13 = ahnhVar35.TO;
                return new atwr(eoscVar11, eoscVar12, eyikVar7, attmVarDz, cbtrVarGV, eyikVar8, eyikVar9, eyikVar10, bbdlVar, bxkpVar, eyikVar12, cogwVar2, ahnhVar35.zP, ahnhVar35.Tf, ahnhVar35.sh, ahnhVar35.alm, ahnhVar35.alo, (arob) eyikVar13.b());
            case 3354:
                atoy atoyVar = new atoy();
                ahkn ahknVar24 = this.a;
                return new atsj(atoyVar, ahknVar24.a.rF(), (eosc) ahknVar24.p.b(), (eosc) ahknVar24.y.b());
            case 3355:
                atpw atpwVar = new atpw();
                ahkn ahknVar25 = this.a;
                return new atsj(atpwVar, ahknVar25.a.rE(), (eosc) ahknVar25.p.b(), (eosc) ahknVar25.y.b());
            case 3356:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar36 = ahknVar26.a;
                Object objPA = ahnhVar36.pA();
                Object objPO = ahnhVar36.pO();
                Object objQo = ahnhVar36.qo();
                Object objQC = ahnhVar36.qC();
                atsm atsmVarDy = ahnhVar36.dy();
                Object objQy = ahnhVar36.qy();
                return new atrs((atqv) objPA, (atqx) objPO, (attv) objQo, (atuh) objQC, atsmVarDy, (atue) objQy, (eosc) ahknVar26.p.b(), (atrh) ahnhVar36.pP(), (atuj) ahknVar26.fA(), ahnhVar36.SQ);
            case 3357:
                ahnh ahnhVar37 = this.a.a;
                return ekhx.r(ahnhVar37.fd(), ahnhVar37.hy());
            case 3358:
                ahnh ahnhVar38 = this.a.a;
                return new cifv(ahnhVar38.uz, ahnhVar38.sh, ahnhVar38.pT, (aofc) ahnhVar38.yD.b(), ahnhVar38.sL, (fdjx) ahnhVar38.oQ.b());
            case 3359:
                ahnh ahnhVar39 = this.a.a;
                return new awlc(ahnhVar39.aln, (fdjx) ahnhVar39.m.b());
            case 3360:
                return new ekph(this.a.a.lz());
            case 3361:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar40 = ahknVar27.a;
                return new avhj((fdjx) ahnhVar40.m.b(), (cmfo) ahnhVar40.ahb.b(), (avjf) ahnhVar40.ahh.b(), (cogw) ahknVar27.cD.b(), ahknVar27.cE, ahnhVar40.pb, ahnhVar40.agH, ahnhVar40.Ao);
            case 3362:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar41 = ahknVar28.a;
                return new darb((fdjx) ahnhVar41.m.b(), ahknVar28.pB, ahnhVar41.alv, ahnhVar41.aec, ahnhVar41.aeK, ahnhVar41.alt);
            case 3363:
                ahkn ahknVar29 = this.a;
                eyik eyikVar14 = ahknVar29.bM;
                ahnh ahnhVar42 = ahknVar29.a;
                return new daqz(ahnhVar42.als, ahnhVar42.alt, (fcyh) eyikVar14.b(), (fdjx) ahnhVar42.m.b(), ahnhVar42.alu, ahnhVar42.aec);
            case 3364:
                ahkn ahknVar30 = this.a;
                eyik eyikVar15 = ahknVar30.cz;
                ahnh ahnhVar43 = ahknVar30.a;
                return new daql(ahnhVar43.qi, ahknVar30.cD, (fcyh) eyikVar15.b(), (fcyh) ahknVar30.bM.b(), ahnhVar43.aec, ahnhVar43.alr, ahknVar30.t, ahnhVar43.zN, (baqm) ahnhVar43.Jx.b(), ahnhVar43.qa);
            case 3365:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar44 = ahknVar31.a;
                baeb baebVar = (baeb) ahnhVar44.Vr.b();
                eyik eyikVar16 = ahnhVar44.QG;
                return new cszw(baebVar, ahnhVar44.uP, ahnhVar44.lI(), ahnhVar44.lJ(), ahknVar31.ib, ahknVar31.mU, ahknVar31.np, ahnhVar44.qi, ahnhVar44.Jx, (aqmq) eyikVar16.b());
            case 3366:
                return new dapz(this.a.a.c);
            case 3367:
                return new darc(this.a.a.rF);
            case 3368:
                ahkn ahknVar32 = this.a;
                return new cauy((cmqa) ahknVar32.a.alx.b(), (eosc) ahknVar32.aJ.b());
            case 3369:
                ahkn ahknVar33 = this.a;
                cogw cogwVar3 = (cogw) ahknVar33.cD.b();
                ahnh ahnhVar45 = ahknVar33.a;
                return new cmqa(cogwVar3, (cmqj) ahnhVar45.uv.b(), ahnhVar45.Cp);
            case 3370:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar46 = ahknVar34.a;
                return new ajqk((crmx) ahnhVar46.pB.b(), (Context) ahknVar34.t.b(), (bxlc) ahnhVar46.uI.b(), (eosc) ahknVar34.y.b(), (eosc) ahknVar34.p.b(), (eosc) ahknVar34.aJ.b(), (cmqj) ahnhVar46.uv.b(), ahnhVar46.NF, ahnhVar46.uJ, (bxjh) ahnhVar46.Dp.b(), (auuh) ahnhVar46.Nz.b(), (ayqn) ahnhVar46.yv.b(), (cggc) ahnhVar46.Zn.b(), (cggg) ahnhVar46.CB.b());
            case 3371:
                ahkn ahknVar35 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar35.cz.b();
                ahnh ahnhVar47 = ahknVar35.a;
                return new cjqg(fcyhVar, (fdjx) ahnhVar47.m.b(), (egxv) ahnhVar47.ut.b(), (ains) ahnhVar47.c.b());
            case 3372:
                ahkn ahknVar36 = this.a;
                eosc eoscVar13 = (eosc) ahknVar36.y.b();
                ahnh ahnhVar48 = ahknVar36.a;
                return new agnh(eoscVar13, (cdys) ahnhVar48.HR.b(), ahnhVar48.S(), ahnhVar48.c, ahnhVar48.alB, (agoo) ahnhVar48.aeO.b(), ahnhVar48.uJ, (appk) ahnhVar48.HQ.b(), ahnhVar48.alC, ahnhVar48.aeQ);
            case 3373:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar49 = ahknVar37.a;
                return new admk(ahnhVar49.zs, ahnhVar49.uM, new admo(), (Executor) ahknVar37.p.b());
            case 3374:
                final eyik eyikVar17 = this.a.a.oO;
                return new arqj() { // from class: arqd
                    @Override // defpackage.arqj
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.split_messages_by_conversation_for_deletion");
                    }
                };
            case 3375:
                ahkn ahknVar38 = this.a;
                return new agqf((eosd) ahknVar38.p.b(), ahknVar38.a.T());
            case 3376:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar50 = ahknVar39.a;
                eyik eyikVar18 = ahnhVar50.m;
                eyik eyikVar19 = ahnhVar50.qi;
                eyik eyikVar20 = ahnhVar50.zK;
                cdmo cdmoVar = (cdmo) ahknVar39.hR.b();
                eyik eyikVar21 = ahknVar39.aQ;
                eyik eyikVar22 = ahnhVar50.qq;
                eyik eyikVar23 = ahknVar39.ly;
                eyik eyikVar24 = ahnhVar50.uI;
                eyik eyikVar25 = ahnhVar50.IZ;
                eyik eyikVar26 = ahnhVar50.vW;
                egzh egzhVar = (egzh) eyikVar21.b();
                eyik eyikVar27 = ahknVar39.cE;
                return new cdoa(eyikVar18, ahknVar39.bM, ahknVar39.cA, eyikVar19, eyikVar20, cdmoVar, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, egzhVar, ahnhVar50.Js, (dzuc) eyikVar27.b(), eyie.a(ahnhVar50.alF), (aptm) ahnhVar50.vV.b(), ahnhVar50.Jo, (aptl) ahnhVar50.Jp.b(), (akbs) ahnhVar50.Jq.b());
            case 3377:
                return new ekph(this.a.a.hx());
            case 3378:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar51 = ahknVar40.a;
                return new agzc((fdjx) ahnhVar51.m.b(), (anty) ahnhVar51.Ax.b(), (ajln) ahnhVar51.AB.b(), (alrj) ahnhVar51.qi.b(), ahknVar40.cK);
            case 3379:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar52 = ahknVar41.a;
                return new agur((fdjx) ahnhVar52.oQ.b(), ahnhVar52.AC, ahnhVar52.Sa, Optional.empty(), ahnhVar52.qi, ahnhVar52.Ax, ahnhVar52.AB, ahnhVar52.yD, ahnhVar52.Sb, ahknVar41.cI);
            case 3380:
                ahkn ahknVar42 = this.a;
                eosc eoscVar14 = (eosc) ahknVar42.p.b();
                eosc eoscVar15 = (eosc) ahknVar42.y.b();
                ahnh ahnhVar53 = ahknVar42.a;
                return new ciry(eoscVar14, eoscVar15, (cicm) ahnhVar53.Gx.b(), (dqsn) ahnhVar53.qq.b(), ahnhVar53.zP, ahnhVar53.sL, (cogw) ahknVar42.cD.b(), (bxkp) ahnhVar53.TZ.b(), (byeb) ahnhVar53.HJ.b(), (bbdl) ahnhVar53.qG.b(), ahnhVar53.jh(), (bxlc) ahnhVar53.uI.b(), (ains) ahnhVar53.c.b(), ahknVar42.ie);
            case 3381:
                return new cavg((asnl) this.a.a.Pk.b());
            case 3382:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar54 = ahknVar43.a;
                bveg bvegVar = (bveg) ahnhVar54.yx.b();
                ayfx ayfxVar = (ayfx) ahnhVar54.Mr.b();
                eyik eyikVar28 = ahnhVar54.zP;
                eyik eyikVar29 = ahnhVar54.HP;
                eyik eyikVar30 = ahnhVar54.JE;
                dqsn dqsnVar = (dqsn) ahnhVar54.qq.b();
                eyik eyikVar31 = ahnhVar54.uI;
                eyik eyikVar32 = ahnhVar54.uu;
                eyik eyikVar33 = ahknVar43.ez;
                return new cavo(bvegVar, ayfxVar, eyikVar28, eyikVar29, eyikVar30, dqsnVar, ahknVar43.aQ, eyikVar31, eyikVar32, eyikVar33, (cogw) ahknVar43.cD.b());
            case 3383:
                ahkn ahknVar44 = this.a;
                eosc eoscVar16 = (eosc) ahknVar44.y.b();
                eosc eoscVar17 = (eosc) ahknVar44.p.b();
                ahnh ahnhVar55 = ahknVar44.a;
                return new ciui(eoscVar16, eoscVar17, (asre) ahnhVar55.CD.b(), ahnhVar55.pT, (ciux) ahnhVar55.Cu.b(), (ains) ahnhVar55.c.b());
            case 3384:
                ahnh ahnhVar56 = this.a.a;
                return new amxa((fdjx) ahnhVar56.oS.b(), ahnhVar56.alN);
            case 3385:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar57 = ahknVar45.a;
                return new amwx((fdjx) ahnhVar57.oS.b(), ahnhVar57.DC, ahnhVar57.uE, (dqsn) ahnhVar57.qq.b(), ahnhVar57.xi, (Context) ahknVar45.t.b());
            case 3386:
                ahnh ahnhVar58 = this.a.a;
                return new amxh((fdjx) ahnhVar58.oS.b(), ahnhVar58.Rl, ahnhVar58.alP, ahnhVar58.alN);
            case 3387:
                return new amxb();
            case 3388:
                ahkn ahknVar46 = this.a;
                eosc eoscVar18 = (eosc) ahknVar46.y.b();
                ahnh ahnhVar59 = ahknVar46.a;
                return new bbhd(eoscVar18, ahnhVar59.Hk, ahnhVar59.uJ, (bbgw) ahnhVar59.Hl.b(), (byeb) ahnhVar59.HJ.b(), (bbdl) ahnhVar59.qG.b(), (cogw) ahknVar46.cD.b(), (bxlc) ahnhVar59.uI.b(), (bbfn) ahnhVar59.CF.b(), (afhk) ahnhVar59.GB.b(), (dzuc) ahknVar46.cE.b(), ahnhVar59.cb(), ahnhVar59.alR, (Context) ahknVar46.t.b());
            case 3389:
                ahkn ahknVar47 = this.a;
                eyik eyikVar34 = ahknVar47.cD;
                cdsk cdskVarIN = ahkn.iN();
                cogw cogwVar4 = (cogw) eyikVar34.b();
                ahnh ahnhVar60 = ahknVar47.a;
                return new cdsn(cdskVarIN, cogwVar4, ahnhVar60.Hk, ahnhVar60.Hl, ahnhVar60.uJ, (fdjx) ahnhVar60.oS.b(), ahknVar47.bS(), ahknVar47.cE);
            case 3390:
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar61 = ahknVar48.a;
                return new crkp((ayez) ahnhVar61.MU.b(), (ayca) ahnhVar61.MC.b(), ahnhVar61.BI, (eosd) ahknVar48.y.b(), ahnhVar61.uJ, ahnhVar61.BQ, (cogw) ahknVar48.cD.b());
            case 3391:
                ahnh ahnhVar62 = this.a.a;
                return new clmh((fdjx) ahnhVar62.oQ.b(), (clhc) ahnhVar62.st.b(), (bauh) ahnhVar62.HP.b(), ahnhVar62.kb(), ahnhVar62.ka(), (bbdl) ahnhVar62.qG.b(), ahnhVar62.ke(), Optional.empty(), ahnhVar62.yw, ahnhVar62.alU, ahnhVar62.alV, ahnhVar62.jX(), (alrj) ahnhVar62.qi.b(), (clox) ahnhVar62.AT.b(), ahnhVar62.qq, ahnhVar62.kd(), ahnhVar62.ww, (apsl) ahnhVar62.Dk.b(), ahnhVar62.Dn);
            case 3392:
                return Long.valueOf(fauf.a(this.a.a.oO()));
            case 3393:
                return Long.valueOf(faug.a(this.a.a.oO()));
            case 3394:
                ahkn ahknVar49 = this.a;
                cogw cogwVar5 = (cogw) ahknVar49.cD.b();
                ahnh ahnhVar63 = ahknVar49.a;
                return new cnop(cogwVar5, ahnhVar63.kL(), (cgbn) ahnhVar63.Cs.b(), (eosd) ahknVar49.p.b(), ahnhVar63.qN);
            case 3395:
                ahnh ahnhVar64 = this.a.a;
                return new atye(ahnhVar64.eo(), (cden) ahnhVar64.qN.b());
            case 3396:
                ahkn ahknVar50 = this.a;
                return new bxqq((eosc) ahknVar50.y.b(), (bxlc) ahknVar50.a.uI.b());
            case 3397:
                ahnh ahnhVar65 = this.a.a;
                return new cqhr((fdjx) ahnhVar65.m.b(), ahnhVar65.lj(), (cqbm) ahnhVar65.sX.b(), ahnhVar65.amb);
            case 3398:
                return new ahms(this);
            case 3399:
                final eyik eyikVar35 = this.a.a.oO;
                return new asaf() { // from class: arza
                    @Override // defpackage.asaf
                    public final boolean a() {
                        return ((eoth) eyikVar35.b()).a("bugle.disable_tachyon_registration_on_satellite");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object D() {
        Object cmjxVar;
        int i = this.b;
        switch (i) {
            case 3400:
                ahnh ahnhVar = this.a.a;
                return new avhv((fdjx) ahnhVar.m.b(), (byeq) ahnhVar.sG.b(), (cmfo) ahnhVar.ahb.b(), (avdr) ahnhVar.Aq.b(), ahnhVar.dM(), (avjf) ahnhVar.ahh.b(), ahnhVar.vh, ahnhVar.pb, ahnhVar.Ao, ahnhVar.agH);
            case 3401:
                ahkn ahknVar = this.a;
                ahnh ahnhVar2 = ahknVar.a;
                return new avie((fdjx) ahnhVar2.m.b(), (fcyh) ahknVar.cA.b(), (byeq) ahnhVar2.sG.b(), (cmfo) ahnhVar2.ahb.b(), ahnhVar2.ame, ahnhVar2.pb, ahknVar.cE, ahnhVar2.agJ, ahnhVar2.agH);
            case 3402:
                return new avgu(this.a.a.rF);
            case 3403:
                ahnh ahnhVar3 = this.a.a;
                return new cmkm((fdjx) ahnhVar3.oS.b(), ahnhVar3.amv, ahnhVar3.amj, ahnhVar3.g());
            case 3404:
                ahkn ahknVar2 = this.a;
                Context context = (Context) ahknVar2.t.b();
                ahnh ahnhVar4 = ahknVar2.a;
                cmjxVar = new cmjx(context, (fdjx) ahnhVar4.oQ.b(), (fdjx) ahnhVar4.oS.b(), ahnhVar4.pf, ahknVar2.aT, ahnhVar4.pB, ahnhVar4.rd, ahknVar2.dG, ahnhVar4.amg, ahnhVar4.re, (cmjk) ahknVar2.f3do.b(), ahnhVar4.rf, ahnhVar4.amh, ahnhVar4.ri, ahknVar2.aP, ahnhVar4.ami, ahnhVar4.amj, ahnhVar4.amq, ahnhVar4.amr, ahnhVar4.ct(), ahnhVar4.cs(), ahnhVar4.ams, ahnhVar4.amt, ahnhVar4.cr(), ahnhVar4.amu);
                break;
            case 3405:
                return Long.valueOf(fasb.a(this.a.a.oC()));
            case 3406:
                return new apwy() { // from class: apfd
                };
            case 3407:
                final eyik eyikVar = this.a.a.oO;
                return new dfmc() { // from class: dfkd
                    @Override // defpackage.dfmc
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("cslib.enable_all_subscriptions_as_verified");
                    }
                };
            case 3408:
                return new cmlp(this.a.a.pb);
            case 3409:
                ahnh ahnhVar5 = this.a.a;
                return ekhx.u((cmiv) ahnhVar5.YX.b(), ahnhVar5.ks(), ahnhVar5.ea(), (cmiv) ahnhVar5.AZ.b(), (cmiv) ahnhVar5.amp.b());
            case 3410:
                ahnh ahnhVar6 = this.a.a;
                return new crnt(ahnhVar6.pA, ahnhVar6.pf, ahnhVar6.LT);
            case 3411:
                ahkn ahknVar3 = this.a;
                Context context2 = (Context) ahknVar3.t.b();
                ahnh ahnhVar7 = ahknVar3.a;
                return new cmjf(context2, ahnhVar7.rC, ahnhVar7.rY, ahnhVar7.amo, ahnhVar7.rd, (fdjx) ahnhVar7.m.b());
            case 3412:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar8 = ahknVar4.a;
                return new cebe(ahnhVar8.qT(), ahnhVar8.rp, (Context) ahknVar4.t.b(), ahnhVar8.rd);
            case 3413:
                return new cebs(this.a.a.Qa);
            case 3414:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar9 = ahknVar5.a;
                return new cebx(ahnhVar9.rq, ahknVar5.pF, ahnhVar9.amm, (eosc) ahknVar5.p.b());
            case 3415:
                return new awlc(eyim.a, (fdjx) this.a.a.m.b());
            case 3416:
                final eyik eyikVar2 = this.a.a.oO;
                return new aruj() { // from class: artm
                    @Override // defpackage.aruj
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.log_entire_sim_subscription_info");
                    }
                };
            case 3417:
                final eyik eyikVar3 = this.a.a.oO;
                return new ascg() { // from class: ascc
                    @Override // defpackage.ascg
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_sim_removed_listener");
                    }
                };
            case 3418:
                return new apnj() { // from class: aopt
                };
            case 3419:
                final eyik eyikVar4 = this.a.a.oO;
                return new asce() { // from class: asby
                    @Override // defpackage.asce
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.catch_permission_exception_get_raw_msisdn_internal");
                    }
                };
            case 3420:
                ahnh ahnhVar10 = this.a.a;
                return new cbpo((fdjx) ahnhVar10.oQ.b(), ekon.a, (cbor) ahnhVar10.aeC.b(), (cbph) ahnhVar10.aeD.b(), (cbaz) ahnhVar10.rG.b(), (byeq) ahnhVar10.sG.b(), (cazj) ahnhVar10.rF.b());
            case 3421:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar11 = ahknVar6.a;
                return new dasi(ahnhVar11.aeK, (dens) ahknVar6.pG.b(), (fdjx) ahnhVar11.oS.b(), (fcyh) ahknVar6.cA.b(), ahnhVar11.amy);
            case 3422:
                ahnh ahnhVar12 = this.a.a;
                return new ctaj(ahnhVar12.qr, ahnhVar12.pQ);
            case 3423:
                ahkn ahknVar7 = this.a;
                Context context3 = (Context) ahknVar7.t.b();
                dens densVar = (dens) ahknVar7.pG.b();
                ahnh ahnhVar13 = ahknVar7.a;
                return new dasy(context3, densVar, ahnhVar13.alr, ahnhVar13.uP, ahknVar7.da, ahnhVar13.wF, ahnhVar13.pB, ahnhVar13.aeK, (eosc) ahknVar7.y.b(), (eosc) ahknVar7.p.b(), ahnhVar13.alv, ahnhVar13.amA, ahnhVar13.pb, ahknVar7.cE, ahnhVar13.qa);
            case 3424:
                ahkn ahknVar8 = this.a;
                return new ctbo(ahknVar8.t, ahknVar8.ib);
            case 3425:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar14 = ahknVar9.a;
                return new bwoa(ahnhVar14.TT, ahnhVar14.Fa, ahnhVar14.zP, ahnhVar14.sL, ahnhVar14.xZ, ahnhVar14.qi, ahknVar9.cD, (fdjx) ahnhVar14.oS.b(), (fdjx) ahnhVar14.oQ.b());
            case 3426:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar15 = ahknVar10.a;
                return new cawo(ahnhVar15.sL, (eosc) ahknVar10.y.b(), (bxlc) ahnhVar15.uI.b());
            case 3427:
                return new cilh(this.a.a.jj());
            case 3428:
                ahkn ahknVar11 = this.a;
                return new coeg(ahknVar11.a.kT(), (eosc) ahknVar11.aJ.b());
            case 3429:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar16 = ahknVar12.a;
                return new bzlp((fdjx) ahnhVar16.oQ.b(), (fcyh) ahknVar12.cz.b(), (aurx) ahnhVar16.wc.b(), (axlf) ahnhVar16.Lw.b(), ahnhVar16.fW(), Optional.empty(), (aukz) ahnhVar16.Iz.b(), (ains) ahnhVar16.c.b());
            case 3430:
                ahkn ahknVar13 = this.a;
                return new cpme((cpmh) ahknVar13.oZ.b(), ahknVar13.a.lf(), (dzuc) ahknVar13.cE.b());
            case 3431:
                ahnh ahnhVar17 = this.a.a;
                return new cbci((cbdd) ahnhVar17.amM.b(), ahnhVar17.amN, (cbbl) ahnhVar17.amT.b(), (fdjx) ahnhVar17.oQ.b());
            case 3432:
                ahkn ahknVar14 = this.a;
                Context context4 = (Context) ahknVar14.t.b();
                cogw cogwVar = (cogw) ahknVar14.cD.b();
                eosc eoscVar = (eosc) ahknVar14.aJ.b();
                ahnh ahnhVar18 = ahknVar14.a;
                return new cbdd(context4, cogwVar, eoscVar, ahnhVar18.amJ, ahnhVar18.rG, ahnhVar18.gT(), ahnhVar18.cI());
            case 3433:
                ahkn ahknVar15 = this.a;
                return new cbbj((cogw) ahknVar15.cD.b(), (cbaz) ahknVar15.a.rG.b());
            case 3434:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar19 = ahknVar16.a;
                eyik eyikVar5 = ahnhVar19.rG;
                eyik eyikVar6 = ahknVar16.aJ;
                return new cbls(eyikVar5, (eosc) eyikVar6.b(), (eosd) eyikVar6.b(), (dqsn) ahnhVar19.qq.b(), eyie.a(ahnhVar19.rF), (cbbj) ahnhVar19.amJ.b(), (cogw) ahknVar16.cD.b(), (cden) ahnhVar19.qN.b(), (aipo) ahnhVar19.us.b(), (cbfv) ahnhVar19.amK.b());
            case 3435:
                return new cbfv((fdjx) this.a.a.oQ.b());
            case 3436:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar20 = ahknVar17.a;
                return new cbhl((byeq) ahnhVar20.sG.b(), (cogw) ahknVar17.cD.b(), (cbaz) ahnhVar20.rG.b(), ahnhVar20.amP, ahnhVar20.amR, (egsh) ahknVar17.dG.b(), (dqsn) ahnhVar20.qq.b(), (cbhp) ahnhVar20.amS.b(), (caxe) ahnhVar20.FF.b(), ahnhVar20.pQ, (fdjx) ahnhVar20.oQ.b(), (fdjx) ahnhVar20.oS.b());
            case 3437:
                ahkn ahknVar18 = this.a;
                cogw cogwVar2 = (cogw) ahknVar18.cD.b();
                ahnh ahnhVar21 = ahknVar18.a;
                return new cbmh(cogwVar2, ahnhVar21.gU(), (cbmx) ahnhVar21.amO.b(), (caxe) ahnhVar21.FF.b(), (fdjx) ahnhVar21.oQ.b());
            case 3438:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar22 = ahknVar19.a;
                return new cbmx((cbfv) ahnhVar22.amK.b(), (cogw) ahknVar19.cD.b(), ahnhVar22.pQ);
            case 3439:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar23 = ahknVar20.a;
                return new cban((cbcr) ahnhVar23.amQ.b(), (Context) ahknVar20.t.b(), (fdjx) ahnhVar23.oS.b());
            case 3440:
                ahkn ahknVar21 = this.a;
                ConnectivityManager connectivityManager = (ConnectivityManager) ahknVar21.dO.b();
                ahnh ahnhVar24 = ahknVar21.a;
                return new cbcr(connectivityManager, ahnhVar24.cH(), (fdjx) ahnhVar24.oS.b());
            case 3441:
                return new cbhp((fdjx) this.a.a.oQ.b());
            case 3442:
                ahnh ahnhVar25 = this.a.a;
                return new cbcf(ahnhVar25.amI, ahnhVar25.qK, (fdjx) ahnhVar25.oQ.b(), (fdjx) ahnhVar25.oS.b());
            case 3443:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar26 = ahknVar22.a;
                return new cbai((dqsn) ahnhVar26.qq.b(), (cbkt) ahnhVar26.amL.b(), (cbfv) ahnhVar26.amK.b(), (cbmx) ahnhVar26.amO.b(), (egsh) ahknVar22.dG.b(), (cbls) ahnhVar26.amL.b(), (cbaz) ahnhVar26.rG.b(), (fdjx) ahnhVar26.oQ.b(), (fdjx) ahnhVar26.oS.b());
            case 3444:
                return afkb.a(this.a.a.amY);
            case 3445:
                ahnh ahnhVar27 = this.a.a;
                return new afjz(ahnhVar27.Mw, (fdjx) ahnhVar27.oS.b());
            case 3446:
                return uci.a(this.a.a.C());
            case 3447:
                return ajki.a(this.a.a.anb);
            case 3448:
                ahkn ahknVar23 = this.a;
                eyik eyikVar7 = ahknVar23.li;
                ahnh ahnhVar28 = ahknVar23.a;
                return new ajkh(eyikVar7, ahnhVar28.as(), (fdjx) ahnhVar28.oQ.b());
            case 3449:
                return awem.a(this.a.a.dP());
            case 3450:
                return new aweu();
            case 3451:
                return cnpo.a(this.a.a.anf);
            case 3452:
                ahnh ahnhVar29 = this.a.a;
                return new cnpm((cmqj) ahnhVar29.uv.b(), ahnhVar29.qr, (fdjx) ahnhVar29.oQ.b());
            case 3453:
                return cdly.a(this.a.a.anh);
            case 3454:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar30 = ahknVar24.a;
                return new cdlx((fdjx) ahnhVar30.oQ.b(), ahnhVar30.pG, ahnhVar30.tG, ahknVar24.dj);
            case 3455:
                ahnh ahnhVar31 = this.a.a;
                return bwan.a(ahnhVar31.eO(), (aqvc) ahnhVar31.to.b(), ahnhVar31.h());
            case 3456:
                return aidg.a(this.a.a.aj());
            case 3457:
                return aidf.a(this.a.a.ai());
            case 3458:
                return Boolean.valueOf(fakj.a(this.a.a.nQ()));
            case 3459:
                return cipk.a(this.a.a.ano);
            case 3460:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar32 = ahknVar25.a;
                return new ciph((fdjx) ahnhVar32.oQ.b(), (fcyh) ahknVar25.cA.b(), (cqba) ahknVar25.aM.b(), (cinr) ahnhVar32.ann.b(), ahnhVar32.abS, (Context) ahknVar25.t.b(), (ains) ahnhVar32.pQ.b(), (crnp) ahknVar25.cI.b(), (aofc) ahnhVar32.yD.b(), (ecjh) ahknVar25.pK.b(), (cogw) ahknVar25.cD.b(), ahnhVar32.abU, ahnhVar32.acj, ahnhVar32.acl);
            case 3461:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar33 = ahknVar26.a;
                return new cinr((fdjx) ahnhVar33.oQ.b(), (ajln) ahnhVar33.AB.b(), (cion) ahknVar26.ph.b());
            case 3462:
                ahnh ahnhVar34 = this.a.a;
                return cgro.a(ahnhVar34.anq, ahnhVar34.pe);
            case 3463:
                ahnh ahnhVar35 = this.a.a;
                return new cgrm((fdjx) ahnhVar35.oQ.b(), ahnhVar35.pe, ahnhVar35.oV);
            case 3464:
                return agup.a(this.a.a.ans);
            case 3465:
                ahnh ahnhVar36 = this.a.a;
                return new aguo((fdjx) ahnhVar36.oQ.b(), ahnhVar36.AC, ahnhVar36.qi, ahnhVar36.Ax, ahnhVar36.AB);
            case 3466:
                return bvpw.a(this.a.a.anu);
            case 3467:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar37 = ahknVar27.a;
                return new bvpu((fdjx) ahnhVar37.oQ.b(), ahnhVar37.wa, ahnhVar37.FP, ahknVar27.kB);
            case 3468:
                return ciqx.a(this.a.a.anz);
            case 3469:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar38 = ahknVar28.a;
                cmjxVar = new ciqt((fdjx) ahnhVar38.oQ.b(), (fcyh) ahknVar28.cA.b(), (cqba) ahknVar28.aM.b(), (Context) ahknVar28.t.b(), (ains) ahnhVar38.pQ.b(), (crnp) ahknVar28.cI.b(), ahnhVar38.uJ, ahnhVar38.sL, ahnhVar38.CN, ahnhVar38.zP, (cmqj) ahnhVar38.uv.b(), (alrj) ahnhVar38.qi.b(), (avpc) ahnhVar38.AM.b(), (bbdl) ahnhVar38.qG.b(), (aofc) ahnhVar38.yD.b(), (dqsn) ahnhVar38.qq.b(), ahnhVar38.anw, ahnhVar38.anx, (ecjh) ahknVar28.pL.b(), (cogw) ahknVar28.cD.b(), ahnhVar38.any, ahnhVar38.AE);
                break;
            case 3470:
                return Long.valueOf(fatt.a(this.a.a.oN()));
            case 3471:
                return Long.valueOf(fats.a(this.a.a.oN()));
            case 3472:
                return fatu.a(this.a.a.oN());
            case 3473:
                return cnqd.a(this.a.a.kQ());
            case 3474:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar39 = ahknVar29.a;
                return new cnpz(ahnhVar39.ut, ahknVar29.cT, ahnhVar39.qr, ahnhVar39.CR, (fdjx) ahnhVar39.oQ.b());
            case 3475:
                return csdx.a(this.a.a.anD);
            case 3476:
                ahnh ahnhVar40 = this.a.a;
                return new csdv(ahnhVar40.GH, ahnhVar40.Gz, (fdjx) ahnhVar40.oS.b());
            case 3477:
                return crlp.a(this.a.a.ls());
            case 3478:
                ahnh ahnhVar41 = this.a.a;
                return cnko.a(ahnhVar41.kK(), ahnhVar41.anG, ahnhVar41.anH);
            case 3479:
                return Long.valueOf(fawc.a(this.a.a.oY()));
            case 3480:
                return Boolean.valueOf(fawb.a(this.a.a.oY()));
            case 3481:
                return csfl.a((csfj) this.a.a.GP.b());
            case 3482:
                return ebbi.a(this.a.a.anM);
            case 3483:
                ahkn ahknVar30 = this.a;
                return new ebbh(ajkd.a(), ahknVar30.a.mA(), ahknVar30.dV(), (diep) ahknVar30.l.b());
            case 3484:
                return new ahmt(this);
            case 3485:
                return new ahmu(this);
            case 3486:
                ahnh ahnhVar42 = this.a.a;
                return ccvr.a(ahnhVar42.anO, ahnhVar42.ci());
            case 3487:
                ahnh ahnhVar43 = this.a.a;
                return new ccvp((fdjx) ahnhVar43.oQ.b(), ahnhVar43.sI, ahnhVar43.tI, ahnhVar43.yy, (dggx) ahnhVar43.sh.b(), (awyu) ahnhVar43.qB.b(), (ains) ahnhVar43.pQ.b(), ahnhVar43.ho(), (arny) ahnhVar43.uk.b(), ahnhVar43.ci(), ahnhVar43.hk(), (ckhg) ahnhVar43.PN.b(), ahnhVar43.aae);
            case 3488:
                return egnc.a(this.a.a.anQ);
            case 3489:
                ahkn ahknVar31 = this.a;
                return new egnb((Context) ahknVar31.t.b(), ekoj.a, (eosc) ahknVar31.y.b(), (ehvf) ahknVar31.aK.b());
            case 3490:
                return egjd.a(this.a.a.aof);
            case 3491:
                ahkn ahknVar32 = this.a;
                diep diepVar = (diep) ahknVar32.l.b();
                ahnh ahnhVar44 = ahknVar32.a;
                return new egja(diepVar, (egcd) ahnhVar44.l.b(), (egcq) ahnhVar44.aod.b(), ahnhVar44.mE(), (eosc) ahknVar32.p.b(), (eosc) ahknVar32.y.b(), ahknVar32.ef(), (eoqr) ahnhVar44.aoe.b());
            case 3492:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar45 = ahknVar33.a;
                return new egcq(ahnhVar45.aoa, (egcd) ahnhVar45.l.b(), (ecjh) ahnhVar45.aob.b(), (diep) ahknVar33.l.b(), ahnhVar45.aoc, ahknVar33.P(), (Executor) ahknVar33.p.b());
            case 3493:
                ahkn ahknVar34 = this.a;
                return new egct(ahknVar34.a.anZ, (Executor) ahknVar34.y.b());
            case 3494:
                return ekhx.o(this.a.a.ry());
            case 3495:
                return dyzb.a();
            case 3496:
                ahkn ahknVar35 = this.a;
                return dyza.a((Context) ahknVar35.t.b(), ejwi.j((Handler) ahknVar35.dR.b()), ejwi.j((ExecutorService) ahknVar35.aJ.b()), ejwi.j((ScheduledExecutorService) ahknVar35.y.b()), ejwi.j((dvdg) ahknVar35.a.anX.b()));
            case 3497:
                ahkn ahknVar36 = this.a;
                Context context5 = (Context) ahknVar36.t.b();
                eosd eosdVar = (eosd) ahknVar36.y.b();
                ahnh ahnhVar46 = ahknVar36.a;
                ecev ecevVar = (ecev) ahnhVar46.anS.b();
                ecjl ecjlVar = (ecjl) ahnhVar46.anT.b();
                dvfk dvfkVar = (dvfk) ahnhVar46.anU.b();
                dvfz dvfzVar = new dvfz();
                diep diepVar2 = (diep) ahknVar36.l.b();
                dcdt dcdtVar = dcdt.a;
                dcdtVar.getClass();
                return new dvfe(context5, eosdVar, "tiktok", ecevVar, ecjlVar, dvfkVar, dvfzVar, diepVar2, dcdtVar, (ecil) ahnhVar46.anV.b(), (deae) ahnhVar46.anW.b());
            case 3498:
                return dvga.a((Context) this.a.t.b());
            case 3499:
                ahkn ahknVar37 = this.a;
                return dvgb.a((eosd) ahknVar37.y.b(), (ecev) ahknVar37.a.anS.b());
            default:
                throw new AssertionError(i);
        }
        return cmjxVar;
    }

    private final Object E() {
        int i = this.b;
        switch (i) {
            case 400:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45407072").e());
            case 401:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45653572").e());
            case 402:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45694227").e());
            case 403:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45689036").e());
            case 404:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45423910").e());
            case 405:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45412125").e());
            case 406:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45674615").e());
            case 407:
                return Boolean.valueOf(fafd.c(this.a.a.mX()));
            case 408:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45687124").e());
            case 409:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45388670").e());
            case 410:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45696325").e());
            case 411:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45407073").e());
            case 412:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45407074").e());
            case 413:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45627533").e());
            case 414:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45686500").e());
            case 415:
                return Boolean.valueOf(((ehdm) this.a.a.ou().a.b()).a("com.google.android.apps.messaging.auto", "45673898").e());
            case 416:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45646169").e());
            case 417:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45675090").e());
            case 418:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45670448").e());
            case 419:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45638737").e());
            case 420:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45622462").e());
            case 421:
                return Boolean.valueOf(this.a.a.na().b());
            case 422:
                return Boolean.valueOf(((ehdm) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto", "45669879").e());
            case 423:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45677104").e());
            case 424:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45653428").e());
            case 425:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45697144").e());
            case 426:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45693721").e());
            case 427:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45689860").e());
            case 428:
                return Boolean.valueOf(((ehdm) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto", "45662474").e());
            case 429:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45683329").e());
            case 430:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45678990").e());
            case 431:
                return Boolean.valueOf(this.a.a.mY().i());
            case 432:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45684183").e());
            case 433:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45679904").e());
            case 434:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45379664").e());
            case 435:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45644502").e());
            case 436:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45669582").e());
            case 437:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45692658").e());
            case 438:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45687832").e());
            case 439:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45665774").e());
            case 440:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45618049").e());
            case 441:
                return Boolean.valueOf(this.a.a.nb().c());
            case 442:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45627732").e());
            case 443:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45659810").e());
            case 444:
                return Boolean.valueOf(((ehdm) this.a.a.oo().a.b()).a("com.google.android.apps.messaging.auto", "45691155").e());
            case 445:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45682177").e());
            case 446:
                return Boolean.valueOf(((ehdm) this.a.a.oE().a.b()).a("com.google.android.apps.messaging.auto", "45428247").e());
            case 447:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45623684").e());
            case 448:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45676458").e());
            case 449:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45679861").e());
            case 450:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45694549").e());
            case 451:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45690804").e());
            case 452:
                return Boolean.valueOf(((ehdm) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto", "45613647").e());
            case 453:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45685075").e());
            case 454:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45690649").e());
            case 455:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45425484").e());
            case 456:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45671288").e());
            case 457:
                return Boolean.valueOf(((ehdm) this.a.a.oU().a.b()).a("com.google.android.apps.messaging.auto", "45667516").e());
            case 458:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45410370").e());
            case 459:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45693986").e());
            case 460:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45677603").e());
            case 461:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45657009").e());
            case 462:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45685207").e());
            case 463:
                return Boolean.valueOf(((ehdm) this.a.a.op().a.b()).a("com.google.android.apps.messaging.auto", "45689467").e());
            case 464:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45677156").e());
            case 465:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45665599").e());
            case 466:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45678473").e());
            case 467:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45682631").e());
            case 468:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45679698").e());
            case 469:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45680860").e());
            case 470:
                return Boolean.valueOf(this.a.a.mX().e());
            case 471:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45683452").e());
            case 472:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45658569").e());
            case 473:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45684926").e());
            case 474:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45692898").e());
            case 475:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45667740").e());
            case 476:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45693082").e());
            case 477:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45646392").e());
            case 478:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45684340").e());
            case 479:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45687816").e());
            case 480:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45675904").e());
            case 481:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45677768").e());
            case 482:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45618379").e());
            case 483:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45696717").e());
            case 484:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45428068").e());
            case 485:
                return Boolean.valueOf(((ehdm) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto", "45662040").e());
            case 486:
                return Boolean.valueOf(this.a.a.mY().j());
            case 487:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45682402").e());
            case 488:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45679436").e());
            case 489:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45694550").e());
            case 490:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45693273").e());
            case 491:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45642142").e());
            case 492:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45686244").e());
            case 493:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45682665").e());
            case 494:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45687724").e());
            case 495:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45692968").e());
            case 496:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45667156").e());
            case 497:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45689520").e());
            case 498:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45696822").e());
            case 499:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45680292").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object F() {
        int i = this.b;
        switch (i) {
            case 500:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45683629").e());
            case 501:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45637227").e());
            case 502:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45619199").e());
            case 503:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45625433").e());
            case 504:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45428137").e());
            case 505:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45429377").e());
            case 506:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45677241").e());
            case 507:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45680119").e());
            case 508:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45656945").e());
            case 509:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45664258").e());
            case 510:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45681236").e());
            case 511:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45631851").e());
            case 512:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45671684").e());
            case 513:
                return Boolean.valueOf(fafd.d(this.a.a.mX()));
            case 514:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45685236").e());
            case 515:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45689049").e());
            case 516:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45430415").e());
            case 517:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45692562").e());
            case 518:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45373730").e());
            case 519:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45670298").e());
            case 520:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45689834").e());
            case 521:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45665372").e());
            case 522:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45692021").e());
            case 523:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45389828").e());
            case 524:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45682647").e());
            case 525:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45628053").e());
            case 526:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45694813").e());
            case 527:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45691281").e());
            case 528:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45693762").e());
            case 529:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45369535").e());
            case 530:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45678902").e());
            case 531:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45687292").e());
            case 532:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45697336").e());
            case 533:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45683095").e());
            case 534:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45661093").e());
            case 535:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45626837").e());
            case 536:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45690147").e());
            case 537:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45693969").e());
            case 538:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45410067").e());
            case 539:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45687148").e());
            case 540:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45647273").e());
            case 541:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45681704").e());
            case 542:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45685760").e());
            case 543:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45683667").e());
            case 544:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45683659").e());
            case 545:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45684366").e());
            case 546:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45658496").e());
            case 547:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45412126").e());
            case 548:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45651123").e());
            case 549:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45387588").e());
            case 550:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45639551").e());
            case 551:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45693031").e());
            case 552:
                return Boolean.valueOf(this.a.a.mZ().h());
            case 553:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45685389").e());
            case 554:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45682217").e());
            case 555:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45665083").e());
            case 556:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45687617").e());
            case 557:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45683069").e());
            case 558:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45683330").e());
            case 559:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45693511").e());
            case 560:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45684908").e());
            case 561:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45689336").e());
            case 562:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45657037").e());
            case 563:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45693523").e());
            case 564:
                return Boolean.valueOf(this.a.a.mZ().i());
            case 565:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45697521").e());
            case 566:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45691282").e());
            case 567:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45696945").e());
            case 568:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45688424").e());
            case 569:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45686674").e());
            case 570:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45688601").e());
            case 571:
                return Boolean.valueOf(this.a.a.mZ().j());
            case 572:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45630852").e());
            case 573:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45662267").e());
            case 574:
                return Boolean.valueOf(this.a.a.mX().f());
            case 575:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45647937").e());
            case 576:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45681693").e());
            case 577:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45420870").e());
            case 578:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45692224").e());
            case 579:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45671490").e());
            case 580:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45374940").e());
            case 581:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45691908").e());
            case 582:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45684640").e());
            case 583:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45693274").e());
            case 584:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45686154").e());
            case 585:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45683223").e());
            case 586:
                return Boolean.valueOf(this.a.a.mX().g());
            case 587:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45685837").e());
            case 588:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45640044").e());
            case 589:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45692613").e());
            case 590:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45477573").e());
            case 591:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45690250").e());
            case 592:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45641443").e());
            case 593:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45614658").e());
            case 594:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45681038").e());
            case 595:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45430727").e());
            case 596:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45632736").e());
            case 597:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45696250").e());
            case 598:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45696870").e());
            case 599:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45621103").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object G() {
        int i = this.b;
        switch (i) {
            case 600:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45687760").e());
            case 601:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45638776").e());
            case 602:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45427318").e());
            case 603:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45687022").e());
            case 604:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45373456").e());
            case 605:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45693690").e());
            case 606:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45682358").e());
            case 607:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45686334").e());
            case 608:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45684678").e());
            case 609:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45658950").e());
            case 610:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45624249").e());
            case 611:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45690683").e());
            case 612:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45687866").e());
            case 613:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45656492").e());
            case 614:
                return Boolean.valueOf(((ehdm) this.a.a.oB().a.b()).a("com.google.android.apps.messaging.auto", "45685599").e());
            case 615:
                return Boolean.valueOf(((ehdm) this.a.a.oB().a.b()).a("com.google.android.apps.messaging.auto", "45675561").e());
            case 616:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45671841").e());
            case 617:
                return Boolean.valueOf(this.a.a.na().c());
            case 618:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45685748").e());
            case 619:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45690684").e());
            case 620:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45689157").e());
            case 621:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45668475").e());
            case 622:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45690724").e());
            case 623:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45641987").e());
            case 624:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45409040").e());
            case 625:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45685213").e());
            case 626:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45644705").e());
            case 627:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45650579").e());
            case 628:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45678348").e());
            case 629:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45694101").e());
            case 630:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45650660").e());
            case 631:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45426381").e());
            case 632:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45657547").e());
            case 633:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45680725").e());
            case 634:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45696985").e());
            case 635:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45696463").e());
            case 636:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45696027").e());
            case 637:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45694609").e());
            case 638:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45694870").e());
            case 639:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45693264").e());
            case 640:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45386874").e());
            case 641:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45677414").e());
            case 642:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45669777").e());
            case 643:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45684577").e());
            case 644:
                return Boolean.valueOf(this.a.a.na().d());
            case 645:
                return Boolean.valueOf(fafd.e(this.a.a.mX()));
            case 646:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45367497").e());
            case 647:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45680107").e());
            case 648:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45686581").e());
            case 649:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45660976").e());
            case 650:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45421542").e());
            case 651:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45683815").e());
            case 652:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45681415").e());
            case 653:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45663969").e());
            case 654:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45689317").e());
            case 655:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45690035").e());
            case 656:
                return Boolean.valueOf(((ehdm) this.a.a.pc().a.b()).a("com.google.android.apps.messaging.auto", "45668437").e());
            case 657:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45696566").e());
            case 658:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45692972").e());
            case 659:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45691283").e());
            case 660:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45660508").e());
            case 661:
                return Boolean.valueOf(this.a.a.na().e());
            case 662:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45633988").e());
            case 663:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45620263").e());
            case 664:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45670382").e());
            case 665:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45648825").e());
            case 666:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45690370").e());
            case 667:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45693395").e());
            case 668:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45698598").e());
            case 669:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45691034").e());
            case 670:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45618236").e());
            case 671:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45634794").e());
            case 672:
                return Boolean.valueOf(this.a.a.mY().k());
            case 673:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45686155").e());
            case 674:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45671407").e());
            case 675:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45694388").e());
            case 676:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45687125").e());
            case 677:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45669575").e());
            case 678:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45697128").e());
            case 679:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45693512").e());
            case 680:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45639797").e());
            case 681:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45685879").e());
            case 682:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45667168").e());
            case 683:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45689545").e());
            case 684:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45688210").e());
            case 685:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45688507").e());
            case 686:
                return Boolean.valueOf(this.a.a.na().f());
            case 687:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45680278").e());
            case 688:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45413235").e());
            case 689:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45682550").e());
            case 690:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45692115").e());
            case 691:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45638344").e());
            case 692:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45637232").e());
            case 693:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45637234").e());
            case 694:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637235").e());
            case 695:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45668452").e());
            case 696:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45637236").e());
            case 697:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45687353").e());
            case 698:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45623693").e());
            case 699:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45686156").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object H() {
        int i = this.b;
        switch (i) {
            case 700:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45689303").e());
            case 701:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45648351").e());
            case 702:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45689376").e());
            case 703:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45679589").e());
            case 704:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45664138").e());
            case 705:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45681942").e());
            case 706:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45681941").e());
            case 707:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45619445").e());
            case 708:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45673533").e());
            case 709:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45639129").e());
            case 710:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45693362").e());
            case 711:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45650376").e());
            case 712:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45478338").e());
            case 713:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45664282").e());
            case 714:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45691573").e());
            case 715:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45693321").e());
            case 716:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45680352").e());
            case 717:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45692206").e());
            case 718:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45691695").e());
            case 719:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45685949").e());
            case 720:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45697277").e());
            case 721:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45670113").e());
            case 722:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45685076").e());
            case 723:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45692407").e());
            case 724:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45689794").e());
            case 725:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45690210").e());
            case 726:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45686078").e());
            case 727:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45674718").e());
            case 728:
                return Boolean.valueOf(this.a.a.mZ().k());
            case 729:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45683917").e());
            case 730:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45413825").e());
            case 731:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45650539").e());
            case 732:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45658425").e());
            case 733:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45657549").e());
            case 734:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45692207").e());
            case 735:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45693774").e());
            case 736:
                return Boolean.valueOf(this.a.a.mZ().l());
            case 737:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45679527").e());
            case 738:
                return Boolean.valueOf(this.a.a.mZ().m());
            case 739:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45684559").e());
            case 740:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45624411").e());
            case 741:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45698562").e());
            case 742:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45686245").e());
            case 743:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45641444").e());
            case 744:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45585366").e());
            case 745:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45677702").e());
            case 746:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45461067").e());
            case 747:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45690226").e());
            case 748:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45647143").e());
            case 749:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45688206").e());
            case 750:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45691841").e());
            case 751:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45460276").e());
            case 752:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45687023").e());
            case 753:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45693970").e());
            case 754:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45692015").e());
            case 755:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45689713").e());
            case 756:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45694147").e());
            case 757:
                return Boolean.valueOf(fafd.f(this.a.a.mX()));
            case 758:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45698599").e());
            case 759:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45687213").e());
            case 760:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45690889").e());
            case 761:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45478382").e());
            case 762:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45676576").e());
            case 763:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45623804").e());
            case 764:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45622422").e());
            case 765:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45691842").e());
            case 766:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45655908").e());
            case 767:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45697063").e());
            case 768:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45680219").e());
            case 769:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45696914").e());
            case 770:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45646726").e());
            case 771:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45669010").e());
            case 772:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45684076").e());
            case 773:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45697497").e());
            case 774:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45684879").e());
            case 775:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45625296").e());
            case 776:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45693133").e());
            case 777:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45694148").e());
            case 778:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45664260").e());
            case 779:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45689050").e());
            case 780:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45400273").e());
            case 781:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45430694").e());
            case 782:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45687883").e());
            case 783:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45693474").e());
            case 784:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45680100").e());
            case 785:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45681465").e());
            case 786:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45680646").e());
            case 787:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45692862").e());
            case 788:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45698605").e());
            case 789:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45683892").e());
            case 790:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45680220").e());
            case 791:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45687047").e());
            case 792:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45690211").e());
            case 793:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45697278").e());
            case 794:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45689835").e());
            case 795:
                return Boolean.valueOf(this.a.a.mX().h());
            case 796:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45637238").e());
            case 797:
                return Boolean.valueOf(this.a.a.mX().i());
            case 798:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45690533").e());
            case 799:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45687833").e());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [ayqo, java.lang.Object] */
    private final Object I() {
        int i = this.b;
        switch (i) {
            case 800:
                return Boolean.valueOf(fajg.a(this.a.a.nJ()));
            case 801:
                return Boolean.valueOf(fahd.a(this.a.a.nr()));
            case 802:
                return Boolean.valueOf(fajj.a(this.a.a.nK()));
            case 803:
                return Boolean.valueOf(fafr.a(this.a.a.nc()));
            case 804:
                return Boolean.valueOf(faiv.a(this.a.a.nF()));
            case 805:
                return Boolean.valueOf(faie.a(this.a.a.nz()));
            case 806:
                return Boolean.valueOf(fahp.a(this.a.a.nv()));
            case 807:
                return Boolean.valueOf(fahy.a(this.a.a.ny()));
            case 808:
                return Boolean.valueOf(fahh.a(this.a.a.ns()));
            case 809:
                return Boolean.valueOf(fahe.a(this.a.a.nr()));
            case 810:
                return Boolean.valueOf(fagw.a(this.a.a.no()));
            case 811:
                return Boolean.valueOf(famm.a(this.a.a.ob()));
            case 812:
                return Boolean.valueOf(faik.a(this.a.a.nB()));
            case 813:
                return Boolean.valueOf(fahv.a(this.a.a.nx()));
            case 814:
                return Boolean.valueOf(fain.a(this.a.a.nC()));
            case 815:
                return Boolean.valueOf(fagl.a(this.a.a.nk()));
            case 816:
                return Boolean.valueOf(fais.a(this.a.a.nE()));
            case 817:
                return Boolean.valueOf(faiy.a(this.a.a.nG()));
            case 818:
                return Boolean.valueOf(faif.a(this.a.a.nz()));
            case 819:
                return Boolean.valueOf(fahz.a(this.a.a.ny()));
            case 820:
                return Boolean.valueOf(fago.a(this.a.a.nl()));
            case 821:
                return Boolean.valueOf(fafs.a(this.a.a.nc()));
            case 822:
                return Boolean.valueOf(faia.a(this.a.a.ny()));
            case 823:
                return Boolean.valueOf(faib.a(this.a.a.ny()));
            case 824:
                return Boolean.valueOf(faiz.a(this.a.a.nG()));
            case 825:
                return Boolean.valueOf(fafh.a(this.a.a.mY()));
            case 826:
                return Boolean.valueOf(famn.a(this.a.a.ob()));
            case 827:
                return Boolean.valueOf(fagt.a(this.a.a.nn()));
            case 828:
                return Boolean.valueOf(famo.a(this.a.a.ob()));
            case 829:
                return Boolean.valueOf(faos.a(this.a.a.on()));
            case 830:
                return Boolean.valueOf(fage.a(this.a.a.nh()));
            case 831:
                return Boolean.valueOf(fafi.a(this.a.a.mY()));
            case 832:
                return Boolean.valueOf(fajk.a(this.a.a.nK()));
            case 833:
                return Boolean.valueOf(fahm.a(this.a.a.nu()));
            case 834:
                return Boolean.valueOf(fajl.a(this.a.a.nK()));
            case 835:
                return Boolean.valueOf(fafz.a(this.a.a.nf()));
            case 836:
                return Boolean.valueOf(fahs.a(this.a.a.nw()));
            case 837:
                ahkn ahknVar = this.a;
                return new eotm(Optional.empty(), Optional.empty(), ahknVar.a.qP());
            case 838:
                ahnh ahnhVar = this.a.a;
                return new bxtd((lkb) ahnhVar.oR.b(), (fdjx) ahnhVar.m.b(), (fdjx) ahnhVar.oS.b());
            case 839:
                return bxtf.a(bxte.a(), this.a.a.mK());
            case 840:
                ahkn ahknVar2 = this.a;
                return egvf.a((fcyh) ahknVar2.cz.b(), ahknVar2.a.mF());
            case 841:
                ahkn ahknVar3 = this.a;
                return egvg.a((fcyh) ahknVar3.cA.b(), ahknVar3.a.mF());
            case 842:
                return new bybn(this.a.a.rF);
            case 843:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar2 = ahknVar4.a;
                return new cazw(ahnhVar2.rG, (dqsn) ahnhVar2.qq.b(), (fdjx) ahnhVar2.oS.b(), (fdjx) ahnhVar2.oQ.b(), (eosc) ahknVar4.y.b(), (cbcz) ahnhVar2.amU.b(), (cogw) ahknVar4.cD.b(), ahnhVar2.gS(), Optional.of(ahnhVar2.qL()), (cbmx) ahnhVar2.amO.b(), (cbfv) ahnhVar2.amK.b(), eyie.a(ahnhVar2.amV), ahnhVar2.bD());
            case 844:
                ahkn ahknVar5 = this.a;
                return new cbba(ahknVar5.a.amI, ahknVar5.pJ);
            case 845:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar3 = ahknVar6.a;
                ekgi ekgiVarH = ekgp.h(209);
                ekgiVarH.i("backup_self_participant", ahnhVar3.afL);
                ekgiVarH.i("block_on_telephony_sync", ahnhVar3.afM);
                ekgiVarH.i("cms_backfill_missing_field_work_handler", ahnhVar3.afN);
                ekgiVarH.i("cms_backup_validation_work_handler", ahnhVar3.afO);
                ekgiVarH.i("disable_multi_device_on_server_when_enable_bnr", ahnhVar3.afP);
                ekgiVarH.i("cms_local_media_restore", ahnhVar3.afQ);
                ekgiVarH.i("cms_local_media_restore_requiring_charging", ahnhVar3.afR);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi", ahnhVar3.afS);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_charging", ahnhVar3.afT);
                ekgiVarH.i("cms_local_media_restore_requiring_battery_not_low", ahnhVar3.afU);
                ekgiVarH.i("cms_local_media_restore_requiring_wifi_and_battery_not_low", ahnhVar3.afV);
                ekgiVarH.i("cms_media_download_queuer_work_handler", ahnhVar3.afW);
                ekgiVarH.i("cms_media_upload_queuer_work_handler", ahnhVar3.afZ);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low", ahnhVar3.aga);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", ahnhVar3.agb);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi", ahnhVar3.agc);
                ekgiVarH.i("cms_initial_sync_media_upload", ahnhVar3.agd);
                ekgiVarH.i("cms_initial_sync_media_upload_foreground", ahnhVar3.age);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", ahnhVar3.agf);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", ahnhVar3.agg);
                ekgiVarH.i("cms_initial_sync_media_upload_requiring_wifi_foreground", ahnhVar3.agh);
                ekgiVarH.i("cms_incremental_sync_media_upload", ahnhVar3.agi);
                ekgiVarH.i("cms_incremental_sync_media_upload_requiring_wifi", ahnhVar3.agj);
                ekgiVarH.i("cms_set_feature_enabled_on_server", ahnhVar3.agk);
                ekgiVarH.i("cms_set_initial_sync_status_on_server", ahnhVar3.agl);
                ekgiVarH.i("cms_restore_page", ahnhVar3.agm);
                ekgiVarH.i("cms_restore_page_background", ahnhVar3.agn);
                ekgiVarH.i("cms_restore_page_foreground", ahnhVar3.ago);
                ekgiVarH.i("conversation_deduping_work", ahnhVar3.agp);
                ekgiVarH.i("IdentityVerificationPendingMessageHandler", ahnhVar3.agq);
                ekgiVarH.i("finish_cms_restore_after_message_insertion", ahnhVar3.agr);
                ekgiVarH.i("insert_new_message_from_cms", ahnhVar3.agw);
                ekgiVarH.i("refresh_cms_server_storage_info", ahnhVar3.agx);
                ekgiVarH.i("remove_to_be_delivered_label", ahnhVar3.agy);
                ekgiVarH.i("StarAnalyticsWorkerHandler", ahnhVar3.agz);
                ekgiVarH.i("turn_on_bnr", ahnhVar3.agA);
                ekgiVarH.i("upload_previous_cms_session_ids", ahnhVar3.agB);
                ekgiVarH.i("__UNHANDLED_HANDLER", ahknVar6.pe);
                ekgiVarH.i("cms_restore_validation_work_handler", ahnhVar3.agC);
                ekgiVarH.i("batch_contacts_import", ahnhVar3.agI);
                ekgiVarH.i("batch_deleted_contacts_sync", ahnhVar3.agL);
                ekgiVarH.i("clear_session_ids", ahnhVar3.agM);
                ekgiVarH.i("contact_recipient_change_sync", ahnhVar3.agO);
                ekgiVarH.i("contact_recipient_deleted_sync", ahnhVar3.agP);
                ekgiVarH.i("conversation_latcher", ahnhVar3.agQ);
                ekgiVarH.i("delete_part_cms_attachment", ahnhVar3.agR);
                ekgiVarH.i("encrypted_message_delete", ahnhVar3.agS);
                ekgiVarH.i("end_heavy_work", ahnhVar3.agT);
                ekgiVarH.i("expire_wap_push_si_message", ahnhVar3.agW);
                ekgiVarH.i("fi_multi_sync_grpc", ahnhVar3.aha);
                ekgiVarH.i("force_contacts_sync", ahnhVar3.ahn);
                ekgiVarH.i("gaia_auth_check_result", ahnhVar3.aho);
                ekgiVarH.i("add_members_to_rcs_conversation", ahnhVar3.ahr);
                ekgiVarH.i("ari_work_handler", ahnhVar3.ahs);
                ekgiVarH.i("attachment_to_telephony_sync", ahnhVar3.aht);
                ekgiVarH.i("backup_upgraded_mms_group", ahnhVar3.ahv);
                ekgiVarH.i("bard_deletion_sender", ahnhVar3.ahw);
                ekgiVarH.i("block_on_initial_backup_preconditions", ahnhVar3.ahx);
                ekgiVarH.i("cancel_notification", ahnhVar3.ahB);
                ekgiVarH.i("cancel_rcs_file_transfer", ahnhVar3.ahC);
                ekgiVarH.i("cleanup_part_uri_handler", ahnhVar3.ahD);
                ekgiVarH.i("cms_back_fill_bnr_state_for_fi_md", ahnhVar3.ahE);
                ekgiVarH.i("cms_backup", ahnhVar3.ahF);
                ekgiVarH.i("cms_batch_backup", ahnhVar3.ahG);
                ekgiVarH.i("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", ahnhVar3.ahH);
                ekgiVarH.i("cms_check_missing_restore_work_on_app_upgrade", ahnhVar3.ahI);
                ekgiVarH.i("cms_key_sync", ahnhVar3.ahJ);
                ekgiVarH.i("cms_multi_device_opt_out", ahnhVar3.ahL);
                ekgiVarH.i("cms_restore_backup_key", ahnhVar3.ahM);
                ekgiVarH.i("cms_restore_conversations", ahnhVar3.ahN);
                ekgiVarH.i("cms_restore_encryption_key", ahnhVar3.ahO);
                ekgiVarH.i("cms_restore_messages", ahnhVar3.ahP);
                ekgiVarH.i("cms_restore_participants", ahnhVar3.ahQ);
                ekgiVarH.i("cms_sync_stale_status_on_app_upgrade", ahnhVar3.ahR);
                ekgiVarH.i("connect_to_tachyon_anonymously", ahnhVar3.ahS);
                ekgiVarH.i("contact_keys_loader_handler", ahnhVar3.ahT);
                ekgiVarH.i("conversation_metadata_full_sync", ahnhVar3.ahU);
                ekgiVarH.i("CONVERSATION_NOTIFICATION", ahnhVar3.ahY);
                ekgiVarH.i("conversation_thread_id_updater_worker", ahnhVar3.ahZ);
                ekgiVarH.i("create_notification", ahnhVar3.aic);
                ekgiVarH.i("create_or_update_lighter_conversation", ahnhVar3.aie);
                ekgiVarH.i("custom_themes_sender", ahnhVar3.aif);
                ekgiVarH.i("data_upgrade", ahnhVar3.ail);
                ekgiVarH.i("delete_conversation_handler", ahnhVar3.aip);
                ekgiVarH.i("delete_parts_work_item", ahnhVar3.aiq);
                ekgiVarH.i("delete_message_from_telephony", ahnhVar3.air);
                ekgiVarH.i("delete_message", ahnhVar3.ait);
                ekgiVarH.i("delete_thread_from_telephony", ahnhVar3.aiu);
                ekgiVarH.i("spam_recheck_handler", ahknVar6.pl);
                ekgiVarH.i("ditto_conversation_retry_handler", ahnhVar3.aiv);
                ekgiVarH.i("ditto_message_retry_handler", ahnhVar3.aiw);
                ekgiVarH.i("ditto_retry_handler", ahnhVar3.aix);
                ekgiVarH.i("downgrade_on_unencrypted_message", ahnhVar3.aiz);
                ekgiVarH.i("download_mms", ahnhVar3.aiQ);
                ekgiVarH.i("file_audio_levels", ahnhVar3.aiR);
                ekgiVarH.i("file_download_completed", ahnhVar3.aiX);
                ekgiVarH.i("file_download_failed", ahnhVar3.aja);
                ekgiVarH.i("file_download", ahnhVar3.ajd);
                ekgiVarH.i("file_transfer_processor", ahnhVar3.aje);
                ekgiVarH.i("messaging_file_upload", ahnhVar3.ajg);
                ekgiVarH.i("forward_sync_batch", ahnhVar3.ajm);
                ekgiVarH.i("ftd_data_clean_up_work", ahnhVar3.ajn);
                ekgiVarH.i("FtdHandlerWorkItem", ahnhVar3.ajp);
                ekgiVarH.i("rcs_engine_get_single_message", ahnhVar3.ajq);
                ekgiVarH.i("google_photos_api_callback", ahnhVar3.ajr);
                ekgiVarH.i("group_icon_cleanup_handler", ahnhVar3.ajs);
                ekgiVarH.i("group_session_start_failed", ahnhVar3.ajt);
                ekgiVarH.i("group_session_started", ahnhVar3.aju);
                ekgiVarH.i("icing_index_rebuild_handler", ahnhVar3.ajx);
                ekgiVarH.i("icing_index_rebuild_single_work_handler", ahnhVar3.ajz);
                ekgiVarH.i("icing_index_update_handler", ahnhVar3.ajA);
                ekgiVarH.i("chatapi_incoming_group_notification_list_message", ahnhVar3.ajC);
                ekgiVarH.i("incoming_rbm_message_handler", ahnhVar3.ajD);
                ekgiVarH.i("incoming_rcs_group_invitation", ahnhVar3.ajE);
                ekgiVarH.i("IncrementalReverseSyncWorkItemHandler", ahnhVar3.ajF);
                ekgiVarH.i("key_delivery_service_registration_work_handler", ahnhVar3.ajG);
                ekgiVarH.i("mls_key_refresh_work_handler", ahnhVar3.ajH);
                ekgiVarH.i("leave_rcs_group_conversation", ahnhVar3.ajJ);
                ekgiVarH.i("lighter_incremental_sync", ahnhVar3.ajR);
                ekgiVarH.i("log_message_sent_or_received", ahnhVar3.WE);
                ekgiVarH.i("magic_compose_send_clicked_log_handler", ahnhVar3.ajU);
                ekgiVarH.i("mark_all_rcs_groups_as_left", ahnhVar3.ajV);
                ekgiVarH.i("mark_as_notified", ahnhVar3.ajX);
                ekgiVarH.i("mark_failures_as_notified", ahnhVar3.ajY);
                ekgiVarH.i("MessagesRestoreWorkItemHandler", ahnhVar3.akc);
                ekgiVarH.i("on_add_user_to_group_chat_complete", ahnhVar3.akd);
                ekgiVarH.i("on_create_group_chat_complete", ahnhVar3.ake);
                ekgiVarH.i("on_remove_user_from_group_chat_complete", ahnhVar3.akf);
                ekgiVarH.i("on_trigger_chat_group_full_state_update_complete", ahknVar6.pw);
                ekgiVarH.i("participant_contact_sync", ahnhVar3.akg);
                ekgiVarH.i("persist_ios_reaction", ahnhVar3.akh);
                ekgiVarH.i("persist_thumbnail", ahnhVar3.aki);
                ekgiVarH.i("pipeline_work_handler", ahnhVar3.akj);
                ekgiVarH.i("post_incoming_message_to_chat_api", ahnhVar3.akm);
                ekgiVarH.i("ditto_process_user_alert", ahnhVar3.akn);
                ekgiVarH.i("forward_sync_engine", ahnhVar3.akp);
                ekgiVarH.i("rcs_group_identifiers_telephony_migration", ahnhVar3.akq);
                ekgiVarH.i("rcs_to_telephony_sync", ahnhVar3.akr);
                ekgiVarH.i("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", ahnhVar3.aks);
                ekgiVarH.i("refresh_incoming_message_notifications", ahnhVar3.akt);
                ekgiVarH.i("refresh_message_failure_notification", ahnhVar3.aku);
                ekgiVarH.i("remote_user_identity_key_change_handler", ahnhVar3.akv);
                ekgiVarH.i("remove_members_from_rcs_conversation", ahnhVar3.akx);
                ekgiVarH.i("resizing", ahnhVar3.aky);
                ekgiVarH.i("retry_manager", ahnhVar3.FR);
                ekgiVarH.i("run_analyze", ahnhVar3.akz);
                ekgiVarH.i("chatapi_send_chat_message_response", ahnhVar3.OR);
                ekgiVarH.i("smart_retries_pipeline_work_handler", ahnhVar3.akA);
                ekgiVarH.i("smarts_send_message_listener_handler", ahnhVar3.akB);
                ekgiVarH.i("soda_file_transcription", ahnhVar3.akD);
                ekgiVarH.i("spam_reclassification_handler", ahnhVar3.akE);
                ekgiVarH.i("spot_sync", ahnhVar3.akF);
                ekgiVarH.i("sync_rcs_groups", ahnhVar3.akH);
                ekgiVarH.i("tachygram_add_user_to_group", ahnhVar3.akJ);
                ekgiVarH.i("tachygram_create_group", ahnhVar3.akK);
                ekgiVarH.i("tachygram_get_group_info", ahnhVar3.akL);
                ekgiVarH.i("tachygram_inbox_message_retry", ahnhVar3.akO);
                ekgiVarH.i("tachygram_remove_user_from_group", ahnhVar3.akP);
                ekgiVarH.i("tachygram_revoke_message", ahnhVar3.akQ);
                ekgiVarH.i("tachygram_send_message", ahnhVar3.Qc);
                ekgiVarH.i("tachygram_update_group", ahnhVar3.akS);
                ekgiVarH.i("thumbnail_download_completed", ahnhVar3.akT);
                ekgiVarH.i("tombstone_manager_on_rcs_group_e2ee_status_change", ahnhVar3.akU);
                ekgiVarH.i("undelivered_message_fallback", ahnhVar3.akV);
                ekgiVarH.i("unregister_google_rcs_call", ahnhVar3.akW);
                ekgiVarH.i("UPDATE_ARCHIVE_STATUS", ahnhVar3.akX);
                ekgiVarH.i("update_conversation_encryption_status", ahnhVar3.akY);
                ekgiVarH.i("update_timestamp_in_telephony", ahnhVar3.akZ);
                ekgiVarH.i("update_unread_counter", ahknVar6.pA);
                ekgiVarH.i("upload_attachments_to_blobstore", ahnhVar3.ala);
                ekgiVarH.i("vendor_ims_call", ahnhVar3.alc);
                ekgiVarH.i("EmotifyReactionDatabaseUpdateHandler", ahnhVar3.ald);
                ekgiVarH.i("key_package_upload_work_handler", ahnhVar3.ale);
                ekgiVarH.i("TelephonyDatabaseUpdateWorkItemHandler", ahnhVar3.alh);
                ekgiVarH.i("chatapi_incoming_group_chat_notification_message", ahnhVar3.alp);
                ekgiVarH.i("incremental_contacts_import", ahnhVar3.alq);
                ekgiVarH.i("load_paged_conversation_timeout_fallback", ahnhVar3.alw);
                ekgiVarH.i("low_storage", ahnhVar3.aly);
                ekgiVarH.i("mark_messages_as_read_handler", ahnhVar3.alz);
                ekgiVarH.i("mark_rcs_messages_in_telephony", ahnhVar3.alA);
                ekgiVarH.i("otp_deletion_handler", ahnhVar3.alD);
                ekgiVarH.i("p13n_work", ahnhVar3.alE);
                ekgiVarH.i("parent_allowlist_update", ahnhVar3.alG);
                ekgiVarH.i("penpal_bot_recipient_restore", ahnhVar3.alH);
                ekgiVarH.i("penpal_conversation_auto_generate", ahnhVar3.alI);
                ekgiVarH.i("process_rcs_group_notify", ahnhVar3.alJ);
                ekgiVarH.i("rbm_business_info_retrieval", ahnhVar3.alK);
                ekgiVarH.i("rbm_chatbot_directory_welcome_message", ahnhVar3.alL);
                ekgiVarH.i("recover_disabled_rcs_group", ahnhVar3.alM);
                ekgiVarH.i("reflection_attachment_completed_handler_module", ahnhVar3.alO);
                ekgiVarH.i("reflection_attachment_persistent_handler_module", ahnhVar3.alQ);
                ekgiVarH.i("request_link_preview", ahnhVar3.alS);
                ekgiVarH.i("request_smart_suggestions", ahnhVar3.alT);
                ekgiVarH.i("retrieve_questionnaire", ahnhVar3.alW);
                ekgiVarH.i("ReverseTelephonySync", ahnhVar3.alX);
                ekgiVarH.i("chatapi_revoke_chat_message_response", ahnhVar3.alY);
                ekgiVarH.i("rich_card_media_uri_cleanup", ahnhVar3.alZ);
                ekgiVarH.i("satellite_network_state_updater", ahnhVar3.amc);
                ekgiVarH.i("schedule_contacts_import", ahnhVar3.amd);
                ekgiVarH.i("schedule_delete_and_import_contacts", ahnhVar3.amf);
                ekgiVarH.i("sim_state_update", ahnhVar3.amw);
                ekgiVarH.i("start_heavy_work", ahnhVar3.amx);
                ekgiVarH.i("sync_conversation_data_to_wearable", ahnhVar3.amz);
                ekgiVarH.i("sync_data_to_wearable_app", ahnhVar3.amB);
                ekgiVarH.i("sync_group_then_encryption_status", ahnhVar3.amC);
                ekgiVarH.i("UPDATE_MARK_UNREAD", ahnhVar3.amD);
                ekgiVarH.i("update_rcs_group_name", ahnhVar3.amE);
                ekgiVarH.i("CopyFileTelephonyPartHandler", ahnhVar3.amF);
                ekgiVarH.i("cms_drop_unscheduled_item_to_dlq", ahnhVar3.amH);
                return ekgiVarH.h();
            case 846:
                ahnh ahnhVar4 = this.a.a;
                Object objPu = ahnhVar4.pu();
                caai caaiVarGp = ahnhVar4.gp();
                ahnhVar4.sj();
                return byhb.a(objPu, caaiVarGp);
            case 847:
                ahkn ahknVar7 = this.a;
                eyik eyikVar = ahknVar7.cD;
                ahnh ahnhVar5 = ahknVar7.a;
                eyik eyikVar2 = ahnhVar5.qK;
                cogw cogwVar = (cogw) eyikVar.b();
                egyt egytVar = (egyt) ahknVar7.dj.b();
                eosc eoscVar = (eosc) ahknVar7.p.b();
                eosc eoscVar2 = (eosc) ahknVar7.y.b();
                eosc eoscVar3 = (eosc) ahknVar7.aJ.b();
                Set setRB = ahnhVar5.rB();
                ahknVar7.bC();
                return new aurx(eyikVar2, cogwVar, egytVar, eoscVar, eoscVar2, eoscVar3, setRB, (egzh) ahknVar7.aQ.b(), ahnhVar5.qq, (aush) ahknVar7.oX.b(), ahnhVar5.aW(), ahnhVar5.afh, (apqc) ahnhVar5.afi.b(), (AtomicReference) ahnhVar5.NX.b(), (aqee) ahnhVar5.NW.b());
            case 848:
                return new cmgk(this.a.a.kr());
            case 849:
                return new byev(this.a.a.tt);
            case 850:
                return bsrl.a(this.a.a.ri());
            case 851:
                return aytb.a((bxhg) this.a.a.Ks.b());
            case 852:
                return new bxhg(this.a.a.ed());
            case 853:
                ahkn ahknVar8 = this.a;
                eyik eyikVar3 = ahknVar8.t;
                ahnh ahnhVar6 = ahknVar8.a;
                return new axif(eyikVar3, ahknVar8.aN, ahnhVar6.c, ahknVar8.cB, ahnhVar6.aer, ahnhVar6.aex, ahnhVar6.wc, ahnhVar6.qz, eyii.a());
            case 854:
                ahnh ahnhVar7 = this.a.a;
                return ekhx.r(ahnhVar7.eC(), ahnhVar7.eD());
            case 855:
                ahkn ahknVar9 = this.a;
                Context context = (Context) ahknVar9.t.b();
                ahnh ahnhVar8 = ahknVar9.a;
                return new cgkb(context, ahnhVar8.pd, ahnhVar8.pe, ahnhVar8.aeq);
            case 856:
                ahkn ahknVar10 = this.a;
                Context context2 = (Context) ahknVar10.t.b();
                ahnh ahnhVar9 = ahknVar10.a;
                return new cqzr(context2, eyie.a(ahknVar10.cC), eyie.a(ahnhVar9.oU), ahknVar10.aT, ahnhVar9.c, eyie.a(ahknVar10.bI));
            case 857:
                return Optional.of((aavl) this.a.a.pc.b());
            case 858:
                ahkn ahknVar11 = this.a;
                cogw cogwVar2 = (cogw) ahknVar11.cD.b();
                crqv crqvVar = (crqv) ahknVar11.aT.b();
                ahnh ahnhVar10 = ahknVar11.a;
                return new aavl(cogwVar2, crqvVar, ahnhVar10.qA(), ahnhVar10.ig(), ahnhVar10.pb, ahknVar11.cE);
            case 859:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar11 = ahknVar12.a;
                return aine.a(ahknVar12.aN, ahnhVar11.pa, ahnhVar11.c);
            case 860:
                ahnh ahnhVar12 = this.a.a;
                return ainb.a((dbzq) ahnhVar12.oY.b(), (ainw) ahnhVar12.oW.b(), (aior) ahnhVar12.oZ.b());
            case 861:
                ahkn ahknVar13 = this.a;
                return aini.a(ahknVar13.eZ(), (aimy) ahknVar13.a.oX.b());
            case 862:
                ahkn ahknVar14 = this.a;
                return ainc.a((ainw) ahknVar14.a.oW.b(), (eosd) ahknVar14.y.b(), (eosd) ahknVar14.aJ.b());
            case 863:
                ahkn ahknVar15 = this.a;
                return aing.a((ainw) ahknVar15.a.oW.b(), ahknVar15.eZ());
            case 864:
                final eyik eyikVar4 = this.a.a.oO;
                return new arpu() { // from class: arpn
                    @Override // defpackage.arpu
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.remove_translated_channel_id");
                    }
                };
            case 865:
                ahkn ahknVar16 = this.a;
                cglf cglfVar = cglf.NT_INCOMING_MESSAGE;
                ahnh ahnhVar13 = ahknVar16.a;
                return ekgp.p(cglfVar, (cgiw) ahnhVar13.Jj.b(), cglf.NT_SAFETYCORE_MISSING, ahnhVar13.lF(), cglf.NT_SECONDARY_USER, ahnhVar13.ir(), cglf.NT_SHARE_PDU, (cgiw) ahknVar16.oH.b(), cglf.NT_INCOMING_UNAPPROVED_MESSAGE, ahnhVar13.is());
            case 866:
                ahkn ahknVar17 = this.a;
                Context context3 = (Context) ahknVar17.t.b();
                eosc eoscVar4 = (eosc) ahknVar17.p.b();
                eyik eyikVar5 = ahknVar17.aJ;
                eosc eoscVar5 = (eosc) eyikVar5.b();
                eosd eosdVar = (eosd) eyikVar5.b();
                ahnh ahnhVar14 = ahknVar17.a;
                return new cgob(context3, eoscVar4, eoscVar5, eosdVar, ahnhVar14.io(), ahnhVar14.im(), ahnhVar14.ip(), (cgoq) ahnhVar14.WC.b(), ahknVar17.cd(), (avmp) ahnhVar14.Jm.b(), (Optional) ahnhVar14.qI.b(), ahnhVar14.aaJ, (cogw) ahknVar17.cD.b(), (cgoh) ahnhVar14.ael.b(), (cgql) ahknVar17.lx.b(), ahnhVar14.iq(), ahnhVar14.in(), (Optional) ahnhVar14.oU.b(), ahnhVar14.Jd, Optional.empty(), (cgkj) ahnhVar14.Ji.b(), Optional.of(ahknVar17.oE), ahnhVar14.pQ, ahnhVar14.aeo, ahnhVar14.sL);
            case 867:
                ahnh ahnhVar15 = this.a.a;
                return new cgph(eyie.a(ahnhVar15.pE), eyie.a(ahnhVar15.pK));
            case 868:
                ahkn ahknVar18 = this.a;
                Context context4 = (Context) ahknVar18.t.b();
                ahnh ahnhVar16 = ahknVar18.a;
                eygg eyggVarA = eyie.a(ahnhVar16.pg);
                eyie.a(ahnhVar16.c);
                return new cmvy(context4, eyggVarA, eyie.a(ahnhVar16.pC), ahnhVar16.pA, ahknVar18.cL, ahnhVar16.pD);
            case 869:
                return new crnf(this.a.a.pf);
            case 870:
                ahkn ahknVar19 = this.a;
                return new alwh(eyie.a(ahknVar19.a.pB), eyie.a(ahknVar19.cK));
            case 871:
                ahkn ahknVar20 = this.a;
                Context context5 = (Context) ahknVar20.t.b();
                ahnh ahnhVar17 = ahknVar20.a;
                eyik eyikVar6 = ahnhVar17.ph;
                eyik eyikVar7 = ahnhVar17.pf;
                crnf crnfVar = (crnf) ahnhVar17.pg.b();
                eygg eyggVarA2 = eyie.a(ahnhVar17.pA);
                return crnq.a(context5, eyikVar6, eyikVar7, ahknVar20.cH, crnfVar, ahknVar20.cI, eyggVarA2);
            case 872:
                return crni.a(this.a.a.pz);
            case 873:
                ahkn ahknVar21 = this.a;
                return new epht((Context) ahknVar21.t.b(), (ephl) ahknVar21.a.py.b());
            case 874:
                return ally.a(this.a.a.rA());
            case 875:
                return new apzl() { // from class: apia
                };
            case 876:
                return new apzm() { // from class: apic
                };
            case 877:
                final eyik eyikVar8 = this.a.a.oO;
                return new arso() { // from class: arru
                    @Override // defpackage.arso
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.messaging_identity_passes_parsed_data");
                    }
                };
            case 878:
                final eyik eyikVar9 = this.a.a.oO;
                return new aquo() { // from class: aquc
                    @Override // defpackage.aquo
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.enable_emergency_rcs_messaging");
                    }
                };
            case 879:
                final eyik eyikVar10 = this.a.a.oO;
                return new aqup() { // from class: aque
                    @Override // defpackage.aqup
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.enable_emergency_rcs_over_airplane_mode");
                    }
                };
            case 880:
                final eyik eyikVar11 = this.a.a.oO;
                return new aqus() { // from class: aquk
                    @Override // defpackage.aqus
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_subscription_utils_refactoring");
                    }
                };
            case 881:
                return fanc.a(this.a.a.od());
            case 882:
                final eyik eyikVar12 = this.a.a.oO;
                return new arsl() { // from class: arro
                    @Override // defpackage.arsl
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.messaging_identity_detailed_types");
                    }
                };
            case 883:
                final eyik eyikVar13 = this.a.a.oO;
                return new arsp() { // from class: arrw
                    @Override // defpackage.arsp
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.messaging_identity_unified_parse");
                    }
                };
            case 884:
                final eyik eyikVar14 = this.a.a.oO;
                return new arsv() { // from class: arsi
                    @Override // defpackage.arsv
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.sanitize_without_parse");
                    }
                };
            case 885:
                final eyik eyikVar15 = this.a.a.oO;
                return new arsm() { // from class: arrq
                    @Override // defpackage.arsm
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.messaging_identity_fills_parsed_data");
                    }
                };
            case 886:
                final eyik eyikVar16 = this.a.a.oO;
                return new arsr() { // from class: arsa
                    @Override // defpackage.arsr
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.mi_display_uses_preparsed_data");
                    }
                };
            case 887:
                final eyik eyikVar17 = this.a.a.oO;
                return new arst() { // from class: arse
                    @Override // defpackage.arst
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.mi_normalized_uses_preparsed_data");
                    }
                };
            case 888:
                final eyik eyikVar18 = this.a.a.oO;
                return new arsu() { // from class: arsg
                    @Override // defpackage.arsu
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.mi_serialized_uses_preparsed_data");
                    }
                };
            case 889:
                final eyik eyikVar19 = this.a.a.oO;
                return new arss() { // from class: arsc
                    @Override // defpackage.arss
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.mi_international_uses_preparsed_data");
                    }
                };
            case 890:
                final eyik eyikVar20 = this.a.a.oO;
                return new arsq() { // from class: arry
                    @Override // defpackage.arsq
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.mi_chat_endpoint_uses_preparsed_data");
                    }
                };
            case 891:
                return Boolean.valueOf(fapy.a(this.a.a.os()));
            case 892:
                ahnh ahnhVar18 = this.a.a;
                return new csme((fdjx) ahnhVar18.oQ.b(), ahnhVar18.pH, ahnhVar18.pJ);
            case 893:
                ahnh ahnhVar19 = this.a.a;
                return new csmx((fdjx) ahnhVar19.oS.b(), ahnhVar19.pF, ahnhVar19.pG);
            case 894:
                ahkn ahknVar22 = this.a;
                return csmr.a((Context) ahknVar22.t.b(), (fdjx) ahknVar22.a.oQ.b());
            case 895:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar20 = ahknVar23.a;
                return new csmm((egej) ahnhVar20.pI.b(), ahknVar23.dj(), (awgx) ahknVar23.cN.b(), (fcyh) ahknVar23.cA.b(), (fdjx) ahnhVar20.oS.b());
            case 896:
                ahkn ahknVar24 = this.a;
                return new egej(ejwi.j((egcd) ahknVar24.a.l.b()), ejwi.j(egfi.a()), (ejwi) ahknVar24.cM.b());
            case 897:
                ahnh ahnhVar21 = this.a.a;
                return also.a(ahnhVar21.qd, ahnhVar21.qf, ahnhVar21.qh);
            case 898:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar22 = ahknVar25.a;
                return new alsn(eyie.a(ahnhVar22.pC), eyie.a(ahnhVar22.pB), ahnhVar22.pM, ahnhVar22.pf, ahnhVar22.pR, ahnhVar22.pT, ahnhVar22.pY, eyie.a(ahnhVar22.pZ), ahnhVar22.qa, ahnhVar22.pX, ahnhVar22.qb, ahknVar25.cK, eyie.a(ahnhVar22.qc), ahnhVar22.pk);
            case 899:
                return new crnb((crnf) this.a.a.pg.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object J() {
        int i = this.b;
        switch (i) {
            case 900:
                ahkn ahknVar = this.a;
                return new chvg((Context) ahknVar.t.b(), ahknVar.aT, ahknVar.a.jb());
            case 901:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar = ahknVar2.a;
                return aina.a(ahknVar2.aN, ahnhVar.pP, ahnhVar.c);
            case 902:
                ahnh ahnhVar2 = this.a.a;
                return aind.a((dbzq) ahnhVar2.pN.b(), (ainw) ahnhVar2.oW.b(), (aior) ahnhVar2.pO.b());
            case 903:
                ahkn ahknVar3 = this.a;
                return ainh.a(ahknVar3.eZ(), (aimy) ahknVar3.a.oX.b());
            case 904:
                ahkn ahknVar4 = this.a;
                return ainf.a((ainw) ahknVar4.a.oW.b(), ahknVar4.eZ());
            case 905:
                ahnh ahnhVar3 = this.a.a;
                return new asqx((crmx) ahnhVar3.pB.b(), (ccvz) ahnhVar3.pS.b());
            case 906:
                ahnh ahnhVar4 = this.a.a;
                return new ccwf(ahnhVar4.py, ahnhVar4.pB, ahnhVar4.pf);
            case 907:
                ahnh ahnhVar5 = this.a.a;
                return new alhy(eyie.a(ahnhVar5.pC), eyie.a(ahnhVar5.pT), eyie.a(ahnhVar5.pB), eyie.a(ahnhVar5.pM), eyie.a(ahnhVar5.pX));
            case 908:
                ahnh ahnhVar6 = this.a.a;
                return new alql(eyil.a(ahnhVar6.pW), ahnhVar6.pB, ahnhVar6.pS);
            case 909:
                ahkn ahknVar5 = this.a;
                Context context = (Context) ahknVar5.t.b();
                ahnh ahnhVar7 = ahknVar5.a;
                return new alri(context, eyie.a(ahnhVar7.pV), eyie.a(ahnhVar7.pf), eyie.a(ahnhVar7.pA), eyie.a(ahnhVar7.pM), eyie.a(ahnhVar7.pB));
            case 910:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar8 = ahknVar6.a;
                return new awci(ahnhVar8.pM, ahknVar6.cP, ahknVar6.cQ, ahknVar6.cS, ahnhVar8.pA, ahnhVar8.pU, ahknVar6.cT);
            case 911:
                return new dfit(this.a.a.oO);
            case 912:
                ahnh ahnhVar9 = this.a.a;
                return new allt(eyie.a(ahnhVar9.pC), eyie.a(ahnhVar9.pT), eyie.a(ahnhVar9.pB), eyie.a(ahnhVar9.pM), eyie.a(ahnhVar9.pX), eyie.a(ahnhVar9.pS), eyie.a(ahnhVar9.py));
            case 913:
                final eyik eyikVar = this.a.a.oO;
                return new aqbh() { // from class: aplb
                    @Override // defpackage.aqbh
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_emergency_satellite_messaging");
                    }
                };
            case 914:
                final eyik eyikVar2 = this.a.a.oO;
                return new apzk() { // from class: aphy
                    @Override // defpackage.apzk
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.messaging_identity_from_recipient_entry_uses_contact_country");
                    }
                };
            case 915:
                final eyik eyikVar3 = this.a.a.oO;
                return new arsn() { // from class: arrs
                    @Override // defpackage.arsn
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.messaging_identity_for_sub_uses_home");
                    }
                };
            case 916:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar10 = ahknVar7.a;
                return new altr(eyie.a(ahnhVar10.pC), eyie.a(ahnhVar10.pB), eyie.a(ahknVar7.cK), eyie.a(ahnhVar10.pM), eyie.a(ahnhVar10.pf), eyie.a(ahnhVar10.pR), eyie.a(ahnhVar10.pT), eyie.a(ahnhVar10.qe), eyie.a(ahnhVar10.qa), eyie.a(ahnhVar10.pX), eyie.a(ahnhVar10.qc));
            case 917:
                ahnh ahnhVar11 = this.a.a;
                return new alnz(eyie.a(ahnhVar11.pC), eyie.a(ahnhVar11.pB), eyie.a(ahnhVar11.pA), eyie.a(ahnhVar11.pT), eyie.a(ahnhVar11.pM), eyie.a(ahnhVar11.pX), eyie.a(ahnhVar11.py));
            case 918:
                ahnh ahnhVar12 = this.a.a;
                return new alug(eyie.a(ahnhVar12.qg), eyie.a(ahnhVar12.qd), eyie.a(ahnhVar12.qf));
            case 919:
                ahkn ahknVar8 = this.a;
                Context context2 = (Context) ahknVar8.t.b();
                ahnh ahnhVar13 = ahknVar8.a;
                eygg eyggVarA = eyie.a(ahnhVar13.pY);
                eygg eyggVarA2 = eyie.a(ahnhVar13.qe);
                eygg eyggVarA3 = eyie.a(ahnhVar13.pV);
                eygg eyggVarA4 = eyie.a(ahnhVar13.pf);
                eygg eyggVarA5 = eyie.a(ahnhVar13.pA);
                eygg eyggVarA6 = eyie.a(ahnhVar13.pM);
                eygg eyggVarA7 = eyie.a(ahnhVar13.pB);
                eygg eyggVarA8 = eyie.a(ahnhVar13.pX);
                eyie.a(ahnhVar13.py);
                return allx.a(context2, eyggVarA, eyggVarA2, eyggVarA3, eyggVarA4, eyggVarA5, eyggVarA6, eyggVarA7, eyggVarA8);
            case 920:
                ahkn ahknVar9 = this.a;
                Context context3 = (Context) ahknVar9.t.b();
                ahnh ahnhVar14 = ahknVar9.a;
                return new cpbr(context3, ahnhVar14.qj, ahknVar9.cU, ahnhVar14.qk, Optional.empty(), ahnhVar14.qi, ahnhVar14.qa, ahknVar9.cW, ahnhVar14.qm, ahknVar9.cY, ahnhVar14.qn);
            case 921:
                ahkn ahknVar10 = this.a;
                return new crlw((Context) ahknVar10.t.b(), (cpch) ahknVar10.a.qj.b(), (aidr) ahknVar10.cV.b());
            case 922:
                return new cogv(this.a.a.ql);
            case 923:
                return Long.valueOf(fawo.a(this.a.a.pb()));
            case 924:
                ahkn ahknVar11 = this.a;
                return new cpbx(ahknVar11.cX, (cogv) ahknVar11.a.qm.b());
            case 925:
                ahnh ahnhVar15 = this.a.a;
                return new bbdl(ahnhVar15.qC, ahnhVar15.aeh);
            case 926:
                ahnh ahnhVar16 = this.a.a;
                return new axfu(ahnhVar16.qp, ahnhVar16.pf, ahnhVar16.qq, ahnhVar16.qs, ahnhVar16.qi, ahnhVar16.qx, (axjq) ahnhVar16.qz.b(), ahnhVar16.qA, ahnhVar16.qB);
            case 927:
                final eyik eyikVar4 = this.a.a.oO;
                return new aqrz() { // from class: aqph
                    @Override // defpackage.aqrz
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.dsdr_fix_default_sub_id_in_subscriptions_tracker");
                    }
                };
            case 928:
                ahkn ahknVar12 = this.a;
                return new bbdg(ahknVar12.a.qr, (eosc) ahknVar12.y.b());
            case 929:
                ahnh ahnhVar17 = this.a.a;
                return new bbce(ahnhVar17.qw, ahnhVar17.qq);
            case 930:
                ahkn ahknVar13 = this.a;
                eyik eyikVar5 = ahknVar13.cD;
                ahnh ahnhVar18 = ahknVar13.a;
                return new bbdd(ahnhVar18.pf, ahnhVar18.qu, ahnhVar18.qv, (cogw) eyikVar5.b());
            case 931:
                ahnh ahnhVar19 = this.a.a;
                return new bbdc(ahnhVar19.pf, ahnhVar19.qt);
            case 932:
                return Optional.of((crmu) this.a.a.ph.b());
            case 933:
                return new apzx() { // from class: apir
                };
            case 934:
                ahnh ahnhVar20 = this.a.a;
                return new axjq(ahnhVar20.qq, ahnhVar20.qy, ahnhVar20.cq());
            case 935:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar21 = ahknVar14.a;
                return new axcl((dqsn) ahnhVar21.qq.b(), ahnhVar21.qi, (fcyh) ahknVar14.cA.b(), ahnhVar21.cj());
            case 936:
                return new ahky(this);
            case 937:
                return new ahlj(this);
            case 938:
                ahnh ahnhVar22 = this.a.a;
                return new awvk(ahnhVar22.qC, ahnhVar22.zj);
            case 939:
                ahkn ahknVar15 = this.a;
                Context context4 = (Context) ahknVar15.t.b();
                ahnh ahnhVar23 = ahknVar15.a;
                return new cqiz(context4, ahknVar15.da, ahnhVar23.qN, ahnhVar23.aeg, ahnhVar23.qi, ahnhVar23.aaR);
            case 940:
                ahkn ahknVar16 = this.a;
                return cdev.a(ahknVar16.a.ht(), (eosc) ahknVar16.aJ.b());
            case 941:
                return agjp.a(this.a.a.Q());
            case 942:
                ahkn ahknVar17 = this.a;
                return new cgbj((Context) ahknVar17.t.b(), ahknVar17.aT, ahknVar17.a.pd);
            case 943:
                ahnh ahnhVar24 = this.a.a;
                return new cgbl(ahnhVar24.aba, ahnhVar24.abb, ahnhVar24.abc, ahnhVar24.abd, ahnhVar24.adz, ahnhVar24.adJ, ahnhVar24.adK, ahnhVar24.adL, ahnhVar24.adM, ahnhVar24.adQ, ahnhVar24.adR, ahnhVar24.adS, ahnhVar24.adT, ahnhVar24.adU, ahnhVar24.adV, ahnhVar24.adW, ahnhVar24.adX, ahnhVar24.adY);
            case 944:
                ahkn ahknVar18 = this.a;
                Context context5 = (Context) ahknVar18.t.b();
                ahnh ahnhVar25 = ahknVar18.a;
                return new cged(context5, (cgei) ahnhVar25.qF.b(), (cgdc) ahnhVar25.aaZ.b());
            case 945:
                return new cgei(this.a.a.qE);
            case 946:
                return new cgaz(this.a.a.pd);
            case 947:
                return new agjn();
            case 948:
                ahkn ahknVar19 = this.a;
                cpiz cpizVar = (cpiz) ahknVar19.de.b();
                ahnh ahnhVar26 = ahknVar19.a;
                dakl daklVar = (dakl) ahnhVar26.BK.b();
                srw srwVar = (srw) ahnhVar26.aaX.b();
                Optional optionalOf = Optional.of(new czqe());
                ahnhVar26.an();
                return new cujy(cpizVar, daklVar, srwVar, optionalOf, ahknVar19.cx(), (crny) ahnhVar26.pf.b(), (cjsd) ahnhVar26.aaY.b(), ahknVar19.od);
            case 949:
                ahkn ahknVar20 = this.a;
                return new dakl((Context) ahknVar20.t.b(), ahknVar20.a.aaW);
            case 950:
                ahkn ahknVar21 = this.a;
                return new dain((Context) ahknVar21.t.b(), ahknVar21.a.aaV);
            case 951:
                return Optional.of((aidl) this.a.a.aaU.b());
            case 952:
                ahkn ahknVar22 = this.a;
                Context context6 = (Context) ahknVar22.t.b();
                ahnh ahnhVar27 = ahknVar22.a;
                return new aidl(context6, ahknVar22.df, ahnhVar27.pf, ahnhVar27.qi, ahnhVar27.wK, (fdjx) ahnhVar27.oS.b(), ahknVar22.lM, (arjk) ahnhVar27.KW.b());
            case 953:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar28 = ahknVar23.a;
                return new bxjt(ahnhVar28.TZ, ahnhVar28.sL, (bxko) ahnhVar28.aaQ.b(), ahnhVar28.uI, ahnhVar28.KX, ahnhVar28.vh, ahnhVar28.Ad, Optional.of(ahnhVar28.wt), Optional.of(ahnhVar28.Ac), ahknVar23.nw, ahnhVar28.aaS, ahnhVar28.aaT, ahnhVar28.Aw, ahnhVar28.bv(), ahnhVar28.Ao, ahnhVar28.pQ);
            case 954:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar29 = ahknVar24.a;
                eyik eyikVar6 = ahnhVar29.sL;
                bxko bxkoVar = (bxko) ahnhVar29.aaQ.b();
                eyik eyikVar7 = ahnhVar29.zj;
                Context context7 = (Context) ahknVar24.t.b();
                eyik eyikVar8 = ahnhVar29.uI;
                eyik eyikVar9 = ahnhVar29.qG;
                dqsn dqsnVar = (dqsn) ahnhVar29.qq.b();
                eyik eyikVar10 = ahknVar24.aJ;
                eyik eyikVar11 = ahnhVar29.qs;
                eyik eyikVar12 = ahnhVar29.Ar;
                eyik eyikVar13 = ahnhVar29.qr;
                eyik eyikVar14 = ahnhVar29.qi;
                eyik eyikVar15 = ahnhVar29.Ab;
                eyik eyikVar16 = ahnhVar29.qx;
                eyik eyikVar17 = ahnhVar29.zM;
                eyik eyikVar18 = ahnhVar29.c;
                eyik eyikVar19 = ahnhVar29.qv;
                eyik eyikVar20 = ahnhVar29.aaR;
                eyik eyikVar21 = ahnhVar29.zN;
                eyik eyikVar22 = ahnhVar29.pf;
                eyik eyikVar23 = ahnhVar29.Jx;
                eyik eyikVar24 = ahnhVar29.yD;
                eosc eoscVar = (eosc) eyikVar10.b();
                return new bxkp(eyikVar6, bxkoVar, eyikVar7, context7, eyikVar8, ahknVar24.da, eyikVar9, dqsnVar, eyikVar11, eyikVar12, eyikVar13, ahknVar24.ob, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eoscVar, ahknVar24.ij);
            case 955:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar30 = ahknVar25.a;
                eyik eyikVar25 = ahnhVar30.qG;
                Optional optionalOf2 = Optional.of(ahnhVar30.qH);
                eyik eyikVar26 = ahnhVar30.c;
                eyik eyikVar27 = ahnhVar30.pQ;
                eyik eyikVar28 = ahnhVar30.aaM;
                eyik eyikVar29 = ahnhVar30.uI;
                eyik eyikVar30 = ahnhVar30.qo;
                eyik eyikVar31 = ahnhVar30.so;
                dqsn dqsnVar2 = (dqsn) ahnhVar30.qq.b();
                eyik eyikVar32 = ahknVar25.cD;
                eyik eyikVar33 = ahnhVar30.zP;
                eyik eyikVar34 = ahknVar25.eL;
                cogw cogwVar = (cogw) eyikVar32.b();
                eyik eyikVar35 = ahnhVar30.QL;
                eyik eyikVar36 = ahnhVar30.vh;
                eyik eyikVar37 = ahnhVar30.qi;
                eyik eyikVar38 = ahnhVar30.pB;
                eyik eyikVar39 = ahnhVar30.AM;
                eyik eyikVar40 = ahnhVar30.XL;
                eyik eyikVar41 = ahnhVar30.pT;
                eyik eyikVar42 = ahnhVar30.aaN;
                eyik eyikVar43 = ahnhVar30.aaP;
                eyik eyikVar44 = ahnhVar30.pV;
                eyik eyikVar45 = ahnhVar30.qa;
                eyik eyikVar46 = ahnhVar30.Gu;
                eyik eyikVar47 = ahnhVar30.pl;
                eyik eyikVar48 = ahnhVar30.Bg;
                aqhc aqhcVar = (aqhc) eyikVar35.b();
                return new bapj(eyikVar25, optionalOf2, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, dqsnVar2, eyikVar33, eyikVar34, cogwVar, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, eyikVar42, eyikVar43, eyikVar44, eyikVar45, ahnhVar30.SQ, eyikVar46, eyikVar47, ahnhVar30.Th, ahnhVar30.Tn, eyikVar48, aqhcVar);
            case 956:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar31 = ahknVar26.a;
                eyik eyikVar49 = ahnhVar31.qJ;
                eyik eyikVar50 = ahnhVar31.uP;
                eyik eyikVar51 = ahnhVar31.xh;
                Context context8 = (Context) ahknVar26.t.b();
                eyik eyikVar52 = ahknVar26.cD;
                return new damh(eyikVar49, eyikVar50, eyikVar51, context8, ahnhVar31.uo, (cogw) eyikVar52.b(), ahnhVar31.qj, ahnhVar31.aaJ, (eosc) ahknVar26.aJ.b(), (eosc) ahknVar26.y.b(), (eosd) ahknVar26.p.b(), Optional.empty(), ahnhVar31.Jl, (crsx) ahnhVar31.aaK.b(), ahnhVar31.aaL, ahnhVar31.pl);
            case 957:
                ahkn ahknVar27 = this.a;
                return new axzj(ahknVar27.t, ahknVar27.a.qI, ahknVar27.dg, ahknVar27.p, ahknVar27.y);
            case 958:
                return Optional.of((cqdn) this.a.a.qH.b());
            case 959:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar32 = ahknVar28.a;
                eyik eyikVar53 = ahnhVar32.qk;
                eyik eyikVar54 = ahnhVar32.sk;
                cqbm cqbmVar = (cqbm) ahnhVar32.rY.b();
                cjpo cjpoVar = (cjpo) ahnhVar32.yr.b();
                eyik eyikVar55 = ahnhVar32.qi;
                awij awijVar = (awij) ahnhVar32.yc.b();
                eyik eyikVar56 = ahnhVar32.qG;
                eyik eyikVar57 = ahnhVar32.sh;
                eyik eyikVar58 = ahnhVar32.qa;
                eyik eyikVar59 = ahnhVar32.pl;
                eyik eyikVar60 = ahnhVar32.aaH;
                return new badt(eyikVar53, eyikVar54, cqbmVar, cjpoVar, eyikVar55, awijVar, eyikVar56, eyikVar57, eyikVar58, eyikVar59, eyikVar60, (Context) ahknVar28.t.b());
            case 960:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar33 = ahknVar29.a;
                return new bwdb(ahnhVar33.qL, ahnhVar33.tJ, ahnhVar33.EN, ahnhVar33.tw, (ains) ahnhVar33.c.b(), ahnhVar33.qr, ahknVar29.eh, ahnhVar33.tl, ahnhVar33.EO, ahnhVar33.pT, ahnhVar33.Tf, ahnhVar33.aaG, (eosc) ahknVar29.p.b(), (eosc) ahknVar29.y.b(), eyie.a(ahnhVar33.ts));
            case 961:
                return new bwrx(this.a.a.qK);
            case 962:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar34 = ahknVar30.a;
                return new cejj(ahnhVar34.qM, (cejk) ahnhVar34.Xu.b(), ahnhVar34.sh, (eosc) ahknVar30.p.b(), (eosc) ahknVar30.aJ.b());
            case 963:
                ahnh ahnhVar35 = this.a.a;
                return new cfep(ahnhVar35.pB, ahnhVar35.pb);
            case 964:
                ahkn ahknVar31 = this.a;
                eyik eyikVar61 = ahknVar31.y;
                eyik eyikVar62 = ahknVar31.p;
                ahnh ahnhVar36 = ahknVar31.a;
                return new cejk(eyikVar61, eyikVar62, eyikVar62, ahnhVar36.tc, ahnhVar36.tf, ahknVar31.cD, ahnhVar36.Xq, ahnhVar36.aaC, ahnhVar36.aaD, ahnhVar36.tq, ahnhVar36.tp, ahnhVar36.pf, ahnhVar36.pB, ahnhVar36.sh, ahnhVar36.aaE, ahknVar31.aJ, ahknVar31.es, ahknVar31.oa, ahnhVar36.xR);
            case 965:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar37 = ahknVar32.a;
                return new cezv(ahknVar32.dh, (cepf) ahnhVar37.FZ.b(), (cepf) ahnhVar37.Ga.b(), Optional.of((ceqe) ahnhVar37.aao.b()), (cepr) ahnhVar37.aap.b(), (cepv) ahnhVar37.aaq.b(), (cepv) ahnhVar37.aar.b(), ahnhVar37.aas, ahnhVar37.aaz);
            case 966:
                return new cepk(this.a.a.hJ());
            case 967:
                ahkn ahknVar33 = this.a;
                Context context9 = (Context) ahknVar33.t.b();
                eyik eyikVar63 = ahknVar33.aJ;
                ahnh ahnhVar38 = ahknVar33.a;
                return new cepb(context9, ahnhVar38.xI, (eosc) eyikVar63.b(), ahnhVar38.id(), ahnhVar38.c, (aghv) ahnhVar38.xl.b());
            case 968:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar39 = ahknVar34.a;
                return new ckif(ahnhVar39.WZ, ahknVar34.aP, (dgia) ahnhVar39.rW.b());
            case 969:
                ahnh ahnhVar40 = this.a.a;
                return ckhf.a(ahnhVar40.md(), ahnhVar40.jG(), (awzf) ahnhVar40.sI.b(), (awyu) ahnhVar40.qB.b(), (fdjx) ahnhVar40.m.b());
            case 970:
                ahnh ahnhVar41 = this.a.a;
                return ekhx.t(ahnhVar41.cL(), (dggy) ahnhVar41.rk.b(), ahnhVar41.hm(), ahnhVar41.ql());
            case 971:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar42 = ahknVar35.a;
                csve csveVar = (csve) ahnhVar42.qO.b();
                cssx cssxVar = (cssx) ahnhVar42.qP.b();
                ceru ceruVarHM = ahnhVar42.hM();
                cswj cswjVar = (cswj) ahnhVar42.qS.b();
                eyik eyikVar64 = ahknVar35.cD;
                eyik eyikVar65 = ahnhVar42.qU;
                return new csuc(csveVar, cssxVar, ceruVarHM, cswjVar, eyikVar65, (eosc) ahknVar35.p.b(), (eosc) ahknVar35.y.b(), (ains) ahnhVar42.c.b(), ahnhVar42.qi);
            case 972:
                ahkn ahknVar36 = this.a;
                eyik eyikVar66 = ahknVar36.di;
                ahnh ahnhVar43 = ahknVar36.a;
                eyik eyikVar67 = ahnhVar43.qK;
                ecjh ecjhVar = (ecjh) eyikVar66.b();
                cogw cogwVar2 = (cogw) ahknVar36.cD.b();
                ains ainsVar = (ains) ahnhVar43.c.b();
                return new csve(eyikVar67, ecjhVar, cogwVar2, ainsVar, (cden) ahnhVar43.qN.b(), (eosc) ahknVar36.p.b());
            case 973:
                ahkn ahknVar37 = this.a;
                crqv crqvVar = (crqv) ahknVar37.aT.b();
                Context context10 = (Context) ahknVar37.t.b();
                Optional optional = (Optional) ahknVar37.dn.b();
                ahnh ahnhVar44 = ahknVar37.a;
                csve csveVar2 = (csve) ahnhVar44.qO.b();
                return new csta(crqvVar, context10, optional, csveVar2);
            case 974:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar45 = ahknVar38.a;
                return cswk.a((csve) ahnhVar45.qO.b(), ahnhVar45.qR.b(), (eosc) ahknVar38.y.b());
            case 975:
                ahkn ahknVar39 = this.a;
                return new csvt((eosc) ahknVar39.y.b(), (eosc) ahknVar39.p.b(), (Context) ahknVar39.t.b(), (cogw) ahknVar39.cD.b(), (cden) ahknVar39.a.qN.b());
            case 976:
                ahkn ahknVar40 = this.a;
                return new cstb();
            case 977:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar46 = ahknVar41.a;
                cswj cswjVar2 = (cswj) ahnhVar46.qS.b();
                eyik eyikVar68 = ahknVar41.cD;
                ceru ceruVarHM2 = ahnhVar46.hM();
                return new cstk(cswjVar2, ceruVarHM2, (Context) ahknVar41.t.b(), (eosc) ahknVar41.y.b(), (eosc) ahknVar41.p.b());
            case 978:
                ahnh ahnhVar47 = this.a.a;
                return new cqej((crmx) ahnhVar47.pB.b(), (alrj) ahnhVar47.qi.b());
            case 979:
                return new aspp(this.a.a.qK);
            case 980:
                ahkn ahknVar42 = this.a;
                Context context11 = (Context) ahknVar42.t.b();
                ahnh ahnhVar48 = ahknVar42.a;
                return new cmll(context11, (fdjx) ahnhVar48.oS.b(), ahnhVar48.pf, (cmjk) ahknVar42.f3do.b(), ahnhVar48.rf, ahnhVar48.rg, ahknVar42.dr, ahnhVar48.re, ahnhVar48.rh, (apwv) ahnhVar48.ri.b(), ahnhVar48.rj, ahknVar42.da);
            case 981:
                ahkn ahknVar43 = this.a;
                return new cmjy((dhes) ahknVar43.aP.b(), ahknVar43.a.re);
            case 982:
                ahnh ahnhVar49 = this.a.a;
                return new cmls(ahnhVar49.qr, ahnhVar49.rc, (cmlb) ahnhVar49.rd.b());
            case 983:
                ahkn ahknVar44 = this.a;
                Object objEZ = ahknVar44.eZ();
                Context context12 = (Context) ahknVar44.t.b();
                ejxr ejxrVar = (ejxr) ahknVar44.dp.b();
                cogw cogwVar3 = (cogw) ahknVar44.cD.b();
                ahnh ahnhVar50 = ahknVar44.a;
                return aimp.a(objEZ, context12, ejxrVar, cogwVar3, ahnhVar50.qY, (aipj) ahnhVar50.rb.b(), (Executor) ahknVar44.p.b());
            case 984:
                ahkn ahknVar45 = this.a;
                return new aisn((fdjx) ahknVar45.a.oS.b(), (fcyh) ahknVar45.cA.b(), (dejx) ahknVar45.dq.b());
            case 985:
                ahkn ahknVar46 = this.a;
                cogw cogwVar4 = (cogw) ahknVar46.cD.b();
                ahnh ahnhVar51 = ahknVar46.a;
                return new aipj(cogwVar4, ahnhVar51.qZ, ahnhVar51.ra);
            case 986:
                return fapu.a(this.a.a.or());
            case 987:
                final eyik eyikVar69 = this.a.a.oO;
                return new aqbq() { // from class: aplq
                    @Override // defpackage.aqbq
                    public final boolean a() {
                        return ((eoth) eyikVar69.b()).a("bugle.enable_sunset_logging");
                    }
                };
            case 988:
                ahkn ahknVar47 = this.a;
                return new cmlm((Context) ahknVar47.t.b(), (crny) ahknVar47.a.pf.b());
            case 989:
                return new apwx() { // from class: apfb
                };
            case 990:
                final eyik eyikVar70 = this.a.a.oO;
                return new apwv() { // from class: apey
                    @Override // defpackage.apwv
                    public final boolean a() {
                        return ((eoth) eyikVar70.b()).a("bugle.enable_multi_sim_rcs");
                    }
                };
            case 991:
                final eyik eyikVar71 = this.a.a.oO;
                return new dfme() { // from class: dfkg
                    @Override // defpackage.dfme
                    public final boolean a() {
                        return ((eoth) eyikVar71.b()).a("cslib.enable_is_sim_loaded_comparison_event");
                    }
                };
            case 992:
                ahnh ahnhVar52 = this.a.a;
                return new cozm(ahnhVar52.qQ(), ahnhVar52.rW, ahnhVar52.pT, (dggl) ahnhVar52.se.b(), ahnhVar52.ZW, ahnhVar52.aaa, (fdjx) ahnhVar52.oS.b());
            case 993:
                ahkn ahknVar48 = this.a;
                eyik eyikVar72 = ahknVar48.ds;
                ahnh ahnhVar53 = ahknVar48.a;
                return new cies(eyikVar72, ahnhVar53.rP(), ahnhVar53.c, ahknVar48.cS(), (eosc) ahknVar48.p.b());
            case 994:
                ahkn ahknVar49 = this.a;
                Context context13 = (Context) ahknVar49.t.b();
                ahnh ahnhVar54 = ahknVar49.a;
                return new cmep(context13, ahnhVar54.mB(), (cmeq) ahnhVar54.ro.b(), (cqbm) ahnhVar54.rY.b(), ahnhVar54.rm, (crma) ahknVar49.da.b(), ahnhVar54.Zw);
            case 995:
                ahkn ahknVar50 = this.a;
                return new aiux(ahknVar50.aN, ahknVar50.a.qr);
            case 996:
                return new asrf(this.a.a.rk);
            case 997:
                return new cmeq(this.a.a.rn);
            case 998:
                final eyik eyikVar73 = this.a.a.oO;
                return new arhb() { // from class: argm
                    @Override // defpackage.arhb
                    public final boolean a() {
                        return ((eoth) eyikVar73.b()).a("bugle.cslib_cleanup_jibe_service_listener");
                    }
                };
            case 999:
                return new cqbo(eyie.a(this.a.a.ZT));
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v53, types: [eggx, java.lang.Object] */
    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                ahkn ahknVar = this.a;
                return new cwyz((Context) ahknVar.t.b(), (cwyy) ahknVar.a.apb.b());
            case 1:
                ahkn ahknVar2 = this.a;
                Context context = (Context) ahknVar2.t.b();
                ahnh ahnhVar = ahknVar2.a;
                return new cwyy(context, new cwyu(ahnhVar.b, (Executor) ahnhVar.a.y.b()), ahknVar2.aM, ahnhVar.c, ahknVar2.p);
            case 2:
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "DarkModeData";
                ehvrVarK.d(cwyq.a);
                ehvs ehvsVarA = ehvrVarK.a();
                ahkn ahknVar3 = this.a;
                return ahknVar3.ev().a(ehvsVarA, (ecev) ahknVar3.aL.b());
            case 3:
                ahkn ahknVar4 = this.a;
                eyik eyikVar = ahknVar4.a.qr;
                int i2 = aimz.a;
                eyikVar.getClass();
                return new aimx(ahknVar4.aN, eyikVar);
            case 4:
                ahkn ahknVar5 = this.a;
                Context context2 = (Context) ahknVar5.t.b();
                eosd eosdVar = (eosd) ahknVar5.y.b();
                cqpz cqpzVar = (cqpz) ahknVar5.aN.b();
                ahnh ahnhVar2 = ahknVar5.a;
                return new aima(context2, eosdVar, cqpzVar, ahnhVar2.oW, (cqcz) ahnhVar2.apa.b(), ahknVar5.aO, (cogw) ahknVar5.cD.b(), (aiul) ahnhVar2.Wv.b(), new dezb((Context) ahnhVar2.a.t.b()), (ailp) ahknVar5.eZ(), ahnhVar2.qY, (aimb) ahnhVar2.rc.b(), (aimb) ahnhVar2.uA.b(), (aimb) ahnhVar2.uz.b());
            case 5:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar3 = ahknVar6.a;
                return new aiop(ahnhVar3.aoZ, ahnhVar3.pf, ahknVar6.cI);
            case 6:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar4 = ahknVar7.a;
                return new aimt(ahknVar7.aS, ahnhVar4.pf, ahknVar7.aO, ahknVar7.cI, ahnhVar4.rd);
            case 7:
                ahkn ahknVar8 = this.a;
                Context context3 = (Context) ahknVar8.t.b();
                ahnh ahnhVar5 = ahknVar8.a;
                eyik eyikVar2 = ahnhVar5.ph;
                eyik eyikVar3 = ahnhVar5.aoO;
                eyik eyikVar4 = ahnhVar5.aoY;
                eyik eyikVar5 = ahnhVar5.pg;
                eyik eyikVar6 = ahnhVar5.pB;
                eyik eyikVar7 = ahnhVar5.LT;
                eyik eyikVar8 = ahnhVar5.qB;
                eyikVar3.getClass();
                eyikVar4.getClass();
                eyikVar5.getClass();
                eyikVar6.getClass();
                eyikVar7.getClass();
                eyikVar8.getClass();
                return crod.a(context3, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8);
            case 8:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar6 = ahknVar9.a;
                return new cpfd(ahknVar9.aU, ahknVar9.aN, ahnhVar6.Ci, ahnhVar6.wI);
            case 9:
                ahnh ahnhVar7 = this.a.a;
                return new cqjy(ahnhVar7.rO, ahnhVar7.aoK, ahnhVar7.wx, eyie.a(ahnhVar7.aoN), (fdjx) ahnhVar7.oQ.b());
            case 10:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar8 = ahknVar10.a;
                return new cqky(ahknVar10.aN, ahknVar10.aT, ahnhVar8.aoI, ahnhVar8.aoJ);
            case 11:
                return Boolean.valueOf(((ehdm) this.a.a.nM().a.b()).a("com.google.android.apps.messaging.auto", "45368814").e());
            case 12:
                ehey eheyVar = (ehey) this.a.a.tK.b();
                eheyVar.getClass();
                return new ehfw(eheyVar);
            case 13:
                ahkn ahknVar11 = this.a;
                ehez ehezVar = (ehez) ahknVar11.br.b();
                ehfn ehfnVar = (ehfn) ahknVar11.bu.b();
                final ehvf ehvfVar = (ehvf) ahknVar11.aK.b();
                eosc eoscVar = (eosc) ahknVar11.aJ.b();
                ahnh ahnhVar9 = ahknVar11.a;
                final eheg ehegVar = (eheg) ahnhVar9.tL.b();
                ekgp ekgpVarN = ekgp.n("com.google.android.apps.messaging.auto", ahnhVar9.aoF, "tiktok.device", ahnhVar9.aoG, "tiktok.directboot", ahnhVar9.aoH);
                final ehgc ehgcVarEr = ahknVar11.er();
                ehezVar.getClass();
                ehfnVar.getClass();
                ehvfVar.getClass();
                eoscVar.getClass();
                ehegVar.getClass();
                return ehezVar.a(ehde.a, new fdap() { // from class: ehft
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        ehve ehveVar = ehgcVarEr.a(str) ? new ehve(1, 1) : new ehve(1, 2);
                        Uri uriC = ehvfVar.c(ehveVar, File.separator + "phenotype" + File.separator + str);
                        uriC.getClass();
                        return uriC;
                    }
                }, eoscVar, ekgpVarN, ehfx.a, new ehfy(ehfnVar), new eooz() { // from class: ehfu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ehegVar.a((String) obj);
                    }
                }, new fdae() { // from class: ehfv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return "";
                    }
                });
            case 14:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar10 = ahknVar12.a;
                return new ehei(ejwi.j(ahnhVar10.mG()), (ehff) ahknVar12.bb.b(), ahnhVar10.aoE, ahknVar12.fO(), (Map) ahknVar12.bn.b());
            case 15:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar11 = ahknVar13.a;
                return new egbq((egcd) ahnhVar11.l.b(), (egcq) ahnhVar11.aod.b(), ahnhVar11.mE(), (egyt) ahknVar13.dj.b(), ahnhVar11.aoD, (diep) ahknVar13.l.b(), (ScheduledExecutorService) ahknVar13.p.b());
            case 16:
                ahnh ahnhVar12 = this.a.a;
                return new eghm(new eggp((eggg) ahnhVar12.po(), (eosc) ahnhVar12.a.p.b()), ahnhVar12.pp());
            case 17:
                ahkn ahknVar14 = this.a;
                return ahknVar14.ev().a(ahknVar14.a.mL(), (ecev) ahknVar14.aL.b());
            case 18:
                return new ekph(new cuiy(this.a.a.d));
            case 19:
                ahkn ahknVar15 = this.a;
                return new cqji(ahknVar15.bz, ahknVar15.a.c, ahknVar15.bA);
            case 20:
                ahnh ahnhVar13 = this.a.a;
                ahkn ahknVar16 = ahnhVar13.a;
                eyik eyikVar9 = ahknVar16.bC;
                ekhv ekhvVarI = ekhx.i(3);
                boolean zBooleanValue = ((Boolean) eyikVar9.b()).booleanValue();
                final eyik eyikVar10 = ahnhVar13.aot;
                Iterable ekphVar = !zBooleanValue ? ekon.a : new ekph(new egbx() { // from class: ehyn
                    @Override // defpackage.egbx
                    public final ListenableFuture b(egbv egbvVar) {
                        return ((ehym) eyikVar10.b()).f();
                    }
                });
                ekphVar.getClass();
                ekhvVarI.j(ekphVar);
                final egzh egzhVar = (egzh) ahknVar16.aQ.b();
                ekhvVarI.c(new egbx() { // from class: egdl
                    @Override // defpackage.egbx
                    public final ListenableFuture b(egbv egbvVar) {
                        ListenableFuture listenableFutureI = eork.i(null);
                        egzhVar.a(listenableFutureI, "com.google.apps.tiktok.account.data.AllAccounts");
                        return listenableFutureI;
                    }
                });
                ekhvVarI.c(ahnhVar13.my());
                return ekhvVarI.g();
            case 21:
                ahkn ahknVar17 = this.a;
                diep diepVar = (diep) ahknVar17.l.b();
                Context context4 = (Context) ahknVar17.t.b();
                eosd eosdVar2 = (eosd) ahknVar17.y.b();
                eosc eoscVar2 = (eosc) ahknVar17.p.b();
                ahnh ahnhVar14 = ahknVar17.a;
                ebbw ebbwVarDY = ahknVar17.dY();
                egoc egocVar = (egoc) ahnhVar14.k.b();
                ejwi ejwiVarJ = ejwi.j((egcd) ahnhVar14.l.b());
                ejwi ejwiVarJ2 = ejwi.j(Boolean.valueOf(((ehdm) ahnhVar14.pj().a.b()).a("tiktok.directboot", "45691321").e()));
                ehxh ehxhVar = (ehxh) ahknVar17.bL.b();
                ekgi ekgiVarH = ekgp.h(24);
                ekgiVarH.i("AppSearchIndexRestoreSynclet", ahnhVar14.amX);
                ekgiVarH.i("SmartsClassificationCleanupSynclet", ahnhVar14.amZ);
                ekgiVarH.i("CmsDailySynclet", ahnhVar14.ana);
                ekgiVarH.i("CobaltSynclet", ahnhVar14.anc);
                ekgiVarH.i("ConversationDedupingSynclet", ahnhVar14.ane);
                ekgiVarH.i("DanglingPartsSynclet", ahnhVar14.ang);
                ekgiVarH.i("GaiaStatusUpdaterSynclet", ahnhVar14.ani);
                ekgiVarH.i("IdentityKeySyncSynclet", ahnhVar14.anj);
                ekgiVarH.i("MessagesRestoreCleanupDailySynclet", ahnhVar14.ank);
                ekgiVarH.i("MessagesDeferredCloudRestoreSynclet", ahnhVar14.anm);
                ekgiVarH.i("MmsGroupUpgradeSynclet", ahnhVar14.anp);
                ekgiVarH.i("NotificationStateSynclet", ahnhVar14.anr);
                ekgiVarH.i("PenpalConversationAutoCleanupSynclet", ahnhVar14.ant);
                ekgiVarH.i("RemoveStalePairingsSynclet", ahnhVar14.anv);
                ekgiVarH.i("RepairForkedMmsGroupSynclet", ahnhVar14.anA);
                ekgiVarH.i("SmsSubjectSynclet", ahnhVar14.anC);
                ekgiVarH.i("SpamDataCleanupSynclet", ahnhVar14.anE);
                ekgiVarH.i("SuggestionCleanupSynclet", ahnhVar14.anF);
                ekgiVarH.i("TachygramPullMessagesSynclet", ahnhVar14.anI);
                ekgiVarH.i("TemplateFetcherSynclet", ahnhVar14.anJ);
                ekgiVarH.i("MobaltLogUploader", ahnhVar14.anN);
                ekgiVarH.i("ZinniaMaintenanceSynclet", ahnhVar14.anP);
                ekgiVarH.i("OrphanCacheSingletonSynclet", ahnhVar14.anR);
                ekgiVarH.i("TikTokAccountWipeoutSynclet", ahnhVar14.aog);
                ekgp ekgpVarC = ekgiVarH.c();
                ekgp ekgpVar = ekoj.a;
                ekgp ekgpVarN2 = ekgp.n(ehwe.ON_CHARGER, ahnhVar14.aoh, ehwe.ON_NETWORK_CONNECTED, ahnhVar14.aoi, ehwe.ON_NETWORK_UNMETERED, ahnhVar14.aoj);
                eiai eiaiVarEw = ahnhVar14.a.ew();
                eyif eyifVar = eyim.a;
                eyik eyikVar11 = ahnhVar14.aoo;
                ekon ekonVar = ekon.a;
                ejwl.b(ekonVar.isEmpty() && ekonVar.isEmpty(), "Can't provide @AccountSyncMonitor monitors into application scope.");
                return new ehym(diepVar, context4, eosdVar2, eoscVar2, ebbwVarDY, egocVar, ejwiVarJ, ejwiVarJ2, ehxhVar, ekgpVarC, ekgpVar, ekgpVarN2, new eiao(eiaiVarEw, eyifVar, eyikVar11), ahnhVar14.mN());
            case 22:
                ahkn ahknVar18 = this.a;
                return new egoc((Context) ahknVar18.t.b(), (PowerManager) ahknVar18.bD.b(), (egod) ahknVar18.bE.b(), (eosc) ahknVar18.a.j.b(), ekgp.l("main_process_service_key", ahknVar18.bF), ekgp.l("main_process_service_key", ahknVar18.bG), (egop) ahknVar18.bK.b(), ahknVar18.ei(), (eosd) ahknVar18.y.b(), (eosd) ahknVar18.aJ.b(), ahknVar18.dY());
            case 23:
                ahkn ahknVar19 = this.a;
                return new dqlb((diep) ahknVar19.l.b(), new Handler(Looper.getMainLooper()), ejwi.j(eyie.a(ahknVar19.a.i)));
            case 24:
                eyik eyikVar12 = this.a.a.h;
                eyikVar12.getClass();
                return Boolean.valueOf(!Process.isIsolated() && ((Boolean) eyikVar12.b()).booleanValue());
            case 25:
                return Boolean.valueOf(((ehdm) this.a.a.ph().a.b()).a("tiktok.directboot", "45685150").e());
            case 26:
                ahnh ahnhVar15 = this.a.a;
                eyik eyikVar13 = ahnhVar15.amW;
                aqdi aqdiVar = (aqdi) ahnhVar15.oP.b();
                eyikVar13.getClass();
                aqdiVar.getClass();
                if (!aqdiVar.a()) {
                    ekrw ekrwVarH = bxtk.a.h();
                    ekrwVarH.X(eksq.a, "BugleSearch");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/restore/AppSearchIndexableRestoreSyncletModule", "provideAppSearchIndexRestoresSynclet", 44, "AppSearchIndexableRestoreSyncletModule.kt")).q("AppSearchIndexableRestoreSynclet is disabled.");
                    return ehwk.a;
                }
                ehwk ehwkVar = ehwk.a;
                ehwa ehwaVar = new ehwa();
                ehwaVar.c(1L, TimeUnit.DAYS);
                ehwc ehwcVar = new ehwc();
                ehwcVar.a = ehwe.ON_CHARGER;
                ehwaVar.b(ehwcVar.a());
                return ehwj.a(ehwaVar.a(), eyikVar13);
            case 27:
                ahnh ahnhVar16 = this.a.a;
                return new bxtj((fdjx) ahnhVar16.m.b(), (aqdi) ahnhVar16.oP.b(), ahnhVar16.oT, ahnhVar16.VH, ahnhVar16.MK);
            case 28:
                ahkn ahknVar20 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar20.bM.b();
                egwe egweVarMF = ahknVar20.a.mF();
                fcyhVar.getClass();
                fdmt fdmtVar = new fdmt(null);
                egweVarMF.a(fdmtVar);
                return fdjy.b(fcyhVar.plus(fdmtVar));
            case 29:
                final eyik eyikVar14 = this.a.a.oO;
                return new aqdi() { // from class: aqdc
                    @Override // defpackage.aqdi
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.enable_app_search_indexing");
                    }
                };
            case 30:
                ahnh ahnhVar17 = this.a.a;
                return new eoth(ahnhVar17.qP(), (eotm) ahnhVar17.oN.b());
            case 31:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45620996").e());
            case 32:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45617644").e());
            case 33:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45657211").e());
            case 34:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45619702").e());
            case 35:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45628095").e());
            case 36:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45623323").e());
            case 37:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45635030").e());
            case 38:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45615956").e());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45648789").e());
            case 40:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45545839").e());
            case 41:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45531446").e());
            case 42:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45619942").e());
            case 43:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45618342").e());
            case 44:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45649824").e());
            case 45:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45631609").e());
            case 46:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45623340").e());
            case 47:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45618384").e());
            case 48:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45619321").e());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45619301").e());
            case 50:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45626586").e());
            case 51:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45618727").e());
            case 52:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45623330").e());
            case 53:
                return Boolean.valueOf(this.a.a.nd().a());
            case 54:
                return Boolean.valueOf(this.a.a.nf().a());
            case 55:
                return Boolean.valueOf(this.a.a.nB().a());
            case 56:
                return Boolean.valueOf(this.a.a.nc().a());
            case 57:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45660656").e());
            case 58:
                return Boolean.valueOf(this.a.a.nh().a());
            case 59:
                return Boolean.valueOf(this.a.a.nl().a());
            case 60:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45679858").e());
            case 61:
                return Boolean.valueOf(this.a.a.nj().a());
            case 62:
                return Boolean.valueOf(this.a.a.nt().a());
            case Function.ALT_CONVENTION /* 63 */:
                return Boolean.valueOf(this.a.a.ng().a());
            case 64:
                return Boolean.valueOf(this.a.a.nd().b());
            case 65:
                return Boolean.valueOf(this.a.a.nI().a());
            case 66:
                return Boolean.valueOf(this.a.a.mY().a());
            case 67:
                return Boolean.valueOf(this.a.a.nt().b());
            case 68:
                return Boolean.valueOf(this.a.a.nt().c());
            case 69:
                return Boolean.valueOf(this.a.a.mY().b());
            case 70:
                return Boolean.valueOf(this.a.a.ni().a());
            case 71:
                return Boolean.valueOf(this.a.a.ne().a());
            case 72:
                return Boolean.valueOf(this.a.a.nf().b());
            case 73:
                return Boolean.valueOf(this.a.a.nD().a());
            case 74:
                return Boolean.valueOf(this.a.a.nb().a());
            case 75:
                return Boolean.valueOf(this.a.a.nA().a());
            case 76:
                return Boolean.valueOf(this.a.a.mX().a());
            case 77:
                return Boolean.valueOf(this.a.a.na().a());
            case 78:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45693011").e());
            case 79:
                return Boolean.valueOf(this.a.a.nG().a());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return Boolean.valueOf(this.a.a.nl().b());
            case 81:
                return Boolean.valueOf(this.a.a.nA().b());
            case 82:
                return Boolean.valueOf(this.a.a.nD().b());
            case 83:
                return Boolean.valueOf(this.a.a.nC().a());
            case 84:
                return Boolean.valueOf(this.a.a.nb().b());
            case 85:
                return Boolean.valueOf(this.a.a.nA().c());
            case 86:
                return Boolean.valueOf(this.a.a.nd().c());
            case 87:
                return Boolean.valueOf(this.a.a.nd().d());
            case 88:
                return Boolean.valueOf(this.a.a.nt().d());
            case 89:
                return Boolean.valueOf(this.a.a.mX().b());
            case 90:
                return Boolean.valueOf(this.a.a.nr().a());
            case 91:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45659346").e());
            case 92:
                return Boolean.valueOf(this.a.a.nw().a());
            case 93:
                return Boolean.valueOf(this.a.a.nJ().a());
            case 94:
                return Boolean.valueOf(this.a.a.nu().a());
            case 95:
                return Boolean.valueOf(this.a.a.nD().c());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return Boolean.valueOf(this.a.a.nn().a());
            case 97:
                return Boolean.valueOf(this.a.a.np().a());
            case 98:
                return Boolean.valueOf(this.a.a.nA().d());
            case 99:
                return Boolean.valueOf(this.a.a.nu().b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45651443").e());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45367769").e());
            case 102:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45693752").e());
            case 103:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45692380").e());
            case 104:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45650724").e());
            case 105:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45659333").e());
            case 106:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45680317").e());
            case 107:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45694766").e());
            case 108:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45688487").e());
            case 109:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45686332").e());
            case 110:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45683444").e());
            case 111:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45686333").e());
            case 112:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45683666").e());
            case 113:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45683164").e());
            case 114:
                return Boolean.valueOf(fafg.a(this.a.a.mY()));
            case 115:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45689614").e());
            case 116:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45669583").e());
            case 117:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45697391").e());
            case 118:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45687987").e());
            case 119:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45689410").e());
            case 120:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45688599").e());
            case 121:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45696691").e());
            case 122:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45696349").e());
            case 123:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45687110").e());
            case 124:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45691597").e());
            case 125:
                return Boolean.valueOf(((ehdm) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto", "45683485").e());
            case 126:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45683867").e());
            case 127:
                return Boolean.valueOf(((ehdm) this.a.a.oh().a.b()).a("com.google.android.apps.messaging.auto", "45666897").e());
            case 128:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45646330").e());
            case 129:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45664524").e());
            case 130:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45697111").e());
            case 131:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45687021").e());
            case 132:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45686794").e());
            case 133:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45697275").e());
            case 134:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45696692").e());
            case 135:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45686715").e());
            case 136:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45689859").e());
            case 137:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45673397").e());
            case 138:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45689484").e());
            case 139:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45531299").e());
            case 140:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45572216").e());
            case 141:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45380126").e());
            case 142:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45685577").e());
            case 143:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45685947").e());
            case 144:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45690125").e());
            case 145:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45682731").e());
            case 146:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45625340").e());
            case 147:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45683980").e());
            case 148:
                return Boolean.valueOf(this.a.a.mZ().a());
            case 149:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45675829").e());
            case 150:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45684218").e());
            case 151:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45671756").e());
            case 152:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45672599").e());
            case 153:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45659173").e());
            case 154:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45673991").e());
            case 155:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45667188").e());
            case 156:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45685721").e());
            case 157:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45678156").e());
            case 158:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45680897").e());
            case 159:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45657134").e());
            case 160:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45686823").e());
            case 161:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45688236").e());
            case 162:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45676702").e());
            case 163:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45373834").e());
            case 164:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45366677").e());
            case 165:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45684915").e());
            case 166:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45629547").e());
            case 167:
                return Boolean.valueOf(((ehdm) this.a.a.pc().a.b()).a("com.google.android.apps.messaging.auto", "45668436").e());
            case 168:
                return Boolean.valueOf(this.a.a.mZ().b());
            case 169:
                return Boolean.valueOf(this.a.a.mZ().c());
            case 170:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45692624").e());
            case 171:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45693948").e());
            case 172:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45530918").e());
            case 173:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45690488").e());
            case 174:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45687815").e());
            case 175:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45691938").e());
            case 176:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45691782").e());
            case 177:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45677747").e());
            case 178:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45688563").e());
            case 179:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45425786").e());
            case 180:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45637161").e());
            case 181:
                return Boolean.valueOf(this.a.a.mY().c());
            case 182:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45625714").e());
            case 183:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45667585").e());
            case 184:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45413293").e());
            case 185:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45585468").e());
            case 186:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45377331").e());
            case 187:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45409239").e());
            case 188:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45409240").e());
            case 189:
                return Boolean.valueOf(this.a.a.mY().d());
            case 190:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45631085").e());
            case 191:
                return Boolean.valueOf(((ehdm) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto", "45651987").e());
            case 192:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45682636").e());
            case 193:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45387853").e());
            case 194:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45690126").e());
            case 195:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45681990").e());
            case 196:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45622153").e());
            case 197:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45642293").e());
            case 198:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45691907").e());
            case 199:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45637162").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1000:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahnh ahnhVar = ahknVar.a;
                return chyc.a(context, ahnhVar.rC, (cczn) ahknVar.cG.b(), ahnhVar.ZJ, (eosc) ahknVar.aJ.b(), ahnhVar.ZS, new cqdx());
            case 1001:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                eygg eyggVarA = eyie.a(ahknVar2.dv);
                ahnh ahnhVar2 = ahknVar2.a;
                return new ccyw(context2, eyggVarA, ahnhVar2.rA, ahnhVar2.ZA);
            case 1002:
                return new cqbo(eyie.a(this.a.a.rz));
            case 1003:
                return crsc.a(this.a.a.pK());
            case 1004:
                ahkn ahknVar3 = this.a;
                dggg dgggVarMc = ahknVar3.a.mc();
                chtv chtvVar = new chtv();
                return new crsr(dgggVarMc, chtvVar, (eosc) ahknVar3.aJ.b());
            case 1005:
                ahkn ahknVar4 = this.a;
                return new dfxy((Context) ahknVar4.t.b(), (dgtg) ahknVar4.a.rs.b());
            case 1006:
                ahkn ahknVar5 = this.a;
                eyik eyikVar = ahknVar5.dx;
                ahnh ahnhVar3 = ahknVar5.a;
                return new dgtg(eyikVar, ahknVar5.aP, (cebq) ahnhVar3.rq.b(), (cmlb) ahnhVar3.rd.b(), ahnhVar3.rr);
            case 1007:
                ahkn ahknVar6 = this.a;
                return new cebl(ahknVar6.a.rp, (eosc) ahknVar6.aJ.b());
            case 1008:
                return Optional.of(this.a.a.me());
            case 1009:
                return new dfjz(this.a.a.oO);
            case 1010:
                ahkn ahknVar7 = this.a;
                return new dexw((cmlb) ahknVar7.a.rd.b(), (eosc) ahknVar7.y.b(), ahknVar7.dq);
            case 1011:
                return new crsj(this.a.a.qr);
            case 1012:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqsv() { // from class: aqqx
                    @Override // defpackage.aqsv
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_sim_subscription_info_retriever_in_cslib_phenotype_helper");
                    }
                };
            case 1013:
                final eyik eyikVar3 = this.a.a.oO;
                return new aqbb() { // from class: apku
                    @Override // defpackage.aqbb
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.remove_phenotype_registration_event_logging_flag");
                    }
                };
            case 1014:
                ahkn ahknVar8 = this.a;
                eosc eoscVar = (eosc) ahknVar8.aJ.b();
                ahnh ahnhVar4 = ahknVar8.a;
                return new ccyp(eoscVar, eyie.a(ahnhVar4.Zy), ahknVar8.nX, ahknVar8.cI, (Context) ahknVar8.t.b(), ahnhVar4.Zz);
            case 1015:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar5 = ahknVar9.a;
                return ekhx.v(ahnhVar5.pz(), (ccyz) ahnhVar5.rk.b(), ahnhVar5.pL(), ahnhVar5.L(), ahnhVar5.jf(), (ccyz) ahknVar9.dA.b(), (ccyz) ahnhVar5.rP.b(), ahnhVar5.w(), (ccyz) ahknVar9.dt.b(), (ccyz) ahknVar9.du.b(), (ccyz) ahnhVar5.rQ.b(), ahnhVar5.rT(), (ccyz) ahknVar9.dB.b(), ahnhVar5.iY(), (chwq) ahnhVar5.uu.b(), ahnhVar5.kf());
            case 1016:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar6 = ahknVar10.a;
                return new deyj((dfxx) ahnhVar6.rt.b(), (dhes) ahknVar10.aP.b(), ckhe.a(), (eosc) ahknVar10.aJ.b(), (dexw) ahnhVar6.ru.b());
            case 1017:
                return Boolean.valueOf(favs.a(this.a.a.oW()));
            case 1018:
                return new arhe() { // from class: args
                };
            case 1019:
                return new batg(this.a.a.rF);
            case 1020:
                return Optional.of((cbaz) this.a.a.rG.b());
            case 1021:
                return Boolean.valueOf(famc.a(this.a.a.oa()));
            case 1022:
                final eyik eyikVar4 = this.a.a.oO;
                return new aqpb() { // from class: aqov
                    @Override // defpackage.aqpb
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.use_phenotype_canary_flag_to_enable_gaia_pairing_registration");
                    }
                };
            case 1023:
                ahkn ahknVar11 = this.a;
                cmfo cmfoVarKh = ahknVar11.a.kh();
                return new bvme(cmfoVarKh, (eosc) ahknVar11.p.b(), (egzh) ahknVar11.aQ.b());
            case 1024:
                return Boolean.valueOf(faor.a(this.a.a.on()));
            case 1025:
                return new cihs(this.a.a.rF);
            case 1026:
                return cihg.a(cihu.a(), this.a.a.mK());
            case 1027:
                ahkn ahknVar12 = this.a;
                return new cqng((eosc) ahknVar12.y.b(), ahknVar12.a.rO, (cczn) ahknVar12.cG.b());
            case 1028:
                return new bbcf(this.a.a.qz);
            case 1029:
                return Optional.of(this.a.a.iZ());
            case 1030:
                return Long.valueOf(fasq.a(this.a.a.oG()));
            case 1031:
                return Boolean.valueOf(fasp.a(this.a.a.oG()));
            case 1032:
                return Boolean.valueOf(fasr.a(this.a.a.oG()));
            case 1033:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar7 = ahknVar13.a;
                return new chxl(ahnhVar7.rV, ahnhVar7.sj, ahnhVar7.Zu, (Context) ahknVar13.t.b(), ahnhVar7.us, ahnhVar7.c, ahknVar13.da, ahknVar13.aT, ahnhVar7.pf, ahnhVar7.Ef, ahnhVar7.Ns, (cqbm) ahnhVar7.sX.b(), ahknVar13.cO, ahnhVar7.pB, ahnhVar7.WV, ahnhVar7.sL, ahnhVar7.uJ, ahnhVar7.Dp, ahnhVar7.rY, ahnhVar7.uv, ahnhVar7.Zv, ahnhVar7.Qs, ahnhVar7.qG, ahnhVar7.Ci, ahnhVar7.qq, ahnhVar7.yr, ahnhVar7.qW, ahnhVar7.qi, ahnhVar7.LU, (cuur) ahnhVar7.wI.b(), ahknVar13.nW, ahnhVar7.pR, (dzuc) ahknVar13.cE.b(), ahknVar13.cQ, ahnhVar7.xI, ahnhVar7.PT, ahnhVar7.rW, ahnhVar7.se, ahnhVar7.sh, ahnhVar7.pT, ahnhVar7.Qp, ahnhVar7.Zx, (aqnw) ahnhVar7.Gu.b(), (apth) ahnhVar7.Dz.b(), (area) ahnhVar7.SQ.b());
            case 1034:
                final eyik eyikVar5 = this.a.a.oO;
                return new aqsk() { // from class: aqqc
                    @Override // defpackage.aqsk
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.dsdr_use_provisioning_api_in_rcs_utils");
                    }
                };
            case 1035:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar8 = ahknVar14.a;
                return new chtk(ahnhVar8.rW, ahnhVar8.yD, ahnhVar8.sL, ahnhVar8.Zt, ahnhVar8.pT, ahnhVar8.se, ahnhVar8.pB, (fcyh) ahknVar14.bM.b(), (fcyh) ahknVar14.cA.b(), (fdjx) ahnhVar8.m.b());
            case 1036:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar9 = ahknVar15.a;
                return new dgia((cmlm) ahnhVar9.rg.b(), ahnhVar9.rX, ahnhVar9.sg, (fdjx) ahnhVar9.oS.b(), (fcyh) ahknVar15.cA.b());
            case 1037:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar10 = ahknVar16.a;
                return new cjpj(ahnhVar10.rc, ahnhVar10.rd, ahknVar16.aP, ahnhVar10.rW, (fdjx) ahnhVar10.oS.b());
            case 1038:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar11 = ahknVar17.a;
                return new dghi((cqbm) ahnhVar11.rY.b(), ahnhVar11.rd, ahnhVar11.sd, ahknVar17.dJ, ahnhVar11.sf, (fcyh) ahknVar17.cA.b());
            case 1039:
                ahkn ahknVar18 = this.a;
                Context context3 = (Context) ahknVar18.t.b();
                ahnh ahnhVar12 = ahknVar18.a;
                return new dgrs(context3, (dhhc) ahnhVar12.sa.b(), (dhes) ahknVar18.aP.b(), (eosc) ahknVar18.aJ.b(), (deyz) ahnhVar12.sb.b(), (cebq) ahnhVar12.rq.b(), ahknVar18.dI, ahnhVar12.sc);
            case 1040:
                ahkn ahknVar19 = this.a;
                return new dhhc((Context) ahknVar19.t.b(), (dexy) ahknVar19.a.rZ.b());
            case 1041:
                ahkn ahknVar20 = this.a;
                return new dexy((Context) ahknVar20.t.b(), (eosc) ahknVar20.aJ.b(), (dhes) ahknVar20.aP.b(), (dexw) ahknVar20.a.ru.b());
            case 1042:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar13 = ahknVar21.a;
                return new deyz((dfxx) ahnhVar13.rt.b(), (dhes) ahknVar21.aP.b(), ckhe.a(), (eosc) ahknVar21.aJ.b(), (dexw) ahnhVar13.ru.b());
            case 1043:
                return new dfkm(this.a.a.oO);
            case 1044:
                ahnh ahnhVar14 = this.a.a;
                return new dgio((crmx) ahnhVar14.pB.b(), (dggl) ahnhVar14.se.b());
            case 1045:
                return new dggl((crmx) this.a.a.pB.b());
            case 1046:
                ahnh ahnhVar15 = this.a.a;
                aocw aocwVar = (aocw) ahnhVar15.Zq.b();
                ahnhVar15.se();
                aofb.a(aocwVar);
                return aocwVar;
            case 1047:
                ahkn ahknVar22 = this.a;
                eosc eoscVar2 = (eosc) ahknVar22.p.b();
                ahnh ahnhVar16 = ahknVar22.a;
                return new aocw(eoscVar2, (fdjx) ahnhVar16.m.b(), (fdjx) ahnhVar16.oS.b(), (aoeq) ahnhVar16.qx(), (anph) ahknVar22.ir.b(), ahnhVar16.aR(), ahnhVar16.Zl, ahnhVar16.Zm, (Optional) ahnhVar16.Za.b(), ahnhVar16.Zp, (aofp) ahnhVar16.AY.b(), ahnhVar16.Bb);
            case 1048:
                ahkn ahknVar23 = this.a;
                eyik eyikVar6 = ahknVar23.t;
                ahnh ahnhVar17 = ahknVar23.a;
                return new aocg(eyikVar6, ahnhVar17.pf, ahnhVar17.si, ahnhVar17.sn, ahknVar23.dN, ahnhVar17.so, ahnhVar17.qi, ahnhVar17.sq, ahnhVar17.sX, ahknVar23.y, ahknVar23.p, ahknVar23.aJ, ahnhVar17.Za, ahnhVar17.Zd, ahnhVar17.pB, ahnhVar17.Ze, ahnhVar17.RH, ahnhVar17.AY, ahnhVar17.qo, ahnhVar17.Zf, ahnhVar17.Zg, ahnhVar17.DY, ahnhVar17.Zh, ahnhVar17.pl, ahnhVar17.Zi, ahnhVar17.DZ, ahnhVar17.Zj);
            case 1049:
                ahkn ahknVar24 = this.a;
                eyik eyikVar7 = ahknVar24.dK;
                eyik eyikVar8 = ahknVar24.p;
                ahnh ahnhVar18 = ahknVar24.a;
                return new aoix(eyikVar7, eyikVar8, ahnhVar18.sh, ahnhVar18.rd);
            case 1050:
                return new aofz(this.a.a.sm);
            case 1051:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar19 = ahknVar25.a;
                return new aogk(ahnhVar19.sj, ahknVar25.dK, ahknVar25.y, ahnhVar19.sk, eyil.a(ahnhVar19.sl));
            case 1052:
                ahkn ahknVar26 = this.a;
                return new aogb((cqtp) ahknVar26.dK.b(), (alrj) ahknVar26.a.qi.b());
            case 1053:
                ahkn ahknVar27 = this.a;
                Context context4 = (Context) ahknVar27.t.b();
                ahnh ahnhVar20 = ahknVar27.a;
                return new axjf(context4, ahnhVar20.qo, ahnhVar20.qi);
            case 1054:
                ahnh ahnhVar21 = this.a.a;
                return new aoin(ahnhVar21.pT, ahnhVar21.rW, ahnhVar21.qi, ahnhVar21.sj, ahnhVar21.sp);
            case 1055:
                final eyik eyikVar9 = this.a.a.oO;
                return new aqsl() { // from class: aqqe
                    @Override // defpackage.aqsl
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.dsdr_use_rcs_local_identity_provider_in_mapi");
                    }
                };
            case 1056:
                return cqeq.a(eyie.a(this.a.a.YX));
            case 1057:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar22 = ahknVar28.a;
                return new cqgh(ahnhVar22.sr, ahnhVar22.rd, (Context) ahknVar28.t.b(), ahknVar28.dO, ahknVar28.bD, eyie.a(ahnhVar22.sA), (eosc) ahknVar28.aJ.b(), ahknVar28.aP, ahnhVar22.qr, ahnhVar22.sz, ahnhVar22.sI, ahnhVar22.YR, ahnhVar22.qB, ahnhVar22.su, ahnhVar22.pf, ahnhVar22.Ba, ahnhVar22.YS, (eosc) ahknVar28.p.b(), ahnhVar22.YT, ahnhVar22.YU, ahnhVar22.YV, ahnhVar22.YW);
            case 1058:
                final eyik eyikVar10 = this.a.a.oO;
                return new aqsg() { // from class: aqpv
                    @Override // defpackage.aqsg
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.dsdr_remove_sim_preferences_from_connectivity_util");
                    }
                };
            case 1059:
                ahkn ahknVar29 = this.a;
                Context context5 = (Context) ahknVar29.t.b();
                eosc eoscVar3 = (eosc) ahknVar29.y.b();
                eosc eoscVar4 = (eosc) ahknVar29.aJ.b();
                ahnh ahnhVar23 = ahknVar29.a;
                return new cqhd(context5, eoscVar3, eoscVar4, ahnhVar23.sy, ahnhVar23.pf, ahnhVar23.sz);
            case 1060:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar24 = ahknVar30.a;
                return new cqgn(ahnhVar24.sw, ahnhVar24.sx, ahknVar30.dT, ahnhVar24.sv);
            case 1061:
                ahkn ahknVar31 = this.a;
                return new cqgv(ahknVar31.dP, ahknVar31.y, ahknVar31.dR, ahknVar31.aI, ahknVar31.a.sv);
            case 1062:
                ahkn ahknVar32 = this.a;
                return new cqho((Context) ahknVar32.t.b(), ahknVar32.a.su);
            case 1063:
                ahkn ahknVar33 = this.a;
                Context context6 = (Context) ahknVar33.t.b();
                eosc eoscVar5 = (eosc) ahknVar33.p.b();
                ahnh ahnhVar25 = ahknVar33.a;
                return new clic(context6, eoscVar5, (fdjx) ahnhVar25.m.b(), (eigp) ahknVar33.aI.b(), (clhc) ahnhVar25.st.b(), ahnhVar25.cz());
            case 1064:
                ahkn ahknVar34 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar34.cA.b();
                ahnh ahnhVar26 = ahknVar34.a;
                return new clli(fcyhVar, ahnhVar26.lX(), ahnhVar26.lV(), ahnhVar26.lW());
            case 1065:
                ahkn ahknVar35 = this.a;
                return cllr.a(ahknVar35.a.mU(), cllq.a(), (Context) ahknVar35.t.b());
            case 1066:
                ahkn ahknVar36 = this.a;
                return new cqhi(ahknVar36.dP, ahknVar36.y, ahknVar36.dR, ahknVar36.a.sv);
            case 1067:
                final eyik eyikVar11 = this.a.a.oO;
                return new aqsa() { // from class: aqpj
                    @Override // defpackage.aqsa
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.dsdr_fix_rcs_network_connectivity_check");
                    }
                };
            case 1068:
                ahnh ahnhVar27 = this.a.a;
                return awzg.a(ahnhVar27.ec(), ahnhVar27.sU);
            case 1069:
                final eyik eyikVar12 = this.a.a.oO;
                return new ardl() { // from class: arbe
                    @Override // defpackage.ardl
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_group_primitive_for_tachygram_group_notification");
                    }
                };
            case 1070:
                ahnh ahnhVar28 = this.a.a;
                return new awuo(ahnhVar28.qy, ahnhVar28.pf, (awlc) ahnhVar28.sW.b(), (alrj) ahnhVar28.qi.b(), (axfu) ahnhVar28.qC.b(), (fdjx) ahnhVar28.m.b(), (fdjx) ahnhVar28.oQ.b(), ahnhVar28.cm());
            case 1071:
                ahnh ahnhVar29 = this.a.a;
                return new awlc(ahnhVar29.sV, (fdjx) ahnhVar29.m.b());
            case 1072:
                ahnh ahnhVar30 = this.a.a;
                return ekhx.r((awvl) ahnhVar30.sT.b(), ahnhVar30.eb());
            case 1073:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar31 = ahknVar37.a;
                return new awpo((fdjx) ahnhVar31.m.b(), (fcyh) ahknVar37.cA.b(), ahnhVar31.kG(), (awnf) ahnhVar31.sJ.b(), (awjh) ahnhVar31.sK.b(), (ardl) ahnhVar31.sB.b(), (lkb) ahnhVar31.sQ.b(), (cogw) ahknVar37.cD.b(), ahnhVar31.sR, ahnhVar31.sS, (ains) ahnhVar31.pQ.b(), (awzf) ahnhVar31.sI.b(), (awyu) ahnhVar31.qB.b(), (eizx) ahknVar37.ea.b());
            case 1074:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar32 = ahknVar38.a;
                return new awmk((awjh) ahnhVar32.sK.b(), (awzf) ahnhVar32.sI.b(), (awgx) ahknVar38.dW.b(), (awgx) ahknVar38.dX.b(), ahnhVar32.sL, ahnhVar32.pT, (fdjx) ahnhVar32.m.b(), (fcyh) ahknVar38.cA.b(), ahnhVar32.dZ(), (eizx) ahknVar38.dY.b(), (eizx) ahknVar38.dZ.b(), ahnhVar32.dY(), ahnhVar32.bZ(), (awlc) ahnhVar32.sN.b(), ahnhVar32.ca(), (awxo) ahnhVar32.sP.b());
            case 1075:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar33 = ahknVar39.a;
                return new awiz((awgx) ahnhVar33.sD.b(), (awgx) ahnhVar33.sE.b(), ahnhVar33.sH, ahnhVar33.pB, (fcyh) ahknVar39.cz.b(), (fdjx) ahnhVar33.m.b(), (awzf) ahnhVar33.sI.b(), (awyu) ahnhVar33.qB.b(), ahnhVar33.sJ);
            case 1076:
                return new awgx(this.a.a.dS());
            case 1077:
                return Long.valueOf(faly.a(this.a.a.nZ()));
            case 1078:
                return new awgx(this.a.a.dT());
            case 1079:
                ahkn ahknVar40 = this.a;
                return new awkv((byeq) ahknVar40.a.sG.b(), (fcyh) ahknVar40.cA.b());
            case 1080:
                ahnh ahnhVar34 = this.a.a;
                return bsrk.a(ahnhVar34.qq, ahnhVar34.sF);
            case 1081:
                ahkn ahknVar41 = this.a;
                return axgl.a(ahknVar41.dV, (Executor) ahknVar41.y.b(), ahknVar41.a.bD());
            case 1082:
                return new axiu((Executor) this.a.dV.b(), Optional.empty(), new axir());
            case 1083:
                final eyik eyikVar13 = this.a.a.oO;
                return new ardo() { // from class: arbk
                    @Override // defpackage.ardo
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_populate_join_by_link_properties");
                    }
                };
            case 1084:
                return new awlc(eyim.a(), (fdjx) this.a.a.m.b());
            case 1085:
                ahnh ahnhVar35 = this.a.a;
                return new awyq((awzf) ahnhVar35.sI.b(), (awyu) ahnhVar35.qB.b(), (ahlu) ahnhVar35.sO.b(), ahnhVar35.qC, ahnhVar35.cl(), (dghj) ahnhVar35.rW.b(), (dggl) ahnhVar35.se.b());
            case 1086:
                return new ahlu(this);
            case 1087:
                return awmo.a(awpw.a(), this.a.a.mK());
            case 1088:
                return faoy.a(this.a.a.oo());
            case 1089:
                return faoz.a(this.a.a.oo());
            case 1090:
                ahnh ahnhVar36 = this.a.a;
                return new awlc(ahnhVar36.YQ, (fdjx) ahnhVar36.m.b());
            case 1091:
                ahnh ahnhVar37 = this.a.a;
                return ekhx.v((cliu) ahnhVar37.tb.b(), ahnhVar37.eF(), ahnhVar37.pS(), (cliu) ahnhVar37.YM.b(), (cliu) ahnhVar37.YO.b(), (cliu) ahnhVar37.YP.b(), new cliu[0]);
            case 1092:
                ahkn ahknVar42 = this.a;
                Context context7 = (Context) ahknVar42.t.b();
                ahnh ahnhVar38 = ahknVar42.a;
                return new clje(context7, (fdjx) ahnhVar38.oQ.b(), (cqbm) ahnhVar38.sX.b(), ahnhVar38.pl(), ahknVar42.fW(), ahnhVar38.sZ, ahnhVar38.ta, ahnhVar38.qB, ahnhVar38.sI);
            case 1093:
                return Long.valueOf(fauk.a(this.a.a.oP()));
            case 1094:
                final eyik eyikVar14 = this.a.a.oO;
                return new asan() { // from class: arzp
                    @Override // defpackage.asan
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.ignore_wifi_when_connected_to_satellite");
                    }
                };
            case 1095:
                final eyik eyikVar15 = this.a.a.oO;
                return new asag() { // from class: arzc
                    @Override // defpackage.asag
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_carrier_config_by_sub_id_for_satellite");
                    }
                };
            case 1096:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar39 = ahknVar43.a;
                return new axyz(ahnhVar39.EG, ahnhVar39.UP, ahnhVar39.wa, ahnhVar39.c, ahknVar43.p, ahknVar43.y, ahnhVar39.YJ, ahnhVar39.Gc, ahknVar43.dh);
            case 1097:
                ahkn ahknVar44 = this.a;
                eosc eoscVar6 = (eosc) ahknVar44.y.b();
                ahnh ahnhVar40 = ahknVar44.a;
                return new cema(eoscVar6, (Optional) ahnhVar40.FQ.b(), (cezv) ahnhVar40.tc.b(), (cfwu) ahnhVar40.FR.b(), (cedm) ahnhVar40.xj.b(), (cejj) ahnhVar40.tJ.b(), (ains) ahnhVar40.c.b(), (Optional) ahknVar44.hZ.b(), eyie.a(ahnhVar40.xd), (cenj) ahnhVar40.tf.b(), (aipo) ahnhVar40.us.b(), (cepq) ahnhVar40.FT.b());
            case 1098:
                return Optional.of((cfzf) this.a.a.xc.b());
            case 1099:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar41 = ahknVar45.a;
                return new cfzp(ahnhVar41.qM, (Context) ahknVar45.t.b(), (eosc) ahknVar45.p.b(), (eosc) ahknVar45.aJ.b(), ahnhVar41.pb, ahnhVar41.tc, ahnhVar41.xj, ahnhVar41.tJ, (Optional) ahknVar45.hZ.b(), Optional.of(ahnhVar41.hR()), Optional.of(ahnhVar41.hV()), Optional.of(ahnhVar41.hY()), ahnhVar41.pT, ahnhVar41.DX, ahnhVar41.vT, ahnhVar41.YI);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i = this.b;
        switch (i) {
            case 1100:
                ahkn ahknVar = this.a;
                eosc eoscVar = (eosc) ahknVar.y.b();
                eosc eoscVar2 = (eosc) ahknVar.p.b();
                eosc eoscVar3 = (eosc) ahknVar.aJ.b();
                ahnh ahnhVar = ahknVar.a;
                return new cedm(eoscVar, eoscVar2, eoscVar3, (cezv) ahnhVar.tc.b(), (cenj) ahnhVar.tf.b(), ahnhVar.tg, (cogw) ahknVar.cD.b(), ahnhVar.hO(), (Optional) ahnhVar.Xq.b(), eyie.a(ahnhVar.Xr), ahnhVar.Xs, (ceop) ahnhVar.tq.b(), ahnhVar.xR);
            case 1101:
                ahkn ahknVar2 = this.a;
                Context context = (Context) ahknVar2.t.b();
                ahnh ahnhVar2 = ahknVar2.a;
                return new cenj(context, ahnhVar2.kJ(), ahnhVar2.te);
            case 1102:
                ahkn ahknVar3 = this.a;
                return new ceds(ahknVar3.a.td, ahknVar3.eb);
            case 1103:
                return Long.valueOf(fara.a(this.a.a.oz()));
            case 1104:
                ahkn ahknVar4 = this.a;
                return new ceuk((cmgk) ahknVar4.a.qK.b(), (crqv) ahknVar4.aT.b());
            case 1105:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar3 = ahknVar5.a;
                return new cffq(ahknVar5.y, ahnhVar3.Xo, ahnhVar3.tq);
            case 1106:
                ahkn ahknVar6 = this.a;
                eyik eyikVar = ahknVar6.t;
                ahnh ahnhVar4 = ahknVar6.a;
                return new cfgs(eyikVar, ahknVar6.cD, ahnhVar4.th, ahnhVar4.tj, ahnhVar4.ty, ahnhVar4.tz, ahnhVar4.Xn, ahknVar6.nJ, ahknVar6.aJ, ahknVar6.p, ahnhVar4.tk);
            case 1107:
                ahkn ahknVar7 = this.a;
                return new cdby((Context) ahknVar7.t.b(), (eosc) ahknVar7.aJ.b(), ahknVar7.ee, ahknVar7.a.pb);
            case 1108:
                return Optional.of((cerz) this.a.a.ti.b());
            case 1109:
                ahkn ahknVar8 = this.a;
                return new cerz((Context) ahknVar8.t.b(), (dcdt) ahknVar8.dk.b(), (dcoc) ahknVar8.ef.b(), (ains) ahknVar8.a.c.b());
            case 1110:
                cfiw cfiwVar = new cfiw();
                ahnh ahnhVar5 = this.a.a;
                return ekhx.t(cfiwVar, ahnhVar5.hI(), ahnhVar5.fe(), ahnhVar5.kI());
            case 1111:
                return new aoou() { // from class: aopm
                };
            case 1112:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar6 = ahknVar9.a;
                return new bwjf((bwkr) ahnhVar6.tl.b(), (bwbn) ahnhVar6.tw.b(), (eosc) ahknVar9.y.b(), eyie.a(ahnhVar6.ts));
            case 1113:
                ahkn ahknVar10 = this.a;
                return new bwkr(ahknVar10.a.qr, (eosc) ahknVar10.y.b());
            case 1114:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar7 = ahknVar11.a;
                return new bwbn((ceop) ahnhVar7.tq.b(), (bwln) ahnhVar7.tr.b(), eyie.a(ahnhVar7.ts), (bwkr) ahnhVar7.tl.b(), (bwlt) ahnhVar7.tv.b(), (eosc) ahknVar11.y.b(), (eosc) ahknVar11.aJ.b(), ahnhVar7.sk, (bwjg) ahknVar11.eh.b(), (cexn) ahnhVar7.tp.b(), ahnhVar7.rk);
            case 1115:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar8 = ahknVar12.a;
                return new ceop(ahnhVar8.tp, ahnhVar8.tg, (eosc) ahknVar12.y.b());
            case 1116:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar9 = ahknVar13.a;
                return new cexn(ahnhVar9.qK, eyil.a(ahnhVar9.tm), ahnhVar9.qr, ahnhVar9.c, ahnhVar9.pB, ahknVar13.p, ahnhVar9.pT, ahnhVar9.tn, ahnhVar9.to);
            case 1117:
                ahkn ahknVar14 = this.a;
                return ekhx.r(ahknVar14.db(), (cfsb) ahknVar14.a.sk.b());
            case 1118:
                ahkn ahknVar15 = this.a;
                return new bwaj(ahknVar15.eg, ahknVar15.a.pb);
            case 1119:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqvc() { // from class: aquv
                    @Override // defpackage.aqvc
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_identity_key_contact_sync");
                    }
                };
            case 1120:
                ahnh ahnhVar10 = this.a.a;
                return new bwln((cexn) ahnhVar10.tp.b(), ahnhVar10.qK);
            case 1121:
                return new bwkw((ains) this.a.a.c.b());
            case 1122:
                ahnh ahnhVar11 = this.a.a;
                return new bwlt(ahnhVar11.tt, ahnhVar11.tu);
            case 1123:
                return new bwlu(this.a.a.tt);
            case 1124:
                return ekhx.r(new cfja(), this.a.a.hT());
            case 1125:
                ekhv ekhvVarI = ekhx.i(4);
                ahnh ahnhVar12 = this.a.a;
                ekhvVarI.j(ahnhVar12.ru());
                ekhvVarI.j(ahnhVar12.rv());
                ekhvVarI.c(ahnhVar12.qD());
                ekhvVarI.c(ahnhVar12.ja());
                return ekhvVarI.g();
            case 1126:
                final eyik eyikVar3 = this.a.a.oO;
                return new arvu() { // from class: arvr
                    @Override // defpackage.arvu
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_rcs_delete");
                    }
                };
            case 1127:
                return Boolean.valueOf(fati.a(this.a.a.oK()));
            case 1128:
                final eyik eyikVar4 = this.a.a.oO;
                return new arxn() { // from class: arxd
                    @Override // defpackage.arxn
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.enable_gsma_reactions_transport");
                    }
                };
            case 1129:
                ahkn ahknVar16 = this.a;
                eyik eyikVar5 = ahknVar16.dj;
                ahnh ahnhVar13 = ahknVar16.a;
                cmfo cmfoVarKi = ahnhVar13.ki();
                return new cdku(cmfoVarKi, (eosc) ahknVar16.p.b(), (egzh) ahknVar16.aQ.b(), ahknVar16.ei, ahnhVar13.tF, ahknVar16.cD);
            case 1130:
                return Optional.of((cdiq) this.a.a.tE.b());
            case 1131:
                ahnh ahnhVar14 = this.a.a;
                return new cdiv((fdjx) ahnhVar14.m.b(), (ehtk) ahnhVar14.tD.b(), ahnhVar14.qN);
            case 1132:
                ahkn ahknVar17 = this.a;
                return new ehtt((eosc) ahknVar17.aJ.b(), (eosc) ahknVar17.p.b(), (dbmr) ahknVar17.ej.b(), (ehtl) ahknVar17.ek.b(), (egej) ahknVar17.a.pI.b(), (diep) ahknVar17.l.b());
            case 1133:
                return new ahmf(this);
            case 1134:
                ahnh ahnhVar15 = this.a.a;
                return new ccpq(ahnhVar15.pT, (awyu) ahnhVar15.qB.b(), (awzf) ahnhVar15.sI.b());
            case 1135:
                return new ahmq(this);
            case 1136:
                ahkn ahknVar18 = this.a;
                return ehup.a(ahknVar18.a.ro(), (cvw) ahknVar18.el.b(), ahknVar18.fj());
            case 1137:
                final ehiy ehiyVarMI = this.a.a.mI();
                return new estu() { // from class: estw
                    @Override // defpackage.estu
                    public final ListenableFuture a() {
                        ehgb ehgbVar = (ehgb) ehiyVarMI;
                        ehey eheyVar = ehgbVar.b;
                        final ListenableFuture listenableFutureA = ehgbVar.a.a();
                        final ListenableFuture listenableFutureA2 = eheyVar.a();
                        return eika.d(listenableFutureA, listenableFutureA2).a(new Callable() { // from class: ehga
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
            case 1138:
                ahkn ahknVar19 = this.a;
                ehfn ehfnVar = (ehfn) ahknVar19.bu.b();
                ehez ehezVar = (ehez) ahknVar19.br.b();
                ehvf ehvfVar = (ehvf) ahknVar19.aK.b();
                ahnh ahnhVar16 = ahknVar19.a;
                return ehju.a(ehfnVar, ehezVar, ehvfVar, ekgp.k(), (Executor) ahnhVar16.j.b(), (eheg) ahnhVar16.tL.b(), ahknVar19.er());
            case 1139:
                return esnz.a(this.a.a.mR(), ekhx.q());
            case 1140:
                ahnh ahnhVar17 = this.a.a;
                return esqb.a(ahnhVar17.tR.b(), ahnhVar17.rH());
            case 1141:
                ahkn ahknVar20 = this.a;
                Context context2 = (Context) ahknVar20.t.b();
                ahnh ahnhVar18 = ahknVar20.a;
                Set setRL = ahnhVar18.rL();
                ekhx ekhxVarQ = ekhx.q();
                ejwi ejwiVarJ = ejwi.j(ahnhVar18.mS());
                eyik eyikVar6 = ahknVar20.eq;
                eyif eyifVar = eyim.a;
                return new esqe(context2, setRL, ekhxVarQ, ejwiVarJ, eyikVar6);
            case 1142:
                return fawg.a(this.a.a.oZ());
            case 1143:
                return favw.a(this.a.a.oW());
            case 1144:
                ahkn ahknVar21 = this.a;
                return aixi.a((ajfv) ahknVar21.aq.b(), Optional.of((dzro) ahknVar21.a.tS.b()));
            case 1145:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar19 = ahknVar22.a;
                return new aikp(ahnhVar19.rd, ahnhVar19.sh, ahknVar22.da, ahnhVar19.pf);
            case 1146:
                return new esqh(this.a.a.tV);
            case 1147:
                ahnh ahnhVar20 = this.a.a;
                return esqc.a(ahnhVar20.tR.b(), ahnhVar20.rH());
            case 1148:
                final eyik eyikVar7 = this.a.a.oO;
                return new aqtf() { // from class: aqrr
                    @Override // defpackage.aqtf
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.retry_tachyon_calls_on_unavailable");
                    }
                };
            case 1149:
                return ejwi.j(this.a.a.pn());
            case 1150:
                ahkn ahknVar23 = this.a;
                return ehrz.a(eyht.a(ahknVar23.c), (ScheduledExecutorService) ahknVar23.y.b(), ahknVar23.a.lY(), (ehrw) ahknVar23.eu.b());
            case 1151:
                ahkn ahknVar24 = this.a;
                return new ccrj((Context) ahknVar24.t.b(), ahknVar24.a.ub, ahknVar24.ev);
            case 1152:
                ahnh ahnhVar21 = this.a.a;
                return new cbqh(ahnhVar21.rc, ahnhVar21.rz());
            case 1153:
                return new ahmv(this);
            case 1154:
                return new ahmw(this);
            case 1155:
                return new cbun(this.a.a.gY());
            case 1156:
                return new ahmx(this);
            case 1157:
                return new ccob(this.a.a.ug);
            case 1158:
                ahkn ahknVar25 = this.a;
                return new coha((Context) ahknVar25.t.b(), (fdjx) ahknVar25.a.m.b(), (cogw) ahknVar25.cD.b());
            case 1159:
                return new ahmy(this);
            case 1160:
                return Long.valueOf(faqn.a(this.a.a.ow()));
            case 1161:
                final eyik eyikVar8 = this.a.a.oO;
                return new arny() { // from class: arne
                    @Override // defpackage.arny
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.run_mls_tests_from_synclet");
                    }
                };
            case 1162:
                return new ahko(this);
            case 1163:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar22 = ahknVar26.a;
                return new ccoh(ahknVar26.ez, ahnhVar22.uJ, ahnhVar22.zP);
            case 1164:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar23 = ahknVar27.a;
                return new baxe(ahnhVar23.qo, ahnhVar23.yx, ahnhVar23.uE, ahknVar27.ie, ahnhVar23.zP, ahnhVar23.sL, ahnhVar23.qq, ahnhVar23.uI, ahnhVar23.Xg, ahnhVar23.qi, ahnhVar23.un, ahnhVar23.HP, ahknVar27.kx, ahnhVar23.Xh, ahnhVar23.tA);
            case 1165:
                ahkn ahknVar28 = this.a;
                eyik eyikVar9 = ahknVar28.t;
                ahnh ahnhVar24 = ahknVar28.a;
                return new baho(eyikVar9, ahknVar28.cD, ahnhVar24.un, ahnhVar24.yx, ahnhVar24.Ci, ahnhVar24.Xd, ahnhVar24.qi, ahnhVar24.pT, ahnhVar24.QM, ahknVar28.no, ahnhVar24.Xf, ahnhVar24.qG);
            case 1166:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar25 = ahknVar29.a;
                return new bahw(ahknVar29.eB, ahknVar29.eC, ahnhVar25.um, ahnhVar25.un, ahnhVar25.xi, ahknVar29.cD, ahknVar29.gF, ahknVar29.t, ahknVar29.ic, ahknVar29.lA, ahknVar29.kd, ahknVar29.lB, ahknVar29.y, ahnhVar25.Dk, ahnhVar25.Dn, ahnhVar25.JL);
            case 1167:
                ahkn ahknVar30 = this.a;
                return new cmtv(ahknVar30.a.pB, ahknVar30.cU);
            case 1168:
                ahkn ahknVar31 = this.a;
                Context context3 = (Context) ahknVar31.t.b();
                ahnh ahnhVar26 = ahknVar31.a;
                return new cqsu(context3, (cpeo) ahnhVar26.CO.b(), eyie.a(ahnhVar26.Xc));
            case 1169:
                ahnh ahnhVar27 = this.a.a;
                return new cpeo(ahnhVar27.Xa, ahnhVar27.c);
            case 1170:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar28 = ahknVar32.a;
                return ekhx.v((cqci) ahnhVar28.qo.b(), (cqci) ahnhVar28.pB.b(), (cqci) ahknVar32.eF.b(), (cqci) ahnhVar28.up.b(), ahnhVar28.pR(), (cqci) ahnhVar28.ur.b(), (cqci) ahnhVar28.sD.b(), (cqci) ahnhVar28.sE.b(), (cqci) ahnhVar28.us.b(), (cqci) ahnhVar28.WY.b(), (cqci) ahknVar32.dg.b(), (cqci) ahnhVar28.GY.b(), ahnhVar28.lA(), (cqci) ahknVar32.kx.b(), (cqci) ahknVar32.nw.b(), (cqci) ahnhVar28.qx.b(), (cqci) ahnhVar28.WZ.b(), (cqci) ahnhVar28.Mv.b(), (cqci) ahnhVar28.uy.b(), (cqci) ahnhVar28.DE.b(), (cqci) ahnhVar28.Cl.b());
            case 1171:
                ahkn ahknVar33 = this.a;
                return new cvjl((Context) ahknVar33.t.b(), ahknVar33.eG);
            case 1172:
                return new cssf((Context) this.a.t.b());
            case 1173:
                ahkn ahknVar34 = this.a;
                return bwvv.a((Context) ahknVar34.t.b(), (eosc) ahknVar34.eI.b(), eyie.a(ahknVar34.a.qQ));
            case 1174:
                ahkn ahknVar35 = this.a;
                return new cnrp((avoj) ahknVar35.cT.b(), ahknVar35.a.qi);
            case 1175:
                ahkn ahknVar36 = this.a;
                return aiog.a(ahknVar36.a.c, ahknVar36.ac());
            case 1176:
                ahkn ahknVar37 = this.a;
                return new avne((avmr) ahknVar37.a.ux.b(), (cogw) ahknVar37.cD.b());
            case 1177:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar29 = ahknVar38.a;
                return new avmy(ahknVar38.cQ, ahnhVar29.uv, ahknVar38.nF, ahnhVar29.Gp, ahnhVar29.WX, ahnhVar29.pQ, Optional.empty(), (apsl) ahnhVar29.Dk.b(), ahnhVar29.Dn, (Context) ahknVar38.t.b());
            case 1178:
                ahkn ahknVar39 = this.a;
                Context context4 = (Context) ahknVar39.t.b();
                ahnh ahnhVar30 = ahknVar39.a;
                egxv egxvVar = (egxv) ahnhVar30.ut.b();
                cogw cogwVar = (cogw) ahknVar39.cD.b();
                eyik eyikVar10 = ahnhVar30.pf;
                eyik eyikVar11 = ahnhVar30.us;
                eyik eyikVar12 = ahnhVar30.uu;
                eyik eyikVar13 = ahnhVar30.DC;
                eyik eyikVar14 = ahnhVar30.uy;
                eyik eyikVar15 = ahnhVar30.Ck;
                eyik eyikVar16 = ahnhVar30.vj;
                eyik eyikVar17 = ahnhVar30.pB;
                eyik eyikVar18 = ahnhVar30.pE;
                eyik eyikVar19 = ahnhVar30.OK;
                eyik eyikVar20 = ahknVar39.nE;
                eyik eyikVar21 = ahnhVar30.zP;
                eyik eyikVar22 = ahnhVar30.uE;
                eyik eyikVar23 = ahnhVar30.uJ;
                eyik eyikVar24 = ahnhVar30.ww;
                eyik eyikVar25 = ahnhVar30.AG;
                eyik eyikVar26 = ahnhVar30.Dp;
                eyik eyikVar27 = ahnhVar30.Ci;
                eyik eyikVar28 = ahnhVar30.DB;
                eyik eyikVar29 = ahnhVar30.qq;
                eyik eyikVar30 = ahnhVar30.uD;
                eyik eyikVar31 = ahnhVar30.WV;
                eyik eyikVar32 = ahnhVar30.c;
                eyik eyikVar33 = ahnhVar30.WW;
                Optional optional = (Optional) ahknVar39.kd.b();
                eyik eyikVar34 = ahnhVar30.Dn;
                eosc eoscVar4 = (eosc) ahknVar39.y.b();
                eosc eoscVar5 = (eosc) ahknVar39.aJ.b();
                eyik eyikVar35 = ahnhVar30.qi;
                eyik eyikVar36 = ahnhVar30.qG;
                eyik eyikVar37 = ahknVar39.eL;
                eyik eyikVar38 = ahnhVar30.qN;
                eyik eyikVar39 = ahnhVar30.pV;
                eyik eyikVar40 = ahnhVar30.VN;
                eyik eyikVar41 = ahknVar39.ns;
                apsl apslVar = (apsl) ahnhVar30.Dk.b();
                eyik eyikVar42 = ahnhVar30.AE;
                return new cmrl(context4, egxvVar, ahknVar39.da, cogwVar, eyikVar10, eyikVar11, eyikVar12, ahknVar39.cQ, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, optional, eyikVar34, ahknVar39.cP, eoscVar4, eoscVar5, eyikVar35, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, apslVar, eyikVar42);
            case 1179:
                ahkn ahknVar40 = this.a;
                egrq egrqVarEj = ahknVar40.ej();
                Context context5 = (Context) ahknVar40.t.b();
                eosc eoscVar6 = (eosc) ahknVar40.aJ.b();
                return new egxv(egrqVarEj, context5, eoscVar6);
            case 1180:
                ahkn ahknVar41 = this.a;
                Context context6 = (Context) ahknVar41.t.b();
                ahnh ahnhVar31 = ahknVar41.a;
                return new chwk(context6, (dqsn) ahnhVar31.qq.b(), ahnhVar31.uu, ahknVar41.cQ, (cqmr) ahknVar41.eK.b(), ahnhVar31.uD, ahnhVar31.uE, ahnhVar31.uJ, ahnhVar31.ww, ahnhVar31.AG, ahnhVar31.uv, ahnhVar31.us, ahknVar41.nC, ahnhVar31.yx, (Optional) ahknVar41.kd.b(), (Optional) ahknVar41.ku.b(), (eosc) ahknVar41.aJ.b(), ahnhVar31.HP, (chxp) ahknVar41.nD.b(), ahknVar41.cO, ahnhVar31.pR, ahnhVar31.qi, ahnhVar31.uy, ahnhVar31.Jh, ahnhVar31.WR, ahnhVar31.WS, ahnhVar31.yp, (eosc) ahknVar41.p.b(), (apsl) ahnhVar31.Dk.b(), ahnhVar31.Dn, ahnhVar31.WT, ahnhVar31.WU);
            case 1181:
                ahkn ahknVar42 = this.a;
                Context context7 = (Context) ahknVar42.t.b();
                ahnh ahnhVar32 = ahknVar42.a;
                return new ceae(context7, (aipo) ahnhVar32.us.b(), (cogw) ahknVar42.cD.b(), (cmot) ahnhVar32.uy.b(), (cmvy) ahnhVar32.pE.b(), ahnhVar32.uB, ahnhVar32.pQ, ahnhVar32.uC);
            case 1182:
                ahkn ahknVar43 = this.a;
                Context context8 = (Context) ahknVar43.t.b();
                ahnh ahnhVar33 = ahknVar43.a;
                return new cmox(context8, ahnhVar33.sL, ahnhVar33.uv, ahnhVar33.c, ahnhVar33.uw, ahnhVar33.ux, ahknVar43.eL, ahnhVar33.pV);
            case 1183:
                return new cmow(this.a.a.sL);
            case 1184:
                ahnh ahnhVar34 = this.a.a;
                return new cmte(ahnhVar34.uz, ahnhVar34.uA, (fdjx) ahnhVar34.oQ.b(), ahnhVar34.cE());
            case 1185:
                ahkn ahknVar44 = this.a;
                Object objEZ = ahknVar44.eZ();
                Context context9 = (Context) ahknVar44.t.b();
                ejxr ejxrVar = (ejxr) ahknVar44.dp.b();
                cogw cogwVar2 = (cogw) ahknVar44.cD.b();
                ahnh ahnhVar35 = ahknVar44.a;
                return aimq.a(objEZ, context9, ejxrVar, cogwVar2, ahnhVar35.qY, (aipj) ahnhVar35.rb.b(), (Executor) ahknVar44.p.b());
            case 1186:
                ahkn ahknVar45 = this.a;
                Object objEZ2 = ahknVar45.eZ();
                Context context10 = (Context) ahknVar45.t.b();
                ejxr ejxrVar2 = (ejxr) ahknVar45.dp.b();
                cogw cogwVar3 = (cogw) ahknVar45.cD.b();
                ahnh ahnhVar36 = ahknVar45.a;
                return aims.a(objEZ2, context10, ejxrVar2, cogwVar3, ahnhVar36.qY, (aipj) ahnhVar36.rb.b(), (Executor) ahknVar45.p.b());
            case 1187:
                final eyik eyikVar43 = this.a.a.oO;
                return new aqdy() { // from class: aqdw
                    @Override // defpackage.aqdy
                    public final boolean a() {
                        return ((eoth) eyikVar43.b()).a("bugle.disable_drm_mms");
                    }
                };
            case 1188:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar37 = ahknVar46.a;
                return new bbae(ahknVar46.t, ahnhVar37.un, ahnhVar37.uG, ahnhVar37.uI, ahnhVar37.qq);
            case 1189:
                ahnh ahnhVar38 = this.a.a;
                return new awlc(ahnhVar38.uF, (fdjx) ahnhVar38.m.b());
            case 1190:
                ahnh ahnhVar39 = this.a.a;
                return ekhx.r(ahnhVar39.pH(), ahnhVar39.I());
            case 1191:
                ahkn ahknVar47 = this.a;
                Context context11 = (Context) ahknVar47.t.b();
                ahnh ahnhVar40 = ahknVar47.a;
                return new bxlc(context11, (dqsn) ahnhVar40.qq.b(), (egzh) ahknVar47.aQ.b(), Optional.of(ahnhVar40.qH), ahnhVar40.uH, ahknVar47.dh, (eosc) ahknVar47.aJ.b(), (eosc) ahknVar47.p.b());
            case 1192:
                return new caxb(this.a.a.rF);
            case 1193:
                ahkn ahknVar48 = this.a;
                Context context12 = (Context) ahknVar48.t.b();
                ahnh ahnhVar41 = ahknVar48.a;
                return new baqi(context12, ahnhVar41.qG, (dqsn) ahnhVar41.qq.b(), ahnhVar41.GT, ahnhVar41.uJ, ahnhVar41.sL, ahnhVar41.WQ, (cogw) ahknVar48.cD.b(), (bxlc) ahnhVar41.uI.b(), ahnhVar41.bh(), ahnhVar41.bj(), ahknVar48.it, (aqhc) ahnhVar41.QL.b());
            case 1194:
                ahnh ahnhVar42 = this.a.a;
                return new cpgh(ahnhVar42.sL, ahnhVar42.uL, ahnhVar42.uN, (bxlc) ahnhVar42.uI.b(), (aypj) ahnhVar42.Cg.b(), (dqsn) ahnhVar42.qq.b(), ahnhVar42.Js, (aijz) ahnhVar42.WP.b(), ahnhVar42.lu());
            case 1195:
                ahnh ahnhVar43 = this.a.a;
                return new bare(ahnhVar43.sL, (dqsn) ahnhVar43.qq.b(), ahnhVar43.uK);
            case 1196:
                return new cawk(this.a.a.rF);
            case 1197:
                ahkn ahknVar49 = this.a;
                ahnh ahnhVar44 = ahknVar49.a;
                return new cpgj(ahnhVar44.rc, ahnhVar44.uM, ahknVar49.eO, (fdjx) ahnhVar44.oS.b());
            case 1198:
                ahkn ahknVar50 = this.a;
                return new aika(ahknVar50.eM, ahknVar50.eN);
            case 1199:
                ahkn ahknVar51 = this.a;
                eyik eyikVar44 = ahknVar51.t;
                ahnh ahnhVar45 = ahknVar51.a;
                return new axsc(eyikVar44, ahknVar51.cD, ahnhVar45.pB, ahnhVar45.c, ahnhVar45.yw, ahnhVar45.uv, ahnhVar45.qq, ahnhVar45.pE, ahnhVar45.Nz, ahnhVar45.Dp, ahnhVar45.NH, ahnhVar45.wv, ahnhVar45.sL, ahnhVar45.JE, ahnhVar45.Js, ahnhVar45.qr, ahnhVar45.uM, ahnhVar45.qG, ahnhVar45.WN, ahnhVar45.WO);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 1200:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                eyik eyikVar = ahnhVar.se;
                Context context = (Context) ahknVar.t.b();
                eyik eyikVar2 = ahknVar.eP;
                eyik eyikVar3 = ahnhVar.uO;
                eyik eyikVar4 = ahnhVar.sL;
                eyik eyikVar5 = ahnhVar.uQ;
                eyik eyikVar6 = ahnhVar.uJ;
                eyik eyikVar7 = ahnhVar.qi;
                eyik eyikVar8 = ahnhVar.qr;
                eyik eyikVar9 = ahnhVar.rc;
                eyik eyikVar10 = ahnhVar.uR;
                eyik eyikVar11 = ahnhVar.c;
                eyik eyikVar12 = ahnhVar.vi;
                eyik eyikVar13 = ahknVar.gF;
                eyik eyikVar14 = ahnhVar.vh;
                eyik eyikVar15 = ahnhVar.uM;
                eyik eyikVar16 = ahnhVar.vl;
                eygg eyggVarA = eyie.a(ahnhVar.vn);
                eygg eyggVarA2 = eyie.a(ahknVar.dn);
                eyik eyikVar17 = ahnhVar.Cb;
                eyik eyikVar18 = ahnhVar.BI;
                eyik eyikVar19 = ahnhVar.qG;
                eygg eyggVarA3 = eyie.a(ahnhVar.Ar);
                cogw cogwVar = (cogw) ahknVar.cD.b();
                eyik eyikVar20 = ahnhVar.Wr;
                eyie.a(ahknVar.nx);
                eyie.a(ahnhVar.Wt);
                eygg eyggVarA4 = eyie.a(ahnhVar.Wv);
                eosc eoscVar = (eosc) ahknVar.aJ.b();
                eosc eoscVar2 = (eosc) ahknVar.p.b();
                eigp eigpVar = (eigp) ahknVar.aI.b();
                eygg eyggVarA5 = eyie.a(ahnhVar.Ww);
                asrf asrfVar = (asrf) ahnhVar.rl.b();
                eyik eyikVar21 = ahnhVar.tG;
                eyik eyikVar22 = ahnhVar.WD;
                ahnhVar.si();
                eyik eyikVar23 = ahknVar.eO;
                ajjt ajjtVar = (ajjt) ahknVar.my.b();
                eyik eyikVar24 = ahnhVar.sh;
                aqbh aqbhVar = (aqbh) ahnhVar.qa.b();
                eyik eyikVar25 = ahnhVar.rk;
                eyik eyikVar26 = ahnhVar.WE;
                eyik eyikVar27 = ahnhVar.FF;
                eyik eyikVar28 = ahnhVar.xI;
                eyik eyikVar29 = ahnhVar.WG;
                eyik eyikVar30 = ahnhVar.WL;
                eyik eyikVar31 = ahnhVar.pl;
                eyik eyikVar32 = ahnhVar.WM;
                eyik eyikVar33 = ahnhVar.TL;
                eyik eyikVar34 = ahnhVar.Uh;
                return new ajjf(eyikVar, context, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, ahknVar.aT, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyggVarA, eyggVarA2, eyikVar17, eyikVar18, eyikVar19, ahknVar.cU, eyggVarA3, cogwVar, eyikVar20, eyggVarA4, eoscVar, eoscVar2, eigpVar, eyggVarA5, asrfVar, eyikVar21, eyikVar22, eyikVar23, ajjtVar, eyikVar24, aqbhVar, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, eyikVar34);
            case 1201:
                return bwvw.a(this.a.a.uq);
            case 1202:
                return new bapl(this.a.a.uP);
            case 1203:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new aiko(ahknVar2.aS, ahnhVar2.pf, ahnhVar2.sL, ahknVar2.aO, ahknVar2.cI, ahnhVar2.rd);
            case 1204:
                ahkn ahknVar3 = this.a;
                return new ajft(ahknVar3.a.vh, ahknVar3.aq);
            case 1205:
                return new ajfo((dzfj) this.a.a.vg.b());
            case 1206:
                dzfj dzfjVar = (dzfj) this.a.a.vf.b();
                dzff.a(dzfjVar);
                return dzfjVar;
            case 1207:
                ahkn ahknVar4 = this.a;
                return dzfg.a(ahknVar4.a.ve, ahknVar4.B);
            case 1208:
                ahkn ahknVar5 = this.a;
                dzfu dzfuVar = (dzfu) ahknVar5.aa.b();
                ahnh ahnhVar3 = ahknVar5.a;
                eyik eyikVar35 = ahnhVar3.vc;
                eyik eyikVar36 = ahnhVar3.uZ;
                eyik eyikVar37 = ahknVar5.gw;
                return new dzfl(dzfuVar, eyikVar35, eyikVar36, eyikVar37, eyikVar37, ahnhVar3.vd, ahknVar5.cE, ahknVar5.aw, ahnhVar3.mz());
            case 1209:
                ahkn ahknVar6 = this.a;
                ekhv ekhvVarI = ekhx.i(14);
                ekhvVarI.j(ahknVar6.fU());
                ekhvVarI.j(ahknVar6.fQ());
                ahnh ahnhVar4 = ahknVar6.a;
                ekhvVarI.j(ahnhVar4.rp());
                ekhvVarI.j(ahkn.iF());
                ekhvVarI.j(ahknVar6.fT());
                ekhvVarI.j(ahnhVar4.rq());
                ekhvVarI.j(ahnhVar4.rr());
                ekhvVarI.j(ahkn.iE());
                ekhvVarI.j(ahknVar6.fY());
                ekhvVarI.j(ahknVar6.fZ());
                ekhvVarI.j(ahknVar6.ga());
                ekhvVarI.c(ahknVar6.dS());
                ekhvVarI.c((dzlo) ahknVar6.gw.b());
                ekhvVarI.c(ahknVar6.fw());
                return ekhvVarI.g();
            case 1210:
                ahkn ahknVar7 = this.a;
                return aixg.a(Optional.of((dzke) ahknVar7.a.tS.b()));
            case 1211:
                ahkn ahknVar8 = this.a;
                dzln dzlnVar = (dzln) ahknVar8.ak.b();
                Context context2 = (Context) ahknVar8.t.b();
                dzjh dzjhVar = (dzjh) ahknVar8.E.b();
                dzjd dzjdVar = (dzjd) ahknVar8.eW.b();
                eosd eosdVar = (eosd) ahknVar8.A.b();
                ahnh ahnhVar5 = ahknVar8.a;
                return new dzkh(dzlnVar, context2, dzjhVar, dzjdVar, eosdVar, eyie.a(ahnhVar5.uT), (dzkt) ahknVar8.fx(), ahnhVar5.uU, ahknVar8.fC, (Executor) ahknVar8.H.b());
            case 1212:
                return dzex.a(ejwi.j(this.a.a.uS));
            case 1213:
                ahkn ahknVar9 = this.a;
                String str = (String) ahknVar9.R.b();
                Object objFz = ahknVar9.fz();
                diep diepVar = (diep) ahknVar9.ab.b();
                eyik eyikVar38 = ahknVar9.a.uT;
                return new dzka(str, (dzku) objFz, diepVar, eyikVar38);
            case 1214:
                ahkn ahknVar10 = this.a;
                return aixh.a(Optional.of((ailg) ahknVar10.a.tS.b()));
            case 1215:
                ahkn ahknVar11 = this.a;
                dzln dzlnVar2 = (dzln) ahknVar11.ak.b();
                Executor executor = (Executor) ahknVar11.H.b();
                ahnh ahnhVar6 = ahknVar11.a;
                eygg eyggVarA6 = eyie.a(ahnhVar6.uX);
                ejwi ejwiVarJ = ejwi.j(ahknVar11.fS);
                dzjh dzjhVar2 = (dzjh) ahknVar11.E.b();
                dzjd dzjdVar2 = (dzjd) ahknVar11.eW.b();
                dzvq dzvqVarDU = ahknVar11.dU();
                eyik eyikVar39 = ahknVar11.fT;
                eyik eyikVar40 = ahknVar11.fU;
                eyik eyikVar41 = ahknVar11.fV;
                Object objPI = ahnhVar6.pI();
                Object objFd = ahknVar11.fd();
                return new dznj(dzlnVar2, executor, eyggVarA6, ejwiVarJ, dzjhVar2, dzjdVar2, dzvqVarDU, eyikVar39, eyikVar40, eyikVar41, (dzmw) objPI, (dznd) objFd, ejwi.j((dzik) ahknVar11.W.b()), ahknVar11.fX, ahknVar11.fY, ahknVar11.dR());
            case 1216:
                return dzey.a(ejwi.j(this.a.a.uW));
            case 1217:
                ahkn ahknVar12 = this.a;
                dzln dzlnVar3 = (dzln) ahknVar12.ak.b();
                Context context3 = (Context) ahknVar12.t.b();
                dzjd dzjdVar3 = (dzjd) ahknVar12.eW.b();
                eosd eosdVar2 = (eosd) ahknVar12.A.b();
                ahnh ahnhVar7 = ahknVar12.a;
                return new dzru(dzlnVar3, context3, dzjdVar3, eosdVar2, eyie.a(ahnhVar7.uZ), eyie.a(ahnhVar7.va), ahknVar12.ga, (Executor) ahknVar12.H.b(), (dzjt) ahknVar12.fW.b());
            case 1218:
                return dzez.a(ejwi.j(this.a.a.tT));
            case 1219:
                return new dzrn(this.a.a.uZ);
            case 1220:
                ahnh ahnhVar8 = this.a.a;
                ejwi.j(ahnhVar8.uS);
                return dzkr.a(ahnhVar8.uV);
            case 1221:
                ahnh ahnhVar9 = this.a.a;
                ejwi.j(ahnhVar9.tT);
                return dzrw.a(ahnhVar9.vb);
            case 1222:
                ahkn ahknVar13 = this.a;
                Context context4 = (Context) ahknVar13.t.b();
                ahnh ahnhVar10 = ahknVar13.a;
                return new aixn(context4, (cqbm) ahnhVar10.sX.b(), ahnhVar10.vj, ahnhVar10.pf, ahnhVar10.vk);
            case 1223:
                ahnh ahnhVar11 = this.a.a;
                return new cmtt(ahnhVar11.pB, ahnhVar11.pf);
            case 1224:
                final eyik eyikVar42 = this.a.a.oO;
                return new aqdb() { // from class: aqcz
                    @Override // defpackage.aqdb
                    public final boolean a() {
                        return ((eoth) eyikVar42.b()).a("bugle.log_mcc_mnc_of_current_active_network");
                    }
                };
            case 1225:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar12 = ahknVar14.a;
                return new aimw((crny) ahnhVar12.pf.b(), (dhes) ahknVar14.aP.b(), ahknVar14.V(), (cmlb) ahnhVar12.rd.b(), ahnhVar12.vm);
            case 1226:
                final eyik eyikVar43 = this.a.a.oO;
                return new aqsn() { // from class: aqqi
                    @Override // defpackage.aqsn
                    public final boolean a() {
                        return ((eoth) eyikVar43.b()).a("bugle.enable_get_mvno_by_sub_id");
                    }
                };
            case 1227:
                ahkn ahknVar15 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar15.cz.b();
                ahnh ahnhVar13 = ahknVar15.a;
                return new crgm(fcyhVar, ahknVar15.cD, ahnhVar13.uJ, ahnhVar13.zP, ahknVar15.aN, ahnhVar13.BQ, ahnhVar13.Wq);
            case 1228:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar14 = ahknVar16.a;
                return new bbca(Optional.of(ahnhVar14.wt), Optional.of(ahnhVar14.Ac), ahnhVar14.bv(), ahnhVar14.pE, ahnhVar14.qG, ahnhVar14.Ad, ahnhVar14.qq, ahknVar16.nw, ahnhVar14.qs, ahnhVar14.Ab, ahnhVar14.uI, ahnhVar14.pV, ahnhVar14.Wo, (axjq) ahnhVar14.qz.b(), ahnhVar14.Ak, ahnhVar14.At);
            case 1229:
                ahkn ahknVar17 = this.a;
                return new csyt((eosc) ahknVar17.y.b(), ahknVar17.gH, ahknVar17.gJ, ahknVar17.a.qi);
            case 1230:
                return new acgu((drzc) this.a.a.wr.b());
            case 1231:
                ahkn ahknVar18 = this.a;
                String str2 = (String) ahknVar18.gK.b();
                eosc eoscVar3 = (eosc) ahknVar18.gL.b();
                ahknVar18.dP();
                return new drzf(str2, eoscVar3, eyie.a(ahknVar18.a.wp));
            case 1232:
                ahkn ahknVar19 = this.a;
                eygg eyggVarA7 = eyie.a(ahknVar19.a.wo);
                String str3 = (String) ahknVar19.gK.b();
                eyik eyikVar44 = ahknVar19.hU;
                eygg eyggVarA8 = eyie.a(ahknVar19.gR);
                eyie.a(ahknVar19.gT);
                acgr.a();
                eosc eoscVar4 = (eosc) ahknVar19.gL.b();
                eygg eyggVarA9 = eyie.a(ahknVar19.hg);
                ahknVar19.dP();
                return new dsdl(eyggVarA7, str3, eyikVar44, eyggVarA8, eoscVar4, eyggVarA9);
            case 1233:
                dsfr dsfrVar = (dsfr) this.a.a.wn.b();
                dsfs.a(dsfrVar);
                return dsfrVar;
            case 1234:
                ahkn ahknVar20 = this.a;
                dsgo dsgoVarMp = ahknVar20.a.mp();
                diep diepVar2 = (diep) ahknVar20.l.b();
                ahknVar20.dP();
                return new dsfr(dsgoVarMp, diepVar2, eyie.a(ahknVar20.hg), (String) ahknVar20.gK.b());
            case 1235:
                ahkn ahknVar21 = this.a;
                Context context5 = (Context) ahknVar21.t.b();
                String str4 = (String) ahknVar21.gK.b();
                dxgg dxggVar = (dxgg) ahknVar21.gY.b();
                dsah dsahVar = (dsah) ahknVar21.ht.b();
                ahnh ahnhVar15 = ahknVar21.a;
                eyik eyikVar45 = ahknVar21.hv;
                Set setRG = ahnhVar15.rG();
                dsnc dsncVar = (dsnc) ahnhVar15.vN.b();
                ahknVar21.dP();
                return new dspn(context5, str4, dxggVar, dsahVar, eyikVar45, setRG, dsncVar, (eosc) ahknVar21.gL.b(), (drzs) ahnhVar15.vO.b());
            case 1236:
                ahnh ahnhVar16 = this.a.a;
                return dsoc.a(ahnhVar16.mq(), (fdjx) ahnhVar16.m.b());
            case 1237:
                ahkn ahknVar22 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar22.bM.b();
                ahnh ahnhVar17 = ahknVar22.a;
                return new dsgy(fcyhVar2, (dxqr) ahnhVar17.vs.b(), acgr.a(), (dxrk) ahknVar22.ho.b(), (dxrk) ahknVar22.hq.b(), ahknVar22.iy(), (dxgg) ahknVar22.gZ.b(), (dxnh) ahknVar22.hl.b(), (dxui) ahnhVar17.vv.b(), ahknVar22.hz, (String) ahknVar22.gK.b(), eyie.a(ahknVar22.hg), (dsah) ahknVar22.ht.b());
            case 1238:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar18 = ahknVar23.a;
                return new dxrh(ahnhVar18.ms(), acgr.a(), ahknVar23.fC(), (dxlw) ahnhVar18.vq.b(), (Context) ahknVar23.t.b(), ahknVar23.fE(), (fcyh) ahknVar23.cA.b(), (fdjx) ahnhVar18.m.b());
            case 1239:
                return new dxxc((esmw) this.a.a.vo.b());
            case 1240:
                ahkn ahknVar24 = this.a;
                return esnk.a((eosc) ahknVar24.p.b(), (eosc) ahknVar24.y.b(), (eosc) ahknVar24.aJ.b(), ahknVar24.a.tU, ekhx.q());
            case 1241:
                return this.a.a.mt();
            case 1242:
                ahkn ahknVar25 = this.a;
                return new dxux((Context) ahknVar25.t.b(), acgr.a(), ejwi.j(new acgy()), ejwi.j((dxvw) ahknVar25.a.vu.b()), ahknVar25.dN(), (eosc) ahknVar25.hy.b(), ahknVar25.hz);
            case 1243:
                ahkn ahknVar26 = this.a;
                return new dsto((drzl) ahknVar26.a.vt.b(), (fcyh) ahknVar26.bM.b());
            case 1244:
                return this.a.a.mn();
            case 1245:
                ahkn ahknVar27 = this.a;
                return new dsqa((Context) ahknVar27.t.b(), (dxxd) ahknVar27.a.vA.b());
            case 1246:
                ahkn ahknVar28 = this.a;
                return new dxxd((ehrb) ahknVar28.hD.b(), (dxmt) ahknVar28.a.vz.b());
            case 1247:
                ahkn ahknVar29 = this.a;
                eosc eoscVar5 = (eosc) ahknVar29.hF.b();
                return new dxmx(eoscVar5);
            case 1248:
                ahnh ahnhVar19 = this.a.a;
                return new dxlx((dxlw) ahnhVar19.vq.b(), (fdjx) ahnhVar19.m.b());
            case 1249:
                ahkn ahknVar30 = this.a;
                dskl dsklVar = (dskl) ahknVar30.hG.b();
                eosc eoscVar6 = (eosc) ahknVar30.hF.b();
                acgs.a();
                return new dstm(dsklVar, eoscVar6, (diep) ahknVar30.l.b(), ahknVar30.dP(), (fdjx) ahknVar30.a.m.b(), (fcyh) ahknVar30.bM.b());
            case 1250:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar20 = ahknVar31.a;
                return new dxoq(ejwi.j((dxvw) ahnhVar20.vu.b()), ejwi.j(new acgy()), (dxud) ahnhVar20.vG.b(), ahnhVar20.mx(), ahnhVar20.mw(), (dxnh) ahknVar31.hl.b(), (fcyh) ahknVar31.cz.b(), ahknVar31.iy(), ahknVar31.iz(), (dxni) ahnhVar20.vH.b(), (dxml) ahnhVar20.vM.b(), (dxmn) ahknVar31.hK.b(), (dxpf) ahnhVar20.vI.b(), ahknVar31.dM(), (diep) ahknVar31.l.b(), acgr.a(), ahknVar31.hI, (dxmz) ahknVar31.hk.b(), (Context) ahknVar31.t.b(), (dxtx) ahknVar31.hg.b(), ahnhVar20.mv(), ahknVar31.hz, ahknVar31.hL);
            case 1251:
                ahkn ahknVar32 = this.a;
                return new dxud(ahknVar32.a.mx(), (fcyh) ahknVar32.cz.b());
            case 1252:
                ahkn ahknVar33 = this.a;
                return dxse.a((dxrk) ahknVar33.ho.b(), (fdjx) ahknVar33.a.oS.b());
            case 1253:
                ahkn ahknVar34 = this.a;
                return dxsd.a((dxrk) ahknVar34.hq.b(), (fdjx) ahknVar34.a.oS.b());
            case 1254:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar21 = ahknVar35.a;
                return new dxnz((dxqr) ahnhVar21.vs.b(), ahnhVar21.mx(), ahknVar35.iy(), ahknVar35.iz(), (fcyh) ahknVar35.bM.b(), (fcyh) ahknVar35.cz.b(), (dxtx) ahknVar35.hg.b(), (Context) ahknVar35.t.b(), (diep) ahknVar35.l.b(), ahknVar35.hI);
            case 1255:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar22 = ahknVar36.a;
                return new dxpb((dxni) ahnhVar22.vH.b(), (dxrk) ahknVar36.hq.b(), (fcyh) ahknVar36.cz.b(), (dxpf) ahnhVar22.vI.b(), ahknVar36.iy(), ahnhVar22.mw(), (dxtx) ahknVar36.hg.b(), (Context) ahknVar36.t.b(), ahknVar36.dM(), (dxmz) ahknVar36.hk.b(), (dxnh) ahknVar36.hl.b(), (dxmn) ahknVar36.hK.b(), ahnhVar22.mu(), acgr.a(), ahnhVar22.mv());
            case 1256:
                ahkn ahknVar37 = this.a;
                return new dxpf(ahknVar37.a.mx(), (fcyh) ahknVar37.cz.b());
            case 1257:
                ahkn ahknVar38 = this.a;
                return new dxwk((dxnl) ahknVar38.a.vJ.b(), (fcyh) ahknVar38.cz.b(), ahknVar38.iy(), (Context) ahknVar38.t.b(), new dxvf(), ((Boolean) ahknVar38.hL.b()).booleanValue(), ahknVar38.hz);
            case 1258:
                ahkn ahknVar39 = this.a;
                return new dxkw((diep) ahknVar39.l.b(), acgr.a(), (dxlf) ahknVar39.hm.b(), (dxqt) ahknVar39.hO.b(), (dxui) ahknVar39.a.vv.b());
            case 1259:
                ahkn ahknVar40 = this.a;
                return dsaa.a(ahknVar40.dG(), (fdjx) ahknVar40.a.oQ.b());
            case 1260:
                ahkn ahknVar41 = this.a;
                return new dsfi(ahknVar41.a.qS(), ahknVar41.hv, (eosc) ahknVar41.gL.b(), ahknVar41.dP());
            case 1261:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar23 = ahknVar42.a;
                aspp asppVar = (aspp) ahnhVar23.qX.b();
                return new aspu(asppVar, (eosc) ahknVar42.p.b(), (aspz) ahnhVar23.vR.b(), ahknVar42.aS, (crmx) ahnhVar23.pB.b());
            case 1262:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar24 = ahknVar43.a;
                return new aspz(ahnhVar24.qr, (eosc) ahknVar43.y.b(), (ains) ahnhVar24.c.b());
            case 1263:
                ahnh ahnhVar25 = this.a.a;
                return ekhx.r(ahnhVar25.eG(), ahnhVar25.hw());
            case 1264:
                final eyik eyikVar46 = this.a.a.oO;
                return new apro() { // from class: aowu
                    @Override // defpackage.apro
                    public final boolean a() {
                        return ((eoth) eyikVar46.b()).a("bugle.block_ditto_for_dune_satellite");
                    }
                };
            case 1265:
                ahkn ahknVar44 = this.a;
                return new cdni((cdmo) ahknVar44.hR.b(), (cdnb) ahknVar44.a.vW.b());
            case 1266:
                ahkn ahknVar45 = this.a;
                fcyh fcyhVar3 = (fcyh) ahknVar45.cA.b();
                ahnh ahnhVar26 = ahknVar45.a;
                return new cdnb(fcyhVar3, ahnhVar26.kq(), (asjn) ahnhVar26.vU.b(), (aptm) ahnhVar26.vV.b());
            case 1267:
                final eyik eyikVar47 = this.a.a.oO;
                return new asjn() { // from class: asja
                    @Override // defpackage.asjn
                    public final boolean a() {
                        return ((eoth) eyikVar47.b()).a("bugle.hide_untrusted_conversations_on_p11");
                    }
                };
            case 1268:
                final eyik eyikVar48 = this.a.a.oO;
                return new aptm() { // from class: aozu
                    @Override // defpackage.aptm
                    public final boolean a() {
                        return ((eoth) eyikVar48.b()).a("bugle.enable_trusted_contacts_semi_trusted_update");
                    }
                };
            case 1269:
                return Optional.of(this.a.a.M());
            case 1270:
                ahkn ahknVar46 = this.a;
                cogw cogwVar2 = (cogw) ahknVar46.cD.b();
                ahnh ahnhVar27 = ahknVar46.a;
                return new bvkr(cogwVar2, ahnhVar27.uI, ahknVar46.hS, (eosc) ahknVar46.y.b(), (crqv) ahknVar46.aT.b(), (egej) ahnhVar27.pI.b(), ahknVar46.dh, ahnhVar27.vZ);
            case 1271:
                return Long.valueOf(fame.a(this.a.a.oa()));
            case 1272:
                return Boolean.valueOf(famg.a(this.a.a.oa()));
            case 1273:
                return Boolean.valueOf(famf.a(this.a.a.oa()));
            case 1274:
                ahkn ahknVar47 = this.a;
                eyik eyikVar49 = ahknVar47.dj;
                cmfo cmfoVarKk = ahknVar47.a.kk();
                return new cdre(cmfoVarKk, (eosc) ahknVar47.p.b());
            case 1275:
                ahkn ahknVar48 = this.a;
                return new drzp(ahknVar48.dF(), (fdjx) ahknVar48.a.oQ.b());
            case 1276:
                ahnh ahnhVar28 = this.a.a;
                return dsfn.a(ahnhVar28.mo(), (fdjx) ahnhVar28.m.b());
            case 1277:
                ahnh ahnhVar29 = this.a.a;
                return new dsoz(ahnhVar29.rM(), (dsom) ahnhVar29.wj.b());
            case 1278:
                ahnh ahnhVar30 = this.a.a;
                return dsow.a((dsoj) ahnhVar30.wi.b(), (fdjx) ahnhVar30.m.b());
            case 1279:
                ahkn ahknVar49 = this.a;
                return new dspd((fcyh) ahknVar49.cz.b(), eyie.a(ahknVar49.hg), (String) ahknVar49.gK.b(), (dsbr) ahknVar49.hc.b(), (dsah) ahknVar49.ht.b(), (dsoq) ahknVar49.a.vQ.b(), ahknVar49.hv);
            case 1280:
                ahkn ahknVar50 = this.a;
                ahnh ahnhVar31 = ahknVar50.a;
                return new dsps((dsoj) ahnhVar31.wi.b(), (fdjx) ahnhVar31.oQ.b(), (dsoq) ahnhVar31.vQ.b(), (dsah) ahknVar50.ht.b());
            case 1281:
                ahkn ahknVar51 = this.a;
                dcsx dcsxVar = (dcsx) ahknVar51.gI.b();
                ahnh ahnhVar32 = ahknVar51.a;
                return new csxg(dcsxVar, (fdjx) ahnhVar32.oS.b(), ahnhVar32.Wk, ahnhVar32.qi, ahknVar51.gH, (cogw) ahknVar51.cD.b(), ahnhVar32.bv(), ahnhVar32.bw(), ahnhVar32.BQ, ahnhVar32.uJ);
            case 1282:
                ahkn ahknVar52 = this.a;
                ahnh ahnhVar33 = ahknVar52.a;
                return new csxj((bbdl) ahnhVar33.qG.b(), (cogw) ahknVar52.cD.b(), ahnhVar33.HJ);
            case 1283:
                ahkn ahknVar53 = this.a;
                ahnh ahnhVar34 = ahknVar53.a;
                return new byeb(ahnhVar34.wv, ahnhVar34.sL, ahnhVar34.uJ, ahnhVar34.ww, (cmuq) ahnhVar34.wJ.b(), (cogw) ahknVar53.cD.b(), (ains) ahnhVar34.c.b(), ahnhVar34.qG, (bxlc) ahnhVar34.uI.b(), (axjf) ahnhVar34.so.b(), (bbfn) ahnhVar34.CF.b(), (dqsn) ahnhVar34.qq.b(), (bveg) ahnhVar34.yx.b(), Optional.empty(), ahnhVar34.HP, ahknVar53.ie, ahnhVar34.AQ, ahnhVar34.yD, ahnhVar34.qi, ahnhVar34.pl, (eosc) ahknVar53.y.b());
            case 1284:
                ahnh ahnhVar35 = this.a.a;
                eyik eyikVar50 = ahnhVar35.uQ;
                eyik eyikVar51 = ahnhVar35.wu;
                return new axgh(eyikVar50, eyikVar51);
            case 1285:
                return new apqy() { // from class: aovu
                };
            case 1286:
                ahkn ahknVar54 = this.a;
                Context context6 = (Context) ahknVar54.t.b();
                ahnh ahnhVar36 = ahknVar54.a;
                return new cmuq(context6, (cmum) ahnhVar36.wF.b(), (crqu) ahnhVar36.wH.b(), (crny) ahnhVar36.pf.b(), (cuur) ahnhVar36.wI.b());
            case 1287:
                ahkn ahknVar55 = this.a;
                ahnh ahnhVar37 = ahknVar55.a;
                return new cmum((crny) ahnhVar37.pf.b(), (cmtg) ahnhVar37.wE.b(), (crma) ahknVar55.da.b(), (eosc) ahknVar55.aJ.b(), (cmuo) ahnhVar37.wC.b());
            case 1288:
                ahkn ahknVar56 = this.a;
                Optional optional = (Optional) ahknVar56.dn.b();
                ahnh ahnhVar38 = ahknVar56.a;
                return cmth.a(optional, ahknVar56.cI, ahnhVar38.pf, ahnhVar38.wD, ahknVar56.p);
            case 1289:
                ahnh ahnhVar39 = this.a.a;
                return new cqjz(ahnhVar39.rO, ahnhVar39.pf);
            case 1290:
                ahkn ahknVar57 = this.a;
                Context context7 = (Context) ahknVar57.t.b();
                ahnh ahnhVar40 = ahknVar57.a;
                return new cmus(context7, ahnhVar40.pB, ahnhVar40.wx);
            case 1291:
                ahnh ahnhVar41 = this.a.a;
                return new cmub((fdjx) ahnhVar41.m.b(), ahnhVar41.mP(), ahnhVar41.kA());
            case 1292:
                return new cmuy(this.a.a.wy);
            case 1293:
                return new cmux(this.a.a.wy);
            case 1294:
                ahnh ahnhVar42 = this.a.a;
                return new cmve(ahnhVar42.wx, (crny) ahnhVar42.pf.b());
            case 1295:
                return new cmuo((crny) this.a.a.pf.b(), Optional.empty());
            case 1296:
                ahnh ahnhVar43 = this.a.a;
                return new crqu((crqs) ahnhVar43.py(), (crny) ahnhVar43.pf.b(), Optional.of(ahnhVar43.pv()));
            case 1297:
                ahkn ahknVar58 = this.a;
                return new szw((Context) ahknVar58.t.b(), (eosc) ahknVar58.y.b(), ahknVar58.a.y());
            case 1298:
                ahkn ahknVar59 = this.a;
                ahnh ahnhVar44 = ahknVar59.a;
                return new cuur(ahnhVar44.qK, ahknVar59.t, ahknVar59.dj, ahnhVar44.wH, ahnhVar44.pf, ahknVar59.aQ);
            case 1299:
                ahkn ahknVar60 = this.a;
                Context context8 = (Context) ahknVar60.t.b();
                ahnh ahnhVar45 = ahknVar60.a;
                return new bbfn(context8, (crmx) ahnhVar45.pB.b(), (crny) ahnhVar45.pf.b(), (cmum) ahnhVar45.wF.b(), ahnhVar45.Jd, ahknVar60.mx, ahknVar60.ie, (cpga) ahnhVar45.Wj.b(), ahnhVar45.bE());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [bvsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [bvsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [bvsn, java.lang.Object] */
    private final Object g() {
        int i = this.b;
        switch (i) {
            case 1300:
                return bxhh.a(this.a.a.fk());
            case 1301:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                eyik eyikVar = ahknVar.cD;
                ahnh ahnhVar = ahknVar.a;
                return new ayns(context, ahnhVar.wQ, ahnhVar.wO, ahnhVar.wR, ahnhVar.wS, (cogw) eyikVar.b());
            case 1302:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                ahnh ahnhVar2 = ahknVar2.a;
                aipo aipoVar = (aipo) ahnhVar2.us.b();
                cczn ccznVar = (cczn) ahknVar2.cG.b();
                dzuc dzucVar = (dzuc) ahknVar2.cE.b();
                return new ActionExecutorImpl(context2, aipoVar, ccznVar, dzucVar, (eosc) ahknVar2.aJ.b(), ahnhVar2.wL, ahnhVar2.wM, ahnhVar2.ev(), ahnhVar2.wP);
            case 1303:
                final eyik eyikVar2 = this.a.a.oO;
                return new aoop() { // from class: aopc
                    @Override // defpackage.aoop
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_action_catch_cancellation_exception");
                    }
                };
            case 1304:
                final eyik eyikVar3 = this.a.a.oO;
                return new aooo() { // from class: aopa
                    @Override // defpackage.aooo
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.actions_report_callers");
                    }
                };
            case 1305:
                return new ayoe(eyii.a(), this.a.a.wN);
            case 1306:
                final eyik eyikVar4 = this.a.a.oO;
                return new aooq() { // from class: aope
                    @Override // defpackage.aooq
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.use_persistable_action_parameters");
                    }
                };
            case 1307:
                final eyik eyikVar5 = this.a.a.oO;
                return new aoon() { // from class: aooy
                    @Override // defpackage.aoon
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.actions_have_named_wakelocks");
                    }
                };
            case 1308:
                ahkn ahknVar3 = this.a;
                return new aynh((Context) ahknVar3.t.b(), ahknVar3.a.c);
            case 1309:
                ahkn ahknVar4 = this.a;
                return new ActionWorkManagerScheduler(ahknVar4.a.wO, (Context) ahknVar4.t.b());
            case 1310:
                ahnh ahnhVar3 = this.a.a;
                return cnwi.a(ahnhVar3.VV, ahnhVar3.VX);
            case 1311:
                ahkn ahknVar5 = this.a;
                eyik eyikVar6 = ahknVar5.cD;
                eyik eyikVar7 = ahknVar5.eC;
                cogw cogwVar = (cogw) eyikVar6.b();
                ahnh ahnhVar4 = ahknVar5.a;
                eyik eyikVar8 = ahnhVar4.uy;
                eyik eyikVar9 = ahnhVar4.wU;
                Context context3 = (Context) ahknVar5.t.b();
                eygg eyggVarA = eyie.a(ahnhVar4.De);
                eygg eyggVarA2 = eyie.a(ahnhVar4.VJ);
                eosc eoscVar = (eosc) ahknVar5.p.b();
                eosc eoscVar2 = (eosc) ahknVar5.y.b();
                eyik eyikVar10 = ahknVar5.aJ;
                eyik eyikVar11 = ahnhVar4.CZ;
                eyik eyikVar12 = ahnhVar4.Da;
                eyik eyikVar13 = ahnhVar4.VU;
                eyik eyikVar14 = ahknVar5.da;
                return new cmsi(ahknVar5.cI, eyikVar7, ahknVar5.dn, cogwVar, eyikVar8, eyikVar9, eyikVar14, context3, eyggVarA, eyggVarA2, eoscVar, eoscVar2, eyikVar10, eyikVar11, eyikVar12, eyikVar13);
            case 1312:
                ahnh ahnhVar5 = this.a.a;
                return new axnz(ahnhVar5.uE, ahnhVar5.qq);
            case 1313:
                ahnh ahnhVar6 = this.a.a;
                return ekhx.u(ahnhVar6.ku(), (cmqg) ahnhVar6.xa.b(), ahnhVar6.fB(), (cmqg) ahnhVar6.VD.b(), ahnhVar6.N());
            case 1314:
                ahkn ahknVar6 = this.a;
                return new amgl((alxg) ahknVar6.a.wV.b(), ahknVar6.hV);
            case 1315:
                ahkn ahknVar7 = this.a;
                return new alxg((dqsn) ahknVar7.a.qq.b(), (eosc) ahknVar7.p.b());
            case 1316:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar7 = ahknVar8.a;
                return new bvgl((bver) ahnhVar7.wZ.b(), eyie.a(ahnhVar7.VF), eyie.a(ahknVar8.hW), (Optional) ahnhVar7.oU.b(), (eosc) ahknVar8.p.b(), (crqv) ahknVar8.aT.b(), (bvkr) ahnhVar7.wa.b(), ahnhVar7.xk, ahnhVar7.pG(), (ayps) ahnhVar7.Vk.b(), (axwu) ahnhVar7.Vz.b(), eyie.a(ahnhVar7.Vy), (Optional) ahknVar8.hZ.b(), (cqbm) ahnhVar7.rY.b(), ahnhVar7.Vx, ahnhVar7.yd, ahnhVar7.el(), (ayov) ahnhVar7.Vu.b(), (aypz) ahnhVar7.wW.b(), ahnhVar7.UA, ahnhVar7.Cp, (Optional) ahnhVar7.FQ.b(), ahnhVar7.FX, ahnhVar7.MP, ahnhVar7.UX, ahnhVar7.UY, ahnhVar7.Vi, ahnhVar7.wc, ahnhVar7.VG);
            case 1317:
                ahkn ahknVar9 = this.a;
                Context context4 = (Context) ahknVar9.t.b();
                ahnh ahnhVar8 = ahknVar9.a;
                return new bver(context4, (cqbm) ahnhVar8.sX.b(), (aypz) ahnhVar8.wW.b(), ahnhVar8.wY, (ains) ahnhVar8.c.b(), (eigp) ahknVar9.aI.b());
            case 1318:
                ahnh ahnhVar9 = this.a.a;
                return new bvud(ahnhVar9.eH(), ahnhVar9.wX, (ains) ahnhVar9.c.b());
            case 1319:
                return new bvsu((cqbm) this.a.a.sX.b());
            case 1320:
                ahkn ahknVar10 = this.a;
                Context context5 = (Context) ahknVar10.t.b();
                ahnh ahnhVar10 = ahknVar10.a;
                return bvfc.a(context5, ahnhVar10.VE.b(), (aofc) ahnhVar10.yD.b(), (anty) ahnhVar10.Ax.b());
            case 1321:
                ahkn ahknVar11 = this.a;
                Context context6 = (Context) ahknVar11.t.b();
                eigp eigpVar = (eigp) ahknVar11.aI.b();
                ahnh ahnhVar11 = ahknVar11.a;
                eygg eyggVarA3 = eyie.a(ahnhVar11.xd);
                return new bvfa(context6, eigpVar, eyggVarA3, ahnhVar11.ew(), ahnhVar11.el(), (ayov) ahnhVar11.Vu.b(), ahnhVar11.eE(), (cehg) ahnhVar11.xk.b(), ahknVar11.cD, ahnhVar11.Vt, ahnhVar11.xe, ahnhVar11.Vv, (eosc) ahknVar11.y.b());
            case 1322:
                ahkn ahknVar12 = this.a;
                cdio cdioVar = (cdio) ahknVar12.dh.b();
                ahnh ahnhVar12 = ahknVar12.a;
                return abcq.a(cdioVar, (bvgl) ahnhVar12.xa.b(), (bvhk) ahnhVar12.VD.b());
            case 1323:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar13 = ahknVar13.a;
                return new bvhk(ahnhVar13.pG(), eyie.a(ahknVar13.hW), (eosc) ahknVar13.y.b(), (crqv) ahknVar13.aT.b(), eyie.a(ahnhVar13.VC), (egej) ahnhVar13.pI.b(), (bvkr) ahnhVar13.wa.b(), (Context) ahknVar13.t.b());
            case 1324:
                return new bvsm(this.a.a.rF);
            case 1325:
                ahkn ahknVar14 = this.a;
                Optional optional = (Optional) ahknVar14.hX.b();
                ahnh ahnhVar14 = ahknVar14.a;
                return new bvil(optional, (bver) ahnhVar14.wZ.b(), eyie.a(ahnhVar14.Vw), eyie.a(ahknVar14.hW), (Optional) ahnhVar14.oU.b(), (eosc) ahknVar14.p.b(), (crqv) ahknVar14.aT.b(), (bvkr) ahnhVar14.wa.b(), ahnhVar14.xk, ahnhVar14.pG(), (ayps) ahnhVar14.Vk.b(), (Optional) ahknVar14.hZ.b(), (cqbm) ahnhVar14.rY.b(), ahnhVar14.Vx, ahnhVar14.yd, ahnhVar14.el(), eyie.a(ahnhVar14.Vy), eyie.a(ahnhVar14.VA), (ayov) ahnhVar14.Vu.b(), (aypz) ahnhVar14.wW.b(), ahnhVar14.UA, ahnhVar14.Cp, ahnhVar14.FX, ahnhVar14.VB, (Optional) ahnhVar14.FQ.b(), ahnhVar14.UX, ahnhVar14.UY, ahnhVar14.Vi, (Map) ahnhVar14.Ly.b());
            case 1326:
                ahkn ahknVar15 = this.a;
                Context context7 = (Context) ahknVar15.t.b();
                ahnh ahnhVar15 = ahknVar15.a;
                return new bvgt(context7, (bvgs) ahnhVar15.qk(), (aofc) ahnhVar15.yD.b(), (anty) ahnhVar15.Ax.b(), (egxv) ahnhVar15.ut.b());
            case 1327:
                final eyik eyikVar15 = this.a.a.oO;
                return new aprz() { // from class: aoxl
                    @Override // defpackage.aprz
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_ditto_debouncer");
                    }
                };
            case 1328:
                ahnh ahnhVar16 = this.a.a;
                return bvkt.a(ahnhVar16.dK(), ahnhVar16.xf);
            case 1329:
                return Long.valueOf(famd.a(this.a.a.oa()));
            case 1330:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar17 = ahknVar16.a;
                return new axuk(ahnhVar17.wa, ahnhVar17.c, ahknVar16.p, ahknVar16.y, ahknVar16.aJ, ahknVar16.ia, ahnhVar17.uQ, ahnhVar17.xk, ahnhVar17.UP, ahnhVar17.Gc, ahnhVar17.UQ, ahnhVar17.wv, ahnhVar17.UW, ahknVar16.dh, ahnhVar17.UG, ahknVar16.cE, ahnhVar17.UX, ahnhVar17.UY, ahnhVar17.Vi, ahnhVar17.Vj);
            case 1331:
                ahkn ahknVar17 = this.a;
                Context context8 = (Context) ahknVar17.t.b();
                eosc eoscVar3 = (eosc) ahknVar17.y.b();
                eosc eoscVar4 = (eosc) ahknVar17.p.b();
                ahnh ahnhVar18 = ahknVar17.a;
                cphu cphuVar = (cphu) ahnhVar18.xh.b();
                cqsu cqsuVar = (cqsu) ahnhVar18.xi.b();
                eygg eyggVarA4 = eyie.a(ahnhVar18.xj);
                eygg eyggVarA5 = eyie.a(ahnhVar18.xo);
                eygg eyggVarA6 = eyie.a(ahnhVar18.xp);
                bbhi bbhiVar = new bbhi();
                Optional optionalOf = Optional.of(ahnhVar18.lS());
                cogw cogwVar2 = (cogw) ahknVar17.cD.b();
                eyik eyikVar16 = ahnhVar18.yd;
                bafp bafpVar = (bafp) ahnhVar18.ye.b();
                cqbm cqbmVar = (cqbm) ahnhVar18.sX.b();
                cqmz cqmzVar = (cqmz) ahknVar17.ic.b();
                crqv crqvVar = (crqv) ahknVar17.aT.b();
                chwq chwqVar = (chwq) ahnhVar18.uu.b();
                eyik eyikVar17 = ahnhVar18.sh;
                eyik eyikVar18 = ahnhVar18.qk;
                crny crnyVar = (crny) ahnhVar18.pf.b();
                cqbm cqbmVar2 = (cqbm) ahnhVar18.rY.b();
                bvkr bvkrVar = (bvkr) ahnhVar18.wa.b();
                ajnf ajnfVar = (ajnf) ahnhVar18.UA.b();
                ahnhVar18.A();
                cmuq cmuqVar = (cmuq) ahnhVar18.wJ.b();
                ceox ceoxVarBW = ahknVar17.bW();
                crtn crtnVarLv = ahnhVar18.lv();
                Optional optionalEmpty = Optional.empty();
                aofc aofcVar = (aofc) ahnhVar18.yD.b();
                afhk afhkVar = (afhk) ahnhVar18.GB.b();
                Optional optionalOf2 = Optional.of(ahnhVar18.UC);
                eygg eyggVarA7 = eyie.a(ahnhVar18.pE);
                bvur bvurVar = (bvur) ahknVar17.dL.b();
                eyik eyikVar19 = ahnhVar18.qY;
                awhr awhrVar = (awhr) ahnhVar18.zm.b();
                eyik eyikVar20 = ahnhVar18.qa;
                eyik eyikVar21 = ahnhVar18.UD;
                apri apriVarBj = ahnhVar18.bj();
                eyik eyikVar22 = ahnhVar18.Jx;
                eyik eyikVar23 = ahnhVar18.UE;
                eyik eyikVar24 = ahnhVar18.qG;
                eyik eyikVar25 = ahnhVar18.uM;
                eyik eyikVar26 = ahnhVar18.yr;
                aqoy aqoyVarBL = ahnhVar18.bL();
                return new cehg(context8, eoscVar3, eoscVar4, cphuVar, cqsuVar, eyggVarA4, eyggVarA5, eyggVarA6, bbhiVar, optionalOf, cogwVar2, eyikVar16, bafpVar, cqbmVar, cqmzVar, crqvVar, chwqVar, eyikVar17, eyikVar18, crnyVar, cqbmVar2, bvkrVar, ajnfVar, cmuqVar, ceoxVarBW, crtnVarLv, optionalEmpty, aofcVar, afhkVar, optionalOf2, eyggVarA7, bvurVar, eyikVar19, awhrVar, ahnhVar18.QN, eyikVar20, ahknVar17.cW, eyikVar21, apriVarBj, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, aqoyVarBL, ahnhVar18.UF, ahnhVar18.UG, ahnhVar18.UH, ahnhVar18.xI, ahnhVar18.se, ahnhVar18.cp(), (aqad) ahnhVar18.UI.b(), ahnhVar18.bp(), ahnhVar18.bq(), ahnhVar18.UJ);
            case 1332:
                ahkn ahknVar18 = this.a;
                Context context9 = (Context) ahknVar18.t.b();
                bxgr bxgrVar = (bxgr) ahknVar18.ib.b();
                ahnh ahnhVar19 = ahknVar18.a;
                return new cphu(context9, bxgrVar, (cpbn) ahnhVar19.qo.b(), ahnhVar19.qj);
            case 1333:
                ahkn ahknVar19 = this.a;
                Context context10 = (Context) ahknVar19.t.b();
                ahnh ahnhVar20 = ahknVar19.a;
                return new aght(context10, (cehg) ahnhVar20.xk.b(), (cqsu) ahnhVar20.xi.b(), (ains) ahnhVar20.c.b(), (aipo) ahnhVar20.us.b(), (eosc) ahknVar19.y.b(), (eosc) ahknVar19.p.b(), ahnhVar20.uE, (eyde) ahnhVar20.xm.b(), (cqmz) ahknVar19.ic.b(), (cenj) ahnhVar20.tf.b(), ahnhVar20.xn);
            case 1334:
                return abct.a(this.a.a.qw());
            case 1335:
                return new aghv(eyie.a(this.a.a.tU));
            case 1336:
                ahnh ahnhVar21 = this.a.a;
                return new aghy((fdjx) ahnhVar21.m.b(), (ehtk) ahnhVar21.tD.b());
            case 1337:
                ahkn ahknVar20 = this.a;
                Context context11 = (Context) ahknVar20.t.b();
                Executor executor = (Executor) ahknVar20.aJ.b();
                ahnh ahnhVar22 = ahknVar20.a;
                return new aghl(context11, executor, (cenj) ahnhVar22.tf.b(), (aghv) ahnhVar22.xl.b(), ahnhVar22.xn);
            case 1338:
                return new awij(this.a.a.cW());
            case 1339:
                ahnh ahnhVar23 = this.a.a;
                return new chsn(ahnhVar23.sh, (dggl) ahnhVar23.se.b());
            case 1340:
                final eyik eyikVar27 = this.a.a.oO;
                return new aqaq() { // from class: apka
                    @Override // defpackage.aqaq
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.enable_rbm_bot_capabilities_fetch");
                    }
                };
            case 1341:
                ahnh ahnhVar24 = this.a.a;
                return new awlc(ahnhVar24.xC, (fdjx) ahnhVar24.m.b());
            case 1342:
                return new ekph(this.a.a.cN());
            case 1343:
                return new astd((asse) this.a.a.xz.b());
            case 1344:
                ahnh ahnhVar25 = this.a.a;
                return new asse(ahnhVar25.xs, ahnhVar25.xt, ahnhVar25.xu, ahnhVar25.xv, ahnhVar25.xw, ahnhVar25.xx, ahnhVar25.xy);
            case 1345:
                return Long.valueOf(fakw.a(this.a.a.nS()));
            case 1346:
                return Long.valueOf(fakv.a(this.a.a.nS()));
            case 1347:
                return Long.valueOf(fakq.a(this.a.a.nS()));
            case 1348:
                return Long.valueOf(fakt.a(this.a.a.nS()));
            case 1349:
                return Long.valueOf(faku.a(this.a.a.nS()));
            case 1350:
                return Long.valueOf(faks.a(this.a.a.nS()));
            case 1351:
                return Long.valueOf(fakr.a(this.a.a.nS()));
            case 1352:
                return new awlc(eyim.a(), (fdjx) this.a.a.m.b());
            case 1353:
                return new ahkp(this);
            case 1354:
                ahkn ahknVar21 = this.a;
                return asyn.a(ahknVar21.a.cQ(), (ahkk) ahknVar21.f20io.b());
            case 1355:
                ahkn ahknVar22 = this.a;
                eosc eoscVar5 = (eosc) ahknVar22.aJ.b();
                eosc eoscVar6 = (eosc) ahknVar22.p.b();
                ahnh ahnhVar26 = ahknVar22.a;
                return new asxh(eoscVar5, eoscVar6, (ContactsService) ahnhVar26.xG.b(), (awlc) ahnhVar26.xD.b(), ahnhVar26.pT, (cogw) ahknVar22.cD.b());
            case 1356:
                return cmff.a((cmfe) this.a.a.xF.b());
            case 1357:
                ahkn ahknVar23 = this.a;
                Context context12 = (Context) ahknVar23.t.b();
                eosc eoscVar7 = (eosc) ahknVar23.y.b();
                ahnh ahnhVar27 = ahknVar23.a;
                return new asze(context12, eoscVar7, (chwq) ahnhVar27.uu.b(), ahnhVar27.cP(), (cogw) ahknVar23.cD.b(), ahnhVar27.lZ(), (awlc) ahnhVar27.xD.b());
            case 1358:
                cmzu cmzuVar = new cmzu();
                ahkn ahknVar24 = this.a;
                eosc eoscVar8 = (eosc) ahknVar24.p.b();
                eosc eoscVar9 = (eosc) ahknVar24.y.b();
                ahnh ahnhVar28 = ahknVar24.a;
                return new cmzv(cmzuVar, eoscVar8, eoscVar9, (awlc) ahnhVar28.xD.b(), (cogw) ahknVar24.cD.b(), ahnhVar28.rk, (cnlh) ahnhVar28.xZ.b(), (cejj) ahnhVar28.tJ.b());
            case 1359:
                ahkn ahknVar25 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar25.cA.b();
                ahnh ahnhVar29 = ahknVar25.a;
                return new cnlh(fcyhVar, (fdjx) ahnhVar29.oS.b(), (fdjx) ahnhVar29.m.b(), ahnhVar29.xQ, ahnhVar29.xT, ahnhVar29.xU, ahnhVar29.se, ahnhVar29.xV, ahnhVar29.pm());
            case 1360:
                return new ahkq(this);
            case 1361:
                ahkn ahknVar26 = this.a;
                Context context13 = (Context) ahknVar26.t.b();
                ahnh ahnhVar30 = ahknVar26.a;
                return cnkh.a(context13, (ceds) ahnhVar30.te.b(), ahnhVar30.cC());
            case 1362:
                ahnh ahnhVar31 = this.a.a;
                return new cmyt(ahnhVar31.qr, ahnhVar31.xL, ahnhVar31.xO);
            case 1363:
                ahkn ahknVar27 = this.a;
                return new cnhu(ahknVar27.a.qr, (cogw) ahknVar27.cD.b(), (atau) ahknVar27.ii.b());
            case 1364:
                ahkn ahknVar28 = this.a;
                dzuc dzucVar2 = (dzuc) ahknVar28.cE.b();
                cogw cogwVar3 = (cogw) ahknVar28.cD.b();
                eosd eosdVar = (eosd) ahknVar28.p.b();
                ahnh ahnhVar32 = ahknVar28.a;
                return new cmxn(dzucVar2, cogwVar3, eosdVar, ahnhVar32.xM, ahknVar28.ij, ahnhVar32.xN);
            case 1365:
                return new apqu() { // from class: aovn
                };
            case 1366:
                return new ajeu(this.a.a.rk);
            case 1367:
                return new ahkr(this);
            case 1368:
                return new ahks(this);
            case 1369:
                final eyik eyikVar28 = this.a.a.oO;
                return new asep() { // from class: asej
                    @Override // defpackage.asep
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.use_memory_cache_for_auth_token");
                    }
                };
            case 1370:
                return new cmyn((cepb) this.a.a.qQ.b());
            case 1371:
                ahnh ahnhVar33 = this.a.a;
                return new cepu(ahnhVar33.xI, ahnhVar33.pb);
            case 1372:
                return new ahkt(this);
            case 1373:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar34 = ahknVar29.a;
                return ceri.a(ahnhVar34.tO, (ehtz) ahknVar29.ik.b(), (ehuj) ahknVar29.eo.b(), (esmm) ahnhVar34.tZ.b(), ejwi.h(), ahnhVar34.mJ());
            case 1374:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar35 = ahknVar30.a;
                return cerm.a(ahnhVar35.tO, (ehtz) ahknVar30.in.b(), (ehuj) ahknVar30.eo.b(), (esmm) ahnhVar35.tZ.b(), ejwi.h(), ahnhVar35.mJ());
            case 1375:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar36 = ahknVar31.a;
                return new ceus((cmgk) ahnhVar36.qK.b(), ahknVar31.bX(), (ains) ahnhVar36.c.b(), (eosc) ahknVar31.y.b());
            case 1376:
                ahnh ahnhVar37 = this.a.a;
                return new bafp(eyil.a(ahnhVar37.qk), eyil.a(ahnhVar37.pE), eyil.a(ahnhVar37.qi));
            case 1377:
                ahkn ahknVar32 = this.a;
                crqv crqvVar2 = (crqv) ahknVar32.aT.b();
                ahnh ahnhVar38 = ahknVar32.a;
                crqu crquVar = (crqu) ahnhVar38.wH.b();
                crny crnyVar2 = (crny) ahnhVar38.pf.b();
                crma crmaVar = (crma) ahknVar32.da.b();
                eosc eoscVar10 = (eosc) ahknVar32.y.b();
                cqtp cqtpVar = (cqtp) ahknVar32.dK.b();
                eyik eyikVar29 = ahknVar32.aI;
                return new ajnm(crqvVar2, crquVar, crnyVar2, crmaVar, eoscVar10, cqtpVar, (ajny) ahknVar32.fu(), (eigp) eyikVar29.b(), (ajnx) ahnhVar38.qu());
            case 1378:
                ahkn ahknVar33 = this.a;
                Context context14 = (Context) ahknVar33.t.b();
                ahnh ahnhVar39 = ahknVar33.a;
                fdjx fdjxVar = (fdjx) ahnhVar39.oS.b();
                fcyh fcyhVar2 = (fcyh) ahknVar33.cA.b();
                eosc eoscVar11 = (eosc) ahknVar33.p.b();
                eyik eyikVar30 = ahknVar33.aQ;
                cmfo cmfoVarKo = ahnhVar39.ko();
                eyik eyikVar31 = ahnhVar39.rd;
                eyik eyikVar32 = ahnhVar39.ri;
                eyik eyikVar33 = ahnhVar39.rW;
                eyik eyikVar34 = ahnhVar39.rY;
                egzh egzhVar = (egzh) eyikVar30.b();
                eyik eyikVar35 = ahnhVar39.yf;
                eyik eyikVar36 = ahnhVar39.rq;
                eyik eyikVar37 = ahnhVar39.yg;
                eyik eyikVar38 = ahnhVar39.yi;
                eyik eyikVar39 = ahnhVar39.sd;
                eyik eyikVar40 = ahnhVar39.yl;
                cqtp cqtpVar2 = (cqtp) ahknVar33.dK.b();
                eyik eyikVar41 = ahnhVar39.pf;
                eyik eyikVar42 = ahnhVar39.sX;
                eyik eyikVar43 = ahnhVar39.ym;
                ctce ctceVar = (ctce) ahnhVar39.yp.b();
                eyik eyikVar44 = ahnhVar39.yk;
                eyik eyikVar45 = ahnhVar39.yq;
                eyik eyikVar46 = ahnhVar39.yr;
                eyik eyikVar47 = ahnhVar39.Ux;
                eyik eyikVar48 = ahnhVar39.Uy;
                eyik eyikVar49 = ahnhVar39.Uz;
                return new ckbk(context14, ahknVar33.aT, fdjxVar, fcyhVar2, eoscVar11, cmfoVarKo, eyikVar31, eyikVar32, eyikVar33, eyikVar34, egzhVar, ahknVar33.cD, eyikVar35, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40, cqtpVar2, eyikVar41, eyikVar42, eyikVar43, ctceVar, eyikVar44, eyikVar45, eyikVar46, eyikVar47, eyikVar48, eyikVar49);
            case 1379:
                ahkn ahknVar34 = this.a;
                eyik eyikVar50 = ahknVar34.dj;
                ahnh ahnhVar40 = ahknVar34.a;
                cmfo cmfoVarKn = ahnhVar40.kn();
                eyik eyikVar51 = ahnhVar40.pQ;
                ahknVar34.iX();
                egzg egzgVarEo = ahknVar34.eo();
                egzg egzgVarEn = ahknVar34.en();
                egzg egzgVarEm = ahknVar34.em();
                eyik eyikVar52 = ahnhVar40.wH;
                eyik eyikVar53 = ahnhVar40.rd;
                eosc eoscVar12 = (eosc) ahknVar34.p.b();
                return new cjxi(cmfoVarKn, eyikVar51, egzgVarEo, egzgVarEn, egzgVarEm, eyikVar52, eyikVar53, eoscVar12);
            case 1380:
                return new cebf((cebq) this.a.a.rq.b());
            case 1381:
                ahnh ahnhVar41 = this.a.a;
                return new cefq(ahnhVar41.rW, ahnhVar41.xI, ahnhVar41.qW, ahnhVar41.qi, ahnhVar41.rd, ahnhVar41.pf, ahnhVar41.se, ahnhVar41.yh);
            case 1382:
                ahnh ahnhVar42 = this.a.a;
                return new cefr(ahnhVar42.pf, ahnhVar42.se);
            case 1383:
                ahnh ahnhVar43 = this.a.a;
                return new cjpm(ahnhVar43.rd, ahnhVar43.rq, ahnhVar43.yj, ahnhVar43.yk);
            case 1384:
                final eyik eyikVar54 = this.a.a.oO;
                return new aqsr() { // from class: aqqq
                    @Override // defpackage.aqsr
                    public final boolean a() {
                        return ((eoth) eyikVar54.b()).a("bugle.enable_relaxed_provisioning_rules");
                    }
                };
            case 1385:
                final eyik eyikVar55 = this.a.a.oO;
                return new aqsq() { // from class: aqqo
                    @Override // defpackage.aqsq
                    public final boolean a() {
                        return ((eoth) eyikVar55.b()).a("bugle.enable_multi_sim_disabled_provisioning_rule");
                    }
                };
            case 1386:
                final eyik eyikVar56 = this.a.a.oO;
                return new dflm() { // from class: dfjg
                    @Override // defpackage.dflm
                    public final boolean a() {
                        return ((eoth) eyikVar56.b()).a("cslib.enable_fi_multi_sync_help_article_in_rcs_settings");
                    }
                };
            case 1387:
                ahkn ahknVar35 = this.a;
                Context context15 = (Context) ahknVar35.t.b();
                ahnh ahnhVar44 = ahknVar35.a;
                return new ctce(context15, ahnhVar44.yn, ahnhVar44.yo);
            case 1388:
                return new asjv() { // from class: asjk
                };
            case 1389:
                return Boolean.valueOf(faww.a(this.a.a.pd()));
            case 1390:
                final eyik eyikVar57 = this.a.a.oO;
                return new arwz() { // from class: arwt
                    @Override // defpackage.arwz
                    public final boolean a() {
                        return ((eoth) eyikVar57.b()).a("bugle.enable_multi_sim_rcs_in_rcs_settings");
                    }
                };
            case 1391:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar45 = ahknVar36.a;
                eyik eyikVar58 = ahknVar36.gF;
                eyik eyikVar59 = ahnhVar45.yu;
                eyik eyikVar60 = ahnhVar45.yv;
                eyik eyikVar61 = ahnhVar45.Up;
                eyik eyikVar62 = ahnhVar45.Uq;
                eyik eyikVar63 = ahnhVar45.Ef;
                eyik eyikVar64 = ahnhVar45.Ns;
                eyik eyikVar65 = ahnhVar45.xG;
                eyik eyikVar66 = ahnhVar45.Ur;
                cqbm cqbmVar3 = (cqbm) ahnhVar45.sX.b();
                eyik eyikVar67 = ahnhVar45.CC;
                eyik eyikVar68 = ahnhVar45.rY;
                aypv aypvVar = (aypv) ahknVar36.ld.b();
                eyik eyikVar69 = ahknVar36.da;
                return new cjpt(eyikVar58, eyikVar59, eyikVar60, eyikVar61, eyikVar62, eyikVar63, eyikVar64, eyikVar65, eyikVar66, ahnhVar45.Pr, cqbmVar3, eyikVar67, eyikVar68, aypvVar, ahnhVar45.rk, ahnhVar45.Uu, ahnhVar45.Uv, ahnhVar45.sh, (crma) eyikVar69.b(), ahnhVar45.sj, ahknVar36.eP, ahnhVar45.Uw, (eosc) ahknVar36.p.b());
            case 1392:
                ahnh ahnhVar46 = this.a.a;
                eyik eyikVar70 = ahnhVar46.ys;
                eyik eyikVar71 = ahnhVar46.yt;
                return new aylf(eyikVar70, eyikVar71, eyikVar70, eyikVar71);
            case 1393:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar47 = ahknVar37.a;
                return new aylm(ahnhVar47.m, ahnhVar47.yr, ahknVar37.iq);
            case 1394:
                return new aylp(this.a.a.yr);
            case 1395:
                ahnh ahnhVar48 = this.a.a;
                return new ayhr(ahnhVar48.yv, ahnhVar48.yr, ahnhVar48.JN);
            case 1396:
                ahkn ahknVar38 = this.a;
                crqv crqvVar3 = (crqv) ahknVar38.aT.b();
                Context context16 = (Context) ahknVar38.t.b();
                ahnh ahnhVar49 = ahknVar38.a;
                return new cjnr(crqvVar3, context16, ahnhVar49.uJ, ahnhVar49.yw, (asrf) ahnhVar49.rl.b(), (dqsn) ahnhVar49.qq.b(), (cjpo) ahnhVar49.yr.b(), ahnhVar49.yx, ahnhVar49.JB, ahnhVar49.Fc, ahnhVar49.pT, ahnhVar49.zP, ahnhVar49.TI, ahnhVar49.TL, (eosc) ahknVar38.p.b());
            case 1397:
                ahnh ahnhVar50 = this.a.a;
                return new chgr((chgn) ahnhVar50.Nb.b(), (fdjx) ahnhVar50.oQ.b());
            case 1398:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar51 = ahknVar39.a;
                cgxw cgxwVar = (cgxw) ahnhVar51.Ie.b();
                asrh asrhVar = (asrh) ahnhVar51.Fd.b();
                auau auauVar = (auau) ahknVar39.ez.b();
                eyik eyikVar72 = ahknVar39.cA;
                return new chhh(cgxwVar, asrhVar, auauVar, ahnhVar51.zP, ahknVar39.ii, ahknVar39.lk, ahnhVar51.pT, ahnhVar51.Nm, ahnhVar51.TK, ahnhVar51.TI, ahnhVar51.cw(), (fcyh) eyikVar72.b());
            case 1399:
                ahkn ahknVar40 = this.a;
                eyik eyikVar73 = ahknVar40.cD;
                ahnh ahnhVar52 = ahknVar40.a;
                Map mapRe = ahnhVar52.re();
                cgyb cgybVarIA = ahnhVar52.iA();
                cgzo cgzoVarIB = ahnhVar52.iB();
                chaw chawVarCg = ahknVar40.cg();
                cgxi cgxiVarIy = ahnhVar52.iy();
                cgxu cgxuVarIz = ahnhVar52.iz();
                chbf chbfVarIC = ahnhVar52.iC();
                cogw cogwVar4 = (cogw) eyikVar73.b();
                eyik eyikVar74 = ahknVar40.cA;
                chab chabVarCf = ahknVar40.cf();
                arrm arrmVarCo = ahnhVar52.co();
                fcyh fcyhVar3 = (fcyh) eyikVar74.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar52.oQ.b();
                fdjx fdjxVar3 = (fdjx) ahnhVar52.m.b();
                aryk arykVar = (aryk) ahnhVar52.LM.b();
                ahnhVar52.sf();
                return new cgzi(mapRe, cgybVarIA, cgzoVarIB, chawVarCg, cgxiVarIy, cgxuVarIz, chbfVarIC, cogwVar4, chabVarCf, arrmVarCo, fcyhVar3, fdjxVar2, fdjxVar3, arykVar);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.b;
        switch (i) {
            case 1400:
                ahnh ahnhVar = this.a.a;
                chgs chgsVar = new chgs(ahnhVar.yw, ahnhVar.rl, ahnhVar.uJ);
                chgy chgyVar = new chgy(ahnhVar.Gl, ahnhVar.Jz, ahnhVar.Bg);
                eyik eyikVar = ahnhVar.TJ;
                eyik eyikVar2 = ahnhVar.Jz;
                eyik eyikVar3 = ahnhVar.TI;
                eyik eyikVar4 = ahnhVar.TH;
                eyik eyikVar5 = ahnhVar.TK;
                chgw chgwVar = new chgw(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, ahnhVar.cx());
                chhj chhjVarIQ = ahnhVar.iQ();
                chgm chgmVarIP = ahnhVar.iP();
                eyik eyikVar6 = ahnhVar.CD;
                eyik eyikVar7 = ahnhVar.OQ;
                ahkn ahknVar = ahnhVar.a;
                return chez.a(chgsVar, chgyVar, chgwVar, chhjVarIQ, chgmVarIP, new chgl(eyikVar6, eyikVar7, ahknVar.mL, ahknVar.mK, ahnhVar.Jz, eyikVar3, ahnhVar.sK, ahnhVar.sJ), (aryq) eyikVar5.b(), (aryp) ahnhVar.TL.b());
            case 1401:
                ahnh ahnhVar2 = this.a.a;
                return new ccsu((ccpm) ahnhVar2.tI.b(), (cbun) ahnhVar2.yy.b(), (ccer) ahnhVar2.yA.b(), (atzy) ahnhVar2.FL.b());
            case 1402:
                return new ccer((cbqj) this.a.a.yz.b());
            case 1403:
                ahkn ahknVar2 = this.a;
                eyik eyikVar8 = ahknVar2.cD;
                ahnh ahnhVar3 = ahknVar2.a;
                return new cbqu(ahnhVar3.qq, (cogw) eyikVar8.b(), (bxlc) ahnhVar3.uI.b());
            case 1404:
                ahnh ahnhVar4 = this.a.a;
                return new auae((ajln) ahnhVar4.AB.b(), (aofc) ahnhVar4.yD.b(), (aoew) ahnhVar4.FM.b());
            case 1405:
                ahnh ahnhVar5 = this.a.a;
                return new ajtf(ahnhVar5.qU(), ahnhVar5.qa, ahnhVar5.pl);
            case 1406:
                ahnh ahnhVar6 = this.a.a;
                return new amyo(ahnhVar6.za, ahnhVar6.zb, ahnhVar6.zc, ahnhVar6.zf);
            case 1407:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar7 = ahknVar3.a;
                return new amoa(ahnhVar7.m, ahnhVar7.yK, ahknVar3.cD, ahnhVar7.yL, ahnhVar7.yO, ahnhVar7.yP, ahnhVar7.yU, ahnhVar7.yV, ahnhVar7.yW, ahnhVar7.yX, ahnhVar7.yY, ahnhVar7.yZ);
            case 1408:
                ahkn ahknVar4 = this.a;
                eyik eyikVar9 = ahknVar4.p;
                ahnh ahnhVar8 = ahknVar4.a;
                return new amzx(eyikVar9, ahknVar4.aJ, ahknVar4.y, ahknVar4.is, ahnhVar8.yx, ahnhVar8.yB, ahnhVar8.yE, ahnhVar8.yF, ahnhVar8.sj, ahknVar4.ez, ahnhVar8.uJ, ahnhVar8.qa, ahknVar4.cD, ahnhVar8.tC, ahnhVar8.yG, ahnhVar8.tB, ahnhVar8.yH, ahnhVar8.yI, ahnhVar8.yJ);
            case 1409:
                return new amwp((bahv) this.a.a.un.b());
            case 1410:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar9 = ahknVar5.a;
                cjol cjolVar = (cjol) ahnhVar9.yC.b();
                return new cjox(cjolVar);
            case 1411:
                return new ahku(this);
            case 1412:
                return Optional.of(this.a.a.aK());
            case 1413:
                final eyik eyikVar10 = this.a.a.oO;
                return new arnv() { // from class: army
                    @Override // defpackage.arnv
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.enable_zinnia_in_conversations");
                    }
                };
            case 1414:
                final eyik eyikVar11 = this.a.a.oO;
                return new ardi() { // from class: aray
                    @Override // defpackage.ardi
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_group_chat_prewarm");
                    }
                };
            case 1415:
                final eyik eyikVar12 = this.a.a.oO;
                return new ardn() { // from class: arbi
                    @Override // defpackage.ardn
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_mention_suggestions");
                    }
                };
            case 1416:
                return new arwb() { // from class: arvw
                };
            case 1417:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar10 = ahknVar6.a;
                return new amot(ahnhVar10.m, ahknVar6.dK, ahnhVar10.pf);
            case 1418:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar11 = ahknVar7.a;
                return new amri((fdjx) ahnhVar11.m.b(), (cqtp) ahknVar7.dK.b(), ahnhVar11.yM, ahnhVar11.yN);
            case 1419:
                ahkn ahknVar8 = this.a;
                return new cpfu((Context) ahknVar8.t.b(), (fdjx) ahknVar8.a.m.b());
            case 1420:
                return Boolean.valueOf(((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45685653").e());
            case 1421:
                ahkn ahknVar9 = this.a;
                return new ampv(ahknVar9.a.m, ahknVar9.iw, ahknVar9.dK);
            case 1422:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar12 = ahknVar10.a;
                return new amqi(ahknVar10.p, ahnhVar12.m, ahknVar10.dK, ahknVar10.ix, ahnhVar12.yQ, ahnhVar12.yR, ahnhVar12.yS, ahnhVar12.yT, ahknVar10.aI);
            case 1423:
                return (evrj) ((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45668101").c();
            case 1424:
                return (evrj) ((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45669099").c();
            case 1425:
                return Long.valueOf(((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45669943").b());
            case 1426:
                return Boolean.valueOf(((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45686844").e());
            case 1427:
                ahkn ahknVar11 = this.a;
                return new ampl(ahknVar11.a.m, ahknVar11.dK, ahknVar11.iz);
            case 1428:
                ahkn ahknVar12 = this.a;
                return new ampb(ahknVar12.a.m, ahknVar12.dK);
            case 1429:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar13 = ahknVar13.a;
                return new amqu(ahnhVar13.m, ahnhVar13.oS, ahknVar13.cD, ahknVar13.iA, ahknVar13.dK);
            case 1430:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar14 = ahknVar14.a;
                return new ammu(ahnhVar14.m, ahnhVar14.oQ, ahknVar14.cD, ahknVar14.dK);
            case 1431:
                ahkn ahknVar15 = this.a;
                return new amol(ahknVar15.a.m, ahknVar15.dK);
            case 1432:
                ahkn ahknVar16 = this.a;
                return new amzc(ahknVar16.a.oS, ahknVar16.p);
            case 1433:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqun() { // from class: aqua
                    @Override // defpackage.aqun
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_emergency_questionnaire_with_initial_value");
                    }
                };
            case 1434:
                ahnh ahnhVar15 = this.a.a;
                return new amyt(ahnhVar15.oS, ahnhVar15.zd, ahnhVar15.ze);
            case 1435:
                ahkn ahknVar17 = this.a;
                return new ccwv((fdjx) ahknVar17.a.oS.b(), (fcyh) ahknVar17.cA.b());
            case 1436:
                return new aquq() { // from class: aqug
                };
            case 1437:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar16 = ahknVar18.a;
                return new akey(ahnhVar16.m, ahnhVar16.oS, ahknVar18.dK);
            case 1438:
                ahkn ahknVar19 = this.a;
                return new ccwo((fdjx) ahknVar19.a.oS.b(), ahknVar19.cD);
            case 1439:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar17 = ahknVar20.a;
                ajxb ajxbVarAx = ahnhVar17.ax();
                ahknVar20.jb();
                eyik eyikVar14 = ahknVar20.cD;
                eyik eyikVar15 = ahnhVar17.uI;
                eyik eyikVar16 = ahnhVar17.sL;
                eyik eyikVar17 = ahnhVar17.AS;
                eyik eyikVar18 = ahnhVar17.GT;
                eyik eyikVar19 = ahnhVar17.Bj;
                eyik eyikVar20 = ahnhVar17.HJ;
                eyik eyikVar21 = ahnhVar17.sh;
                cogw cogwVar = (cogw) eyikVar14.b();
                eosc eoscVar = (eosc) ahknVar20.p.b();
                eosc eoscVar2 = (eosc) ahknVar20.y.b();
                eosc eoscVar3 = (eosc) ahknVar20.aJ.b();
                byeq byeqVar = (byeq) ahnhVar17.sG.b();
                eyik eyikVar22 = ahnhVar17.AM;
                eyik eyikVar23 = ahnhVar17.Jq;
                akfs akfsVar = (akfs) ahnhVar17.AK.b();
                eyik eyikVar24 = ahnhVar17.QL;
                eyik eyikVar25 = ahnhVar17.Pb;
                aqhc aqhcVar = (aqhc) eyikVar24.b();
                eyik eyikVar26 = ahnhVar17.Th;
                eyik eyikVar27 = ahnhVar17.OY;
                eyik eyikVar28 = ahnhVar17.Ti;
                eyik eyikVar29 = ahnhVar17.Tj;
                eyik eyikVar30 = ahnhVar17.Tk;
                eyik eyikVar31 = ahnhVar17.Sn;
                eyik eyikVar32 = ahnhVar17.Pa;
                eyik eyikVar33 = ahnhVar17.Tl;
                eyik eyikVar34 = ahnhVar17.Tm;
                eyik eyikVar35 = ahnhVar17.yz;
                eyik eyikVar36 = ahnhVar17.Bg;
                eyik eyikVar37 = ahnhVar17.Tn;
                eyik eyikVar38 = ahnhVar17.To;
                eyik eyikVar39 = ahnhVar17.Ta;
                eyik eyikVar40 = ahnhVar17.Tb;
                eyik eyikVar41 = ahnhVar17.Tc;
                eyik eyikVar42 = ahnhVar17.Td;
                eyik eyikVar43 = ahnhVar17.Te;
                eyik eyikVar44 = ahnhVar17.Tg;
                eyik eyikVar45 = ahnhVar17.SX;
                eyik eyikVar46 = ahnhVar17.SY;
                eyik eyikVar47 = ahnhVar17.SO;
                eyik eyikVar48 = ahnhVar17.SH;
                eyik eyikVar49 = ahnhVar17.SN;
                eyik eyikVar50 = ahnhVar17.Sc;
                return new ajzc(ajxbVarAx, ahnhVar17.So, eyikVar15, eyikVar16, eyikVar17, ahnhVar17.SE, eyikVar18, eyikVar19, ahnhVar17.SF, eyikVar20, eyikVar48, eyikVar49, eyikVar50, eyikVar21, cogwVar, eoscVar, eoscVar2, eoscVar3, byeqVar, eyikVar47, eyikVar22, eyikVar23, akfsVar, eyikVar45, eyikVar46, eyikVar25, eyikVar39, eyikVar40, eyikVar41, eyikVar42, eyikVar43, eyikVar44, aqhcVar, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar36, eyikVar37, eyikVar38);
            case 1440:
                ahkn ahknVar21 = this.a;
                Context context = (Context) ahknVar21.t.b();
                eosc eoscVar4 = (eosc) ahknVar21.p.b();
                eosc eoscVar5 = (eosc) ahknVar21.aJ.b();
                aokp aokpVarAu = ahknVar21.au();
                cqtp cqtpVar = (cqtp) ahknVar21.dK.b();
                ahnh ahnhVar18 = ahknVar21.a;
                alrj alrjVar = (alrj) ahnhVar18.qi.b();
                anqr anqrVarAP = ahnhVar18.aP();
                anuh anuhVar = (anuh) ahnhVar18.zO.b();
                eyik eyikVar51 = ahnhVar18.zT;
                eyik eyikVar52 = ahnhVar18.zW;
                eyik eyikVar53 = ahnhVar18.zX;
                eyik eyikVar54 = ahnhVar18.zY;
                eyik eyikVar55 = ahnhVar18.zZ;
                eyik eyikVar56 = ahnhVar18.Aa;
                eyik eyikVar57 = ahnhVar18.zP;
                eyik eyikVar58 = ahnhVar18.qq;
                eyik eyikVar59 = ahnhVar18.At;
                ahkn ahknVar22 = ahnhVar18.a;
                return new antf(context, eoscVar4, eoscVar5, aokpVarAu, cqtpVar, alrjVar, anqrVarAP, anuhVar, eyikVar51, eyikVar52, eyikVar53, eyikVar54, eyikVar55, eyikVar56, ahknVar21.cW, eyikVar57, eyikVar58, eyikVar59, Optional.of(new aobn((Context) ahknVar22.t.b(), (fdjx) ahnhVar18.oS.b(), ahnhVar18.Au, ahnhVar18.Av, ahnhVar18.zG, ahnhVar18.Aw, ahknVar22.jn, ahnhVar18.yD, ahknVar22.jo, (dqsn) ahnhVar18.qq.b())), Optional.of(ahnhVar18.Ac), ahknVar21.jn);
            case 1441:
                ahnh ahnhVar19 = this.a.a;
                ahkn ahknVar23 = ahnhVar19.a;
                return new anyt(ahknVar23.dK, ahknVar23.p, ahknVar23.aJ, ahnhVar19.xB, ahnhVar19.zl, ahnhVar19.zm);
            case 1442:
                ahnh ahnhVar20 = this.a.a;
                asyh asyhVarCX = ahnhVar20.cX();
                aszw aszwVarDa = ahnhVar20.da();
                return ((awif) ahnhVar20.qq()).a(ahnhVar20.bk().a() ? ahnhVar20.cS().a(aszwVarDa, null) : asyhVarCX.i(aszwVarDa));
            case 1443:
                final eyik eyikVar60 = this.a.a.oO;
                return new aoor() { // from class: aopg
                    @Override // defpackage.aoor
                    public final boolean a() {
                        return ((eoth) eyikVar60.b()).a("bugle.add_is_valid_in_rcs_capabilities");
                    }
                };
            case 1444:
                ahnh ahnhVar21 = this.a.a;
                asyh asyhVarCX2 = ahnhVar21.cX();
                aszw aszwVarDa2 = ahnhVar21.da();
                return ((awif) ahnhVar21.qq()).a(ahnhVar21.bk().a() ? ahnhVar21.cT().a(aszwVarDa2, null) : asyhVarCX2.c(aszwVarDa2));
            case 1445:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar22 = ahknVar24.a;
                return new anwg(ahnhVar22.m, ahnhVar22.oS, ahknVar24.dK, ahknVar24.iA, ahknVar24.iB);
            case 1446:
                return new anxi(this.a.a.zq);
            case 1447:
                return Optional.of(this.a.a.qm());
            case 1448:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar23 = ahknVar25.a;
                ahkn ahknVar26 = ahnhVar23.a;
                final aszl aszlVar = new aszl(new aszm(ahnhVar23.rk, ekgp.o(enmr.TRANSPORT_UNKNOWN, ahknVar26.iD, enmr.TRANSPORT_RCS, ahnhVar23.xH, enmr.TRANSPORT_TACHYGRAM, ahnhVar23.ya, enmr.TRANSPORT_SINGLE_REGISTRATION, ahnhVar23.xJ)), (eosc) ((ahkl) ahknVar26.iC.b()).a.a.p.b());
                return ahknVar25.aG().a(new java.util.function.Function() { // from class: aszq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ java.util.function.Function mo536andThen(java.util.function.Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return aszlVar.d((aubq) obj);
                    }

                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            case 1449:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar24 = ahknVar27.a;
                return new chot(ahnhVar24.qi, ahnhVar24.qo, ahnhVar24.zx, ahknVar27.cA, ahnhVar24.zy, ahnhVar24.zz);
            case 1450:
                ahkn ahknVar28 = this.a;
                Context context2 = (Context) ahknVar28.t.b();
                ahnh ahnhVar25 = ahknVar28.a;
                return new cqsx(context2, (cqsu) ahnhVar25.xi.b(), (aipo) ahnhVar25.us.b(), (ains) ahnhVar25.c.b(), (cqui) ahnhVar25.zt.b(), (cogw) ahknVar28.cD.b(), (cqmz) ahknVar28.ic.b(), (cqtc) ahnhVar25.zv.b(), ahnhVar25.zw);
            case 1451:
                ahkn ahknVar29 = this.a;
                return new cqui(ahknVar29.a.zs, new cqug(), (Executor) ahknVar29.p.b());
            case 1452:
                ahkn ahknVar30 = this.a;
                return new aivi(ahknVar30.a.qr, (cqpz) ahknVar30.aN.b());
            case 1453:
                ahkn ahknVar31 = this.a;
                eyik eyikVar61 = ahknVar31.aQ;
                ahnh ahnhVar26 = ahknVar31.a;
                return new cqtc(ahnhVar26.qK, (egzh) eyikVar61.b(), ahnhVar26.c, ahnhVar26.zu);
            case 1454:
                final eyik eyikVar62 = this.a.a.oO;
                return new arls() { // from class: arlb
                    @Override // defpackage.arls
                    public final boolean a() {
                        return ((eoth) eyikVar62.b()).a("bugle.enable_different_rcs_image_compression_settings");
                    }
                };
            case 1455:
                final eyik eyikVar63 = this.a.a.oO;
                return new arlt() { // from class: arld
                    @Override // defpackage.arlt
                    public final boolean a() {
                        return ((eoth) eyikVar63.b()).a("bugle.enable_jpegli_encoder");
                    }
                };
            case 1456:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45426952").b());
            case 1457:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45426953").b());
            case 1458:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar27 = ahknVar32.a;
                return new choz(ahknVar32.p, ahknVar32.iH, ahnhVar27.m, ahnhVar27.zB, ahnhVar27.zH);
            case 1459:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45653926").b());
            case 1460:
                return Optional.of(this.a.a.zG);
            case 1461:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar28 = ahknVar33.a;
                return new chjq(ahnhVar28.zF, ahknVar33.jg, ahnhVar28.pb);
            case 1462:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar29 = ahknVar34.a;
                return new aisw((fdjx) ahnhVar29.oS.b(), (dsvn) ahnhVar29.zD.b(), (cogw) ahknVar34.cD.b(), ahnhVar29.zE, ahnhVar29.qY, (aite) ahknVar34.je.b());
            case 1463:
                ahkn ahknVar35 = this.a;
                return new dsxo((dsuh) ahknVar35.a.zC.b(), (dstz) ahknVar35.jd.b());
            case 1464:
                ahkn ahknVar36 = this.a;
                dsud dsudVarMr = ahknVar36.a.mr();
                eosc eoscVar6 = (eosc) ahknVar36.y.b();
                eyik eyikVar64 = ahknVar36.jc;
                eksp ekspVar = dszz.a;
                ekph ekphVar = new ekph(new Object() { // from class: dszy
                });
                return new dsuh(eoscVar6, eyikVar64, ekphVar, dsudVarMr);
            case 1465:
                return Long.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45409632").b());
            case 1466:
                ahnh ahnhVar30 = this.a.a;
                return new anvv(ahnhVar30.qo, ahnhVar30.so);
            case 1467:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar31 = ahknVar37.a;
                return new anvq(ahknVar37.jh, ahknVar37.cA, ahnhVar31.m, ahknVar37.ji, ahknVar37.cE, (aofc) ahnhVar31.yD.b(), (cdni) ahnhVar31.vX.b(), ahnhVar31.bu());
            case 1468:
                ahkn ahknVar38 = this.a;
                Context context3 = (Context) ahknVar38.t.b();
                ahnh ahnhVar32 = ahknVar38.a;
                return new anui(context3, ahnhVar32.qi, ahnhVar32.wF, ahnhVar32.qa, ahknVar38.jj, ahknVar38.cL, ahknVar38.cK, ahnhVar32.zM, ahnhVar32.pD, ahnhVar32.zN);
            case 1469:
                return new chsl(this.a.a.zL);
            case 1470:
                return new aqah() { // from class: apjk
                };
            case 1471:
                final eyik eyikVar65 = this.a.a.oO;
                return new apzt() { // from class: apil
                    @Override // defpackage.apzt
                    public final boolean a() {
                        return ((eoth) eyikVar65.b()).a("bugle.use_legacy_normalized_instead_of_comparable");
                    }
                };
            case 1472:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar33 = ahknVar39.a;
                return new anvt((fdjx) ahnhVar33.m.b(), (fcyh) ahknVar39.cA.b(), ahnhVar33.zS);
            case 1473:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar34 = ahknVar40.a;
                return new bbcw(ahnhVar34.qi, ahnhVar34.sL, ahnhVar34.zO, ahnhVar34.zP, (dqsn) ahnhVar34.qq.b(), ahnhVar34.qx, eyie.a(ahknVar40.jk), eyie.a(ahknVar40.jl), ahnhVar34.zQ, ahnhVar34.qw, ahnhVar34.zR, ahnhVar34.pQ, ahnhVar34.pM);
            case 1474:
                return new awcn(this.a.a.pA);
            case 1475:
                ahkn ahknVar41 = this.a;
                return new awgl((eosc) ahknVar41.y.b(), (dqsn) ahknVar41.a.qq.b());
            case 1476:
                return new ahkv(this);
            case 1477:
                ahnh ahnhVar35 = this.a.a;
                return new antm((dqsn) ahnhVar35.qq.b(), ahnhVar35.zU);
            case 1478:
                final eyik eyikVar66 = this.a.a.oO;
                return new apty() { // from class: apak
                    @Override // defpackage.apty
                    public final boolean a() {
                        return ((eoth) eyikVar66.b()).a("bugle.fix_run_after_commit_dedup_id_collision");
                    }
                };
            case 1479:
                return new ahkw(this);
            case 1480:
                return new ahkx(this);
            case 1481:
                ahkn ahknVar42 = this.a;
                eyik eyikVar67 = ahknVar42.p;
                ahnh ahnhVar36 = ahknVar42.a;
                return new anxz(eyikVar67, ahknVar42.aJ, ahnhVar36.xB, ahnhVar36.zm, ahnhVar36.zl, ahknVar42.dK);
            case 1482:
                return new ahkz(this);
            case 1483:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar37 = ahknVar43.a;
                return new aoan((alrj) ahnhVar37.qi.b(), ahnhVar37.Ab, ahnhVar37.zM, ahnhVar37.pb, (fdjx) ahnhVar37.oQ.b(), ahnhVar37.pf, ahnhVar37.Af, ahnhVar37.Ag, ahnhVar37.sG, ahknVar43.cE, ahnhVar37.Am, ahnhVar37.Aq, ahnhVar37.rc, ahnhVar37.Ar, ahnhVar37.Ap, ahnhVar37.As);
            case 1484:
                ahnh ahnhVar38 = this.a.a;
                return new bbax(ahnhVar38.qk, ahnhVar38.zM);
            case 1485:
                ahnh ahnhVar39 = this.a.a;
                return new awlc(ahnhVar39.Ae, (fdjx) ahnhVar39.m.b());
            case 1486:
                ahnh ahnhVar40 = this.a.a;
                return new ekph(new aoax((fdjx) ahnhVar40.oQ.b(), Optional.of(ahnhVar40.wt), Optional.of(ahnhVar40.Ac), ahnhVar40.Ad, ahnhVar40.sL, ahnhVar40.bv()));
            case 1487:
                ahkn ahknVar44 = this.a;
                Context context4 = (Context) ahknVar44.t.b();
                bxgr bxgrVar = (bxgr) ahknVar44.ib.b();
                ahnh ahnhVar41 = ahknVar44.a;
                return new axjv(context4, bxgrVar, ahnhVar41.qk, ahnhVar41.sL, ahknVar44.y);
            case 1488:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45632698").b());
            case 1489:
                ahkn ahknVar45 = this.a;
                eyik eyikVar68 = ahknVar45.aJ;
                ahnh ahnhVar42 = ahknVar45.a;
                return new aweh(ahnhVar42.Ah, (eosc) eyikVar68.b(), (eosc) ahknVar45.y.b(), (eosc) ahknVar45.p.b(), eyie.a(ahnhVar42.zQ), ahnhVar42.qq, (dzuc) ahknVar45.cE.b(), ahnhVar42.sL, ahnhVar42.pQ, ahnhVar42.Ai, ahnhVar42.pV, ahnhVar42.Aj, ahnhVar42.pM, ahknVar45.jm, ahnhVar42.pA, ahnhVar42.Ak, ahnhVar42.Al);
            case 1490:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar43 = ahknVar46.a;
                return new awfd(ahnhVar43.zR, (eosc) ahknVar46.p.b(), ahnhVar43.qK);
            case 1491:
                final eyik eyikVar69 = this.a.a.oO;
                return new ardy() { // from class: arcd
                    @Override // defpackage.ardy
                    public final boolean a() {
                        return ((eoth) eyikVar69.b()).a("bugle.merge_mms_messages_into_rcs_groups");
                    }
                };
            case 1492:
                ahnh ahnhVar44 = this.a.a;
                return new avor(ahnhVar44.sL, ahnhVar44.pV);
            case 1493:
                final eyik eyikVar70 = this.a.a.oO;
                return new apqr() { // from class: aovi
                    @Override // defpackage.apqr
                    public final boolean a() {
                        return ((eoth) eyikVar70.b()).a("bugle.conversation_creation_correctness_check");
                    }
                };
            case 1494:
                final eyik eyikVar71 = this.a.a.oO;
                return new aoos() { // from class: aopi
                    @Override // defpackage.aoos
                    public final boolean a() {
                        return ((eoth) eyikVar71.b()).a("bugle.add_sync_method_to_participant_matcher");
                    }
                };
            case 1495:
                ahkn ahknVar47 = this.a;
                Context context5 = (Context) ahknVar47.t.b();
                fcyh fcyhVar = (fcyh) ahknVar47.cz.b();
                ahnh ahnhVar45 = ahknVar47.a;
                return new avgc(context5, fcyhVar, ahnhVar45.oS, ahknVar47.cA, (Executor) ahknVar47.p.b(), (egxv) ahnhVar45.ut.b(), ahnhVar45.An, ahnhVar45.Ao, ahknVar47.cD, ahnhVar45.Ap);
            case 1496:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.enable_cp2_third_party_services"));
            case 1497:
                return Boolean.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45427448").e());
            case 1498:
                final eyik eyikVar72 = this.a.a.oO;
                return new aqis() { // from class: aqii
                    @Override // defpackage.aqis
                    public final boolean a() {
                        return ((eoth) eyikVar72.b()).a("bugle.disable_date_in_avatar_signature");
                    }
                };
            case 1499:
                ahnh ahnhVar46 = this.a.a;
                return new aixq((cmvy) ahnhVar46.pE.b(), ahnhVar46.qi, (aqbh) ahnhVar46.qa.b(), new aqns(ahnhVar46.oO));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 1500:
                final eyik eyikVar = this.a.a.oO;
                return new aqit() { // from class: aqik
                    @Override // defpackage.aqit
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_directory_id_update_on_contact_sync");
                    }
                };
            case 1501:
                return Long.valueOf(fass.a(this.a.a.oG()));
            case 1502:
                return new chsm((cmvy) this.a.a.pE.b());
            case 1503:
                return new ekph((bxkq) this.a.a.zV.b());
            case 1504:
                ahkn ahknVar = this.a;
                eyik eyikVar2 = ahknVar.dK;
                eyik eyikVar3 = ahknVar.t;
                eyik eyikVar4 = ahknVar.p;
                ahnh ahnhVar = ahknVar.a;
                return new ajvo(eyikVar2, eyikVar3, eyikVar4, ahknVar.aJ, ahknVar.iA, ahnhVar.yD, ahnhVar.AK, ahnhVar.qi, ahnhVar.Bc, ahnhVar.qa, ahnhVar.yG, ahnhVar.Ax, ahnhVar.Bd, ahknVar.cD, ahnhVar.Bf, ahnhVar.Be, ahnhVar.Bg, ahnhVar.vV, ahnhVar.Bh, ahnhVar.sM, ahnhVar.Bi);
            case 1505:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new akfs(ahnhVar2.AI, ahnhVar2.AJ, ahnhVar2.oS, ahnhVar2.oQ, ahknVar2.jq, ahknVar2.jr);
            case 1506:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar3 = ahknVar3.a;
                return new akgj(ahnhVar3.m, ahnhVar3.oQ, ahknVar3.dK, ahknVar3.iA, ahnhVar3.AH, ahnhVar3.pT, ahnhVar3.sP);
            case 1507:
                return Optional.of(this.a.a.it());
            case 1508:
                ahnh ahnhVar4 = this.a.a;
                return new agyk((cepb) ahnhVar4.qQ.b(), ahnhVar4.Ay);
            case 1509:
                ahnh ahnhVar5 = this.a.a;
                return new cepe(ahnhVar5.xV, ahnhVar5.se, ahnhVar5.qQ);
            case 1510:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar6 = ahknVar4.a;
                return new cnio(ahknVar4.jp, ahnhVar6.pI, ahnhVar6.AC, (ains) ahnhVar6.pQ.b());
            case 1511:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar7 = ahknVar5.a;
                return new cgum((fdjx) ahnhVar7.oS.b(), (fdjx) ahnhVar7.m.b(), (lkb) ahnhVar7.AA.b(), ahnhVar7.pG, ahknVar5.aQ, ahnhVar7.AB, ahnhVar7.Ax, ahnhVar7.qi);
            case 1512:
                ahkn ahknVar6 = this.a;
                return cgsz.a((Context) ahknVar6.t.b(), (fdjx) ahknVar6.a.oQ.b());
            case 1513:
                ahnh ahnhVar8 = this.a.a;
                return new baqt(ahnhVar8.c, ahnhVar8.AF, ahnhVar8.qi, ahnhVar8.sL);
            case 1514:
                ahnh ahnhVar9 = this.a.a;
                return new bxjb(ahnhVar9.uy, ahnhVar9.uJ, ahnhVar9.c, (cmqj) ahnhVar9.uv.b(), ahnhVar9.qi, ahnhVar9.qx, ahnhVar9.AE);
            case 1515:
                return new aryn() { // from class: arxy
                };
            case 1516:
                ahnh ahnhVar10 = this.a.a;
                return new akfr((dqsn) ahnhVar10.qq.b(), (fdjx) ahnhVar10.oS.b());
            case 1517:
                ahnh ahnhVar11 = this.a.a;
                return new aojd((fdjx) ahnhVar11.oS.b(), (axfu) ahnhVar11.qC.b(), ahnhVar11.aT(), (aofp) ahnhVar11.AY.b(), (aojw) ahnhVar11.Bb.b());
            case 1518:
                ahnh ahnhVar12 = this.a.a;
                return new clpk(ahnhVar12.jX(), (clhc) ahnhVar12.st.b(), (fdjx) ahnhVar12.oS.b(), (fdjx) ahnhVar12.oQ.b(), (bxjn) ahnhVar12.wK.b());
            case 1519:
                ahnh ahnhVar13 = this.a.a;
                return avov.a(ahnhVar13.Am, ahnhVar13.AL);
            case 1520:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar14 = ahknVar7.a;
                return new avpr(ahnhVar14.qq, ahnhVar14.Am, (eosc) ahknVar7.y.b(), (eosc) ahknVar7.p.b(), (dzuc) ahknVar7.cE.b());
            case 1521:
                ahkn ahknVar8 = this.a;
                eosc eoscVar = (eosc) ahknVar8.y.b();
                ahnh ahnhVar15 = ahknVar8.a;
                return new avno(eoscVar, ahnhVar15.uI, ahnhVar15.qq, ahnhVar15.AQ, ahnhVar15.AR);
            case 1522:
                ahnh ahnhVar16 = this.a.a;
                return new cdww(ahnhVar16.uI, (dqsn) ahnhVar16.qq.b(), ahnhVar16.uG, ahnhVar16.uJ, ahnhVar16.sL, ahnhVar16.ww, ahnhVar16.pQ, ahnhVar16.AN, (arkz) ahnhVar16.AO.b(), ahnhVar16.AP);
            case 1523:
                final eyik eyikVar5 = this.a.a.oO;
                return new arqh() { // from class: arpz
                    @Override // defpackage.arqh
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.ignore_super_sort_label_when_deleting_convo");
                    }
                };
            case 1524:
                final eyik eyikVar6 = this.a.a.oO;
                return new arkz() { // from class: arkq
                    @Override // defpackage.arkz
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.enable_message_delete_clearcut_logs");
                    }
                };
            case 1525:
                return new cdwx(this.a.a.rc);
            case 1526:
                return new catv(this.a.a.rF);
            case 1527:
                ahnh ahnhVar17 = this.a.a;
                return new ammy((fdjx) ahnhVar17.oS.b(), (clhd) ahnhVar17.AU.b());
            case 1528:
                ahnh ahnhVar18 = this.a.a;
                return new clhj(ahnhVar18.qK, (clhc) ahnhVar18.st.b(), (fdjx) ahnhVar18.oS.b());
            case 1529:
                return new amnc(this.a.a.tb);
            case 1530:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar19 = ahknVar9.a;
                return new aofp(ahknVar9.dK, ahnhVar19.m, ahnhVar19.tb, ahnhVar19.sX, ahnhVar19.AX);
            case 1531:
                final eyik eyikVar7 = this.a.a.oO;
                return new asap() { // from class: arzt
                    @Override // defpackage.asap
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.use_distinct_connection_type_for_off_satellite");
                    }
                };
            case 1532:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar20 = ahknVar10.a;
                eyik eyikVar8 = ahknVar10.dK;
                eyik eyikVar9 = ahnhVar20.m;
                eyik eyikVar10 = ahnhVar20.tb;
                eyik eyikVar11 = ahnhVar20.AZ;
                return new aojw(eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar11, ahnhVar20.Ba);
            case 1533:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar21 = ahknVar11.a;
                return new cqik((fdjx) ahnhVar21.m.b(), ahknVar11.dO, ahnhVar21.su, ahnhVar21.pf);
            case 1534:
                return new asas() { // from class: arzz
                };
            case 1535:
                final eyik eyikVar12 = this.a.a.oO;
                return new ardk() { // from class: arbc
                    @Override // defpackage.ardk
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.enable_group_icon_on_update");
                    }
                };
            case 1536:
                return new akkh((arpr) this.a.a.Be.b());
            case 1537:
                final eyik eyikVar13 = this.a.a.oO;
                return new arpr() { // from class: arpk
                    @Override // defpackage.arpr
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_mute_chat_notification");
                    }
                };
            case 1538:
                return new apwn() { // from class: apek
                };
            case 1539:
                return new ahla(this);
            case 1540:
                return new arde() { // from class: arat
                };
            case 1541:
                return new ahlb(this);
            case 1542:
                ahnh ahnhVar22 = this.a.a;
                amdy amdyVar = (amdy) ahnhVar22.RV.b();
                amfc.a(amdyVar);
                return amdyVar;
            case 1543:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar23 = ahknVar12.a;
                return new amgx((fdjx) ahnhVar23.m.b(), ahknVar12.hV, (amdy) ahnhVar23.RV.b(), ahnhVar23.QE);
            case 1544:
                ahkn ahknVar13 = this.a;
                eyik eyikVar14 = ahknVar13.dK;
                eyik eyikVar15 = ahknVar13.p;
                eyik eyikVar16 = ahknVar13.y;
                ahnh ahnhVar24 = ahknVar13.a;
                eyik eyikVar17 = ahnhVar24.Qu;
                eyik eyikVar18 = ahknVar13.ir;
                eyik eyikVar19 = ahnhVar24.Rh;
                eyik eyikVar20 = ahnhVar24.Ji;
                eyik eyikVar21 = ahknVar13.lx;
                eyik eyikVar22 = ahnhVar24.Cg;
                eyik eyikVar23 = ahnhVar24.Rj;
                eyik eyikVar24 = ahnhVar24.Rl;
                eyik eyikVar25 = ahnhVar24.Rn;
                eyik eyikVar26 = ahnhVar24.xO;
                eyik eyikVar27 = ahnhVar24.Rq;
                eyik eyikVar28 = ahnhVar24.Rr;
                eyik eyikVar29 = ahnhVar24.Rs;
                eyik eyikVar30 = ahnhVar24.Ru;
                eyik eyikVar31 = ahnhVar24.Rv;
                eyik eyikVar32 = ahnhVar24.Rx;
                eyik eyikVar33 = ahnhVar24.Qy;
                eyik eyikVar34 = ahnhVar24.RA;
                eyik eyikVar35 = ahknVar13.cD;
                eyik eyikVar36 = ahnhVar24.RC;
                eyik eyikVar37 = ahnhVar24.CJ;
                eyik eyikVar38 = ahknVar13.nk;
                eyik eyikVar39 = ahknVar13.nl;
                eyik eyikVar40 = ahknVar13.aJ;
                eyik eyikVar41 = ahnhVar24.Qi;
                eyik eyikVar42 = ahnhVar24.QB;
                eyik eyikVar43 = ahnhVar24.QC;
                eyik eyikVar44 = ahnhVar24.QD;
                eyik eyikVar45 = ahnhVar24.QE;
                eyik eyikVar46 = ahnhVar24.QF;
                eyik eyikVar47 = ahnhVar24.QX;
                eyik eyikVar48 = ahknVar13.mZ;
                eyik eyikVar49 = ahnhVar24.RE;
                eyik eyikVar50 = ahnhVar24.BF;
                return new amdy(eyikVar14, eyikVar15, eyikVar16, eyikVar40, eyikVar41, eyikVar42, eyikVar43, eyikVar44, eyikVar45, eyikVar46, eyikVar47, eyikVar48, ahknVar13.na, ahnhVar24.Rg, ahknVar13.nc, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, ahnhVar24.Ro, ahknVar13.nh, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar36, eyikVar37, ahknVar13.nj, ahnhVar24.RD, ahknVar13.mY, eyikVar38, eyikVar39, eyikVar49, eyikVar50, ahnhVar24.RG, ahnhVar24.RH, ahnhVar24.RI, ahnhVar24.RJ, ahnhVar24.RK, ahnhVar24.RN, ahnhVar24.RO, ahnhVar24.RP, ahnhVar24.RQ, ahnhVar24.RR, ahnhVar24.RS, ahnhVar24.RT, ahnhVar24.AO, ahnhVar24.RU);
            case 1545:
                ahkn ahknVar14 = this.a;
                eyik eyikVar51 = ahknVar14.p;
                eyik eyikVar52 = ahknVar14.ir;
                ahnh ahnhVar25 = ahknVar14.a;
                return new amli(eyikVar51, eyikVar52, ahnhVar25.Bl, ahnhVar25.Bp, ahnhVar25.yK, ahnhVar25.Cf, ahnhVar25.Qg, eyil.a(ahknVar14.cD), ahnhVar25.Qh);
            case 1546:
                ahkn ahknVar15 = this.a;
                return new amsr(ahknVar15.js, ahknVar15.dK, ahknVar15.a.qi, ahknVar15.p, ahknVar15.cD);
            case 1547:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar26 = ahknVar16.a;
                return new ammm(ahknVar16.dK, ahknVar16.p, ahknVar16.y, ahnhVar26.AW, ahknVar16.aN, ahnhVar26.qa, ahnhVar26.AV, ahnhVar26.Ax, eyil.a(ahnhVar26.Bn), ahnhVar26.Bg, ahnhVar26.Bo);
            case 1548:
                ahkn ahknVar17 = this.a;
                eosc eoscVar2 = (eosc) ahknVar17.aJ.b();
                ahnh ahnhVar27 = ahknVar17.a;
                return new ajwa(eoscVar2, ahnhVar27.Bm, ahnhVar27.yw, ahknVar17.cD);
            case 1549:
                ahnh ahnhVar28 = this.a.a;
                return new akaj(ahnhVar28.Bm, (fdjx) ahnhVar28.m.b());
            case 1550:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar29 = ahknVar18.a;
                return new aleu(ahnhVar29.BU, ahnhVar29.BY, ahknVar18.cA, ahnhVar29.BR, ahnhVar29.BV, ahnhVar29.BZ, ahnhVar29.Ca, ahnhVar29.BQ, ahnhVar29.Ce, ahnhVar29.m);
            case 1551:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar30 = ahknVar19.a;
                return new aled(ahnhVar30.m, ahnhVar30.oS, ahknVar19.dK, ahnhVar30.BR, ahnhVar30.BS, ahnhVar30.BT);
            case 1552:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar31 = ahknVar20.a;
                return new alcn(ahnhVar31.m, ahknVar20.dK, ahknVar20.iA, ahnhVar31.BN, ahnhVar31.BO, ahnhVar31.BP, ahnhVar31.BQ);
            case 1553:
                ahkn ahknVar21 = this.a;
                return new cmxz((crba) ahknVar21.jt.b(), ahknVar21.a.kB(), new cmyc());
            case 1554:
                return Boolean.valueOf(aoqk.a((eoth) this.a.a.oO.b()));
            case 1555:
                return new crgr(this.a.a.BA);
            case 1556:
                ahkn ahknVar22 = this.a;
                return new crgq((eosc) ahknVar22.p.b(), (fcyh) ahknVar22.bM.b(), ahknVar22.a.Bz);
            case 1557:
                ahkn ahknVar23 = this.a;
                return new cduc((cdte) ahknVar23.a.By.b(), (ecev) ahknVar23.jF.b(), (Executor) ahknVar23.p.b(), (Executor) ahknVar23.y.b(), (cdtc) ahknVar23.jT.b());
            case 1558:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar32 = ahknVar24.a;
                return cdui.a(ahnhVar32.Br, ahnhVar32.Bx, ahknVar24.jM, (eosc) ahknVar24.y.b(), (eosc) ahknVar24.p.b(), ahknVar24.jS, (crnp) ahknVar24.cI.b());
            case 1559:
                ahkn ahknVar25 = this.a;
                return dvam.a((Context) ahknVar25.t.b(), (eosc) ahknVar25.aJ.b(), (ekgb) ahknVar25.a.Bw.b(), (dtvv) ahknVar25.jO.b(), (ecev) ahknVar25.jF.b(), (duvt) ahknVar25.jD.b(), ejwi.j((duvp) ahknVar25.jE.b()), (ejxr) ahknVar25.jG.b(), ejwi.j((dtyx) ahknVar25.jP.b()), (dtvz) ahknVar25.jQ.b(), (duvk) ahknVar25.jv.b(), (dtvq) ahknVar25.jR.b(), (ecjl) ahknVar25.jI.b(), ejwi.h(), ejwi.h(), (dtpi) ahknVar25.ju.b(), ejwi.h(), ejwi.h());
            case 1560:
                ahkn ahknVar26 = this.a;
                return cduh.a(ahknVar26.a.rC(), (dtpd) ahknVar26.jL.b(), (String) ahknVar26.jK.b(), (dtpd) ahknVar26.jM.b());
            case 1561:
                ahkn ahknVar27 = this.a;
                Context context = (Context) ahknVar27.t.b();
                ahnh ahnhVar33 = ahknVar27.a;
                return cdvk.a(context, ahnhVar33.mm(), ahnhVar33.qN(), ahnhVar33.qM(), new cduw(), new duzr(), ahknVar27.dE(), (ExecutorService) ahknVar27.p.b(), (ExecutorService) ahknVar27.aJ.b(), (ExecutorService) ahknVar27.y.b(), ahnhVar33.qV());
            case 1562:
                return faqv.a(this.a.a.oy());
            case 1563:
                return faqu.a(this.a.a.oy());
            case 1564:
                return faqt.a(this.a.a.oy());
            case 1565:
                ahkn ahknVar28 = this.a;
                return new cdur(ahknVar28.a.zs, (Executor) ahknVar28.p.b());
            case 1566:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar34 = ahknVar29.a;
                return new crej(ahknVar29.gF, ahnhVar34.BD, ahnhVar34.rf());
            case 1567:
                ahkn ahknVar30 = this.a;
                Context context2 = (Context) ahknVar30.t.b();
                eyik eyikVar53 = ahknVar30.cA;
                ahnh ahnhVar35 = ahknVar30.a;
                return new csei(context2, ahknVar30.gE, ahknVar30.aT, ahnhVar35.BC, (fcyh) eyikVar53.b());
            case 1568:
                ahkn ahknVar31 = this.a;
                Context context3 = (Context) ahknVar31.t.b();
                eyik eyikVar54 = ahknVar31.aJ;
                return new crxn(context3, ahknVar31.jU, ahknVar31.aQ, (eosc) eyikVar54.b(), (fdjx) ahknVar31.a.oS.b());
            case 1569:
                ahkn ahknVar32 = this.a;
                eosc eoscVar3 = (eosc) ahknVar32.p.b();
                ahnh ahnhVar36 = ahknVar32.a;
                return new crlj(eoscVar3, (fdjx) ahnhVar36.m.b(), (fdjx) ahnhVar36.oS.b(), ahknVar32.jV, ahnhVar36.kl(), ahknVar32.dj, ahknVar32.aQ, ahnhVar36.BF);
            case 1570:
                return Optional.of((cdvn) this.a.a.BE.b());
            case 1571:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar37 = ahknVar33.a;
                return new afko((fdjx) ahnhVar37.m.b(), (fcyh) ahknVar33.cz.b(), (dqsy) ahnhVar37.tt.b(), ahnhVar37.uJ);
            case 1572:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar38 = ahknVar34.a;
                return new crln((fdjx) ahnhVar38.oQ.b(), (cogw) ahknVar34.cD.b(), ahnhVar38.BH, ahknVar34.gF);
            case 1573:
                final eyik eyikVar55 = this.a.a.oO;
                return new ascw() { // from class: ascl
                    @Override // defpackage.ascw
                    public final boolean a() {
                        return ((eoth) eyikVar55.b()).a("bugle.disable_media_suggestions_for_satellite");
                    }
                };
            case 1574:
                ahkn ahknVar35 = this.a;
                return new cwtj((cpbz) ahknVar35.jW.b(), (Optional) ahknVar35.a.BL.b());
            case 1575:
                return Optional.of(this.a.a.qp());
            case 1576:
                ahkn ahknVar36 = this.a;
                Context context4 = (Context) ahknVar36.t.b();
                eyik eyikVar56 = ahknVar36.gH;
                csyl csylVarCW = ahknVar36.cW();
                eyik eyikVar57 = ahknVar36.gJ;
                dcsx dcsxVar = (dcsx) ahknVar36.gI.b();
                ahnh ahnhVar39 = ahknVar36.a;
                return new cswx(context4, eyikVar56, csylVarCW, eyikVar57, dcsxVar, ahnhVar39.ws, ahnhVar39.pQ, ahnhVar39.qr, (aisp) ahnhVar39.zF.b(), (fcyh) ahknVar36.cA.b(), (fcyh) ahknVar36.bM.b(), ahnhVar39.lH(), ahnhVar39.uM);
            case 1577:
                ahkn ahknVar37 = this.a;
                return new crjd((fcyh) ahknVar37.cz.b(), (fcyh) ahknVar37.cA.b(), ahknVar37.a.lr(), (cogw) ahknVar37.cD.b());
            case 1578:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar40 = ahknVar38.a;
                return new criz((fdjx) ahnhVar40.oQ.b(), (fcyh) ahknVar38.cz.b(), (fdjx) ahnhVar40.m.b(), (fcyh) ahknVar38.bM.b(), (cogw) ahknVar38.cD.b(), ahnhVar40.uI, (dqsn) ahnhVar40.qq.b(), ahknVar38.jY);
            case 1579:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar41 = ahknVar39.a;
                return new alaq(ahnhVar41.m, ahnhVar41.oS, ahknVar39.dK, ahknVar39.iA);
            case 1580:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar42 = ahknVar40.a;
                return new akzu(ahnhVar42.m, ahnhVar42.oS, ahknVar40.dK, ahknVar40.iA);
            case 1581:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar43 = ahknVar41.a;
                return new aler(ahnhVar43.m, ahnhVar43.oS, ahknVar41.dK, ahnhVar43.BV, ahnhVar43.BW, ahnhVar43.BX);
            case 1582:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar44 = ahknVar42.a;
                return new aldh(ahknVar42.t, ahnhVar44.m, ahknVar42.dK, ahknVar42.iA, ahnhVar44.BN, ahnhVar44.BO, ahnhVar44.BP, ahnhVar44.BQ);
            case 1583:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar45 = ahknVar43.a;
                return new alba(ahnhVar45.m, ahnhVar45.oS, ahknVar43.dK, ahknVar43.iA);
            case 1584:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar46 = ahknVar44.a;
                return new alaf(ahnhVar46.m, ahnhVar46.oS, ahknVar44.dK, ahknVar44.iA);
            case 1585:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar47 = ahknVar45.a;
                return new albm(ahnhVar47.m, ahknVar45.dK, ahknVar45.iA, ahnhVar47.BP);
            case 1586:
                ahkn ahknVar46 = this.a;
                ahnh ahnhVar48 = ahknVar46.a;
                return new albv(ahnhVar48.m, ahknVar46.dK, ahknVar46.iA, ahnhVar48.BP);
            case 1587:
                return Optional.of((crbi) this.a.a.Cd.b());
            case 1588:
                ahkn ahknVar47 = this.a;
                eyik eyikVar58 = ahknVar47.cz;
                ahnh ahnhVar49 = ahknVar47.a;
                return new crcm(ahnhVar49.uJ, ahnhVar49.BQ, (fcyh) eyikVar58.b(), (fcyh) ahknVar47.bM.b(), (fdjx) ahnhVar49.oQ.b(), (fdjx) ahnhVar49.m.b(), ahnhVar49.Cb, ahnhVar49.BI, ahnhVar49.Cc);
            case 1589:
                ahkn ahknVar48 = this.a;
                ahnh ahnhVar50 = ahknVar48.a;
                return new crdc(ahnhVar50.uM, ahnhVar50.qr, ahknVar48.jZ, (cgry) ahknVar48.ka.b());
            case 1590:
                ahkn ahknVar49 = this.a;
                ahnh ahnhVar51 = ahknVar49.a;
                return new amsd(ahnhVar51.Qe, ahnhVar51.Fd, ahnhVar51.m, ahknVar49.cz, ahknVar49.cD, ahnhVar51.yE, ahnhVar51.yH, ahnhVar51.Qf);
            case 1591:
                ahkn ahknVar50 = this.a;
                ahnh ahnhVar52 = ahknVar50.a;
                return new cmsx(ahknVar50.gF, (cmnp) ahnhVar52.Gk.b(), ahknVar50.ct(), ahnhVar52.sj, ahnhVar52.sh, ahnhVar52.rW);
            case 1592:
                ahkn ahknVar51 = this.a;
                ahnh ahnhVar53 = ahknVar51.a;
                return new cmnp((asre) ahnhVar53.CD.b(), (auau) ahknVar51.ez.b(), (atah) ahknVar51.mL.b(), (asry) ahknVar51.mK.b(), ahnhVar53.Jw, ahnhVar53.Fd, (eosc) ahknVar51.aJ.b(), (eosc) ahknVar51.p.b(), ahnhVar53.OQ, (atau) ahknVar51.ii.b(), (cqdr) ahknVar51.lk.b(), (atak) ahknVar51.kA.b(), (cmxn) ahnhVar53.xO.b());
            case 1593:
                ahnh ahnhVar54 = this.a.a;
                return new auat(ahnhVar54.rn(), ahnhVar54.rk);
            case 1594:
                ahkn ahknVar52 = this.a;
                ahnh ahnhVar55 = ahknVar52.a;
                cizt ciztVarCm = ahknVar52.cm();
                Object objQv = ahnhVar55.qv();
                cjna cjnaVar = (cjna) ahnhVar55.LX.b();
                Object objQz = ahnhVar55.qz();
                cjay cjayVar = (cjay) objQz;
                return new cjai(ciztVarCm, (cjaq) objQv, cjnaVar, cjayVar, (cjnd) ahnhVar55.LW.b(), (cixu) ahnhVar55.pq(), (cjmh) ahnhVar55.LZ.b(), ahnhVar55.jn(), (cjml) ahnhVar55.LY.b(), ahnhVar55.jp(), (cjmx) ahnhVar55.Ma.b(), ahnhVar55.jr(), (cjnj) ahnhVar55.Mb.b(), ahnhVar55.jq(), (cjng) ahnhVar55.Mc.b(), ahnhVar55.js(), (eosc) ahknVar52.p.b());
            case 1595:
                ahkn ahknVar53 = this.a;
                ahnh ahnhVar56 = ahknVar53.a;
                eyik eyikVar59 = ahnhVar56.pB;
                eyik eyikVar60 = ahnhVar56.OR;
                atuz atuzVarDB = ahnhVar56.dB();
                atva atvaVarDC = ahnhVar56.dC();
                atvb atvbVarDD = ahnhVar56.dD();
                atog atogVarDr = ahnhVar56.dr();
                atny atnyVarM82do = ahnhVar56.m82do();
                atoe atoeVarDq = ahnhVar56.dq();
                atoc atocVarDp = ahnhVar56.dp();
                aika aikaVar = (aika) ahnhVar56.uM.b();
                eyik eyikVar61 = ahnhVar56.Jw;
                eosc eoscVar4 = (eosc) ahknVar53.y.b();
                eosc eoscVar5 = (eosc) ahknVar53.p.b();
                cjbf cjbfVarJs = ahnhVar56.js();
                atau atauVar = (atau) ahknVar53.ii.b();
                return new atvv(eyikVar59, eyikVar60, atuzVarDB, atvaVarDC, atvbVarDD, atogVarDr, atnyVarM82do, atoeVarDq, atocVarDp, aikaVar, eyikVar61, eoscVar4, eoscVar5, cjbfVarJs, atauVar, (caxe) ahnhVar56.FF.b(), ahnhVar56.c, ahnhVar56.OW, ahnhVar56.Pb, ahnhVar56.Pl, ahnhVar56.Pm, ahnhVar56.Pq, (arph) ahnhVar56.ES.b(), ahnhVar56.bo());
            case 1596:
                ahkn ahknVar54 = this.a;
                ahnh ahnhVar57 = ahknVar54.a;
                aypy aypyVar = (aypy) ahnhVar57.CM.b();
                cden cdenVar = (cden) ahnhVar57.qN.b();
                eyik eyikVar62 = ahnhVar57.uJ;
                eyik eyikVar63 = ahnhVar57.yw;
                clec clecVarJU = ahnhVar57.jU();
                asry asryVar = (asry) ahknVar54.mK.b();
                atah atahVar = (atah) ahknVar54.mL.b();
                eyik eyikVar64 = ahnhVar57.OL;
                eyik eyikVar65 = ahnhVar57.OP;
                Map mapIO = ahkn.iO();
                eosc eoscVar6 = (eosc) ahknVar54.p.b();
                eosc eoscVar7 = (eosc) ahknVar54.aJ.b();
                eyik eyikVar66 = ahknVar54.cD;
                eyik eyikVar67 = ahnhVar57.OQ;
                eyik eyikVar68 = ahnhVar57.FI;
                cogw cogwVar = (cogw) eyikVar66.b();
                asbt asbtVar = (asbt) ahnhVar57.OE.b();
                return new atyp(aypyVar, cdenVar, eyikVar62, eyikVar63, clecVarJU, asryVar, atahVar, eyikVar64, eyikVar65, mapIO, eoscVar6, eoscVar7, eyikVar67, eyikVar68, cogwVar, asbtVar);
            case 1597:
                ahnh ahnhVar58 = this.a.a;
                return new axyn(ahnhVar58.OI, ahnhVar58.OK);
            case 1598:
                ahkn ahknVar55 = this.a;
                Context context5 = (Context) ahknVar55.t.b();
                ahnh ahnhVar59 = ahknVar55.a;
                return axyo.a(context5, (cmos) ahnhVar59.Ck.b(), (cogw) ahknVar55.cD.b(), (cmqj) ahnhVar59.uv.b(), (cmum) ahnhVar59.wF.b(), ahnhVar59.Dq.b(), ahnhVar59.uJ, (bbdl) ahnhVar59.qG.b(), (dqsn) ahnhVar59.qq.b(), ahnhVar59.qa, ahnhVar59.FC, (aprr) ahnhVar59.Cj.b(), ahnhVar59.pb, (eosc) ahknVar55.aJ.b());
            case 1599:
                ahnh ahnhVar60 = this.a.a;
                return new cmos((cmtt) ahnhVar60.vj.b(), (cmum) ahnhVar60.wF.b(), (cqbm) ahnhVar60.sX.b(), (crmx) ahnhVar60.pB.b(), (crny) ahnhVar60.pf.b(), (cldu) ahnhVar60.Ch.b(), eyie.a(ahnhVar60.yw), (cqjy) ahnhVar60.Ci.b(), ahnhVar60.i(), (aprr) ahnhVar60.Cj.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.b;
        switch (i) {
            case 1600:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahnh ahnhVar = ahknVar.a;
                return new ckze(context, (cmvy) ahnhVar.pE.b(), (aymn) ahnhVar.wT.b(), (aypj) ahnhVar.Cg.b());
            case 1601:
                final eyik eyikVar = this.a.a.oO;
                return new aprr() { // from class: aowz
                    @Override // defpackage.aprr
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_satellite_mms_retry");
                    }
                };
            case 1602:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new ayih(ahnhVar2.sL, ahnhVar2.AG, ahnhVar2.uJ, (ajhd) ahnhVar2.yw.b(), (crmx) ahnhVar2.pB.b(), (cmvy) ahnhVar2.pE.b(), (Optional) ahnhVar2.Co.b(), (ains) ahnhVar2.c.b(), (chwq) ahnhVar2.uu.b(), (cteb) ahnhVar2.Cz.b(), (cogw) ahknVar2.cD.b(), (cmum) ahnhVar2.wF.b(), (cgbn) ahnhVar2.Cs.b(), (cmop) ahnhVar2.CA.b(), (aiwu) ahknVar2.kc.b(), (cggg) ahnhVar2.CB.b(), (aypx) ahnhVar2.CC.b(), (bbfn) ahnhVar2.CF.b(), (ayrm) ahnhVar2.NJ.b(), (Optional) ahnhVar2.OF.b(), Optional.of(ahnhVar2.jJ()), (cqjy) ahnhVar2.Ci.b(), ahnhVar2.OG, (bxlc) ahnhVar2.uI.b(), Optional.empty(), ahnhVar2.eu(), (aylz) ahnhVar2.Fk.b(), ahnhVar2.FB, ahnhVar2.vl, ahnhVar2.qG, ahnhVar2.NK, (eosc) ahknVar2.y.b(), (ajjt) ahknVar2.my.b(), (cmxr) ahnhVar2.Fp.b(), ahnhVar2.Fq, ahnhVar2.HO, ahnhVar2.FD, (eosc) ahknVar2.aJ.b(), (awlc) ahnhVar2.FE.b(), ahnhVar2.HK, (ckfo) ahnhVar2.Fz.b(), ahnhVar2.wu, ahnhVar2.uv, ahnhVar2.eA(), (aqbh) ahnhVar2.qa.b(), ahnhVar2.OH, (apsl) ahnhVar2.Dk.b(), ahnhVar2.Dn, ahnhVar2.pl, ahnhVar2.zi, (arwc) ahnhVar2.DA.b());
            case 1603:
                return Optional.of(this.a.a.O());
            case 1604:
                return Optional.of(this.a.a.P());
            case 1605:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar3 = ahknVar3.a;
                return new cugx((cdte) ahnhVar3.By.b(), (Context) ahknVar3.t.b(), (eosc) ahknVar3.y.b(), (eosc) ahknVar3.aJ.b(), (eosc) ahknVar3.p.b(), ahknVar3.dZ(), (aipo) ahnhVar3.us.b(), ahnhVar3.qN);
            case 1606:
                final eyik eyikVar2 = this.a.a.oO;
                return new arhn() { // from class: arhk
                    @Override // defpackage.arhn
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_linkify_background_activity_allowed");
                    }
                };
            case 1607:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar4 = ahknVar4.a;
                return new cteb(ahnhVar4.sL, (ajhd) ahnhVar4.yw.b(), (bxlc) ahnhVar4.uI.b(), (dqsn) ahnhVar4.qq.b(), (cogw) ahknVar4.cD.b(), (eosc) ahknVar4.y.b());
            case 1608:
                ahnh ahnhVar5 = this.a.a;
                return new baqx(ahnhVar5.c, ahnhVar5.Cx);
            case 1609:
                ahnh ahnhVar6 = this.a.a;
                return new ayjj(ahnhVar6.Cp, ahnhVar6.AG, ahnhVar6.AQ, ahnhVar6.uy, ahnhVar6.Cr, ahnhVar6.Ct, ahnhVar6.Cu, ahnhVar6.qr, ahnhVar6.Cw);
            case 1610:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar7 = ahknVar5.a;
                return new cnpk((cazj) ahnhVar7.rF.b(), (cmgk) ahnhVar7.qK.b(), (cogw) ahknVar5.cD.b(), ahnhVar7.Cq);
            case 1611:
                ahkn ahknVar6 = this.a;
                return new cnoj(ahknVar6.a.qK, (cogw) ahknVar6.cD.b());
            case 1612:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar8 = ahknVar7.a;
                return new aydx(ahnhVar8.Cs, ahnhVar8.vh, ahknVar7.aN);
            case 1613:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar9 = ahknVar8.a;
                return new ciux((cmqj) ahnhVar9.uv.b(), (ciuw) ahknVar8.cP.b(), (ains) ahnhVar9.c.b());
            case 1614:
                ahnh ahnhVar10 = this.a.a;
                return new cnwj(ahnhVar10.Cp, ahnhVar10.Cv);
            case 1615:
                ahkn ahknVar9 = this.a;
                crqv crqvVar = (crqv) ahknVar9.aT.b();
                ahnh ahnhVar11 = ahknVar9.a;
                return new cnxa(crqvVar, ahnhVar11.c, ahnhVar11.qK, (eosc) ahknVar9.p.b());
            case 1616:
                ahkn ahknVar10 = this.a;
                Context context2 = (Context) ahknVar10.t.b();
                ahnh ahnhVar12 = ahknVar10.a;
                return new cmop(context2, ahknVar10.kb, (cmum) ahnhVar12.wF.b(), ahnhVar12.uv, (bahv) ahnhVar12.un.b(), (bveg) ahnhVar12.yx.b(), ahnhVar12.uG);
            case 1617:
                return new cggg(this.a.a.rF);
            case 1618:
                ahkn ahknVar11 = this.a;
                return new aypx((cogw) ahknVar11.cD.b(), ahknVar11.a.em());
            case 1619:
                ahkn ahknVar12 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar12.cz.b();
                ahnh ahnhVar13 = ahknVar12.a;
                return new chvm(fcyhVar, (fdjx) ahnhVar13.m.b(), ahnhVar13.CD, ahnhVar13.pQ);
            case 1620:
                ahkn ahknVar13 = this.a;
                Context context3 = (Context) ahknVar13.t.b();
                cogw cogwVar = (cogw) ahknVar13.cD.b();
                ahnh ahnhVar14 = ahknVar13.a;
                return new ayrm(context3, cogwVar, ahnhVar14.zP, ahnhVar14.sL, ahnhVar14.ww, ahnhVar14.qG, ahnhVar14.CK, (ajhd) ahnhVar14.yw.b(), eyie.a(ahnhVar14.uv), Optional.of((cmut) ahnhVar14.CL.b()), (ayql) ahnhVar14.OD.b(), (dqsn) ahnhVar14.qq.b(), (cqjy) ahnhVar14.Ci.b(), (alrj) ahnhVar14.qi.b(), (bydb) ahnhVar14.IE.b(), (Optional) ahknVar13.ku.b(), (ckfo) ahnhVar14.Fz.b(), ahnhVar14.CB, ahnhVar14.OE);
            case 1621:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar15 = ahknVar14.a;
                return new ajsj(ahnhVar15.uJ, ahnhVar15.sL, ahnhVar15.zi, ahnhVar15.qi, ahnhVar15.yw, ahnhVar15.qG, ahnhVar15.CJ, (eosc) ahknVar14.p.b(), (eosc) ahknVar14.aJ.b(), ahnhVar15.qq, ahnhVar15.bs(), ahnhVar15.pl, (aqbh) ahnhVar15.qa.b());
            case 1622:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar16 = ahknVar15.a;
                return new anqc((baxf) ahnhVar16.CI.b(), (aofc) ahnhVar16.yD.b(), (cqbm) ahnhVar16.sX.b(), (eosc) ahknVar15.y.b(), (eosc) ahknVar15.p.b(), (eosc) ahknVar15.aJ.b(), (crqv) ahknVar15.aT.b(), ahnhVar16.eh(), ahnhVar16.yw, ahnhVar16.sL, ahnhVar16.uJ, ahnhVar16.tB, ahnhVar16.cv(), ahnhVar16.cu(), ahnhVar16.rU());
            case 1623:
                ahnh ahnhVar17 = this.a.a;
                return new baxf(ahnhVar17.CH, ahnhVar17.uu);
            case 1624:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar18 = ahknVar16.a;
                eyik eyikVar3 = ahnhVar18.sL;
                eyik eyikVar4 = ahnhVar18.uQ;
                eyik eyikVar5 = ahnhVar18.rY;
                eyik eyikVar6 = ahnhVar18.CG;
                return new bagw(eyikVar3, eyikVar4, eyikVar5, eyikVar6, ahnhVar18.wJ, ahnhVar18.sh, ahnhVar18.pb, (awhr) ahnhVar18.zm.b(), (eosc) ahknVar16.aJ.b());
            case 1625:
                ahkn ahknVar17 = this.a;
                Context context4 = (Context) ahknVar17.t.b();
                ahnh ahnhVar19 = ahknVar17.a;
                return new cbpr(context4, ahnhVar19.um, ahnhVar19.wJ, ahnhVar19.wF);
            case 1626:
                return new daln((cmum) this.a.a.wF.b());
            case 1627:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar20 = ahknVar18.a;
                eyik eyikVar7 = ahknVar18.t;
                eyik eyikVar8 = ahnhVar20.CM;
                eyik eyikVar9 = ahnhVar20.sh;
                eyik eyikVar10 = ahnhVar20.Dp;
                eyik eyikVar11 = ahnhVar20.qG;
                eyik eyikVar12 = ahnhVar20.Dq;
                eyik eyikVar13 = ahnhVar20.uv;
                eyik eyikVar14 = ahnhVar20.DB;
                eyik eyikVar15 = ahknVar18.cD;
                eyik eyikVar16 = ahnhVar20.yw;
                eyik eyikVar17 = ahnhVar20.us;
                eyik eyikVar18 = ahnhVar20.pf;
                eyik eyikVar19 = ahnhVar20.DC;
                eyik eyikVar20 = ahnhVar20.uy;
                eyik eyikVar21 = ahnhVar20.DE;
                eyik eyikVar22 = ahnhVar20.Ci;
                eyik eyikVar23 = ahnhVar20.Cp;
                eyik eyikVar24 = ahknVar18.aJ;
                eyik eyikVar25 = ahknVar18.dL;
                eyik eyikVar26 = ahknVar18.kl;
                eyik eyikVar27 = ahnhVar20.DJ;
                eyik eyikVar28 = ahnhVar20.EE;
                eyik eyikVar29 = ahnhVar20.Ny;
                eyik eyikVar30 = ahnhVar20.Nz;
                eyik eyikVar31 = ahnhVar20.NA;
                eyik eyikVar32 = ahnhVar20.Fd;
                eyik eyikVar33 = ahnhVar20.Gx;
                eyik eyikVar34 = ahnhVar20.CI;
                eyik eyikVar35 = ahnhVar20.vR;
                eyik eyikVar36 = ahnhVar20.NB;
                eyik eyikVar37 = ahnhVar20.Fk;
                eyik eyikVar38 = ahnhVar20.ux;
                eyik eyikVar39 = ahnhVar20.qi;
                eyik eyikVar40 = ahnhVar20.xO;
                eyik eyikVar41 = ahnhVar20.NC;
                return new aygy(eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, eyikVar41, ahknVar18.my, ahnhVar20.ND, ahnhVar20.qa, ahnhVar20.NE, ahnhVar20.Fz, ahnhVar20.Oy, ahnhVar20.FC, ahnhVar20.Ov, ahnhVar20.Eo, ahnhVar20.uJ, ahnhVar20.pb, ahnhVar20.DI, ahnhVar20.Oz, ahnhVar20.OA, ahknVar18.lk, ahnhVar20.yz, ahnhVar20.OB, ahnhVar20.OC, ahknVar18.kv, ahnhVar20.Or);
            case 1628:
                ahnh ahnhVar21 = this.a.a;
                return new bxiu(ahnhVar21.c, ahnhVar21.uv, Optional.of(ahnhVar21.Do), ahnhVar21.ux);
            case 1629:
                ahkn ahknVar19 = this.a;
                Context context5 = (Context) ahknVar19.t.b();
                ahnh ahnhVar22 = ahknVar19.a;
                dqsn dqsnVar = (dqsn) ahnhVar22.qq.b();
                eyik eyikVar42 = ahnhVar22.zP;
                eyik eyikVar43 = ahnhVar22.sL;
                eyik eyikVar44 = ahnhVar22.CN;
                eyik eyikVar45 = ahnhVar22.AG;
                cmqj cmqjVar = (cmqj) ahnhVar22.uv.b();
                bveg bvegVar = (bveg) ahnhVar22.yx.b();
                bahv bahvVar = (bahv) ahnhVar22.un.b();
                bywf bywfVarFI = ahnhVar22.fI();
                cmgk cmgkVar = (cmgk) ahnhVar22.qK.b();
                cogw cogwVar2 = (cogw) ahknVar19.cD.b();
                eosc eoscVar = (eosc) ahknVar19.aJ.b();
                return new cnoc(context5, dqsnVar, eyikVar42, eyikVar43, eyikVar44, eyikVar45, cmqjVar, bvegVar, bahvVar, bywfVarFI, cmgkVar, cogwVar2, eoscVar, ahnhVar22.rc, ahnhVar22.qr, ahnhVar22.CO, ahnhVar22.pf, ahnhVar22.uD, ahnhVar22.qG, (Optional) ahknVar19.kd.b(), ahnhVar22.CT, ahnhVar22.CR, ahnhVar22.Cq, ahnhVar22.CU, ahnhVar22.uv, ahnhVar22.Cx, ahnhVar22.ux, ahknVar19.ke, ahnhVar22.CV, ahnhVar22.CW, ahnhVar22.Dj, (apsl) ahnhVar22.Dk.b(), ahnhVar22.Dn);
            case 1630:
                ahnh ahnhVar23 = this.a.a;
                return new bapp((dqsn) ahnhVar23.qq.b(), ahnhVar23.ww, ahnhVar23.AQ);
            case 1631:
                ahkn ahknVar20 = this.a;
                Context context6 = (Context) ahknVar20.t.b();
                crqv crqvVar2 = (crqv) ahknVar20.aT.b();
                crma crmaVar = (crma) ahknVar20.da.b();
                ahnh ahnhVar24 = ahknVar20.a;
                return new clas(context6, crqvVar2, crmaVar, (ayjj) ahnhVar24.Cx.b(), (cauu) ahnhVar24.CP.b(), ahnhVar24.Cr, ahnhVar24.CS);
            case 1632:
                return new cauu(this.a.a.rF);
            case 1633:
                ahkn ahknVar21 = this.a;
                eyik eyikVar46 = ahknVar21.cD;
                ahnh ahnhVar25 = ahknVar21.a;
                return new cnoy(ahnhVar25.CQ, (cogw) eyikVar46.b(), ahnhVar25.kP(), (cmrp) ahnhVar25.uv.b(), ahnhVar25.c, ahnhVar25.CR);
            case 1634:
                ahnh ahnhVar26 = this.a.a;
                return ekhx.s(ahnhVar26.kM(), ahnhVar26.kO(), ahnhVar26.kN());
            case 1635:
                ahkn ahknVar22 = this.a;
                return new cnmc(ahknVar22.da, ahknVar22.a.pB, (Context) ahknVar22.t.b());
            case 1636:
                ahkn ahknVar23 = this.a;
                return new cnpw(ahknVar23.a.kj(), (eosc) ahknVar23.p.b(), (cogw) ahknVar23.cD.b());
            case 1637:
                return Long.valueOf(fawl.a(this.a.a.pa()));
            case 1638:
                return Long.valueOf(fawj.a(this.a.a.pa()));
            case 1639:
                ahnh ahnhVar27 = this.a.a;
                return new cobl((coaw) ahnhVar27.Dg.b(), (cnyh) ahnhVar27.Dh.b(), ahnhVar27.rD(), ahnhVar27.kR(), (ains) ahnhVar27.pQ.b(), (fdjx) ahnhVar27.oQ.b(), (fdjx) ahnhVar27.oS.b());
            case 1640:
                ahkn ahknVar24 = this.a;
                eyik eyikVar47 = ahknVar24.cD;
                ahnh ahnhVar28 = ahknVar24.a;
                return new coaw(ahknVar24.kf, ahknVar24.kg, ahnhVar28.Cv, ahnhVar28.CY, (cogw) eyikVar47.b(), ahnhVar28.CZ, ahnhVar28.Da, ahnhVar28.Db, ahnhVar28.Dc, (fcyh) ahknVar24.cz.b(), (fdjx) ahnhVar28.oQ.b(), ahnhVar28.kS(), ahknVar24.ki, ahnhVar28.pQ, ahnhVar28.qK, ahnhVar28.ur);
            case 1641:
                ahkn ahknVar25 = this.a;
                return new cnxq(ahknVar25.a.CX, (fcyh) ahknVar25.cA.b());
            case 1642:
                return new cnxm(this.a.a.rF);
            case 1643:
                return new cnut((cnuk) this.a.a.pT());
            case 1644:
                return new cnup((cnuk) this.a.a.pT());
            case 1645:
                return new cnuc((cnuk) this.a.a.pT());
            case 1646:
                return new cnvb((cnuk) this.a.a.pT());
            case 1647:
                return new awlc(eyim.a(), (fdjx) this.a.a.m.b());
            case 1648:
                ahnh ahnhVar29 = this.a.a;
                return new awlc(ahnhVar29.De, (fdjx) ahnhVar29.m.b());
            case 1649:
                ahkn ahknVar26 = this.a;
                eyik eyikVar48 = ahknVar26.cD;
                ahnh ahnhVar30 = ahknVar26.a;
                return new cnyh(ahnhVar30.qK, (cogw) eyikVar48.b(), (fdjx) ahnhVar30.oQ.b());
            case 1650:
                return Long.valueOf(fawk.a(this.a.a.pa()));
            case 1651:
                final eyik eyikVar49 = this.a.a.oO;
                return new apsl() { // from class: aoyb
                    @Override // defpackage.apsl
                    public final boolean a() {
                        return ((eoth) eyikVar49.b()).a("bugle.enable_messages_archival_intent");
                    }
                };
            case 1652:
                ahnh ahnhVar31 = this.a.a;
                return new awlc(ahnhVar31.Dm, (fdjx) ahnhVar31.m.b());
            case 1653:
                ahnh ahnhVar32 = this.a.a;
                ekhv ekhvVarI = ekhx.i(2);
                ekhvVarI.j(ahnhVar32.rs());
                ekhvVarI.j(ahnhVar32.rx());
                return ekhvVarI.g();
            case 1654:
                final eyik eyikVar50 = this.a.a.oO;
                return new aptb() { // from class: aozc
                    @Override // defpackage.aptb
                    public final boolean a() {
                        return ((eoth) eyikVar50.b()).a("bugle.enable_receive_sms_pipeline_phase2");
                    }
                };
            case 1655:
                ahkn ahknVar27 = this.a;
                Context context7 = (Context) ahknVar27.t.b();
                cogw cogwVar3 = (cogw) ahknVar27.cD.b();
                ahnh ahnhVar33 = ahknVar27.a;
                return new ceag(context7, cogwVar3, ahnhVar33.Dr, (cqmp) ahnhVar33.Dt.b(), (cmum) ahnhVar33.wF.b(), (cqsu) ahnhVar33.xi.b(), (bbfk) ahnhVar33.Dx.b(), (cqmz) ahknVar27.ic.b(), (ains) ahnhVar33.c.b(), ahknVar27.cA(), ahnhVar33.ej(), ahnhVar33.jR(), (apth) ahnhVar33.Dz.b(), (arwc) ahnhVar33.DA.b());
            case 1656:
                ahkn ahknVar28 = this.a;
                return new cqoj((Context) ahknVar28.t.b(), (cogw) ahknVar28.cD.b(), (dqsn) ahknVar28.a.qq.b());
            case 1657:
                ahkn ahknVar29 = this.a;
                crqv crqvVar3 = (crqv) ahknVar29.aT.b();
                ahnh ahnhVar34 = ahknVar29.a;
                return new cqmp(crqvVar3, (cmum) ahnhVar34.wF.b(), Optional.of((dggz) ahnhVar34.xI.b()), ahnhVar34.pf, ahnhVar34.rd, ahnhVar34.Ds);
            case 1658:
                final eyik eyikVar51 = this.a.a.oO;
                return new aqsw() { // from class: aqqz
                    @Override // defpackage.aqsw
                    public final boolean a() {
                        return ((eoth) eyikVar51.b()).a("bugle.enable_sim_subscription_info_retriever_in_file_size_utils");
                    }
                };
            case 1659:
                ahkn ahknVar30 = this.a;
                Context context8 = (Context) ahknVar30.t.b();
                ahnh ahnhVar35 = ahknVar30.a;
                return new bbfk(context8, (cqmp) ahnhVar35.Dt.b(), (cqmz) ahknVar30.ic.b(), (cmum) ahnhVar35.wF.b(), (cqxl) ahnhVar35.Dv.b(), ahnhVar35.zu, ahnhVar35.zv, ahnhVar35.Dw);
            case 1660:
                return new cqxl(this.a.a.Du);
            case 1661:
                return Boolean.valueOf(fajp.a(this.a.a.nL()));
            case 1662:
                final eyik eyikVar52 = this.a.a.oO;
                return new aptx() { // from class: apai
                    @Override // defpackage.aptx
                    public final boolean a() {
                        return ((eoth) eyikVar52.b()).a("bugle.enable_file_processing_pipeline");
                    }
                };
            case 1663:
                return new bwwc(this.a.a.uI);
            case 1664:
                final eyik eyikVar53 = this.a.a.oO;
                return new apth() { // from class: aozm
                    @Override // defpackage.apth
                    public final boolean a() {
                        return ((eoth) eyikVar53.b()).a("bugle.enable_store_image_caption_in_text_part");
                    }
                };
            case 1665:
                final eyik eyikVar54 = this.a.a.oO;
                return new arwc() { // from class: arvy
                    @Override // defpackage.arwc
                    public final boolean a() {
                        return ((eoth) eyikVar54.b()).a("bugle.use_raw_text_for_sending_when_available");
                    }
                };
            case 1666:
                ahkn ahknVar31 = this.a;
                Context context9 = (Context) ahknVar31.t.b();
                ahnh ahnhVar36 = ahknVar31.a;
                return new cmpe(context9, ahnhVar36.uv, ahnhVar36.DD, ahnhVar36.qi);
            case 1667:
                ahnh ahnhVar37 = this.a.a;
                return new cmpd(ahnhVar37.sL, ahnhVar37.qi);
            case 1668:
                ahkn ahknVar32 = this.a;
                Context context10 = (Context) ahknVar32.t.b();
                cogw cogwVar4 = (cogw) ahknVar32.cD.b();
                ahnh ahnhVar38 = ahknVar32.a;
                return new bwdh(context10, cogwVar4, eyie.a(ahnhVar38.ts), ahnhVar38.la(), (cqmz) ahknVar32.ic.b(), ahnhVar38.DF, ahnhVar38.DG, ahnhVar38.DH, (aqvb) ahnhVar38.DI.b());
            case 1669:
                ahkn ahknVar33 = this.a;
                return new coua((Context) ahknVar33.t.b(), (cqmr) ahknVar33.eK.b(), (cqsu) ahknVar33.a.xi.b());
            case 1670:
                return new coub((awij) this.a.a.yc.b());
            case 1671:
                ahnh ahnhVar39 = this.a.a;
                return new cbtl((apwn) ahnhVar39.Bg.b(), ahnhVar39.rc());
            case 1672:
                final eyik eyikVar55 = this.a.a.oO;
                return new aqvb() { // from class: aqut
                    @Override // defpackage.aqvb
                    public final boolean a() {
                        return ((eoth) eyikVar55.b()).a("bugle.enable_file_encryptor");
                    }
                };
            case 1673:
                ahnh ahnhVar40 = this.a.a;
                return new cohh(ahnhVar40.Ee, ahnhVar40.Eg, ahnhVar40.EC, ahnhVar40.ED, ahnhVar40.rk);
            case 1674:
                ahkn ahknVar34 = this.a;
                eosc eoscVar2 = (eosc) ahknVar34.p.b();
                ahnh ahnhVar41 = ahknVar34.a;
                return new conu(eoscVar2, ahnhVar41.DM, (aten) ahnhVar41.Ed.b());
            case 1675:
                ahkn ahknVar35 = this.a;
                eosc eoscVar3 = (eosc) ahknVar35.y.b();
                eosc eoscVar4 = (eosc) ahknVar35.p.b();
                ahnh ahnhVar42 = ahknVar35.a;
                return new conq(eoscVar3, eoscVar4, ahnhVar42.DK, ahnhVar42.DL);
            case 1676:
                return new atei(this.a.a.rF);
            case 1677:
                ahkn ahknVar36 = this.a;
                eosc eoscVar5 = (eosc) ahknVar36.y.b();
                ahnh ahnhVar43 = ahknVar36.a;
                return new cokd(eoscVar5, (dqsn) ahnhVar43.qq.b(), ahnhVar43.uJ, (cogw) ahknVar36.cD.b());
            case 1678:
                ahnh ahnhVar44 = this.a.a;
                return ateh.a((ahlc) ahnhVar44.Ea.b(), ahnhVar44.db());
            case 1679:
                return new ahlc(this);
            case 1680:
                ahnh ahnhVar45 = this.a.a;
                return atbs.a(ahnhVar45.rk, ahnhVar45.pN(), ahnhVar45.qj());
            case 1681:
                return coji.a(this.a.a.DT);
            case 1682:
                ahkn ahknVar37 = this.a;
                return new cojg((Context) ahknVar37.t.b(), ahknVar37.a.kX(), (cesc) ahknVar37.ep.b());
            case 1683:
                return faok.a(this.a.a.ol());
            case 1684:
                return Long.valueOf(fanq.a(this.a.a.og()));
            case 1685:
                return Long.valueOf(fant.a(this.a.a.og()));
            case 1686:
                return Long.valueOf(fanu.a(this.a.a.og()));
            case 1687:
                return Boolean.valueOf(fans.a(this.a.a.og()));
            case 1688:
                return Long.valueOf(fanr.a(this.a.a.og()));
            case 1689:
                ahkn ahknVar38 = this.a;
                return new atcj(ahknVar38.y, ahknVar38.a.tU);
            case 1690:
                return this.a.a.lk();
            case 1691:
                final eyik eyikVar56 = this.a.a.oO;
                return new aqts() { // from class: aqtl
                    @Override // defpackage.aqts
                    public final boolean a() {
                        return ((eoth) eyikVar56.b()).a("bugle.enable_media_on_supported_carriers");
                    }
                };
            case 1692:
                final eyik eyikVar57 = this.a.a.oO;
                return new aqtr() { // from class: aqtj
                    @Override // defpackage.aqtr
                    public final boolean a() {
                        return ((eoth) eyikVar57.b()).a("bugle.enable_media_on_all_carriers");
                    }
                };
            case 1693:
                ahkn ahknVar39 = this.a;
                return new atcu((dggz) ahknVar39.a.xI.b(), (atdk) ahknVar39.kn.b());
            case 1694:
                return Long.valueOf(fani.a(this.a.a.oe()));
            case 1695:
                return Long.valueOf(fanh.a(this.a.a.oe()));
            case 1696:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar46 = ahknVar40.a;
                return new cooh(ahnhVar46.Ef, ahnhVar46.DL, (Context) ahknVar40.t.b(), (eosc) ahknVar40.aJ.b(), (eosc) ahknVar40.y.b(), (eosc) ahknVar40.p.b());
            case 1697:
                return cmfg.a((cmfe) this.a.a.xF.b());
            case 1698:
                ahkn ahknVar41 = this.a;
                eosc eoscVar6 = (eosc) ahknVar41.p.b();
                eosc eoscVar7 = (eosc) ahknVar41.y.b();
                ahnh ahnhVar47 = ahknVar41.a;
                return new coxw(eoscVar6, eoscVar7, ahnhVar47.Ei, ahnhVar47.EA, ahnhVar47.DL, ahnhVar47.EB);
            case 1699:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar48 = ahknVar42.a;
                return new covx(ahnhVar48.Eh, (eosc) ahknVar42.y.b(), (eosc) ahknVar42.p.b(), ahnhVar48.DL);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 1700:
                return new cowj(this.a.a.rF);
            case 1701:
                ahkn ahknVar = this.a;
                eosc eoscVar = (eosc) ahknVar.p.b();
                eosc eoscVar2 = (eosc) ahknVar.aJ.b();
                ahnh ahnhVar = ahknVar.a;
                return new coxr(eoscVar, eoscVar2, ahnhVar.Ey, ahnhVar.Ez, ahnhVar.Eo, ahnhVar.lb());
            case 1702:
                ahkn ahknVar2 = this.a;
                eosc eoscVar3 = (eosc) ahknVar2.p.b();
                ahnh ahnhVar2 = ahknVar2.a;
                return new coxe(eoscVar3, (coys) ahnhVar2.qK(), ahnhVar2.lb(), ahnhVar2.Ex);
            case 1703:
                return new ahld(this);
            case 1704:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar3 = ahknVar3.a;
                return cojc.a(ahnhVar3.Ek, (cogw) ahknVar3.cD.b(), (eosc) ahknVar3.aJ.b(), ahnhVar3.id(), ahnhVar3.Ej);
            case 1705:
                return cojb.a(this.a.a.DT);
            case 1706:
                ahnh ahnhVar4 = this.a.a;
                return new atla(ahnhVar4.dl(), (fdjx) ahnhVar4.m.b(), ahnhVar4.dm(), (aqvb) ahnhVar4.DI.b());
            case 1707:
                return (evrj) ((ehdm) this.a.a.oj().a.b()).a("com.google.android.apps.messaging.auto", "45666939").c();
            case 1708:
                final eyik eyikVar = this.a.a.oO;
                return new aqzv() { // from class: aqxr
                    @Override // defpackage.aqzv
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_upload_resume_in_file_processing_pipeline");
                    }
                };
            case 1709:
                final eyik eyikVar2 = this.a.a.oO;
                return new arai() { // from class: aqyo
                    @Override // defpackage.arai
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.use_cronet_for_all_upload_file_sizes");
                    }
                };
            case 1710:
                return faoa.a(this.a.a.oi());
            case 1711:
                return Long.valueOf(((ehdm) this.a.a.ok().a.b()).a("com.google.android.apps.messaging.auto", "45428196").b());
            case 1712:
                return Long.valueOf(((ehdm) this.a.a.ok().a.b()).a("com.google.android.apps.messaging.auto", "45616285").b());
            case 1713:
                ahnh ahnhVar5 = this.a.a;
                return new coyg(ahnhVar5.xI, ahnhVar5.Et, ahnhVar5.Eu, ahnhVar5.Ev, ahnhVar5.Ew, (dggl) ahnhVar5.se.b());
            case 1714:
                return Boolean.valueOf(fann.a(this.a.a.of()));
            case 1715:
                return fanl.a(this.a.a.of());
            case 1716:
                return Boolean.valueOf(fanm.a(this.a.a.of()));
            case 1717:
                final eyik eyikVar3 = this.a.a.oO;
                return new aral() { // from class: aqyu
                    @Override // defpackage.aral
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.use_larger_resumable_chunk_size_for_videos");
                    }
                };
            case 1718:
                ahkn ahknVar4 = this.a;
                eosc eoscVar4 = (eosc) ahknVar4.p.b();
                ahnh ahnhVar6 = ahknVar4.a;
                return new coww(eoscVar4, (coys) ahnhVar6.qK(), ahnhVar6.kW(), ahnhVar6.Ex);
            case 1719:
                ahkn ahknVar5 = this.a;
                eosc eoscVar5 = (eosc) ahknVar5.y.b();
                eosc eoscVar6 = (eosc) ahknVar5.aJ.b();
                ahnh ahnhVar7 = ahknVar5.a;
                return new coii(eoscVar5, eoscVar6, ahnhVar7.uJ, (cokd) ahnhVar7.DL.b(), (cogw) ahknVar5.cD.b());
            case 1720:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar8 = ahknVar6.a;
                return new cowi(ahnhVar8.Ef, (dqsn) ahnhVar8.qq.b(), (Context) ahknVar6.t.b(), ahnhVar8.DL, (eosc) ahknVar6.y.b(), (eosc) ahknVar6.aJ.b());
            case 1721:
                ahnh ahnhVar9 = this.a.a;
                bwfe bwfeVarEV = ahnhVar9.eV();
                ahnhVar9.sc();
                return new ccvv(bwfeVarEV, (apwn) ahnhVar9.Bg.b());
            case 1722:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar10 = ahknVar7.a;
                return new bwkn(ahnhVar10.ff(), ahnhVar10.uJ, ahnhVar10.Fa, (fcyh) ahknVar7.cA.b(), (fdjx) ahnhVar10.oS.b(), ahnhVar10.pb);
            case 1723:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar11 = ahknVar8.a;
                return new celq((dqsn) ahnhVar11.qq.b(), (cogw) ahknVar8.cD.b(), eyie.a(ahnhVar11.EF), (aqvc) ahnhVar11.to.b(), eyie.a(ahnhVar11.EP));
            case 1724:
                return ekhx.r(this.a.a.eM(), new bwjx());
            case 1725:
                return new ekph(this.a.a.eP());
            case 1726:
                ahkn ahknVar9 = this.a;
                eosc eoscVar7 = (eosc) ahknVar9.y.b();
                ahnh ahnhVar12 = ahknVar9.a;
                return new bwrn(eoscVar7, (bwjw) ahnhVar12.EM.b(), (bvur) ahknVar9.dL.b(), ahnhVar12.wv, ahnhVar12.uJ, (dqsn) ahnhVar12.qq.b(), ahnhVar12.uI, ahnhVar12.sL, ahnhVar12.qG, ahnhVar12.fj(), (celq) ahnhVar12.EK.b(), ahnhVar12.pQ, (auau) ahknVar9.ez.b(), ahnhVar12.rW, ahnhVar12.EN);
            case 1727:
                ahkn ahknVar10 = this.a;
                cogw cogwVar = (cogw) ahknVar10.cD.b();
                ahnh ahnhVar13 = ahknVar10.a;
                return new bwjw(cogwVar, (dqsn) ahnhVar13.qq.b(), ahnhVar13.EI, (eosc) ahknVar10.y.b(), ahnhVar13.qr, ahnhVar13.EJ, (celq) ahnhVar13.EK.b(), (ains) ahnhVar13.c.b(), eyie.a(ahnhVar13.EF), ahnhVar13.EL, (aqvc) ahnhVar13.to.b());
            case 1728:
                return new ahle(this);
            case 1729:
                return new ahlf(this);
            case 1730:
                ahnh ahnhVar14 = this.a.a;
                eyik eyikVar4 = ahnhVar14.yw;
                asrf asrfVar = (asrf) ahnhVar14.rl.b();
                eyik eyikVar5 = ahnhVar14.qr;
                aqve aqveVarBP = ahnhVar14.bP();
                eyik eyikVar6 = ahnhVar14.ub;
                final eyik eyikVar7 = ahnhVar14.oO;
                return new bwey(eyikVar4, asrfVar, eyikVar5, aqveVarBP, eyikVar6, new arnz() { // from class: arng
                    @Override // defpackage.arnz
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.use_e2ee_clearcut_logger_in_etouffee");
                    }
                });
            case 1731:
                final eyik eyikVar8 = this.a.a.oO;
                return new apzn() { // from class: apie
                    @Override // defpackage.apzn
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.enable_legacy_fallback_rcs_destination_feature_flag");
                    }
                };
            case 1732:
                ahnh ahnhVar15 = this.a.a;
                return new chtu(ahnhVar15.rW, ahnhVar15.se, ahnhVar15.qG);
            case 1733:
                return new bwqp(this.a.a.c);
            case 1734:
                ahnh ahnhVar16 = this.a.a;
                return new atvy((awxo) ahnhVar16.sP.b(), (awjh) ahnhVar16.sK.b(), (awnf) ahnhVar16.sJ.b(), (fdjx) ahnhVar16.m.b(), (arph) ahnhVar16.ES.b());
            case 1735:
                final eyik eyikVar9 = this.a.a.oO;
                return new arph() { // from class: arou
                    @Override // defpackage.arph
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.populate_my_identity_token_for_incoming_chat_message_request");
                    }
                };
            case 1736:
                return new bwnt(this.a.a.EJ);
            case 1737:
                ahkn ahknVar11 = this.a;
                eyik eyikVar10 = ahknVar11.p;
                ahnh ahnhVar17 = ahknVar11.a;
                return new aykj(eyikVar10, ahnhVar17.Fa, ahnhVar17.qG, ahnhVar17.pT, ahnhVar17.rW, ahnhVar17.EO);
            case 1738:
                return new ahlg(this);
            case 1739:
                ahkn ahknVar12 = this.a;
                eyik eyikVar11 = ahknVar12.a.pQ;
                aiof aiofVarAc = ahknVar12.ac();
                eyikVar11.getClass();
                return aiofVarAc.a(eyikVar11);
            case 1740:
                return new ahlh(this);
            case 1741:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar18 = ahknVar13.a;
                return new bwla(eyil.a(ahnhVar18.EG), ahnhVar18.qr, ahknVar13.p, ahknVar13.kq, ahknVar13.kr);
            case 1742:
                return new ahli(this);
            case 1743:
                final eyik eyikVar12 = this.a.a.oO;
                return new aqsz() { // from class: aqrf
                    @Override // defpackage.aqsz
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.fix_crash_xms_groups_e2ee_update");
                    }
                };
            case 1744:
                ahkn ahknVar14 = this.a;
                eosc eoscVar8 = (eosc) ahknVar14.p.b();
                eosc eoscVar9 = (eosc) ahknVar14.aJ.b();
                ahnh ahnhVar19 = ahknVar14.a;
                return new bwmz(eoscVar8, eoscVar9, ahnhVar19.Fd, ahnhVar19.uJ, ahnhVar19.sL, ahnhVar19.EU, ahnhVar19.tl, ahnhVar19.EJ, ahnhVar19.pQ, (atvy) ahnhVar19.ET.b());
            case 1745:
                ahnh ahnhVar20 = this.a.a;
                return new asrh((asqx) ahnhVar20.pT.b(), (asra) ahnhVar20.Fc.b());
            case 1746:
                return new asra((asqx) this.a.a.pT.b());
            case 1747:
                return new bwnw(this.a.a.rF);
            case 1748:
                final eyik eyikVar13 = this.a.a.oO;
                return new dflp() { // from class: dfjk
                    @Override // defpackage.dflp
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("cslib.enable_mls_for_imdn");
                    }
                };
            case 1749:
                ahnh ahnhVar21 = this.a.a;
                return new cbth((apwn) ahnhVar21.Bg.b(), ahnhVar21.rb());
            case 1750:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar22 = ahknVar15.a;
                return new bxjg(ahnhVar22.uI, ahnhVar22.qq, ahknVar15.dL);
            case 1751:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar23 = ahknVar16.a;
                return new ciwi((cteb) ahnhVar23.Cz.b(), (ajhd) ahnhVar23.yw.b(), (cogw) ahknVar16.cD.b(), ahnhVar23.wv, ahnhVar23.AG, ahnhVar23.uJ, ahnhVar23.zP, ahnhVar23.Fj, (ains) ahnhVar23.c.b(), (dqsn) ahnhVar23.qq.b(), (cqjy) ahnhVar23.Ci.b(), (Optional) ((eyig) ahknVar16.ku).a, (auau) ahknVar16.ez.b(), ahnhVar23.Fk, ahnhVar23.sL, ahknVar16.dL, ahnhVar23.EO, ahnhVar23.FB, ahnhVar23.uI, ahnhVar23.pT, ahnhVar23.xO, ahnhVar23.pb, ahnhVar23.FC, (eosc) ahknVar16.aJ.b(), (eosc) ahknVar16.p.b(), ahnhVar23.FD, (awlc) ahnhVar23.FE.b(), ahnhVar23.CK, ahnhVar23.FI, ahnhVar23.EX, ahnhVar23.bo(), (awlc) ahnhVar23.Nq.b(), ahnhVar23.cB());
            case 1752:
                ahkn ahknVar17 = this.a;
                return new aylz(ahknVar17.a.qr, (cogw) ahknVar17.cD.b());
            case 1753:
                ahnh ahnhVar24 = this.a.a;
                return new bayi(ahnhVar24.Fx, ahnhVar24.FA);
            case 1754:
                ahkn ahknVar18 = this.a;
                csax csaxVarCT = ahknVar18.cT();
                ahnh ahnhVar25 = ahknVar18.a;
                return ekhx.t(csaxVarCT, (bayh) ahnhVar25.Fl.b(), ahnhVar25.ps(), (bayh) ahnhVar25.Fm.b());
            case 1755:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar26 = ahknVar19.a;
                return new ccxj(ahnhVar26.a(), ahnhVar26.b(), ahnhVar26.c(), (fdjx) ahnhVar26.oS.b(), ahnhVar26.qq, ahnhVar26.pl, ahnhVar26.zi, ahnhVar26.qi, ahnhVar26.sL, ahknVar19.cD);
            case 1756:
                ahkn ahknVar20 = this.a;
                cogw cogwVar2 = (cogw) ahknVar20.cD.b();
                ahnh ahnhVar27 = ahknVar20.a;
                return new ckfw(cogwVar2, ahnhVar27.hv(), (cgbn) ahnhVar27.Cs.b(), ahnhVar27.sL, ahnhVar27.uJ, ahnhVar27.uu, ahnhVar27.Fs, ahknVar20.kw, ahnhVar27.CJ, ahnhVar27.Ft, (eosc) ahknVar20.aJ.b(), ahnhVar27.Fu, ahnhVar27.DX, ahnhVar27.Fv, ahnhVar27.Fw, (aquo) ahnhVar27.pl.b(), ahnhVar27.cv(), ahnhVar27.cu());
            case 1757:
                ahkn ahknVar21 = this.a;
                eosc eoscVar10 = (eosc) ahknVar21.y.b();
                eosc eoscVar11 = (eosc) ahknVar21.p.b();
                ahnh ahnhVar28 = ahknVar21.a;
                return new cdia(eoscVar10, eoscVar11, (byeq) ahnhVar28.sG.b(), (cogw) ahknVar21.cD.b(), ahnhVar28.qX(), ahknVar21.Z(), (cdgy) ahnhVar28.pQ());
            case 1758:
                ahkn ahknVar22 = this.a;
                eosc eoscVar12 = (eosc) ahknVar22.y.b();
                eosc eoscVar13 = (eosc) ahknVar22.p.b();
                eosc eoscVar14 = (eosc) ahknVar22.aJ.b();
                ahnh ahnhVar29 = ahknVar22.a;
                return new ckgi(eoscVar12, eoscVar13, eoscVar14, ahnhVar29.uJ, ahnhVar29.hv(), ahnhVar29.CJ, (cgbn) ahnhVar29.Cs.b(), ahnhVar29.DX, ahnhVar29.Fn);
            case 1759:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45627790").b());
            case 1760:
                ahkn ahknVar23 = this.a;
                eosc eoscVar15 = (eosc) ahknVar23.y.b();
                ahnh ahnhVar30 = ahknVar23.a;
                return new cufc(eoscVar15, (cgbn) ahnhVar30.Cs.b(), ahnhVar30.hv(), ahnhVar30.uJ, (cmxr) ahnhVar30.Fp.b(), ahnhVar30.et(), ahnhVar30.Fq);
            case 1761:
                ahkn ahknVar24 = this.a;
                return new cmxr((cogw) ahknVar24.cD.b(), ahknVar24.a.vl);
            case 1762:
                final eyik eyikVar14 = this.a.a.oO;
                return new apoa() { // from class: aoqu
                    @Override // defpackage.apoa
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.xms_stuck_in_sending_retry_attempts_tracker");
                    }
                };
            case 1763:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45461920").b());
            case 1764:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45530996").b());
            case 1765:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45627789").b());
            case 1766:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45675950").b());
            case 1767:
                ahnh ahnhVar31 = this.a.a;
                return ekhx.r(ahnhVar31.pr(), (bayg) ahnhVar31.Fz.b());
            case 1768:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar32 = ahknVar25.a;
                return new ckfo(ahnhVar32.Fo, (cogw) ahknVar25.cD.b(), ahnhVar32.sL, ahnhVar32.CJ, ahnhVar32.Fm, ahnhVar32.uJ, ahnhVar32.Fy, (aquo) ahnhVar32.pl.b());
            case 1769:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45675951").b());
            case 1770:
                return new cmoi(this.a.a.pb);
            case 1771:
                ahkn ahknVar26 = this.a;
                return new byej((dqsn) ahknVar26.a.qq.b(), (eosd) ahknVar26.p.b());
            case 1772:
                ahkn ahknVar27 = this.a;
                return new awlc(ahknVar27.ky, (fdjx) ahknVar27.a.m.b());
            case 1773:
                ahkn ahknVar28 = this.a;
                eosd eosdVar = (eosd) ahknVar28.p.b();
                ahnh ahnhVar33 = ahknVar28.a;
                return new ciza(eosdVar, ahnhVar33.Cs, ahnhVar33.FF, ahnhVar33.FG, ahnhVar33.FH);
            case 1774:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar34 = ahknVar29.a;
                return new caxj((egoc) ahnhVar34.k.b(), ahnhVar34.pb, (eosc) ahknVar29.p.b());
            case 1775:
                return Long.valueOf(fajx.a(this.a.a.nN()));
            case 1776:
                return Long.valueOf(fajw.a(this.a.a.nN()));
            case 1777:
                ahnh ahnhVar35 = this.a.a;
                return new awlc(ahnhVar35.Np, (fdjx) ahnhVar35.m.b());
            case 1778:
                return new ekph(this.a.a.hf());
            case 1779:
                ahkn ahknVar30 = this.a;
                cogw cogwVar3 = (cogw) ahknVar30.cD.b();
                ahnh ahnhVar36 = ahknVar30.a;
                return new cbzd(cogwVar3, (cbun) ahnhVar36.yy.b(), (ccpm) ahnhVar36.tI.b(), (awlc) ahnhVar36.FK.b(), ahnhVar36.hd(), ahnhVar36.cg(), (cbqj) ahnhVar36.yz.b(), ahnhVar36.No, (ains) ahnhVar36.pQ.b(), (fdjx) ahnhVar36.oQ.b());
            case 1780:
                ahnh ahnhVar37 = this.a.a;
                return new awlc(ahnhVar37.FJ, (fdjx) ahnhVar37.m.b());
            case 1781:
                return new ekph(this.a.a.aF());
            case 1782:
                ahkn ahknVar31 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar31.cA.b();
                ahnh ahnhVar38 = ahknVar31.a;
                return new aoew(fcyhVar, ahnhVar38.qC, (awzf) ahnhVar38.sI.b());
            case 1783:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar39 = ahknVar32.a;
                return new atwz((atxs) ahnhVar39.Gd.b(), (auaq) ahknVar32.js.b(), (cogw) ahknVar32.cD.b(), ahnhVar39.sh, ahnhVar39.Gf, ahnhVar39.Gg, ahnhVar39.Gh, (eosc) ahknVar32.y.b(), ahnhVar39.ET, ahnhVar39.bK());
            case 1784:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar40 = ahknVar33.a;
                return new atxs((bvkr) ahnhVar40.wa.b(), ahnhVar40.FP, (cema) ahnhVar40.EG.b(), ahnhVar40.FU, (cfeh) ahnhVar40.Gc.b(), (eosc) ahknVar33.p.b(), ahknVar33.dh);
            case 1785:
                ahkn ahknVar34 = this.a;
                Context context = (Context) ahknVar34.t.b();
                ahnh ahnhVar41 = ahknVar34.a;
                return new bviq(context, ahknVar34.aT, ahnhVar41.vl, ahknVar34.cI, (bvir) ahnhVar41.FN.b(), ahnhVar41.qY, (aprp) ahnhVar41.FO.b(), ahnhVar41.DX, (eosc) ahknVar34.y.b());
            case 1786:
                ahkn ahknVar35 = this.a;
                return new bvir((Context) ahknVar35.t.b(), ahknVar35.aN, ahknVar35.a.qr);
            case 1787:
                final eyik eyikVar15 = this.a.a.oO;
                return new aprp() { // from class: aoww
                    @Override // defpackage.aprp
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_device_onboarding");
                    }
                };
            case 1788:
                ahkn ahknVar36 = this.a;
                eosc eoscVar16 = (eosc) ahknVar36.y.b();
                ahnh ahnhVar42 = ahknVar36.a;
                return new cemk(eoscVar16, (Optional) ahnhVar42.FQ.b(), (cezv) ahnhVar42.tc.b(), (cfwu) ahnhVar42.FR.b(), (ceku) ahnhVar42.FS.b(), abcp.a(Optional.empty()), (cejj) ahnhVar42.tJ.b(), (ains) ahnhVar42.c.b(), (Optional) ahknVar36.hZ.b(), eyie.a(ahnhVar42.xd), (cenj) ahnhVar42.tf.b(), (aipo) ahnhVar42.us.b(), (cepq) ahnhVar42.FT.b());
            case 1789:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar43 = ahknVar37.a;
                return new cfwz(eyie.a(ahnhVar43.rF), eyie.a(ahnhVar43.EG), (eosc) ahknVar37.p.b(), (eosc) ahknVar37.y.b());
            case 1790:
                return abcs.a((cedm) this.a.a.xj.b(), Optional.empty());
            case 1791:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar44 = ahknVar38.a;
                return new cepq((aipo) ahnhVar44.us.b(), (ains) ahnhVar44.c.b(), (eosc) ahknVar38.y.b());
            case 1792:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar45 = ahknVar39.a;
                eyik eyikVar16 = ahknVar39.dh;
                eyik eyikVar17 = ahnhVar45.Gb;
                return new cfeh(eyikVar17, eyikVar16, eyikVar17, eyikVar17);
            case 1793:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar46 = ahknVar40.a;
                eyik eyikVar18 = ahnhVar46.xk;
                eyik eyikVar19 = ahnhVar46.wa;
                eyik eyikVar20 = ahnhVar46.EG;
                eyik eyikVar21 = ahknVar40.p;
                eyik eyikVar22 = ahnhVar46.FP;
                eyik eyikVarA = eyil.a(ahnhVar46.xd);
                return new cfei(eyikVar18, ahknVar40.cD, ahknVar40.aT, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVarA, ahnhVar46.c, ahnhVar46.FV, ahnhVar46.FX, ahnhVar46.FY, ahnhVar46.FZ, ahnhVar46.Ga, ahknVar40.dh, ahknVar40.kB);
            case 1794:
                ahkn ahknVar41 = this.a;
                eyik eyikVar23 = ahknVar41.y;
                ahnh ahnhVar47 = ahknVar41.a;
                return new cfgj(eyikVar23, ahnhVar47.sX, ahnhVar47.tf, ahknVar41.cD);
            case 1795:
                ahkn ahknVar42 = this.a;
                ahnh ahnhVar48 = ahknVar42.a;
                return new bvfj((bvkr) ahnhVar48.wa.b(), ahnhVar48.tg, ahnhVar48.FW, (cogw) ahknVar42.cD.b(), (eosc) ahknVar42.y.b());
            case 1796:
                return new cevm(this.a.a.qK);
            case 1797:
                return new cfgc(this.a.a.FP);
            case 1798:
                return abcr.a((cepf) this.a.a.FZ.b(), Optional.empty());
            case 1799:
                ahnh ahnhVar49 = this.a.a;
                return new awlc(ahnhVar49.Ge, (fdjx) ahnhVar49.m.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.b;
        switch (i) {
            case 1800:
                return new ekph(this.a.a.dE());
            case 1801:
                ahnh ahnhVar = this.a.a;
                return new auab((atzy) ahnhVar.FL.b(), (fdjx) ahnhVar.m.b());
            case 1802:
                ahnh ahnhVar2 = this.a.a;
                return new awnj((awnf) ahnhVar2.sJ.b(), (fdjx) ahnhVar2.m.b());
            case 1803:
                ahkn ahknVar = this.a;
                ahnh ahnhVar3 = ahknVar.a;
                return new axnv(ahnhVar3.c, ahnhVar3.sL, ahnhVar3.uJ, ahknVar.cD, ahnhVar3.yw, ahnhVar3.uu, ahnhVar3.qq, ahnhVar3.yD, ahknVar.p);
            case 1804:
                ahkn ahknVar2 = this.a;
                eosc eoscVar = (eosc) ahknVar2.aJ.b();
                eosc eoscVar2 = (eosc) ahknVar2.p.b();
                ahnh ahnhVar4 = ahknVar2.a;
                eyik eyikVar = ahnhVar4.yw;
                eyik eyikVar2 = ahnhVar4.qM;
                eyik eyikVar3 = ahnhVar4.zP;
                eyik eyikVar4 = ahnhVar4.sL;
                eyik eyikVar5 = ahnhVar4.uJ;
                eyik eyikVar6 = ahnhVar4.ww;
                eyik eyikVar7 = ahknVar2.kC;
                cmpq cmpqVar = (cmpq) ahnhVar4.Gm.b();
                asrh asrhVar = (asrh) ahnhVar4.Fd.b();
                cicm cicmVar = (cicm) ahnhVar4.Gx.b();
                eyik eyikVar8 = ahnhVar4.Cp;
                dqsn dqsnVar = (dqsn) ahnhVar4.qq.b();
                bveg bvegVar = (bveg) ahnhVar4.yx.b();
                eyik eyikVar9 = ahnhVar4.HG;
                crtq crtqVar = (crtq) ahnhVar4.HI.b();
                bydb bydbVar = (bydb) ahnhVar4.IE.b();
                bbfn bbfnVar = (bbfn) ahnhVar4.CF.b();
                cogw cogwVar = (cogw) ahknVar2.cD.b();
                chvp chvpVar = (chvp) ahnhVar4.DC.b();
                ayqn ayqnVar = (ayqn) ahnhVar4.yv.b();
                aypv aypvVar = (aypv) ahknVar2.ld.b();
                cohh cohhVar = (cohh) ahnhVar4.EE.b();
                cteb ctebVar = (cteb) ahnhVar4.Cz.b();
                aslv aslvVar = (aslv) ahnhVar4.IF.b();
                cbtt cbttVarGW = ahnhVar4.gW();
                eyik eyikVar10 = ahnhVar4.IH;
                eyik eyikVar11 = ahnhVar4.II;
                eygg eyggVarA = eyie.a(ahnhVar4.Jc);
                eyik eyikVar12 = ahnhVar4.qi;
                return cosw.a(eoscVar, eoscVar2, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, cmpqVar, asrhVar, cicmVar, eyikVar8, dqsnVar, bvegVar, eyikVar9, crtqVar, bydbVar, bbfnVar, cogwVar, chvpVar, ayqnVar, aypvVar, cohhVar, ctebVar, aslvVar, cbttVarGW, eyikVar10, eyikVar11, eyggVarA, eyikVar12, ahnhVar4.Jd, (cavl) ahnhVar4.Je.b(), ahnhVar4.Jg, ahnhVar4.Jh, ahnhVar4.Js, (coor) ahnhVar4.Ju.b(), ahnhVar4.HP, ahknVar2.lz.b(), ahnhVar4.EN, ahnhVar4.Jv, ahnhVar4.Jw, ahnhVar4.Jy, ahnhVar4.bI(), ahnhVar4.Jz, ahnhVar4.Gg, ahnhVar4.JA, ahnhVar4.sJ, ahnhVar4.ux, ahnhVar4.bo(), ahnhVar4.Gi, ahnhVar4.JB, ahnhVar4.JC, (arph) ahnhVar4.ES.b(), ahnhVar4.bK(), ahnhVar4.ET);
            case 1805:
                ahnh ahnhVar5 = this.a.a;
                bwfg bwfgVarEW = ahnhVar5.eW();
                ahnhVar5.sd();
                return new ccvw(bwfgVarEW, (apwn) ahnhVar5.Bg.b());
            case 1806:
                ahnh ahnhVar6 = this.a.a;
                return chxm.a(ahnhVar6.Gw, ahnhVar6.Gv);
            case 1807:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar7 = ahknVar3.a;
                return new cicc((cibz) ahnhVar7.Gv.b(), ahnhVar7.pT, ahnhVar7.qi, ahnhVar7.zO, (eosc) ahknVar3.y.b());
            case 1808:
                ahkn ahknVar4 = this.a;
                eosc eoscVar3 = (eosc) ahknVar4.y.b();
                ahnh ahnhVar8 = ahknVar4.a;
                return new cibz(eoscVar3, (cicl) ahnhVar8.qs(), (ciux) ahnhVar8.Cu.b(), (ains) ahnhVar8.c.b(), ahnhVar8.us, ahnhVar8.AM, ahnhVar8.Gq, ahnhVar8.Gt, ahnhVar8.ux, ahnhVar8.jc(), eyie.a(ahnhVar8.qi), (aqnw) ahnhVar8.Gu.b());
            case 1809:
                return new baqy(this.a.a.sL);
            case 1810:
                return new awgi(this.a.a.Gp);
            case 1811:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar9 = ahknVar5.a;
                return new awfv((awci) ahnhVar9.pV.b(), (awfi) ahnhVar9.Go.b(), (eosc) ahknVar5.y.b(), ahnhVar9.qr);
            case 1812:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar10 = ahknVar6.a;
                return new awfi(ahnhVar10.pV, ahnhVar10.sL, ahnhVar10.uQ, ahnhVar10.uv, ahnhVar10.CR, ahnhVar10.uM, ahknVar6.y, ahnhVar10.AE);
            case 1813:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar11 = ahknVar7.a;
                return new cnqt(ahnhVar11.DC, ahnhVar11.zP, ahnhVar11.uv, (dqsn) ahnhVar11.qq.b(), (Context) ahknVar7.t.b(), ahnhVar11.qi, (anuh) ahnhVar11.zO.b(), ahnhVar11.Gr, ahnhVar11.Gs, ahnhVar11.ur);
            case 1814:
                return Boolean.valueOf(falt.a(this.a.a.nX()));
            case 1815:
                ahnh ahnhVar12 = this.a.a;
                return new cmsk(ahnhVar12.sL, ahnhVar12.uv, ahnhVar12.qi);
            case 1816:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqnw() { // from class: aqna
                    @Override // defpackage.aqnw
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.conversation_creation_sets_destination_token");
                    }
                };
            case 1817:
                ahnh ahnhVar13 = this.a.a;
                return new cscx(ahnhVar13.Hv, ahnhVar13.HB, ahnhVar13.HF, ahnhVar13.HA, ahnhVar13.Ha, ahnhVar13.GN, ahnhVar13.HE, ahnhVar13.Hz, (fdjx) ahnhVar13.oS.b());
            case 1818:
                return ekhx.o(this.a.a.rt());
            case 1819:
                return new csgg((cugg) this.a.a.Cl.b());
            case 1820:
                ahkn ahknVar8 = this.a;
                return new csek(ahknVar8.a.GM, ahknVar8.cD, ahknVar8.cz);
            case 1821:
                ahnh ahnhVar14 = this.a.a;
                return new crxy(ahnhVar14.GK, ahnhVar14.GL, (fdjx) ahnhVar14.m.b(), (fdjx) ahnhVar14.oS.b());
            case 1822:
                ahkn ahknVar9 = this.a;
                eyik eyikVar14 = ahknVar9.cA;
                ahnh ahnhVar15 = ahknVar9.a;
                return new cryk(ahnhVar15.Gz, ahnhVar15.GA, ahnhVar15.BD, ahnhVar15.GB, ahnhVar15.BC, ahnhVar15.GD, ahnhVar15.GJ, ahnhVar15.GG, ahnhVar15.zP, ahnhVar15.sL, ahnhVar15.uJ, ahknVar9.cD, ahnhVar15.sX, (fcyh) eyikVar14.b());
            case 1823:
                ahkn ahknVar10 = this.a;
                ecjh ecjhVar = (ecjh) ahknVar10.kG.b();
                cogw cogwVar2 = (cogw) ahknVar10.cD.b();
                ahnh ahnhVar16 = ahknVar10.a;
                return new crzb(ecjhVar, cogwVar2, (dqsn) ahnhVar16.qq.b(), (fdjx) ahnhVar16.oS.b());
            case 1824:
                ahkn ahknVar11 = this.a;
                return new csel((Context) ahknVar11.t.b(), ahknVar11.a.BD, (cogw) ahknVar11.cD.b(), ahknVar11.aT, ahknVar11.gE);
            case 1825:
                ahkn ahknVar12 = this.a;
                return new afhk((crqx) ahknVar12.gF.b(), (cqbm) ahknVar12.a.sX.b());
            case 1826:
                ahkn ahknVar13 = this.a;
                eyik eyikVar15 = ahknVar13.cA;
                ahnh ahnhVar17 = ahknVar13.a;
                return new csjm(ahnhVar17.qK, ahnhVar17.GC, (fcyh) eyikVar15.b());
            case 1827:
                ahnh ahnhVar18 = this.a.a;
                return new csjh(ahnhVar18.pQ, (fdjx) ahnhVar18.m.b());
            case 1828:
                return new cspm(this.a.a.GI);
            case 1829:
                return new ahlk(this);
            case 1830:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar19 = ahknVar14.a;
                return new csqg(ahnhVar19.zP, ahnhVar19.sL, ahnhVar19.uJ, ahnhVar19.GG, ahknVar14.cD, (dqsn) ahnhVar19.qq.b(), (fdjx) ahnhVar19.oS.b());
            case 1831:
                ahkn ahknVar15 = this.a;
                eyik eyikVar16 = ahknVar15.cA;
                ahnh ahnhVar20 = ahknVar15.a;
                return new csqi(ahnhVar20.GF, ahnhVar20.zP, (fcyh) eyikVar16.b());
            case 1832:
                ahnh ahnhVar21 = this.a.a;
                return new cspt(ahnhVar21.GE, ahnhVar21.zP, ahnhVar21.qi);
            case 1833:
                return new ahll(this);
            case 1834:
                ahkn ahknVar16 = this.a;
                eyik eyikVar17 = ahknVar16.cD;
                ahnh ahnhVar22 = ahknVar16.a;
                return new cryb(ahknVar16.t, ahknVar16.kH, ahnhVar22.qY, (cogw) eyikVar17.b(), (fdjx) ahnhVar22.oQ.b());
            case 1835:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar23 = ahknVar17.a;
                return new csfj(ahknVar17.kF, ahnhVar23.GO, (fdjx) ahnhVar23.m.b());
            case 1836:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar24 = ahknVar18.a;
                return new csfs(ahnhVar24.Bz, ahknVar18.kI, (fdjx) ahnhVar24.oS.b());
            case 1837:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar25 = ahknVar19.a;
                return new csfg(ahknVar19.kF, ahnhVar25.GW, ahknVar19.kI, ahnhVar25.pQ, (fdjx) ahnhVar25.m.b());
            case 1838:
                ahkn ahknVar20 = this.a;
                eyik eyikVar18 = ahknVar20.cz;
                ahnh ahnhVar26 = ahknVar20.a;
                return new csrb(ahnhVar26.GQ, ahnhVar26.pE, ahnhVar26.uM, ahknVar20.cD, ahnhVar26.tf, ahnhVar26.zP, ahknVar20.kJ, ahnhVar26.GR, ahnhVar26.Gz, ahnhVar26.pf, ahnhVar26.GV, (fcyh) eyikVar18.b());
            case 1839:
                return new csqj(this.a.a.qQ);
            case 1840:
                ahkn ahknVar21 = this.a;
                return new csem((Context) ahknVar21.t.b(), ahknVar21.a.pB);
            case 1841:
                return new cspg(this.a.a.GU);
            case 1842:
                return new ahlm(this);
            case 1843:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar27 = ahknVar22.a;
                return new cspk(ahknVar22.kK, ahnhVar27.GJ, ahnhVar27.uJ);
            case 1844:
                ahkn ahknVar23 = this.a;
                return new csjw((Context) ahknVar23.t.b(), ahknVar23.a.Bz);
            case 1845:
                ahnh ahnhVar28 = this.a.a;
                return new csed(ahnhVar28.GH, ahnhVar28.qN, ahnhVar28.GM, ahnhVar28.GZ, (fdjx) ahnhVar28.oS.b());
            case 1846:
                ahnh ahnhVar29 = this.a.a;
                return new cryo(ahnhVar29.GK, ahnhVar29.GL, (fdjx) ahnhVar29.oQ.b());
            case 1847:
                ahkn ahknVar24 = this.a;
                eyik eyikVar19 = ahknVar24.cD;
                ahnh ahnhVar30 = ahknVar24.a;
                return new bbgw(ahnhVar30.Hi, (cogw) eyikVar19.b(), ahnhVar30.Hf, ahnhVar30.Hj, ahnhVar30.Hk, ahnhVar30.uJ, ahnhVar30.zP, ahnhVar30.yw, (ains) ahnhVar30.c.b(), (cenj) ahnhVar30.tf.b(), ahnhVar30.GR, ahnhVar30.GA, ahnhVar30.BD, ahnhVar30.Gz, ahnhVar30.cb(), (eosc) ahknVar24.y.b(), (eosc) ahknVar24.p.b());
            case 1848:
                return crqe.a((crql) this.a.a.Hh.b());
            case 1849:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar31 = ahknVar25.a;
                return new crql(ahnhVar31.Hf, eyie.a(ahnhVar31.Hg), (eosc) ahknVar25.p.b(), ahknVar25.kN);
            case 1850:
                ahkn ahknVar26 = this.a;
                Context context = (Context) ahknVar26.t.b();
                ahnh ahnhVar32 = ahknVar26.a;
                return new cpez(context, ahnhVar32.Hb, ahnhVar32.uJ, ahnhVar32.zP, eyie.a(ahnhVar32.Hc), ahknVar26.kL, (cqyy) ahnhVar32.Hd.b(), (cqyy) ahnhVar32.He.b(), (eosc) ahknVar26.y.b(), (eosc) ahknVar26.p.b(), ahnhVar32.yw, ahnhVar32.Cg);
            case 1851:
                ahnh ahnhVar33 = this.a.a;
                return new cqyx(ahnhVar33.uI, (dqsn) ahnhVar33.qq.b());
            case 1852:
                ahnh ahnhVar34 = this.a.a;
                return new cpfc(ahnhVar34.zP, (ajhd) ahnhVar34.yw.b());
            case 1853:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar35 = ahknVar27.a;
                cugg cuggVar = (cugg) ahnhVar35.Cl.b();
                return new cqzl(cuggVar, (eosc) ahknVar27.y.b());
            case 1854:
                ahkn ahknVar28 = this.a;
                return new cqzc(ahknVar28.a.ln(), (eosc) ahknVar28.p.b());
            case 1855:
                ahkn ahknVar29 = this.a;
                return new crpt((eosc) ahknVar29.p.b(), ahknVar29.a.lt());
            case 1856:
                return new cpdy((cepb) this.a.a.qQ.b());
            case 1857:
                ahnh ahnhVar36 = this.a.a;
                return new bbfz((dqsn) ahnhVar36.qq.b(), ahnhVar36.uI);
            case 1858:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar37 = ahknVar30.a;
                return new cshf(ahnhVar37.Hn, eyie.a(ahnhVar37.Hp), (fcyh) ahknVar30.cz.b(), (fcyh) ahknVar30.bM.b(), ahnhVar37.Hq);
            case 1859:
                ahkn ahknVar31 = this.a;
                eyik eyikVar20 = ahknVar31.lb;
                ahnh ahnhVar38 = ahknVar31.a;
                return new cshq(eyikVar20, ahknVar31.cD, ahnhVar38.vh, ahnhVar38.Hm);
            case 1860:
                return new cshh(this.a.a.rc);
            case 1861:
                ahkn ahknVar32 = this.a;
                return new crew((Context) ahknVar32.t.b(), (eosc) ahknVar32.y.b(), (eosc) ahknVar32.p.b(), (cree) ahknVar32.a.Ho.b());
            case 1862:
                ahkn ahknVar33 = this.a;
                return new cree((Context) ahknVar33.t.b(), ahknVar33.a.Bz, (eosc) ahknVar33.y.b(), (eosc) ahknVar33.p.b(), (eosc) ahknVar33.aJ.b(), (cogw) ahknVar33.cD.b());
            case 1863:
                ahkn ahknVar34 = this.a;
                return new csiv(ahknVar34.a.pQ, (Context) ahknVar34.t.b());
            case 1864:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar39 = ahknVar35.a;
                return new csgx(ahknVar35.lc, ahnhVar39.Hs, eyie.a(ahnhVar39.Hp), (eosc) ahknVar35.p.b(), (eosc) ahknVar35.y.b(), ahnhVar39.Hq);
            case 1865:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar40 = ahknVar36.a;
                return new cshk(ahknVar36.lc, ahknVar36.cD, ahnhVar40.vh, ahnhVar40.Hm, (eosc) ahknVar36.y.b());
            case 1866:
                return Optional.of((csgy) this.a.a.Hr.b());
            case 1867:
                ahnh ahnhVar41 = this.a.a;
                return new csda(ahnhVar41.Hw, ahnhVar41.HA, ahnhVar41.Ha, ahnhVar41.GN, (fdjx) ahnhVar41.oS.b());
            case 1868:
                return ekhx.o(this.a.a.rw());
            case 1869:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar42 = ahknVar37.a;
                return new cseu(ahnhVar42.Hx, ahnhVar42.GG, ahnhVar42.sL, ahnhVar42.GH, ahnhVar42.GT, ahnhVar42.ws, ahnhVar42.GN, ahnhVar42.GM, ahnhVar42.Hy, ahnhVar42.Hz, ahknVar37.cA);
            case 1870:
                ahkn ahknVar38 = this.a;
                return new crvg(ahknVar38.a.Bz, ahknVar38.bM, ahknVar38.p, ahknVar38.y);
            case 1871:
                ahnh ahnhVar43 = this.a.a;
                return new csrt(ahnhVar43.zP, ahnhVar43.sL, ahnhVar43.uJ, ahnhVar43.GS, ahnhVar43.GH, ahnhVar43.GW, ahnhVar43.Ha, (fdjx) ahnhVar43.oQ.b(), (fdjx) ahnhVar43.oS.b());
            case 1872:
                ahkn ahknVar39 = this.a;
                eyik eyikVar21 = ahknVar39.cA;
                ahnh ahnhVar44 = ahknVar39.a;
                return new csjd(ahnhVar44.GD, ahnhVar44.GT, (fcyh) eyikVar21.b());
            case 1873:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar45 = ahknVar40.a;
                return new csks(ahnhVar45.Hv, ahnhVar45.sL, ahnhVar45.uJ, ahnhVar45.GH, ahnhVar45.HC, ahnhVar45.HA, ahnhVar45.Ha, ahnhVar45.HB, ahnhVar45.HE, ahknVar40.cD, ahknVar40.cA);
            case 1874:
                return new cskv(this.a.a.rF);
            case 1875:
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar46 = ahknVar41.a;
                return new cscs(ahnhVar46.HD, ahnhVar46.GG, ahnhVar46.GS, ahnhVar46.GV, ahnhVar46.sL, ahnhVar46.uJ, ahnhVar46.qG, ahknVar41.cz);
            case 1876:
                ahkn ahknVar42 = this.a;
                eyik eyikVar22 = ahknVar42.cz;
                ahnh ahnhVar47 = ahknVar42.a;
                return new crtw(ahnhVar47.GA, ahnhVar47.BD, ahnhVar47.uJ, ahnhVar47.GG, ahnhVar47.sL, (fcyh) eyikVar22.b(), (fdjx) ahnhVar47.oQ.b());
            case 1877:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar48 = ahknVar43.a;
                return new crtq(ahnhVar48.zP, ahnhVar48.sL, ahnhVar48.uJ, ahnhVar48.HH, (eosc) ahknVar43.y.b());
            case 1878:
                return new crye(this.a.a.rc);
            case 1879:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar49 = ahknVar44.a;
                return new bwtd((ains) ahnhVar49.c.b(), ahnhVar49.wv, ahnhVar49.uJ, ahnhVar49.sL, ahnhVar49.AQ, ahnhVar49.qG, (dqsn) ahnhVar49.qq.b(), (cmvy) ahnhVar49.pE.b(), ahnhVar49.HJ, (eosc) ahknVar44.y.b(), ahnhVar49.Ix, ahnhVar49.CK, ahnhVar49.Ip, ahnhVar49.IC, ahnhVar49.ID, ahnhVar49.qi, ahnhVar49.pl);
            case 1880:
                ahkn ahknVar45 = this.a;
                ahnh ahnhVar50 = ahknVar45.a;
                return new bauh((dqsn) ahnhVar50.qq.b(), ahnhVar50.uI, ahknVar45.ez, ahnhVar50.uM, ahnhVar50.uG, ahnhVar50.zP, ahnhVar50.In, ahnhVar50.qi, (cogw) ahknVar45.cD.b(), ahnhVar50.Io);
            case 1881:
                ahkn ahknVar46 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar46.cz.b();
                fcyh fcyhVar2 = (fcyh) ahknVar46.bM.b();
                ahnh ahnhVar51 = ahknVar46.a;
                return new bays(fcyhVar, fcyhVar2, (fdjx) ahnhVar51.m.b(), eyie.a(ahnhVar51.Im));
            case 1882:
                ahnh ahnhVar52 = this.a.a;
                return ekhx.v(ahnhVar52.j(), ahnhVar52.l(), ahnhVar52.gE(), ahnhVar52.au(), new abul(), ahnhVar52.jC(), ahnhVar52.jE(), ahnhVar52.ix(), ahnhVar52.hF(), ahnhVar52.jk(), ahnhVar52.ap(), ahnhVar52.W(), ahnhVar52.X(), ahnhVar52.jM(), ahnhVar52.jV(), ahnhVar52.lx(), ahnhVar52.lG(), ahnhVar52.o());
            case 1883:
                return Boolean.valueOf(aopr.a((eoth) this.a.a.oO.b()));
            case 1884:
                final eyik eyikVar23 = this.a.a.oO;
                return new aoot() { // from class: aopk
                    @Override // defpackage.aoot
                    public final boolean a() {
                        return ((eoth) eyikVar23.b()).a("bugle.allow_true_multi_device_opt_in");
                    }
                };
            case 1885:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar53 = ahknVar47.a;
                egir egirVar = (egir) ahnhVar53.HM.b();
                return new axky(egirVar, (eosc) ahknVar47.aJ.b(), (dqsn) ahnhVar53.qq.b(), (egzh) ahknVar47.aQ.b(), (ains) ahnhVar53.c.b());
            case 1886:
                return new egir((egcd) this.a.a.l.b());
            case 1887:
                ahkn ahknVar48 = this.a;
                Optional optional = (Optional) ahknVar48.li.b();
                ahnh ahnhVar54 = ahknVar48.a;
                return new ajjx(optional, ahknVar48.di(), ahnhVar54.at(), ahnhVar54.sh, (eosc) ahknVar48.p.b(), (eosc) ahknVar48.y.b(), (eosc) ahknVar48.aJ.b());
            case 1888:
                ahkn ahknVar49 = this.a;
                ahnh ahnhVar55 = ahknVar49.a;
                return new ckdc(ahnhVar55.yx, ahnhVar55.HP, ahknVar49.ez, ahnhVar55.HR);
            case 1889:
                ahkn ahknVar50 = this.a;
                ahnh ahnhVar56 = ahknVar50.a;
                return new cdys(ahnhVar56.hD(), (eosd) ahknVar50.p.b(), (appk) ahnhVar56.HQ.b());
            case 1890:
                final eyik eyikVar24 = this.a.a.oO;
                return new appk() { // from class: aotf
                    @Override // defpackage.appk
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.log_message_deletions_in_buffer");
                    }
                };
            case 1891:
                return new ckfa((bxlc) this.a.a.uI.b());
            case 1892:
                ahnh ahnhVar57 = this.a.a;
                return new cgvm((egej) ahnhVar57.pI.b(), ahnhVar57.ml(), (fdjx) ahnhVar57.oQ.b(), (cden) ahnhVar57.qN.b());
            case 1893:
                ahkn ahknVar51 = this.a;
                return dopf.a(eyht.a(ahknVar51.c), cgve.a(), dope.a(), ahknVar51.eU(), (Executor) ahknVar51.p.b(), (ScheduledExecutorService) ahknVar51.y.b(), (Executor) ahknVar51.a.j.b());
            case 1894:
                ahnh ahnhVar58 = this.a.a;
                return new bbhh(ahnhVar58.eB(), ahnhVar58.qq);
            case 1895:
                final eyik eyikVar25 = this.a.a.oO;
                return new apvy() { // from class: apdl
                    @Override // defpackage.apvy
                    public final boolean a() {
                        return ((eoth) eyikVar25.b()).a("bugle.log_mms_group_size");
                    }
                };
            case 1896:
                ahkn ahknVar52 = this.a;
                ahnh ahnhVar59 = ahknVar52.a;
                return new ckwj((dqsn) ahnhVar59.qq.b(), (bxlc) ahnhVar59.uI.b(), ahnhVar59.rI(), (cogw) ahknVar52.cD.b());
            case 1897:
                ahnh ahnhVar60 = this.a.a;
                return new cklf(ahnhVar60.al(), ahnhVar60.am(), (cmum) ahnhVar60.wF.b(), (aika) ahnhVar60.uM.b());
            case 1898:
                ahnh ahnhVar61 = this.a.a;
                return new cklg((ains) ahnhVar61.c.b(), ahnhVar61.pb, ahnhVar61.E());
            case 1899:
                return zcc.a((zbw) this.a.a.Ia.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object m() {
        int i = this.b;
        switch (i) {
            case 1900:
                ahnh ahnhVar = this.a.a;
                return new zbw(ahnhVar.Bz, (fdjx) ahnhVar.oQ.b());
            case 1901:
                return new amif((aika) this.a.a.uM.b());
            case 1902:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahnh ahnhVar2 = ahknVar.a;
                return new crvu(context, (fdjx) ahnhVar2.m.b(), ahnhVar2.Ik, ahnhVar2.Ii, ahknVar.lk, ahnhVar2.Id);
            case 1903:
                ahkn ahknVar2 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar2.bM.b();
                ahnh ahnhVar3 = ahknVar2.a;
                return new crwx(fcyhVar, ahnhVar3.Ig, (cqdr) ahknVar2.lk.b(), ahnhVar3.pT, ahnhVar3.sP, ahnhVar3.mD());
            case 1904:
                ahkn ahknVar3 = this.a;
                auau auauVar = (auau) ahknVar3.ez.b();
                ahnh ahnhVar4 = ahknVar3.a;
                return new chfz(auauVar, (cgxw) ahnhVar4.Ie.b(), (awlc) ahnhVar4.If.b(), (fdjx) ahnhVar4.m.b(), ahnhVar4.cA());
            case 1905:
                return new awlc(eyim.a, (fdjx) this.a.a.m.b());
            case 1906:
                Set setRK = this.a.a.rK();
                efom.a(setRK);
                return setRK;
            case 1907:
                return Optional.of((cgte) this.a.a.AC.b());
            case 1908:
                ahkn ahknVar4 = this.a;
                return new crwr((fcyh) ahknVar4.cA.b(), (dqsn) ahknVar4.a.qq.b(), ahknVar4.cD);
            case 1909:
                return new asff() { // from class: asey
                };
            case 1910:
                ahnh ahnhVar5 = this.a.a;
                return new bwsk(ahnhVar5.qq, ahnhVar5.sG, ahnhVar5.Is, ahnhVar5.Iu, ahnhVar5.Iv, ahnhVar5.Iw, ahnhVar5.uQ, ahnhVar5.Ip);
            case 1911:
                ahnh ahnhVar6 = this.a.a;
                return new bwsr(ahnhVar6.uJ, ahnhVar6.Ip, ahnhVar6.Ir, ahnhVar6.Iq);
            case 1912:
                return new bwtj((ains) this.a.a.c.b());
            case 1913:
                ahnh ahnhVar7 = this.a.a;
                return new bwtl(ahnhVar7.qG, ahnhVar7.sL, ahnhVar7.uJ, ahnhVar7.AQ, ahnhVar7.HJ, ahnhVar7.EO, ahnhVar7.Ip, ahnhVar7.CK, ahnhVar7.Iq);
            case 1914:
                return new bwth(this.a.a.uJ);
            case 1915:
                ahnh ahnhVar8 = this.a.a;
                return new bwtf(ahnhVar8.uJ, ahnhVar8.EO, ahnhVar8.sL, ahnhVar8.HJ, ahnhVar8.Ir, ahnhVar8.Iq, ahnhVar8.It);
            case 1916:
                final eyik eyikVar = this.a.a.oO;
                return new apvg() { // from class: apcp
                    @Override // defpackage.apvg
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.insert_tombstone_for_mms_messages_in_e2ee_conversations");
                    }
                };
            case 1917:
                ahnh ahnhVar9 = this.a.a;
                return new bwsf(ahnhVar9.HP, ahnhVar9.Iu);
            case 1918:
                ahnh ahnhVar10 = this.a.a;
                return new bwsg(ahnhVar10.uJ, ahnhVar10.Ir, ahnhVar10.Iu);
            case 1919:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar11 = ahknVar5.a;
                return new bypl((byeq) ahnhVar11.sG.b(), (cogw) ahknVar5.cD.b(), ahnhVar11.Iz, ahnhVar11.IA, ahnhVar11.IB, (fcyh) ahknVar5.cz.b(), (fdjx) ahnhVar11.oQ.b());
            case 1920:
                ahkn ahknVar6 = this.a;
                cqba cqbaVar = (cqba) ahknVar6.aM.b();
                ahnh ahnhVar12 = ahknVar6.a;
                return new aukz(cqbaVar, ahnhVar12.qr, (aurx) ahnhVar12.wc.b(), (apow) ahnhVar12.Iy.b(), ahnhVar12.aZ(), ahnhVar12.aU(), ahnhVar12.bb(), ahnhVar12.aW(), (eosc) ahknVar6.p.b(), (eosc) ahknVar6.y.b());
            case 1921:
                final eyik eyikVar2 = this.a.a.oO;
                return new apow() { // from class: aosg
                    @Override // defpackage.apow
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_initial_sync_counts_in_clearcut_events");
                    }
                };
            case 1922:
                final eyik eyikVar3 = this.a.a.oO;
                return new appg() { // from class: aosx
                    @Override // defpackage.appg
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.log_entry_not_found_in_cms_deleted_messages_buffer");
                    }
                };
            case 1923:
                final eyik eyikVar4 = this.a.a.oO;
                return new appx() { // from class: aoue
                    @Override // defpackage.appx
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.round_cms_buffer_deletion_timestamp_to_day");
                    }
                };
            case 1924:
                final eyik eyikVar5 = this.a.a.oO;
                return new appm() { // from class: aotj
                    @Override // defpackage.appm
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.log_tombstone_deletion_in_cms_deleted_messages_buffer");
                    }
                };
            case 1925:
                ahkn ahknVar7 = this.a;
                return new aslv((eosc) ahknVar7.y.b(), (dqsn) ahknVar7.a.qq.b());
            case 1926:
                ahkn ahknVar8 = this.a;
                Context context2 = (Context) ahknVar8.t.b();
                ahnh ahnhVar13 = ahknVar8.a;
                return new cpjp(context2, ahnhVar13.Cy, ahnhVar13.AM, ahnhVar13.zP, ahnhVar13.sL, (cpiz) ahknVar8.de.b(), ahnhVar13.IG, (cpgf) ahnhVar13.GT.b(), (bxlc) ahnhVar13.uI.b(), ahnhVar13.qN, (dqsn) ahnhVar13.qq.b(), ahnhVar13.GZ, ahknVar8.ll, (fdjx) ahnhVar13.oS.b(), ahknVar8.jo);
            case 1927:
                ahkn ahknVar9 = this.a;
                return new cpio((Context) ahknVar9.t.b(), (cmvy) ahknVar9.a.pE.b());
            case 1928:
                return new coqq(this.a.a.rF);
            case 1929:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar14 = ahknVar10.a;
                return ekhx.v(ahnhVar14.jD(), ahnhVar14.fh(), ahnhVar14.jF(), (bayb) ahnhVar14.Fl.b(), ahnhVar14.jK(), ahnhVar14.fi(), ahnhVar14.pt(), ahnhVar14.hF(), ahnhVar14.jL(), ahnhVar14.jl(), ahnhVar14.hg(), (bayb) ahknVar10.kx.b(), ahnhVar14.Y(), ahnhVar14.jO(), ahnhVar14.jW(), ahnhVar14.lN(), ahnhVar14.hz(), ahnhVar14.lG(), ahnhVar14.o());
            case 1930:
                ahkn ahknVar11 = this.a;
                return new ckcp((fcyh) ahknVar11.bM.b(), ahknVar11.a.am());
            case 1931:
                ahkn ahknVar12 = this.a;
                return new ckdn((fcyh) ahknVar12.bM.b(), ahknVar12.a.am());
            case 1932:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar15 = ahknVar13.a;
                return new cknx(ahnhVar15.HY, ahknVar13.iv, ahnhVar15.IP, ahnhVar15.oQ, ahnhVar15.tC, ahnhVar15.IQ);
            case 1933:
                return Optional.of((dnvi) this.a.a.IO.b());
            case 1934:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar16 = ahknVar14.a;
                return new dnvp(ahnhVar16.mj(), ahnhVar16.mh(), (dncj) ahnhVar16.IM.b(), (Context) ahknVar14.t.b());
            case 1935:
                ahkn ahknVar15 = this.a;
                dnea dneaVar = (dnea) ahknVar15.lr.b();
                dnfs dnfsVarMi = ahknVar15.a.mi();
                dneaVar.getClass();
                return dnfsVarMi.a(dneaVar);
            case 1936:
                return dnwl.a(this.a.a.mg());
            case 1937:
                final eyik eyikVar6 = this.a.a.oO;
                return new arxm() { // from class: arxb
                    @Override // defpackage.arxm
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.do_not_crash_emotify_reaction_when_missing_message");
                    }
                };
            case 1938:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar17 = ahknVar16.a;
                return new cknf(ahnhVar17.kp(), (egyt) ahknVar16.dj.b(), (egzh) ahknVar16.aQ.b(), (fdjx) ahnhVar17.m.b(), (ains) ahnhVar17.c.b());
            case 1939:
                return new ckyn(this.a.a.rF);
            case 1940:
                final eyik eyikVar7 = this.a.a.oO;
                return new ardm() { // from class: arbg
                    @Override // defpackage.ardm
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.enable_mention_annotations");
                    }
                };
            case 1941:
                final eyik eyikVar8 = this.a.a.oO;
                return new arxp() { // from class: arxg
                    @Override // defpackage.arxp
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.hide_unmatched_rcs_reactions");
                    }
                };
            case 1942:
                final eyik eyikVar9 = this.a.a.oO;
                return new arxq() { // from class: arxi
                    @Override // defpackage.arxq
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.log_missing_message_event_for_reactions");
                    }
                };
            case 1943:
                ahkn ahknVar17 = this.a;
                return new ahpw((fcyh) ahknVar17.bM.b(), ahknVar17.a.am());
            case 1944:
                ahkn ahknVar18 = this.a;
                eyik eyikVar10 = ahknVar18.ji;
                eyik eyikVar11 = ahknVar18.jh;
                ahnh ahnhVar18 = ahknVar18.a;
                return new cdpb(eyikVar10, eyikVar11, ahnhVar18.m, ahnhVar18.oS, ahknVar18.cA, ahknVar18.hR, ahnhVar18.vW, ahnhVar18.pb, ahnhVar18.IY, ahnhVar18.IZ, ahnhVar18.Ja, ahnhVar18.vU);
            case 1945:
                return new cdob(this.a.a.rF);
            case 1946:
                return Long.valueOf(fapp.a(this.a.a.oq()));
            case 1947:
                return Boolean.valueOf(fapq.a(this.a.a.oq()));
            case 1948:
                return new cavl(this.a.a.rF);
            case 1949:
                ahkn ahknVar19 = this.a;
                eosc eoscVar = (eosc) ahknVar19.aJ.b();
                ahnh ahnhVar19 = ahknVar19.a;
                return new assl(eoscVar, ahnhVar19.sL, (awhr) ahnhVar19.Jf.b(), ahnhVar19.dW());
            case 1950:
                ahnh ahnhVar20 = this.a.a;
                return ((awif) ahnhVar20.qq()).a(ahnhVar20.cU());
            case 1951:
                ahkn ahknVar20 = this.a;
                Context context3 = (Context) ahknVar20.t.b();
                ahnh ahnhVar21 = ahknVar20.a;
                return new cqmj(context3, (cqmp) ahnhVar21.Dt.b(), Optional.empty(), ahnhVar21.pR, ahnhVar21.pf);
            case 1952:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar22 = ahknVar21.a;
                return new cgpk(ahnhVar22.Ji, ahnhVar22.Jj, ahknVar21.lx, ahnhVar22.Jn, ahnhVar22.Jq, (arpr) ahnhVar22.Be.b(), ahnhVar22.Jr, ahknVar21.p, (asjn) ahnhVar22.vU.b(), ahnhVar22.cF(), ahnhVar22.cG());
            case 1953:
                ahnh ahnhVar23 = this.a.a;
                return new cgkj(ahnhVar23.m83if(), ahnhVar23.ie());
            case 1954:
                ahnh ahnhVar24 = this.a.a;
                return new cgrx((cgkj) ahnhVar24.Ji.b(), ahnhVar24.is());
            case 1955:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar25 = ahknVar22.a;
                return new cdoj(ahknVar22.cA, ahknVar22.bM, ahnhVar25.m, ahknVar22.ji, ahknVar22.cE, (anty) ahnhVar25.Ax.b(), (anvh) ahnhVar25.zK.b(), ahnhVar25.bu());
            case 1956:
                ahkn ahknVar23 = this.a;
                return new ueh(ahknVar23.a.Jl, ahknVar23.cD);
            case 1957:
                return new ajso(this.a.a.AB);
            case 1958:
                ahkn ahknVar24 = this.a;
                eyik eyikVar12 = ahknVar24.ly;
                ahnh ahnhVar26 = ahknVar24.a;
                return new akbq(eyikVar12, ahnhVar26.oS, ahknVar24.cA, ahknVar24.jh, ahknVar24.ji, ahnhVar26.zK, ahnhVar26.vX, ahnhVar26.Ax, ahnhVar26.qG, (ctce) ahnhVar26.yp.b(), ahnhVar26.Jo, (aptm) ahnhVar26.vV.b(), (asjn) ahnhVar26.vU.b(), ahnhVar26.cF(), ahnhVar26.cG(), (aofc) ahnhVar26.yD.b(), ahnhVar26.Jp, ahknVar24.cE);
            case 1959:
                ahkn ahknVar25 = this.a;
                return new cdml((aofc) ahknVar25.a.yD.b(), (fcyh) ahknVar25.bM.b());
            case 1960:
                return new aptl() { // from class: aozs
                };
            case 1961:
                return new cgqt(this.a.a.rF);
            case 1962:
                ahnh ahnhVar27 = this.a.a;
                return new coor(ahnhVar27.rc, ahnhVar27.uM, ahnhVar27.c, ahnhVar27.rl, ahnhVar27.Ec, ahnhVar27.xO, ahnhVar27.Jt);
            case 1963:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqzu() { // from class: aqxp
                    @Override // defpackage.aqzu
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.enable_unknown_content_type_logging");
                    }
                };
            case 1964:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar28 = ahknVar26.a;
                return new cmpv(ahnhVar28.Fd, ahnhVar28.Gm, ahnhVar28.yw, ahnhVar28.rl, ahnhVar28.sL, ahnhVar28.zP, ahknVar26.cl(), (fdjx) ahnhVar28.oQ.b(), ahnhVar28.pT);
            case 1965:
                ahnh ahnhVar29 = this.a.a;
                return new asrx(ahnhVar29.qr, (asrf) ahnhVar29.rl.b(), (dghj) ahnhVar29.rW.b(), ahnhVar29.pB);
            case 1966:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar30 = ahknVar27.a;
                return new ciwn(ahnhVar30.sj, ahnhVar30.Jx, (fcyh) ahknVar27.cA.b(), (fdjx) ahnhVar30.m.b());
            case 1967:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar31 = ahknVar28.a;
                return new baqs(ahnhVar31.sL, (alrj) ahnhVar31.qi.b(), (dghj) ahnhVar31.rW.b(), (bbdl) ahnhVar31.qG.b(), (fcyh) ahknVar28.cz.b(), (fdjx) ahnhVar31.oQ.b());
            case 1968:
                ahnh ahnhVar32 = this.a.a;
                return new awxu((awxo) ahnhVar32.sP.b(), (fdjx) ahnhVar32.m.b());
            case 1969:
                ahkn ahknVar29 = this.a;
                Context context4 = (Context) ahknVar29.t.b();
                ahnh ahnhVar33 = ahknVar29.a;
                return new asof(context4, ahnhVar33.sG, ahnhVar33.yw, ahknVar29.cQ, ahnhVar33.zP, ahnhVar33.sL, ahknVar29.aQ, ahnhVar33.uv, ahnhVar33.Js);
            case 1970:
                final eyik eyikVar14 = this.a.a.oO;
                return new aryl() { // from class: arxu
                    @Override // defpackage.aryl
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.file_immediate_delivery_reports_use_pipeline");
                    }
                };
            case 1971:
                ahkn ahknVar30 = this.a;
                return new aspa((eosc) ahknVar30.p.b(), (eosc) ahknVar30.y.b(), ahknVar30.a.JF, ahknVar30.ez);
            case 1972:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar34 = ahknVar31.a;
                return new aybx(ahnhVar34.zP, ahnhVar34.sL, ahnhVar34.JE, ahnhVar34.uJ, ahnhVar34.Jd, ahknVar31.cD, ahnhVar34.uI, ahnhVar34.DC, ahnhVar34.AM);
            case 1973:
                return new crhj(this.a.a.qq);
            case 1974:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar35 = ahknVar32.a;
                return new civx(ahnhVar35.JH, ahnhVar35.zP, ahnhVar35.uJ, ahnhVar35.ww, ahnhVar35.Jd, (cteb) ahnhVar35.Cz.b(), ahnhVar35.HG, (crtq) ahnhVar35.HI.b(), ahnhVar35.yw, ahnhVar35.Cd, (bbhh) ahnhVar35.HW.b(), (Optional) ahnhVar35.Co.b(), ahnhVar35.ei(), ahnhVar35.BI, ahnhVar35.gW(), (bbgy) ahnhVar35.JM.b(), (cggg) ahnhVar35.CB.b(), (bxlc) ahnhVar35.uI.b(), (bbfn) ahnhVar35.CF.b(), (cjnr) ahnhVar35.JN.b(), (ayfx) ahnhVar35.Mr.b(), (ayeo) ahnhVar35.MV.b(), (bveg) ahnhVar35.yx.b(), (dqsn) ahnhVar35.qq.b(), (civf) ahnhVar35.pU(), (bydb) ahnhVar35.IE.b(), ahnhVar35.Cp, (cmpq) ahnhVar35.Gm.b(), (asrh) ahnhVar35.Fd.b(), (asra) ahnhVar35.Fc.b(), ahnhVar35.Hf, ahnhVar35.IH, eyie.a(ahnhVar35.Jc), ahnhVar35.qi, ahknVar32.lw, ahnhVar35.Jg, (ains) ahnhVar35.pb.b(), ahnhVar35.pQ, ahnhVar35.zO, ahnhVar35.zS, ahnhVar35.Js, ahnhVar35.HP, ahnhVar35.MY, ahnhVar35.rl, ahnhVar35.qG, ahknVar32.jj, ahnhVar35.pD, ahknVar32.ld, ahnhVar35.Jv, ahnhVar35.sL, Optional.of(ahknVar32.bT()), ahnhVar35.MZ, ahnhVar35.mD(), ahnhVar35.Jx, ahnhVar35.sj, ahnhVar35.EN, ahnhVar35.FL, ahnhVar35.sJ, ahnhVar35.sP, ahnhVar35.bo(), ahnhVar35.Gi, (fdjx) ahnhVar35.oS.b(), (fdjx) ahnhVar35.m.b(), ahnhVar35.Gx, (aqoc) ahnhVar35.MW.b(), ahnhVar35.Na, ahnhVar35.Nb, ahnhVar35.Nc, ahknVar32.lk, ahknVar32.ii, (arph) ahnhVar35.ES.b(), ahnhVar35.Nd);
            case 1975:
                final eyik eyikVar15 = this.a.a.oO;
                return new aqta() { // from class: aqrh
                    @Override // defpackage.aqta
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.fix_incoming_rcs_group_message_use_receiver_identity");
                    }
                };
            case 1976:
                final eyik eyikVar16 = this.a.a.oO;
                return new aprl() { // from class: aowo
                    @Override // defpackage.aprl
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.defer_sync_to_telephony_incoming_rcs_text_message");
                    }
                };
            case 1977:
                return new cawa(this.a.a.rF);
            case 1978:
                ahkn ahknVar33 = this.a;
                return new bbgy((Context) ahknVar33.t.b(), (baii) ahknVar33.a.JK.b());
            case 1979:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar36 = ahknVar34.a;
                eyik eyikVar17 = ahnhVar36.Dv;
                eyik eyikVar18 = ahknVar34.t;
                eyik eyikVar19 = ahnhVar36.Dt;
                eyik eyikVar20 = ahnhVar36.wF;
                eyik eyikVar21 = ahknVar34.ic;
                eyik eyikVar22 = ahnhVar36.un;
                eyik eyikVar23 = ahknVar34.eB;
                eyik eyikVar24 = ahknVar34.eC;
                eyik eyikVar25 = ahnhVar36.um;
                eyik eyikVar26 = ahnhVar36.JK;
                return new baii(eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, ahnhVar36.xi, ahknVar34.cD, ahknVar34.gF, ahknVar34.lA, ahknVar34.kd, ahknVar34.lB, ahknVar34.y, ahnhVar36.Dk, ahnhVar36.Dn, ahnhVar36.JL, eyikVar26, eyikVar26, eyikVar26, eyikVar26, eyikVar26, eyikVar26, eyikVar26, eyikVar26);
            case 1980:
                final eyik eyikVar27 = this.a.a.oO;
                return new aqbx() { // from class: aplz
                    @Override // defpackage.aqbx
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.update_message_core_data_adds_preserve_size");
                    }
                };
            case 1981:
                ahnh ahnhVar37 = this.a.a;
                bxoz bxozVar = (bxoz) ahnhVar37.Mq.b();
                dqsn dqsnVar = (dqsn) ahnhVar37.qq.b();
                bahv bahvVar = (bahv) ahnhVar37.un.b();
                eyik eyikVar28 = ahnhVar37.Jh;
                return new ayfx(bxozVar, dqsnVar, bahvVar, eyikVar28);
            case 1982:
                return new bxoz(this.a.a.fu());
            case 1983:
                ahkn ahknVar35 = this.a;
                return duvg.a((Context) ahknVar35.t.b(), (Executor) ahknVar35.jB.b(), (Class) ahknVar35.lC.b(), (ejxr) ahknVar35.a.JO.b(), (duup) ahknVar35.jC.b());
            case 1984:
                ahkn ahknVar36 = this.a;
                final Context context5 = (Context) ahknVar36.t.b();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ahknVar36.aJ.b();
                final ecev ecevVar = (ecev) ahknVar36.jF.b();
                final eygg eyggVarA = eyie.a(ahknVar36.a.tU);
                final duup duupVar = (duup) ahknVar36.jC.b();
                return new ejxr() { // from class: duvf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        dtzx dtzxVar = new dtzx(scheduledExecutorService, 2);
                        CronetEngine cronetEngine = (CronetEngine) eyggVarA.b();
                        cronetEngine.getClass();
                        dxek dxekVar = new dxek(new dxej(cronetEngine));
                        Context context6 = context5;
                        dxfd dxfdVar = new dxfd(dxekVar, context6, dtzxVar);
                        dxfdVar.h(duupVar);
                        return new dtzv(context6, dxfdVar, dxekVar, ecevVar, dtzxVar);
                    }
                };
            case 1985:
                ahkn ahknVar37 = this.a;
                return new bxqa((fdjx) ahknVar37.a.m.b(), (cqtp) ahknVar37.dK.b());
            case 1986:
                return ekgp.l("application/pdf", this.a.a.fv());
            case 1987:
                return esuz.a(this.a.a.mT());
            case 1988:
                ahkn ahknVar38 = this.a;
                return esug.a(ahknVar38.lH.b(), (fbrv) ahknVar38.a.Ml.b(), ejwi.j((List) ahknVar38.me.b()));
            case 1989:
                final eygg eyggVarA2 = eyie.a(this.a.a.Mk);
                eyggVarA2.getClass();
                return new esud(new ejxr() { // from class: esuf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return (fbsj) eyggVarA2.b();
                    }
                });
            case 1990:
                ahkn ahknVar39 = this.a;
                return esuh.a(ahknVar39.lH.b(), (fbpc) ahknVar39.a.Mj.b(), ejwi.j((List) ahknVar39.md.b()));
            case 1991:
                ahkn ahknVar40 = this.a;
                return esuw.a((Map) ahknVar40.a.Mi.b(), (eigp) ahknVar40.aI.b());
            case 1992:
                ekgi ekgiVarH = ekgp.h(10);
                ahkn ahknVar41 = this.a;
                ahnh ahnhVar38 = ahknVar41.a;
                ekgiVarH.i("google.internal.communications.instantmessaging.v1.Messaging", ahnhVar38.Kh);
                ekgiVarH.i("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", ahnhVar38.KK);
                ekgiVarH.i("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", ahnhVar38.Lu);
                ekgiVarH.i("bugle.PersistentMessagingProxyNotificationService", ahnhVar38.LO);
                ekgiVarH.i("com.google.android.apps.restore.osmigration.systemappapi.TargetService", ahnhVar38.LR);
                ekgiVarH.i("bugle.smapi.rcs.PdfFilePreviewGeneratorService", ahknVar41.lY);
                ekgiVarH.i("stargate.DatagramNotificationService", ahnhVar38.LS);
                ekgiVarH.i("bugle.smapi.rcs.MessagingEngineNotificationService", ahnhVar38.Mg);
                ekgiVarH.i("bugle.smapi.rcs.MessagingEngineService", ahknVar41.mc);
                ekgiVarH.i("stargate.SatelliteSessionStateNotificationService", ahnhVar38.Mh);
                return ekgiVarH.c();
            case 1993:
                final cftw cftwVarIa = this.a.a.ia();
                return new fbmx() { // from class: cftx
                    @Override // defpackage.fbmx
                    public final fbst n() {
                        return fbsq.a(cftwVarIa, cftz.a);
                    }
                };
            case 1994:
                return new cftq(this.a.a.ic());
            case 1995:
                ahnh ahnhVar39 = this.a.a;
                return new cfvm(ahnhVar39.JU, ahnhVar39.JX, ahnhVar39.Ka);
            case 1996:
                ahnh ahnhVar40 = this.a.a;
                return new cfwc(ahnhVar40.oS, ahnhVar40.JR, ahnhVar40.JS, ahnhVar40.JT);
            case 1997:
                return Long.valueOf(favu.a(this.a.a.oW()));
            case 1998:
                return favt.a(this.a.a.oW());
            case 1999:
                return favv.a(this.a.a.oW());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        int i = this.b;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45637163").e());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45637164").e());
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45685931").e());
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45676568").e());
            case 204:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45671629").e());
            case 205:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45688969").e());
            case 206:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45625479").e());
            case 207:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45650212").e());
            case 208:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45689920").e());
            case 209:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45676032").e());
            case 210:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45632215").e());
            case 211:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45633417").e());
            case 212:
                return Boolean.valueOf(this.a.a.mY().e());
            case 213:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45650344").e());
            case 214:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45689822").e());
            case 215:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45686152").e());
            case 216:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45674598").e());
            case 217:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45415847").e());
            case 218:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45675125").e());
            case 219:
                return Boolean.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45637903").e());
            case 220:
                return Boolean.valueOf(fafd.a(this.a.a.mX()));
            case 221:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45650919").e());
            case 222:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45658762").e());
            case 223:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45687786").e());
            case 224:
                return Boolean.valueOf(((ehdm) this.a.a.oE().a.b()).a("com.google.android.apps.messaging.auto", "45427640").e());
            case 225:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45681235").e());
            case 226:
                return Boolean.valueOf(this.a.a.mZ().d());
            case 227:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45657345").e());
            case 228:
                return Boolean.valueOf(this.a.a.mY().f());
            case 229:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45643593").e());
            case 230:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45667935").e());
            case 231:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45685123").e());
            case 232:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45685321").e());
            case 233:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45696693").e());
            case 234:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45691444").e());
            case 235:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45684803").e());
            case 236:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45692656").e());
            case 237:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45687111").e());
            case 238:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45693154").e());
            case 239:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45632928").e());
            case 240:
                return Boolean.valueOf(((ehdm) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto", "45662039").e());
            case 241:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45687949").e());
            case 242:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45697276").e());
            case 243:
                return Boolean.valueOf(((ehdm) this.a.a.oh().a.b()).a("com.google.android.apps.messaging.auto", "45666895").e());
            case 244:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45696743").e());
            case 245:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45697020").e());
            case 246:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45673296").e());
            case 247:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45685259").e());
            case 248:
                return Boolean.valueOf(((ehdm) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto", "45691947").e());
            case 249:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45686153").e());
            case 250:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45682992").e());
            case 251:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45623236").e());
            case 252:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45667771").e());
            case 253:
                return Boolean.valueOf(this.a.a.mY().g());
            case 254:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45598663").e());
            case 255:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45630027").e());
            case 256:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45688127").e());
            case 257:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45689556").e());
            case 258:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45531190").e());
            case 259:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45684639").e());
            case 260:
                return Boolean.valueOf(((ehdm) this.a.a.oh().a.b()).a("com.google.android.apps.messaging.auto", "45666892").e());
            case 261:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45684235").e());
            case 262:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45628146").e());
            case 263:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45676724").e());
            case 264:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45637166").e());
            case 265:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45667515").e());
            case 266:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45411113").e());
            case 267:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45679695").e());
            case 268:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45692786").e());
            case 269:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45668167").e());
            case 270:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45690779").e());
            case 271:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45632014").e());
            case 272:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45684095").e());
            case 273:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45678431").e());
            case 274:
                return Boolean.valueOf(((ehdm) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto", "45670383").e());
            case 275:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45696821").e());
            case 276:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45693819").e());
            case 277:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45696798").e());
            case 278:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45692205").e());
            case 279:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45694648").e());
            case 280:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45666529").e());
            case 281:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45687616").e());
            case 282:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45425915").e());
            case 283:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45692995").e());
            case 284:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45687313").e());
            case 285:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45682191").e());
            case 286:
                return Boolean.valueOf(this.a.a.mY().h());
            case 287:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45693280").e());
            case 288:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45682420").e());
            case 289:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45680277").e());
            case 290:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45626130").e());
            case 291:
                return Boolean.valueOf(((ehdm) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto", "45662038").e());
            case 292:
                return Boolean.valueOf(((ehdm) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto", "45614170").e());
            case 293:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45676261").e());
            case 294:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45665077").e());
            case 295:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45693453").e());
            case 296:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45691669").e());
            case 297:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45694367").e());
            case 298:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45669129").e());
            case 299:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45691106").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        int i = this.b;
        switch (i) {
            case 2000:
                return new cfth(this.a.a.JW);
            case 2001:
                fbnd fbndVar = (fbnd) this.a.a.JV.b();
                fbndVar.getClass();
                return new cftd(fbndVar, fbnc.a);
            case 2002:
                fbnd fbndVarA = this.a.a.mT().a("main", new fbud(), fbub.a, false);
                fbndVarA.getClass();
                return fbndVarA;
            case 2003:
                ahnh ahnhVar = this.a.a;
                return new cfvy(ahnhVar.JZ, ahnhVar.oQ);
            case 2004:
                ahkn ahknVar = this.a;
                ConnectivityManager connectivityManager = (ConnectivityManager) ahknVar.dO.b();
                ahnh ahnhVar2 = ahknVar.a;
                return new cfws(connectivityManager, (fdjx) ahnhVar2.oQ.b(), ahnhVar2.JY);
            case 2005:
                return Long.valueOf(((ehdm) this.a.a.oW().a.b()).a("com.google.android.apps.messaging.auto", "45686596").b());
            case 2006:
                ahnh ahnhVar3 = this.a.a;
                return new cfuu(ahnhVar3.m, ahnhVar3.Kc, ahnhVar3.Kd, ahnhVar3.Ke);
            case 2007:
                ahnh ahnhVar4 = this.a.a;
                return new cfvf(ahnhVar4.mV(), ahnhVar4.ib());
            case 2008:
                return (evrj) ((ehdm) this.a.a.oW().a.b()).a("com.google.android.apps.messaging.auto", "45680599").c();
            case 2009:
                return (evrj) ((ehdm) this.a.a.oW().a.b()).a("com.google.android.apps.messaging.auto", "45681536").c();
            case 2010:
                final tbe tbeVarX = this.a.a.x();
                return new fbmx() { // from class: tbo
                    @Override // defpackage.fbmx
                    public final fbst n() {
                        return fbsq.a(tbeVarX, dbwd.b);
                    }
                };
            case 2011:
                final eyik eyikVar = this.a.a.oO;
                return new apvd() { // from class: apcj
                    @Override // defpackage.apvd
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_improved_d2d_for_backup_and_restore");
                    }
                };
            case 2012:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45620681").b());
            case 2013:
                return Double.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45620682").a());
            case 2014:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45623087").b());
            case 2015:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45620757").b());
            case 2016:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar5 = ahknVar2.a;
                return new aysi(ahnhVar5.Kq, ahnhVar5.Kr, ahnhVar5.qq, (Context) ahknVar2.t.b(), (fdjx) ahnhVar5.oS.b(), ahnhVar5.Kx, ahnhVar5.ex(), (ayrn) ahknVar2.lJ.b(), ahnhVar5.bB(), ahnhVar5.cc(), ahnhVar5.Kz, ahnhVar5.Kl, ahnhVar5.ae(), ahnhVar5.KA, ahnhVar5.KB);
            case 2017:
                aytf aytfVar = (aytf) this.a.a.Kp.b();
                aytfVar.getClass();
                return aytfVar.a;
            case 2018:
                ayte ayteVar = new ayte(azrv.a);
                azuu azuuVar = new azuu();
                ayte ayteVar2 = new ayte(ayzi.a);
                ayuv ayuvVar = new ayuv();
                ayte ayteVar3 = new ayte(azld.a);
                ayte ayteVar4 = new ayte(aznt.a);
                ahkn ahknVar3 = this.a;
                azqp azqpVarBv = ahknVar3.bv();
                ayte ayteVar5 = new ayte(aywc.a);
                ayte ayteVar6 = new ayte(azfj.a);
                ayte ayteVar7 = new ayte(azdy.a);
                ayte ayteVar8 = new ayte(azgm.a);
                ayte ayteVar9 = new ayte(azbf.a);
                ayte ayteVar10 = new ayte(azch.a);
                ayte ayteVar11 = new ayte(azpi.a);
                ahnh ahnhVar6 = ahknVar3.a;
                return new aytf(ayteVar, azuuVar, ayteVar2, ayuvVar, ayteVar3, ayteVar4, azqpVarBv, ayteVar5, ayteVar6, ayteVar7, ayteVar8, ayteVar9, ayteVar10, ayteVar11, (arjm) ahnhVar6.Kn.b(), (arjn) ahnhVar6.Ko.b(), ahnhVar6.cc());
            case 2019:
                final eyik eyikVar2 = this.a.a.oO;
                return new arjm() { // from class: arip
                    @Override // defpackage.arjm
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.restore_message_captions");
                    }
                };
            case 2020:
                final eyik eyikVar3 = this.a.a.oO;
                return new arjn() { // from class: arir
                    @Override // defpackage.arjn
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.restore_read_reports");
                    }
                };
            case 2021:
                aytf aytfVar2 = (aytf) this.a.a.Kp.b();
                aytfVar2.getClass();
                List list = aytfVar2.b;
                list.getClass();
                return list;
            case 2022:
                ahkn ahknVar4 = this.a;
                eyik eyikVar4 = ahknVar4.cD;
                ahnh ahnhVar7 = ahknVar4.a;
                return new aysy(ahnhVar7.Kt, ahnhVar7.Ku, (cogw) eyikVar4.b(), ahnhVar7.ae());
            case 2023:
                return new dqrc(this.a.a.Ks);
            case 2024:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45639089").b());
            case 2025:
                final eyik eyikVar5 = this.a.a.oO;
                return new arji() { // from class: arih
                    @Override // defpackage.arji
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.log_restore_workflow_logs_to_file");
                    }
                };
            case 2026:
                ahkn ahknVar5 = this.a;
                ahzw ahzwVarRY = ahknVar5.a.rY();
                Context context = (Context) ahknVar5.t.b();
                eosc eoscVar = (eosc) ahknVar5.y.b();
                context.getClass();
                eoscVar.getClass();
                return new eksp(new ekuj(context, eoscVar, ahzwVarRY));
            case 2027:
                final eyik eyikVar6 = this.a.a.oO;
                return new arjc() { // from class: arhv
                    @Override // defpackage.arjc
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.local_bnr_pseudonymous_logging");
                    }
                };
            case 2028:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45626505").b());
            case 2029:
                return Boolean.valueOf(((ehdm) this.a.a.nQ().a.b()).a("com.google.android.apps.messaging.auto", "45689639").e());
            case 2030:
                final eyik eyikVar7 = this.a.a.oO;
                return new arjg() { // from class: arid
                    @Override // defpackage.arjg
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.log_detailed_backup_reasons");
                    }
                };
            case 2031:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar8 = ahknVar6.a;
                return new tbn(ahnhVar8.KD, (fdjx) ahnhVar8.m.b(), (fcyh) ahknVar6.cA.b(), (dhhc) ahnhVar8.sa.b(), (cogw) ahknVar6.cD.b(), ahnhVar8.KE);
            case 2032:
                ahnh ahnhVar9 = this.a.a;
                return new tcd(ahnhVar9.uz, ahnhVar9.uA, (fdjx) ahnhVar9.oQ.b(), ahnhVar9.Ky);
            case 2033:
                final eyik eyikVar8 = this.a.a.oO;
                return new aqls() { // from class: aqll
                    @Override // defpackage.aqls
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.use_session_id_from_request_for_get_item_log");
                    }
                };
            case 2034:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45633091").b());
            case 2035:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45633090").b());
            case 2036:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45647766").b());
            case 2037:
                ahkn ahknVar7 = this.a;
                return new tbt(ahknVar7.a.qK, (fcyh) ahknVar7.cA.b());
            case 2038:
                final aice aiceVarAg = this.a.a.ag();
                return new fbmx() { // from class: aicg
                    @Override // defpackage.fbmx
                    public final fbst n() {
                        return fbsq.a(aiceVarAg, dbwd.b);
                    }
                };
            case 2039:
                ahkn ahknVar8 = this.a;
                Context context2 = (Context) ahknVar8.t.b();
                cogw cogwVar = (cogw) ahknVar8.cD.b();
                ahnh ahnhVar10 = ahknVar8.a;
                return new ahtm(context2, cogwVar, ahnhVar10.KQ, ahnhVar10.KR, ahnhVar10.KS, ahnhVar10.KT, ahnhVar10.qq, (ahzv) ahnhVar10.KP.b());
            case 2040:
                ahkn ahknVar9 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar9.cA.b();
                eyik eyikVar9 = ahknVar9.cD;
                ahnh ahnhVar11 = ahknVar9.a;
                return new ahwd(fcyhVar, ahnhVar11.qq, (cogw) eyikVar9.b(), (fdjx) ahnhVar11.m.b(), (Context) ahknVar9.t.b(), ahnhVar11.KL, ahnhVar11.KM, ahnhVar11.KN, (fdjx) ahnhVar11.oS.b(), (awgx) ahknVar9.lK.b(), ahnhVar11.KO, (ahzv) ahnhVar11.KP.b());
            case 2041:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45634061").b());
            case 2042:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45634380").b());
            case 2043:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45643860").b());
            case 2044:
                final eyik eyikVar10 = this.a.a.oO;
                return new arjl() { // from class: arin
                    @Override // defpackage.arjl
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.restore_attachment_metadata_in_files");
                    }
                };
            case 2045:
                ahnh ahnhVar12 = this.a.a;
                arji arjiVar = (arji) ahnhVar12.Kv.b();
                eksp ekspVar = (eksp) ahnhVar12.Kw.b();
                arjiVar.getClass();
                ekspVar.getClass();
                return new ahzv(ekspVar, "BugleRestore", arjiVar.a());
            case 2046:
                final eyik eyikVar11 = this.a.a.oO;
                return new apve() { // from class: apcl
                    @Override // defpackage.apve
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.require_app_update_for_d2d_restore");
                    }
                };
            case 2047:
                ahkn ahknVar10 = this.a;
                return new ahtt((awgx) ahknVar10.lL.b(), ahknVar10.a.KQ);
            case 2048:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45678039").b());
            case 2049:
                ahnh ahnhVar13 = this.a.a;
                return ahzm.a(ahnhVar13.qZ(), ((Long) ahnhVar13.Kl.b()).longValue(), ahnhVar13.aa(), ahnhVar13.cd(), ahnhVar13.Lo);
            case 2050:
                ahnh ahnhVar14 = this.a.a;
                return new aibb((cazj) ahnhVar14.rF.b(), (ahzv) ahnhVar14.KP.b());
            case 2051:
                return this.a.a.ey();
            case 2052:
                return new arjk() { // from class: aril
                };
            case 2053:
                return new axsq(this.a.a.wK);
            case 2054:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar15 = ahknVar11.a;
                return new azyy(ahnhVar15.oS, ahnhVar15.KZ, ahknVar11.lO, ahnhVar15.La, ahnhVar15.Lb, ahnhVar15.KO, ahnhVar15.Lc, ahnhVar15.Kn, ahnhVar15.Ko);
            case 2055:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar16 = ahknVar12.a;
                return new azxk(ahnhVar16.ww, ahnhVar16.sL, (dqsn) ahnhVar16.qq.b(), (fcyh) ahknVar12.cA.b(), ahnhVar16.KY, ahnhVar16.KO);
            case 2056:
                final eyik eyikVar12 = this.a.a.oO;
                return new arjp() { // from class: ariv
                    @Override // defpackage.arjp
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.track_refreshed_conversations_in_refresher");
                    }
                };
            case 2057:
                return new aqlp() { // from class: aqlg
                };
            case 2058:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqlq() { // from class: aqli
                    @Override // defpackage.aqlq
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.restore_link_preview_table_during_d2_d");
                    }
                };
            case 2059:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45678988").b());
            case 2060:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45625892").b());
            case 2061:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45625893").b());
            case 2062:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45625894").b());
            case 2063:
                final eyik eyikVar14 = this.a.a.oO;
                return new arjh() { // from class: arif
                    @Override // defpackage.arjh
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.log_restore_table_failed");
                    }
                };
            case 2064:
                ahkn ahknVar13 = this.a;
                eyik eyikVar15 = ahknVar13.cD;
                ahnh ahnhVar17 = ahknVar13.a;
                return new ahwi(ahnhVar17.Lj, (cogw) eyikVar15.b(), (fdjx) ahnhVar17.oQ.b());
            case 2065:
                ahnh ahnhVar18 = this.a.a;
                return new ahwo(ahnhVar18.uz, ahnhVar18.uA, (fdjx) ahnhVar18.oQ.b(), ahnhVar18.Ky, ahnhVar18.La);
            case 2066:
                ahnh ahnhVar19 = this.a.a;
                return new ahya(ahnhVar19.KQ, (ahzv) ahnhVar19.KP.b());
            case 2067:
                ahkn ahknVar14 = this.a;
                eyik eyikVar16 = ahknVar14.cA;
                ahnh ahnhVar20 = ahknVar14.a;
                eyik eyikVar17 = ahnhVar20.KQ;
                eyik eyikVar18 = ahnhVar20.KV;
                eyik eyikVar19 = ahnhVar20.KU;
                eyik eyikVar20 = ahnhVar20.Li;
                eyik eyikVar21 = ahnhVar20.Lm;
                eyik eyikVar22 = ahnhVar20.sG;
                fcyh fcyhVar2 = (fcyh) eyikVar16.b();
                eyik eyikVar23 = ahnhVar20.KR;
                eyik eyikVar24 = ahnhVar20.Lk;
                fdjx fdjxVar = (fdjx) ahnhVar20.oQ.b();
                ahzk ahzkVar = new ahzk();
                eyik eyikVar25 = ahnhVar20.Ll;
                eyik eyikVar26 = ahnhVar20.KS;
                eyik eyikVar27 = ahnhVar20.Lh;
                awgt awgtVarAI = ahknVar14.aI();
                eyik eyikVar28 = ahnhVar20.Ln;
                final eyik eyikVar29 = ahnhVar20.oO;
                return new ahzi(eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, fcyhVar2, eyikVar23, eyikVar24, fdjxVar, ahzkVar, eyikVar25, eyikVar26, eyikVar27, awgtVarAI, eyikVar28, new arjq() { // from class: arix
                    @Override // defpackage.arjq
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.use_mutex_for_require_app_update");
                    }
                }, ahnhVar20.ce(), ahnhVar20.Dj, ahnhVar20.La, (ahzv) ahnhVar20.KP.b());
            case 2068:
                final eyik eyikVar30 = this.a.a.oO;
                return new arjf() { // from class: arib
                    @Override // defpackage.arjf
                    public final boolean a() {
                        return ((eoth) eyikVar30.b()).a("bugle.log_better_counts_after_restore");
                    }
                };
            case 2069:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45677989").b());
            case 2070:
                ahkn ahknVar15 = this.a;
                return new aicf(ahknVar15.a.KD, (cogw) ahknVar15.cD.b());
            case 2071:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45650000").b());
            case 2072:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45650002").b());
            case 2073:
                return new aick(this.a.a.af());
            case 2074:
                return this.a.a.hZ();
            case 2075:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar21 = ahknVar16.a;
                return new cdcd((ains) ahnhVar21.c.b(), ahknVar16.lP, ahnhVar21.FP, eyie.a(ahnhVar21.xd), (Optional) ahknVar16.hZ.b(), eyie.a(ahnhVar21.xj), (Optional) ahnhVar21.FQ.b(), (eosc) ahknVar16.y.b());
            case 2076:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar22 = ahknVar17.a;
                return new cdcv((Map) ahnhVar22.Ly.b(), ahnhVar22.hs(), (ains) ahnhVar22.c.b(), eyie.a(ahnhVar22.Lz), Optional.of(new abfd(ahnhVar22.a.dz, (abfq) ahnhVar22.LD.b(), ahnhVar22.LE, ahnhVar22.m)), (caxe) ahnhVar22.FF.b(), (cdio) ahknVar17.dh.b(), (eosc) ahknVar17.y.b());
            case 2077:
                ahnh ahnhVar23 = this.a.a;
                return ekgp.m("CMS", (cfic) ahnhVar23.Lx.b(), "GDitto", ahnhVar23.hS());
            case 2078:
                ahkn ahknVar18 = this.a;
                Context context3 = (Context) ahknVar18.t.b();
                eosc eoscVar2 = (eosc) ahknVar18.y.b();
                ahnh ahnhVar24 = ahknVar18.a;
                return new cfib(context3, eoscVar2, (axlf) ahnhVar24.Lw.b(), (axky) ahnhVar24.HN.b(), ahnhVar24.wc, ahnhVar24.vT, ahnhVar24.DX);
            case 2079:
                ahnh ahnhVar25 = this.a.a;
                return new axlf((axky) ahnhVar25.HN.b(), (egej) ahnhVar25.pI.b());
            case 2080:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar26 = ahknVar19.a;
                return new cdco((ains) ahnhVar26.c.b(), ahknVar19.lP, ahnhVar26.FP, eyie.a(ahnhVar26.xd), (Optional) ahknVar19.hZ.b(), ahnhVar26.wa, (eosc) ahknVar19.y.b());
            case 2081:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar27 = ahknVar20.a;
                return new abfq((ains) ahnhVar27.c.b(), (cdbq) ahnhVar27.th.b(), ahknVar20.dz, (aboe) ahnhVar27.LC.b(), (abpk) ahnhVar27.LB.b(), (eosc) ahknVar20.p.b(), (abdy) ahknVar20.lV.b(), ahnhVar27.LA);
            case 2082:
                ahkn ahknVar21 = this.a;
                return new aboe(ahknVar21.a.LB, ahknVar21.lV, ahknVar21.p);
            case 2083:
                ahkn ahknVar22 = this.a;
                cqtx cqtxVarCM = ahknVar22.cM();
                eosd eosdVar = (eosd) ahknVar22.p.b();
                eyik eyikVar31 = ahknVar22.aI;
                ahnh ahnhVar28 = ahknVar22.a;
                return new abpk(cqtxVarCM, eosdVar, ahnhVar28.G(), ahnhVar28.LA, (eigp) eyikVar31.b());
            case 2084:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar29 = ahknVar23.a;
                return new abdq((bvir) ahnhVar29.FN.b(), (Optional) ahknVar23.lU.b(), ahknVar23.cI, ahnhVar29.qY, (eosc) ahknVar23.p.b(), (eosc) ahknVar23.y.b());
            case 2085:
                ahkn ahknVar24 = this.a;
                eosc eoscVar3 = (eosc) ahknVar24.p.b();
                eyik eyikVar32 = ahknVar24.dj;
                ahnh ahnhVar30 = ahknVar24.a;
                return new abgv(eoscVar3, ahnhVar30.qK, ahknVar24.dz, (egyt) eyikVar32.b(), eyie.a(ahnhVar30.vY));
            case 2086:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar31 = ahknVar25.a;
                return new cddx((ains) ahnhVar31.c.b(), eyie.a(ahnhVar31.tJ), (Optional) ahnhVar31.FQ.b(), ahnhVar31.hs(), ahnhVar31.hr(), ahnhVar31.LH, ahnhVar31.sh, ahknVar25.lW, (awlc) ahnhVar31.LL.b(), ahnhVar31.LM);
            case 2087:
                final eyik eyikVar33 = this.a.a.oO;
                return new aqsb() { // from class: aqpl
                    @Override // defpackage.aqsb
                    public final boolean a() {
                        return ((eoth) eyikVar33.b()).a("bugle.dsdr_fix_tachygram_channel_bind");
                    }
                };
            case 2088:
                ahkn ahknVar26 = this.a;
                return new cgam(ahknVar26.a.qr, (cogw) ahknVar26.cD.b(), ahknVar26.lk, (eosc) ahknVar26.y.b());
            case 2089:
                ahnh ahnhVar32 = this.a.a;
                return new awlc(ahnhVar32.LK, (fdjx) ahnhVar32.m.b());
            case 2090:
                return new ekph((cdce) this.a.a.LJ.b());
            case 2091:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar33 = ahknVar27.a;
                return new chbr((chbc) ahnhVar33.LI.b(), (awgx) ahknVar27.lX.b(), ahknVar27.cD, (fdjx) ahnhVar33.m.b());
            case 2092:
                ahkn ahknVar28 = this.a;
                return new chbc(ahknVar28.cg(), (fdjx) ahknVar28.a.oS.b());
            case 2093:
                final eyik eyikVar34 = this.a.a.oO;
                return new aryk() { // from class: arxs
                    @Override // defpackage.aryk
                    public final boolean a() {
                        return ((eoth) eyikVar34.b()).a("bugle.enable_rcs_receiving_pipeline");
                    }
                };
            case 2094:
                final aics aicsVarAh = this.a.a.ah();
                return new fbmx() { // from class: aict
                    @Override // defpackage.fbmx
                    public final fbst n() {
                        esup esupVar = dbcm.a;
                        return fbsq.a(aicsVarAh, dbcm.a);
                    }
                };
            case 2095:
                return Long.valueOf(((ehdm) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto", "45694820").b());
            case 2096:
                ahkn ahknVar29 = this.a;
                return new aico(ahknVar29.a.qK, (fcyh) ahknVar29.cA.b());
            case 2097:
                ahkn ahknVar30 = this.a;
                return new clkk((fcyh) ahknVar30.bM.b(), ahknVar30.a.jZ(), (cogw) ahknVar30.cD.b());
            case 2098:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar34 = ahknVar31.a;
                return new cizr(ahnhVar34.LW, ahnhVar34.LX, ahnhVar34.LY, ahnhVar34.LZ, ahnhVar34.Ma, ahnhVar34.Mb, ahnhVar34.Mc, ahnhVar34.EQ, ahnhVar34.jv(), new cjek(), ahnhVar34.Me, ahnhVar34.Mf, ahknVar31.mb, (eosc) ahknVar31.y.b(), (eosc) ahknVar31.p.b());
            case 2099:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar35 = ahknVar32.a;
                return new cjnd((cjmt) ahnhVar35.pZ(), ahnhVar35.js(), (eosc) ahknVar32.p.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        int i = this.b;
        switch (i) {
            case 2100:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                return new cejp(ahnhVar.uu, ahnhVar.pR, ahnhVar.pf, ahnhVar.LT, (eosc) ahknVar.aJ.b(), ahnhVar.sj);
            case 2101:
                ahnh ahnhVar2 = this.a.a;
                return allw.a(ahnhVar2.pY, ahnhVar2.qe, ahnhVar2.pZ, ahnhVar2.qg, (alpc) ahnhVar2.py.b());
            case 2102:
                final eyik eyikVar = this.a.a.oO;
                return new aqte() { // from class: aqrp
                    @Override // defpackage.aqte
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.remove_msisdn_accessor_in_group_event_emitter");
                    }
                };
            case 2103:
                ahkn ahknVar2 = this.a;
                return new cjna((cjmt) ahknVar2.a.pY(), (eosc) ahknVar2.p.b());
            case 2104:
                ahkn ahknVar3 = this.a;
                return new cjml((eosc) ahknVar3.p.b(), (cjmt) ahknVar3.a.pW());
            case 2105:
                ahkn ahknVar4 = this.a;
                return new cjmh((eosc) ahknVar4.p.b(), (cjmt) ahknVar4.a.pV());
            case 2106:
                ahkn ahknVar5 = this.a;
                return new cjmx((eosc) ahknVar5.p.b(), (cjmt) ahknVar5.a.pX());
            case 2107:
                ahkn ahknVar6 = this.a;
                return new cjnj((eosc) ahknVar6.p.b(), (cjmt) ahknVar6.a.qb());
            case 2108:
                ahkn ahknVar7 = this.a;
                return new cjng((eosc) ahknVar7.p.b(), (cjmt) ahknVar7.a.qa());
            case 2109:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqtb() { // from class: aqrj
                    @Override // defpackage.aqtb
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.omit_rcs_msisdn_accessor_on_message_received");
                    }
                };
            case 2110:
                return new cjea(this.a.a.LU);
            case 2111:
                ahnh ahnhVar3 = this.a.a;
                return new cjdw(ahnhVar3.pT, ahnhVar3.LU);
            case 2112:
                ahkn ahknVar8 = this.a;
                return new clkn((fcyh) ahknVar8.bM.b(), ahknVar8.a.jZ());
            case 2113:
                return new arvk() { // from class: arux
                };
            case 2114:
                ahnh ahnhVar4 = this.a.a;
                return new ayeo(ahnhVar4.MU, ahnhVar4.BI);
            case 2115:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar5 = ahknVar9.a;
                return new ayez(ahnhVar5.uJ, (crbb) ahnhVar5.Cb.b(), (cray) ahnhVar5.Mv.b(), ahnhVar5.Cc, ahnhVar5.ep(), (eosc) ahknVar9.p.b(), (eosc) ahknVar9.y.b(), (axpa) ahnhVar5.MT.b());
            case 2116:
                ahkn ahknVar10 = this.a;
                Context context = (Context) ahknVar10.t.b();
                ahnh ahnhVar6 = ahknVar10.a;
                return new crgd(context, ahnhVar6.Cb, ahnhVar6.Ho, ahnhVar6.BH, ahnhVar6.BQ, (fcyh) ahknVar10.cA.b(), (eosc) ahknVar10.p.b(), (fcyh) ahknVar10.cz.b(), (fcyh) ahknVar10.bM.b(), (fdjx) ahnhVar6.m.b(), ahnhVar6.Bz, ahnhVar6.vh, ahknVar10.aN, ahnhVar6.tf, (crau) ahknVar10.mg.b(), ahnhVar6.Ms, ahknVar10.mh, (cogw) ahknVar10.cD.b(), ahnhVar6.lo(), ahnhVar6.qN, ahnhVar6.BA, ahnhVar6.Mt, ahnhVar6.Mu, ahnhVar6.uJ);
            case 2117:
                return new ajfp(this.a.a.vh);
            case 2118:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar7 = ahknVar11.a;
                return new agkr((fdjx) ahnhVar7.m.b(), ahnhVar7.Bz, (cogw) ahknVar11.cD.b());
            case 2119:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar8 = ahknVar12.a;
                return new crgu(ahnhVar8.qo, ahnhVar8.zj, ahknVar12.cU, ahnhVar8.qi, ahnhVar8.Bq);
            case 2120:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar9 = ahknVar13.a;
                return new ayca(ahnhVar9.uJ, ahnhVar9.BF, ahnhVar9.Mx, ahnhVar9.lq(), (eosc) ahknVar13.y.b());
            case 2121:
                return Optional.of((afkc) this.a.a.Mw.b());
            case 2122:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar10 = ahknVar14.a;
                return new afki((fdjx) ahnhVar10.m.b(), (fdjx) ahnhVar10.oQ.b(), (fcyh) ahknVar14.cz.b(), ahnhVar10.uJ, (cogw) ahknVar14.cD.b());
            case 2123:
                ahnh ahnhVar11 = this.a.a;
                return new csjq(ahnhVar11.HA, ahnhVar11.HE, ahnhVar11.GN, (fdjx) ahnhVar11.oQ.b());
            case 2124:
                ahnh ahnhVar12 = this.a.a;
                return new crie(ahnhVar12.Mz, ahnhVar12.uJ, ahnhVar12.MA, (bxlc) ahnhVar12.uI.b(), ahnhVar12.BQ);
            case 2125:
                ahnh ahnhVar13 = this.a.a;
                return new cskc(ahnhVar13.HA, ahnhVar13.HE, ahnhVar13.GN, ahnhVar13.Mx, ahnhVar13.uJ, (fdjx) ahnhVar13.oQ.b());
            case 2126:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar14 = ahknVar15.a;
                return new cpdr(ahnhVar14.uJ, ahnhVar14.HP, ahnhVar14.HR, (bveg) ahnhVar14.yx.b(), (appk) ahnhVar14.HQ.b(), (fdjx) ahnhVar14.oQ.b(), (fcyh) ahknVar15.cz.b(), ahknVar15.cD);
            case 2127:
                ahkn ahknVar16 = this.a;
                eyik eyikVar3 = ahknVar16.t;
                ahnh ahnhVar15 = ahknVar16.a;
                return new axpa(eyikVar3, ahnhVar15.tt, ahnhVar15.MD, ahnhVar15.MS, ahknVar16.y, eyil.a(ahknVar16.ml), ahknVar16.cD);
            case 2128:
                ahkn ahknVar17 = this.a;
                return new byfv((cogw) ahknVar17.cD.b(), (dqsn) ahknVar17.a.qq.b());
            case 2129:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar16 = ahknVar18.a;
                final Optional optionalOf = Optional.of(ahnhVar16.fC());
                final eyik eyikVar4 = ahnhVar16.Hf;
                final eyik eyikVar5 = ahnhVar16.Hb;
                final eyik eyikVar6 = ahnhVar16.tt;
                final Optional optional = (Optional) ahnhVar16.Hi.b();
                final byki bykiVarFE = ahnhVar16.fE();
                final eyik eyikVar7 = ahnhVar16.uJ;
                final eosc eoscVar = (eosc) ahknVar18.y.b();
                final eyik eyikVar8 = ahnhVar16.Js;
                return new byfd() { // from class: casn
                    @Override // defpackage.byfd
                    public final ekgb a() {
                        int i2 = ekgb.d;
                        final ekfw ekfwVar = new ekfw();
                        ekfwVar.h(new byfa(eyikVar4, eyikVar5, eyikVar6, eyikVar7, eoscVar, eyikVar8));
                        Optional optional2 = optional;
                        ekfwVar.h(new byex(optional2));
                        ekfwVar.h(new byfe(optional2));
                        ekfwVar.h(bykiVarFE);
                        optionalOf.ifPresent(new Consumer() { // from class: caso
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ekfwVar.h((bycs) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return ekfwVar.g();
                    }
                };
            case 2130:
                ahkn ahknVar19 = this.a;
                eyik eyikVar9 = ahknVar19.mi;
                eosc eoscVar2 = (eosc) ahknVar19.y.b();
                eosc eoscVar3 = (eosc) ahknVar19.p.b();
                ahnh ahnhVar17 = ahknVar19.a;
                return new bxzu(eyikVar9, eoscVar2, eoscVar3, (bxxd) ahnhVar17.MF.b(), ahnhVar17.c, ahnhVar17.MH, ahknVar19.mk, ahnhVar17.oP, ahnhVar17.sL);
            case 2131:
                ahnh ahnhVar18 = this.a.a;
                return new bxye(ahnhVar18.fz(), ahnhVar18.ME);
            case 2132:
                final eyik eyikVar10 = this.a.a.oO;
                return new askz() { // from class: askt
                    @Override // defpackage.askz
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.enable_skip_hidden_messages_in_search");
                    }
                };
            case 2133:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar19 = ahknVar20.a;
                return new byaq(ahnhVar19.qr, ahnhVar19.oP, ahnhVar19.MG, (Random) ahknVar20.mj.b());
            case 2134:
                return new aqdj() { // from class: aqde
                };
            case 2135:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar20 = ahknVar21.a;
                return new bxrn(ahnhVar20.MK, ahnhVar20.ML, (eosc) ahknVar21.p.b(), (bxxd) ahnhVar20.MF.b(), ahnhVar20.sL);
            case 2136:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar21 = ahknVar22.a;
                return new bxrv((fdjx) ahnhVar21.m.b(), ahknVar22.mk, ahnhVar21.MJ, ahnhVar21.MH);
            case 2137:
                ahnh ahnhVar22 = this.a.a;
                return new bxtt((fdjx) ahnhVar22.oS.b(), ahnhVar22.fx());
            case 2138:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar23 = ahknVar23.a;
                return new bxsg((fdjx) ahnhVar23.m.b(), (byav) ahknVar23.mk.b(), ahknVar23.mi, ahnhVar23.MH);
            case 2139:
                final eyik eyikVar11 = this.a.a.oO;
                return new asaw() { // from class: asau
                    @Override // defpackage.asaw
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.enable_skip_index_message_annotation");
                    }
                };
            case 2140:
                ahnh ahnhVar24 = this.a.a;
                return new autx((aurx) ahnhVar24.wc.b(), ahnhVar24.bz(), (aukg) ahnhVar24.MO.b());
            case 2141:
                return new aukg((fdjx) this.a.a.m.b());
            case 2142:
                return new bykh(this.a.a.MQ);
            case 2143:
                return new byjc(this.a.a.rF);
            case 2144:
                final eyik eyikVar12 = this.a.a.oO;
                return new aqoc() { // from class: aqnm
                    @Override // defpackage.aqoc
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.incoming_rcs_message_destination_conversation_matching");
                    }
                };
            case 2145:
                return new apsu() { // from class: aoyr
                };
            case 2146:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar25 = ahknVar24.a;
                return new baxl(ahnhVar25.qq, ahknVar24.mm, ahnhVar25.pf);
            case 2147:
                return new cqzn(this.a.a.Hb);
            case 2148:
                return (ewto) ((ehdm) this.a.a.oJ().a.b()).a("com.google.android.apps.messaging.auto", "45686169").c();
            case 2149:
                final eyik eyikVar13 = this.a.a.oO;
                return new arym() { // from class: arxw
                    @Override // defpackage.arym
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.immediate_delivery_reports_use_pipeline");
                    }
                };
            case 2150:
                final eyik eyikVar14 = this.a.a.oO;
                return new arns() { // from class: armt
                    @Override // defpackage.arns
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.enable_original_rcs_message_id");
                    }
                };
            case 2151:
                return new apre() { // from class: aowe
                };
            case 2152:
                return new ahln(this);
            case 2153:
                return new ahlo(this);
            case 2154:
                return new ahlp(this);
            case 2155:
                return new ahlq(this);
            case 2156:
                ahnh ahnhVar26 = this.a.a;
                return new asrt((awjh) ahnhVar26.sK.b(), (awnf) ahnhVar26.sJ.b());
            case 2157:
                return Boolean.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45684683").e());
            case 2158:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45692391").b());
            case 2159:
                Set set = (Set) this.a.a.Ij.b();
                set.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((efol) it.next()).b.toString());
                }
                return fcva.av(arrayList);
            case 2160:
                return ((cmfe) this.a.a.xF.b()).h();
            case 2161:
                final eyik eyikVar15 = this.a.a.oO;
                return new aqzt() { // from class: aqxn
                    @Override // defpackage.aqzt
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.enable_serialize_step");
                    }
                };
            case 2162:
                ahkn ahknVar25 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar25.cA.b();
                ahnh ahnhVar27 = ahknVar25.a;
                return new ccay(fcyhVar, ahnhVar27.yy, (ccpm) ahnhVar27.tI.b(), (awlc) ahnhVar27.FK.b(), ahnhVar27.hd());
            case 2163:
                ahnh ahnhVar28 = this.a.a;
                return new cctj(ahnhVar28.Eo, ahnhVar28.Dw);
            case 2164:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar29 = ahknVar26.a;
                return new ccto((cctj) ahnhVar29.Nv.b(), (ccer) ahnhVar29.yA.b(), (ccpm) ahnhVar29.tI.b(), (ccap) ahnhVar29.Nu.b(), (efob) ahknVar26.kz.b(), (arac) ahnhVar29.Nw.b());
            case 2165:
                final eyik eyikVar16 = this.a.a.oO;
                return new arac() { // from class: aqyf
                    @Override // defpackage.arac
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.set_file_name_and_content_type_for_encryption_protocol");
                    }
                };
            case 2166:
                return new auul((alrj) this.a.a.qi.b());
            case 2167:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar30 = ahknVar27.a;
                return new ckxf(ahnhVar30.zs, new ckwz(), (Executor) ahknVar27.p.b(), ahnhVar30.jQ());
            case 2168:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar31 = ahknVar28.a;
                return new coyz(ahnhVar31.uM, ahnhVar31.rl, ahnhVar31.rc, (eosc) ahknVar28.p.b());
            case 2169:
                ahkn ahknVar29 = this.a;
                Context context2 = (Context) ahknVar29.t.b();
                eosc eoscVar4 = (eosc) ahknVar29.aJ.b();
                eosc eoscVar5 = (eosc) ahknVar29.y.b();
                eosc eoscVar6 = (eosc) ahknVar29.p.b();
                ahnh ahnhVar32 = ahknVar29.a;
                return new ctdx(context2, eoscVar4, eoscVar5, eoscVar6, (cmuq) ahnhVar32.wJ.b(), (cmqj) ahnhVar32.uv.b(), (ceae) ahnhVar32.uD.b(), (cmos) ahnhVar32.Ck.b(), (dzqp) ahknVar29.gw.b(), ahnhVar32.lL(), ahnhVar32.lK(), ahnhVar32.uJ);
            case 2170:
                return new alre(this.a.a.pX);
            case 2171:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar33 = ahknVar30.a;
                return new cllp((fdjx) ahnhVar33.m.b(), (fcyh) ahknVar30.cz.b(), ahnhVar33.st, ahnhVar33.uJ);
            case 2172:
                ahkn ahknVar31 = this.a;
                Context context3 = (Context) ahknVar31.t.b();
                ahnh ahnhVar34 = ahknVar31.a;
                return new axrj(context3, ahnhVar34.wv, ahnhVar34.Hb, ahnhVar34.sL, ahnhVar34.AG, ahnhVar34.uQ, ahnhVar34.uE, ahnhVar34.uJ, ahnhVar34.ww, ahnhVar34.Gn, ahnhVar34.NF, ahnhVar34.Dp, (bbdl) ahnhVar34.qG.b(), (bagw) ahnhVar34.CH.b(), (cmuq) ahnhVar34.wJ.b(), ahnhVar34.uy, (bbhh) ahnhVar34.HW.b(), ahnhVar34.Cd, ahnhVar34.BI, (crej) ahnhVar34.BH.b(), (crma) ahknVar31.da.b(), (cqmr) ahknVar31.eK.b(), (cmqj) ahnhVar34.uv.b(), (Optional) ((eyig) ahknVar31.dn).a, (cogw) ahknVar31.cD.b(), (aipo) ahnhVar34.us.b(), (ains) ahnhVar34.c.b(), ahnhVar34.yw, ahnhVar34.NG, ahknVar31.aK(), (bbgy) ahnhVar34.JM.b(), (bbfk) ahnhVar34.Dx.b(), (bxlc) ahnhVar34.uI.b(), (ayeo) ahnhVar34.MV.b(), (bveg) ahnhVar34.yx.b(), (dqsn) ahnhVar34.qq.b(), ahnhVar34.Cp, (bydb) ahnhVar34.IE.b(), ahnhVar34.HP, (alrj) ahnhVar34.qi.b(), ahnhVar34.Im, ahnhVar34.In, (cgdh) ahnhVar34.NH.b(), ahnhVar34.qN, ahnhVar34.AM, ahnhVar34.Gt, ahnhVar34.ux, ahnhVar34.zO, ahnhVar34.Ax, ahnhVar34.DE, ahnhVar34.NI, ahnhVar34.Js, ahnhVar34.NJ, ahnhVar34.NK, ahnhVar34.sj, ahnhVar34.yr, ahnhVar34.qa, ahnhVar34.ND, ahnhVar34.NL, ahnhVar34.pf, ahnhVar34.FE, ahknVar31.ez, ahnhVar34.bi(), (eosc) ahknVar31.p.b(), (fdjx) ahnhVar34.oS.b(), ahnhVar34.eJ(), (aoou) ahnhVar34.tk.b(), ahnhVar34.wc, ahnhVar34.MP, (AtomicReference) ahnhVar34.NX.b(), ahnhVar34.NY, ahnhVar34.Dw, ahnhVar34.NZ, ahnhVar34.Oa, ahnhVar34.Ob, (aqee) ahnhVar34.NW.b(), (apwn) ahnhVar34.Bg.b(), (arnv) ahnhVar34.yG.b(), ahnhVar34.Ov, ahnhVar34.Ow, (aqzn) ahnhVar34.Or.b(), ahnhVar34.Ox);
            case 2173:
                ahnh ahnhVar35 = this.a.a;
                return new auue(ahnhVar35.uI, (dqsn) ahnhVar35.qq.b(), ahnhVar35.zP, ahnhVar35.sL);
            case 2174:
                ahkn ahknVar32 = this.a;
                eyik eyikVar17 = ahknVar32.eO;
                ahnh ahnhVar36 = ahknVar32.a;
                return new bbdh(eyikVar17, ahnhVar36.uM, ahnhVar36.vl, (aimb) ahnhVar36.rc.b());
            case 2175:
                ahkn ahknVar33 = this.a;
                Context context4 = (Context) ahknVar33.t.b();
                ahnh ahnhVar37 = ahknVar33.a;
                return new cgdh(context4, ahnhVar37.qr, ahnhVar37.qK);
            case 2176:
                final eyik eyikVar18 = this.a.a.oO;
                return new aqsh() { // from class: aqpx
                    @Override // defpackage.aqsh
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.dsdr_respect_drafted_rcs_message_e2ee_status");
                    }
                };
            case 2177:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar38 = ahknVar34.a;
                return new axka(ahnhVar38.yx, ahnhVar38.wv, (eosc) ahknVar34.y.b());
            case 2178:
                return new ekph(this.a.a.ee());
            case 2179:
                ahkn ahknVar35 = this.a;
                Context context5 = (Context) ahknVar35.t.b();
                ahnh ahnhVar39 = ahknVar35.a;
                return new bxno(context5, ahnhVar39.fs(), ahnhVar39.ft(), ahnhVar39.c, new bxnr(ahnhVar39.rF), (cqtc) ahnhVar39.zv.b(), (eosc) ahknVar35.y.b());
            case 2180:
                ahkn ahknVar36 = this.a;
                return new cqxk((Context) ahknVar36.t.b(), (cqxn) ahknVar36.a.NM.b(), (cogw) ahknVar36.cD.b(), ahknVar36.cE);
            case 2181:
                ahnh ahnhVar40 = this.a.a;
                return new cqxn((ains) ahnhVar40.c.b(), new ajky((aivi) ahnhVar40.zs.b()));
            case 2182:
                ahkn ahknVar37 = this.a;
                Context context6 = (Context) ahknVar37.t.b();
                egpm egpmVar = (egpm) ahknVar37.dR.b();
                ahnh ahnhVar41 = ahknVar37.a;
                return new cqyh(context6, egpmVar, (fdjx) ahnhVar41.oQ.b(), ahknVar37.cN(), (cogw) ahknVar37.cD.b(), (cqmz) ahknVar37.ic.b(), (cqui) ahnhVar41.zt.b(), (cqxn) ahnhVar41.NM.b(), ahnhVar41.lm(), ahnhVar41.NP);
            case 2183:
                return new arlx() { // from class: arlk
                };
            case 2184:
                return Long.valueOf(((ehdm) this.a.a.ot().a.b()).a("com.google.android.apps.messaging.auto", "45677328").b());
            case 2185:
                ahkn ahknVar38 = this.a;
                Context context7 = (Context) ahknVar38.t.b();
                ahnh ahnhVar42 = ahknVar38.a;
                return new bxog(context7, ahnhVar42.NS, ahnhVar42.NT, ahnhVar42.qq, ahknVar38.ic, ahnhVar42.zt, ahnhVar42.NU);
            case 2186:
                ahkn ahknVar39 = this.a;
                return new bxmv((Context) ahknVar39.t.b(), (bahv) ahknVar39.a.un.b());
            case 2187:
                ahnh ahnhVar43 = this.a.a;
                return new bayy((bxlc) ahnhVar43.uI.b(), ahnhVar43.CK);
            case 2188:
                final eyik eyikVar19 = this.a.a.oO;
                return new apwg() { // from class: apdy
                    @Override // defpackage.apwg
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_transcoding_failure_fallback_logging");
                    }
                };
            case 2189:
                return aulx.a(this.a.a.NW);
            case 2190:
                final eyik eyikVar20 = this.a.a.oO;
                return new aqee() { // from class: aqec
                    @Override // defpackage.aqee
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.fix_cloud_sync_status_in_metrics");
                    }
                };
            case 2191:
                final eyik eyikVar21 = this.a.a.oO;
                return new apzj() { // from class: aphw
                    @Override // defpackage.apzj
                    public final boolean a() {
                        return ((eoth) eyikVar21.b()).a("bugle.insert_new_message_action_use_messaging_identity");
                    }
                };
            case 2192:
                final eyik eyikVar22 = this.a.a.oO;
                return new aqyw() { // from class: aqvz
                    @Override // defpackage.aqyw
                    public final boolean a() {
                        return ((eoth) eyikVar22.b()).a("bugle.bypass_messages_queue_when_sending_file_transfers");
                    }
                };
            case 2193:
                return new cidb(this.a.a.pQ);
            case 2194:
                final eyik eyikVar23 = this.a.a.oO;
                return new aqti() { // from class: aqrw
                    @Override // defpackage.aqti
                    public final boolean a() {
                        return ((eoth) eyikVar23.b()).a("bugle.update_conversation_self_id_when_sending_rcs_messages");
                    }
                };
            case 2195:
                ahnh ahnhVar44 = this.a.a;
                return new atgy(ahnhVar44.dg(), (fdjx) ahnhVar44.m.b());
            case 2196:
                ahkn ahknVar40 = this.a;
                Context context8 = (Context) ahknVar40.t.b();
                fcyh fcyhVar2 = (fcyh) ahknVar40.cz.b();
                ahnh ahnhVar45 = ahknVar40.a;
                return new bxoq(context8, fcyhVar2, ahnhVar45.fs(), ahnhVar45.ft(), ahnhVar45.pQ, (coua) ahnhVar45.DF.b(), (cqsu) ahnhVar45.xi.b(), (cqtc) ahnhVar45.zv.b());
            case 2197:
                int iD = (int) this.a.a.d();
                int i2 = febh.a;
                return new febg(iD);
            case 2198:
                final eyik eyikVar24 = this.a.a.oO;
                return new aqzw() { // from class: aqxt
                    @Override // defpackage.aqzw
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.fail_open_on_resizing_when_file_under_size_limit");
                    }
                };
            case 2199:
                return (evrj) ((ehdm) this.a.a.oj().a.b()).a("com.google.android.apps.messaging.auto", "45665680").c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        int i = this.b;
        switch (i) {
            case 2200:
                ahkn ahknVar = this.a;
                return new coiq((dqsn) ahknVar.a.qq.b(), (coml) ahknVar.mE.b(), (eosc) ahknVar.p.b(), (eosc) ahknVar.y.b(), (ConcurrentMap) ahknVar.mF.b());
            case 2201:
                return Long.valueOf(((ehdm) this.a.a.om().a.b()).a("com.google.android.apps.messaging.auto", "45650319").b());
            case 2202:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar = ahknVar2.a;
                return new coum((dqsn) ahnhVar.qq.b(), (eosc) ahknVar2.aJ.b(), ahnhVar.uJ, (ayrm) ahnhVar.NJ.b(), ahnhVar.ek(), (coyz) ahnhVar.NB.b(), (axzc) ahnhVar.Oj.b(), (cogw) ahknVar2.cD.b());
            case 2203:
                final eyik eyikVar = this.a.a.oO;
                return new apwz() { // from class: apff
                    @Override // defpackage.apwz
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.remove_default_sub_id_in_process_file_transfer_action");
                    }
                };
            case 2204:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                ahnh ahnhVar2 = ahknVar3.a;
                return new axzc(context, ahnhVar2.uJ, ahnhVar2.uE, (cmqj) ahnhVar2.uv.b(), (dqsn) ahnhVar2.qq.b());
            case 2205:
                int iE = (int) this.a.a.e();
                int i2 = febh.a;
                return new febg(iE);
            case 2206:
                return new aqzo() { // from class: aqxd
                };
            case 2207:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqzs() { // from class: aqxl
                    @Override // defpackage.aqzs
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_mark_message_as_failed_on_upload_failure");
                    }
                };
            case 2208:
                ahnh ahnhVar3 = this.a.a;
                return new ccvu(new bwkv((arac) ahnhVar3.Nw.b(), (efob) ahnhVar3.a.kz.b(), ahnhVar3.eR()), (atnb) ahnhVar3.Nx.b(), (apwn) ahnhVar3.Bg.b());
            case 2209:
                final eyik eyikVar3 = this.a.a.oO;
                return new arae() { // from class: aqyh
                    @Override // defpackage.arae
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.speed_up_send_step");
                    }
                };
            case 2210:
                final eyik eyikVar4 = this.a.a.oO;
                return new arag() { // from class: aqyl
                    @Override // defpackage.arag
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.store_analytics_message_id_for_logging_when_receiving_message_core_data");
                    }
                };
            case 2211:
                final eyik eyikVar5 = this.a.a.oO;
                return new aqzn() { // from class: aqxb
                    @Override // defpackage.aqzn
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_early_send_for_one_attached_file");
                    }
                };
            case 2212:
                final eyik eyikVar6 = this.a.a.oO;
                return new aqzg() { // from class: aqwr
                    @Override // defpackage.aqzg
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.disable_prewarm_on_missing_self_identity");
                    }
                };
            case 2213:
                final eyik eyikVar7 = this.a.a.oO;
                return new aqzq() { // from class: aqxh
                    @Override // defpackage.aqzq
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.enable_logging_for_file_processing_pipeline");
                    }
                };
            case 2214:
                final eyik eyikVar8 = this.a.a.oO;
                return new aqzr() { // from class: aqxj
                    @Override // defpackage.aqzr
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.enable_logging_for_user_initiated_pause_resume_cancel_operations");
                    }
                };
            case 2215:
                final eyik eyikVar9 = this.a.a.oO;
                return new aqyy() { // from class: aqwd
                    @Override // defpackage.aqyy
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.call_file_transfer_processor_directly_when_bypassing_messages_queue");
                    }
                };
            case 2216:
                return Long.valueOf(((ehdm) this.a.a.oj().a.b()).a("com.google.android.apps.messaging.auto", "45692994").b());
            case 2217:
                ahnh ahnhVar4 = this.a.a;
                return new chet((cheq) ahnhVar4.Ig.b(), (fdjx) ahnhVar4.m.b());
            case 2218:
                final eyik eyikVar10 = this.a.a.oO;
                return new asbs() { // from class: asbi
                    @Override // defpackage.asbs
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.use_send_pipeline_for_rcs_text");
                    }
                };
            case 2219:
                ahnh ahnhVar5 = this.a.a;
                return new asrr((asrp) ahnhVar5.Nm.b(), (fdjx) ahnhVar5.m.b());
            case 2220:
                final eyik eyikVar11 = this.a.a.oO;
                return new asbu() { // from class: asbm
                    @Override // defpackage.asbu
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.use_thread_safe_early_send");
                    }
                };
            case 2221:
                final eyik eyikVar12 = this.a.a.oO;
                return new asbt() { // from class: asbk
                    @Override // defpackage.asbt
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.use_sent_timestamp_from_transport");
                    }
                };
            case 2222:
                return Optional.of((cufc) this.a.a.Fr.b());
            case 2223:
                ahkn ahknVar4 = this.a;
                cmgk cmgkVar = (cmgk) ahknVar4.a.qK.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.RECENT_MESSAGE_CODES);
                cmggVarC.f(aiyl.a);
                cmggVarC.c(new Supplier() { // from class: aiym
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new aiyj();
                    }
                });
                return new aiyt(cmgkVar.a(cmggVarC.a()), (eosc) ahknVar4.p.b());
            case 2224:
                ahnh ahnhVar6 = this.a.a;
                return new clls((bauh) ahnhVar6.HP.b(), ahnhVar6.ka(), ahnhVar6.ww);
            case 2225:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar7 = ahknVar5.a;
                crmx crmxVar = (crmx) ahnhVar7.pB.b();
                cqbm cqbmVar = (cqbm) ahnhVar7.sX.b();
                cmum cmumVar = (cmum) ahnhVar7.wF.b();
                ajfo ajfoVar = (ajfo) ahnhVar7.vh.b();
                crny crnyVar = (crny) ahnhVar7.pf.b();
                return new cmqb(crmxVar, cqbmVar, cmumVar, ajfoVar, crnyVar, (cmvw) ahnhVar7.OJ.b(), (cldu) ahnhVar7.Ch.b(), (ains) ahnhVar7.c.b(), ahnhVar7.bl(), ahnhVar7.bm());
            case 2226:
                return new cmvw(eyie.a(this.a.a.wF));
            case 2227:
                ahnh ahnhVar8 = this.a.a;
                return new cskd(ahnhVar8.rc, (asrf) ahnhVar8.rl.b());
            case 2228:
                ahnh ahnhVar9 = this.a.a;
                return new aujw(new aujt(ahnhVar9.OM, ahnhVar9.ON, ahnhVar9.OO, new aujg()), new aujg());
            case 2229:
                ahkn ahknVar6 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar6.cz.b();
                ahnh ahnhVar10 = ahknVar6.a;
                return new aujs(fcyhVar, (fdjx) ahnhVar10.m.b(), (cejj) ahnhVar10.tJ.b());
            case 2230:
                ahnh ahnhVar11 = this.a.a;
                return new aujo((asrc) ahnhVar11.EQ.b(), (fdjx) ahnhVar11.m.b(), (awnf) ahnhVar11.sJ.b(), (ardl) ahnhVar11.sB.b());
            case 2231:
                ahnh ahnhVar12 = this.a.a;
                return new aujf(ahnhVar12.dV(), (fdjx) ahnhVar12.m.b());
            case 2232:
                ahkn ahknVar7 = this.a;
                return new assc(ahknVar7.a.qr, (cogw) ahknVar7.cD.b(), (atau) ahknVar7.ii.b());
            case 2233:
                ahkn ahknVar8 = this.a;
                eosc eoscVar = (eosc) ahknVar8.p.b();
                ahnh ahnhVar13 = ahknVar8.a;
                return new atya(eoscVar, ahnhVar13.gX(), (atak) ahknVar8.kA.b(), (atwc) ahknVar8.fi(), ahnhVar13.OQ, ahnhVar13.Jw, ahnhVar13.sh, ahnhVar13.rW, ahnhVar13.se);
            case 2234:
                return new cbqc(this.a.a.OS);
            case 2235:
                return (cbqe) ((ehdm) this.a.a.oc().a.b()).a("com.google.android.apps.messaging.auto", "45684712").c();
            case 2236:
                ahnh ahnhVar14 = this.a.a;
                return new awlc(ahnhVar14.OU, (fdjx) ahnhVar14.m.b());
            case 2237:
                return new ekph(new ccqk((ciwi) this.a.a.Nf.b()));
            case 2238:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar15 = ahknVar9.a;
                return new cifw(ahnhVar15.rc, ahknVar9.lk, ahknVar9.ii, (chvg) ahnhVar15.pR.b(), (asry) ahknVar9.mK.b(), (atah) ahknVar9.mL.b(), ahnhVar15.sh, ahnhVar15.OX, ahnhVar15.OY, (armi) ahnhVar15.OZ.b(), ahnhVar15.Pa);
            case 2239:
                final eyik eyikVar13 = this.a.a.oO;
                return new apum() { // from class: apbh
                    @Override // defpackage.apum
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.group_leave_log_client_error_cause");
                    }
                };
            case 2240:
                final eyik eyikVar14 = this.a.a.oO;
                return new apul() { // from class: apbf
                    @Override // defpackage.apul
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.group_create_log_client_error_cause");
                    }
                };
            case 2241:
                final eyik eyikVar15 = this.a.a.oO;
                return new armi() { // from class: armj
                    @Override // defpackage.armi
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.add_encryption_protocol_in_bugle_group_clearcut_events");
                    }
                };
            case 2242:
                final eyik eyikVar16 = this.a.a.oO;
                return new ardv() { // from class: arbx
                    @Override // defpackage.ardv
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.log_group_profile_info_on_creation");
                    }
                };
            case 2243:
                ahnh ahnhVar16 = this.a.a;
                return atxe.a(ahnhVar16.OW.b(), new atxa(ahnhVar16.rF), (asnl) ahnhVar16.Pk.b(), (fdjx) ahnhVar16.oS.b());
            case 2244:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar17 = ahknVar10.a;
                asnz asnzVarCJ = ahnhVar17.cJ();
                eosc eoscVar2 = (eosc) ahknVar10.p.b();
                eosc eoscVar3 = (eosc) ahknVar10.y.b();
                eyik eyikVar17 = ahnhVar17.pB;
                eygg eyggVarA = eyie.a(ahnhVar17.Pf);
                eygg eyggVarA2 = eyie.a(ahnhVar17.Pg);
                Context context2 = (Context) ahknVar10.t.b();
                aslv aslvVar = (aslv) ahnhVar17.IF.b();
                cogw cogwVar = (cogw) ahknVar10.cD.b();
                aspz aspzVar = (aspz) ahnhVar17.vR.b();
                aipo aipoVar = (aipo) ahnhVar17.us.b();
                asof asofVar = (asof) ahnhVar17.JA.b();
                eosd eosdVar = (eosd) ahknVar10.p.b();
                eyik eyikVar18 = ahnhVar17.Ph;
                return new asnl(asnzVarCJ, eoscVar2, eoscVar3, eyikVar17, eyggVarA, eyggVarA2, context2, aslvVar, cogwVar, aspzVar, aipoVar, asofVar, eosdVar, eyikVar18);
            case 2245:
                return (ewto) ((ehdm) this.a.a.oH().a.b()).a("com.google.android.apps.messaging.auto", "45461661").c();
            case 2246:
                return (ewto) ((ehdm) this.a.a.oH().a.b()).a("com.google.android.apps.messaging.auto", "45612085").c();
            case 2247:
                final eyik eyikVar19 = this.a.a.oO;
                return new aqar() { // from class: apkc
                    @Override // defpackage.aqar
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_rbm_deep_linking");
                    }
                };
            case 2248:
                ahkn ahknVar11 = this.a;
                eyik eyikVar20 = ahknVar11.a.DW;
                eosc eoscVar4 = (eosc) ahknVar11.y.b();
                return new comx(eyikVar20, eoscVar4, (Context) ahknVar11.t.b());
            case 2249:
                ahkn ahknVar12 = this.a;
                return ((ahlc) ahknVar12.a.Ea.b()).a(ahknVar12.aB());
            case 2250:
                return Long.valueOf(((ehdm) this.a.a.oH().a.b()).a("com.google.android.apps.messaging.auto", "45517756").b());
            case 2251:
                return new arvl() { // from class: arvb
                };
            case 2252:
                return new arvm() { // from class: aruz
                };
            case 2253:
                ahnh ahnhVar18 = this.a.a;
                return new atol(ahnhVar18.f(), (fdjx) ahnhVar18.m.b(), (asre) ahnhVar18.CD.b());
            case 2254:
                ahnh ahnhVar19 = this.a.a;
                return new awlc(ahnhVar19.Pp, (fdjx) ahnhVar19.m.b());
            case 2255:
                return new ekph(this.a.a.jA());
            case 2256:
                return new ahlr(this);
            case 2257:
                return Long.valueOf(((ehdm) this.a.a.oL().a.b()).a("com.google.android.apps.messaging.auto", "45675284").b());
            case 2258:
                return ((cmfe) this.a.a.xF.b()).g();
            case 2259:
                ahkn ahknVar13 = this.a;
                return new cjae((ains) ahknVar13.a.c.b(), (cogw) ahknVar13.cD.b());
            case 2260:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar20 = ahknVar14.a;
                return new cnfd(ahnhVar20.Pu, ahnhVar20.Pv, ahnhVar20.Pw, ahnhVar20.Px, ahnhVar20.Py, ahnhVar20.Pz, ahnhVar20.PA, ahnhVar20.uM, ahnhVar20.xL, ahnhVar20.Qc, ahnhVar20.FF, (eosd) ahknVar14.p.b(), (eosc) ahknVar14.y.b(), ahnhVar20.Cs);
            case 2261:
                return new cngk(this.a.a.rF);
            case 2262:
                return new cngf(this.a.a.rF);
            case 2263:
                return new cnbo(this.a.a.rF);
            case 2264:
                return new cnbd(this.a.a.rF);
            case 2265:
                return new cnfy(this.a.a.rF);
            case 2266:
                return new cnhs(this.a.a.rF);
            case 2267:
                return new cncl(this.a.a.rF);
            case 2268:
                ahnh ahnhVar21 = this.a.a;
                cnlh cnlhVar = (cnlh) ahnhVar21.xZ.b();
                eyik eyikVar21 = ahnhVar21.EQ;
                ahkn ahknVar15 = ahnhVar21.a;
                return new cngw(cnfw.a(new cngv(cnlhVar, eyikVar21, ahnhVar21.PC, (eosc) ahknVar15.p.b(), (cnhu) ahnhVar21.xL.b(), ahnhVar21.zm, ahnhVar21.PF, (ahjx) ahknVar15.mM.b()), (eosc) ahknVar15.aJ.b(), (eosc) ahknVar15.p.b(), (ceni) ahnhVar21.PH.b(), ahnhVar21.rN(), (aujf) ahnhVar21.OO.b(), (asrc) ahnhVar21.EQ.b(), ahnhVar21.Qb, (eosd) ahknVar15.p.b(), (ains) ahnhVar21.pQ.b(), (cogw) ahknVar15.cD.b(), (ardl) ahnhVar21.sB.b(), (awng) ahnhVar21.Gh.b()), ahnhVar21.Cs);
            case 2269:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar22 = ahknVar16.a;
                return new cnhz(ahnhVar22.pT, ahnhVar22.PB, (eosc) ahknVar16.p.b());
            case 2270:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar23 = ahknVar17.a;
                return new cnck(ahnhVar23.Gx, (ains) ahnhVar23.c.b(), (eosc) ahknVar17.y.b(), (eosc) ahknVar17.p.b());
            case 2271:
                return Optional.of((cnii) this.a.a.PE.b());
            case 2272:
                return new ahls(this);
            case 2273:
                return Optional.of((cnik) this.a.a.AD.b());
            case 2274:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar24 = ahknVar18.a;
                return new ceni((cejj) ahnhVar24.tJ.b(), (RcsProfileService) ahnhVar24.Ns.b(), ahnhVar24.sh, ahnhVar24.pT, (eosc) ahknVar18.y.b(), (eosc) ahknVar18.p.b(), ahnhVar24.sk, ahknVar18.lW, ahnhVar24.PG);
            case 2275:
                final eyik eyikVar22 = this.a.a.oO;
                return new arhd() { // from class: argq
                    @Override // defpackage.arhd
                    public final boolean a() {
                        return ((eoth) eyikVar22.b()).a("bugle.cslib_cleanup_tachyon_phone_registration_manager_jibe_service_listener");
                    }
                };
            case 2276:
                ahkn ahknVar19 = this.a;
                Context context3 = (Context) ahknVar19.t.b();
                ahnh ahnhVar25 = ahknVar19.a;
                ccyw ccywVar = (ccyw) ahnhVar25.rC.b();
                eyik eyikVar23 = ahknVar19.aJ;
                eyik eyikVar24 = ahnhVar25.rY;
                eosc eoscVar5 = (eosc) eyikVar23.b();
                eosc eoscVar6 = (eosc) ahknVar19.p.b();
                eyik eyikVar25 = ahnhVar25.sd;
                dgqr dgqrVar = (dgqr) ahnhVar25.sh.b();
                ahkn ahknVar20 = ahnhVar25.a;
                dgrf dgrfVar = new dgrf(ahknVar20.y, ahknVar20.aP, ahnhVar25.sd);
                dgrd dgrdVar = new dgrd(ahknVar20.t, ahknVar20.y, ahnhVar25.PO, ahnhVar25.rs, ahnhVar25.rq);
                chzz chzzVar = (chzz) ahnhVar25.PL.b();
                aika aikaVar = (aika) ahnhVar25.uM.b();
                dggc dggcVarIR = ahkn.iR();
                cjxi cjxiVar = (cjxi) ahnhVar25.yf.b();
                cogw cogwVar2 = (cogw) ahknVar19.cD.b();
                ahgh ahghVar = (ahgh) ahnhVar25.PQ.b();
                eigp eigpVar = (eigp) ahknVar19.aI.b();
                crma crmaVar = (crma) ahknVar19.da.b();
                dhkw dhkwVar = (dhkw) ahknVar19.dJ.b();
                eyik eyikVar26 = ahnhVar25.PS;
                eyik eyikVar27 = ahnhVar25.rs;
                ckhh ckhhVar = (ckhh) eyikVar26.b();
                cmlb cmlbVar = (cmlb) ahnhVar25.rd.b();
                eyik eyikVar28 = ahnhVar25.rW;
                eyik eyikVar29 = ahnhVar25.se;
                cebq cebqVar = (cebq) ahnhVar25.rq.b();
                eyik eyikVar30 = ahnhVar25.ri;
                aplg aplgVar = new aplg(ahnhVar25.oO);
                aqaw aqawVarBt = ahnhVar25.bt();
                eyik eyikVar31 = ahnhVar25.ru;
                eyik eyikVar32 = ahnhVar25.PU;
                eyik eyikVar33 = ahnhVar25.PV;
                eyik eyikVar34 = ahnhVar25.PW;
                eyik eyikVar35 = ahnhVar25.PX;
                eyik eyikVar36 = ahnhVar25.yk;
                eyik eyikVar37 = ahnhVar25.PN;
                eyik eyikVar38 = ahknVar19.mN;
                eyik eyikVar39 = ahnhVar25.PY;
                eyik eyikVar40 = ahnhVar25.PR;
                eyik eyikVar41 = ahnhVar25.PZ;
                return new ckkj(context3, eyikVar37, ccywVar, eyikVar24, eoscVar5, eoscVar6, eyikVar25, ahknVar19.aP, dgqrVar, dgrfVar, dgrdVar, chzzVar, aikaVar, dggcVarIR, cjxiVar, cogwVar2, eyikVar38, ahghVar, eigpVar, crmaVar, dhkwVar, eyikVar27, ckhhVar, cmlbVar, eyikVar28, eyikVar29, cebqVar, ahnhVar25.PT, eyikVar30, aplgVar, aqawVarBt, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, eyikVar36, eyikVar39, eyikVar40, eyikVar41);
            case 2277:
                ahkn ahknVar21 = this.a;
                Context context4 = (Context) ahknVar21.t.b();
                ahnh ahnhVar26 = ahknVar21.a;
                eyik eyikVar42 = ahnhVar26.sd;
                chzx chzxVarCj = ahknVar21.cj();
                cqbm cqbmVar2 = (cqbm) ahnhVar26.rY.b();
                eosc eoscVar7 = (eosc) ahknVar21.aJ.b();
                eyik eyikVar43 = ahknVar21.cD;
                eyik eyikVar44 = ahknVar21.dG;
                cogw cogwVar3 = (cogw) eyikVar43.b();
                dhkw dhkwVar2 = (dhkw) ahknVar21.dJ.b();
                cmlb cmlbVar2 = (cmlb) ahnhVar26.rd.b();
                eosc eoscVar8 = (eosc) ahknVar21.p.b();
                eyik eyikVar45 = ahnhVar26.ri;
                eyik eyikVar46 = ahnhVar26.PK;
                return new ckhv(context4, eyikVar42, ahknVar21.aP, chzxVarCj, cqbmVar2, eoscVar7, eyikVar44, cogwVar3, ahnhVar26.PI, dhkwVar2, cmlbVar2, eoscVar8, eyikVar45, eyikVar46, ahnhVar26.PM);
            case 2278:
                ahkn ahknVar22 = this.a;
                return new ckgl(ahknVar22.a.yf, (eosc) ahknVar22.y.b());
            case 2279:
                return new apxa() { // from class: apfh
                };
            case 2280:
                return new aruk() { // from class: arto
                };
            case 2281:
                ahnh ahnhVar27 = this.a.a;
                return new ciaa(ahnhVar27.qr, ahnhVar27.ru, ahnhVar27.rc);
            case 2282:
                final eyik eyikVar47 = this.a.a.oO;
                return new aruh() { // from class: arti
                    @Override // defpackage.aruh
                    public final boolean a() {
                        return ((eoth) eyikVar47.b()).a("bugle.enable_config_refresh_in_debug_menu");
                    }
                };
            case 2283:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar28 = ahknVar23.a;
                return new deyr((dfxx) ahnhVar28.rt.b(), (dhes) ahknVar23.aP.b(), ckhe.a(), (eosc) ahknVar23.aJ.b(), (dexw) ahnhVar28.ru.b());
            case 2284:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar29 = ahknVar24.a;
                return new ahgh(ahnhVar29.PP, ahknVar24.cj(), (cqbm) ahnhVar29.rY.b(), (dhkw) ahknVar24.dJ.b(), ahknVar24.y);
            case 2285:
                return new ahfv(this.a.a.rF);
            case 2286:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar30 = ahknVar25.a;
                fdjx fdjxVar = (fdjx) ahnhVar30.oS.b();
                eyik eyikVar48 = ahnhVar30.rd;
                dhkw dhkwVar3 = (dhkw) ahknVar25.dJ.b();
                apwv apwvVar = (apwv) ahnhVar30.ri.b();
                ahgh ahghVar2 = (ahgh) ahnhVar30.PQ.b();
                eyik eyikVar49 = ahnhVar30.PR;
                return new ckhm(fdjxVar, eyikVar48, ahnhVar30.PN, dhkwVar3, apwvVar, ahghVar2, ahnhVar30.yl, ahnhVar30.cq(), (arhh) eyikVar49.b());
            case 2287:
                final eyik eyikVar50 = this.a.a.oO;
                return new arhh() { // from class: argy
                    @Override // defpackage.arhh
                    public final boolean a() {
                        return ((eoth) eyikVar50.b()).a("bugle.single_reg_deprecate_single_registration_config_removed_listener");
                    }
                };
            case 2288:
                return new ckid(this.a.a.rc);
            case 2289:
                final eyik eyikVar51 = this.a.a.oO;
                return new apvz() { // from class: apdn
                    @Override // defpackage.apvz
                    public final boolean a() {
                        return ((eoth) eyikVar51.b()).a("bugle.log_trigger_in_availability_update_logs");
                    }
                };
            case 2290:
                final eyik eyikVar52 = this.a.a.oO;
                return new aruq() { // from class: arua
                    @Override // defpackage.aruq
                    public final boolean a() {
                        return ((eoth) eyikVar52.b()).a("bugle.set_root_trace_in_on_rcs_availability_update");
                    }
                };
            case 2291:
                final eyik eyikVar53 = this.a.a.oO;
                return new arup() { // from class: arty
                    @Override // defpackage.arup
                    public final boolean a() {
                        return ((eoth) eyikVar53.b()).a("bugle.send_disable_rcs_request_when_disabled_for_wear");
                    }
                };
            case 2292:
                final eyik eyikVar54 = this.a.a.oO;
                return new apwa() { // from class: apdp
                    @Override // defpackage.apwa
                    public final boolean a() {
                        return ((eoth) eyikVar54.b()).a("bugle.log_trigger_when_carrier_setup_pending");
                    }
                };
            case 2293:
                final eyik eyikVar55 = this.a.a.oO;
                return new aqso() { // from class: aqqk
                    @Override // defpackage.aqso
                    public final boolean a() {
                        return ((eoth) eyikVar55.b()).a("bugle.enable_get_sub_id_from_rcs_availability_update");
                    }
                };
            case 2294:
                return Long.valueOf(((ehdm) this.a.a.oX().a.b()).a("com.google.android.apps.messaging.auto", "45425216").b());
            case 2295:
                final eyik eyikVar56 = this.a.a.oO;
                return new aqgz() { // from class: aqgh
                    @Override // defpackage.aqgz
                    public final boolean a() {
                        return ((eoth) eyikVar56.b()).a("bugle.enable_lazy_typing_notification_flag_read");
                    }
                };
            case 2296:
                ahkn ahknVar26 = this.a;
                return new amnf((eosc) ahknVar26.p.b(), (eosc) ahknVar26.y.b(), (amnk) ahknVar26.mP.b(), ahknVar26.a.qa);
            case 2297:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar31 = ahknVar27.a;
                return new ankd(ahnhVar31.Qu, ahnhVar31.yw, ahnhVar31.Qy, ahnhVar31.QA, ahknVar27.p);
            case 2298:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar32 = ahknVar28.a;
                eyik eyikVar57 = ahnhVar32.HR;
                return new ajpv(ahnhVar32.Ql, ahnhVar32.Qt, eyikVar57, ahnhVar32.pf);
            case 2299:
                ahnh ahnhVar33 = this.a.a;
                return new bagz();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        int i = this.b;
        switch (i) {
            case 2300:
                ahnh ahnhVar = this.a.a;
                return new axqc(ahnhVar.wv, ahnhVar.sL, ahnhVar.qq, ahnhVar.qi, ahnhVar.NH, ahnhVar.NK, ahnhVar.yr, ahnhVar.Qk, ahnhVar.Oy, ahnhVar.OD, ahnhVar.Bg, ahnhVar.yG, ahnhVar.Or, ahnhVar.NI);
            case 2301:
                ahkn ahknVar = this.a;
                ahnh ahnhVar2 = ahknVar.a;
                return new axqb(ahknVar.ez, ahnhVar2.rk, (eosc) ahknVar.p.b(), (eosc) ahknVar.aJ.b(), ahnhVar2.NY, ahnhVar2.Qj, ahnhVar2.FC, ahnhVar2.Fz, ahnhVar2.Ov);
            case 2302:
                final eyik eyikVar = this.a.a.oO;
                return new asbr() { // from class: asbg
                    @Override // defpackage.asbr
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.start_save_before_early_send");
                    }
                };
            case 2303:
                ahkn ahknVar2 = this.a;
                eyik eyikVar2 = ahknVar2.t;
                ahnh ahnhVar3 = ahknVar2.a;
                return new aydv(eyikVar2, ahnhVar3.uJ, ahknVar2.cD, ahnhVar3.Jm, ahnhVar3.Qm, ahnhVar3.Ct, ahnhVar3.Qo, ahnhVar3.Js, ahnhVar3.CB, ahnhVar3.Qp, ahnhVar3.sL);
            case 2304:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar4 = ahknVar3.a;
                return new ayft(ahnhVar4.uJ, ahknVar3.cD, ahnhVar4.c, ahknVar3.y, ahknVar3.p, ahnhVar4.EE, ahnhVar4.Ju, ahnhVar4.Dw, ahnhVar4.Ov);
            case 2305:
                ahkn ahknVar4 = this.a;
                return new axxy((cqpz) ahknVar4.aN.b(), (ayqx) ahknVar4.a.Qn.b());
            case 2306:
                ahnh ahnhVar5 = this.a.a;
                return new ayqx(ahnhVar5.uJ, (ayqd) ahnhVar5.Ct.b());
            case 2307:
                ahnh ahnhVar6 = this.a.a;
                return new ajsn(ahnhVar6.qi, ahnhVar6.pl);
            case 2308:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar7 = ahknVar5.a;
                return new ayfd(ahnhVar7.qi, ahnhVar7.uJ, ahnhVar7.sj, ahnhVar7.qG, ahknVar5.cD, ahnhVar7.Qs, ahnhVar7.yw, ahnhVar7.uM, ahnhVar7.Dx, ahnhVar7.IE, ahnhVar7.wv, ahnhVar7.HO, ahnhVar7.wc, ahnhVar7.MP, ahknVar5.p, ahnhVar7.qa, ahnhVar7.NJ, ahnhVar7.Qp, ahnhVar7.NX, ahnhVar7.NW);
            case 2309:
                ahkn ahknVar6 = this.a;
                Context context = (Context) ahknVar6.t.b();
                ahnh ahnhVar8 = ahknVar6.a;
                return new bxna(context, ahnhVar8.fr(), new bxne(ahnhVar8.a.t, ahnhVar8.us, ahnhVar8.NN, ahnhVar8.NS, ahnhVar8.Qr), (bxmv) ahnhVar8.NS.b(), (cgbn) ahnhVar8.Cs.b(), ahnhVar8.c);
            case 2310:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar9 = ahknVar7.a;
                return new ayju(ahknVar7.t, ahnhVar9.NS, ahnhVar9.NT, ahnhVar9.qq);
            case 2311:
                return new ajql();
            case 2312:
                return Optional.of((cmcx) this.a.a.Qx.b());
            case 2313:
                ahkn ahknVar8 = this.a;
                cogw cogwVar = (cogw) ahknVar8.cD.b();
                eosc eoscVar = (eosc) ahknVar8.y.b();
                eosc eoscVar2 = (eosc) ahknVar8.p.b();
                eyik eyikVar3 = ahknVar8.aQ;
                ahnh ahnhVar10 = ahknVar8.a;
                eyik eyikVar4 = ahnhVar10.yx;
                eyik eyikVar5 = ahnhVar10.un;
                egzh egzhVar = (egzh) eyikVar3.b();
                aiht aihtVar = (aiht) ahknVar8.mQ.b();
                eyik eyikVar6 = ahnhVar10.qG;
                ahknVar8.bC();
                return new aihh(cogwVar, eoscVar, eoscVar2, ahnhVar10.Qu, eyikVar4, eyikVar5, egzhVar, aihtVar, ahnhVar10.Qv, ahnhVar10.Qw, eyikVar6, ahnhVar10.uE, ahnhVar10.uJ, ahnhVar10.sL);
            case 2314:
                ahkn ahknVar9 = this.a;
                eosc eoscVar3 = (eosc) ahknVar9.y.b();
                eyik eyikVar7 = ahknVar9.cD;
                ahnh ahnhVar11 = ahknVar9.a;
                return new aigk(eoscVar3, ahnhVar11.AQ, (cogw) eyikVar7.b(), ahnhVar11.uI, (dqsn) ahnhVar11.qq.b(), ahnhVar11.HP);
            case 2315:
                ahkn ahknVar10 = this.a;
                return new aieh(ahknVar10.a.zs, new aieq(), (Executor) ahknVar10.p.b());
            case 2316:
                ahkn ahknVar11 = this.a;
                return new aiek(ahknVar11.a.zs, new aieq(), (Executor) ahknVar11.p.b());
            case 2317:
                ahkn ahknVar12 = this.a;
                return new aiem(ahknVar12.a.zs, new aieq(), (Executor) ahknVar12.p.b());
            case 2318:
                ahkn ahknVar13 = this.a;
                chsa chsaVarCh = ahknVar13.ch();
                ahnh ahnhVar12 = ahknVar13.a;
                return ekhx.r(chsaVarCh, new aldj((fdjx) ahnhVar12.oS.b(), ahnhVar12.Qz));
            case 2319:
                return new aldo(this.a.a.rF);
            case 2320:
                amet ametVar = (amet) this.a.a.wV.b();
                ametVar.getClass();
                return ametVar;
            case 2321:
                ahkn ahknVar14 = this.a;
                return new anes((dqsn) ahknVar14.a.qq.b(), (anch) ahknVar14.mS.b());
            case 2322:
                ahnh ahnhVar13 = this.a.a;
                ahkn ahknVar15 = ahnhVar13.a;
                return Optional.of(new ankn(ahnhVar13.aL(), (eosc) ahknVar15.aJ.b(), (eosc) ahknVar15.y.b(), (bxlc) ahnhVar13.uI.b()));
            case 2323:
                ahnh ahnhVar14 = this.a.a;
                return new anfr(ahnhVar14.Hl, ahnhVar14.HW, (fdjx) ahnhVar14.oS.b());
            case 2324:
                ahkn ahknVar16 = this.a;
                eyik eyikVar8 = ahknVar16.t;
                ahnh ahnhVar15 = ahknVar16.a;
                return new amer(eyikVar8, ahnhVar15.QK, ahnhVar15.QO, ahnhVar15.QR, ahnhVar15.QS, ahknVar16.mX, ahnhVar15.tB, ahnhVar15.QT, ahnhVar15.QU, ahnhVar15.QV, ahnhVar15.QW);
            case 2325:
                return new ahlt(this);
            case 2326:
                ahkn ahknVar17 = this.a;
                Context context2 = (Context) ahknVar17.t.b();
                ahnh ahnhVar16 = ahknVar17.a;
                return new alxr(context2, (fdjx) ahnhVar16.oQ.b(), (cqjy) ahnhVar16.Ci.b(), (bael) ahknVar17.mU.b(), (cmqj) ahnhVar16.uv.b(), (bfsa) ahknVar17.mT.b(), (baxl) ahnhVar16.MY.b(), (crny) ahnhVar16.pf.b(), ahnhVar16.tB, new cseb(ahnhVar16.GH), (aptx) ahnhVar16.Dw.b(), (aqmq) ahnhVar16.QG.b(), ahnhVar16.AE);
            case 2327:
                final eyik eyikVar9 = this.a.a.oO;
                return new aqmq() { // from class: aqmh
                    @Override // defpackage.aqmq
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.use_optimized_conversation_messages_query");
                    }
                };
            case 2328:
                return new ahlv(this);
            case 2329:
                return new ahlw(this);
            case 2330:
                ahkn ahknVar18 = this.a;
                Context context3 = (Context) ahknVar18.t.b();
                eyik eyikVar10 = ahknVar18.ie;
                crqx crqxVar = (crqx) ahknVar18.gF.b();
                ahnh ahnhVar17 = ahknVar18.a;
                byed byedVar = (byed) ahnhVar17.QM.b();
                return new amhz(context3, eyikVar10, crqxVar, byedVar, (aqhc) ahnhVar17.QL.b());
            case 2331:
                ahkn ahknVar19 = this.a;
                return new byed(ahknVar19.cK, ahknVar19.mV, (aqhc) ahknVar19.a.QL.b());
            case 2332:
                final eyik eyikVar11 = this.a.a.oO;
                return new aqhc() { // from class: aqgn
                    @Override // defpackage.aqhc
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.move_sim_selector_to_conversation_details");
                    }
                };
            case 2333:
                return new aptw() { // from class: apag
                };
            case 2334:
                ahkn ahknVar20 = this.a;
                Context context4 = (Context) ahknVar20.t.b();
                cogw cogwVar2 = (cogw) ahknVar20.cD.b();
                ahnh ahnhVar18 = ahknVar20.a;
                bahv bahvVar = (bahv) ahnhVar18.un.b();
                eyik eyikVar12 = ahnhVar18.QP;
                amxy amxyVarAq = ahknVar20.aq();
                amsw amswVarAp = ahknVar20.ap();
                baui bauiVar = (baui) eyikVar12.b();
                aqbh aqbhVar = (aqbh) ahnhVar18.qa.b();
                arvu arvuVar = (arvu) ahnhVar18.tA.b();
                amyj amyjVar = new amyj(ahnhVar18.m, ahnhVar18.JQ, ahnhVar18.a.dK);
                arit aritVar = new arit(ahnhVar18.oO);
                return new amvo(context4, cogwVar2, bahvVar, amxyVarAq, amswVarAp, bauiVar, aqbhVar, arvuVar, amyjVar, aritVar);
            case 2335:
                ahkn ahknVar21 = this.a;
                return new baui((cqjy) ahknVar21.a.Ci.b(), (cogw) ahknVar21.cD.b());
            case 2336:
                return new aqvp() { // from class: aqvl
                };
            case 2337:
                ahkn ahknVar22 = this.a;
                return anmm.a(ahknVar22.fX(), ahknVar22.a.ra());
            case 2338:
                return new ahlx(this);
            case 2339:
                return new ahly();
            case 2340:
                return new ahlz();
            case 2341:
                return new apso() { // from class: aoyh
                };
            case 2342:
                ahnh ahnhVar19 = this.a.a;
                angk angkVar = new angk(ahnhVar19.tB);
                anab anabVar = new anab(ahnhVar19.QQ);
                amim amimVar = new amim((amip) ahnhVar19.QY.b(), ahnhVar19.qi, ahnhVar19.IU);
                anfe anfeVar = (anfe) ahnhVar19.QZ.b();
                ahkn ahknVar23 = ahnhVar19.a;
                eyik eyikVar13 = ahknVar23.cD;
                return ekhx.v(angkVar, anabVar, amimVar, new anfa(anfeVar, (cogw) eyikVar13.b()), new bxyo((bxys) ahnhVar19.Ra.b()), new anmt((anmw) ahnhVar19.Rb.b(), (crej) ahnhVar19.BH.b(), ahnhVar19.Rc), new amjh((amjl) ahnhVar19.Rd.b()), new amka(), new anhi((Context) ahknVar23.t.b(), (dnwr) ahknVar23.iv.b(), (anha) ahnhVar19.Re.b()), new anio((anib) ahnhVar19.Rf.b()), new anjp((cogw) eyikVar13.b(), (afhk) ahnhVar19.GB.b(), ahnhVar19.tB));
            case 2343:
                ahkn ahknVar24 = this.a;
                return new amip((dqsn) ahknVar24.a.qq.b(), (anch) ahknVar24.mS.b());
            case 2344:
                ahkn ahknVar25 = this.a;
                return new anfe((dqsn) ahknVar25.a.qq.b(), (anch) ahknVar25.mS.b());
            case 2345:
                ahkn ahknVar26 = this.a;
                return new bxys((dqsn) ahknVar26.a.qq.b(), (anch) ahknVar26.mS.b());
            case 2346:
                ahkn ahknVar27 = this.a;
                return new anmw((dqsn) ahknVar27.a.qq.b(), (anch) ahknVar27.mS.b());
            case 2347:
                final eyik eyikVar14 = this.a.a.oO;
                return new ascz() { // from class: ascq
                    @Override // defpackage.ascz
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.forward_suggestion_shortcut");
                    }
                };
            case 2348:
                ahkn ahknVar28 = this.a;
                return new amjl((dqsn) ahknVar28.a.qq.b(), (anch) ahknVar28.mS.b());
            case 2349:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar20 = ahknVar29.a;
                return new anha((dqsn) ahnhVar20.qq.b(), (anch) ahknVar29.mS.b(), new arxk(ahnhVar20.oO));
            case 2350:
                ahkn ahknVar30 = this.a;
                return new anib((dqsn) ahknVar30.a.qq.b(), (anch) ahknVar30.mS.b());
            case 2351:
                ahnh ahnhVar21 = this.a.a;
                return new alzw(ahnhVar21.Ax, ahnhVar21.IU);
            case 2352:
                ahkn ahknVar31 = this.a;
                eyik eyikVar15 = ahknVar31.bM;
                eyik eyikVar16 = ahknVar31.nd;
                eyik eyikVar17 = ahknVar31.nb;
                ahnh ahnhVar22 = ahknVar31.a;
                return new andg(eyikVar15, eyikVar16, eyikVar17, ahnhVar22.m, ahknVar31.ne, ahnhVar22.Ri);
            case 2353:
                final eyik eyikVar18 = this.a.a.oO;
                return new arla() { // from class: arks
                    @Override // defpackage.arla
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.use_singleton_for_optimistic_message_pager");
                    }
                };
            case 2354:
                ahnh ahnhVar23 = this.a.a;
                return new amya(ahnhVar23.Rk, ahnhVar23.Qq, ahnhVar23.Qt, ahnhVar23.EE);
            case 2355:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar24 = ahknVar32.a;
                return new axsx(ahknVar32.t, ahknVar32.y, ahnhVar24.uJ, ahnhVar24.EE, ahnhVar24.Dw, ahnhVar24.Ov);
            case 2356:
                return Optional.of(this.a.a.aJ());
            case 2357:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar25 = ahknVar33.a;
                egvh egvhVarEl = ahknVar33.el();
                eosd eosdVar = (eosd) ahnhVar25.j.b();
                eosdVar.getClass();
                fcyh fcyhVarA = egvhVarEl.a(eosdVar);
                fcyhVarA.getClass();
                return fcyhVarA;
            case 2358:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar26 = ahknVar34.a;
                return new ajfm((fdjx) ahnhVar26.oQ.b(), (cogw) ahknVar34.cD.b(), ahnhVar26.uM, ahnhVar26.rc);
            case 2359:
                ahkn ahknVar35 = this.a;
                eyik eyikVar19 = ahknVar35.iA;
                ahnh ahnhVar27 = ahknVar35.a;
                return new amhr(eyikVar19, ahnhVar27.Rp, ahnhVar27.oS);
            case 2360:
                return new amaf(this.a.a.QR);
            case 2361:
                final eyik eyikVar20 = this.a.a.oO;
                return new aqkk() { // from class: aqjr
                    @Override // defpackage.aqkk
                    public final boolean a() {
                        return ((eoth) eyikVar20.b()).a("bugle.enable_root_bugle_message_repository");
                    }
                };
            case 2362:
                final eyik eyikVar21 = this.a.a.oO;
                return new aqzm() { // from class: aqwz
                    @Override // defpackage.aqzm
                    public final boolean a() {
                        return ((eoth) eyikVar21.b()).a("bugle.enable_bubble_reliability_logging");
                    }
                };
            case 2363:
                ahkn ahknVar36 = this.a;
                cogw cogwVar3 = (cogw) ahknVar36.cD.b();
                ahnh ahnhVar28 = ahknVar36.a;
                return new ankw(cogwVar3, ahnhVar28.Rt, ahnhVar28.qi, (fdjx) ahnhVar28.oQ.b());
            case 2364:
                ahnh ahnhVar29 = this.a.a;
                return ((awif) ahnhVar29.qq()).a(ahnhVar29.cV());
            case 2365:
                ahnh ahnhVar30 = this.a.a;
                return new anno(ahnhVar30.m, ahnhVar30.oS, ahnhVar30.IE, ahnhVar30.HJ);
            case 2366:
                ahnh ahnhVar31 = this.a.a;
                return new amhd(ahnhVar31.oQ, ahnhVar31.FD, ahnhVar31.FE, ahnhVar31.Rw);
            case 2367:
                return new asbp() { // from class: asbc
                };
            case 2368:
                return Optional.of((bxwe) this.a.a.Rz.b());
            case 2369:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar32 = ahknVar37.a;
                return new bxwe(ahnhVar32.fw(), ahnhVar32.fy(), (bxxd) ahnhVar32.MF.b(), (eosc) ahknVar37.aJ.b());
            case 2370:
                ahkn ahknVar38 = this.a;
                Context context5 = (Context) ahknVar38.t.b();
                eosc eoscVar4 = (eosc) ahknVar38.y.b();
                eyik eyikVar22 = ahknVar38.aI;
                eyik eyikVar23 = ahknVar38.a.MH;
                eigp eigpVar = (eigp) eyikVar22.b();
                dcfd dcfdVar = deap.a;
                return new byak(context5, eoscVar4, eyikVar23, new dedg(context5), eigpVar);
            case 2371:
                return Optional.of(this.a.a.gj());
            case 2372:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar33 = ahknVar39.a;
                return new bzpg(ahnhVar33.gb(), ahnhVar33.gd(), ahnhVar33.gg(), ahnhVar33.gf(), ahnhVar33.gc(), ahnhVar33.ge(), (aurx) ahnhVar33.wc.b(), (byeq) ahnhVar33.sG.b(), (fdjx) ahnhVar33.oS.b(), (fcyh) ahknVar39.cA.b(), (cazj) ahnhVar33.rF.b(), ahnhVar33.bx());
            case 2373:
                ahkn ahknVar40 = this.a;
                ahnh ahnhVar34 = ahknVar40.a;
                return new aiuv((fdjx) ahnhVar34.oQ.b(), (fcyh) ahknVar40.cz.b(), (aisp) ahnhVar34.zF.b());
            case 2374:
                ahnh ahnhVar35 = this.a.a;
                return new amii((coor) ahnhVar35.Ju.b(), (fdjx) ahnhVar35.oS.b());
            case 2375:
                ahnh ahnhVar36 = this.a.a;
                return Optional.of(new anon((fdjx) ahnhVar36.m.b(), (cpdn) ahnhVar36.MA.b(), (anoo) ahnhVar36.RF.b()));
            case 2376:
                ahnh ahnhVar37 = this.a.a;
                return new anoo((aimb) ahnhVar37.rc.b(), ahnhVar37.uM);
            case 2377:
                final eyik eyikVar24 = this.a.a.oO;
                return new aqtu() { // from class: aqtp
                    @Override // defpackage.aqtu
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.move_dunestar_business_logic_to_mapi");
                    }
                };
            case 2378:
                ahkn ahknVar41 = this.a;
                eyik eyikVar25 = ahknVar41.cA;
                ahnh ahnhVar38 = ahknVar41.a;
                return new annv(ahnhVar38.uJ, ahnhVar38.HJ, (fcyh) eyikVar25.b(), ahnhVar38.qG, (cogw) ahknVar41.cD.b(), ahnhVar38.HR, ahnhVar38.HQ, (dqsn) ahnhVar38.qq.b(), (fdjx) ahnhVar38.m.b());
            case 2379:
                return new anny((fdjx) this.a.a.m.b());
            case 2380:
                ahkn ahknVar42 = this.a;
                return new anoj(ahknVar42.a.qq, ahknVar42.mS);
            case 2381:
                ahkn ahknVar43 = this.a;
                ahnh ahnhVar39 = ahknVar43.a;
                return new anao((fdjx) ahnhVar39.oS.b(), ahnhVar39.yx, ahnhVar39.uJ, ahnhVar39.HP, ahnhVar39.ww, (dqsn) ahnhVar39.qq.b(), ahnhVar39.RL, ahnhVar39.RM, ahknVar43.cD);
            case 2382:
                return Optional.of((ckvy) this.a.a.HY.b());
            case 2383:
                return new amxi(this.a.a.rF);
            case 2384:
                ahkn ahknVar44 = this.a;
                ahnh ahnhVar40 = ahknVar44.a;
                return new aneu(ahknVar44.iA, ahnhVar40.oS, ahnhVar40.uJ);
            case 2385:
                ahkn ahknVar45 = this.a;
                return new anei(ahknVar45.iA, ahknVar45.a.oS);
            case 2386:
                final eyik eyikVar26 = this.a.a.oO;
                return new arrc() { // from class: arre
                    @Override // defpackage.arrc
                    public final boolean a() {
                        return ((eoth) eyikVar26.b()).a("bugle.add_receive_sms_mla_metrics");
                    }
                };
            case 2387:
                final eyik eyikVar27 = this.a.a.oO;
                return new arky() { // from class: arko
                    @Override // defpackage.arky
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.enable_merge_get_messages_queries");
                    }
                };
            case 2388:
                final eyik eyikVar28 = this.a.a.oO;
                return new arvt() { // from class: arvp
                    @Override // defpackage.arvt
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.enable_log_outgoing_delete");
                    }
                };
            case 2389:
                ahkn ahknVar46 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar46.cz.b();
                ahnh ahnhVar41 = ahknVar46.a;
                return new ckcv(fcyhVar, (fdjx) ahnhVar41.m.b(), ahnhVar41.al(), (cogw) ahknVar46.cD.b());
            case 2390:
                return new amdz(this.a.a.rc);
            case 2391:
                ahkn ahknVar47 = this.a;
                ahnh ahnhVar42 = ahknVar47.a;
                return new amhm(ahnhVar42.RW, ahnhVar42.RV, ahknVar47.nc, ahnhVar42.Rj, ahnhVar42.QB);
            case 2392:
                ahnh ahnhVar43 = this.a.a;
                ajth ajthVarAw = ahnhVar43.aw();
                csba csbaVarLy = ahnhVar43.ly();
                crvw crvwVarLw = ahnhVar43.lw();
                akbi akbiVarAA = ahnhVar43.aA();
                cljg cljgVarJY = ahnhVar43.jY();
                ajzf ajzfVarAy = ahnhVar43.ay();
                ahkn ahknVar48 = ahnhVar43.a;
                eosc eoscVar5 = (eosc) ahknVar48.aJ.b();
                eyik eyikVar29 = ahnhVar43.rF;
                return ekhx.v(ajthVarAw, csbaVarLy, crvwVarLw, akbiVarAA, cljgVarJY, ajzfVarAy, ahnhVar43.D(), new citm(eoscVar5, new citt(new ciul(eyikVar29), new ciuc(eyikVar29), (cjpo) ahnhVar43.yr.b(), (ains) ahnhVar43.c.b(), ahnhVar43.qG, ahnhVar43.rk, (cogw) ahknVar48.cD.b(), (eosc) ahknVar48.y.b())), new ajzh((fdjx) ahnhVar43.oS.b(), ahnhVar43.lc(), ahnhVar43.cf()), ahnhVar43.ha(), new agug((fdjx) ahnhVar43.oS.b(), ahnhVar43.Sb), ahkn.iP(), ahnhVar43.az());
            case 2393:
                return new ahma();
            case 2394:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45690821").b());
            case 2395:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45692099").b());
            case 2396:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45692100").b());
            case 2397:
                ahnh ahnhVar44 = this.a.a;
                fdjx fdjxVar = (fdjx) ahnhVar44.oS.b();
                ahkn ahknVar49 = ahnhVar44.a;
                return Optional.of(new agum(fdjxVar, (Context) ahknVar49.t.b(), (agud) ahnhVar44.Sa.b(), ahnhVar44.Ne, (cogw) ahknVar49.cD.b(), ahnhVar44.AC, (ajvr) ahnhVar44.Bm.b(), (awjh) ahnhVar44.sK.b(), (arph) ahnhVar44.ES.b(), ahnhVar44.sI));
            case 2398:
                ahkn ahknVar50 = this.a;
                return new agud((Context) ahknVar50.t.b(), (cogw) ahknVar50.cD.b(), ahknVar50.a.BQ);
            case 2399:
                return new ahmb(this);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        int i = this.b;
        switch (i) {
            case 2400:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                return new amke(ahnhVar.Sf, ahnhVar.Cd, ahnhVar.m, ahknVar.cz);
            case 2401:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new amkx(ahnhVar2.m, ahnhVar2.oS, ahknVar2.dK, ahknVar2.iA, ahnhVar2.Se, ahknVar2.nm, ahknVar2.ka);
            case 2402:
                return Optional.of((crkx) this.a.a.BG.b());
            case 2403:
                return new akcg(this.a.a.Sh);
            case 2404:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar3 = ahknVar3.a;
                return new akcq(ahnhVar3.m, ahnhVar3.oS, ahknVar3.dK, ahknVar3.iA);
            case 2405:
                return new ahmc(this);
            case 2406:
                return new cirj();
            case 2407:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45630122").b());
            case 2408:
                ahnh ahnhVar4 = this.a.a;
                asyh asyhVarCX = ahnhVar4.cX();
                aszw aszwVarDa = ahnhVar4.da();
                return ahnhVar4.bk().a() ? ahnhVar4.cR().a(aszwVarDa, null) : asyhVarCX.b(aszwVarDa);
            case 2409:
                ahkn ahknVar4 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar4.cA.b();
                ahnh ahnhVar5 = ahknVar4.a;
                return new akaf(fcyhVar, (fdjx) ahnhVar5.m.b(), (cogw) ahknVar4.cD.b(), (ajvr) ahnhVar5.Bm.b(), ahnhVar5.Ax, ahknVar4.cI, (asre) ahnhVar5.CD.b(), (avpc) ahnhVar5.AM.b(), ahnhVar5.Gx, (dzuc) ahknVar4.cE.b(), ahnhVar5.sJ, ahnhVar5.qa, ahnhVar5.Gu, ahnhVar5.dA(), (ardj) ahnhVar5.Sn.b(), (cifw) ahnhVar5.Pb.b());
            case 2410:
                final eyik eyikVar = this.a.a.oO;
                return new ardj() { // from class: arba
                    @Override // defpackage.ardj
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_group_icon_on_creation");
                    }
                };
            case 2411:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar6 = ahknVar5.a;
                return new cpke(ahnhVar6.zP, ahnhVar6.sL, ahnhVar6.IH, ahnhVar6.SC, ahnhVar6.GT, ahnhVar6.qi, ahnhVar6.Ax, ahnhVar6.Sw, (dqsn) ahnhVar6.qq.b(), ahnhVar6.SD, ahnhVar6.Su, ahnhVar6.GK, (fcyh) ahknVar5.cz.b(), (fdjx) ahnhVar6.oQ.b(), (fcyh) ahknVar5.cA.b());
            case 2412:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar7 = ahknVar6.a;
                return new cruf(ahnhVar7.Hy, ahnhVar7.Sr, ahnhVar7.Ss, (cpgf) ahnhVar7.GT.b(), ahnhVar7.zP, ahnhVar7.sL, ahnhVar7.GH, ahnhVar7.Sw, ahnhVar7.SA, (dqsn) ahnhVar7.qq.b(), ahnhVar7.GZ, ahknVar6.jo, ahnhVar7.SB);
            case 2413:
                ahkn ahknVar7 = this.a;
                Context context = (Context) ahknVar7.t.b();
                ahnh ahnhVar8 = ahknVar7.a;
                return new csby(context, ahnhVar8.Ql, ahnhVar8.uJ, ahnhVar8.GG, ahnhVar8.zP, ahnhVar8.AM, ahnhVar8.Sp, ahnhVar8.yx, ahnhVar8.qG, ahnhVar8.qi, ahnhVar8.Sq, ahnhVar8.wF, (fdjx) ahnhVar8.oS.b());
            case 2414:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar9 = ahknVar8.a;
                return new csca(ahnhVar9.uJ, (Context) ahknVar8.t.b(), (aypg) ahnhVar9.Ql.b(), (cogw) ahknVar8.cD.b(), (ains) ahnhVar9.c.b(), (bveg) ahnhVar9.yx.b());
            case 2415:
                ahkn ahknVar9 = this.a;
                Context context2 = (Context) ahknVar9.t.b();
                eyik eyikVar2 = ahknVar9.ez;
                ahnh ahnhVar10 = ahknVar9.a;
                return new csbk(context2, eyikVar2, ahnhVar10.Gk, ahknVar9.ii, ahknVar9.lk, ahnhVar10.Fd, ahnhVar10.sj, ahnhVar10.sh);
            case 2416:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar11 = ahknVar10.a;
                return new cskk(ahnhVar11.uJ, ahnhVar11.Gk, ahnhVar11.OL, ahnhVar11.pT, ahnhVar11.sj, (eosc) ahknVar10.y.b(), (eosc) ahknVar10.p.b());
            case 2417:
                return Optional.of(this.a.a.lC());
            case 2418:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar12 = ahknVar11.a;
                return new csio(ahnhVar12.Ht, ahnhVar12.St, (cpkp) ahnhVar12.Su.b(), ahnhVar12.uJ, ahnhVar12.sL, ahnhVar12.GS, ahnhVar12.pQ, (eosc) ahknVar11.p.b(), (eosc) ahknVar11.y.b());
            case 2419:
                ahkn ahknVar12 = this.a;
                return new csig(ahknVar12.a.HD, (eosc) ahknVar12.p.b());
            case 2420:
                ahnh ahnhVar13 = this.a.a;
                return new cpkp(ahnhVar13.zP, ahnhVar13.sL, ahnhVar13.uJ, ahnhVar13.yD, ahnhVar13.qi, (fdjx) ahnhVar13.oQ.b());
            case 2421:
                return Optional.of(this.a.a.lD());
            case 2422:
                ahnh ahnhVar14 = this.a.a;
                return new csiq(ahnhVar14.Hr, ahnhVar14.Sx, (cpkp) ahnhVar14.Su.b(), ahnhVar14.uJ, ahnhVar14.sL, ahnhVar14.GS, ahnhVar14.GV, ahnhVar14.Sy, ahnhVar14.pQ, (fdjx) ahnhVar14.oQ.b());
            case 2423:
                return new csih(this.a.a.HD);
            case 2424:
                return new cshg(this.a.a.uJ);
            case 2425:
                return new asdd() { // from class: asdb
                };
            case 2426:
                return new cpkk(this.a.a.sL);
            case 2427:
                ahnh ahnhVar15 = this.a.a;
                return new cdgt((fdjx) ahnhVar15.oS.b(), ahnhVar15.qN);
            case 2428:
                ahkn ahknVar13 = this.a;
                eosc eoscVar = (eosc) ahknVar13.aJ.b();
                eosc eoscVar2 = (eosc) ahknVar13.p.b();
                ahnh ahnhVar16 = ahknVar13.a;
                return new akil(eoscVar, eoscVar2, ahnhVar16.sL, ahnhVar16.uI, ahnhVar16.Cg, ahnhVar16.SG);
            case 2429:
                return new akie(this.a.a.qr);
            case 2430:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar17 = ahknVar14.a;
                return new ajzu(ahnhVar17.oS, ahnhVar17.SJ, ahknVar14.iA, ahnhVar17.SL, ahnhVar17.SM);
            case 2431:
                ahkn ahknVar15 = this.a;
                return new akbt((Context) ahknVar15.t.b(), (bajh) ahknVar15.a.SI.b(), ahknVar15.dL, ahknVar15.id);
            case 2432:
                ahkn ahknVar16 = this.a;
                eyik eyikVar3 = ahknVar16.no;
                return new bajh(eyikVar3);
            case 2433:
                ahnh ahnhVar18 = this.a.a;
                return new akcd(ahnhVar18.SJ, ahnhVar18.Qp, ahnhVar18.SK);
            case 2434:
                final eyik eyikVar4 = this.a.a.oO;
                return new ardr() { // from class: arbp
                    @Override // defpackage.ardr
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.enable_show_rcs_capabilities");
                    }
                };
            case 2435:
                final eyik eyikVar5 = this.a.a.oO;
                return new aroh() { // from class: aroe
                    @Override // defpackage.aroh
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_show_pin_convo_on_top");
                    }
                };
            case 2436:
                return Optional.of(this.a.a.aB());
            case 2437:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar19 = ahknVar17.a;
                return new akjm((fdjx) ahnhVar19.oS.b(), (fdjx) ahnhVar19.oQ.b(), ahnhVar19.SP, (asre) ahnhVar19.CD.b(), (cioj) ahnhVar19.SR.b(), ahnhVar19.aG(), (ciok) ahnhVar19.SW.b(), ahnhVar19.ao(), (cogw) ahknVar17.cD.b(), ahnhVar19.SS, ahnhVar19.pQ);
            case 2438:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45627066").b());
            case 2439:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar20 = ahknVar18.a;
                return new cioj((dqsn) ahnhVar20.qq.b(), (fcyh) ahknVar18.cA.b(), (fdjx) ahnhVar20.oS.b(), ahnhVar20.sL, (cogw) ahknVar18.cD.b(), (area) ahnhVar20.SQ.b());
            case 2440:
                final eyik eyikVar6 = this.a.a.oO;
                return new area() { // from class: arch
                    @Override // defpackage.area
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.process_incoming_group_icon_update");
                    }
                };
            case 2441:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45629010").b());
            case 2442:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45629014").b());
            case 2443:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45638248").b());
            case 2444:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45637551").b());
            case 2445:
                ahnh ahnhVar21 = this.a.a;
                return new ciok((aimb) ahnhVar21.rc.b(), ahnhVar21.uM);
            case 2446:
                ahkn ahknVar19 = this.a;
                Context context3 = (Context) ahknVar19.t.b();
                ahnh ahnhVar22 = ahknVar19.a;
                return new akol(context3, (fdjx) ahnhVar22.oS.b(), (fdjx) ahnhVar22.m.b(), ahknVar19.cE, ahnhVar22.AM, ahnhVar22.pM, ahnhVar22.zQ, ahnhVar22.Ah, ahnhVar22.Jq);
            case 2447:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar23 = ahknVar20.a;
                return new ajwg((fdjx) ahnhVar23.m.b(), (fcyh) ahknVar20.cz.b(), ahknVar20.cD, ahnhVar23.CF, (cijw) ahnhVar23.SZ.b());
            case 2448:
                return new cijw(this.a.a.rF);
            case 2449:
                ahnh ahnhVar24 = this.a.a;
                return new akho((fdjx) ahnhVar24.m.b(), (atol) ahnhVar24.Pm.b(), (cifw) ahnhVar24.Pb.b(), (asra) ahnhVar24.Fc.b(), ahnhVar24.dA(), (ardl) ahnhVar24.sB.b(), (awnf) ahnhVar24.sJ.b());
            case 2450:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar25 = ahknVar21.a;
                return new akbc(ahnhVar25.sK, ahnhVar25.AM, ahnhVar25.pQ, ahnhVar25.zO, ahnhVar25.qi, ahnhVar25.Pn, (fcyh) ahknVar21.cA.b(), (fdjx) ahnhVar25.m.b(), (aqnw) ahnhVar25.Gu.b(), ahnhVar25.bH(), ahnhVar25.bJ(), ahnhVar25.bF());
            case 2451:
                return Optional.of((crvm) this.a.a.Il.b());
            case 2452:
                return Optional.of((bycw) this.a.a.HJ.b());
            case 2453:
                ahnh ahnhVar26 = this.a.a;
                return ekhx.r(ahnhVar26.eK(), ahnhVar26.gZ());
            case 2454:
                return new bvvu(this.a.a.rF);
            case 2455:
                return Optional.of((byeb) this.a.a.HJ.b());
            case 2456:
                final eyik eyikVar7 = this.a.a.oO;
                return new apuk() { // from class: apbd
                    @Override // defpackage.apuk
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.group_create_fix_error_cause");
                    }
                };
            case 2457:
                final eyik eyikVar8 = this.a.a.oO;
                return new arkv() { // from class: arkk
                    @Override // defpackage.arkv
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.enable_delete_conversation_timestamp_fix");
                    }
                };
            case 2458:
                ahkn ahknVar22 = this.a;
                return new akkp((fdjx) ahknVar22.a.oS.b(), (fcyh) ahknVar22.cA.b(), (cogw) ahknVar22.cD.b());
            case 2459:
                ahnh ahnhVar27 = this.a.a;
                return new akiu((cbqj) ahnhVar27.yz.b(), (ains) ahnhVar27.pQ.b(), (fdjx) ahnhVar27.oS.b());
            case 2460:
                final eyik eyikVar9 = this.a.a.oO;
                return new ardx() { // from class: arcb
                    @Override // defpackage.ardx
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.log_trace_id_for_leave_operation");
                    }
                };
            case 2461:
                return new arnn() { // from class: arml
                };
            case 2462:
                ahnh ahnhVar28 = this.a.a;
                Optional.of((cbyz) ahnhVar28.Nh.b());
                Optional.of((ccpm) ahnhVar28.tI.b());
                return new akiv((fdjx) ahnhVar28.oS.b());
            case 2463:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar29 = ahknVar23.a;
                fdjx fdjxVar = (fdjx) ahnhVar29.m.b();
                fcyh fcyhVar2 = (fcyh) ahknVar23.cA.b();
                awzf awzfVar = (awzf) ahnhVar29.sI.b();
                chbx chbxVarID = ahnhVar29.iD();
                ahnhVar29.sg();
                awnf awnfVar = (awnf) ahnhVar29.sJ.b();
                ahnhVar29.sa();
                return new akhf(fdjxVar, fcyhVar2, awzfVar, chbxVarID, awnfVar, (ajvr) ahnhVar29.Bm.b(), (cogw) ahknVar23.cD.b());
            case 2464:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar30 = ahknVar24.a;
                return new amra(ahnhVar30.oS, ahnhVar30.Bm, ahknVar24.cD, ahknVar24.dK);
            case 2465:
                return new akfl(this.a.a.m);
            case 2466:
                return new amrl(this.a.a.Tu);
            case 2467:
                ahnh ahnhVar31 = this.a.a;
                return new alfl(ahnhVar31.Ts, ahnhVar31.Tt);
            case 2468:
                ahnh ahnhVar32 = this.a.a;
                return new alfh(ahnhVar32.BR, ahnhVar32.Tr);
            case 2469:
                ahnh ahnhVar33 = this.a.a;
                return new alfm((cmxz) ahnhVar33.BN.b(), ahnhVar33.mW());
            case 2470:
                ahnh ahnhVar34 = this.a.a;
                return new alfj(ahnhVar34.BV, ahnhVar34.Tr);
            case 2471:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar35 = ahknVar25.a;
                return new cllw(ahnhVar35.kc(), (fcyh) ahknVar25.cz.b(), (fdjx) ahnhVar35.oQ.b());
            case 2472:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar36 = ahknVar26.a;
                return new aknk(ahnhVar36.m, ahnhVar36.oS, ahknVar26.dK, ahknVar26.iA, ahnhVar36.Tx, ahnhVar36.Na);
            case 2473:
                ahkn ahknVar27 = this.a;
                egyt egytVar = (egyt) ahknVar27.dj.b();
                ahnh ahnhVar37 = ahknVar27.a;
                return new asqr(egytVar, ahknVar27.cD, (dqsn) ahnhVar37.qq.b(), ahknVar27.mU, ahknVar27.np, ahnhVar37.vR, ahnhVar37.Ax, (aqmq) ahnhVar37.QG.b(), (fdjx) ahnhVar37.oQ.b());
            case 2474:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar38 = ahknVar28.a;
                return new anfx(ahnhVar38.oQ, ahnhVar38.oS, ahnhVar38.Mq, ahknVar28.ic);
            case 2475:
                ahnh ahnhVar39 = this.a.a;
                return new akmx(ahnhVar39.oQ, ahnhVar39.TB);
            case 2476:
                ahnh ahnhVar40 = this.a.a;
                return new akcv(ahnhVar40.TA, ahnhVar40.AB);
            case 2477:
                final eyik eyikVar10 = this.a.a.oO;
                return new arqv() { // from class: arqr
                    @Override // defpackage.arqv
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.inject_conversation_repository_in_self_identity_selector");
                    }
                };
            case 2478:
                return new angb(this.a.a.TD);
            case 2479:
                return new albb(this.a.a.BY);
            case 2480:
                return new akla(this.a.a.m);
            case 2481:
                ahnh ahnhVar41 = this.a.a;
                return new akkw(ahnhVar41.oQ, ahnhVar41.TB);
            case 2482:
                ahnh ahnhVar42 = this.a.a;
                return new asro(ahnhVar42.sK, ahnhVar42.sJ, ahnhVar42.Pn, ahnhVar42.bF());
            case 2483:
                final eyik eyikVar11 = this.a.a.oO;
                return new aryo() { // from class: arya
                    @Override // defpackage.aryo
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.rcs_report_pipeline_use_my_identity");
                    }
                };
            case 2484:
                return Optional.of(this.a.a.eT());
            case 2485:
                final eyik eyikVar12 = this.a.a.oO;
                return new aryq() { // from class: arye
                    @Override // defpackage.aryq
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.send_rcs_report_mls_signing_interceptor_flag");
                    }
                };
            case 2486:
                final eyik eyikVar13 = this.a.a.oO;
                return new aryp() { // from class: aryc
                    @Override // defpackage.aryp
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.report_pipeline_logs_imdn_sending");
                    }
                };
            case 2487:
                chgf chgfVar = new chgf();
                ahnh ahnhVar43 = this.a.a;
                chgb chgbVarIO = ahnhVar43.iO();
                chep chepVarIL = ahnhVar43.iL();
                chfk chfkVarIN = ahnhVar43.iN();
                cmnp cmnpVar = (cmnp) ahnhVar43.Gk.b();
                awxo awxoVar = (awxo) ahnhVar43.sP.b();
                eyik eyikVar14 = ahnhVar43.TH;
                chfn chfnVar = new chfn(cmnpVar, awxoVar, (asro) eyikVar14.b());
                chfh chfhVar = new chfh();
                ahkn ahknVar29 = ahnhVar43.a;
                chel chelVarIK = ahnhVar43.iK();
                chfc chfcVarIM = ahnhVar43.iM();
                chge chgeVar = new chge(ahknVar29.cs(), (awxo) ahnhVar43.sP.b(), (asro) eyikVar14.b());
                asbs asbsVar = (asbs) ahnhVar43.OA.b();
                ahnhVar43.sb();
                return chey.a(chgfVar, chgbVarIO, chepVarIL, chfkVarIN, chfnVar, chfhVar, chelVarIK, chfcVarIM, chgeVar, asbsVar, (apwn) ahnhVar43.Bg.b());
            case 2488:
                ahnh ahnhVar44 = this.a.a;
                return chca.a(ahnhVar44.iF(), ahnhVar44.iE(), ahnhVar44.iG());
            case 2489:
                return Optional.of(this.a.a.hc());
            case 2490:
                final eyik eyikVar15 = this.a.a.oO;
                return new arob() { // from class: arnj
                    @Override // defpackage.arob
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.use_mls_group_rpc_in_group_operations");
                    }
                };
            case 2491:
                return chdc.a(this.a.a.iH());
            case 2492:
                ahnh ahnhVar45 = this.a.a;
                return chdx.a(ahnhVar45.iJ(), new chea(ahnhVar45.TU), ahnhVar45.iI(), new chdy());
            case 2493:
                return new ahmd(this);
            case 2494:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar46 = ahknVar30.a;
                return new cnhg((asrc) ahnhVar46.EQ.b(), ahnhVar46.qM, ahnhVar46.PC, (cnck) ahnhVar46.PB.b(), (cnas) ahnhVar46.TT.b(), (cnlh) ahnhVar46.xZ.b(), (awxo) ahnhVar46.sP.b(), (awjh) ahnhVar46.sK.b(), (awnf) ahnhVar46.sJ.b(), (awjd) ahnhVar46.Pn.b(), (arph) ahnhVar46.ES.b(), (fdjx) ahnhVar46.m.b(), (fcyh) ahknVar30.cA.b(), (ains) ahnhVar46.pQ.b(), ahnhVar46.bF());
            case 2495:
                return new ahme(this);
            case 2496:
                ahnh ahnhVar47 = this.a.a;
                return chjh.a(ahnhVar47.iT(), ahnhVar47.iX(), ahnhVar47.iV(), ahnhVar47.iW(), ahnhVar47.iS(), ahnhVar47.iU(), (aptb) ahnhVar47.Dl.b(), (aprt) ahnhVar47.Uj.b(), ahnhVar47.iR());
            case 2497:
                ahkn ahknVar31 = this.a;
                Context context4 = (Context) ahknVar31.t.b();
                ahnh ahnhVar48 = ahknVar31.a;
                return new aydh(context4, ahnhVar48.zP, ahnhVar48.sL, ahnhVar48.uJ, ahnhVar48.ww, ahnhVar48.Jd, ahnhVar48.qG, ahnhVar48.uy, ahnhVar48.HG, ahnhVar48.HI, ahnhVar48.Hf, ahnhVar48.BI, ahnhVar48.yw, ahnhVar48.Cd, ahnhVar48.HW, ahnhVar48.Co, ahnhVar48.vh, ahnhVar48.pE, ahnhVar48.zj, ahnhVar48.TW, ahnhVar48.qq, ahnhVar48.wF, ahnhVar48.TY, ahnhVar48.uI, ahnhVar48.CF, ahnhVar48.MV, ahnhVar48.TZ, ahnhVar48.yx, ahnhVar48.IE, ahnhVar48.Cp, (Optional) ((eyig) ahknVar31.kd).a, ahknVar31.ku, ahnhVar48.IH, (eosc) ahknVar31.aJ.b(), ahnhVar48.AM, eyie.a(ahnhVar48.Uc), ahnhVar48.qi, ahnhVar48.Ud, (dzuc) ahknVar31.cE.b(), ahnhVar48.Js, ahnhVar48.ux, ahnhVar48.Gt, ahnhVar48.zS, Optional.of((cvrh) ahnhVar48.Ue.b()), ahnhVar48.HP, ahnhVar48.MY, ahknVar31.nr, ahknVar31.ly, ahknVar31.ns, ahnhVar48.Jq, ahnhVar48.CB, (awlc) ahnhVar48.Ug.b(), ahnhVar48.Ax, ahnhVar48.Jz, (apsl) ahnhVar48.Dk.b(), ahnhVar48.Dn, (aptb) ahnhVar48.Dl.b(), (arrc) ahnhVar48.RQ.b(), (aqoe) ahnhVar48.Uh.b(), ahnhVar48.Ar);
            case 2498:
                ahkn ahknVar32 = this.a;
                return new cldr((cczn) ahknVar32.cG.b(), ahknVar32.a.rJ(), (eosc) ahknVar32.y.b(), (eosc) ahknVar32.aJ.b());
            case 2499:
                ahkn ahknVar33 = this.a;
                eyik eyikVar16 = ahknVar33.t;
                ahnh ahnhVar49 = ahknVar33.a;
                return new aydz(eyikVar16, ahnhVar49.Jd, ahnhVar49.TX, ahnhVar49.TY, ahnhVar49.sL, ahnhVar49.TZ);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object t() {
        etyr etyrVar;
        int i = this.b;
        switch (i) {
            case 2500:
                ahkn ahknVar = this.a;
                return new bacb(ahknVar.a.Ci, ahknVar.da);
            case 2501:
                return new bayc(eyie.a(this.a.a.Ub));
            case 2502:
                ahnh ahnhVar = this.a.a;
                return ekhx.v(ahnhVar.ky(), (baye) ahnhVar.Fl.b(), ahnhVar.jL(), ahnhVar.hz(), ahnhVar.lG(), ahnhVar.jP(), new baye[0]);
            case 2503:
                final eyik eyikVar = this.a.a.oO;
                return new arrd() { // from class: arrg
                    @Override // defpackage.arrd
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.add_sms_receiving_log");
                    }
                };
            case 2504:
                ahkn ahknVar2 = this.a;
                cogw cogwVar = (cogw) ahknVar2.cD.b();
                ahnh ahnhVar2 = ahknVar2.a;
                return new cjoj(cogwVar, ahnhVar2.uJ, ahnhVar2.sL, ahnhVar2.uu);
            case 2505:
                ahkn ahknVar3 = this.a;
                return new cvrh((eosc) ahknVar3.p.b(), (eosc) ahknVar3.y.b(), (crbi) ahknVar3.a.Cd.b());
            case 2506:
                ahnh ahnhVar3 = this.a.a;
                return new awlc(ahnhVar3.Uf, (fdjx) ahnhVar3.m.b());
            case 2507:
                return new ekph(this.a.a.jA());
            case 2508:
                final eyik eyikVar2 = this.a.a.oO;
                return new aqoe() { // from class: aqnq
                    @Override // defpackage.aqoe
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.preserve_xms_raw_sender_for_destination_format_logging");
                    }
                };
            case 2509:
                final eyik eyikVar3 = this.a.a.oO;
                return new aprt() { // from class: aoxd
                    @Override // defpackage.aprt
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.enable_class_zero_sms_interceptor");
                    }
                };
            case 2510:
                return Long.valueOf(((ehdm) this.a.a.oF().a.b()).a("com.google.android.apps.messaging.auto", "45670964").b());
            case 2511:
                return (cgxr) ((ehdm) this.a.a.oF().a.b()).a("com.google.android.apps.messaging.auto", "45670965").c();
            case 2512:
                return (evrj) ((ehdm) this.a.a.oF().a.b()).a("com.google.android.apps.messaging.auto", "45688489").c();
            case 2513:
                return ((cmfe) this.a.a.xF.b()).d();
            case 2514:
                return ((cmfe) this.a.a.xF.b()).e();
            case 2515:
                return ((cmfe) this.a.a.xF.b()).b();
            case 2516:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar4 = ahknVar4.a;
                eyik eyikVar4 = ahnhVar4.Us;
                eyik eyikVar5 = ahnhVar4.Ut;
                return new ciyr(eyikVar4, eyikVar5, (atau) ahknVar4.ii.b(), ahnhVar4.js());
            case 2517:
                ahkn ahknVar5 = this.a;
                eosc eoscVar = (eosc) ahknVar5.y.b();
                eosc eoscVar2 = (eosc) ahknVar5.aJ.b();
                eosc eoscVar3 = (eosc) ahknVar5.p.b();
                ahnh ahnhVar5 = ahknVar5.a;
                return new ciyk(eoscVar, eoscVar2, eoscVar3, (asrc) ahnhVar5.EQ.b(), ahnhVar5.ju(), (crru) ahknVar5.ds.b(), ahnhVar5.rQ(), (ciyd) ahknVar5.ff(), (cjae) ahnhVar5.Ps.b());
            case 2518:
                ahkn ahknVar6 = this.a;
                return new ciyu(ahknVar6.a.jz(), (cogw) ahknVar6.cD.b(), (eosc) ahknVar6.p.b());
            case 2519:
                return new ekph(new cihf(new cihe(this.a.a.rF)));
            case 2520:
                final eyik eyikVar6 = this.a.a.oO;
                return new arui() { // from class: artk
                    @Override // defpackage.arui
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.enable_report_disabled_by_config_version_in_rcs_availability");
                    }
                };
            case 2521:
                final eyik eyikVar7 = this.a.a.oO;
                return new arwx() { // from class: arwp
                    @Override // defpackage.arwx
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.enable_chat_readiness_manager_in_rcs_settings");
                    }
                };
            case 2522:
                final eyik eyikVar8 = this.a.a.oO;
                return new dflk() { // from class: dfjc
                    @Override // defpackage.dflk
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("cslib.enable_consent_free_provisioning");
                    }
                };
            case 2523:
                return new arxa() { // from class: arwv
                };
            case 2524:
                ahnh ahnhVar6 = this.a.a;
                return new ahra((ahrc) ahnhVar6.UB.b(), (cqsx) ahnhVar6.zx.b(), new aoxx(ahnhVar6.oO));
            case 2525:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar7 = ahknVar7.a;
                return new ahsd((fdjx) ahnhVar7.m.b(), (fcyh) ahknVar7.bM.b(), (fcyh) ahknVar7.cz.b(), new ahsl((afhk) ahnhVar7.GB.b(), (cogw) ahnhVar7.a.cD.b()));
            case 2526:
                return Long.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45428284").b());
            case 2527:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar8 = ahknVar8.a;
                return new bvld((fdjx) ahnhVar8.oS.b(), ahnhVar8.qK, ahknVar8.nt);
            case 2528:
                final eyik eyikVar9 = this.a.a.oO;
                return new aqbe() { // from class: apky
                    @Override // defpackage.aqbe
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.replace_subscription_in_conversation_details_flags");
                    }
                };
            case 2529:
                final eyik eyikVar10 = this.a.a.oO;
                return new aqcd() { // from class: apml
                    @Override // defpackage.aqcd
                    public final boolean a() {
                        return ((eoth) eyikVar10.b()).a("bugle.use_sequential_executor_for_ditto_message_update_pushes");
                    }
                };
            case 2530:
                final eyik eyikVar11 = this.a.a.oO;
                return new areg() { // from class: arct
                    @Override // defpackage.areg
                    public final boolean a() {
                        return ((eoth) eyikVar11.b()).a("bugle.show_rcs_group_icon_in_ditto");
                    }
                };
            case 2531:
                final eyik eyikVar12 = this.a.a.oO;
                return new aqad() { // from class: apjd
                    @Override // defpackage.aqad
                    public final boolean a() {
                        return ((eoth) eyikVar12.b()).a("bugle.populate_participant_to_ditto_message");
                    }
                };
            case 2532:
                final eyik eyikVar13 = this.a.a.oO;
                return new aqoz() { // from class: aqor
                    @Override // defpackage.aqoz
                    public final boolean a() {
                        return ((eoth) eyikVar13.b()).a("bugle.use_optimized_conversation_details_for_conversation_group_search");
                    }
                };
            case 2533:
                return Optional.of((cfya) this.a.a.UO.b());
            case 2534:
                ahnh ahnhVar9 = this.a.a;
                ahkn ahknVar9 = ahnhVar9.a;
                return cfys.a(new cfyi(ahknVar9.y, ahnhVar9.tc, eyil.a(ahnhVar9.UK), eyil.a(ahnhVar9.UL), eyil.a(ahnhVar9.UM), ahnhVar9.c, ahnhVar9.tf, ahknVar9.dh, ahnhVar9.FS, ahnhVar9.UN), (cedm) ahnhVar9.xj.b(), eyie.a(ahnhVar9.vY), ahnhVar9.FP, (cezv) ahnhVar9.tc.b());
            case 2535:
                return new cfyr(this.a.a.rF);
            case 2536:
                return new cfxz(this.a.a.rF);
            case 2537:
                return new cfxl(this.a.a.rF);
            case 2538:
                final eyik eyikVar14 = this.a.a.oO;
                return new apsa() { // from class: aoxn
                    @Override // defpackage.apsa
                    public final boolean a() {
                        return ((eoth) eyikVar14.b()).a("bugle.enable_ditto_satellite_mode_metrics_fix");
                    }
                };
            case 2539:
                ahkn ahknVar10 = this.a;
                eosc eoscVar4 = (eosc) ahknVar10.p.b();
                eosc eoscVar5 = (eosc) ahknVar10.y.b();
                ahnh ahnhVar10 = ahknVar10.a;
                return new ceyg(eoscVar4, eoscVar5, ahnhVar10.qk, (aofc) ahnhVar10.yD.b(), (anty) ahnhVar10.Ax.b(), (ajvr) ahnhVar10.Bm.b());
            case 2540:
                ahkn ahknVar11 = this.a;
                eosc eoscVar6 = (eosc) ahknVar11.p.b();
                eosc eoscVar7 = (eosc) ahknVar11.y.b();
                ahnh ahnhVar11 = ahknVar11.a;
                return new cezf(eoscVar6, eoscVar7, ahnhVar11.UV, ahnhVar11.qi, ahnhVar11.sk, ahknVar11.dL, ahnhVar11.yD);
            case 2541:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar12 = ahknVar12.a;
                return new bwqd((fdjx) ahnhVar12.m.b(), ahnhVar12.US, ahnhVar12.UU, (egyt) ahknVar12.dj.b(), ahnhVar12.UR);
            case 2542:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar13 = ahknVar13.a;
                return new bwqn(ahnhVar13.m, ahknVar13.cA, ahnhVar13.sL, ahnhVar13.EK, ahnhVar13.pT, ahnhVar13.sk, ahknVar13.cD, ahnhVar13.UR);
            case 2543:
                ahkn ahknVar14 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar14.cz.b();
                ahnh ahnhVar14 = ahknVar14.a;
                return new bwqa(fcyhVar, ahnhVar14.EM, ahnhVar14.EK, ahnhVar14.pT);
            case 2544:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar15 = ahknVar15.a;
                return new bwpt(ahnhVar15.oQ, ahknVar15.cz, ahknVar15.bM, ahnhVar15.Ax, ahnhVar15.AB, ahnhVar15.UR, ahnhVar15.sk, ahknVar15.cD, ahnhVar15.UT);
            case 2545:
                return new bwqo(this.a.a.pQ);
            case 2546:
                final eyik eyikVar15 = this.a.a.oO;
                return new aqcb() { // from class: apmf
                    @Override // defpackage.aqcb
                    public final boolean a() {
                        return ((eoth) eyikVar15.b()).a("bugle.use_ditto_throttler_for_dark_launch");
                    }
                };
            case 2547:
                final eyik eyikVar16 = this.a.a.oO;
                return new aqca() { // from class: apmh
                    @Override // defpackage.aqca
                    public final boolean a() {
                        return ((eoth) eyikVar16.b()).a("bugle.use_ditto_throttler");
                    }
                };
            case 2548:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar16 = ahknVar16.a;
                return new bvqd(ahnhVar16.pb, ahnhVar16.Vb, ahnhVar16.Vd, ahnhVar16.Vf, (awlc) ahnhVar16.Vh.b(), ahknVar16.cD);
            case 2549:
                ahnh ahnhVar17 = this.a.a;
                avbj avbjVarDL = ahnhVar17.dL();
                eyik eyikVar17 = ahnhVar17.Va;
                eyikVar17.getClass();
                Object objB = eyikVar17.b();
                objB.getClass();
                long jLongValue = ((Number) objB).longValue();
                Duration durationOfMinutes = Duration.ofMinutes(1L);
                Object objB2 = eyikVar17.b();
                objB2.getClass();
                avbi avbiVarA = avbjVarDL.a(jLongValue, durationOfMinutes.dividedBy(((Number) objB2).longValue()));
                avbiVarA.b();
                return avbiVarA;
            case 2550:
                return Double.valueOf(((ehdm) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto", "45676521").a());
            case 2551:
                return Long.valueOf(((ehdm) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto", "45664785").b());
            case 2552:
                ahnh ahnhVar18 = this.a.a;
                avbj avbjVarDL2 = ahnhVar18.dL();
                eyik eyikVar18 = ahnhVar18.Vc;
                eyikVar18.getClass();
                Object objB3 = eyikVar18.b();
                objB3.getClass();
                long jLongValue2 = ((Number) objB3).longValue();
                Duration durationOfMinutes2 = Duration.ofMinutes(5L);
                Object objB4 = eyikVar18.b();
                objB4.getClass();
                avbi avbiVarA2 = avbjVarDL2.a(jLongValue2, durationOfMinutes2.dividedBy(((Number) objB4).longValue()));
                avbiVarA2.b();
                return avbiVarA2;
            case 2553:
                return Long.valueOf(((ehdm) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto", "45675902").b());
            case 2554:
                ahnh ahnhVar19 = this.a.a;
                avbj avbjVarDL3 = ahnhVar19.dL();
                eyik eyikVar19 = ahnhVar19.Ve;
                eyikVar19.getClass();
                Object objB5 = eyikVar19.b();
                objB5.getClass();
                long jLongValue3 = ((Number) objB5).longValue();
                Duration durationOfMinutes3 = Duration.ofMinutes(20L);
                Object objB6 = eyikVar19.b();
                objB6.getClass();
                avbi avbiVarA3 = avbjVarDL3.a(jLongValue3, durationOfMinutes3.dividedBy(((Number) objB6).longValue()));
                avbiVarA3.b();
                return avbiVarA3;
            case 2555:
                return Long.valueOf(((ehdm) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto", "45675903").b());
            case 2556:
                ahnh ahnhVar20 = this.a.a;
                return new awlc(ahnhVar20.Vg, (fdjx) ahnhVar20.m.b());
            case 2557:
                ahnh ahnhVar21 = this.a.a;
                return new ekph(new bvqe((aypz) ahnhVar21.wW.b(), (aqca) ahnhVar21.UY.b()));
            case 2558:
                return new aqox() { // from class: aqon
                };
            case 2559:
                return new bvtz(this.a.a.rF);
            case 2560:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar22 = ahknVar17.a;
                return new ayld(ahnhVar22.Vm, ahnhVar22.FS, ahnhVar22.uE, ahknVar17.y, ahknVar17.hX, ahnhVar22.pI);
            case 2561:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar23 = ahknVar18.a;
                return new bvsl(ahknVar18.hZ, ahnhVar23.xk, (eosc) ahknVar18.y.b(), ahnhVar23.qq, ahnhVar23.uE);
            case 2562:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar24 = ahknVar19.a;
                eyik eyikVar20 = ahnhVar24.qo;
                eyik eyikVar21 = ahnhVar24.un;
                eyik eyikVar22 = ahknVar19.dL;
                eyik eyikVar23 = ahknVar19.id;
                eyik eyikVar24 = ahnhVar24.qi;
                eyik eyikVarA = eyil.a(ahnhVar24.pE);
                eyik eyikVar25 = ahnhVar24.Vo;
                eyik eyikVar26 = ahnhVar24.Vp;
                eyik eyikVar27 = ahnhVar24.Vq;
                eyik eyikVarA2 = eyil.a(ahnhVar24.pC);
                eyik eyikVar28 = ahnhVar24.Mp;
                return new baeb(eyikVar20, eyikVar21, ahnhVar24.QP, eyikVar22, eyikVar23, eyikVar24, eyikVarA, eyikVar25, eyikVar26, eyikVar27, ahnhVar24.QM, eyikVarA2, eyikVar28);
            case 2563:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.disable_star_menu_item_for_scheduled_messages"));
            case 2564:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.fix_badges_view_padding_bugs"));
            case 2565:
                return new byen(this.a.a.FD);
            case 2566:
                return Long.valueOf(((ehdm) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto", "45659303").b());
            case 2567:
                final eyik eyikVar29 = this.a.a.oO;
                return new apsk() { // from class: aoxz
                    @Override // defpackage.apsk
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.enable_message_update_async_action_metrics");
                    }
                };
            case 2568:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar25 = ahknVar20.a;
                return new axml(ahnhVar25.Vu, ahnhVar25.wa, eyil.a(ahnhVar25.xd), ahnhVar25.FP, ahnhVar25.EG, ahnhVar25.FU, ahknVar20.y, ahknVar20.p, ahknVar20.cD, ahnhVar25.c, ahnhVar25.Gc, ahknVar20.dh);
            case 2569:
                ahnh ahnhVar26 = this.a.a;
                auxm auxmVarDK = ahnhVar26.dK();
                eyik eyikVar30 = ahnhVar26.xf;
                eyikVar30.getClass();
                Object objB7 = eyikVar30.b();
                objB7.getClass();
                return auxmVarDK.a(((Number) objB7).longValue());
            case 2570:
                ahkn ahknVar21 = this.a;
                eosc eoscVar8 = (eosc) ahknVar21.y.b();
                ahnh ahnhVar27 = ahknVar21.a;
                return new bvin(eoscVar8, (cehg) ahnhVar27.xk.b(), (Optional) ahknVar21.hZ.b(), ahnhVar27.UP, (crma) ahknVar21.da.b(), (cfeh) ahnhVar27.Gc.b(), ahknVar21.dh);
            case 2571:
                ahkn ahknVar22 = this.a;
                Context context = (Context) ahknVar22.t.b();
                eyik eyikVar31 = ahknVar22.a.uq;
                cqce cqceVar = bwvu.a;
                String str = (String) ccze.G.e();
                Locale localeF = lad.a(context.getResources().getConfiguration()).f(0);
                ebun ebunVar = (ebun) eyikVar31.b();
                try {
                    etyrVar = (etyr) evsn.parseFrom(etyr.a, (byte[]) ccze.H.e());
                    if (etyrVar.b.size() == 0) {
                        bwvu.a.r("StickerMarketConfig is empty!");
                    }
                } catch (evtj e) {
                    bwvu.a.o("getStickerMarketConfig:", e);
                    etyrVar = etyr.a;
                }
                ebunVar.q(str, localeF, etyrVar);
                cqbd cqbdVarC = bwvu.a.c();
                cqbdVarC.I("Providing ExpressiveStickerClient with metadata.");
                cqbdVarC.A(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
                cqbdVarC.A("locale", localeF);
                cqbdVarC.r();
                ebunVar.getClass();
                return ebunVar;
            case 2572:
                ahkn ahknVar23 = this.a;
                return new bwvq(eyil.a(ahknVar23.a.Vz), ahknVar23.aI);
            case 2573:
                ahnh ahnhVar28 = this.a.a;
                return new axwu(ahnhVar28.FP, ahnhVar28.EG, ahnhVar28.FU, ahnhVar28.Gc, ahnhVar28.wa);
            case 2574:
                ahnh ahnhVar29 = this.a.a;
                return new cfdh(ahnhVar29.Gc, ahnhVar29.UP, ahnhVar29.wa, (fdjx) ahnhVar29.oS.b());
            case 2575:
                final eyik eyikVar32 = this.a.a.oO;
                return new aqbc() { // from class: apkw
                    @Override // defpackage.aqbc
                    public final boolean a() {
                        return ((eoth) eyikVar32.b()).a("bugle.remove_rebind_to_tachyon_flags");
                    }
                };
            case 2576:
                ahkn ahknVar24 = this.a;
                return new cmvs((ecjh) ahknVar24.a.VI.b(), (cogw) ahknVar24.cD.b());
            case 2577:
                ahkn ahknVar25 = this.a;
                cmvt cmvtVar = new cmvt((ains) ahknVar25.a.c.b());
                ehvr ehvrVarK = ehvs.k();
                ((ehvl) ehvrVarK).a = "SyncManagerData";
                ehvrVarK.d(cmvh.a);
                ehvrVarK.c(cmvtVar);
                return ahknVar25.ev().a(ehvrVarK.a(), (ecev) ahknVar25.aL.b());
            case 2578:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar30 = ahknVar26.a;
                return new cnrs(ahnhVar30.pB, ahnhVar30.VL, ahnhVar30.VM, ahnhVar30.VS, ahnhVar30.Cp, ahknVar26.aJ, ahknVar26.da, ahnhVar30.VT);
            case 2579:
                return Optional.of(new cnrb(this.a.a.VK));
            case 2580:
                return new cnra(this.a.a.rF);
            case 2581:
                return new cnur((cnuk) this.a.a.pT());
            case 2582:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar31 = ahknVar27.a;
                eyik eyikVar33 = ahknVar27.t;
                eyik eyikVar34 = ahnhVar31.us;
                eyik eyikVar35 = ahnhVar31.c;
                eyik eyikVar36 = ahnhVar31.pQ;
                eyik eyikVar37 = ahnhVar31.VO;
                return new cnsy(eyikVar33, eyikVar34, eyikVar35, eyikVar36, eyikVar37, ahnhVar31.uv, ahnhVar31.VP, ahknVar27.cE, ahnhVar31.VQ, ahnhVar31.VR, ahnhVar31.Io, eyikVar37);
            case 2583:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar32 = ahknVar28.a;
                return new cnsz(ahknVar28.t, ahnhVar32.us, ahnhVar32.VN, ahnhVar32.uv);
            case 2584:
                ahnh ahnhVar33 = this.a.a;
                return new cmof(ahnhVar33.qi, ahnhVar33.ur);
            case 2585:
                return new apua() { // from class: apao
                };
            case 2586:
                return new aptz() { // from class: apam
                };
            case 2587:
                final eyik eyikVar38 = this.a.a.oO;
                return new apub() { // from class: apaq
                    @Override // defpackage.apub
                    public final boolean a() {
                        return ((eoth) eyikVar38.b()).a("bugle.fix_max_count_handling_in_sync_cursor_pair");
                    }
                };
            case 2588:
                final eyik eyikVar39 = this.a.a.oO;
                return new asfb() { // from class: aseq
                    @Override // defpackage.asfb
                    public final boolean a() {
                        return ((eoth) eyikVar39.b()).a("bugle.forward_sync_aborts_if_no_permissions");
                    }
                };
            case 2589:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar34 = ahknVar29.a;
                return new cnwh(ahnhVar34.VW, ahnhVar34.Cv, ahknVar29.cI, ahknVar29.dn, ahknVar29.da, ahnhVar34.CZ, ahnhVar34.VT, (Context) ahknVar29.t.b(), (fdjx) ahnhVar34.oQ.b());
            case 2590:
                cobl coblVar = (cobl) this.a.a.Dj.b();
                coblVar.getClass();
                return coblVar;
            case 2591:
                ahnh ahnhVar35 = this.a.a;
                return new ayge(ahnhVar35.wK, ahnhVar35.pf, ahnhVar35.VY);
            case 2592:
                return Long.valueOf(((ehdm) this.a.a.oT().a.b()).a("com.google.android.apps.messaging.auto", "45671462").b());
            case 2593:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar36 = ahknVar30.a;
                return new axog(ahnhVar36.NS, ahnhVar36.qq, ahnhVar36.c, ahknVar30.cD, ahnhVar36.CK, ahnhVar36.Wa);
            case 2594:
                return Long.valueOf(((ehdm) this.a.a.oX().a.b()).a("com.google.android.apps.messaging.auto", "45425217").b());
            case 2595:
                return new axms(this.a.a.pg);
            case 2596:
                ahkn ahknVar31 = this.a;
                Context context2 = (Context) ahknVar31.t.b();
                ahnh ahnhVar37 = ahknVar31.a;
                return new cpik(context2, ahnhVar37.Wd, (fdjx) ahnhVar37.oS.b());
            case 2597:
                ahkn ahknVar32 = this.a;
                ahnh ahnhVar38 = ahknVar32.a;
                return new cpii(ahnhVar38.IH, ahnhVar38.IG, ahknVar32.de, ahnhVar38.SC, ahnhVar38.Cy, ahnhVar38.AM, ahnhVar38.zP, ahnhVar38.GH, ahnhVar38.qN, ahknVar32.ll, ahnhVar38.ws, ahnhVar38.GK, ahnhVar38.sL, (fdjx) ahnhVar38.oQ.b());
            case 2598:
                ahkn ahknVar33 = this.a;
                Context context3 = (Context) ahknVar33.t.b();
                Context context4 = (Context) ahknVar33.t.b();
                eosc eoscVar9 = (eosc) ahknVar33.y.b();
                ddat ddatVar = (ddat) ddav.d;
                if (ddatVar.a == null) {
                    throw new NullPointerException("Null udevsHostName");
                }
                int i2 = ddatVar.b;
                if (ddatVar.c == null) {
                    throw new NullPointerException("Null udevsApiKey");
                }
                ddar ddarVar = new ddar(context4, eoscVar9);
                eosc eoscVar10 = (eosc) ahknVar33.y.b();
                ahnh ahnhVar39 = ahknVar33.a;
                return new cdmb(context3, ddarVar, eoscVar10, ahnhVar39.vh, ahnhVar39.c);
            case 2599:
                ahkn ahknVar34 = this.a;
                eyik eyikVar40 = ahknVar34.aI;
                ahnh ahnhVar40 = ahknVar34.a;
                return new bwwn(ahnhVar40.Cp, ahnhVar40.ut, (eigp) eyikVar40.b(), (eosc) ahknVar34.y.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object u() {
        int i = this.b;
        switch (i) {
            case 2600:
                return Long.valueOf(fava.a(this.a.a.oT()));
            case 2601:
                return Long.valueOf(favb.a(this.a.a.oT()));
            case 2602:
                return new cpga((Context) this.a.t.b());
            case 2603:
                ahnh ahnhVar = this.a.a;
                return new bbau(ahnhVar.Wn, ahnhVar.qq);
            case 2604:
                ahnh ahnhVar2 = this.a.a;
                return ekhx.r(ahnhVar2.aQ(), ahnhVar2.ld());
            case 2605:
                return new anzq(this.a.a.rF);
            case 2606:
                ahkn ahknVar = this.a;
                return new aoap(ahknVar.bM, ahknVar.a.pb);
            case 2607:
                ahkn ahknVar2 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar2.cz.b();
                ahnh ahnhVar3 = ahknVar2.a;
                return new aglr(fcyhVar, (fdjx) ahnhVar3.m.b(), (byeq) ahnhVar3.sG.b(), (cogw) ahknVar2.cD.b(), ahnhVar3.Wp, ahnhVar3.uJ);
            case 2608:
                ahkn ahknVar3 = this.a;
                return new bakl((fcyh) ahknVar3.cz.b(), (dqsn) ahknVar3.a.qq.b());
            case 2609:
                ahnh ahnhVar4 = this.a.a;
                return new aykm(ahnhVar4.sL, ahnhVar4.qq);
            case 2610:
                ahkn ahknVar4 = this.a;
                crqv crqvVar = (crqv) ahknVar4.aT.b();
                dhes dhesVar = (dhes) ahknVar4.aP.b();
                ahnh ahnhVar5 = ahknVar4.a;
                return new cpde(crqvVar, dhesVar, (cmlb) ahnhVar5.rd.b(), ahnhVar5.Ws);
            case 2611:
                final eyik eyikVar = this.a.a.oO;
                return new aqsu() { // from class: aqqv
                    @Override // defpackage.aqsu
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.enable_sim_subscription_info_retriever_in_bugle_prefs_upsell_record");
                    }
                };
            case 2612:
                ahkn ahknVar5 = this.a;
                return new aiul((ecjh) ahknVar5.a.Wu.b(), (eosc) ahknVar5.p.b(), (eosc) ahknVar5.y.b());
            case 2613:
                ahkn ahknVar6 = this.a;
                return aitf.a(ahknVar6.a.mM(), ahknVar6.ev(), (ecev) ahknVar6.aL.b());
            case 2614:
                ahkn ahknVar7 = this.a;
                eyik eyikVar2 = ahknVar7.ny;
                ahnh ahnhVar6 = ahknVar7.a;
                return new aiup(eyikVar2, ahnhVar6.sL, (cmvy) ahnhVar6.pE.b());
            case 2615:
                ahkn ahknVar8 = this.a;
                Context context = (Context) ahknVar8.t.b();
                eyik eyikVar3 = ahknVar8.dn;
                ahnh ahnhVar7 = ahknVar8.a;
                eyik eyikVar4 = ahnhVar7.pf;
                eyik eyikVar5 = ahknVar8.gF;
                eyik eyikVar6 = ahnhVar7.Wx;
                eygg eyggVarA = eyie.a(eyikVar3);
                eyik eyikVar7 = ahnhVar7.uu;
                eyik eyikVar8 = ahnhVar7.qj;
                eygg eyggVarA2 = eyie.a(ahnhVar7.wJ);
                eyik eyikVar9 = ahnhVar7.Wy;
                eygg eyggVarA3 = eyie.a(ahnhVar7.Dt);
                eyik eyikVar10 = ahknVar8.aJ;
                eyik eyikVar11 = ahnhVar7.Wz;
                eyik eyikVar12 = ahnhVar7.Cs;
                eyik eyikVar13 = ahnhVar7.qr;
                eosc eoscVar = (eosc) eyikVar10.b();
                eosc eoscVar2 = (eosc) ahknVar8.p.b();
                eygg eyggVarA4 = eyie.a(ahknVar8.aU);
                asrf asrfVar = (asrf) ahnhVar7.rl.b();
                eygg eyggVarA5 = eyie.a(ahnhVar7.WB);
                eyik eyikVar14 = ahnhVar7.WC;
                eyik eyikVar15 = ahnhVar7.yw;
                eyik eyikVar16 = ahnhVar7.rd;
                awhr awhrVar = (awhr) ahnhVar7.zm.b();
                eyik eyikVar17 = ahnhVar7.Jx;
                eyik eyikVar18 = ahnhVar7.qi;
                eyik eyikVar19 = ahnhVar7.sh;
                eyik eyikVar20 = ahnhVar7.Ih;
                cqbm cqbmVar = (cqbm) ahnhVar7.sX.b();
                eyik eyikVar21 = ahnhVar7.Jt;
                return new ajjo(context, eyikVar4, eyikVar5, eyikVar6, eyggVarA, eyikVar7, ahknVar8.da, eyikVar8, eyggVarA2, eyikVar9, eyggVarA3, eyikVar11, eyikVar12, eyikVar13, eoscVar, eoscVar2, eyggVarA4, asrfVar, eyggVarA5, eyikVar14, eyikVar15, eyikVar16, ahnhVar7.PT, awhrVar, eyikVar17, eyikVar18, eyikVar19, eyikVar20, cqbmVar, eyikVar21);
            case 2616:
                ahkn ahknVar9 = this.a;
                return new crkw(eyie.a(ahknVar9.a.Se), (eosc) ahknVar9.p.b());
            case 2617:
                ahkn ahknVar10 = this.a;
                Context context2 = (Context) ahknVar10.t.b();
                Executor executor = (Executor) ahknVar10.y.b();
                ahnh ahnhVar8 = ahknVar10.a;
                return new cmwd(context2, executor, ahnhVar8.wH, ahnhVar8.wF, ahnhVar8.pf, (cuur) ahnhVar8.wI.b());
            case 2618:
                final eyik eyikVar22 = this.a.a.oO;
                return new aqsj() { // from class: aqqa
                    @Override // defpackage.aqsj
                    public final boolean a() {
                        return ((eoth) eyikVar22.b()).a("bugle.dsdr_set_sim_role_logging_only_if_sub_id_is_known");
                    }
                };
            case 2619:
                ahnh ahnhVar9 = this.a.a;
                cmtg cmtgVar = (cmtg) ahnhVar9.wE.b();
                cmtp cmtpVar = (cmtp) ahnhVar9.WA.b();
                return new cmtl(cmtgVar, cmtpVar, (cmux) ahnhVar9.wA.b(), (cmuy) ahnhVar9.wz.b(), (cmve) ahnhVar9.wB.b(), (cmuo) ahnhVar9.wC.b());
            case 2620:
                ahnh ahnhVar10 = this.a.a;
                return new cmtp(ahnhVar10.pf, ahnhVar10.wE, ahnhVar10.wI, ahnhVar10.wA, ahnhVar10.wz, ahnhVar10.wB, ahnhVar10.wC);
            case 2621:
                ahkn ahknVar11 = this.a;
                Context context3 = (Context) ahknVar11.t.b();
                ahnh ahnhVar11 = ahknVar11.a;
                return new cgor(context3, (cgkb) ahnhVar11.oV.b(), (Optional) ahnhVar11.qI.b(), ahnhVar11.pe);
            case 2622:
                ahkn ahknVar12 = this.a;
                eosc eoscVar3 = (eosc) ahknVar12.aJ.b();
                ahnh ahnhVar12 = ahknVar12.a;
                return new cauw(eoscVar3, ahnhVar12.yw, ahnhVar12.uJ);
            case 2623:
                ahkn ahknVar13 = this.a;
                ecjh ecjhVar = (ecjh) ahknVar13.nz.b();
                ahnh ahnhVar13 = ahknVar13.a;
                return new ajdy(ecjhVar, ahnhVar13.WJ, (fdjx) ahnhVar13.m.b(), (eizx) ahknVar13.nA.b(), ahknVar13.af());
            case 2624:
                return Optional.of(this.a.a.aq());
            case 2625:
                ahkn ahknVar14 = this.a;
                return ajbt.a((Context) ahknVar14.t.b(), (fdjx) ahknVar14.a.oQ.b());
            case 2626:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar14 = ahknVar15.a;
                return new ajcg((fdjx) ahnhVar14.m.b(), (egbf) ahnhVar14.pG.b(), (ajdy) ahnhVar14.WG.b(), ahnhVar14.ar(), ahknVar15.af());
            case 2627:
                ahkn ahknVar16 = this.a;
                Object objEZ = ahknVar16.eZ();
                Context context4 = (Context) ahknVar16.t.b();
                ejxr ejxrVar = (ejxr) ahknVar16.dp.b();
                cogw cogwVar = (cogw) ahknVar16.cD.b();
                ahnh ahnhVar15 = ahknVar16.a;
                return aimr.a(objEZ, context4, ejxrVar, cogwVar, ahnhVar15.qY, (aipj) ahnhVar15.rb.b(), (Executor) ahknVar16.p.b());
            case 2628:
                ahnh ahnhVar16 = this.a.a;
                return new ajfe((fdjx) ahnhVar16.oQ.b(), ahnhVar16.uJ, ahnhVar16.WK);
            case 2629:
                return fakc.a(this.a.a.nO());
            case 2630:
                ahnh ahnhVar17 = this.a.a;
                return new ccww(ahnhVar17.pl, ahnhVar17.sL, ahnhVar17.qi);
            case 2631:
                return new aqtc() { // from class: aqrl
                };
            case 2632:
                return new aptg() { // from class: aozk
                };
            case 2633:
                ahkn ahknVar17 = this.a;
                cogw cogwVar2 = (cogw) ahknVar17.cD.b();
                ahnh ahnhVar18 = ahknVar17.a;
                eyik eyikVar23 = ahnhVar18.tt;
                return new aijz(cogwVar2, eyikVar23, (aika) ahnhVar18.uM.b(), (aixq) ahnhVar18.Ar.b(), ahnhVar18.sk, ahnhVar18.sL);
            case 2634:
                return Boolean.valueOf(apkr.a((eoth) this.a.a.oO.b()));
            case 2635:
                final eyik eyikVar24 = this.a.a.oO;
                return new aqzb() { // from class: aqwk
                    @Override // defpackage.aqzb
                    public final boolean a() {
                        return ((eoth) eyikVar24.b()).a("bugle.defer_storing_file_in_telephony_db");
                    }
                };
            case 2636:
                return new aqzc() { // from class: aqwi
                };
            case 2637:
                final eyik eyikVar25 = this.a.a.oO;
                return new aqzd() { // from class: aqwo
                    @Override // defpackage.aqzd
                    public final boolean a() {
                        return ((eoth) eyikVar25.b()).a("bugle.defer_sync_to_telephony_incoming_rcs_file_transfer");
                    }
                };
            case 2638:
                return new aqze() { // from class: aqwm
                };
            case 2639:
                ahnh ahnhVar19 = this.a.a;
                return new cmnx((alrj) ahnhVar19.qi.b(), ahnhVar19.AE);
            case 2640:
                return new cmsj((cmvy) this.a.a.pE.b());
            case 2641:
                return new avnb(this.a.a.rF);
            case 2642:
                return new ckih(this.a.a.sh);
            case 2643:
                ahnh ahnhVar20 = this.a.a;
                return new cqsr(eyie.a(ahnhVar20.zx), eyie.a(ahnhVar20.Xb));
            case 2644:
                ahkn ahknVar18 = this.a;
                Context context5 = (Context) ahknVar18.t.b();
                ahnh ahnhVar21 = ahknVar18.a;
                aipo aipoVar = (aipo) ahnhVar21.us.b();
                ains ainsVar = (ains) ahnhVar21.c.b();
                return new cqsp(context5, aipoVar, ainsVar, ahknVar18.lA);
            case 2645:
                return new cgvz(this.a.a.qN);
            case 2646:
                ahnh ahnhVar22 = this.a.a;
                return new bahm(ahnhVar22.Xe, ahnhVar22.sI, ahnhVar22.DA, ahnhVar22.yJ);
            case 2647:
                return Long.valueOf(fala.a(this.a.a.nT()));
            case 2648:
                return new cnpp(this.a.a.qr);
            case 2649:
                return new aqmo() { // from class: aqmd
                };
            case 2650:
                return Long.valueOf(faqm.a(this.a.a.ow()));
            case 2651:
                return Boolean.valueOf(faql.a(this.a.a.ow()));
            case 2652:
                final eyik eyikVar26 = this.a.a.oO;
                return new dfmi() { // from class: dfko
                    @Override // defpackage.dfmi
                    public final boolean a() {
                        return ((eoth) eyikVar26.b()).a("cslib.enable_compose_actions");
                    }
                };
            case 2653:
                return Optional.of(this.a.a.rO());
            case 2654:
                return new ekph((chwq) this.a.a.uu.b());
            case 2655:
                ahkn ahknVar19 = this.a;
                eosc eoscVar4 = (eosc) ahknVar19.y.b();
                ahnh ahnhVar23 = ahknVar19.a;
                return new cfew(eoscVar4, (cfgs) ahnhVar23.Xo.b(), (ceop) ahnhVar23.tq.b(), (crny) ahnhVar23.pf.b(), (crmx) ahnhVar23.pB.b(), (cqpz) ahknVar19.aN.b());
            case 2656:
                final eyik eyikVar27 = this.a.a.oO;
                return new asem() { // from class: asee
                    @Override // defpackage.asem
                    public final boolean a() {
                        return ((eoth) eyikVar27.b()).a("bugle.enable_set_receive_messages_pong_interval");
                    }
                };
            case 2657:
                ahkn ahknVar20 = this.a;
                ekgi ekgiVarH = ekgp.h(9);
                ezji ezjiVar = ezji.TACHYGRAM_CONTROL_MESSAGE;
                ahnh ahnhVar24 = ahknVar20.a;
                ekgiVarH.i(ezjiVar, ahnhVar24.Xv);
                ekgiVarH.i(ezji.TACHYGRAM_MESSAGE, ahnhVar24.XC);
                ekgiVarH.i(ezji.GROUP, ahnhVar24.XD);
                ekgiVarH.i(ezji.DITTO, ahnhVar24.YA);
                ekgiVarH.i(ezji.WIREBALL, ahnhVar24.YA);
                ekgiVarH.i(ezji.BUGLE_AGENT, ahnhVar24.YA);
                ekgiVarH.i(ezji.REFLECTED_TACHYGRAM_MESSAGE, ahnhVar24.YE);
                ekgiVarH.i(ezji.SERVER_MLS_CONTROL_MESSAGE, ahnhVar24.YF);
                ekgiVarH.i(ezji.USERDATA, ahnhVar24.YG);
                return ekgiVarH.h();
            case 2658:
                return this.a.a.kH();
            case 2659:
                ahnh ahnhVar25 = this.a.a;
                return cnkg.a(ahnhVar25.XA, ahnhVar25.XB, ahnhVar25.LM);
            case 2660:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar26 = ahknVar21.a;
                return new cnes(ahnhVar26.rd(), (cmxn) ahnhVar26.xO.b(), ahnhVar26.kF(), (eosc) ahknVar21.p.b());
            case 2661:
                return new ahmg(this);
            case 2662:
                return new ahmh(this);
            case 2663:
                return new ahmi(this);
            case 2664:
                return new ahmj(this);
            case 2665:
                ahnh ahnhVar27 = this.a.a;
                return new chef(ahnhVar27.Ie, (fdjx) ahnhVar27.m.b());
            case 2666:
                cnes cnesVar = (cnes) this.a.a.XA.b();
                cnkd.a(cnesVar);
                return cnesVar;
            case 2667:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar28 = ahknVar22.a;
                return new cfox((bvkr) ahnhVar28.wa.b(), (eosc) ahknVar22.y.b(), ahnhVar28.hQ(), ahnhVar28.FP, eyie.a(ahnhVar28.vY));
            case 2668:
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar29 = ahknVar23.a;
                return new cfki((fdjx) ahnhVar29.oS.b(), (crnp) ahknVar23.cI.b(), (ajln) ahnhVar29.AB.b(), (anty) ahnhVar29.Ax.b(), (alrj) ahnhVar29.qi.b(), (cfkt) ahnhVar29.XF.b());
            case 2669:
                ahnh ahnhVar30 = this.a.a;
                return new cfkt((aofc) ahnhVar30.yD.b(), (fdjx) ahnhVar30.oQ.b(), ahnhVar30.XE);
            case 2670:
                final eyik eyikVar28 = this.a.a.oO;
                return new apxb() { // from class: apfj
                    @Override // defpackage.apxb
                    public final boolean a() {
                        return ((eoth) eyikVar28.b()).a("bugle.use_propagated_identity_in_ditto_start_chat");
                    }
                };
            case 2671:
                ahnh ahnhVar31 = this.a.a;
                return new ayko(ahnhVar31.sL, ahnhVar31.HJ, ahnhVar31.uI);
            case 2672:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar32 = ahknVar24.a;
                return new cfmb(ahnhVar32.uP, (cehg) ahnhVar32.xk.b(), (cexq) ahnhVar32.UQ.b(), ahnhVar32.wv, (eosc) ahknVar24.y.b(), (eosc) ahknVar24.p.b(), ahnhVar32.UX, ahnhVar32.UY, ahnhVar32.Vi, ahnhVar32.UW, ahnhVar32.XJ);
            case 2673:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar33 = ahknVar25.a;
                return new cfou((fdjx) ahnhVar33.oQ.b(), (Context) ahknVar25.t.b(), (bafp) ahnhVar33.ye.b(), (alrj) ahnhVar33.qi.b(), (aofc) ahnhVar33.yD.b(), (bvur) ahknVar25.dL.b(), ahnhVar33.xk, ahnhVar33.qa, ahnhVar33.UH, ahnhVar33.bq());
            case 2674:
                return new aqpa() { // from class: aqot
                };
            case 2675:
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar34 = ahknVar26.a;
                return new cfmr((cehg) ahnhVar34.xk.b(), (ayqp) ahnhVar34.Vn.b(), ahnhVar34.Vl, (baeb) ahnhVar34.Vr.b(), (ains) ahnhVar34.c.b(), (bael) ahknVar26.mU.b(), ahnhVar34.uE, ahnhVar34.pI, (Optional) ahknVar26.hX.b(), ahnhVar34.XM, (eosc) ahknVar26.p.b(), (eosc) ahknVar26.y.b(), ahnhVar34.UQ, ahknVar26.cE, ahnhVar34.XN, (aqad) ahnhVar34.UI.b());
            case 2676:
                ahnh ahnhVar35 = this.a.a;
                return new ceeh(ahnhVar35.AM, ahnhVar35.XL, (fdjx) ahnhVar35.oQ.b());
            case 2677:
                return new awco(this.a.a.Gx);
            case 2678:
                final eyik eyikVar29 = this.a.a.oO;
                return new apsi() { // from class: aoxv
                    @Override // defpackage.apsi
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.enable_list_messages_timer_metrics");
                    }
                };
            case 2679:
                ahkn ahknVar27 = this.a;
                Context context6 = (Context) ahknVar27.t.b();
                ahnh ahnhVar36 = ahknVar27.a;
                return new cfnq(context6, (aypg) ahnhVar36.Ql.b(), ahnhVar36.wv, ahnhVar36.AG, (eosc) ahknVar27.y.b(), (eosc) ahknVar27.p.b(), (cehg) ahnhVar36.xk.b(), (ains) ahnhVar36.c.b(), (cogw) ahknVar27.cD.b(), (bagw) ahnhVar36.CH.b(), (bahv) ahnhVar36.un.b(), (bveg) ahnhVar36.yx.b(), (crmx) ahnhVar36.pB.b(), (aipo) ahnhVar36.us.b(), (alrj) ahnhVar36.qi.b(), (ceku) ahnhVar36.FS.b(), (bbdl) ahnhVar36.qG.b(), (Optional) ahknVar27.hX.b(), ahnhVar36.XP, ahnhVar36.NI);
            case 2680:
                return new cqle((crny) this.a.a.pf.b());
            case 2681:
                ahkn ahknVar28 = this.a;
                crqv crqvVar2 = (crqv) ahknVar28.aT.b();
                ahnh ahnhVar37 = ahknVar28.a;
                return new cfns(crqvVar2, (cehg) ahnhVar37.xk.b(), (ajnn) ahnhVar37.UA.b(), ahnhVar37.sh);
            case 2682:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar38 = ahknVar29.a;
                return new cfld(ahnhVar38.XS);
            case 2683:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar39 = ahknVar30.a;
                return new cfkp((fdjx) ahnhVar39.m.b(), (fcyh) ahknVar30.cz.b(), ahnhVar39.SZ, ahnhVar39.XP, ahnhVar39.sj);
            case 2684:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar40 = ahknVar31.a;
                return new cfje((alrj) ahnhVar40.qi.b(), ahnhVar40.jm(), (eosc) ahknVar31.p.b(), ahnhVar40.sj, ahnhVar40.XP, ahnhVar40.Pb, ahnhVar40.XU);
            case 2685:
                final eyik eyikVar30 = this.a.a.oO;
                return new ardw() { // from class: arbz
                    @Override // defpackage.ardw
                    public final boolean a() {
                        return ((eoth) eyikVar30.b()).a("bugle.log_trace_id_for_add_operation");
                    }
                };
            case 2686:
                ahkn ahknVar32 = this.a;
                eosc eoscVar5 = (eosc) ahknVar32.y.b();
                eosc eoscVar6 = (eosc) ahknVar32.p.b();
                ahnh ahnhVar41 = ahknVar32.a;
                return new cfob(eoscVar5, eoscVar6, ahnhVar41.sL, (alrj) ahnhVar41.qi.b(), (cmpy) ahnhVar41.Qe.b(), (asrh) ahnhVar41.Fd.b(), ahnhVar41.pT, (cogw) ahknVar32.cD.b(), ahnhVar41.XP);
            case 2687:
                ahkn ahknVar33 = this.a;
                eosc eoscVar7 = (eosc) ahknVar33.y.b();
                eosc eoscVar8 = (eosc) ahknVar33.p.b();
                ahnh ahnhVar42 = ahknVar33.a;
                return new cflc(eoscVar7, eoscVar8, (cexq) ahnhVar42.UQ.b(), ahnhVar42.xk, ahnhVar42.UW, ahnhVar42.wv, ahnhVar42.XM);
            case 2688:
                ahkn ahknVar34 = this.a;
                Context context7 = (Context) ahknVar34.t.b();
                ahnh ahnhVar43 = ahknVar34.a;
                return new cfjs(context7, (fdjx) ahnhVar43.oQ.b(), (fdjx) ahnhVar43.m.b(), (bvkr) ahnhVar43.wa.b(), (cfis) ahknVar34.nK.b(), Optional.of((bvqv) ahnhVar43.Yb.b()), ahknVar34.dh, (cecr) ahknVar34.nL.b(), ahnhVar43.FP, (Optional) ahknVar34.hX.b(), (cecp) ahknVar34.nM.b(), ahnhVar43.Ye, ahnhVar43.Yf, ahnhVar43.UE, ahknVar34.nt, ahnhVar43.uM, ahnhVar43.rK, ahnhVar43.pQ, ahnhVar43.rJ, ahnhVar43.xk);
            case 2689:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar44 = ahknVar35.a;
                fdjx fdjxVar = (fdjx) ahnhVar44.oS.b();
                fcyh fcyhVar2 = (fcyh) ahknVar35.cA.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar44.m.b();
                eyik eyikVar31 = ahknVar35.aQ;
                return new bvsb(fdjxVar, fcyhVar2, fdjxVar2, ahnhVar44.pQ, ahnhVar44.pb, ahnhVar44.qK, ahknVar35.nL, (egzh) eyikVar31.b(), ahknVar35.cD, ahnhVar44.FP, (aprp) ahnhVar44.FO.b(), ahnhVar44.XY, ahnhVar44.XZ, ahnhVar44.Ya, eyie.a(ahnhVar44.vY));
            case 2690:
                return Long.valueOf(fami.a(this.a.a.oa()));
            case 2691:
                return Long.valueOf(famh.a(this.a.a.oa()));
            case 2692:
                return Long.valueOf(famb.a(this.a.a.oa()));
            case 2693:
                ahkn ahknVar36 = this.a;
                Context context8 = (Context) ahknVar36.t.b();
                ahnh ahnhVar45 = ahknVar36.a;
                return new ceco(context8, Optional.of((bvqv) ahnhVar45.Yb.b()), Optional.of((cyta) ahnhVar45.Yd.b()), (cogw) ahknVar36.cD.b(), ahnhVar45.lt(), (cecr) ahknVar36.nL.b(), ahknVar36.aM, ahnhVar45.Cs, ahknVar36.nM, ahnhVar45.FP, ahnhVar45.Yc);
            case 2694:
                ahnh ahnhVar46 = this.a.a;
                return new cyta((avmp) ahnhVar46.Jm.b(), ahnhVar46.pQ, ahnhVar46.Yc);
            case 2695:
                ahkn ahknVar37 = this.a;
                ahnh ahnhVar47 = ahknVar37.a;
                return new bvsh(ahnhVar47.FP, ahknVar37.nL, ahnhVar47.Yb, (aprp) ahnhVar47.FO.b(), (fdjx) ahnhVar47.oQ.b());
            case 2696:
                ahnh ahnhVar48 = this.a.a;
                return new cedc(ahnhVar48.rW, ahnhVar48.tJ, ahnhVar48.pG, (fdjx) ahnhVar48.m.b());
            case 2697:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar49 = ahknVar38.a;
                return new cfoj((fdjx) ahnhVar49.m.b(), (fdjx) ahnhVar49.oQ.b(), ahknVar38.dh, ahnhVar49.wa);
            case 2698:
                ahkn ahknVar39 = this.a;
                ahnh ahnhVar50 = ahknVar39.a;
                return new cfjk((fdjx) ahnhVar50.m.b(), (fdjx) ahnhVar50.oQ.b(), ahknVar39.dh, Optional.of((bvqv) ahnhVar50.Yb.b()), (cecr) ahknVar39.nL.b());
            case 2699:
                ahnh ahnhVar51 = this.a.a;
                return new cfjr((fdjx) ahnhVar51.oQ.b(), (cexq) ahnhVar51.UQ.b(), (ajoy) ahnhVar51.Yn.b(), (ajln) ahnhVar51.AB.b(), (anty) ahnhVar51.Ax.b(), ahnhVar51.uP, ahnhVar51.xk, (alrj) ahnhVar51.qi.b(), (cfol) ahnhVar51.XI.b(), (aqoz) ahnhVar51.UJ.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object v() {
        int i = this.b;
        switch (i) {
            case 2700:
                ahkn ahknVar = this.a;
                Object objFa = ahknVar.fa();
                eosc eoscVar = (eosc) ahknVar.y.b();
                ahnh ahnhVar = ahknVar.a;
                return new ajoq((ajof) objFa, eoscVar, (ajot) ahnhVar.px(), ahnhVar.av(), ahnhVar.Ym);
            case 2701:
                ahkn ahknVar2 = this.a;
                return new avcs((Context) ahknVar2.t.b(), ahknVar2.da);
            case 2702:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                eosc eoscVar2 = (eosc) ahknVar3.p.b();
                eosc eoscVar3 = (eosc) ahknVar3.y.b();
                eosc eoscVar4 = (eosc) ahknVar3.aJ.b();
                ahnh ahnhVar2 = ahknVar3.a;
                return new ajpj(context, eoscVar2, eoscVar3, eoscVar4, ahnhVar2.qi, ahnhVar2.Yj, ahnhVar2.Yk, ahnhVar2.Yl, ahknVar3.cE);
            case 2703:
                ahkn ahknVar4 = this.a;
                return new avct((Context) ahknVar4.t.b(), ahknVar4.da);
            case 2704:
                ahkn ahknVar5 = this.a;
                Context context2 = (Context) ahknVar5.t.b();
                ahnh ahnhVar3 = ahknVar5.a;
                fdjx fdjxVar = (fdjx) ahnhVar3.oQ.b();
                alrj alrjVar = (alrj) ahnhVar3.qi.b();
                context2.getClass();
                fdjxVar.getClass();
                alrjVar.getClass();
                dcfd dcfdVar = deap.a;
                return new ajps(fdjxVar, ahknVar5.cE, alrjVar, new dedg(context2));
            case 2705:
                return new cfmv((fdjx) this.a.a.m.b());
            case 2706:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar4 = ahknVar6.a;
                return new cflh((fdjx) ahnhVar4.m.b(), (fdjx) ahnhVar4.oQ.b(), (Optional) ((eyig) ahknVar6.hX).a, ahnhVar4.Yf);
            case 2707:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar5 = ahknVar7.a;
                return new cfof((fdjx) ahnhVar5.m.b(), (fdjx) ahnhVar5.oQ.b(), (Optional) ((eyig) ahknVar7.hX).a, ahnhVar5.Yf);
            case 2708:
                ahkn ahknVar8 = this.a;
                return new cfok((cehg) ahknVar8.a.xk.b(), ahknVar8.dh);
            case 2709:
                return new ckmw(this.a.a.Yu);
            case 2710:
                ahnh ahnhVar6 = this.a.a;
                return new ckms(ahnhVar6.jI(), (fdjx) ahnhVar6.oQ.b());
            case 2711:
                ahnh ahnhVar7 = this.a.a;
                return new cbpy(ahnhVar7.AB, ahnhVar7.XF);
            case 2712:
                return new bacp(this.a.a.qi);
            case 2713:
                ahkn ahknVar9 = this.a;
                return new cfga(ahknVar9.a.wa, ahknVar9.y);
            case 2714:
                ahkn ahknVar10 = this.a;
                eosc eoscVar5 = (eosc) ahknVar10.y.b();
                ahnh ahnhVar8 = ahknVar10.a;
                return new bwqr(eoscVar5, (bvus) ahnhVar8.EO.b(), (aypm) ahnhVar8.Qt.b(), ahnhVar8.DL);
            case 2715:
                ahnh ahnhVar9 = this.a.a;
                asyh asyhVarCX = ahnhVar9.cX();
                aszw aszwVarCZ = ahnhVar9.cZ();
                return ((awif) ahnhVar9.qq()).a(ahnhVar9.bk().a() ? new aswt(ahnhVar9.cX()).a.j(aszwVarCZ) : asyhVarCX.j(aszwVarCZ));
            case 2716:
                return new cfpu(this.a.a.YD);
            case 2717:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar10 = ahknVar11.a;
                return new cfqm((fdjx) ahnhVar10.oQ.b(), ahnhVar10.UE, ahknVar11.nt, ekgp.l(elhc.TEXT, ahnhVar10.hX()), ahnhVar10.rk(), ahnhVar10.rj(), ahnhVar10.YC);
            case 2718:
                ahnh ahnhVar11 = this.a.a;
                return new cfra(ahnhVar11.yD, ahnhVar11.Ax, ahnhVar11.AB, ahnhVar11.qi, ahnhVar11.YB, ahnhVar11.sP, ahnhVar11.FM, ahnhVar11.sK, ahnhVar11.LT, (fdjx) ahnhVar11.oS.b());
            case 2719:
                return new cfpv(this.a.a.rc);
            case 2720:
                ahnh ahnhVar12 = this.a.a;
                ahnhVar12.gX();
                return new ccpu((fdjx) ahnhVar12.m.b(), (awjh) ahnhVar12.sK.b(), (awxo) ahnhVar12.sP.b(), (awnf) ahnhVar12.sJ.b(), (apwn) ahnhVar12.Bg.b());
            case 2721:
                return new cfoz(ekgp.l(fely.NEED_PRE_KEYS_PUSH, this.a.a.hU()));
            case 2722:
                return (evrj) ((ehdm) this.a.a.oU().a.b()).a("com.google.android.apps.messaging.auto", "45667228").c();
            case 2723:
                ahkn ahknVar12 = this.a;
                return new cffw(ahknVar12.a.EG, ahknVar12.aT);
            case 2724:
                ahnh ahnhVar13 = this.a.a;
                eyik eyikVar = ahnhVar13.YL;
                aqtt aqttVarBM = ahnhVar13.bM();
                final eyik eyikVar2 = ahnhVar13.oO;
                return new cljl(eyikVar, aqttVarBM, new asat() { // from class: asab
                    @Override // defpackage.asat
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.use_satellite_data_signal_for_periodic_pull");
                    }
                });
            case 2725:
                ahkn ahknVar13 = this.a;
                return new cljn((egsh) ahknVar13.dG.b(), ahknVar13.a.pk());
            case 2726:
                return Long.valueOf(((ehdm) this.a.a.oR().a.b()).a("com.google.android.apps.messaging.auto", "45673327").b());
            case 2727:
                return new clix(this.a.a.YN);
            case 2728:
                return new clid((aimb) this.a.a.rc.b());
            case 2729:
                return new cqhs(new cqhv(this.a.a.rF));
            case 2730:
                final eyik eyikVar3 = this.a.a.oO;
                return new asar() { // from class: arzx
                    @Override // defpackage.asar
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.use_execution_sequencer_for_satellite_notifications");
                    }
                };
            case 2731:
                final eyik eyikVar4 = this.a.a.oO;
                return new asao() { // from class: arzr
                    @Override // defpackage.asao
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.report_ntn_roaming_state_correctly");
                    }
                };
            case 2732:
                final eyik eyikVar5 = this.a.a.oO;
                return new asak() { // from class: arzj
                    @Override // defpackage.asak
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_mms_on_satellite_on_android_b_plus");
                    }
                };
            case 2733:
                final eyik eyikVar6 = this.a.a.oO;
                return new asah() { // from class: arze
                    @Override // defpackage.asah
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.enable_extra_logging_for_satellite");
                    }
                };
            case 2734:
                final eyik eyikVar7 = this.a.a.oO;
                return new asaq() { // from class: arzv
                    @Override // defpackage.asaq
                    public final boolean a() {
                        return ((eoth) eyikVar7.b()).a("bugle.use_execution_sequencer_for_satellite_events_processing");
                    }
                };
            case 2735:
                ahnh ahnhVar14 = this.a.a;
                ahkn ahknVar14 = ahnhVar14.a;
                return Optional.of(new aoha((Context) ahknVar14.t.b(), (anur) ahknVar14.jn.b(), (fdjx) ahnhVar14.oS.b(), (fcyh) ahknVar14.cA.b(), (fdjx) ahnhVar14.m.b(), ahnhVar14.YZ, (aoho) ahnhVar14.YY.b()));
            case 2736:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar15 = ahknVar15.a;
                return new aohi(ahnhVar15.YY, ahknVar15.jn, ahknVar15.cD, ahnhVar15.oS);
            case 2737:
                return new aoho((fdjx) this.a.a.oS.b());
            case 2738:
                ahnh ahnhVar16 = this.a.a;
                return new aoie(ahnhVar16.xI, ahnhVar16.se, ahnhVar16.Zc, ahnhVar16.qB, ahnhVar16.sq);
            case 2739:
                return new ahmk(this);
            case 2740:
                ahkn ahknVar16 = this.a;
                enmr enmrVar = enmr.TRANSPORT_UNKNOWN;
                ahnh ahnhVar17 = ahknVar16.a;
                ahkn ahknVar17 = ahnhVar17.a;
                return new auka(ekgp.o(enmrVar, ahknVar17.nR, enmr.TRANSPORT_RCS, ahknVar17.nS, enmr.TRANSPORT_SINGLE_REGISTRATION, ahknVar17.nT, enmr.TRANSPORT_TACHYGRAM, ahknVar17.nU), ahnhVar17.rk);
            case 2741:
                return new arpi() { // from class: arow
                };
            case 2742:
                ahnh ahnhVar18 = this.a.a;
                return new aokg((fdjx) ahnhVar18.oQ.b(), ahnhVar18.dU(), (alrj) ahnhVar18.qi.b());
            case 2743:
                ahkn ahknVar18 = this.a;
                return new aokc(eyil.a(ahknVar18.a.um), eyil.a(ahknVar18.nV));
            case 2744:
                return (ewtm) ((ehdm) this.a.a.oQ().a.b()).a("com.google.android.apps.messaging.auto", "45674148").c();
            case 2745:
                return (ewtm) ((ehdm) this.a.a.od().a.b()).a("com.google.android.apps.messaging.auto", "45684681").c();
            case 2746:
                final eyik eyikVar8 = this.a.a.oO;
                return new asaz() { // from class: asax
                    @Override // defpackage.asaz
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.use_number_equality");
                    }
                };
            case 2747:
                return new ahml(this);
            case 2748:
                return new ahmm(this);
            case 2749:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar19 = ahknVar19.a;
                return new aohw(ahnhVar19.wH, ahnhVar19.VZ, ahnhVar19.Zo, (Context) ahknVar19.t.b());
            case 2750:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar20 = ahknVar20.a;
                return new ayee(ahnhVar20.sL, ahnhVar20.ww, ahnhVar20.AQ, ahnhVar20.pf, ahnhVar20.pB, ahnhVar20.uy, ahnhVar20.us, ahnhVar20.CB, ahnhVar20.Zn, ahnhVar20.uI, ahnhVar20.qq, ahnhVar20.qi, ahknVar20.t);
            case 2751:
                return new cggc(this.a.a.rF);
            case 2752:
                return new ahmn(this);
            case 2753:
                return new arpc() { // from class: arol
                };
            case 2754:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar21 = ahknVar21.a;
                return new chsp(ahnhVar21.rc, ahnhVar21.rd, ahknVar21.aS, (fdjx) ahnhVar21.oS.b());
            case 2755:
                return new aqse() { // from class: aqpr
                };
            case 2756:
                ahkn ahknVar22 = this.a;
                Context context3 = (Context) ahknVar22.t.b();
                ahnh ahnhVar22 = ahknVar22.a;
                return new ayqs(context3, (cmop) ahnhVar22.CA.b(), (cqmp) ahnhVar22.Dt.b(), (cogw) ahknVar22.cD.b(), (bbfk) ahnhVar22.Dx.b());
            case 2757:
                ahnh ahnhVar23 = this.a.a;
                return new crsf(ahnhVar23.xI, ahnhVar23.rs, ahnhVar23.qW);
            case 2758:
                ahnh ahnhVar24 = this.a.a;
                return new baxw(ahnhVar24.un, ahnhVar24.HP, ahnhVar24.qq);
            case 2759:
                return new apus() { // from class: apbs
                };
            case 2760:
                chyd chydVar = (chyd) this.a.a.ZI.b();
                chydVar.getClass();
                return chydVar;
            case 2761:
                ahkn ahknVar23 = this.a;
                Context context4 = (Context) ahknVar23.t.b();
                ahnh ahnhVar25 = ahknVar23.a;
                eyik eyikVar9 = ahnhVar25.pf;
                Object objFb = ahknVar23.fb();
                eyik eyikVar10 = ahnhVar25.sd;
                eyik eyikVar11 = ahnhVar25.pB;
                eyik eyikVar12 = ahnhVar25.ZE;
                eyik eyikVar13 = ahnhVar25.rs;
                cqdx cqdxVar = new cqdx();
                eosc eoscVar6 = (eosc) ahknVar23.aJ.b();
                eyik eyikVar14 = ahknVar23.kj;
                dhkw dhkwVar = (dhkw) ahknVar23.dJ.b();
                eyik eyikVar15 = ahnhVar25.yf;
                cmlb cmlbVar = (cmlb) ahnhVar25.rd.b();
                apwv apwvVar = (apwv) ahnhVar25.ri.b();
                eyik eyikVar16 = ahknVar23.cI;
                eyik eyikVar17 = ahnhVar25.ZF;
                crnp crnpVar = (crnp) eyikVar16.b();
                cebq cebqVar = (cebq) ahnhVar25.rq.b();
                dgqr dgqrVar = (dgqr) ahnhVar25.sh.b();
                eyik eyikVar18 = ahnhVar25.ZG;
                ctce ctceVar = (ctce) ahnhVar25.yp.b();
                eyik eyikVar19 = ahnhVar25.Uw;
                eyik eyikVar20 = ahnhVar25.yl;
                eyik eyikVar21 = ahnhVar25.yk;
                eyik eyikVar22 = ahnhVar25.ZH;
                chya chyaVar = (chya) objFb;
                eyik eyikVar23 = ahknVar23.nY;
                eyik eyikVar24 = ahnhVar25.PT;
                return new chyw(context4, ahknVar23.aP, eyikVar9, chyaVar, eyikVar10, ahknVar23.da, eyikVar11, eyikVar12, eyikVar13, cqdxVar, ahknVar23.aS, eoscVar6, eyikVar14, eyikVar23, dhkwVar, eyikVar15, cmlbVar, apwvVar, eyikVar17, crnpVar, eyikVar24, cebqVar, dgqrVar, eyikVar18, ctceVar, eyikVar19, eyikVar20, eyikVar21, eyikVar22);
            case 2762:
                ahkn ahknVar24 = this.a;
                dher dherVar = (dher) ahknVar24.a.ZD.b();
                dhet dhetVar = (dhet) ahknVar24.dr.b();
                dhes dhesVar = (dhes) ahknVar24.aP.b();
                ((cczn) ahknVar24.cG.b()).a();
                dfoc.m();
                return new dheq(dherVar, dhetVar, dhesVar);
            case 2763:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar26 = ahknVar25.a;
                eyik eyikVar25 = ahnhVar26.sa;
                ahkn ahknVar26 = ahnhVar26.a;
                eyik eyikVar26 = ahknVar26.dr;
                eyik eyikVar27 = ahnhVar26.ZB;
                eyik eyikVar28 = ahnhVar26.pA;
                eyikVar25.getClass();
                eyikVar26.getClass();
                eyikVar27.getClass();
                eyikVar28.getClass();
                return dhez.a((Context) ahknVar25.t.b(), (dhep) ahnhVar26.ZC.b(), (eosc) ahknVar25.y.b(), eyikVar25, eyikVar26, ahknVar26.aP, eyikVar27, eyikVar28);
            case 2764:
                return new aixj(this.a.a.yw);
            case 2765:
                return new dhfb((dhem) this.a.a.ZB.b());
            case 2766:
                final eyik eyikVar29 = this.a.a.oO;
                return new apwt() { // from class: apeu
                    @Override // defpackage.apwt
                    public final boolean a() {
                        return ((eoth) eyikVar29.b()).a("bugle.enable_fire_and_forget_availability_update_listener");
                    }
                };
            case 2767:
                ahkn ahknVar27 = this.a;
                Context context5 = (Context) ahknVar27.t.b();
                ahnh ahnhVar27 = ahknVar27.a;
                return new cjzf(context5, ahnhVar27.kg(), (fdjx) ahnhVar27.oS.b(), (fcyh) ahknVar27.cA.b(), ahnhVar27.rd, ahnhVar27.yi, ahnhVar27.ri, ahnhVar27.yf, ahnhVar27.pf);
            case 2768:
                final eyik eyikVar30 = this.a.a.oO;
                return new apry() { // from class: aoxj
                    @Override // defpackage.apry
                    public final boolean a() {
                        return ((eoth) eyikVar30.b()).a("bugle.enable_disable_not_default_call_check_before_available_check_flag");
                    }
                };
            case 2769:
                ahnh ahnhVar28 = this.a.a;
                ahkn ahknVar28 = ahnhVar28.a;
                return ekhx.r(new chzl((Context) ahknVar28.t.b(), new chzk((cogw) ahknVar28.cD.b(), (eosc) ahknVar28.p.b()), (ains) ahnhVar28.c.b(), new chtv()), (chyy) ahnhVar28.ZR.b());
            case 2770:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar29 = ahknVar29.a;
                eygg eyggVarA = eyie.a(ahnhVar29.ZQ);
                cmfe cmfeVar = (cmfe) ahnhVar29.xF.b();
                eygg eyggVarA2 = eyie.a(ahnhVar29.yr);
                eygg eyggVarA3 = eyie.a(ahnhVar29.rY);
                cmeq cmeqVar = (cmeq) ahnhVar29.ro.b();
                cmfd cmfdVar = new cmfd(eyggVarA, cmfeVar, eyggVarA2, eyggVarA3, (eosd) ahknVar29.p.b(), ahnhVar29.rn);
                if (cmeqVar.a) {
                    cmeqVar.a(cmfdVar);
                }
                return cmfdVar;
            case 2771:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar30 = ahknVar30.a;
                axnv axnvVar = (axnv) ahnhVar30.Gj.b();
                axsf axsfVar = (axsf) ahnhVar30.ZK.b();
                aypy aypyVar = (aypy) ahnhVar30.CM.b();
                axmc axmcVarEf = ahnhVar30.ef();
                ains ainsVar = (ains) ahnhVar30.c.b();
                eygg eyggVarA4 = eyie.a(ahnhVar30.ZN);
                chwq chwqVar = (chwq) ahnhVar30.uu.b();
                crqv crqvVar = (crqv) ahknVar30.aT.b();
                eygg eyggVarA5 = eyie.a(ahnhVar30.rY);
                cogw cogwVar = (cogw) ahknVar30.cD.b();
                asys asysVar = new asys((asxh) ahnhVar30.xH.b(), (cmex) ahnhVar30.ZO.b(), new apjy(ahnhVar30.oO), (aqaq) ahnhVar30.xr.b());
                clec clecVarJU = ahnhVar30.jU();
                aiwq aiwqVar = (aiwq) ahknVar30.nu.b();
                axwy axwyVarEk = ahnhVar30.ek();
                eosc eoscVar7 = (eosc) ahknVar30.y.b();
                axyf axyfVarEn = ahnhVar30.en();
                axoi axoiVarEg = ahnhVar30.eg();
                aypx aypxVar = (aypx) ahnhVar30.CC.b();
                axyh axyhVarEo = ahnhVar30.eo();
                csuc csucVar = (csuc) ahnhVar30.qV.b();
                eyik eyikVar31 = ahnhVar30.yw;
                ajfo ajfoVar = (ajfo) ahnhVar30.vh.b();
                cilk cilkVar = new cilk(ahnhVar30.rF);
                cleb clebVar = (cleb) ahknVar30.nZ.b();
                cisf cisfVar = new cisf(new cisb(ahnhVar30.rF));
                cjpo cjpoVar = (cjpo) ahnhVar30.yr.b();
                ciis ciisVarJg = ahnhVar30.jg();
                coiy coiyVar = new coiy((coir) ahnhVar30.Og.b());
                ciie ciieVar = new ciie(ahnhVar30.rF);
                eyik eyikVar32 = ahknVar30.kw;
                eyik eyikVar33 = ahnhVar30.DL;
                eyik eyikVar34 = ahnhVar30.uJ;
                aspp asppVar = (aspp) ahnhVar30.qX.b();
                asyh asyhVarCX2 = ahnhVar30.cX();
                aszs aszsVar = new aszs();
                aszsVar.c(Duration.ZERO);
                aszsVar.b(Duration.ZERO);
                aszw aszwVarA = aszsVar.a();
                return new clej(axnvVar, axsfVar, aypyVar, axmcVarEf, ainsVar, eyggVarA4, chwqVar, crqvVar, eyggVarA5, cogwVar, asysVar, clecVarJU, aiwqVar, axwyVarEk, eoscVar7, axyfVarEn, axoiVarEg, aypxVar, axyhVarEo, csucVar, eyikVar31, ajfoVar, cilkVar, clebVar, cisfVar, cjpoVar, ciisVarJg, coiyVar, ciieVar, eyikVar32, eyikVar33, eyikVar34, asppVar, ((awif) ahnhVar30.qq()).a(ahnhVar30.bk().a() ? ahnhVar30.cS().a(aszwVarA, null) : asyhVarCX2.i(aszwVarA)), (awhr) ahnhVar30.Jf.b(), (asqx) ahnhVar30.pT.b());
            case 2772:
                ahnh ahnhVar31 = this.a.a;
                return new axsf(ahnhVar31.sL, ahnhVar31.uJ, ahnhVar31.uu, ahnhVar31.c, ahnhVar31.qq, ahnhVar31.CI);
            case 2773:
                final eyik eyikVar35 = this.a.a.oO;
                return new aqmv() { // from class: aqmr
                    @Override // defpackage.aqmv
                    public final boolean a() {
                        return ((eoth) eyikVar35.b()).a("bugle.enable_change_participants_refresh_migration");
                    }
                };
            case 2774:
                ahkn ahknVar31 = this.a;
                Context context6 = (Context) ahknVar31.t.b();
                eyik eyikVar36 = ahknVar31.aP;
                ahnh ahnhVar32 = ahknVar31.a;
                return new ajku(context6, ahnhVar32.qr, (dhes) eyikVar36.b(), (cqbm) ahnhVar32.sX.b(), (crma) ahknVar31.da.b(), ahnhVar32.rd, ahnhVar32.ZM, ahnhVar32.sh);
            case 2775:
                final eyik eyikVar37 = this.a.a.oO;
                return new aqsx() { // from class: aqrb
                    @Override // defpackage.aqsx
                    public final boolean a() {
                        return ((eoth) eyikVar37.b()).a("bugle.enable_sim_subscription_info_retriever_in_uptime_tracker_impl");
                    }
                };
            case 2776:
                ahkn ahknVar32 = this.a;
                eosc eoscVar8 = (eosc) ahknVar32.aJ.b();
                eosc eoscVar9 = (eosc) ahknVar32.p.b();
                eosd eosdVar = (eosd) ahknVar32.p.b();
                ahnh ahnhVar33 = ahknVar32.a;
                return new cmex(eoscVar8, eoscVar9, eosdVar, (ContactsService) ahnhVar33.xG.b(), ahnhVar33.pT, (aspz) ahnhVar33.vR.b());
            case 2777:
                return new axye(this.a.a.Nf);
            case 2778:
                ahkn ahknVar33 = this.a;
                ahnh ahnhVar34 = ahknVar33.a;
                return new cnjw((cexn) ahnhVar34.tp.b(), (eosc) ahknVar33.p.b(), (ceni) ahnhVar34.PH.b(), (Optional) ahnhVar34.FQ.b(), (cqba) ahknVar33.aM.b(), ahnhVar34.qK, ahnhVar34.pT);
            case 2779:
                ahnh ahnhVar35 = this.a.a;
                return new cozx(ahnhVar35.sh, ahnhVar35.xI, ahnhVar35.rW, ahnhVar35.ri);
            case 2780:
                ahnh ahnhVar36 = this.a.a;
                return new cozw((fdjx) ahnhVar36.oS.b(), ahnhVar36.ZY, ahnhVar36.PL, ahnhVar36.ZW, ahnhVar36.ZZ);
            case 2781:
                return new cozs((ekih) this.a.a.ZX.b());
            case 2782:
                Map mapQQ = this.a.a.qQ();
                TreeMap treeMap = new TreeMap(new cozd());
                treeMap.putAll(mapQQ);
                Comparator comparator = ekih.a;
                Comparator comparator2 = treeMap.comparator();
                if (comparator2 == null) {
                    comparator2 = ekih.a;
                }
                ekih ekihVarX = ekih.x(comparator2, true, treeMap.entrySet());
                ekihVarX.getClass();
                return ekihVarX;
            case 2783:
                return new awlc(eyim.a, (fdjx) this.a.a.m.b());
            case 2784:
                return new ahmo(this);
            case 2785:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45683619").b());
            case 2786:
                return Long.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45683709").b());
            case 2787:
                return new dfjm(this.a.a.oO);
            case 2788:
                return new ekph((dggv) this.a.a.rk.b());
            case 2789:
                ahnh ahnhVar37 = this.a.a;
                return ekhx.r(ahnhVar37.lU(), ahnhVar37.ql());
            case 2790:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar38 = ahknVar34.a;
                eyik eyikVar38 = ahnhVar38.qK;
                eyikVar38.getClass();
                cmgk cmgkVar = (cmgk) eyikVar38.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.WELCOME_FLOW_V1_DATA);
                cmggVarC.f(ctcl.a);
                return new ctdg(cmgkVar.a(cmggVarC.a()), (fcyh) ahknVar34.cA.b(), (fdjx) ahnhVar38.m.b(), ahknVar34.cD, ahnhVar38.HM);
            case 2791:
                return Long.valueOf(((ehdm) this.a.a.pg().a.b()).a("com.google.android.apps.messaging.auto", "45645967").b());
            case 2792:
                return Optional.of((dggy) this.a.a.WZ.b());
            case 2793:
                return Boolean.valueOf(((apwv) this.a.a.ri.b()).a());
            case 2794:
                return new ekph(new awtw(this.a.a.sU));
            case 2795:
                return Boolean.valueOf(((eoth) ((dfki) this.a.a.mb()).a.b()).a("cslib.enable_provisioning_apis_comparison_logging"));
            case 2796:
                return new ahmp(this);
            case 2797:
                return new cepr((cepb) this.a.a.qQ.b());
            case 2798:
                return new cepv(this.a.a.hJ());
            case 2799:
                return new cepv(this.a.a.hK());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object w() {
        int i = this.b;
        switch (i) {
            case 2800:
                return new cepx(this.a.a.Ay);
            case 2801:
                ahnh ahnhVar = this.a.a;
                return new cepj(ahnhVar.Ay, (Optional) ahnhVar.aau.b(), (Optional) ahnhVar.aav.b(), Optional.of(new cfsi(ahnhVar.aax, ahnhVar.aay, ahnhVar.qQ)), ahnhVar.rD);
            case 2802:
                eywd eywdVar = (eywd) this.a.a.aat.b();
                cczi ccziVar = cerb.a;
                return Optional.of(eywdVar);
            case 2803:
                ahkn ahknVar = this.a;
                ahnh ahnhVar2 = ahknVar.a;
                return cerh.a(ahnhVar2.tO, (ehtz) ahknVar.ik.b(), (ehuj) ahknVar.eo.b(), (esmm) ahnhVar2.tZ.b(), ejud.a, ahnhVar2.mJ());
            case 2804:
                eywc eywcVar = (eywc) this.a.a.xW.b();
                cczi ccziVar2 = cerb.a;
                return Optional.of(eywcVar);
            case 2805:
                fbnd fbndVar = (fbnd) this.a.a.aaw.b();
                fbndVar.getClass();
                return eywe.b(fbndVar);
            case 2806:
                fbnd fbndVarA = this.a.a.mT().a("rcs", new fbud(), fbub.a, false);
                fbndVarA.getClass();
                return fbndVarA;
            case 2807:
                fbnd fbndVar2 = (fbnd) this.a.a.aaw.b();
                fbndVar2.getClass();
                return eywe.a(fbndVar2);
            case 2808:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar3 = ahknVar2.a;
                return new cffn(ahnhVar3.Xo, ahnhVar3.tq, ahknVar2.aJ, ahnhVar3.FT, ahnhVar3.tp, ahnhVar3.qi, ahnhVar3.c, ahnhVar3.tk, ahnhVar3.xI, ahnhVar3.se, ahnhVar3.aaA, ahnhVar3.qM, ahnhVar3.aaB);
            case 2809:
                final eyik eyikVar = this.a.a.oO;
                return new aptv() { // from class: apae
                    @Override // defpackage.aptv
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.skip_pcscf_address_check_in_ims_configuration_during_register_device");
                    }
                };
            case 2810:
                ahnh ahnhVar4 = this.a.a;
                return new cfir(ahnhVar4.tq, ahnhVar4.oQ);
            case 2811:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar5 = ahknVar3.a;
                return new cfet(ahnhVar5.Xp, ahnhVar5.tp, ahnhVar5.FT, ahnhVar5.qi, ahnhVar5.pT, ahnhVar5.tk, ahknVar3.es, ahnhVar5.qM, ahknVar3.p, ahnhVar5.aaB);
            case 2812:
                return new ahmr(this);
            case 2813:
                ahnh ahnhVar6 = this.a.a;
                return new cfrc((awzf) ahnhVar6.sI.b(), (awyu) ahnhVar6.qB.b(), (ahlu) ahnhVar6.sO.b(), (fdjx) ahnhVar6.m.b());
            case 2814:
                return new ekph((bvup) this.a.a.sl.b());
            case 2815:
                return new ccwh((alrj) this.a.a.qi.b());
            case 2816:
                ahnh ahnhVar7 = this.a.a;
                return new cqdm(ahnhVar7.uo, ahnhVar7.aaI);
            case 2817:
                final eyik eyikVar2 = this.a.a.oO;
                return new asbv() { // from class: asbw
                    @Override // defpackage.asbv
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.add_groups_to_share_sheet");
                    }
                };
            case 2818:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar8 = ahknVar4.a;
                return new crtd((fdjx) ahnhVar8.m.b(), (Context) ahknVar4.t.b(), ahnhVar8.pE, ahnhVar8.Jm);
            case 2819:
                return new apzw() { // from class: apip
                };
            case 2820:
                ahkn ahknVar5 = this.a;
                return new bafa((Context) ahknVar5.t.b(), (cssf) ahknVar5.a.uo.b(), ahknVar5.ie);
            case 2821:
                ahnh ahnhVar9 = this.a.a;
                return new bbfq((chtk) ahnhVar9.sj.b(), (alrj) ahnhVar9.qi.b());
            case 2822:
                ahnh ahnhVar10 = this.a.a;
                return new bakq(ahnhVar10.qq, ahnhVar10.aaO, (fdjx) ahnhVar10.m.b());
            case 2823:
                ahnh ahnhVar11 = this.a.a;
                return ekhx.r(new bvvp(ahnhVar11.Fb, (fdjx) ahnhVar11.oS.b(), ahnhVar11.sL), new cdon(ahnhVar11.zK, (fdjx) ahnhVar11.oS.b(), ahnhVar11.a.ly, (anty) ahnhVar11.Ax.b(), (aptm) ahnhVar11.vV.b(), (akbs) ahnhVar11.Jq.b()));
            case 2824:
                ahkn ahknVar6 = this.a;
                return new bxko((Context) ahknVar6.t.b(), ahknVar6.a.vh);
            case 2825:
                return new apzy() { // from class: apit
                };
            case 2826:
                ahnh ahnhVar12 = this.a.a;
                return new avbw(ahnhVar12.vh, ahnhVar12.c);
            case 2827:
                ahnh ahnhVar13 = this.a.a;
                awvi awviVarEc = ahnhVar13.ec();
                eyik eyikVar3 = ahnhVar13.sU;
                eyikVar3.getClass();
                return awviVarEc.a(eyikVar3, eyikVar3);
            case 2828:
                ahkn ahknVar7 = this.a;
                return new srw(ahknVar7.t, ahknVar7.a.BK, ahknVar7.eK, ahknVar7.oc);
            case 2829:
                ahkn ahknVar8 = this.a;
                cjxi cjxiVar = (cjxi) ahknVar8.a.yf.b();
                eosc eoscVar = (eosc) ahknVar8.y.b();
                return new cjsd(cjxiVar, eoscVar, (cogw) ahknVar8.cD.b());
            case 2830:
                ahkn ahknVar9 = this.a;
                return new cgch((Context) ahknVar9.t.b(), (cgei) ahknVar9.a.qF.b());
            case 2831:
                return new cgcm();
            case 2832:
                ahkn ahknVar10 = this.a;
                Context context = (Context) ahknVar10.t.b();
                ahnh ahnhVar14 = ahknVar10.a;
                return new cgco(context, (avmp) ahnhVar14.Jm.b(), (cgei) ahnhVar14.qF.b());
            case 2833:
                ahkn ahknVar11 = this.a;
                Context context2 = (Context) ahknVar11.t.b();
                ahnh ahnhVar15 = ahknVar11.a;
                return new cgdk(context2, (cgei) ahnhVar15.qF.b(), (cqzr) ahnhVar15.pd.b());
            case 2834:
                ahkn ahknVar12 = this.a;
                eyik eyikVar4 = ahknVar12.t;
                ahnh ahnhVar16 = ahknVar12.a;
                return new cgcy(eyikVar4, ahnhVar16.qE, ahnhVar16.Ch, ahnhVar16.Jd, ahnhVar16.wv, ahnhVar16.c, ahknVar12.cD, ahnhVar16.Jm, ahnhVar16.ady, ahknVar12.cC, ahknVar12.mU, ahnhVar16.Qp, ahnhVar16.sL, ahnhVar16.QG);
            case 2835:
                ahkn ahknVar13 = this.a;
                Context context3 = (Context) ahknVar13.t.b();
                ahnh ahnhVar17 = ahknVar13.a;
                return new cgcz(context3, (avmp) ahnhVar17.Jm.b(), (clgq) ahnhVar17.adx.b(), (cpbz) ahknVar13.jW.b());
            case 2836:
                ahkn ahknVar14 = this.a;
                return new ahsy((Context) ahknVar14.t.b(), ahknVar14.a.adw, ahknVar14.oj);
            case 2837:
                ahkn ahknVar15 = this.a;
                Context context4 = (Context) ahknVar15.t.b();
                ahnh ahnhVar18 = ahknVar15.a;
                return new acnr(context4, (cpch) ahnhVar18.qj.b(), eyie.a(ahnhVar18.adv), ahknVar15.db);
            case 2838:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar19 = ahknVar16.a;
                return new cdga(ahnhVar19.rg(), (eosc) ahknVar16.p.b(), ahnhVar19.bQ());
            case 2839:
                final eyik eyikVar5 = this.a.a.oO;
                return new aqst() { // from class: aqqt
                    @Override // defpackage.aqst
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_sim_subscription_in_fi_feedback_data_provider");
                    }
                };
            case 2840:
                ahkn ahknVar17 = this.a;
                return new ehqf((Context) ahknVar17.t.b(), (eosc) ahknVar17.y.b(), (ehqi) ahknVar17.a.abf.b());
            case 2841:
                return (ehqi) ejwi.j((ehqi) this.a.a.rP.b()).e(new ehqj());
            case 2842:
                ahnh ahnhVar20 = this.a.a;
                eoth eothVar = (eoth) ahnhVar20.oO.b();
                Map map = (Map) ahnhVar20.a.cy.b();
                ekgi ekgiVarH = ekgp.h(64);
                ekgiVarH.i("ContactsSyncFeature__enable_contacts_delete_kill_switch", ahnhVar20.abi);
                ekgiVarH.i("ContactsSyncFeature__contacts_delete_max_limit", ahnhVar20.abk);
                ekgiVarH.i("ContactsSyncFeature__enable_contacts_sync_catch_sqlite_exception", ahnhVar20.abm);
                ekgiVarH.i("ContactsSyncFeature__contacts_sync_pwq_max_attempt_count", ahnhVar20.abo);
                ekgiVarH.i("ContactsSyncFeature__contacts_sync_pwq_retry_delay_ms", ahnhVar20.abq);
                ekgiVarH.i("ContactsSyncFeature__cp2_query_batch_size", ahnhVar20.abs);
                ekgiVarH.i("ContactsSyncFeature__contacts_import_batch_size", ahnhVar20.abu);
                ekgiVarH.i("ContactsSyncFeature__contacts_delete_batch_size", ahnhVar20.abw);
                ekgiVarH.i("ContactsSyncFeature__enable_retry_on_subset_exceptions", ahnhVar20.aby);
                ekgiVarH.i("ContactsSyncFeature__enable_batch_contacts_delete", ahnhVar20.abA);
                ekgiVarH.i("ContactsSyncFeature__periodic_contacts_import_interval_hrs", ahnhVar20.abC);
                ekgiVarH.i("ContactsSyncFeature__contacts_import_init_timeout_min", ahnhVar20.abE);
                ekgiVarH.i("ContactsSyncFeature__contacts_import_scheduled_timeout_min", ahnhVar20.abG);
                ekgiVarH.i("ContactsSyncFeature__import_future_autoset_threshold_seconds", ahnhVar20.abI);
                ekgiVarH.i("ContactsSyncFeature__import_result_default_timeout_seconds", ahnhVar20.abK);
                ekgiVarH.i("DoubleTapFeature__double_tap_to_react_reaction", ahnhVar20.abM);
                ekgiVarH.i("MentionsFeature__suggest_mentions_proactively", ahnhVar20.abO);
                ekgiVarH.i("MentionsFeature__enable_mention_suggestions", ahnhVar20.abP);
                ekgiVarH.i("MentionsFeature__enable_mention_annotations", ahnhVar20.abQ);
                ekgiVarH.i("MmsGroupUpgradeFeature__active_upgrade_max_retries", ahnhVar20.abR);
                ekgiVarH.i("MmsGroupUpgradeFeature__active_upgrade_min_required_battery_percentage", ahnhVar20.abT);
                ekgiVarH.i("MmsGroupUpgradeFeature__active_upgrade_synclet_interval_minutes", ahnhVar20.abV);
                ekgiVarH.i("MmsGroupUpgradeFeature__backup_to_telephony_batch_size", ahnhVar20.abX);
                ekgiVarH.i("MmsGroupUpgradeFeature__enable_mms_group_upgrade_ui_home_screen", ahnhVar20.abY);
                ekgiVarH.i("MmsGroupUpgradeFeature__enable_mms_group_upgrade_ui_conversation_screen", ahnhVar20.abZ);
                ekgiVarH.i("MmsGroupUpgradeFeature__last_message_sent_or_received_max_days", ahnhVar20.aca);
                ekgiVarH.i("MmsGroupUpgradeFeature__max_cache_staleness_for_capabilities_refresh_in_minutes", ahnhVar20.acb);
                ekgiVarH.i("MmsGroupUpgradeFeature__max_number_not_upgrade_capable_participants", ahnhVar20.acc);
                ekgiVarH.i("MmsGroupUpgradeFeature__max_number_of_retries_for_backup_batch", ahnhVar20.ace);
                ekgiVarH.i("MmsGroupUpgradeFeature__max_number_participants_in_mms_group_eligible_for_upgrade", ahnhVar20.acf);
                ekgiVarH.i("MmsGroupUpgradeFeature__min_version_supports_mms_group_upgrade", ahnhVar20.acg);
                ekgiVarH.i("MmsGroupUpgradeFeature__passive_upgrade_only_upgrade_when_flag_is_set_in_group_notification", ahnhVar20.aci);
                ekgiVarH.i("MmsGroupUpgradeFeature__synclet_peak_hour_start", ahnhVar20.ack);
                ekgiVarH.i("MmsGroupUpgradeFeature__synclet_peak_hour_end", ahnhVar20.acm);
                ekgiVarH.i("MmsMergingFeature__group_staleness_threshold_days", ahnhVar20.aco);
                ekgiVarH.i("PenpalFeature__enforce_checks_on_any_build", ahnhVar20.acq);
                ekgiVarH.i("PenpalFeature__magic_rewrite_next_distance_threshold", ahnhVar20.acs);
                ekgiVarH.i("PenpalFeature__suggested_text_next_distance_threshold", ahnhVar20.acu);
                ekgiVarH.i("PenpalFeature__enable_magic_compose_sensitive_classifier", ahnhVar20.acw);
                ekgiVarH.i("PenpalFeature__enable_magic_compose_output_sensitive_classifier", ahnhVar20.acy);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_mdd_group", ahnhVar20.acA);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_mdd_id", ahnhVar20.acC);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_task_name", ahnhVar20.acE);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_num_predictions", ahnhVar20.acG);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_num_messages", ahnhVar20.acI);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_confidence_threshold", ahnhVar20.acK);
                ekgiVarH.i("PenpalFeature__magic_compose_classifier_block_on_error", ahnhVar20.acM);
                ekgiVarH.i("PenpalFeature__magic_compose_tokenizer_mdd_file_id", ahnhVar20.acO);
                ekgiVarH.i("PenpalFeature__magic_compose_try_downloading_sensitive_classifier_if_not_present", ahnhVar20.acQ);
                ekgiVarH.i("PenpalFeature__magic_compose_log_input_token_bucket", ahnhVar20.acS);
                ekgiVarH.i("PenpalFeature__magic_compose_additional_input_token_count", ahnhVar20.acU);
                ekgiVarH.i("PenpalFeature__magic_compose_enable_ai_core_bind_waive_priority", ahnhVar20.acW);
                ekgiVarH.i("PenpalFeature__magic_compose_max_input_token_count", ahnhVar20.acY);
                ekgiVarH.i("PenpalFeature__magic_compose_min_context_message_count", ahnhVar20.ada);
                ekgiVarH.i("PenpalFeature__magic_compose_suggested_text_prompt_token_count", ahnhVar20.adc);
                ekgiVarH.i("PenpalFeature__magic_compose_use_aicore_token_info_api", ahnhVar20.ade);
                ekgiVarH.i("PenpalFeature__magic_compose_use_aicore_token_info_api_timeout_ms", ahnhVar20.adg);
                ekgiVarH.i("RecipientSyncFeature__enable_contact_recipient_incremental_sync", ahnhVar20.adh);
                ekgiVarH.i("RecipientSyncFeature__recipient_sync_pwq_max_attempt_count", ahnhVar20.adj);
                ekgiVarH.i("RecipientSyncFeature__recipient_sync_pwq_retry_backoff_ms", ahnhVar20.adl);
                ekgiVarH.i("RecipientSyncFeature__recipient_change_sync_pwq_batch_size", ahnhVar20.adn);
                ekgiVarH.i("RecipientSyncFeature__recipient_sync_destinations_changed_log_threshold", ahnhVar20.ado);
                ekgiVarH.i("RecipientSyncFeature__work_profile_recipient_sync_period_hrs", ahnhVar20.adq);
                ekgiVarH.i("RecipientSyncFeature__work_profile_recipient_full_sync_period_hrs", ahnhVar20.ads);
                return new cczl(new eott(eothVar, map, ekgiVarH.c()));
            case 2843:
                eyik eyikVar6 = this.a.a.abh;
                eyikVar6.getClass();
                Object objB = eyikVar6.b();
                objB.getClass();
                return objB;
            case 2844:
                return Boolean.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45410998").e());
            case 2845:
                eyik eyikVar7 = this.a.a.abj;
                eyikVar7.getClass();
                Object objB2 = eyikVar7.b();
                objB2.getClass();
                return objB2;
            case 2846:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45410999").b());
            case 2847:
                eyik eyikVar8 = this.a.a.abl;
                eyikVar8.getClass();
                Object objB3 = eyikVar8.b();
                objB3.getClass();
                return objB3;
            case 2848:
                return Boolean.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45412017").e());
            case 2849:
                eyik eyikVar9 = this.a.a.abn;
                eyikVar9.getClass();
                Object objB4 = eyikVar9.b();
                objB4.getClass();
                return objB4;
            case 2850:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615649").b());
            case 2851:
                eyik eyikVar10 = this.a.a.abp;
                eyikVar10.getClass();
                Object objB5 = eyikVar10.b();
                objB5.getClass();
                return objB5;
            case 2852:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615650").b());
            case 2853:
                eyik eyikVar11 = this.a.a.abr;
                eyikVar11.getClass();
                Object objB6 = eyikVar11.b();
                objB6.getClass();
                return objB6;
            case 2854:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615637").b());
            case 2855:
                eyik eyikVar12 = this.a.a.abt;
                eyikVar12.getClass();
                Object objB7 = eyikVar12.b();
                objB7.getClass();
                return objB7;
            case 2856:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615651").b());
            case 2857:
                eyik eyikVar13 = this.a.a.abv;
                eyikVar13.getClass();
                Object objB8 = eyikVar13.b();
                objB8.getClass();
                return objB8;
            case 2858:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615652").b());
            case 2859:
                eyik eyikVar14 = this.a.a.abx;
                eyikVar14.getClass();
                Object objB9 = eyikVar14.b();
                objB9.getClass();
                return objB9;
            case 2860:
                return Boolean.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615654").e());
            case 2861:
                eyik eyikVar15 = this.a.a.abz;
                eyikVar15.getClass();
                Object objB10 = eyikVar15.b();
                objB10.getClass();
                return objB10;
            case 2862:
                return Boolean.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45615655").e());
            case 2863:
                eyik eyikVar16 = this.a.a.abB;
                eyikVar16.getClass();
                Object objB11 = eyikVar16.b();
                objB11.getClass();
                return objB11;
            case 2864:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45621161").b());
            case 2865:
                eyik eyikVar17 = this.a.a.abD;
                eyikVar17.getClass();
                Object objB12 = eyikVar17.b();
                objB12.getClass();
                return objB12;
            case 2866:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "95301030").b());
            case 2867:
                eyik eyikVar18 = this.a.a.abF;
                eyikVar18.getClass();
                Object objB13 = eyikVar18.b();
                objB13.getClass();
                return objB13;
            case 2868:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "95301031").b());
            case 2869:
                eyik eyikVar19 = this.a.a.abH;
                eyikVar19.getClass();
                Object objB14 = eyikVar19.b();
                objB14.getClass();
                return objB14;
            case 2870:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45655756").b());
            case 2871:
                eyik eyikVar20 = this.a.a.abJ;
                eyikVar20.getClass();
                Object objB15 = eyikVar20.b();
                objB15.getClass();
                return objB15;
            case 2872:
                return Long.valueOf(((ehdm) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto", "45655757").b());
            case 2873:
                eyik eyikVar21 = this.a.a.abL;
                eyikVar21.getClass();
                Object objB16 = eyikVar21.b();
                objB16.getClass();
                return objB16;
            case 2874:
                return Long.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45459897").b());
            case 2875:
                eyik eyikVar22 = this.a.a.abN;
                eyikVar22.getClass();
                Object objB17 = eyikVar22.b();
                objB17.getClass();
                return objB17;
            case 2876:
                return Boolean.valueOf(((ehdm) this.a.a.ov().a.b()).a("com.google.android.apps.messaging.auto", "45681113").e());
            case 2877:
                eyik eyikVar23 = this.a.a.eU;
                eyikVar23.getClass();
                Object objB18 = eyikVar23.b();
                objB18.getClass();
                return objB18;
            case 2878:
                eyik eyikVar24 = this.a.a.eT;
                eyikVar24.getClass();
                Object objB19 = eyikVar24.b();
                objB19.getClass();
                return objB19;
            case 2879:
                Object objB20 = this.a.a.SP.b();
                objB20.getClass();
                return objB20;
            case 2880:
                eyik eyikVar25 = this.a.a.abS;
                eyikVar25.getClass();
                Object objB21 = eyikVar25.b();
                objB21.getClass();
                return objB21;
            case 2881:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45627670").b());
            case 2882:
                eyik eyikVar26 = this.a.a.abU;
                eyikVar26.getClass();
                Object objB22 = eyikVar26.b();
                objB22.getClass();
                return objB22;
            case 2883:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45629875").b());
            case 2884:
                eyik eyikVar27 = this.a.a.abW;
                eyikVar27.getClass();
                Object objB23 = eyikVar27.b();
                objB23.getClass();
                return objB23;
            case 2885:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45632805").b());
            case 2886:
                eyik eyikVar28 = this.a.a.gd;
                eyikVar28.getClass();
                Object objB24 = eyikVar28.b();
                objB24.getClass();
                return objB24;
            case 2887:
                eyik eyikVar29 = this.a.a.gc;
                eyikVar29.getClass();
                Object objB25 = eyikVar29.b();
                objB25.getClass();
                return objB25;
            case 2888:
                Object objB26 = this.a.a.SS.b();
                objB26.getClass();
                return objB26;
            case 2889:
                Object objB27 = this.a.a.SV.b();
                objB27.getClass();
                return objB27;
            case 2890:
                Object objB28 = this.a.a.ST.b();
                objB28.getClass();
                return objB28;
            case 2891:
                eyik eyikVar30 = this.a.a.acd;
                eyikVar30.getClass();
                Object objB29 = eyikVar30.b();
                objB29.getClass();
                return objB29;
            case 2892:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45632347").b());
            case 2893:
                Object objB30 = this.a.a.SU.b();
                objB30.getClass();
                return objB30;
            case 2894:
                Object objB31 = this.a.a.Sj.b();
                objB31.getClass();
                return objB31;
            case 2895:
                eyik eyikVar31 = this.a.a.ach;
                eyikVar31.getClass();
                Object objB32 = eyikVar31.b();
                objB32.getClass();
                return objB32;
            case 2896:
                return Boolean.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45636312").e());
            case 2897:
                eyik eyikVar32 = this.a.a.acj;
                eyikVar32.getClass();
                Object objB33 = eyikVar32.b();
                objB33.getClass();
                return objB33;
            case 2898:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45642387").b());
            case 2899:
                eyik eyikVar33 = this.a.a.acl;
                eyikVar33.getClass();
                Object objB34 = eyikVar33.b();
                objB34.getClass();
                return objB34;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object x() {
        int i = this.b;
        switch (i) {
            case 2900:
                return Long.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45642388").b());
            case 2901:
                eyik eyikVar = this.a.a.acn;
                eyikVar.getClass();
                Object objB = eyikVar.b();
                objB.getClass();
                return objB;
            case 2902:
                return Long.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45655920").b());
            case 2903:
                eyik eyikVar2 = this.a.a.acp;
                eyikVar2.getClass();
                Object objB2 = eyikVar2.b();
                objB2.getClass();
                return objB2;
            case 2904:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45412123").e());
            case 2905:
                eyik eyikVar3 = this.a.a.acr;
                eyikVar3.getClass();
                Object objB3 = eyikVar3.b();
                objB3.getClass();
                return objB3;
            case 2906:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45532305").b());
            case 2907:
                eyik eyikVar4 = this.a.a.act;
                eyikVar4.getClass();
                Object objB4 = eyikVar4.b();
                objB4.getClass();
                return objB4;
            case 2908:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45532306").b());
            case 2909:
                eyik eyikVar5 = this.a.a.acv;
                eyikVar5.getClass();
                Object objB5 = eyikVar5.b();
                objB5.getClass();
                return objB5;
            case 2910:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45571947").e());
            case 2911:
                eyik eyikVar6 = this.a.a.acx;
                eyikVar6.getClass();
                Object objB6 = eyikVar6.b();
                objB6.getClass();
                return objB6;
            case 2912:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45614153").e());
            case 2913:
                eyik eyikVar7 = this.a.a.acz;
                eyikVar7.getClass();
                Object objB7 = eyikVar7.b();
                objB7.getClass();
                return objB7;
            case 2914:
                return ((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572037").d();
            case 2915:
                eyik eyikVar8 = this.a.a.acB;
                eyikVar8.getClass();
                Object objB8 = eyikVar8.b();
                objB8.getClass();
                return objB8;
            case 2916:
                return ((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572038").d();
            case 2917:
                eyik eyikVar9 = this.a.a.acD;
                eyikVar9.getClass();
                Object objB9 = eyikVar9.b();
                objB9.getClass();
                return objB9;
            case 2918:
                return ((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572039").d();
            case 2919:
                eyik eyikVar10 = this.a.a.acF;
                eyikVar10.getClass();
                Object objB10 = eyikVar10.b();
                objB10.getClass();
                return objB10;
            case 2920:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572040").b());
            case 2921:
                eyik eyikVar11 = this.a.a.acH;
                eyikVar11.getClass();
                Object objB11 = eyikVar11.b();
                objB11.getClass();
                return objB11;
            case 2922:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572041").b());
            case 2923:
                eyik eyikVar12 = this.a.a.acJ;
                eyikVar12.getClass();
                Object objB12 = eyikVar12.b();
                objB12.getClass();
                return objB12;
            case 2924:
                return Double.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45572042").a());
            case 2925:
                eyik eyikVar13 = this.a.a.acL;
                eyikVar13.getClass();
                Object objB13 = eyikVar13.b();
                objB13.getClass();
                return objB13;
            case 2926:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45612627").e());
            case 2927:
                eyik eyikVar14 = this.a.a.acN;
                eyikVar14.getClass();
                Object objB14 = eyikVar14.b();
                objB14.getClass();
                return objB14;
            case 2928:
                return ((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45614830").d();
            case 2929:
                eyik eyikVar15 = this.a.a.acP;
                eyikVar15.getClass();
                Object objB15 = eyikVar15.b();
                objB15.getClass();
                return objB15;
            case 2930:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45616836").e());
            case 2931:
                eyik eyikVar16 = this.a.a.acR;
                eyikVar16.getClass();
                Object objB16 = eyikVar16.b();
                objB16.getClass();
                return objB16;
            case 2932:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45615216").e());
            case 2933:
                eyik eyikVar17 = this.a.a.acT;
                eyikVar17.getClass();
                Object objB17 = eyikVar17.b();
                objB17.getClass();
                return objB17;
            case 2934:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45617891").b());
            case 2935:
                eyik eyikVar18 = this.a.a.acV;
                eyikVar18.getClass();
                Object objB18 = eyikVar18.b();
                objB18.getClass();
                return objB18;
            case 2936:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45625107").e());
            case 2937:
                eyik eyikVar19 = this.a.a.acX;
                eyikVar19.getClass();
                Object objB19 = eyikVar19.b();
                objB19.getClass();
                return objB19;
            case 2938:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45631613").b());
            case 2939:
                eyik eyikVar20 = this.a.a.acZ;
                eyikVar20.getClass();
                Object objB20 = eyikVar20.b();
                objB20.getClass();
                return objB20;
            case 2940:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45631614").b());
            case 2941:
                eyik eyikVar21 = this.a.a.adb;
                eyikVar21.getClass();
                Object objB21 = eyikVar21.b();
                objB21.getClass();
                return objB21;
            case 2942:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45631912").b());
            case 2943:
                eyik eyikVar22 = this.a.a.add;
                eyikVar22.getClass();
                Object objB22 = eyikVar22.b();
                objB22.getClass();
                return objB22;
            case 2944:
                return Boolean.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45655746").e());
            case 2945:
                eyik eyikVar23 = this.a.a.adf;
                eyikVar23.getClass();
                Object objB23 = eyikVar23.b();
                objB23.getClass();
                return objB23;
            case 2946:
                return Long.valueOf(((ehdm) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto", "45656735").b());
            case 2947:
                eyik eyikVar24 = this.a.a.Ao;
                eyikVar24.getClass();
                Object objB24 = eyikVar24.b();
                objB24.getClass();
                return objB24;
            case 2948:
                eyik eyikVar25 = this.a.a.adi;
                eyikVar25.getClass();
                Object objB25 = eyikVar25.b();
                objB25.getClass();
                return objB25;
            case 2949:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45477072").b());
            case 2950:
                eyik eyikVar26 = this.a.a.adk;
                eyikVar26.getClass();
                Object objB26 = eyikVar26.b();
                objB26.getClass();
                return objB26;
            case 2951:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45477073").b());
            case 2952:
                eyik eyikVar27 = this.a.a.adm;
                eyikVar27.getClass();
                Object objB27 = eyikVar27.b();
                objB27.getClass();
                return objB27;
            case 2953:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45477394").b());
            case 2954:
                eyik eyikVar28 = this.a.a.Ag;
                eyikVar28.getClass();
                Object objB28 = eyikVar28.b();
                objB28.getClass();
                return objB28;
            case 2955:
                eyik eyikVar29 = this.a.a.adp;
                eyikVar29.getClass();
                Object objB29 = eyikVar29.b();
                objB29.getClass();
                return objB29;
            case 2956:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45669223").b());
            case 2957:
                eyik eyikVar30 = this.a.a.adr;
                eyikVar30.getClass();
                Object objB30 = eyikVar30.b();
                objB30.getClass();
                return objB30;
            case 2958:
                return Long.valueOf(((ehdm) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto", "45669224").b());
            case 2959:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                return new cifg(ahnhVar.rd, ahnhVar.sh, ahnhVar.rk, ahnhVar.sj, ahknVar.da, ahnhVar.pf);
            case 2960:
                ahnh ahnhVar2 = this.a.a;
                ahkn ahknVar2 = ahnhVar2.a;
                eyik eyikVar31 = ahknVar2.cD;
                eyik eyikVar32 = ahnhVar2.uJ;
                eyik eyikVar33 = ahnhVar2.zP;
                eyik eyikVar34 = ahnhVar2.sL;
                cogw cogwVar = (cogw) eyikVar31.b();
                eyik eyikVar35 = ahknVar2.t;
                eyik eyikVar36 = ahnhVar2.qE;
                eyik eyikVar37 = ahnhVar2.pd;
                eyik eyikVar38 = ahknVar2.cC;
                eyik eyikVar39 = ahnhVar2.adA;
                eyik eyikVar40 = ahnhVar2.Jd;
                eyik eyikVar41 = ahnhVar2.uo;
                eyik eyikVar42 = ahnhVar2.adD;
                eyik eyikVar43 = ahknVar2.or;
                eyik eyikVar44 = ahknVar2.os;
                return Optional.of(new ahpn(eyikVar32, eyikVar33, eyikVar34, cogwVar, new ahpu(eyikVar35, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyikVar40, eyikVar41, eyikVar42, eyikVar43, eyikVar44, ahnhVar2.adI), new ahpd(ahknVar2.t, ahnhVar2.qE, ahnhVar2.pd, eyikVar38, ahnhVar2.adA, ahnhVar2.Jd, ahnhVar2.uo, ahnhVar2.adD, eyikVar43, eyikVar44, ahnhVar2.Jm, ahnhVar2.adI)));
            case 2961:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                crqv crqvVar = (crqv) ahknVar3.aT.b();
                return new crab(context, crqvVar, new cqzv((Context) ahknVar3.t.b()), (cqvd) ahknVar3.ol.b(), (AudioManager) ahknVar3.ok.b(), (cogw) ahknVar3.cD.b(), (eosd) ahknVar3.p.b());
            case 2962:
                return Optional.of((clfb) this.a.a.adC.b());
            case 2963:
                ahkn ahknVar4 = this.a;
                Context context2 = (Context) ahknVar4.t.b();
                ahnh ahnhVar3 = ahknVar4.a;
                eyik eyikVar45 = ahnhVar3.uJ;
                eyik eyikVar46 = ahnhVar3.adB;
                eosc eoscVar = (eosc) ahknVar4.y.b();
                eosc eoscVar2 = (eosc) ahknVar4.p.b();
                eygg eyggVarA = eyie.a(ahnhVar3.Cs);
                eyik eyikVar47 = ahnhVar3.yw;
                eyik eyikVar48 = ahnhVar3.qr;
                eyik eyikVar49 = ahnhVar3.uM;
                eyik eyikVar50 = ahnhVar3.Jm;
                eyik eyikVar51 = ahknVar4.om;
                eyik eyikVar52 = ahnhVar3.uI;
                eyik eyikVar53 = ahknVar4.op;
                return new czvx(context2, eyikVar45, eyikVar46, eoscVar, eoscVar2, ahknVar4.cD, eyggVarA, eyikVar47, eyikVar48, eyikVar49, eyikVar50, eyikVar51, eyikVar52, ahknVar4.on, ahknVar4.oo, Optional.of(eyikVar53));
            case 2964:
                return new cgfk(this.a.a.rF);
            case 2965:
                ahnh ahnhVar4 = this.a.a;
                Map map = (Map) ahnhVar4.adG.b();
                eyik eyikVar54 = ahnhVar4.adH;
                eyikVar54.getClass();
                Optional.of(new cuhs(eyikVar54));
                return new cuhf(map);
            case 2966:
                cuhg cuhgVar = cuhg.c;
                cuiv cuivVar = new cuiv();
                ahkn ahknVar5 = this.a;
                cuhg cuhgVar2 = cuhg.a;
                ahnh ahnhVar5 = ahknVar5.a;
                eyik eyikVar55 = ahnhVar5.adE;
                eyik eyikVar56 = ahnhVar5.adF;
                eyikVar55.getClass();
                eyikVar56.getClass();
                return ekgp.n(cuhgVar, cuivVar, cuhgVar2, new cuhr(eyikVar56, eyikVar55), cuhg.d, new cuiw());
            case 2967:
                final eyik eyikVar57 = this.a.a.oO;
                return new asgn() { // from class: asfn
                    @Override // defpackage.asgn
                    public final boolean a() {
                        return ((eoth) eyikVar57.b()).a("bugle.enable_cool_ranch_phase1");
                    }
                };
            case 2968:
                final eyik eyikVar58 = this.a.a.oO;
                return new asgu() { // from class: asfz
                    @Override // defpackage.asgu
                    public final boolean a() {
                        return ((eoth) eyikVar58.b()).a("bugle.enable_missing_availability_check");
                    }
                };
            case 2969:
                return new asgp() { // from class: asfp
                };
            case 2970:
                ahkn ahknVar6 = this.a;
                Context context3 = (Context) ahknVar6.t.b();
                ahnh ahnhVar6 = ahknVar6.a;
                return new cgck(context3, eyie.a(ahnhVar6.qF), eyie.a(ahnhVar6.ady), eyie.a(ahnhVar6.pd), (Optional) ((eyig) ahknVar6.dn).a);
            case 2971:
                ahkn ahknVar7 = this.a;
                Context context4 = (Context) ahknVar7.t.b();
                ahnh ahnhVar7 = ahknVar7.a;
                return new cgea(context4, (cqzr) ahnhVar7.pd.b(), (clgq) ahnhVar7.adx.b(), (cgei) ahnhVar7.qF.b());
            case 2972:
                ahkn ahknVar8 = this.a;
                Context context5 = (Context) ahknVar8.t.b();
                ahnh ahnhVar8 = ahknVar8.a;
                return new cgaq(context5, (cgei) ahnhVar8.qF.b(), (cqzr) ahnhVar8.pd.b(), (cgbn) ahnhVar8.Cs.b(), (cpbn) ahnhVar8.qo.b(), (cphu) ahnhVar8.xh.b(), (cgdc) ahnhVar8.aaZ.b(), ahnhVar8.qi);
            case 2973:
                ahkn ahknVar9 = this.a;
                eyik eyikVar59 = ahknVar9.t;
                ahnh ahnhVar9 = ahknVar9.a;
                return new cges(eyikVar59, ahnhVar9.qE, ahnhVar9.wv, ahnhVar9.adN, ahnhVar9.ady, ahnhVar9.adO, ahnhVar9.adx, ahnhVar9.pd, ahnhVar9.Qp, ahnhVar9.adP);
            case 2974:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar10 = ahknVar10.a;
                eyik eyikVar60 = ahnhVar10.QG;
                return new baua(ahnhVar10.Vr, ahknVar10.mU, ahknVar10.np, (aqmq) eyikVar60.b());
            case 2975:
                ahkn ahknVar11 = this.a;
                return new ajgb(ahknVar11.a.qr, ahknVar11.eO);
            case 2976:
                return new cgfb(this.a.a.tb);
            case 2977:
                ahkn ahknVar12 = this.a;
                Context context6 = (Context) ahknVar12.t.b();
                Optional optional = (Optional) ahknVar12.ot.b();
                ahnh ahnhVar11 = ahknVar12.a;
                return new tyo(context6, optional, (avmp) ahnhVar11.Jm.b(), (cgei) ahnhVar11.qF.b());
            case 2978:
                ahkn ahknVar13 = this.a;
                Context context7 = (Context) ahknVar13.t.b();
                Optional optional2 = (Optional) ahknVar13.ot.b();
                ahnh ahnhVar12 = ahknVar13.a;
                return new tyq(context7, optional2, (avmp) ahnhVar12.Jm.b(), (cgei) ahnhVar12.qF.b());
            case 2979:
                ahkn ahknVar14 = this.a;
                return new tyk((Context) ahknVar14.t.b(), (Optional) ahknVar14.ot.b(), (cgei) ahknVar14.a.qF.b());
            case 2980:
                ahkn ahknVar15 = this.a;
                Context context8 = (Context) ahknVar15.t.b();
                ahnh ahnhVar13 = ahknVar15.a;
                return new cgcf(context8, eyie.a(ahnhVar13.qF), eyie.a(ahnhVar13.pd), ahnhVar13.Jm);
            case 2981:
                ahkn ahknVar16 = this.a;
                return new tym((Context) ahknVar16.t.b(), (cgei) ahknVar16.a.qF.b());
            case 2982:
                ahkn ahknVar17 = this.a;
                eyik eyikVar61 = ahknVar17.t;
                ahnh ahnhVar14 = ahknVar17.a;
                return new cgdq(eyikVar61, ahnhVar14.qE, ahnhVar14.Jm, ahnhVar14.sL, ahnhVar14.pd, ahnhVar14.c, ahnhVar14.NH, ahnhVar14.Qp, ahnhVar14.pl, ahnhVar14.qi, ahnhVar14.ady);
            case 2983:
                ahkn ahknVar18 = this.a;
                eyik eyikVar62 = ahknVar18.t;
                ahnh ahnhVar15 = ahknVar18.a;
                return new cgdt(eyikVar62, ahnhVar15.qE, ahnhVar15.Jm, ahnhVar15.sL, ahnhVar15.pQ, ahnhVar15.NH, ahnhVar15.Qp, ahnhVar15.adP);
            case 2984:
                ahkn ahknVar19 = this.a;
                Context context9 = (Context) ahknVar19.t.b();
                ahnh ahnhVar16 = ahknVar19.a;
                return new cfkv(context9, Optional.of((cyta) ahnhVar16.Yd.b()), (cgei) ahnhVar16.qF.b());
            case 2985:
                ahnh ahnhVar17 = this.a.a;
                return new ctan(ahnhVar17.aea, ahnhVar17.yp, (damk) ahnhVar17.aeb.b());
            case 2986:
                return Boolean.valueOf(((eoth) this.a.a.oO.b()).a("bugle.single_inbox_for_rohan_query_fallback"));
            case 2987:
                return new damk((crny) this.a.a.pf.b());
            case 2988:
                return Boolean.valueOf(((ehdm) this.a.a.nM().a.b()).a("com.google.android.apps.messaging.auto", "45368758").e());
            case 2989:
                final eyik eyikVar63 = this.a.a.oO;
                return new apok() { // from class: aorl
                    @Override // defpackage.apok
                    public final boolean a() {
                        return ((eoth) eyikVar63.b()).a("bugle.do_not_report_cms_item_not_found_errors");
                    }
                };
            case 2990:
                final eyik eyikVar64 = this.a.a.oO;
                return new aqmz() { // from class: aqmx
                    @Override // defpackage.aqmz
                    public final boolean a() {
                        return ((eoth) eyikVar64.b()).a("bugle.silent_feedback_manager_logs_uncaught_to_cel");
                    }
                };
            case 2991:
                return new bacd();
            case 2992:
                ahkn ahknVar20 = this.a;
                eyik eyikVar65 = ahknVar20.t;
                ahnh ahnhVar18 = ahknVar20.a;
                return new cmdd(ahknVar20.oz, eyikVar65, ahnhVar18.pb, (fdjx) ahnhVar18.m.b());
            case 2993:
                return new arvi() { // from class: aruu
                };
            case 2994:
                ahkn ahknVar21 = this.a;
                ahnh ahnhVar19 = ahknVar21.a;
                eyik eyikVar66 = ahnhVar19.QG;
                return new cgpw(ahnhVar19.adN, ahnhVar19.uP, ahknVar21.mU, ahnhVar19.Vr, ahknVar21.np, (aqmq) eyikVar66.b(), (arpr) ahnhVar19.Be.b());
            case 2995:
                ahkn ahknVar22 = this.a;
                return new cgoh(ahknVar22.a.aek, ahknVar22.y, ahknVar22.p, ahknVar22.aJ);
            case 2996:
                ahkn ahknVar23 = this.a;
                eosc eoscVar3 = (eosc) ahknVar23.aJ.b();
                eosc eoscVar4 = (eosc) ahknVar23.p.b();
                ahnh ahnhVar20 = ahknVar23.a;
                return new cgqd(eoscVar3, eoscVar4, ahnhVar20.qK, ahnhVar20.ael, ahknVar23.cc());
            case 2997:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar21 = ahknVar24.a;
                return cgmk.a(ahnhVar21.AB, (fdjx) ahnhVar21.oS.b(), (cgpw) ahnhVar21.aek.b(), (arpr) ahnhVar21.Be.b(), ahnhVar21.pL.b(), (Context) ahknVar24.t.b(), ahnhVar21.Qp);
            case 2998:
                return new aqsd() { // from class: aqpp
                };
            case 2999:
                ahkn ahknVar25 = this.a;
                ahnh ahnhVar22 = ahknVar25.a;
                return new csjz((fdjx) ahnhVar22.oS.b(), (fcyh) ahknVar25.cA.b(), ahnhVar22.pQ, ahnhVar22.uJ, ahnhVar22.GG, eyie.a(ahnhVar22.Hc), ahnhVar22.GA, ahnhVar22.BD);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object y() {
        int i = this.b;
        switch (i) {
            case 300:
                return Boolean.valueOf(fafd.b(this.a.a.mX()));
            case 301:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45687802").e());
            case 302:
                return Boolean.valueOf(((ehdm) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto", "45388704").e());
            case 303:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45386372").e());
            case 304:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45386391").e());
            case 305:
                return Boolean.valueOf(this.a.a.mZ().e());
            case 306:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45694897").e());
            case 307:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45682014").e());
            case 308:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45620536").e());
            case 309:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45689428").e());
            case 310:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45696432").e());
            case 311:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45646206").e());
            case 312:
                return Boolean.valueOf(((ehdm) this.a.a.oh().a.b()).a("com.google.android.apps.messaging.auto", "45666893").e());
            case 313:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45682503").e());
            case 314:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45650933").e());
            case 315:
                return Boolean.valueOf(((ehdm) this.a.a.pe().a.b()).a("com.google.android.apps.messaging.auto", "45685305").e());
            case 316:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45693900").e());
            case 317:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45668567").e());
            case 318:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45694801").e());
            case 319:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45678602").e());
            case 320:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45674662").e());
            case 321:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45668223").e());
            case 322:
                return Boolean.valueOf(((ehdm) this.a.a.g.b()).a("com.google.android.apps.messaging.auto", "45673847").e());
            case 323:
                return Boolean.valueOf(((ehdm) this.a.a.ov().a.b()).a("com.google.android.apps.messaging.auto", "45697081").e());
            case 324:
                return Boolean.valueOf(((ehdm) this.a.a.ov().a.b()).a("com.google.android.apps.messaging.auto", "45697080").e());
            case 325:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45692657").e());
            case 326:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45696779").e());
            case 327:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45680349").e());
            case 328:
                return Boolean.valueOf(this.a.a.mX().c());
            case 329:
                return Boolean.valueOf(((ehdm) this.a.a.nC().a.b()).a("com.google.android.apps.messaging.auto", "45687063").e());
            case 330:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45637169").e());
            case 331:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45637170").e());
            case 332:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45637171").e());
            case 333:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45637172").e());
            case 334:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45637173").e());
            case 335:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637176").e());
            case 336:
                return Boolean.valueOf(((ehdm) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto", "45637177").e());
            case 337:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45637179").e());
            case 338:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45637180").e());
            case 339:
                return Boolean.valueOf(((ehdm) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto", "45637181").e());
            case 340:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45637182").e());
            case 341:
                return Boolean.valueOf(((ehdm) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto", "45637183").e());
            case 342:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637184").e());
            case 343:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45637185").e());
            case 344:
                return Boolean.valueOf(this.a.a.mZ().f());
            case 345:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45637187").e());
            case 346:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45639142").e());
            case 347:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45637189").e());
            case 348:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637190").e());
            case 349:
                return Boolean.valueOf(((ehdm) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto", "45637191").e());
            case 350:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45637192").e());
            case 351:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45637193").e());
            case 352:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45637194").e());
            case 353:
                return Boolean.valueOf(((ehdm) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto", "45637195").e());
            case 354:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45637197").e());
            case 355:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45637198").e());
            case 356:
                return Boolean.valueOf(((ehdm) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto", "45637199").e());
            case 357:
                return Boolean.valueOf(((ehdm) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto", "45637200").e());
            case 358:
                return Boolean.valueOf(((ehdm) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto", "45637201").e());
            case 359:
                return Boolean.valueOf(((ehdm) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto", "45637202").e());
            case 360:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45637203").e());
            case 361:
                return Boolean.valueOf(((ehdm) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto", "45637204").e());
            case 362:
                return Boolean.valueOf(((ehdm) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto", "45637205").e());
            case 363:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45637206").e());
            case 364:
                return Boolean.valueOf(((ehdm) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto", "45637207").e());
            case 365:
                return Boolean.valueOf(((ehdm) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto", "45637209").e());
            case 366:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45637210").e());
            case 367:
                return Boolean.valueOf(((ehdm) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto", "45637211").e());
            case 368:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45694015").e());
            case 369:
                return Boolean.valueOf(((ehdm) this.a.a.nE().a.b()).a("com.google.android.apps.messaging.auto", "45637213").e());
            case 370:
                return Boolean.valueOf(((ehdm) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto", "45637214").e());
            case 371:
                return Boolean.valueOf(((ehdm) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto", "45637215").e());
            case 372:
                return Boolean.valueOf(this.a.a.mX().d());
            case 373:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637217").e());
            case 374:
                return Boolean.valueOf(((ehdm) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto", "45637218").e());
            case 375:
                return Boolean.valueOf(((ehdm) this.a.a.nI().a.b()).a("com.google.android.apps.messaging.auto", "45637219").e());
            case 376:
                return Boolean.valueOf(((ehdm) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto", "45637220").e());
            case 377:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45637221").e());
            case 378:
                return Boolean.valueOf(((ehdm) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto", "45637222").e());
            case 379:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45657550").e());
            case 380:
                return Boolean.valueOf(((ehdm) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto", "45688600").e());
            case 381:
                return Boolean.valueOf(((ehdm) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto", "45637463").e());
            case 382:
                return Boolean.valueOf(((ehdm) this.a.a.nH().a.b()).a("com.google.android.apps.messaging.auto", "45692406").e());
            case 383:
                return Boolean.valueOf(((ehdm) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto", "45665261").e());
            case 384:
                return Boolean.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45641894").e());
            case 385:
                return Boolean.valueOf(((ehdm) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto", "45637546").e());
            case 386:
                return Boolean.valueOf(((ehdm) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto", "45688001").e());
            case 387:
                return Boolean.valueOf(((ehdm) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto", "45688632").e());
            case 388:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45678238").e());
            case 389:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45638756").e());
            case 390:
                return Boolean.valueOf(((ehdm) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto", "45545840").e());
            case 391:
                return Boolean.valueOf(this.a.a.mZ().g());
            case 392:
                return Boolean.valueOf(((ehdm) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto", "45623810").e());
            case 393:
                return Boolean.valueOf(((ehdm) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto", "45692360").e());
            case 394:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45687270").e());
            case 395:
                return Boolean.valueOf(((ehdm) this.a.a.nD().a.b()).a("com.google.android.apps.messaging.auto", "45687269").e());
            case 396:
                return Boolean.valueOf(((ehdm) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto", "45629100").e());
            case 397:
                return Boolean.valueOf(((ehdm) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto", "45688263").e());
            case 398:
                return Boolean.valueOf(((ehdm) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto", "45631629").e());
            case 399:
                return Boolean.valueOf(((ehdm) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto", "45407071").e());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [caas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [caas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [caas, java.lang.Object] */
    private final Object z() {
        int i = this.b;
        switch (i) {
            case 3000:
                ahkn ahknVar = this.a;
                return new csnk((Context) ahknVar.t.b(), (ecjh) ahknVar.oG.b(), (csme) ahknVar.a.pK.b(), ahknVar.cD);
            case 3001:
                ahnh ahnhVar = this.a.a;
                return ekhx.v(ahnhVar.fK(), ahnhVar.fJ(), ahnhVar.fF(), ahnhVar.fL(), ahnhVar.fG(), new bykj(), new bzaf[0]);
            case 3002:
                ahnh ahnhVar2 = this.a.a;
                return new bzad((aurx) ahnhVar2.wc.b(), (apod) ahnhVar2.aes.b());
            case 3003:
                final eyik eyikVar = this.a.a.oO;
                return new apod() { // from class: aoqy
                    @Override // defpackage.apod
                    public final boolean a() {
                        return ((eoth) eyikVar.b()).a("bugle.add_trigger_name_in_cms_triggers");
                    }
                };
            case 3004:
                return Optional.of(this.a.a.qR());
            case 3005:
                final eyik eyikVar2 = this.a.a.oO;
                return new apom() { // from class: aoro
                    @Override // defpackage.apom
                    public final boolean a() {
                        return ((eoth) eyikVar2.b()).a("bugle.enable_backup_completeness");
                    }
                };
            case 3006:
                return Optional.of(this.a.a.rm());
            case 3007:
                return Optional.of(this.a.a.aez);
            case 3008:
                ahkn ahknVar2 = this.a;
                Context context = (Context) ahknVar2.t.b();
                ahnh ahnhVar3 = ahknVar2.a;
                return new cmxe(context, (cgei) ahnhVar3.qF.b(), (cgbn) ahnhVar3.Cs.b(), (clgq) ahnhVar3.adx.b());
            case 3009:
                ahkn ahknVar3 = this.a;
                cczn ccznVar = (cczn) ahknVar3.cG.b();
                ahnh ahnhVar4 = ahknVar3.a;
                return new bwwx(ccznVar, ahnhVar4.aeT, ahnhVar4.aeY);
            case 3010:
                ahkn ahknVar4 = this.a;
                ahnh ahnhVar5 = ahknVar4.a;
                return new bwzz(ahknVar4.t, ahnhVar5.aeB, ahnhVar5.aeS, ahknVar4.cD);
            case 3011:
                return new ekph(this.a.a.fA());
            case 3012:
                ahnh ahnhVar6 = this.a.a;
                return ekhx.t((bmgk) ahnhVar6.aeE.b(), (bmgk) ahnhVar6.aeG.b(), (bmgk) ahnhVar6.aeN.b(), (bmgk) ahnhVar6.aeR.b());
            case 3013:
                ahnh ahnhVar7 = this.a.a;
                return new cbop((cbor) ahnhVar7.aeC.b(), (cbph) ahnhVar7.aeD.b(), (cazj) ahnhVar7.rF.b(), (cbaz) ahnhVar7.rG.b());
            case 3014:
                return new cbor(this.a.a.qK);
            case 3015:
                ahnh ahnhVar8 = this.a.a;
                return new cbph((cbor) ahnhVar8.aeC.b(), (dqsn) ahnhVar8.qq.b());
            case 3016:
                return new bxip(this.a.a.aeF);
            case 3017:
                return new byco(this.a.a.rF);
            case 3018:
                ahnh ahnhVar9 = this.a.a;
                ahnhVar9.lT();
                return new daru(ahnhVar9.aeM);
            case 3019:
                return new data(this.a.a.rF);
            case 3020:
                return new dasj(this.a.a.rF);
            case 3021:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar10 = ahknVar5.a;
                return new dark(ahnhVar10.aeJ, ahnhVar10.km(), (fdjx) ahnhVar10.m.b(), (fdjx) ahnhVar10.oQ.b(), (cogw) ahknVar5.cD.b());
            case 3022:
                return Long.valueOf(((ehdm) this.a.a.pf().a.b()).a("com.google.android.apps.messaging.auto", "45531926").b());
            case 3023:
                return new bxir(this.a.a.aeL);
            case 3024:
                return new aqbs() { // from class: aplt
                };
            case 3025:
                ahnh ahnhVar11 = this.a.a;
                return new agmq(ahnhVar11.R(), (agoo) ahnhVar11.aeO.b(), ahnhVar11.aeQ);
            case 3026:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar12 = ahknVar6.a;
                return new agoo(ahnhVar12.S(), ahnhVar12.zs, new admo(), (Executor) ahknVar6.p.b());
            case 3027:
                final eyik eyikVar3 = this.a.a.oO;
                return new arqi() { // from class: arqb
                    @Override // defpackage.arqi
                    public final boolean a() {
                        return ((eoth) eyikVar3.b()).a("bugle.reorder_otp_auto_delete_eligibility_check");
                    }
                };
            case 3028:
                final eyik eyikVar4 = this.a.a.oO;
                return new arpw() { // from class: arpx
                    @Override // defpackage.arpw
                    public final boolean a() {
                        return ((eoth) eyikVar4.b()).a("bugle.add_otp_logcat_logs");
                    }
                };
            case 3029:
                ekgi ekgiVarH = ekgp.h(17);
                ekgiVarH.i(1, new bwwt());
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar13 = ahknVar7.a;
                ekgiVarH.i(19, (bxam) ahnhVar13.aeU.b());
                ekgiVarH.i(15, (bxam) ahknVar7.oJ.b());
                ekgiVarH.i(17, (bxam) ahknVar7.oh.b());
                ekgiVarH.i(14, new bxay());
                ekgiVarH.i(13, ahnhVar13.fl());
                ekgiVarH.i(10, ahkn.iY());
                ekgiVarH.i(18, ahnhVar13.fm());
                ekgiVarH.i(6, ahnhVar13.fn());
                ekgiVarH.i(16, (bxam) ahknVar7.oK.b());
                ekgiVarH.i(8, new bxcq());
                ekgiVarH.i(11, new bxcr());
                ekgiVarH.i(3, ahnhVar13.qB());
                ekgiVarH.i(4, ahnhVar13.fo());
                ekgiVarH.i(7, ahknVar7.bG());
                ekgiVarH.i(5, ahnhVar13.fp());
                ekgiVarH.i(12, ahnhVar13.fq());
                return ekgiVarH.c();
            case 3030:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar14 = ahknVar8.a;
                return new bxaj(ahnhVar14.tt, (aioy) ahknVar8.mh.b(), ahnhVar14.bC());
            case 3031:
                final eyik eyikVar5 = this.a.a.oO;
                return new aptk() { // from class: aozq
                    @Override // defpackage.aptk
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("bugle.enable_table_size_logging");
                    }
                };
            case 3032:
                final eyik eyikVar6 = this.a.a.oO;
                return new apsg() { // from class: aoxs
                    @Override // defpackage.apsg
                    public final boolean a() {
                        return ((eoth) eyikVar6.b()).a("bugle.enable_io_logging");
                    }
                };
            case 3033:
                return Long.valueOf(((ehdm) this.a.a.nY().a.b()).a("com.google.android.apps.messaging.auto", "45426404").b());
            case 3034:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar15 = ahknVar9.a;
                return new bbmi(ahnhVar15.afa, ahnhVar15.Cp, ahknVar9.oN, ahnhVar15.sL, ahnhVar15.aey, ahknVar9.oO, eyii.a);
            case 3035:
                ahkn ahknVar10 = this.a;
                Context context2 = (Context) ahknVar10.t.b();
                eyik eyikVar7 = ahknVar10.da;
                ahnh ahnhVar16 = ahknVar10.a;
                return new CustomUpgradeSteps(context2, ahnhVar16.Cp, (crma) eyikVar7.b(), ahnhVar16.zP, ahnhVar16.sL, ahnhVar16.uJ, (chwq) ahnhVar16.uu.b(), (chwl) ahknVar10.cQ.b(), ahnhVar16.DC, (csrx) ahknVar10.cO.b(), ahnhVar16.uv, (aipo) ahnhVar16.us.b(), (crmx) ahnhVar16.pB.b(), ahnhVar16.eq(), (axjf) ahnhVar16.so.b(), (aypj) ahnhVar16.Cg.b(), ahnhVar16.jB(), ahnhVar16.gq(), (anuh) ahnhVar16.zO.b());
            case 3036:
                final eyik eyikVar8 = this.a.a.oO;
                return new arjd() { // from class: arhx
                    @Override // defpackage.arjd
                    public final boolean a() {
                        return ((eoth) eyikVar8.b()).a("bugle.log_backup_db_upgrade_failure_to_flogger");
                    }
                };
            case 3037:
                return new dqro(this.a.a.rh());
            case 3038:
                return bsrm.a((bxhg) this.a.a.Ks.b());
            case 3039:
                return new aqbj() { // from class: aple
                };
            case 3040:
                return Optional.of((cden) this.a.a.qN.b());
            case 3041:
                final eyik eyikVar9 = this.a.a.oO;
                return new apqc() { // from class: aoum
                    @Override // defpackage.apqc
                    public final boolean a() {
                        return ((eoth) eyikVar9.b()).a("bugle.use_cms_feedback_logger");
                    }
                };
            case 3042:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar17 = ahknVar11.a;
                return new cprh(ahknVar11.eD, ahnhVar17.xk, (dqsn) ahnhVar17.qq.b());
            case 3043:
                ahnh ahnhVar18 = this.a.a;
                return new caah(ahnhVar18.afk, ahnhVar18.afH, ahnhVar18.Iz);
            case 3044:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar19 = ahknVar12.a;
                return new tof((cgbn) ahnhVar19.Cs.b(), (Optional) ahknVar12.ot.b(), (Optional) ((eyig) ahknVar12.oY).a, (aurx) ahnhVar19.wc.b(), (autx) ahnhVar19.MP.b(), ahnhVar19.Dj, (Context) ahknVar12.t.b(), (fdjx) ahnhVar19.oQ.b());
            case 3045:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar20 = ahknVar13.a;
                eyik eyikVar10 = ahnhVar20.tt;
                byya byyaVarFM = ahnhVar20.fM();
                axlf axlfVar = (axlf) ahnhVar20.Lw.b();
                dqsn dqsnVar = (dqsn) ahnhVar20.qq.b();
                byeq byeqVar = (byeq) ahnhVar20.sG.b();
                eyik eyikVar11 = ahnhVar20.vh;
                eyik eyikVar12 = ahnhVar20.afl;
                apow apowVar = (apow) ahnhVar20.Iy.b();
                ains ainsVar = (ains) ahnhVar20.pb.b();
                aurx aurxVar = (aurx) ahnhVar20.wc.b();
                eyik eyikVar13 = ahnhVar20.afm;
                eosc eoscVar = (eosc) ahknVar13.y.b();
                eosc eoscVar2 = (eosc) ahknVar13.p.b();
                Context context3 = (Context) ahknVar13.t.b();
                aukz aukzVar = (aukz) ahnhVar20.Iz.b();
                bzjq bzjqVarFU = ahnhVar20.fU();
                bzin bzinVarFT = ahnhVar20.fT();
                caby cabyVarGu = ahnhVar20.gu();
                bzvl bzvlVarGn = ahnhVar20.gn();
                axky axkyVar = (axky) ahnhVar20.HN.b();
                autx autxVar = (autx) ahnhVar20.MP.b();
                cogw cogwVar = (cogw) ahknVar13.cD.b();
                ahnhVar20.sk();
                eyik eyikVar14 = ahknVar13.aQ;
                eyik eyikVar15 = ahnhVar20.afE;
                eyik eyikVar16 = ahnhVar20.afF;
                egzh egzhVar = (egzh) eyikVar14.b();
                appi appiVarAZ = ahnhVar20.aZ();
                Optional.of(ahnhVar20.dJ());
                return new cpnk(eyikVar10, byyaVarFM, axlfVar, dqsnVar, byeqVar, eyikVar11, eyikVar12, apowVar, ainsVar, aurxVar, eyikVar13, eoscVar, eoscVar2, context3, aukzVar, bzjqVarFU, bzinVarFT, cabyVarGu, bzvlVarGn, axkyVar, autxVar, cogwVar, eyikVar15, eyikVar16, egzhVar, appiVarAZ);
            case 3046:
                return Boolean.valueOf(aoru.a((eoth) this.a.a.oO.b()));
            case 3047:
                return new caea(this.a.a.rF);
            case 3048:
                final eyik eyikVar17 = this.a.a.oO;
                return new apoi() { // from class: aorh
                    @Override // defpackage.apoi
                    public final boolean a() {
                        return ((eoth) eyikVar17.b()).a("bugle.bnr_delay_media_download");
                    }
                };
            case 3049:
                final eyik eyikVar18 = this.a.a.oO;
                return new apoj() { // from class: aorj
                    @Override // defpackage.apoj
                    public final boolean a() {
                        return ((eoth) eyikVar18.b()).a("bugle.bnr_delay_media_upload");
                    }
                };
            case 3050:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar21 = ahknVar14.a;
                ahnhVar21.fG();
                ahnhVar21.fK();
                ahnhVar21.fF();
                ahnhVar21.fJ();
                ahnhVar21.fL();
                return new byik(ahnhVar21.fY(), (eosc) ahknVar14.p.b(), (eosc) ahknVar14.y.b());
            case 3051:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar22 = ahknVar15.a;
                return new bzmo((byeq) ahnhVar22.sG.b(), (aukz) ahnhVar22.Iz.b(), (cden) ahnhVar22.qN.b(), (apqc) ahnhVar22.afi.b(), (fcyh) ahknVar15.cz.b(), ahnhVar22.wc);
            case 3052:
                return Optional.of((bvos) this.a.a.afr.b());
            case 3053:
                ahkn ahknVar16 = this.a;
                Context context4 = (Context) ahknVar16.t.b();
                ahnh ahnhVar23 = ahknVar16.a;
                return new bvot(context4, (fdjx) ahnhVar23.oQ.b(), ahnhVar23.rK, (egej) ahnhVar23.pI.b(), ahnhVar23.pQ, ahnhVar23.rJ);
            case 3054:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar24 = ahknVar17.a;
                return new cprr((dqsy) ahnhVar24.tt.b(), ahnhVar24.fM(), (byjc) ahnhVar24.MQ.b(), ahnhVar24.gx(), ahnhVar24.gz(), ahnhVar24.gD(), ahnhVar24.gy(), ahnhVar24.gA(), ahnhVar24.gt(), ahnhVar24.fZ(), ahnhVar24.fT(), ahnhVar24.gu(), ahnhVar24.gw(), ahnhVar24.fV(), ahnhVar24.fD(), (calx) ahnhVar24.aft.b(), ahnhVar24.gB(), (calv) ahnhVar24.afu.b(), (cpmh) ahknVar17.oZ.b(), (cpuv) ahknVar17.pa.b(), (apom) ahnhVar24.aev.b(), (axky) ahnhVar24.HN.b(), (aurx) ahnhVar24.wc.b(), (caea) ahnhVar24.afm.b(), ahknVar17.bN(), (dqsn) ahnhVar24.qq.b(), (bzox) ahnhVar24.RB.b(), ahnhVar24.dI(), ahnhVar24.aZ(), (fdjx) ahnhVar24.m.b(), (aukh) ahknVar17.eF.b(), (bzvq) ahnhVar24.afv.b(), (bzvr) ahnhVar24.afw.b(), (bzvt) ahnhVar24.afx.b(), (bzvz) ahnhVar24.afy.b(), (bzvv) ahnhVar24.afz.b(), (bzvx) ahnhVar24.afA.b(), (ains) ahnhVar24.pb.b(), ahnhVar24.bA(), (caiy) ahnhVar24.afB.b(), (cacm) ahnhVar24.afC.b(), (cacg) ahnhVar24.afD.b(), ahnhVar24.gL());
            case 3055:
                return new calx(this.a.a.rF);
            case 3056:
                return new calv(this.a.a.rF);
            case 3057:
                return new bzvq(this.a.a.rF);
            case 3058:
                return new bzvr(this.a.a.rF);
            case 3059:
                return new bzvt(this.a.a.rF);
            case 3060:
                return new bzvz(this.a.a.rF);
            case 3061:
                return new bzvv(this.a.a.rF);
            case 3062:
                return new bzvx(this.a.a.rF);
            case 3063:
                return new caiy((fdjx) this.a.a.m.b());
            case 3064:
                return new cacm(this.a.a.rF);
            case 3065:
                return new cacg(this.a.a.rF);
            case 3066:
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar25 = ahknVar18.a;
                return new caqv((cprj) ahnhVar25.afE.b(), (dqsn) ahnhVar25.qq.b(), (fcyh) ahknVar18.cz.b(), (fdjx) ahnhVar25.oQ.b());
            case 3067:
                ahkn ahknVar19 = this.a;
                return new cpgn(ahknVar19.t, ahknVar19.cz, ahknVar19.dk, ahknVar19.a.m);
            case 3068:
                ahnh ahnhVar26 = this.a.a;
                return new awlc(ahnhVar26.afJ, (fdjx) ahnhVar26.m.b());
            case 3069:
                return new ekph((caiq) this.a.a.xa.b());
            case 3070:
                ahnh ahnhVar27 = this.a.a;
                ?? Pw = ahnhVar27.pw();
                caai caaiVarGp = ahnhVar27.gp();
                evuo parserForType = caaa.a.getParserForType();
                parserForType.getClass();
                pza pzaVar = pza.b;
                long jLongValue = ((Number) caao.b.e()).longValue();
                caah caahVar = caaiVarGp.c;
                Context context5 = caaiVarGp.b;
                fdjx fdjxVar = caaiVarGp.a;
                axlf axlfVar2 = caaiVarGp.f;
                apqc apqcVar = caaiVarGp.g;
                cden cdenVar = caaiVarGp.e;
                return new caao(context5, pzj.a, fdjxVar, caahVar.a(), bzzy.class, axlfVar2, Pw, Object.class, parserForType, pzaVar, apqcVar, Alert.DURATION_SHOW_INDEFINITELY, jLongValue, caze.WORKMANAGER_ONLY, Optional.empty(), null, cdenVar);
            case 3071:
                ahnh ahnhVar28 = this.a.a;
                return cabf.a(ahnhVar28.gp(), ahnhVar28.gr());
            case 3072:
                ahnh ahnhVar29 = this.a.a;
                caai caaiVarGp2 = ahnhVar29.gp();
                cary caryVarGK = ahnhVar29.gK();
                evuo parserForType2 = bzzx.a.getParserForType();
                parserForType2.getClass();
                int iIntValue = ((Number) caao.a.e()).intValue();
                pza pzaVar2 = pza.a;
                long jLongValue2 = ((Number) caao.b.e()).longValue();
                pzj pzjVar = pzj.a;
                caze cazeVar = caze.WORKMANAGER_ONLY;
                Optional optionalEmpty = Optional.empty();
                return new caao(caaiVarGp2.b, pzjVar, caaiVarGp2.a, new caat(), bzzy.class, caaiVarGp2.f, caryVarGK, Object.class, parserForType2, pzaVar2, caaiVarGp2.g, iIntValue, jLongValue2, cazeVar, optionalEmpty, null, caaiVarGp2.e);
            case 3073:
                ahnh ahnhVar30 = this.a.a;
                caai caaiVarGp3 = ahnhVar30.gp();
                cabl cablVarGs = ahnhVar30.gs();
                evuo parserForType3 = cang.b.getParserForType();
                parserForType3.getClass();
                int iIntValue2 = ((Number) caao.a.e()).intValue();
                pza pzaVar3 = pza.a;
                long jLongValue3 = ((Number) caao.b.e()).longValue();
                caae caaeVar = caaiVarGp3.d;
                Context context6 = caaiVarGp3.b;
                fdjx fdjxVar2 = caaiVarGp3.a;
                axlf axlfVar3 = caaiVarGp3.f;
                apqc apqcVar2 = caaiVarGp3.g;
                cden cdenVar2 = caaiVarGp3.e;
                return new caao(context6, pzj.a, fdjxVar2, caaeVar.a(), bzzy.class, axlfVar3, cablVarGs, cabi.class, parserForType3, pzaVar3, apqcVar2, iIntValue2, jLongValue3, caze.WORKMANAGER_ONLY, Optional.empty(), null, cdenVar2);
            case 3074:
                ahnh ahnhVar31 = this.a.a;
                return bzpu.a(ahnhVar31.gp(), ahnhVar31.gh());
            case 3075:
                ahnh ahnhVar32 = this.a.a;
                return bzpw.a(ahnhVar32.gp(), ahnhVar32.gh());
            case 3076:
                ahnh ahnhVar33 = this.a.a;
                return bzpz.a(ahnhVar33.gp(), ahnhVar33.gh());
            case 3077:
                ahnh ahnhVar34 = this.a.a;
                return bzpy.a(ahnhVar34.gp(), ahnhVar34.gh());
            case 3078:
                ahnh ahnhVar35 = this.a.a;
                return bzpv.a(ahnhVar35.gp(), ahnhVar35.gh());
            case 3079:
                ahnh ahnhVar36 = this.a.a;
                return bzpx.a(ahnhVar36.gp(), ahnhVar36.gh());
            case 3080:
                ahnh ahnhVar37 = this.a.a;
                return bzup.a(ahnhVar37.gp(), ahnhVar37.gl());
            case 3081:
                ahnh ahnhVar38 = this.a.a;
                return bzvh.a(ahnhVar38.gp(), ahnhVar38.gm());
            case 3082:
                return Boolean.valueOf(((ehdm) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto", "45417297").e());
            case 3083:
                final eyik eyikVar19 = this.a.a.oO;
                return new apou() { // from class: aosc
                    @Override // defpackage.apou
                    public final boolean a() {
                        return ((eoth) eyikVar19.b()).a("bugle.enable_foreground_service_for_media_backup");
                    }
                };
            case 3084:
                ahnh ahnhVar39 = this.a.a;
                return bzwf.a(ahnhVar39.gp(), ahnhVar39.go(), 4, true);
            case 3085:
                ahnh ahnhVar40 = this.a.a;
                return bzwf.a(ahnhVar40.gp(), ahnhVar40.go(), 3, true);
            case 3086:
                ahnh ahnhVar41 = this.a.a;
                return bzwf.a(ahnhVar41.gp(), ahnhVar41.go(), 3, false);
            case 3087:
                ahnh ahnhVar42 = this.a.a;
                return bzwf.a(ahnhVar42.gp(), ahnhVar42.go(), 4, false);
            case 3088:
                ahnh ahnhVar43 = this.a.a;
                return bzwf.b(ahnhVar43.gp(), ahnhVar43.go(), 4, false, ahnhVar43.fH());
            case 3089:
                ahnh ahnhVar44 = this.a.a;
                return bzwf.b(ahnhVar44.gp(), ahnhVar44.go(), 4, true, ahnhVar44.fH());
            case 3090:
                ahnh ahnhVar45 = this.a.a;
                return bzwf.b(ahnhVar45.gp(), ahnhVar45.go(), 3, true, ahnhVar45.fH());
            case 3091:
                ahnh ahnhVar46 = this.a.a;
                return bzwf.b(ahnhVar46.gp(), ahnhVar46.go(), 3, false, ahnhVar46.fH());
            case 3092:
                ahnh ahnhVar47 = this.a.a;
                return bzwh.a(ahnhVar47.gp(), ahnhVar47.go());
            case 3093:
                ahnh ahnhVar48 = this.a.a;
                return bzwg.a(ahnhVar48.gp(), ahnhVar48.go());
            case 3094:
                ahnh ahnhVar49 = this.a.a;
                ?? PE = ahnhVar49.pE();
                caai caaiVarGp4 = ahnhVar49.gp();
                ahnhVar49.sl();
                cczi ccziVar = cabp.a;
                evuo parserForType4 = cabo.a.getParserForType();
                parserForType4.getClass();
                Object objE = cabs.b.e();
                objE.getClass();
                int iIntValue3 = ((Number) objE).intValue();
                pzh pzhVar = new pzh();
                pzhVar.c(4);
                pzj pzjVarA = pzhVar.a();
                pza pzaVar4 = pza.a;
                long jLongValue4 = ((Number) caao.b.e()).longValue();
                caah caahVar2 = caaiVarGp4.c;
                Context context7 = caaiVarGp4.b;
                fdjx fdjxVar3 = caaiVarGp4.a;
                axlf axlfVar4 = caaiVarGp4.f;
                apqc apqcVar3 = caaiVarGp4.g;
                cden cdenVar3 = caaiVarGp4.e;
                return new caao(context7, pzjVarA, fdjxVar3, caahVar2.a(), bzzy.class, axlfVar4, PE, cabx.a.class, parserForType4, pzaVar4, apqcVar3, iIntValue3, jLongValue4, caze.WORKMANAGER_ONLY, Optional.empty(), null, cdenVar3);
            case 3095:
                ahnh ahnhVar50 = this.a.a;
                ?? PF = ahnhVar50.pF();
                caai caaiVarGp5 = ahnhVar50.gp();
                ahnhVar50.sm();
                cczi ccziVar2 = cabp.a;
                evuo parserForType5 = bzzx.a.getParserForType();
                parserForType5.getClass();
                Object objE2 = cabp.a.e();
                objE2.getClass();
                int iIntValue4 = ((Number) objE2).intValue();
                pzh pzhVar2 = new pzh();
                pzhVar2.c(4);
                pzj pzjVarA2 = pzhVar2.a();
                pza pzaVar5 = pza.a;
                long jLongValue5 = ((Number) caao.b.e()).longValue();
                caah caahVar3 = caaiVarGp5.c;
                Context context8 = caaiVarGp5.b;
                fdjx fdjxVar4 = caaiVarGp5.a;
                axlf axlfVar5 = caaiVarGp5.f;
                apqc apqcVar4 = caaiVarGp5.g;
                cden cdenVar4 = caaiVarGp5.e;
                return new caao(context8, pzjVarA2, fdjxVar4, caahVar3.a(), bzzy.class, axlfVar5, PF, cacf.a.class, parserForType5, pzaVar5, apqcVar4, iIntValue4, jLongValue5, caze.WORKMANAGER_ONLY, Optional.empty(), null, cdenVar4);
            case 3096:
                ahnh ahnhVar51 = this.a.a;
                return camu.a(ahnhVar51.gp(), ahnhVar51.gC());
            case 3097:
                ahnh ahnhVar52 = this.a.a;
                return camv.a(ahnhVar52.gp(), ahnhVar52.gC());
            case 3098:
                ahnh ahnhVar53 = this.a.a;
                return camw.a(ahnhVar53.gp(), ahnhVar53.gC(), ahnhVar53.fN());
            case 3099:
                return this.a.a.dR();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return c();
            case 2:
                return n();
            case 3:
                return y();
            case 4:
                return E();
            case 5:
                return F();
            case 6:
                return G();
            case 7:
                return H();
            case 8:
                return I();
            case 9:
                return J();
            case 10:
                return d();
            case 11:
                return e();
            case 12:
                return f();
            case 13:
                return g();
            case 14:
                return h();
            case 15:
                return i();
            case 16:
                return j();
            case 17:
                return k();
            case 18:
                return l();
            case 19:
                return m();
            case 20:
                return o();
            case 21:
                return p();
            case 22:
                return q();
            case 23:
                return r();
            case 24:
                return s();
            case 25:
                return t();
            case 26:
                return u();
            case 27:
                return v();
            case 28:
                return w();
            case 29:
                return x();
            case 30:
                return z();
            case 31:
                return A();
            case 32:
                return B();
            case 33:
                return C();
            case 34:
                return D();
            default:
                switch (i) {
                    case 3500:
                        return new dvfk((Context) this.a.t.b());
                    case 3501:
                        ahkn ahknVar = this.a;
                        Context context = (Context) ahknVar.t.b();
                        egpm egpmVar = (egpm) ahknVar.dR.b();
                        ecii eciiVar = new ecii();
                        eciiVar.b(context);
                        eciiVar.a();
                        eciiVar.b = new eooz() { // from class: dvfy
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return eork.h(new IllegalStateException());
                            }
                        };
                        eciiVar.d = egpmVar;
                        return new ecil(eciiVar);
                    case 3502:
                        Context context2 = (Context) this.a.t.b();
                        dcfd dcfdVar = deaa.a;
                        return new deae(context2);
                    case 3503:
                        egcy egcyVar = new egcy();
                        ehvr ehvrVarK = ehvs.k();
                        ((ehvl) ehvrVarK).a = "AccountSyncData";
                        ehvrVarK.d(egcx.a);
                        ehvrVarK.c(egcyVar);
                        ehvs ehvsVarA = ehvrVarK.a();
                        ahkn ahknVar2 = this.a;
                        return ahknVar2.ev().a(ehvsVarA, (ecev) ahknVar2.aL.b());
                    case 3504:
                        return new ekph(new egdk((egzh) this.a.a.a.aQ.b()));
                    case 3505:
                        return new eoqr();
                    case 3506:
                        return new ehwm((Context) this.a.t.b());
                    case 3507:
                        ahkn ahknVar3 = this.a;
                        return new ehwn((Context) ahknVar3.t.b(), (ConnectivityManager) ahknVar3.dO.b());
                    case 3508:
                        ahkn ahknVar4 = this.a;
                        return new ehwo((Context) ahknVar4.t.b(), (ConnectivityManager) ahknVar4.dO.b());
                    case 3509:
                        ahnh ahnhVar = this.a.a;
                        Collection ekphVar = ahnhVar.rW() ? new ekph((eiar) ahnhVar.aon.b()) : ekon.a;
                        ekphVar.getClass();
                        return ekhx.o(ekphVar);
                    case 3510:
                        ahkn ahknVar5 = this.a;
                        Context context3 = (Context) ahknVar5.t.b();
                        ahnh ahnhVar2 = ahknVar5.a;
                        return new eiau(context3, Boolean.valueOf(ahnhVar2.rW()), ahnhVar2.aok, (eosc) ahknVar5.p.b(), (ehro) ahnhVar2.aom.b());
                    case 3511:
                        ahkn ahknVar6 = this.a;
                        Application applicationA = eyht.a(ahknVar6.c);
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ahknVar6.y.b();
                        dbyl dbylVar = new dbyl(applicationA, "STREAMZ_TIKTOK", null);
                        dbylVar.g(eyek.UNMETERED_OR_DAILY);
                        return new ehsc(scheduledExecutorService, new ecod(dbylVar, "STREAMZ_TIKTOK"), applicationA);
                    case 3512:
                        return new ehro((dejx) this.a.a.aol.b());
                    case 3513:
                        return dejv.a((Context) this.a.t.b());
                    case 3514:
                        final eyik eyikVar = this.a.a.oO;
                        return new apsq() { // from class: aoyk
                            @Override // defpackage.apsq
                            public final boolean a() {
                                return ((eoth) eyikVar.b()).a("bugle.enable_periodic_workers_for_synclets");
                            }
                        };
                    case 3515:
                        ahkn ahknVar7 = this.a;
                        return new ehzt((egsh) ahknVar7.dG.b(), ahknVar7.a.mO(), (diep) ahknVar7.l.b(), (Executor) ahknVar7.p.b(), (Boolean) ahknVar7.bC.b());
                    case 3516:
                        return new SecureRandom();
                    case 3517:
                        ahkn ahknVar8 = this.a;
                        return new ehzz((egsh) ahknVar8.dG.b(), ahknVar8.a.mO(), (Executor) ahknVar8.p.b(), (Boolean) ahknVar8.bC.b());
                    case 3518:
                        ahnh ahnhVar3 = this.a.a;
                        ekhv ekhvVarI = ekhx.i(6);
                        final egkc egkcVar = (egkc) ahnhVar3.aow.b();
                        ekhvVarI.c(new egbw() { // from class: egjw
                            @Override // defpackage.egbw
                            public final ListenableFuture l(egbv egbvVar) {
                                egkc egkcVar2 = egkcVar;
                                ejwi ejwiVar = egkcVar2.d;
                                ecjh ecjhVar = egkcVar2.a;
                                final efwo efwoVar = ((egdc) egbvVar).a;
                                return ecjhVar.b(new ejvr() { // from class: egjz
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        egkf egkfVar = (egkf) obj;
                                        egkd egkdVar = (egkd) egkfVar.toBuilder();
                                        for (String str : DesugarCollections.unmodifiableMap(egkfVar.b).keySet()) {
                                            str.getClass();
                                            evub evubVar = egkfVar.b;
                                            if (!evubVar.containsKey(str)) {
                                                throw new IllegalArgumentException();
                                            }
                                            if (((Integer) evubVar.get(str)).intValue() == efwoVar.a()) {
                                                egkdVar.a(str);
                                            }
                                        }
                                        return (egkf) egkdVar.build();
                                    }
                                }, eoqg.a);
                            }
                        });
                        final efyt efytVar = (efyt) ahnhVar3.aox.b();
                        ekhvVarI.c(new egbw() { // from class: efye
                            @Override // defpackage.egbw
                            public final ListenableFuture l(egbv egbvVar) {
                                efytVar.d();
                                return eork.i(null);
                            }
                        });
                        ahkn ahknVar9 = ahnhVar3.a;
                        boolean zBooleanValue = ((Boolean) ahknVar9.bC.b()).booleanValue();
                        final eyik eyikVar2 = ahnhVar3.aot;
                        Iterable ekphVar2 = !zBooleanValue ? ekon.a : new ekph(new egbw() { // from class: ehyo
                            @Override // defpackage.egbw
                            public final ListenableFuture l(egbv egbvVar) {
                                return ((ehym) eyikVar2.b()).f();
                            }
                        });
                        ekphVar2.getClass();
                        ekhvVarI.j(ekphVar2);
                        final egzh egzhVar = (egzh) ahknVar9.aQ.b();
                        ekhvVarI.c(new egbw() { // from class: egdm
                            @Override // defpackage.egbw
                            public final ListenableFuture l(egbv egbvVar) {
                                ListenableFuture listenableFutureI = eork.i(null);
                                egzhVar.a(listenableFutureI, "com.google.apps.tiktok.account.data.AllAccounts");
                                return listenableFutureI;
                            }
                        });
                        ekhvVarI.c(ahnhVar3.my());
                        ekhvVarI.c((ctcm) ahnhVar3.aah.b());
                        return ekhvVarI.g();
                    case 3519:
                        ahkn ahknVar10 = this.a;
                        Context context4 = (Context) ahknVar10.t.b();
                        ahnh ahnhVar4 = ahknVar10.a;
                        return new egkc(context4, (ecjh) ahnhVar4.aov.b(), (egcd) ahnhVar4.l.b(), ejud.a);
                    case 3520:
                        ahkn ahknVar11 = this.a;
                        ahkn ahknVar12 = ahknVar11.a.a;
                        Optional optionalEmpty = Optional.empty();
                        ehvr ehvrVarK2 = ehvs.k();
                        ((ehvl) ehvrVarK2).a = "DefaultAccountData";
                        ehvrVarK2.d(egkf.a);
                        optionalEmpty.isPresent();
                        return ahknVar11.ev().a(ehvrVarK2.a(), (ecev) ahknVar11.aL.b());
                    case 3521:
                        ahnh ahnhVar5 = this.a.a;
                        return new efzb(new efyf((egcd) ahnhVar5.l.b()), (eosc) ahnhVar5.j.b());
                    case 3522:
                        ahnh ahnhVar6 = this.a.a;
                        ekhv ekhvVarI2 = ekhx.i(7);
                        final eyik eyikVar3 = ahnhVar6.aoz;
                        Boolean bool = false;
                        bool.getClass();
                        ekhvVarI2.j(new ekph(new egbu() { // from class: egsz
                            @Override // defpackage.egbu
                            public final ListenableFuture b(egbv egbvVar) {
                                return ((egui) eyikVar3.b()).b(null);
                            }
                        }));
                        ahkn ahknVar13 = ahnhVar6.a;
                        final egjh egjhVarEg = ahknVar13.eg();
                        ekhvVarI2.c(new egbu() { // from class: egjb
                            @Override // defpackage.egbu
                            public final ListenableFuture b(egbv egbvVar) {
                                final efwo efwoVar = ((egdc) egbvVar).a;
                                final egjh egjhVar = egjhVarEg;
                                return eork.n(new eooy() { // from class: egje
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        String strB = egip.b(efwoVar);
                                        ArrayList arrayList = new ArrayList();
                                        egjh egjhVar2 = egjhVar;
                                        ekqg ekqgVarListIterator = egjhVar2.b.a().listIterator();
                                        while (ekqgVarListIterator.hasNext()) {
                                            arrayList.add(egjhVar2.a(new File((File) ekqgVarListIterator.next(), strB)));
                                        }
                                        return eork.c(arrayList).a(new eopa(null), eoqg.a);
                                    }
                                }, egjhVar.a);
                            }
                        });
                        ekhvVarI2.c(new axkm(ahnhVar6.HN, ahnhVar6.afH, ahnhVar6.wc, ahnhVar6.Cs, ahnhVar6.k, (eosc) ahknVar13.y.b(), (eosc) ahknVar13.p.b()));
                        ekhvVarI2.c(new bvmp(ahnhVar6.afr, ahnhVar6.tG, (fdjx) ahnhVar6.oQ.b()));
                        ekhvVarI2.c(new egjk((Context) ahknVar13.t.b(), (eosc) ahknVar13.y.b(), (eosc) ahnhVar6.j.b()));
                        ekhvVarI2.c(new cdpx(ahnhVar6.ajN));
                        ekhvVarI2.c(new chkx((fdjx) ahnhVar6.m.b(), (fdjx) ahnhVar6.oS.b(), ahnhVar6.rS, ahnhVar6.aoA));
                        return ekhvVarI2.g();
                    case 3523:
                        ahkn ahknVar14 = this.a;
                        return new egui((egcd) ahknVar14.a.l.b(), (Executor) ahknVar14.y.b(), (egtw) ahknVar14.dG.b());
                    case 3524:
                        return Optional.of((ctcm) this.a.a.aah.b());
                    case 3525:
                        final eheg ehegVar = (eheg) this.a.a.tL.b();
                        ehegVar.getClass();
                        return new ekph(new egbx() { // from class: ehdx
                            @Override // defpackage.egbx
                            public final ListenableFuture b(egbv egbvVar) throws IOException {
                                eieu eieuVarJ = eiiy.j("AccountEnabled: updateConfigurationsForAllPackages", eiey.a);
                                try {
                                    ListenableFuture listenableFutureD = ehegVar.d(((egdc) egbvVar).a);
                                    eieuVarJ.b(listenableFutureD);
                                    fczl.a(eieuVarJ, null);
                                    return listenableFutureD;
                                } finally {
                                }
                            }
                        });
                    case 3526:
                        ahnh ahnhVar7 = this.a.a;
                        return new egcc((egcd) ahnhVar7.l.b(), (egcq) ahnhVar7.aod.b());
                    case 3527:
                        ahkn ahknVar15 = this.a;
                        ejwi ejwiVar = (ejwi) ((eyig) ahknVar15.bi).a;
                        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ahknVar15.p.b();
                        ahnh ahnhVar8 = ahknVar15.a;
                        return new ehfz(ejwiVar, scheduledExecutorService2, (ehey) ahnhVar8.tM.b(), (ehey) ahnhVar8.tK.b(), (Map) ahknVar15.bn.b(), (eaaa) ahknVar15.bg.b(), ahknVar15.es(), (dzyn) ahknVar15.bj.b());
                    case 3528:
                        return new ehdt(ahnh.rZ(), ekon.a);
                    case 3529:
                        return new ehdt(ekhx.s(new ehdf() { // from class: fbmg
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45670050", ehdr.a(false));
                            }
                        }, new ehdf() { // from class: fbmh
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45686668", ehdr.a(false));
                                ekgiVar.i("45632252", ehdr.a(true));
                            }
                        }, new ehdf() { // from class: fbmi
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45640558", ehdr.a(true));
                            }
                        }), ekon.a);
                    case 3530:
                        return new ehdt(ekhx.u(new ehdf() { // from class: fbmk
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45688088", ehdr.a(false));
                                ekgiVar.i("45685150", ehdr.a(true));
                            }
                        }, new ehdf() { // from class: fbmm
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45677525", ehdr.a(false));
                            }
                        }, new ehdf() { // from class: fbmn
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                            }
                        }, new ehdf() { // from class: fbmp
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45685300", ehdr.a(false));
                                ekgiVar.i("45676497", ehdr.a(false));
                                ekgiVar.i("45697289", ehdr.a(false));
                                ekgiVar.i("45689381", ehdr.d(new fdae() { // from class: fbmo
                                    @Override // defpackage.fdae
                                    public final Object invoke() {
                                        try {
                                            return (dbys) evsn.parseFrom(dbys.a, Base64.decode("CAIaCQkAAAAAAAAAAA", 3));
                                        } catch (RuntimeException e) {
                                            throw e;
                                        } catch (Exception e2) {
                                            throw new RuntimeException(e2);
                                        }
                                    }
                                }, dbys.a));
                            }
                        }, new ehdf() { // from class: fbmr
                            @Override // defpackage.ehdf
                            public final void a(ekgi ekgiVar) {
                                ekgiVar.i("45690501", ehdr.a(false));
                                ekgiVar.i("45691321", ehdr.a(false));
                            }
                        }), ekon.a);
                    case 3531:
                        return new ekph((cqkz) this.a.a.rP.b());
                    case 3532:
                        return new cqlb(this.a.aT);
                    case 3533:
                        ahnh ahnhVar9 = this.a.a;
                        return new cqkx(ahnhVar9.qK, ahnhVar9.aoL, ahnhVar9.aoM, (fdjx) ahnhVar9.m.b());
                    case 3534:
                        return new apnz() { // from class: aoqs
                        };
                    case 3535:
                        ahkn ahknVar16 = this.a;
                        return new cqjm((Context) ahknVar16.t.b(), (cogw) ahknVar16.cD.b());
                    case 3536:
                        return new crng();
                    case 3537:
                        ahnh ahnhVar10 = this.a.a;
                        return croi.a(new cror(ahnhVar10.pf, ahnhVar10.LT, ahnhVar10.pg, ahnhVar10.pA, ahnhVar10.amk), ahnhVar10.aoT.b(), ahnhVar10.aoV.b(), ahnhVar10.aoW.b(), new crpl(ahnhVar10.aoX, ahnhVar10.a.t));
                    case 3538:
                        ahkn ahknVar17 = this.a;
                        return new crpb(ahknVar17.a.aoS, ahknVar17.dP, ahknVar17.t);
                    case 3539:
                        ahkn ahknVar18 = this.a;
                        ahnh ahnhVar11 = ahknVar18.a;
                        return new croy(ahnhVar11.aoQ, ahnhVar11.aoR, ahnhVar11.pf, ahknVar18.dP, ahknVar18.t);
                    case 3540:
                        ahkn ahknVar19 = this.a;
                        return new crow(ahknVar19.t, ahknVar19.a.aoP, ahknVar19.dP);
                    case 3541:
                        return new crnu();
                    case 3542:
                        ahkn ahknVar20 = this.a;
                        return new croe((Context) ahknVar20.t.b(), (crma) ahknVar20.da.b());
                    case 3543:
                        ahkn ahknVar21 = this.a;
                        return new crpf(ahknVar21.a.aoU, ahknVar21.dP, ahknVar21.t);
                    case 3544:
                        ahkn ahknVar22 = this.a;
                        return new crpd(ahknVar22.a.aoT, ahknVar22.dP);
                    case 3545:
                        ahnh ahnhVar12 = this.a.a;
                        return new crph(ahnhVar12.aoV, ahnhVar12.pf);
                    case 3546:
                        ahkn ahknVar23 = this.a;
                        ahnh ahnhVar13 = ahknVar23.a;
                        return new crpj(ahnhVar13.aoW, ahnhVar13.pf, ahknVar23.dP);
                    case 3547:
                        return new cqcz((dcdt) this.a.dk.b());
                    case 3548:
                        ahkn ahknVar24 = this.a;
                        return new dggg((Context) ahknVar24.t.b(), ahknVar24.a.ma());
                    case 3549:
                        ahkn ahknVar25 = this.a;
                        return new dxxg(ahknVar25.a.rX(), (eosc) ahknVar25.hy.b());
                    case 3550:
                        return new cixu((cjab) this.a.a.qc());
                    case 3551:
                        return new cixx((cjab) this.a.a.qd());
                    case 3552:
                        return new cjam((cjab) this.a.a.qe());
                    case 3553:
                        return new cjaq((cjab) this.a.a.qf());
                    case 3554:
                        ahkn ahknVar26 = this.a;
                        ahnh ahnhVar14 = ahknVar26.a;
                        Object objQg = ahnhVar14.qg();
                        cjbf cjbfVarJs = ahnhVar14.js();
                        return new cjay((cjab) objQg, cjbfVarJs, (eosc) ahknVar26.p.b());
                    case 3555:
                        return new cjbb((cjab) this.a.a.qh());
                    case 3556:
                        return new cjbe((cjab) this.a.a.qi());
                    case 3557:
                        ahnh ahnhVar15 = this.a.a;
                        bwkr bwkrVar = (bwkr) ahnhVar15.tl.b();
                        ahnhVar15.fc();
                        return new bwet(bwkrVar, ahnhVar15.Fe, (ains) ahnhVar15.c.b(), ahnhVar15.Nf);
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
