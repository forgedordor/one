package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amoj extends fcyz implements fdat {
    final /* synthetic */ amok a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amoj(amok amokVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amokVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amoj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.c(new Supplier() { // from class: amoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyRcsAvailabilitySupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amoj(this.a, fcxyVar);
    }
}
