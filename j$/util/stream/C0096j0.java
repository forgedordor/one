package j$.util.stream;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0096j0 extends AbstractC0108l2 {
    public boolean b;
    public final j$.util.I c;
    public final /* synthetic */ j$.desugar.sun.nio.fs.h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096j0(InterfaceC0128p2 interfaceC0128p2, j$.desugar.sun.nio.fs.h hVar) {
        super(interfaceC0128p2);
        this.d = hVar;
        this.c = new j$.util.I(interfaceC0128p2, 1);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [j$.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC0123o2, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        LongStream longStream = (LongStream) this.d.apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.I i = this.c;
                if (z) {
                    ?? Spliterator2 = longStream.sequential().spliterator2();
                    while (!this.a.q() && Spliterator2.tryAdvance(i)) {
                    }
                } else {
                    longStream.sequential().forEach(i);
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0108l2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0108l2, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
