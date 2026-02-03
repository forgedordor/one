package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class c0 implements PrimitiveIterator.OfLong, LongConsumer, InterfaceC0185z {
    public boolean a = false;
    public long b;
    public final /* synthetic */ Spliterator.OfLong c;

    public c0(Spliterator.OfLong ofLong) {
        this.c = ofLong;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator, j$.util.InterfaceC0185z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (o0.a) {
            o0.a(c0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        forEachRemaining((LongConsumer) new I(consumer, 0));
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!o0.a) {
            return Long.valueOf(nextLong());
        }
        o0.a(c0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }
}
