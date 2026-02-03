package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public final class F extends J implements InterfaceC0113m2 {
    public static final D c;
    public static final D d;

    static {
        EnumC0099j3 enumC0099j3 = EnumC0099j3.DOUBLE_VALUE;
        E e = new E(0);
        E e2 = new E(1);
        j$.util.B b = j$.util.B.c;
        c = new D(true, enumC0099j3, b, e, e2);
        d = new D(false, enumC0099j3, b, new E(0), new E(1));
    }

    @Override // j$.util.stream.J, j$.util.stream.InterfaceC0128p2
    public final void accept(double d2) {
        z(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.B(((Double) this.b).doubleValue());
        }
        return null;
    }
}
