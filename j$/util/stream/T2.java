package j$.util.stream;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public class T2 extends Z2 implements DoubleConsumer {
    @Override // j$.util.stream.Z2
    public final Object[] A() {
        return new double[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfDouble spliterator() {
        return new S2(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        B();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d((DoubleConsumer) consumer);
        } else {
            if (T3.a) {
                T3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.f((S2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.d0(spliterator());
    }

    @Override // j$.util.stream.Z2
    public final Object newArray(int i) {
        return new double[i];
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    @Override // j$.util.stream.Z2
    public final void v(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Z2
    public final int w(Object obj) {
        return ((double[]) obj).length;
    }
}
