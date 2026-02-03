package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public final class d0 implements PrimitiveIterator.OfDouble, DoubleConsumer, InterfaceC0185z {
    public boolean a = false;
    public double b;
    public final /* synthetic */ Spliterator.OfDouble c;

    public d0(Spliterator.OfDouble ofDouble) {
        this.c = ofDouble;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.PrimitiveIterator.OfDouble
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!o0.a) {
            return Double.valueOf(nextDouble());
        }
        o0.a(d0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator.OfDouble, java.util.Iterator, j$.util.InterfaceC0185z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!o0.a) {
            forEachRemaining((DoubleConsumer) new C(consumer, 0));
        } else {
            o0.a(d0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }
}
