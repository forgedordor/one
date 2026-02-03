package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqs extends fcyz implements fdat {
    final /* synthetic */ amqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqs(amqt amqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.g.c(new Supplier() { // from class: amqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencySessionSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amqs(this.a, fcxyVar);
    }
}
