package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public abstract class Q implements R3, S3 {
    public final boolean a;

    public Q(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.R3
    public final Object a(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        abstractC0050a.h(spliterator, abstractC0050a.N(this));
        return null;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.R3
    public final Object b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        if (this.a) {
            new T(abstractC0050a, spliterator, this).invoke();
            return null;
        }
        new U(abstractC0050a, spliterator, abstractC0050a.N(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.R3
    public final int c() {
        if (this.a) {
            return 0;
        }
        return EnumC0094i3.r;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void k(long j) {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }
}
