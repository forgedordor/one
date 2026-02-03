package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class L3 extends AbstractC0104k3 {
    @Override // j$.util.stream.AbstractC0104k3
    public final void d() {
        C0054a3 c0054a3 = new C0054a3();
        this.h = c0054a3;
        this.e = this.b.N(new j$.desugar.sun.nio.fs.h(23, c0054a3));
        this.f = new j$.desugar.sun.nio.fs.h(24, this);
    }

    @Override // j$.util.stream.AbstractC0104k3
    public final AbstractC0104k3 e(Spliterator spliterator) {
        return new L3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.nio.file.t tVar = new j$.nio.file.t(consumer, 3);
        this.b.M(this.d, tVar);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C0054a3 c0054a3 = (C0054a3) this.h;
        long j = this.g;
        if (c0054a3.c != 0) {
            if (j >= c0054a3.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c0054a3.c; i++) {
                long j2 = c0054a3.d[i];
                Object[] objArr = c0054a3.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= c0054a3.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = c0054a3.e[(int) j];
        consumer.z(obj);
        return zA;
    }
}
