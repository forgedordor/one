package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import com.sun.jna.Function;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhfh implements eyik {
    private final dhfi a;
    private final int b;

    public dhfh(dhfi dhfiVar, int i) {
        this.a = dhfiVar;
        this.b = i;
    }

    private final Object a() throws Throwable {
        int i = this.b;
        switch (i) {
            case 0:
                dhgz dhgzVar = (dhgz) ((dfdn) this.a.a).c.b();
                dhgzVar.getClass();
                return dhgzVar;
            case 1:
                dheq dheqVar = (dheq) ((dfdn) this.a.a).aZ.b();
                dheqVar.getClass();
                return dheqVar;
            case 2:
                eosc eoscVarS = this.a.a.s();
                eoscVarS.getClass();
                return eoscVarS;
            case 3:
                dhfi dhfiVar = this.a;
                dgwa dgwaVar = (dgwa) dhfiVar.e.b();
                dfdp dfdpVar = dhfiVar.a;
                dhhc dhhcVarQ = dfdpVar.q();
                dhhcVarQ.getClass();
                return new dgtt(dgwaVar, dhhcVarQ, dfdpVar.t());
            case 4:
                return new dgwa();
            case 5:
                dhfi dhfiVar2 = this.a;
                Context context = (Context) dhfiVar2.g.b();
                ekgp ekgpVarM = ekgp.m(dhki.DUAL_REG, dhfiVar2.aJ, dhki.SINGLE_REG, dhfiVar2.aP);
                eyik eyikVar = dhfiVar2.bl;
                eyik eyikVar2 = dhfiVar2.aG;
                eyik eyikVar3 = dhfiVar2.D;
                eyik eyikVar4 = dhfiVar2.r;
                eyik eyikVar5 = dhfiVar2.c;
                eyik eyikVar6 = dhfiVar2.n;
                eyik eyikVar7 = dhfiVar2.bk;
                eyik eyikVar8 = dhfiVar2.bj;
                eyik eyikVar9 = dhfiVar2.bc;
                eyik eyikVar10 = dhfiVar2.bb;
                eyik eyikVar11 = dhfiVar2.ba;
                eyik eyikVar12 = dhfiVar2.aR;
                eyik eyikVar13 = dhfiVar2.aQ;
                eyik eyikVar14 = dhfiVar2.v;
                eyik eyikVar15 = dhfiVar2.u;
                eyik eyikVar16 = dhfiVar2.t;
                eygg eyggVarA = eyie.a(dhfiVar2.O);
                eygg eyggVarA2 = eyie.a(eyikVar16);
                eygg eyggVarA3 = eyie.a(eyikVar15);
                eygg eyggVarA4 = eyie.a(eyikVar14);
                eygg eyggVarA5 = eyie.a(eyikVar13);
                eygg eyggVarA6 = eyie.a(eyikVar12);
                eygg eyggVarA7 = eyie.a(eyikVar11);
                eygg eyggVarA8 = eyie.a(eyikVar10);
                eygg eyggVarA9 = eyie.a(eyikVar9);
                eygg eyggVarA10 = eyie.a(eyikVar8);
                eygg eyggVarA11 = eyie.a(eyikVar7);
                eygg eyggVarA12 = eyie.a(eyikVar6);
                eygg eyggVarA13 = eyie.a(eyikVar5);
                eygg eyggVarA14 = eyie.a(eyikVar4);
                eygg eyggVarA15 = eyie.a(eyikVar3);
                eygg eyggVarA16 = eyie.a(eyikVar2);
                dhei dheiVar = (dhei) eyikVar.b();
                dfdp dfdpVar2 = dhfiVar2.a;
                dcdt dcdtVarE = dfdpVar2.e();
                dcdtVarE.getClass();
                crny crnyVarD = dfdpVar2.d();
                crnyVarD.getClass();
                eosc eoscVar = (eosc) dhfiVar2.d.b();
                eygg eyggVarA17 = eyie.a(dhfiVar2.q);
                dejx dejxVarF = dfdpVar2.f();
                dejxVarF.getClass();
                return new RcsEngineProxyImpl(context, ekgpVarM, eyggVarA, eyggVarA2, eyggVarA3, eyggVarA4, eyggVarA5, eyggVarA6, eyggVarA7, eyggVarA8, eyggVarA9, eyggVarA10, eyggVarA11, eyggVarA12, eyggVarA13, dhfiVar2.J, eyggVarA14, eyggVarA15, dhfiVar2.b, eyggVarA16, dheiVar, dcdtVarE, crnyVarD, eoscVar, eyggVarA17, dejxVarF, dhfiVar2.bm);
            case 6:
                return this.a.a.a();
            case 7:
                dhfi dhfiVar3 = this.a;
                eyik eyikVar17 = dhfiVar3.g;
                dgug dgugVarK = dhfiVar3.k();
                Context context2 = (Context) eyikVar17.b();
                dhej dhejVar = (dhej) dhfiVar3.Z.b();
                dgwa dgwaVar2 = (dgwa) dhfiVar3.e.b();
                dfcg dfcgVar = (dfcg) dhfiVar3.B.b();
                dfdp dfdpVar3 = dhfiVar3.a;
                deym deymVarI = dfdpVar3.i();
                deymVarI.getClass();
                dgve dgveVar = (dgve) dhfiVar3.K.b();
                dfdn dfdnVar = (dfdn) dfdpVar3;
                Context context3 = (Context) ((eyig) dfdnVar.b).a;
                eyik eyikVar18 = dfdnVar.by;
                deym deymVar = (deym) eyikVar18.b();
                dfny dfnyVar = deza.b;
                ebfn ebfnVar = (ebfn) dfdnVar.bS.b();
                int[] iArr = dfzn.a;
                ebgz ebgzVar = new ebgz(dfzn.a(((Integer) dfpo.p().a.e.a()).intValue()), dfzn.a(((Integer) dfpo.p().a.f.a()).intValue()), dfzn.a(((Integer) dfpo.p().a.g.a()).intValue()));
                final deym deymVar2 = (deym) eyikVar18.b();
                ebhw ebhwVar = new ebhw();
                deymVar2.getClass();
                final ebia ebiaVar = new ebia() { // from class: dfzl
                    @Override // defpackage.ebia
                    public final void a(ebhy ebhyVar) {
                        if (!dfog.A()) {
                            dhja.c("Skipped logging DNS request of type = %s", ((ebgu) ebhyVar).b);
                            return;
                        }
                        ebgu ebguVar = (ebgu) ebhyVar;
                        ewmm ewmmVar = ebguVar.b;
                        dhja.c("Logging DNS request, type = %s", ewmmVar);
                        ewmd ewmdVar = (ewmd) ewmn.a.createBuilder();
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar = (ewmn) ewmdVar.instance;
                        ewmnVar.c = 1;
                        ewmnVar.b = 1 | ewmnVar.b;
                        String str = ebguVar.a;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar2 = (ewmn) ewmdVar.instance;
                        ewmnVar2.b |= 32;
                        ewmnVar2.g = str;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar3 = (ewmn) ewmdVar.instance;
                        ewmnVar3.d = ewmmVar.f;
                        ewmnVar3.b |= 2;
                        boolean z = ebguVar.e;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar4 = (ewmn) ewmdVar.instance;
                        ewmnVar4.b |= 512;
                        ewmnVar4.k = z;
                        if (dext.a() == 2) {
                            deym.t(ewmdVar, ebhyVar);
                        }
                        deymVar2.k((ewmn) ewmdVar.build());
                    }
                };
                ebhwVar.f = new ebia() { // from class: ebhi
                    @Override // defpackage.ebia
                    public final void a(final ebhy ebhyVar) {
                        ExecutorService executorService = ebhw.c;
                        final ebia ebiaVar2 = ebiaVar;
                        executorService.execute(new Runnable() { // from class: ebhj
                            @Override // java.lang.Runnable
                            public final void run() {
                                dhip dhipVar = ebhw.a;
                                ebiaVar2.a(ebhyVar);
                            }
                        });
                    }
                };
                final ebib ebibVar = new ebib() { // from class: dfzm
                    @Override // defpackage.ebib
                    public final void a(ebhz ebhzVar) {
                        if (!dfog.A()) {
                            ebgv ebgvVar = (ebgv) ebhzVar;
                            dhja.c("Skipped logging DNS request with type = %s and result = %s", ((ebgu) ebgvVar.a).b, ebgvVar.b);
                            return;
                        }
                        ebgv ebgvVar2 = (ebgv) ebhzVar;
                        ebhy ebhyVar = ebgvVar2.a;
                        ebgu ebguVar = (ebgu) ebhyVar;
                        ewmm ewmmVar = ebguVar.b;
                        dhja.c("Logging DNS response, type = %s, result = %s", ewmmVar, ebgvVar2.b);
                        ewmd ewmdVar = (ewmd) ewmn.a.createBuilder();
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar = (ewmn) ewmdVar.instance;
                        ewmnVar.c = 2;
                        ewmnVar.b = 1 | ewmnVar.b;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar2 = (ewmn) ewmdVar.instance;
                        ewmnVar2.b |= 32;
                        ewmnVar2.g = ebguVar.a;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar3 = (ewmn) ewmdVar.instance;
                        ewmnVar3.d = ewmmVar.f;
                        ewmnVar3.b |= 2;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar4 = (ewmn) ewmdVar.instance;
                        ewmnVar4.b |= 512;
                        ewmnVar4.k = ebguVar.e;
                        ewmk ewmkVar = ebhzVar.g() ? ewmk.DNS_QUERY_RESULT_FAILURE : ewmk.DNS_QUERY_RESULT_SUCCESS;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar5 = (ewmn) ewmdVar.instance;
                        ewmnVar5.e = ewmkVar.g;
                        ewmnVar5.b |= 4;
                        long j = ebgvVar2.f;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar6 = (ewmn) ewmdVar.instance;
                        ewmnVar6.b |= 128;
                        ewmnVar6.j = (int) (j - ebguVar.d);
                        List list = ebgvVar2.c;
                        ewmdVar.copyOnWrite();
                        ewmn ewmnVar7 = (ewmn) ewmdVar.instance;
                        evtg evtgVar = ewmnVar7.h;
                        if (!evtgVar.c()) {
                            ewmnVar7.h = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(list, ewmnVar7.h);
                        if (ebhzVar.g()) {
                            ewmi ewmiVar = (ewmi) ebgvVar2.d.get();
                            ewmdVar.copyOnWrite();
                            ewmn ewmnVar8 = (ewmn) ewmdVar.instance;
                            ewmnVar8.f = ewmiVar.g;
                            ewmnVar8.b |= 8;
                        }
                        if (ebhzVar.g() && ewmi.DNS_FAILURE_TYPE_CLIENT_EXCEPTION.equals(ebgvVar2.d.get())) {
                            Optional optional = ebgvVar2.e;
                            if (optional.isPresent()) {
                                Object obj = optional.get();
                                ewmdVar.copyOnWrite();
                                ewmn ewmnVar9 = (ewmn) ewmdVar.instance;
                                ewmnVar9.l = ((ewmf) obj).g;
                                ewmnVar9.b |= 1024;
                            }
                        }
                        if (dext.a() == 2) {
                            deym.t(ewmdVar, ebhyVar);
                        }
                        deymVar2.k((ewmn) ewmdVar.build());
                    }
                };
                ebhwVar.g = new ebib() { // from class: ebhg
                    @Override // defpackage.ebib
                    public final void a(final ebhz ebhzVar) {
                        ExecutorService executorService = ebhw.c;
                        final ebib ebibVar2 = ebibVar;
                        executorService.execute(new Runnable() { // from class: ebho
                            @Override // java.lang.Runnable
                            public final void run() {
                                dhip dhipVar = ebhw.a;
                                ebibVar2.a(ebhzVar);
                            }
                        });
                    }
                };
                ebhwVar.h = ((Boolean) dfpo.p().a.c.a()).booleanValue();
                ebhwVar.l = ((Boolean) dfpo.p().a.d.a()).booleanValue() ? Optional.of(ebgzVar) : Optional.empty();
                Optional optionalA = dfzn.a(((Integer) dfpo.p().a.h.a()).intValue());
                optionalA.ifPresent(new Consumer() { // from class: ebhf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dhip dhipVar = ebhw.a;
                        ejwl.b(((Integer) obj).intValue() > 0, "expected timeout greater than 0");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ebhwVar.j = optionalA;
                Optional optionalA2 = dfzn.a(((Integer) dfpo.p().a.i.a()).intValue());
                optionalA2.ifPresent(new Consumer() { // from class: ebhc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dhip dhipVar = ebhw.a;
                        ejwl.b(((Integer) obj).intValue() >= 0, "expected retries >= 0");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ebhwVar.k = optionalA2;
                ebhe ebheVar = new ebhe(ebhwVar, ((Boolean) dfpo.p().a.m.a()).booleanValue());
                dhip dhipVar = new dhip("(RCS): ");
                fcsu fcsuVar = (fcsu) ebfnVar.a.get(ebfm.SIP);
                fcsuVar.getClass();
                ebrc ebrcVar = new ebrc(context3, deymVar, (ebfl) fcsuVar.b(), dhipVar, ebheVar, ((Boolean) dfpo.p().a.b.a()).booleanValue(), dfog.P());
                dfza dfzaVarM = dfdnVar.m();
                dhip dhipVar2 = new dhip("(RCS): ");
                deym deymVar3 = (deym) eyikVar18.b();
                int[] iArr2 = dfzn.a;
                if (dfpk.n()) {
                    iArr2 = dfzn.b;
                }
                dfzu dfzuVar = new dfzu(context2, dhejVar, dgwaVar2, dfcgVar, deymVarI, dgveVar, ebrcVar, new dfzr(context3, dfzaVarM.a, iArr2, dhipVar2, deymVar3), (dfzz) dhfiVar3.at.b());
                dffx dffxVar = (dffx) dhfiVar3.aF.b();
                dfio dfioVar = (dfio) dhfiVar3.aG.b();
                dgxm dgxmVar = (dgxm) dhfiVar3.aI.b();
                crmx crmxVar = (crmx) dhfiVar3.j.b();
                eyik eyikVar19 = dhfiVar3.l;
                return dgugVarK.a(dhki.DUAL_REG, dfzuVar, dffxVar, new dgxl(dfioVar, dgxmVar, crmxVar, (dgxf) eyikVar19.b(), (eblg) dhfiVar3.M.b(), (dgxb) dhfiVar3.p.b(), new dgxh((dgxf) eyikVar19.b()), new dgxu(dhfiVar3.ad, dhfiVar3.ac, dhfiVar3.ab, dhfiVar3.l()), new dgxd(dhfiVar3.l())));
            case 8:
                BusinessInfoDatabase businessInfoDatabase = (BusinessInfoDatabase) ((dfdn) this.a.a).bK.b();
                businessInfoDatabase.getClass();
                return businessInfoDatabase;
            case 9:
                dfdd dfddVar = (dfdd) ((dfdn) this.a.a).bI.b();
                dfddVar.getClass();
                return dfddVar;
            case 10:
                dhfi dhfiVar4 = this.a;
                return new dfdi((Context) dhfiVar4.g.b(), (dfdd) dhfiVar4.i.b(), (dhgz) dhfiVar4.b.b(), (crmx) dhfiVar4.j.b());
            case 11:
                crmx crmxVarC = this.a.a.c();
                crmxVarC.getClass();
                return crmxVarC;
            case 12:
                dhfi dhfiVar5 = this.a;
                Context context4 = (Context) dhfiVar5.g.b();
                dfcr dfcrVar = (dfcr) ((dfdn) dhfiVar5.a).bI.b();
                dfcrVar.getClass();
                return new dfcf(context4, dfcrVar, (dfdi) dhfiVar5.k.b(), (dhgz) dhfiVar5.b.b(), (dgxf) dhfiVar5.l.b());
            case 13:
                dgxf dgxfVar = (dgxf) ((dfdn) this.a.a).bL.b();
                dgxfVar.getClass();
                return dgxfVar;
            case 14:
                dhfi dhfiVar6 = this.a;
                dhgz dhgzVar2 = (dhgz) dhfiVar6.b.b();
                dfdv dfdvVar = (dfdv) dhfiVar6.n.b();
                crmx crmxVar2 = (crmx) dhfiVar6.j.b();
                dgxf dgxfVar2 = (dgxf) dhfiVar6.l.b();
                ExecutorService executorService = (ExecutorService) ((dfdn) dhfiVar6.a).bG.b();
                executorService.getClass();
                return new dgxb(dhgzVar2, dfdvVar, crmxVar2, dgxfVar2, executorService, (dfze) dhfiVar6.o.b());
            case 15:
                dfdv dfdvVar2 = (dfdv) ((dfdn) this.a.a).bD.b();
                dfdvVar2.getClass();
                return dfdvVar2;
            case 16:
                return new dfze((Context) this.a.g.b());
            case 17:
                return new dhel((deyw) this.a.q.b());
            case 18:
                return this.a.a.j();
            case 19:
                dhbz dhbzVar = (dhbz) ((dfdn) this.a.a).bX.b();
                dhbzVar.getClass();
                return dhbzVar;
            case 20:
                dhfi dhfiVar7 = this.a;
                return new FileTransferEngine((Context) dhfiVar7.g.b(), (dhgz) dhfiVar7.b.b(), (dhbz) dhfiVar7.s.b(), (deyw) dhfiVar7.q.b());
            case 21:
                dhfi dhfiVar8 = this.a;
                return new ChatSessionEngine((Context) dhfiVar8.g.b(), (dhbz) dhfiVar8.s.b(), (deyw) dhfiVar8.q.b());
            case 22:
                dhfi dhfiVar9 = this.a;
                return new LocationSharingEngine((Context) dhfiVar9.g.b(), (dhgz) dhfiVar9.b.b(), (deyw) dhfiVar9.q.b());
            case 23:
                dhes dhesVarP = this.a.a.p();
                dhesVarP.getClass();
                return dhesVarP;
            case 24:
                dfnp dfnpVar = (dfnp) ((dfdn) this.a.a).bF.b();
                dfnpVar.getClass();
                return dfnpVar;
            case 25:
                dewk dewkVar = (dewk) ((dfdn) this.a.a).bN.b();
                dewkVar.getClass();
                return dewkVar;
            case 26:
                dgto dgtoVarO = this.a.a.o();
                dgtoVarO.getClass();
                return dgtoVarO;
            case 27:
                eosd eosdVar = (eosd) ((dfdn) this.a.a).bE.b();
                eosdVar.getClass();
                return eosdVar;
            case 28:
                dhfi dhfiVar10 = this.a;
                Context context5 = (Context) dhfiVar10.g.b();
                deyw deywVar = (deyw) dhfiVar10.q.b();
                dhfiVar10.a.h().getClass();
                return new dfcj(context5, deywVar);
            case 29:
                return new dgiu();
            case 30:
                dfdj dfdjVar = (dfdj) ((dfdn) this.a.a).bJ.b();
                dfdjVar.getClass();
                return dfdjVar;
            case 31:
                return new dfhn((dfdd) this.a.i.b());
            case 32:
                dfyd dfydVarL = this.a.a.l();
                dfydVarL.getClass();
                return dfydVarL;
            case 33:
                ebja ebjaVar = (ebja) ((dfdn) this.a.a).bU.b();
                ebjaVar.getClass();
                return ebjaVar;
            case 34:
                dgfu dgfuVar = (dgfu) ((dfdn) this.a.a).bM.b();
                dgfuVar.getClass();
                return dgfuVar;
            case 35:
                dhfi dhfiVar11 = this.a;
                return new dhbc((dgxb) dhfiVar11.p.b(), (dgxf) dhfiVar11.l.b());
            case 36:
                dgrs dgrsVar = (dgrs) ((dfdn) this.a.a).bt.b();
                dgrsVar.getClass();
                return dgrsVar;
            case 37:
                return new dgve();
            case 38:
                return this.a.a.m();
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return new eblg();
            case 40:
                dhgr dhgrVar = (dhgr) ((dfdn) this.a.a).bY.b();
                dhgrVar.getClass();
                return dhgrVar;
            case 41:
                return new SignupEngine();
            case 42:
                dfxx dfxxVar = (dfxx) ((dfdn) this.a.a).aP.b();
                dfxxVar.getClass();
                return dfxxVar;
            case 43:
                dhfi dhfiVar12 = this.a;
                dhhc dhhcVarQ2 = dhfiVar12.a.q();
                dhhcVarQ2.getClass();
                return new dfrk(dhhcVarQ2, (eosc) dhfiVar12.d.b(), (dfrt) dhfiVar12.X.b());
            case 44:
                dhfi dhfiVar13 = this.a;
                Context context6 = (Context) dhfiVar13.g.b();
                eyik eyikVar20 = dhfiVar13.d;
                return new dfrt(context6, (Executor) eyikVar20.b(), (dfvk) dhfiVar13.R.b(), (diep) dhfiVar13.Q.b(), new efob(), (eosc) eyikVar20.b(), (crmx) dhfiVar13.j.b(), (dgwa) dhfiVar13.e.b(), (eblg) dhfiVar13.M.b(), (dfdd) dhfiVar13.i.b(), dhfiVar13.c(), (dfrs) dhfiVar13.V.b(), dhfiVar13.b(), (dfwc) dhfiVar13.W.b(), (cjim) dhfiVar13.U.b(), (eosd) dhfiVar13.A.b());
            case 45:
                return new dfvk((diep) this.a.Q.b());
            case 46:
                diep diepVar = (diep) ((dfdn) this.a.a).bH.b();
                diepVar.getClass();
                return diepVar;
            case 47:
                dhfi dhfiVar14 = this.a;
                Context context7 = (Context) dhfiVar14.g.b();
                eyik eyikVar21 = dhfiVar14.d;
                return new dfrs(context7, (Executor) eyikVar21.b(), (dfvk) dhfiVar14.R.b(), (dfvj) dhfiVar14.T.b(), (diep) dhfiVar14.Q.b(), new efob(), (eosc) eyikVar21.b(), (crmx) dhfiVar14.j.b(), (dgwa) dhfiVar14.e.b(), (eblg) dhfiVar14.M.b(), (dfdd) dhfiVar14.i.b(), dhfiVar14.c(), (cjim) dhfiVar14.U.b(), (eosd) dhfiVar14.A.b());
            case 48:
                return new dfvj();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                cjim cjimVar = (cjim) ((dfdn) this.a.a).ci.b();
                cjimVar.getClass();
                return cjimVar;
            case 50:
                dhfi dhfiVar15 = this.a;
                return new dfwc(dhfiVar15.c(), new dfwa(new dfvs((dgrs) dhfiVar15.J.b())));
            case 51:
                return new dhej();
            case 52:
                return new dhme(this.a.ad);
            case 53:
                dhfi dhfiVar16 = this.a;
                return new dhmb(dhfiVar16.aa, dhfiVar16.ac);
            case 54:
                dhlq dhlqVar = (dhlq) ((dfdn) this.a.a).ca.b();
                dhlqVar.getClass();
                return dhlqVar;
            case 55:
                dhfi dhfiVar17 = this.a;
                return new dhmg(dhfiVar17.n(), dhfiVar17.ab, dhfiVar17.aa);
            case 56:
                return new dhmf(this.a.aa);
            case 57:
                return new dhdy(this.a.ak);
            case 58:
                dhfi dhfiVar18 = this.a;
                return new dhdx(dhfiVar18.aa, dhfiVar18.aj);
            case 59:
                dhfi dhfiVar19 = this.a;
                return new dhdz(dhfiVar19.aa, dhfiVar19.af, dhfiVar19.ai);
            case 60:
                return new dhnd(this.a.aa);
            case 61:
                dhfi dhfiVar20 = this.a;
                return new dhmn(dhfiVar20.ag, dhfiVar20.ah);
            case 62:
                return new dhmp(this.a.aa);
            case Function.ALT_CONVENTION /* 63 */:
                return new dhmt(this.a.aa);
            case 64:
                return new dfpv((dhdy) this.a.al.b());
            case 65:
                return new dhnr(this.a.ap);
            case 66:
                return new dhnq(this.a.ao);
            case 67:
                return new dhnt(this.a.an);
            case 68:
                return new dhnp(this.a.aa);
            case 69:
                dhfi dhfiVar21 = this.a;
                Context context8 = (Context) dhfiVar21.g.b();
                dfxx dfxxVar2 = (dfxx) dhfiVar21.P.b();
                dhes dhesVar = (dhes) dhfiVar21.w.b();
                eosc eoscVar2 = (eosc) dhfiVar21.d.b();
                dexw dexwVarH = dhfiVar21.a.h();
                dexwVarH.getClass();
                return new deza(context8, dfxxVar2, dhesVar, eoscVar2, dexwVarH);
            case 70:
                return new dezd();
            case 71:
                return new dfzz();
            case 72:
                return ally.a(ekon.a);
            case 73:
                dhfi dhfiVar22 = this.a;
                eyik eyikVar22 = dhfiVar22.aE;
                dffy dffyVarA = dhfiVar22.a();
                dfgt dfgtVar = (dfgt) eyikVar22.b();
                final dffk dffkVar = new dffk();
                return dffyVarA.a(dfgtVar, dffkVar, dffkVar, new fcsu() { // from class: dffu
                    @Override // defpackage.fcsu
                    public final Object b() {
                        dhja.d(new dhip("FileTransferModule"), "getting download digest based HttpRequestExecutor", new Object[0]);
                        return dffkVar;
                    }
                }, new fcsu() { // from class: dffv
                    @Override // defpackage.fcsu
                    public final Object b() {
                        dhja.d(new dhip("FileTransferModule"), "getting upload digest based HttpRequestExecutor", new Object[0]);
                        return dffkVar;
                    }
                }, new dffn(dhfiVar22.m()));
            case 74:
                dhfi dhfiVar23 = this.a;
                return new dfgc(dhfiVar23.g, dhfiVar23.n, dhfiVar23.H, dhfiVar23.av, dhfiVar23.aw, dhfiVar23.ax);
            case 75:
                return new dfeh();
            case 76:
                ebiq ebiqVar = (ebiq) ((dfdn) this.a.a).bW.b();
                ebiqVar.getClass();
                return ebiqVar;
            case 77:
                return new dflz() { // from class: dfjx
                };
            case 78:
                dhfi dhfiVar24 = this.a;
                return new dffp(dhfiVar24.g, dhfiVar24.n, dhfiVar24.H, dhfiVar24.av, dhfiVar24.ax);
            case 79:
                ebir ebirVar = (ebir) ((dfdn) this.a.a).bV.b();
                ebirVar.getClass();
                return ebirVar;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                dhfi dhfiVar25 = this.a;
                return new dfim(dhfiVar25.g, dhfiVar25.n, dhfiVar25.av, dhfiVar25.ax);
            case 81:
                dhfi dhfiVar26 = this.a;
                Context context9 = (Context) dhfiVar26.g.b();
                dfxx dfxxVar3 = (dfxx) dhfiVar26.P.b();
                dhes dhesVar2 = (dhes) dhfiVar26.w.b();
                eosc eoscVar3 = (eosc) dhfiVar26.d.b();
                dexw dexwVarH2 = dhfiVar26.a.h();
                dexwVarH2.getClass();
                return new deyc(context9, dfxxVar3, dhesVar2, eoscVar3, dexwVarH2);
            case 82:
                final dffm dffmVar = (dffm) this.a.aD.b();
                return new dfgt() { // from class: dfft
                    @Override // defpackage.dfgt
                    public final dfgs a(deyb deybVar, dfgu dfguVar) {
                        return dffmVar.a();
                    }
                };
            case 83:
                return new dffm(this.a.az);
            case 84:
                dhfi dhfiVar27 = this.a;
                Context context10 = (Context) dhfiVar27.g.b();
                dhgz dhgzVar3 = (dhgz) dhfiVar27.b.b();
                dgfu dgfuVar2 = (dgfu) dhfiVar27.H.b();
                dhme dhmeVar = (dhme) dhfiVar27.ae.b();
                dfcp.b(context10);
                dfcp.a(context10);
                dfhu.a(context10);
                return new dfio(dhgzVar3, dgfuVar2, dhmeVar);
            case 85:
                return new dgxk((dgxf) this.a.l.b());
            case 86:
                dhfi dhfiVar28 = this.a;
                eyik eyikVar23 = dhfiVar28.g;
                dgug dgugVarK2 = dhfiVar28.k();
                Context context11 = (Context) eyikVar23.b();
                dhes dhesVar3 = (dhes) dhfiVar28.w.b();
                dfyp dfypVar = new dfyp((Context) eyikVar23.b());
                eyik eyikVar24 = dhfiVar28.q;
                deyw deywVar2 = (deyw) eyikVar24.b();
                deym deymVarI2 = dhfiVar28.a.i();
                deymVarI2.getClass();
                return dgugVarK2.a(dhki.SINGLE_REG, new dgap(context11, dhesVar3, dfypVar, deywVar2, deymVarI2, (eosd) dhfiVar28.A.b(), (dfzz) dhfiVar28.at.b(), dhfiVar28.aK), (dffx) dhfiVar28.aO.b(), new dgxv((dgxm) dhfiVar28.aI.b(), (deyw) eyikVar24.b()));
            case 87:
                final eyik eyikVar25 = ((dfdn) this.a.a).ad;
                return new dfmn() { // from class: dfky
                    @Override // defpackage.dfmn
                    public final boolean a() {
                        return ((eoth) eyikVar25.b()).a("cslib.remove_sim_preferences_in_single_registration_state_machine_factory");
                    }
                };
            case 88:
                dhfi dhfiVar29 = this.a;
                eyik eyikVar26 = dhfiVar29.aM;
                dffy dffyVarA2 = dhfiVar29.a();
                dfgt dfgtVar2 = (dfgt) eyikVar26.b();
                final dffk dffkVar2 = new dffk();
                final dfgm dfgmVar = new dfgm(dhfiVar29.aN, dhfiVar29.d, dhfiVar29.ax);
                dfhb dfhbVar = new dfhb(dhfiVar29.m());
                fcsu fcsuVar2 = new fcsu() { // from class: dffq
                    @Override // defpackage.fcsu
                    public final Object b() {
                        dhja.l(new dhip("FileTransferModule"), "initializing download %s HttpRequestExecutorFactory", true != dfog.I() ? "Digest" : "GbaBased");
                        return dfog.I() ? dfgmVar : dffkVar2;
                    }
                };
                fcsu fcsuVar3 = new fcsu() { // from class: dffr
                    @Override // defpackage.fcsu
                    public final Object b() {
                        dhja.l(new dhip("FileTransferModule"), "initializing upload %s HttpRequestExecutorFactory", true != dfog.H() ? "Digest" : "GbaBased");
                        return dfog.H() ? dfgmVar : dffkVar2;
                    }
                };
                return dffyVarA2.a(dfgtVar2, (dfgv) fcsuVar2.b(), (dfgv) fcsuVar3.b(), fcsuVar2, fcsuVar3, dfhbVar);
            case 89:
                dhfi dhfiVar30 = this.a;
                final eyik eyikVar27 = dhfiVar30.aL;
                final eyik eyikVar28 = dhfiVar30.aD;
                return new dfgt() { // from class: dffs
                    @Override // defpackage.dfgt
                    public final dfgs a(deyb deybVar, dfgu dfguVar) {
                        if (!dfog.I() && ((!((Boolean) dfog.o().a.L.a()).booleanValue() || dfog.o().M()) && (!((Boolean) dfog.o().a.N.a()).booleanValue() || dfog.o().M()))) {
                            return ((dffm) eyikVar28.b()).a();
                        }
                        dfha dfhaVar = (dfha) eyikVar27.b();
                        return new dfgz((eosc) dfhaVar.b.b(), dfhaVar.c, deybVar, dfguVar);
                    }
                };
            case 90:
                dhfi dhfiVar31 = this.a;
                return new dfha(dhfiVar31.aw, dhfiVar31.d, dhfiVar31.ax);
            case 91:
                dhfi dhfiVar32 = this.a;
                eyik eyikVar29 = dhfiVar32.g;
                return new dfgq(dhkv.g((Context) eyikVar29.b()), (eosc) dhfiVar32.d.b(), new dfhc((Context) eyikVar29.b(), (deyw) dhfiVar32.q.b()), dfgd.b);
            case 92:
                dhfi dhfiVar33 = this.a;
                return new ImsConnectionTrackerEngine((Context) dhfiVar33.g.b(), dhfiVar33.S);
            case 93:
                dhfi dhfiVar34 = this.a;
                return new TransportControlEngine((dgtw) dhfiVar34.S.b(), (dhes) dhfiVar34.w.b());
            case 94:
                dhfi dhfiVar35 = this.a;
                return new SingleRegistrationVendorImsController((dheq) dhfiVar35.c.b(), (dgfx) dhfiVar35.aZ.b());
            case 95:
                dhfi dhfiVar36 = this.a;
                return new dggi(dhfiVar36.aW, dhfiVar36.aX, dhfiVar36.J);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                dhfi dhfiVar37 = this.a;
                return new dgge(dhfiVar37.g, dhfiVar37.J, dhfiVar37.aS, dhfiVar37.aT, dhfiVar37.aV);
            case 97:
                return this.a.a.n();
            case 98:
                dgkj dgkjVar = (dgkj) ((dfdn) this.a.a).bC.b();
                dgkjVar.getClass();
                return dgkjVar;
            case 99:
                dhfi dhfiVar38 = this.a;
                return new dggg((Context) dhfiVar38.g.b(), (deyw) dhfiVar38.q.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.b;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new dgfv() { // from class: dgfy
                    @Override // defpackage.dgfv
                    public final ProvisioningManager a(int i2) throws ImsException {
                        try {
                            return ProvisioningManager.createForSubscriptionId(i2);
                        } catch (IllegalArgumentException e) {
                            throw new ImsException("Invalid subscription id.", 3, e);
                        }
                    }
                };
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                dhfi dhfiVar = this.a;
                return new ContactsManager((Context) dhfiVar.g.b(), (dgxb) dhfiVar.p.b());
            case 102:
                dhfi dhfiVar2 = this.a;
                Context context = (Context) dhfiVar2.g.b();
                dhgz dhgzVar = (dhgz) dhfiVar2.b.b();
                crmx crmxVar = (crmx) dhfiVar2.j.b();
                dgtg dgtgVar = (dgtg) ((dfdn) dhfiVar2.a).aO.b();
                dgtgVar.getClass();
                return new RcsProfileEngine(context, dhgzVar, crmxVar, dgtgVar, (dgrs) dhfiVar2.J.b());
            case 103:
                dhfi dhfiVar3 = this.a;
                eosc eoscVar = (eosc) dhfiVar3.d.b();
                dfvj dfvjVar = (dfvj) dhfiVar3.T.b();
                eyik eyikVar = dhfiVar3.ar;
                dfxl dfxlVarH = dhfiVar3.h();
                dfwl dfwlVarE = dhfiVar3.e();
                dfwi dfwiVarD = dhfiVar3.d();
                dfxf dfxfVarG = dhfiVar3.g();
                dfxr dfxrVarJ = dhfiVar3.j();
                dfxo dfxoVarI = dhfiVar3.i();
                deza dezaVar = (deza) eyikVar.b();
                dfux dfuxVar = (dfux) dhfiVar3.bf.b();
                return new MessagingEngine(eoscVar, dhfiVar3.R, dfvjVar, dfxlVarH, dfwlVarE, dfwiVarD, dfxfVarG, dfxrVarJ, dfxoVarI, dhfiVar3.bi, dezaVar, dfuxVar);
            case 104:
                return new efpp();
            case 105:
                return new efqv();
            case 106:
                return new dfux();
            case 107:
                return new efqt();
            case 108:
                dhfi dhfiVar4 = this.a;
                Context context2 = (Context) dhfiVar4.g.b();
                eyik eyikVar2 = dhfiVar4.d;
                Executor executor = (Executor) eyikVar2.b();
                eyik eyikVar3 = dhfiVar4.Q;
                diep diepVar = (diep) eyikVar3.b();
                eosc eoscVar2 = (eosc) eyikVar2.b();
                ebja ebjaVar = (ebja) dhfiVar4.G.b();
                eblg eblgVar = (eblg) dhfiVar4.M.b();
                dgxf dgxfVar = (dgxf) dhfiVar4.l.b();
                eyik eyikVar4 = dhfiVar4.e;
                dfvt dfvtVarC = dhfiVar4.c();
                dgwa dgwaVar = (dgwa) eyikVar4.b();
                dfxx dfxxVar = (dfxx) dhfiVar4.P.b();
                crmx crmxVar2 = (crmx) dhfiVar4.j.b();
                dfrs dfrsVar = (dfrs) dhfiVar4.V.b();
                eosd eosdVar = (eosd) dhfiVar4.A.b();
                dfrq dfrqVarB = dhfiVar4.b();
                dfrn dfrnVar = new dfrn(dhfiVar4.bh);
                dhgr dhgrVar = (dhgr) dhfiVar4.N.b();
                dhes dhesVar = (dhes) dhfiVar4.w.b();
                dgrs dgrsVar = (dgrs) dhfiVar4.J.b();
                dfwc dfwcVar = (dfwc) dhfiVar4.W.b();
                return new dfru(context2, executor, diepVar, eoscVar2, ebjaVar, eblgVar, dgxfVar, dfvtVarC, dgwaVar, dfxxVar, crmxVar2, dfrsVar, eosdVar, dfrqVarB, dfrnVar, dhgrVar, dhesVar, dgrsVar, dfwcVar, new dfty());
            case 109:
                return new dfuw();
            case 110:
                dhfi dhfiVar5 = this.a;
                return new BusinessInfoEngine((Context) dhfiVar5.g.b(), (dewk) dhfiVar5.y.b());
            case 111:
                return new dhei();
            case 112:
                final eyik eyikVar5 = ((dfdn) this.a.a).ad;
                return new dflf() { // from class: dfiw
                    @Override // defpackage.dflf
                    public final boolean a() {
                        return ((eoth) eyikVar5.b()).a("cslib.cslib_deprecate_jibe_service_sim_event_processing");
                    }
                };
            case 113:
                dhfi dhfiVar6 = this.a;
                return new dfin((Context) dhfiVar6.g.b(), dhfiVar6.c, dhfiVar6.S, dhfiVar6.b, dhfiVar6.bn);
            case 114:
                return (dgsz) ((dfdn) this.a.a).bq.b();
            case 115:
                dhfi dhfiVar7 = this.a;
                final Context context3 = (Context) dhfiVar7.g.b();
                final dgfu dgfuVar = (dgfu) dhfiVar7.H.b();
                final dhgz dhgzVar2 = (dhgz) dhfiVar7.b.b();
                final dgtw dgtwVar = (dgtw) dhfiVar7.S.b();
                return new dfdu() { // from class: dfdt
                    @Override // defpackage.dfdu
                    public final void a() throws Throwable {
                        Context context4 = context3;
                        dgtw dgtwVar2 = dgtwVar;
                        dgfu dgfuVar2 = dgfuVar;
                        dhgz dhgzVar3 = dhgzVar2;
                        try {
                            if (Build.VERSION.SDK_INT == 28) {
                                dckq.a = 32;
                            }
                            dfcp.b(context4);
                            dfcp.a(context4);
                            dfhu.a(context4);
                            String strD = dgfuVar2.d();
                            cqaz.f(TextUtils.isEmpty(strD));
                            if (TextUtils.isEmpty(strD)) {
                                throw new IllegalArgumentException("Cannot create directory, invalid empty path");
                            }
                            File file = new File(strD);
                            try {
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                DebugOptionsReceiver.a(context4, dgtwVar2, dhgzVar3);
                                dhfc.a(context4, dgtwVar2);
                                dbhi dbhiVar = dhgs.a;
                                dbhi.a(context4);
                            } catch (SecurityException unused) {
                                throw new IllegalStateException("Attempted create directory without permissions");
                            }
                        } catch (Exception e) {
                            dhja.i(e, "Failed to properly initialize JibeService", new Object[0]);
                        }
                    }
                };
            case 116:
                return new dhfd();
            case 117:
                return new efqz((Context) this.a.g.b());
            case 118:
                return new efqy();
            case 119:
                return new efpq((Context) this.a.g.b());
            case 120:
                return new efon((Context) this.a.g.b());
            case 121:
                return new efqx((Context) this.a.g.b());
            case 122:
                return new efrc((Context) this.a.g.b());
            case 123:
                return new efrb((Context) this.a.g.b());
            default:
                throw new AssertionError(i);
        }
    }
}
