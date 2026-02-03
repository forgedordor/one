package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0083g2 extends AbstractC0093i2 {
    @Override // j$.util.stream.AbstractC0050a
    public final boolean H() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0093i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            K().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0093i2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.k) {
            super.forEachOrdered(consumer);
        } else {
            K().forEachRemaining(consumer);
        }
    }
}
