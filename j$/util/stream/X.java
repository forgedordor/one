package j$.util.stream;

/* loaded from: classes9.dex */
public final class X extends AbstractC0103k2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i, InterfaceC0128p2 interfaceC0128p2) {
        super(interfaceC0128p2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
