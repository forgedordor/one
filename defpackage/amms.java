package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amms extends fcyz implements fdat {
    final /* synthetic */ ammt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amms(ammt ammtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ammtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.i.c(new Supplier() { // from class: ammr
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyComposeConstraintsSupplier:Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amms(this.a, fcxyVar);
    }
}
