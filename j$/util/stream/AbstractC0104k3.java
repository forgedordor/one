package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0104k3 implements Spliterator {
    public final boolean a;
    public final AbstractC0050a b;
    public Supplier c;
    public Spliterator d;
    public InterfaceC0128p2 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC0060c h;
    public boolean i;

    public AbstractC0104k3(AbstractC0050a abstractC0050a, Supplier supplier, boolean z) {
        this.b = abstractC0050a;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    public final boolean a() {
        AbstractC0060c abstractC0060c = this.h;
        if (abstractC0060c == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.k(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC0060c.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.q() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = i & ((~i) >> 1) & EnumC0094i3.j & EnumC0094i3.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    public abstract void d();

    public abstract AbstractC0104k3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC0094i3.SIZED.x(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public AbstractC0104k3(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z) {
        this.b = abstractC0050a;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
