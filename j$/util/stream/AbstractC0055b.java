package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0055b extends AbstractC0065d {
    public final AtomicReference h;
    public volatile boolean i;

    public AbstractC0055b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        super(abstractC0050a, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC0065d.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0055b abstractC0055b = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC0055b.i;
            if (!z2) {
                CountedCompleter completer = abstractC0055b.getCompleter();
                while (true) {
                    AbstractC0055b abstractC0055b2 = (AbstractC0055b) ((AbstractC0065d) completer);
                    if (z2 || abstractC0055b2 == null) {
                        break;
                    }
                    z2 = abstractC0055b2.i;
                    completer = abstractC0055b2.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC0055b.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0055b abstractC0055b3 = (AbstractC0055b) abstractC0055b.c(spliteratorTrySplit);
            abstractC0055b.d = abstractC0055b3;
            AbstractC0055b abstractC0055b4 = (AbstractC0055b) abstractC0055b.c(spliterator);
            abstractC0055b.e = abstractC0055b4;
            abstractC0055b.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0055b = abstractC0055b3;
                abstractC0055b3 = abstractC0055b4;
            } else {
                abstractC0055b = abstractC0055b4;
            }
            z = !z;
            abstractC0055b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = abstractC0055b.a();
        abstractC0055b.d(objH);
        abstractC0055b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0065d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            j$.desugar.sun.nio.fs.g.P(this.h, null, obj);
        }
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC0055b abstractC0055b = this;
        for (AbstractC0055b abstractC0055b2 = (AbstractC0055b) ((AbstractC0065d) getCompleter()); abstractC0055b2 != null; abstractC0055b2 = (AbstractC0055b) ((AbstractC0065d) abstractC0055b2.getCompleter())) {
            if (abstractC0055b2.d == abstractC0055b) {
                AbstractC0055b abstractC0055b3 = (AbstractC0055b) abstractC0055b2.e;
                if (!abstractC0055b3.i) {
                    abstractC0055b3.f();
                }
            }
            abstractC0055b = abstractC0055b2;
        }
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public abstract Object h();

    public final Object i() {
        if (!b()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? h() : obj;
    }

    public AbstractC0055b(AbstractC0055b abstractC0055b, Spliterator spliterator) {
        super(abstractC0055b, spliterator);
        this.h = abstractC0055b.h;
    }
}
