package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdw extends cjco {
    private final fcsu a;
    private final fcsu b;

    public cjdw(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cjco
    /* renamed from: a */
    public final audc apply(cjjh cjjhVar) {
        ejwl.b(cjjhVar.c == 3, "Unexpected missing groupEvent");
        ejwl.b(!(cjjhVar.c == 3 ? (cjhs) cjjhVar.d : cjhs.a).b.isEmpty(), "Unexpected empty changedMember");
        audb audbVar = (audb) audc.c.createBuilder();
        cjgr cjgrVar = cjjhVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        str.getClass();
        audcVar.d |= 1;
        audcVar.e = str;
        fcsu fcsuVar = this.a;
        asqx asqxVar = (asqx) fcsuVar.b();
        for (cjhy cjhyVar : (cjjhVar.c == 3 ? (cjhs) cjjhVar.d : cjhs.a).b) {
            int i = cjhyVar.g;
            cjhx cjhxVarB = cjhx.b(i);
            if (cjhxVarB == null) {
                cjhxVarB = cjhx.UNKNOWN_TYPE;
            }
            if (cjhxVarB != cjhx.PRESENT) {
                cjhx cjhxVarB2 = cjhx.b(i);
                if (cjhxVarB2 == null) {
                    cjhxVarB2 = cjhx.UNKNOWN_TYPE;
                }
                if (cjhxVarB2 == cjhx.PENDING) {
                }
            }
            cjju cjjuVar = cjhyVar.d;
            if (cjjuVar == null) {
                cjjuVar = cjju.a;
            }
            audbVar.a(asqxVar.a((cjjuVar.b == 1 ? (cjjp) cjjuVar.c : cjjp.a).c, false));
        }
        asqx asqxVar2 = (asqx) fcsuVar.b();
        for (cjhy cjhyVar2 : (cjjhVar.c == 3 ? (cjhs) cjjhVar.d : cjhs.a).b) {
            cjhx cjhxVarB3 = cjhx.b(cjhyVar2.g);
            if (cjhxVarB3 == null) {
                cjhxVarB3 = cjhx.UNKNOWN_TYPE;
            }
            if (cjhxVarB3 == cjhx.ABSENT) {
                cjju cjjuVar2 = cjhyVar2.d;
                if (cjjuVar2 == null) {
                    cjjuVar2 = cjju.a;
                }
                audbVar.f(asqxVar2.a((cjjuVar2.b == 1 ? (cjjp) cjjuVar2.c : cjjp.a).c, false));
            }
        }
        aufa aufaVar = (aufa) aufb.a.createBuilder();
        asqx asqxVar3 = (asqx) fcsuVar.b();
        cjju cjjuVar3 = ((cjhy) (cjjhVar.c == 3 ? (cjhs) cjjhVar.d : cjhs.a).b.get(0)).e;
        if (cjjuVar3 == null) {
            cjjuVar3 = cjju.a;
        }
        aubq aubqVarA = asqxVar3.a((cjjuVar3.b == 1 ? (cjjp) cjjuVar3.c : cjjp.a).c, false);
        aufaVar.copyOnWrite();
        aufb aufbVar = (aufb) aufaVar.instance;
        aubqVarA.getClass();
        aufbVar.c = aubqVarA;
        aufbVar.b |= 1;
        aufb aufbVar2 = (aufb) aufaVar.build();
        audbVar.copyOnWrite();
        audc audcVar2 = (audc) audbVar.instance;
        aufbVar2.getClass();
        audcVar2.r = aufbVar2;
        audcVar2.d |= 1024;
        aubq aubqVar = (aubq) ((cejp) this.b.b()).b().orElseThrow(new Supplier() { // from class: cjdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
        audbVar.copyOnWrite();
        audc audcVar3 = (audc) audbVar.instance;
        aubqVar.getClass();
        audcVar3.t = aubqVar;
        audcVar3.d |= 4096;
        return (audc) audbVar.build();
    }

    @Override // defpackage.cjco, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((cjjh) obj);
    }
}
