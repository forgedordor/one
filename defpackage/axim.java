package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axim {
    public final ejxr a;

    public axim(final cmgk cmgkVar) {
        this.a = ejxx.a(new ejxr() { // from class: axij
            @Override // defpackage.ejxr
            public final Object get() {
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.DB_METADATA);
                cmggVarC.f(bxks.a);
                cmggVarC.c(new Supplier() { // from class: axii
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new axil();
                    }
                });
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }
}
