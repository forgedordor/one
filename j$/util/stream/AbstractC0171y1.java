package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0171y1 implements R3 {
    public static final Y0 a = new Y0();
    public static final W0 b = new W0();
    public static final X0 c = new X0();
    public static final V0 d = new V0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static C0 A(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z) {
        long jT = abstractC0050a.t(spliterator);
        if (jT < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c0 = (C0) new L0(abstractC0050a, spliterator, new C0076f0(5), new C0076f0(6)).invoke();
            return z ? H(c0) : c0;
        }
        if (jT >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jT];
        new C0122o1(spliterator, abstractC0050a, iArr).invoke();
        return new C0057b1(iArr);
    }

    public static E0 B(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z) {
        long jT = abstractC0050a.t(spliterator);
        if (jT < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e0 = (E0) new L0(abstractC0050a, spliterator, new C0076f0(7), new C0076f0(8)).invoke();
            return z ? I(e0) : e0;
        }
        if (jT >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jT];
        new C0127p1(spliterator, abstractC0050a, jArr).invoke();
        return new C0102k1(jArr);
    }

    public static I0 C(EnumC0099j3 enumC0099j3, G0 g0, G0 g02) {
        int i = H0.a[enumC0099j3.ordinal()];
        if (i == 1) {
            return new R0(g0, g02);
        }
        if (i == 2) {
            return new O0((C0) g0, (C0) g02);
        }
        if (i == 3) {
            return new P0((E0) g0, (E0) g02);
        }
        if (i == 4) {
            return new N0((A0) g0, (A0) g02);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0099j3)));
    }

    public static InterfaceC0155v0 D(long j) {
        return (j < 0 || j >= 2147483639) ? new U0() : new T0(j);
    }

    public static Z0 E(EnumC0099j3 enumC0099j3) {
        int i = H0.a[enumC0099j3.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0099j3)));
    }

    public static G0 F(G0 g0, IntFunction intFunction) {
        if (g0.r() <= 0) {
            return g0;
        }
        long jCount = g0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C0161w1(g0, objArr, 1).invoke();
        return new J0(objArr);
    }

    public static A0 G(A0 a0) {
        if (a0.r() <= 0) {
            return a0;
        }
        long jCount = a0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C0146t1(a0, dArr, 0).invoke();
        return new S0(dArr);
    }

    public static C0 H(C0 c0) {
        if (c0.r() <= 0) {
            return c0;
        }
        long jCount = c0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C0151u1(c0, iArr, 0).invoke();
        return new C0057b1(iArr);
    }

    public static E0 I(E0 e0) {
        if (e0.r() <= 0) {
            return e0;
        }
        long jCount = e0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C0156v1(e0, jArr, 0).invoke();
        return new C0102k1(jArr);
    }

    public static C0095j J(Function function) {
        C0095j c0095j = new C0095j(2);
        c0095j.b = function;
        return c0095j;
    }

    public static InterfaceC0160w0 K(long j) {
        return (j < 0 || j >= 2147483639) ? new C0067d1() : new C0062c1(j);
    }

    public static InterfaceC0165x0 L(long j) {
        return (j < 0 || j >= 2147483639) ? new C0112m1() : new C0107l1(j);
    }

    public static j$.nio.file.B M(EnumC0145t0 enumC0145t0, IntPredicate intPredicate) {
        intPredicate.getClass();
        enumC0145t0.getClass();
        return new j$.nio.file.B(EnumC0099j3.INT_VALUE, enumC0145t0, new j$.nio.file.B(7, enumC0145t0, intPredicate));
    }

    public static j$.nio.file.B N(EnumC0145t0 enumC0145t0, Predicate predicate) {
        predicate.getClass();
        enumC0145t0.getClass();
        return new j$.nio.file.B(EnumC0099j3.REFERENCE, enumC0145t0, new j$.nio.file.B(8, enumC0145t0, predicate));
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(InterfaceC0113m2 interfaceC0113m2, Double d2) {
        if (T3.a) {
            T3.a(interfaceC0113m2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC0113m2.accept(d2.doubleValue());
    }

    public static void g(InterfaceC0118n2 interfaceC0118n2, Integer num) {
        if (T3.a) {
            T3.a(interfaceC0118n2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC0118n2.accept(num.intValue());
    }

    public static void i(InterfaceC0123o2 interfaceC0123o2, Long l) {
        if (T3.a) {
            T3.a(interfaceC0123o2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC0123o2.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(F0 f0, IntFunction intFunction) {
        if (T3.a) {
            T3.a(f0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (f0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) f0.count());
        f0.f(objArr, 0);
        return objArr;
    }

    public static void n(A0 a0, Double[] dArr, int i) {
        if (T3.a) {
            T3.a(a0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) a0.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(C0 c0, Integer[] numArr, int i) {
        if (T3.a) {
            T3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c0.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(E0 e0, Long[] lArr, int i) {
        if (T3.a) {
            T3.a(e0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) e0.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(A0 a0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            a0.d((DoubleConsumer) consumer);
        } else {
            if (T3.a) {
                T3.a(a0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfDouble) a0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(C0 c0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            c0.d((IntConsumer) consumer);
        } else {
            if (T3.a) {
                T3.a(c0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(E0 e0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e0.d((LongConsumer) consumer);
        } else {
            if (T3.a) {
                T3.a(e0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfLong) e0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static A0 t(A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) a0.spliterator();
        InterfaceC0155v0 interfaceC0155v0D = D(j3);
        interfaceC0155v0D.k(j3);
        for (int i = 0; i < j && ofDouble.tryAdvance((DoubleConsumer) new C0175z0(0)); i++) {
        }
        if (j2 == a0.count()) {
            ofDouble.forEachRemaining((DoubleConsumer) interfaceC0155v0D);
        } else {
            for (int i2 = 0; i2 < j3 && ofDouble.tryAdvance((DoubleConsumer) interfaceC0155v0D); i2++) {
            }
        }
        interfaceC0155v0D.end();
        return interfaceC0155v0D.build();
    }

    public static C0 u(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) c0.spliterator();
        InterfaceC0160w0 interfaceC0160w0K = K(j3);
        interfaceC0160w0K.k(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new B0(0)); i++) {
        }
        if (j2 == c0.count()) {
            ofInt.forEachRemaining((IntConsumer) interfaceC0160w0K);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) interfaceC0160w0K); i2++) {
            }
        }
        interfaceC0160w0K.end();
        return interfaceC0160w0K.build();
    }

    public static E0 v(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        Spliterator.OfLong ofLong = (Spliterator.OfLong) e0.spliterator();
        InterfaceC0165x0 interfaceC0165x0L = L(j3);
        interfaceC0165x0L.k(j3);
        for (int i = 0; i < j && ofLong.tryAdvance((LongConsumer) new D0(0)); i++) {
        }
        if (j2 == e0.count()) {
            ofLong.forEachRemaining((LongConsumer) interfaceC0165x0L);
        } else {
            for (int i2 = 0; i2 < j3 && ofLong.tryAdvance((LongConsumer) interfaceC0165x0L); i2++) {
            }
        }
        interfaceC0165x0L.end();
        return interfaceC0165x0L.build();
    }

    public static G0 w(G0 g0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        Spliterator spliterator = g0.spliterator();
        long j3 = j2 - j;
        InterfaceC0170y0 interfaceC0170y0X = x(j3, intFunction);
        interfaceC0170y0X.k(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C0076f0(1)); i++) {
        }
        if (j2 == g0.count()) {
            spliterator.forEachRemaining(interfaceC0170y0X);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(interfaceC0170y0X); i2++) {
            }
        }
        interfaceC0170y0X.end();
        return interfaceC0170y0X.build();
    }

    public static InterfaceC0170y0 x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0141s1() : new C0052a1(j, intFunction);
    }

    public static G0 y(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jT = abstractC0050a.t(spliterator);
        if (jT < 0 || !spliterator.hasCharacteristics(16384)) {
            L l = new L();
            l.a = intFunction;
            G0 g0 = (G0) new L0(abstractC0050a, spliterator, l, new C0076f0(9)).invoke();
            return z ? F(g0, intFunction) : g0;
        }
        if (jT >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jT);
        new C0132q1(spliterator, abstractC0050a, objArr).invoke();
        return new J0(objArr);
    }

    public static A0 z(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z) {
        long jT = abstractC0050a.t(spliterator);
        if (jT < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a0 = (A0) new L0(abstractC0050a, spliterator, new C0076f0(3), new C0076f0(4)).invoke();
            return z ? G(a0) : a0;
        }
        if (jT >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jT];
        new C0117n1(spliterator, abstractC0050a, dArr).invoke();
        return new S0(dArr);
    }

    public abstract T1 O();

    @Override // j$.util.stream.R3
    public Object a(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        T1 t1O = O();
        abstractC0050a.h(spliterator, abstractC0050a.N(t1O));
        return t1O.get();
    }

    @Override // j$.util.stream.R3
    public Object b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return ((T1) new C0053a2(this, abstractC0050a, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.R3
    public /* synthetic */ int c() {
        return 0;
    }
}
