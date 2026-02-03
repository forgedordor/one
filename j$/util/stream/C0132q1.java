package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0132q1 extends AbstractC0136r1 {
    public final Object[] h;

    public C0132q1(Spliterator spliterator, AbstractC0050a abstractC0050a, Object[] objArr) {
        super(spliterator, abstractC0050a, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.AbstractC0136r1
    public final AbstractC0136r1 a(Spliterator spliterator, long j, long j2) {
        return new C0132q1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public C0132q1(C0132q1 c0132q1, Spliterator spliterator, long j, long j2) {
        super(c0132q1, spliterator, j, j2, c0132q1.h.length);
        this.h = c0132q1.h;
    }
}
