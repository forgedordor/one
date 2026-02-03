package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahhg implements eyik {
    private final ahkn a;
    private final ahjr b;
    private final ahhh c;
    private final int d;

    public ahhg(ahkn ahknVar, ahjr ahjrVar, ahhh ahhhVar, int i) {
        this.a = ahknVar;
        this.b = ahjrVar;
        this.c = ahhhVar;
        this.d = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        switch (this.d) {
            case 0:
                return new eyha();
            case 1:
                ahkn ahknVar = this.a;
                vao vaoVar = (vao) ahknVar.pu.b();
                vaoVar.getClass();
                return new vam(vaoVar, ahknVar.pv);
            case 2:
                ahhh ahhhVar = this.c;
                ahjr ahjrVar = this.b;
                ahkn ahknVar2 = this.a;
                eyik eyikVar = ahknVar2.cE;
                ejci ejciVarA = ahhhVar.a();
                eyik eyikVar2 = ahjrVar.ef;
                dzuc dzucVar = (dzuc) eyikVar.b();
                ahnh ahnhVar = ahknVar2.a;
                return new vcq(ejciVarA, eyikVar2, dzucVar, ahknVar2.b.iO, ahhhVar.d, (fdjx) ahnhVar.oS.b(), (fcyh) ahknVar2.cz.b(), (fdjx) ahnhVar.oQ.b(), ahjrVar.oD, ahnhVar.act, ahhhVar.e, ahnhVar.acv, ahnhVar.acx, ahnhVar.acL, ahnhVar.acR, ahnhVar.acT, ahnhVar.acX, ahnhVar.acZ, ahnhVar.adb, ahnhVar.add, ahnhVar.adf);
            case 3:
                return Optional.of((uzw) this.a.a.ajT.b());
            case 4:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                return new uwp(ahknVar3.cD, ahnhVar2.Bz, ahknVar3.mg, ahnhVar2.acz, ahnhVar2.acB, ahnhVar2.acD, ahnhVar2.acF, ahnhVar2.acH, ahnhVar2.acJ, ahnhVar2.acL);
            case 5:
                ahhh ahhhVar2 = this.c;
                ahkn ahknVar4 = this.a;
                eyik eyikVar3 = ahknVar4.cE;
                ejci ejciVarA2 = ahhhVar2.a();
                dzuc dzucVar2 = (dzuc) eyikVar3.b();
                ahnh ahnhVar3 = ahknVar4.a;
                return new uzu(ejciVarA2, dzucVar2, (fdjx) ahnhVar3.oS.b(), this.b.oD, ahnhVar3.acr, ahhhVar2.e, ahnhVar3.acv, ahnhVar3.acx, ahnhVar3.acL);
            case 6:
                ahhh ahhhVar3 = this.c;
                return new afzt((agal) ahhhVar3.i.b(), ahhhVar3.k);
            case 7:
                return new agan((fdjx) this.c.h.b());
            case 8:
                fcyh fcyhVar = (fcyh) this.a.a.Rm.b();
                eyha eyhaVar = (eyha) this.c.b.b();
                eyhaVar.getClass();
                fcyhVar.getClass();
                if (!ecem.g()) {
                    throw new IllegalStateException("The ActivityRetained coroutine scope cannot be initialized/provided on any thread other than the main thread, because initializing it on a different thread isn't safe. See b/157167956 for background.");
                }
                final fdjx fdjxVarB = fdjy.b(fcyhVar.plus(new fdmt(null)));
                eyhaVar.a(new eyhu() { // from class: egvb
                    @Override // defpackage.eyhu
                    public final void g() {
                        fdjy.e(fdjxVarB, null);
                    }
                });
                return fdjxVarB;
            case 9:
                eyie.a(this.c.j);
                Log.i("FeatureExperiment", "LegacyNavigationRouterAdapterFacade based on SingleActivityArchitectureFlags.EnableSingleActivityArchitecture is disabled.");
                return Optional.empty();
            case 10:
                return new cujd((Context) this.a.t.b());
            case 11:
                efwo efwoVar = (efwo) this.b.b.b();
                ahkn ahknVar5 = this.a;
                dzuc dzucVar3 = (dzuc) ahknVar5.cE.b();
                dzqp dzqpVar = (dzqp) ahknVar5.gw.b();
                ahng ahngVar = ahknVar5.b;
                cmwj cmwjVar = (cmwj) ahngVar.bX.b();
                ahnh ahnhVar4 = ahknVar5.a;
                aisp aispVar = (aisp) ahnhVar4.zF.b();
                cmxn cmxnVar = (cmxn) ahnhVar4.xO.b();
                ajfx ajfxVar = (ajfx) ahknVar5.ij.b();
                eyie.a(ahngVar.iV);
                return new zuj(efwoVar, dzucVar3, dzqpVar, cmwjVar, aispVar, cmxnVar, ajfxVar, Optional.empty(), ahngVar.iW, ahnhVar4.wc, (fdjx) ahnhVar4.oQ.b(), ahnhVar4.xN, (AtomicReference) ahnhVar4.NX.b(), this.c.n, ahnhVar4.NW);
            case 12:
                return new xvf();
            case 13:
                ahkn ahknVar6 = this.a;
                return new aady((fcyh) ahknVar6.cz.b(), (fdjx) this.c.h.b(), ahknVar6.a.qK);
            case 14:
                ahhh ahhhVar4 = this.c;
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar5 = ahknVar7.a;
                return new davc(ahhhVar4.q, ahnhVar5.pI, (fdjx) ahnhVar5.m.b(), ahknVar7.b.jp);
            case 15:
                return new dauv(this.a.a.ajL);
            case 16:
                ahkn ahknVar8 = this.a;
                return new afva(ahknVar8.cE, (dzqp) ahknVar8.gw.b());
            case 17:
                ahkn ahknVar9 = this.a;
                return new ctxx((dzuc) ahknVar9.cE.b(), (dzqp) ahknVar9.gw.b(), (ajfx) ahknVar9.ij.b());
            case 18:
                return new dawe();
            case 19:
                ahkn ahknVar10 = this.c.a;
                return new daxj(ahknVar10.b.I, (fdjx) ahknVar10.a.m.b());
            case 20:
                ahhh ahhhVar5 = this.c;
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar6 = ahknVar11.a;
                ahng ahngVar2 = ahknVar11.b;
                return new cphz(ahhhVar5.w, ahngVar2.jr, ahnhVar6.pl, ahngVar2.js);
            case 21:
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar7 = ahknVar12.a;
                return new cphv((cpch) ahnhVar7.qj.b(), (cogv) ahnhVar7.qm.b(), ahnhVar7.Ap, (cogt) ahknVar12.cX.b());
            case 22:
                eyie.a(this.c.y);
                return Optional.empty();
            case 23:
                return new teu((Context) this.a.t.b());
            default:
                return new cmdp(this.a.a.BC);
        }
    }
}
