package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chtu {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public chtu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final int a(aubq aubqVar) throws X {
        aubqVar.getClass();
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        lcg.a(aubpVarB == aubp.PHONE);
        aubqVar.d.getClass();
        lcg.a(!fdgn.H(r0));
        dghj dghjVar = (dghj) this.a.b();
        dggl dgglVar = (dggl) this.b.b();
        String str = aubqVar.d;
        str.getClass();
        Object objOrElseThrow = dghjVar.i(dgglVar.a(str)).orElseThrow(new Supplier() { // from class: chts
            @Override // java.util.function.Supplier
            public final Object get() {
                return new chtt();
            }
        });
        objOrElseThrow.getClass();
        return ((dggr) objOrElseThrow).a;
    }

    public final axcy b(aubq aubqVar) throws X {
        aubqVar.getClass();
        fcsu fcsuVar = this.c;
        axcy axcyVarF = ((bbdl) fcsuVar.b()).f(a(aubqVar));
        axcyVarF.getClass();
        return axcyVarF;
    }

    public final axcy c(aubq aubqVar) {
        aubqVar.getClass();
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        lcg.a(aubpVarB == aubp.PHONE);
        aubqVar.d.getClass();
        lcg.a(!fdgn.H(r0));
        dghj dghjVar = (dghj) this.a.b();
        dggl dgglVar = (dggl) this.b.b();
        String str = aubqVar.d;
        str.getClass();
        dggr dggrVar = (dggr) fdct.b(dghjVar.i(dgglVar.a(str)));
        if (dggrVar != null) {
            return ((bbdl) this.c.b()).f(dggrVar.a);
        }
        return null;
    }
}
