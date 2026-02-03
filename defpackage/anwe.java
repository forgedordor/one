package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwe extends fcyz implements fdat {
    final /* synthetic */ anwf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwe(anwf anwfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anwfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((anwe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.c(new Supplier() { // from class: anwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RecipientBusinessInfoObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anwe(this.a, fcxyVar);
    }
}
