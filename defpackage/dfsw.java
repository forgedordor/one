package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsw extends eyix {
    private final eyir b;

    public dfsw(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsw.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalAB;
        dftb dftbVar = (dftb) obj;
        dhip dhipVar = dfsq.a;
        if (dfpo.t()) {
            ejwl.b(dftbVar.b().isPresent(), "Session is not present");
            ejwl.b(!((dgwe) dftbVar.b().get()).p, "Session is originating");
            optionalAB = ((dgzn) dftbVar.b().get()).aB();
        } else {
            optionalAB = Optional.empty();
        }
        return eork.i(optionalAB);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
