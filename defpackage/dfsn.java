package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsn extends eyix {
    private final eyir b;
    private final eyir c;

    public dfsn(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2) {
        super(eyikVar2, new eyji(dfsn.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalEmpty;
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        crmx crmxVar = (crmx) list.get(1);
        dfny dfnyVar = dfsd.a;
        if (dftbVar.b().isPresent() && !((dgzn) dftbVar.b().get()).E) {
            optionalEmpty = Optional.ofNullable(((dgwe) dftbVar.b().get()).o);
        } else if (dftbVar.a().isPresent()) {
            Object obj2 = dftbVar.a().get();
            String strK = dhjv.k(((dgyx) dftbVar.a().get()).c, crmxVar);
            if (!dhjv.w(strK)) {
                strK = dhjv.n(((dgyx) obj2).c, crmxVar);
            }
            optionalEmpty = Optional.ofNullable(strK);
        } else {
            optionalEmpty = Optional.empty();
        }
        return eork.i(optionalEmpty);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.c.d());
    }
}
