package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0078f2 extends U1 {
    public boolean b;
    public final j$.util.C c;
    public final /* synthetic */ C0095j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078f2(InterfaceC0128p2 interfaceC0128p2, C0095j c0095j) {
        super(interfaceC0128p2);
        this.d = c0095j;
        this.c = new j$.util.C(interfaceC0128p2, 1);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        C c = (C) this.d.apply(obj);
        if (c != null) {
            try {
                boolean z = this.b;
                j$.util.C c2 = this.c;
                if (z) {
                    Spliterator.OfDouble ofDoubleSpliterator2 = c.sequential().spliterator2();
                    while (!((InterfaceC0128p2) this.a).q() && ofDoubleSpliterator2.tryAdvance((DoubleConsumer) c2)) {
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
