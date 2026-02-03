package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqn implements cert {
    private final fcsu a;
    private final String b;

    public ceqn(fcsu fcsuVar, String str) {
        this.a = fcsuVar;
        this.b = str;
        ejwl.b(!str.isEmpty(), "Tachyon host cannot be empty");
        ejwl.b(true, "Tachyon port must be greater than 0");
        ejwl.b(true, "Tachyon port must be less than 65536");
    }

    @Override // defpackage.cert
    public final eiju a(eziu eziuVar) {
        eyzg eyzgVarE = e();
        fbnd fbndVar = eyzgVarE.a;
        fbrk fbrkVarA = eyzh.k;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.k;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "GetGaiaDeviceInfo");
                    fbrhVarA.b();
                    eziu eziuVar2 = eziu.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eziuVar2);
                    fbrhVarA.b = new fcrh(eziw.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.k = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarE.b), eziuVar));
    }

    @Override // defpackage.cert
    public final eiju b(ezll ezllVar) {
        return eiju.g(e().c(ezllVar));
    }

    @Override // defpackage.cert
    public final eiju c(ezmr ezmrVar) {
        return eiju.g(e().d(ezmrVar));
    }

    @Override // defpackage.cert
    public final eiju d(ezni ezniVar) {
        return eiju.g(e().e(ezniVar));
    }

    final eyzg e() {
        eyzg eyzgVar = (eyzg) ((eyzg) ceqb.b((eyzg) this.a.b(), false)).n(esoc.a, this.b + ":443");
        fbnb fbnbVar = espr.a;
        esop esopVar = new esop();
        esopVar.b(ekhx.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        return (eyzg) eyzgVar.n(fbnbVar, new esow(esopVar.c()));
    }
}
