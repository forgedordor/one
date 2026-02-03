package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0177z2 extends AbstractC0055b {
    public final AbstractC0050a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public C0177z2(AbstractC0050a abstractC0050a, AbstractC0050a abstractC0050a2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC0050a2, spliterator);
        this.j = abstractC0050a;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        if (b()) {
            EnumC0094i3 enumC0094i3 = EnumC0094i3.SIZED;
            AbstractC0050a abstractC0050a = this.j;
            int i = abstractC0050a.c;
            int i2 = enumC0094i3.e;
            InterfaceC0170y0 interfaceC0170y0E = this.j.E((i & i2) == i2 ? abstractC0050a.t(this.b) : -1L, this.k);
            InterfaceC0128p2 interfaceC0128p2I = this.j.I(this.a.f, interfaceC0170y0E);
            AbstractC0050a abstractC0050a2 = this.a;
            abstractC0050a2.i(this.b, abstractC0050a2.N(interfaceC0128p2I));
            return interfaceC0170y0E.build();
        }
        InterfaceC0170y0 interfaceC0170y0E2 = this.j.E(-1L, this.k);
        if (this.l == 0) {
            InterfaceC0128p2 interfaceC0128p2I2 = this.j.I(this.a.f, interfaceC0170y0E2);
            AbstractC0050a abstractC0050a3 = this.a;
            abstractC0050a3.i(this.b, abstractC0050a3.N(interfaceC0128p2I2));
        } else {
            this.a.M(this.b, interfaceC0170y0E2);
        }
        G0 g0Build = interfaceC0170y0E2.build();
        this.n = g0Build.count();
        this.o = true;
        this.b = null;
        return g0Build;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new C0177z2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0055b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC0171y1.E(this.j.D()));
        }
    }

    @Override // j$.util.stream.AbstractC0055b
    public final Object h() {
        return AbstractC0171y1.E(this.j.D());
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C0177z2 c0177z2 = (C0177z2) this.d;
        C0177z2 c0177z22 = (C0177z2) this.e;
        if (c0177z2 == null || c0177z22 == null) {
            return this.n;
        }
        long j2 = c0177z2.j(j);
        return j2 >= j ? j2 : c0177z22.j(j) + j2;
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0177z2 c0177z2;
        G0 g0E;
        AbstractC0065d abstractC0065d = this.d;
        if (abstractC0065d != null) {
            this.n = ((C0177z2) abstractC0065d).n + ((C0177z2) this.e).n;
            if (this.i) {
                this.n = 0L;
                g0E = AbstractC0171y1.E(this.j.D());
            } else {
                g0E = this.n == 0 ? AbstractC0171y1.E(this.j.D()) : ((C0177z2) this.d).n == 0 ? (G0) ((C0177z2) this.e).i() : AbstractC0171y1.C(this.j.D(), (G0) ((C0177z2) this.d).i(), (G0) ((C0177z2) this.e).i());
            }
            G0 g0E2 = g0E;
            if (b()) {
                g0E2 = g0E2.e(this.l, this.m >= 0 ? Math.min(g0E2.count(), this.l + this.m) : this.n, this.k);
            }
            d(g0E2);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                C0177z2 c0177z22 = (C0177z2) ((AbstractC0065d) getCompleter());
                C0177z2 c0177z23 = this;
                while (true) {
                    if (c0177z22 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (c0177z23 == c0177z22.e && (c0177z2 = (C0177z2) c0177z22.d) != null) {
                            long j3 = c0177z2.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        c0177z23 = c0177z22;
                        c0177z22 = (C0177z2) ((AbstractC0065d) c0177z22.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C0177z2(C0177z2 c0177z2, Spliterator spliterator) {
        super(c0177z2, spliterator);
        this.j = c0177z2.j;
        this.k = c0177z2.k;
        this.l = c0177z2.l;
        this.m = c0177z2.m;
    }
}
