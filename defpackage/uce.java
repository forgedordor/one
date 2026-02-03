package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.uce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uce implements cdbt {
    public static final cqce a = cqce.g("BugleNetwork", "GaiaPingRefreshHandler");
    public final Context b;
    private final fcsu c;
    private final eosc d;

    /* compiled from: PG */
    public interface a {
        ceff c();
    }

    public uce(Context context, fcsu fcsuVar, eosc eoscVar) {
        this.b = context;
        this.c = fcsuVar;
        this.d = eoscVar;
    }

    @Override // defpackage.cdbt
    public final eiju a() {
        a.p("Refreshing Tachyon Gaia registration.");
        return ((axky) this.c.b()).a().i(new eooz() { // from class: ucc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((uce.a) ehlh.a(this.a.b, uce.a.class, (efwo) obj)).c().B();
            }
        }, this.d).f(axlg.class, new eooz() { // from class: ucd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                uce.a.r("Cannot refresh Gaia Tachyon registration because no account is linked.");
                return eijx.e(null);
            }
        }, eoqg.a);
    }
}
