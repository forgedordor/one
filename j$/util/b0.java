package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
public final class b0 implements PrimitiveIterator.OfInt, IntConsumer, InterfaceC0185z {
    public boolean a = false;
    public int b;
    public final /* synthetic */ Spliterator.OfInt c;

    public b0(Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator, j$.util.InterfaceC0185z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (o0.a) {
            o0.a(b0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        forEachRemaining((IntConsumer) new F(consumer, 0));
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!o0.a) {
            return Integer.valueOf(nextInt());
        }
        o0.a(b0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }
}
