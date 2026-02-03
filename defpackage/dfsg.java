package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsg extends eyix {
    private final eyir b;

    public dfsg(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsg.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        dftb dftbVar = (dftb) obj;
        dfny dfnyVar = dfsd.a;
        return eork.i((dftbVar.b().isPresent() && dftbVar.a().isEmpty()) ? Optional.ofNullable(((dgzn) dftbVar.b().get()).N) : dftbVar.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
