package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acas extends acbz {
    public dyuo a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    @Override // defpackage.acbz
    public final acca a() {
        dyuo dyuoVar = this.a;
        if (dyuoVar != null) {
            return new acat(dyuoVar, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: features");
    }

    @Override // defpackage.acbz
    public final void b(Function function) {
        this.d = Optional.of(function);
    }

    @Override // defpackage.acbz
    public final void c(Function function) {
        this.c = Optional.of(function);
    }

    @Override // defpackage.acbz
    public final void d(accc acccVar) {
        this.b = Optional.of(acccVar);
    }
}
