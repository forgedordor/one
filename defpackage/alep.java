package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alep extends fcyz implements fdat {
    final /* synthetic */ aleq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alep(aleq aleqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aleqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((alep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.c(new Supplier() { // from class: aleo
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alep(this.a, fcxyVar);
    }
}
