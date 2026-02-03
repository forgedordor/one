package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swp extends fcyz implements fdat {
    final /* synthetic */ swv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swp(fcxy fcxyVar, swv swvVar) {
        super(2, fcxyVar);
        this.a = swvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((swp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Optional optional = (Optional) this.a.e.b();
        final swq swqVar = swq.a;
        optional.ifPresent(new Consumer() { // from class: swr
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj2) {
                swqVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        swp swpVar = new swp(fcxyVar, this.a);
        swpVar.b = obj;
        return swpVar;
    }
}
