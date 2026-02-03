package j$.util.stream;

/* loaded from: classes9.dex */
public final class Z extends AbstractC0103k2 {
    public boolean b;
    public final j$.util.F c;
    public final /* synthetic */ L d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(InterfaceC0128p2 interfaceC0128p2, L l) {
        super(interfaceC0128p2);
        this.d = l;
        this.c = new j$.util.F(interfaceC0128p2, 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.Spliterator$OfInt] */
    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        IntStream intStream = (IntStream) this.d.apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.F f = this.c;
                if (z) {
                    ?? Spliterator2 = intStream.sequential().spliterator2();
                    while (!this.a.q() && Spliterator2.tryAdvance(f)) {
                    }
                } else {
                    intStream.sequential().forEach(f);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
