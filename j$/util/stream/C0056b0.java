package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0056b0 extends AbstractC0066d0 {
    @Override // j$.util.stream.AbstractC0050a
    public final boolean H() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0066d0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEach(intConsumer);
        } else {
            AbstractC0066d0.P(K()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0066d0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC0066d0.P(K()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final IntStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final IntStream sequential() {
        this.a.k = false;
        return this;
    }
}
