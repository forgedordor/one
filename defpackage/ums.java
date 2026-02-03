package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ums {
    public ums(fcsu fcsuVar) {
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.REACTIONS_PROMO_DATA);
        cmggVarC.f(umq.a);
        cmggVarC.c(new Supplier() { // from class: umr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new umt();
            }
        });
        cmgkVar.a(cmggVarC.a());
    }
}
