package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adad extends fcyz implements fdat {
    final /* synthetic */ adae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adad(adae adaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = adaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((adad) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.c(new Supplier() { // from class: adac
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "HomeScreenActiveComposersSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adad(this.a, fcxyVar);
    }
}
