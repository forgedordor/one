package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axln;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axln implements cdbr {
    public static final cqce a = cqce.g("BugleNetwork", "TachyonAccountDeletedHandler");
    public final cden b;
    public final apqc c;
    public final Context d;
    public final eosc e;
    private final axky f;
    private final eosc g;

    /* compiled from: PG */
    public interface a {
        ceff c();

        ucb r();
    }

    public axln(axky axkyVar, cden cdenVar, apqc apqcVar, Context context, eosc eoscVar, eosc eoscVar2) {
        this.f = axkyVar;
        this.b = cdenVar;
        this.c = apqcVar;
        this.d = context;
        this.e = eoscVar;
        this.g = eoscVar2;
    }

    @Override // defpackage.cdbr
    public final int a(esju esjuVar) {
        return 0;
    }

    @Override // defpackage.cdbr
    public final void b(esju esjuVar) {
        a.p("Received account deleted notification from Tachyon");
        eiju eijuVarH = this.f.a().i(new eooz() { // from class: axlh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                axln.a.p("Checks tachyon registration.");
                axln axlnVar = this.a;
                final axln.a aVar = (axln.a) ehlh.a(axlnVar.d, axln.a.class, (efwo) obj);
                return aVar.c().v().i(new eooz() { // from class: axlm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final ucb ucbVarR = aVar.r();
                        return ucbVarR.e.w().e(ceks.class, new ejvr() { // from class: ubt
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ceks ceksVar = (ceks) obj3;
                                ucb.a.r("Failed to get Tachyon registration for dasher account");
                                final ucb ucbVar = ucbVarR;
                                auvh.h(ucbVar.j.k().i(new eooz() { // from class: ubv
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj4) {
                                        if (!((aumq) obj4).e) {
                                            ucb.a.p("The CMS feature is already disabled. Skipping disabling restricted dasher account");
                                            return eijx.e(null);
                                        }
                                        final ucb ucbVar2 = ucbVar;
                                        ucb.a.p("Disabling restricted dasher account.");
                                        return ucbVar2.i.d(ucbVar2.c, 1, 1).i(new eooz() { // from class: ubp
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj5) {
                                                ucb ucbVar3 = ucbVar2;
                                                return ucbVar3.b.b(ucbVar3.c);
                                            }
                                        }, ucbVar2.k).h(new ejvr() { // from class: ubs
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                String str = (String) obj5;
                                                cqbd cqbdVarE = ucb.a.e();
                                                cqbdVarE.I("Dasher account has been disabled");
                                                cqbdVarE.M("accountName", str);
                                                cqbdVarE.r();
                                                str.getClass();
                                                ucbVar2.h.q(str);
                                                return null;
                                            }
                                        }, ucbVar2.l);
                                    }
                                }, ucbVar.l));
                                throw ceksVar;
                            }
                        }, ucbVarR.k);
                    }
                }, axlnVar.e);
            }
        }, this.e).h(new ejvr() { // from class: axli
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: axlj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                axln.a.p("No linked account. Skips checking tachyon registration.");
                return null;
            }
        };
        eosc eoscVar = this.g;
        auvh.h(eijuVarH.e(axlg.class, ejvrVar, eoscVar).e(ceks.class, new ejvr() { // from class: axlk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                axln.a.p("The multi-device feature is disabled by the admin for the Dasher account.");
                return null;
            }
        }, eoscVar).e(fbtf.class, new ejvr() { // from class: axll
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                axln.a.s("Caught StatusRuntimeException. Failed to verify tachyon registration.", fbtfVar);
                axln axlnVar = this.a;
                if (axlnVar.c.a()) {
                    cpri.c("Uncaught exception", fbtfVar);
                    return null;
                }
                axlnVar.b.b(fbtfVar);
                return null;
            }
        }, eoscVar));
    }

    @Override // defpackage.cdbr
    public final void c() {
    }
}
