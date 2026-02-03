package j$.util.stream;

/* renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0162w2 extends AbstractC0098j2 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162w2(InterfaceC0128p2 interfaceC0128p2, long j, long j2) {
        super(interfaceC0128p2);
        this.d = j;
        this.b = j;
        this.c = j2 < 0 ? Long.MAX_VALUE : j2;
    }

    @Override // j$.util.stream.InterfaceC0113m2, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(d);
        }
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a.k(A2.a(j, this.d, this.c));
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
