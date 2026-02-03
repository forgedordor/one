package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes9.dex */
public final class X3 extends AbstractC0103k2 {
    public boolean b;
    public final /* synthetic */ IntPredicate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(InterfaceC0128p2 interfaceC0128p2, IntPredicate intPredicate) {
        super(interfaceC0128p2);
        this.c = intPredicate;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        if (this.b) {
            boolean zTest = this.c.test(i);
            this.b = zTest;
            if (zTest) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
