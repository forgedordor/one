package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
public final class f4 extends h4 {
    @Override // j$.util.stream.j4
    public final Spliterator b(Spliterator spliterator) {
        return new f4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        Spliterator spliterator = this.a;
        if (!z) {
            return ((Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
        }
        boolean z2 = false;
        this.c = false;
        while (true) {
            zTryAdvance = ((Spliterator.OfInt) spliterator).tryAdvance((IntConsumer) this);
            if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                break;
            }
            z2 = true;
        }
        if (zTryAdvance) {
            if (z2) {
                this.b.set(true);
            }
            intConsumer.accept(this.f);
        }
        return zTryAdvance;
    }
}
