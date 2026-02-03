package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbq extends fcyz implements fdat {
    final /* synthetic */ ckbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbq(ckbr ckbrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ckbrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((ckbq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.c(new Supplier() { // from class: ckbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RcsSettingsObservableSupplierV2::notifyUpdate");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckbq(this.a, fcxyVar);
    }
}
