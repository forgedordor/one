package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyr implements cdfg {
    public final fcsu a;
    private final eosc b;

    public ccyr(eosc eoscVar, fcsu fcsuVar) {
        this.b = eoscVar;
        this.a = fcsuVar;
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: ccyq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(((cczl) this.a.a.b()).a().getBytes(), "Phenotypes"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
