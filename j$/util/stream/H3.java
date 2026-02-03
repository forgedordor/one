package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public abstract class H3 extends K3 implements j$.util.X {
    public abstract void d(Object obj);

    public abstract AbstractC0124o3 e(int i);

    @Override // j$.util.X
    public final void forEachRemaining(Object obj) {
        obj.getClass();
        AbstractC0124o3 abstractC0124o3E = null;
        while (true) {
            J3 j3C = c();
            if (j3C == J3.NO_MORE) {
                return;
            }
            J3 j3 = J3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (j3C != j3) {
                ((j$.util.X) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (abstractC0124o3E == null) {
                abstractC0124o3E = e(i);
            } else {
                abstractC0124o3E.b = 0;
            }
            long j = 0;
            while (((j$.util.X) spliterator).tryAdvance(abstractC0124o3E)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                abstractC0124o3E.a(obj, a(j));
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

    @Override // j$.util.X
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        while (c() != J3.NO_MORE && ((j$.util.X) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
