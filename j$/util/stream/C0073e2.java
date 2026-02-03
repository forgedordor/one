package j$.util.stream;

/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0073e2 extends U1 {
    public boolean b;
    public final j$.util.F c;
    public final /* synthetic */ C0095j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073e2(InterfaceC0128p2 interfaceC0128p2, C0095j c0095j) {
        super(interfaceC0128p2);
        this.d = c0095j;
        this.c = new j$.util.F(interfaceC0128p2, 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.Spliterator$OfInt] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        IntStream intStream = (IntStream) this.d.apply(obj);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.F f = this.c;
                if (z) {
                    ?? Spliterator2 = intStream.sequential().spliterator2();
                    while (!((InterfaceC0128p2) this.a).q() && Spliterator2.tryAdvance(f)) {
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

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        ((InterfaceC0128p2) this.a).k(-1L);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        this.b = true;
        return ((InterfaceC0128p2) this.a).q();
    }
}
