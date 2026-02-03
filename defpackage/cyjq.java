package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjq {
    public final eygg a;
    public final fcsu b;
    public final eosc c;
    public final eosc d;
    private final fcsu e;
    private final fcsu f;

    public cyjq(eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, eosc eoscVar2) {
        this.a = eyggVar;
        this.b = fcsuVar3;
        this.f = fcsuVar;
        this.e = fcsuVar2;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    public final eiju a(final int i) {
        if (((aqsf) this.f.b()).a()) {
            return ((chtk) this.e.b()).g(i).i(new eooz() { // from class: cyjj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((cejj) this.a.a.b()).b(((aubq) obj).d);
                }
            }, this.c);
        }
        Callable callable = new Callable() { // from class: cyjk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((cejp) this.a.b.b()).d(i);
            }
        };
        eosc eoscVar = this.c;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: cyjl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cejj) this.a.a.b()).b((String) obj);
            }
        }, eoscVar);
    }
}
