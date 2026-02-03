package j$.util.stream;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0154v extends AbstractC0159w {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0154v(AbstractC0050a abstractC0050a, int i, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return interfaceC0128p2;
            case 1:
                return new X(1, interfaceC0128p2);
            default:
                return new C0086h0(interfaceC0128p2);
        }
    }
}
