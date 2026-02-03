package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampj extends fcyz implements fdat {
    final /* synthetic */ ampk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampj(ampk ampkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ampkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((ampj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.c(new Supplier() { // from class: ampi
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "GeofilterDbSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ampj(this.a, fcxyVar);
    }
}
