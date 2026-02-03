package j$.util.stream;

/* loaded from: classes9.dex */
public final class Y extends AbstractC0106l0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC0050a abstractC0050a, int i, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new X(0, interfaceC0128p2);
            default:
                return interfaceC0128p2;
        }
    }
}
