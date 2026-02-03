package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alcl extends fcyz implements fdat {
    final /* synthetic */ alcm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alcl(alcm alcmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = alcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((alcl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.l.c(new Supplier() { // from class: alck
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SmartSuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alcl(this.a, fcxyVar);
    }
}
