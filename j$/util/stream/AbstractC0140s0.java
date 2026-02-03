package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0140s0 implements InterfaceC0128p2 {
    public boolean a;
    public boolean b;

    public AbstractC0140s0(EnumC0145t0 enumC0145t0) {
        this.b = !enumC0145t0.b;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void k(long j) {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }
}
