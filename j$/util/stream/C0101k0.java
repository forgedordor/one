package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0101k0 extends AbstractC0111m0 {
    @Override // j$.util.stream.AbstractC0050a
    public final boolean H() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0111m0, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            AbstractC0111m0.P(K()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0111m0, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC0111m0.P(K()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final LongStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final LongStream sequential() {
        this.a.k = false;
        return this;
    }
}
