package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpy implements cdfg {
    public final cqpz a;
    private final eosc b;

    public cqpy(cqpz cqpzVar, eosc eoscVar) {
        this.a = cqpzVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: cqpx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(this.a.a.d().getBytes(), "GServicesValues"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
