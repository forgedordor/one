package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0150u0 extends AbstractC0055b {
    public final j$.nio.file.B j;

    public C0150u0(j$.nio.file.B b, AbstractC0050a abstractC0050a, Spliterator spliterator) {
        super(abstractC0050a, spliterator);
        this.j = b;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        AbstractC0050a abstractC0050a = this.a;
        AbstractC0140s0 abstractC0140s0 = (AbstractC0140s0) ((Supplier) this.j.c).get();
        abstractC0050a.M(this.b, abstractC0140s0);
        boolean z = abstractC0140s0.b;
        if (z == ((EnumC0145t0) this.j.b).b) {
            j$.desugar.sun.nio.fs.g.P(this.h, null, Boolean.valueOf(z));
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new C0150u0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0055b
    public final Object h() {
        return Boolean.valueOf(!((EnumC0145t0) this.j.b).b);
    }

    public C0150u0(C0150u0 c0150u0, Spliterator spliterator) {
        super(c0150u0, spliterator);
        this.j = c0150u0.j;
    }
}
