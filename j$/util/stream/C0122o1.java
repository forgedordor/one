package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0122o1 extends AbstractC0136r1 implements InterfaceC0118n2 {
    public final int[] h;

    public C0122o1(Spliterator spliterator, AbstractC0050a abstractC0050a, int[] iArr) {
        super(spliterator, abstractC0050a, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.AbstractC0136r1
    public final AbstractC0136r1 a(Spliterator spliterator, long j, long j2) {
        return new C0122o1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        o((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0118n2
    public final /* synthetic */ void o(Integer num) {
        AbstractC0171y1.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0136r1, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public C0122o1(C0122o1 c0122o1, Spliterator spliterator, long j, long j2) {
        super(c0122o1, spliterator, j, j2, c0122o1.h.length);
        this.h = c0122o1.h;
    }
}
