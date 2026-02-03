package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0149u extends AbstractC0098j2 {
    public boolean b;
    public final j$.util.C c;
    public final /* synthetic */ j$.desugar.sun.nio.fs.h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149u(InterfaceC0128p2 interfaceC0128p2, j$.desugar.sun.nio.fs.h hVar) {
        super(interfaceC0128p2);
        this.d = hVar;
        this.c = new j$.util.C(interfaceC0128p2, 1);
    }

    @Override // j$.util.stream.InterfaceC0113m2, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        C c = (C) this.d.apply(d);
        if (c != null) {
            try {
                boolean z = this.b;
                j$.util.C c2 = this.c;
                if (z) {
                    Spliterator.OfDouble ofDoubleSpliterator2 = c.sequential().spliterator2();
                    while (!this.a.q() && ofDoubleSpliterator2.tryAdvance((DoubleConsumer) c2)) {
                    }
                } else {
                    c.sequential().forEach(c2);
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c != null) {
            c.close();
        }
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0098j2, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
