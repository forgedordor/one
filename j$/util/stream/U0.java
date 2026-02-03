package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class U0 extends T2 implements A0, InterfaceC0155v0 {
    @Override // j$.util.stream.InterfaceC0113m2
    public final /* synthetic */ void C(Double d) {
        AbstractC0171y1.e(this, d);
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC0155v0, j$.util.stream.InterfaceC0170y0
    public final A0 build() {
        return this;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void c(int i, Object obj) {
        super.c(i, (double[]) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void d(Object obj) {
        super.d((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.t(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void end() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void f(Object[] objArr, int i) {
        AbstractC0171y1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] j(IntFunction intFunction) {
        return AbstractC0171y1.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        clear();
        y(j);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.T2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final j$.util.X spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0170y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.T2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        C((Double) obj);
    }
}
