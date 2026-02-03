package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhz implements efze, efzf {
    public static final cqce a = cqce.g("Bugle", "SatellitePairedAccountSelector");
    private final abhr b;
    private final eosc c;

    public abhz(abhr abhrVar, eosc eoscVar) {
        this.b = abhrVar;
        this.c = eoscVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        return this.b.a().h(new ejvr() { // from class: abhy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    abhz.a.p("No stored account is present");
                    return null;
                }
                cqbd cqbdVarC = abhz.a.c();
                cqbdVarC.I("Loading stored account");
                cqbdVarC.A("accountId", optional.get());
                cqbdVarC.r();
                return (efwo) optional.get();
            }
        }, this.c);
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        a.p("Using selection");
        return eijx.e(null);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
