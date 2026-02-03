package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0067d1 extends V2 implements C0, InterfaceC0160w0 {
    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC0160w0, j$.util.stream.InterfaceC0170y0
    public final C0 build() {
        return this;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void c(int i, Object obj) {
        super.c(i, (int[]) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void d(Object obj) {
        super.d((IntConsumer) obj);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.u(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void end() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void f(Object[] objArr, int i) {
        AbstractC0171y1.o(this, (Integer[]) objArr, i);
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

    @Override // j$.util.stream.InterfaceC0118n2
    public final /* synthetic */ void o(Integer num) {
        AbstractC0171y1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.V2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
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

    @Override // j$.util.stream.V2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        o((Integer) obj);
    }
}
