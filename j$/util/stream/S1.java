package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class S1 implements T1, InterfaceC0123o2 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    public S1(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalLong.empty() : OptionalLong.of(this.b);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void u(T1 t1) {
        S1 s1 = (S1) t1;
        if (s1.a) {
            return;
        }
        accept(s1.b);
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        AbstractC0171y1.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        z((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        if (this.a) {
            this.a = false;
            this.b = j;
        } else {
            this.b = this.c.applyAsLong(this.b, j);
        }
    }
}
