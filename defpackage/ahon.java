package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.car.app.navigation.model.Maneuver;
import defpackage.efxv;
import j$.util.Optional;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahon implements eyik {
    public final ahkn a;
    public final ahoo b;
    private final ahho c;
    private final int d;

    public ahon(ahkn ahknVar, ahho ahhoVar, ahoo ahooVar, int i) {
        this.a = ahknVar;
        this.c = ahhoVar;
        this.b = ahooVar;
        this.d = i;
    }

    @Override // defpackage.fcsu
    public final Object b() throws PackageManager.NameNotFoundException {
        ecxt ecxtVar;
        switch (this.d) {
            case 0:
                ahoo ahooVar = this.b;
                return new efxv.a(ahooVar.a, ahooVar.e);
            case 1:
                ahoo ahooVar2 = this.b;
                return new tgr(new tij(ahooVar2.j), (tha) ahooVar2.i.b());
            case 2:
                ahoo ahooVar3 = this.b;
                return new tii(ahooVar3.g, ahooVar3.h, ahooVar3.i);
            case 3:
                fcyh fcyhVar = (fcyh) this.a.bM.b();
                ahnh ahnhVar = this.b.c.a;
                return new tgz(fcyhVar, new baif(ahnhVar.so, ahnhVar.qi));
            case 4:
                ahkn ahknVar = this.a;
                return new tic(ahknVar.cz, ahknVar.a.IH, ahknVar.hD, ahknVar.aI);
            case 5:
                ahkn ahknVar2 = this.a;
                return new tha((dzuc) ahknVar2.cE.b(), (dzqp) ahknVar2.gw.b());
            case 6:
                ahoo ahooVar4 = this.b;
                return new dmpe((dmop) ahooVar4.w.b(), (fdjx) ahooVar4.n.b());
            case 7:
                return new ahok(this);
            case 8:
                return new dpzv((fdjx) this.a.a.m.b());
            case 9:
                ahoo ahooVar5 = this.b;
                ahkn ahknVar3 = ahooVar5.c;
                ujz ujzVar = new ujz((Context) ahknVar3.t.b(), (fcyh) ahknVar3.cz.b());
                dmmc dmmcVar = (dmmc) ahooVar5.t.b();
                ahkn ahknVar4 = this.a;
                ahng ahngVar = ahknVar4.b;
                return ujs.a(ujzVar, dmmcVar, ahngVar.lx, ahknVar4.cE, ahngVar.ly);
            case 10:
                return new ahol(this);
            case 11:
                ahoo ahooVar6 = this.b;
                return egwg.a((fcyh) ahooVar6.m.b(), ahooVar6.b);
            case 12:
                ahkn ahknVar5 = this.a;
                egvh egvhVarEl = ahknVar5.el();
                ahng.dk();
                ahnh ahnhVar2 = ahknVar5.a;
                eosd eosdVar = (eosd) ahnhVar2.j.b();
                fcyh fcyhVar2 = (fcyh) ahnhVar2.Rm.b();
                ejud ejudVar = ejud.a;
                ejwi ejwiVar = (ejwi) ((eyig) ahknVar5.i).a;
                ejwi.j(eyie.a(ahknVar5.b.kD));
                return egvz.a(egvhVarEl, eosdVar, fcyhVar2, ejudVar, ejwiVar, ejwi.j(false));
            case 13:
                return new dmrc((chx) this.b.o.b());
            case 14:
                return dmnh.a((Context) this.a.t.b());
            case 15:
                return new ahom(this);
            case 16:
                return Optional.of(this.a.b.j());
            case 17:
                return ujp.a((aqgw) this.a.b.jl.b());
            case 18:
                ahoo ahooVar7 = this.b;
                return new ugj(ahooVar7.a, ahooVar7.y, ahooVar7.z, ahooVar7.A, ahooVar7.B);
            case 19:
                return new ugs((fcyh) this.a.bM.b(), this.b.b());
            case 20:
                ahkn ahknVar6 = this.a;
                fcyh fcyhVar3 = (fcyh) ahknVar6.bM.b();
                ahnh ahnhVar3 = ahknVar6.a;
                return new ugv(fcyhVar3, (bafp) ahnhVar3.ye.b(), this.b.b(), (baqm) ahnhVar3.Jx.b());
            case 21:
                return new uhg((fcyh) this.a.bM.b(), this.b.b());
            case 22:
                return new uhc((fcyh) this.a.bM.b(), new ugn(this.b.a()), (anty) this.c.f.b());
            case 23:
                ahoo ahooVar8 = this.b;
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar4 = ahknVar7.a;
                return new uut(ahooVar8.a, ahnhVar4.vh, ahnhVar4.NK, (cden) ahnhVar4.qN.b(), (fdjx) ahnhVar4.oQ.b(), (ajfx) ahknVar7.ij.b());
            case 24:
                ahnh ahnhVar5 = this.a.a;
                return new cjnk(ahnhVar5.qr, ahnhVar5.c);
            case 25:
                return new adcn();
            case 26:
                return new egas(this.b.a);
            case 27:
                ahoo ahooVar9 = this.b;
                fdjx fdjxVar = (fdjx) ahooVar9.n.b();
                ahkn ahknVar8 = ahooVar9.c;
                eyik eyikVar = ahknVar8.cA;
                cygm cygmVar = new cygm(new cygf((fcyh) eyikVar.b(), (cygh) ahknVar8.b.iv.b()), new cyir((dqsy) ahknVar8.a.tt.b(), (Context) ahknVar8.t.b(), (fcyh) eyikVar.b()));
                ahkn ahknVar9 = this.a;
                return new cyha(fdjxVar, cygmVar, (cygh) ahknVar9.b.iv.b(), (fcyh) ahknVar9.cA.b(), (bxaj) ahknVar9.a.aeU.b());
            case 28:
                ahkn ahknVar10 = this.a;
                Application applicationA = eyht.a(ahknVar10.c);
                ahnh ahnhVar6 = ahknVar10.a;
                eyik eyikVar2 = ahnhVar6.oQ;
                dncj dncjVar = (dncj) ahnhVar6.IM.b();
                ahng ahngVar2 = ahknVar10.b;
                return new ejfj(applicationA, ahknVar10.cz, eyikVar2, ahngVar2.pm, dncjVar, ahngVar2.po, ahngVar2.pn);
            case 29:
                ahoo ahooVar10 = this.b;
                ahkn ahknVar11 = this.a;
                return new egqc(ahooVar10.a, (Context) ahknVar11.t.b(), (Executor) ahknVar11.a.j.b());
            case 30:
                return new affe(this.a.a.vh);
            case 31:
                return new vbx();
            case 32:
                return new afjp();
            case 33:
                return new dbab(this.b.O);
            case 34:
                ahkn ahknVar12 = this.a;
                Context context = (Context) ahknVar12.t.b();
                ahho ahhoVar = this.c;
                dava davaVar = (dava) ahhoVar.cd.b();
                ahoo ahooVar11 = this.b;
                dava davaVar2 = (dava) ahooVar11.d.cd.b();
                eyik eyikVar3 = ahooVar11.n;
                dazt daztVar = new dazt(davaVar2, (fdjx) eyikVar3.b());
                ahng ahngVar3 = ahknVar12.b;
                return new daym(context, davaVar, daztVar, ahngVar3.nr, ahhoVar.bx, ahooVar11.N, ahhoVar.bw, ahhoVar.by, ahngVar3.I, ahhoVar.c, Optional.empty(), ahhoVar.f, (fdjx) eyikVar3.b(), (fdjx) ahknVar12.a.m.b(), ahngVar3.kU, ahngVar3.jp, ahngVar3.kV);
            case 35:
                ahng ahngVar4 = this.a.b;
                return new dawd(ahngVar4.gS, ahngVar4.gT);
            case 36:
                ahkn ahknVar13 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar13.cz.b();
                fcyh fcyhVar5 = (fcyh) ahknVar13.cA.b();
                fdjx fdjxVar2 = (fdjx) this.b.n.b();
                ahng ahngVar5 = ahknVar13.b;
                ahkn ahknVar14 = ahngVar5.a;
                egyt egytVar = (egyt) ahknVar14.dj.b();
                ahnh ahnhVar7 = ahknVar14.a;
                edvw edvqVar = new edvq(egytVar, (egbf) ahnhVar7.pG.b(), (egej) ahnhVar7.pI.b(), ahngVar5.co());
                edvw edvwVarCo = ahngVar5.co();
                if (true != ahngVar5.dj().b()) {
                    edvqVar = edvwVarCo;
                }
                eydf eydfVar = new eydf(new eyck(new eych(), null));
                Context context2 = (Context) ahknVar14.t.b();
                context2.getClass();
                ecxn ecxnVar = new ecxn(context2);
                Context context3 = (Context) ahknVar14.t.b();
                context3.getClass();
                ecxu ecxuVar = new ecxu(context3);
                Context context4 = (Context) ahknVar14.t.b();
                Context context5 = (Context) ahknVar14.t.b();
                context5.getClass();
                Object objA = new ecxm(context5).b.a();
                objA.getClass();
                String str = (String) objA;
                if (fdbq.f(str, "")) {
                    ecxtVar = ecxt.a;
                } else {
                    ecxt ecxtVar2 = ecxt.a;
                    ecxtVar = (ecxt) Enum.valueOf(ecxt.class, str);
                }
                ecxtVar.getClass();
                String str2 = String.format(((ecxt) ejwi.j(ecxtVar).e(ecxt.a)).d, Arrays.copyOf(new Object[]{"contactsui-pa"}, 1));
                str2.getClass();
                esmm esmmVar = (esmm) ahnhVar7.tZ.b();
                esox esoxVar = (esox) ahngVar5.pq.b();
                eyik eyikVar4 = ahknVar14.cA;
                fcyh fcyhVar6 = (fcyh) eyikVar4.b();
                context4.getClass();
                esmmVar.getClass();
                esoxVar.getClass();
                fcyhVar6.getClass();
                ecxv ecxvVar = new ecxv(str2, esmmVar, esoxVar, fcyhVar6);
                exwb exwbVar = exwb.ANDROID_MESSAGES;
                exwbVar.getClass();
                Context context6 = (Context) ahknVar14.t.b();
                context6.getClass();
                String strD = cpge.d(context6);
                strD.getClass();
                etug etugVar = (etug) etul.a.createBuilder();
                etugVar.getClass();
                etuh etuhVar = (etuh) etuk.a.createBuilder();
                etuhVar.getClass();
                etuhVar.copyOnWrite();
                etuk etukVar = (etuk) etuhVar.instance;
                etukVar.d = 1;
                etukVar.b |= 2;
                etuhVar.copyOnWrite();
                etuk etukVar2 = (etuk) etuhVar.instance;
                etukVar2.c = 7;
                etukVar2.b |= 1;
                etuhVar.copyOnWrite();
                etuk etukVar3 = (etuk) etuhVar.instance;
                etukVar3.b |= 4;
                etukVar3.e = strD;
                etuhVar.copyOnWrite();
                etuk etukVar4 = (etuk) etuhVar.instance;
                etukVar4.f = exwbVar.cL;
                etukVar4.b |= 8;
                evsn evsnVarBuild = etuhVar.build();
                evsnVarBuild.getClass();
                etugVar.copyOnWrite();
                etul etulVar = (etul) etugVar.instance;
                etulVar.c = (etuk) evsnVarBuild;
                etulVar.b |= 1;
                evsn evsnVarBuild2 = etugVar.build();
                evsnVarBuild2.getClass();
                fcyh fcyhVar7 = (fcyh) eyikVar4.b();
                fcyh fcyhVar8 = (fcyh) ahknVar14.cz.b();
                Context context7 = (Context) ahknVar14.t.b();
                context7.getClass();
                edwi edwiVar = new edwi(edvqVar, eydfVar, ecxnVar, ecxuVar, ecxvVar, (etul) evsnVarBuild2, fcyhVar7, fcyhVar8, new edvr(context7), ahngVar5.dj());
                Context context8 = (Context) ahknVar14.t.b();
                context8.getClass();
                return new edxi(fcyhVar4, fcyhVar5, fdjxVar2, edwiVar, new ecxo(context8));
            case 37:
                ahoo ahooVar12 = this.b;
                ahkn ahknVar15 = ahooVar12.c;
                Context context9 = (Context) ahknVar15.t.b();
                ahnh ahnhVar8 = ahknVar15.a;
                new cvgs(context9, (fdjx) ahnhVar8.oS.b(), (fdjx) ahnhVar8.m.b(), (fdjx) ahooVar12.n.b(), ahnhVar8.PT, ahooVar12.R, ahnhVar8.Qa, ahknVar15.b.x, ahooVar12.S, ahnhVar8.rq, ahnhVar8.ZG, ahnhVar8.rd);
                return new cvgt();
            case 38:
                ahkn ahknVar16 = this.a;
                cqtp cqtpVar = (cqtp) ahknVar16.dK.b();
                ahnh ahnhVar9 = ahknVar16.a;
                return new ckbr(cqtpVar, (cjzq) ahnhVar9.PT.b(), (fdjx) ahnhVar9.m.b());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar10 = ahknVar17.a;
                return new cvdg(ahnhVar10.rc, ahnhVar10.rd, ahnhVar10.ru, ahnhVar10.sh, (fdjx) ahnhVar10.oS.b(), ahknVar17.b.ou, ahnhVar10.sh, ahnhVar10.sP);
            case 40:
                ahkn ahknVar18 = this.a;
                return new ehae((diep) ahknVar18.l.b(), (egzj) ahknVar18.aQ.b(), (Executor) ahknVar18.a.j.b());
            default:
                return new cvhj(new cvgx());
        }
    }
}
