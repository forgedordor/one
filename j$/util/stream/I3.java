package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class I3 extends K3 implements Spliterator, Consumer {
    public Object f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K3
    public final Spliterator b(Spliterator spliterator) {
        return new I3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C0129p3 c0129p3 = null;
        while (true) {
            J3 j3C = c();
            if (j3C == J3.NO_MORE) {
                return;
            }
            J3 j3 = J3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (j3C != j3) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (c0129p3 == null) {
                c0129p3 = new C0129p3(i);
            } else {
                c0129p3.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c0129p3)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i2 = 0; i2 < jA; i2++) {
                consumer.accept(c0129p3.b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (c() != J3.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
