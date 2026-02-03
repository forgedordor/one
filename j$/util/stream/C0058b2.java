package j$.util.stream;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0058b2 extends U1 {
    public boolean b;
    public final j$.util.I c;
    public final /* synthetic */ C0095j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058b2(InterfaceC0128p2 interfaceC0128p2, C0095j c0095j) {
        super(interfaceC0128p2);
        this.d = c0095j;
        this.c = new j$.util.I(interfaceC0128p2, 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.Spliterator$OfLong] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        LongStream longStream = (LongStream) this.d.apply(obj);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.I i = this.c;
                if (z) {
                    ?? Spliterator2 = longStream.sequential().spliterator2();
                    while (!((InterfaceC0128p2) this.a).q() && Spliterator2.tryAdvance(i)) {
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
