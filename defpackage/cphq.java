package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cphq implements cpgl {
    public static final cqce a = cqce.g("BugleCms", "GmsKeyRetrievalClientImpl");
    public final Context b;
    public final dcdt c;
    public final dbuu d;
    private final fcyh e;

    public cphq(Context context, fcyh fcyhVar, dcdt dcdtVar, cpgm cpgmVar) {
        this.b = context;
        this.e = fcyhVar;
        this.c = dcdtVar;
        dbtv dbtvVar = new dbtv();
        dbtvVar.a = cpgmVar.d;
        dclh.n(dbtvVar.a, "A valid security domain is required.");
        dbtw dbtwVar = new dbtw(dbtvVar);
        dcfe dcfeVar = dbtu.c;
        this.d = new dbuu(context, dbtwVar);
    }

    @Override // defpackage.cpgl
    public final eiju a(String str) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dbup(str);
        dcizVar.b = new Feature[]{dbwc.a};
        dcizVar.c = 1581;
        defn defnVarJ = this.d.j(dcizVar.a());
        final fdap fdapVar = new fdap() { // from class: cphj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cphq.a.p("getKeyMaterial Succeeded.");
                return fctx.a;
            }
        };
        defnVarJ.a(new defh() { // from class: cphl
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarJ.t(new defe() { // from class: cphm
            @Override // defpackage.defe
            public final void d(Exception exc) {
                cqbd cqbdVarE = cphq.a.e();
                cqbdVarE.I("getKeyMaterial Failed.");
                cqbdVarE.s(exc);
            }
        });
        eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cpgl
    public final eiju b(final String str) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dbun(str);
        dcizVar.b = new Feature[]{dbwc.a};
        dcizVar.c = 1580;
        defn defnVarJ = this.d.j(dcizVar.a());
        final fdap fdapVar = new fdap() { // from class: cpgt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                cqbd cqbdVarC = cphq.a.c();
                cqbdVarC.I("getSyncStatus Succeeded.");
                cqbdVarC.y("syncStatus", iIntValue);
                cqbdVarC.r();
                return fctx.a;
            }
        };
        defnVarJ.a(new defh() { // from class: cpgu
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarJ.t(new defe() { // from class: cpgv
            @Override // defpackage.defe
            public final void d(Exception exc) {
                if (fdbq.f(str, "FAKE ACCOUNT")) {
                    cphq.a.p("getSyncStatus Failed with the fake account workaround.");
                    return;
                }
                cqbd cqbdVarE = cphq.a.e();
                cqbdVarE.I("getSyncStatus Failed.");
                cqbdVarE.s(exc);
            }
        });
        eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cpgl
    public final eiju c(String str) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dbui(str);
        dcizVar.b = new Feature[]{dbwc.f};
        dcizVar.c = 1661;
        defn defnVarJ = this.d.j(dcizVar.a());
        final fdap fdapVar = new fdap() { // from class: cphk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cphq.a.p("listSecurityDomainMembers Succeeded.");
                return fctx.a;
            }
        };
        defnVarJ.a(new defh() { // from class: cphn
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarJ.t(new defe() { // from class: cpho
            @Override // defpackage.defe
            public final void d(Exception exc) {
                cqbd cqbdVarE = cphq.a.e();
                cqbdVarE.I("listSecurityDomainMembers Failed.");
                cqbdVarE.s(exc);
            }
        });
        eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cpgl
    public final eiju d(String str) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dbug(str);
        dcizVar.b = new Feature[]{dbwc.f};
        dcizVar.c = 1658;
        defn defnVarJ = this.d.j(dcizVar.a());
        final fdap fdapVar = new fdap() { // from class: cphg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cphq.a.p("resetSecurityDomain Succeeded.");
                return fctx.a;
            }
        };
        defnVarJ.a(new defh() { // from class: cphh
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarJ.t(new defe() { // from class: cphi
            @Override // defpackage.defe
            public final void d(Exception exc) {
                cqbd cqbdVarE = cphq.a.e();
                cqbdVarE.I("resetSecurityDomain Failed.");
                cqbdVarE.s(exc);
            }
        });
        eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cpgl
    public final eiju e(String str, final boolean z) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dbul(str, z);
        dcizVar.b = new Feature[]{dbwc.a};
        dcizVar.c = 1579;
        defn defnVarJ = this.d.j(dcizVar.a());
        final fdap fdapVar = new fdap() { // from class: cpgp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cqbd cqbdVarC = cphq.a.c();
                cqbdVarC.I("setConsent Succeeded.");
                cqbdVarC.B("consent", z);
                cqbdVarC.r();
                return fctx.a;
            }
        };
        defnVarJ.a(new defh() { // from class: cpgq
            @Override // defpackage.defh
            public final void e(Object obj) {
                fdapVar.invoke(obj);
            }
        });
        defnVarJ.t(new defe() { // from class: cpgr
            @Override // defpackage.defe
            public final void d(Exception exc) {
                cqbd cqbdVarE = cphq.a.e();
                cqbdVarE.I("setConsent Failed.");
                cqbdVarE.s(exc);
            }
        });
        eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cpgl
    public final Object f(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new cphp(null, this), fcxyVar);
    }
}
