package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
public final class G extends J implements InterfaceC0118n2 {
    public static final D c;
    public static final D d;

    static {
        EnumC0099j3 enumC0099j3 = EnumC0099j3.INT_VALUE;
        c = new D(true, enumC0099j3, OptionalInt.empty(), new E(2), new E(3));
        d = new D(false, enumC0099j3, OptionalInt.empty(), new E(2), new E(3));
    }

    @Override // j$.util.stream.J, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        z(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
