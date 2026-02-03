package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0087h1 extends AbstractC0097j1 implements j$.util.X {
    @Override // j$.util.X
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.X) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            F0 f0 = (F0) AbstractC0097j1.a(arrayDequeB);
            if (f0 == null) {
                this.a = null;
                return;
            }
            f0.d(obj);
        }
    }

    @Override // j$.util.X
    public final boolean tryAdvance(Object obj) {
        F0 f0;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.X) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (f0 = (F0) AbstractC0097j1.a(this.e)) != null) {
                j$.util.X xSpliterator = f0.spliterator();
                this.d = xSpliterator;
                return xSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
