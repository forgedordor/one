package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0075f implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    public /* synthetic */ C0075f(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream g(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0080g ? ((C0080g) baseStream).a : j$.util.S.D(baseStream) ? A.g(AbstractC0070e.o(baseStream)) : AbstractC0070e.w(baseStream) ? IntStream.VivifiedWrapper.convert(AbstractC0070e.q(baseStream)) : AbstractC0070e.B(baseStream) ? C0121o0.g(AbstractC0070e.s(baseStream)) : AbstractC0070e.D(baseStream) ? C0074e3.g(AbstractC0070e.t(baseStream)) : new C0075f(baseStream);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof C0075f) {
            obj = ((C0075f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator iterator2() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator spliterator2() {
        return j$.util.Y.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return g(this.a.unordered());
    }
}
