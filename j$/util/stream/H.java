package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class H extends J implements InterfaceC0123o2 {
    public static final D c;
    public static final D d;

    static {
        EnumC0099j3 enumC0099j3 = EnumC0099j3.LONG_VALUE;
        c = new D(true, enumC0099j3, OptionalLong.empty(), new E(4), new E(5));
        d = new D(false, enumC0099j3, OptionalLong.empty(), new E(4), new E(5));
    }

    @Override // j$.util.stream.J, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        z(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalLong.of(((Long) this.b).longValue());
        }
        return null;
    }
}
