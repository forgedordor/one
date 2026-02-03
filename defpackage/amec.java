package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amec implements ajmq {
    public final List a = new ArrayList();
    private final aoer b;
    private final ajmw c;
    private final fcsu d;
    private final AtomicReference e;

    public amec(aoer aoerVar, ajlq ajlqVar, ajmw ajmwVar, fcsu fcsuVar) {
        this.b = aoerVar;
        this.c = ajmwVar;
        this.d = fcsuVar;
        this.e = new AtomicReference(ajlqVar);
    }

    @Override // defpackage.ajmr
    public final ajlq a() {
        return (ajlq) this.e.get();
    }

    @Override // defpackage.ajmr
    public final ajmw b() {
        return this.c;
    }

    @Override // defpackage.ajmq
    public final aoer c() {
        return this.b;
    }

    @Override // defpackage.ajmc
    public final /* synthetic */ int d() {
        return 2;
    }

    public final void e(ajlq ajlqVar) {
        ekgb<ymt> ekgbVarA;
        ajlq ajlqVarA = a();
        if (!ajlqVarA.a(ajlqVar)) {
            return;
        }
        AtomicReference atomicReference = this.e;
        while (!atomicReference.compareAndSet(ajlqVarA, ajlqVar)) {
            if (atomicReference.get() != ajlqVarA) {
                return;
            }
        }
        List list = this.a;
        synchronized (list) {
            ekgbVarA = ekfv.a(list);
        }
        for (ymt ymtVar : ekgbVarA) {
            ymtVar.a.b(ymtVar.b);
        }
        if (ajlqVar.b()) {
            List list2 = this.a;
            synchronized (list2) {
                list2.clear();
            }
        }
    }

    public final cquc f(final ymt ymtVar) {
        if (a().b()) {
            return cquc.d;
        }
        List list = this.a;
        synchronized (list) {
            list.add(ymtVar);
        }
        return new cquc() { // from class: ameb
            @Override // defpackage.cquc
            public final void a() {
                List list2 = this.a.a;
                ymt ymtVar2 = ymtVar;
                synchronized (list2) {
                    list2.remove(ymtVar2);
                }
            }

            @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                cqub.a(this);
            }
        };
    }
}
