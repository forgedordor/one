package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crnf {
    public static final cqce a = cqce.g("Bugle", "CountryCodeDetector");
    public final fcsu b;
    private String c;
    private String d;

    public crnf(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    private final synchronized String f() {
        crmx crmxVarG;
        String str;
        fcsu fcsuVar = this.b;
        String strS = ((crny) fcsuVar.b()).j().s();
        final String[] strArr = {strS};
        if (TextUtils.isEmpty(strS)) {
            ((crny) fcsuVar.b()).o(new crnx() { // from class: crnd
                @Override // defpackage.crnx
                public final boolean a(int i) {
                    String strS2 = ((crny) this.a.b.b()).h(i).s();
                    if (TextUtils.isEmpty(strS2)) {
                        return true;
                    }
                    strArr[0] = strS2;
                    cqbd cqbdVarC = crnf.a.c();
                    cqbdVarC.I("updateHomeCountry from SIM country.");
                    cqbdVarC.m(i);
                    cqbdVarC.A("detected country", strS2);
                    cqbdVarC.r();
                    return false;
                }
            });
            if (TextUtils.isEmpty(strArr[0])) {
                String strS2 = ((crny) fcsuVar.b()).g().s();
                if (strS2 == null) {
                    strS2 = "";
                }
                strArr[0] = strS2;
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("updateHomeCountry from system locale as fallback.");
                cqbdVarC.A("detected country", strArr[0]);
                cqbdVarC.r();
            }
        }
        crmxVarG = ((crny) fcsuVar.b()).g();
        str = strArr[0];
        str.getClass();
        return crmxVarG.o(str);
    }

    private final synchronized String g(String str) {
        fcsu fcsuVar = this.b;
        String strP = ((crny) fcsuVar.b()).j().p();
        final String[] strArr = {strP};
        if (TextUtils.isEmpty(strP)) {
            ((crny) fcsuVar.b()).o(new crnx() { // from class: crne
                @Override // defpackage.crnx
                public final boolean a(int i) {
                    String strP2 = ((crny) this.a.b.b()).h(i).p();
                    if (TextUtils.isEmpty(strP2)) {
                        return true;
                    }
                    strArr[0] = strP2;
                    cqbd cqbdVarC = crnf.a.c();
                    cqbdVarC.I("updateSmsNetworkCountry from network country.");
                    cqbdVarC.m(i);
                    cqbdVarC.A("detected country", strP2);
                    cqbdVarC.r();
                    return false;
                }
            });
            if (TextUtils.isEmpty(strArr[0])) {
                return str;
            }
        } else {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("updateSmsNetworkCountry from default subscription network country.");
            cqbdVarC.A("detected country", strArr[0]);
            cqbdVarC.r();
        }
        crmx crmxVarG = ((crny) fcsuVar.b()).g();
        String str2 = strArr[0];
        str2.getClass();
        return crmxVarG.o(str2);
    }

    public final synchronized Optional a(int i) {
        String strD;
        strD = d(i);
        return TextUtils.isEmpty(strD) ? Optional.empty() : Optional.of(strD);
    }

    public final synchronized String b() {
        String str;
        if (this.d == null) {
            e();
        }
        str = this.d;
        if (str == null) {
            throw new NullPointerException("homeCountry is null");
        }
        return str;
    }

    public final synchronized String c() {
        String str;
        if (this.c == null) {
            e();
        }
        str = this.c;
        if (str == null) {
            throw new IllegalStateException("smsNetworkCountry is null");
        }
        return str;
    }

    public final synchronized String d(int i) {
        fcsu fcsuVar;
        String strP;
        fcsuVar = this.b;
        crof crofVarH = ((crny) fcsuVar.b()).h(i);
        strP = crofVarH.p();
        if (TextUtils.isEmpty(strP)) {
            strP = crofVarH.s();
            if (TextUtils.isEmpty(strP) && (strP = ((crny) fcsuVar.b()).g().s()) == null) {
                strP = "";
            }
        }
        return ((crny) fcsuVar.b()).g().o(strP);
    }

    public final synchronized void e() {
        String strF = f();
        this.d = strF;
        this.c = g(strF);
    }
}
