package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0050a implements BaseStream {
    public final AbstractC0050a a;
    public final AbstractC0050a b;
    public final int c;
    public final AbstractC0050a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public AbstractC0050a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC0094i3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC0094i3.l;
        this.e = 0;
        this.k = z;
    }

    public abstract boolean C(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2);

    public abstract EnumC0099j3 D();

    public abstract InterfaceC0170y0 E(long j, IntFunction intFunction);

    public G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return F(abstractC0050a, spliterator, new j$.desugar.sun.nio.fs.n(17)).spliterator();
    }

    public abstract boolean H();

    public abstract InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2);

    public final Spliterator J(int i) {
        int i2;
        int i3;
        AbstractC0050a abstractC0050a = this.a;
        Spliterator spliteratorG = abstractC0050a.g;
        if (spliteratorG == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0050a.g = null;
        if (abstractC0050a.k && abstractC0050a.i) {
            AbstractC0050a abstractC0050a2 = abstractC0050a.d;
            int i4 = 1;
            while (abstractC0050a != this) {
                int i5 = abstractC0050a2.c;
                if (abstractC0050a2.H()) {
                    if (EnumC0094i3.SHORT_CIRCUIT.x(i5)) {
                        i5 &= ~EnumC0094i3.u;
                    }
                    spliteratorG = abstractC0050a2.G(abstractC0050a, spliteratorG);
                    if (spliteratorG.hasCharacteristics(64)) {
                        i2 = (~EnumC0094i3.t) & i5;
                        i3 = EnumC0094i3.s;
                    } else {
                        i2 = (~EnumC0094i3.s) & i5;
                        i3 = EnumC0094i3.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                abstractC0050a2.e = i4;
                abstractC0050a2.f = EnumC0094i3.f(i5, abstractC0050a.f);
                AbstractC0050a abstractC0050a3 = abstractC0050a2;
                abstractC0050a2 = abstractC0050a2.d;
                abstractC0050a = abstractC0050a3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = EnumC0094i3.f(i, this.f);
        }
        return spliteratorG;
    }

    public final Spliterator K() {
        AbstractC0050a abstractC0050a = this.a;
        if (this != abstractC0050a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0050a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0050a.g = null;
        return spliterator;
    }

    public abstract Spliterator L(AbstractC0050a abstractC0050a, Supplier supplier, boolean z);

    public final InterfaceC0128p2 M(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        h(spliterator, N(interfaceC0128p2));
        return interfaceC0128p2;
    }

    public final InterfaceC0128p2 N(InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        AbstractC0050a abstractC0050a = this;
        while (true) {
            int i = abstractC0050a.e;
            AbstractC0050a abstractC0050a2 = abstractC0050a.b;
            if (i <= 0) {
                return interfaceC0128p2;
            }
            interfaceC0128p2 = abstractC0050a.I(abstractC0050a2.f, interfaceC0128p2);
            abstractC0050a = abstractC0050a2;
        }
    }

    public final Spliterator O(Spliterator spliterator) {
        return this.e == 0 ? spliterator : L(this, new j$.desugar.sun.nio.fs.h(9, spliterator), this.a.k);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0050a abstractC0050a = this.a;
        Runnable runnable = abstractC0050a.j;
        if (runnable != null) {
            abstractC0050a.j = null;
            runnable.run();
        }
    }

    public final void h(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        if (EnumC0094i3.SHORT_CIRCUIT.x(this.f)) {
            i(spliterator, interfaceC0128p2);
            return;
        }
        interfaceC0128p2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0128p2);
        interfaceC0128p2.end();
    }

    public final boolean i(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        AbstractC0050a abstractC0050a = this;
        while (abstractC0050a.e > 0) {
            abstractC0050a = abstractC0050a.b;
        }
        interfaceC0128p2.k(spliterator.getExactSizeIfKnown());
        boolean zC = abstractC0050a.C(spliterator, interfaceC0128p2);
        interfaceC0128p2.end();
        return zC;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    public final G0 l(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return p(this, spliterator, z, intFunction);
        }
        InterfaceC0170y0 interfaceC0170y0E = E(t(spliterator), intFunction);
        M(spliterator, interfaceC0170y0E);
        return interfaceC0170y0E.build();
    }

    public final Object m(R3 r3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? r3.b(this, J(r3.c())) : r3.a(this, J(r3.c()));
    }

    public final G0 n(IntFunction intFunction) {
        AbstractC0050a abstractC0050a;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (abstractC0050a = this.b) == null || !H()) {
            return l(J(0), true, intFunction);
        }
        this.e = 0;
        return F(abstractC0050a, abstractC0050a.J(0), intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractC0050a abstractC0050a = this.a;
        Runnable runnable2 = abstractC0050a.j;
        if (runnable2 != null) {
            runnable = new M3(0, runnable2, runnable);
        }
        abstractC0050a.j = runnable;
        return this;
    }

    public abstract G0 p(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction);

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0050a abstractC0050a = this.a;
        if (this != abstractC0050a) {
            return L(this, new j$.desugar.sun.nio.fs.h(8, this), abstractC0050a.k);
        }
        Spliterator spliterator = abstractC0050a.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0050a.g = null;
        return spliterator;
    }

    public final long t(Spliterator spliterator) {
        if (EnumC0094i3.SIZED.x(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public AbstractC0050a(AbstractC0050a abstractC0050a, int i) {
        if (!abstractC0050a.h) {
            abstractC0050a.h = true;
            abstractC0050a.d = this;
            this.b = abstractC0050a;
            this.c = EnumC0094i3.h & i;
            this.f = EnumC0094i3.f(i, abstractC0050a.f);
            AbstractC0050a abstractC0050a2 = abstractC0050a.a;
            this.a = abstractC0050a2;
            if (H()) {
                abstractC0050a2.i = true;
            }
            this.e = abstractC0050a.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
