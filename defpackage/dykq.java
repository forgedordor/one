package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dykq extends dyko {
    private final ddfp h;
    private final ddfr i;
    private final ejwi j;
    private String k;

    public dykq(Context context, dxxk dxxkVar, ejwi ejwiVar) {
        ddhi ddhiVar = new ddhi(context);
        super(dxxkVar);
        this.h = ddhiVar;
        this.j = ejwiVar;
        this.i = new ddfr() { // from class: dykp
            /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x015e A[SYNTHETIC] */
            @Override // defpackage.ddfr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.util.Map r24) {
                /*
                    Method dump skipped, instructions count: 410
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dykp.a(java.util.Map):void");
            }
        };
    }

    @Override // defpackage.lvv
    protected final void h() {
        Object obj = this.h;
        final ddhi ddhiVar = (ddhi) obj;
        ddgn.b.b(this.i, new ejvr() { // from class: ddgg
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                final ddfr ddfrVar = (ddfr) obj2;
                ddgm ddgmVar = ddgn.a;
                final ddhi ddhiVar2 = ddhiVar;
                dcib dcibVarG = ddhiVar2.g(ddgmVar, "accountHealthListener");
                final ddgj ddgjVar = new ddgj(dcibVarG);
                dcir dcirVar = new dcir() { // from class: ddfw
                    @Override // defpackage.dcir
                    public final void a(Object obj3, Object obj4) {
                        ddhg ddhgVar = (ddhg) obj3;
                        ddgm ddgmVar2 = ddgn.a;
                        ddgl ddglVar = new ddgl((defr) obj4);
                        IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                        Context context = ddhgVar.c;
                        iInAppReachService.registerAccountHealthAlertsListener(ddglVar, ddhiVar2.c.getPackageName(), ddgjVar, ddlh.a());
                    }
                };
                dcir dcirVar2 = new dcir() { // from class: ddfz
                    @Override // defpackage.dcir
                    public final void a(Object obj3, Object obj4) {
                        ddhg ddhgVar = (ddhg) obj3;
                        ddgm ddgmVar2 = ddgn.a;
                        ddgk ddgkVar = new ddgk((defr) obj4);
                        IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                        Context context = ddhgVar.c;
                        iInAppReachService.unregisterAccountHealthAlertsListener(ddgkVar, ddhiVar2.c.getPackageName(), ddlh.a());
                    }
                };
                dcip dcipVar = new dcip();
                dcipVar.c = dcibVarG;
                dcipVar.d = new Feature[]{ddeu.a};
                dcipVar.a = dcirVar;
                dcipVar.b = dcirVar2;
                dcipVar.e = 28001;
                defn defnVarK = ddhiVar2.k(dcipVar.a());
                defnVarK.t(new defe() { // from class: ddga
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        ddgn.b.c(ddfrVar, new ejvr() { // from class: ddgf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ddgm ddgmVar2 = ddgn.a;
                                return degc.c(true);
                            }
                        });
                    }
                });
                defnVarK.r(new deey() { // from class: ddgb
                    @Override // defpackage.deey
                    public final void a() {
                        ddgn.b.c(ddfrVar, new ejvr() { // from class: ddgc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ddgm ddgmVar2 = ddgn.a;
                                return degc.c(true);
                            }
                        });
                    }
                });
                return defnVarK;
            }
        });
        dciz dcizVar = new dciz();
        Feature feature = ddeu.a;
        dcizVar.b = new Feature[]{feature};
        dcizVar.a = new dcir() { // from class: ddfy
            @Override // defpackage.dcir
            public final void a(Object obj2, Object obj3) {
                ddhg ddhgVar = (ddhg) obj2;
                ddgm ddgmVar = ddgn.a;
                ddgl ddglVar = new ddgl((defr) obj3);
                IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                Context context = ddhgVar.c;
                iInAppReachService.refreshAccountHealthAlerts(ddglVar, ddlh.a());
            }
        };
        dcizVar.c = 28003;
        dcfm dcfmVar = (dcfm) obj;
        dcfmVar.j(dcizVar.a());
        final String str = this.k;
        if (str != null) {
            dciz dcizVar2 = new dciz();
            dcizVar2.b = new Feature[]{feature};
            dcizVar2.a = new dcir() { // from class: ddge
                @Override // defpackage.dcir
                public final void a(Object obj2, Object obj3) {
                    ddhg ddhgVar = (ddhg) obj2;
                    ddgm ddgmVar = ddgn.a;
                    ddgl ddglVar = new ddgl((defr) obj3);
                    IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                    Context context = ddhgVar.c;
                    iInAppReachService.fetchLatestThreads(ddglVar, str, ddlh.a());
                }
            };
            dcizVar2.c = 28006;
            dcfmVar.j(dcizVar2.a());
            this.k = null;
        }
    }

    @Override // defpackage.lvv
    protected final void i() {
        ddfp ddfpVar = this.h;
        final ddhi ddhiVar = (ddhi) ddfpVar;
        ddgn.b.c(this.i, new ejvr() { // from class: ddgd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ddhiVar.l(dcic.a(ddgn.a, "accountHealthListener"), 28002);
            }
        });
    }

    @Override // defpackage.dyko
    public final void s(final String str, ddfo ddfoVar) {
        final String str2 = ddfoVar.b;
        ddgm ddgmVar = ddgn.a;
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{ddeu.a};
        dcizVar.a = new dcir() { // from class: ddgh
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddhg ddhgVar = (ddhg) obj;
                ddgm ddgmVar2 = ddgn.a;
                ddgl ddglVar = new ddgl((defr) obj2);
                IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                Context context = ddhgVar.c;
                iInAppReachService.markAlertAsSeen(ddglVar, str, str2, ddlh.a());
            }
        };
        dcizVar.c = 28004;
        ((dcfm) this.h).j(dcizVar.a());
    }

    @Override // defpackage.dyko
    protected final void t(dyal dyalVar, View view, boolean z) {
        etzr etzrVar = (etzr) etzt.a.createBuilder();
        int i = etzq.SECURITY_RECENT_SECURITY_EVENTS_SCREEN.rz;
        etzrVar.copyOnWrite();
        etzt etztVar = (etzt) etzrVar.instance;
        etztVar.b |= 1;
        etztVar.c = i;
        etzrVar.a(ekgp.q("rfn", dyalVar.c(), "rfnc", dyalVar.d(), "security-event-id", dyalVar.e(), "sa", String.valueOf(z), "ve", String.valueOf(dyku.a(z)), "origin", "8"));
        etzt etztVar2 = (etzt) etzrVar.build();
        String strB = dyalVar.b();
        this.k = strB;
        dyat.b(view, strB, etztVar2);
    }
}
