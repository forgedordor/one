package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akew extends fcyz implements fdat {
    final /* synthetic */ akex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akew(akex akexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((akew) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.c(new Supplier() { // from class: akev
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyConversationPropertiesObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akew(this.a, fcxyVar);
    }
}
