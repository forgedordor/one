package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0112m1 extends X2 implements E0, InterfaceC0165x0 {
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
        return (long[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC0165x0, j$.util.stream.InterfaceC0170y0
    public final E0 build() {
        return this;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void c(int i, Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.F0
    public final void d(Object obj) {
        super.d((LongConsumer) obj);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.v(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void end() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void f(Object[] objArr, int i) {
        AbstractC0171y1.p(this, (Long[]) objArr, i);
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

    @Override // j$.util.stream.X2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final j$.util.X spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        AbstractC0171y1.i(this, l);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0170y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.X2, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        z((Long) obj);
    }
}
