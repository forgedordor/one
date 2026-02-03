package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdts implements cdfg {
    public final cdte a;
    private final eosc b;

    public cdts(cdte cdteVar, eosc eoscVar) {
        this.b = eoscVar;
        this.a = cdteVar;
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: cdtr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(ejwk.b(this.a.a.f()).getBytes(), "MDDStatus"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
