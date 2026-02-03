package j$.util.stream;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public class X2 extends Z2 implements LongConsumer {
    @Override // j$.util.stream.Z2
    public final Object[] A() {
        return new long[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfLong spliterator() {
        return new W2(this, 0, this.c, 0, this.b);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        B();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d((LongConsumer) consumer);
        } else {
            if (T3.a) {
                T3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.h((W2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.c0(spliterator());
    }

    @Override // j$.util.stream.Z2
    public final Object newArray(int i) {
        return new long[i];
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    @Override // j$.util.stream.Z2
    public final void v(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Z2
    public final int w(Object obj) {
        return ((long[]) obj).length;
    }
}
