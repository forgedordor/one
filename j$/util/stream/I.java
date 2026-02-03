package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes9.dex */
public final class I extends J {
    public static final D c;
    public static final D d;

    static {
        EnumC0099j3 enumC0099j3 = EnumC0099j3.REFERENCE;
        c = new D(true, enumC0099j3, Optional.empty(), new E(6), new E(7));
        d = new D(false, enumC0099j3, Optional.empty(), new E(6), new E(7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
