package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbi implements dgzv {
    public final dewk a;
    public final dexn b;
    private final dfdd c;
    private final eosc d;

    public dhbi(dfdd dfddVar, dewk dewkVar, eosc eoscVar, dexn dexnVar) {
        this.c = dfddVar;
        this.a = dewkVar;
        this.d = eoscVar;
        this.b = dexnVar;
    }

    private final void a(String str) {
        this.c.k(str);
    }

    @Override // defpackage.dgzv
    public final void b(dgzn dgznVar) throws NumberFormatException {
        a(dgznVar.z());
        this.b.v((dhat) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void c(dgzn dgznVar) throws NumberFormatException {
        a(dgznVar.z());
        this.b.t((dhaq) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void d(final dgzn dgznVar) {
        a(dgznVar.z());
        Callable callable = new Callable() { // from class: dhbe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dgznVar.au(this.a.a);
            }
        };
        eosc eoscVar = this.d;
        eork.r(eoscVar.submit(callable), new dhbh(this, dgznVar), eoscVar);
    }

    @Override // defpackage.dgzv
    public final void e(final dgzn dgznVar) {
        a(dgznVar.z());
        Callable callable = new Callable() { // from class: dhbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dgznVar.au(this.a.a);
            }
        };
        eosc eoscVar = this.d;
        eork.r(eoscVar.submit(callable), new dhbg(this, dgznVar), eoscVar);
    }

    @Override // defpackage.dgzv
    public final void f(dgyx dgyxVar) {
        String str = dgyxVar.c;
        dexn dexnVar = this.b;
        crmx crmxVar = dexnVar.n;
        String strK = dhjv.k(str, crmxVar);
        strK.getClass();
        if (!dhjv.w(strK)) {
            strK = dhjv.n(dgyxVar.c, crmxVar);
            strK.getClass();
        }
        dexnVar.m.k(strK);
        try {
            dexnVar.q.a(dgyxVar, 0L, strK);
        } catch (Exception e) {
            dhja.i(e, "Unable to process message %s", dgyxVar);
        }
    }
}
