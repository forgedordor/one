package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0127p1 extends AbstractC0136r1 implements InterfaceC0123o2 {
    public final long[] h;

    public C0127p1(Spliterator spliterator, AbstractC0050a abstractC0050a, long[] jArr) {
        super(spliterator, abstractC0050a, jArr.length);
        this.h = jArr;
    }

    @Override // j$.util.stream.AbstractC0136r1
    public final AbstractC0136r1 a(Spliterator spliterator, long j, long j2) {
        return new C0127p1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        z((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        AbstractC0171y1.i(this, l);
    }

    @Override // j$.util.stream.AbstractC0136r1, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public C0127p1(C0127p1 c0127p1, Spliterator spliterator, long j, long j2) {
        super(c0127p1, spliterator, j, j2, c0127p1.h.length);
        this.h = c0127p1.h;
    }
}
