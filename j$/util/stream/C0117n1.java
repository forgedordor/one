package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0117n1 extends AbstractC0136r1 implements InterfaceC0113m2 {
    public final double[] h;

    public C0117n1(Spliterator spliterator, AbstractC0050a abstractC0050a, double[] dArr) {
        super(spliterator, abstractC0050a, dArr.length);
        this.h = dArr;
    }

    @Override // j$.util.stream.InterfaceC0113m2
    public final /* synthetic */ void C(Double d) {
        AbstractC0171y1.e(this, d);
    }

    @Override // j$.util.stream.AbstractC0136r1
    public final AbstractC0136r1 a(Spliterator spliterator, long j, long j2) {
        return new C0117n1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        C((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC0136r1, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public C0117n1(C0117n1 c0117n1, Spliterator spliterator, long j, long j2) {
        super(c0117n1, spliterator, j, j2, c0117n1.h.length);
        this.h = c0117n1.h;
    }
}
