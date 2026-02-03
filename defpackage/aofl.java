package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aofl implements fdpm {
    final /* synthetic */ aofo a;

    public aofl(aofo aofoVar) {
        this.a = aofoVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        aofo aofoVar = this.a;
        aofoVar.g().set(aofoVar.e((cljh) obj));
        aofoVar.f().c(new Supplier() { // from class: aofh
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SatelliteConnectionStateSupplier::Notify");
        return fctx.a;
    }
}
