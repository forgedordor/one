package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtk implements cdfg {
    public final fcsu a;
    private final eosc b;

    public cmtk(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: cmtj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekfw ekfwVar = new ekfw();
                ekfwVar.h(new FileTeleporter(((cmtp) this.a.a.b()).c().getBytes(StandardCharsets.UTF_8), "Carrier config"));
                return ekfwVar.g();
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
