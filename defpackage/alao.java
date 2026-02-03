package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alao extends fcyz implements fdat {
    final /* synthetic */ alap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alao(alap alapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = alapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((alao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.c(new Supplier() { // from class: alan
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RbmSuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alao(this.a, fcxyVar);
    }
}
