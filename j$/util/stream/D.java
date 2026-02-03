package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class D implements R3 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public D(boolean z, EnumC0099j3 enumC0099j3, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC0094i3.r) | EnumC0094i3.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.R3
    public final Object a(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        S3 s3 = (S3) this.d.get();
        abstractC0050a.M(spliterator, s3);
        Object obj = s3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.R3
    public final Object b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return new K(this, EnumC0094i3.ORDERED.x(abstractC0050a.f), abstractC0050a, spliterator).invoke();
    }

    @Override // j$.util.stream.R3
    public final int c() {
        return this.a;
    }
}
