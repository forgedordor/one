package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class awij {
    private final asxy a;

    public awij(asxy asxyVar) {
        this.a = asxyVar;
    }

    @Deprecated
    public final assi a(alqm alqmVar) {
        return alqmVar.e().isEmpty() ? assi.d() : assi.b(b((aubq) alqmVar.e().get()).a());
    }

    public final asts b(aubq aubqVar) {
        try {
            return (asts) eork.q(this.a.b(aubqVar));
        } catch (ExecutionException e) {
            auvh.d(e);
            throw new AssertionError("RcsCapabilitiesSyncGetter should have crashed.");
        }
    }
}
