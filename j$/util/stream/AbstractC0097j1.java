package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0097j1 implements Spliterator {
    public G0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    public AbstractC0097j1(G0 g0) {
        this.a = g0;
    }

    public static G0 a(ArrayDeque arrayDeque) {
        while (true) {
            G0 g0 = (G0) arrayDeque.pollFirst();
            if (g0 == null) {
                return null;
            }
            if (g0.r() != 0) {
                for (int iR = g0.r() - 1; iR >= 0; iR--) {
                    arrayDeque.addFirst(g0.a(iR));
                }
            } else if (g0.count() > 0) {
                return g0;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iR = this.a.r();
        while (true) {
            iR--;
            if (iR < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iR));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        G0 g0A = a(arrayDequeB);
        if (g0A != null) {
            this.d = g0A.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.r(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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
    public final Spliterator trySplit() {
        G0 g0 = this.a;
        if (g0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < g0.r() - 1) {
            G0 g02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return g02.a(i).spliterator();
        }
        G0 g0A = this.a.a(this.b);
        this.a = g0A;
        if (g0A.r() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        G0 g03 = this.a;
        this.b = 1;
        return g03.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return (j$.util.X) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) trySplit();
    }
}
