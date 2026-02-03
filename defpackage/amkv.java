package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amkv extends fcyz implements fdat {
    final /* synthetic */ amkw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amkv(amkw amkwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amkwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amkv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.h.c(new Supplier() { // from class: amku
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ClassificationObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amkv(this.a, fcxyVar);
    }
}
