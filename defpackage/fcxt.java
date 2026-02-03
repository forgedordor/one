package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcxt implements fcyg {
    private final fdap a;
    private final fcyg b;

    public fcxt(fcyg fcygVar, fdap fdapVar) {
        this.a = fdapVar;
        this.b = fcygVar instanceof fcxt ? ((fcxt) fcygVar).b : fcygVar;
    }

    public final fcyf a(fcyf fcyfVar) {
        return (fcyf) this.a.invoke(fcyfVar);
    }

    public final boolean b(fcyg fcygVar) {
        fcygVar.getClass();
        return fcygVar == this || this.b == fcygVar;
    }
}
