package defpackage;

import j$.lang.Iterable$EL;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asww implements asxy {
    private final Supplier a;

    public asww(Supplier supplier) {
        this.a = supplier;
    }

    private final asts d() {
        int i = asts.b;
        aste asteVar = new aste();
        asteVar.c(asva.a);
        asteVar.b((Instant) this.a.get());
        return asteVar.a();
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        final asts astsVarD = d();
        final HashMap map = new HashMap();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: aswv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                map.put((aubq) obj, astsVarD);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return eijx.e(map);
    }

    @Override // defpackage.asxy
    public final eiju b(aubq aubqVar) {
        return eijx.e(d());
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
