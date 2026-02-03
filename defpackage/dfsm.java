package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsm extends eyix {
    private final eyir b;

    public dfsm(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsm.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalEmpty;
        dftb dftbVar = (dftb) obj;
        dfny dfnyVar = dfsd.a;
        if (dfpo.t() && !dftbVar.b().isEmpty()) {
            Object obj2 = dftbVar.b().get();
            optionalEmpty = ((dgwe) obj2).p ? Optional.empty() : ((dgzn) obj2).aB();
        } else {
            optionalEmpty = Optional.empty();
        }
        return eork.i(optionalEmpty);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
