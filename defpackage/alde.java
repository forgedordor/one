package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alde extends fcyz implements fdat {
    final /* synthetic */ aldf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alde(aldf aldfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aldfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((alde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.m.c(new Supplier() { // from class: aldd
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SmartSuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alde(this.a, fcxyVar);
    }
}
