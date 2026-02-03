package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akgg extends fcyz implements fdat {
    final /* synthetic */ akgi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgg(akgi akgiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akgiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((akgg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.c(new Supplier() { // from class: akgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "PenpalObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akgg(this.a, fcxyVar);
    }
}
