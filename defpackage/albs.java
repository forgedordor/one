package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class albs extends fcyz implements fdat {
    final /* synthetic */ albu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albs(albu albuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = albuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((albs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.c(new Supplier() { // from class: albr
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ScreenEffectSuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new albs(this.a, fcxyVar);
    }
}
