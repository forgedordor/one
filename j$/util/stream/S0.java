package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public class S0 implements A0 {
    public final double[] a;
    public int b;

    public S0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.F0
    public final void c(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.F0
    public final void d(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.t(this, j, j2);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void f(Object[] objArr, int i) {
        AbstractC0171y1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0171y1.q(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] j(IntFunction intFunction) {
        return AbstractC0171y1.m(this, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.X spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        dArr.getClass();
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.g0(dArr, 0, i, 1040);
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public S0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        dArr.getClass();
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.g0(dArr, 0, i, 1040);
    }
}
