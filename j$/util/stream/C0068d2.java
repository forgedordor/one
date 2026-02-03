package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0068d2 extends AbstractC0088h2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068d2(AbstractC0093i2 abstractC0093i2, int i, Function function, int i2) {
        super(abstractC0093i2, i, 1);
        this.m = i2;
        this.n = function;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new C0120o(interfaceC0128p2, this.n, 3);
            default:
                return new C0115n(interfaceC0128p2, this.n);
        }
    }
}
