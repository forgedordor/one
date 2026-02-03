package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amps extends fcyz implements fdat {
    final /* synthetic */ ampu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amps(ampu ampuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ampuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.c(new Supplier() { // from class: ampr
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyLocationPermissionSupplier:Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amps(this.a, fcxyVar);
    }
}
