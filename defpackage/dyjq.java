package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyjq implements lun {
    final /* synthetic */ dyjs a;

    public dyjq(dyjs dyjsVar) {
        this.a = dyjsVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        dyjs dyjsVar = this.a;
        ddfp ddfpVar = dyjsVar.c;
        final ddhi ddhiVar = (ddhi) ddfpVar;
        ddhd.b.c(dyjsVar.b, new ejvr() { // from class: ddgr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ddhiVar.l(dcic.a(ddhd.a, "accountMessagesListener"), 28008);
            }
        });
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ddhf ddhfVar = ddhd.b;
        dyjs dyjsVar = this.a;
        final ddhi ddhiVar = (ddhi) dyjsVar.c;
        ddhfVar.b(dyjsVar.b, new ejvr() { // from class: ddgu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final ddfs ddfsVar = (ddfs) obj;
                ddhc ddhcVar = ddhd.a;
                final ddhi ddhiVar2 = ddhiVar;
                dcib dcibVarG = ddhiVar2.g(ddhcVar, "accountMessagesListener");
                final ddgz ddgzVar = new ddgz(dcibVarG);
                dcir dcirVar = new dcir() { // from class: ddgv
                    @Override // defpackage.dcir
                    public final void a(Object obj2, Object obj3) {
                        ddhg ddhgVar = (ddhg) obj2;
                        ddhc ddhcVar2 = ddhd.a;
                        ddhb ddhbVar = new ddhb((defr) obj3);
                        IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                        Context context = ddhgVar.c;
                        iInAppReachService.registerAccountMessagesListener(ddhbVar, ddhiVar2.c.getPackageName(), ddgzVar, ddlh.a());
                    }
                };
                dcir dcirVar2 = new dcir() { // from class: ddgw
                    @Override // defpackage.dcir
                    public final void a(Object obj2, Object obj3) {
                        ddhg ddhgVar = (ddhg) obj2;
                        ddhc ddhcVar2 = ddhd.a;
                        ddha ddhaVar = new ddha((defr) obj3);
                        IInAppReachService iInAppReachService = (IInAppReachService) ddhgVar.w();
                        Context context = ddhgVar.c;
                        iInAppReachService.unregisterAccountMessagesListener(ddhaVar, ddhiVar2.c.getPackageName(), ddlh.a());
                    }
                };
                dcip dcipVar = new dcip();
                dcipVar.c = dcibVarG;
                dcipVar.d = new Feature[]{ddeu.b};
                dcipVar.a = dcirVar;
                dcipVar.b = dcirVar2;
                dcipVar.e = 28007;
                defn defnVarK = ddhiVar2.k(dcipVar.a());
                defnVarK.t(new defe() { // from class: ddgx
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        ddhd.b.c(ddfsVar, new ejvr() { // from class: ddgp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ddhc ddhcVar2 = ddhd.a;
                                return degc.c(true);
                            }
                        });
                    }
                });
                defnVarK.r(new deey() { // from class: ddgo
                    @Override // defpackage.deey
                    public final void a() {
                        ddhd.b.c(ddfsVar, new ejvr() { // from class: ddgs
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ddhc ddhcVar2 = ddhd.a;
                                return degc.c(true);
                            }
                        });
                    }
                });
                return defnVarK;
            }
        });
        if (dyjsVar.k != null) {
            ddft ddftVar = (ddft) ddfu.a.createBuilder();
            String str = dyjsVar.k;
            ddftVar.copyOnWrite();
            ddfu ddfuVar = (ddfu) ddftVar.instance;
            str.getClass();
            ddfuVar.c = str;
            euag euagVar = (euag) euai.a.createBuilder();
            euagVar.copyOnWrite();
            euai euaiVar = (euai) euagVar.instance;
            euaiVar.c = 6;
            euaiVar.b |= 1;
            ddftVar.copyOnWrite();
            ddfu ddfuVar2 = (ddfu) ddftVar.instance;
            euai euaiVar2 = (euai) euagVar.build();
            euaiVar2.getClass();
            ddfuVar2.d = euaiVar2;
            ddfuVar2.b |= 1;
            String str2 = dyjsVar.e;
            ddftVar.copyOnWrite();
            ddfu ddfuVar3 = (ddfu) ddftVar.instance;
            str2.getClass();
            ddfuVar3.b |= 2;
            ddfuVar3.e = str2;
            ddhd.a((ddfu) ddftVar.build(), ddhiVar);
            dyjsVar.k = null;
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
